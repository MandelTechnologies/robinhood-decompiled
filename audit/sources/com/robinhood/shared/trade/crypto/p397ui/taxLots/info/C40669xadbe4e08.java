package com.robinhood.shared.trade.crypto.p397ui.taxLots.info;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKey_NavigationKeyModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/Hammer_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKey_NavigationKeyModule_ProvideFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.info.Hammer_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKey_NavigationKeyModule_ProvideFactory */
/* loaded from: classes12.dex */
public final class C40669xadbe4e08 implements Factory<String> {
    public static final int $stable = 0;
    public static final C40669xadbe4e08 INSTANCE = new C40669xadbe4e08();

    private C40669xadbe4e08() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    @JvmStatic
    public static final C40669xadbe4e08 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(C40668x24233360.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
