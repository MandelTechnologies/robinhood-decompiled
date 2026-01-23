package com.robinhood.shared.crypto.utils;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderInfoCalculations.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/utils/OrderInfoCalculations;", "", "<init>", "()V", "calculatePrecision", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "MAX_CALC_PRECISION", "lib-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderInfoCalculations {
    public static final OrderInfoCalculations INSTANCE = new OrderInfoCalculations();
    private static final int MAX_CALC_PRECISION = 20;

    private OrderInfoCalculations() {
    }

    public final int calculatePrecision(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        return Math.max(uiCurrencyPair.getAssetCurrency().getDecimalScale(), 20);
    }
}
