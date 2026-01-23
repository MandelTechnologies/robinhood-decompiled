package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.deeplink.DeeplinkTarget;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.deeplink.DeprecatedDeepLinkException;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pdfrenderer.deeplinktarget.PdfRendererDeeplinkTarget;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.crypto.deeplinktargets.RhwDeeplinkTarget;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.ReleaseVersion;
import dagger.Lazy;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RealDeepLinkResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J \u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010\u00122\u0006\u00109\u001a\u00020:H\u0002J-\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020@2\u0006\u00109\u001a\u00020:2\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver;", "Lcom/robinhood/android/deeplink/resolver/BaseRealDeepLinkResolver;", "Lcom/robinhood/android/deeplink/DeeplinkTarget;", "authManagerLazy", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/auth/AuthManager;", "navigatorLazy", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLoggerLazy", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "targets", "", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Lcom/robinhood/utils/ReleaseVersion;)V", "deeplinkTargets", "Lkotlinx/collections/immutable/ImmutableList;", "getDeeplinkTargets", "()Lkotlinx/collections/immutable/ImmutableList;", "deeplinkTargets$delegate", "Lkotlin/Lazy;", "uriMatcher", "Landroid/content/UriMatcher;", "getUriMatcher", "()Landroid/content/UriMatcher;", "uriMatcher$delegate", "navigator", "getNavigator$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "getExperimentsStore$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "getRegionGateProvider$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "idlDeeplinkTargetResolver", "getIdlDeeplinkTargetResolver", "()Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "eventLogger", "getEventLogger", "()Lcom/robinhood/analytics/DeeplinkEventLogger;", "mapPathToDeepLink", "Lcom/robinhood/android/navigation/DeepLink;", "path", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "", "match", "uri", "Landroid/net/Uri;", "legacyUriMatcher", "redirectGetIntents", "", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "redirectGetIntents$lib_deeplink_resolver_externalDebug", "(Landroid/content/Context;Landroid/net/Uri;Lcom/robinhood/android/navigation/DeepLinkOrigin;)[Landroid/content/Intent;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RealDeepLinkResolver extends BaseRealDeepLinkResolver<DeeplinkTarget> {
    private final Lazy<AuthManager> authManagerLazy;

    /* renamed from: deeplinkTargets$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deeplinkTargets;
    private final Lazy<DeeplinkEventLogger> eventLoggerLazy;
    private final Lazy<ExperimentsStore> experimentsStoreLazy;
    private final Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy;
    private final Lazy<Navigator> navigatorLazy;
    private final Lazy<RegionGateProvider> regionGateProviderLazy;

    /* renamed from: uriMatcher$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uriMatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeepLinkResolver(Lazy<AuthManager> authManagerLazy, Lazy<Navigator> navigatorLazy, Lazy<ExperimentsStore> experimentsStoreLazy, Lazy<RegionGateProvider> regionGateProviderLazy, Lazy<DeeplinkEventLogger> eventLoggerLazy, Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, final Lazy<Set<DeeplinkTarget4>> targets, ReleaseVersion releaseVersion) {
        super(releaseVersion);
        Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
        Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
        Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
        Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
        Intrinsics.checkNotNullParameter(eventLoggerLazy, "eventLoggerLazy");
        Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.authManagerLazy = authManagerLazy;
        this.navigatorLazy = navigatorLazy;
        this.experimentsStoreLazy = experimentsStoreLazy;
        this.regionGateProviderLazy = regionGateProviderLazy;
        this.eventLoggerLazy = eventLoggerLazy;
        this.idlDeeplinkResolverLazy = idlDeeplinkResolverLazy;
        this.deeplinkTargets = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.deeplink.resolver.RealDeepLinkResolver$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealDeepLinkResolver.deeplinkTargets_delegate$lambda$0(targets);
            }
        });
        this.uriMatcher = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.deeplink.resolver.RealDeepLinkResolver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealDeepLinkResolver.uriMatcher_delegate$lambda$3(this.f$0);
            }
        });
    }

    private final ImmutableList<DeeplinkTarget4> getDeeplinkTargets() {
        return (ImmutableList) this.deeplinkTargets.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList deeplinkTargets_delegate$lambda$0(Lazy lazy) {
        Object obj = lazy.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return extensions2.toImmutableList((Iterable) obj);
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    protected UriMatcher getUriMatcher() {
        return (UriMatcher) this.uriMatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UriMatcher uriMatcher_delegate$lambda$3(RealDeepLinkResolver realDeepLinkResolver) {
        UriMatcher uriMatcher = new UriMatcher(-1);
        int i = 0;
        for (DeeplinkTarget4 deeplinkTarget4 : realDeepLinkResolver.getDeeplinkTargets()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DeeplinkTarget4 deeplinkTarget42 = deeplinkTarget4;
            Uris.updateMatcherFromPath(uriMatcher, deeplinkTarget42.getPath(), deeplinkTarget42.getIsAppLink(), i);
            i = i2;
        }
        return uriMatcher;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public Navigator getNavigator$lib_deeplink_resolver_externalDebug() {
        Navigator navigator = this.navigatorLazy.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        return navigator;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public ExperimentsStore getExperimentsStore$lib_deeplink_resolver_externalDebug() {
        ExperimentsStore experimentsStore = this.experimentsStoreLazy.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return experimentsStore;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public RegionGateProvider getRegionGateProvider$lib_deeplink_resolver_externalDebug() {
        RegionGateProvider regionGateProvider = this.regionGateProviderLazy.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return regionGateProvider;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    protected IdlDeeplinkTargetResolver getIdlDeeplinkTargetResolver() {
        IdlDeeplinkTargetResolver idlDeeplinkTargetResolver = this.idlDeeplinkResolverLazy.get();
        Intrinsics.checkNotNullExpressionValue(idlDeeplinkTargetResolver, "get(...)");
        return idlDeeplinkTargetResolver;
    }

    private final DeeplinkEventLogger getEventLogger() {
        DeeplinkEventLogger deeplinkEventLogger = this.eventLoggerLazy.get();
        Intrinsics.checkNotNullExpressionValue(deeplinkEventLogger, "get(...)");
        return deeplinkEventLogger;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public DeepLink mapPathToDeepLink(final DeeplinkTarget path, final DeepLinkOrigin deepLinkOrigin, final boolean requiresBackingActivity) throws DeprecatedDeepLinkException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        if (path.getDeprecated()) {
            throw new DeprecatedDeepLinkException(path.getPath());
        }
        return new DeepLink(path.getPath(), path.getRequireAuthentication(), path.getExperiment(), path.getRegionGates(), path.getIsLongRunning(), path.getShouldClearTop(), (Function2<? super Context, ? super Uri, Intent[]>) new Function2() { // from class: com.robinhood.android.deeplink.resolver.RealDeepLinkResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RealDeepLinkResolver.mapPathToDeepLink$lambda$4(path, this, requiresBackingActivity, deepLinkOrigin, (Context) obj, (Uri) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] mapPathToDeepLink$lambda$4(DeeplinkTarget deeplinkTarget, RealDeepLinkResolver realDeepLinkResolver, boolean z, DeepLinkOrigin deepLinkOrigin, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator$lib_deeplink_resolver_externalDebug = realDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug();
        ExperimentsStore experimentsStore$lib_deeplink_resolver_externalDebug = realDeepLinkResolver.getExperimentsStore$lib_deeplink_resolver_externalDebug();
        RegionGateProvider regionGateProvider$lib_deeplink_resolver_externalDebug = realDeepLinkResolver.getRegionGateProvider$lib_deeplink_resolver_externalDebug();
        DeeplinkEventLogger deeplinkEventLogger = realDeepLinkResolver.eventLoggerLazy.get();
        Intrinsics.checkNotNullExpressionValue(deeplinkEventLogger, "get(...)");
        return deeplinkTarget.getIntents(new RealDeeplinkContext(context, navigator$lib_deeplink_resolver_externalDebug, deeplinkEventLogger, z, uri, deepLinkOrigin, realDeepLinkResolver.authManagerLazy, experimentsStore$lib_deeplink_resolver_externalDebug, regionGateProvider$lib_deeplink_resolver_externalDebug, new RealDeepLinkResolver2(realDeepLinkResolver), new RealDeepLinkResolver3(realDeepLinkResolver)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeeplinkTarget match(Uri uri) {
        Uri uri2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Uris.isWallet(uri)) {
            return RhwDeeplinkTarget.INSTANCE;
        }
        if (Uris.isRoot(uri)) {
            getEventLogger().logDeeplinkMatchSuccess(uri);
            return RootDeeplinkTarget.INSTANCE;
        }
        if (Uris.shouldRerouteToPdfRenderer(uri)) {
            getEventLogger().logDeeplinkMatchSuccess(uri);
            return PdfRendererDeeplinkTarget.INSTANCE;
        }
        if (uri.getPathSegments().size() > 1) {
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (StringsKt.startsWith$default(string2, "robinhood://", false, 2, (Object) null)) {
                String string3 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                uri2 = Uri.parse(StringsKt.replace$default(string3, "robinhood://", "https://robinhood.com/", false, 4, (Object) null));
            } else {
                uri2 = uri;
            }
        }
        DeeplinkTarget deeplinkTargetMatch = getIdlDeeplinkTargetResolver().match(uri);
        if (deeplinkTargetMatch == null) {
            deeplinkTargetMatch = legacyUriMatcher(uri2);
        }
        if (deeplinkTargetMatch == null) {
            getEventLogger().logDeeplinkMatchFailure(uri);
            return null;
        }
        if (deeplinkTargetMatch.getDeprecated()) {
            return RootDeeplinkTarget.INSTANCE;
        }
        getEventLogger().logDeeplinkMatchSuccess(uri);
        return deeplinkTargetMatch;
    }

    private final DeeplinkTarget4 legacyUriMatcher(Uri uri) {
        int iMatch = getUriMatcher().match(uri);
        if (iMatch == -1) {
            return null;
        }
        return (DeeplinkTarget4) CollectionsKt.getOrNull(getDeeplinkTargets(), iMatch);
    }

    public final Intent[] redirectGetIntents$lib_deeplink_resolver_externalDebug(Context context, Uri uri, DeepLinkOrigin deepLinkOrigin) {
        Function2<Context, Uri, Intent[]> getIntents;
        Intent[] intentArrInvoke;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        DeepLink deepLinkResolve$default = DeepLinkResolver.DefaultImpls.resolve$default(this, uri, deepLinkOrigin, false, 4, null);
        return (deepLinkResolve$default == null || (getIntents = deepLinkResolve$default.getGetIntents()) == null || (intentArrInvoke = getIntents.invoke(context, uri)) == null) ? new Intent[0] : intentArrInvoke;
    }
}
