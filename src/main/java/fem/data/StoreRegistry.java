package com.example.javaprojekt226b.fem.data;

import java.io.File;
import java.io.IOException;

public class StoreRegistry {

    private static StoreRegistry instance;

    private ArticleStore articleStore;

    private ProjectStore projectStore;

    private UserStore userStore;

    public StoreRegistry(ArticleStore articleStore, ProjectStore projectStore, UserStore userStore) {
        this.articleStore = articleStore;
        this.projectStore = projectStore;
        this.userStore = userStore;
    }

    public static StoreRegistry getStoreRegistry()  {
        if (instance == null) {
            try {
                instance = createStore();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;
    }

    private static StoreRegistry createStore() throws IOException {
        new File("files").mkdirs();
        UserStore userStore = new UserStore(createFile("files/users.csv"));
        userStore.load();
        ProjectStore projectStore = new ProjectStore(createFile("files/projects.csv"));
        projectStore.load();
        ArticleStore articleStore = new ArticleStore(createFile("files/articles.csv"));
        articleStore.load();
        return new StoreRegistry(articleStore, projectStore, userStore);
    }

    private static File createFile(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
        return file;
    }

    public ArticleStore getArticleStore() {
        return articleStore;
    }

    public ProjectStore getProjectStore() {
        return projectStore;
    }

    public UserStore getUserStore() {
        return userStore;
    }
}
