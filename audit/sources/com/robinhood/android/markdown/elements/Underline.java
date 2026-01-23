package com.robinhood.android.markdown.elements;

import android.text.style.UnderlineSpan;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.CustomNode;

/* compiled from: Underline.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/Underline;", "Lorg/commonmark/node/CustomNode;", "", "", "delimiter", "<init>", "(Ljava/lang/String;)V", "getOpeningDelimiter", "()Ljava/lang/String;", "getClosingDelimiter", "Ljava/lang/String;", "Companion", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class Underline extends CustomNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String delimiter;

    public Underline(String delimiter) {
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        this.delimiter = delimiter;
    }

    public String getOpeningDelimiter() {
        return this.delimiter;
    }

    /* renamed from: getClosingDelimiter, reason: from getter */
    public String getDelimiter() {
        return this.delimiter;
    }

    /* compiled from: Underline.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/Underline$Companion;", "Lio/noties/markwon/SpanFactory;", "<init>", "()V", "getSpans", "Landroid/text/style/UnderlineSpan;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lio/noties/markwon/MarkwonConfiguration;", "props", "Lio/noties/markwon/RenderProps;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements SpanFactory {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.noties.markwon.SpanFactory
        public UnderlineSpan getSpans(MarkwonConfiguration configuration, RenderProps props) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(props, "props");
            return new UnderlineSpan();
        }
    }
}
