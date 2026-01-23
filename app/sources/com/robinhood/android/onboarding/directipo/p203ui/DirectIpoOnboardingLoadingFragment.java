package com.robinhood.android.onboarding.directipo.p203ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieCompositionFactory;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboarding;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingLearnMore;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingLearnMoreAction;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingStep;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingLoadingFragment;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboarding;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingLearnMore;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingLearnMoreAction;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingStep;
import com.robinhood.staticcontent.model.directipo.MultipleDensityImageAsset;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* compiled from: DirectIpoOnboardingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0003456B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\"H\u0002J\t\u0010.\u001a\u00020$H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)*\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "getStaticContentStore", "()Lcom/robinhood/contentful/StaticContentStore;", "setStaticContentStore", "(Lcom/robinhood/contentful/StaticContentStore;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "callbacks", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "PreviewContent", "onStart", "prefetchAssets", "onboarding", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "(Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefetchImage", MarkdownText4.TagImageUrl, "Lokhttp3/HttpUrl;", "synchronous", "", "(Lokhttp3/HttpUrl;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefetchAnimation", "animationUrl", "image", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "getImage", "(Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;)Lcom/robinhood/contentful/model/ResourceLink;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DirectIpoOnboardingLoadingFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DirectIpoOnboardingLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public ImageLoader imageLoader;
    public StaticContentStore staticContentStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOnboardingLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Callbacks;", "", "onLoadDirectIpoOnboardingSuccess", "", "onboarding", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "onLoadDirectIpoOnboardingFailed", "throwable", "", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadDirectIpoOnboardingFailed(Throwable throwable);

        void onLoadDirectIpoOnboardingSuccess(UiDirectIpoOnboarding onboarding);
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextsUiExtensions2.values().length];
            try {
                iArr[ContextsUiExtensions2.MDPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextsUiExtensions2.HDPI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextsUiExtensions2.XHDPI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContextsUiExtensions2.XXHDPI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment", m3645f = "DirectIpoOnboardingLoadingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 192}, m3647m = "prefetchAssets")
    /* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$prefetchAssets$1 */
    static final class C227641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C227641(Continuation<? super C227641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DirectIpoOnboardingLoadingFragment.this.prefetchAssets(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, int i, Composer composer, int i2) {
        directIpoOnboardingLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewContent$lambda$1(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, int i, Composer composer, int i2) {
        directIpoOnboardingLoadingFragment.PreviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-532083851);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532083851, i, -1, "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.ComposeContent (DirectIpoOnboardingLoadingFragment.kt:68)");
            }
            LocalShowPlaceholder.Loadable(true, WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), null, DirectIpoOnboardingLoadingFragment2.INSTANCE.getLambda$1747199973$feature_direct_ipo_onboarding_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectIpoOnboardingLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void PreviewContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(720826751);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(720826751, i2, -1, "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.PreviewContent (DirectIpoOnboardingLoadingFragment.kt:99)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2091870009, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.PreviewContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2091870009, i3, -1, "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.PreviewContent.<anonymous> (DirectIpoOnboardingLoadingFragment.kt:101)");
                    }
                    DirectIpoOnboardingLoadingFragment.this.ComposeContent(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectIpoOnboardingLoadingFragment.PreviewContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new C227611(null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C227622(getCallbacks()), new C227633(getCallbacks()));
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1", m3645f = "DirectIpoOnboardingLoadingFragment.kt", m3646l = {110, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 156, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$1 */
    static final class C227611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiDirectIpoOnboarding>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        C227611(Continuation<? super C227611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C227611 c227611 = DirectIpoOnboardingLoadingFragment.this.new C227611(continuation);
            c227611.L$0 = obj;
            return c227611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiDirectIpoOnboarding> continuation) {
            return ((C227611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0136 A[LOOP:1: B:19:0x0130->B:21:0x0136, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0194 A[LOOP:0: B:27:0x018e->B:29:0x0194, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02af A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objLoadEntry$default;
            Iterator<T> it;
            Object objLoad$default;
            List list;
            DirectIpoOnboarding directIpoOnboarding;
            DirectIpoOnboardingLearnMore directIpoOnboardingLearnMore;
            Iterator<T> it2;
            Object objAwait;
            DirectIpoOnboarding directIpoOnboarding2;
            Deferred deferred;
            List list2;
            HttpUrl httpUrl;
            String title;
            Object objAwaitAll;
            int i;
            int i2;
            List list3;
            DirectIpoOnboardingLearnMore directIpoOnboardingLearnMore2;
            MarkdownContent markdownContent;
            DirectIpoOnboarding directIpoOnboarding3;
            Object objAwait2;
            MarkdownContent markdownContent2;
            List list4;
            List list5;
            String title2;
            Object objAwaitAll2;
            List list6;
            MarkdownContent markdownContent3;
            int i3;
            DirectIpoOnboarding directIpoOnboarding4;
            int i4;
            HttpUrl httpUrl2;
            HttpUrl httpUrl3;
            UiDirectIpoOnboarding uiDirectIpoOnboarding;
            DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    StaticContentStore staticContentStore = DirectIpoOnboardingLoadingFragment.this.getStaticContentStore();
                    String contentfulResourceId = ((Args) DirectIpoOnboardingLoadingFragment.INSTANCE.getArgs((Fragment) DirectIpoOnboardingLoadingFragment.this)).getContentfulResourceId();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulResourceId, null, this, 2, null);
                    if (objLoadEntry$default != coroutine_suspended) {
                        DirectIpoOnboarding directIpoOnboarding5 = (DirectIpoOnboarding) ((EntryResource) objLoadEntry$default).getValue();
                        List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> steps = directIpoOnboarding5.getSteps();
                        DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment2 = DirectIpoOnboardingLoadingFragment.this;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(steps, 10));
                        it = steps.iterator();
                        while (it.hasNext()) {
                            arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment7(directIpoOnboardingLoadingFragment2, (ResourceLink) it.next(), null), 3, null));
                        }
                        StaticContentStore staticContentStore2 = DirectIpoOnboardingLoadingFragment.this.getStaticContentStore();
                        ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> learnMore = directIpoOnboarding5.getLearnMore();
                        this.L$0 = coroutineScope;
                        this.L$1 = directIpoOnboarding5;
                        this.L$2 = arrayList;
                        this.label = 2;
                        objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, learnMore, null, this, 2, null);
                        if (objLoad$default != coroutine_suspended) {
                            list = arrayList;
                            directIpoOnboarding = directIpoOnboarding5;
                            directIpoOnboardingLearnMore = (DirectIpoOnboardingLearnMore) ((EntryResource) objLoad$default).getValue();
                            List<ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>>> actions = directIpoOnboardingLearnMore.getActions();
                            DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment3 = DirectIpoOnboardingLoadingFragment.this;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
                            it2 = actions.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment4(directIpoOnboardingLoadingFragment3, (ResourceLink) it2.next(), null), 3, null));
                            }
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment5(DirectIpoOnboardingLoadingFragment.this, directIpoOnboarding, null), 3, null);
                            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment6(DirectIpoOnboardingLoadingFragment.this, directIpoOnboardingLearnMore, null), 3, null);
                            this.L$0 = directIpoOnboarding;
                            this.L$1 = list;
                            this.L$2 = directIpoOnboardingLearnMore;
                            this.L$3 = arrayList2;
                            this.L$4 = deferredAsync$default2;
                            this.label = 3;
                            objAwait = deferredAsync$default.await(this);
                            if (objAwait != coroutine_suspended) {
                                directIpoOnboarding2 = directIpoOnboarding;
                                deferred = deferredAsync$default2;
                                list2 = arrayList2;
                                httpUrl = (HttpUrl) objAwait;
                                int color = Color.parseColor(directIpoOnboarding2.getMobileIntroForegroundColor());
                                int color2 = Color.parseColor(directIpoOnboarding2.getMobileIntroBackgroundColor());
                                title = directIpoOnboarding2.getTitle();
                                MarkdownContent descriptionMarkdown = directIpoOnboarding2.getDescriptionMarkdown();
                                this.L$0 = directIpoOnboarding2;
                                this.L$1 = directIpoOnboardingLearnMore;
                                this.L$2 = list2;
                                this.L$3 = deferred;
                                this.L$4 = httpUrl;
                                this.L$5 = title;
                                this.L$6 = descriptionMarkdown;
                                this.I$0 = color;
                                this.I$1 = color2;
                                this.label = 4;
                                objAwaitAll = Await2.awaitAll(list, this);
                                if (objAwaitAll != coroutine_suspended) {
                                    List list7 = list2;
                                    i = color;
                                    i2 = color2;
                                    list3 = list7;
                                    DirectIpoOnboarding directIpoOnboarding6 = directIpoOnboarding2;
                                    directIpoOnboardingLearnMore2 = directIpoOnboardingLearnMore;
                                    markdownContent = descriptionMarkdown;
                                    directIpoOnboarding3 = directIpoOnboarding6;
                                    List list8 = (List) objAwaitAll;
                                    this.L$0 = directIpoOnboarding3;
                                    this.L$1 = directIpoOnboardingLearnMore2;
                                    this.L$2 = list3;
                                    this.L$3 = httpUrl;
                                    this.L$4 = title;
                                    this.L$5 = markdownContent;
                                    this.L$6 = list8;
                                    this.I$0 = i;
                                    this.I$1 = i2;
                                    this.label = 5;
                                    objAwait2 = deferred.await(this);
                                    if (objAwait2 != coroutine_suspended) {
                                        List list9 = list3;
                                        markdownContent2 = markdownContent;
                                        list4 = list8;
                                        list5 = list9;
                                        HttpUrl httpUrl4 = (HttpUrl) objAwait2;
                                        title2 = directIpoOnboardingLearnMore2.getTitle();
                                        MarkdownContent descriptionMarkdown2 = directIpoOnboardingLearnMore2.getDescriptionMarkdown();
                                        this.L$0 = directIpoOnboarding3;
                                        this.L$1 = httpUrl;
                                        this.L$2 = title;
                                        this.L$3 = markdownContent2;
                                        this.L$4 = list4;
                                        this.L$5 = httpUrl4;
                                        this.L$6 = title2;
                                        this.L$7 = descriptionMarkdown2;
                                        this.I$0 = i;
                                        this.I$1 = i2;
                                        this.label = 6;
                                        objAwaitAll2 = Await2.awaitAll(list5, this);
                                        if (objAwaitAll2 != coroutine_suspended) {
                                            list6 = list4;
                                            markdownContent3 = descriptionMarkdown2;
                                            i3 = i;
                                            directIpoOnboarding4 = directIpoOnboarding3;
                                            i4 = i2;
                                            httpUrl2 = httpUrl;
                                            httpUrl3 = httpUrl4;
                                            String str = title;
                                            uiDirectIpoOnboarding = new UiDirectIpoOnboarding(httpUrl2, i3, i4, str, markdownContent2, list6, new UiDirectIpoOnboardingLearnMore(httpUrl3, title2, markdownContent3, (List) objAwaitAll2), directIpoOnboarding4.getViewAvailableIPOsUrl(), directIpoOnboarding4.getViewAvailableIPOsButtonTitle());
                                            directIpoOnboardingLoadingFragment = DirectIpoOnboardingLoadingFragment.this;
                                            this.L$0 = uiDirectIpoOnboarding;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.label = 7;
                                            if (directIpoOnboardingLoadingFragment.prefetchAssets(uiDirectIpoOnboarding, this) != coroutine_suspended) {
                                                return uiDirectIpoOnboarding;
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
                    objLoadEntry$default = obj;
                    DirectIpoOnboarding directIpoOnboarding52 = (DirectIpoOnboarding) ((EntryResource) objLoadEntry$default).getValue();
                    List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> steps2 = directIpoOnboarding52.getSteps();
                    DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment22 = DirectIpoOnboardingLoadingFragment.this;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(steps2, 10));
                    it = steps2.iterator();
                    while (it.hasNext()) {
                    }
                    StaticContentStore staticContentStore22 = DirectIpoOnboardingLoadingFragment.this.getStaticContentStore();
                    ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> learnMore2 = directIpoOnboarding52.getLearnMore();
                    this.L$0 = coroutineScope;
                    this.L$1 = directIpoOnboarding52;
                    this.L$2 = arrayList3;
                    this.label = 2;
                    objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore22, learnMore2, null, this, 2, null);
                    if (objLoad$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    List list10 = (List) this.L$2;
                    directIpoOnboarding = (DirectIpoOnboarding) this.L$1;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = list10;
                    coroutineScope = coroutineScope3;
                    objLoad$default = obj;
                    directIpoOnboardingLearnMore = (DirectIpoOnboardingLearnMore) ((EntryResource) objLoad$default).getValue();
                    List<ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>>> actions2 = directIpoOnboardingLearnMore.getActions();
                    DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment32 = DirectIpoOnboardingLoadingFragment.this;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions2, 10));
                    it2 = actions2.iterator();
                    while (it2.hasNext()) {
                    }
                    Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment5(DirectIpoOnboardingLoadingFragment.this, directIpoOnboarding, null), 3, null);
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOnboardingLoadingFragment6(DirectIpoOnboardingLoadingFragment.this, directIpoOnboardingLearnMore, null), 3, null);
                    this.L$0 = directIpoOnboarding;
                    this.L$1 = list;
                    this.L$2 = directIpoOnboardingLearnMore;
                    this.L$3 = arrayList22;
                    this.L$4 = deferredAsync$default22;
                    this.label = 3;
                    objAwait = deferredAsync$default3.await(this);
                    if (objAwait != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    Deferred deferred2 = (Deferred) this.L$4;
                    list2 = (List) this.L$3;
                    directIpoOnboardingLearnMore = (DirectIpoOnboardingLearnMore) this.L$2;
                    list = (List) this.L$1;
                    DirectIpoOnboarding directIpoOnboarding7 = (DirectIpoOnboarding) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred = deferred2;
                    directIpoOnboarding2 = directIpoOnboarding7;
                    objAwait = obj;
                    httpUrl = (HttpUrl) objAwait;
                    int color3 = Color.parseColor(directIpoOnboarding2.getMobileIntroForegroundColor());
                    int color22 = Color.parseColor(directIpoOnboarding2.getMobileIntroBackgroundColor());
                    title = directIpoOnboarding2.getTitle();
                    MarkdownContent descriptionMarkdown3 = directIpoOnboarding2.getDescriptionMarkdown();
                    this.L$0 = directIpoOnboarding2;
                    this.L$1 = directIpoOnboardingLearnMore;
                    this.L$2 = list2;
                    this.L$3 = deferred;
                    this.L$4 = httpUrl;
                    this.L$5 = title;
                    this.L$6 = descriptionMarkdown3;
                    this.I$0 = color3;
                    this.I$1 = color22;
                    this.label = 4;
                    objAwaitAll = Await2.awaitAll(list, this);
                    if (objAwaitAll != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    i2 = this.I$1;
                    i = this.I$0;
                    markdownContent = (MarkdownContent) this.L$6;
                    String str2 = (String) this.L$5;
                    httpUrl = (HttpUrl) this.L$4;
                    deferred = (Deferred) this.L$3;
                    list3 = (List) this.L$2;
                    DirectIpoOnboardingLearnMore directIpoOnboardingLearnMore3 = (DirectIpoOnboardingLearnMore) this.L$1;
                    DirectIpoOnboarding directIpoOnboarding8 = (DirectIpoOnboarding) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    directIpoOnboarding3 = directIpoOnboarding8;
                    directIpoOnboardingLearnMore2 = directIpoOnboardingLearnMore3;
                    title = str2;
                    objAwaitAll = obj;
                    List list82 = (List) objAwaitAll;
                    this.L$0 = directIpoOnboarding3;
                    this.L$1 = directIpoOnboardingLearnMore2;
                    this.L$2 = list3;
                    this.L$3 = httpUrl;
                    this.L$4 = title;
                    this.L$5 = markdownContent;
                    this.L$6 = list82;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 5;
                    objAwait2 = deferred.await(this);
                    if (objAwait2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    i2 = this.I$1;
                    i = this.I$0;
                    list4 = (List) this.L$6;
                    MarkdownContent markdownContent4 = (MarkdownContent) this.L$5;
                    String str3 = (String) this.L$4;
                    HttpUrl httpUrl5 = (HttpUrl) this.L$3;
                    List list11 = (List) this.L$2;
                    DirectIpoOnboardingLearnMore directIpoOnboardingLearnMore4 = (DirectIpoOnboardingLearnMore) this.L$1;
                    DirectIpoOnboarding directIpoOnboarding9 = (DirectIpoOnboarding) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    markdownContent2 = markdownContent4;
                    list5 = list11;
                    directIpoOnboarding3 = directIpoOnboarding9;
                    directIpoOnboardingLearnMore2 = directIpoOnboardingLearnMore4;
                    title = str3;
                    httpUrl = httpUrl5;
                    objAwait2 = obj;
                    HttpUrl httpUrl42 = (HttpUrl) objAwait2;
                    title2 = directIpoOnboardingLearnMore2.getTitle();
                    MarkdownContent descriptionMarkdown22 = directIpoOnboardingLearnMore2.getDescriptionMarkdown();
                    this.L$0 = directIpoOnboarding3;
                    this.L$1 = httpUrl;
                    this.L$2 = title;
                    this.L$3 = markdownContent2;
                    this.L$4 = list4;
                    this.L$5 = httpUrl42;
                    this.L$6 = title2;
                    this.L$7 = descriptionMarkdown22;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 6;
                    objAwaitAll2 = Await2.awaitAll(list5, this);
                    if (objAwaitAll2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    markdownContent3 = (MarkdownContent) this.L$7;
                    String str4 = (String) this.L$6;
                    httpUrl3 = (HttpUrl) this.L$5;
                    List list12 = (List) this.L$4;
                    markdownContent2 = (MarkdownContent) this.L$3;
                    title = (String) this.L$2;
                    HttpUrl httpUrl6 = (HttpUrl) this.L$1;
                    DirectIpoOnboarding directIpoOnboarding10 = (DirectIpoOnboarding) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i4 = i5;
                    httpUrl2 = httpUrl6;
                    i3 = i6;
                    directIpoOnboarding4 = directIpoOnboarding10;
                    title2 = str4;
                    list6 = list12;
                    objAwaitAll2 = obj;
                    String str5 = title;
                    uiDirectIpoOnboarding = new UiDirectIpoOnboarding(httpUrl2, i3, i4, str5, markdownContent2, list6, new UiDirectIpoOnboardingLearnMore(httpUrl3, title2, markdownContent3, (List) objAwaitAll2), directIpoOnboarding4.getViewAvailableIPOsUrl(), directIpoOnboarding4.getViewAvailableIPOsButtonTitle());
                    directIpoOnboardingLoadingFragment = DirectIpoOnboardingLoadingFragment.this;
                    this.L$0 = uiDirectIpoOnboarding;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 7;
                    if (directIpoOnboardingLoadingFragment.prefetchAssets(uiDirectIpoOnboarding, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 7:
                    UiDirectIpoOnboarding uiDirectIpoOnboarding2 = (UiDirectIpoOnboarding) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return uiDirectIpoOnboarding2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$2 */
    /* synthetic */ class C227622 extends FunctionReferenceImpl implements Function1<UiDirectIpoOnboarding, Unit> {
        C227622(Object obj) {
            super(1, obj, Callbacks.class, "onLoadDirectIpoOnboardingSuccess", "onLoadDirectIpoOnboardingSuccess(Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UiDirectIpoOnboarding uiDirectIpoOnboarding) {
            invoke2(uiDirectIpoOnboarding);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UiDirectIpoOnboarding p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onLoadDirectIpoOnboardingSuccess(p0);
        }
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$onStart$3 */
    /* synthetic */ class C227633 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C227633(Object obj) {
            super(1, obj, Callbacks.class, "onLoadDirectIpoOnboardingFailed", "onLoadDirectIpoOnboardingFailed(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onLoadDirectIpoOnboardingFailed(p0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prefetchAssets(UiDirectIpoOnboarding uiDirectIpoOnboarding, Continuation<? super Unit> continuation) {
        C227641 c227641;
        UiDirectIpoOnboarding uiDirectIpoOnboarding2;
        UiDirectIpoOnboarding uiDirectIpoOnboarding3;
        UiDirectIpoOnboarding uiDirectIpoOnboarding4;
        UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore;
        UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore2;
        Iterator it;
        if (continuation instanceof C227641) {
            c227641 = (C227641) continuation;
            int i = c227641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c227641.label = i - Integer.MIN_VALUE;
            } else {
                c227641 = new C227641(continuation);
            }
        }
        Object obj = c227641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c227641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpUrl introImageUrl = uiDirectIpoOnboarding.getIntroImageUrl();
            c227641.L$0 = uiDirectIpoOnboarding;
            c227641.L$1 = uiDirectIpoOnboarding;
            c227641.label = 1;
            if (prefetchImage(introImageUrl, true, c227641) != coroutine_suspended) {
                uiDirectIpoOnboarding2 = uiDirectIpoOnboarding;
                uiDirectIpoOnboarding3 = uiDirectIpoOnboarding2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uiDirectIpoOnboardingLearnMore = (UiDirectIpoOnboardingLearnMore) c227641.L$2;
                uiDirectIpoOnboardingLearnMore2 = (UiDirectIpoOnboardingLearnMore) c227641.L$1;
                uiDirectIpoOnboarding4 = (UiDirectIpoOnboarding) c227641.L$0;
                ResultKt.throwOnFailure(obj);
                it = uiDirectIpoOnboardingLearnMore.getActions().iterator();
                UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore3 = uiDirectIpoOnboardingLearnMore2;
                UiDirectIpoOnboarding uiDirectIpoOnboarding5 = uiDirectIpoOnboarding4;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) c227641.L$2;
            uiDirectIpoOnboardingLearnMore2 = (UiDirectIpoOnboardingLearnMore) c227641.L$1;
            uiDirectIpoOnboarding4 = (UiDirectIpoOnboarding) c227641.L$0;
            ResultKt.throwOnFailure(obj);
            it = it2;
            UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore32 = uiDirectIpoOnboardingLearnMore2;
            UiDirectIpoOnboarding uiDirectIpoOnboarding52 = uiDirectIpoOnboarding4;
            while (it.hasNext()) {
                HttpUrl iconUrl = ((UiDirectIpoOnboardingLearnMoreAction) it.next()).getIconUrl();
                c227641.L$0 = uiDirectIpoOnboarding52;
                c227641.L$1 = uiDirectIpoOnboardingLearnMore32;
                c227641.L$2 = it;
                c227641.label = 3;
                if (prefetchImage$default(this, iconUrl, false, c227641, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        uiDirectIpoOnboarding2 = (UiDirectIpoOnboarding) c227641.L$1;
        UiDirectIpoOnboarding uiDirectIpoOnboarding6 = (UiDirectIpoOnboarding) c227641.L$0;
        ResultKt.throwOnFailure(obj);
        uiDirectIpoOnboarding3 = uiDirectIpoOnboarding6;
        Iterator<T> it3 = uiDirectIpoOnboarding2.getSteps().iterator();
        while (it3.hasNext()) {
            prefetchAnimation(((UiDirectIpoOnboardingStep) it3.next()).getAnimationUrl());
        }
        UiDirectIpoOnboardingLearnMore learnMore = uiDirectIpoOnboarding2.getLearnMore();
        HttpUrl iconUrl2 = learnMore.getIconUrl();
        c227641.L$0 = uiDirectIpoOnboarding3;
        c227641.L$1 = learnMore;
        c227641.L$2 = learnMore;
        c227641.label = 2;
        if (prefetchImage$default(this, iconUrl2, false, c227641, 2, null) != coroutine_suspended) {
            uiDirectIpoOnboarding4 = uiDirectIpoOnboarding3;
            uiDirectIpoOnboardingLearnMore = learnMore;
            uiDirectIpoOnboardingLearnMore2 = uiDirectIpoOnboardingLearnMore;
            it = uiDirectIpoOnboardingLearnMore.getActions().iterator();
            UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore322 = uiDirectIpoOnboardingLearnMore2;
            UiDirectIpoOnboarding uiDirectIpoOnboarding522 = uiDirectIpoOnboarding4;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    static /* synthetic */ Object prefetchImage$default(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, HttpUrl httpUrl, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return directIpoOnboardingLoadingFragment.prefetchImage(httpUrl, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prefetchImage(HttpUrl httpUrl, boolean z, Continuation<? super Unit> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        if (z) {
            getImageLoader().load(httpUrl).fetch(new Function0<Unit>() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$prefetchImage$2$1
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
            }, new Function0<Unit>() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment$prefetchImage$2$2
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
            ImageLoader.ImageRequest.DefaultImpls.fetch$default(getImageLoader().load(httpUrl), null, null, 3, null);
            Result.Companion companion = Result.INSTANCE;
            safeContinuationJvm.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
        }
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    private final void prefetchAnimation(HttpUrl animationUrl) {
        LottieCompositionFactory.fromUrl(getContext(), animationUrl.getUrl());
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Args;", "Landroid/os/Parcelable;", "contentfulResourceId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulResourceId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String contentfulResourceId;

        /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.contentfulResourceId;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentfulResourceId() {
            return this.contentfulResourceId;
        }

        public final Args copy(String contentfulResourceId) {
            Intrinsics.checkNotNullParameter(contentfulResourceId, "contentfulResourceId");
            return new Args(contentfulResourceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.contentfulResourceId, ((Args) other).contentfulResourceId);
        }

        public int hashCode() {
            return this.contentfulResourceId.hashCode();
        }

        public String toString() {
            return "Args(contentfulResourceId=" + this.contentfulResourceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contentfulResourceId);
        }

        public Args(String contentfulResourceId) {
            Intrinsics.checkNotNullParameter(contentfulResourceId, "contentfulResourceId");
            this.contentfulResourceId = contentfulResourceId;
        }

        public final String getContentfulResourceId() {
            return this.contentfulResourceId;
        }
    }

    public final ResourceLink<AssetResource<?>> getImage(MultipleDensityImageAsset multipleDensityImageAsset) {
        Intrinsics.checkNotNullParameter(multipleDensityImageAsset, "<this>");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[ContextsUiExtensions.getDensitySpec(contextRequireContext).ordinal()];
        if (i == 1) {
            return multipleDensityImageAsset.getImage1x();
        }
        if (i == 2) {
            return multipleDensityImageAsset.getImage1Dot5x();
        }
        if (i == 3) {
            return multipleDensityImageAsset.getImage2x();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return multipleDensityImageAsset.getImage3x();
    }

    /* compiled from: DirectIpoOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Args;", "<init>", "()V", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOnboardingLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOnboardingLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOnboardingLoadingFragment newInstance(Args args) {
            return (DirectIpoOnboardingLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOnboardingLoadingFragment directIpoOnboardingLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOnboardingLoadingFragment, args);
        }
    }
}
