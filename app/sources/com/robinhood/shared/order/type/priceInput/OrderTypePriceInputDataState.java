package com.robinhood.shared.order.type.priceInput;

import android.view.KeyEvent;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.InstrumentDefinition;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.formats.crypto.CurrencyInputHelperExtensions;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.order.type.priceInput.sheets.BidAskPriceCryptoContentStateValues;
import com.robinhood.shared.order.type.util.TextFieldValueUtil;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md_server_proxy.service.p483v1.PerpetualQuoteDto;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;

/* compiled from: OrderTypePriceInputDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001eBc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010B\u001a\u00020\u00002\n\u0010C\u001a\u00060Dj\u0002`EJ\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003Jk\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0013\u0010a\u001a\u00020\u00072\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010c\u001a\u00020\u0011HÖ\u0001J\t\u0010d\u001a\u00020NHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0019R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010F\u001a\u00020)8@X\u0081\u0004¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bI\u0010+R\u001a\u0010J\u001a\u00020)8@X\u0081\u0004¢\u0006\f\u0012\u0004\bK\u0010H\u001a\u0004\bL\u0010+R\u001c\u0010M\u001a\u0004\u0018\u00010N8@X\u0081\u0004¢\u0006\f\u0012\u0004\bO\u0010H\u001a\u0004\bP\u0010QR\u001c\u0010R\u001a\u0004\u0018\u00010S8@X\u0081\u0004¢\u0006\f\u0012\u0004\bT\u0010H\u001a\u0004\bU\u0010V¨\u0006f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "initialEditableOrderPrice", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "isEditingPrice", "", "instrument", "Lcom/robinhood/models/crypto/InstrumentDefinition;", "currencyInputHelper", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "quoteDetailDataDto", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "currentPriceInput", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState$PriceInput;", "shakeAnimationKey", "", "isLoading", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;ZLcom/robinhood/models/crypto/InstrumentDefinition;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;Lmd_server_proxy/service/v1/QuoteDetailDataDto;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState$PriceInput;IZ)V", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getInitialEditableOrderPrice", "()Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "()Z", "getInstrument", "()Lcom/robinhood/models/crypto/InstrumentDefinition;", "getCurrencyInputHelper", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "getQuoteDetailDataDto", "()Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "getCurrentPriceInput", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState$PriceInput;", "getShakeAnimationKey", "()I", "navIcon", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;", "getNavIcon", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "description", "getDescription", "priceInputRowState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "getPriceInputRowState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "priceForOrderRowState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "getPriceForOrderRowState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "continueArgs", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "getContinueArgs", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "bidAskPriceInfoSheetState", "Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "getBidAskPriceInfoSheetState", "()Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "numpadState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "getNumpadState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "mutateWith", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "priceInputLabel", "getPriceInputLabel$lib_order_type_externalDebug$annotations", "()V", "getPriceInputLabel$lib_order_type_externalDebug", "priceForOrderLabel", "getPriceForOrderLabel$lib_order_type_externalDebug$annotations", "getPriceForOrderLabel$lib_order_type_externalDebug", "priceForOrderDisplayAmount", "", "getPriceForOrderDisplayAmount$lib_order_type_externalDebug$annotations", "getPriceForOrderDisplayAmount$lib_order_type_externalDebug", "()Ljava/lang/String;", "priceForOrder", "Ljava/math/BigDecimal;", "getPriceForOrder$lib_order_type_externalDebug$annotations", "getPriceForOrder$lib_order_type_externalDebug", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "PriceInput", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTypePriceInputDataState {
    public static final int $stable = 8;
    private final CurrencyInputHelper currencyInputHelper;
    private final PriceInput currentPriceInput;
    private final EditableOrderPrice initialEditableOrderPrice;
    private final InstrumentDefinition instrument;
    private final boolean isEditingPrice;
    private final boolean isLoading;
    private final OrderSide orderSide;
    private final QuoteDetailDataDto quoteDetailDataDto;
    private final int shakeAnimationKey;

    /* compiled from: OrderTypePriceInputDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OrderTypePriceInputDataState copy$default(OrderTypePriceInputDataState orderTypePriceInputDataState, OrderSide orderSide, EditableOrderPrice editableOrderPrice, boolean z, InstrumentDefinition instrumentDefinition, CurrencyInputHelper currencyInputHelper, QuoteDetailDataDto quoteDetailDataDto, PriceInput priceInput, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            orderSide = orderTypePriceInputDataState.orderSide;
        }
        if ((i2 & 2) != 0) {
            editableOrderPrice = orderTypePriceInputDataState.initialEditableOrderPrice;
        }
        if ((i2 & 4) != 0) {
            z = orderTypePriceInputDataState.isEditingPrice;
        }
        if ((i2 & 8) != 0) {
            instrumentDefinition = orderTypePriceInputDataState.instrument;
        }
        if ((i2 & 16) != 0) {
            currencyInputHelper = orderTypePriceInputDataState.currencyInputHelper;
        }
        if ((i2 & 32) != 0) {
            quoteDetailDataDto = orderTypePriceInputDataState.quoteDetailDataDto;
        }
        if ((i2 & 64) != 0) {
            priceInput = orderTypePriceInputDataState.currentPriceInput;
        }
        if ((i2 & 128) != 0) {
            i = orderTypePriceInputDataState.shakeAnimationKey;
        }
        if ((i2 & 256) != 0) {
            z2 = orderTypePriceInputDataState.isLoading;
        }
        int i3 = i;
        boolean z3 = z2;
        QuoteDetailDataDto quoteDetailDataDto2 = quoteDetailDataDto;
        PriceInput priceInput2 = priceInput;
        CurrencyInputHelper currencyInputHelper2 = currencyInputHelper;
        boolean z4 = z;
        return orderTypePriceInputDataState.copy(orderSide, editableOrderPrice, z4, instrumentDefinition, currencyInputHelper2, quoteDetailDataDto2, priceInput2, i3, z3);
    }

    public static /* synthetic */ void getPriceForOrder$lib_order_type_externalDebug$annotations() {
    }

    /* renamed from: getPriceForOrderDisplayAmount$lib_order_type_externalDebug$annotations */
    public static /* synthetic */ void m2832x30929a10() {
    }

    public static /* synthetic */ void getPriceForOrderLabel$lib_order_type_externalDebug$annotations() {
    }

    public static /* synthetic */ void getPriceInputLabel$lib_order_type_externalDebug$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component2, reason: from getter */
    public final EditableOrderPrice getInitialEditableOrderPrice() {
        return this.initialEditableOrderPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEditingPrice() {
        return this.isEditingPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final InstrumentDefinition getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrencyInputHelper getCurrencyInputHelper() {
        return this.currencyInputHelper;
    }

    /* renamed from: component6, reason: from getter */
    public final QuoteDetailDataDto getQuoteDetailDataDto() {
        return this.quoteDetailDataDto;
    }

    /* renamed from: component7, reason: from getter */
    public final PriceInput getCurrentPriceInput() {
        return this.currentPriceInput;
    }

    /* renamed from: component8, reason: from getter */
    public final int getShakeAnimationKey() {
        return this.shakeAnimationKey;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final OrderTypePriceInputDataState copy(OrderSide orderSide, EditableOrderPrice initialEditableOrderPrice, boolean isEditingPrice, InstrumentDefinition instrument, CurrencyInputHelper currencyInputHelper, QuoteDetailDataDto quoteDetailDataDto, PriceInput currentPriceInput, int shakeAnimationKey, boolean isLoading) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(initialEditableOrderPrice, "initialEditableOrderPrice");
        return new OrderTypePriceInputDataState(orderSide, initialEditableOrderPrice, isEditingPrice, instrument, currencyInputHelper, quoteDetailDataDto, currentPriceInput, shakeAnimationKey, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypePriceInputDataState)) {
            return false;
        }
        OrderTypePriceInputDataState orderTypePriceInputDataState = (OrderTypePriceInputDataState) other;
        return this.orderSide == orderTypePriceInputDataState.orderSide && Intrinsics.areEqual(this.initialEditableOrderPrice, orderTypePriceInputDataState.initialEditableOrderPrice) && this.isEditingPrice == orderTypePriceInputDataState.isEditingPrice && Intrinsics.areEqual(this.instrument, orderTypePriceInputDataState.instrument) && Intrinsics.areEqual(this.currencyInputHelper, orderTypePriceInputDataState.currencyInputHelper) && Intrinsics.areEqual(this.quoteDetailDataDto, orderTypePriceInputDataState.quoteDetailDataDto) && Intrinsics.areEqual(this.currentPriceInput, orderTypePriceInputDataState.currentPriceInput) && this.shakeAnimationKey == orderTypePriceInputDataState.shakeAnimationKey && this.isLoading == orderTypePriceInputDataState.isLoading;
    }

    public int hashCode() {
        int iHashCode = ((((this.orderSide.hashCode() * 31) + this.initialEditableOrderPrice.hashCode()) * 31) + Boolean.hashCode(this.isEditingPrice)) * 31;
        InstrumentDefinition instrumentDefinition = this.instrument;
        int iHashCode2 = (iHashCode + (instrumentDefinition == null ? 0 : instrumentDefinition.hashCode())) * 31;
        CurrencyInputHelper currencyInputHelper = this.currencyInputHelper;
        int iHashCode3 = (iHashCode2 + (currencyInputHelper == null ? 0 : currencyInputHelper.hashCode())) * 31;
        QuoteDetailDataDto quoteDetailDataDto = this.quoteDetailDataDto;
        int iHashCode4 = (iHashCode3 + (quoteDetailDataDto == null ? 0 : quoteDetailDataDto.hashCode())) * 31;
        PriceInput priceInput = this.currentPriceInput;
        return ((((iHashCode4 + (priceInput != null ? priceInput.hashCode() : 0)) * 31) + Integer.hashCode(this.shakeAnimationKey)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "OrderTypePriceInputDataState(orderSide=" + this.orderSide + ", initialEditableOrderPrice=" + this.initialEditableOrderPrice + ", isEditingPrice=" + this.isEditingPrice + ", instrument=" + this.instrument + ", currencyInputHelper=" + this.currencyInputHelper + ", quoteDetailDataDto=" + this.quoteDetailDataDto + ", currentPriceInput=" + this.currentPriceInput + ", shakeAnimationKey=" + this.shakeAnimationKey + ", isLoading=" + this.isLoading + ")";
    }

    public OrderTypePriceInputDataState(OrderSide orderSide, EditableOrderPrice initialEditableOrderPrice, boolean z, InstrumentDefinition instrumentDefinition, CurrencyInputHelper currencyInputHelper, QuoteDetailDataDto quoteDetailDataDto, PriceInput priceInput, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(initialEditableOrderPrice, "initialEditableOrderPrice");
        this.orderSide = orderSide;
        this.initialEditableOrderPrice = initialEditableOrderPrice;
        this.isEditingPrice = z;
        this.instrument = instrumentDefinition;
        this.currencyInputHelper = currencyInputHelper;
        this.quoteDetailDataDto = quoteDetailDataDto;
        this.currentPriceInput = priceInput;
        this.shakeAnimationKey = i;
        this.isLoading = z2;
    }

    public /* synthetic */ OrderTypePriceInputDataState(OrderSide orderSide, EditableOrderPrice editableOrderPrice, boolean z, InstrumentDefinition instrumentDefinition, CurrencyInputHelper currencyInputHelper, QuoteDetailDataDto quoteDetailDataDto, PriceInput priceInput, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderSide, editableOrderPrice, z, (i2 & 8) != 0 ? null : instrumentDefinition, (i2 & 16) != 0 ? null : currencyInputHelper, (i2 & 32) != 0 ? null : quoteDetailDataDto, (i2 & 64) != 0 ? null : priceInput, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z2);
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final EditableOrderPrice getInitialEditableOrderPrice() {
        return this.initialEditableOrderPrice;
    }

    public final boolean isEditingPrice() {
        return this.isEditingPrice;
    }

    public final InstrumentDefinition getInstrument() {
        return this.instrument;
    }

    public final CurrencyInputHelper getCurrencyInputHelper() {
        return this.currencyInputHelper;
    }

    public final QuoteDetailDataDto getQuoteDetailDataDto() {
        return this.quoteDetailDataDto;
    }

    public final PriceInput getCurrentPriceInput() {
        return this.currentPriceInput;
    }

    public final int getShakeAnimationKey() {
        return this.shakeAnimationKey;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final OrderTypePriceInputViewState.NavIcon getNavIcon() {
        if (this.isEditingPrice) {
            return OrderTypePriceInputViewState.NavIcon.CLOSE;
        }
        return OrderTypePriceInputViewState.NavIcon.BACK;
    }

    public final StringResource getTitle() {
        if (this.initialEditableOrderPrice instanceof EditableOrderPrice.Limit) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_limit_title, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getDescription() {
        if (!(this.initialEditableOrderPrice instanceof EditableOrderPrice.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_limit_buy_description, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_limit_sell_description, new Object[0]);
    }

    public final OrderTypePriceInputViewState.PriceInputRowState getPriceInputRowState() {
        PriceInput priceInput = this.currentPriceInput;
        String displayAmount = priceInput != null ? priceInput.getDisplayAmount() : null;
        StringResource priceInputLabel$lib_order_type_externalDebug = getPriceInputLabel$lib_order_type_externalDebug();
        TextFieldValue textFieldValue = TextFieldValueUtil.toTextFieldValue(displayAmount, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER);
        PriceInput priceInput2 = this.currentPriceInput;
        return new OrderTypePriceInputViewState.PriceInputRowState(priceInputLabel$lib_order_type_externalDebug, textFieldValue, !((priceInput2 == null || priceInput2.isPlaceHolderPrice()) ? false : true), this.shakeAnimationKey, displayAmount == null);
    }

    public final OrderTypePriceInputViewState.PriceForOrderRowState getPriceForOrderRowState() {
        String priceForOrderDisplayAmount$lib_order_type_externalDebug = getPriceForOrderDisplayAmount$lib_order_type_externalDebug();
        if (priceForOrderDisplayAmount$lib_order_type_externalDebug != null) {
            return new OrderTypePriceInputViewState.PriceForOrderRowState(getPriceForOrderLabel$lib_order_type_externalDebug(), priceForOrderDisplayAmount$lib_order_type_externalDebug, false);
        }
        return OrderTypePriceInputViewState.PriceForOrderRowState.INSTANCE.getLOADING_PRICE_FOR_ORDER_ROW();
    }

    public final OrderTypePriceInputViewState.ContinueArgs getContinueArgs() {
        QuoteDetailDataDto quoteDetailDataDto;
        PerpetualQuoteDto perpetual_quote;
        Tuples2 tuples2M3642to;
        if (this.currentPriceInput == null || (quoteDetailDataDto = this.quoteDetailDataDto) == null || (perpetual_quote = quoteDetailDataDto.getPerpetual_quote()) == null) {
            return null;
        }
        if (!(this.initialEditableOrderPrice instanceof EditableOrderPrice.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        EditableOrderPrice.Limit limit = new EditableOrderPrice.Limit(this.currentPriceInput.getAmount(), ((EditableOrderPrice.Limit) this.initialEditableOrderPrice).getTimeInForce());
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            tuples2M3642to = Tuples4.m3642to(perpetual_quote.getBid_price().toBigDecimalOrThrow(), StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_bid_label, new Object[0]));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tuples2M3642to = Tuples4.m3642to(perpetual_quote.getAsk_price().toBigDecimalOrThrow(), StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_ask_label, new Object[0]));
        }
        return new OrderTypePriceInputViewState.ContinueArgs(limit, (BigDecimal) tuples2M3642to.component1(), (StringResource) tuples2M3642to.component2(), perpetual_quote.getAsk_price().toBigDecimalOrThrow(), perpetual_quote.getBid_price().toBigDecimalOrThrow(), perpetual_quote.getMid_price().toBigDecimalOrThrow());
    }

    public final CryptoContentState getBidAskPriceInfoSheetState() {
        InstrumentDefinition instrumentDefinition = this.instrument;
        if (instrumentDefinition != null) {
            return BidAskPriceCryptoContentStateValues.getBidAskPriceCryptoContentState(instrumentDefinition.getSymbol(), this.orderSide);
        }
        return null;
    }

    public final OrderTypePriceInputViewState.NumpadState getNumpadState() {
        PriceInput priceInput;
        return new OrderTypePriceInputViewState.NumpadState((getPriceForOrder$lib_order_type_externalDebug() == null || (priceInput = this.currentPriceInput) == null || priceInput.isPlaceHolderPrice() || BigDecimals7.isZero(this.currentPriceInput.getAmount())) ? false : true, this.isLoading, this.currencyInputHelper != null);
    }

    public final OrderTypePriceInputDataState mutateWith(InstrumentDefinition instrument) {
        PriceInput priceInput;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        CurrencyInputHelper currencyInputHelperCurrencyInputHelper$default = CurrencyInputHelperExtensions.currencyInputHelper$default(instrument.getQuoteCurrencyForPriceInput(), null, 2, null);
        PriceInput priceInput2 = this.currentPriceInput;
        if (priceInput2 != null) {
            priceInput = priceInput2;
        } else {
            EditableOrderPrice editableOrderPrice = this.initialEditableOrderPrice;
            if (!(editableOrderPrice instanceof EditableOrderPrice.Limit)) {
                throw new NoWhenBranchMatchedException();
            }
            Tuples2 tuples2ProcessAmount$default = CurrencyInputHelper.processAmount$default(currencyInputHelperCurrencyInputHelper$default, ((EditableOrderPrice.Limit) editableOrderPrice).getPrice(), null, false, false, false, true, 30, null);
            priceInput = new PriceInput((String) tuples2ProcessAmount$default.component1(), (BigDecimal) tuples2ProcessAmount$default.component2(), !this.isEditingPrice);
        }
        return copy$default(this, null, null, false, instrument, currencyInputHelperCurrencyInputHelper$default, null, priceInput, 0, false, 423, null);
    }

    public final OrderTypePriceInputDataState mutateWith(KeyEvent keyEvent) {
        PriceInput priceInput;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (this.currencyInputHelper == null || (priceInput = this.currentPriceInput) == null) {
            return this;
        }
        String displayAmount = priceInput.isPlaceHolderPrice() ? "" : this.currentPriceInput.getDisplayAmount();
        Tuples2 tuples2ProcessKeyEvent$default = CurrencyInputHelper.processKeyEvent$default(this.currencyInputHelper, keyEvent, displayAmount, false, false, false, false, 60, null);
        String str = (String) tuples2ProcessKeyEvent$default.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
        if (Intrinsics.areEqual(str, displayAmount)) {
            return copy$default(this, null, null, false, null, null, null, null, this.shakeAnimationKey + 1, false, 383, null);
        }
        return copy$default(this, null, null, false, null, null, null, new PriceInput(str, bigDecimal, false), 0, false, 447, null);
    }

    public final StringResource getPriceInputLabel$lib_order_type_externalDebug() {
        if (this.initialEditableOrderPrice instanceof EditableOrderPrice.Limit) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_limit_label, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getPriceForOrderLabel$lib_order_type_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_buy_secondary_label, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_input_sell_secondary_label, new Object[0]);
    }

    public final String getPriceForOrderDisplayAmount$lib_order_type_externalDebug() {
        InstrumentDefinition instrumentDefinition = this.instrument;
        CurrencyDefinition quoteCurrencyForPriceDisplay = instrumentDefinition != null ? instrumentDefinition.getQuoteCurrencyForPriceDisplay() : null;
        BigDecimal priceForOrder$lib_order_type_externalDebug = getPriceForOrder$lib_order_type_externalDebug();
        if (priceForOrder$lib_order_type_externalDebug == null || quoteCurrencyForPriceDisplay == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceDisplay, priceForOrder$lib_order_type_externalDebug, false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForPriceDisplay), null, null, false, false, false, false, 2026, null);
    }

    public final BigDecimal getPriceForOrder$lib_order_type_externalDebug() {
        PerpetualQuoteDto perpetual_quote;
        QuoteDetailDataDto quoteDetailDataDto = this.quoteDetailDataDto;
        if (quoteDetailDataDto == null || (perpetual_quote = quoteDetailDataDto.getPerpetual_quote()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            return perpetual_quote.getAsk_price().toBigDecimalOrThrow();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return perpetual_quote.getBid_price().toBigDecimalOrThrow();
    }

    /* compiled from: OrderTypePriceInputDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState$PriceInput;", "", "displayAmount", "", "amount", "Ljava/math/BigDecimal;", "isPlaceHolderPrice", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getDisplayAmount", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceInput {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final String displayAmount;
        private final boolean isPlaceHolderPrice;

        public static /* synthetic */ PriceInput copy$default(PriceInput priceInput, String str, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = priceInput.displayAmount;
            }
            if ((i & 2) != 0) {
                bigDecimal = priceInput.amount;
            }
            if ((i & 4) != 0) {
                z = priceInput.isPlaceHolderPrice;
            }
            return priceInput.copy(str, bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayAmount() {
            return this.displayAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPlaceHolderPrice() {
            return this.isPlaceHolderPrice;
        }

        public final PriceInput copy(String displayAmount, BigDecimal amount, boolean isPlaceHolderPrice) {
            Intrinsics.checkNotNullParameter(displayAmount, "displayAmount");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new PriceInput(displayAmount, amount, isPlaceHolderPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInput)) {
                return false;
            }
            PriceInput priceInput = (PriceInput) other;
            return Intrinsics.areEqual(this.displayAmount, priceInput.displayAmount) && Intrinsics.areEqual(this.amount, priceInput.amount) && this.isPlaceHolderPrice == priceInput.isPlaceHolderPrice;
        }

        public int hashCode() {
            return (((this.displayAmount.hashCode() * 31) + this.amount.hashCode()) * 31) + Boolean.hashCode(this.isPlaceHolderPrice);
        }

        public String toString() {
            return "PriceInput(displayAmount=" + this.displayAmount + ", amount=" + this.amount + ", isPlaceHolderPrice=" + this.isPlaceHolderPrice + ")";
        }

        public PriceInput(String displayAmount, BigDecimal amount, boolean z) {
            Intrinsics.checkNotNullParameter(displayAmount, "displayAmount");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.displayAmount = displayAmount;
            this.amount = amount;
            this.isPlaceHolderPrice = z;
        }

        public final String getDisplayAmount() {
            return this.displayAmount;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final boolean isPlaceHolderPrice() {
            return this.isPlaceHolderPrice;
        }
    }
}
