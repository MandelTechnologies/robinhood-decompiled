package com.robinhood.android.deeplink.resolver;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.shared.app.type.AppType;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkResolverModule_BindIdlDeepLinkResolverFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fBK\u0012\u001b\u0010\u0003\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R#\u0010\u0003\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_BindIdlDeepLinkResolverFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "idlDeeplinkSetLazy", "Ljavax/inject/Provider;", "", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Lkotlin/jvm/JvmSuppressWildcards;", "rhDeeplinkSupportedUri", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DeepLinkResolverModule_BindIdlDeepLinkResolverFactory implements Factory<IdlDeeplinkTargetResolver> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy;
    private final Provider<Set<RhDeeplinkSupportedUri>> rhDeeplinkSupportedUri;

    @JvmStatic
    public static final IdlDeeplinkTargetResolver bindIdlDeepLinkResolver(Lazy<Set<DeeplinkTarget3<?>>> lazy, Set<RhDeeplinkSupportedUri> set, AppType appType) {
        return INSTANCE.bindIdlDeepLinkResolver(lazy, set, appType);
    }

    @JvmStatic
    public static final DeepLinkResolverModule_BindIdlDeepLinkResolverFactory create(Provider<Set<DeeplinkTarget3<?>>> provider, Provider<Set<RhDeeplinkSupportedUri>> provider2, Provider<AppType> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    public DeepLinkResolverModule_BindIdlDeepLinkResolverFactory(Provider<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy, Provider<Set<RhDeeplinkSupportedUri>> rhDeeplinkSupportedUri, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(idlDeeplinkSetLazy, "idlDeeplinkSetLazy");
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.idlDeeplinkSetLazy = idlDeeplinkSetLazy;
        this.rhDeeplinkSupportedUri = rhDeeplinkSupportedUri;
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public IdlDeeplinkTargetResolver get() {
        Companion companion = INSTANCE;
        Lazy<Set<DeeplinkTarget3<?>>> lazy = DoubleCheck.lazy(this.idlDeeplinkSetLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Set<RhDeeplinkSupportedUri> set = this.rhDeeplinkSupportedUri.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.bindIdlDeepLinkResolver(lazy, set, appType);
    }

    /* compiled from: DeepLinkResolverModule_BindIdlDeepLinkResolverFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0004\u001a\u00020\u00052\u001b\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J@\u0010\u000f\u001a\u00020\u00102\u001b\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u00112\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_BindIdlDeepLinkResolverFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule_BindIdlDeepLinkResolverFactory;", "idlDeeplinkSetLazy", "Ljavax/inject/Provider;", "", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Lkotlin/jvm/JvmSuppressWildcards;", "rhDeeplinkSupportedUri", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "bindIdlDeepLinkResolver", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "Ldagger/Lazy;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeepLinkResolverModule_BindIdlDeepLinkResolverFactory create(Provider<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy, Provider<Set<RhDeeplinkSupportedUri>> rhDeeplinkSupportedUri, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(idlDeeplinkSetLazy, "idlDeeplinkSetLazy");
            Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new DeepLinkResolverModule_BindIdlDeepLinkResolverFactory(idlDeeplinkSetLazy, rhDeeplinkSupportedUri, appType);
        }

        @JvmStatic
        public final IdlDeeplinkTargetResolver bindIdlDeepLinkResolver(Lazy<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy, Set<RhDeeplinkSupportedUri> rhDeeplinkSupportedUri, AppType appType) {
            Intrinsics.checkNotNullParameter(idlDeeplinkSetLazy, "idlDeeplinkSetLazy");
            Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Object objCheckNotNull = Preconditions.checkNotNull(DeepLinkResolverModule.INSTANCE.bindIdlDeepLinkResolver(idlDeeplinkSetLazy, rhDeeplinkSupportedUri, appType), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (IdlDeeplinkTargetResolver) objCheckNotNull;
        }
    }
}
