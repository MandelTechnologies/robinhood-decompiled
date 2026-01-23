package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory */
/* loaded from: classes17.dex */
public final class C25700x6634e34 implements Factory<InstrumentProfitAndLossRealizedDao> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ProfitAndLossHubDatabase> db;

    @JvmStatic
    public static final C25700x6634e34 create(Provider<ProfitAndLossHubDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final InstrumentProfitAndLossRealizedDao provideInstrumentProfitAndLossRealizedDao(ProfitAndLossHubDatabase profitAndLossHubDatabase) {
        return INSTANCE.provideInstrumentProfitAndLossRealizedDao(profitAndLossHubDatabase);
    }

    public C25700x6634e34(Provider<ProfitAndLossHubDatabase> db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
    }

    @Override // javax.inject.Provider
    public InstrumentProfitAndLossRealizedDao get() {
        Companion companion = INSTANCE;
        ProfitAndLossHubDatabase profitAndLossHubDatabase = this.db.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossHubDatabase, "get(...)");
        return companion.provideInstrumentProfitAndLossRealizedDao(profitAndLossHubDatabase);
    }

    /* compiled from: ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory;", "db", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;", "provideInstrumentProfitAndLossRealizedDao", "Lcom/robinhood/android/portfolio/pnl/dao/InstrumentProfitAndLossRealizedDao;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossHubDaoModule_ProvideInstrumentProfitAndLossRealizedDaoFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C25700x6634e34 create(Provider<ProfitAndLossHubDatabase> db) {
            Intrinsics.checkNotNullParameter(db, "db");
            return new C25700x6634e34(db);
        }

        @JvmStatic
        public final InstrumentProfitAndLossRealizedDao provideInstrumentProfitAndLossRealizedDao(ProfitAndLossHubDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Object objCheckNotNull = Preconditions.checkNotNull(ProfitAndLossHubDaoModule.INSTANCE.provideInstrumentProfitAndLossRealizedDao(db), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InstrumentProfitAndLossRealizedDao) objCheckNotNull;
        }
    }
}
