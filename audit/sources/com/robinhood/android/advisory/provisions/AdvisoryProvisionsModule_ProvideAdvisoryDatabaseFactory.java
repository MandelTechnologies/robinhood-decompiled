package com.robinhood.android.advisory.provisions;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BD\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "module", "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory implements Factory<AdvisoryDatabase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<Set<InjectedTypeConverter>> converters;
    private final Provider<DatabaseBuilderFactory> factory;
    private final AdvisoryProvisionsModule module;

    @JvmStatic
    public static final AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory create(AdvisoryProvisionsModule advisoryProvisionsModule, Provider<Application> provider, Provider<DatabaseBuilderFactory> provider2, Provider<Set<InjectedTypeConverter>> provider3) {
        return INSTANCE.create(advisoryProvisionsModule, provider, provider2, provider3);
    }

    @JvmStatic
    public static final AdvisoryDatabase provideAdvisoryDatabase(AdvisoryProvisionsModule advisoryProvisionsModule, Application application, DatabaseBuilderFactory databaseBuilderFactory, Set<InjectedTypeConverter> set) {
        return INSTANCE.provideAdvisoryDatabase(advisoryProvisionsModule, application, databaseBuilderFactory, set);
    }

    public AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory(AdvisoryProvisionsModule module, Provider<Application> app, Provider<DatabaseBuilderFactory> factory, Provider<Set<InjectedTypeConverter>> converters) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        this.module = module;
        this.app = app;
        this.factory = factory;
        this.converters = converters;
    }

    @Override // javax.inject.Provider
    public AdvisoryDatabase get() {
        Companion companion = INSTANCE;
        AdvisoryProvisionsModule advisoryProvisionsModule = this.module;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        DatabaseBuilderFactory databaseBuilderFactory = this.factory.get();
        Intrinsics.checkNotNullExpressionValue(databaseBuilderFactory, "get(...)");
        Set<InjectedTypeConverter> set = this.converters.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.provideAdvisoryDatabase(advisoryProvisionsModule, application, databaseBuilderFactory, set);
    }

    /* compiled from: AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\tH\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory;", "module", "Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideAdvisoryDatabase", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory create(AdvisoryProvisionsModule module, Provider<Application> app, Provider<DatabaseBuilderFactory> factory, Provider<Set<InjectedTypeConverter>> converters) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(converters, "converters");
            return new AdvisoryProvisionsModule_ProvideAdvisoryDatabaseFactory(module, app, factory, converters);
        }

        @JvmStatic
        public final AdvisoryDatabase provideAdvisoryDatabase(AdvisoryProvisionsModule module, Application app, DatabaseBuilderFactory factory, Set<InjectedTypeConverter> converters) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(converters, "converters");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideAdvisoryDatabase(app, factory, converters), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AdvisoryDatabase) objCheckNotNull;
        }
    }
}
