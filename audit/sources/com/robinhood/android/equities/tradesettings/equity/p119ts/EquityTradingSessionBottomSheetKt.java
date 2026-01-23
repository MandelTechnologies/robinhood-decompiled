package com.robinhood.android.equities.tradesettings.equity.p119ts;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import com.robinhood.android.equities.tradesettings.p120ui.SelectionLayoutKt;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.EquityPositionType;
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
import kotlinx.coroutines.Job;

/* compiled from: EquityTradingSessionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aU\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001e²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"EquityTradingSessionBottomSheet", "", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;Landroidx/compose/runtime/Composer;II)V", "EquityTradingSessionComposable", "viewState", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;", "onTradingSessionChanged", "Lkotlin/Function3;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "Lcom/robinhood/models/db/OrderMarketHours;", "(Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "(Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "EquityTradingSessionBottomSheetNoDisclosurePreview", "(Landroidx/compose/runtime/Composer;I)V", "EquityTradingSessionBottomSheetPreview", "EquityTradingSessionBottomSheetShortingPreview", "EquityTradingSessionBottomSheetShortingNonAdtPreview", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradingSessionBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionBottomSheet$lambda$5(TradeSettingsStore4 tradeSettingsStore4, UUID uuid, String str, Function0 function0, Modifier modifier, EquityTradingSessionDuxo equityTradingSessionDuxo, int i, int i2, Composer composer, int i3) {
        EquityTradingSessionBottomSheet(tradeSettingsStore4, uuid, str, function0, modifier, equityTradingSessionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionBottomSheetNoDisclosurePreview$lambda$18(int i, Composer composer, int i2) {
        EquityTradingSessionBottomSheetNoDisclosurePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionBottomSheetPreview$lambda$19(int i, Composer composer, int i2) {
        EquityTradingSessionBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionBottomSheetShortingNonAdtPreview$lambda$21(int i, Composer composer, int i2) {
        EquityTradingSessionBottomSheetShortingNonAdtPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionBottomSheetShortingPreview$lambda$20(int i, Composer composer, int i2) {
        EquityTradingSessionBottomSheetShortingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingSessionComposable$lambda$6(EquityTradingSessionViewState equityTradingSessionViewState, TradeSettingsStore4 tradeSettingsStore4, Function3 function3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityTradingSessionComposable(equityTradingSessionViewState, tradeSettingsStore4, function3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$17(EquityTradingSessionViewState equityTradingSessionViewState, TradeSettingsStore4 tradeSettingsStore4, Function3 function3, int i, Composer composer, int i2) {
        LoadedContent(equityTradingSessionViewState, tradeSettingsStore4, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradingSessionBottomSheet(final TradeSettingsStore4 locationType, final UUID instrumentId, final String accountNumber, final Function0<Unit> onDone, Modifier modifier, EquityTradingSessionDuxo equityTradingSessionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EquityTradingSessionDuxo equityTradingSessionDuxo2;
        Modifier modifier3;
        Composer composer2;
        boolean z;
        int i4;
        EquityTradingSessionDuxo equityTradingSessionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(755886052);
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
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    equityTradingSessionDuxo2 = equityTradingSessionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(equityTradingSessionDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    equityTradingSessionDuxo2 = equityTradingSessionDuxo;
                }
                i3 |= i6;
            } else {
                equityTradingSessionDuxo2 = equityTradingSessionDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        String str = "EquityTradingSessionDuxo_" + locationType + "_" + instrumentId;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EquityTradingSessionDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$EquityTradingSessionBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$EquityTradingSessionBottomSheet$$inlined$duxo$1.1
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
                        EquityTradingSessionDuxo equityTradingSessionDuxo4 = (EquityTradingSessionDuxo) baseDuxo;
                        i4 = i3 & (-458753);
                        equityTradingSessionDuxo3 = equityTradingSessionDuxo4;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(755886052, i4, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheet (EquityTradingSessionBottomSheet.kt:53)");
                        }
                        int i7 = i4;
                        EquityTradingSessionViewState equityTradingSessionViewStateEquityTradingSessionBottomSheet$lambda$0 = EquityTradingSessionBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityTradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(equityTradingSessionDuxo3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new C15030xaa8419f3(equityTradingSessionDuxo3);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        equityTradingSessionDuxo2 = equityTradingSessionDuxo3;
                        Modifier modifier5 = modifier3;
                        composer3 = composer2;
                        boolean z2 = z;
                        EquityTradingSessionComposable(equityTradingSessionViewStateEquityTradingSessionBottomSheet$lambda$0, locationType, (Function3) ((KFunction) objRememberedValue), onDone, modifier5, composer3, StringResource.$stable | ((i7 << 3) & 112) | (i7 & 7168) | (57344 & i7), 0);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        composer3.startReplaceGroup(-1224400529);
                        zChangedInstance2 = composer3.changedInstance(equityTradingSessionDuxo2) | ((i7 & 14) != 4 ? true : z2) | composer3.changedInstance(instrumentId) | ((i7 & 896) != 256 ? true : z2);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheet$lambda$4$lambda$3(equityTradingSessionDuxo2, locationType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentId, accountNumber, lifecycleOwner, (Function1) objRememberedValue2, composer3, i7 & 1022, 0);
                        composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                z = false;
                i4 = i3;
                equityTradingSessionDuxo3 = equityTradingSessionDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i72 = i4;
                EquityTradingSessionViewState equityTradingSessionViewStateEquityTradingSessionBottomSheet$lambda$02 = EquityTradingSessionBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityTradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(equityTradingSessionDuxo3);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new C15030xaa8419f3(equityTradingSessionDuxo3);
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    equityTradingSessionDuxo2 = equityTradingSessionDuxo3;
                    Modifier modifier52 = modifier3;
                    composer3 = composer2;
                    boolean z22 = z;
                    EquityTradingSessionComposable(equityTradingSessionViewStateEquityTradingSessionBottomSheet$lambda$02, locationType, (Function3) ((KFunction) objRememberedValue), onDone, modifier52, composer3, StringResource.$stable | ((i72 << 3) & 112) | (i72 & 7168) | (57344 & i72), 0);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composer3.startReplaceGroup(-1224400529);
                    zChangedInstance2 = composer3.changedInstance(equityTradingSessionDuxo2) | ((i72 & 14) != 4 ? true : z22) | composer3.changedInstance(instrumentId) | ((i72 & 896) != 256 ? true : z22);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheet$lambda$4$lambda$3(equityTradingSessionDuxo2, locationType, instrumentId, accountNumber, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentId, accountNumber, lifecycleOwner2, (Function1) objRememberedValue2, composer3, i72 & 1022, 0);
                        composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            final EquityTradingSessionDuxo equityTradingSessionDuxo5 = equityTradingSessionDuxo2;
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheet$lambda$5(locationType, instrumentId, accountNumber, onDone, modifier4, equityTradingSessionDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
        }
        final EquityTradingSessionDuxo equityTradingSessionDuxo52 = equityTradingSessionDuxo2;
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult EquityTradingSessionBottomSheet$lambda$4$lambda$3(EquityTradingSessionDuxo equityTradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, UUID uuid, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = equityTradingSessionDuxo.bind(tradeSettingsStore4, uuid, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$EquityTradingSessionBottomSheet$lambda$4$lambda$3$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradingSessionComposable(final EquityTradingSessionViewState viewState, final TradeSettingsStore4 locationType, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> onTradingSessionChanged, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(onTradingSessionChanged, "onTradingSessionChanged");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(688932408);
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
            i3 |= composerStartRestartGroup.changedInstance(onTradingSessionChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(688932408, i3, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionComposable (EquityTradingSessionBottomSheet.kt:77)");
                }
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1263370547, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable.1
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
                            ComposerKt.traceEventStart(-1263370547, i5, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionComposable.<anonymous> (EquityTradingSessionBottomSheet.kt:79)");
                        }
                        boolean showDoneButton = viewState.getShowDoneButton();
                        Function2<Composer, Integer, Unit> lambda$1725781316$lib_trade_settings_externalDebug = ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.getLambda$1725781316$lib_trade_settings_externalDebug();
                        Function0<Unit> function0 = onDone;
                        final EquityTradingSessionViewState equityTradingSessionViewState = viewState;
                        final TradeSettingsStore4 tradeSettingsStore4 = locationType;
                        final Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> function3 = onTradingSessionChanged;
                        SelectionLayoutKt.SelectionLayout(true, showDoneButton, lambda$1725781316$lib_trade_settings_externalDebug, function0, ComposableLambda3.rememberComposableLambda(1418235206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable.1.1
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
                                    ComposerKt.traceEventStart(1418235206, i6, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionComposable.<anonymous>.<anonymous> (EquityTradingSessionBottomSheet.kt:94)");
                                }
                                EquityTradingSessionBottomSheetKt.LoadedContent(equityTradingSessionViewState, tradeSettingsStore4, function3, composer3, StringResource.$stable);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifier5, null, composer2, 24966, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable$lambda$6(viewState, locationType, onTradingSessionChanged, onDone, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1263370547, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable.1
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
                        ComposerKt.traceEventStart(-1263370547, i5, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionComposable.<anonymous> (EquityTradingSessionBottomSheet.kt:79)");
                    }
                    boolean showDoneButton = viewState.getShowDoneButton();
                    Function2<Composer, Integer, Unit> lambda$1725781316$lib_trade_settings_externalDebug = ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.getLambda$1725781316$lib_trade_settings_externalDebug();
                    Function0<Unit> function0 = onDone;
                    final EquityTradingSessionViewState equityTradingSessionViewState = viewState;
                    final TradeSettingsStore4 tradeSettingsStore4 = locationType;
                    final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderMarketHours, Unit> function3 = onTradingSessionChanged;
                    SelectionLayoutKt.SelectionLayout(true, showDoneButton, lambda$1725781316$lib_trade_settings_externalDebug, function0, ComposableLambda3.rememberComposableLambda(1418235206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable.1.1
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
                                ComposerKt.traceEventStart(1418235206, i6, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionComposable.<anonymous>.<anonymous> (EquityTradingSessionBottomSheet.kt:94)");
                            }
                            EquityTradingSessionBottomSheetKt.LoadedContent(equityTradingSessionViewState, tradeSettingsStore4, function3, composer3, StringResource.$stable);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), modifier52, null, composer2, 24966, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final EquityTradingSessionViewState EquityTradingSessionBottomSheet$lambda$0(SnapshotState4<EquityTradingSessionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(com.robinhood.android.equities.tradesettings.equity.p119ts.EquityTradingSessionViewState r32, com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4 r33, kotlin.jvm.functions.Function3<? super com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4, ? super com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3, ? super com.robinhood.models.p320db.OrderMarketHours, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equities.tradesettings.equity.p119ts.EquityTradingSessionBottomSheetKt.LoadedContent(com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionViewState, com.robinhood.android.equities.tradesettings.store.LocationType, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$13$lambda$9$lambda$8$lambda$7(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, SelectionRowState selectionRowState) {
        function3.invoke(tradeSettingsStore4, new TradeSettingsStore3.Equity(EquityPositionType.LONG), selectionRowState.getOption());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$13$lambda$12$lambda$11$lambda$10(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, SelectionRowState selectionRowState) {
        function3.invoke(tradeSettingsStore4, new TradeSettingsStore3.Equity(EquityPositionType.SHORT), selectionRowState.getOption());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$16$lambda$15$lambda$14(Function3 function3, TradeSettingsStore4 tradeSettingsStore4, SelectionRowState selectionRowState) {
        function3.invoke(tradeSettingsStore4, new TradeSettingsStore3.Equity(EquityPositionType.LONG), selectionRowState.getOption());
        return Unit.INSTANCE;
    }

    private static final void EquityTradingSessionBottomSheetNoDisclosurePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(118513382);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118513382, i, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetNoDisclosurePreview (EquityTradingSessionBottomSheet.kt:191)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoSpannedText.getLocalSpannedTextProvider().provides(DummySpannedTextProvider.INSTANCE), ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.getLambda$1822671782$lib_trade_settings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheetNoDisclosurePreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EquityTradingSessionBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1063635512);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063635512, i, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetPreview (EquityTradingSessionBottomSheet.kt:232)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoSpannedText.getLocalSpannedTextProvider().provides(DummySpannedTextProvider.INSTANCE), ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.m13679getLambda$2124787976$lib_trade_settings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheetPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EquityTradingSessionBottomSheetShortingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2043740222);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043740222, i, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetShortingPreview (EquityTradingSessionBottomSheet.kt:273)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoSpannedText.getLocalSpannedTextProvider().provides(DummySpannedTextProvider.INSTANCE), ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.getLambda$72664318$lib_trade_settings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheetShortingPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EquityTradingSessionBottomSheetShortingNonAdtPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1186469250);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1186469250, i, -1, "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetShortingNonAdtPreview (EquityTradingSessionBottomSheet.kt:325)");
            }
            CompositionLocal3.CompositionLocalProvider(BentoSpannedText.getLocalSpannedTextProvider().provides(DummySpannedTextProvider.INSTANCE), ComposableSingletons$EquityTradingSessionBottomSheetKt.INSTANCE.m13677getLambda$1794815422$lib_trade_settings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheetShortingNonAdtPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
