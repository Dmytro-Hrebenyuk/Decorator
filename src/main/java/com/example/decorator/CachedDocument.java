import java.util.Map;
import java.util.HashMap;

public class CachedDocument extends DocumentDecorator {
    private Map<String, String> cache = new HashMap<>();

    public CachedDocument(Document document) {
        super(document);
    }

    @Override
    public String parse() {
        String gcsPath = super.getGcsPath();
        if (cache.containsKey(gcsPath)) {
            System.out.println("Cache hit for path: " + gcsPath);
            return cache.get(gcsPath);
        }

        System.out.println("Cache miss for path: " + gcsPath);
        String result = super.parse();
        cache.put(gcsPath, result);
        return result;
    }
}
