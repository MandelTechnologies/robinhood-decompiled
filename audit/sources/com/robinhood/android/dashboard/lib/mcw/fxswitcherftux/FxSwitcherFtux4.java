package com.robinhood.android.dashboard.lib.mcw.fxswitcherftux;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.dashboard.lib.DashboardViewState;
import com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux4;
import com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxState;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.FxSwitcherFtuxAnimationConstants;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.bottomtab.controller.BottomTabsController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FxSwitcherFtux.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002"}, m3636d2 = {"FxSwitcherFtux", "", "accountNumber", "", "state", "Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxDuxo;", "onClose", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FadingBentoText", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "ftuxState", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;", "startFxSwitcherFtuxAnimation", "", "showBars", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FxSwitcherFtux4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FadingBentoText$lambda$17(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FadingBentoText(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxSwitcherFtux$lambda$14(String str, DashboardViewState.Loaded loaded, Modifier modifier, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        FxSwitcherFtux(str, loaded, modifier, fxSwitcherFtuxDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FxSwitcherFtux(final String accountNumber, final DashboardViewState.Loaded state, Modifier modifier, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo2;
        int i4;
        Function0<Unit> function02;
        Modifier modifier3;
        int i5;
        boolean z;
        final Function0<Unit> function03;
        BottomTabsController bottomTabsController;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final Event<FxSwitcherFtuxState.Event> eventFxSwitcherFtux$lambda$10;
        final SnapshotState snapshotState2;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo3;
        final Function0<Unit> function04;
        final Modifier modifier4;
        EventConsumer<FxSwitcherFtuxState.Event> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1809276613);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    fxSwitcherFtuxDuxo2 = fxSwitcherFtuxDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(fxSwitcherFtuxDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    fxSwitcherFtuxDuxo2 = fxSwitcherFtuxDuxo;
                }
                i3 |= i7;
            } else {
                fxSwitcherFtuxDuxo2 = fxSwitcherFtuxDuxo;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    fxSwitcherFtuxDuxo3 = fxSwitcherFtuxDuxo2;
                    function04 = function02;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i5 = 1849434622;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FxSwitcherFtuxDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo4 = (FxSwitcherFtuxDuxo) baseDuxo;
                            i3 &= -7169;
                            z = false;
                            fxSwitcherFtuxDuxo2 = fxSwitcherFtuxDuxo4;
                        } else {
                            i5 = 1849434622;
                            z = false;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(i5);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue7;
                        } else {
                            function03 = function0;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        function03 = function02;
                        i5 = 1849434622;
                        z = false;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1809276613, i3, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux (FxSwitcherFtux.kt:76)");
                    }
                    Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    bottomTabsController = !(objConsume instanceof BottomTabsController) ? (BottomTabsController) objConsume : null;
                    boolean z2 = z;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(fxSwitcherFtuxDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final FxSwitcherFtuxState.Step currentStep = FxSwitcherFtux$lambda$2(snapshotState4CollectAsStateWithLifecycle).getCurrentStep();
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants = FxSwitcherFtuxAnimationConstants.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(i5);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(i5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(fxSwitcherFtuxDuxo2) | composerStartRestartGroup.changedInstance(bottomTabsController);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new FxSwitcherFtux5(fxSwitcherFtuxDuxo2, bottomTabsController, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                    final StateFlow<Event<FxSwitcherFtuxState.Event>> eventFlow = fxSwitcherFtuxDuxo2.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "FxSwitcherFtux.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof FxSwitcherFtuxState.Event) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<FxSwitcherFtuxState.Event> value = eventFlow.getValue();
                    Event<FxSwitcherFtuxState.Event> event = value;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, !((event != null ? event.getData() : null) instanceof FxSwitcherFtuxState.Event) ? value : null, lifecycleOwner.getLifecycle(), state2, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventFxSwitcherFtux$lambda$10 = FxSwitcherFtux$lambda$10(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventFxSwitcherFtux$lambda$10 == null && (eventFxSwitcherFtux$lambda$10.getData() instanceof FxSwitcherFtuxState.Event.Exit) && (eventConsumerInvoke = eventFxSwitcherFtux$lambda$10.getGetEventConsumer().invoke()) != null) {
                        final BottomTabsController bottomTabsController2 = bottomTabsController;
                        snapshotState2 = snapshotState;
                        eventConsumerInvoke.consume(eventFxSwitcherFtux$lambda$10, new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m13215invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13215invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FxSwitcherFtux6(bottomTabsController2, function03, snapshotState2, null), 3, null);
                            }
                        });
                    } else {
                        snapshotState2 = snapshotState;
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(fxSwitcherFtuxDuxo2);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FxSwitcherFtux4.FxSwitcherFtux$lambda$13$lambda$12(fxSwitcherFtuxDuxo2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(z2, (Function0) objRememberedValue5, composerStartRestartGroup, z2 ? 1 : 0, 1);
                    final Modifier modifier5 = modifier3;
                    final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo5 = fxSwitcherFtuxDuxo2;
                    final SnapshotState snapshotState4 = snapshotState2;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(230719878, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt.FxSwitcherFtux.5
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
                                ComposerKt.traceEventStart(230719878, i8, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous> (FxSwitcherFtux.kt:108)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FX_SWITCHER_FTUX, null, null, null, 14, null), null, null, null, null, 61, null);
                            final Modifier modifier6 = modifier5;
                            final SnapshotState<Boolean> snapshotState5 = snapshotState4;
                            final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo6 = fxSwitcherFtuxDuxo5;
                            final FxSwitcherFtuxState.Step step = currentStep;
                            final SnapshotState4<FxSwitcherFtuxState.Data> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                            final SnapshotState<Boolean> snapshotState6 = snapshotState3;
                            final String str = accountNumber;
                            final DashboardViewState.Loaded loaded = state;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1850764721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt.FxSwitcherFtux.5.1

                                /* compiled from: FxSwitcherFtux.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3, reason: invalid class name */
                                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                    final /* synthetic */ String $accountNumber;
                                    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                    final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                    final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;
                                    final /* synthetic */ DashboardViewState.Loaded $state;

                                    AnonymousClass3(String str, DashboardViewState.Loaded loaded, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, SnapshotState<Boolean> snapshotState) {
                                        this.$accountNumber = str;
                                        this.$state = loaded;
                                        this.$duxo = fxSwitcherFtuxDuxo;
                                        this.$ftuxState$delegate = snapshotState4;
                                        this.$startFxSwitcherFtuxAnimation$delegate = snapshotState;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i & 6) == 0) {
                                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-323400766, i2, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:222)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion2 = Composer.INSTANCE;
                                        if (objRememberedValue == companion2.getEmpty()) {
                                            objRememberedValue = new PointerInputEventHandler() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1

                                                /* compiled from: FxSwitcherFtux.kt */
                                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1$1", m3645f = "FxSwitcherFtux.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
                                                @SourceDebugExtension
                                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1$1 */
                                                static final class C137711 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                                    private /* synthetic */ Object L$0;
                                                    int label;

                                                    C137711(Continuation<? super C137711> continuation) {
                                                        super(2, continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        C137711 c137711 = new C137711(continuation);
                                                        c137711.L$0 = obj;
                                                        return c137711;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                                        return ((C137711) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
                                                    
                                                        if (r6 == r0) goto L15;
                                                     */
                                                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:16:0x0049). Please report as a decompilation issue!!! */
                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final Object invokeSuspend(Object obj) {
                                                        AwaitPointerEventScope awaitPointerEventScope;
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                            PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                                            this.L$0 = awaitPointerEventScope;
                                                            this.label = 1;
                                                            if (TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass, this) != coroutine_suspended) {
                                                            }
                                                            return coroutine_suspended;
                                                        }
                                                        if (i != 1) {
                                                            if (i != 2) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                            ResultKt.throwOnFailure(obj);
                                                            PointerEvent pointerEvent = (PointerEvent) obj;
                                                            Iterator<T> it = pointerEvent.getChanges().iterator();
                                                            while (it.hasNext()) {
                                                                ((PointerInputChange) it.next()).consume();
                                                            }
                                                            List<PointerInputChange> changes = pointerEvent.getChanges();
                                                            if (!(changes instanceof Collection) || !changes.isEmpty()) {
                                                                Iterator<T> it2 = changes.iterator();
                                                                while (it2.hasNext()) {
                                                                    if (((PointerInputChange) it2.next()).getPressed()) {
                                                                    }
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                        ResultKt.throwOnFailure(obj);
                                                        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                                        this.L$0 = awaitPointerEventScope;
                                                        this.label = 2;
                                                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                                                    }
                                                }

                                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                    Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C137711(null), continuation);
                                                    return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPadding, pointerEventPass, (PointerInputEventHandler) objRememberedValue);
                                        String str = this.$accountNumber;
                                        DashboardViewState.Loaded loaded = this.$state;
                                        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                        SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4 = this.$ftuxState$delegate;
                                        SnapshotState<Boolean> snapshotState = this.$startFxSwitcherFtuxAnimation$delegate;
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPointerInput);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor2);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        FxSwitcherFtuxState.Data dataFxSwitcherFtux$lambda$2 = FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4);
                                        boolean zFxSwitcherFtux$lambda$4 = FxSwitcherFtux4.FxSwitcherFtux$lambda$4(snapshotState);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(fxSwitcherFtuxDuxo);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass3.invoke$lambda$4$lambda$3$lambda$2$lambda$1(fxSwitcherFtuxDuxo);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        FxSwitcherFtuxDashboard.FxSwitcherFtuxDashboard(str, loaded, dataFxSwitcherFtux$lambda$2, zFxSwitcherFtux$lambda$4, null, (Function0) objRememberedValue2, composer, 0, 16);
                                        composer.endNode();
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                        invoke(paddingValues, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                        fxSwitcherFtuxDuxo.onContinue();
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: FxSwitcherFtux.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C498461 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                    final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;

                                    C498461(SnapshotState<Boolean> snapshotState, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, FxSwitcherFtuxState.Step step) {
                                        this.$showBars$delegate = snapshotState;
                                        this.$duxo = fxSwitcherFtuxDuxo;
                                        this.$currentStep = step;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final int invoke$lambda$4$lambda$1$lambda$0(int i) {
                                        return -i;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final int invoke$lambda$4$lambda$3$lambda$2(int i) {
                                        return -i;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1701245549, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:116)");
                                        }
                                        SnapshotState<Boolean> snapshotState = this.$showBars$delegate;
                                        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                        final FxSwitcherFtuxState.Step step = this.$currentStep;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        boolean zFxSwitcherFtux$lambda$7 = FxSwitcherFtux4.FxSwitcherFtux$lambda$7(snapshotState);
                                        EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion2.getTop(), false, null, 12, null);
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion4 = Composer.INSTANCE;
                                        if (objRememberedValue == companion4.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.C498461.invoke$lambda$4$lambda$1$lambda$0(((Integer) obj).intValue()));
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        EnterTransition enterTransitionPlus = enterTransitionExpandVertically$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
                                        ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion2.getTop(), false, null, 12, null);
                                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == companion4.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.C498461.invoke$lambda$4$lambda$3$lambda$2(((Integer) obj).intValue()));
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        AnimatedVisibilityKt.AnimatedVisibility(column6, zFxSwitcherFtux$lambda$7, (Modifier) null, enterTransitionPlus, exitTransitionShrinkVertically$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue2)), (String) null, ComposableLambda3.rememberComposableLambda(708588767, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* compiled from: FxSwitcherFtux.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1 */
                                            static final class C137691 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                                final /* synthetic */ FxSwitcherFtuxDuxo $duxo;

                                                C137691(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                                    this.$duxo = fxSwitcherFtuxDuxo;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                                    invoke(bentoAppBarScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                                    int i2;
                                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                    if ((i & 6) == 0) {
                                                        i2 = i | ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2);
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-598535554, i2, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:146)");
                                                    }
                                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor("exit_fx_switcher_ftux", null, UserInteractionEventData.Action.CANCEL, null, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 42, null), false, false, false, true, false, null, 110, null);
                                                    composer.startReplaceGroup(5004770);
                                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                                    final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = 
                                                        /*  JADX ERROR: Method code generation error
                                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = (r5v0 'fxSwitcherFtuxDuxo' com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo A[DONT_INLINE]) A[MD:(com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo):void (m)] (LINE:156) call: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo):void type: CONSTRUCTOR in method: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                            	... 25 more
                                                            */
                                                        /*
                                                            this = this;
                                                            r0 = r19
                                                            r1 = r20
                                                            r7 = r21
                                                            java.lang.String r2 = "$this$BentoAppBar"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                                                            r2 = r22 & 6
                                                            if (r2 != 0) goto L24
                                                            r2 = r22 & 8
                                                            if (r2 != 0) goto L18
                                                            boolean r2 = r7.changed(r1)
                                                            goto L1c
                                                        L18:
                                                            boolean r2 = r7.changedInstance(r1)
                                                        L1c:
                                                            if (r2 == 0) goto L20
                                                            r2 = 4
                                                            goto L21
                                                        L20:
                                                            r2 = 2
                                                        L21:
                                                            r2 = r22 | r2
                                                            goto L26
                                                        L24:
                                                            r2 = r22
                                                        L26:
                                                            r3 = r2 & 19
                                                            r4 = 18
                                                            if (r3 != r4) goto L37
                                                            boolean r3 = r7.getSkipping()
                                                            if (r3 != 0) goto L33
                                                            goto L37
                                                        L33:
                                                            r7.skipToGroupEnd()
                                                            return
                                                        L37:
                                                            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                            if (r3 == 0) goto L46
                                                            r3 = -1
                                                            java.lang.String r4 = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:146)"
                                                            r5 = -598535554(0xffffffffdc53127e, float:-2.3764621E17)
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r2, r3, r4)
                                                        L46:
                                                            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p011ui.Modifier.INSTANCE
                                                            com.robinhood.rosetta.eventlogging.UserInteractionEventData$Action r12 = com.robinhood.rosetta.eventlogging.UserInteractionEventData.Action.CANCEL
                                                            com.robinhood.rosetta.eventlogging.Component r13 = new com.robinhood.rosetta.eventlogging.Component
                                                            com.robinhood.rosetta.eventlogging.Component$ComponentType r14 = com.robinhood.rosetta.eventlogging.Component.ComponentType.CLOSE_BUTTON
                                                            r17 = 6
                                                            r18 = 0
                                                            r15 = 0
                                                            r16 = 0
                                                            r13.<init>(r14, r15, r16, r17, r18)
                                                            com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r9 = new com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor
                                                            r16 = 42
                                                            r17 = 0
                                                            java.lang.String r10 = "exit_fx_switcher_ftux"
                                                            r11 = 0
                                                            r14 = r13
                                                            r13 = 0
                                                            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                                                            r16 = 110(0x6e, float:1.54E-43)
                                                            r10 = 0
                                                            r11 = 0
                                                            r12 = 0
                                                            r13 = 1
                                                            r14 = 0
                                                            androidx.compose.ui.Modifier r3 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                                            r4 = 5004770(0x4c5de2, float:7.013177E-39)
                                                            r7.startReplaceGroup(r4)
                                                            com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo r4 = r0.$duxo
                                                            boolean r4 = r7.changedInstance(r4)
                                                            com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo r5 = r0.$duxo
                                                            java.lang.Object r6 = r7.rememberedValue()
                                                            if (r4 != 0) goto L8d
                                                            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                                                            java.lang.Object r4 = r4.getEmpty()
                                                            if (r6 != r4) goto L95
                                                        L8d:
                                                            com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0
                                                            r6.<init>(r5)
                                                            r7.updateRememberedValue(r6)
                                                        L95:
                                                            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                                                            r7.endReplaceGroup()
                                                            int r4 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                                            int r4 = r4 << 12
                                                            r5 = 57344(0xe000, float:8.0356E-41)
                                                            int r2 = r2 << 12
                                                            r2 = r2 & r5
                                                            r8 = r4 | r2
                                                            r9 = 6
                                                            r2 = r3
                                                            r3 = 0
                                                            r4 = 0
                                                            r1.m20576BentoCloseButtoncf5BqRc(r2, r3, r4, r6, r7, r8, r9)
                                                            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                            if (r1 == 0) goto Lb7
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                        Lb7:
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux7.C137691.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final Unit invoke$lambda$1$lambda$0(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                                        fxSwitcherFtuxDuxo.closeFtux();
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(708588767, i2, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:136)");
                                                    }
                                                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                                    Function2<Composer, Integer, Unit> function2M13213getLambda$1604700078$lib_account_home_externalDebug = FxSwitcherFtux.INSTANCE.m13213getLambda$1604700078$lib_account_home_externalDebug();
                                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-598535554, true, new C137691(fxSwitcherFtuxDuxo), composer2, 54);
                                                    final FxSwitcherFtuxState.Step step2 = step;
                                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M13213getLambda$1604700078$lib_account_home_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-757548627, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3.2
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                            invoke(boxScope, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i3) {
                                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                            if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-757548627, i3, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:143)");
                                                            }
                                                            BentoProgressBar2.m20698BentoProgressBarjB83MbM(step2.getProgress(), null, 0, 0L, 0L, false, composer3, 0, 62);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer2, 54), false, false, appBarType, null, 0L, null, composer2, 12607878, 0, 1898);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer, 54), composer, 1572870, 18);
                                            composer.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1850764721, i9, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous> (FxSwitcherFtux.kt:113)");
                                        }
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(1701245549, true, new C498461(snapshotState5, fxSwitcherFtuxDuxo6, step), composer3, 54), ComposableLambda3.rememberComposableLambda(-1392580404, true, new AnonymousClass2(snapshotState5, step, snapshotState42, fxSwitcherFtuxDuxo6, snapshotState6), composer3, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-323400766, true, new AnonymousClass3(str, loaded, fxSwitcherFtuxDuxo6, snapshotState42, snapshotState6), composer3, 54), composer3, 805306800, 504);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: FxSwitcherFtux.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                        final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                        final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                        final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;
                                        final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;

                                        AnonymousClass2(SnapshotState<Boolean> snapshotState, FxSwitcherFtuxState.Step step, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState<Boolean> snapshotState2) {
                                            this.$showBars$delegate = snapshotState;
                                            this.$currentStep = step;
                                            this.$ftuxState$delegate = snapshotState4;
                                            this.$duxo = fxSwitcherFtuxDuxo;
                                            this.$startFxSwitcherFtuxAnimation$delegate = snapshotState2;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$1$lambda$0(int i) {
                                            return i;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$3$lambda$2(int i) {
                                            return i;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            if ((i & 3) == 2 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1392580404, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:165)");
                                            }
                                            boolean zFxSwitcherFtux$lambda$7 = FxSwitcherFtux4.FxSwitcherFtux$lambda$7(this.$showBars$delegate);
                                            Alignment.Companion companion = Alignment.INSTANCE;
                                            EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion.getBottom(), false, null, 12, null);
                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                            composer.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composer.rememberedValue();
                                            Composer.Companion companion2 = Composer.INSTANCE;
                                            if (objRememberedValue == companion2.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            EnterTransition enterTransitionPlus = enterTransitionExpandVertically$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
                                            ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion.getBottom(), false, null, 12, null);
                                            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                            composer.startReplaceGroup(1849434622);
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (objRememberedValue2 == companion2.getEmpty()) {
                                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(((Integer) obj).intValue()));
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            AnimatedVisibilityKt.AnimatedVisibility(zFxSwitcherFtux$lambda$7, (Modifier) null, enterTransitionPlus, exitTransitionShrinkVertically$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue2)), (String) null, ComposableLambda3.rememberComposableLambda(1117864692, true, new AnonymousClass3(this.$currentStep, this.$ftuxState$delegate, this.$duxo, this.$startFxSwitcherFtuxAnimation$delegate), composer, 54), composer, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* compiled from: FxSwitcherFtux.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$3, reason: invalid class name */
                                        static final class AnonymousClass3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                            final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                            final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                            final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                            final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;

                                            AnonymousClass3(FxSwitcherFtuxState.Step step, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState<Boolean> snapshotState) {
                                                this.$currentStep = step;
                                                this.$ftuxState$delegate = snapshotState4;
                                                this.$duxo = fxSwitcherFtuxDuxo;
                                                this.$startFxSwitcherFtuxAnimation$delegate = snapshotState;
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                                invoke(animatedVisibilityScope, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                                String strStringResource;
                                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1117864692, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:186)");
                                                }
                                                composer.startReplaceGroup(526146809);
                                                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                                                float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6).getBottom(density));
                                                composer.endReplaceGroup();
                                                if (this.$currentStep.isLastStep()) {
                                                    composer.startReplaceGroup(-869119362);
                                                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_get_started, composer, 0);
                                                    composer.endReplaceGroup();
                                                } else {
                                                    composer.startReplaceGroup(-869002399);
                                                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                                                    composer.endReplaceGroup();
                                                }
                                                String str = strStringResource;
                                                FxSwitcherFtuxState.Step step = this.$currentStep;
                                                final SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4 = this.$ftuxState$delegate;
                                                final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                                final SnapshotState<Boolean> snapshotState = this.$startFxSwitcherFtuxAnimation$delegate;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composer, 0, 7);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i2 = BentoTheme.$stable;
                                                FxSwitcherFtux4.FadingBentoText(StringResources_androidKt.stringResource(step.getContent(), composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), composer, 0, 0);
                                                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                                                composer.startReplaceGroup(-1746271574);
                                                boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(fxSwitcherFtuxDuxo);
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$3$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.AnonymousClass3.invoke$lambda$3$lambda$2$lambda$1(fxSwitcherFtuxDuxo, snapshotState4, snapshotState);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, fMo5013toDpu2uoSUM), composer, 0);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$3$lambda$2$lambda$1(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
                                                FxSwitcherFtux4.FxSwitcherFtux$lambda$5(snapshotState, FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4).getIsFxSwitcherStep());
                                                if (!FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4).getIsFxSwitcherStep()) {
                                                    fxSwitcherFtuxDuxo.onContinue();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fxSwitcherFtuxDuxo3 = fxSwitcherFtuxDuxo5;
                        function04 = function03;
                        modifier4 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FxSwitcherFtux4.FxSwitcherFtux$lambda$14(accountNumber, state, modifier4, fxSwitcherFtuxDuxo3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Object objConsume2 = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        if (!(objConsume2 instanceof BottomTabsController)) {
                        }
                        boolean z22 = z;
                        final SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(fxSwitcherFtuxDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        final FxSwitcherFtuxState.Step currentStep2 = FxSwitcherFtux$lambda$2(snapshotState4CollectAsStateWithLifecycle3).getCurrentStep();
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                        FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants2 = FxSwitcherFtuxAnimationConstants.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(i5);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        final SnapshotState<Boolean> snapshotState32 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(i5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(fxSwitcherFtuxDuxo2) | composerStartRestartGroup.changedInstance(bottomTabsController);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue4 = new FxSwitcherFtux5(fxSwitcherFtuxDuxo2, bottomTabsController, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                            final Flow eventFlow2 = fxSwitcherFtuxDuxo2.getEventFlow();
                            composerStartRestartGroup.startReplaceGroup(-523522313);
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            Lifecycle.State state22 = Lifecycle.State.STARTED;
                            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "FxSwitcherFtux.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        Object L$1;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector) {
                                        this.$this_unsafeFlow = flowCollector;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            Event event = (Event) obj;
                                            if ((event != null ? event.getData() : null) instanceof FxSwitcherFtuxState.Event) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            Event<FxSwitcherFtuxState.Event> value2 = eventFlow2.getValue();
                            Event<FxSwitcherFtuxState.Event> event2 = value2;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, !((event2 != null ? event2.getData() : null) instanceof FxSwitcherFtuxState.Event) ? value2 : null, lifecycleOwner2.getLifecycle(), state22, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            eventFxSwitcherFtux$lambda$10 = FxSwitcherFtux$lambda$10(snapshotState4CollectAsStateWithLifecycle22);
                            if (eventFxSwitcherFtux$lambda$10 == null) {
                                snapshotState2 = snapshotState;
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(fxSwitcherFtuxDuxo2);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FxSwitcherFtux4.FxSwitcherFtux$lambda$13$lambda$12(fxSwitcherFtuxDuxo2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    composerStartRestartGroup.endReplaceGroup();
                                    BackHandler.BackHandler(z22, (Function0) objRememberedValue5, composerStartRestartGroup, z22 ? 1 : 0, 1);
                                    final Modifier modifier52 = modifier3;
                                    final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo52 = fxSwitcherFtuxDuxo2;
                                    final SnapshotState<Boolean> snapshotState42 = snapshotState2;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(230719878, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt.FxSwitcherFtux.5
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
                                                ComposerKt.traceEventStart(230719878, i8, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous> (FxSwitcherFtux.kt:108)");
                                            }
                                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FX_SWITCHER_FTUX, null, null, null, 14, null), null, null, null, null, 61, null);
                                            final Modifier modifier6 = modifier52;
                                            final SnapshotState<Boolean> snapshotState5 = snapshotState42;
                                            final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo6 = fxSwitcherFtuxDuxo52;
                                            final FxSwitcherFtuxState.Step step = currentStep2;
                                            final SnapshotState4<FxSwitcherFtuxState.Data> snapshotState422 = snapshotState4CollectAsStateWithLifecycle3;
                                            final SnapshotState<Boolean> snapshotState6 = snapshotState32;
                                            final String str = accountNumber;
                                            final DashboardViewState.Loaded loaded = state;
                                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1850764721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt.FxSwitcherFtux.5.1

                                                /* compiled from: FxSwitcherFtux.kt */
                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                @SourceDebugExtension
                                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3, reason: invalid class name */
                                                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                                    final /* synthetic */ String $accountNumber;
                                                    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                                    final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                                    final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;
                                                    final /* synthetic */ DashboardViewState.Loaded $state;

                                                    AnonymousClass3(String str, DashboardViewState.Loaded loaded, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, SnapshotState<Boolean> snapshotState) {
                                                        this.$accountNumber = str;
                                                        this.$state = loaded;
                                                        this.$duxo = fxSwitcherFtuxDuxo;
                                                        this.$ftuxState$delegate = snapshotState4;
                                                        this.$startFxSwitcherFtuxAnimation$delegate = snapshotState;
                                                    }

                                                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                                        int i2;
                                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                        if ((i & 6) == 0) {
                                                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                                        } else {
                                                            i2 = i;
                                                        }
                                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-323400766, i2, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:222)");
                                                        }
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                                        composer.startReplaceGroup(1849434622);
                                                        Object objRememberedValue = composer.rememberedValue();
                                                        Composer.Companion companion2 = Composer.INSTANCE;
                                                        if (objRememberedValue == companion2.getEmpty()) {
                                                            objRememberedValue = new PointerInputEventHandler() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1

                                                                /* compiled from: FxSwitcherFtux.kt */
                                                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1$1", m3645f = "FxSwitcherFtux.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
                                                                @SourceDebugExtension
                                                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$1$1$1 */
                                                                static final class C137711 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                                                    private /* synthetic */ Object L$0;
                                                                    int label;

                                                                    C137711(Continuation<? super C137711> continuation) {
                                                                        super(2, continuation);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        C137711 c137711 = new C137711(continuation);
                                                                        c137711.L$0 = obj;
                                                                        return c137711;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                                                        return ((C137711) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
                                                                    
                                                                        if (r6 == r0) goto L15;
                                                                     */
                                                                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:16:0x0049). Please report as a decompilation issue!!! */
                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        AwaitPointerEventScope awaitPointerEventScope;
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                                            PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                                                            this.L$0 = awaitPointerEventScope;
                                                                            this.label = 1;
                                                                            if (TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass, this) != coroutine_suspended) {
                                                                            }
                                                                            return coroutine_suspended;
                                                                        }
                                                                        if (i != 1) {
                                                                            if (i != 2) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                                            ResultKt.throwOnFailure(obj);
                                                                            PointerEvent pointerEvent = (PointerEvent) obj;
                                                                            Iterator<T> it = pointerEvent.getChanges().iterator();
                                                                            while (it.hasNext()) {
                                                                                ((PointerInputChange) it.next()).consume();
                                                                            }
                                                                            List<PointerInputChange> changes = pointerEvent.getChanges();
                                                                            if (!(changes instanceof Collection) || !changes.isEmpty()) {
                                                                                Iterator<T> it2 = changes.iterator();
                                                                                while (it2.hasNext()) {
                                                                                    if (((PointerInputChange) it2.next()).getPressed()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                                        ResultKt.throwOnFailure(obj);
                                                                        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                                                        this.L$0 = awaitPointerEventScope;
                                                                        this.label = 2;
                                                                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                                                                    }
                                                                }

                                                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                                    Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C137711(null), continuation);
                                                                    return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue);
                                                        }
                                                        composer.endReplaceGroup();
                                                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPadding, pointerEventPass, (PointerInputEventHandler) objRememberedValue);
                                                        String str = this.$accountNumber;
                                                        DashboardViewState.Loaded loaded = this.$state;
                                                        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                                        SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4 = this.$ftuxState$delegate;
                                                        SnapshotState<Boolean> snapshotState = this.$startFxSwitcherFtuxAnimation$delegate;
                                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPointerInput);
                                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer, 0);
                                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                        if (composer.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer.startReusableNode();
                                                        if (composer.getInserting()) {
                                                            composer.createNode(constructor2);
                                                        } else {
                                                            composer.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                        Column6 column6 = Column6.INSTANCE;
                                                        FxSwitcherFtuxState.Data dataFxSwitcherFtux$lambda$2 = FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4);
                                                        boolean zFxSwitcherFtux$lambda$4 = FxSwitcherFtux4.FxSwitcherFtux$lambda$4(snapshotState);
                                                        composer.startReplaceGroup(5004770);
                                                        boolean zChangedInstance = composer.changedInstance(fxSwitcherFtuxDuxo);
                                                        Object objRememberedValue2 = composer.rememberedValue();
                                                        if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$3$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass3.invoke$lambda$4$lambda$3$lambda$2$lambda$1(fxSwitcherFtuxDuxo);
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer.endReplaceGroup();
                                                        FxSwitcherFtuxDashboard.FxSwitcherFtuxDashboard(str, loaded, dataFxSwitcherFtux$lambda$2, zFxSwitcherFtux$lambda$4, null, (Function0) objRememberedValue2, composer, 0, 16);
                                                        composer.endNode();
                                                        composer.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                        invoke(paddingValues, composer, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                                        fxSwitcherFtuxDuxo.onContinue();
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* compiled from: FxSwitcherFtux.kt */
                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                @SourceDebugExtension
                                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C498461 implements Function2<Composer, Integer, Unit> {
                                                    final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                                    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                                    final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;

                                                    C498461(SnapshotState<Boolean> snapshotState, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, FxSwitcherFtuxState.Step step) {
                                                        this.$showBars$delegate = snapshotState;
                                                        this.$duxo = fxSwitcherFtuxDuxo;
                                                        this.$currentStep = step;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final int invoke$lambda$4$lambda$1$lambda$0(int i) {
                                                        return -i;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final int invoke$lambda$4$lambda$3$lambda$2(int i) {
                                                        return -i;
                                                    }

                                                    public final void invoke(Composer composer, int i) {
                                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1701245549, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:116)");
                                                        }
                                                        SnapshotState<Boolean> snapshotState = this.$showBars$delegate;
                                                        final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                                        final FxSwitcherFtuxState.Step step = this.$currentStep;
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                        Column6 column6 = Column6.INSTANCE;
                                                        boolean zFxSwitcherFtux$lambda$7 = FxSwitcherFtux4.FxSwitcherFtux$lambda$7(snapshotState);
                                                        EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion2.getTop(), false, null, 12, null);
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                                        composer.startReplaceGroup(1849434622);
                                                        Object objRememberedValue = composer.rememberedValue();
                                                        Composer.Companion companion4 = Composer.INSTANCE;
                                                        if (objRememberedValue == companion4.getEmpty()) {
                                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.C498461.invoke$lambda$4$lambda$1$lambda$0(((Integer) obj).intValue()));
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue);
                                                        }
                                                        composer.endReplaceGroup();
                                                        EnterTransition enterTransitionPlus = enterTransitionExpandVertically$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
                                                        ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion2.getTop(), false, null, 12, null);
                                                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                                        composer.startReplaceGroup(1849434622);
                                                        Object objRememberedValue2 = composer.rememberedValue();
                                                        if (objRememberedValue2 == companion4.getEmpty()) {
                                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$$ExternalSyntheticLambda1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.C498461.invoke$lambda$4$lambda$3$lambda$2(((Integer) obj).intValue()));
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer.endReplaceGroup();
                                                        AnimatedVisibilityKt.AnimatedVisibility(column6, zFxSwitcherFtux$lambda$7, (Modifier) null, enterTransitionPlus, exitTransitionShrinkVertically$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue2)), (String) null, ComposableLambda3.rememberComposableLambda(708588767, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* compiled from: FxSwitcherFtux.kt */
                                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                            @SourceDebugExtension
                                                            /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1 */
                                                            static final class C137691 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                                                final /* synthetic */ FxSwitcherFtuxDuxo $duxo;

                                                                C137691(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                                                    this.$duxo = fxSwitcherFtuxDuxo;
                                                                }

                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                                                    invoke(bentoAppBarScope, composer, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /*  JADX ERROR: Method code generation error
                                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = (r5v0 'fxSwitcherFtuxDuxo' com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo A[DONT_INLINE]) A[MD:(com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo):void (m)] (LINE:156) call: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo):void type: CONSTRUCTOR in method: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                    	... 20 more
                                                                    */
                                                                public final void invoke(com.robinhood.compose.bento.component.BentoAppBarScope r20, androidx.compose.runtime.Composer r21, int r22) {
                                                                    /*
                                                                        r19 = this;
                                                                        r0 = r19
                                                                        r1 = r20
                                                                        r7 = r21
                                                                        java.lang.String r2 = "$this$BentoAppBar"
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                                                                        r2 = r22 & 6
                                                                        if (r2 != 0) goto L24
                                                                        r2 = r22 & 8
                                                                        if (r2 != 0) goto L18
                                                                        boolean r2 = r7.changed(r1)
                                                                        goto L1c
                                                                    L18:
                                                                        boolean r2 = r7.changedInstance(r1)
                                                                    L1c:
                                                                        if (r2 == 0) goto L20
                                                                        r2 = 4
                                                                        goto L21
                                                                    L20:
                                                                        r2 = 2
                                                                    L21:
                                                                        r2 = r22 | r2
                                                                        goto L26
                                                                    L24:
                                                                        r2 = r22
                                                                    L26:
                                                                        r3 = r2 & 19
                                                                        r4 = 18
                                                                        if (r3 != r4) goto L37
                                                                        boolean r3 = r7.getSkipping()
                                                                        if (r3 != 0) goto L33
                                                                        goto L37
                                                                    L33:
                                                                        r7.skipToGroupEnd()
                                                                        return
                                                                    L37:
                                                                        boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                        if (r3 == 0) goto L46
                                                                        r3 = -1
                                                                        java.lang.String r4 = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:146)"
                                                                        r5 = -598535554(0xffffffffdc53127e, float:-2.3764621E17)
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(r5, r2, r3, r4)
                                                                    L46:
                                                                        androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p011ui.Modifier.INSTANCE
                                                                        com.robinhood.rosetta.eventlogging.UserInteractionEventData$Action r12 = com.robinhood.rosetta.eventlogging.UserInteractionEventData.Action.CANCEL
                                                                        com.robinhood.rosetta.eventlogging.Component r13 = new com.robinhood.rosetta.eventlogging.Component
                                                                        com.robinhood.rosetta.eventlogging.Component$ComponentType r14 = com.robinhood.rosetta.eventlogging.Component.ComponentType.CLOSE_BUTTON
                                                                        r17 = 6
                                                                        r18 = 0
                                                                        r15 = 0
                                                                        r16 = 0
                                                                        r13.<init>(r14, r15, r16, r17, r18)
                                                                        com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r9 = new com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor
                                                                        r16 = 42
                                                                        r17 = 0
                                                                        java.lang.String r10 = "exit_fx_switcher_ftux"
                                                                        r11 = 0
                                                                        r14 = r13
                                                                        r13 = 0
                                                                        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                                                                        r16 = 110(0x6e, float:1.54E-43)
                                                                        r10 = 0
                                                                        r11 = 0
                                                                        r12 = 0
                                                                        r13 = 1
                                                                        r14 = 0
                                                                        androidx.compose.ui.Modifier r3 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                                                        r4 = 5004770(0x4c5de2, float:7.013177E-39)
                                                                        r7.startReplaceGroup(r4)
                                                                        com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo r4 = r0.$duxo
                                                                        boolean r4 = r7.changedInstance(r4)
                                                                        com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDuxo r5 = r0.$duxo
                                                                        java.lang.Object r6 = r7.rememberedValue()
                                                                        if (r4 != 0) goto L8d
                                                                        androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                                                                        java.lang.Object r4 = r4.getEmpty()
                                                                        if (r6 != r4) goto L95
                                                                    L8d:
                                                                        com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3$1$$ExternalSyntheticLambda0
                                                                        r6.<init>(r5)
                                                                        r7.updateRememberedValue(r6)
                                                                    L95:
                                                                        kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                                                                        r7.endReplaceGroup()
                                                                        int r4 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                                                        int r4 = r4 << 12
                                                                        r5 = 57344(0xe000, float:8.0356E-41)
                                                                        int r2 = r2 << 12
                                                                        r2 = r2 & r5
                                                                        r8 = r4 | r2
                                                                        r9 = 6
                                                                        r2 = r3
                                                                        r3 = 0
                                                                        r4 = 0
                                                                        r1.m20576BentoCloseButtoncf5BqRc(r2, r3, r4, r6, r7, r8, r9)
                                                                        boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                        if (r1 == 0) goto Lb7
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                                    Lb7:
                                                                        return
                                                                    */
                                                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux7.C137691.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$1$lambda$0(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
                                                                    fxSwitcherFtuxDuxo.closeFtux();
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }

                                                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                                                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(708588767, i2, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:136)");
                                                                }
                                                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                                                Function2<Composer, Integer, Unit> function2M13213getLambda$1604700078$lib_account_home_externalDebug = FxSwitcherFtux.INSTANCE.m13213getLambda$1604700078$lib_account_home_externalDebug();
                                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-598535554, true, new C137691(fxSwitcherFtuxDuxo), composer2, 54);
                                                                final FxSwitcherFtuxState.Step step2 = step;
                                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M13213getLambda$1604700078$lib_account_home_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-757548627, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$1$1$3.2
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                                        invoke(boxScope, composer3, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(BoxScope BentoAppBar, Composer composer3, int i3) {
                                                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                                        if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-757548627, i3, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:143)");
                                                                        }
                                                                        BentoProgressBar2.m20698BentoProgressBarjB83MbM(step2.getProgress(), null, 0, 0L, 0L, false, composer3, 0, 62);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }, composer2, 54), false, false, appBarType, null, 0L, null, composer2, 12607878, 0, 1898);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer, 54), composer, 1572870, 18);
                                                        composer.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                        invoke(composer, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i9) {
                                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1850764721, i9, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous> (FxSwitcherFtux.kt:113)");
                                                    }
                                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(1701245549, true, new C498461(snapshotState5, fxSwitcherFtuxDuxo6, step), composer3, 54), ComposableLambda3.rememberComposableLambda(-1392580404, true, new AnonymousClass2(snapshotState5, step, snapshotState422, fxSwitcherFtuxDuxo6, snapshotState6), composer3, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-323400766, true, new AnonymousClass3(str, loaded, fxSwitcherFtuxDuxo6, snapshotState422, snapshotState6), composer3, 54), composer3, 805306800, 504);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                /* compiled from: FxSwitcherFtux.kt */
                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                @SourceDebugExtension
                                                /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2, reason: invalid class name */
                                                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                                    final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                                    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                                    final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                                    final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;
                                                    final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;

                                                    AnonymousClass2(SnapshotState<Boolean> snapshotState, FxSwitcherFtuxState.Step step, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState<Boolean> snapshotState2) {
                                                        this.$showBars$delegate = snapshotState;
                                                        this.$currentStep = step;
                                                        this.$ftuxState$delegate = snapshotState4;
                                                        this.$duxo = fxSwitcherFtuxDuxo;
                                                        this.$startFxSwitcherFtuxAnimation$delegate = snapshotState2;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final int invoke$lambda$1$lambda$0(int i) {
                                                        return i;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final int invoke$lambda$3$lambda$2(int i) {
                                                        return i;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                        invoke(composer, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer, int i) {
                                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1392580404, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:165)");
                                                        }
                                                        boolean zFxSwitcherFtux$lambda$7 = FxSwitcherFtux4.FxSwitcherFtux$lambda$7(this.$showBars$delegate);
                                                        Alignment.Companion companion = Alignment.INSTANCE;
                                                        EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion.getBottom(), false, null, 12, null);
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                                        composer.startReplaceGroup(1849434622);
                                                        Object objRememberedValue = composer.rememberedValue();
                                                        Composer.Companion companion2 = Composer.INSTANCE;
                                                        if (objRememberedValue == companion2.getEmpty()) {
                                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue);
                                                        }
                                                        composer.endReplaceGroup();
                                                        EnterTransition enterTransitionPlus = enterTransitionExpandVertically$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
                                                        ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), companion.getBottom(), false, null, 12, null);
                                                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                                                        composer.startReplaceGroup(1849434622);
                                                        Object objRememberedValue2 = composer.rememberedValue();
                                                        if (objRememberedValue2 == companion2.getEmpty()) {
                                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$$ExternalSyntheticLambda1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return Integer.valueOf(FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(((Integer) obj).intValue()));
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer.endReplaceGroup();
                                                        AnimatedVisibilityKt.AnimatedVisibility(zFxSwitcherFtux$lambda$7, (Modifier) null, enterTransitionPlus, exitTransitionShrinkVertically$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue2)), (String) null, ComposableLambda3.rememberComposableLambda(1117864692, true, new AnonymousClass3(this.$currentStep, this.$ftuxState$delegate, this.$duxo, this.$startFxSwitcherFtuxAnimation$delegate), composer, 54), composer, 196608, 18);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    /* compiled from: FxSwitcherFtux.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    @SourceDebugExtension
                                                    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$3, reason: invalid class name */
                                                    static final class AnonymousClass3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                                        final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
                                                        final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
                                                        final /* synthetic */ SnapshotState4<FxSwitcherFtuxState.Data> $ftuxState$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $startFxSwitcherFtuxAnimation$delegate;

                                                        AnonymousClass3(FxSwitcherFtuxState.Step step, SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4, FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState<Boolean> snapshotState) {
                                                            this.$currentStep = step;
                                                            this.$ftuxState$delegate = snapshotState4;
                                                            this.$duxo = fxSwitcherFtuxDuxo;
                                                            this.$startFxSwitcherFtuxAnimation$delegate = snapshotState;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                                            invoke(animatedVisibilityScope, composer, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                                            String strStringResource;
                                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1117864692, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FxSwitcherFtux.kt:186)");
                                                            }
                                                            composer.startReplaceGroup(526146809);
                                                            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                                                            float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6).getBottom(density));
                                                            composer.endReplaceGroup();
                                                            if (this.$currentStep.isLastStep()) {
                                                                composer.startReplaceGroup(-869119362);
                                                                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_get_started, composer, 0);
                                                                composer.endReplaceGroup();
                                                            } else {
                                                                composer.startReplaceGroup(-869002399);
                                                                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                                                                composer.endReplaceGroup();
                                                            }
                                                            String str = strStringResource;
                                                            FxSwitcherFtuxState.Step step = this.$currentStep;
                                                            final SnapshotState4 snapshotState4 = this.$ftuxState$delegate;
                                                            final FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo = this.$duxo;
                                                            final SnapshotState snapshotState = this.$startFxSwitcherFtuxAnimation$delegate;
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composer, 0, 7);
                                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                            int i2 = BentoTheme.$stable;
                                                            FxSwitcherFtux4.FadingBentoText(StringResources_androidKt.stringResource(step.getContent(), composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), composer, 0, 0);
                                                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                                                            composer.startReplaceGroup(-1746271574);
                                                            boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(fxSwitcherFtuxDuxo);
                                                            Object objRememberedValue = composer.rememberedValue();
                                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$5$1$2$3$$ExternalSyntheticLambda0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return FxSwitcherFtux4.C137685.AnonymousClass1.AnonymousClass2.AnonymousClass3.invoke$lambda$3$lambda$2$lambda$1(fxSwitcherFtuxDuxo, snapshotState4, snapshotState);
                                                                    }
                                                                };
                                                                composer.updateRememberedValue(objRememberedValue);
                                                            }
                                                            composer.endReplaceGroup();
                                                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, fMo5013toDpu2uoSUM), composer, 0);
                                                            composer.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
                                                            FxSwitcherFtux4.FxSwitcherFtux$lambda$5(snapshotState, FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4).getIsFxSwitcherStep());
                                                            if (!FxSwitcherFtux4.FxSwitcherFtux$lambda$2(snapshotState4).getIsFxSwitcherStep()) {
                                                                fxSwitcherFtuxDuxo.onContinue();
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                            }, composer2, 54), composer2, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    fxSwitcherFtuxDuxo3 = fxSwitcherFtuxDuxo52;
                                    function04 = function03;
                                    modifier4 = modifier52;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) != 0) {
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }

        private static final Event<FxSwitcherFtuxState.Event> FxSwitcherFtux$lambda$10(SnapshotState4<Event<FxSwitcherFtuxState.Event>> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FxSwitcherFtuxState.Data FxSwitcherFtux$lambda$2(SnapshotState4<FxSwitcherFtuxState.Data> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean FxSwitcherFtux$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void FxSwitcherFtux$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean FxSwitcherFtux$lambda$7(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void FxSwitcherFtux$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit FxSwitcherFtux$lambda$13$lambda$12(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo) {
            fxSwitcherFtuxDuxo.closeFtux();
            return Unit.INSTANCE;
        }

        public static final void FadingBentoText(String text, final Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            final String str;
            Intrinsics.checkNotNullParameter(text, "text");
            Composer composerStartRestartGroup = composer.startRestartGroup(1395229136);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                Modifier modifier2 = modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1395229136, i3, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FadingBentoText (FxSwitcherFtux.kt:255)");
                }
                FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants = FxSwitcherFtuxAnimationConstants.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(fxSwitcherFtuxAnimationConstants);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FxSwitcherFtux4.FadingBentoText$lambda$16$lambda$15((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                str = text;
                AnimatedContentKt.AnimatedContent(str, modifier2, (Function1) objRememberedValue, null, null, null, FxSwitcherFtux.INSTANCE.getLambda$1224524262$lib_account_home_externalDebug(), composerStartRestartGroup, (i3 & 14) | 1572864 | (i3 & 112), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str = text;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FxSwitcherFtux4.FadingBentoText$lambda$17(str, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform FadingBentoText$lambda$16$lambda$15(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null));
        }
    }
