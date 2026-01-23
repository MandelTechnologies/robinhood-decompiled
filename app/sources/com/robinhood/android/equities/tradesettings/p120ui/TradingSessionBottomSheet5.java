package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.animation.AnimatedContentKt;
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
import com.robinhood.android.equities.tradesettings.TradingSessionDuxo;
import com.robinhood.android.equities.tradesettings.TradingSessionViewState;
import com.robinhood.android.equities.tradesettings.p120ui.TradingSessionBottomSheet5;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHoursComposableKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
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

/* compiled from: TradingSessionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a]\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"TradingSessionBottomSheet", "", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDuxo;", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/tradesettings/TradingSessionDuxo;Landroidx/compose/runtime/Composer;II)V", "TradingSessionComposable", "viewState", "Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;", "onTradingSessionChanged", "Lkotlin/Function3;", "Lcom/robinhood/models/db/OrderMarketHours;", "(Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TradingSessionBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradingSessionBottomSheet5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionBottomSheet$lambda$5(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, Function0 function0, Modifier modifier, TradingSessionDuxo tradingSessionDuxo, int i, int i2, Composer composer, int i3) {
        TradingSessionBottomSheet(tradeSettingsStore4, tradeSettingsStore3, uuid, str, function0, modifier, tradingSessionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionBottomSheetPreview$lambda$7(int i, Composer composer, int i2) {
        TradingSessionBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionComposable$lambda$6(TradingSessionViewState tradingSessionViewState, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Function3 function3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingSessionComposable(tradingSessionViewState, tradeSettingsStore4, tradeSettingsStore3, function3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingSessionBottomSheet(final TradeSettingsStore4 locationType, final TradeSettingsStore3 instrumentType, final UUID instrumentId, final String accountNumber, final Function0<Unit> onDone, Modifier modifier, TradingSessionDuxo tradingSessionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final TradingSessionDuxo tradingSessionDuxo2;
        Modifier modifier3;
        Composer composer2;
        boolean z;
        int i4;
        TradingSessionDuxo tradingSessionDuxo3;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Modifier modifier4;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(826923034);
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
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    tradingSessionDuxo2 = tradingSessionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(tradingSessionDuxo2) ? 1048576 : 524288;
                    i3 |= i6;
                } else {
                    tradingSessionDuxo2 = tradingSessionDuxo;
                }
                i3 |= i6;
            } else {
                tradingSessionDuxo2 = tradingSessionDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        String str = "TradingSessionDuxo_" + locationType + "_" + instrumentType;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TradingSessionDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$TradingSessionBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$TradingSessionBottomSheet$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 = i3 & (-3670017);
                        tradingSessionDuxo3 = (TradingSessionDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        z = false;
                        i4 = i3;
                        tradingSessionDuxo3 = tradingSessionDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    tradingSessionDuxo3 = tradingSessionDuxo2;
                    composer2 = composerStartRestartGroup;
                    z = false;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(826923034, i4, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheet (TradingSessionBottomSheet.kt:46)");
                }
                composer3 = composer2;
                TradingSessionViewState tradingSessionViewStateTradingSessionBottomSheet$lambda$0 = TradingSessionBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(tradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(tradingSessionDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TradingSessionBottomSheet6(tradingSessionDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                int i7 = i4 << 3;
                tradingSessionDuxo2 = tradingSessionDuxo3;
                int i8 = i4;
                boolean z2 = z;
                TradingSessionComposable(tradingSessionViewStateTradingSessionBottomSheet$lambda$0, locationType, instrumentType, (Function3) ((KFunction) objRememberedValue), onDone, modifier3, composer3, StringResource.$stable | SetTradingHourVisualizerArgs.$stable | (i7 & 112) | (i7 & 896) | (57344 & i4) | (458752 & i4), 0);
                modifier4 = modifier3;
                Object[] objArr = {locationType, instrumentType, instrumentId, accountNumber};
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer3.startReplaceGroup(-1224400529);
                zChangedInstance2 = composer3.changedInstance(tradingSessionDuxo2) | ((i8 & 14) != 4 ? true : z2) | (((i8 & 112) != 32 || ((i8 & 64) != 0 && composer3.changedInstance(instrumentType))) ? true : z2) | composer3.changedInstance(instrumentId) | ((i8 & 7168) != 2048 ? true : z2);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TradingSessionBottomSheet5.TradingSessionBottomSheet$lambda$4$lambda$3(tradingSessionDuxo2, locationType, instrumentType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                }
                composer3.endReplaceGroup();
                composer4 = composer3;
                LifecycleEffectKt.LifecycleResumeEffect(objArr, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composer4, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer4 = composerStartRestartGroup;
            }
            final Modifier modifier5 = modifier4;
            final TradingSessionDuxo tradingSessionDuxo4 = tradingSessionDuxo2;
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingSessionBottomSheet5.TradingSessionBottomSheet$lambda$5(locationType, instrumentType, instrumentId, accountNumber, onDone, modifier5, tradingSessionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                TradingSessionViewState tradingSessionViewStateTradingSessionBottomSheet$lambda$02 = TradingSessionBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(tradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(tradingSessionDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new TradingSessionBottomSheet6(tradingSessionDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                    composer3.endReplaceGroup();
                    int i72 = i4 << 3;
                    tradingSessionDuxo2 = tradingSessionDuxo3;
                    int i82 = i4;
                    boolean z22 = z;
                    TradingSessionComposable(tradingSessionViewStateTradingSessionBottomSheet$lambda$02, locationType, instrumentType, (Function3) ((KFunction) objRememberedValue), onDone, modifier3, composer3, StringResource.$stable | SetTradingHourVisualizerArgs.$stable | (i72 & 112) | (i72 & 896) | (57344 & i4) | (458752 & i4), 0);
                    modifier4 = modifier3;
                    Object[] objArr2 = {locationType, instrumentType, instrumentId, accountNumber};
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composer3.startReplaceGroup(-1224400529);
                    if ((i82 & 112) != 32) {
                        zChangedInstance2 = composer3.changedInstance(tradingSessionDuxo2) | ((i82 & 14) != 4 ? true : z22) | (((i82 & 112) != 32 || ((i82 & 64) != 0 && composer3.changedInstance(instrumentType))) ? true : z22) | composer3.changedInstance(instrumentId) | ((i82 & 7168) != 2048 ? true : z22);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance2) {
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TradingSessionBottomSheet5.TradingSessionBottomSheet$lambda$4$lambda$3(tradingSessionDuxo2, locationType, instrumentType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(function12);
                            objRememberedValue2 = function12;
                            composer3.endReplaceGroup();
                            composer4 = composer3;
                            LifecycleEffectKt.LifecycleResumeEffect(objArr2, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue2, composer4, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        final Modifier modifier52 = modifier4;
        final TradingSessionDuxo tradingSessionDuxo42 = tradingSessionDuxo2;
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult TradingSessionBottomSheet$lambda$4$lambda$3(TradingSessionDuxo tradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = tradingSessionDuxo.bind(tradeSettingsStore4, tradeSettingsStore3, uuid, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$TradingSessionBottomSheet$lambda$4$lambda$3$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    public static final void TradingSessionComposable(final TradingSessionViewState viewState, final TradeSettingsStore4 locationType, final TradeSettingsStore3 instrumentType, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> onTradingSessionChanged, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(onTradingSessionChanged, "onTradingSessionChanged");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(1564989714);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(locationType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(instrumentType) : composerStartRestartGroup.changedInstance(instrumentType) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTradingSessionChanged) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1564989714, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionComposable (TradingSessionBottomSheet.kt:75)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1657198567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt.TradingSessionComposable.1
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
                        ComposerKt.traceEventStart(1657198567, i5, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionComposable.<anonymous> (TradingSessionBottomSheet.kt:77)");
                    }
                    SelectionLayoutKt.SelectionLayout(true, viewState.getShowDoneButton(), TradingSessionBottomSheet.INSTANCE.m13695getLambda$1547827426$lib_trade_settings_externalDebug(), onDone, ComposableLambda3.rememberComposableLambda(2110585248, true, new AnonymousClass1(viewState, onTradingSessionChanged, locationType, instrumentType), composer2, 54), modifier3, null, composer2, 24966, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TradingSessionBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$TradingSessionComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ TradeSettingsStore3 $instrumentType;
                    final /* synthetic */ TradeSettingsStore4 $locationType;
                    final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> $onTradingSessionChanged;
                    final /* synthetic */ TradingSessionViewState $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(TradingSessionViewState tradingSessionViewState, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3) {
                        this.$viewState = tradingSessionViewState;
                        this.$onTradingSessionChanged = function3;
                        this.$locationType = tradeSettingsStore4;
                        this.$instrumentType = tradeSettingsStore3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, SelectionRowState selectionRowState) {
                        function3.invoke(tradeSettingsStore4, tradeSettingsStore3, selectionRowState.getOption());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2110585248, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionComposable.<anonymous>.<anonymous> (TradingSessionBottomSheet.kt:92)");
                        }
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composer, 6, 1);
                        ImmutableList<String> leftBoundaryText = this.$viewState.getTradingSessionVisualizer().getLeftBoundaryText();
                        ImmutableList<String> rightBoundaryText = this.$viewState.getTradingSessionVisualizer().getRightBoundaryText();
                        SetTradingHoursComposableKt.SetTradingHoursComposable(this.$viewState.getTradingSessionVisualizer().getLeftEdgeText(), this.$viewState.getTradingSessionVisualizer().getRightEdgeText(), leftBoundaryText, rightBoundaryText, this.$viewState.getTradingSessionVisualizer().getGetGradientColor().invoke(composer, 0), this.$viewState.getTradingSessionVisualizer().getNumPegs(), this.$viewState.getTradingSessionVisualizer().getLeftEdgeInstant(), this.$viewState.getTradingSessionVisualizer().getRightEdgeInstant(), this.$viewState.getTradingSessionVisualizer().getSelectedMarketHoursOpenClose(), modifierM21622defaultHorizontalPaddingWMci_g0, composer, 0, 0);
                        composer.startReplaceGroup(1047892630);
                        ImmutableList<SelectionRowState<OrderMarketHours>> selectionOptions = this.$viewState.getSelectionOptions();
                        TradingSessionViewState tradingSessionViewState = this.$viewState;
                        final Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> function3 = this.$onTradingSessionChanged;
                        final TradeSettingsStore4 tradeSettingsStore4 = this.$locationType;
                        final TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
                        for (final SelectionRowState<OrderMarketHours> selectionRowState : selectionOptions) {
                            boolean z = tradingSessionViewState.getOrderTradingSession() == selectionRowState.getOption();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(function3) | composer.changed(tradeSettingsStore4.ordinal()) | composer.changedInstance(tradeSettingsStore3) | composer.changedInstance(selectionRowState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$TradingSessionComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TradingSessionBottomSheet5.C150831.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function3, tradeSettingsStore4, tradeSettingsStore3, selectionRowState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            TradingSessionRow2.TradingSessionRow(selectionRowState, z, (Function0) objRememberedValue, composer, StringResource.$stable);
                        }
                        composer.endReplaceGroup();
                        if (this.$viewState.getShowDisclosure()) {
                            AnimatedContentKt.AnimatedContent(this.$viewState.getOrderTradingSession(), null, null, null, null, null, TradingSessionBottomSheet.INSTANCE.getLambda$276695385$lib_trade_settings_externalDebug(), composer, 1572864, 62);
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
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionBottomSheet5.TradingSessionComposable$lambda$6(viewState, locationType, instrumentType, onTradingSessionChanged, onDone, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final TradingSessionViewState TradingSessionBottomSheet$lambda$0(SnapshotState4<TradingSessionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void TradingSessionBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(169806456);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(169806456, i, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetPreview (TradingSessionBottomSheet.kt:146)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradingSessionBottomSheet.INSTANCE.getLambda$1804804032$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionBottomSheet5.TradingSessionBottomSheetPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
