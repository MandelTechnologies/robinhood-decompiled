package com.robinhood.shared.trade.crypto.p397ui.taxLots.info;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_CryptoTaxLotMicrogramInfoActivity_Companion_NavigationResolverModule_Provide_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/Hammer_CryptoTaxLotMicrogramInfoActivity_Companion_NavigationResolverModule_Provide_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKeyFactory;", "Ldagger/internal/Factory;", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKey", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.info.Hammer_CryptoTaxLotMicrogramInfoActivity_Companion_NavigationResolverModule_Provide_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKeyFactory */
/* loaded from: classes12.dex */
public final class C40667xf4de611e implements Factory<Function0<NavigationResolver>> {
    public static final int $stable = 0;
    public static final C40667xf4de611e INSTANCE = new C40667xf4de611e();

    private C40667xf4de611e() {
    }

    @Override // javax.inject.Provider
    public Function0<NavigationResolver> get() {
        return m2901x554256d();
    }

    @JvmStatic
    public static final C40667xf4de611e create() {
        return INSTANCE;
    }

    @JvmStatic
    /* renamed from: provide_CryptoTaxLotMicrogramInfoActivity_CryptoTaxLotMicrogramInfoIntentKey */
    public static final Function0<NavigationResolver> m2901x554256d() {
        Object objCheckNotNull = Preconditions.checkNotNull(C40666x14d84520.INSTANCE.m2900x554256d(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Function0) objCheckNotNull;
    }
}
