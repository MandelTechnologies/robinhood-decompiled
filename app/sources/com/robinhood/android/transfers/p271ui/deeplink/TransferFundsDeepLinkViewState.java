package com.robinhood.android.transfers.p271ui.deeplink;

import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFundsDeepLinkViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "", "<init>", "()V", "Error", "Loading", "QueuedDeposits", "DcfSideBySide", "DcfFallback", "Transfer", "UkTransfer", "InternationalTransferConfig", "UkQueuedDeposit", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$DcfSideBySide;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Error;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$InternationalTransferConfig;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Loading;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$QueuedDeposits;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Transfer;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$UkQueuedDeposit;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$UkTransfer;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferFundsDeepLinkViewState {
    public static final int $stable = 0;

    public /* synthetic */ TransferFundsDeepLinkViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransferFundsDeepLinkViewState() {
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Error;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends TransferFundsDeepLinkViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Loading;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends TransferFundsDeepLinkViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$QueuedDeposits;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class QueuedDeposits extends TransferFundsDeepLinkViewState {
        public static final int $stable = 8;
        private final BigDecimal amount;

        public BigDecimal getAmount() {
            return this.amount;
        }

        public QueuedDeposits(BigDecimal bigDecimal) {
            super(null);
            this.amount = bigDecimal;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$DcfSideBySide;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DcfSideBySide extends TransferFundsDeepLinkViewState {
        public static final int $stable = 0;
        public static final DcfSideBySide INSTANCE = new DcfSideBySide();

        private DcfSideBySide() {
            super(null);
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$DcfFallback;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$QueuedDeposits;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DcfFallback extends QueuedDeposits {
        public static final int $stable = 8;
        private final BigDecimal amount;

        @Override // com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkViewState.QueuedDeposits
        public BigDecimal getAmount() {
            return this.amount;
        }

        public DcfFallback(BigDecimal bigDecimal) {
            super(bigDecimal);
            this.amount = bigDecimal;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$Transfer;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Transfer extends TransferFundsDeepLinkViewState {
        public static final int $stable = 8;
        private final TransferConfiguration transferConfiguration;

        public static /* synthetic */ Transfer copy$default(Transfer transfer, TransferConfiguration transferConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                transferConfiguration = transfer.transferConfiguration;
            }
            return transfer.copy(transferConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }

        public final Transfer copy(TransferConfiguration transferConfiguration) {
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            return new Transfer(transferConfiguration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transfer) && Intrinsics.areEqual(this.transferConfiguration, ((Transfer) other).transferConfiguration);
        }

        public int hashCode() {
            return this.transferConfiguration.hashCode();
        }

        public String toString() {
            return "Transfer(transferConfiguration=" + this.transferConfiguration + ")";
        }

        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transfer(TransferConfiguration transferConfiguration) {
            super(null);
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            this.transferConfiguration = transferConfiguration;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$UkTransfer;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "key", "Lcom/robinhood/android/transfers/contracts/UkTransfer;", "<init>", "(Lcom/robinhood/android/transfers/contracts/UkTransfer;)V", "getKey", "()Lcom/robinhood/android/transfers/contracts/UkTransfer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkTransfer extends TransferFundsDeepLinkViewState {
        public static final int $stable = 8;
        private final com.robinhood.android.transfers.contracts.UkTransfer key;

        public static /* synthetic */ UkTransfer copy$default(UkTransfer ukTransfer, com.robinhood.android.transfers.contracts.UkTransfer ukTransfer2, int i, Object obj) {
            if ((i & 1) != 0) {
                ukTransfer2 = ukTransfer.key;
            }
            return ukTransfer.copy(ukTransfer2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.android.transfers.contracts.UkTransfer getKey() {
            return this.key;
        }

        public final UkTransfer copy(com.robinhood.android.transfers.contracts.UkTransfer key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new UkTransfer(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkTransfer) && Intrinsics.areEqual(this.key, ((UkTransfer) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "UkTransfer(key=" + this.key + ")";
        }

        public final com.robinhood.android.transfers.contracts.UkTransfer getKey() {
            return this.key;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkTransfer(com.robinhood.android.transfers.contracts.UkTransfer key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$InternationalTransferConfig;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InternationalTransferConfig extends TransferFundsDeepLinkViewState {
        public static final int $stable = 8;
        private final IntentKey key;

        public static /* synthetic */ InternationalTransferConfig copy$default(InternationalTransferConfig internationalTransferConfig, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = internationalTransferConfig.key;
            }
            return internationalTransferConfig.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getKey() {
            return this.key;
        }

        public final InternationalTransferConfig copy(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new InternationalTransferConfig(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InternationalTransferConfig) && Intrinsics.areEqual(this.key, ((InternationalTransferConfig) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "InternationalTransferConfig(key=" + this.key + ")";
        }

        public final IntentKey getKey() {
            return this.key;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternationalTransferConfig(IntentKey key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }
    }

    /* compiled from: TransferFundsDeepLinkViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState$UkQueuedDeposit;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkQueuedDeposit extends TransferFundsDeepLinkViewState {
        public static final int $stable = 0;
        public static final UkQueuedDeposit INSTANCE = new UkQueuedDeposit();

        public boolean equals(Object other) {
            return this == other || (other instanceof UkQueuedDeposit);
        }

        public int hashCode() {
            return -871591630;
        }

        public String toString() {
            return "UkQueuedDeposit";
        }

        private UkQueuedDeposit() {
            super(null);
        }
    }
}
