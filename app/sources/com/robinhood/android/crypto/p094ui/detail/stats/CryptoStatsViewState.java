package com.robinhood.android.crypto.p094ui.detail.stats;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStatsDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsViewState;", "", "cryptoStatsComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getCryptoStatsComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoStatsViewState {
    public static final int $stable = 8;
    private final UIComponent<GenericAction> cryptoStatsComponent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoStatsViewState copy$default(CryptoStatsViewState cryptoStatsViewState, UIComponent uIComponent, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = cryptoStatsViewState.cryptoStatsComponent;
        }
        return cryptoStatsViewState.copy(uIComponent);
    }

    public final UIComponent<GenericAction> component1() {
        return this.cryptoStatsComponent;
    }

    public final CryptoStatsViewState copy(UIComponent<? extends GenericAction> cryptoStatsComponent) {
        return new CryptoStatsViewState(cryptoStatsComponent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoStatsViewState) && Intrinsics.areEqual(this.cryptoStatsComponent, ((CryptoStatsViewState) other).cryptoStatsComponent);
    }

    public int hashCode() {
        UIComponent<GenericAction> uIComponent = this.cryptoStatsComponent;
        if (uIComponent == null) {
            return 0;
        }
        return uIComponent.hashCode();
    }

    public String toString() {
        return "CryptoStatsViewState(cryptoStatsComponent=" + this.cryptoStatsComponent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStatsViewState(UIComponent<? extends GenericAction> uIComponent) {
        this.cryptoStatsComponent = uIComponent;
    }

    public final UIComponent<GenericAction> getCryptoStatsComponent() {
        return this.cryptoStatsComponent;
    }
}
