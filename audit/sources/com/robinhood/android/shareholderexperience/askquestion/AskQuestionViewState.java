package com.robinhood.android.shareholderexperience.askquestion;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.udf.UiEvent;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AskQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionViewState;", "", "askQuestionInfo", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$AskQuestionInfo;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionEvent;", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata$AskQuestionInfo;Lcom/robinhood/udf/UiEvent;)V", "getAskQuestionInfo", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata$AskQuestionInfo;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "mergeGuidelines", "Landroid/text/SpannedString;", "context", "Landroid/content/Context;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class AskQuestionViewState {
    public static final int $stable = 8;
    private final QaEventMetadata.AskQuestionInfo askQuestionInfo;
    private final UiEvent<AskQuestionViewState2> event;

    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskQuestionViewState copy$default(AskQuestionViewState askQuestionViewState, QaEventMetadata.AskQuestionInfo askQuestionInfo, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            askQuestionInfo = askQuestionViewState.askQuestionInfo;
        }
        if ((i & 2) != 0) {
            uiEvent = askQuestionViewState.event;
        }
        return askQuestionViewState.copy(askQuestionInfo, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final QaEventMetadata.AskQuestionInfo getAskQuestionInfo() {
        return this.askQuestionInfo;
    }

    public final UiEvent<AskQuestionViewState2> component2() {
        return this.event;
    }

    public final AskQuestionViewState copy(QaEventMetadata.AskQuestionInfo askQuestionInfo, UiEvent<AskQuestionViewState2> event) {
        return new AskQuestionViewState(askQuestionInfo, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskQuestionViewState)) {
            return false;
        }
        AskQuestionViewState askQuestionViewState = (AskQuestionViewState) other;
        return Intrinsics.areEqual(this.askQuestionInfo, askQuestionViewState.askQuestionInfo) && Intrinsics.areEqual(this.event, askQuestionViewState.event);
    }

    public int hashCode() {
        QaEventMetadata.AskQuestionInfo askQuestionInfo = this.askQuestionInfo;
        int iHashCode = (askQuestionInfo == null ? 0 : askQuestionInfo.hashCode()) * 31;
        UiEvent<AskQuestionViewState2> uiEvent = this.event;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "AskQuestionViewState(askQuestionInfo=" + this.askQuestionInfo + ", event=" + this.event + ")";
    }

    public AskQuestionViewState(QaEventMetadata.AskQuestionInfo askQuestionInfo, UiEvent<AskQuestionViewState2> uiEvent) {
        this.askQuestionInfo = askQuestionInfo;
        this.event = uiEvent;
    }

    public /* synthetic */ AskQuestionViewState(QaEventMetadata.AskQuestionInfo askQuestionInfo, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : askQuestionInfo, (i & 2) != 0 ? null : uiEvent);
    }

    public final QaEventMetadata.AskQuestionInfo getAskQuestionInfo() {
        return this.askQuestionInfo;
    }

    public final UiEvent<AskQuestionViewState2> getEvent() {
        return this.event;
    }

    public final SpannedString mergeGuidelines(Context context) throws IOException {
        List<QaEventMetadata.QuestionItem> guidelines;
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        QaEventMetadata.AskQuestionInfo askQuestionInfo = this.askQuestionInfo;
        if (askQuestionInfo != null && (guidelines = askQuestionInfo.getGuidelines()) != null) {
            for (QaEventMetadata.QuestionItem questionItem : guidelines) {
                spannableStringBuilder.append('\n');
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) questionItem.getSubject());
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append('\n');
                spannableStringBuilder.append((CharSequence) IconExtensions.toSpannableString$default(questionItem.getBody(), context, null, false, null, 14, null));
                spannableStringBuilder.append('\n');
            }
        }
        return new SpannedString(spannableStringBuilder);
    }
}
