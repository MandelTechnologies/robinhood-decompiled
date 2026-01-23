package com.robinhood.android.optionschain.sbschain;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimation;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.rosetta.eventlogging.Screen;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aó\u0001\u0010\u001c\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162&\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u0018j\u0002`\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d*B\u0010\u001e\"\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u00182\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u0018¨\u0006.²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\u0014\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\nX\u008a\u0084\u0002²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010*\u001a\u0004\u0018\u00010)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Ljava/util/UUID;", "equityInstrumentId", "", "inSbsChainPerfExperiment", "Lkotlin/Function0;", "", "onBackClick", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "openChainSettings", "Lcom/robinhood/models/ui/OptionLegBundle;", "onContractPcoButtonTapped", "onChainSettingsTapped", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "duxo", "onEnableTradeOnExpiration", "Landroid/content/Intent;", "onLaunchOrderForm", "showDiscoverZeroDteBottomSheetIfNotYet", "j$/time/Instant", "showSelloutWarningSnackbar", "dismissSelloutSnackbarPermanently", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function3;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "Lcom/robinhood/android/optionschain/sbschain/OnChainTableButtonTapped;", "onWatchlistButtonTapped", "OptionSideBySideChainComposable", "(Ljava/util/UUID;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "OnChainTableButtonTapped", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "viewState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "event", "", "currentPageIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "Lcom/robinhood/android/optionschain/sbschain/TableHighlightPhase;", "animationPhase", "isTableReady", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainComposable$lambda$2(UUID uuid, boolean z, Function0 function0, Function1 function1, Function1 function12, Function0 function02, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Function0 function03, Function1 function13, Function0 function04, Function1 function14, Function0 function05, Modifier modifier, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        OptionSideBySideChainComposable(uuid, z, function0, function1, function12, function02, optionSideBySideChainDuxo, function03, function13, function04, function14, function05, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OptionSideBySideChainComposable$lambda$41$lambda$36$lambda$35(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OptionSideBySideChainComposable$lambda$41$lambda$38$lambda$37(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainComposable$lambda$42(UUID uuid, boolean z, Function0 function0, Function1 function1, Function1 function12, Function0 function02, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Function0 function03, Function1 function13, Function0 function04, Function1 function14, Function0 function05, Modifier modifier, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        OptionSideBySideChainComposable(uuid, z, function0, function1, function12, function02, optionSideBySideChainDuxo, function03, function13, function04, function14, function05, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OptionSideBySideChainComposable(final UUID uuid, final boolean z, final Function0<Unit> onBackClick, final Function1<? super FragmentKey, Unit> openChainSettings, final Function1<? super OptionLegBundle, Unit> onContractPcoButtonTapped, final Function0<Unit> onChainSettingsTapped, OptionSideBySideChainDuxo optionSideBySideChainDuxo, final Function0<Unit> onEnableTradeOnExpiration, final Function1<? super Intent, Unit> onLaunchOrderForm, final Function0<Unit> showDiscoverZeroDteBottomSheetIfNotYet, final Function1<? super Instant, Unit> showSelloutWarningSnackbar, final Function0<Unit> dismissSelloutSnackbarPermanently, Modifier modifier, final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> onWatchlistButtonTapped, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        int i14;
        int i15;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Modifier modifier3;
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo2;
        int i16;
        EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke;
        EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke2;
        EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke3;
        final OptionSideBySideChainDuxo duxo = optionSideBySideChainDuxo;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(openChainSettings, "openChainSettings");
        Intrinsics.checkNotNullParameter(onContractPcoButtonTapped, "onContractPcoButtonTapped");
        Intrinsics.checkNotNullParameter(onChainSettingsTapped, "onChainSettingsTapped");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onEnableTradeOnExpiration, "onEnableTradeOnExpiration");
        Intrinsics.checkNotNullParameter(onLaunchOrderForm, "onLaunchOrderForm");
        Intrinsics.checkNotNullParameter(showDiscoverZeroDteBottomSheetIfNotYet, "showDiscoverZeroDteBottomSheetIfNotYet");
        Intrinsics.checkNotNullParameter(showSelloutWarningSnackbar, "showSelloutWarningSnackbar");
        Intrinsics.checkNotNullParameter(dismissSelloutSnackbarPermanently, "dismissSelloutSnackbarPermanently");
        Intrinsics.checkNotNullParameter(onWatchlistButtonTapped, "onWatchlistButtonTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1806396752);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i17 = i4;
        if ((i3 & 4) != 0) {
            i5 = i17 | 384;
        } else if ((i & 384) == 0) {
            i5 = i17 | (composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128);
        } else {
            i5 = i17;
        }
        if ((i3 & 8) != 0) {
            i6 = i5 | 3072;
        } else {
            int i18 = i5;
            if ((i & 3072) == 0) {
                i6 = i18 | (composerStartRestartGroup.changedInstance(openChainSettings) ? 2048 : 1024);
            } else {
                i6 = i18;
            }
        }
        if ((i3 & 16) != 0) {
            i7 = i6 | 24576;
        } else {
            int i19 = i6;
            if ((i & 24576) == 0) {
                i7 = i19 | (composerStartRestartGroup.changedInstance(onContractPcoButtonTapped) ? 16384 : 8192);
            } else {
                i7 = i19;
            }
        }
        if ((i3 & 32) != 0) {
            i7 |= 196608;
        } else if ((i & 196608) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onChainSettingsTapped) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i7 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(duxo) ? 1048576 : 524288;
        }
        int i20 = i7;
        if ((i3 & 128) != 0) {
            i8 = i20 | 12582912;
        } else if ((i & 12582912) == 0) {
            i8 = i20 | (composerStartRestartGroup.changedInstance(onEnableTradeOnExpiration) ? 8388608 : 4194304);
        } else {
            i8 = i20;
        }
        int i21 = i8;
        if ((i3 & 256) != 0) {
            i9 = i21 | 100663296;
        } else if ((i & 100663296) == 0) {
            i9 = i21 | (composerStartRestartGroup.changedInstance(onLaunchOrderForm) ? 67108864 : 33554432);
        } else {
            i9 = i21;
        }
        int i22 = i9;
        if ((i3 & 512) != 0) {
            i10 = i22 | 805306368;
        } else if ((i & 805306368) == 0) {
            i10 = i22 | (composerStartRestartGroup.changedInstance(showDiscoverZeroDteBottomSheetIfNotYet) ? 536870912 : 268435456);
        } else {
            i10 = i22;
        }
        if ((i3 & 1024) != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i11 = i2 | (composerStartRestartGroup.changedInstance(showSelloutWarningSnackbar) ? 4 : 2);
        } else {
            i11 = i2;
        }
        int i23 = i11;
        if ((i3 & 2048) != 0) {
            i12 = i23 | 48;
        } else if ((i2 & 48) == 0) {
            i12 = i23 | (composerStartRestartGroup.changedInstance(dismissSelloutSnackbarPermanently) ? 32 : 16);
        } else {
            i12 = i23;
        }
        int i24 = i3 & 4096;
        if (i24 != 0) {
            i13 = i12 | 384;
        } else {
            int i25 = i12;
            if ((i2 & 384) == 0) {
                i25 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i13 = i25;
        }
        if ((i3 & 8192) != 0) {
            i13 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onWatchlistButtonTapped) ? 2048 : 1024;
        }
        if ((306783379 & i10) == 306783378 && (i13 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
        } else {
            Modifier modifier4 = i24 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                modifier2 = modifier4;
                ComposerKt.traceEventStart(1806396752, i10, i13, "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposable (OptionSideBySideChainComposable.kt:75)");
            } else {
                modifier2 = modifier4;
            }
            Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates = OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAdjustedExpirationDateStates();
            if (adjustedExpirationDateStates == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$2(uuid, z, onBackClick, openChainSettings, onContractPcoButtonTapped, onChainSettingsTapped, duxo, onEnableTradeOnExpiration, onLaunchOrderForm, showDiscoverZeroDteBottomSheetIfNotYet, showSelloutWarningSnackbar, dismissSelloutSnackbarPermanently, modifier5, onWatchlistButtonTapped, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifier6 = modifier2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i14 = 2;
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i14 = 2;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(), null, i14, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, i14, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            final Event<OptionSideBySideChainEvent> eventOptionSideBySideChainComposable$lambda$1 = OptionSideBySideChainComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventOptionSideBySideChainComposable$lambda$1 != null) {
                if ((eventOptionSideBySideChainComposable$lambda$1.getData() instanceof OptionSideBySideChainEvent.ScrollToExpirationPage) && (eventConsumerInvoke3 = eventOptionSideBySideChainComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventOptionSideBySideChainComposable$lambda$1, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17211invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17211invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OptionSideBySideChainEvent.ScrollToExpirationPage scrollToExpirationPage = (OptionSideBySideChainEvent.ScrollToExpirationPage) eventOptionSideBySideChainComposable$lambda$1.getData();
                            ImmutableList immutableList = adjustedExpirationDateStates;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                            Iterator<E> it2 = immutableList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((OptionChainExpirationDateState) it2.next()).getKey());
                            }
                            Integer numValueOf = Integer.valueOf(arrayList.indexOf(scrollToExpirationPage.getExpirationDatePage().getKey()));
                            if (numValueOf.intValue() == -1) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                snapshotState.setValue(Integer.valueOf(numValueOf.intValue()));
                            }
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            final Event<OptionSideBySideChainEvent> eventOptionSideBySideChainComposable$lambda$12 = OptionSideBySideChainComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventOptionSideBySideChainComposable$lambda$12 != null) {
                if ((eventOptionSideBySideChainComposable$lambda$12.getData() instanceof OptionSideBySideChainEvent.ScrollToLegs) && (eventConsumerInvoke2 = eventOptionSideBySideChainComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventOptionSideBySideChainComposable$lambda$12, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17212invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17212invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OptionSideBySideChainEvent.ScrollToLegs scrollToLegs = (OptionSideBySideChainEvent.ScrollToLegs) eventOptionSideBySideChainComposable$lambda$12.getData();
                            ImmutableList immutableList = adjustedExpirationDateStates;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                            Iterator<E> it2 = immutableList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((OptionChainExpirationDateState) it2.next()).getKey());
                            }
                            Integer numValueOf = Integer.valueOf(arrayList.indexOf(scrollToLegs.getExpirationDatePage().getKey()));
                            if (numValueOf.intValue() == -1) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                snapshotState.setValue(Integer.valueOf(numValueOf.intValue()));
                            }
                            snapshotState2.setValue(scrollToLegs.getTargetLegs());
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            final Event<OptionSideBySideChainEvent> eventOptionSideBySideChainComposable$lambda$13 = OptionSideBySideChainComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventOptionSideBySideChainComposable$lambda$13 != null) {
                if ((eventOptionSideBySideChainComposable$lambda$13.getData() instanceof OptionSideBySideChainEvent.ScrollToStrike) && (eventConsumerInvoke = eventOptionSideBySideChainComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventOptionSideBySideChainComposable$lambda$13, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17213invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17213invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OptionSideBySideChainEvent.ScrollToStrike scrollToStrike = (OptionSideBySideChainEvent.ScrollToStrike) eventOptionSideBySideChainComposable$lambda$13.getData();
                            ImmutableList immutableList = adjustedExpirationDateStates;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                            Iterator<E> it2 = immutableList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((OptionChainExpirationDateState) it2.next()).getKey());
                            }
                            Integer numValueOf = Integer.valueOf(arrayList.indexOf(scrollToStrike.getExpirationDatePage().getKey()));
                            if (numValueOf.intValue() == -1) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                snapshotState.setValue(Integer.valueOf(numValueOf.intValue()));
                            }
                            snapshotState3.setValue(scrollToStrike.getTargetStrikePrice());
                        }
                    });
                }
                Unit unit3 = Unit.INSTANCE;
            }
            Integer numOptionSideBySideChainComposable$lambda$4 = OptionSideBySideChainComposable$lambda$4(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new C24334xbf88072a(duxo, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numOptionSideBySideChainComposable$lambda$4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Unit unit4 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new C24335xbf880aeb(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier6, unit4, (PointerInputEventHandler) objRememberedValue5);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1066225201);
            OptionSideBySideChainDataState4 nuxMode = OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNuxMode();
            if (nuxMode == null) {
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    i15 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(TableHighlightPhase.NORMAL_SBS, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i15 = 2;
                    snapshotMutationPolicy = null;
                }
                SnapshotState snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i15, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                String accountNumber = OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber();
                OptionDefaultPricingState defaultPricingState = OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDefaultPricingState();
                OptionOrderIntentKey.FromOptionOrderBundle orderIntentKey = OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getOrderIntentKey();
                Screen.Name name = Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN;
                boolean z2 = !OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMultilegAvailable();
                float bottomSheetOverlappingHeightDp = OptionSideBySideChainConstants.getBottomSheetOverlappingHeightDp();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new C24336xfdbf1839(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier6;
                composerStartRestartGroup = composerStartRestartGroup;
                OptionChainBottomSheetScaffoldKt.m17158OptionChainBottomSheetScaffoldTCVpFMg(accountNumber, defaultPricingState, orderIntentKey, onLaunchOrderForm, name, z2, null, null, bottomSheetOverlappingHeightDp, ComposableLambda3.rememberComposableLambda(-1625872682, true, new C24337xbf880ead(onBackClick, openChainSettings, onChainSettingsTapped, duxo, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), onWatchlistButtonTapped, (Function1) ((KFunction) objRememberedValue8), ComposableLambda3.rememberComposableLambda(914635337, true, new C24342xbf880eae(nuxMode, adjustedExpirationDateStates, onContractPcoButtonTapped, dismissSelloutSnackbarPermanently, optionSideBySideChainDuxo, snapshotState4CollectAsStateWithLifecycle, onLaunchOrderForm, navigator, context, view, uuid, onWatchlistButtonTapped, z, onEnableTradeOnExpiration, showDiscoverZeroDteBottomSheetIfNotYet, showSelloutWarningSnackbar, snapshotState, snapshotState4CollectAsStateWithLifecycle2, snapshotState2, snapshotState3, snapshotState4, snapshotState5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 >> 15) & 7168) | 905994240, ((i13 >> 9) & 14) | 384, 192);
                composerStartRestartGroup.startReplaceGroup(865972452);
                if (!nuxMode.getInNuxMode() || OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasSeenLottieNuxAnimation()) {
                    optionSideBySideChainDuxo2 = optionSideBySideChainDuxo;
                    i16 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    optionSideBySideChainDuxo2 = optionSideBySideChainDuxo;
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(optionSideBySideChainDuxo2);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$34$lambda$33(optionSideBySideChainDuxo2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i16 = 0;
                    OptionSideBySideChainNuxAnimation.OptionSideBySideChainNuxAnimation((Function0) objRememberedValue9, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = (OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEduFooterAnimationState() == OptionSideBySideChainDataState5.PLAYING || OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEduFooterAnimationState() == OptionSideBySideChainDataState5.FINISHED_PLAYING) ? 1 : i16;
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, i16, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$36$lambda$35(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue10);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, i16, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$38$lambda$37(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(z3, boxScopeInstance.align(Modifier.INSTANCE, companion2.getBottomCenter()), enterTransitionSlideInVertically, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue11), (String) null, ComposableSingletons$OptionSideBySideChainComposableKt.INSTANCE.m17208getLambda$2086950222$feature_options_chain_externalDebug(), composerStartRestartGroup, 200064, 16);
                Object[] objArr = {Boolean.valueOf(OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isEduFooterAnimationDismissed()), OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEduFooterAnimationState(), Boolean.valueOf(OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInSbsNuxRevampExperiment()), Boolean.valueOf(OptionSideBySideChainComposable$lambda$41$lambda$30(snapshotState5)), nuxMode, Boolean.valueOf(OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasSeenLottieNuxAnimation()), OptionSideBySideChainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLaunchMode()};
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                SnapshotState4 snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                boolean zChanged = composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changed(nuxMode.ordinal()) | composerStartRestartGroup.changedInstance(optionSideBySideChainDuxo2);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue12 == companion.getEmpty()) {
                    C24352xfdbf2ebf c24352xfdbf2ebf = new C24352xfdbf2ebf(nuxMode, optionSideBySideChainDuxo2, snapshotState42, snapshotState5, null);
                    duxo = optionSideBySideChainDuxo2;
                    snapshotState42 = snapshotState42;
                    composerStartRestartGroup.updateRememberedValue(c24352xfdbf2ebf);
                    objRememberedValue12 = c24352xfdbf2ebf;
                } else {
                    duxo = optionSideBySideChainDuxo2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, i16);
                OptionSideBySideChainDataState5 eduFooterAnimationState = OptionSideBySideChainComposable$lambda$0(snapshotState42).getEduFooterAnimationState();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChanged2 = composerStartRestartGroup.changed(snapshotState42) | composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new C24353xfdbf3280(duxo, snapshotState42, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(eduFooterAnimationState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, i16);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Modifier modifier7 = modifier3;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$42(uuid, z, onBackClick, openChainSettings, onContractPcoButtonTapped, onChainSettingsTapped, duxo, onEnableTradeOnExpiration, onLaunchOrderForm, showDiscoverZeroDteBottomSheetIfNotYet, showSelloutWarningSnackbar, dismissSelloutSnackbarPermanently, modifier7, onWatchlistButtonTapped, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionSideBySideChainViewState OptionSideBySideChainComposable$lambda$0(SnapshotState4<OptionSideBySideChainViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<OptionSideBySideChainEvent> OptionSideBySideChainComposable$lambda$1(SnapshotState4<Event<OptionSideBySideChainEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal OptionSideBySideChainComposable$lambda$10(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer OptionSideBySideChainComposable$lambda$4(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TableHighlightPhase OptionSideBySideChainComposable$lambda$41$lambda$27(SnapshotState<TableHighlightPhase> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionSideBySideChainComposable$lambda$41$lambda$30(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<UiOptionStrategyLegDisplay> OptionSideBySideChainComposable$lambda$7(SnapshotState<ImmutableList<UiOptionStrategyLegDisplay>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainComposable$lambda$41$lambda$31(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainComposable$lambda$41$lambda$34$lambda$33(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        optionSideBySideChainDuxo.setLottieNuxAnimationSeen();
        return Unit.INSTANCE;
    }
}
