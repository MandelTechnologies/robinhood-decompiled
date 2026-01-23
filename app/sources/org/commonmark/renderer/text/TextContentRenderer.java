package org.commonmark.renderer.text;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes25.dex */
public class TextContentRenderer {
    private final List<Object> nodeRendererFactories;
    private final boolean stripNewlines;

    private TextContentRenderer(Builder builder) {
        this.stripNewlines = builder.stripNewlines;
        ArrayList arrayList = new ArrayList(builder.nodeRendererFactories.size() + 1);
        this.nodeRendererFactories = arrayList;
        arrayList.addAll(builder.nodeRendererFactories);
        arrayList.add(new Object() { // from class: org.commonmark.renderer.text.TextContentRenderer.1
        });
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private boolean stripNewlines = false;
        private List<Object> nodeRendererFactories = new ArrayList();

        public TextContentRenderer build() {
            return new TextContentRenderer(this);
        }
    }
}
