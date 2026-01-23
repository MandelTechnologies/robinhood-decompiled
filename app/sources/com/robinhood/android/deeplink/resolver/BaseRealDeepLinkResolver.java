package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.BaseDeepLinkPath;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.logging.CrashReporter;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: BaseRealDeepLinkResolver.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020 H'¢\u0006\u0002\u0010!J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H'¢\u0006\u0002\u0010)J\"\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0096@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0096@¢\u0006\u0002\u0010.J\b\u00100\u001a\u00020#H\u0002R\u0016\u0010\u0004\u001a\u00020\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/BaseRealDeepLinkResolver;", "T", "Lcom/robinhood/android/deeplink/BaseDeepLinkPath;", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;)V", "getReleaseVersion$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/utils/ReleaseVersion;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider$lib_deeplink_resolver_externalDebug", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "uriMatcher", "Landroid/content/UriMatcher;", "getUriMatcher", "()Landroid/content/UriMatcher;", "idlDeeplinkTargetResolver", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "getIdlDeeplinkTargetResolver", "()Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "match", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)Lcom/robinhood/android/deeplink/BaseDeepLinkPath;", "mapPathToDeepLink", "Lcom/robinhood/android/navigation/DeepLink;", "path", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "", "(Lcom/robinhood/android/deeplink/BaseDeepLinkPath;Lcom/robinhood/android/navigation/DeepLinkOrigin;Z)Lcom/robinhood/android/navigation/DeepLink;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "isSupported", "rerouteExperiment", "deeplink", "(Lcom/robinhood/android/navigation/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rerouteRegionGate", "updateAppDeepLink", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class BaseRealDeepLinkResolver<T extends BaseDeepLinkPath> implements DeepLinkResolver {
    private final ReleaseVersion releaseVersion;

    /* compiled from: BaseRealDeepLinkResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver", m3645f = "BaseRealDeepLinkResolver.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "rerouteExperiment$suspendImpl")
    /* renamed from: com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$rerouteExperiment$1 */
    /* loaded from: classes2.dex */
    static final class C139441<T extends BaseDeepLinkPath> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseRealDeepLinkResolver<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139441(BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver, Continuation<? super C139441> continuation) {
            super(continuation);
            this.this$0 = baseRealDeepLinkResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRealDeepLinkResolver.rerouteExperiment$suspendImpl(this.this$0, null, this);
        }
    }

    public abstract ExperimentsStore getExperimentsStore$lib_deeplink_resolver_externalDebug();

    protected abstract IdlDeeplinkTargetResolver getIdlDeeplinkTargetResolver();

    public abstract Navigator getNavigator$lib_deeplink_resolver_externalDebug();

    public abstract RegionGateProvider getRegionGateProvider$lib_deeplink_resolver_externalDebug();

    protected abstract UriMatcher getUriMatcher();

    public abstract DeepLink mapPathToDeepLink(T path, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity);

    public abstract T match(Uri uri);

    @Override // com.robinhood.android.navigation.DeepLinkResolver
    public Object rerouteExperiment(DeepLink deepLink, Continuation<? super DeepLink> continuation) {
        return rerouteExperiment$suspendImpl(this, deepLink, continuation);
    }

    @Override // com.robinhood.android.navigation.DeepLinkResolver
    public Object rerouteRegionGate(DeepLink deepLink, Continuation<? super DeepLink> continuation) {
        return rerouteRegionGate$suspendImpl(this, deepLink, continuation);
    }

    public BaseRealDeepLinkResolver(ReleaseVersion releaseVersion) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.releaseVersion = releaseVersion;
    }

    /* renamed from: getReleaseVersion$lib_deeplink_resolver_externalDebug, reason: from getter */
    public final ReleaseVersion getReleaseVersion() {
        return this.releaseVersion;
    }

    @Override // com.robinhood.android.navigation.DeepLinkResolver
    public DeepLink resolve(Uri uri, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        BaseDeepLinkPath baseDeepLinkPathMatch = match(uri);
        CrashReporter.INSTANCE.log("Resolved " + uri + " to " + baseDeepLinkPathMatch);
        if (baseDeepLinkPathMatch == null) {
            return null;
        }
        if (MinVersionCheck.requiresUpdateToView(this.releaseVersion, uri)) {
            return updateAppDeepLink();
        }
        return mapPathToDeepLink(baseDeepLinkPathMatch, deepLinkOrigin, requiresBackingActivity);
    }

    @Override // com.robinhood.android.navigation.DeepLinkResolver
    public boolean isSupported(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (getUriMatcher().match(uri) == -1 && getIdlDeeplinkTargetResolver().match(uri) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T extends BaseDeepLinkPath> Object rerouteExperiment$suspendImpl(BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver, DeepLink deepLink, Continuation<? super DeepLink> continuation) {
        C139441 c139441;
        if (continuation instanceof C139441) {
            c139441 = (C139441) continuation;
            int i = c139441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c139441.label = i - Integer.MIN_VALUE;
            } else {
                c139441 = new C139441(baseRealDeepLinkResolver, continuation);
            }
        }
        Object objStreamExperimentState = c139441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c139441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStreamExperimentState);
            ExperimentDeclaration<?> experiment = deepLink.getExperiment();
            if (experiment == null) {
                return deepLink;
            }
            c139441.L$0 = baseRealDeepLinkResolver;
            c139441.L$1 = deepLink;
            c139441.label = 1;
            objStreamExperimentState = ExperimentUtils.streamExperimentState(baseRealDeepLinkResolver, experiment, c139441);
            if (objStreamExperimentState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deepLink = (DeepLink) c139441.L$1;
            baseRealDeepLinkResolver = (BaseRealDeepLinkResolver) c139441.L$0;
            ResultKt.throwOnFailure(objStreamExperimentState);
        }
        return ((Boolean) objStreamExperimentState).booleanValue() ? deepLink : ExperimentUtils.controlIntent$default(baseRealDeepLinkResolver, deepLink, false, 2, null);
    }

    /* compiled from: BaseRealDeepLinkResolver.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/navigation/DeepLink;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$rerouteRegionGate$2", m3645f = "BaseRealDeepLinkResolver.kt", m3646l = {78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$rerouteRegionGate$2 */
    /* loaded from: classes2.dex */
    static final class C139452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DeepLink>, Object> {
        final /* synthetic */ DeepLink $deeplink;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRealDeepLinkResolver<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139452(DeepLink deepLink, BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver, Continuation<? super C139452> continuation) {
            super(2, continuation);
            this.$deeplink = deepLink;
            this.this$0 = baseRealDeepLinkResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C139452 c139452 = new C139452(this.$deeplink, this.this$0, continuation);
            c139452.L$0 = obj;
            return c139452;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DeepLink> continuation) {
            return ((C139452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Set<RegionGate> regionGates = this.$deeplink.getRegionGates();
                if (regionGates != null) {
                    Set<RegionGate> set = regionGates;
                    BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new BaseRealDeepLinkResolver2(baseRealDeepLinkResolver, (RegionGate) it.next(), null), 3, null));
                    }
                    this.label = 1;
                    obj = Await2.awaitAll(arrayList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return this.$deeplink;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) obj;
            if (list != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            return ExperimentUtils.controlIntent(this.this$0, this.$deeplink, true);
                        }
                    }
                }
            }
            return this.$deeplink;
        }
    }

    static /* synthetic */ <T extends BaseDeepLinkPath> Object rerouteRegionGate$suspendImpl(BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver, DeepLink deepLink, Continuation<? super DeepLink> continuation) {
        return CoroutineScope2.coroutineScope(new C139452(deepLink, baseRealDeepLinkResolver, null), continuation);
    }

    private final DeepLink updateAppDeepLink() {
        return new DeepLink("update_app", true, false, false, new Function2() { // from class: com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseRealDeepLinkResolver.updateAppDeepLink$lambda$0(this.f$0, (Context) obj, (Uri) obj2);
            }
        }, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] updateAppDeepLink$lambda$0(BaseRealDeepLinkResolver baseRealDeepLinkResolver, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "<unused var>");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(baseRealDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug(), context, new DeepLinkIntentKey.UnrecognizedDeepLink(false, true, null, 5, null), null, false, 12, null)};
    }
}
