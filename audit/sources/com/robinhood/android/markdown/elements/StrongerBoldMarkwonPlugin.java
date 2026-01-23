package com.robinhood.android.markdown.elements;

import android.graphics.Typeface;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.StrongEmphasis;

/* compiled from: StrongerBoldMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/StrongerBoldMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "typeface", "Landroid/graphics/Typeface;", "<init>", "(Landroid/graphics/Typeface;)V", "getTypeface", "()Landroid/graphics/Typeface;", "configureSpansFactory", "", "builder", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class StrongerBoldMarkwonPlugin extends AbstractMarkwonPlugin {
    private final Typeface typeface;

    /* JADX WARN: Multi-variable type inference failed */
    public StrongerBoldMarkwonPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StrongerBoldMarkwonPlugin(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    public /* synthetic */ StrongerBoldMarkwonPlugin(Typeface typeface, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Typeface.DEFAULT_BOLD : typeface);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setFactory(StrongEmphasis.class, new SpanFactory() { // from class: com.robinhood.android.markdown.elements.StrongerBoldMarkwonPlugin.configureSpansFactory.1
            @Override // io.noties.markwon.SpanFactory
            public final Object getSpans(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
                Intrinsics.checkNotNullParameter(markwonConfiguration, "<unused var>");
                Intrinsics.checkNotNullParameter(renderProps, "<unused var>");
                return new StrongerBoldMarkwonPlugin2(StrongerBoldMarkwonPlugin.this.getTypeface());
            }
        });
    }
}
