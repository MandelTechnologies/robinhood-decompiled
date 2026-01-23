package io.noties.markwon;

import io.noties.markwon.MarkwonSpansFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.Node;

/* loaded from: classes14.dex */
class MarkwonSpansFactoryImpl implements MarkwonSpansFactory {
    private final Map<Class<? extends Node>, SpanFactory> factories;

    MarkwonSpansFactoryImpl(Map<Class<? extends Node>, SpanFactory> map) {
        this.factories = map;
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    public <N extends Node> SpanFactory get(Class<N> cls) {
        return this.factories.get(cls);
    }

    static class BuilderImpl implements MarkwonSpansFactory.Builder {
        private final Map<Class<? extends Node>, SpanFactory> factories = new HashMap(3);

        BuilderImpl() {
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public <N extends Node> MarkwonSpansFactory.Builder setFactory(Class<N> cls, SpanFactory spanFactory) {
            if (spanFactory == null) {
                this.factories.remove(cls);
                return this;
            }
            this.factories.put(cls, spanFactory);
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public MarkwonSpansFactory build() {
            return new MarkwonSpansFactoryImpl(Collections.unmodifiableMap(this.factories));
        }
    }
}
