package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.res.Resources;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.fee.FeeTierImpact;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoOrderExecution;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState2;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.CryptoConfirmationState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensions2;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationViewState3;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010,J\t\u0010W\u001a\u00020\tHÆ\u0003J\t\u0010X\u001a\u00020\u0011HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010Z\u001a\u00020\u0015HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010]\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010^\u001a\u00020\tHÂ\u0003J\t\u0010_\u001a\u00020\tHÂ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÈ\u0001\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010bJ\u0013\u0010c\u001a\u00020\t2\b\u0010d\u001a\u0004\u0018\u00010eHÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010&R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010-\u001a\u0004\b4\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010&R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u0010&R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010J\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010&¨\u0006i"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState;", "resources", "Landroid/content/res/Resources;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "recurringUpsell", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "isEligibleForNotificationUpsell", "", "postReceiptDeeplink", "", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "isTradeBonusEnabled", "appType", "Lcom/robinhood/shared/app/type/AppType;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "confirmationScreenStep", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/ConfirmationScreenStep;", "isVolumeTierEngagementExperimentEnabled", "hasSeenFeeTierStatusSeenWithin7Days", "iacUpsell", "Lcom/robinhood/models/ui/IacUpsell;", "primaryButtonLoading", "disablePostTradeUpsell", "cryptoOrderAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;ZLjava/lang/String;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;ZLcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/ConfirmationScreenStep;ZLjava/lang/Boolean;Lcom/robinhood/models/ui/IacUpsell;ZZLcom/robinhood/models/db/Account;)V", "getResources", "()Landroid/content/res/Resources;", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getRecurringUpsell", "()Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "()Z", "getPostReceiptDeeplink", "()Ljava/lang/String;", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getCanSkipNotificationPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getConfirmationScreenStep", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/ConfirmationScreenStep;", "getHasSeenFeeTierStatusSeenWithin7Days", "getIacUpsell", "()Lcom/robinhood/models/ui/IacUpsell;", "getCryptoOrderAccount", "()Lcom/robinhood/models/db/Account;", "isOrderFilled", "cryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "orderReceived", "getOrderReceived", "confirmationContent", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "getConfirmationContent", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "titleString", "Lcom/robinhood/utils/resource/StringResource;", "getTitleString", "()Lcom/robinhood/utils/resource/StringResource;", "descriptionString", "getDescriptionString", "showPassiveRecurringUpsell", "getShowPassiveRecurringUpsell", "confirmationState", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;", "primaryButtonAction", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Landroid/content/res/Resources;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;ZLjava/lang/String;Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;ZLcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/ConfirmationScreenStep;ZLjava/lang/Boolean;Lcom/robinhood/models/ui/IacUpsell;ZZLcom/robinhood/models/db/Account;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderConfirmationViewState implements BaseCryptoConfirmationState {
    public static final int $stable = 8;
    private final AppType appType;
    private final Boolean canSkipNotificationPrompt;
    private final CryptoOrderConfirmationViewState2 confirmationScreenStep;
    private final Account cryptoOrderAccount;
    private final boolean disablePostTradeUpsell;
    private final CryptoFeeTierInfo feeTierInfo;
    private final Boolean hasSeenFeeTierStatusSeenWithin7Days;
    private final IacUpsell iacUpsell;
    private final boolean isEligibleForNotificationUpsell;
    private final boolean isTradeBonusEnabled;
    private final boolean isVolumeTierEngagementExperimentEnabled;
    private final String postReceiptDeeplink;
    private final boolean primaryButtonLoading;
    private final RecurringOrderUpsellManager.RecurringUpsell recurringUpsell;
    private final Resources resources;
    private final UiCryptoOrder uiCryptoOrder;
    private final UiCurrencyPair uiCurrencyPair;

    /* compiled from: CryptoOrderConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[CryptoOrderContext.CryptoOrderState.values().length];
            try {
                iArr[CryptoOrderContext.CryptoOrderState.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.FILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.PARTIALLY_FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.QUEUED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.VOIDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.NEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CryptoOrderContext.CryptoOrderState.UNCONFIRMED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeeTierImpact.values().length];
            try {
                iArr2[FeeTierImpact.APPROACHING_NEXT_TIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FeeTierImpact.UPGRADED_TO_NEXT_TIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoOrderConfirmationViewState2.values().length];
            try {
                iArr3[CryptoOrderConfirmationViewState2.RECEIPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CryptoOrderConfirmationViewState2.AGGRESSIVE_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CryptoOrderConfirmationViewState2.FEE_TIER_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CryptoOrderConfirmationViewState2.FEE_TIER_UPGRADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderSide.values().length];
            try {
                iArr4[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.values().length];
            try {
                iArr5[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_UPGRADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[AppType.values().length];
            try {
                iArr6[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* renamed from: component15, reason: from getter */
    private final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    /* renamed from: component16, reason: from getter */
    private final boolean getDisablePostTradeUpsell() {
        return this.disablePostTradeUpsell;
    }

    public static /* synthetic */ CryptoOrderConfirmationViewState copy$default(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Resources resources, UiCryptoOrder uiCryptoOrder, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, boolean z, String str, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, boolean z2, AppType appType, UiCurrencyPair uiCurrencyPair, CryptoOrderConfirmationViewState2 cryptoOrderConfirmationViewState2, boolean z3, Boolean bool2, IacUpsell iacUpsell, boolean z4, boolean z5, Account account, int i, Object obj) {
        Account account2;
        boolean z6;
        Resources resources2;
        CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState3;
        boolean z7;
        UiCryptoOrder uiCryptoOrder2;
        RecurringOrderUpsellManager.RecurringUpsell recurringUpsell2;
        boolean z8;
        String str2;
        CryptoFeeTierInfo cryptoFeeTierInfo2;
        Boolean bool3;
        boolean z9;
        AppType appType2;
        UiCurrencyPair uiCurrencyPair2;
        CryptoOrderConfirmationViewState2 cryptoOrderConfirmationViewState22;
        boolean z10;
        Boolean bool4;
        IacUpsell iacUpsell2;
        Resources resources3 = (i & 1) != 0 ? cryptoOrderConfirmationViewState.resources : resources;
        UiCryptoOrder uiCryptoOrder3 = (i & 2) != 0 ? cryptoOrderConfirmationViewState.uiCryptoOrder : uiCryptoOrder;
        RecurringOrderUpsellManager.RecurringUpsell recurringUpsell3 = (i & 4) != 0 ? cryptoOrderConfirmationViewState.recurringUpsell : recurringUpsell;
        boolean z11 = (i & 8) != 0 ? cryptoOrderConfirmationViewState.isEligibleForNotificationUpsell : z;
        String str3 = (i & 16) != 0 ? cryptoOrderConfirmationViewState.postReceiptDeeplink : str;
        CryptoFeeTierInfo cryptoFeeTierInfo3 = (i & 32) != 0 ? cryptoOrderConfirmationViewState.feeTierInfo : cryptoFeeTierInfo;
        Boolean bool5 = (i & 64) != 0 ? cryptoOrderConfirmationViewState.canSkipNotificationPrompt : bool;
        boolean z12 = (i & 128) != 0 ? cryptoOrderConfirmationViewState.isTradeBonusEnabled : z2;
        AppType appType3 = (i & 256) != 0 ? cryptoOrderConfirmationViewState.appType : appType;
        UiCurrencyPair uiCurrencyPair3 = (i & 512) != 0 ? cryptoOrderConfirmationViewState.uiCurrencyPair : uiCurrencyPair;
        CryptoOrderConfirmationViewState2 cryptoOrderConfirmationViewState23 = (i & 1024) != 0 ? cryptoOrderConfirmationViewState.confirmationScreenStep : cryptoOrderConfirmationViewState2;
        boolean z13 = (i & 2048) != 0 ? cryptoOrderConfirmationViewState.isVolumeTierEngagementExperimentEnabled : z3;
        Boolean bool6 = (i & 4096) != 0 ? cryptoOrderConfirmationViewState.hasSeenFeeTierStatusSeenWithin7Days : bool2;
        IacUpsell iacUpsell3 = (i & 8192) != 0 ? cryptoOrderConfirmationViewState.iacUpsell : iacUpsell;
        Resources resources4 = resources3;
        boolean z14 = (i & 16384) != 0 ? cryptoOrderConfirmationViewState.primaryButtonLoading : z4;
        boolean z15 = (i & 32768) != 0 ? cryptoOrderConfirmationViewState.disablePostTradeUpsell : z5;
        if ((i & 65536) != 0) {
            z6 = z15;
            account2 = cryptoOrderConfirmationViewState.cryptoOrderAccount;
            z7 = z14;
            uiCryptoOrder2 = uiCryptoOrder3;
            recurringUpsell2 = recurringUpsell3;
            z8 = z11;
            str2 = str3;
            cryptoFeeTierInfo2 = cryptoFeeTierInfo3;
            bool3 = bool5;
            z9 = z12;
            appType2 = appType3;
            uiCurrencyPair2 = uiCurrencyPair3;
            cryptoOrderConfirmationViewState22 = cryptoOrderConfirmationViewState23;
            z10 = z13;
            bool4 = bool6;
            iacUpsell2 = iacUpsell3;
            resources2 = resources4;
            cryptoOrderConfirmationViewState3 = cryptoOrderConfirmationViewState;
        } else {
            account2 = account;
            z6 = z15;
            resources2 = resources4;
            cryptoOrderConfirmationViewState3 = cryptoOrderConfirmationViewState;
            z7 = z14;
            uiCryptoOrder2 = uiCryptoOrder3;
            recurringUpsell2 = recurringUpsell3;
            z8 = z11;
            str2 = str3;
            cryptoFeeTierInfo2 = cryptoFeeTierInfo3;
            bool3 = bool5;
            z9 = z12;
            appType2 = appType3;
            uiCurrencyPair2 = uiCurrencyPair3;
            cryptoOrderConfirmationViewState22 = cryptoOrderConfirmationViewState23;
            z10 = z13;
            bool4 = bool6;
            iacUpsell2 = iacUpsell3;
        }
        return cryptoOrderConfirmationViewState3.copy(resources2, uiCryptoOrder2, recurringUpsell2, z8, str2, cryptoFeeTierInfo2, bool3, z9, appType2, uiCurrencyPair2, cryptoOrderConfirmationViewState22, z10, bool4, iacUpsell2, z7, z6, account2);
    }

    /* renamed from: component1, reason: from getter */
    public final Resources getResources() {
        return this.resources;
    }

    /* renamed from: component10, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component11, reason: from getter */
    public final CryptoOrderConfirmationViewState2 getConfirmationScreenStep() {
        return this.confirmationScreenStep;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsVolumeTierEngagementExperimentEnabled() {
        return this.isVolumeTierEngagementExperimentEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getHasSeenFeeTierStatusSeenWithin7Days() {
        return this.hasSeenFeeTierStatusSeenWithin7Days;
    }

    /* renamed from: component14, reason: from getter */
    public final IacUpsell getIacUpsell() {
        return this.iacUpsell;
    }

    /* renamed from: component17, reason: from getter */
    public final Account getCryptoOrderAccount() {
        return this.cryptoOrderAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCryptoOrder getUiCryptoOrder() {
        return this.uiCryptoOrder;
    }

    /* renamed from: component3, reason: from getter */
    public final RecurringOrderUpsellManager.RecurringUpsell getRecurringUpsell() {
        return this.recurringUpsell;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEligibleForNotificationUpsell() {
        return this.isEligibleForNotificationUpsell;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPostReceiptDeeplink() {
        return this.postReceiptDeeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoFeeTierInfo getFeeTierInfo() {
        return this.feeTierInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getCanSkipNotificationPrompt() {
        return this.canSkipNotificationPrompt;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsTradeBonusEnabled() {
        return this.isTradeBonusEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    public final CryptoOrderConfirmationViewState copy(Resources resources, UiCryptoOrder uiCryptoOrder, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, boolean isEligibleForNotificationUpsell, String postReceiptDeeplink, CryptoFeeTierInfo feeTierInfo, Boolean canSkipNotificationPrompt, boolean isTradeBonusEnabled, AppType appType, UiCurrencyPair uiCurrencyPair, CryptoOrderConfirmationViewState2 confirmationScreenStep, boolean isVolumeTierEngagementExperimentEnabled, Boolean hasSeenFeeTierStatusSeenWithin7Days, IacUpsell iacUpsell, boolean primaryButtonLoading, boolean disablePostTradeUpsell, Account cryptoOrderAccount) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(recurringUpsell, "recurringUpsell");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(confirmationScreenStep, "confirmationScreenStep");
        return new CryptoOrderConfirmationViewState(resources, uiCryptoOrder, recurringUpsell, isEligibleForNotificationUpsell, postReceiptDeeplink, feeTierInfo, canSkipNotificationPrompt, isTradeBonusEnabled, appType, uiCurrencyPair, confirmationScreenStep, isVolumeTierEngagementExperimentEnabled, hasSeenFeeTierStatusSeenWithin7Days, iacUpsell, primaryButtonLoading, disablePostTradeUpsell, cryptoOrderAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderConfirmationViewState)) {
            return false;
        }
        CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState = (CryptoOrderConfirmationViewState) other;
        return Intrinsics.areEqual(this.resources, cryptoOrderConfirmationViewState.resources) && Intrinsics.areEqual(this.uiCryptoOrder, cryptoOrderConfirmationViewState.uiCryptoOrder) && this.recurringUpsell == cryptoOrderConfirmationViewState.recurringUpsell && this.isEligibleForNotificationUpsell == cryptoOrderConfirmationViewState.isEligibleForNotificationUpsell && Intrinsics.areEqual(this.postReceiptDeeplink, cryptoOrderConfirmationViewState.postReceiptDeeplink) && Intrinsics.areEqual(this.feeTierInfo, cryptoOrderConfirmationViewState.feeTierInfo) && Intrinsics.areEqual(this.canSkipNotificationPrompt, cryptoOrderConfirmationViewState.canSkipNotificationPrompt) && this.isTradeBonusEnabled == cryptoOrderConfirmationViewState.isTradeBonusEnabled && this.appType == cryptoOrderConfirmationViewState.appType && Intrinsics.areEqual(this.uiCurrencyPair, cryptoOrderConfirmationViewState.uiCurrencyPair) && this.confirmationScreenStep == cryptoOrderConfirmationViewState.confirmationScreenStep && this.isVolumeTierEngagementExperimentEnabled == cryptoOrderConfirmationViewState.isVolumeTierEngagementExperimentEnabled && Intrinsics.areEqual(this.hasSeenFeeTierStatusSeenWithin7Days, cryptoOrderConfirmationViewState.hasSeenFeeTierStatusSeenWithin7Days) && Intrinsics.areEqual(this.iacUpsell, cryptoOrderConfirmationViewState.iacUpsell) && this.primaryButtonLoading == cryptoOrderConfirmationViewState.primaryButtonLoading && this.disablePostTradeUpsell == cryptoOrderConfirmationViewState.disablePostTradeUpsell && Intrinsics.areEqual(this.cryptoOrderAccount, cryptoOrderConfirmationViewState.cryptoOrderAccount);
    }

    public int hashCode() {
        int iHashCode = this.resources.hashCode() * 31;
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        int iHashCode2 = (((((iHashCode + (uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode())) * 31) + this.recurringUpsell.hashCode()) * 31) + Boolean.hashCode(this.isEligibleForNotificationUpsell)) * 31;
        String str = this.postReceiptDeeplink;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CryptoFeeTierInfo cryptoFeeTierInfo = this.feeTierInfo;
        int iHashCode4 = (iHashCode3 + (cryptoFeeTierInfo == null ? 0 : cryptoFeeTierInfo.hashCode())) * 31;
        Boolean bool = this.canSkipNotificationPrompt;
        int iHashCode5 = (((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isTradeBonusEnabled)) * 31) + this.appType.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode6 = (((((iHashCode5 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + this.confirmationScreenStep.hashCode()) * 31) + Boolean.hashCode(this.isVolumeTierEngagementExperimentEnabled)) * 31;
        Boolean bool2 = this.hasSeenFeeTierStatusSeenWithin7Days;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        IacUpsell iacUpsell = this.iacUpsell;
        int iHashCode8 = (((((iHashCode7 + (iacUpsell == null ? 0 : iacUpsell.hashCode())) * 31) + Boolean.hashCode(this.primaryButtonLoading)) * 31) + Boolean.hashCode(this.disablePostTradeUpsell)) * 31;
        Account account = this.cryptoOrderAccount;
        return iHashCode8 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderConfirmationViewState(resources=" + this.resources + ", uiCryptoOrder=" + this.uiCryptoOrder + ", recurringUpsell=" + this.recurringUpsell + ", isEligibleForNotificationUpsell=" + this.isEligibleForNotificationUpsell + ", postReceiptDeeplink=" + this.postReceiptDeeplink + ", feeTierInfo=" + this.feeTierInfo + ", canSkipNotificationPrompt=" + this.canSkipNotificationPrompt + ", isTradeBonusEnabled=" + this.isTradeBonusEnabled + ", appType=" + this.appType + ", uiCurrencyPair=" + this.uiCurrencyPair + ", confirmationScreenStep=" + this.confirmationScreenStep + ", isVolumeTierEngagementExperimentEnabled=" + this.isVolumeTierEngagementExperimentEnabled + ", hasSeenFeeTierStatusSeenWithin7Days=" + this.hasSeenFeeTierStatusSeenWithin7Days + ", iacUpsell=" + this.iacUpsell + ", primaryButtonLoading=" + this.primaryButtonLoading + ", disablePostTradeUpsell=" + this.disablePostTradeUpsell + ", cryptoOrderAccount=" + this.cryptoOrderAccount + ")";
    }

    public CryptoOrderConfirmationViewState(Resources resources, UiCryptoOrder uiCryptoOrder, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, boolean z, String str, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, boolean z2, AppType appType, UiCurrencyPair uiCurrencyPair, CryptoOrderConfirmationViewState2 confirmationScreenStep, boolean z3, Boolean bool2, IacUpsell iacUpsell, boolean z4, boolean z5, Account account) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(recurringUpsell, "recurringUpsell");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(confirmationScreenStep, "confirmationScreenStep");
        this.resources = resources;
        this.uiCryptoOrder = uiCryptoOrder;
        this.recurringUpsell = recurringUpsell;
        this.isEligibleForNotificationUpsell = z;
        this.postReceiptDeeplink = str;
        this.feeTierInfo = cryptoFeeTierInfo;
        this.canSkipNotificationPrompt = bool;
        this.isTradeBonusEnabled = z2;
        this.appType = appType;
        this.uiCurrencyPair = uiCurrencyPair;
        this.confirmationScreenStep = confirmationScreenStep;
        this.isVolumeTierEngagementExperimentEnabled = z3;
        this.hasSeenFeeTierStatusSeenWithin7Days = bool2;
        this.iacUpsell = iacUpsell;
        this.primaryButtonLoading = z4;
        this.disablePostTradeUpsell = z5;
        this.cryptoOrderAccount = account;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public CryptoOrderConfirmationRowState createOrderConfirmationRowState(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType, UiCryptoOrder uiCryptoOrder, UiCurrencyPair uiCurrencyPair, Resources resources) {
        return BaseCryptoConfirmationState.DefaultImpls.createOrderConfirmationRowState(this, cryptoOrderConfirmationRowType, uiCryptoOrder, uiCurrencyPair, resources);
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public List<CryptoOrderConfirmationRowState> getCryptoOrderConfirmationRowStates() {
        return BaseCryptoConfirmationState.DefaultImpls.getCryptoOrderConfirmationRowStates(this);
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public boolean isRhcApp() {
        return BaseCryptoConfirmationState.DefaultImpls.isRhcApp(this);
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public Resources getResources() {
        return this.resources;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public UiCryptoOrder getUiCryptoOrder() {
        return this.uiCryptoOrder;
    }

    public final RecurringOrderUpsellManager.RecurringUpsell getRecurringUpsell() {
        return this.recurringUpsell;
    }

    public /* synthetic */ CryptoOrderConfirmationViewState(Resources resources, UiCryptoOrder uiCryptoOrder, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, boolean z, String str, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, boolean z2, AppType appType, UiCurrencyPair uiCurrencyPair, CryptoOrderConfirmationViewState2 cryptoOrderConfirmationViewState2, boolean z3, Boolean bool2, IacUpsell iacUpsell, boolean z4, boolean z5, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i & 2) != 0 ? null : uiCryptoOrder, (i & 4) != 0 ? RecurringOrderUpsellManager.RecurringUpsell.NONE : recurringUpsell, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : cryptoFeeTierInfo, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? false : z2, appType, (i & 512) != 0 ? null : uiCurrencyPair, (i & 1024) != 0 ? CryptoOrderConfirmationViewState2.RECEIPT : cryptoOrderConfirmationViewState2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : iacUpsell, (i & 16384) != 0 ? false : z4, (32768 & i) != 0 ? false : z5, (i & 65536) != 0 ? null : account);
    }

    public final boolean isEligibleForNotificationUpsell() {
        return this.isEligibleForNotificationUpsell;
    }

    public final String getPostReceiptDeeplink() {
        return this.postReceiptDeeplink;
    }

    public final CryptoFeeTierInfo getFeeTierInfo() {
        return this.feeTierInfo;
    }

    public final Boolean getCanSkipNotificationPrompt() {
        return this.canSkipNotificationPrompt;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public boolean isTradeBonusEnabled() {
        return this.isTradeBonusEnabled;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public AppType getAppType() {
        return this.appType;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final CryptoOrderConfirmationViewState2 getConfirmationScreenStep() {
        return this.confirmationScreenStep;
    }

    public final boolean isVolumeTierEngagementExperimentEnabled() {
        return this.isVolumeTierEngagementExperimentEnabled;
    }

    public final Boolean getHasSeenFeeTierStatusSeenWithin7Days() {
        return this.hasSeenFeeTierStatusSeenWithin7Days;
    }

    public final IacUpsell getIacUpsell() {
        return this.iacUpsell;
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public Account getCryptoOrderAccount() {
        return this.cryptoOrderAccount;
    }

    public final boolean isOrderFilled() {
        List<CryptoOrderExecution> executions;
        UiCryptoOrder uiCryptoOrder = getUiCryptoOrder();
        if (uiCryptoOrder == null || (executions = uiCryptoOrder.getExecutions()) == null) {
            return false;
        }
        return !executions.isEmpty();
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        UiCryptoOrder uiCryptoOrder = getUiCryptoOrder();
        if (uiCryptoOrder != null) {
            return AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder);
        }
        return null;
    }

    public final boolean getOrderReceived() {
        CryptoOrderContext cryptoOrderContext = getCryptoOrderContext();
        CryptoOrderContext.CryptoOrderState order_state = cryptoOrderContext != null ? cryptoOrderContext.getOrder_state() : null;
        switch (order_state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[order_state.ordinal()]) {
            case -1:
            case 9:
            case 10:
            case 11:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
        }
    }

    public final CryptoOrderConfirmationViewState3 getConfirmationContent() {
        CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction primaryButtonAction;
        if (getUiCryptoOrder() == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[this.confirmationScreenStep.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new CryptoOrderConfirmationViewState3.AggressiveRecurringUpsell(getUiCryptoOrder());
            }
            if (i == 3) {
                return new CryptoOrderConfirmationViewState3.FeeTierStatus(getUiCryptoOrder(), this.feeTierInfo, this.canSkipNotificationPrompt);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new CryptoOrderConfirmationViewState3.FeeTierUpgraded(getUiCryptoOrder(), this.feeTierInfo, this.canSkipNotificationPrompt);
        }
        if (!this.disablePostTradeUpsell && this.isVolumeTierEngagementExperimentEnabled) {
            FeeTierImpact feeTierImpact = getUiCryptoOrder().getCryptoOrder().getFeeTierImpact();
            int i2 = feeTierImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$1[feeTierImpact.ordinal()];
            if (i2 == -1) {
                primaryButtonAction = CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.DONE;
            } else if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                primaryButtonAction = CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_UPGRADED;
            } else if (Intrinsics.areEqual(this.hasSeenFeeTierStatusSeenWithin7Days, Boolean.FALSE)) {
                primaryButtonAction = CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_STATUS;
            } else {
                primaryButtonAction = CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.DONE;
            }
        } else {
            primaryButtonAction = CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.DONE;
        }
        CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction primaryButtonAction2 = primaryButtonAction;
        return new CryptoOrderConfirmationViewState3.Receipt(confirmationState(primaryButtonAction2, this.primaryButtonLoading), getShowPassiveRecurringUpsell(), getUiCryptoOrder(), AnalyticsExtensions2.getCryptoOrderContext(getUiCryptoOrder()), primaryButtonAction2, this.primaryButtonLoading);
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public StringResource getTitleString() {
        CryptoOrder cryptoOrder;
        UiCryptoOrder uiCryptoOrder = getUiCryptoOrder();
        if (((uiCryptoOrder == null || (cryptoOrder = uiCryptoOrder.getCryptoOrder()) == null) ? null : cryptoOrder.getState()) == OrderState.PARTIALLY_FILLED_REST_CANCELLED && getUiCryptoOrder().getCurrencyType() == ApiCurrency.Type.CRYPTOCURRENCY) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_status_partially_filled_rest_cancelled, getUiCryptoOrder().getAssetCurrency().getCode());
        }
        return BaseCryptoConfirmationState.DefaultImpls.getTitleString(this);
    }

    @Override // com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState
    public StringResource getDescriptionString() {
        StringResource remainingQuantityString;
        int i;
        CryptoOrder cryptoOrder;
        UiCryptoOrder uiCryptoOrder = getUiCryptoOrder();
        OrderState state = (uiCryptoOrder == null || (cryptoOrder = uiCryptoOrder.getCryptoOrder()) == null) ? null : cryptoOrder.getState();
        OrderState orderState = OrderState.PARTIALLY_FILLED_REST_CANCELLED;
        if (state == orderState && getUiCryptoOrder().getCurrencyType() == ApiCurrency.Type.CRYPTOCURRENCY) {
            if (getUiCryptoOrder().getCryptoOrder().getState() == orderState) {
                remainingQuantityString = BaseCryptoConfirmationState2.getCanceledQuantityString(getUiCryptoOrder());
                if (remainingQuantityString == null) {
                    throw new IllegalArgumentException("Backend must provide non-null canceledQuantity for partially filled rest canceled orders.");
                }
            } else {
                remainingQuantityString = BaseCryptoConfirmationState2.getRemainingQuantityString(getUiCryptoOrder());
            }
            int i2 = WhenMappings.$EnumSwitchMapping$3[getUiCryptoOrder().getCryptoOrder().getSide().ordinal()];
            if (i2 == 1) {
                i = C38572R.string.f6210x80052c9;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C38572R.string.f6211x65865627;
            }
            return StringResource.INSTANCE.invoke(i, BaseCryptoConfirmationState2.getOrderTypeString(getUiCryptoOrder()), BaseCryptoConfirmationState2.getQuantityString(getUiCryptoOrder()), UiCryptoOrders.getSymbolWithType(getUiCryptoOrder()), remainingQuantityString);
        }
        return BaseCryptoConfirmationState.DefaultImpls.getDescriptionString(this);
    }

    private final boolean getShowPassiveRecurringUpsell() {
        return this.recurringUpsell == RecurringOrderUpsellManager.RecurringUpsell.PASSIVE;
    }

    private final CryptoConfirmationState confirmationState(CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction primaryButtonAction, boolean primaryButtonLoading) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        int i;
        StringResource titleString = getTitleString();
        StringResource descriptionString = getDescriptionString();
        ImmutableList immutableList = extensions2.toImmutableList(getCryptoOrderConfirmationRowStates());
        int i2 = WhenMappings.$EnumSwitchMapping$4[primaryButtonAction.ordinal()];
        if (i2 == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_cta_done, new Object[0]);
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_confirmation_cta_continue, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke3 = companion.invoke(C38572R.string.crypto_order_confirmation_view_order_details, new Object[0]);
        if (getShowPassiveRecurringUpsell()) {
            int i3 = WhenMappings.$EnumSwitchMapping$5[getAppType().ordinal()];
            if (i3 == 1) {
                throw new IllegalStateException("Not supported");
            }
            if (i3 == 2) {
                i = C40095R.string.order_confirmation_rhc_action_set_recurring_investment;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C40095R.string.order_confirmation_crypto_action_set_recurring_investment;
            }
            stringResourceInvoke2 = companion.invoke(i, new Object[0]);
        } else {
            stringResourceInvoke2 = null;
        }
        return new CryptoConfirmationState(titleString, descriptionString, immutableList, stringResourceInvoke, stringResourceInvoke3, primaryButtonLoading, stringResourceInvoke2, null, null, 384, null);
    }
}
