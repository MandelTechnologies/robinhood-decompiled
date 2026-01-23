package com.robinhood.android.margin.p174ui.daytrade;

import android.content.Context;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.margin.model.UiDayTradeDisclosure;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.margin.model.UiDayTradeInfoStep;
import com.robinhood.android.margin.model.UiDayTradeInfoVariant;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoLoadingFragment;
import com.robinhood.android.margin.p174ui.daytrade.content.McwPdtInfoBrokerageResource;
import com.robinhood.android.margin.p174ui.daytrade.content.PdtInfoBrokerageResource;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfo;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfoStep;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfoVariant;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import okhttp3.HttpUrl;

/* compiled from: DayTradeInfoLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010(\u001a\u00020)H\u0017¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020)H\u0016J&\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020/2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030201H\u0002J&\u00104\u001a\b\u0012\u0004\u0012\u0002050-*\u00020/2\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070201H\u0002J\u0016\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J*\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020BH\u0082@¢\u0006\u0002\u0010CR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "setBrokerageResourceManager", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;)V", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "getStaticContentStore", "()Lcom/robinhood/contentful/StaticContentStore;", "setStaticContentStore", "(Lcom/robinhood/contentful/StaticContentStore;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "setNightModeManager", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;)V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "callbacks", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "fetchStepAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "Lkotlinx/coroutines/CoroutineScope;", "stepLink", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoStep;", "fetchVariantAsync", "Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "variantLink", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoVariant;", "prefetchAssets", "dayTradeInfo", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "(Lcom/robinhood/android/margin/model/UiDayTradeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefetchImage", MarkdownText4.TagImageUrl, "Lokhttp3/HttpUrl;", "synchronous", "", "priority", "Lcom/robinhood/android/rhimage/ImageLoader$Priority;", "(Lokhttp3/HttpUrl;ZLcom/robinhood/android/rhimage/ImageLoader$Priority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Callbacks", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoLoadingFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DayTradeInfoLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment$Callbacks;", 0))};
    public static final int $stable = 8;
    public BrokerageResourceManager brokerageResourceManager;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DayTradeInfoLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public ImageLoader imageLoader;
    public NightModeManager nightModeManager;
    public RegionGateProvider regionGateProvider;
    public StaticContentStore staticContentStore;

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment$Callbacks;", "", "onLoadDayTradeInfoSuccess", "", "onboarding", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "onLoadDayTradeInfoFailed", "throwable", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadDayTradeInfoFailed(Throwable throwable);

        void onLoadDayTradeInfoSuccess(UiDayTradeInfo onboarding);
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment", m3645f = "DayTradeInfoLoadingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "prefetchAssets")
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$prefetchAssets$1 */
    static final class C210241 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C210241(Continuation<? super C210241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DayTradeInfoLoadingFragment.this.prefetchAssets(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, int i, Composer composer, int i2) {
        dayTradeInfoLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager;
        if (brokerageResourceManager != null) {
            return brokerageResourceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brokerageResourceManager");
        return null;
    }

    public final void setBrokerageResourceManager(BrokerageResourceManager brokerageResourceManager) {
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "<set-?>");
        this.brokerageResourceManager = brokerageResourceManager;
    }

    public final StaticContentStore getStaticContentStore() {
        StaticContentStore staticContentStore = this.staticContentStore;
        if (staticContentStore != null) {
            return staticContentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("staticContentStore");
        return null;
    }

    public final void setStaticContentStore(StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(staticContentStore, "<set-?>");
        this.staticContentStore = staticContentStore;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final NightModeManager getNightModeManager() {
        NightModeManager nightModeManager = this.nightModeManager;
        if (nightModeManager != null) {
            return nightModeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nightModeManager");
        return null;
    }

    public final void setNightModeManager(NightModeManager nightModeManager) {
        Intrinsics.checkNotNullParameter(nightModeManager, "<set-?>");
        this.nightModeManager = nightModeManager;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1135774941);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1135774941, i, -1, "com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment.ComposeContent (DayTradeInfoLoadingFragment.kt:54)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, true, true, composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DayTradeInfoLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new C210211(null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C210222(getCallbacks()), new C210233(getCallbacks()));
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$onStart$1", m3645f = "DayTradeInfoLoadingFragment.kt", m3646l = {67, 73, 88, 89, 92, 93, 94, 95, 96, 97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$onStart$1 */
    static final class C210211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDayTradeInfo>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        C210211(Continuation<? super C210211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C210211 c210211 = DayTradeInfoLoadingFragment.this.new C210211(continuation);
            c210211.L$0 = obj;
            return c210211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDayTradeInfo> continuation) {
            return ((C210211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0127 A[PHI: r0 r1 r2 r4 r5 r7 r9 r10
          0x0127: PHI (r0v25 java.lang.Object) = (r0v22 java.lang.Object), (r0v30 java.lang.Object) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r1v13 kotlinx.coroutines.Deferred) = (r1v10 kotlinx.coroutines.Deferred), (r1v16 kotlinx.coroutines.Deferred) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r2v11 kotlinx.coroutines.Deferred) = (r2v8 kotlinx.coroutines.Deferred), (r2v14 kotlinx.coroutines.Deferred) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r4v6 kotlinx.coroutines.Deferred) = (r4v3 kotlinx.coroutines.Deferred), (r4v9 kotlinx.coroutines.Deferred) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r5v10 kotlinx.coroutines.Deferred) = (r5v7 kotlinx.coroutines.Deferred), (r5v14 kotlinx.coroutines.Deferred) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r7v6 okhttp3.HttpUrl) = (r7v4 okhttp3.HttpUrl), (r7v8 okhttp3.HttpUrl) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r9v11 java.util.List) = (r9v8 java.util.List), (r9v15 java.util.List) binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r10v11 com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfo) = 
          (r10v8 com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfo)
          (r10v15 com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfo)
         binds: [B:38:0x024c, B:14:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01a3 A[PHI: r0 r9
          0x01a3: PHI (r0v15 java.lang.Object) = (r0v10 java.lang.Object), (r0v20 java.lang.Object) binds: [B:27:0x019f, B:17:0x014d] A[DONT_GENERATE, DONT_INLINE]
          0x01a3: PHI (r9v4 kotlinx.coroutines.CoroutineScope) = (r9v2 kotlinx.coroutines.CoroutineScope), (r9v7 kotlinx.coroutines.CoroutineScope) binds: [B:27:0x019f, B:17:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01c0 A[LOOP:0: B:30:0x01ba->B:32:0x01c0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x02c5  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0310  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x033e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object regionGateState$default;
            Object objLoadResourceSuspend;
            Iterator<T> it;
            Deferred deferredFetchStepAsync;
            Deferred deferredFetchStepAsync2;
            Object objAwait;
            DayTradeInfo dayTradeInfo;
            Deferred deferred;
            List list;
            Deferred deferred2;
            Deferred deferred3;
            HttpUrl httpUrl;
            Object objAwait2;
            Deferred deferred4;
            Object objAwaitAll;
            HttpUrl httpUrl2;
            MarkdownContent markdownContent;
            Deferred deferred5;
            HttpUrl httpUrl3;
            Deferred deferred6;
            String str;
            Deferred deferred7;
            Object objAwait3;
            MarkdownContent markdownContent2;
            HttpUrl httpUrl4;
            String str2;
            List list2;
            Deferred deferred8;
            Deferred deferred9;
            HttpUrl httpUrl5;
            Object objAwait4;
            HttpUrl httpUrl6;
            UiDayTradeInfoStep uiDayTradeInfoStep;
            Deferred deferred10;
            Deferred deferred11;
            Object objAwait5;
            UiDayTradeInfoStep uiDayTradeInfoStep2;
            HttpUrl httpUrl7;
            String str3;
            List list3;
            UiDayTradeInfoStep uiDayTradeInfoStep3;
            HttpUrl httpUrl8;
            MarkdownContent markdownContent3;
            Object objAwait6;
            HttpUrl httpUrl9;
            UiDayTradeInfoStep uiDayTradeInfoStep4;
            UiDayTradeInfo uiDayTradeInfo;
            DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    RegionGateProvider regionGateProvider = DayTradeInfoLoadingFragment.this.getRegionGateProvider();
                    McwRegionGate mcwRegionGate = McwRegionGate.INSTANCE;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, mcwRegionGate, false, this, 2, null);
                    if (regionGateState$default != coroutine_suspended) {
                        BrokerageResource brokerageResource = !((Boolean) regionGateState$default).booleanValue() ? McwPdtInfoBrokerageResource.INSTANCE : PdtInfoBrokerageResource.INSTANCE;
                        BrokerageResourceManager brokerageResourceManager = DayTradeInfoLoadingFragment.this.getBrokerageResourceManager();
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        objLoadResourceSuspend = brokerageResourceManager.loadResourceSuspend(brokerageResource, this);
                        if (objLoadResourceSuspend != coroutine_suspended) {
                            DayTradeInfo dayTradeInfo2 = (DayTradeInfo) objLoadResourceSuspend;
                            List<ResourceLink<EntryResource<DayTradeInfoStep>>> steps = dayTradeInfo2.getSteps();
                            DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment2 = DayTradeInfoLoadingFragment.this;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(steps, 10));
                            it = steps.iterator();
                            while (it.hasNext()) {
                                arrayList.add(dayTradeInfoLoadingFragment2.fetchStepAsync(coroutineScope, (ResourceLink) it.next()));
                            }
                            deferredFetchStepAsync = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo2.getCashManagementStep());
                            Deferred deferredFetchStepAsync3 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo2.getCashManagementInterestStep());
                            deferredFetchStepAsync2 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo2.getProtectionEnabledStep());
                            Deferred deferredFetchStepAsync4 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo2.getRecommendProtectionStep());
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DayTradeInfoLoadingFragment3(DayTradeInfoLoadingFragment.this, dayTradeInfo2, null), 3, null);
                            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DayTradeInfoLoadingFragment2(DayTradeInfoLoadingFragment.this, dayTradeInfo2, null), 3, null);
                            this.L$0 = dayTradeInfo2;
                            this.L$1 = arrayList;
                            this.L$2 = deferredFetchStepAsync;
                            this.L$3 = deferredFetchStepAsync3;
                            this.L$4 = deferredFetchStepAsync2;
                            this.L$5 = deferredFetchStepAsync4;
                            this.L$6 = deferredAsync$default2;
                            this.label = 3;
                            objAwait = deferredAsync$default.await(this);
                            if (objAwait != coroutine_suspended) {
                                dayTradeInfo = dayTradeInfo2;
                                deferred = deferredAsync$default2;
                                list = arrayList;
                                deferred2 = deferredFetchStepAsync3;
                                deferred3 = deferredFetchStepAsync4;
                                httpUrl = (HttpUrl) objAwait;
                                this.L$0 = dayTradeInfo;
                                this.L$1 = list;
                                this.L$2 = deferredFetchStepAsync;
                                this.L$3 = deferred2;
                                this.L$4 = deferredFetchStepAsync2;
                                this.L$5 = deferred3;
                                this.L$6 = httpUrl;
                                this.label = 4;
                                objAwait2 = deferred.await(this);
                                if (objAwait2 != coroutine_suspended) {
                                    deferred4 = deferredFetchStepAsync;
                                    HttpUrl httpUrl10 = (HttpUrl) objAwait2;
                                    String introTitle = dayTradeInfo.getIntroTitle();
                                    MarkdownContent introDescriptionMarkdown = dayTradeInfo.getIntroDescriptionMarkdown();
                                    this.L$0 = deferred4;
                                    this.L$1 = deferred2;
                                    this.L$2 = deferredFetchStepAsync2;
                                    this.L$3 = deferred3;
                                    this.L$4 = httpUrl;
                                    this.L$5 = httpUrl10;
                                    this.L$6 = introTitle;
                                    this.L$7 = introDescriptionMarkdown;
                                    this.label = 5;
                                    objAwaitAll = Await2.awaitAll(list, this);
                                    if (objAwaitAll != coroutine_suspended) {
                                        Deferred deferred12 = deferredFetchStepAsync2;
                                        httpUrl2 = httpUrl10;
                                        markdownContent = introDescriptionMarkdown;
                                        deferred5 = deferred2;
                                        httpUrl3 = httpUrl;
                                        deferred6 = deferred3;
                                        str = introTitle;
                                        deferred7 = deferred12;
                                        List list4 = (List) objAwaitAll;
                                        this.L$0 = deferred5;
                                        this.L$1 = deferred7;
                                        this.L$2 = deferred6;
                                        this.L$3 = httpUrl3;
                                        this.L$4 = httpUrl2;
                                        this.L$5 = str;
                                        this.L$6 = markdownContent;
                                        this.L$7 = list4;
                                        this.label = 6;
                                        objAwait3 = deferred4.await(this);
                                        if (objAwait3 != coroutine_suspended) {
                                            HttpUrl httpUrl11 = httpUrl2;
                                            markdownContent2 = markdownContent;
                                            httpUrl4 = httpUrl3;
                                            str2 = str;
                                            list2 = list4;
                                            deferred8 = deferred6;
                                            deferred9 = deferred7;
                                            httpUrl5 = httpUrl11;
                                            UiDayTradeInfoStep uiDayTradeInfoStep5 = (UiDayTradeInfoStep) objAwait3;
                                            this.L$0 = deferred9;
                                            this.L$1 = deferred8;
                                            this.L$2 = httpUrl4;
                                            this.L$3 = httpUrl5;
                                            this.L$4 = str2;
                                            this.L$5 = markdownContent2;
                                            this.L$6 = list2;
                                            this.L$7 = uiDayTradeInfoStep5;
                                            this.label = 7;
                                            objAwait4 = deferred5.await(this);
                                            if (objAwait4 != coroutine_suspended) {
                                                Deferred deferred13 = deferred8;
                                                httpUrl6 = httpUrl4;
                                                uiDayTradeInfoStep = uiDayTradeInfoStep5;
                                                deferred10 = deferred9;
                                                deferred11 = deferred13;
                                                UiDayTradeInfoStep uiDayTradeInfoStep6 = (UiDayTradeInfoStep) objAwait4;
                                                this.L$0 = deferred11;
                                                this.L$1 = httpUrl6;
                                                this.L$2 = httpUrl5;
                                                this.L$3 = str2;
                                                this.L$4 = markdownContent2;
                                                this.L$5 = list2;
                                                this.L$6 = uiDayTradeInfoStep;
                                                this.L$7 = uiDayTradeInfoStep6;
                                                this.label = 8;
                                                objAwait5 = deferred10.await(this);
                                                if (objAwait5 != coroutine_suspended) {
                                                    MarkdownContent markdownContent4 = markdownContent2;
                                                    uiDayTradeInfoStep2 = uiDayTradeInfoStep;
                                                    httpUrl7 = httpUrl6;
                                                    str3 = str2;
                                                    list3 = list2;
                                                    uiDayTradeInfoStep3 = uiDayTradeInfoStep6;
                                                    httpUrl8 = httpUrl5;
                                                    markdownContent3 = markdownContent4;
                                                    UiDayTradeInfoStep uiDayTradeInfoStep7 = (UiDayTradeInfoStep) objAwait5;
                                                    this.L$0 = httpUrl7;
                                                    this.L$1 = httpUrl8;
                                                    this.L$2 = str3;
                                                    this.L$3 = markdownContent3;
                                                    this.L$4 = list3;
                                                    this.L$5 = uiDayTradeInfoStep2;
                                                    this.L$6 = uiDayTradeInfoStep3;
                                                    this.L$7 = uiDayTradeInfoStep7;
                                                    this.label = 9;
                                                    objAwait6 = deferred11.await(this);
                                                    if (objAwait6 != coroutine_suspended) {
                                                        httpUrl9 = httpUrl7;
                                                        uiDayTradeInfoStep4 = uiDayTradeInfoStep7;
                                                        uiDayTradeInfo = new UiDayTradeInfo(httpUrl9, httpUrl8, str3, markdownContent3, list3, uiDayTradeInfoStep2, uiDayTradeInfoStep3, (UiDayTradeInfoStep) objAwait6, uiDayTradeInfoStep4);
                                                        dayTradeInfoLoadingFragment = DayTradeInfoLoadingFragment.this;
                                                        this.L$0 = uiDayTradeInfo;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.L$4 = null;
                                                        this.L$5 = null;
                                                        this.L$6 = null;
                                                        this.L$7 = null;
                                                        this.label = 10;
                                                        if (dayTradeInfoLoadingFragment.prefetchAssets(uiDayTradeInfo, this) != coroutine_suspended) {
                                                            return uiDayTradeInfo;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    regionGateState$default = obj;
                    if (!((Boolean) regionGateState$default).booleanValue()) {
                    }
                    BrokerageResourceManager brokerageResourceManager2 = DayTradeInfoLoadingFragment.this.getBrokerageResourceManager();
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    objLoadResourceSuspend = brokerageResourceManager2.loadResourceSuspend(brokerageResource, this);
                    if (objLoadResourceSuspend != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                    objLoadResourceSuspend = obj;
                    DayTradeInfo dayTradeInfo22 = (DayTradeInfo) objLoadResourceSuspend;
                    List<ResourceLink<EntryResource<DayTradeInfoStep>>> steps2 = dayTradeInfo22.getSteps();
                    DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment22 = DayTradeInfoLoadingFragment.this;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(steps2, 10));
                    it = steps2.iterator();
                    while (it.hasNext()) {
                    }
                    deferredFetchStepAsync = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo22.getCashManagementStep());
                    Deferred deferredFetchStepAsync32 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo22.getCashManagementInterestStep());
                    deferredFetchStepAsync2 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo22.getProtectionEnabledStep());
                    Deferred deferredFetchStepAsync42 = DayTradeInfoLoadingFragment.this.fetchStepAsync(coroutineScope, dayTradeInfo22.getRecommendProtectionStep());
                    Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DayTradeInfoLoadingFragment3(DayTradeInfoLoadingFragment.this, dayTradeInfo22, null), 3, null);
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DayTradeInfoLoadingFragment2(DayTradeInfoLoadingFragment.this, dayTradeInfo22, null), 3, null);
                    this.L$0 = dayTradeInfo22;
                    this.L$1 = arrayList2;
                    this.L$2 = deferredFetchStepAsync;
                    this.L$3 = deferredFetchStepAsync32;
                    this.L$4 = deferredFetchStepAsync2;
                    this.L$5 = deferredFetchStepAsync42;
                    this.L$6 = deferredAsync$default22;
                    this.label = 3;
                    objAwait = deferredAsync$default3.await(this);
                    if (objAwait != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    deferred = (Deferred) this.L$6;
                    deferred3 = (Deferred) this.L$5;
                    deferredFetchStepAsync2 = (Deferred) this.L$4;
                    deferred2 = (Deferred) this.L$3;
                    deferredFetchStepAsync = (Deferred) this.L$2;
                    list = (List) this.L$1;
                    dayTradeInfo = (DayTradeInfo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                    httpUrl = (HttpUrl) objAwait;
                    this.L$0 = dayTradeInfo;
                    this.L$1 = list;
                    this.L$2 = deferredFetchStepAsync;
                    this.L$3 = deferred2;
                    this.L$4 = deferredFetchStepAsync2;
                    this.L$5 = deferred3;
                    this.L$6 = httpUrl;
                    this.label = 4;
                    objAwait2 = deferred.await(this);
                    if (objAwait2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    HttpUrl httpUrl12 = (HttpUrl) this.L$6;
                    deferred3 = (Deferred) this.L$5;
                    deferredFetchStepAsync2 = (Deferred) this.L$4;
                    deferred2 = (Deferred) this.L$3;
                    deferredFetchStepAsync = (Deferred) this.L$2;
                    list = (List) this.L$1;
                    dayTradeInfo = (DayTradeInfo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    httpUrl = httpUrl12;
                    objAwait2 = obj;
                    deferred4 = deferredFetchStepAsync;
                    HttpUrl httpUrl102 = (HttpUrl) objAwait2;
                    String introTitle2 = dayTradeInfo.getIntroTitle();
                    MarkdownContent introDescriptionMarkdown2 = dayTradeInfo.getIntroDescriptionMarkdown();
                    this.L$0 = deferred4;
                    this.L$1 = deferred2;
                    this.L$2 = deferredFetchStepAsync2;
                    this.L$3 = deferred3;
                    this.L$4 = httpUrl;
                    this.L$5 = httpUrl102;
                    this.L$6 = introTitle2;
                    this.L$7 = introDescriptionMarkdown2;
                    this.label = 5;
                    objAwaitAll = Await2.awaitAll(list, this);
                    if (objAwaitAll != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    markdownContent = (MarkdownContent) this.L$7;
                    str = (String) this.L$6;
                    httpUrl2 = (HttpUrl) this.L$5;
                    httpUrl3 = (HttpUrl) this.L$4;
                    Deferred deferred14 = (Deferred) this.L$3;
                    Deferred deferred15 = (Deferred) this.L$2;
                    deferred5 = (Deferred) this.L$1;
                    deferred4 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred6 = deferred14;
                    deferred7 = deferred15;
                    objAwaitAll = obj;
                    List list42 = (List) objAwaitAll;
                    this.L$0 = deferred5;
                    this.L$1 = deferred7;
                    this.L$2 = deferred6;
                    this.L$3 = httpUrl3;
                    this.L$4 = httpUrl2;
                    this.L$5 = str;
                    this.L$6 = markdownContent;
                    this.L$7 = list42;
                    this.label = 6;
                    objAwait3 = deferred4.await(this);
                    if (objAwait3 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    List list5 = (List) this.L$7;
                    MarkdownContent markdownContent5 = (MarkdownContent) this.L$6;
                    String str4 = (String) this.L$5;
                    HttpUrl httpUrl13 = (HttpUrl) this.L$4;
                    HttpUrl httpUrl14 = (HttpUrl) this.L$3;
                    deferred8 = (Deferred) this.L$2;
                    Deferred deferred16 = (Deferred) this.L$1;
                    Deferred deferred17 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list2 = list5;
                    httpUrl4 = httpUrl14;
                    httpUrl5 = httpUrl13;
                    str2 = str4;
                    markdownContent2 = markdownContent5;
                    deferred9 = deferred16;
                    deferred5 = deferred17;
                    objAwait3 = obj;
                    UiDayTradeInfoStep uiDayTradeInfoStep52 = (UiDayTradeInfoStep) objAwait3;
                    this.L$0 = deferred9;
                    this.L$1 = deferred8;
                    this.L$2 = httpUrl4;
                    this.L$3 = httpUrl5;
                    this.L$4 = str2;
                    this.L$5 = markdownContent2;
                    this.L$6 = list2;
                    this.L$7 = uiDayTradeInfoStep52;
                    this.label = 7;
                    objAwait4 = deferred5.await(this);
                    if (objAwait4 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 7:
                    uiDayTradeInfoStep = (UiDayTradeInfoStep) this.L$7;
                    list2 = (List) this.L$6;
                    markdownContent2 = (MarkdownContent) this.L$5;
                    str2 = (String) this.L$4;
                    httpUrl5 = (HttpUrl) this.L$3;
                    httpUrl6 = (HttpUrl) this.L$2;
                    Deferred deferred18 = (Deferred) this.L$1;
                    deferred10 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred11 = deferred18;
                    objAwait4 = obj;
                    UiDayTradeInfoStep uiDayTradeInfoStep62 = (UiDayTradeInfoStep) objAwait4;
                    this.L$0 = deferred11;
                    this.L$1 = httpUrl6;
                    this.L$2 = httpUrl5;
                    this.L$3 = str2;
                    this.L$4 = markdownContent2;
                    this.L$5 = list2;
                    this.L$6 = uiDayTradeInfoStep;
                    this.L$7 = uiDayTradeInfoStep62;
                    this.label = 8;
                    objAwait5 = deferred10.await(this);
                    if (objAwait5 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 8:
                    UiDayTradeInfoStep uiDayTradeInfoStep8 = (UiDayTradeInfoStep) this.L$7;
                    UiDayTradeInfoStep uiDayTradeInfoStep9 = (UiDayTradeInfoStep) this.L$6;
                    List list6 = (List) this.L$5;
                    MarkdownContent markdownContent6 = (MarkdownContent) this.L$4;
                    String str5 = (String) this.L$3;
                    HttpUrl httpUrl15 = (HttpUrl) this.L$2;
                    HttpUrl httpUrl16 = (HttpUrl) this.L$1;
                    Deferred deferred19 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiDayTradeInfoStep3 = uiDayTradeInfoStep8;
                    httpUrl7 = httpUrl16;
                    httpUrl8 = httpUrl15;
                    str3 = str5;
                    markdownContent3 = markdownContent6;
                    list3 = list6;
                    uiDayTradeInfoStep2 = uiDayTradeInfoStep9;
                    deferred11 = deferred19;
                    objAwait5 = obj;
                    UiDayTradeInfoStep uiDayTradeInfoStep72 = (UiDayTradeInfoStep) objAwait5;
                    this.L$0 = httpUrl7;
                    this.L$1 = httpUrl8;
                    this.L$2 = str3;
                    this.L$3 = markdownContent3;
                    this.L$4 = list3;
                    this.L$5 = uiDayTradeInfoStep2;
                    this.L$6 = uiDayTradeInfoStep3;
                    this.L$7 = uiDayTradeInfoStep72;
                    this.label = 9;
                    objAwait6 = deferred11.await(this);
                    if (objAwait6 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 9:
                    UiDayTradeInfoStep uiDayTradeInfoStep10 = (UiDayTradeInfoStep) this.L$7;
                    uiDayTradeInfoStep3 = (UiDayTradeInfoStep) this.L$6;
                    uiDayTradeInfoStep2 = (UiDayTradeInfoStep) this.L$5;
                    list3 = (List) this.L$4;
                    markdownContent3 = (MarkdownContent) this.L$3;
                    str3 = (String) this.L$2;
                    httpUrl8 = (HttpUrl) this.L$1;
                    HttpUrl httpUrl17 = (HttpUrl) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait6 = obj;
                    uiDayTradeInfoStep4 = uiDayTradeInfoStep10;
                    httpUrl9 = httpUrl17;
                    uiDayTradeInfo = new UiDayTradeInfo(httpUrl9, httpUrl8, str3, markdownContent3, list3, uiDayTradeInfoStep2, uiDayTradeInfoStep3, (UiDayTradeInfoStep) objAwait6, uiDayTradeInfoStep4);
                    dayTradeInfoLoadingFragment = DayTradeInfoLoadingFragment.this;
                    this.L$0 = uiDayTradeInfo;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 10;
                    if (dayTradeInfoLoadingFragment.prefetchAssets(uiDayTradeInfo, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 10:
                    UiDayTradeInfo uiDayTradeInfo2 = (UiDayTradeInfo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return uiDayTradeInfo2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$onStart$2 */
    /* synthetic */ class C210222 extends FunctionReferenceImpl implements Function1<UiDayTradeInfo, Unit> {
        C210222(Object obj) {
            super(1, obj, Callbacks.class, "onLoadDayTradeInfoSuccess", "onLoadDayTradeInfoSuccess(Lcom/robinhood/android/margin/model/UiDayTradeInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UiDayTradeInfo uiDayTradeInfo) {
            invoke2(uiDayTradeInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UiDayTradeInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onLoadDayTradeInfoSuccess(p0);
        }
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$onStart$3 */
    /* synthetic */ class C210233 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C210233(Object obj) {
            super(1, obj, Callbacks.class, "onLoadDayTradeInfoFailed", "onLoadDayTradeInfoFailed(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onLoadDayTradeInfoFailed(p0);
        }
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$fetchStepAsync$1", m3645f = "DayTradeInfoLoadingFragment.kt", m3646l = {110, 115, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$fetchStepAsync$1 */
    static final class C210191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDayTradeInfoStep>, Object> {
        final /* synthetic */ ResourceLink<EntryResource<DayTradeInfoStep>> $stepLink;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C210191(ResourceLink<EntryResource<DayTradeInfoStep>> resourceLink, Continuation<? super C210191> continuation) {
            super(2, continuation);
            this.$stepLink = resourceLink;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C210191 c210191 = DayTradeInfoLoadingFragment.this.new C210191(this.$stepLink, continuation);
            c210191.L$0 = obj;
            return c210191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDayTradeInfoStep> continuation) {
            return ((C210191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            C210191 c210191;
            Collection arrayList;
            String title;
            UiDayTradeDisclosure uiDayTradeDisclosure;
            Collection collection;
            Object objAwaitAll;
            UiDayTradeDisclosure uiDayTradeDisclosure2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                StaticContentStore staticContentStore = DayTradeInfoLoadingFragment.this.getStaticContentStore();
                ResourceLink<EntryResource<DayTradeInfoStep>> resourceLink = this.$stepLink;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
                c210191 = this;
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uiDayTradeDisclosure2 = (UiDayTradeDisclosure) this.L$1;
                    title = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new UiDayTradeInfoStep(title, uiDayTradeDisclosure2, (List) obj);
                }
                title = (String) this.L$1;
                collection = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                c210191 = this;
                Disclosure disclosure = (Disclosure) ((EntryResource) obj).getValue();
                arrayList = collection;
                uiDayTradeDisclosure = new UiDayTradeDisclosure(disclosure.getButton(), disclosure.getContent());
                c210191.L$0 = title;
                c210191.L$1 = uiDayTradeDisclosure;
                c210191.label = 3;
                objAwaitAll = Await2.awaitAll(arrayList, this);
                if (objAwaitAll != coroutine_suspended) {
                    uiDayTradeDisclosure2 = uiDayTradeDisclosure;
                    obj = objAwaitAll;
                    return new UiDayTradeInfoStep(title, uiDayTradeDisclosure2, (List) obj);
                }
                return coroutine_suspended;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c210191 = this;
            DayTradeInfoStep dayTradeInfoStep = (DayTradeInfoStep) ((EntryResource) obj).getValue();
            List<ResourceLink<EntryResource<DayTradeInfoVariant>>> variants = dayTradeInfoStep.getVariants();
            DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment = DayTradeInfoLoadingFragment.this;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(variants, 10));
            Iterator<T> it = variants.iterator();
            while (it.hasNext()) {
                arrayList.add(dayTradeInfoLoadingFragment.fetchVariantAsync(coroutineScope, (ResourceLink) it.next()));
            }
            title = dayTradeInfoStep.getTitle();
            ResourceLink<EntryResource<Disclosure>> disclosure2 = dayTradeInfoStep.getDisclosure();
            if (disclosure2 != null) {
                StaticContentStore staticContentStore2 = DayTradeInfoLoadingFragment.this.getStaticContentStore();
                c210191.L$0 = arrayList;
                c210191.L$1 = title;
                c210191.label = 2;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore2, disclosure2, null, c210191, 2, null);
                if (obj != coroutine_suspended) {
                    collection = arrayList;
                    Disclosure disclosure3 = (Disclosure) ((EntryResource) obj).getValue();
                    arrayList = collection;
                    uiDayTradeDisclosure = new UiDayTradeDisclosure(disclosure3.getButton(), disclosure3.getContent());
                    c210191.L$0 = title;
                    c210191.L$1 = uiDayTradeDisclosure;
                    c210191.label = 3;
                    objAwaitAll = Await2.awaitAll(arrayList, this);
                    if (objAwaitAll != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            uiDayTradeDisclosure = null;
            c210191.L$0 = title;
            c210191.L$1 = uiDayTradeDisclosure;
            c210191.label = 3;
            objAwaitAll = Await2.awaitAll(arrayList, this);
            if (objAwaitAll != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Deferred<UiDayTradeInfoStep> fetchStepAsync(CoroutineScope coroutineScope, ResourceLink<EntryResource<DayTradeInfoStep>> resourceLink) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C210191(resourceLink, null), 3, null);
    }

    /* compiled from: DayTradeInfoLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$fetchVariantAsync$1", m3645f = "DayTradeInfoLoadingFragment.kt", m3646l = {128, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$fetchVariantAsync$1 */
    static final class C210201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDayTradeInfoVariant>, Object> {
        final /* synthetic */ ResourceLink<EntryResource<DayTradeInfoVariant>> $variantLink;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C210201(ResourceLink<EntryResource<DayTradeInfoVariant>> resourceLink, Continuation<? super C210201> continuation) {
            super(2, continuation);
            this.$variantLink = resourceLink;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DayTradeInfoLoadingFragment.this.new C210201(this.$variantLink, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDayTradeInfoVariant> continuation) {
            return ((C210201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C210201 c210201;
            DayTradeInfoVariant dayTradeInfoVariant;
            Object objLoad$default;
            HttpUrl httpUrl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = DayTradeInfoLoadingFragment.this.getStaticContentStore();
                ResourceLink<EntryResource<DayTradeInfoVariant>> resourceLink = this.$variantLink;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
                c210201 = this;
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpUrl = (HttpUrl) this.L$1;
                    dayTradeInfoVariant = (DayTradeInfoVariant) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new UiDayTradeInfoVariant(httpUrl, ((AssetResource) obj).getContent().getFile().getUrl(), dayTradeInfoVariant.getName(), dayTradeInfoVariant.getDescriptionMarkdown());
                }
                dayTradeInfoVariant = (DayTradeInfoVariant) this.L$0;
                ResultKt.throwOnFailure(obj);
                c210201 = this;
                HttpUrl url = ((AssetResource) obj).getContent().getFile().getUrl();
                StaticContentStore staticContentStore2 = DayTradeInfoLoadingFragment.this.getStaticContentStore();
                ResourceLink<AssetResource<?>> mobileImageAssetDark = dayTradeInfoVariant.getMobileImageAssetDark();
                c210201.L$0 = dayTradeInfoVariant;
                c210201.L$1 = url;
                c210201.label = 3;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, mobileImageAssetDark, null, c210201, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    httpUrl = url;
                    obj = objLoad$default;
                    return new UiDayTradeInfoVariant(httpUrl, ((AssetResource) obj).getContent().getFile().getUrl(), dayTradeInfoVariant.getName(), dayTradeInfoVariant.getDescriptionMarkdown());
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            c210201 = this;
            DayTradeInfoVariant dayTradeInfoVariant2 = (DayTradeInfoVariant) ((EntryResource) obj).getValue();
            StaticContentStore staticContentStore3 = DayTradeInfoLoadingFragment.this.getStaticContentStore();
            ResourceLink<AssetResource<?>> mobileImageAssetLight = dayTradeInfoVariant2.getMobileImageAssetLight();
            c210201.L$0 = dayTradeInfoVariant2;
            c210201.label = 2;
            Object objLoad$default2 = ContentRepository.DefaultImpls.load$default(staticContentStore3, mobileImageAssetLight, null, c210201, 2, null);
            if (objLoad$default2 != coroutine_suspended) {
                dayTradeInfoVariant = dayTradeInfoVariant2;
                obj = objLoad$default2;
                HttpUrl url2 = ((AssetResource) obj).getContent().getFile().getUrl();
                StaticContentStore staticContentStore22 = DayTradeInfoLoadingFragment.this.getStaticContentStore();
                ResourceLink<AssetResource<?>> mobileImageAssetDark2 = dayTradeInfoVariant.getMobileImageAssetDark();
                c210201.L$0 = dayTradeInfoVariant;
                c210201.L$1 = url2;
                c210201.label = 3;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore22, mobileImageAssetDark2, null, c210201, 2, null);
                if (objLoad$default != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Deferred<UiDayTradeInfoVariant> fetchVariantAsync(CoroutineScope coroutineScope, ResourceLink<EntryResource<DayTradeInfoVariant>> resourceLink) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C210201(resourceLink, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0136 -> B:29:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prefetchAssets(UiDayTradeInfo uiDayTradeInfo, Continuation<? super Unit> continuation) {
        C210241 c210241;
        UiDayTradeInfo uiDayTradeInfo2;
        Iterator it;
        UiDayTradeInfo uiDayTradeInfo3;
        UiDayTradeInfoVariant uiDayTradeInfoVariant;
        Iterator it2;
        int i;
        HttpUrl mobileImageUrlDark;
        ImageLoader.Priority priority;
        UiDayTradeInfo uiDayTradeInfo4 = uiDayTradeInfo;
        if (continuation instanceof C210241) {
            c210241 = (C210241) continuation;
            int i2 = c210241.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c210241.label = i2 - Integer.MIN_VALUE;
            } else {
                c210241 = new C210241(continuation);
            }
        }
        C210241 c2102412 = c210241;
        Object obj = c2102412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2102412.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpUrl httpUrlImageUrlForDayNightMode = uiDayTradeInfo4.imageUrlForDayNightMode(getNightModeManager().getDayNightMode());
            c2102412.L$0 = uiDayTradeInfo4;
            c2102412.L$1 = uiDayTradeInfo4;
            c2102412.label = 1;
            if (prefetchImage$default(this, httpUrlImageUrlForDayNightMode, true, null, c2102412, 4, null) != coroutine_suspended) {
                uiDayTradeInfo2 = uiDayTradeInfo4;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            uiDayTradeInfo4 = (UiDayTradeInfo) c2102412.L$1;
            uiDayTradeInfo2 = (UiDayTradeInfo) c2102412.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i3 == 2) {
                i = c2102412.I$0;
                uiDayTradeInfoVariant = (UiDayTradeInfoVariant) c2102412.L$2;
                Iterator it3 = (Iterator) c2102412.L$1;
                UiDayTradeInfo uiDayTradeInfo5 = (UiDayTradeInfo) c2102412.L$0;
                ResultKt.throwOnFailure(obj);
                it2 = it3;
                uiDayTradeInfo3 = uiDayTradeInfo5;
                mobileImageUrlDark = uiDayTradeInfoVariant.getMobileImageUrlDark();
                priority = i == 0 ? ImageLoader.Priority.LOW : ImageLoader.Priority.NORMAL;
                c2102412.L$0 = uiDayTradeInfo3;
                c2102412.L$1 = it2;
                c2102412.L$2 = null;
                c2102412.label = 3;
                if (prefetchImage$default(this, mobileImageUrlDark, false, priority, c2102412, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c2102412.L$1;
            uiDayTradeInfo2 = (UiDayTradeInfo) c2102412.L$0;
            ResultKt.throwOnFailure(obj);
            UiDayTradeInfo uiDayTradeInfo6 = uiDayTradeInfo2;
            if (it.hasNext()) {
                UiDayTradeInfoVariant uiDayTradeInfoVariant2 = (UiDayTradeInfoVariant) it.next();
                int i4 = getNightModeManager().getDayNightMode() == NightModeManager2.DAY ? 1 : 0;
                HttpUrl mobileImageUrlLight = uiDayTradeInfoVariant2.getMobileImageUrlLight();
                ImageLoader.Priority priority2 = i4 != 0 ? ImageLoader.Priority.NORMAL : ImageLoader.Priority.LOW;
                c2102412.L$0 = uiDayTradeInfo6;
                c2102412.L$1 = it;
                c2102412.L$2 = uiDayTradeInfoVariant2;
                c2102412.I$0 = i4;
                c2102412.label = 2;
                if (prefetchImage$default(this, mobileImageUrlLight, false, priority2, c2102412, 2, null) != coroutine_suspended) {
                    uiDayTradeInfoVariant = uiDayTradeInfoVariant2;
                    uiDayTradeInfo3 = uiDayTradeInfo6;
                    it2 = it;
                    i = i4;
                    mobileImageUrlDark = uiDayTradeInfoVariant.getMobileImageUrlDark();
                    priority = i == 0 ? ImageLoader.Priority.LOW : ImageLoader.Priority.NORMAL;
                    c2102412.L$0 = uiDayTradeInfo3;
                    c2102412.L$1 = it2;
                    c2102412.L$2 = null;
                    c2102412.label = 3;
                    if (prefetchImage$default(this, mobileImageUrlDark, false, priority, c2102412, 2, null) != coroutine_suspended) {
                        it = it2;
                        uiDayTradeInfo6 = uiDayTradeInfo3;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        List listPlus = CollectionsKt.plus((Collection<? extends UiDayTradeInfoStep>) CollectionsKt.plus((Collection<? extends UiDayTradeInfoStep>) CollectionsKt.plus((Collection<? extends UiDayTradeInfoStep>) uiDayTradeInfo4.getSteps(), uiDayTradeInfo4.getCashManagementStep()), uiDayTradeInfo4.getProtectionEnabledStep()), uiDayTradeInfo4.getRecommendProtectionStep());
        ArrayList arrayList = new ArrayList();
        Iterator it4 = listPlus.iterator();
        while (it4.hasNext()) {
            CollectionsKt.addAll(arrayList, ((UiDayTradeInfoStep) it4.next()).getVariants());
        }
        it = arrayList.iterator();
        UiDayTradeInfo uiDayTradeInfo62 = uiDayTradeInfo2;
        if (it.hasNext()) {
        }
    }

    static /* synthetic */ Object prefetchImage$default(DayTradeInfoLoadingFragment dayTradeInfoLoadingFragment, HttpUrl httpUrl, boolean z, ImageLoader.Priority priority, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            priority = ImageLoader.Priority.NORMAL;
        }
        return dayTradeInfoLoadingFragment.prefetchImage(httpUrl, z, priority, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prefetchImage(HttpUrl httpUrl, boolean z, ImageLoader.Priority priority, Continuation<? super Unit> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        if (z) {
            getImageLoader().load(httpUrl).priority(priority).fetch(new Function0<Unit>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$prefetchImage$2$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Continuation<Unit> continuation2 = safeContinuationJvm;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                }
            }, new Function0<Unit>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment$prefetchImage$2$2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Continuation<Unit> continuation2 = safeContinuationJvm;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                }
            });
        } else {
            ImageLoader.ImageRequest.DefaultImpls.fetch$default(getImageLoader().load(httpUrl).priority(priority), null, null, 3, null);
            Result.Companion companion = Result.INSTANCE;
            safeContinuationJvm.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
        }
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }
}
