package fem.dto;

public class Article implements CommaSeparatedValue {
    private String name;
    private String description;
    private Integer priority;
    private Double price;
    private String link;
    private String address;
    private String projectName;
    private String category;

    public Article() {
    }



    public Article(String name, String description, Integer priority, Double price, String link, String address, String projectName, String category) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.price = price;
        this.link = link;
        this.address = address;
        this.projectName = projectName;
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}

    @Override
    public String getCommaSeparateValue() {
        return name + DELIMITER + description + DELIMITER + priority + DELIMITER + price + DELIMITER + link + DELIMITER + address + DELIMITER + projectName + DELIMITER;
    }

    @Override
    public void loadCommaSeparateValue(String commaSeparatedValue) {
        String[] split = commaSeparatedValue.split(DELIMITER);
        this.setName(split[0]);
        this.setDescription(split[1]);
        this.setPriority(Integer.valueOf(split[2]));
        this.setPrice(Double.valueOf(split[3]));
        this.setLink(split[4]);
        this.setAddress(split[5]);
        this.setProjectName(split[6]);
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", price=" + price +
                ", link='" + link + '\'' +
                ", address='" + address + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
