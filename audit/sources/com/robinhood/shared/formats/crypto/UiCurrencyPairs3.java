package com.robinhood.shared.formats.crypto;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiCurrencyPairs.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"adjustMinOrderQuantityIncrement", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "lib-formats-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.formats.crypto.UiCurrencyPairsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UiCurrencyPairs3 {
    public static final UiCurrencyPair adjustMinOrderQuantityIncrement(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        return UiCurrencyPair.copy$default(uiCurrencyPair, null, null, false, null, false, null, null, uiCurrencyPair.getAssetCurrency().getIncrement(), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097023, null);
    }
}
