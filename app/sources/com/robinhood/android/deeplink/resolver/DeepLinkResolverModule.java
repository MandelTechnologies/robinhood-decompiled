package com.robinhood.android.deeplink.resolver;

import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.shared.app.type.AppType;
import dagger.Lazy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkResolverModule.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J;\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f0\u000b2\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/DeepLinkResolverModule;", "", "<init>", "()V", "bindDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "resolver", "Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver;", "bindIdlDeepLinkResolver", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "idlDeeplinkSetLazy", "Ldagger/Lazy;", "", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "rhDeeplinkSupportedUri", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "Lkotlin/jvm/JvmSuppressWildcards;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "provideDeeplinkSupporterUris", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DeepLinkResolverModule {
    public static final DeepLinkResolverModule INSTANCE = new DeepLinkResolverModule();

    /* compiled from: DeepLinkResolverModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final DeepLinkResolver bindDeepLinkResolver(RealDeepLinkResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return resolver;
    }

    private DeepLinkResolverModule() {
    }

    public final IdlDeeplinkTargetResolver bindIdlDeepLinkResolver(Lazy<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy, Set<RhDeeplinkSupportedUri> rhDeeplinkSupportedUri, AppType appType) {
        Intrinsics.checkNotNullParameter(idlDeeplinkSetLazy, "idlDeeplinkSetLazy");
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new IdlDeeplinkTargetResolver(idlDeeplinkSetLazy, rhDeeplinkSupportedUri, appType);
    }

    public final Set<RhDeeplinkSupportedUri> provideDeeplinkSupporterUris(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return SetsKt.setOf((Object[]) new RhDeeplinkSupportedUri[]{RhDeeplinkSupportedUri.ROBINHOOD_GLOBAL, RhDeeplinkSupportedUri.HTTPS_APPLINK_ROBINHOOD, RhDeeplinkSupportedUri.HTTPS_WWW_ROBINHOOD_APPLINK, RhDeeplinkSupportedUri.HTTPS_ROBINHOOD_APPLINK});
        }
        if (i == 2) {
            return SetsKt.setOf((Object[]) new RhDeeplinkSupportedUri[]{RhDeeplinkSupportedUri.ROBINHOOD, RhDeeplinkSupportedUri.HTTPS_APPLINK_ROBINHOOD, RhDeeplinkSupportedUri.HTTPS_WWW_ROBINHOOD_APPLINK, RhDeeplinkSupportedUri.HTTPS_ROBINHOOD_APPLINK});
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("IDL Deeplink not supported for NCW yet");
    }
}
