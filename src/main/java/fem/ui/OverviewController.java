package fem.ui;

import fem.data.StoreRegistry;
import fem.dto.Article;
import fem.dto.Project;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class OverviewController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView lsvProjects;
    @FXML
    private ListView lsvArticles;
    @FXML
    private TextField articleName;
    @FXML
    private TextField articleDescription;
    @FXML
    private TextField totalCost;

    private ObservableList<String> observableProjects;
    private StoreRegistry storeRegistry;

    @FXML
    protected void onObjectNewClick() {
        String selectedProject = (String)lsvProjects.getSelectionModel().getSelectedItem();
        if(selectedProject == null) {
            return;
        }
        List<Article> articleByProject = storeRegistry.getArticleStore().findArticleByProject(selectedProject);
        int articleCounter = 1;
        for(Article a : articleByProject) {
            String articleName = "New Article "+ articleCounter;
            if(a.getName().equals(articleName)) {
                articleCounter++;
            }
        }
        Article newArticle = new Article("New Article " + articleCounter, "New Article Desciption", 0, 0., "", "", selectedProject);
        storeRegistry.getArticleStore().add(newArticle);
        showArticles();
        lsvArticles.getSelectionModel().select(newArticle.getName());
        showArticle(selectedProject, newArticle.getName());
    }

    @FXML
    protected void onProjectNewClick() {

        TextInputDialog textInputDialog = new TextInputDialog("enter any text");
        textInputDialog.setHeaderText("enter project name");
        String projectName = textInputDialog.showAndWait().get();
        Project newProject = new Project(projectName);
        if(!storeRegistry.getProjectStore().getAll().contains(newProject)) {
            storeRegistry.getProjectStore().add(newProject);
            updateProjectView();
        }

        // Move to better method
        String selectedItem = (String)lsvProjects.getSelectionModel().getSelectedItem();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lsvProjects.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                showArticles();
            }
        });

        lsvArticles.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String selectedProject = (String)lsvProjects.getSelectionModel().getSelectedItem();
                String selectedArticle = (String)lsvArticles.getSelectionModel().getSelectedItem();
                System.out.println("clicked on " + selectedArticle);
                showArticle(selectedProject, selectedArticle);
            }
        });
        storeRegistry = StoreRegistry.getStoreRegistry();
        updateProjectView();
    }

    private void showArticle(String selectedProject, String selectedArticle) {
        List<Article> articleByProject = storeRegistry.getArticleStore().findArticleByProject(selectedProject);
        Article article = articleByProject.stream().filter(a -> a.getName().equals(selectedArticle)).findFirst().get();
        articleName.setText(article.getName());
        articleDescription.setText(article.getDescription());
    }

    private void showArticles() {
        String selectedProject = (String)lsvProjects.getSelectionModel().getSelectedItem();
        List<Article> articleByProject = storeRegistry.getArticleStore().findArticleByProject(selectedProject);
        List<String> articleNames = articleByProject.stream().map(a -> a.getName()).collect(Collectors.toList());
        ObservableList<String> observableArticleNames = FXCollections.observableList(articleNames);
        lsvArticles.setItems(observableArticleNames);
        Double price = 0.;
        for(Article a : articleByProject) {
            price += a.getPrice();
        }
        totalCost.setText(price.toString());
    }

    private void updateProjectView() {
        List<String> projectNames = storeRegistry.getProjectStore().getAll().stream().map(p -> p.getName()).collect(Collectors.toList());
        observableProjects = FXCollections.observableList(projectNames);
        lsvProjects.setItems(observableProjects);
    }

    @FXML
    public void onCloseClick(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) lsvProjects.getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }


    public void onProjectDeleteClicked(ActionEvent actionEvent) {
        String selectedProject = (String)lsvProjects.getSelectionModel().getSelectedItem();
        Project project = storeRegistry.getProjectStore().getAll().stream().filter(p -> p.getName().equals(selectedProject)).findFirst().get();
        storeRegistry.getProjectStore().delete(project);
        updateProjectView();
    }
}
