package com.robinhood.android.trade.directipo.p260ui.order;

import android.content.res.Resources;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.validation.ValidationData;
import com.robinhood.android.lib.trade.validation.ValidationViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderContext;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderFailureResolver;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DirectIpoOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\bdefghijkBÛ\u0001\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 J7\u0010I\u001a\u0002HJ\"\u0014\b\u0000\u0010J*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¢\u0006\u0002\u0010KJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010P\u001a\u00020\tHÂ\u0003J\t\u0010Q\u001a\u00020\u000bHÂ\u0003J\t\u0010R\u001a\u00020\rHÂ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011HÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011HÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011HÆ\u0003JÝ\u0001\u0010\\\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00112\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011HÆ\u0001J\u0013\u0010]\u001a\u0002032\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020cHÖ\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b2\u00104R\u000e\u00105\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00106\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u00107\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u00108\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006l"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState;", "Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "validationData", "Lcom/robinhood/android/lib/trade/validation/ValidationData;", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "shareQuantity", "Ljava/math/BigDecimal;", "customPrice", "Lcom/robinhood/models/util/Money;", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "focusEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$FocusState;", "initialLoadEvent", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$InitialLoad;", "setStartingQuantityEvent", "setStartingPriceEvent", "unsupportedFeatureEvent", "", "loadOrderConfigurationError", "", "staticInputs", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "formInvalidAlertEvent", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/android/lib/trade/validation/ValidationData;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;Lcom/robinhood/udf/UiEvent;)V", "getValidationData", "()Lcom/robinhood/android/lib/trade/validation/ValidationData;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getFocusEvent", "()Lcom/robinhood/udf/UiEvent;", "getInitialLoadEvent", "getSetStartingQuantityEvent", "getSetStartingPriceEvent", "getUnsupportedFeatureEvent", "getLoadOrderConfigurationError", "getStaticInputs", "()Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "getFormInvalidAlertEvent", "validationInput", "getValidationInput", "()Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "isLoadingOrderConfiguration", "", "()Z", "reviewing", "isSharesEditTextEnabled", "isCustomPriceEditTextEnabled", "isReviewButtonEnabled", "cancelOrderViewState", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$CancelOrderViewState;", "getCancelOrderViewState", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$CancelOrderViewState;", "orderEntryViewState", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$OrderEntryViewState;", "getOrderEntryViewState", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$OrderEntryViewState;", "selectOrderType", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$SelectOrderType;", "getSelectOrderType", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$SelectOrderType;", "priceInfo", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$PriceInfo;", "getPriceInfo", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$PriceInfo;", "copyWithNewValidationData", "StateT", "(Lcom/robinhood/android/lib/trade/validation/ValidationData;)Lcom/robinhood/android/lib/trade/validation/ValidationViewState;", "setFormState", "setPriceType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "", "hashCode", "", "toString", "", "CancelOrderViewState", "OrderEntryViewState", "SelectOrderType", "PriceInfo", "InitialLoad", "FocusState", "ReviewState", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DirectIpoOrderViewState extends ValidationViewState<DirectIpoOrderContext, DirectIpoOrderFailureResolver> {
    private static final String KEY_NUM_SHARES = "{num_shares}";
    private static final String KEY_PRICE = "{price}";
    private final Money customPrice;
    private final UiEvent<FocusState> focusEvent;
    private final UiEvent<GenericAlert> formInvalidAlertEvent;
    private final DefaultOrderState formState;
    private final UiEvent<InitialLoad> initialLoadEvent;
    private final boolean isCustomPriceEditTextEnabled;
    private final boolean isLoadingOrderConfiguration;
    private final boolean isReviewButtonEnabled;
    private final boolean isSharesEditTextEnabled;
    private final UiEvent<Throwable> loadOrderConfigurationError;
    private final ApiDirectIpoOrderConfiguration orderConfiguration;
    private final OrderEntryViewState orderEntryViewState;
    private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType;
    private final boolean reviewing;
    private final UiEvent<Money> setStartingPriceEvent;
    private final UiEvent<BigDecimal> setStartingQuantityEvent;
    private final BigDecimal shareQuantity;
    private final DirectIpoOrderContext.StaticInputs staticInputs;
    private final UiEvent<Unit> unsupportedFeatureEvent;
    private final ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> validationData;
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.values().length];
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.NAMED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DirectIpoOrderViewState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component2, reason: from getter */
    private final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component3, reason: from getter */
    private final BigDecimal getShareQuantity() {
        return this.shareQuantity;
    }

    /* renamed from: component4, reason: from getter */
    private final Money getCustomPrice() {
        return this.customPrice;
    }

    /* renamed from: component5, reason: from getter */
    private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getPriceType() {
        return this.priceType;
    }

    public static /* synthetic */ DirectIpoOrderViewState copy$default(DirectIpoOrderViewState directIpoOrderViewState, ValidationData validationData, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, BigDecimal bigDecimal, Money money, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, DefaultOrderState defaultOrderState, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, DirectIpoOrderContext.StaticInputs staticInputs, UiEvent uiEvent7, int i, Object obj) {
        return directIpoOrderViewState.copy((i & 1) != 0 ? directIpoOrderViewState.validationData : validationData, (i & 2) != 0 ? directIpoOrderViewState.orderConfiguration : apiDirectIpoOrderConfiguration, (i & 4) != 0 ? directIpoOrderViewState.shareQuantity : bigDecimal, (i & 8) != 0 ? directIpoOrderViewState.customPrice : money, (i & 16) != 0 ? directIpoOrderViewState.priceType : ipoAccessPriceType, (i & 32) != 0 ? directIpoOrderViewState.formState : defaultOrderState, (i & 64) != 0 ? directIpoOrderViewState.focusEvent : uiEvent, (i & 128) != 0 ? directIpoOrderViewState.initialLoadEvent : uiEvent2, (i & 256) != 0 ? directIpoOrderViewState.setStartingQuantityEvent : uiEvent3, (i & 512) != 0 ? directIpoOrderViewState.setStartingPriceEvent : uiEvent4, (i & 1024) != 0 ? directIpoOrderViewState.unsupportedFeatureEvent : uiEvent5, (i & 2048) != 0 ? directIpoOrderViewState.loadOrderConfigurationError : uiEvent6, (i & 4096) != 0 ? directIpoOrderViewState.staticInputs : staticInputs, (i & 8192) != 0 ? directIpoOrderViewState.formInvalidAlertEvent : uiEvent7);
    }

    public final ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> component1() {
        return this.validationData;
    }

    public final UiEvent<Money> component10() {
        return this.setStartingPriceEvent;
    }

    public final UiEvent<Unit> component11() {
        return this.unsupportedFeatureEvent;
    }

    public final UiEvent<Throwable> component12() {
        return this.loadOrderConfigurationError;
    }

    /* renamed from: component13, reason: from getter */
    public final DirectIpoOrderContext.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public final UiEvent<GenericAlert> component14() {
        return this.formInvalidAlertEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    public final UiEvent<FocusState> component7() {
        return this.focusEvent;
    }

    public final UiEvent<InitialLoad> component8() {
        return this.initialLoadEvent;
    }

    public final UiEvent<BigDecimal> component9() {
        return this.setStartingQuantityEvent;
    }

    public final DirectIpoOrderViewState copy(ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> validationData, ApiDirectIpoOrderConfiguration orderConfiguration, BigDecimal shareQuantity, Money customPrice, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, DefaultOrderState formState, UiEvent<FocusState> focusEvent, UiEvent<InitialLoad> initialLoadEvent, UiEvent<BigDecimal> setStartingQuantityEvent, UiEvent<Money> setStartingPriceEvent, UiEvent<Unit> unsupportedFeatureEvent, UiEvent<Throwable> loadOrderConfigurationError, DirectIpoOrderContext.StaticInputs staticInputs, UiEvent<GenericAlert> formInvalidAlertEvent) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        Intrinsics.checkNotNullParameter(customPrice, "customPrice");
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(formState, "formState");
        return new DirectIpoOrderViewState(validationData, orderConfiguration, shareQuantity, customPrice, priceType, formState, focusEvent, initialLoadEvent, setStartingQuantityEvent, setStartingPriceEvent, unsupportedFeatureEvent, loadOrderConfigurationError, staticInputs, formInvalidAlertEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoOrderViewState)) {
            return false;
        }
        DirectIpoOrderViewState directIpoOrderViewState = (DirectIpoOrderViewState) other;
        return Intrinsics.areEqual(this.validationData, directIpoOrderViewState.validationData) && Intrinsics.areEqual(this.orderConfiguration, directIpoOrderViewState.orderConfiguration) && Intrinsics.areEqual(this.shareQuantity, directIpoOrderViewState.shareQuantity) && Intrinsics.areEqual(this.customPrice, directIpoOrderViewState.customPrice) && this.priceType == directIpoOrderViewState.priceType && this.formState == directIpoOrderViewState.formState && Intrinsics.areEqual(this.focusEvent, directIpoOrderViewState.focusEvent) && Intrinsics.areEqual(this.initialLoadEvent, directIpoOrderViewState.initialLoadEvent) && Intrinsics.areEqual(this.setStartingQuantityEvent, directIpoOrderViewState.setStartingQuantityEvent) && Intrinsics.areEqual(this.setStartingPriceEvent, directIpoOrderViewState.setStartingPriceEvent) && Intrinsics.areEqual(this.unsupportedFeatureEvent, directIpoOrderViewState.unsupportedFeatureEvent) && Intrinsics.areEqual(this.loadOrderConfigurationError, directIpoOrderViewState.loadOrderConfigurationError) && Intrinsics.areEqual(this.staticInputs, directIpoOrderViewState.staticInputs) && Intrinsics.areEqual(this.formInvalidAlertEvent, directIpoOrderViewState.formInvalidAlertEvent);
    }

    public int hashCode() {
        int iHashCode = this.validationData.hashCode() * 31;
        ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration = this.orderConfiguration;
        int iHashCode2 = (((((((((iHashCode + (apiDirectIpoOrderConfiguration == null ? 0 : apiDirectIpoOrderConfiguration.hashCode())) * 31) + this.shareQuantity.hashCode()) * 31) + this.customPrice.hashCode()) * 31) + this.priceType.hashCode()) * 31) + this.formState.hashCode()) * 31;
        UiEvent<FocusState> uiEvent = this.focusEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<InitialLoad> uiEvent2 = this.initialLoadEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<BigDecimal> uiEvent3 = this.setStartingQuantityEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Money> uiEvent4 = this.setStartingPriceEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Unit> uiEvent5 = this.unsupportedFeatureEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<Throwable> uiEvent6 = this.loadOrderConfigurationError;
        int iHashCode8 = (iHashCode7 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        DirectIpoOrderContext.StaticInputs staticInputs = this.staticInputs;
        int iHashCode9 = (iHashCode8 + (staticInputs == null ? 0 : staticInputs.hashCode())) * 31;
        UiEvent<GenericAlert> uiEvent7 = this.formInvalidAlertEvent;
        return iHashCode9 + (uiEvent7 != null ? uiEvent7.hashCode() : 0);
    }

    public String toString() {
        return "DirectIpoOrderViewState(validationData=" + this.validationData + ", orderConfiguration=" + this.orderConfiguration + ", shareQuantity=" + this.shareQuantity + ", customPrice=" + this.customPrice + ", priceType=" + this.priceType + ", formState=" + this.formState + ", focusEvent=" + this.focusEvent + ", initialLoadEvent=" + this.initialLoadEvent + ", setStartingQuantityEvent=" + this.setStartingQuantityEvent + ", setStartingPriceEvent=" + this.setStartingPriceEvent + ", unsupportedFeatureEvent=" + this.unsupportedFeatureEvent + ", loadOrderConfigurationError=" + this.loadOrderConfigurationError + ", staticInputs=" + this.staticInputs + ", formInvalidAlertEvent=" + this.formInvalidAlertEvent + ")";
    }

    @Override // com.robinhood.android.lib.trade.validation.ValidationViewState
    public ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> getValidationData() {
        return this.validationData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DirectIpoOrderViewState(ValidationData validationData, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, BigDecimal bigDecimal, Money money, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, DefaultOrderState defaultOrderState, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, DirectIpoOrderContext.StaticInputs staticInputs, UiEvent uiEvent7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Money money2;
        ValidationData validationData2 = (i & 1) != 0 ? new ValidationData(null, null, 3, null) : validationData;
        ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration2 = (i & 2) != 0 ? null : apiDirectIpoOrderConfiguration;
        BigDecimal bigDecimal2 = (i & 4) != 0 ? BigDecimal.ZERO : bigDecimal;
        if ((i & 8) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money2 = Money3.toMoney(ZERO, Currencies.USD);
        } else {
            money2 = money;
        }
        this(validationData2, apiDirectIpoOrderConfiguration2, bigDecimal2, money2, (i & 16) != 0 ? ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE : ipoAccessPriceType, (i & 32) != 0 ? DefaultOrderState.EDITING : defaultOrderState, (i & 64) != 0 ? null : uiEvent, (i & 128) != 0 ? null : uiEvent2, (i & 256) != 0 ? null : uiEvent3, (i & 512) != 0 ? null : uiEvent4, (i & 1024) != 0 ? null : uiEvent5, (i & 2048) != 0 ? null : uiEvent6, (i & 4096) != 0 ? null : staticInputs, (i & 8192) != 0 ? null : uiEvent7);
    }

    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    public final UiEvent<FocusState> getFocusEvent() {
        return this.focusEvent;
    }

    public final UiEvent<InitialLoad> getInitialLoadEvent() {
        return this.initialLoadEvent;
    }

    public final UiEvent<BigDecimal> getSetStartingQuantityEvent() {
        return this.setStartingQuantityEvent;
    }

    public final UiEvent<Money> getSetStartingPriceEvent() {
        return this.setStartingPriceEvent;
    }

    public final UiEvent<Unit> getUnsupportedFeatureEvent() {
        return this.unsupportedFeatureEvent;
    }

    public final UiEvent<Throwable> getLoadOrderConfigurationError() {
        return this.loadOrderConfigurationError;
    }

    public final DirectIpoOrderContext.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public final UiEvent<GenericAlert> getFormInvalidAlertEvent() {
        return this.formInvalidAlertEvent;
    }

    public DirectIpoOrderViewState(ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> validationData, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, BigDecimal shareQuantity, Money customPrice, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, DefaultOrderState formState, UiEvent<FocusState> uiEvent, UiEvent<InitialLoad> uiEvent2, UiEvent<BigDecimal> uiEvent3, UiEvent<Money> uiEvent4, UiEvent<Unit> uiEvent5, UiEvent<Throwable> uiEvent6, DirectIpoOrderContext.StaticInputs staticInputs, UiEvent<GenericAlert> uiEvent7) {
        boolean zIsPositive;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        Intrinsics.checkNotNullParameter(customPrice, "customPrice");
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(formState, "formState");
        this.validationData = validationData;
        this.orderConfiguration = apiDirectIpoOrderConfiguration;
        this.shareQuantity = shareQuantity;
        this.customPrice = customPrice;
        this.priceType = priceType;
        this.formState = formState;
        this.focusEvent = uiEvent;
        this.initialLoadEvent = uiEvent2;
        this.setStartingQuantityEvent = uiEvent3;
        this.setStartingPriceEvent = uiEvent4;
        this.unsupportedFeatureEvent = uiEvent5;
        this.loadOrderConfigurationError = uiEvent6;
        this.staticInputs = staticInputs;
        this.formInvalidAlertEvent = uiEvent7;
        boolean z = false;
        boolean z2 = apiDirectIpoOrderConfiguration == null;
        this.isLoadingOrderConfiguration = z2;
        boolean isReviewingState = formState.getIsReviewingState();
        this.reviewing = isReviewingState;
        this.isSharesEditTextEnabled = (z2 || isReviewingState) ? false : true;
        this.isCustomPriceEditTextEnabled = (z2 || isReviewingState || !priceType.isNamedPrice()) ? false : true;
        if (!z2 && BigDecimals7.isPositive(shareQuantity)) {
            int i = WhenMappings.$EnumSwitchMapping$0[priceType.ordinal()];
            if (i == 1) {
                zIsPositive = true;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                zIsPositive = customPrice.isPositive();
            }
            if (zIsPositive) {
                z = true;
            }
        }
        this.isReviewButtonEnabled = z;
        this.orderEntryViewState = apiDirectIpoOrderConfiguration != null ? new OrderEntryViewState(apiDirectIpoOrderConfiguration, priceType, customPrice, shareQuantity) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.android.lib.trade.validation.ValidationViewState
    public DirectIpoOrderContext getValidationInput() {
        if (this.orderConfiguration == null || this.staticInputs == null) {
            return null;
        }
        return new DirectIpoOrderContext(this.orderConfiguration, this.priceType, this.customPrice, this.shareQuantity, this.staticInputs);
    }

    /* renamed from: isLoadingOrderConfiguration, reason: from getter */
    public final boolean getIsLoadingOrderConfiguration() {
        return this.isLoadingOrderConfiguration;
    }

    /* renamed from: isSharesEditTextEnabled, reason: from getter */
    public final boolean getIsSharesEditTextEnabled() {
        return this.isSharesEditTextEnabled;
    }

    /* renamed from: isCustomPriceEditTextEnabled, reason: from getter */
    public final boolean getIsCustomPriceEditTextEnabled() {
        return this.isCustomPriceEditTextEnabled;
    }

    /* renamed from: isReviewButtonEnabled, reason: from getter */
    public final boolean getIsReviewButtonEnabled() {
        return this.isReviewButtonEnabled;
    }

    public final CancelOrderViewState getCancelOrderViewState() {
        ApiDirectIpoOrderConfiguration.OrderEntryContext context;
        ApiDirectIpoOrderConfiguration.OrderEntryContext context2;
        if (this.reviewing) {
            return null;
        }
        ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration = this.orderConfiguration;
        ApiDirectIpoOrderConfiguration.OrderInfo existing_order = (apiDirectIpoOrderConfiguration == null || (context2 = apiDirectIpoOrderConfiguration.getContext()) == null) ? null : context2.getExisting_order();
        ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration2 = this.orderConfiguration;
        String instrument_symbol = (apiDirectIpoOrderConfiguration2 == null || (context = apiDirectIpoOrderConfiguration2.getContext()) == null) ? null : context.getInstrument_symbol();
        if (existing_order == null || instrument_symbol == null) {
            return null;
        }
        return new CancelOrderViewState(existing_order.getOrder_id(), existing_order.getQuantity(), instrument_symbol);
    }

    public final OrderEntryViewState getOrderEntryViewState() {
        return this.orderEntryViewState;
    }

    public final SelectOrderType getSelectOrderType() {
        String change_limit_type_label;
        ApiDirectIpoOrderConfiguration.LimitOptionsViewModel limit_options;
        if (this.reviewing || this.orderConfiguration == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.priceType.ordinal()];
        if (i == 1) {
            change_limit_type_label = this.orderConfiguration.getView_model().getRows().getPrice_row().getChange_limit_type_label();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown PriceTypes should be filtered out");
            }
            ApiDirectIpoOrderConfiguration.LimitOrderTextInputRow named_price_row = this.orderConfiguration.getView_model().getRows().getNamed_price_row();
            change_limit_type_label = named_price_row != null ? named_price_row.getChange_limit_type_label() : null;
        }
        if (change_limit_type_label == null || (limit_options = this.orderConfiguration.getView_model().getLimit_options()) == null) {
            return null;
        }
        return new SelectOrderType(change_limit_type_label, this.priceType, limit_options);
    }

    public final PriceInfo getPriceInfo() {
        ApiDirectIpoOrderConfiguration.PriceInfoAlert info_alert_content;
        if (this.reviewing || this.orderConfiguration == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.priceType.ordinal()];
        if (i == 1) {
            info_alert_content = this.orderConfiguration.getView_model().getRows().getPrice_row().getInfo_alert_content();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown PriceTypes should be filtered out");
            }
            ApiDirectIpoOrderConfiguration.LimitOrderTextInputRow named_price_row = this.orderConfiguration.getView_model().getRows().getNamed_price_row();
            info_alert_content = named_price_row != null ? named_price_row.getInfo_alert_content() : null;
        }
        if (info_alert_content == null) {
            return null;
        }
        return new PriceInfo(this.customPrice, info_alert_content);
    }

    @Override // com.robinhood.android.lib.trade.validation.ValidationViewState
    public <StateT extends ValidationViewState<DirectIpoOrderContext, DirectIpoOrderFailureResolver>> StateT copyWithNewValidationData(ValidationData<DirectIpoOrderContext, DirectIpoOrderFailureResolver> validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        DirectIpoOrderViewState directIpoOrderViewStateCopy$default = copy$default(this, validationData, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        Intrinsics.checkNotNull(directIpoOrderViewStateCopy$default, "null cannot be cast to non-null type StateT of com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderViewState.copyWithNewValidationData");
        return directIpoOrderViewStateCopy$default;
    }

    public final DirectIpoOrderViewState setFormState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        return copy$default(this, null, null, null, null, null, formState, !formState.getIsReviewingState() ? new UiEvent(FocusState.SHARES_INPUT) : null, null, null, null, null, null, null, null, 16287, null);
    }

    public final DirectIpoOrderViewState setPriceType(ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType) {
        DirectIpoOrderViewState directIpoOrderViewState;
        FocusState focusState;
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        int i = WhenMappings.$EnumSwitchMapping$0[priceType.ordinal()];
        if (i == 1) {
            directIpoOrderViewState = this;
            focusState = FocusState.SHARES_INPUT;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown PriceTypes should be filtered out");
            }
            directIpoOrderViewState = this;
            if (BigDecimals7.isPositive(directIpoOrderViewState.shareQuantity)) {
                focusState = FocusState.PRICE_INPUT;
            } else {
                focusState = FocusState.SHARES_INPUT;
            }
        }
        return copy$default(directIpoOrderViewState, null, null, null, null, priceType, null, new UiEvent(focusState), null, null, null, null, null, null, null, 16303, null);
    }

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$CancelOrderViewState;", "", "orderId", "Ljava/util/UUID;", "sharesQuantity", "Ljava/math/BigDecimal;", "symbol", "", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getOrderId", "()Ljava/util/UUID;", "getSharesQuantity", "()Ljava/math/BigDecimal;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CancelOrderViewState {
        public static final int $stable = 8;
        private final UUID orderId;
        private final BigDecimal sharesQuantity;
        private final String symbol;

        public static /* synthetic */ CancelOrderViewState copy$default(CancelOrderViewState cancelOrderViewState, UUID uuid, BigDecimal bigDecimal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cancelOrderViewState.orderId;
            }
            if ((i & 2) != 0) {
                bigDecimal = cancelOrderViewState.sharesQuantity;
            }
            if ((i & 4) != 0) {
                str = cancelOrderViewState.symbol;
            }
            return cancelOrderViewState.copy(uuid, bigDecimal, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getSharesQuantity() {
            return this.sharesQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final CancelOrderViewState copy(UUID orderId, BigDecimal sharesQuantity, String symbol) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new CancelOrderViewState(orderId, sharesQuantity, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelOrderViewState)) {
                return false;
            }
            CancelOrderViewState cancelOrderViewState = (CancelOrderViewState) other;
            return Intrinsics.areEqual(this.orderId, cancelOrderViewState.orderId) && Intrinsics.areEqual(this.sharesQuantity, cancelOrderViewState.sharesQuantity) && Intrinsics.areEqual(this.symbol, cancelOrderViewState.symbol);
        }

        public int hashCode() {
            return (((this.orderId.hashCode() * 31) + this.sharesQuantity.hashCode()) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "CancelOrderViewState(orderId=" + this.orderId + ", sharesQuantity=" + this.sharesQuantity + ", symbol=" + this.symbol + ")";
        }

        public CancelOrderViewState(UUID orderId, BigDecimal sharesQuantity, String symbol) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.orderId = orderId;
            this.sharesQuantity = sharesQuantity;
            this.symbol = symbol;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final BigDecimal getSharesQuantity() {
            return this.sharesQuantity;
        }

        public final String getSymbol() {
            return this.symbol;
        }
    }

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-J\t\u0010:\u001a\u00020\u0003HÂ\u0003J\t\u0010;\u001a\u00020\u0005HÂ\u0003J\t\u0010<\u001a\u00020\u0007HÂ\u0003J\t\u0010=\u001a\u00020\tHÂ\u0003J1\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010?\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020/HÖ\u0001J\t\u0010B\u001a\u000203HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010)\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0013R\u0016\u0010.\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b9\u00105¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$OrderEntryViewState;", "", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "customPrice", "Lcom/robinhood/models/util/Money;", "shareQuantity", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;)V", "viewModel", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$OrderEntryViewModel;", "pricePerShare", "totalCost", "titleText", "", "getTitleText", "()Ljava/lang/CharSequence;", "buyingPowerAvailableText", "getBuyingPowerAvailableText", "quantityLabelText", "getQuantityLabelText", "quantityHintText", "getQuantityHintText", "priceRangeLabelText", "getPriceRangeLabelText", "priceRangeSubtitleText", "getPriceRangeSubtitleText", "priceRangeValueText", "getPriceRangeValueText", "priceRangeValueVisible", "", "getPriceRangeValueVisible", "()Z", "customPriceHintText", "getCustomPriceHintText", "()Lcom/robinhood/models/util/Money;", "customPriceInputVisible", "getCustomPriceInputVisible", "totalLabelText", "getTotalLabelText", "getTotalValueText", "resources", "Landroid/content/res/Resources;", "disclaimerIcon", "", "getDisclaimerIcon", "()I", "disclaimerMarkdown", "", "getDisclaimerMarkdown", "()Ljava/lang/String;", "reviewTitleText", "getReviewTitleText", "reviewDescriptionMarkdown", "getReviewDescriptionMarkdown", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderEntryViewState {
        public static final int $stable = 8;
        private final Money customPrice;
        private final boolean customPriceInputVisible;
        private final int disclaimerIcon;
        private final String disclaimerMarkdown;
        private final ApiDirectIpoOrderConfiguration orderConfiguration;
        private final Money pricePerShare;
        private final CharSequence priceRangeLabelText;
        private final CharSequence priceRangeSubtitleText;
        private final boolean priceRangeValueVisible;
        private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType;
        private final String reviewDescriptionMarkdown;
        private final String reviewTitleText;
        private final BigDecimal shareQuantity;
        private final Money totalCost;
        private final CharSequence totalLabelText;
        private final ApiDirectIpoOrderConfiguration.OrderEntryViewModel viewModel;

        /* compiled from: DirectIpoOrderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.values().length];
                try {
                    iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.NAMED_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
            return this.orderConfiguration;
        }

        /* renamed from: component2, reason: from getter */
        private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getPriceType() {
            return this.priceType;
        }

        /* renamed from: component3, reason: from getter */
        private final Money getCustomPrice() {
            return this.customPrice;
        }

        /* renamed from: component4, reason: from getter */
        private final BigDecimal getShareQuantity() {
            return this.shareQuantity;
        }

        public static /* synthetic */ OrderEntryViewState copy$default(OrderEntryViewState orderEntryViewState, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, Money money, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDirectIpoOrderConfiguration = orderEntryViewState.orderConfiguration;
            }
            if ((i & 2) != 0) {
                ipoAccessPriceType = orderEntryViewState.priceType;
            }
            if ((i & 4) != 0) {
                money = orderEntryViewState.customPrice;
            }
            if ((i & 8) != 0) {
                bigDecimal = orderEntryViewState.shareQuantity;
            }
            return orderEntryViewState.copy(apiDirectIpoOrderConfiguration, ipoAccessPriceType, money, bigDecimal);
        }

        public final OrderEntryViewState copy(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal shareQuantity) {
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(priceType, "priceType");
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            return new OrderEntryViewState(orderConfiguration, priceType, customPrice, shareQuantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderEntryViewState)) {
                return false;
            }
            OrderEntryViewState orderEntryViewState = (OrderEntryViewState) other;
            return Intrinsics.areEqual(this.orderConfiguration, orderEntryViewState.orderConfiguration) && this.priceType == orderEntryViewState.priceType && Intrinsics.areEqual(this.customPrice, orderEntryViewState.customPrice) && Intrinsics.areEqual(this.shareQuantity, orderEntryViewState.shareQuantity);
        }

        public int hashCode() {
            return (((((this.orderConfiguration.hashCode() * 31) + this.priceType.hashCode()) * 31) + this.customPrice.hashCode()) * 31) + this.shareQuantity.hashCode();
        }

        public String toString() {
            return "OrderEntryViewState(orderConfiguration=" + this.orderConfiguration + ", priceType=" + this.priceType + ", customPrice=" + this.customPrice + ", shareQuantity=" + this.shareQuantity + ")";
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OrderEntryViewState(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal shareQuantity) {
            Money money;
            Money money2;
            String label;
            String sublabel;
            boolean z;
            ServerToBentoAssetMapper2 icon;
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(priceType, "priceType");
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
            this.orderConfiguration = orderConfiguration;
            this.priceType = priceType;
            this.customPrice = customPrice;
            this.shareQuantity = shareQuantity;
            ApiDirectIpoOrderConfiguration.OrderEntryViewModel view_model = orderConfiguration.getView_model();
            this.viewModel = view_model;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[priceType.ordinal()];
            boolean z2 = true;
            if (i == 1) {
                ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote = orderConfiguration.getContext().getIpo_access_quote();
                if (ipo_access_quote != null) {
                    Money finalized_price = ipo_access_quote.getFinalized_price();
                    money = finalized_price == null ? ipo_access_quote.getUpper_price_collared() : finalized_price;
                    if (money == null) {
                    }
                    money2 = money;
                } else {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    money = Money3.toMoney(ZERO, Currencies.USD);
                    money2 = money;
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                money2 = customPrice;
            }
            this.pricePerShare = money2;
            this.totalCost = money2.times(shareQuantity);
            int i2 = iArr[priceType.ordinal()];
            if (i2 == 1) {
                label = view_model.getRows().getPrice_row().getLabel();
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ApiDirectIpoOrderConfiguration.LimitOrderTextInputRow named_price_row = view_model.getRows().getNamed_price_row();
                if (named_price_row == null || (label = named_price_row.getLabel()) == null) {
                    label = view_model.getRows().getPrice_row().getLabel();
                }
            }
            this.priceRangeLabelText = label;
            int i3 = iArr[priceType.ordinal()];
            if (i3 == 1) {
                sublabel = view_model.getRows().getPrice_row().getSublabel();
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ApiDirectIpoOrderConfiguration.LimitOrderTextInputRow named_price_row2 = view_model.getRows().getNamed_price_row();
                if (named_price_row2 == null || (sublabel = named_price_row2.getSublabel()) == null) {
                    sublabel = view_model.getRows().getPrice_row().getSublabel();
                }
            }
            this.priceRangeSubtitleText = sublabel;
            int i4 = iArr[priceType.ordinal()];
            int resourceId = 0;
            if (i4 == 1) {
                z = true;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (view_model.getRows().getNamed_price_row() != null) {
                    z = false;
                }
            }
            this.priceRangeValueVisible = z;
            int i5 = iArr[priceType.ordinal()];
            if (i5 == 1) {
                z2 = false;
            } else {
                if (i5 != 2) {
                    if (i5 == 3) {
                        throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (view_model.getRows().getNamed_price_row() == null) {
                }
            }
            this.customPriceInputVisible = z2;
            this.totalLabelText = view_model.getRows().getTotal_amount_row().getLabel();
            ApiDirectIpoOrderConfiguration.DisclaimerViewModel disclaimer = view_model.getDisclaimer();
            if (disclaimer != null && (icon = disclaimer.getIcon()) != null) {
                resourceId = icon.getResourceId();
            }
            this.disclaimerIcon = resourceId;
            ApiDirectIpoOrderConfiguration.DisclaimerViewModel disclaimer2 = view_model.getDisclaimer();
            this.disclaimerMarkdown = disclaimer2 != null ? disclaimer2.getLabel_markdown() : null;
            this.reviewTitleText = view_model.getOrder_summary().getTitle();
            String description_markdown = view_model.getOrder_summary().getDescription_markdown();
            String plainString = BigDecimals7.orZero(shareQuantity).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            this.reviewDescriptionMarkdown = StringsKt.replace$default(StringsKt.replace$default(description_markdown, DirectIpoOrderViewState.KEY_NUM_SHARES, plainString, false, 4, (Object) null), DirectIpoOrderViewState.KEY_PRICE, Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null), false, 4, (Object) null);
        }

        public final CharSequence getTitleText() {
            return this.viewModel.getTitle();
        }

        public final CharSequence getBuyingPowerAvailableText() {
            return this.viewModel.getBuying_power_description();
        }

        public final CharSequence getQuantityLabelText() {
            return this.viewModel.getRows().getQuantity_row().getLabel();
        }

        public final CharSequence getQuantityHintText() {
            return this.viewModel.getRows().getQuantity_row().getPlaceholder_value();
        }

        public final CharSequence getPriceRangeLabelText() {
            return this.priceRangeLabelText;
        }

        public final CharSequence getPriceRangeSubtitleText() {
            return this.priceRangeSubtitleText;
        }

        public final CharSequence getPriceRangeValueText() {
            return this.viewModel.getRows().getPrice_row().getValue();
        }

        public final boolean getPriceRangeValueVisible() {
            return this.priceRangeValueVisible;
        }

        public final Money getCustomPriceHintText() {
            ApiDirectIpoOrderConfiguration.LimitOrderTextInputRow named_price_row = this.viewModel.getRows().getNamed_price_row();
            if (named_price_row != null) {
                return named_price_row.getPlaceholder_value();
            }
            return null;
        }

        public final boolean getCustomPriceInputVisible() {
            return this.customPriceInputVisible;
        }

        public final CharSequence getTotalLabelText() {
            return this.totalLabelText;
        }

        public final CharSequence getTotalValueText(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            if (this.totalCost.isZero()) {
                String string2 = resources.getString(C29323R.string.direct_ipo_order_empty_total_cost, this.totalCost.getCurrency().getSymbol());
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            return Money.format$default(this.totalCost, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }

        public final int getDisclaimerIcon() {
            return this.disclaimerIcon;
        }

        public final String getDisclaimerMarkdown() {
            return this.disclaimerMarkdown;
        }

        public final String getReviewTitleText() {
            return this.reviewTitleText;
        }

        public final String getReviewDescriptionMarkdown() {
            return this.reviewDescriptionMarkdown;
        }
    }

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$SelectOrderType;", "", "buttonText", "", "selectedPriceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "priceTypeOptions", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;)V", "getButtonText", "()Ljava/lang/CharSequence;", "getSelectedPriceType", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "getPriceTypeOptions", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectOrderType {
        public static final int $stable = 8;
        private final CharSequence buttonText;
        private final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions;
        private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType;

        public static /* synthetic */ SelectOrderType copy$default(SelectOrderType selectOrderType, CharSequence charSequence, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel limitOptionsViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = selectOrderType.buttonText;
            }
            if ((i & 2) != 0) {
                ipoAccessPriceType = selectOrderType.selectedPriceType;
            }
            if ((i & 4) != 0) {
                limitOptionsViewModel = selectOrderType.priceTypeOptions;
            }
            return selectOrderType.copy(charSequence, ipoAccessPriceType, limitOptionsViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getSelectedPriceType() {
            return this.selectedPriceType;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel getPriceTypeOptions() {
            return this.priceTypeOptions;
        }

        public final SelectOrderType copy(CharSequence buttonText, ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions) {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(selectedPriceType, "selectedPriceType");
            Intrinsics.checkNotNullParameter(priceTypeOptions, "priceTypeOptions");
            return new SelectOrderType(buttonText, selectedPriceType, priceTypeOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectOrderType)) {
                return false;
            }
            SelectOrderType selectOrderType = (SelectOrderType) other;
            return Intrinsics.areEqual(this.buttonText, selectOrderType.buttonText) && this.selectedPriceType == selectOrderType.selectedPriceType && Intrinsics.areEqual(this.priceTypeOptions, selectOrderType.priceTypeOptions);
        }

        public int hashCode() {
            return (((this.buttonText.hashCode() * 31) + this.selectedPriceType.hashCode()) * 31) + this.priceTypeOptions.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.buttonText;
            return "SelectOrderType(buttonText=" + ((Object) charSequence) + ", selectedPriceType=" + this.selectedPriceType + ", priceTypeOptions=" + this.priceTypeOptions + ")";
        }

        public SelectOrderType(CharSequence buttonText, ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions) {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(selectedPriceType, "selectedPriceType");
            Intrinsics.checkNotNullParameter(priceTypeOptions, "priceTypeOptions");
            this.buttonText = buttonText;
            this.selectedPriceType = selectedPriceType;
            this.priceTypeOptions = priceTypeOptions;
        }

        public final CharSequence getButtonText() {
            return this.buttonText;
        }

        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getSelectedPriceType() {
            return this.selectedPriceType;
        }

        public final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel getPriceTypeOptions() {
            return this.priceTypeOptions;
        }
    }

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$PriceInfo;", "", "customPrice", "Lcom/robinhood/models/util/Money;", "priceInfoAlert", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;)V", "getCustomPrice", "()Lcom/robinhood/models/util/Money;", "getPriceInfoAlert", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceInfo {
        public static final int $stable = 8;
        private final Money customPrice;
        private final ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert;

        public static /* synthetic */ PriceInfo copy$default(PriceInfo priceInfo, Money money, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                money = priceInfo.customPrice;
            }
            if ((i & 2) != 0) {
                priceInfoAlert = priceInfo.priceInfoAlert;
            }
            return priceInfo.copy(money, priceInfoAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getCustomPrice() {
            return this.customPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.PriceInfoAlert getPriceInfoAlert() {
            return this.priceInfoAlert;
        }

        public final PriceInfo copy(Money customPrice, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert) {
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(priceInfoAlert, "priceInfoAlert");
            return new PriceInfo(customPrice, priceInfoAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInfo)) {
                return false;
            }
            PriceInfo priceInfo = (PriceInfo) other;
            return Intrinsics.areEqual(this.customPrice, priceInfo.customPrice) && Intrinsics.areEqual(this.priceInfoAlert, priceInfo.priceInfoAlert);
        }

        public int hashCode() {
            return (this.customPrice.hashCode() * 31) + this.priceInfoAlert.hashCode();
        }

        public String toString() {
            return "PriceInfo(customPrice=" + this.customPrice + ", priceInfoAlert=" + this.priceInfoAlert + ")";
        }

        public PriceInfo(Money customPrice, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert) {
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(priceInfoAlert, "priceInfoAlert");
            this.customPrice = customPrice;
            this.priceInfoAlert = priceInfoAlert;
        }

        public final Money getCustomPrice() {
            return this.customPrice;
        }

        public final ApiDirectIpoOrderConfiguration.PriceInfoAlert getPriceInfoAlert() {
            return this.priceInfoAlert;
        }
    }

    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$InitialLoad;", "", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "customPrice", "Lcom/robinhood/models/util/Money;", "quantity", "Ljava/math/BigDecimal;", "staticInputs", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;)V", "getOrderConfiguration", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "getPriceType", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "getCustomPrice", "()Lcom/robinhood/models/util/Money;", "getQuantity", "()Ljava/math/BigDecimal;", "getStaticInputs", "()Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialLoad {
        public static final int $stable = 8;
        private final Money customPrice;
        private final ApiDirectIpoOrderConfiguration orderConfiguration;
        private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType;
        private final BigDecimal quantity;
        private final DirectIpoOrderContext.StaticInputs staticInputs;

        public static /* synthetic */ InitialLoad copy$default(InitialLoad initialLoad, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, Money money, BigDecimal bigDecimal, DirectIpoOrderContext.StaticInputs staticInputs, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDirectIpoOrderConfiguration = initialLoad.orderConfiguration;
            }
            if ((i & 2) != 0) {
                ipoAccessPriceType = initialLoad.priceType;
            }
            if ((i & 4) != 0) {
                money = initialLoad.customPrice;
            }
            if ((i & 8) != 0) {
                bigDecimal = initialLoad.quantity;
            }
            if ((i & 16) != 0) {
                staticInputs = initialLoad.staticInputs;
            }
            DirectIpoOrderContext.StaticInputs staticInputs2 = staticInputs;
            Money money2 = money;
            return initialLoad.copy(apiDirectIpoOrderConfiguration, ipoAccessPriceType, money2, bigDecimal, staticInputs2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
            return this.orderConfiguration;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getPriceType() {
            return this.priceType;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getCustomPrice() {
            return this.customPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final DirectIpoOrderContext.StaticInputs getStaticInputs() {
            return this.staticInputs;
        }

        public final InitialLoad copy(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal quantity, DirectIpoOrderContext.StaticInputs staticInputs) {
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(priceType, "priceType");
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
            return new InitialLoad(orderConfiguration, priceType, customPrice, quantity, staticInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialLoad)) {
                return false;
            }
            InitialLoad initialLoad = (InitialLoad) other;
            return Intrinsics.areEqual(this.orderConfiguration, initialLoad.orderConfiguration) && this.priceType == initialLoad.priceType && Intrinsics.areEqual(this.customPrice, initialLoad.customPrice) && Intrinsics.areEqual(this.quantity, initialLoad.quantity) && Intrinsics.areEqual(this.staticInputs, initialLoad.staticInputs);
        }

        public int hashCode() {
            return (((((((this.orderConfiguration.hashCode() * 31) + this.priceType.hashCode()) * 31) + this.customPrice.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.staticInputs.hashCode();
        }

        public String toString() {
            return "InitialLoad(orderConfiguration=" + this.orderConfiguration + ", priceType=" + this.priceType + ", customPrice=" + this.customPrice + ", quantity=" + this.quantity + ", staticInputs=" + this.staticInputs + ")";
        }

        public InitialLoad(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal quantity, DirectIpoOrderContext.StaticInputs staticInputs) {
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(priceType, "priceType");
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
            this.orderConfiguration = orderConfiguration;
            this.priceType = priceType;
            this.customPrice = customPrice;
            this.quantity = quantity;
            this.staticInputs = staticInputs;
        }

        public final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
            return this.orderConfiguration;
        }

        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getPriceType() {
            return this.priceType;
        }

        public final Money getCustomPrice() {
            return this.customPrice;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final DirectIpoOrderContext.StaticInputs getStaticInputs() {
            return this.staticInputs;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$FocusState;", "", "<init>", "(Ljava/lang/String;I)V", "SHARES_INPUT", "PRICE_INPUT", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FocusState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FocusState[] $VALUES;
        public static final FocusState SHARES_INPUT = new FocusState("SHARES_INPUT", 0);
        public static final FocusState PRICE_INPUT = new FocusState("PRICE_INPUT", 1);

        private static final /* synthetic */ FocusState[] $values() {
            return new FocusState[]{SHARES_INPUT, PRICE_INPUT};
        }

        public static EnumEntries<FocusState> getEntries() {
            return $ENTRIES;
        }

        private FocusState(String str, int i) {
        }

        static {
            FocusState[] focusStateArr$values = $values();
            $VALUES = focusStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(focusStateArr$values);
        }

        public static FocusState valueOf(String str) {
            return (FocusState) Enum.valueOf(FocusState.class, str);
        }

        public static FocusState[] values() {
            return (FocusState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectIpoOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$ReviewState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "REVIEWING", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReviewState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReviewState[] $VALUES;
        public static final ReviewState INITIAL = new ReviewState("INITIAL", 0);
        public static final ReviewState REVIEWING = new ReviewState("REVIEWING", 1);

        private static final /* synthetic */ ReviewState[] $values() {
            return new ReviewState[]{INITIAL, REVIEWING};
        }

        public static EnumEntries<ReviewState> getEntries() {
            return $ENTRIES;
        }

        private ReviewState(String str, int i) {
        }

        static {
            ReviewState[] reviewStateArr$values = $values();
            $VALUES = reviewStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reviewStateArr$values);
        }

        public static ReviewState valueOf(String str) {
            return (ReviewState) Enum.valueOf(ReviewState.class, str);
        }

        public static ReviewState[] values() {
            return (ReviewState[]) $VALUES.clone();
        }
    }
}
