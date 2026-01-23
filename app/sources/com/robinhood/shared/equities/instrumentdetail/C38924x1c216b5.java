package com.robinhood.shared.equities.instrumentdetail;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.database.FeatureRoomDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/database/FeatureRoomDatabase;", "instrumentDetailDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory */
/* loaded from: classes21.dex */
public final class C38924x1c216b5 implements Factory<FeatureRoomDatabase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentDetailDatabase> instrumentDetailDatabase;

    @JvmStatic
    public static final C38924x1c216b5 create(Provider<InstrumentDetailDatabase> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final FeatureRoomDatabase provideInstrumentDetailFeatureDatabase(InstrumentDetailDatabase instrumentDetailDatabase) {
        return INSTANCE.provideInstrumentDetailFeatureDatabase(instrumentDetailDatabase);
    }

    public C38924x1c216b5(Provider<InstrumentDetailDatabase> instrumentDetailDatabase) {
        Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
        this.instrumentDetailDatabase = instrumentDetailDatabase;
    }

    @Override // javax.inject.Provider
    public FeatureRoomDatabase get() {
        Companion companion = INSTANCE;
        InstrumentDetailDatabase instrumentDetailDatabase = this.instrumentDetailDatabase.get();
        Intrinsics.checkNotNullExpressionValue(instrumentDetailDatabase, "get(...)");
        return companion.provideInstrumentDetailFeatureDatabase(instrumentDetailDatabase);
    }

    /* compiled from: InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory;", "instrumentDetailDatabase", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase;", "provideInstrumentDetailFeatureDatabase", "Lcom/robinhood/database/FeatureRoomDatabase;", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailDbModule_ProvideInstrumentDetailFeatureDatabaseFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C38924x1c216b5 create(Provider<InstrumentDetailDatabase> instrumentDetailDatabase) {
            Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
            return new C38924x1c216b5(instrumentDetailDatabase);
        }

        @JvmStatic
        public final FeatureRoomDatabase provideInstrumentDetailFeatureDatabase(InstrumentDetailDatabase instrumentDetailDatabase) {
            Intrinsics.checkNotNullParameter(instrumentDetailDatabase, "instrumentDetailDatabase");
            Object objCheckNotNull = Preconditions.checkNotNull(InstrumentDetailDbModule.INSTANCE.provideInstrumentDetailFeatureDatabase(instrumentDetailDatabase), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (FeatureRoomDatabase) objCheckNotNull;
        }
    }
}
