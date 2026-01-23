package com.robinhood.shared.crypto.staking.staking.history;

import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHistoryDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "", "<init>", "()V", "Loading", "Content", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Loading;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingHistoryDetailViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingHistoryDetailViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoStakingHistoryDetailViewState() {
    }

    /* compiled from: CryptoStakingHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Loading;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoStakingHistoryDetailViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1432405610;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CryptoStakingHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "cryptoStakingContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "sduiComponents", "Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse$DetailViewModel;", "isOrderCancelling", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse$DetailViewModel;Z)V", "getCryptoStakingContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getSduiComponents", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryDetailResponse$DetailViewModel;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content extends CryptoStakingHistoryDetailViewState {
        public static final int $stable = 8;
        private final CryptoStakingContext cryptoStakingContext;
        private final boolean isOrderCancelling;
        private final ApiCryptoStakingHistoryDetailResponse.DetailViewModel sduiComponents;

        public static /* synthetic */ Content copy$default(Content content, CryptoStakingContext cryptoStakingContext, ApiCryptoStakingHistoryDetailResponse.DetailViewModel detailViewModel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoStakingContext = content.cryptoStakingContext;
            }
            if ((i & 2) != 0) {
                detailViewModel = content.sduiComponents;
            }
            if ((i & 4) != 0) {
                z = content.isOrderCancelling;
            }
            return content.copy(cryptoStakingContext, detailViewModel, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoStakingContext getCryptoStakingContext() {
            return this.cryptoStakingContext;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCryptoStakingHistoryDetailResponse.DetailViewModel getSduiComponents() {
            return this.sduiComponents;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsOrderCancelling() {
            return this.isOrderCancelling;
        }

        public final Content copy(CryptoStakingContext cryptoStakingContext, ApiCryptoStakingHistoryDetailResponse.DetailViewModel sduiComponents, boolean isOrderCancelling) {
            Intrinsics.checkNotNullParameter(cryptoStakingContext, "cryptoStakingContext");
            Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
            return new Content(cryptoStakingContext, sduiComponents, isOrderCancelling);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.cryptoStakingContext, content.cryptoStakingContext) && Intrinsics.areEqual(this.sduiComponents, content.sduiComponents) && this.isOrderCancelling == content.isOrderCancelling;
        }

        public int hashCode() {
            return (((this.cryptoStakingContext.hashCode() * 31) + this.sduiComponents.hashCode()) * 31) + Boolean.hashCode(this.isOrderCancelling);
        }

        public String toString() {
            return "Content(cryptoStakingContext=" + this.cryptoStakingContext + ", sduiComponents=" + this.sduiComponents + ", isOrderCancelling=" + this.isOrderCancelling + ")";
        }

        public final CryptoStakingContext getCryptoStakingContext() {
            return this.cryptoStakingContext;
        }

        public final ApiCryptoStakingHistoryDetailResponse.DetailViewModel getSduiComponents() {
            return this.sduiComponents;
        }

        public final boolean isOrderCancelling() {
            return this.isOrderCancelling;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(CryptoStakingContext cryptoStakingContext, ApiCryptoStakingHistoryDetailResponse.DetailViewModel sduiComponents, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(cryptoStakingContext, "cryptoStakingContext");
            Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
            this.cryptoStakingContext = cryptoStakingContext;
            this.sduiComponents = sduiComponents;
            this.isOrderCancelling = z;
        }
    }
}
