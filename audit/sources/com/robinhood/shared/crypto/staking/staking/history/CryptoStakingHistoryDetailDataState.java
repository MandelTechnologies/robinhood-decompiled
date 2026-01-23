package com.robinhood.shared.crypto.staking.staking.history;

import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHistoryDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;", "", "response", "Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse;", "isOrderCancelling", "", "<init>", "(Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse;Z)V", "getResponse", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingHistoryDetailDataState {
    public static final int $stable = 8;
    private final boolean isOrderCancelling;
    private final ApiCryptoStakingHistoryDetailResponse response;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingHistoryDetailDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoStakingHistoryDetailDataState copy$default(CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState, ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiCryptoStakingHistoryDetailResponse = cryptoStakingHistoryDetailDataState.response;
        }
        if ((i & 2) != 0) {
            z = cryptoStakingHistoryDetailDataState.isOrderCancelling;
        }
        return cryptoStakingHistoryDetailDataState.copy(apiCryptoStakingHistoryDetailResponse, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCryptoStakingHistoryDetailResponse getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOrderCancelling() {
        return this.isOrderCancelling;
    }

    public final CryptoStakingHistoryDetailDataState copy(ApiCryptoStakingHistoryDetailResponse response, boolean isOrderCancelling) {
        return new CryptoStakingHistoryDetailDataState(response, isOrderCancelling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingHistoryDetailDataState)) {
            return false;
        }
        CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState = (CryptoStakingHistoryDetailDataState) other;
        return Intrinsics.areEqual(this.response, cryptoStakingHistoryDetailDataState.response) && this.isOrderCancelling == cryptoStakingHistoryDetailDataState.isOrderCancelling;
    }

    public int hashCode() {
        ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse = this.response;
        return ((apiCryptoStakingHistoryDetailResponse == null ? 0 : apiCryptoStakingHistoryDetailResponse.hashCode()) * 31) + Boolean.hashCode(this.isOrderCancelling);
    }

    public String toString() {
        return "CryptoStakingHistoryDetailDataState(response=" + this.response + ", isOrderCancelling=" + this.isOrderCancelling + ")";
    }

    public CryptoStakingHistoryDetailDataState(ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse, boolean z) {
        this.response = apiCryptoStakingHistoryDetailResponse;
        this.isOrderCancelling = z;
    }

    public /* synthetic */ CryptoStakingHistoryDetailDataState(ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiCryptoStakingHistoryDetailResponse, (i & 2) != 0 ? false : z);
    }

    public final ApiCryptoStakingHistoryDetailResponse getResponse() {
        return this.response;
    }

    public final boolean isOrderCancelling() {
        return this.isOrderCancelling;
    }
}
