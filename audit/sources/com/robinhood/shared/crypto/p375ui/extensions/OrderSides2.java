package com.robinhood.shared.crypto.p375ui.extensions;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSides.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"cryptoPowerText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/OrderSide;", "amount", "Ljava/math/BigDecimal;", "amountString", "", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.extensions.OrderSidesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderSides2 {

    /* compiled from: OrderSides.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.extensions.OrderSidesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ StringResource cryptoPowerText$default(OrderSide orderSide, BigDecimal bigDecimal, String str, CryptoInputMode cryptoInputMode, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return cryptoPowerText(orderSide, bigDecimal, str, cryptoInputMode, uiCurrencyPair);
    }

    public static final StringResource cryptoPowerText(OrderSide orderSide, BigDecimal amount, String str, CryptoInputMode inputMode, UiCurrencyPair uiCurrencyPair) {
        int i;
        String currency$default;
        String currency$default2;
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        int i2 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i2 == 1) {
            if (BigDecimals7.isNegative(amount)) {
                return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_header_negative_buying_power, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_header_quote_buying_power, str == null ? CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrencyForCost(), amount, false, false, RoundingMode.HALF_UP, 0, null, null, false, false, false, false, 2038, null) : str);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[inputMode.ordinal()];
        if (i3 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i4 = C38572R.string.crypto_order_header_quote_selling_power;
            if (str == null) {
                i = i4;
                currency$default = CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrency(), amount, false, false, RoundingMode.HALF_UP, 0, null, null, false, false, false, false, 2038, null);
            } else {
                i = i4;
                currency$default = str;
            }
            return companion.invoke(i, currency$default, uiCurrencyPair.getAssetCurrency().getCode());
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i5 = C38572R.string.crypto_order_header_asset_selling_power;
        if (str == null) {
            BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(amount);
            Currency assetCurrencyForCost = uiCurrencyPair.getAssetCurrencyForCost();
            Intrinsics.checkNotNull(bigDecimalM822m);
            currency$default2 = CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, bigDecimalM822m, false, false, RoundingMode.DOWN, 0, null, null, false, false, false, false, 2018, null);
        } else {
            currency$default2 = str;
        }
        return companion2.invoke(i5, currency$default2);
    }
}
