package fem.dto;

public interface CommaSeparatedValue {

    public static String DELIMITER = ";";

    String getCommaSeparateValue();

    void loadCommaSeparateValue(String commaSeparatedValue);

}
