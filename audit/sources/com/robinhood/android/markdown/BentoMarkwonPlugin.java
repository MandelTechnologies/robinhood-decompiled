package com.robinhood.android.markdown;

import android.text.style.StyleSpan;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markdown.elements.BentoLinkSpanFactory;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Link;
import org.commonmark.node.StrongEmphasis;

/* compiled from: BentoMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/markdown/BentoMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "<init>", "()V", "configureSpansFactory", "", "builder", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "Companion", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class BentoMarkwonPlugin extends AbstractMarkwonPlugin {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(Link.class, new BentoLinkSpanFactory()), "setFactory(...)");
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(StrongEmphasis.class, new SpanFactory() { // from class: com.robinhood.android.markdown.BentoMarkwonPlugin$configureSpansFactory$1$1
            @Override // io.noties.markwon.SpanFactory
            public final Object getSpans(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
                Intrinsics.checkNotNullParameter(markwonConfiguration, "<unused var>");
                Intrinsics.checkNotNullParameter(renderProps, "<unused var>");
                return new StyleSpan(1);
            }
        }), "setFactory(...)");
    }

    /* compiled from: BentoMarkwonPlugin.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/markdown/BentoMarkwonPlugin$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/markdown/BentoMarkwonPlugin;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BentoMarkwonPlugin create() {
            return new BentoMarkwonPlugin();
        }
    }
}
