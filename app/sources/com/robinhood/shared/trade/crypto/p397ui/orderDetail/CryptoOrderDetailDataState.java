package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.android.crypto.lib.UiCryptoOrdersFormatter;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.history.details.C37704R;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020706052\u0006\u00108\u001a\u000209J\u000e\u0010B\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\bEJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0002\bQJ\u009c\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\bSJ\u0013\u0010T\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001fR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoOrderFormatter", "Lcom/robinhood/android/crypto/lib/UiCryptoOrdersFormatter;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isCancelOrderLoading", "", "isTradeBonusEnabled", "isCryptoPnlHubEnabled", "isRecurringVTExperimentEnabled", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "isPnlUpdatesEnabled", "account", "Lcom/robinhood/models/db/Account;", "isCryptoMibExperimentEnabled", "accountNumber", "", "fg2", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/crypto/lib/UiCryptoOrdersFormatter;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZZZZLcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLcom/robinhood/models/db/Account;ZLjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAppType$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/app/type/AppType;", "getCryptoOrderFormatter$feature_trade_crypto_externalDebug", "()Lcom/robinhood/android/crypto/lib/UiCryptoOrdersFormatter;", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "getProfitAndLossTradeItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAccountNumber", "()Ljava/lang/String;", "getFg2-QN2ZGVo$feature_trade_crypto_externalDebug", "()Landroidx/compose/ui/graphics/Color;", "headerState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "getHeaderState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$HeaderState;", "viewInstrumentActionState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;", "getViewInstrumentActionState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ViewInstrumentActionState;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;", "getBanner", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$InfoBannerContent;", "dataRowContents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "resources", "Landroid/content/res/Resources;", "disclaimerTextContent", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "getDisclaimerTextContent", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "buttonState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "getButtonState", "()Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$ButtonState;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component13-QN2ZGVo$feature_trade_crypto_externalDebug", "copy", "copy-aYVmwo0", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final String accountNumber;
    private final AppType appType;
    private final UiCryptoOrdersFormatter cryptoOrderFormatter;
    private final Color fg2;
    private final boolean isCancelOrderLoading;
    private final boolean isCryptoMibExperimentEnabled;
    private final boolean isCryptoPnlHubEnabled;
    private final boolean isPnlUpdatesEnabled;
    private final boolean isRecurringVTExperimentEnabled;
    private final boolean isTradeBonusEnabled;
    private final ProfitAndLossTradeItem profitAndLossTradeItem;
    private final UiCryptoOrder uiCryptoOrder;

    /* compiled from: CryptoOrderDetailDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CryptoOrderDetailDataState(AppType appType, UiCryptoOrdersFormatter uiCryptoOrdersFormatter, UiCryptoOrder uiCryptoOrder, boolean z, boolean z2, boolean z3, boolean z4, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z5, Account account, boolean z6, String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, uiCryptoOrdersFormatter, uiCryptoOrder, z, z2, z3, z4, profitAndLossTradeItem, z5, account, z6, str, color);
    }

    /* renamed from: copy-aYVmwo0$default, reason: not valid java name */
    public static /* synthetic */ CryptoOrderDetailDataState m25899copyaYVmwo0$default(CryptoOrderDetailDataState cryptoOrderDetailDataState, AppType appType, UiCryptoOrdersFormatter uiCryptoOrdersFormatter, UiCryptoOrder uiCryptoOrder, boolean z, boolean z2, boolean z3, boolean z4, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z5, Account account, boolean z6, String str, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoOrderDetailDataState.appType;
        }
        return cryptoOrderDetailDataState.m25901copyaYVmwo0(appType, (i & 2) != 0 ? cryptoOrderDetailDataState.cryptoOrderFormatter : uiCryptoOrdersFormatter, (i & 4) != 0 ? cryptoOrderDetailDataState.uiCryptoOrder : uiCryptoOrder, (i & 8) != 0 ? cryptoOrderDetailDataState.isCancelOrderLoading : z, (i & 16) != 0 ? cryptoOrderDetailDataState.isTradeBonusEnabled : z2, (i & 32) != 0 ? cryptoOrderDetailDataState.isCryptoPnlHubEnabled : z3, (i & 64) != 0 ? cryptoOrderDetailDataState.isRecurringVTExperimentEnabled : z4, (i & 128) != 0 ? cryptoOrderDetailDataState.profitAndLossTradeItem : profitAndLossTradeItem, (i & 256) != 0 ? cryptoOrderDetailDataState.isPnlUpdatesEnabled : z5, (i & 512) != 0 ? cryptoOrderDetailDataState.account : account, (i & 1024) != 0 ? cryptoOrderDetailDataState.isCryptoMibExperimentEnabled : z6, (i & 2048) != 0 ? cryptoOrderDetailDataState.accountNumber : str, (i & 4096) != 0 ? cryptoOrderDetailDataState.fg2 : color);
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component10, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component13-QN2ZGVo$feature_trade_crypto_externalDebug, reason: not valid java name and from getter */
    public final Color getFg2() {
        return this.fg2;
    }

    /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
    public final UiCryptoOrdersFormatter getCryptoOrderFormatter() {
        return this.cryptoOrderFormatter;
    }

    /* renamed from: component3, reason: from getter */
    public final UiCryptoOrder getUiCryptoOrder() {
        return this.uiCryptoOrder;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCancelOrderLoading() {
        return this.isCancelOrderLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTradeBonusEnabled() {
        return this.isTradeBonusEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRecurringVTExperimentEnabled() {
        return this.isRecurringVTExperimentEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
        return this.profitAndLossTradeItem;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPnlUpdatesEnabled() {
        return this.isPnlUpdatesEnabled;
    }

    /* renamed from: copy-aYVmwo0, reason: not valid java name */
    public final CryptoOrderDetailDataState m25901copyaYVmwo0(AppType appType, UiCryptoOrdersFormatter cryptoOrderFormatter, UiCryptoOrder uiCryptoOrder, boolean isCancelOrderLoading, boolean isTradeBonusEnabled, boolean isCryptoPnlHubEnabled, boolean isRecurringVTExperimentEnabled, ProfitAndLossTradeItem profitAndLossTradeItem, boolean isPnlUpdatesEnabled, Account account, boolean isCryptoMibExperimentEnabled, String accountNumber, Color fg2) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoOrderDetailDataState(appType, cryptoOrderFormatter, uiCryptoOrder, isCancelOrderLoading, isTradeBonusEnabled, isCryptoPnlHubEnabled, isRecurringVTExperimentEnabled, profitAndLossTradeItem, isPnlUpdatesEnabled, account, isCryptoMibExperimentEnabled, accountNumber, fg2, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderDetailDataState)) {
            return false;
        }
        CryptoOrderDetailDataState cryptoOrderDetailDataState = (CryptoOrderDetailDataState) other;
        return this.appType == cryptoOrderDetailDataState.appType && Intrinsics.areEqual(this.cryptoOrderFormatter, cryptoOrderDetailDataState.cryptoOrderFormatter) && Intrinsics.areEqual(this.uiCryptoOrder, cryptoOrderDetailDataState.uiCryptoOrder) && this.isCancelOrderLoading == cryptoOrderDetailDataState.isCancelOrderLoading && this.isTradeBonusEnabled == cryptoOrderDetailDataState.isTradeBonusEnabled && this.isCryptoPnlHubEnabled == cryptoOrderDetailDataState.isCryptoPnlHubEnabled && this.isRecurringVTExperimentEnabled == cryptoOrderDetailDataState.isRecurringVTExperimentEnabled && Intrinsics.areEqual(this.profitAndLossTradeItem, cryptoOrderDetailDataState.profitAndLossTradeItem) && this.isPnlUpdatesEnabled == cryptoOrderDetailDataState.isPnlUpdatesEnabled && Intrinsics.areEqual(this.account, cryptoOrderDetailDataState.account) && this.isCryptoMibExperimentEnabled == cryptoOrderDetailDataState.isCryptoMibExperimentEnabled && Intrinsics.areEqual(this.accountNumber, cryptoOrderDetailDataState.accountNumber) && Intrinsics.areEqual(this.fg2, cryptoOrderDetailDataState.fg2);
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        UiCryptoOrdersFormatter uiCryptoOrdersFormatter = this.cryptoOrderFormatter;
        int iHashCode2 = (iHashCode + (uiCryptoOrdersFormatter == null ? 0 : uiCryptoOrdersFormatter.hashCode())) * 31;
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        int iHashCode3 = (((((((((iHashCode2 + (uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode())) * 31) + Boolean.hashCode(this.isCancelOrderLoading)) * 31) + Boolean.hashCode(this.isTradeBonusEnabled)) * 31) + Boolean.hashCode(this.isCryptoPnlHubEnabled)) * 31) + Boolean.hashCode(this.isRecurringVTExperimentEnabled)) * 31;
        ProfitAndLossTradeItem profitAndLossTradeItem = this.profitAndLossTradeItem;
        int iHashCode4 = (((iHashCode3 + (profitAndLossTradeItem == null ? 0 : profitAndLossTradeItem.hashCode())) * 31) + Boolean.hashCode(this.isPnlUpdatesEnabled)) * 31;
        Account account = this.account;
        int iHashCode5 = (((iHashCode4 + (account == null ? 0 : account.hashCode())) * 31) + Boolean.hashCode(this.isCryptoMibExperimentEnabled)) * 31;
        String str = this.accountNumber;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Color color = this.fg2;
        return iHashCode6 + (color != null ? Color.m6713hashCodeimpl(color.getValue()) : 0);
    }

    public String toString() {
        return "CryptoOrderDetailDataState(appType=" + this.appType + ", cryptoOrderFormatter=" + this.cryptoOrderFormatter + ", uiCryptoOrder=" + this.uiCryptoOrder + ", isCancelOrderLoading=" + this.isCancelOrderLoading + ", isTradeBonusEnabled=" + this.isTradeBonusEnabled + ", isCryptoPnlHubEnabled=" + this.isCryptoPnlHubEnabled + ", isRecurringVTExperimentEnabled=" + this.isRecurringVTExperimentEnabled + ", profitAndLossTradeItem=" + this.profitAndLossTradeItem + ", isPnlUpdatesEnabled=" + this.isPnlUpdatesEnabled + ", account=" + this.account + ", isCryptoMibExperimentEnabled=" + this.isCryptoMibExperimentEnabled + ", accountNumber=" + this.accountNumber + ", fg2=" + this.fg2 + ")";
    }

    private CryptoOrderDetailDataState(AppType appType, UiCryptoOrdersFormatter uiCryptoOrdersFormatter, UiCryptoOrder uiCryptoOrder, boolean z, boolean z2, boolean z3, boolean z4, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z5, Account account, boolean z6, String str, Color color) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.cryptoOrderFormatter = uiCryptoOrdersFormatter;
        this.uiCryptoOrder = uiCryptoOrder;
        this.isCancelOrderLoading = z;
        this.isTradeBonusEnabled = z2;
        this.isCryptoPnlHubEnabled = z3;
        this.isRecurringVTExperimentEnabled = z4;
        this.profitAndLossTradeItem = profitAndLossTradeItem;
        this.isPnlUpdatesEnabled = z5;
        this.account = account;
        this.isCryptoMibExperimentEnabled = z6;
        this.accountNumber = str;
        this.fg2 = color;
    }

    public /* synthetic */ CryptoOrderDetailDataState(AppType appType, UiCryptoOrdersFormatter uiCryptoOrdersFormatter, UiCryptoOrder uiCryptoOrder, boolean z, boolean z2, boolean z3, boolean z4, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z5, Account account, boolean z6, String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? null : uiCryptoOrdersFormatter, (i & 4) != 0 ? null : uiCryptoOrder, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : profitAndLossTradeItem, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? null : account, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : color, null);
    }

    public final AppType getAppType$feature_trade_crypto_externalDebug() {
        return this.appType;
    }

    public final UiCryptoOrdersFormatter getCryptoOrderFormatter$feature_trade_crypto_externalDebug() {
        return this.cryptoOrderFormatter;
    }

    public final UiCryptoOrder getUiCryptoOrder() {
        return this.uiCryptoOrder;
    }

    public final boolean isCancelOrderLoading() {
        return this.isCancelOrderLoading;
    }

    public final boolean isTradeBonusEnabled() {
        return this.isTradeBonusEnabled;
    }

    public final boolean isCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }

    public final boolean isRecurringVTExperimentEnabled() {
        return this.isRecurringVTExperimentEnabled;
    }

    public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
        return this.profitAndLossTradeItem;
    }

    public final boolean isPnlUpdatesEnabled() {
        return this.isPnlUpdatesEnabled;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: getFg2-QN2ZGVo$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Color m25902getFg2QN2ZGVo$feature_trade_crypto_externalDebug() {
        return this.fg2;
    }

    public final OrderDetailViewState.HeaderState getHeaderState() {
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        if (uiCryptoOrder != null) {
            return new OrderDetailViewState.HeaderState(UiCryptoOrders.typeText(uiCryptoOrder, this.appType), UiCryptoOrders.getSymbolWithTypeSingular(uiCryptoOrder), false);
        }
        return OrderDetailViewState.HeaderState.INSTANCE.getDEFAULT_LOADING_STATE();
    }

    public final OrderDetailViewState.ViewInstrumentActionState getViewInstrumentActionState() {
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        if (uiCryptoOrder != null) {
            return new OrderDetailViewState.ViewInstrumentActionState(StringResource.INSTANCE.invoke(C37704R.string.order_detail_view_action, UiCryptoOrders.getSymbolWithTypeSingular(uiCryptoOrder)), uiCryptoOrder.getCurrencyPair().getId());
        }
        return null;
    }

    public final OrderDetailViewState.InfoBannerContent getBanner() {
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        if (uiCryptoOrder == null || !uiCryptoOrder.getCurrencyPair().isTokenizedStock() || this.uiCryptoOrder.getCryptoOrder().getState() != OrderState.QUEUED) {
            return null;
        }
        return new OrderDetailViewState.InfoBannerContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_banner_queued, new Object[0]), null, null, 6, null);
    }

    public final ImmutableList<OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction>> dataRowContents(Resources resources) {
        List listListOfNotNull;
        CurrencyPair currencyPair;
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        if (uiCryptoOrder != null && (currencyPair = uiCryptoOrder.getCurrencyPair()) != null && currencyPair.isTokenizedStock()) {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new OrderDetailViewState.DataRowContent[]{CryptoOrderDetailRows.stateDataRowContent(this, resources), CryptoOrderDetailRows.dateSubmittedDataRowContent(this, resources), CryptoOrderDetailRows.timeInForceDataRowContent(this, resources), CryptoOrderDetailRows.tokenizedLimitPriceDataRowContent(this, resources), CryptoOrderDetailRows.quantityEnteredDataRowContent(this, resources), CryptoOrderDetailRows.dateFilledDataRowContent(this, resources), CryptoOrderDetailRows.estimatedPriceDataRowContent(this, resources), CryptoOrderDetailRows.amountFilledDataRowContent(this, resources), CryptoOrderDetailRows.fxRateDataRowContent(this, resources), CryptoOrderDetailRows.filledNotionalValueDataRowContent(this, resources), CryptoOrderDetailRows.fxFeeDataRowContent(this, resources), CryptoOrderDetailRows.estimatedTotalCostCreditDataRowContent(this, resources)});
        } else {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new OrderDetailViewState.DataRowContent[]{CryptoOrderDetailRows.accountNameDataRowContent(this, resources), CryptoOrderDetailRows.linkedAppDataRowContent(this, resources), CryptoOrderDetailRows.stateDataRowContent(this, resources), CryptoOrderDetailRows.dateSubmittedDataRowContent(this, resources), CryptoOrderDetailRows.timeInForceDataRowContent(this, resources), CryptoOrderDetailRows.stopPriceDataRowContent(this, resources), CryptoOrderDetailRows.limitPriceDataRowContent(this, resources), CryptoOrderDetailRows.dateFilledDataRowContent(this, resources), CryptoOrderDetailRows.dateCanceledDataRowContent(this, resources), CryptoOrderDetailRows.amountDataRowContent(this, resources), CryptoOrderDetailRows.amountFilledDataRowContent(this, resources), CryptoOrderDetailRows.amountCanceledDataRowContent(this, resources), CryptoOrderDetailRows.assetTradeBonusDataRowContent(this, resources), CryptoOrderDetailRows.filledOrEstimatedNotionalValueDataRowContent(this, resources), CryptoOrderDetailRows.feeDataRowContent(this, resources), CryptoOrderDetailRows.quoteTradeBonusDataRowContent(this, resources), CryptoOrderDetailRows.estimatedTotalCostCreditDataRowContent(this, resources), CryptoOrderDetailRows.lotsFilledOrSelectedContent(this, resources), CryptoOrderDetailRows.estimatedOrRealizedGainOrLossContent(this, resources), CryptoOrderDetailRows.realizedGainLoss(this, resources)});
        }
        return extensions2.toPersistentList(listListOfNotNull);
    }

    public final OrderDetailViewState.DisclaimerTextContent getDisclaimerTextContent() {
        CurrencyPair currencyPair;
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
            if (uiCryptoOrder == null || (currencyPair = uiCryptoOrder.getCurrencyPair()) == null || currencyPair.isTokenizedStock()) {
                return null;
            }
            return new OrderDetailViewState.DisclaimerTextContent.Text(StringResource.INSTANCE.invoke(C40095R.string.gated_crypto_order_detail_disclaimer, new Object[0]));
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new OrderDetailViewState.DisclaimerTextContent.TextWithLink(companion.invoke(C40095R.string.crypto_order_detail_disclaimer_text, new Object[0]), companion.invoke(C40095R.string.crypto_order_detail_disclaimer_disclosures_text, new Object[0]), companion.invoke(C40095R.string.crypto_order_detail_disclaimer_disclosures_link, new Object[0]));
    }

    public final OrderDetailViewState.ButtonState getButtonState() {
        UiCryptoOrder uiCryptoOrder = this.uiCryptoOrder;
        return uiCryptoOrder == null ? OrderDetailViewState.ButtonState.CancelButton.INSTANCE.getGONE() : this.isCancelOrderLoading ? OrderDetailViewState.ButtonState.CancelButton.INSTANCE.getLOADING() : uiCryptoOrder.getCryptoOrder().isCancelable() ? OrderDetailViewState.ButtonState.CancelButton.INSTANCE.getVISIBLE() : OrderDetailViewState.ButtonState.CancelButton.INSTANCE.getGONE();
    }
}
