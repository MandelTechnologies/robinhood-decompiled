package com.robinhood.android.deeplink.resolver;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory;", "Ldagger/internal/Factory;", "", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "Lkotlin/jvm/JvmSuppressWildcards;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory implements Factory<Set<RhDeeplinkSupportedUri>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;

    @JvmStatic
    public static final DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory create(Provider<AppType> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Set<RhDeeplinkSupportedUri> provideDeeplinkSupporterUris(AppType appType) {
        return INSTANCE.provideDeeplinkSupporterUris(appType);
    }

    public DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory(Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public Set<RhDeeplinkSupportedUri> get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.provideDeeplinkSupporterUris(appType);
    }

    /* compiled from: DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001b\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "provideDeeplinkSupporterUris", "", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory create(Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new DeepLinkResolverModule_ProvideDeeplinkSupporterUrisFactory(appType);
        }

        @JvmStatic
        public final Set<RhDeeplinkSupportedUri> provideDeeplinkSupporterUris(AppType appType) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Object objCheckNotNull = Preconditions.checkNotNull(DeepLinkResolverModule.INSTANCE.provideDeeplinkSupporterUris(appType), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Set) objCheckNotNull;
        }
    }
}
