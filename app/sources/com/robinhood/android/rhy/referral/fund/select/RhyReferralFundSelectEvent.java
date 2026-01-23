package com.robinhood.android.rhy.referral.fund.select;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSelectEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent;", "", "ShowAddFundingSource", "ShowTransfer", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent$ShowAddFundingSource;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent$ShowTransfer;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralFundSelectEvent {

    /* compiled from: RhyReferralFundSelectEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent$ShowAddFundingSource;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAddFundingSource implements RhyReferralFundSelectEvent {
        public static final int $stable = 8;
        private final TransferConfiguration configuration;

        public static /* synthetic */ ShowAddFundingSource copy$default(ShowAddFundingSource showAddFundingSource, TransferConfiguration transferConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                transferConfiguration = showAddFundingSource.configuration;
            }
            return showAddFundingSource.copy(transferConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferConfiguration getConfiguration() {
            return this.configuration;
        }

        public final ShowAddFundingSource copy(TransferConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ShowAddFundingSource(configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAddFundingSource) && Intrinsics.areEqual(this.configuration, ((ShowAddFundingSource) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "ShowAddFundingSource(configuration=" + this.configuration + ")";
        }

        public ShowAddFundingSource(TransferConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final TransferConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: RhyReferralFundSelectEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent$ShowTransfer;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransfer implements RhyReferralFundSelectEvent {
        public static final int $stable = 8;
        private final TransferConfiguration configuration;

        public static /* synthetic */ ShowTransfer copy$default(ShowTransfer showTransfer, TransferConfiguration transferConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                transferConfiguration = showTransfer.configuration;
            }
            return showTransfer.copy(transferConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferConfiguration getConfiguration() {
            return this.configuration;
        }

        public final ShowTransfer copy(TransferConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ShowTransfer(configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTransfer) && Intrinsics.areEqual(this.configuration, ((ShowTransfer) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "ShowTransfer(configuration=" + this.configuration + ")";
        }

        public ShowTransfer(TransferConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final TransferConfiguration getConfiguration() {
            return this.configuration;
        }
    }
}
