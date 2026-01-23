package com.robinhood.android.tradingtrends.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.inject.MicrogramComponent;

/* compiled from: TradingTrendsServiceModule_BindServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsServiceModule_BindServiceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "parentScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TradingTrendsServiceModule_BindServiceFactory implements Factory<TradingTrendsCachedService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MicrogramComponent.Factory> componentFactory;
    private final Provider<CoroutineScope> parentScope;

    @JvmStatic
    public static final TradingTrendsCachedService bindService(CoroutineScope coroutineScope, MicrogramComponent.Factory factory) {
        return INSTANCE.bindService(coroutineScope, factory);
    }

    @JvmStatic
    public static final TradingTrendsServiceModule_BindServiceFactory create(Provider<CoroutineScope> provider, Provider<MicrogramComponent.Factory> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    public TradingTrendsServiceModule_BindServiceFactory(Provider<CoroutineScope> parentScope, Provider<MicrogramComponent.Factory> componentFactory) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        this.parentScope = parentScope;
        this.componentFactory = componentFactory;
    }

    @Override // javax.inject.Provider
    public TradingTrendsCachedService get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.parentScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        MicrogramComponent.Factory factory = this.componentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        return companion.bindService(coroutineScope, factory);
    }

    /* compiled from: TradingTrendsServiceModule_BindServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsServiceModule_BindServiceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsServiceModule_BindServiceFactory;", "parentScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "bindService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradingTrendsServiceModule_BindServiceFactory create(Provider<CoroutineScope> parentScope, Provider<MicrogramComponent.Factory> componentFactory) {
            Intrinsics.checkNotNullParameter(parentScope, "parentScope");
            Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
            return new TradingTrendsServiceModule_BindServiceFactory(parentScope, componentFactory);
        }

        @JvmStatic
        public final TradingTrendsCachedService bindService(CoroutineScope parentScope, MicrogramComponent.Factory componentFactory) {
            Intrinsics.checkNotNullParameter(parentScope, "parentScope");
            Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
            Object objCheckNotNull = Preconditions.checkNotNull(TradingTrendsCachedService3.INSTANCE.bindService(parentScope, componentFactory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (TradingTrendsCachedService) objCheckNotNull;
        }
    }
}
