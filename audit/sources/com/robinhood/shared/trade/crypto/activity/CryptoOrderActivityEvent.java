package com.robinhood.shared.trade.crypto.activity;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderFailure;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderActivityEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "", "ShowScreen", "ShowFeeOrderSubmissionFailedAlert", "ShowGenericSubmissionFailureAlert", "ShowCryptoOrderTypeSelector", "ShowBillingOrderFailureAlert", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowBillingOrderFailureAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowCryptoOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowFeeOrderSubmissionFailedAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowGenericSubmissionFailureAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowScreen;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CryptoOrderActivityEvent {

    /* compiled from: CryptoOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowScreen;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "sduiMessagingScreen", "Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen;", "<init>", "(Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen;)V", "getSduiMessagingScreen", "()Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowScreen implements CryptoOrderActivityEvent {
        public static final int $stable = 8;
        private final ApiCryptoSduiMessageScreen sduiMessagingScreen;

        public static /* synthetic */ ShowScreen copy$default(ShowScreen showScreen, ApiCryptoSduiMessageScreen apiCryptoSduiMessageScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoSduiMessageScreen = showScreen.sduiMessagingScreen;
            }
            return showScreen.copy(apiCryptoSduiMessageScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoSduiMessageScreen getSduiMessagingScreen() {
            return this.sduiMessagingScreen;
        }

        public final ShowScreen copy(ApiCryptoSduiMessageScreen sduiMessagingScreen) {
            Intrinsics.checkNotNullParameter(sduiMessagingScreen, "sduiMessagingScreen");
            return new ShowScreen(sduiMessagingScreen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowScreen) && Intrinsics.areEqual(this.sduiMessagingScreen, ((ShowScreen) other).sduiMessagingScreen);
        }

        public int hashCode() {
            return this.sduiMessagingScreen.hashCode();
        }

        public String toString() {
            return "ShowScreen(sduiMessagingScreen=" + this.sduiMessagingScreen + ")";
        }

        public ShowScreen(ApiCryptoSduiMessageScreen sduiMessagingScreen) {
            Intrinsics.checkNotNullParameter(sduiMessagingScreen, "sduiMessagingScreen");
            this.sduiMessagingScreen = sduiMessagingScreen;
        }

        public final ApiCryptoSduiMessageScreen getSduiMessagingScreen() {
            return this.sduiMessagingScreen;
        }
    }

    /* compiled from: CryptoOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowFeeOrderSubmissionFailedAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeOrderSubmissionFailedAlert implements CryptoOrderActivityEvent {
        public static final int $stable = 0;
        public static final ShowFeeOrderSubmissionFailedAlert INSTANCE = new ShowFeeOrderSubmissionFailedAlert();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFeeOrderSubmissionFailedAlert);
        }

        public int hashCode() {
            return -1530044434;
        }

        public String toString() {
            return "ShowFeeOrderSubmissionFailedAlert";
        }

        private ShowFeeOrderSubmissionFailedAlert() {
        }
    }

    /* compiled from: CryptoOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowGenericSubmissionFailureAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "setFormStateToEditing", "", "<init>", "(Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;Z)V", "getResult", "()Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "getSetFormStateToEditing", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowGenericSubmissionFailureAlert implements CryptoOrderActivityEvent {
        public static final int $stable = OrderSubmissionManager.Result.Failure.$stable;
        private final OrderSubmissionManager.Result.Failure result;
        private final boolean setFormStateToEditing;

        public static /* synthetic */ ShowGenericSubmissionFailureAlert copy$default(ShowGenericSubmissionFailureAlert showGenericSubmissionFailureAlert, OrderSubmissionManager.Result.Failure failure, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = showGenericSubmissionFailureAlert.result;
            }
            if ((i & 2) != 0) {
                z = showGenericSubmissionFailureAlert.setFormStateToEditing;
            }
            return showGenericSubmissionFailureAlert.copy(failure, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderSubmissionManager.Result.Failure getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSetFormStateToEditing() {
            return this.setFormStateToEditing;
        }

        public final ShowGenericSubmissionFailureAlert copy(OrderSubmissionManager.Result.Failure result, boolean setFormStateToEditing) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new ShowGenericSubmissionFailureAlert(result, setFormStateToEditing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowGenericSubmissionFailureAlert)) {
                return false;
            }
            ShowGenericSubmissionFailureAlert showGenericSubmissionFailureAlert = (ShowGenericSubmissionFailureAlert) other;
            return Intrinsics.areEqual(this.result, showGenericSubmissionFailureAlert.result) && this.setFormStateToEditing == showGenericSubmissionFailureAlert.setFormStateToEditing;
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + Boolean.hashCode(this.setFormStateToEditing);
        }

        public String toString() {
            return "ShowGenericSubmissionFailureAlert(result=" + this.result + ", setFormStateToEditing=" + this.setFormStateToEditing + ")";
        }

        public ShowGenericSubmissionFailureAlert(OrderSubmissionManager.Result.Failure result, boolean z) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.setFormStateToEditing = z;
        }

        public final OrderSubmissionManager.Result.Failure getResult() {
            return this.result;
        }

        public final boolean getSetFormStateToEditing() {
            return this.setFormStateToEditing;
        }
    }

    /* compiled from: CryptoOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowCryptoOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "", "initialMonetizationModelPreference", "Lcom/robinhood/models/api/fee/MonetizationModel;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;ZLcom/robinhood/models/api/fee/MonetizationModel;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "()Z", "getInitialMonetizationModelPreference", "()Lcom/robinhood/models/api/fee/MonetizationModel;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCryptoOrderTypeSelector implements CryptoOrderActivityEvent {
        public static final int $stable = 0;
        private final MonetizationModel initialMonetizationModelPreference;
        private final boolean isRecurringOrder;
        private final CryptoOrderType orderType;

        public static /* synthetic */ ShowCryptoOrderTypeSelector copy$default(ShowCryptoOrderTypeSelector showCryptoOrderTypeSelector, CryptoOrderType cryptoOrderType, boolean z, MonetizationModel monetizationModel, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderType = showCryptoOrderTypeSelector.orderType;
            }
            if ((i & 2) != 0) {
                z = showCryptoOrderTypeSelector.isRecurringOrder;
            }
            if ((i & 4) != 0) {
                monetizationModel = showCryptoOrderTypeSelector.initialMonetizationModelPreference;
            }
            return showCryptoOrderTypeSelector.copy(cryptoOrderType, z, monetizationModel);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRecurringOrder() {
            return this.isRecurringOrder;
        }

        /* renamed from: component3, reason: from getter */
        public final MonetizationModel getInitialMonetizationModelPreference() {
            return this.initialMonetizationModelPreference;
        }

        public final ShowCryptoOrderTypeSelector copy(CryptoOrderType orderType, boolean isRecurringOrder, MonetizationModel initialMonetizationModelPreference) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new ShowCryptoOrderTypeSelector(orderType, isRecurringOrder, initialMonetizationModelPreference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowCryptoOrderTypeSelector)) {
                return false;
            }
            ShowCryptoOrderTypeSelector showCryptoOrderTypeSelector = (ShowCryptoOrderTypeSelector) other;
            return this.orderType == showCryptoOrderTypeSelector.orderType && this.isRecurringOrder == showCryptoOrderTypeSelector.isRecurringOrder && this.initialMonetizationModelPreference == showCryptoOrderTypeSelector.initialMonetizationModelPreference;
        }

        public int hashCode() {
            int iHashCode = ((this.orderType.hashCode() * 31) + Boolean.hashCode(this.isRecurringOrder)) * 31;
            MonetizationModel monetizationModel = this.initialMonetizationModelPreference;
            return iHashCode + (monetizationModel == null ? 0 : monetizationModel.hashCode());
        }

        public String toString() {
            return "ShowCryptoOrderTypeSelector(orderType=" + this.orderType + ", isRecurringOrder=" + this.isRecurringOrder + ", initialMonetizationModelPreference=" + this.initialMonetizationModelPreference + ")";
        }

        public ShowCryptoOrderTypeSelector(CryptoOrderType orderType, boolean z, MonetizationModel monetizationModel) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.orderType = orderType;
            this.isRecurringOrder = z;
            this.initialMonetizationModelPreference = monetizationModel;
        }

        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        public final boolean isRecurringOrder() {
            return this.isRecurringOrder;
        }

        public final MonetizationModel getInitialMonetizationModelPreference() {
            return this.initialMonetizationModelPreference;
        }
    }

    /* compiled from: CryptoOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent$ShowBillingOrderFailureAlert;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "failureReason", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;", "<init>", "(Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;)V", "getFailureReason", "()Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;", "title", "", "getTitle", "()I", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowBillingOrderFailureAlert implements CryptoOrderActivityEvent {
        public static final int $stable = 0;
        private final BillingCryptoOrderFailure.Reason failureReason;

        /* compiled from: CryptoOrderActivityEvent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BillingCryptoOrderFailure.Reason.values().length];
                try {
                    iArr[BillingCryptoOrderFailure.Reason.FAILED_BANK_DEPOSIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BillingCryptoOrderFailure.Reason.FAILED_DEBIT_CARD_DEPOSIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BillingCryptoOrderFailure.Reason.FAILED_ORDER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BillingCryptoOrderFailure.Reason.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BillingCryptoOrderFailure.Reason.CRYPTO_FEE_UNAVAILABLE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ ShowBillingOrderFailureAlert copy$default(ShowBillingOrderFailureAlert showBillingOrderFailureAlert, BillingCryptoOrderFailure.Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = showBillingOrderFailureAlert.failureReason;
            }
            return showBillingOrderFailureAlert.copy(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final BillingCryptoOrderFailure.Reason getFailureReason() {
            return this.failureReason;
        }

        public final ShowBillingOrderFailureAlert copy(BillingCryptoOrderFailure.Reason failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            return new ShowBillingOrderFailureAlert(failureReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowBillingOrderFailureAlert) && this.failureReason == ((ShowBillingOrderFailureAlert) other).failureReason;
        }

        public int hashCode() {
            return this.failureReason.hashCode();
        }

        public String toString() {
            return "ShowBillingOrderFailureAlert(failureReason=" + this.failureReason + ")";
        }

        public ShowBillingOrderFailureAlert(BillingCryptoOrderFailure.Reason failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            this.failureReason = failureReason;
        }

        public final BillingCryptoOrderFailure.Reason getFailureReason() {
            return this.failureReason;
        }

        public final int getTitle() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.failureReason.ordinal()];
            if (i == 1 || i == 2) {
                return C40095R.string.crypto_billing_error_deposit_failed_title;
            }
            if (i == 3) {
                return C40095R.string.crypto_billing_error_order_failed_title;
            }
            if (i == 4) {
                return C11048R.string.error_title;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Handled by ShowFeeOrderSubmissionFailedAlert");
        }

        public final int getMessage() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.failureReason.ordinal()];
            if (i == 1) {
                return C40095R.string.crypto_billing_error_deposit_failed_ach_message;
            }
            if (i == 2) {
                return C40095R.string.crypto_billing_error_deposit_failed_dcf_message;
            }
            if (i == 3) {
                return C40095R.string.crypto_billing_error_order_failed_message;
            }
            if (i == 4) {
                return C11048R.string.error_description;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Handled by ShowFeeOrderSubmissionFailedAlert");
        }
    }
}
