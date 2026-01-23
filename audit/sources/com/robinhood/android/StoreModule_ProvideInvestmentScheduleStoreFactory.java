package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreModule_ProvideInvestmentScheduleStoreFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/StoreModule_ProvideInvestmentScheduleStoreFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "traderInvestmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StoreModule_ProvideInvestmentScheduleStoreFactory implements Factory<InvestmentScheduleStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TraderInvestmentScheduleStore> traderInvestmentScheduleStore;

    @JvmStatic
    public static final StoreModule_ProvideInvestmentScheduleStoreFactory create(Provider<TraderInvestmentScheduleStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final InvestmentScheduleStore provideInvestmentScheduleStore(TraderInvestmentScheduleStore traderInvestmentScheduleStore) {
        return INSTANCE.provideInvestmentScheduleStore(traderInvestmentScheduleStore);
    }

    public StoreModule_ProvideInvestmentScheduleStoreFactory(Provider<TraderInvestmentScheduleStore> traderInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "traderInvestmentScheduleStore");
        this.traderInvestmentScheduleStore = traderInvestmentScheduleStore;
    }

    @Override // javax.inject.Provider
    public InvestmentScheduleStore get() {
        Companion companion = INSTANCE;
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.traderInvestmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        return companion.provideInvestmentScheduleStore(traderInvestmentScheduleStore);
    }

    /* compiled from: StoreModule_ProvideInvestmentScheduleStoreFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/StoreModule_ProvideInvestmentScheduleStoreFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/StoreModule_ProvideInvestmentScheduleStoreFactory;", "traderInvestmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "provideInvestmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StoreModule_ProvideInvestmentScheduleStoreFactory create(Provider<TraderInvestmentScheduleStore> traderInvestmentScheduleStore) {
            Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "traderInvestmentScheduleStore");
            return new StoreModule_ProvideInvestmentScheduleStoreFactory(traderInvestmentScheduleStore);
        }

        @JvmStatic
        public final InvestmentScheduleStore provideInvestmentScheduleStore(TraderInvestmentScheduleStore traderInvestmentScheduleStore) {
            Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "traderInvestmentScheduleStore");
            Object objCheckNotNull = Preconditions.checkNotNull(StoreModule.INSTANCE.provideInvestmentScheduleStore(traderInvestmentScheduleStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InvestmentScheduleStore) objCheckNotNull;
        }
    }
}
