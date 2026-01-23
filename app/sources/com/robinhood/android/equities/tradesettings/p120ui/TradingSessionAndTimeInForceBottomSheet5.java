package com.robinhood.android.equities.tradesettings.p120ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo;
import com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceViewState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHoursComposableKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.OrderMarketHours;
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
import kotlinx.coroutines.Job;

/* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0085\u0001\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001b\u001aM\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001e\u001aE\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"¨\u0006$²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"TradingSessionAndTimeInForceBottomSheet", "", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "hideTradeSessionVisualizer", "", "duxo", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDuxo;", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDuxo;Landroidx/compose/runtime/Composer;II)V", "TradingSessionAndTimeInForceComposable", "viewState", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;", "onTradingSessionChanged", "Lkotlin/Function3;", "Lcom/robinhood/models/db/OrderMarketHours;", "onTimeInForceChanged", "Lcom/robinhood/models/db/OrderTimeInForce;", "(Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TradingSessionContent", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loaded;", "(Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loaded;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lkotlin/jvm/functions/Function3;ZLandroidx/compose/runtime/Composer;I)V", "TimeInForceContent", "(Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loaded;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "TradingSessionAndTimeInForceBottomSheetLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "TradingSessionAndTimeInForceBottomSheetLoadedPreview", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradingSessionAndTimeInForceBottomSheet5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceContent$lambda$17(TradingSessionAndTimeInForceViewState.Loaded loaded, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3 function3, int i, Composer composer, int i2) {
        TimeInForceContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionAndTimeInForceBottomSheet$lambda$6(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, Function0 function0, Modifier modifier, boolean z, TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, int i, int i2, Composer composer, int i3) {
        TradingSessionAndTimeInForceBottomSheet(tradeSettingsStore4, tradeSettingsStore3, uuid, str, function0, modifier, z, tradingSessionAndTimeInForceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionAndTimeInForceBottomSheetLoadedPreview$lambda$19(int i, Composer composer, int i2) {
        TradingSessionAndTimeInForceBottomSheetLoadedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionAndTimeInForceBottomSheetLoadingPreview$lambda$18(int i, Composer composer, int i2) {
        TradingSessionAndTimeInForceBottomSheetLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionAndTimeInForceComposable$lambda$7(TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3 function3, Function3 function32, Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingSessionAndTimeInForceComposable(tradingSessionAndTimeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function3, function32, function0, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionContent$lambda$12(TradingSessionAndTimeInForceViewState.Loaded loaded, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3 function3, boolean z, int i, Composer composer, int i2) {
        TradingSessionContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingSessionAndTimeInForceBottomSheet(final TradeSettingsStore4 locationType, final TradeSettingsStore3 instrumentType, final UUID instrumentId, final String accountNumber, final Function0<Unit> onDone, Modifier modifier, boolean z, TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo2;
        TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo3;
        Modifier modifier3;
        TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo4;
        boolean z3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo5;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier4;
        Composer composer2;
        final boolean z4;
        final TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(637624568);
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
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    tradingSessionAndTimeInForceDuxo2 = tradingSessionAndTimeInForceDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo2) ? 8388608 : 4194304;
                    i3 |= i6;
                } else {
                    tradingSessionAndTimeInForceDuxo2 = tradingSessionAndTimeInForceDuxo;
                }
                i3 |= i6;
            } else {
                tradingSessionAndTimeInForceDuxo2 = tradingSessionAndTimeInForceDuxo;
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 128) == 0) {
                        String str = "TradingSessionAndTimeInForceDuxo_" + locationType + "_" + instrumentType;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TradingSessionAndTimeInForceDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceBottomSheet$$inlined$duxo$1.1
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
                        tradingSessionAndTimeInForceDuxo3 = (TradingSessionAndTimeInForceDuxo) baseDuxo;
                        i3 &= -29360129;
                    } else {
                        tradingSessionAndTimeInForceDuxo3 = tradingSessionAndTimeInForceDuxo2;
                    }
                    modifier3 = modifier5;
                    tradingSessionAndTimeInForceDuxo4 = tradingSessionAndTimeInForceDuxo3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    z3 = z2;
                    tradingSessionAndTimeInForceDuxo4 = tradingSessionAndTimeInForceDuxo2;
                    modifier3 = modifier;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(637624568, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheet (TradingSessionAndTimeInForceBottomSheet.kt:54)");
                }
                TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewStateTradingSessionAndTimeInForceBottomSheet$lambda$0 = TradingSessionAndTimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(tradingSessionAndTimeInForceDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TradingSessionAndTimeInForceBottomSheet6(tradingSessionAndTimeInForceDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new TradingSessionAndTimeInForceBottomSheet7(tradingSessionAndTimeInForceDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = i3;
                tradingSessionAndTimeInForceDuxo5 = tradingSessionAndTimeInForceDuxo4;
                TradingSessionAndTimeInForceComposable(tradingSessionAndTimeInForceViewStateTradingSessionAndTimeInForceBottomSheet$lambda$0, locationType, instrumentType, (Function3) kFunction, (Function3) ((KFunction) objRememberedValue2), onDone, z3, modifier3, composerStartRestartGroup, ((i3 << 3) & 459760) | (i3 & 3670016) | ((i3 << 6) & 29360128), 0);
                boolean z5 = z3;
                Object[] objArr = {locationType, instrumentType, instrumentId, accountNumber};
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo5) | ((i7 & 14) != 4) | ((i7 & 112) != 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(instrumentType))) | composerStartRestartGroup.changedInstance(instrumentId) | ((i7 & 7168) == 2048);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceBottomSheet$lambda$5$lambda$4(tradingSessionAndTimeInForceDuxo5, locationType, instrumentType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue3 = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(objArr, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue3, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                z4 = z5;
                tradingSessionAndTimeInForceDuxo6 = tradingSessionAndTimeInForceDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                tradingSessionAndTimeInForceDuxo6 = tradingSessionAndTimeInForceDuxo2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceBottomSheet$lambda$6(locationType, instrumentType, instrumentId, accountNumber, onDone, modifier4, z4, tradingSessionAndTimeInForceDuxo6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                modifier3 = modifier5;
                tradingSessionAndTimeInForceDuxo4 = tradingSessionAndTimeInForceDuxo3;
                z3 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewStateTradingSessionAndTimeInForceBottomSheet$lambda$02 = TradingSessionAndTimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(tradingSessionAndTimeInForceDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new TradingSessionAndTimeInForceBottomSheet6(tradingSessionAndTimeInForceDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    KFunction kFunction2 = (KFunction) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new TradingSessionAndTimeInForceBottomSheet7(tradingSessionAndTimeInForceDuxo4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        int i72 = i3;
                        tradingSessionAndTimeInForceDuxo5 = tradingSessionAndTimeInForceDuxo4;
                        TradingSessionAndTimeInForceComposable(tradingSessionAndTimeInForceViewStateTradingSessionAndTimeInForceBottomSheet$lambda$02, locationType, instrumentType, (Function3) kFunction2, (Function3) ((KFunction) objRememberedValue2), onDone, z3, modifier3, composerStartRestartGroup, ((i3 << 3) & 459760) | (i3 & 3670016) | ((i3 << 6) & 29360128), 0);
                        boolean z52 = z3;
                        Object[] objArr2 = {locationType, instrumentType, instrumentId, accountNumber};
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if ((i72 & 112) != 32) {
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceDuxo5) | ((i72 & 14) != 4) | ((i72 & 112) != 32 || ((i72 & 64) != 0 && composerStartRestartGroup.changedInstance(instrumentType))) | composerStartRestartGroup.changedInstance(instrumentId) | ((i72 & 7168) == 2048);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3) {
                                Function1 function12 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceBottomSheet$lambda$5$lambda$4(tradingSessionAndTimeInForceDuxo5, locationType, instrumentType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function12);
                                objRememberedValue3 = function12;
                                composerStartRestartGroup.endReplaceGroup();
                                LifecycleEffectKt.LifecycleResumeEffect(objArr2, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue3, composerStartRestartGroup, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                composer2 = composerStartRestartGroup;
                                z4 = z52;
                                tradingSessionAndTimeInForceDuxo6 = tradingSessionAndTimeInForceDuxo5;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult TradingSessionAndTimeInForceBottomSheet$lambda$5$lambda$4(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = tradingSessionAndTimeInForceDuxo.bind(tradeSettingsStore4, tradeSettingsStore3, uuid, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceBottomSheet$lambda$5$lambda$4$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final TradingSessionAndTimeInForceViewState TradingSessionAndTimeInForceBottomSheet$lambda$0(SnapshotState4<? extends TradingSessionAndTimeInForceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingSessionAndTimeInForceComposable(final TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState, final TradeSettingsStore4 tradeSettingsStore4, final TradeSettingsStore3 tradeSettingsStore3, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function32, final Function0<Unit> function0, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function33;
        Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function34;
        Function0<Unit> function02;
        final boolean z2;
        int i4;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-178315649);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tradingSessionAndTimeInForceViewState) : composerStartRestartGroup.changedInstance(tradingSessionAndTimeInForceViewState) ? 4 : 2) | i;
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
            function33 = function3;
        } else {
            function33 = function3;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function33) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function34 = function32;
        } else {
            function34 = function32;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function34) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-178315649, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable (TradingSessionAndTimeInForceBottomSheet.kt:87)");
                    }
                    final Function0<Unit> function03 = function02;
                    final Modifier modifier3 = modifier2;
                    final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function35 = function34;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1392224212, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt.TradingSessionAndTimeInForceComposable.1
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
                                ComposerKt.traceEventStart(1392224212, i5, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:89)");
                            }
                            final TradeSettingsStore3 tradeSettingsStore32 = tradeSettingsStore3;
                            SelectionLayoutKt.SelectionLayout(true, true, ComposableLambda3.rememberComposableLambda(389010059, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt.TradingSessionAndTimeInForceComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(389010059, i6, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous>.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:94)");
                                    }
                                    TradeSettingsStore3 tradeSettingsStore33 = tradeSettingsStore32;
                                    if (tradeSettingsStore33 instanceof TradeSettingsStore3.Equity) {
                                        if (((TradeSettingsStore3.Equity) tradeSettingsStore33).getPositionType() == EquityPositionType.LONG) {
                                            composer3.startReplaceGroup(1177089063);
                                            String strStringResource = StringResources_androidKt.stringResource(C14990R.string.long_orders_setting_title, composer3, 0);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i7 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                            composer3.endReplaceGroup();
                                        } else if (((TradeSettingsStore3.Equity) tradeSettingsStore32).getPositionType() == EquityPositionType.SHORT) {
                                            composer3.startReplaceGroup(1177520614);
                                            String strStringResource2 = StringResources_androidKt.stringResource(C14990R.string.short_orders_setting_title, composer3, 0);
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i8 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1177875223);
                                            composer3.endReplaceGroup();
                                        }
                                    } else if (!Intrinsics.areEqual(tradeSettingsStore33, TradeSettingsStore3.Options.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), function03, ComposableLambda3.rememberComposableLambda(-1716304371, true, new AnonymousClass2(tradingSessionAndTimeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function33, z2, function35), composer2, 54), modifier3, null, composer2, 25014, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceComposable$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $hideTradeSessionVisualizer;
                            final /* synthetic */ TradeSettingsStore3 $instrumentType;
                            final /* synthetic */ TradeSettingsStore4 $locationType;
                            final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> $onTimeInForceChanged;
                            final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> $onTradingSessionChanged;
                            final /* synthetic */ TradingSessionAndTimeInForceViewState $viewState;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3, boolean z, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function32) {
                                this.$viewState = tradingSessionAndTimeInForceViewState;
                                this.$locationType = tradeSettingsStore4;
                                this.$instrumentType = tradeSettingsStore3;
                                this.$onTradingSessionChanged = function3;
                                this.$hideTradeSessionVisualizer = z;
                                this.$onTimeInForceChanged = function32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                Composer composer2 = composer;
                                if ((i & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1716304371, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous>.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:118)");
                                }
                                TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState = this.$viewState;
                                if (tradingSessionAndTimeInForceViewState instanceof TradingSessionAndTimeInForceViewState.Loading) {
                                    composer2.startReplaceGroup(1162289051);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Shape shape = null;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer2.startReplaceGroup(1220354554);
                                    int i3 = 0;
                                    for (int i4 = 2; i3 < i4; i4 = i4) {
                                        BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                        Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, shape, i4, shape);
                                        composer2.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer2.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceComposable$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, type2, "", false, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 200112, 6, 976);
                                        composer2 = composer;
                                        i3++;
                                        shape = shape;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(tradingSessionAndTimeInForceViewState instanceof TradingSessionAndTimeInForceViewState.Loaded)) {
                                        composer2.startReplaceGroup(-101054437);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(1163362240);
                                    TradeSettingsStore4 tradeSettingsStore4 = this.$locationType;
                                    TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
                                    Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> function3 = this.$onTradingSessionChanged;
                                    boolean z = this.$hideTradeSessionVisualizer;
                                    Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> function32 = this.$onTimeInForceChanged;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion3);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    TradingSessionAndTimeInForceViewState.Loaded loaded = (TradingSessionAndTimeInForceViewState.Loaded) tradingSessionAndTimeInForceViewState;
                                    int i5 = StringResource.$stable;
                                    int i6 = SetTradingHourVisualizerArgs.$stable;
                                    TradingSessionAndTimeInForceBottomSheet5.TradingSessionContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, z, composer, i5 | i6);
                                    TradingSessionAndTimeInForceBottomSheet5.TimeInForceContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function32, composer, i5 | i6);
                                    AnimatedContentKt.AnimatedContent(loaded.getOrderTradingSession(), null, null, null, null, null, TradingSessionAndTimeInForceBottomSheet.INSTANCE.m13691getLambda$559053758$lib_trade_settings_externalDebug(), composer, 1572864, 62);
                                    composer.endNode();
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceComposable$lambda$7(tradingSessionAndTimeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function3, function32, function0, z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) != 4793490) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function0<Unit> function032 = function02;
                final Modifier modifier32 = modifier2;
                final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function352 = function34;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1392224212, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt.TradingSessionAndTimeInForceComposable.1
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
                            ComposerKt.traceEventStart(1392224212, i5, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:89)");
                        }
                        final TradeSettingsStore3 tradeSettingsStore32 = tradeSettingsStore3;
                        SelectionLayoutKt.SelectionLayout(true, true, ComposableLambda3.rememberComposableLambda(389010059, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt.TradingSessionAndTimeInForceComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(389010059, i6, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous>.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:94)");
                                }
                                TradeSettingsStore3 tradeSettingsStore33 = tradeSettingsStore32;
                                if (tradeSettingsStore33 instanceof TradeSettingsStore3.Equity) {
                                    if (((TradeSettingsStore3.Equity) tradeSettingsStore33).getPositionType() == EquityPositionType.LONG) {
                                        composer3.startReplaceGroup(1177089063);
                                        String strStringResource = StringResources_androidKt.stringResource(C14990R.string.long_orders_setting_title, composer3, 0);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i7 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                        composer3.endReplaceGroup();
                                    } else if (((TradeSettingsStore3.Equity) tradeSettingsStore32).getPositionType() == EquityPositionType.SHORT) {
                                        composer3.startReplaceGroup(1177520614);
                                        String strStringResource2 = StringResources_androidKt.stringResource(C14990R.string.short_orders_setting_title, composer3, 0);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(1177875223);
                                        composer3.endReplaceGroup();
                                    }
                                } else if (!Intrinsics.areEqual(tradeSettingsStore33, TradeSettingsStore3.Options.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), function032, ComposableLambda3.rememberComposableLambda(-1716304371, true, new AnonymousClass2(tradingSessionAndTimeInForceViewState, tradeSettingsStore4, tradeSettingsStore3, function33, z2, function352), composer2, 54), modifier32, null, composer2, 25014, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ boolean $hideTradeSessionVisualizer;
                        final /* synthetic */ TradeSettingsStore3 $instrumentType;
                        final /* synthetic */ TradeSettingsStore4 $locationType;
                        final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> $onTimeInForceChanged;
                        final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> $onTradingSessionChanged;
                        final /* synthetic */ TradingSessionAndTimeInForceViewState $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3, boolean z, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function32) {
                            this.$viewState = tradingSessionAndTimeInForceViewState;
                            this.$locationType = tradeSettingsStore4;
                            this.$instrumentType = tradeSettingsStore3;
                            this.$onTradingSessionChanged = function3;
                            this.$hideTradeSessionVisualizer = z;
                            this.$onTimeInForceChanged = function32;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1716304371, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceComposable.<anonymous>.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:118)");
                            }
                            TradingSessionAndTimeInForceViewState tradingSessionAndTimeInForceViewState = this.$viewState;
                            if (tradingSessionAndTimeInForceViewState instanceof TradingSessionAndTimeInForceViewState.Loading) {
                                composer2.startReplaceGroup(1162289051);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Shape shape = null;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer2.startReplaceGroup(1220354554);
                                int i3 = 0;
                                for (int i4 = 2; i3 < i4; i4 = i4) {
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, shape, i4, shape);
                                    composer2.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceComposable$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, type2, "", false, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 200112, 6, 976);
                                    composer2 = composer;
                                    i3++;
                                    shape = shape;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            } else {
                                if (!(tradingSessionAndTimeInForceViewState instanceof TradingSessionAndTimeInForceViewState.Loaded)) {
                                    composer2.startReplaceGroup(-101054437);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1163362240);
                                TradeSettingsStore4 tradeSettingsStore4 = this.$locationType;
                                TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
                                Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> function3 = this.$onTradingSessionChanged;
                                boolean z = this.$hideTradeSessionVisualizer;
                                Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> function32 = this.$onTimeInForceChanged;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion3);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                TradingSessionAndTimeInForceViewState.Loaded loaded = (TradingSessionAndTimeInForceViewState.Loaded) tradingSessionAndTimeInForceViewState;
                                int i5 = StringResource.$stable;
                                int i6 = SetTradingHourVisualizerArgs.$stable;
                                TradingSessionAndTimeInForceBottomSheet5.TradingSessionContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, z, composer, i5 | i6);
                                TradingSessionAndTimeInForceBottomSheet5.TimeInForceContent(loaded, tradeSettingsStore4, tradeSettingsStore3, function32, composer, i5 | i6);
                                AnimatedContentKt.AnimatedContent(loaded.getOrderTradingSession(), null, null, null, null, null, TradingSessionAndTimeInForceBottomSheet.INSTANCE.m13691getLambda$559053758$lib_trade_settings_externalDebug(), composer, 1572864, 62);
                                composer.endNode();
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingSessionContent(final TradingSessionAndTimeInForceViewState.Loaded loaded, final TradeSettingsStore4 tradeSettingsStore4, final TradeSettingsStore3 tradeSettingsStore3, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3, final boolean z, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1573281207);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(tradeSettingsStore4.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(tradeSettingsStore3) : composerStartRestartGroup.changedInstance(tradeSettingsStore3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573281207, i2, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionContent (TradingSessionAndTimeInForceBottomSheet.kt:197)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i3 = 2048;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14990R.string.trading_session_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(2044289880);
            if (!z) {
                SetTradingHoursComposableKt.SetTradingHoursComposable(loaded.getTradingSessionVisualizer().getLeftEdgeText(), loaded.getTradingSessionVisualizer().getRightEdgeText(), loaded.getTradingSessionVisualizer().getLeftBoundaryText(), loaded.getTradingSessionVisualizer().getRightBoundaryText(), loaded.getTradingSessionVisualizer().getGetGradientColor().invoke(composerStartRestartGroup, 0), loaded.getTradingSessionVisualizer().getNumPegs(), loaded.getTradingSessionVisualizer().getLeftEdgeInstant(), loaded.getTradingSessionVisualizer().getRightEdgeInstant(), loaded.getTradingSessionVisualizer().getSelectedMarketHoursOpenClose(), null, composerStartRestartGroup, 0, 512);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2044319111);
            for (final SelectionRowState<OrderMarketHours> selectionRowState : loaded.getTradeSessionSelectionOptions()) {
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                StringResource primaryText = selectionRowState.getPrimaryText();
                Intrinsics.checkNotNull(resources);
                String string2 = primaryText.getText(resources).toString();
                String string3 = selectionRowState.getSecondaryText().getText(resources).toString();
                boolean z2 = true;
                boolean z3 = loaded.getOrderTradingSession() == selectionRowState.getOption();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean z4 = ((i2 & 7168) == i3) | ((i2 & 112) == 32);
                if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !composerStartRestartGroup.changedInstance(tradeSettingsStore3))) {
                    z2 = false;
                }
                boolean zChangedInstance = z4 | z2 | composerStartRestartGroup.changedInstance(selectionRowState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradingSessionAndTimeInForceBottomSheet5.TradingSessionContent$lambda$11$lambda$10$lambda$9$lambda$8(function3, tradeSettingsStore4, tradeSettingsStore3, selectionRowState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                BentoSelectionRow2.BentoSelectionRow(null, type2, string2, z3, string3, false, null, false, true, false, (Function0) objRememberedValue, composer2, 100663344, 0, 737);
                composerStartRestartGroup = composer2;
                i3 = 2048;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionAndTimeInForceBottomSheet5.TradingSessionContent$lambda$12(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionContent$lambda$11$lambda$10$lambda$9$lambda$8(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, SelectionRowState selectionRowState) {
        function3.invoke(tradeSettingsStore4, tradeSettingsStore3, selectionRowState.getOption());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInForceContent(final TradingSessionAndTimeInForceViewState.Loaded loaded, final TradeSettingsStore4 tradeSettingsStore4, final TradeSettingsStore3 tradeSettingsStore3, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1461154773);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(tradeSettingsStore4.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(tradeSettingsStore3) : composerStartRestartGroup.changedInstance(tradeSettingsStore3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461154773, i2, -1, "com.robinhood.android.equities.tradesettings.ui.TimeInForceContent (TradingSessionAndTimeInForceBottomSheet.kt:241)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i3 = 2048;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14990R.string.time_in_force_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(-1658514711);
            for (final SelectionRowState<OrderTimeInForce> selectionRowState : loaded.getTimeInForceSelectionOptions()) {
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                StringResource primaryText = selectionRowState.getPrimaryText();
                Intrinsics.checkNotNull(resources);
                String string2 = primaryText.getText(resources).toString();
                String string3 = selectionRowState.getSecondaryText().getText(resources).toString();
                boolean z = true;
                boolean z2 = loaded.getOrderTimeInForce() == selectionRowState.getOption();
                composer3.startReplaceGroup(-1224400529);
                boolean z3 = ((i2 & 7168) == i3) | ((i2 & 112) == 32);
                if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !composer3.changedInstance(tradeSettingsStore3))) {
                    z = false;
                }
                boolean zChangedInstance = z3 | z | composer3.changedInstance(selectionRowState);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradingSessionAndTimeInForceBottomSheet5.TimeInForceContent$lambda$16$lambda$15$lambda$14$lambda$13(function3, tradeSettingsStore4, tradeSettingsStore3, selectionRowState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                Composer composer4 = composer3;
                BentoSelectionRow2.BentoSelectionRow(null, type2, string2, z2, string3, false, null, false, true, false, (Function0) objRememberedValue, composer4, 100663344, 0, 737);
                composer3 = composer4;
                i3 = 2048;
            }
            composer2 = composer3;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionAndTimeInForceBottomSheet5.TimeInForceContent$lambda$17(loaded, tradeSettingsStore4, tradeSettingsStore3, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceContent$lambda$16$lambda$15$lambda$14$lambda$13(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, SelectionRowState selectionRowState) {
        function3.invoke(tradeSettingsStore4, tradeSettingsStore3, selectionRowState.getOption());
        return Unit.INSTANCE;
    }

    private static final void TradingSessionAndTimeInForceBottomSheetLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(873514654);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(873514654, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetLoadingPreview (TradingSessionAndTimeInForceBottomSheet.kt:268)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradingSessionAndTimeInForceBottomSheet.INSTANCE.m13689getLambda$1618711466$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceBottomSheetLoadingPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TradingSessionAndTimeInForceBottomSheetLoadedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1023070647);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1023070647, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetLoadedPreview (TradingSessionAndTimeInForceBottomSheet.kt:284)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradingSessionAndTimeInForceBottomSheet.INSTANCE.m13690getLambda$165702401$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceBottomSheetLoadedPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
