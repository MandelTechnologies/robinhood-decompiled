package com.robinhood.shared.crypto.transfer.verification.result;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultBlockAndRefundDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundViewState;", "", "currency", "", "loading", "", "<init>", "(Ljava/lang/String;Z)V", "getCurrency", "()Ljava/lang/String;", "getLoading", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ResultBlockAndRefundViewState {
    public static final int $stable = 0;
    private final String currency;
    private final boolean loading;

    public static /* synthetic */ ResultBlockAndRefundViewState copy$default(ResultBlockAndRefundViewState resultBlockAndRefundViewState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resultBlockAndRefundViewState.currency;
        }
        if ((i & 2) != 0) {
            z = resultBlockAndRefundViewState.loading;
        }
        return resultBlockAndRefundViewState.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final ResultBlockAndRefundViewState copy(String currency, boolean loading) {
        return new ResultBlockAndRefundViewState(currency, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultBlockAndRefundViewState)) {
            return false;
        }
        ResultBlockAndRefundViewState resultBlockAndRefundViewState = (ResultBlockAndRefundViewState) other;
        return Intrinsics.areEqual(this.currency, resultBlockAndRefundViewState.currency) && this.loading == resultBlockAndRefundViewState.loading;
    }

    public int hashCode() {
        String str = this.currency;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "ResultBlockAndRefundViewState(currency=" + this.currency + ", loading=" + this.loading + ")";
    }

    public ResultBlockAndRefundViewState(String str, boolean z) {
        this.currency = str;
        this.loading = z;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getLoading() {
        return this.loading;
    }
}
