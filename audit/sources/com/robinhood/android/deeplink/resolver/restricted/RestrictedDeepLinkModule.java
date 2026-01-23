package com.robinhood.android.deeplink.resolver.restricted;

import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.SupportsRestrictedDeepLinks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictedDeepLinkModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkModule;", "", "<init>", "()V", "bindRestrictedDeepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "resolver", "Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RestrictedDeepLinkModule {
    public static final RestrictedDeepLinkModule INSTANCE = new RestrictedDeepLinkModule();

    @SupportsRestrictedDeepLinks
    public final DeepLinkResolver bindRestrictedDeepLinkResolver(RestrictedDeepLinkResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return resolver;
    }

    private RestrictedDeepLinkModule() {
    }
}
