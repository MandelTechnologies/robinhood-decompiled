package com.robinhood.android.markdown.elements;

import android.text.Layout;
import android.text.style.AlignmentSpan;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.AsyncDrawable;
import io.noties.markwon.image.AsyncDrawableSpan;
import io.noties.markwon.image.ImageProps;
import io.noties.markwon.image.ImageSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhImageSpanFactory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/RhImageSpanFactory;", "Lio/noties/markwon/SpanFactory;", "<init>", "()V", "getSpans", "", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lio/noties/markwon/MarkwonConfiguration;", "props", "Lio/noties/markwon/RenderProps;", "(Lio/noties/markwon/MarkwonConfiguration;Lio/noties/markwon/RenderProps;)[Ljava/lang/Object;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RhImageSpanFactory implements SpanFactory {
    public static final RhImageSpanFactory INSTANCE = new RhImageSpanFactory();

    private RhImageSpanFactory() {
    }

    @Override // io.noties.markwon.SpanFactory
    public Object[] getSpans(MarkwonConfiguration configuration, RenderProps props) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(props, "props");
        AsyncDrawable asyncDrawable = new AsyncDrawable(ImageProps.DESTINATION.require(props), configuration.asyncDrawableLoader(), configuration.imageSizeResolver(), (ImageSize) props.get(ImageProps.IMAGE_SIZE));
        AlignmentSpan.Standard standard = new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER);
        MarkwonTheme markwonThemeTheme = configuration.theme();
        Boolean bool = ImageProps.REPLACEMENT_TEXT_IS_LINK.get(props, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return new Object[]{standard, new AsyncDrawableSpan(markwonThemeTheme, asyncDrawable, 0, bool.booleanValue())};
    }
}
