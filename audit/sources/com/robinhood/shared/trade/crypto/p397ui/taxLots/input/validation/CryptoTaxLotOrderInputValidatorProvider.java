package com.robinhood.shared.trade.crypto.p397ui.taxLots.input.validation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator;
import com.robinhood.shared.trade.crypto.validation.check.CryptoLimitOrderAggressivePriceCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoLimitOrderTickSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotStrategyResponseDto;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputValidatorProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/validation/CryptoTaxLotOrderInputValidatorProvider;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "getValidator", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidator;", "selectedStrategyDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "hasZeroAvailableQuantity", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputValidatorProvider {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public CryptoTaxLotOrderInputValidatorProvider(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CryptoOrderValidator getValidator(StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto, boolean hasZeroAvailableQuantity) {
        CryptoMinOrderSizeCheck cryptoMinOrderSizeCheck;
        boolean z = false;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CryptoMaxOrderSizeCheck cryptoMaxOrderSizeCheck = new CryptoMaxOrderSizeCheck(this.eventLogger, z, i, defaultConstructorMarker);
        if (!hasZeroAvailableQuantity) {
            if ((selectedStrategyDto != null ? selectedStrategyDto.getStrategy_type() : null) == TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM) {
                cryptoMinOrderSizeCheck = null;
            }
        } else {
            cryptoMinOrderSizeCheck = new CryptoMinOrderSizeCheck(this.eventLogger, AppType.TRADER, false, 4, null);
        }
        return new CryptoOrderValidator(CollectionsKt.listOfNotNull((Object[]) new Validator.Check[]{cryptoMaxOrderSizeCheck, cryptoMinOrderSizeCheck, new SufficientCryptoHoldingsToSellCheck(this.eventLogger, z, i, defaultConstructorMarker), new CryptoLimitOrderTickSizeCheck(this.eventLogger), new CryptoLimitOrderAggressivePriceCheck(this.eventLogger)})) { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.validation.CryptoTaxLotOrderInputValidatorProvider.getValidator.1
        };
    }
}
