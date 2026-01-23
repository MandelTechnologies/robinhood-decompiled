package com.robinhood.shared.crypto.utils;

import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import rosetta.nummus.CurrencyDto;
import rosetta.nummus.CurrencyPairDto;

/* compiled from: UiCurrencyPairs.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"allowDecimalInput", "", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "toDto", "Lrosetta/nummus/CurrencyPairDto;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.UiCurrencyPairsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UiCurrencyPairs2 {

    /* compiled from: UiCurrencyPairs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.UiCurrencyPairsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final boolean allowDecimalInput(UiCurrencyPair uiCurrencyPair, CryptoInputMode inputMode) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        int i = WhenMappings.$EnumSwitchMapping$0[inputMode.ordinal()];
        if (i == 1) {
            return BigDecimals7.m2979lt(uiCurrencyPair.getMinOrderPriceIncrement(), BigDecimal.ONE);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BigDecimals7.m2979lt(uiCurrencyPair.getMinOrderQuantityIncrement(), BigDecimal.ONE);
    }

    public static final CurrencyPairDto toDto(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        ByteString.Companion companion = ByteString.INSTANCE;
        String string2 = uiCurrencyPair.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new CurrencyPairDto(ByteString.Companion.of$default(companion, StringsKt.encodeToByteArray(string2), 0, 0, 3, null), new CurrencyDto(null, uiCurrencyPair.getAssetCurrency().getCode(), uiCurrencyPair.getAssetCurrency().getName(), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getAssetCurrency().getIncrement()).getStringValue(), 1, null), new CurrencyDto(null, uiCurrencyPair.getQuoteCurrency().getCode(), uiCurrencyPair.getQuoteCurrency().getName(), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getQuoteCurrency().getIncrement()).getStringValue(), 1, null), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getMinOrderPriceIncrement()).getStringValue(), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getMaxOrderSize()).getStringValue(), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getMinOrderSize()).getStringValue(), IdlDecimal2.toIdlDecimal(uiCurrencyPair.getMinOrderQuantityIncrement()).getStringValue(), IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(uiCurrencyPair.getMinOrderQuoteAmount())).getStringValue(), IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(uiCurrencyPair.getMinFeeOrderQuoteAmount())).getStringValue(), null, null, 1536, null);
    }
}
