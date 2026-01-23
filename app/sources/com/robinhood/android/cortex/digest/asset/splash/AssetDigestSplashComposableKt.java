package com.robinhood.android.cortex.digest.asset.splash;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.LateMotionLayout;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashEvent;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashViewState;
import com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;

/* compiled from: AssetDigestSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001ac\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001aI\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\"\u000e\u0010\u001a\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010\u0011\u001a\u00020%X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"AssetDigestSplashComposable", "", "args", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;", "onSkipSplash", "Lkotlin/Function2;", "", "onContinueClick", "onBackClick", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "duxo", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;", "(Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;Landroidx/compose/runtime/Composer;II)V", "AssetDigestOnboardingSplashLoaded", "viewState", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashViewState$Loaded;", "skipToEnd", "onAnimationStarted", "", "onAnimationComplete", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashViewState$Loaded;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ANIMATION_DAY_URL", "", "ANIMATION_NIGHT_URL", "FALLBACK_DAY_URL", "FALLBACK_NIGHT_URL", "AssetDigestOnboardingSplashAnimation", "videoKillswitchEnabled", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetDigestOnboardingSplashComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-cortex-digest-asset-splash_externalDebug", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent;", "isAnimationStarted", "isAnimationComplete", "showContent", "alpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestSplashComposableKt {
    private static final String ANIMATION_DAY_URL = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/copilot/onboarding/digests_onboarding_day.mp4";
    private static final String ANIMATION_NIGHT_URL = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/copilot/onboarding/digests_onboarding_night.mp4";
    private static final String FALLBACK_DAY_URL = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/copilot/onboarding/digest_onboarding_day_fallback.png";
    private static final String FALLBACK_NIGHT_URL = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/copilot/onboarding/digest_onboarding_night_fallback.png";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestOnboardingSplashAnimation$lambda$19(boolean z, boolean z2, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetDigestOnboardingSplashAnimation(z, z2, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestOnboardingSplashComposablePreview$lambda$20(int i, Composer composer, int i2) {
        AssetDigestOnboardingSplashComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestOnboardingSplashLoaded$lambda$18(AssetDigestSplashViewState.Loaded loaded, boolean z, Function1 function1, Function0 function0, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetDigestOnboardingSplashLoaded(loaded, z, function1, function0, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestSplashComposable$lambda$4(AssetDigestSplashFragment.Args args, Function2 function2, Function2 function22, Function0 function0, Function1 function1, AssetDigestSplashDuxo assetDigestSplashDuxo, int i, int i2, Composer composer, int i3) {
        AssetDigestSplashComposable(args, function2, function22, function0, function1, assetDigestSplashDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestSplashComposable(final AssetDigestSplashFragment.Args args, final Function2<? super Boolean, ? super Boolean, Unit> onSkipSplash, final Function2<? super Boolean, ? super Boolean, Unit> onContinueClick, final Function0<Unit> onBackClick, final Function1<? super Throwable, Unit> onError, AssetDigestSplashDuxo assetDigestSplashDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AssetDigestSplashDuxo assetDigestSplashDuxo2;
        AssetDigestSplashDuxo assetDigestSplashDuxo3;
        final Event<AssetDigestSplashEvent> eventAssetDigestSplashComposable$lambda$1;
        final Event<AssetDigestSplashEvent> eventAssetDigestSplashComposable$lambda$12;
        String source;
        final AssetDigestSplashDuxo assetDigestSplashDuxo4;
        EventConsumer<AssetDigestSplashEvent> eventConsumerInvoke;
        EventConsumer<AssetDigestSplashEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onSkipSplash, "onSkipSplash");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1393056511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSkipSplash) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                assetDigestSplashDuxo2 = assetDigestSplashDuxo;
                int i4 = composerStartRestartGroup.changedInstance(assetDigestSplashDuxo2) ? 131072 : 65536;
                i3 |= i4;
            } else {
                assetDigestSplashDuxo2 = assetDigestSplashDuxo;
            }
            i3 |= i4;
        } else {
            assetDigestSplashDuxo2 = assetDigestSplashDuxo;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            assetDigestSplashDuxo4 = assetDigestSplashDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 32) != 0) {
                    composerStartRestartGroup.startReplaceGroup(2050738472);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AssetDigestSplashDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    assetDigestSplashDuxo3 = (AssetDigestSplashDuxo) baseDuxo;
                    i3 &= -458753;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1393056511, i3, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable (AssetDigestSplashComposable.kt:64)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(assetDigestSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(assetDigestSplashDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventAssetDigestSplashComposable$lambda$1 = AssetDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAssetDigestSplashComposable$lambda$1 != null && (eventAssetDigestSplashComposable$lambda$1.getData() instanceof AssetDigestSplashEvent.SkipSplash) && (eventConsumerInvoke2 = eventAssetDigestSplashComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventAssetDigestSplashComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12570invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12570invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AssetDigestSplashEvent.SkipSplash skipSplash = (AssetDigestSplashEvent.SkipSplash) eventAssetDigestSplashComposable$lambda$1.getData();
                            onSkipSplash.invoke(Boolean.valueOf(skipSplash.getHasSignedAgreement()), Boolean.valueOf(skipSplash.getHasGoldOrNotRequired()));
                        }
                    });
                }
                eventAssetDigestSplashComposable$lambda$12 = AssetDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAssetDigestSplashComposable$lambda$12 != null && (eventAssetDigestSplashComposable$lambda$12.getData() instanceof AssetDigestSplashEvent.Error) && (eventConsumerInvoke = eventAssetDigestSplashComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventAssetDigestSplashComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12571invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12571invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke(((AssetDigestSplashEvent.Error) eventAssetDigestSplashComposable$lambda$12.getData()).getThrowable());
                        }
                    });
                }
                Screen.Name name = Screen.Name.CORTEX_DIGEST_ONBOARDING_SPLASH;
                source = args.getSource();
                if (source == null) {
                    source = "";
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, source, null, null, 12, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(169087990, true, new C120573(onBackClick, onContinueClick, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                assetDigestSplashDuxo4 = assetDigestSplashDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            assetDigestSplashDuxo3 = assetDigestSplashDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(assetDigestSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(assetDigestSplashDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            eventAssetDigestSplashComposable$lambda$1 = AssetDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAssetDigestSplashComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventAssetDigestSplashComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m12570invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m12570invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AssetDigestSplashEvent.SkipSplash skipSplash = (AssetDigestSplashEvent.SkipSplash) eventAssetDigestSplashComposable$lambda$1.getData();
                        onSkipSplash.invoke(Boolean.valueOf(skipSplash.getHasSignedAgreement()), Boolean.valueOf(skipSplash.getHasGoldOrNotRequired()));
                    }
                });
            }
            eventAssetDigestSplashComposable$lambda$12 = AssetDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAssetDigestSplashComposable$lambda$12 != null) {
                eventConsumerInvoke.consume(eventAssetDigestSplashComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m12571invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m12571invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        onError.invoke(((AssetDigestSplashEvent.Error) eventAssetDigestSplashComposable$lambda$12.getData()).getThrowable());
                    }
                });
            }
            Screen.Name name2 = Screen.Name.CORTEX_DIGEST_ONBOARDING_SPLASH;
            source = args.getSource();
            if (source == null) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name2, source, null, null, 12, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(169087990, true, new C120573(onBackClick, onContinueClick, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            assetDigestSplashDuxo4 = assetDigestSplashDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestSplashComposableKt.AssetDigestSplashComposable$lambda$4(args, onSkipSplash, onContinueClick, onBackClick, onError, assetDigestSplashDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AssetDigestSplashComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3 */
    static final class C120573 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Function2<Boolean, Boolean, Unit> $onContinueClick;
        final /* synthetic */ SnapshotState4<AssetDigestSplashViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C120573(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, SnapshotState4<? extends AssetDigestSplashViewState> snapshotState4) {
            this.$onBackClick = function0;
            this.$onContinueClick = function2;
            this.$viewState$delegate = snapshotState4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$7(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(169087990, i, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous> (AssetDigestSplashComposable.kt:85)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composer.endReplaceGroup();
            final Function0<Unit> function0 = this.$onBackClick;
            final Function2<Boolean, Boolean, Unit> function2 = this.$onContinueClick;
            final SnapshotState4<AssetDigestSplashViewState> snapshotState4 = this.$viewState$delegate;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(599572353, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt.AssetDigestSplashComposable.3.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(599572353, i2, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous>.<anonymous> (AssetDigestSplashComposable.kt:89)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                    final Function0<Unit> function02 = function0;
                    final SnapshotState<Boolean> snapshotState5 = snapshotState;
                    final SnapshotState<Boolean> snapshotState6 = snapshotState2;
                    final SnapshotState<Boolean> snapshotState7 = snapshotState3;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1671093947, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt.AssetDigestSplashComposable.3.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1671093947, i3, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestSplashComposable.kt:93)");
                            }
                            Function2<Composer, Integer, Unit> function2M1859x8ffc744f = ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE.m1859x8ffc744f();
                            final Function0<Unit> function03 = function02;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M1859x8ffc744f, null, ComposableLambda3.rememberComposableLambda(-1927399610, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt.AssetDigestSplashComposable.3.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i4) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i4 & 6) == 0) {
                                        i4 |= (i4 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i4 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1927399610, i4, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestSplashComposable.kt:97)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), ComposableLambda3.rememberComposableLambda(-2051005081, true, new AnonymousClass2(snapshotState5, snapshotState6, snapshotState7), composer3, 54), null, true, false, null, null, 0L, null, composer3, 200070, 0, 2002);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AssetDigestSplashComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState<Boolean> $isAnimationComplete$delegate;
                            final /* synthetic */ SnapshotState<Boolean> $isAnimationStarted$delegate;
                            final /* synthetic */ SnapshotState<Boolean> $skipToEnd$delegate;

                            AnonymousClass2(SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                                this.$isAnimationStarted$delegate = snapshotState;
                                this.$isAnimationComplete$delegate = snapshotState2;
                                this.$skipToEnd$delegate = snapshotState3;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                invoke(row5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2051005081, i, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestSplashComposable.kt:102)");
                                }
                                if (C120573.invoke$lambda$1(this.$isAnimationStarted$delegate) && !C120573.invoke$lambda$4(this.$isAnimationComplete$delegate)) {
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "skip", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_skip, composer, 0);
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<Boolean> snapshotState = this.$skipToEnd$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AssetDigestSplashComposableKt.C120573.AnonymousClass1.C497101.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, false, null, composer, 6, 120);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                C120573.invoke$lambda$8(snapshotState, true);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1466556368, true, new AnonymousClass2(function2, snapshotState4, snapshotState3, snapshotState, snapshotState2), composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AssetDigestSplashComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<Boolean> $isAnimationComplete$delegate;
                    final /* synthetic */ SnapshotState<Boolean> $isAnimationStarted$delegate;
                    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onContinueClick;
                    final /* synthetic */ SnapshotState<Boolean> $skipToEnd$delegate;
                    final /* synthetic */ SnapshotState4<AssetDigestSplashViewState> $viewState$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(Function2<? super Boolean, ? super Boolean, Unit> function2, SnapshotState4<? extends AssetDigestSplashViewState> snapshotState4, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                        this.$onContinueClick = function2;
                        this.$viewState$delegate = snapshotState4;
                        this.$skipToEnd$delegate = snapshotState;
                        this.$isAnimationStarted$delegate = snapshotState2;
                        this.$isAnimationComplete$delegate = snapshotState3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i |= composer.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1466556368, i, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestSplashComposable.kt:128)");
                        }
                        AssetDigestSplashViewState assetDigestSplashViewStateAssetDigestSplashComposable$lambda$0 = AssetDigestSplashComposableKt.AssetDigestSplashComposable$lambda$0(this.$viewState$delegate);
                        if (Intrinsics.areEqual(assetDigestSplashViewStateAssetDigestSplashComposable$lambda$0, AssetDigestSplashViewState.Loading.INSTANCE)) {
                            composer.startReplaceGroup(611401824);
                            LoadingScreenComposablesKt.PromoLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 1, composer, 48, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(assetDigestSplashViewStateAssetDigestSplashComposable$lambda$0 instanceof AssetDigestSplashViewState.Loaded)) {
                                composer.startReplaceGroup(611398675);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(1773860131);
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                            AssetDigestSplashViewState.Loaded loaded = (AssetDigestSplashViewState.Loaded) assetDigestSplashViewStateAssetDigestSplashComposable$lambda$0;
                            boolean zInvoke$lambda$7 = C120573.invoke$lambda$7(this.$skipToEnd$delegate);
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<Boolean> snapshotState = this.$isAnimationStarted$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AssetDigestSplashComposableKt.C120573.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, ((Long) obj).longValue());
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<Boolean> snapshotState2 = this.$isAnimationComplete$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestSplashComposable$3$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AssetDigestSplashComposableKt.C120573.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded(loaded, zInvoke$lambda$7, function1, (Function0) objRememberedValue2, this.$onContinueClick, modifierPadding, composer, 3456, 0);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, long j) {
                        C120573.invoke$lambda$2(snapshotState, true);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                        C120573.invoke$lambda$5(snapshotState, true);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AssetDigestOnboardingSplashLoaded$lambda$17$lambda$10(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AssetDigestOnboardingSplashLoaded$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetDigestSplashViewState AssetDigestSplashComposable$lambda$0(SnapshotState4<? extends AssetDigestSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AssetDigestSplashEvent> AssetDigestSplashComposable$lambda$1(SnapshotState4<Event<AssetDigestSplashEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestOnboardingSplashLoaded(final AssetDigestSplashViewState.Loaded loaded, final boolean z, final Function1<? super Long, Unit> function1, final Function0<Unit> function0, final Function2<? super Boolean, ? super Boolean, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        final AssetDigestSplashViewState.Loaded loaded2;
        int i3;
        final Function1<? super Long, Unit> function12;
        final Function0<Unit> function02;
        final Function2<? super Boolean, ? super Boolean, Unit> function22;
        Modifier modifier2;
        boolean zBooleanValue;
        boolean zChanged;
        Object objRememberedValue;
        TweenSpec tweenSpecTween$default;
        Modifier modifier3;
        Composer composer2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        final Modifier modifier4;
        SnapshotState snapshotState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1448082794);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else {
            loaded2 = loaded;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1448082794, i3, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestOnboardingSplashLoaded (AssetDigestSplashComposable.kt:162)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(!zBooleanValue);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!zBooleanValue || z), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                final int i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                if (tweenSpecTween$default == null) {
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue3;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    Object obj = objRememberedValue4;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                        constraintLayoutScope.setAnimateChanges(true);
                        composerStartRestartGroup.updateRememberedValue(constraintLayoutScope);
                        obj = constraintLayoutScope;
                    }
                    final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    SnapshotState snapshotState6 = (SnapshotState) objRememberedValue5;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    Object obj2 = objRememberedValue6;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        Ref ref = new Ref();
                        ref.setValue(CompositionSource.Unknown);
                        composerStartRestartGroup.updateRememberedValue(ref);
                        obj2 = ref;
                    }
                    final Ref ref2 = (Ref) obj2;
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        snapshotState2 = snapshotState6;
                        objRememberedValue7 = Channel4.Channel$default(-1, null, null, 6, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        snapshotState2 = snapshotState6;
                    }
                    final Channel channel = (Channel) objRememberedValue7;
                    final SnapshotState snapshotState7 = snapshotState2;
                    modifier3 = modifier5;
                    composer2 = composerStartRestartGroup;
                    LateMotionLayout.LateMotionLayout(snapshotState4, snapshotState5, tweenSpecTween$default, channel, snapshotState7, ref2, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, null, modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(-74958949, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            int i7;
                            Object obj3;
                            BentoTheme bentoTheme;
                            int i8;
                            float f;
                            Composer composer4;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-74958949, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
                            }
                            snapshotState7.setValue(Unit.INSTANCE);
                            if (ref2.getValue() == CompositionSource.Unknown) {
                                ref2.setValue(CompositionSource.Content);
                            }
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                            composer3.startReplaceGroup(998918519);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue8 == companion3.getEmpty()) {
                                objRememberedValue8 = C12053x1a23f60f.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue8);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue8);
                            boolean videoKillswitchEnabled = loaded2.getVideoKillswitchEnabled();
                            boolean z2 = z;
                            Function1 function13 = function12;
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer3.changed(function02) | composer3.changed(snapshotState3);
                            Object objRememberedValue9 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue9 == companion3.getEmpty()) {
                                objRememberedValue9 = new C12054x1a23f9d0(function02, snapshotState3);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            composer3.endReplaceGroup();
                            AssetDigestSplashComposableKt.AssetDigestOnboardingSplashAnimation(videoKillswitchEnabled, z2, function13, (Function0) objRememberedValue9, modifierConstrainAs, composer3, 0, 0);
                            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$6(snapshotState3) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composer3, 48, 28);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            if (objRememberedValue10 == companion3.getEmpty()) {
                                objRememberedValue10 = C12055x1a23fd91.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierAlpha = Alpha.alpha(constraintLayoutScope3.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$17$lambda$10(snapshotState4AnimateFloatAsState));
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer3, i9).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme2.getColors(composer3, i9).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer3, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme2.getColors(composer3, i9).m21371getBg0d7_KjU(), null, 2, null), 0.0f, composer3, 0, 1);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 5, null);
                            String titleText = loaded2.getTitleText();
                            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleLarge();
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(titleText, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(loaded2.getDescriptionText(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(48), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 48, 0, 16316);
                            Composer composer5 = composer3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, companion2);
                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                            if (composer5.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor3);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                            String disclosureMarkdown = loaded2.getDisclosureMarkdown();
                            composer5.startReplaceGroup(217727442);
                            if (disclosureMarkdown == null) {
                                bentoTheme = bentoTheme2;
                                i8 = i9;
                                f = 0.0f;
                                obj3 = null;
                                i7 = 1;
                            } else {
                                i7 = 1;
                                obj3 = null;
                                bentoTheme = bentoTheme2;
                                i8 = i9;
                                f = 0.0f;
                                composer5 = composer3;
                                BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM(), 7, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer5, i9).getTextS(), companion6.m7919getCentere0LSkKk(), bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer5, i9).m21425getFg0d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 24);
                            }
                            composer5.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, f, i7, obj3), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                            composer5.startReplaceGroup(-1633490746);
                            boolean zChanged3 = composer5.changed(function22) | composer5.changedInstance(loaded2);
                            Object objRememberedValue11 = composer5.rememberedValue();
                            if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                objRememberedValue11 = new C12056x37093c7e(function22, loaded2);
                                composer5.updateRememberedValue(objRememberedValue11);
                            }
                            Function0 function03 = (Function0) objRememberedValue11;
                            composer5.endReplaceGroup();
                            if (loaded2.isGoldRequired()) {
                                composer5.startReplaceGroup(-1838666860);
                                BentoSparkleButton2.BentoSparkleButton(function03, strStringResource, modifierAutoLogEvents$default, null, false, false, false, composer3, 0, 120);
                                composer4 = composer3;
                                composer4.endReplaceGroup();
                            } else {
                                composer5.startReplaceGroup(-1838427974);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function03, strStringResource, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                                composer4 = composer3;
                                composer4.endReplaceGroup();
                            }
                            composer4.endNode();
                            composer4.endNode();
                            composer4.endNode();
                            composer4.endReplaceGroup();
                            boolean zChangedInstance = composer4.changedInstance(constraintLayoutScope2) | composer4.changedInstance(channel);
                            final ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                            final SnapshotState snapshotState8 = snapshotState4;
                            final SnapshotState snapshotState9 = snapshotState5;
                            final Channel channel2 = channel;
                            Object objRememberedValue12 = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue12 == companion3.getEmpty()) {
                                objRememberedValue12 = new Function0<Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope4.getContainerObject().mo8187clone());
                                        if (snapshotState8.getValue() == null || snapshotState9.getValue() == null) {
                                            snapshotState8.setValue(constraintSet3);
                                            snapshotState9.setValue(snapshotState8.getValue());
                                        } else {
                                            channel2.mo8337trySendJP2dKIU(constraintSet3);
                                        }
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue12);
                            }
                            EffectsKt.SideEffect((Function0) objRememberedValue12, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805331382 | (Ref.$stable << 15));
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else {
                    modifier3 = modifier5;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    Object objRememberedValue8 = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new Measurer2(density);
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    final Measurer2 measurer2 = (Measurer2) objRememberedValue8;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    final ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue9;
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (objRememberedValue10 == companion2.getEmpty()) {
                        objRememberedValue10 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue10;
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (objRememberedValue11 == companion2.getEmpty()) {
                        objRememberedValue11 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue11;
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    final SnapshotState snapshotState9 = (SnapshotState) objRememberedValue12;
                    boolean zChangedInstance = composer2.changedInstance(measurer2) | composer2.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue13 == companion2.getEmpty()) {
                        objRememberedValue13 = new MeasurePolicy() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState9.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i5);
                                snapshotState8.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                    }
                                }, 4, null);
                            }
                        };
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState = snapshotState8;
                        composer2.updateRememberedValue(objRememberedValue13);
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState = snapshotState8;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (objRememberedValue14 == companion2.getEmpty()) {
                        objRememberedValue14 = new Function0<Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl.setKnownDirty(true);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    final Function0 function03 = (Function0) objRememberedValue14;
                    boolean zChangedInstance2 = composer2.changedInstance(measurer2);
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue15 == companion2.getEmpty()) {
                        objRememberedValue15 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue15, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            int i7;
                            Object obj3;
                            int i8;
                            BentoTheme bentoTheme;
                            float f;
                            C12046xcca7b59 c12046xcca7b59;
                            Composer composer4;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState9.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope3.getHelpersHashCode();
                            constraintLayoutScope3.reset();
                            ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope3;
                            composer3.startReplaceGroup(998918519);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue16 = composer3.rememberedValue();
                            Composer.Companion companion4 = Composer.INSTANCE;
                            if (objRememberedValue16 == companion4.getEmpty()) {
                                objRememberedValue16 = C12053x1a23f60f.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue16);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue16);
                            boolean videoKillswitchEnabled = loaded.getVideoKillswitchEnabled();
                            boolean z2 = z;
                            Function1 function13 = function1;
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer3.changed(function0) | composer3.changed(snapshotState3);
                            Object objRememberedValue17 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue17 == companion4.getEmpty()) {
                                objRememberedValue17 = new C12054x1a23f9d0(function0, snapshotState3);
                                composer3.updateRememberedValue(objRememberedValue17);
                            }
                            composer3.endReplaceGroup();
                            AssetDigestSplashComposableKt.AssetDigestOnboardingSplashAnimation(videoKillswitchEnabled, z2, function13, (Function0) objRememberedValue17, modifierConstrainAs, composer3, 0, 0);
                            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$6(snapshotState3) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composer3, 48, 28);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue18 = composer3.rememberedValue();
                            if (objRememberedValue18 == companion4.getEmpty()) {
                                objRememberedValue18 = C12055x1a23fd91.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue18);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierAlpha = Alpha.alpha(constraintLayoutScope4.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$17$lambda$10(snapshotState4AnimateFloatAsState));
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion5 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer3, i9).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme2.getColors(composer3, i9).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer3, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme2.getColors(composer3, i9).m21371getBg0d7_KjU(), null, 2, null), 0.0f, composer3, 0, 1);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 5, null);
                            String titleText = loaded.getTitleText();
                            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleLarge();
                            TextAlign.Companion companion7 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(titleText, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion7.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(loaded.getDescriptionText(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(48), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion7.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 48, 0, 16316);
                            Composer composer5 = composer3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer5, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, companion3);
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            if (composer5.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor3);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            String disclosureMarkdown = loaded.getDisclosureMarkdown();
                            composer5.startReplaceGroup(217727442);
                            if (disclosureMarkdown == null) {
                                bentoTheme = bentoTheme2;
                                i8 = i9;
                                f = 0.0f;
                                obj3 = null;
                                i7 = 1;
                            } else {
                                i7 = 1;
                                obj3 = null;
                                i8 = i9;
                                bentoTheme = bentoTheme2;
                                f = 0.0f;
                                composer5 = composer3;
                                BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM(), 7, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer5, i9).getTextS(), companion7.m7919getCentere0LSkKk(), bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer5, i9).m21425getFg0d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 24);
                            }
                            composer5.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, f, i7, obj3), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                            composer5.startReplaceGroup(-1633490746);
                            boolean zChanged3 = composer5.changed(function2) | composer5.changedInstance(loaded);
                            Object objRememberedValue19 = composer5.rememberedValue();
                            if (zChanged3 || objRememberedValue19 == companion4.getEmpty()) {
                                objRememberedValue19 = new C12056x37093c7e(function2, loaded);
                                composer5.updateRememberedValue(objRememberedValue19);
                            }
                            Function0 function04 = (Function0) objRememberedValue19;
                            composer5.endReplaceGroup();
                            if (loaded.isGoldRequired()) {
                                composer5.startReplaceGroup(-1838666860);
                                BentoSparkleButton2.BentoSparkleButton(function04, strStringResource, modifierAutoLogEvents$default, null, false, false, false, composer3, 0, 120);
                                composer4 = composer3;
                                composer4.endReplaceGroup();
                                c12046xcca7b59 = this;
                            } else {
                                composer5.startReplaceGroup(-1838427974);
                                c12046xcca7b59 = this;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function04, strStringResource, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                                composer4 = composer3;
                                composer4.endReplaceGroup();
                            }
                            composer4.endNode();
                            composer4.endNode();
                            composer4.endNode();
                            composer4.endReplaceGroup();
                            if (constraintLayoutScope3.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function03, composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), measurePolicy, composer2, 48, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$18(loaded, z, function1, function0, function2, modifier4, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(!zBooleanValue);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                if (zBooleanValue) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!zBooleanValue || z), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                    tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    final int i52 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    if (tweenSpecTween$default == null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AssetDigestOnboardingSplashLoaded$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestOnboardingSplashAnimation(final boolean z, final boolean z2, final Function1<? super Long, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        Function1<? super Long, Unit> function12;
        Function0<Unit> function02;
        Modifier modifier2;
        BentoTheme bentoTheme;
        int i4;
        String str;
        String str2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970175548);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1970175548, i3, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestOnboardingSplashAnimation (AssetDigestSplashComposable.kt:320)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    str = ANIMATION_DAY_URL;
                } else {
                    str = ANIMATION_NIGHT_URL;
                }
                String str3 = str;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    str2 = FALLBACK_DAY_URL;
                } else {
                    str2 = FALLBACK_NIGHT_URL;
                }
                String str4 = str2;
                ComposableSingletons$AssetDigestSplashComposableKt composableSingletons$AssetDigestSplashComposableKt = ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE;
                Function4<BoxScope, Float, Composer, Integer, Unit> lambda$212895615$lib_cortex_digest_asset_splash_externalDebug = composableSingletons$AssetDigestSplashComposableKt.getLambda$212895615$lib_cortex_digest_asset_splash_externalDebug();
                Function4<BoxScope, Float, Composer, Integer, Unit> function4M1860x7c1f251 = composableSingletons$AssetDigestSplashComposableKt.m1860x7c1f251();
                int i6 = i3 << 6;
                composer2 = composerStartRestartGroup;
                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation(str3, str4, z3, z4, function12, function02, modifier4, lambda$212895615$lib_cortex_digest_asset_splash_externalDebug, function4M1860x7c1f251, composer2, (i6 & 896) | 113246208 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestSplashComposableKt.AssetDigestOnboardingSplashAnimation$lambda$19(z, z2, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
            String str32 = str;
            if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
            String str42 = str2;
            ComposableSingletons$AssetDigestSplashComposableKt composableSingletons$AssetDigestSplashComposableKt2 = ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE;
            Function4<BoxScope, Float, Composer, Integer, Unit> lambda$212895615$lib_cortex_digest_asset_splash_externalDebug2 = composableSingletons$AssetDigestSplashComposableKt2.getLambda$212895615$lib_cortex_digest_asset_splash_externalDebug();
            Function4<BoxScope, Float, Composer, Integer, Unit> function4M1860x7c1f2512 = composableSingletons$AssetDigestSplashComposableKt2.m1860x7c1f251();
            int i62 = i3 << 6;
            composer2 = composerStartRestartGroup;
            CortexDigestSplashAnimationKt.CortexDigestSplashAnimation(str32, str42, z3, z4, function12, function02, modifier4, lambda$212895615$lib_cortex_digest_asset_splash_externalDebug2, function4M1860x7c1f2512, composer2, (i62 & 896) | 113246208 | (i62 & 7168) | (57344 & i62) | (458752 & i62) | (i62 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AssetDigestOnboardingSplashComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224985889);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224985889, i, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestOnboardingSplashComposablePreview (AssetDigestSplashComposable.kt:373)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE.m1858x807f161d(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestSplashComposableKt.AssetDigestOnboardingSplashComposablePreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
