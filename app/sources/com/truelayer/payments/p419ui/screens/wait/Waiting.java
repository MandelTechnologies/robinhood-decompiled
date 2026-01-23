package com.truelayer.payments.p419ui.screens.wait;

import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.utils.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitViewData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/wait/Waiting;", "Lcom/truelayer/payments/ui/screens/wait/WaitScreens;", "waitingText", "Lcom/truelayer/payments/ui/utils/UiText;", "extraText", "(Lcom/truelayer/payments/ui/utils/UiText;Lcom/truelayer/payments/ui/utils/UiText;)V", "getExtraText", "()Lcom/truelayer/payments/ui/utils/UiText;", "getWaitingText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Waiting implements WaitViewData3 {
    public static final int $stable = 0;
    private final UiText extraText;
    private final UiText waitingText;

    /* JADX WARN: Multi-variable type inference failed */
    public Waiting() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Waiting copy$default(Waiting waiting, UiText uiText, UiText uiText2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiText = waiting.waitingText;
        }
        if ((i & 2) != 0) {
            uiText2 = waiting.extraText;
        }
        return waiting.copy(uiText, uiText2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiText getWaitingText() {
        return this.waitingText;
    }

    /* renamed from: component2, reason: from getter */
    public final UiText getExtraText() {
        return this.extraText;
    }

    public final Waiting copy(UiText waitingText, UiText extraText) {
        Intrinsics.checkNotNullParameter(waitingText, "waitingText");
        return new Waiting(waitingText, extraText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Waiting)) {
            return false;
        }
        Waiting waiting = (Waiting) other;
        return Intrinsics.areEqual(this.waitingText, waiting.waitingText) && Intrinsics.areEqual(this.extraText, waiting.extraText);
    }

    public int hashCode() {
        int iHashCode = this.waitingText.hashCode() * 31;
        UiText uiText = this.extraText;
        return iHashCode + (uiText == null ? 0 : uiText.hashCode());
    }

    public String toString() {
        return "Waiting(waitingText=" + this.waitingText + ", extraText=" + this.extraText + ")";
    }

    public Waiting(UiText waitingText, UiText uiText) {
        Intrinsics.checkNotNullParameter(waitingText, "waitingText");
        this.waitingText = waitingText;
        this.extraText = uiText;
    }

    public /* synthetic */ Waiting(UiText uiText, UiText uiText2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UiText.StringResource(C42830R.string.wait_screen_message, new Object[0]) : uiText, (i & 2) != 0 ? null : uiText2);
    }

    public final UiText getWaitingText() {
        return this.waitingText;
    }

    public final UiText getExtraText() {
        return this.extraText;
    }
}
