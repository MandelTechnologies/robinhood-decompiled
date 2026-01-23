package com.robinhood.android.crypto.p094ui.detail.staking.section;

import com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoStakingDetailSectionDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/staking/section/CryptoStakingDetailSectionDataState;", "", "cryptoStakingPosition", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "<init>", "(Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;)V", "getCryptoStakingPosition$feature_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "stakingPositionRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getStakingPositionRows$feature_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component1$feature_crypto_externalDebug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoStakingDetailSectionDataState {
    public static final int $stable = 8;
    private final CryptoStakingPosition cryptoStakingPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingDetailSectionDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoStakingDetailSectionDataState copy$default(CryptoStakingDetailSectionDataState cryptoStakingDetailSectionDataState, CryptoStakingPosition cryptoStakingPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoStakingPosition = cryptoStakingDetailSectionDataState.cryptoStakingPosition;
        }
        return cryptoStakingDetailSectionDataState.copy(cryptoStakingPosition);
    }

    /* renamed from: component1$feature_crypto_externalDebug, reason: from getter */
    public final CryptoStakingPosition getCryptoStakingPosition() {
        return this.cryptoStakingPosition;
    }

    public final CryptoStakingDetailSectionDataState copy(CryptoStakingPosition cryptoStakingPosition) {
        return new CryptoStakingDetailSectionDataState(cryptoStakingPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoStakingDetailSectionDataState) && Intrinsics.areEqual(this.cryptoStakingPosition, ((CryptoStakingDetailSectionDataState) other).cryptoStakingPosition);
    }

    public int hashCode() {
        CryptoStakingPosition cryptoStakingPosition = this.cryptoStakingPosition;
        if (cryptoStakingPosition == null) {
            return 0;
        }
        return cryptoStakingPosition.hashCode();
    }

    public String toString() {
        return "CryptoStakingDetailSectionDataState(cryptoStakingPosition=" + this.cryptoStakingPosition + ")";
    }

    public CryptoStakingDetailSectionDataState(CryptoStakingPosition cryptoStakingPosition) {
        this.cryptoStakingPosition = cryptoStakingPosition;
    }

    public /* synthetic */ CryptoStakingDetailSectionDataState(CryptoStakingPosition cryptoStakingPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoStakingPosition);
    }

    public final CryptoStakingPosition getCryptoStakingPosition$feature_crypto_externalDebug() {
        return this.cryptoStakingPosition;
    }

    public final ImmutableList<UIComponent<GenericAction>> getStakingPositionRows$feature_crypto_externalDebug() {
        CryptoStakingPosition.Staking staking;
        List<UIComponent<GenericAction>> positionRows;
        ImmutableList<UIComponent<GenericAction>> immutableList;
        CryptoStakingPosition cryptoStakingPosition = this.cryptoStakingPosition;
        return (cryptoStakingPosition == null || (staking = cryptoStakingPosition.getStaking()) == null || (positionRows = staking.getPositionRows()) == null || (immutableList = extensions2.toImmutableList(positionRows)) == null) ? extensions2.persistentListOf() : immutableList;
    }
}
