package com.robinhood.android.common.history.p082ui.section;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistorySection.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "header", Footer.f10637type, "", "isFromCryptoSource", "compensateForCaret", "showFooter", "animateVisibility", "Lcom/robinhood/android/common/history/ui/section/HistorySectionDuxo;", "duxo", "HistorySection", "(Lcom/robinhood/android/common/history/ui/section/HistorySectionState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZZLcom/robinhood/android/common/history/ui/section/HistorySectionDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/common/history/ui/section/HistorySectionViewState;", "viewState", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.section.HistorySectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistorySection4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistorySection$lambda$2(HistorySectionState historySectionState, Modifier modifier, Function2 function2, Function2 function22, boolean z, boolean z2, boolean z3, boolean z4, HistorySectionDuxo historySectionDuxo, int i, int i2, Composer composer, int i3) {
        HistorySection(historySectionState, modifier, function2, function22, z, z2, z3, z4, historySectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistorySection(final HistorySectionState state, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, boolean z2, boolean z3, boolean z4, HistorySectionDuxo historySectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M12248getLambda$2136837853$lib_history_row_externalDebug;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function2M12247getLambda$1960086187$lib_history_row_externalDebug;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        Composer composer2;
        boolean z9;
        HistorySectionDuxo historySectionDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        int i11;
        Tuples2 tuples2M3642to;
        boolean zChangedInstance;
        final SnapshotState4 snapshotState4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer3;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final HistorySectionDuxo historySectionDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1086411038);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M12248getLambda$2136837853$lib_history_row_externalDebug = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function2M12248getLambda$2136837853$lib_history_row_externalDebug) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function2M12247getLambda$1960086187$lib_history_row_externalDebug = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function2M12247getLambda$1960086187$lib_history_row_externalDebug) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z5 = z;
                            i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                z6 = z2;
                                i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                            }
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                            i9 = i2 & 128;
                            if (i9 != 0) {
                                if ((i & 12582912) == 0) {
                                    i10 = i9;
                                    i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                if ((i & 100663296) == 0) {
                                    i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changedInstance(historySectionDuxo)) ? 67108864 : 33554432;
                                }
                                int i13 = i3;
                                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function2M12248getLambda$2136837853$lib_history_row_externalDebug = HistorySection.INSTANCE.m12248getLambda$2136837853$lib_history_row_externalDebug();
                                        }
                                        if (i5 != 0) {
                                            function2M12247getLambda$1960086187$lib_history_row_externalDebug = HistorySection.INSTANCE.m12247getLambda$1960086187$lib_history_row_externalDebug();
                                        }
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            z6 = true;
                                        }
                                        z7 = i8 == 0 ? true : z3;
                                        z8 = i10 == 0 ? false : z4;
                                        if ((i2 & 256) == 0) {
                                            composerStartRestartGroup.startReplaceGroup(2050738472);
                                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                            if (current == null) {
                                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                            }
                                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                            } else {
                                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                            }
                                            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                                            z9 = true;
                                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, state)));
                                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HistorySectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                            composer2 = composerStartRestartGroup;
                                            composer2.endReplaceableGroup();
                                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                            Object objRememberedValue = composer2.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt$HistorySection$$inlined$duxo$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                        lifecycle.addObserver(duxoLifecycleObserver);
                                                        final Lifecycle lifecycle2 = lifecycle;
                                                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt$HistorySection$$inlined$duxo$1.1
                                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                                            public void dispose() {
                                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                                            }
                                                        };
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            composer2.endReplaceGroup();
                                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                                            composer2.endReplaceGroup();
                                            historySectionDuxo2 = (HistorySectionDuxo) baseDuxo;
                                            i11 = i13 & (-234881025);
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1086411038, i11, -1, "com.robinhood.android.common.history.ui.section.HistorySection (HistorySection.kt:72)");
                                            }
                                            Composer composer4 = composer2;
                                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(historySectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                                            if (!z8) {
                                                tuples2M3642to = Tuples4.m3642to(EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null), ExitTransition.INSTANCE.getNone());
                                            } else {
                                                tuples2M3642to = Tuples4.m3642to(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                                            }
                                            EnterTransition enterTransition = (EnterTransition) tuples2M3642to.component1();
                                            ExitTransition exitTransition = (ExitTransition) tuples2M3642to.component2();
                                            int i14 = i11;
                                            composer4.startReplaceGroup(-1633490746);
                                            zChangedInstance = composer4.changedInstance(historySectionDuxo2) | composer4.changedInstance(state);
                                            Object objRememberedValue2 = composer4.rememberedValue();
                                            if (zChangedInstance) {
                                                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                composer4.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, i14 & 14);
                                                final boolean z12 = z7;
                                                final Modifier modifier3 = modifier2;
                                                final Function2<? super Composer, ? super Integer, Unit> function25 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                                final Function2<? super Composer, ? super Integer, Unit> function26 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                                final boolean z13 = z5;
                                                final boolean z14 = z6;
                                                HistorySectionDuxo historySectionDuxo4 = historySectionDuxo2;
                                                AnimatedVisibilityKt.AnimatedVisibility(!HistorySection$lambda$0(snapshotState4).getHistoryItems().isEmpty(), (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambda3.rememberComposableLambda(82677574, z9, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt.HistorySection.2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                                        invoke(animatedVisibilityScope, composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i15) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(82677574, i15, -1, "com.robinhood.android.common.history.ui.section.HistorySection.<anonymous> (HistorySection.kt:89)");
                                                        }
                                                        HistoryRowsKt.HistorySection(HistorySection4.HistorySection$lambda$0(snapshotState4).getHistoryItems(), modifier3, function25, function26, z13, z14, z12 && HistorySection4.HistorySection$lambda$0(snapshotState4).getShowFooter(), false, composer5, 0, 128);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, 196608, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                                composer3 = composer4;
                                                z10 = z7;
                                                z11 = z8;
                                                function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                                historySectionDuxo3 = historySectionDuxo4;
                                            } else {
                                                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                            }
                                            objRememberedValue2 = new HistorySection5(historySectionDuxo2, state, null);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                            composer4.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, i14 & 14);
                                            final boolean z122 = z7;
                                            final Modifier modifier32 = modifier2;
                                            final Function2<? super Composer, ? super Integer, Unit> function252 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            final Function2<? super Composer, ? super Integer, Unit> function262 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            final boolean z132 = z5;
                                            final boolean z142 = z6;
                                            HistorySectionDuxo historySectionDuxo42 = historySectionDuxo2;
                                            AnimatedVisibilityKt.AnimatedVisibility(!HistorySection$lambda$0(snapshotState4).getHistoryItems().isEmpty(), (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambda3.rememberComposableLambda(82677574, z9, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt.HistorySection.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                                    invoke(animatedVisibilityScope, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i15) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(82677574, i15, -1, "com.robinhood.android.common.history.ui.section.HistorySection.<anonymous> (HistorySection.kt:89)");
                                                    }
                                                    HistoryRowsKt.HistorySection(HistorySection4.HistorySection$lambda$0(snapshotState4).getHistoryItems(), modifier32, function252, function262, z132, z142, z122 && HistorySection4.HistorySection$lambda$0(snapshotState4).getShowFooter(), false, composer5, 0, 128);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            composer3 = composer4;
                                            z10 = z7;
                                            z11 = z8;
                                            function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            historySectionDuxo3 = historySectionDuxo42;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            z9 = true;
                                            historySectionDuxo2 = historySectionDuxo;
                                            i11 = i13;
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Composer composer42 = composer2;
                                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(historySectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                                            if (!z8) {
                                            }
                                            EnterTransition enterTransition2 = (EnterTransition) tuples2M3642to.component1();
                                            ExitTransition exitTransition2 = (ExitTransition) tuples2M3642to.component2();
                                            int i142 = i11;
                                            composer42.startReplaceGroup(-1633490746);
                                            zChangedInstance = composer42.changedInstance(historySectionDuxo2) | composer42.changedInstance(state);
                                            Object objRememberedValue22 = composer42.rememberedValue();
                                            if (zChangedInstance) {
                                            }
                                            objRememberedValue22 = new HistorySection5(historySectionDuxo2, state, null);
                                            composer42.updateRememberedValue(objRememberedValue22);
                                            composer42.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue22, composer42, i142 & 14);
                                            final boolean z1222 = z7;
                                            final Modifier modifier322 = modifier2;
                                            final Function2<? super Composer, ? super Integer, Unit> function2522 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            final Function2<? super Composer, ? super Integer, Unit> function2622 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            final boolean z1322 = z5;
                                            final boolean z1422 = z6;
                                            HistorySectionDuxo historySectionDuxo422 = historySectionDuxo2;
                                            AnimatedVisibilityKt.AnimatedVisibility(!HistorySection$lambda$0(snapshotState4).getHistoryItems().isEmpty(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambda3.rememberComposableLambda(82677574, z9, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt.HistorySection.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                                    invoke(animatedVisibilityScope, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i15) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(82677574, i15, -1, "com.robinhood.android.common.history.ui.section.HistorySection.<anonymous> (HistorySection.kt:89)");
                                                    }
                                                    HistoryRowsKt.HistorySection(HistorySection4.HistorySection$lambda$0(snapshotState4).getHistoryItems(), modifier322, function2522, function2622, z1322, z1422, z1222 && HistorySection4.HistorySection$lambda$0(snapshotState4).getShowFooter(), false, composer5, 0, 128);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer42, 54), composer42, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            composer3 = composer42;
                                            z10 = z7;
                                            z11 = z8;
                                            function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            historySectionDuxo3 = historySectionDuxo422;
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i2 & 256) != 0) {
                                            z7 = z3;
                                            z8 = z4;
                                            composer2 = composerStartRestartGroup;
                                            z9 = true;
                                            i11 = i13 & (-234881025);
                                            historySectionDuxo2 = historySectionDuxo;
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Composer composer422 = composer2;
                                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(historySectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                                            if (!z8) {
                                            }
                                            EnterTransition enterTransition22 = (EnterTransition) tuples2M3642to.component1();
                                            ExitTransition exitTransition22 = (ExitTransition) tuples2M3642to.component2();
                                            int i1422 = i11;
                                            composer422.startReplaceGroup(-1633490746);
                                            zChangedInstance = composer422.changedInstance(historySectionDuxo2) | composer422.changedInstance(state);
                                            Object objRememberedValue222 = composer422.rememberedValue();
                                            if (zChangedInstance) {
                                            }
                                            objRememberedValue222 = new HistorySection5(historySectionDuxo2, state, null);
                                            composer422.updateRememberedValue(objRememberedValue222);
                                            composer422.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue222, composer422, i1422 & 14);
                                            final boolean z12222 = z7;
                                            final Modifier modifier3222 = modifier2;
                                            final Function2<? super Composer, ? super Integer, Unit> function25222 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            final Function2<? super Composer, ? super Integer, Unit> function26222 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            final boolean z13222 = z5;
                                            final boolean z14222 = z6;
                                            HistorySectionDuxo historySectionDuxo4222 = historySectionDuxo2;
                                            AnimatedVisibilityKt.AnimatedVisibility(!HistorySection$lambda$0(snapshotState4).getHistoryItems().isEmpty(), (Modifier) null, enterTransition22, exitTransition22, (String) null, ComposableLambda3.rememberComposableLambda(82677574, z9, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt.HistorySection.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                                    invoke(animatedVisibilityScope, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i15) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(82677574, i15, -1, "com.robinhood.android.common.history.ui.section.HistorySection.<anonymous> (HistorySection.kt:89)");
                                                    }
                                                    HistoryRowsKt.HistorySection(HistorySection4.HistorySection$lambda$0(snapshotState4).getHistoryItems(), modifier3222, function25222, function26222, z13222, z14222, z12222 && HistorySection4.HistorySection$lambda$0(snapshotState4).getShowFooter(), false, composer5, 0, 128);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer422, 54), composer422, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            composer3 = composer422;
                                            z10 = z7;
                                            z11 = z8;
                                            function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            historySectionDuxo3 = historySectionDuxo4222;
                                        } else {
                                            z7 = z3;
                                            z8 = z4;
                                            historySectionDuxo2 = historySectionDuxo;
                                            composer2 = composerStartRestartGroup;
                                            z9 = true;
                                            i11 = i13;
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Composer composer4222 = composer2;
                                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(historySectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4222, 0, 7);
                                            if (!z8) {
                                            }
                                            EnterTransition enterTransition222 = (EnterTransition) tuples2M3642to.component1();
                                            ExitTransition exitTransition222 = (ExitTransition) tuples2M3642to.component2();
                                            int i14222 = i11;
                                            composer4222.startReplaceGroup(-1633490746);
                                            zChangedInstance = composer4222.changedInstance(historySectionDuxo2) | composer4222.changedInstance(state);
                                            Object objRememberedValue2222 = composer4222.rememberedValue();
                                            if (zChangedInstance) {
                                            }
                                            objRememberedValue2222 = new HistorySection5(historySectionDuxo2, state, null);
                                            composer4222.updateRememberedValue(objRememberedValue2222);
                                            composer4222.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2222, composer4222, i14222 & 14);
                                            final boolean z122222 = z7;
                                            final Modifier modifier32222 = modifier2;
                                            final Function2<? super Composer, ? super Integer, Unit> function252222 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            final Function2<? super Composer, ? super Integer, Unit> function262222 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            final boolean z132222 = z5;
                                            final boolean z142222 = z6;
                                            HistorySectionDuxo historySectionDuxo42222 = historySectionDuxo2;
                                            AnimatedVisibilityKt.AnimatedVisibility(!HistorySection$lambda$0(snapshotState4).getHistoryItems().isEmpty(), (Modifier) null, enterTransition222, exitTransition222, (String) null, ComposableLambda3.rememberComposableLambda(82677574, z9, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt.HistorySection.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                                    invoke(animatedVisibilityScope, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i15) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(82677574, i15, -1, "com.robinhood.android.common.history.ui.section.HistorySection.<anonymous> (HistorySection.kt:89)");
                                                    }
                                                    HistoryRowsKt.HistorySection(HistorySection4.HistorySection$lambda$0(snapshotState4).getHistoryItems(), modifier32222, function252222, function262222, z132222, z142222, z122222 && HistorySection4.HistorySection$lambda$0(snapshotState4).getShowFooter(), false, composer5, 0, 128);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4222, 54), composer4222, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                            composer3 = composer4222;
                                            z10 = z7;
                                            z11 = z8;
                                            function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                            historySectionDuxo3 = historySectionDuxo42222;
                                        }
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z11 = z4;
                                    composer3 = composerStartRestartGroup;
                                    function23 = function2M12248getLambda$2136837853$lib_history_row_externalDebug;
                                    function24 = function2M12247getLambda$1960086187$lib_history_row_externalDebug;
                                    z10 = z3;
                                    historySectionDuxo3 = historySectionDuxo;
                                }
                                final Modifier modifier4 = modifier2;
                                final boolean z15 = z5;
                                final boolean z16 = z6;
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return HistorySection4.HistorySection$lambda$2(state, modifier4, function23, function24, z15, z16, z10, z11, historySectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 12582912;
                            i10 = i9;
                            if ((i & 100663296) == 0) {
                            }
                            int i132 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if ((i2 & 256) == 0) {
                                    }
                                }
                            }
                            final Modifier modifier42 = modifier2;
                            final boolean z152 = z5;
                            final boolean z162 = z6;
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z6 = z2;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                        }
                        i10 = i9;
                        if ((i & 100663296) == 0) {
                        }
                        int i1322 = i3;
                        if ((i3 & 38347923) != 38347922) {
                        }
                        final Modifier modifier422 = modifier2;
                        final boolean z1522 = z5;
                        final boolean z1622 = z6;
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z5 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z6 = z2;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i & 100663296) == 0) {
                    }
                    int i13222 = i3;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    final Modifier modifier4222 = modifier2;
                    final boolean z15222 = z5;
                    final boolean z16222 = z6;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function2M12247getLambda$1960086187$lib_history_row_externalDebug = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z5 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z6 = z2;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i & 100663296) == 0) {
                }
                int i132222 = i3;
                if ((i3 & 38347923) != 38347922) {
                }
                final Modifier modifier42222 = modifier2;
                final boolean z152222 = z5;
                final boolean z162222 = z6;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M12248getLambda$2136837853$lib_history_row_externalDebug = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function2M12247getLambda$1960086187$lib_history_row_externalDebug = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z5 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z6 = z2;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i & 100663296) == 0) {
            }
            int i1322222 = i3;
            if ((i3 & 38347923) != 38347922) {
            }
            final Modifier modifier422222 = modifier2;
            final boolean z1522222 = z5;
            final boolean z1622222 = z6;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M12248getLambda$2136837853$lib_history_row_externalDebug = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function2M12247getLambda$1960086187$lib_history_row_externalDebug = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z6 = z2;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i & 100663296) == 0) {
        }
        int i13222222 = i3;
        if ((i3 & 38347923) != 38347922) {
        }
        final Modifier modifier4222222 = modifier2;
        final boolean z15222222 = z5;
        final boolean z16222222 = z6;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistorySectionViewState HistorySection$lambda$0(SnapshotState4<HistorySectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
