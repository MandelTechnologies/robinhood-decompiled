package com.robinhood.android.crypto.p094ui.detail.stats;

import com.robinhood.models.crypto.p314db.CryptoStats;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStatsDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDataState;", "", "cryptoStats", "Lcom/robinhood/models/crypto/db/CryptoStats;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoStats;)V", "cryptoStatsComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getCryptoStatsComponent$feature_crypto_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoStatsDataState {
    public static final int $stable = 8;
    private final CryptoStats cryptoStats;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStatsDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoStats getCryptoStats() {
        return this.cryptoStats;
    }

    public static /* synthetic */ CryptoStatsDataState copy$default(CryptoStatsDataState cryptoStatsDataState, CryptoStats cryptoStats, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoStats = cryptoStatsDataState.cryptoStats;
        }
        return cryptoStatsDataState.copy(cryptoStats);
    }

    public final CryptoStatsDataState copy(CryptoStats cryptoStats) {
        return new CryptoStatsDataState(cryptoStats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoStatsDataState) && Intrinsics.areEqual(this.cryptoStats, ((CryptoStatsDataState) other).cryptoStats);
    }

    public int hashCode() {
        CryptoStats cryptoStats = this.cryptoStats;
        if (cryptoStats == null) {
            return 0;
        }
        return cryptoStats.hashCode();
    }

    public String toString() {
        return "CryptoStatsDataState(cryptoStats=" + this.cryptoStats + ")";
    }

    public CryptoStatsDataState(CryptoStats cryptoStats) {
        this.cryptoStats = cryptoStats;
    }

    public /* synthetic */ CryptoStatsDataState(CryptoStats cryptoStats, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoStats);
    }

    public final UIComponent<GenericAction> getCryptoStatsComponent$feature_crypto_externalDebug() {
        List<UIComponent<GenericAction>> components;
        CryptoStats cryptoStats = this.cryptoStats;
        if (cryptoStats == null || (components = cryptoStats.getComponents()) == null) {
            return null;
        }
        return (UIComponent) CollectionsKt.firstOrNull((List) components);
    }
}
