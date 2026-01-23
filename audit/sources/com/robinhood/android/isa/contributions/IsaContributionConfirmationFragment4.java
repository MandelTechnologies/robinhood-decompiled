package com.robinhood.android.isa.contributions;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo;
import com.robinhood.android.isa.contributions.IsaContributionConfirmationFragment4;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.tickerinputview.TickerInputComposable3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: IsaContributionConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003\u001a\u000e\u0010(\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u000e\u0010)\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0010\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"IsaContributionConfirmationComposable", "", "contributionId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo;Landroidx/compose/runtime/Composer;II)V", "TopBar", "showContent", "", "(ZLjava/util/UUID;Landroidx/compose/runtime/Composer;I)V", "BottomContent", "isMaxContribution", "transferred", "", "accountNumber", "(ZZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MaxConfirmationText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StandardConfirmationText", "contributed", "taxYear", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HEADER_DELAY", "", "HEADER_SCALE_DURATION", "", "HEADER_ALPHA_DURATION", "HEADER_SCALE_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "HEADER_ALPHA_EASING", "Landroidx/compose/animation/core/Easing;", "SLIDE_IN_DELAY", "SLIDE_IN_DURATION", "SLIDE_IN_EASING", "viewDetailsDeeplinkUri", "Landroid/net/Uri;", "id", "searchDeeplinkUri", "isaDashboardDeeplinkUri", "lib-isa-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionConfirmationFragment4 {
    private static final int HEADER_ALPHA_DURATION = 833;
    private static final long HEADER_DELAY = 833;
    private static final int HEADER_SCALE_DURATION = 1850;
    private static final long SLIDE_IN_DELAY = 2417;
    private static final int SLIDE_IN_DURATION = 500;
    private static final CubicBezierEasing HEADER_SCALE_EASING = new CubicBezierEasing(0.02f, 0.0f, 0.1f, 1.0f);
    private static final Easing HEADER_ALPHA_EASING = Easing3.getLinearEasing();
    private static final CubicBezierEasing SLIDE_IN_EASING = new CubicBezierEasing(0.02f, 0.0f, 0.1f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BottomContent$lambda$10$lambda$9(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomContent$lambda$11(boolean z, boolean z2, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomContent(z, z2, str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionConfirmationComposable$lambda$0(UUID uuid, Modifier modifier, IsaContributionConfirmationDuxo isaContributionConfirmationDuxo, int i, int i2, Composer composer, int i3) {
        IsaContributionConfirmationComposable(uuid, modifier, isaContributionConfirmationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionConfirmationComposable$lambda$5(UUID uuid, Modifier modifier, IsaContributionConfirmationDuxo isaContributionConfirmationDuxo, int i, int i2, Composer composer, int i3) {
        IsaContributionConfirmationComposable(uuid, modifier, isaContributionConfirmationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaxConfirmationText$lambda$15(Modifier modifier, int i, int i2, Composer composer, int i3) {
        MaxConfirmationText(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardConfirmationText$lambda$17(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StandardConfirmationText(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TopBar$lambda$7$lambda$6(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$8(boolean z, UUID uuid, int i, Composer composer, int i2) {
        TopBar(z, uuid, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IsaContributionConfirmationComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaContributionConfirmationComposable(final UUID contributionId, Modifier modifier, IsaContributionConfirmationDuxo isaContributionConfirmationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        IsaContributionConfirmationDuxo isaContributionConfirmationDuxo2;
        int i4;
        IsaContributionConfirmationDuxo isaContributionConfirmationDuxo3;
        final Modifier modifier3;
        Boolean boolIsMaxContribution;
        final IsaContributionConfirmationDuxo isaContributionConfirmationDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contributionId, "contributionId");
        Composer composerStartRestartGroup = composer.startRestartGroup(317683439);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(contributionId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    isaContributionConfirmationDuxo2 = isaContributionConfirmationDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(isaContributionConfirmationDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    isaContributionConfirmationDuxo2 = isaContributionConfirmationDuxo;
                }
                i3 |= i6;
            } else {
                isaContributionConfirmationDuxo2 = isaContributionConfirmationDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        IsaContributionConfirmationDuxo.InitArgs initArgs = new IsaContributionConfirmationDuxo.InitArgs(contributionId);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IsaContributionConfirmationDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$IsaContributionConfirmationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$IsaContributionConfirmationComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        isaContributionConfirmationDuxo3 = (IsaContributionConfirmationDuxo) baseDuxo;
                    } else {
                        i4 = i3;
                        isaContributionConfirmationDuxo3 = isaContributionConfirmationDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    isaContributionConfirmationDuxo3 = isaContributionConfirmationDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(317683439, i4, -1, "com.robinhood.android.isa.contributions.IsaContributionConfirmationComposable (IsaContributionConfirmationFragment.kt:86)");
                }
                final IsaContributionConfirmationViewState isaContributionConfirmationViewState = (IsaContributionConfirmationViewState) FlowExtKt.collectAsStateWithLifecycle(isaContributionConfirmationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                boolIsMaxContribution = isaContributionConfirmationViewState.isMaxContribution();
                if (boolIsMaxContribution != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final IsaContributionConfirmationDuxo isaContributionConfirmationDuxo5 = isaContributionConfirmationDuxo3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IsaContributionConfirmationFragment4.IsaContributionConfirmationComposable$lambda$0(contributionId, modifier3, isaContributionConfirmationDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final boolean zBooleanValue = boolIsMaxContribution.booleanValue();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!zBooleanValue), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(zBooleanValue);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new IsaContributionConfirmationFragment5(zBooleanValue, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(872600491, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt.IsaContributionConfirmationComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(872600491, i8, -1, "com.robinhood.android.isa.contributions.IsaContributionConfirmationComposable.<anonymous> (IsaContributionConfirmationFragment.kt:107)");
                        }
                        IsaContributionConfirmationFragment4.TopBar(IsaContributionConfirmationFragment4.IsaContributionConfirmationComposable$lambda$2(snapshotState), contributionId, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(400137984, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt.IsaContributionConfirmationComposable.3
                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i8) {
                        int i9;
                        int i10;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i8 & 6) == 0) {
                            i9 = i8 | (composer2.changed(paddingValues) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(400137984, i9, -1, "com.robinhood.android.isa.contributions.IsaContributionConfirmationComposable.<anonymous> (IsaContributionConfirmationFragment.kt:113)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        boolean z = zBooleanValue;
                        IsaContributionConfirmationViewState isaContributionConfirmationViewState2 = isaContributionConfirmationViewState;
                        SnapshotState<Boolean> snapshotState2 = snapshotState;
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composer2.startReplaceGroup(-1811082755);
                            IsaContributionLotties.MaxConfirmationLottie(ContentScale.INSTANCE.getCrop(), SizeKt.fillMaxSize$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 1, null), composer2, 6, 0);
                            composer2.endReplaceGroup();
                            i10 = 0;
                        } else if (isaContributionConfirmationViewState2.getInitialProgress() == null || isaContributionConfirmationViewState2.getTargetProgress() == null) {
                            i10 = 0;
                            composer2.startReplaceGroup(-1810263332);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1810741910);
                            i10 = 0;
                            IsaContributionLotties.StandardConfirmationLottie(isaContributionConfirmationViewState2.getInitialProgress().floatValue(), isaContributionConfirmationViewState2.getTargetProgress().floatValue(), AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getTopCenter()), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), 1.0f, false, 2, null), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        IsaContributionConfirmationFragment4.BottomContent(z, IsaContributionConfirmationFragment4.IsaContributionConfirmationComposable$lambda$2(snapshotState2), isaContributionConfirmationViewState2.getTransferred(), isaContributionConfirmationViewState2.getAccountNumber(), SizeKt.fillMaxHeight(boxScopeInstance.align(companion2, companion3.getBottomCenter()), 0.5f), composer2, 0, 0);
                        if (z) {
                            composer2.startReplaceGroup(-1809767022);
                            IsaContributionConfirmationFragment4.MaxConfirmationText(PaddingKt.m5144paddingVpY3zN4$default(boxScopeInstance.align(companion2, companion3.getCenter()), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21596getXxlargeD9Ej5fM(), 0.0f, 2, null), composer2, i10, i10);
                            composer2.endReplaceGroup();
                        } else if (isaContributionConfirmationViewState2.getContributed() == null || isaContributionConfirmationViewState2.getTaxYear() == null) {
                            composer2.startReplaceGroup(-1809152292);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1809462695);
                            IsaContributionConfirmationFragment4.StandardConfirmationText(isaContributionConfirmationViewState2.getContributed(), isaContributionConfirmationViewState2.getTaxYear(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, composer2, i10, 1), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                isaContributionConfirmationDuxo4 = isaContributionConfirmationDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                isaContributionConfirmationDuxo4 = isaContributionConfirmationDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionConfirmationFragment4.IsaContributionConfirmationComposable$lambda$5(contributionId, modifier3, isaContributionConfirmationDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final IsaContributionConfirmationViewState isaContributionConfirmationViewState2 = (IsaContributionConfirmationViewState) FlowExtKt.collectAsStateWithLifecycle(isaContributionConfirmationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                boolIsMaxContribution = isaContributionConfirmationViewState2.isMaxContribution();
                if (boolIsMaxContribution != null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IsaContributionConfirmationComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBar(boolean z, final UUID uuid, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(87703367);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uuid) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(87703367, i2, -1, "com.robinhood.android.isa.contributions.TopBar (IsaContributionConfirmationFragment.kt:168)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, SLIDE_IN_EASING, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(IsaContributionConfirmationFragment4.TopBar$lambda$7$lambda$6(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-2062935185, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt.TopBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: IsaContributionConfirmationFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$TopBar$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ UUID $contributionId;
                    final /* synthetic */ Navigator $navigator;

                    AnonymousClass1(Navigator navigator, Context context, UUID uuid) {
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$contributionId = uuid;
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
                            ComposerKt.traceEventStart(1044637453, i, -1, "com.robinhood.android.isa.contributions.TopBar.<anonymous>.<anonymous> (IsaContributionConfirmationFragment.kt:185)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                        String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_view_details_action, composer, 0);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$contributionId);
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        final UUID uuid = this.$contributionId;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$TopBar$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IsaContributionConfirmationFragment4.C198952.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context, uuid);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer, 0, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, UUID uuid) {
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionConfirmationFragment4.viewDetailsDeeplinkUri(uuid), null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2062935185, i3, -1, "com.robinhood.android.isa.contributions.TopBar.<anonymous> (IsaContributionConfirmationFragment.kt:182)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(IsaContributionConfirmationFragment2.INSTANCE.getLambda$198420514$lib_isa_contributions_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(1044637453, true, new AnonymousClass1(navigator, context, uuid), composer2, 54), null, true, false, null, null, 0L, null, composer2, 199686, 0, 2006);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 196608, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaContributionConfirmationFragment4.TopBar$lambda$8(z2, uuid, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomContent(final boolean z, final boolean z2, final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        String str3;
        String str4;
        int i4;
        final Modifier modifier2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(56760699);
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
        } else {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                str3 = str;
            } else {
                str3 = str;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(56760699, i3, -1, "com.robinhood.android.isa.contributions.BottomContent (IsaContributionConfirmationFragment.kt:208)");
                    }
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, SLIDE_IN_EASING, 2, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(IsaContributionConfirmationFragment4.BottomContent$lambda$10$lambda$9(((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = modifier3;
                    AnimatedVisibilityKt.AnimatedVisibility(z4, modifier4, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-755735981, true, new C198892(z3, str3, str4, navigator, context), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | ((i3 >> 9) & 112), 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IsaContributionConfirmationFragment4.BottomContent$lambda$11(z, z2, str, str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(500, 0, SLIDE_IN_EASING, 2, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier3;
                AnimatedVisibilityKt.AnimatedVisibility(z4, modifier42, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default2, (Function1) objRememberedValue), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-755735981, true, new C198892(z3, str3, str4, navigator2, context2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | ((i3 >> 9) & 112), 24);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IsaContributionConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$BottomContent$2 */
    static final class C198892 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isMaxContribution;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ String $transferred;

        C198892(boolean z, String str, String str2, Navigator navigator, Context context) {
            this.$isMaxContribution = z;
            this.$transferred = str;
            this.$accountNumber = str2;
            this.$navigator = navigator;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            BentoTheme bentoTheme;
            int i2;
            String str;
            Navigator navigator;
            Context context;
            int i3;
            Composer composer2;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-755735981, i, -1, "com.robinhood.android.isa.contributions.BottomContent.<anonymous> (IsaContributionConfirmationFragment.kt:223)");
            }
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceGroup(-412802298);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(bentoTheme2.getSpacing(composer, i4).m21596getXxlargeD9Ej5fM());
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxHeight$default(Background3.background$default(companion, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU())}), 0.0f, fMo5016toPx0680j_4, 0, 10, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null)), 0.0f, composer, 0, 1);
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            boolean z = this.$isMaxContribution;
            String str2 = this.$transferred;
            String str3 = this.$accountNumber;
            Navigator navigator2 = this.$navigator;
            Context context2 = this.$context;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (z) {
                composer.startReplaceGroup(155005357);
                navigator = navigator2;
                bentoTheme = bentoTheme2;
                str = str3;
                context = context2;
                i2 = i4;
                i3 = 0;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_maxed_metadata, composer, 0), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16318);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                bentoTheme = bentoTheme2;
                i2 = i4;
                str = str3;
                navigator = navigator2;
                context = context2;
                i3 = 0;
                composer.startReplaceGroup(155216033);
                if (str2 == null) {
                    composer2 = composer;
                } else {
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_standard_metadata, new Object[]{str2}, composer, 0), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16318);
                    composer2 = composer;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(282112219);
            if (str != null) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_disclosure, composer2, i3);
                String strStringResource2 = StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_find_investments_cta, composer2, i3);
                String strStringResource3 = StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_invest_later_cta, composer2, i3);
                composer2.startReplaceGroup(-1746271574);
                final Navigator navigator3 = navigator;
                final Context context3 = context;
                final String str4 = str;
                boolean zChangedInstance = composer2.changedInstance(navigator3) | composer2.changedInstance(context3) | composer2.changed(str4);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$BottomContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaContributionConfirmationFragment4.C198892.invoke$lambda$7$lambda$6$lambda$3$lambda$2(navigator3, context3, str4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer2.changedInstance(navigator3) | composer2.changedInstance(context3) | composer2.changed(str4);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$BottomContent$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaContributionConfirmationFragment4.C198892.invoke$lambda$7$lambda$6$lambda$5$lambda$4(navigator3, context3, str4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default, strStringResource, null, false, null, null, function0, strStringResource2, false, null, false, (Function0) objRememberedValue2, strStringResource3, false, null, false, composer, 0, 0, 59196);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$3$lambda$2(Navigator navigator, Context context, String str) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionConfirmationFragment4.searchDeeplinkUri(str), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(Navigator navigator, Context context, String str) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionConfirmationFragment4.isaDashboardDeeplinkUri(str), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MaxConfirmationText(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-963373157);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963373157, i3, -1, "com.robinhood.android.isa.contributions.MaxConfirmationText (IsaContributionConfirmationFragment.kt:283)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(1.25f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable2 = (Animatable) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new IsaContributionConfirmationFragment6(animatable, animatable2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            Modifier modifierAlpha = Alpha.alpha(Scale2.scale(modifier4, ((Number) animatable.getValue()).floatValue()), ((Number) animatable2.getValue()).floatValue());
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_maxed_title, composerStartRestartGroup, 0), modifierAlpha, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleLarge(), composer2, 0, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaContributionConfirmationFragment4.MaxConfirmationText$lambda$15(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StandardConfirmationText(final String str, String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-157349648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-157349648, i3, -1, "com.robinhood.android.isa.contributions.StandardConfirmationText (IsaContributionConfirmationFragment.kt:330)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), centerHorizontally, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifier4 = modifier3;
                    TickerInputComposable3.m19249TickerInputComposableuSRqIlo(str3, null, false, false, C2002Dp.m7995constructorimpl(40), 0, false, null, composerStartRestartGroup, (i3 & 14) | 24576, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_standard_subtitle, new Object[]{str4}, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final String str5 = str4;
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IsaContributionConfirmationFragment4.StandardConfirmationText$lambda$17(str, str5, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), centerHorizontally2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifier42 = modifier3;
                    TickerInputComposable3.m19249TickerInputComposableuSRqIlo(str3, null, false, false, C2002Dp.m7995constructorimpl(40), 0, false, null, composerStartRestartGroup, (i3 & 14) | 24576, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_confirmation_standard_subtitle, new Object[]{str4}, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Uri viewDetailsDeeplinkUri(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Uri.parse("robinhood://transfers?id=" + id + "&type=uk_open_banking_transfer");
    }

    public static final Uri searchDeeplinkUri(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Uri.parse("robinhood://search?account_number=" + accountNumber);
    }

    public static final Uri isaDashboardDeeplinkUri(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Uri.parse("robinhood://isa_dashboard?accountNumber=" + accountNumber);
    }
}
