package fem.data;

import fem.dto.Article;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleStore extends Store<Article> {

    public ArticleStore(File file) {
        super(file);
    }

    @Override
    public Article newInstance() {
        return new Article();
    }


    public List<Article> findArticleByProject(String projectName) {
        return getAll().stream()
                .filter(article -> article.getProjectName().equals(projectName))
                .collect(Collectors.toList());
    }

}
