package com.robinhood.android.transfers.international.p266ui.amountinput;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AmountInputViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/FeeViewState;", "", AnnotatedPrivateKey.LABEL, "", "value", "", "<init>", "(ILjava/lang/String;)V", "getLabel", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FeeViewState {
    public static final int $stable = 0;
    private final int label;
    private final String value;

    public static /* synthetic */ FeeViewState copy$default(FeeViewState feeViewState, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = feeViewState.label;
        }
        if ((i2 & 2) != 0) {
            str = feeViewState.value;
        }
        return feeViewState.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final FeeViewState copy(int label, String value) {
        return new FeeViewState(label, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeViewState)) {
            return false;
        }
        FeeViewState feeViewState = (FeeViewState) other;
        return this.label == feeViewState.label && Intrinsics.areEqual(this.value, feeViewState.value);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.label) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FeeViewState(label=" + this.label + ", value=" + this.value + ")";
    }

    public FeeViewState(int i, String str) {
        this.label = i;
        this.value = str;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }
}
