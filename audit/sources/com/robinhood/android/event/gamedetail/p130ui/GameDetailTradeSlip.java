package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheet;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionDetailBottomSheet4;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionDetailBottomSheetState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailTradeSlip.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00052\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m3636d2 = {"GameDetailTradeSlip", "", "bottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "onGloballyPositioned", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "tradeSlipHeight", "positionDetailHeight", "onWheelPickerItemSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "onYesNoToggle", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "onDeleteClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-game-detail_externalDebug", "cachedBottomSheetState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailTradeSlipKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailTradeSlip {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlip$lambda$8(GameDetailBottomSheetState gameDetailBottomSheetState, Function2 function2, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        GameDetailTradeSlip(gameDetailBottomSheetState, function2, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GameDetailTradeSlip(final GameDetailBottomSheetState gameDetailBottomSheetState, final Function2<? super Integer, ? super Integer, Unit> onGloballyPositioned, final Function1<? super ContractElement, Unit> onWheelPickerItemSelected, final Function1<? super ContractIdWithSide, Unit> onYesNoToggle, final Function0<Unit> onDeleteClick, Composer composer, final int i) {
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        Intrinsics.checkNotNullParameter(onWheelPickerItemSelected, "onWheelPickerItemSelected");
        Intrinsics.checkNotNullParameter(onYesNoToggle, "onYesNoToggle");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-939526141);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailBottomSheetState) : composerStartRestartGroup.changedInstance(gameDetailBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGloballyPositioned) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWheelPickerItemSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onYesNoToggle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDeleteClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939526141, i2, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailTradeSlip (GameDetailTradeSlip.kt:24)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(gameDetailBottomSheetState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new GameDetailTradeSlip2(gameDetailBottomSheetState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(gameDetailBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            GameDetailBottomSheetState gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1 = GameDetailTradeSlip$lambda$1(snapshotState);
            if (gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1 instanceof GameDetailBottomSheetState.Trade) {
                composerStartRestartGroup.startReplaceGroup(879364537);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i2 & 112) == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailTradeSlipKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailTradeSlip.GameDetailTradeSlip$lambda$5$lambda$4(onGloballyPositioned, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i4 = i2 >> 3;
                GameDetailTradeBottomSheet.GameDetailTradeBottomSheet(((GameDetailBottomSheetState.Trade) gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1).getState(), onWheelPickerItemSelected, onYesNoToggle, OnGloballyPositionedModifier3.onGloballyPositioned(modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function1) objRememberedValue3), onDeleteClick, composerStartRestartGroup, (i2 & 57344) | StringResource.$stable | (i4 & 112) | (i4 & 896), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1 instanceof GameDetailBottomSheetState.PositionDetail) {
                composerStartRestartGroup.startReplaceGroup(879928396);
                PositionDetailBottomSheetState state = ((GameDetailBottomSheetState.PositionDetail) gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1).getState();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i2 & 112) == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailTradeSlipKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailTradeSlip.GameDetailTradeSlip$lambda$7$lambda$6(onGloballyPositioned, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                PositionDetailBottomSheet4.PositionDetailBottomSheet(state, OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue4), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (gameDetailBottomSheetStateGameDetailTradeSlip$lambda$1 != null) {
                    composerStartRestartGroup.startReplaceGroup(-941467189);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(880210589);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailTradeSlipKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeSlip.GameDetailTradeSlip$lambda$8(gameDetailBottomSheetState, onGloballyPositioned, onWheelPickerItemSelected, onYesNoToggle, onDeleteClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlip$lambda$5$lambda$4(Function2 function2, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        function2.invoke(Integer.valueOf((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L)), 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlip$lambda$7$lambda$6(Function2 function2, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        function2.invoke(0, Integer.valueOf((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L)));
        return Unit.INSTANCE;
    }

    private static final GameDetailBottomSheetState GameDetailTradeSlip$lambda$1(SnapshotState<GameDetailBottomSheetState> snapshotState) {
        return snapshotState.getValue();
    }
}
