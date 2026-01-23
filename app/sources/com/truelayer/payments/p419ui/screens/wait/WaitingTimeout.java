package com.truelayer.payments.p419ui.screens.wait;

import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.utils.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitViewData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/wait/WaitingTimeout;", "Lcom/truelayer/payments/ui/screens/wait/WaitScreens;", "waitTimeExceededText", "Lcom/truelayer/payments/ui/utils/UiText;", "(Lcom/truelayer/payments/ui/utils/UiText;)V", "getWaitTimeExceededText", "()Lcom/truelayer/payments/ui/utils/UiText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WaitingTimeout implements WaitViewData3 {
    public static final int $stable = 0;
    private final UiText waitTimeExceededText;

    /* JADX WARN: Multi-variable type inference failed */
    public WaitingTimeout() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WaitingTimeout copy$default(WaitingTimeout waitingTimeout, UiText uiText, int i, Object obj) {
        if ((i & 1) != 0) {
            uiText = waitingTimeout.waitTimeExceededText;
        }
        return waitingTimeout.copy(uiText);
    }

    /* renamed from: component1, reason: from getter */
    public final UiText getWaitTimeExceededText() {
        return this.waitTimeExceededText;
    }

    public final WaitingTimeout copy(UiText waitTimeExceededText) {
        Intrinsics.checkNotNullParameter(waitTimeExceededText, "waitTimeExceededText");
        return new WaitingTimeout(waitTimeExceededText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WaitingTimeout) && Intrinsics.areEqual(this.waitTimeExceededText, ((WaitingTimeout) other).waitTimeExceededText);
    }

    public int hashCode() {
        return this.waitTimeExceededText.hashCode();
    }

    public String toString() {
        return "WaitingTimeout(waitTimeExceededText=" + this.waitTimeExceededText + ")";
    }

    public WaitingTimeout(UiText waitTimeExceededText) {
        Intrinsics.checkNotNullParameter(waitTimeExceededText, "waitTimeExceededText");
        this.waitTimeExceededText = waitTimeExceededText;
    }

    public /* synthetic */ WaitingTimeout(UiText uiText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UiText.StringResource(C42830R.string.wait_timeout_error_message, new Object[0]) : uiText);
    }

    public final UiText getWaitTimeExceededText() {
        return this.waitTimeExceededText;
    }
}
