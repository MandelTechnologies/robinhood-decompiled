package com.robinhood.android.engagement.cryptoEducationTrading.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.api.CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory */
/* loaded from: classes7.dex */
public final class C14506x852f644f implements Factory<CryptoEducationTradingEligibilityApi> {
    private final Provider<Retrofit> retrofit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C14506x852f644f create(Provider<Retrofit> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final CryptoEducationTradingEligibilityApi provideCryptoEducationEligibilitySie(Lazy<Retrofit> lazy) {
        return INSTANCE.provideCryptoEducationEligibilitySie(lazy);
    }

    public C14506x852f644f(Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public CryptoEducationTradingEligibilityApi get() {
        Companion companion = INSTANCE;
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.retrofit);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideCryptoEducationEligibilitySie(lazy);
    }

    /* compiled from: CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideCryptoEducationEligibilitySie", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;", "Ldagger/Lazy;", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.api.CryptoEducationTradingApiModule_ProvideCryptoEducationEligibilitySieFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C14506x852f644f create(Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new C14506x852f644f(retrofit);
        }

        @JvmStatic
        public final CryptoEducationTradingEligibilityApi provideCryptoEducationEligibilitySie(Lazy<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(EducationRewardsModule.INSTANCE.provideCryptoEducationEligibilitySie(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (CryptoEducationTradingEligibilityApi) objCheckNotNull;
        }
    }
}
