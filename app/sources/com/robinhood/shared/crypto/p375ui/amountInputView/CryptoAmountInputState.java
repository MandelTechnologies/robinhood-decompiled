package com.robinhood.shared.crypto.p375ui.amountInputView;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTickerInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;", "", "amountText", "", "subtitle", "loading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAmountText", "()Ljava/lang/String;", "getSubtitle", "getLoading", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoAmountInputState {
    public static final int $stable = 0;
    private final String amountText;
    private final boolean loading;
    private final String subtitle;

    public static /* synthetic */ CryptoAmountInputState copy$default(CryptoAmountInputState cryptoAmountInputState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoAmountInputState.amountText;
        }
        if ((i & 2) != 0) {
            str2 = cryptoAmountInputState.subtitle;
        }
        if ((i & 4) != 0) {
            z = cryptoAmountInputState.loading;
        }
        return cryptoAmountInputState.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final CryptoAmountInputState copy(String amountText, String subtitle, boolean loading) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        return new CryptoAmountInputState(amountText, subtitle, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoAmountInputState)) {
            return false;
        }
        CryptoAmountInputState cryptoAmountInputState = (CryptoAmountInputState) other;
        return Intrinsics.areEqual(this.amountText, cryptoAmountInputState.amountText) && Intrinsics.areEqual(this.subtitle, cryptoAmountInputState.subtitle) && this.loading == cryptoAmountInputState.loading;
    }

    public int hashCode() {
        int iHashCode = this.amountText.hashCode() * 31;
        String str = this.subtitle;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "CryptoAmountInputState(amountText=" + this.amountText + ", subtitle=" + this.subtitle + ", loading=" + this.loading + ")";
    }

    public CryptoAmountInputState(String amountText, String str, boolean z) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        this.amountText = amountText;
        this.subtitle = str;
        this.loading = z;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getLoading() {
        return this.loading;
    }
}
