package com.robinhood.android.cortex.digest.portfolio.splash;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.ConstraintSet;
import androidx.constraintlayout.compose.ConstraintSetScope;
import androidx.constraintlayout.compose.DebugFlags;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.EditableJSONLayout;
import androidx.constraintlayout.compose.InvalidationStrategy;
import androidx.constraintlayout.compose.LayoutInformationReceiver;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.MotionLayoutKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
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
import androidx.navigation.NavOptionsBuilder;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations8;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9;
import com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo3;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo4;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigestGoldUpgrade;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigestSplash;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;

/* compiled from: PortfolioDigestSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a)\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u000e\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001cX\u008a\u0084\u0002"}, m3636d2 = {"PortfolioDigestSplashComposable", "", "args", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "duxo", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashDuxo;", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashDuxo;Landroidx/compose/runtime/Composer;II)V", "VIDEO_REF", "", "CONTAINER_REF", "CONTAINER_ANIMATION_DURATION", "", "CONTAINER_ANIMATION_DELAY_DELTA", "PortfolioDigestSplashLoaded", "viewState", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loaded;", "source", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState$Loaded;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-cortex-digest-portfolio_externalDebug", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "animationDuration", "", "isAnimationComplete", "", "isContainerAnimationThresholdReached", "isContainerVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioDigestSplashComposableKt {
    private static final int CONTAINER_ANIMATION_DELAY_DELTA = 667;
    private static final int CONTAINER_ANIMATION_DURATION = 500;
    private static final String CONTAINER_REF = "container";
    private static final String VIDEO_REF = "video";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashComposable$lambda$13(PortfolioDigestDestinations9.Args args, PortfolioDigestSplashDuxo portfolioDigestSplashDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioDigestSplashComposable(args, portfolioDigestSplashDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator PortfolioDigestSplashComposable$lambda$9$lambda$8(Navigator navigator) {
        return navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$41(PortfolioDigestSplashDuxo4.Loaded loaded, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PortfolioDigestSplashLoaded(loaded, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestSplashComposable(final PortfolioDigestDestinations9.Args args, PortfolioDigestSplashDuxo portfolioDigestSplashDuxo, Composer composer, final int i, final int i2) {
        int i3;
        PortfolioDigestSplashDuxo portfolioDigestSplashDuxo2;
        final PortfolioDigestSplashDuxo portfolioDigestSplashDuxo3;
        final OnBackPressedDispatcher onBackPressedDispatcher;
        final Event<PortfolioDigestSplashDuxo3> eventPortfolioDigestSplashComposable$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Event<PortfolioDigestSplashDuxo3> eventPortfolioDigestSplashComposable$lambda$12;
        final Event<PortfolioDigestSplashDuxo3> eventPortfolioDigestSplashComposable$lambda$13;
        final Navigator navigator;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Event<PortfolioDigestSplashDuxo3> eventPortfolioDigestSplashComposable$lambda$14;
        EventConsumer<PortfolioDigestSplashDuxo3> eventConsumerInvoke;
        EventConsumer<PortfolioDigestSplashDuxo3> eventConsumerInvoke2;
        EventConsumer<PortfolioDigestSplashDuxo3> eventConsumerInvoke3;
        EventConsumer<PortfolioDigestSplashDuxo3> eventConsumerInvoke4;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-258307300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(args) : composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                portfolioDigestSplashDuxo2 = portfolioDigestSplashDuxo;
                int i4 = composerStartRestartGroup.changedInstance(portfolioDigestSplashDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                portfolioDigestSplashDuxo2 = portfolioDigestSplashDuxo;
            }
            i3 |= i4;
        } else {
            portfolioDigestSplashDuxo2 = portfolioDigestSplashDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            portfolioDigestSplashDuxo3 = portfolioDigestSplashDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(2050738472);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioDigestSplashDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 &= -113;
                    portfolioDigestSplashDuxo3 = (PortfolioDigestSplashDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-258307300, i5, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable (PortfolioDigestSplashComposable.kt:69)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestSplashDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventPortfolioDigestSplashComposable$lambda$1 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestSplashComposable$lambda$1 != null) {
                    if ((eventPortfolioDigestSplashComposable$lambda$1.getData() instanceof PortfolioDigestSplashDuxo3.Error) && (eventConsumerInvoke4 = eventPortfolioDigestSplashComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke4.consume(eventPortfolioDigestSplashComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                m12612invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12612invoke(Object it) throws Resources.NotFoundException {
                                Parcelable message;
                                Intrinsics.checkNotNullParameter(it, "it");
                                PortfolioDigestSplashDuxo3.Error error = (PortfolioDigestSplashDuxo3.Error) eventPortfolioDigestSplashComposable$lambda$1.getData();
                                LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                                PortfolioDigestDestinations5 portfolioDigestDestinations5 = PortfolioDigestDestinations5.INSTANCE;
                                Throwable throwable = error.getThrowable();
                                if (throwable != null) {
                                    message = new PortfolioDigestDestinations5.Args.Error(0, throwable, 1, null);
                                } else {
                                    String string2 = context.getString(C11048R.string.general_error_summary);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    message = new PortfolioDigestDestinations5.Args.Message(0, string2, 1, null);
                                }
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator2, (DialogDestinationWithArgs) portfolioDigestDestinations5, message, false, (Function1) null, 12, (Object) null);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$5$lambda$4(onBackPressedDispatcher, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                PortfolioDigestErrorDialogComposable.ObserveErrorResult((Function1) objRememberedValue, composerStartRestartGroup, 0);
                eventPortfolioDigestSplashComposable$lambda$12 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestSplashComposable$lambda$12 != null) {
                    if ((eventPortfolioDigestSplashComposable$lambda$12.getData() instanceof PortfolioDigestSplashDuxo3.NavigateToDigest) && (eventConsumerInvoke3 = eventPortfolioDigestSplashComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventPortfolioDigestSplashComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                m12613invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12613invoke(Object it) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(it, "it");
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PortfolioDigestDestinations4.INSTANCE, new PortfolioDigestDestinations4.Args(((PortfolioDigestSplashDuxo3.NavigateToDigest) eventPortfolioDigestSplashComposable$lambda$12.getData()).getDigest(), args.getSource()), NavTransition.CROSS_FADE, null, false, new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                        invoke2(navOptionsBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(NavOptionsBuilder navigate) {
                                        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                        NavOptionsBuilder.popUpTo$default(navigate, PortfolioDigestDestinations8.INSTANCE.getRoutePath(), null, 2, null);
                                    }
                                }, 24, null);
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                eventPortfolioDigestSplashComposable$lambda$13 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestSplashComposable$lambda$13 != null) {
                    if ((eventPortfolioDigestSplashComposable$lambda$13.getData() instanceof PortfolioDigestSplashDuxo3.NavigateToAgreement) && (eventConsumerInvoke2 = eventPortfolioDigestSplashComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventPortfolioDigestSplashComposable$lambda$13, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                m12614invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12614invoke(Object it) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(it, "it");
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PortfolioDigestDestinations.INSTANCE, new PortfolioDigestDestinations.Args(((PortfolioDigestSplashDuxo3.NavigateToAgreement) eventPortfolioDigestSplashComposable$lambda$13.getData()).getDigest(), args.getSource()), NavTransition.CROSS_FADE, null, false, new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$4$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                        invoke2(navOptionsBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(NavOptionsBuilder navigate) {
                                        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                        NavOptionsBuilder.popUpTo$default(navigate, PortfolioDigestDestinations8.INSTANCE.getRoutePath(), null, 2, null);
                                    }
                                }, 24, null);
                            }
                        });
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$9$lambda$8(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                GoldUpgradeContract goldUpgradeContract = new GoldUpgradeContract((Function0) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(portfolioDigestSplashDuxo3) | composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$11$lambda$10(portfolioDigestSplashDuxo3, onBackPressedDispatcher, (GoldUpgradeContract.Result) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(goldUpgradeContract, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                eventPortfolioDigestSplashComposable$lambda$14 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestSplashComposable$lambda$14 != null) {
                    if ((eventPortfolioDigestSplashComposable$lambda$14.getData() instanceof PortfolioDigestSplashDuxo3.NavigateToGoldUpgrade) && (eventConsumerInvoke = eventPortfolioDigestSplashComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventPortfolioDigestSplashComposable$lambda$14, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashComposable$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m12615invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12615invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                PortfolioDigestGoldUpgrade goldUpgrade = ((PortfolioDigestSplashDuxo3.NavigateToGoldUpgrade) eventPortfolioDigestSplashComposable$lambda$14.getData()).getDigest().getGoldUpgrade();
                                activityResultRegistry8RememberLauncherForActivityResult.launch(new NavigationActivityResultContract.NavigationParams(new GoldUpgradeIntentKey(goldUpgrade.getScreenIdentifier(), goldUpgrade.getGoldFeature(), null, null, null, false, 60, null), null, false, 6, null));
                            }
                        });
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                Screen screen = new Screen(Screen.Name.PORTFOLIO_DIGEST_SPLASH, null, null, null, 14, null);
                String accountNumber = args.getAccountNumber();
                String str = accountNumber != null ? "" : accountNumber;
                String source = args.getSource();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(str, null, source != null ? "" : source, null, 10, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1839483153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1839483153, i6, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous> (PortfolioDigestSplashComposable.kt:159)");
                        }
                        final PortfolioDigestDestinations9.Args args2 = args;
                        final SnapshotState4<PortfolioDigestSplashDuxo4> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        BentoThemeOverlays.DayNightThemeOverlay(false, ComposableLambda3.rememberComposableLambda(-1644392798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1644392798, i7, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:160)");
                                }
                                final PortfolioDigestDestinations9.Args args3 = args2;
                                final SnapshotState4<PortfolioDigestSplashDuxo4> snapshotState42 = snapshotState4;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(969716973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i8) {
                                        if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(969716973, i8, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:161)");
                                        }
                                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                        Function2<Composer, Integer, Unit> function2M1873x43b7bd5a = ComposableSingletons$PortfolioDigestSplashComposableKt.INSTANCE.m1873x43b7bd5a();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU();
                                        final PortfolioDigestDestinations9.Args args4 = args3;
                                        final SnapshotState4<PortfolioDigestSplashDuxo4> snapshotState43 = snapshotState42;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, function2M1873x43b7bd5a, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(228040956, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1.1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                                                invoke(paddingValues, composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PaddingValues paddingValues, Composer composer5, int i10) {
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i10 & 6) == 0) {
                                                    i10 |= composer5.changed(paddingValues) ? 4 : 2;
                                                }
                                                if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(228040956, i10, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:180)");
                                                }
                                                PortfolioDigestSplashDuxo4 portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0 = PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$0(snapshotState43);
                                                if (Intrinsics.areEqual(portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0, PortfolioDigestSplashDuxo4.Loading.INSTANCE)) {
                                                    composer5.startReplaceGroup(-1069962429);
                                                    LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.List(false, false, 0, 7, null), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, ShimmerLoaderType.List.$stable, 0);
                                                    composer5.endReplaceGroup();
                                                } else {
                                                    if (!(portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0 instanceof PortfolioDigestSplashDuxo4.Loaded)) {
                                                        composer5.startReplaceGroup(104028569);
                                                        composer5.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer5.startReplaceGroup(-1069670068);
                                                    PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded((PortfolioDigestSplashDuxo4.Loaded) portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0, args4.getSource(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, 0, 0);
                                                    composer5.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 805306416, 316);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            }
            portfolioDigestSplashDuxo3 = portfolioDigestSplashDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<? extends PortfolioDigestSplashDuxo4> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestSplashDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            if (current22 == null) {
            }
            final LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            eventPortfolioDigestSplashComposable$lambda$1 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventPortfolioDigestSplashComposable$lambda$1 != null) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$5$lambda$4(onBackPressedDispatcher, ((Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                PortfolioDigestErrorDialogComposable.ObserveErrorResult((Function1) objRememberedValue, composerStartRestartGroup, 0);
                eventPortfolioDigestSplashComposable$lambda$12 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPortfolioDigestSplashComposable$lambda$12 != null) {
                }
                eventPortfolioDigestSplashComposable$lambda$13 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPortfolioDigestSplashComposable$lambda$13 != null) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$9$lambda$8(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    GoldUpgradeContract goldUpgradeContract2 = new GoldUpgradeContract((Function0) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(portfolioDigestSplashDuxo3) | composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$11$lambda$10(portfolioDigestSplashDuxo3, onBackPressedDispatcher, (GoldUpgradeContract.Result) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(goldUpgradeContract2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        eventPortfolioDigestSplashComposable$lambda$14 = PortfolioDigestSplashComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventPortfolioDigestSplashComposable$lambda$14 != null) {
                        }
                        Screen screen2 = new Screen(Screen.Name.PORTFOLIO_DIGEST_SPLASH, null, null, null, 14, null);
                        String accountNumber2 = args.getAccountNumber();
                        if (accountNumber2 != null) {
                        }
                        String source2 = args.getSource();
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(str, null, source2 != null ? "" : source2, null, 10, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1839483153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1839483153, i6, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous> (PortfolioDigestSplashComposable.kt:159)");
                                }
                                final PortfolioDigestDestinations9.Args args2 = args;
                                final SnapshotState4<? extends PortfolioDigestSplashDuxo4> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                                BentoThemeOverlays.DayNightThemeOverlay(false, ComposableLambda3.rememberComposableLambda(-1644392798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i7) {
                                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1644392798, i7, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:160)");
                                        }
                                        final PortfolioDigestDestinations9.Args args3 = args2;
                                        final SnapshotState4<? extends PortfolioDigestSplashDuxo4> snapshotState42 = snapshotState4;
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(969716973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i8) {
                                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(969716973, i8, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:161)");
                                                }
                                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                                Function2<Composer, Integer, Unit> function2M1873x43b7bd5a = ComposableSingletons$PortfolioDigestSplashComposableKt.INSTANCE.m1873x43b7bd5a();
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i9 = BentoTheme.$stable;
                                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU();
                                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU();
                                                final PortfolioDigestDestinations9.Args args4 = args3;
                                                final SnapshotState4<? extends PortfolioDigestSplashDuxo4> snapshotState43 = snapshotState42;
                                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, function2M1873x43b7bd5a, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(228040956, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable.6.1.1.1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                                                        invoke(paddingValues, composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(PaddingValues paddingValues, Composer composer5, int i10) {
                                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                        if ((i10 & 6) == 0) {
                                                            i10 |= composer5.changed(paddingValues) ? 4 : 2;
                                                        }
                                                        if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(228040956, i10, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestSplashComposable.kt:180)");
                                                        }
                                                        PortfolioDigestSplashDuxo4 portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0 = PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$0(snapshotState43);
                                                        if (Intrinsics.areEqual(portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0, PortfolioDigestSplashDuxo4.Loading.INSTANCE)) {
                                                            composer5.startReplaceGroup(-1069962429);
                                                            LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.List(false, false, 0, 7, null), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, ShimmerLoaderType.List.$stable, 0);
                                                            composer5.endReplaceGroup();
                                                        } else {
                                                            if (!(portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0 instanceof PortfolioDigestSplashDuxo4.Loaded)) {
                                                                composer5.startReplaceGroup(104028569);
                                                                composer5.endReplaceGroup();
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            composer5.startReplaceGroup(-1069670068);
                                                            PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded((PortfolioDigestSplashDuxo4.Loaded) portfolioDigestSplashDuxo4PortfolioDigestSplashComposable$lambda$0, args4.getSource(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer5, 0, 0);
                                                            composer5.endReplaceGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, 805306416, 316);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable$lambda$13(args, portfolioDigestSplashDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioDigestSplashDuxo4 PortfolioDigestSplashComposable$lambda$0(SnapshotState4<? extends PortfolioDigestSplashDuxo4> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PortfolioDigestSplashDuxo3> PortfolioDigestSplashComposable$lambda$1(SnapshotState4<Event<PortfolioDigestSplashDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long PortfolioDigestSplashLoaded$lambda$15(SnapshotState<Long> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean PortfolioDigestSplashLoaded$lambda$18(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean PortfolioDigestSplashLoaded$lambda$21(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean PortfolioDigestSplashLoaded$lambda$26(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashComposable$lambda$5$lambda$4(OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashComposable$lambda$11$lambda$10(PortfolioDigestSplashDuxo portfolioDigestSplashDuxo, OnBackPressedDispatcher onBackPressedDispatcher, GoldUpgradeContract.Result result) {
        if (result instanceof GoldUpgradeContract.Result.Completed) {
            portfolioDigestSplashDuxo.pollUntilOnboarded();
        } else {
            if (!Intrinsics.areEqual(result, GoldUpgradeContract.Result.Canceled.INSTANCE) && result != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestSplashLoaded(final PortfolioDigestSplashDuxo4.Loaded loaded, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        PortfolioDigestSplashDuxo4.Loaded loaded2;
        int i3;
        String str2;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final ConstraintSet ConstraintSet;
        TweenSpec tweenSpecTween$default;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        Animatable animatable;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199626909);
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
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199626909, i3, -1, "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashLoaded (PortfolioDigestSplashComposable.kt:211)");
                }
                final PortfolioDigestSplash splash = loaded2.getDigest().getSplash();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Long lPortfolioDigestSplashLoaded$lambda$15 = PortfolioDigestSplashLoaded$lambda$15(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new C12174xdba0f737(snapshotState, snapshotState3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(lPortfolioDigestSplashLoaded$lambda$15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$25$lambda$24(snapshotState3, snapshotState2));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (PortfolioDigestSplashLoaded$lambda$26((SnapshotState4) objRememberedValue5)) {
                    composerStartRestartGroup.startReplaceGroup(339415923);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$34$lambda$33((ConstraintSetScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ConstraintSet = ConstraintLayoutKt.ConstraintSet((Function1) objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(338792048);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$30$lambda$29((ConstraintSetScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ConstraintSet = ConstraintLayoutKt.ConstraintSet((Function1) objRememberedValue7);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                if (tweenSpecTween$default == null) {
                    composerStartRestartGroup.startReplaceGroup(-2000135165);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = SnapshotState3.mutableStateOf$default(ConstraintSet, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    SnapshotState snapshotState4 = (SnapshotState) objRememberedValue8;
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = SnapshotState3.mutableStateOf$default(ConstraintSet, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    SnapshotState snapshotState5 = (SnapshotState) objRememberedValue9;
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    Animatable animatable2 = (Animatable) objRememberedValue10;
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = Channel4.Channel$default(-1, null, null, 6, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    final Channel channel = (Channel) objRememberedValue11;
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = SnapshotIntState3.mutableIntStateOf(1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue12;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(channel) | composerStartRestartGroup.changed(ConstraintSet);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function0<Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$1
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
                                channel.mo8337trySendJP2dKIU(ConstraintSet);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    EffectsKt.SideEffect((Function0) objRememberedValue13, composerStartRestartGroup, 0);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(channel) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changedInstance(tweenSpecTween$default) | composerStartRestartGroup.changed((Object) null);
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue14 == companion.getEmpty()) {
                        animatable = animatable2;
                        objRememberedValue14 = new C12164x1cbdf98b(channel, snapshotIntState2, animatable, tweenSpecTween$default, null, snapshotState4, snapshotState5, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    } else {
                        animatable = animatable2;
                    }
                    EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                    ConstraintSet constraintSetM8144ConstraintLayout$lambda17 = ConstraintLayoutKt.m8144ConstraintLayout$lambda17(snapshotState4);
                    ConstraintSet constraintSetM8146ConstraintLayout$lambda20 = ConstraintLayoutKt.m8146ConstraintLayout$lambda20(snapshotState5);
                    float fFloatValue = ((Number) animatable.getValue()).floatValue();
                    int iM8158getNonebfy_xzQ = DebugFlags.INSTANCE.m8158getNonebfy_xzQ();
                    final InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
                    Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue15 == companion.getEmpty()) {
                        objRememberedValue15 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue15;
                    Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                    Object obj = objRememberedValue16;
                    if (objRememberedValue16 == companion.getEmpty()) {
                        Ref ref = new Ref();
                        ref.setValue(CompositionSource.Unknown);
                        composerStartRestartGroup.updateRememberedValue(ref);
                        obj = ref;
                    }
                    final Ref ref2 = (Ref) obj;
                    final int i5 = 3072;
                    final String str3 = str2;
                    MotionLayoutKt.MotionLayoutCore(constraintSetM8144ConstraintLayout$lambda17, constraintSetM8146ConstraintLayout$lambda20, null, fFloatValue, null, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, DebugFlags.m8155getShowBoundsimpl(iM8158getNonebfy_xzQ), DebugFlags.m8157getShowPathsimpl(iM8158getNonebfy_xzQ), DebugFlags.m8156getShowKeyPositionsimpl(iM8158getNonebfy_xzQ), modifierFillMaxSize$default, snapshotState6, ref2, defaultInvalidationStrategy, ComposableLambda3.rememberComposableLambda(284503157, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer4, Integer num) {
                            invoke(motionLayoutScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer4, int i6) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(284503157, i6, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
                            }
                            snapshotState6.setValue(Unit.INSTANCE);
                            if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                                ref2.setValue(CompositionSource.Content);
                            }
                            composer4.startReplaceGroup(-2075780874);
                            composer4.startReplaceGroup(-683771096);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierLayoutId = LayoutId2.layoutId(companion2, "video");
                            String videoUrl = splash.getVideoUrl();
                            String fallbackImageUrl = splash.getFallbackImageUrl();
                            composer4.startReplaceGroup(5004770);
                            Object objRememberedValue17 = composer4.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue17 == companion3.getEmpty()) {
                                objRememberedValue17 = new C12175x774e2185(snapshotState);
                                composer4.updateRememberedValue(objRememberedValue17);
                            }
                            Function1 function1 = (Function1) objRememberedValue17;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(5004770);
                            Object objRememberedValue18 = composer4.rememberedValue();
                            if (objRememberedValue18 == companion3.getEmpty()) {
                                objRememberedValue18 = new C12176x774e2546(snapshotState2);
                                composer4.updateRememberedValue(objRememberedValue18);
                            }
                            composer4.endReplaceGroup();
                            CortexDigestSplashAnimationKt.CortexDigestSplashAnimation(videoUrl, fallbackImageUrl, false, false, function1, (Function0) objRememberedValue18, modifierLayoutId, null, null, composer4, 1797504, 384);
                            Modifier modifierLayoutId2 = LayoutId2.layoutId(companion2, "container");
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierLayoutId2);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i7).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer4, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i7).m21371getBg0d7_KjU(), null, 2, null), 0.0f, composer4, 0, 1);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer4, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 5, null);
                            String title = splash.getTitle();
                            TextStyle displayMartinaLarge = bentoTheme.getTypography(composer4, i7).getDisplayMartinaLarge();
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayMartinaLarge, composer4, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(splash.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(48), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, 48, 0, 16312);
                            LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer4.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 7, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer4, 0);
                            composer4.startReplaceGroup(-1746271574);
                            boolean zChanged = composer4.changed(lifecycleAwareNavigator) | composer4.changedInstance(loaded) | composer4.changed(str3);
                            Object objRememberedValue19 = composer4.rememberedValue();
                            if (zChanged || objRememberedValue19 == companion3.getEmpty()) {
                                objRememberedValue19 = new C12177x62856761(lifecycleAwareNavigator, loaded, str3);
                                composer4.updateRememberedValue(objRememberedValue19);
                            }
                            composer4.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue19, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                            composer4.endNode();
                            composer4.endNode();
                            composer4.endReplaceGroup();
                            composer4.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, (Ref.$stable << 3) | 3078);
                    Composer composer4 = composerStartRestartGroup;
                    composer4.endReplaceGroup();
                    modifier3 = modifier5;
                    composer2 = composer4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1998673515);
                    Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue17 == companion.getEmpty()) {
                        objRememberedValue17 = SnapshotLongState3.mutableLongStateOf(0L);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                    }
                    SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue17;
                    Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue18 == companion.getEmpty()) {
                        objRememberedValue18 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                    }
                    final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue18;
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue19 == companion.getEmpty()) {
                        objRememberedValue19 = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                    }
                    final Measurer2 measurer2 = (Measurer2) objRememberedValue19;
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(ConstraintSet);
                    final int i6 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    boolean zChanged = zChangedInstance3 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue20 == companion.getEmpty()) {
                        objRememberedValue20 = new MeasurePolicy() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$4
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i7);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i7);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i7);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i7);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState7.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), ConstraintSet, list, linkedHashMap, i6);
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$4.1
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue20;
                    if (ConstraintSet instanceof EditableJSONLayout) {
                        ((EditableJSONLayout) ConstraintSet).setUpdateFlag(snapshotLongState2);
                    }
                    measurer2.addLayoutInformationReceiver(ConstraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) ConstraintSet : null);
                    if (Float.isNaN(measurer2.getForcedScaleFactor())) {
                        modifier3 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(-1996827620);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(measurer2);
                        Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue21 == companion.getEmpty()) {
                            objRememberedValue21 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$7
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue21, 1, null), ComposableLambda3.rememberComposableLambda(-207512644, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i7) {
                                if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-207512644, i7, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:853)");
                                }
                                snapshotState7.setValue(Unit.INSTANCE);
                                composer5.startReplaceGroup(-683771096);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierLayoutId = LayoutId2.layoutId(companion2, "video");
                                String videoUrl = splash.getVideoUrl();
                                String fallbackImageUrl = splash.getFallbackImageUrl();
                                composer5.startReplaceGroup(5004770);
                                Object objRememberedValue22 = composer5.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue22 == companion3.getEmpty()) {
                                    objRememberedValue22 = new C12175x774e2185(snapshotState);
                                    composer5.updateRememberedValue(objRememberedValue22);
                                }
                                Function1 function1 = (Function1) objRememberedValue22;
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(5004770);
                                Object objRememberedValue23 = composer5.rememberedValue();
                                if (objRememberedValue23 == companion3.getEmpty()) {
                                    objRememberedValue23 = new C12176x774e2546(snapshotState2);
                                    composer5.updateRememberedValue(objRememberedValue23);
                                }
                                composer5.endReplaceGroup();
                                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation(videoUrl, fallbackImageUrl, false, false, function1, (Function0) objRememberedValue23, modifierLayoutId, null, null, composer5, 1797504, 384);
                                Modifier modifierLayoutId2 = LayoutId2.layoutId(companion2, "container");
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer5, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierLayoutId2);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
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
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer5, i8).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer5, 0);
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer5, i8).m21371getBg0d7_KjU(), null, 2, null), 0.0f, composer5, 0, 1);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor2);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer5, i8).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 5, null);
                                String title = splash.getTitle();
                                TextStyle displayMartinaLarge = bentoTheme.getTypography(composer5, i8).getDisplayMartinaLarge();
                                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayMartinaLarge, composer5, 0, 0, 8124);
                                BentoText2.m20747BentoText38GnDrw(splash.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(48), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 48, 0, 16312);
                                LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer5.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 7, null);
                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                                composer5.startReplaceGroup(-1746271574);
                                boolean zChanged2 = composer5.changed(lifecycleAwareNavigator) | composer5.changedInstance(loaded) | composer5.changed(str);
                                Object objRememberedValue24 = composer5.rememberedValue();
                                if (zChanged2 || objRememberedValue24 == companion3.getEmpty()) {
                                    objRememberedValue24 = new C12177x62856761(lifecycleAwareNavigator, loaded, str);
                                    composer5.updateRememberedValue(objRememberedValue24);
                                }
                                composer5.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue24, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, false, null, null, null, null, false, null, composer5, 0, 0, 8184);
                                composer5.endNode();
                                composer5.endNode();
                                composer5.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1997256040);
                        Modifier modifierScale = Scale2.scale(modifierFillMaxSize$default, measurer2.getForcedScaleFactor());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        modifier3 = modifier5;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(measurer2);
                        Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue22 == companion.getEmpty()) {
                            objRememberedValue22 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$5
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScale, false, (Function1) objRememberedValue22, 1, null), ComposableLambda3.rememberComposableLambda(1131308473, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$$inlined$ConstraintLayout$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @SuppressLint({"UnnecessaryLambdaCreation"})
                            public final void invoke(Composer composer5, int i7) {
                                if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1131308473, i7, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous>.<anonymous> (ConstraintLayout.kt:841)");
                                }
                                composer5.startReplaceGroup(-683771096);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                Modifier modifierLayoutId = LayoutId2.layoutId(companion4, "video");
                                String videoUrl = splash.getVideoUrl();
                                String fallbackImageUrl = splash.getFallbackImageUrl();
                                composer5.startReplaceGroup(5004770);
                                Object objRememberedValue23 = composer5.rememberedValue();
                                Composer.Companion companion5 = Composer.INSTANCE;
                                if (objRememberedValue23 == companion5.getEmpty()) {
                                    objRememberedValue23 = new C12175x774e2185(snapshotState);
                                    composer5.updateRememberedValue(objRememberedValue23);
                                }
                                Function1 function1 = (Function1) objRememberedValue23;
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(5004770);
                                Object objRememberedValue24 = composer5.rememberedValue();
                                if (objRememberedValue24 == companion5.getEmpty()) {
                                    objRememberedValue24 = new C12176x774e2546(snapshotState2);
                                    composer5.updateRememberedValue(objRememberedValue24);
                                }
                                composer5.endReplaceGroup();
                                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation(videoUrl, fallbackImageUrl, false, false, function1, (Function0) objRememberedValue24, modifierLayoutId, null, null, composer5, 1797504, 384);
                                Modifier modifierLayoutId2 = LayoutId2.layoutId(companion4, "container");
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer5, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierLayoutId2);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor2);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer5, i8).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer5, 0);
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion4, bentoTheme.getColors(composer5, i8).m21371getBg0d7_KjU(), null, 2, null), 0.0f, composer5, 0, 1);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer5, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer5, i8).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 5, null);
                                String title = splash.getTitle();
                                TextStyle displayMartinaLarge = bentoTheme.getTypography(composer5, i8).getDisplayMartinaLarge();
                                TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion8.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayMartinaLarge, composer5, 0, 0, 8124);
                                BentoText2.m20747BentoText38GnDrw(splash.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(48), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion8.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 48, 0, 16312);
                                LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer5.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM(), 7, null);
                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                                composer5.startReplaceGroup(-1746271574);
                                boolean zChanged2 = composer5.changed(lifecycleAwareNavigator) | composer5.changedInstance(loaded) | composer5.changed(str);
                                Object objRememberedValue25 = composer5.rememberedValue();
                                if (zChanged2 || objRememberedValue25 == companion5.getEmpty()) {
                                    objRememberedValue25 = new C12177x62856761(lifecycleAwareNavigator, loaded, str);
                                    composer5.updateRememberedValue(objRememberedValue25);
                                }
                                composer5.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue25, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, false, null, null, null, null, false, null, composer5, 0, 0, 8184);
                                composer5.endNode();
                                composer5.endNode();
                                composer5.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                composer3 = composer2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$41(loaded, str, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final PortfolioDigestSplash splash2 = loaded2.getDigest().getSplash();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Long lPortfolioDigestSplashLoaded$lambda$152 = PortfolioDigestSplashLoaded$lambda$15(snapshotState8);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(lPortfolioDigestSplashLoaded$lambda$152, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (PortfolioDigestSplashLoaded$lambda$26((SnapshotState4) objRememberedValue5)) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
            tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
            if (tweenSpecTween$default == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            composer3 = composer2;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDigestSplashLoaded$lambda$19(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDigestSplashLoaded$lambda$22(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PortfolioDigestSplashLoaded$lambda$25$lambda$24(SnapshotState snapshotState, SnapshotState snapshotState2) {
        return PortfolioDigestSplashLoaded$lambda$21(snapshotState) || PortfolioDigestSplashLoaded$lambda$18(snapshotState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$30$lambda$29(ConstraintSetScope ConstraintSet) {
        Intrinsics.checkNotNullParameter(ConstraintSet, "$this$ConstraintSet");
        ConstraintSetScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefsFor = ConstraintSet.createRefsFor(VIDEO_REF, CONTAINER_REF);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefsFor.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefsFor.component2();
        ConstraintSet.constrain(constraintLayoutBaseScope4Component1, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$30$lambda$29$lambda$27((ConstrainScope) obj);
            }
        });
        ConstraintSet.constrain(constraintLayoutBaseScope4Component2, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$30$lambda$29$lambda$28((ConstrainScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$30$lambda$29$lambda$27(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrain.setWidth(companion.getFillToConstraints());
        constrain.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$30$lambda$29$lambda$28(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$34$lambda$33(ConstraintSetScope ConstraintSet) {
        Intrinsics.checkNotNullParameter(ConstraintSet, "$this$ConstraintSet");
        ConstraintSetScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefsFor = ConstraintSet.createRefsFor(VIDEO_REF, CONTAINER_REF);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefsFor.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefsFor.component2();
        ConstraintSet.constrain(constraintLayoutBaseScope4Component1, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$34$lambda$33$lambda$31((ConstrainScope) obj);
            }
        });
        ConstraintSet.constrain(constraintLayoutBaseScope4Component2, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$34$lambda$33$lambda$32((ConstrainScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$34$lambda$33$lambda$31(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrain.setWidth(companion.getFillToConstraints());
        constrain.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestSplashLoaded$lambda$34$lambda$33$lambda$32(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }
}
