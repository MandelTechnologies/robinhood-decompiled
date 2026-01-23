package com.robinhood.android.markdown.elements;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.MarkwonTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Link;

/* compiled from: BoldLinkMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/BoldLinkMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "<init>", "()V", "configureTheme", "", "builder", "Lio/noties/markwon/core/MarkwonTheme$Builder;", "configureSpansFactory", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BoldLinkMarkwonPlugin extends AbstractMarkwonPlugin {
    public static final BoldLinkMarkwonPlugin INSTANCE = new BoldLinkMarkwonPlugin();

    private BoldLinkMarkwonPlugin() {
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureTheme(MarkwonTheme.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.isLinkUnderlined(false);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setFactory(Link.class, new SpanFactory() { // from class: com.robinhood.android.markdown.elements.BoldLinkMarkwonPlugin.configureSpansFactory.1
            @Override // io.noties.markwon.SpanFactory
            public final Object getSpans(MarkwonConfiguration configuration, RenderProps props) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(props, "props");
                return new BoldLinkMarkwonPlugin2(configuration, props);
            }
        });
    }
}
