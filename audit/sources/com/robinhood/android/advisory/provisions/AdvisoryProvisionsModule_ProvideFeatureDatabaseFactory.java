package com.robinhood.android.advisory.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "module", "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;", "database", "Ljavax/inject/Provider;", "<init>", "(Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory implements Factory<AdvisoryDatabase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvisoryDatabase> database;
    private final AdvisoryProvisionsModule module;

    @JvmStatic
    public static final AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory create(AdvisoryProvisionsModule advisoryProvisionsModule, Provider<AdvisoryDatabase> provider) {
        return INSTANCE.create(advisoryProvisionsModule, provider);
    }

    @JvmStatic
    public static final AdvisoryDatabase provideFeatureDatabase(AdvisoryProvisionsModule advisoryProvisionsModule, AdvisoryDatabase advisoryDatabase) {
        return INSTANCE.provideFeatureDatabase(advisoryProvisionsModule, advisoryDatabase);
    }

    public AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory(AdvisoryProvisionsModule module, Provider<AdvisoryDatabase> database) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(database, "database");
        this.module = module;
        this.database = database;
    }

    @Override // javax.inject.Provider
    public AdvisoryDatabase get() {
        Companion companion = INSTANCE;
        AdvisoryProvisionsModule advisoryProvisionsModule = this.module;
        AdvisoryDatabase advisoryDatabase = this.database.get();
        Intrinsics.checkNotNullExpressionValue(advisoryDatabase, "get(...)");
        return companion.provideFeatureDatabase(advisoryProvisionsModule, advisoryDatabase);
    }

    /* compiled from: AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory;", "module", "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;", "database", "Ljavax/inject/Provider;", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "provideFeatureDatabase", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory create(AdvisoryProvisionsModule module, Provider<AdvisoryDatabase> database) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(database, "database");
            return new AdvisoryProvisionsModule_ProvideFeatureDatabaseFactory(module, database);
        }

        @JvmStatic
        public final AdvisoryDatabase provideFeatureDatabase(AdvisoryProvisionsModule module, AdvisoryDatabase database) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(database, "database");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideFeatureDatabase(database), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AdvisoryDatabase) objCheckNotNull;
        }
    }
}
