package com.robinhood.android.navigation.deeplink.restricted;

import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.SupportsRestrictedDeepLinks;
import com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictedDeeplinkResolverActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/restricted/RestrictedDeeplinkResolverActivity;", "Lcom/robinhood/android/navigation/deeplink/BaseDeeplinkResolverActivity;", "<init>", "()V", "injectedDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "getInjectedDeepLinkResolver", "()Lcom/robinhood/android/navigation/DeepLinkResolver;", "setInjectedDeepLinkResolver", "(Lcom/robinhood/android/navigation/DeepLinkResolver;)V", "deepLinkResolver", "getDeepLinkResolver", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RestrictedDeeplinkResolverActivity extends BaseDeeplinkResolverActivity {
    public static final int $stable = 8;

    @SupportsRestrictedDeepLinks
    public DeepLinkResolver injectedDeepLinkResolver;

    public final DeepLinkResolver getInjectedDeepLinkResolver() {
        DeepLinkResolver deepLinkResolver = this.injectedDeepLinkResolver;
        if (deepLinkResolver != null) {
            return deepLinkResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injectedDeepLinkResolver");
        return null;
    }

    public final void setInjectedDeepLinkResolver(DeepLinkResolver deepLinkResolver) {
        Intrinsics.checkNotNullParameter(deepLinkResolver, "<set-?>");
        this.injectedDeepLinkResolver = deepLinkResolver;
    }

    @Override // com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity
    protected DeepLinkResolver getDeepLinkResolver() {
        return getInjectedDeepLinkResolver();
    }
}
