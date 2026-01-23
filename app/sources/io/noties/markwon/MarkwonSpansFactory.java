package io.noties.markwon;

import org.commonmark.node.Node;

/* loaded from: classes14.dex */
public interface MarkwonSpansFactory {

    public interface Builder {
        MarkwonSpansFactory build();

        <N extends Node> Builder setFactory(Class<N> cls, SpanFactory spanFactory);
    }

    <N extends Node> SpanFactory get(Class<N> cls);
}
