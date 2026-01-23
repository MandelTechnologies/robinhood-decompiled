package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeDropdownContainer.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownTestTags;", "", "<init>", "()V", "DROPDOWN_BACKGROUND", "", "checkmark", "orderType", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownTestTags, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeDropdownContainer4 {
    public static final int $stable = 0;
    public static final String DROPDOWN_BACKGROUND = "dropdown_background";
    public static final CryptoQuickTradeDropdownContainer4 INSTANCE = new CryptoQuickTradeDropdownContainer4();

    private CryptoQuickTradeDropdownContainer4() {
    }

    public final String checkmark(CryptoOrderIntentKey.OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return "checkmark_" + orderType.name();
    }
}
