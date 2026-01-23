package com.robinhood.android.navigation;

import android.net.Uri;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeepLinkResolver.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkResolver;", "", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/DeepLink;", "uri", "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "", "isSupported", "rerouteExperiment", "deeplink", "(Lcom/robinhood/android/navigation/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rerouteRegionGate", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface DeepLinkResolver {
    boolean isSupported(Uri uri);

    Object rerouteExperiment(DeepLink deepLink, Continuation<? super DeepLink> continuation);

    Object rerouteRegionGate(DeepLink deepLink, Continuation<? super DeepLink> continuation);

    DeepLink resolve(Uri uri, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity);

    /* compiled from: DeepLinkResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ DeepLink resolve$default(DeepLinkResolver deepLinkResolver, Uri uri, DeepLinkOrigin deepLinkOrigin, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return deepLinkResolver.resolve(uri, deepLinkOrigin, z);
        }
    }
}
