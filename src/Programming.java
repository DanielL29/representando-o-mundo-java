import java.lang.System.Logger;
import java.lang.reflect.Constructor;

public class Programming {
    private String language;
    private String codeEditor;
    private Double version;

    public Programming(String language, String codeEditor, Double version) {
        this.language = language;
        this.codeEditor = codeEditor;
        this.version = version;
    }

    String getLanguage() {
        return this.language;
    }

    String getCodeEditor() {
        return this.codeEditor;
    }

    Double getVersion() {
        return this.version;
    }

    void setLanguage(String language) {
        this.language = language;
    }

    void setCodeEditor(String codeEditor) {
        this.codeEditor = codeEditor;
    }

    void setVersion(Double version) {
        this.version = version;
    }

    void showLanguageInfo() {
        System.out.println("\nLanguage: " + this.language + "\nCode Editor: " + this.codeEditor + "\nVersion: " + this.version);
    }
}
