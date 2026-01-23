package com.robinhood.android.advancedchart.onboarding;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advancedchart.AdvancedChartLoggings3;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartOnboardingFragmentKey;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedChartOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\r\u0010\u001d\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u001eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/onboarding/AdvancedChartOnboardingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "searchSelectorLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "toolbarHeight", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onStop", "tintNavIcon", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-advanced-chart_externalDebug", "onboardingLottie", "Lcom/airbnb/lottie/LottieComposition;", "onboardingLottieAspectRatio", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartOnboardingFragment extends GenericComposeFragment {
    private static final int SYSTEM_UI_FLAGS = 9472;
    public EventLogger eventLogger;
    private ActivityResultLauncher<Intent> searchSelectorLauncher;
    private final SnapshotState<C2002Dp> toolbarHeight = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(AdvancedChartOnboardingFragment advancedChartOnboardingFragment, int i, Composer composer, int i2) {
        advancedChartOnboardingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.searchSelectorLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment.onCreate.1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    AdvancedChartOnboardingFragment.this.requireActivity().finish();
                }
            }
        });
    }

    private static final LottieComposition ComposeContent$lambda$2(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float ComposeContent$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
        ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(final RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
        tintNavIcon();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxView.layoutChanges(toolbar)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartOnboardingFragment.configureToolbar$lambda$0(this.f$0, toolbar, (Unit) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getScarletManager().getThemeChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartOnboardingFragment.configureToolbar$lambda$1(this.f$0, (ThemeNode) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$0(AdvancedChartOnboardingFragment advancedChartOnboardingFragment, RhToolbar rhToolbar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartOnboardingFragment.toolbarHeight.setValue(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl((int) (rhToolbar.getHeight() / advancedChartOnboardingFragment.getResources().getDisplayMetrics().density))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$1(AdvancedChartOnboardingFragment advancedChartOnboardingFragment, ThemeNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartOnboardingFragment.tintNavIcon();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        View decorView = requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | SYSTEM_UI_FLAGS);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment.onStart.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
        LottieUrl lottieUrl = LottieUrl.ADVANCED_CHART_ONBOARDING;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        lottieUrl.prefetch(contextRequireContext);
        AdvancedChartLoggings3.logAdvancedChartOnboardingAppear(getEventLogger(), ((AdvancedChartOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceType());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        View decorView = requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-9473));
        super.onStop();
        AdvancedChartLoggings3.logAdvancedChartOnboardingDisappear(getEventLogger(), ((AdvancedChartOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceType());
    }

    private final void tintNavIcon() {
        for (View view : ViewGroup2.getChildren(requireToolbar().getToolbar())) {
            if (view instanceof AppCompatImageButton) {
                ((AppCompatImageButton) view).setImageTintList(ColorStateList.valueOf(-16777216));
                view.refreshDrawableState();
                return;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        final AdvancedChartOnboardingFragment advancedChartOnboardingFragment = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(1280715878);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(advancedChartOnboardingFragment) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280715878, i2, -1, "com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment.ComposeContent (AdvancedChartOnboardingFragment.kt:147)");
            }
            final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.ADVANCED_CHART_ONBOARDING.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(AdvancedChartOnboardingFragment.ComposeContent$lambda$4$lambda$3(lottieCompositionResultRememberLottieComposition));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = C8502R.string.advanced_chart_onboarding_description;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i3, bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), advancedChartOnboardingFragment.toolbarHeight.getValue().getValue());
            BentoColor bentoColor = BentoColor.INSTANCE;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoColor.m21236getDayPrime0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(Integer.MAX_VALUE, composerStartRestartGroup, 6, 0), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            LottieAnimation2.LottieAnimation(ComposeContent$lambda$2(lottieCompositionResultRememberLottieComposition), Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ComposeContent$lambda$5(snapshotState4), false, 2, null), bentoColor.m21236getDayPrime0d7_KjU(), null, 2, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFillWidth(), false, false, null, false, null, composerStartRestartGroup, 0, 196608, 0, 2064380);
            Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8502R.string.advanced_chart_onboarding_title, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22062annotatedStringResourceV2eopBjH0, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedChartOnboardingFragment.ComposeContent$lambda$9$lambda$8$lambda$7(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            advancedChartOnboardingFragment = this;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_get_started, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedchart.onboarding.AdvancedChartOnboardingFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvancedChartOnboardingFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ComposeContent$lambda$4$lambda$3(LottieCompositionResult lottieCompositionResult) {
        LottieComposition lottieCompositionComposeContent$lambda$2 = ComposeContent$lambda$2(lottieCompositionResult);
        if ((lottieCompositionComposeContent$lambda$2 != null ? lottieCompositionComposeContent$lambda$2.getBounds() : null) == null) {
            return 1.0f;
        }
        return r1.width() / r1.height();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8$lambda$7(AdvancedChartOnboardingFragment advancedChartOnboardingFragment) {
        ActivityResultLauncher<Intent> activityResultLauncher = advancedChartOnboardingFragment.searchSelectorLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchSelectorLauncher");
            activityResultLauncher = null;
        }
        Navigator navigator = advancedChartOnboardingFragment.getNavigator();
        Context contextRequireContext = advancedChartOnboardingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new SearchSelector(new SearchSelectorLaunchMode.AdvancedChart(true, true, true, false, 8, null), null, null, 6, null), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/onboarding/AdvancedChartOnboardingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartOnboardingFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advancedchart/onboarding/AdvancedChartOnboardingFragment;", "<init>", "()V", "SYSTEM_UI_FLAGS", "", "createFragment", "key", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AdvancedChartOnboardingFragmentKey>, FragmentWithArgsCompanion<AdvancedChartOnboardingFragment, AdvancedChartOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedChartOnboardingFragmentKey getArgs(AdvancedChartOnboardingFragment advancedChartOnboardingFragment) {
            return (AdvancedChartOnboardingFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedChartOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedChartOnboardingFragment newInstance(AdvancedChartOnboardingFragmentKey advancedChartOnboardingFragmentKey) {
            return (AdvancedChartOnboardingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, advancedChartOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedChartOnboardingFragment advancedChartOnboardingFragment, AdvancedChartOnboardingFragmentKey advancedChartOnboardingFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedChartOnboardingFragment, advancedChartOnboardingFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AdvancedChartOnboardingFragment createFragment(AdvancedChartOnboardingFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdvancedChartOnboardingFragment) AdvancedChartOnboardingFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
