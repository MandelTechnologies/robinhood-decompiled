package com.robinhood.android.equities.tradesettings.p120ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.equities.tradesettings.TimeInForceDuxo;
import com.robinhood.android.equities.tradesettings.TimeInForceViewState;
import com.robinhood.android.equities.tradesettings.p120ui.TimeInForceBottomSheet5;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Job;

/* compiled from: TimeInForceBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a]\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"TIME_IN_FORCE_LOADING_STATE", "", "TimeInForceBottomSheet", "", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentId", "Ljava/util/UUID;", "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo;", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo;Landroidx/compose/runtime/Composer;II)V", "TimeInForceComposable", "viewState", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;", "onTimeInForceChanged", "Lkotlin/Function3;", "Lcom/robinhood/models/db/OrderTimeInForce;", "(Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimeInForceBottomSheetLoadedPreview", "(Landroidx/compose/runtime/Composer;I)V", "TimeInForceBottomSheetLoadingPreview", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TimeInForceBottomSheet5 {
    public static final String TIME_IN_FORCE_LOADING_STATE = "TimeInForceLoadingState";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceBottomSheet$lambda$5(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, Function0 function0, Modifier modifier, TimeInForceDuxo timeInForceDuxo, int i, int i2, Composer composer, int i3) {
        TimeInForceBottomSheet(tradeSettingsStore4, tradeSettingsStore3, uuid, function0, modifier, timeInForceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceBottomSheetLoadedPreview$lambda$7(int i, Composer composer, int i2) {
        TimeInForceBottomSheetLoadedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceBottomSheetLoadingPreview$lambda$8(int i, Composer composer, int i2) {
        TimeInForceBottomSheetLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceComposable$lambda$6(TimeInForceViewState timeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3 function3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimeInForceComposable(timeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInForceBottomSheet(final TradeSettingsStore4 locationType, final TradeSettingsStore3 instrumentType, final UUID instrumentId, final Function0<Unit> onDone, Modifier modifier, TimeInForceDuxo timeInForceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TimeInForceDuxo timeInForceDuxo2;
        boolean z;
        int i4;
        TimeInForceDuxo timeInForceDuxo3;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        final TimeInForceDuxo timeInForceDuxo4;
        boolean z2;
        Composer composer2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final TimeInForceDuxo timeInForceDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1174154225);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(locationType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(instrumentType) : composerStartRestartGroup.changedInstance(instrumentType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    timeInForceDuxo2 = timeInForceDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(timeInForceDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    timeInForceDuxo2 = timeInForceDuxo;
                }
                i3 |= i7;
            } else {
                timeInForceDuxo2 = timeInForceDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 32) == 0) {
                        String str = "TimeInForceDuxo_" + locationType + "_" + instrumentType;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TimeInForceDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceBottomSheet$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        timeInForceDuxo2 = (TimeInForceDuxo) baseDuxo;
                        i3 &= -458753;
                    } else {
                        z = false;
                    }
                    TimeInForceDuxo timeInForceDuxo6 = timeInForceDuxo2;
                    i4 = i3;
                    timeInForceDuxo3 = timeInForceDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    TimeInForceDuxo timeInForceDuxo7 = timeInForceDuxo2;
                    i4 = i3;
                    timeInForceDuxo3 = timeInForceDuxo7;
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1174154225, i4, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheet (TimeInForceBottomSheet.kt:45)");
                }
                i5 = i4;
                TimeInForceViewState timeInForceViewStateTimeInForceBottomSheet$lambda$0 = TimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(timeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(timeInForceDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TimeInForceBottomSheet6(timeInForceDuxo3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier3 = modifier2;
                timeInForceDuxo4 = timeInForceDuxo3;
                z2 = z;
                composer2 = composerStartRestartGroup;
                TimeInForceComposable(timeInForceViewStateTimeInForceBottomSheet$lambda$0, locationType, instrumentType, (Function3) ((KFunction) objRememberedValue), onDone, modifier3, composer2, (i5 << 3) & 517104, 0);
                modifier2 = modifier3;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(-1224400529);
                boolean zChangedInstance4 = composer2.changedInstance(timeInForceDuxo4) | ((i5 & 14) != 4 ? true : z2);
                if ((i5 & 112) != 32 || ((i5 & 64) != 0 && composer2.changedInstance(instrumentType))) {
                    z2 = true;
                }
                zChangedInstance2 = zChangedInstance4 | z2 | composer2.changedInstance(instrumentId);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TimeInForceBottomSheet5.TimeInForceBottomSheet$lambda$4$lambda$3(timeInForceDuxo4, locationType, instrumentType, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentType, instrumentId, lifecycleOwner, (Function1) objRememberedValue2, composer2, i5 & 1022, 0);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                timeInForceDuxo5 = timeInForceDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                timeInForceDuxo5 = timeInForceDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TimeInForceBottomSheet5.TimeInForceBottomSheet$lambda$5(locationType, instrumentType, instrumentId, onDone, modifier4, timeInForceDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                TimeInForceDuxo timeInForceDuxo62 = timeInForceDuxo2;
                i4 = i3;
                timeInForceDuxo3 = timeInForceDuxo62;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = i4;
                TimeInForceViewState timeInForceViewStateTimeInForceBottomSheet$lambda$02 = TimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(timeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(timeInForceDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new TimeInForceBottomSheet6(timeInForceDuxo3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier32 = modifier2;
                    timeInForceDuxo4 = timeInForceDuxo3;
                    z2 = z;
                    composer2 = composerStartRestartGroup;
                    TimeInForceComposable(timeInForceViewStateTimeInForceBottomSheet$lambda$02, locationType, instrumentType, (Function3) ((KFunction) objRememberedValue), onDone, modifier32, composer2, (i5 << 3) & 517104, 0);
                    modifier2 = modifier32;
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChangedInstance42 = composer2.changedInstance(timeInForceDuxo4) | ((i5 & 14) != 4 ? true : z2);
                    if ((i5 & 112) != 32) {
                        z2 = true;
                        zChangedInstance2 = zChangedInstance42 | z2 | composer2.changedInstance(instrumentId);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TimeInForceBottomSheet5.TimeInForceBottomSheet$lambda$4$lambda$3(timeInForceDuxo4, locationType, instrumentType, instrumentId, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                            composer2.endReplaceGroup();
                            LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentType, instrumentId, lifecycleOwner2, (Function1) objRememberedValue2, composer2, i5 & 1022, 0);
                            composerStartRestartGroup = composer2;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            timeInForceDuxo5 = timeInForceDuxo4;
                        }
                    }
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult TimeInForceBottomSheet$lambda$4$lambda$3(TimeInForceDuxo timeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = timeInForceDuxo.bind(tradeSettingsStore4, tradeSettingsStore3, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceBottomSheet$lambda$4$lambda$3$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInForceComposable(final TimeInForceViewState timeInForceViewState, final TradeSettingsStore4 tradeSettingsStore4, final TradeSettingsStore3 tradeSettingsStore3, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1047684834);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(timeInForceViewState) : composerStartRestartGroup.changedInstance(timeInForceViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(tradeSettingsStore4.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(tradeSettingsStore3) : composerStartRestartGroup.changedInstance(tradeSettingsStore3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1047684834, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceComposable (TimeInForceBottomSheet.kt:71)");
                }
                final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                final Modifier modifier4 = modifier3;
                final Function0<Unit> function03 = function02;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-559044951, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt.TimeInForceComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-559044951, i5, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceComposable.<anonymous> (TimeInForceBottomSheet.kt:75)");
                        }
                        SelectionLayoutKt.SelectionLayout(true, true, TimeInForceBottomSheet.INSTANCE.getLambda$195374482$lib_trade_settings_externalDebug(), function03, ComposableLambda3.rememberComposableLambda(92078288, true, new AnonymousClass1(timeInForceViewState, resources, function3, tradeSettingsStore4, tradeSettingsStore3), composer2, 54), modifier4, null, composer2, 25014, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: TimeInForceBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TradeSettingsStore3 $instrumentType;
                        final /* synthetic */ TradeSettingsStore4 $locationType;
                        final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> $onTimeInForceChanged;
                        final /* synthetic */ Resources $resources;
                        final /* synthetic */ TimeInForceViewState $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(TimeInForceViewState timeInForceViewState, Resources resources, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3) {
                            this.$viewState = timeInForceViewState;
                            this.$resources = resources;
                            this.$onTimeInForceChanged = function3;
                            this.$locationType = tradeSettingsStore4;
                            this.$instrumentType = tradeSettingsStore3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            int i2 = 2;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(92078288, i, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceComposable.<anonymous>.<anonymous> (TimeInForceBottomSheet.kt:88)");
                            }
                            TimeInForceViewState timeInForceViewState = this.$viewState;
                            boolean z = true;
                            boolean z2 = false;
                            if (timeInForceViewState instanceof TimeInForceViewState.Loading) {
                                composer.startReplaceGroup(-1379692398);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Shape shape = null;
                                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), TimeInForceBottomSheet5.TIME_IN_FORCE_LOADING_STATE);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
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
                                composer.startReplaceGroup(1708281953);
                                int i4 = 0;
                                while (i4 < i2) {
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z, shape, i2, shape);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, type2, "", false, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 200112, 6, 976);
                                    i4++;
                                    shape = shape;
                                    i2 = i2;
                                    z = z;
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                composer.endReplaceGroup();
                            } else {
                                if (!(timeInForceViewState instanceof TimeInForceViewState.Loaded)) {
                                    composer.startReplaceGroup(-1707075954);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(-1378629935);
                                TimeInForceViewState.Loaded loaded = (TimeInForceViewState.Loaded) timeInForceViewState;
                                ImmutableList<SelectionRowState<OrderTimeInForce>> selectionOptions = loaded.getSelectionOptions();
                                Resources resources = this.$resources;
                                final Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> function3 = this.$onTimeInForceChanged;
                                final TradeSettingsStore4 tradeSettingsStore4 = this.$locationType;
                                final TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
                                for (final SelectionRowState<OrderTimeInForce> selectionRowState : selectionOptions) {
                                    BentoSelectionRowState.Type type3 = BentoSelectionRowState.Type.RadioButton;
                                    StringResource primaryText = selectionRowState.getPrimaryText();
                                    Intrinsics.checkNotNull(resources);
                                    String string2 = primaryText.getText(resources).toString();
                                    String string3 = selectionRowState.getSecondaryText().getText(resources).toString();
                                    boolean z3 = loaded.getOrderTimeInForce() == selectionRowState.getOption() ? true : z2;
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged = composer.changed(function3) | composer.changed(tradeSettingsStore4.ordinal()) | composer.changedInstance(tradeSettingsStore3) | composer.changedInstance(selectionRowState);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TimeInForceBottomSheet5.C150641.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(function3, tradeSettingsStore4, tradeSettingsStore3, selectionRowState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(null, type3, string2, z3, string3, false, null, false, false, false, (Function0) objRememberedValue2, composer, 48, 0, 993);
                                    resources = resources;
                                    function3 = function3;
                                    z2 = z2;
                                    tradeSettingsStore4 = tradeSettingsStore4;
                                    tradeSettingsStore3 = tradeSettingsStore3;
                                }
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, SelectionRowState selectionRowState) {
                            function3.invoke(tradeSettingsStore4, tradeSettingsStore3, selectionRowState.getOption());
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TimeInForceBottomSheet5.TimeInForceComposable$lambda$6(timeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function3, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            final Modifier modifier42 = modifier3;
            final Function0<Unit> function032 = function02;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-559044951, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt.TimeInForceComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-559044951, i5, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceComposable.<anonymous> (TimeInForceBottomSheet.kt:75)");
                    }
                    SelectionLayoutKt.SelectionLayout(true, true, TimeInForceBottomSheet.INSTANCE.getLambda$195374482$lib_trade_settings_externalDebug(), function032, ComposableLambda3.rememberComposableLambda(92078288, true, new AnonymousClass1(timeInForceViewState, resources2, function3, tradeSettingsStore4, tradeSettingsStore3), composer2, 54), modifier42, null, composer2, 25014, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TimeInForceBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ TradeSettingsStore3 $instrumentType;
                    final /* synthetic */ TradeSettingsStore4 $locationType;
                    final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> $onTimeInForceChanged;
                    final /* synthetic */ Resources $resources;
                    final /* synthetic */ TimeInForceViewState $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(TimeInForceViewState timeInForceViewState, Resources resources, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3) {
                        this.$viewState = timeInForceViewState;
                        this.$resources = resources;
                        this.$onTimeInForceChanged = function3;
                        this.$locationType = tradeSettingsStore4;
                        this.$instrumentType = tradeSettingsStore3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        int i2 = 2;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(92078288, i, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceComposable.<anonymous>.<anonymous> (TimeInForceBottomSheet.kt:88)");
                        }
                        TimeInForceViewState timeInForceViewState = this.$viewState;
                        boolean z = true;
                        boolean z2 = false;
                        if (timeInForceViewState instanceof TimeInForceViewState.Loading) {
                            composer.startReplaceGroup(-1379692398);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Shape shape = null;
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), TimeInForceBottomSheet5.TIME_IN_FORCE_LOADING_STATE);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
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
                            composer.startReplaceGroup(1708281953);
                            int i4 = 0;
                            while (i4 < i2) {
                                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z, shape, i2, shape);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, type2, "", false, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 200112, 6, 976);
                                i4++;
                                shape = shape;
                                i2 = i2;
                                z = z;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endReplaceGroup();
                        } else {
                            if (!(timeInForceViewState instanceof TimeInForceViewState.Loaded)) {
                                composer.startReplaceGroup(-1707075954);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1378629935);
                            TimeInForceViewState.Loaded loaded = (TimeInForceViewState.Loaded) timeInForceViewState;
                            ImmutableList<SelectionRowState<OrderTimeInForce>> selectionOptions = loaded.getSelectionOptions();
                            Resources resources = this.$resources;
                            final Function3 function3 = this.$onTimeInForceChanged;
                            final TradeSettingsStore4 tradeSettingsStore4 = this.$locationType;
                            final TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
                            for (final SelectionRowState selectionRowState : selectionOptions) {
                                BentoSelectionRowState.Type type3 = BentoSelectionRowState.Type.RadioButton;
                                StringResource primaryText = selectionRowState.getPrimaryText();
                                Intrinsics.checkNotNull(resources);
                                String string2 = primaryText.getText(resources).toString();
                                String string3 = selectionRowState.getSecondaryText().getText(resources).toString();
                                boolean z3 = loaded.getOrderTimeInForce() == selectionRowState.getOption() ? true : z2;
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged = composer.changed(function3) | composer.changed(tradeSettingsStore4.ordinal()) | composer.changedInstance(tradeSettingsStore3) | composer.changedInstance(selectionRowState);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$TimeInForceComposable$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TimeInForceBottomSheet5.C150641.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(function3, tradeSettingsStore4, tradeSettingsStore3, selectionRowState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(null, type3, string2, z3, string3, false, null, false, false, false, (Function0) objRememberedValue2, composer, 48, 0, 993);
                                resources = resources;
                                function3 = function3;
                                z2 = z2;
                                tradeSettingsStore4 = tradeSettingsStore4;
                                tradeSettingsStore3 = tradeSettingsStore3;
                            }
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, SelectionRowState selectionRowState) {
                        function3.invoke(tradeSettingsStore4, tradeSettingsStore3, selectionRowState.getOption());
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final TimeInForceViewState TimeInForceBottomSheet$lambda$0(SnapshotState4<? extends TimeInForceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void TimeInForceBottomSheetLoadedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1400161017);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400161017, i, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetLoadedPreview (TimeInForceBottomSheet.kt:131)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TimeInForceBottomSheet.INSTANCE.m13687getLambda$1259808703$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimeInForceBottomSheet5.TimeInForceBottomSheetLoadedPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TimeInForceBottomSheetLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(962254910);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(962254910, i, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetLoadingPreview (TimeInForceBottomSheet.kt:160)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TimeInForceBottomSheet.INSTANCE.getLambda$107572214$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TimeInForceBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimeInForceBottomSheet5.TimeInForceBottomSheetLoadingPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
