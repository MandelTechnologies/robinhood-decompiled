package com.robinhood.android.equities.tradesettings.equity.tif;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceViewState;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionLayoutKt;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
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

/* compiled from: EquityTimeInForceBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aU\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0017\u001a=\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0014H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"TIME_IN_FORCE_V2_LOADING_STATE", "", "EquityTimeInForceBottomSheet", "", "accountNumber", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentId", "Ljava/util/UUID;", "onDone", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceDuxo;", "(Ljava/lang/String;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceDuxo;Landroidx/compose/runtime/Composer;II)V", "EquityTimeInForceComposable", "viewState", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState;", "onTimeInForceChanged", "Lkotlin/Function3;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "Lcom/robinhood/models/db/OrderTimeInForce;", "(Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loaded;", "(Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loaded;Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "EquityTimeInForceBottomSheetLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "EquityTimeInForceBottomSheetLoadedPreview", "EquityTimeInForceBottomSheetLoadedShortingEnabledPreview", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTimeInForceBottomSheet7 {
    public static final String TIME_IN_FORCE_V2_LOADING_STATE = "TimeInForceV2LoadingState";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTimeInForceBottomSheet$lambda$5(String str, TradeSettingsStore4 tradeSettingsStore4, UUID uuid, Function0 function0, Modifier modifier, EquityTimeInForceDuxo equityTimeInForceDuxo, int i, int i2, Composer composer, int i3) {
        EquityTimeInForceBottomSheet(str, tradeSettingsStore4, uuid, function0, modifier, equityTimeInForceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTimeInForceBottomSheetLoadedPreview$lambda$19(int i, Composer composer, int i2) {
        EquityTimeInForceBottomSheetLoadedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EquityTimeInForceBottomSheetLoadedShortingEnabledPreview$lambda$20 */
    public static final Unit m1955x497b8da9(int i, Composer composer, int i2) {
        EquityTimeInForceBottomSheetLoadedShortingEnabledPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTimeInForceBottomSheetLoadingPreview$lambda$18(int i, Composer composer, int i2) {
        EquityTimeInForceBottomSheetLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTimeInForceComposable$lambda$6(EquityTimeInForceViewState equityTimeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, Function3 function3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityTimeInForceComposable(equityTimeInForceViewState, tradeSettingsStore4, function3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$17(EquityTimeInForceViewState.Loaded loaded, TradeSettingsStore4 tradeSettingsStore4, Function3 function3, int i, Composer composer, int i2) {
        LoadedContent(loaded, tradeSettingsStore4, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
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
    public static final void EquityTimeInForceBottomSheet(final String accountNumber, final TradeSettingsStore4 locationType, final UUID instrumentId, final Function0<Unit> onDone, Modifier modifier, EquityTimeInForceDuxo equityTimeInForceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EquityTimeInForceDuxo equityTimeInForceDuxo2;
        Modifier modifier3;
        Composer composer2;
        boolean z;
        int i4;
        EquityTimeInForceDuxo equityTimeInForceDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i5;
        Composer composer3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(644824866);
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
            i3 |= composerStartRestartGroup.changed(locationType.ordinal()) ? 32 : 16;
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
                    equityTimeInForceDuxo2 = equityTimeInForceDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(equityTimeInForceDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    equityTimeInForceDuxo2 = equityTimeInForceDuxo;
                }
                i3 |= i7;
            } else {
                equityTimeInForceDuxo2 = equityTimeInForceDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        String str = "EquityTimeInForceDuxo_" + locationType + "_" + instrumentId;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EquityTimeInForceDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$EquityTimeInForceBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$EquityTimeInForceBottomSheet$$inlined$duxo$1.1
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
                        EquityTimeInForceDuxo equityTimeInForceDuxo4 = (EquityTimeInForceDuxo) baseDuxo;
                        i4 = i3 & (-458753);
                        equityTimeInForceDuxo3 = equityTimeInForceDuxo4;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(644824866, i4, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheet (EquityTimeInForceBottomSheet.kt:48)");
                        }
                        int i8 = i4;
                        EquityTimeInForceViewState equityTimeInForceViewStateEquityTimeInForceBottomSheet$lambda$0 = EquityTimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(equityTimeInForceDuxo3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new EquityTimeInForceBottomSheet8(equityTimeInForceDuxo3);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        i5 = i8 & 112;
                        equityTimeInForceDuxo2 = equityTimeInForceDuxo3;
                        Modifier modifier5 = modifier3;
                        boolean z2 = z;
                        composer3 = composer2;
                        EquityTimeInForceComposable(equityTimeInForceViewStateEquityTimeInForceBottomSheet$lambda$0, locationType, (Function3) ((KFunction) objRememberedValue), onDone, modifier5, composer3, i8 & 64624, 0);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance4 = composer3.changedInstance(equityTimeInForceDuxo2) | ((i8 & 14) != 4 ? true : z2);
                        if (i5 == 32) {
                            z2 = true;
                        }
                        zChangedInstance2 = zChangedInstance4 | z2 | composer3.changedInstance(instrumentId);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheet$lambda$4$lambda$3(equityTimeInForceDuxo2, accountNumber, locationType, instrumentId, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentId, lifecycleOwner, (Function1) objRememberedValue2, composer3, (i8 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
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
                equityTimeInForceDuxo3 = equityTimeInForceDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i4;
                EquityTimeInForceViewState equityTimeInForceViewStateEquityTimeInForceBottomSheet$lambda$02 = EquityTimeInForceBottomSheet$lambda$0(FlowExtKt.collectAsStateWithLifecycle(equityTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(equityTimeInForceDuxo3);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new EquityTimeInForceBottomSheet8(equityTimeInForceDuxo3);
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    i5 = i82 & 112;
                    equityTimeInForceDuxo2 = equityTimeInForceDuxo3;
                    Modifier modifier52 = modifier3;
                    boolean z22 = z;
                    composer3 = composer2;
                    EquityTimeInForceComposable(equityTimeInForceViewStateEquityTimeInForceBottomSheet$lambda$02, locationType, (Function3) ((KFunction) objRememberedValue), onDone, modifier52, composer3, i82 & 64624, 0);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance42 = composer3.changedInstance(equityTimeInForceDuxo2) | ((i82 & 14) != 4 ? true : z22);
                    if (i5 == 32) {
                    }
                    zChangedInstance2 = zChangedInstance42 | z22 | composer3.changedInstance(instrumentId);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheet$lambda$4$lambda$3(equityTimeInForceDuxo2, accountNumber, locationType, instrumentId, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(locationType, instrumentId, lifecycleOwner2, (Function1) objRememberedValue2, composer3, (i82 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
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
            final EquityTimeInForceDuxo equityTimeInForceDuxo5 = equityTimeInForceDuxo2;
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheet$lambda$5(accountNumber, locationType, instrumentId, onDone, modifier4, equityTimeInForceDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i6 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
        }
        final EquityTimeInForceDuxo equityTimeInForceDuxo52 = equityTimeInForceDuxo2;
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult EquityTimeInForceBottomSheet$lambda$4$lambda$3(EquityTimeInForceDuxo equityTimeInForceDuxo, String str, TradeSettingsStore4 tradeSettingsStore4, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = equityTimeInForceDuxo.bind(str, tradeSettingsStore4, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$EquityTimeInForceBottomSheet$lambda$4$lambda$3$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityTimeInForceComposable(final EquityTimeInForceViewState equityTimeInForceViewState, final TradeSettingsStore4 tradeSettingsStore4, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-568615028);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(equityTimeInForceViewState) : composerStartRestartGroup.changedInstance(equityTimeInForceViewState) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-568615028, i3, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceComposable (EquityTimeInForceBottomSheet.kt:72)");
            }
            final Modifier modifier4 = modifier3;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2144746785, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt.EquityTimeInForceComposable.1
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
                        ComposerKt.traceEventStart(2144746785, i5, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceComposable.<anonymous> (EquityTimeInForceBottomSheet.kt:74)");
                    }
                    SelectionLayoutKt.SelectionLayout(true, true, EquityTimeInForceBottomSheet2.INSTANCE.getLambda$1606318744$lib_trade_settings_externalDebug(), function0, ComposableLambda3.rememberComposableLambda(-237316966, true, new AnonymousClass1(equityTimeInForceViewState, tradeSettingsStore4, function3), composer2, 54), modifier4, null, composer2, 25014, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: EquityTimeInForceBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$EquityTimeInForceComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ TradeSettingsStore4 $locationType;
                    final /* synthetic */ Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> $onTimeInForceChanged;
                    final /* synthetic */ EquityTimeInForceViewState $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(EquityTimeInForceViewState equityTimeInForceViewState, TradeSettingsStore4 tradeSettingsStore4, Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3) {
                        this.$viewState = equityTimeInForceViewState;
                        this.$locationType = tradeSettingsStore4;
                        this.$onTimeInForceChanged = function3;
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
                            ComposerKt.traceEventStart(-237316966, i, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceComposable.<anonymous>.<anonymous> (EquityTimeInForceBottomSheet.kt:87)");
                        }
                        EquityTimeInForceViewState equityTimeInForceViewState = this.$viewState;
                        if (equityTimeInForceViewState instanceof EquityTimeInForceViewState.Loading) {
                            composer.startReplaceGroup(-393426907);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Shape shape = null;
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), EquityTimeInForceBottomSheet7.TIME_IN_FORCE_V2_LOADING_STATE);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
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
                            composer.startReplaceGroup(801597127);
                            int i3 = 0;
                            for (int i4 = 2; i3 < i4; i4 = i4) {
                                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, shape, i4, shape);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$EquityTimeInForceComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, type2, "", false, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 200112, 6, 976);
                                i3++;
                                shape = shape;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endReplaceGroup();
                        } else {
                            if (!(equityTimeInForceViewState instanceof EquityTimeInForceViewState.Loaded)) {
                                composer.startReplaceGroup(-428335604);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-392370334);
                            EquityTimeInForceBottomSheet7.LoadedContent((EquityTimeInForceViewState.Loaded) equityTimeInForceViewState, this.$locationType, this.$onTimeInForceChanged, composer, StringResource.$stable);
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
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTimeInForceBottomSheet7.EquityTimeInForceComposable$lambda$6(equityTimeInForceViewState, tradeSettingsStore4, function3, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final EquityTimeInForceViewState EquityTimeInForceBottomSheet$lambda$0(SnapshotState4<? extends EquityTimeInForceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(final EquityTimeInForceViewState.Loaded loaded, final TradeSettingsStore4 tradeSettingsStore4, final Function3<? super TradeSettingsStore4, ? super TradeSettingsStore3, ? super OrderTimeInForce, Unit> function3, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1241064277);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(tradeSettingsStore4.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241064277, i2, -1, "com.robinhood.android.equities.tradesettings.equity.tif.LoadedContent (EquityTimeInForceBottomSheet.kt:127)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            if (loaded.getShortingEnabled()) {
                composerStartRestartGroup.startReplaceGroup(1467751617);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i3 = i2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14990R.string.long_orders_setting_title, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-752379420);
                for (final SelectionRowState<OrderTimeInForce> selectionRowState : loaded.getLongSelectionOptions()) {
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    StringResource primaryText = selectionRowState.getPrimaryText();
                    Intrinsics.checkNotNull(resources);
                    String string2 = primaryText.getText(resources).toString();
                    String string3 = selectionRowState.getSecondaryText().getText(resources).toString();
                    boolean z = loaded.getLongOrderTimeInForce() == selectionRowState.getOption();
                    composer3.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = ((i3 & 896) == 256) | ((i3 & 112) == 32) | composer3.changedInstance(selectionRowState);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTimeInForceBottomSheet7.LoadedContent$lambda$13$lambda$9$lambda$8$lambda$7(function3, tradeSettingsStore4, selectionRowState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Composer composer4 = composer3;
                    BentoSelectionRow2.BentoSelectionRow(null, type2, string2, z, string3, false, null, false, false, false, (Function0) objRememberedValue, composer4, 48, 0, 993);
                    composer3 = composer4;
                }
                composer3.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM()), composer3, 0);
                Composer composer5 = composer3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14990R.string.short_orders_setting_title, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer3, 6, 1), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextM(), composer5, 24576, 0, 8172);
                Composer composer6 = composer5;
                composer6.startReplaceGroup(-752344250);
                for (final SelectionRowState<OrderTimeInForce> selectionRowState2 : loaded.getShortSelectionOptions()) {
                    BentoSelectionRowState.Type type3 = BentoSelectionRowState.Type.RadioButton;
                    StringResource primaryText2 = selectionRowState2.getPrimaryText();
                    Intrinsics.checkNotNull(resources);
                    String string4 = primaryText2.getText(resources).toString();
                    String string5 = selectionRowState2.getSecondaryText().getText(resources).toString();
                    boolean z2 = loaded.getShortOrderTimeInForce() == selectionRowState2.getOption();
                    composer6.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = ((i3 & 896) == 256) | ((i3 & 112) == 32) | composer6.changedInstance(selectionRowState2);
                    Object objRememberedValue2 = composer6.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTimeInForceBottomSheet7.LoadedContent$lambda$13$lambda$12$lambda$11$lambda$10(function3, tradeSettingsStore4, selectionRowState2);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue2);
                    }
                    composer6.endReplaceGroup();
                    Composer composer7 = composer6;
                    BentoSelectionRow2.BentoSelectionRow(null, type3, string4, z2, string5, false, null, false, false, false, (Function0) objRememberedValue2, composer7, 48, 0, 993);
                    composer6 = composer7;
                }
                composer6.endReplaceGroup();
                composer6.endNode();
                composer6.endReplaceGroup();
                composer2 = composer6;
            } else {
                int i5 = i2;
                composerStartRestartGroup.startReplaceGroup(1469850968);
                for (final SelectionRowState<OrderTimeInForce> selectionRowState3 : loaded.getLongSelectionOptions()) {
                    BentoSelectionRowState.Type type4 = BentoSelectionRowState.Type.RadioButton;
                    StringResource primaryText3 = selectionRowState3.getPrimaryText();
                    Intrinsics.checkNotNull(resources);
                    String string6 = primaryText3.getText(resources).toString();
                    String string7 = selectionRowState3.getSecondaryText().getText(resources).toString();
                    boolean z3 = loaded.getLongOrderTimeInForce() == selectionRowState3.getOption();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = ((i5 & 896) == 256) | ((i5 & 112) == 32) | composerStartRestartGroup.changedInstance(selectionRowState3);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTimeInForceBottomSheet7.LoadedContent$lambda$16$lambda$15$lambda$14(function3, tradeSettingsStore4, selectionRowState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer8 = composerStartRestartGroup;
                    BentoSelectionRow2.BentoSelectionRow(null, type4, string6, z3, string7, false, null, false, false, false, (Function0) objRememberedValue3, composer8, 48, 0, 993);
                    composerStartRestartGroup = composer8;
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTimeInForceBottomSheet7.LoadedContent$lambda$17(loaded, tradeSettingsStore4, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
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

    private static final void EquityTimeInForceBottomSheetLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-993342688);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-993342688, i, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetLoadingPreview (EquityTimeInForceBottomSheet.kt:196)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityTimeInForceBottomSheet2.INSTANCE.getLambda$1640125144$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheetLoadingPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EquityTimeInForceBottomSheetLoadedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(782912069);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782912069, i, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetLoadedPreview (EquityTimeInForceBottomSheet.kt:209)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityTimeInForceBottomSheet2.INSTANCE.getLambda$1699146637$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheetLoadedPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EquityTimeInForceBottomSheetLoadedShortingEnabledPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1924285286);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1924285286, i, -1, "com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetLoadedShortingEnabledPreview (EquityTimeInForceBottomSheet.kt:250)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityTimeInForceBottomSheet2.INSTANCE.m13671getLambda$121544110$lib_trade_settings_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTimeInForceBottomSheet7.m1955x497b8da9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
