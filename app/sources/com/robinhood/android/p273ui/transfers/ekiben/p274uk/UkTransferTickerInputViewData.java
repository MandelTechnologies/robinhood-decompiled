package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkTransferTickerInputView.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/UkTransferTickerInputViewData;", "", "displayString", "", "animateInput", "", "<init>", "(Ljava/lang/String;Z)V", "getDisplayString", "()Ljava/lang/String;", "getAnimateInput", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkTransferTickerInputViewData {
    public static final int $stable = 0;
    private final boolean animateInput;
    private final String displayString;

    public static /* synthetic */ UkTransferTickerInputViewData copy$default(UkTransferTickerInputViewData ukTransferTickerInputViewData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ukTransferTickerInputViewData.displayString;
        }
        if ((i & 2) != 0) {
            z = ukTransferTickerInputViewData.animateInput;
        }
        return ukTransferTickerInputViewData.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayString() {
        return this.displayString;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final UkTransferTickerInputViewData copy(String displayString, boolean animateInput) {
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        return new UkTransferTickerInputViewData(displayString, animateInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkTransferTickerInputViewData)) {
            return false;
        }
        UkTransferTickerInputViewData ukTransferTickerInputViewData = (UkTransferTickerInputViewData) other;
        return Intrinsics.areEqual(this.displayString, ukTransferTickerInputViewData.displayString) && this.animateInput == ukTransferTickerInputViewData.animateInput;
    }

    public int hashCode() {
        return (this.displayString.hashCode() * 31) + Boolean.hashCode(this.animateInput);
    }

    public String toString() {
        return "UkTransferTickerInputViewData(displayString=" + this.displayString + ", animateInput=" + this.animateInput + ")";
    }

    public UkTransferTickerInputViewData(String displayString, boolean z) {
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        this.displayString = displayString;
        this.animateInput = z;
    }

    public final String getDisplayString() {
        return this.displayString;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }
}
