package com.robinhood.shared.trade.crypto.validation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.validation.check.CryptoLimitOrderAggressivePriceCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoLimitOrderTickSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoLimitPriceOrderCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMin25kOrderCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMin2kOrderCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck;
import com.robinhood.shared.trade.crypto.validation.check.CryptoSignupOrderCheck;
import com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoBuyingPowerCheck;
import com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidator;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/analytics/EventLogger;)V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.validation.DefaultCryptoOrderValidator, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderValidator5 extends CryptoOrderValidator {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderValidator5(AppType appType, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        boolean z = false;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        listCreateListBuilder.addAll(CollectionsKt.listOf((Object[]) new Validator.Check[]{new CryptoSignupOrderCheck(eventLogger), new CryptoMaxOrderSizeCheck(eventLogger, z, i, defaultConstructorMarker), new CryptoMinOrderSizeCheck(eventLogger, appType, false, 4, null), new SufficientCryptoBuyingPowerCheck(eventLogger), new SufficientCryptoHoldingsToSellCheck(eventLogger, z, i, defaultConstructorMarker)}));
        if (appType == AppType.RHC) {
            listCreateListBuilder.add(new CryptoLimitOrderTickSizeCheck(eventLogger));
            listCreateListBuilder.add(new CryptoLimitOrderAggressivePriceCheck(eventLogger));
        }
        listCreateListBuilder.add(new CryptoMin2kOrderCheck(appType, eventLogger));
        listCreateListBuilder.add(new CryptoMin25kOrderCheck(appType, eventLogger));
        listCreateListBuilder.add(new CryptoLimitPriceOrderCheck(eventLogger));
        super(CollectionsKt.build(listCreateListBuilder));
    }
}
