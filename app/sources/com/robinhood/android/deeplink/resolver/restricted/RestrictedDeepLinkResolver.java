package com.robinhood.android.deeplink.resolver.restricted;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: RestrictedDeepLinkResolver.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+BI\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\u00022\u0006\u0010(\u001a\u00020)H\u0016J\f\u0010*\u001a\u00020&*\u00020)H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver;", "Lcom/robinhood/android/deeplink/resolver/BaseRealDeepLinkResolver;", "Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkPath;", "navigatorLazy", "Ldagger/Lazy;", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Lcom/robinhood/utils/ReleaseVersion;)V", "uriMatcher", "Landroid/content/UriMatcher;", "getUriMatcher", "()Landroid/content/UriMatcher;", "navigator", "getNavigator$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "getExperimentsStore$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "getRegionGateProvider$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "idlDeeplinkTargetResolver", "getIdlDeeplinkTargetResolver", "()Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "mapPathToDeepLink", "Lcom/robinhood/android/navigation/DeepLink;", "path", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "", "match", "uri", "Landroid/net/Uri;", "isRoot", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RestrictedDeepLinkResolver extends BaseRealDeepLinkResolver<RestrictedDeepLinkPath> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<UriMatcher> MATCHER$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.deeplink.resolver.restricted.RestrictedDeepLinkResolver$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RestrictedDeepLinkResolver.MATCHER_delegate$lambda$6();
        }
    });
    private final dagger.Lazy<ExperimentsStore> experimentsStoreLazy;
    private final dagger.Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy;
    private final dagger.Lazy<Navigator> navigatorLazy;
    private final dagger.Lazy<RegionGateProvider> regionGateProviderLazy;

    /* compiled from: RestrictedDeepLinkResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictedDeepLinkPath.values().length];
            try {
                iArr[RestrictedDeepLinkPath.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictedDeepLinkPath.CRYPTO_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictedDeepLinkPath.AUTHORIZE_WALLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictedDeepLinkResolver(dagger.Lazy<Navigator> navigatorLazy, dagger.Lazy<ExperimentsStore> experimentsStoreLazy, dagger.Lazy<RegionGateProvider> regionGateProviderLazy, dagger.Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, ReleaseVersion releaseVersion) {
        super(releaseVersion);
        Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
        Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
        Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
        Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.navigatorLazy = navigatorLazy;
        this.experimentsStoreLazy = experimentsStoreLazy;
        this.regionGateProviderLazy = regionGateProviderLazy;
        this.idlDeeplinkResolverLazy = idlDeeplinkResolverLazy;
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    protected UriMatcher getUriMatcher() {
        return INSTANCE.getMATCHER();
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

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public DeepLink mapPathToDeepLink(RestrictedDeepLinkPath path, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        int i = WhenMappings.$EnumSwitchMapping$0[path.ordinal()];
        if (i == 1) {
            return new DeepLink(path.getPath(), false, false, false, new Function2() { // from class: com.robinhood.android.deeplink.resolver.restricted.RestrictedDeepLinkResolver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RestrictedDeepLinkResolver.mapPathToDeepLink$lambda$0(this.f$0, (Context) obj, (Uri) obj2);
                }
            }, 8, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new DeepLink(path.getPath(), true, false, true, (Function2<? super Context, ? super Uri, Intent[]>) new Function2() { // from class: com.robinhood.android.deeplink.resolver.restricted.RestrictedDeepLinkResolver$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RestrictedDeepLinkResolver.mapPathToDeepLink$lambda$1(this.f$0, (Context) obj, (Uri) obj2);
                }
            });
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new DeepLink(path.getPath(), true, false, true, (Function2<? super Context, ? super Uri, Intent[]>) new Function2() { // from class: com.robinhood.android.deeplink.resolver.restricted.RestrictedDeepLinkResolver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RestrictedDeepLinkResolver.mapPathToDeepLink$lambda$3(this.f$0, (Context) obj, (Uri) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] mapPathToDeepLink$lambda$0(RestrictedDeepLinkResolver restrictedDeepLinkResolver, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "<unused var>");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(restrictedDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug(), context, WelcomeIntentKey.INSTANCE, null, false, 12, null)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] mapPathToDeepLink$lambda$1(RestrictedDeepLinkResolver restrictedDeepLinkResolver, Context context, Uri data) {
        CryptoTransferIntentKey.Source gateway;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Navigator navigator$lib_deeplink_resolver_externalDebug = restrictedDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug();
        String queryParameter = data.getQueryParameter("id");
        UUID uuid = queryParameter != null ? StringsKt.toUuid(queryParameter) : null;
        CryptoTransferIntentKey.Action.Companion companion = CryptoTransferIntentKey.Action.INSTANCE;
        String queryParameter2 = data.getQueryParameter("action");
        Intrinsics.checkNotNull(queryParameter2);
        CryptoTransferIntentKey.Action actionFromQueryParam = companion.fromQueryParam(queryParameter2);
        String queryParameter3 = data.getQueryParameter("source");
        if (queryParameter3 != null) {
            int iHashCode = queryParameter3.hashCode();
            if (iHashCode != 178944454) {
                if (iHashCode == 1703336416 && queryParameter3.equals("robinhood-wallet")) {
                    String queryParameter4 = data.getQueryParameter(PlaceTypes.ADDRESS);
                    Intrinsics.checkNotNull(queryParameter4);
                    String queryParameter5 = data.getQueryParameter("network");
                    Intrinsics.checkNotNull(queryParameter5);
                    gateway = new CryptoTransferIntentKey.Source.Gateway(queryParameter4, queryParameter5);
                    return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator$lib_deeplink_resolver_externalDebug, context, new CryptoTransferIntentKey(actionFromQueryParam, uuid, gateway, false, null, 24, null), null, false, 12, null)};
                }
            } else if (queryParameter3.equals("robinhood")) {
                gateway = CryptoTransferIntentKey.Source.Default.INSTANCE;
                return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator$lib_deeplink_resolver_externalDebug, context, new CryptoTransferIntentKey(actionFromQueryParam, uuid, gateway, false, null, 24, null), null, false, 12, null)};
            }
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(data);
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] mapPathToDeepLink$lambda$3(RestrictedDeepLinkResolver restrictedDeepLinkResolver, Context context, Uri data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String queryParameter = data.getQueryParameter(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID);
        if (queryParameter != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(restrictedDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug(), context, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new CryptoAuthorizeWalletFragmentKey(queryParameter), false, false, true, false, false, false, 118, null), null, false, 12, null)};
        }
        return new Intent[0];
    }

    @Override // com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver
    public RestrictedDeepLinkPath match(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (isRoot(uri)) {
            return RestrictedDeepLinkPath.ROOT;
        }
        int iMatch = INSTANCE.getMATCHER().match(uri);
        if (iMatch == -1) {
            return null;
        }
        RestrictedDeepLinkPath restrictedDeepLinkPath = RestrictedDeepLinkPath.values()[iMatch];
        return restrictedDeepLinkPath.getDeprecated() ? RestrictedDeepLinkPath.ROOT : restrictedDeepLinkPath;
    }

    private final boolean isRoot(Uri uri) {
        if (Intrinsics.areEqual(RestrictedDeepLinkPath.SCHEME_ROBINHOOD_RESTRICTED, uri.getScheme())) {
            String authority = uri.getAuthority();
            return authority == null || authority.length() == 0;
        }
        return uri.getPathSegments().isEmpty();
    }

    /* compiled from: RestrictedDeepLinkResolver.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver$Companion;", "", "<init>", "()V", "MATCHER", "Landroid/content/UriMatcher;", "getMATCHER", "()Landroid/content/UriMatcher;", "MATCHER$delegate", "Lkotlin/Lazy;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UriMatcher getMATCHER() {
            return (UriMatcher) RestrictedDeepLinkResolver.MATCHER$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UriMatcher MATCHER_delegate$lambda$6() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        for (RestrictedDeepLinkPath restrictedDeepLinkPath : SequencesKt.drop(ArraysKt.asSequence(RestrictedDeepLinkPath.values()), 1)) {
            uriMatcher.addURI(restrictedDeepLinkPath.getPath(), null, restrictedDeepLinkPath.ordinal());
        }
        return uriMatcher;
    }
}
