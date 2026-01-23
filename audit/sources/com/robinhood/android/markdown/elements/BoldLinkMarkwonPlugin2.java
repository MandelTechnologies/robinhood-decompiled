package com.robinhood.android.markdown.elements;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.LinkSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoldLinkMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/BoldLinkSpan;", "Lio/noties/markwon/core/spans/LinkSpan;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lio/noties/markwon/MarkwonConfiguration;", "props", "Lio/noties/markwon/RenderProps;", "<init>", "(Lio/noties/markwon/MarkwonConfiguration;Lio/noties/markwon/RenderProps;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.elements.BoldLinkSpan, reason: use source file name */
/* loaded from: classes8.dex */
public final class BoldLinkMarkwonPlugin2 extends LinkSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoldLinkMarkwonPlugin2(MarkwonConfiguration configuration, RenderProps props) {
        super(configuration.theme(), CoreProps.LINK_DESTINATION.require(props), configuration.linkResolver());
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(props, "props");
    }

    @Override // io.noties.markwon.core.spans.LinkSpan, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setTypeface(Typeface.DEFAULT_BOLD);
        super.updateDrawState(ds);
    }
}
