package com.robinhood.redesign.provisions;

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

/* compiled from: RedesignDbModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB<\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/redesign/provisions/RedesignDbModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/redesign/provisions/RedesignDatabase;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RedesignDbModule_ProvideFactory implements Factory<RedesignDatabase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<Set<InjectedTypeConverter>> converters;
    private final Provider<DatabaseBuilderFactory> factory;

    @JvmStatic
    public static final RedesignDbModule_ProvideFactory create(Provider<Application> provider, Provider<DatabaseBuilderFactory> provider2, Provider<Set<InjectedTypeConverter>> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RedesignDatabase provide(Application application, DatabaseBuilderFactory databaseBuilderFactory, Set<InjectedTypeConverter> set) {
        return INSTANCE.provide(application, databaseBuilderFactory, set);
    }

    public RedesignDbModule_ProvideFactory(Provider<Application> app, Provider<DatabaseBuilderFactory> factory, Provider<Set<InjectedTypeConverter>> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        this.app = app;
        this.factory = factory;
        this.converters = converters;
    }

    @Override // javax.inject.Provider
    public RedesignDatabase get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        DatabaseBuilderFactory databaseBuilderFactory = this.factory.get();
        Intrinsics.checkNotNullExpressionValue(databaseBuilderFactory, "get(...)");
        Set<InjectedTypeConverter> set = this.converters.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.provide(application, databaseBuilderFactory, set);
    }

    /* compiled from: RedesignDbModule_ProvideFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u0007H\u0007J+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/redesign/provisions/RedesignDbModule_ProvideFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/redesign/provisions/RedesignDbModule_ProvideFactory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provide", "Lcom/robinhood/redesign/provisions/RedesignDatabase;", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RedesignDbModule_ProvideFactory create(Provider<Application> app, Provider<DatabaseBuilderFactory> factory, Provider<Set<InjectedTypeConverter>> converters) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(converters, "converters");
            return new RedesignDbModule_ProvideFactory(app, factory, converters);
        }

        @JvmStatic
        public final RedesignDatabase provide(Application app, DatabaseBuilderFactory factory, Set<InjectedTypeConverter> converters) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(converters, "converters");
            Object objCheckNotNull = Preconditions.checkNotNull(RedesignDbModule.INSTANCE.provide(app, factory, converters), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RedesignDatabase) objCheckNotNull;
        }
    }
}
