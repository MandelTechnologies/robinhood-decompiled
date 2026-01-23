package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.validation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionValidatorProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionValidatorProvider;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "getValidator", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidator;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionValidatorProvider {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public CryptoTaxLotSelectionValidatorProvider(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final CryptoOrderValidator getValidator() {
        return new CryptoOrderValidator(CollectionsKt.listOf((Object[]) new Validator.Check[]{new CryptoMaxOrderSizeCheck(this.eventLogger, true), new CryptoMinOrderSizeCheck(this.eventLogger, AppType.TRADER, true), new SufficientCryptoHoldingsToSellCheck(this.eventLogger, true), new CryptoTaxLotSelectionOrderPrecisionCheck(this.eventLogger)})) { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.validation.CryptoTaxLotSelectionValidatorProvider.getValidator.1
        };
    }
}
