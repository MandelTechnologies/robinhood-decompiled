package com.robinhood.android.equities.taxlots.table;

import android.content.Context;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* compiled from: TaxLotsGainLossCell.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"GAIN_LOSS_LOADING_PLACEHOLDER", "", "TaxLotsGainLossCellComposable", "", "taxLotsGainLossCell", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsGainLossCell;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "previewGainLoss", "Lcom/robinhood/utils/resource/StringResource;", "previewIsPositive", "", "TaxLotsGainLossCellComposable-wYrrvMY", "(Lcom/robinhood/android/equities/taxlots/table/TaxLotsGainLossCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;II)V", "InternalGainLossCell", "viewState", "Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;", "InternalGainLossCell-UmHF5L4", "(Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GainLossCellComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsGainLossCell5 {
    private static final String GAIN_LOSS_LOADING_PLACEHOLDER = "Placeholder";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainLossCellComposablePreview$lambda$7(int i, Composer composer, int i2) {
        GainLossCellComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalGainLossCell_UmHF5L4$lambda$6(GainLossViewState gainLossViewState, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13646InternalGainLossCellUmHF5L4(gainLossViewState, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsGainLossCellComposable_wYrrvMY$lambda$5(TaxLotsGainLossCell taxLotsGainLossCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, StringResource stringResource, Boolean bool, int i, int i2, Composer composer, int i3) {
        m13647TaxLotsGainLossCellComposablewYrrvMY(taxLotsGainLossCell, c2002Dp, c2002Dp2, modifier, stringResource, bool, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137 A[ADDED_TO_REGION] */
    /* renamed from: TaxLotsGainLossCellComposable-wYrrvMY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13647TaxLotsGainLossCellComposablewYrrvMY(final TaxLotsGainLossCell taxLotsGainLossCell, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, StringResource stringResource, Boolean bool, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Boolean bool2;
        int i5;
        Modifier modifier3;
        Boolean bool3;
        StringResource stringResource2;
        Boolean bool4;
        Composer composer2;
        Modifier modifier4;
        final Modifier modifier5;
        final StringResource stringResource3;
        final Boolean bool5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        StringResource stringResourceInvoke = stringResource;
        Intrinsics.checkNotNullParameter(taxLotsGainLossCell, "taxLotsGainLossCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(688995262);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(taxLotsGainLossCell) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    if ((32768 & i) == 0 ? composerStartRestartGroup.changed(stringResourceInvoke) : composerStartRestartGroup.changedInstance(stringResourceInvoke)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                }
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    bool2 = bool;
                    i3 |= composerStartRestartGroup.changed(bool2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    stringResource3 = stringResourceInvoke;
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier2;
                    bool5 = bool2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            String maxGainAndLoss = taxLotsGainLossCell.getMaxGainAndLoss();
                            stringResourceInvoke = maxGainAndLoss != null ? StringResource.INSTANCE.invoke(Formats.getPriceDeltaWithHundredthDecimalFormat().format(BigDecimals7.orZero(StringsKt.toBigDecimalOrNull(maxGainAndLoss)))) : null;
                            i3 &= -57345;
                        }
                        if (i4 == 0) {
                            i5 = i3;
                            modifier3 = modifier2;
                            bool3 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(688995262, i5, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellComposable (TaxLotsGainLossCell.kt:53)");
                        }
                        if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue() || (c2002Dp == null && c2002Dp2 == null)) {
                            stringResource2 = stringResourceInvoke;
                            bool4 = bool3;
                            composer2 = composerStartRestartGroup;
                            int i8 = i5;
                            Modifier modifier6 = modifier3;
                            composer2.startReplaceGroup(209634940);
                            GainLossViewState gainLossViewState = new GainLossViewState(stringResource2, bool4);
                            int i9 = StringResource.$stable | (i8 & 112) | (i8 & 896) | (i8 & 7168);
                            modifier4 = modifier6;
                            m13646InternalGainLossCellUmHF5L4(gainLossViewState, c2002Dp, c2002Dp2, modifier4, composer2, i9, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(209981179);
                            String str = "GainLossCell: " + taxLotsGainLossCell.getLotId();
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GainLossCellDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$TaxLotsGainLossCellComposable-wYrrvMY$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$TaxLotsGainLossCellComposable-wYrrvMY$$inlined$duxo$1.1
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
                            final GainLossCellDuxo gainLossCellDuxo = (GainLossCellDuxo) baseDuxo;
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer2.changedInstance(taxLotsGainLossCell) | composer2.changedInstance(gainLossCellDuxo);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TaxLotsGainLossCell5.TaxLotsGainLossCellComposable_wYrrvMY$lambda$3$lambda$2(taxLotsGainLossCell, gainLossCellDuxo, (LifecycleResumePauseEffectScope) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            int i10 = i5;
                            LifecycleEffectKt.LifecycleResumeEffect(taxLotsGainLossCell, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composer2, i5 & 14, 0);
                            bool4 = bool3;
                            stringResource2 = stringResourceInvoke;
                            modifier4 = modifier3;
                            m13646InternalGainLossCellUmHF5L4(TaxLotsGainLossCellComposable_wYrrvMY$lambda$4(FlowExtKt.collectAsStateWithLifecycle(gainLossCellDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)), c2002Dp, c2002Dp2, modifier4, composer2, StringResource.$stable | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        stringResource3 = stringResource2;
                        bool5 = bool4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    bool3 = bool2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        stringResource2 = stringResourceInvoke;
                        bool4 = bool3;
                        composer2 = composerStartRestartGroup;
                        int i82 = i5;
                        Modifier modifier62 = modifier3;
                        composer2.startReplaceGroup(209634940);
                        GainLossViewState gainLossViewState2 = new GainLossViewState(stringResource2, bool4);
                        int i92 = StringResource.$stable | (i82 & 112) | (i82 & 896) | (i82 & 7168);
                        modifier4 = modifier62;
                        m13646InternalGainLossCellUmHF5L4(gainLossViewState2, c2002Dp, c2002Dp2, modifier4, composer2, i92, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        stringResource3 = stringResource2;
                        bool5 = bool4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLotsGainLossCell5.TaxLotsGainLossCellComposable_wYrrvMY$lambda$5(taxLotsGainLossCell, c2002Dp, c2002Dp2, modifier5, stringResource3, bool5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            bool2 = bool;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i4 == 0) {
                        i5 = i3;
                        modifier3 = modifier2;
                        bool3 = bool2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        bool2 = bool;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult TaxLotsGainLossCellComposable_wYrrvMY$lambda$3$lambda$2(TaxLotsGainLossCell taxLotsGainLossCell, GainLossCellDuxo gainLossCellDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = gainLossCellDuxo.bind(taxLotsGainLossCell.getAccountNumber(), taxLotsGainLossCell.getOrderId(), taxLotsGainLossCell.getInstrumentId(), taxLotsGainLossCell.getLotId(), taxLotsGainLossCell.isSelectable());
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$TaxLotsGainLossCellComposable_wYrrvMY$lambda$3$lambda$2$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final GainLossViewState TaxLotsGainLossCellComposable_wYrrvMY$lambda$4(SnapshotState4<GainLossViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: InternalGainLossCell-UmHF5L4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13646InternalGainLossCellUmHF5L4(final GainLossViewState gainLossViewState, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C2002Dp c2002Dp3;
        C2002Dp c2002Dp4;
        int i4;
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1695122611);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gainLossViewState) : composerStartRestartGroup.changedInstance(gainLossViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                c2002Dp3 = c2002Dp;
                i3 |= composerStartRestartGroup.changed(c2002Dp3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    c2002Dp4 = c2002Dp2;
                    i3 |= composerStartRestartGroup.changed(c2002Dp4) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    i5 = i3;
                    if ((i5 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695122611, i5, -1, "com.robinhood.android.equities.taxlots.table.InternalGainLossCell (TaxLotsGainLossCell.kt:89)");
                        }
                        Modifier modifier5 = modifier4;
                        int i6 = i5 >> 3;
                        TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, null, Alignment.INSTANCE.getCenterEnd(), null, ComposableLambda3.rememberComposableLambda(-949718868, true, new TaxLotsGainLossCell6(modifier5, gainLossViewState, c2002Dp3, c2002Dp4, ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources()), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | 199680 | (i6 & 112), 20);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TaxLotsGainLossCell5.InternalGainLossCell_UmHF5L4$lambda$6(gainLossViewState, c2002Dp, c2002Dp2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                i5 = i3;
                if ((i5 & 1171) == 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier4;
                    int i62 = i5 >> 3;
                    TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, null, Alignment.INSTANCE.getCenterEnd(), null, ComposableLambda3.rememberComposableLambda(-949718868, true, new TaxLotsGainLossCell6(modifier52, gainLossViewState, c2002Dp3, c2002Dp4, ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources()), composerStartRestartGroup, 54), composerStartRestartGroup, (i62 & 14) | 199680 | (i62 & 112), 20);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            c2002Dp4 = c2002Dp2;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        c2002Dp3 = c2002Dp;
        if ((i2 & 4) == 0) {
        }
        c2002Dp4 = c2002Dp2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void GainLossCellComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1433741920);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1433741920, i, -1, "com.robinhood.android.equities.taxlots.table.GainLossCellComposablePreview (TaxLotsGainLossCell.kt:120)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotsGainLossCell2.INSTANCE.getLambda$1673434856$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsGainLossCell5.GainLossCellComposablePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
