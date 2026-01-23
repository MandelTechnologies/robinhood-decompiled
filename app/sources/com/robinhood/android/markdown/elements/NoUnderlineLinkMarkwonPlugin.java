package com.robinhood.android.markdown.elements;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Link;

/* compiled from: NoUnderlineLinkMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/NoUnderlineLinkMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "<init>", "()V", "configureSpansFactory", "", "builder", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NoUnderlineLinkMarkwonPlugin extends AbstractMarkwonPlugin {
    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setFactory(Link.class, new SpanFactory() { // from class: com.robinhood.android.markdown.elements.NoUnderlineLinkMarkwonPlugin.configureSpansFactory.1
            @Override // io.noties.markwon.SpanFactory
            public final Object getSpans(MarkwonConfiguration configuration, RenderProps props) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(props, "props");
                return new NoUnderlineLinkSpan(configuration, props);
            }
        });
    }
}
