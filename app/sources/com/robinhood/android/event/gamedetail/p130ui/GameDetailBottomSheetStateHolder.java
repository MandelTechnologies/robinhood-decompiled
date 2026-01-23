package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailBottomSheetStateHolder.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000fJ3\u00102\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001042\f\u00105\u001a\b\u0012\u0004\u0012\u000200062\f\u00107\u001a\b\u0012\u0004\u0012\u00020006H\u0007¢\u0006\u0002\u00108R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR+\u0010#\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\"8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010)\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0012R\u0011\u0010+\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010-\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b.\u0010%¨\u00069²\u0006\n\u0010:\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020006X\u008a\u0084\u0002²\u0006\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020006X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/BottomSheetStateHolder;", "", "density", "Landroidx/compose/ui/unit/Density;", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "<set-?>", "", "doNotAnimateBottomSheet", "getDoNotAnimateBottomSheet", "()Z", "setDoNotAnimateBottomSheet", "(Z)V", "doNotAnimateBottomSheet$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/event/gamedetail/ui/SheetHeights;", "sheetHeightsState", "getSheetHeightsState", "()Lcom/robinhood/android/event/gamedetail/ui/SheetHeights;", "setSheetHeightsState", "(Lcom/robinhood/android/event/gamedetail/ui/SheetHeights;)V", "sheetHeightsState$delegate", "", "bottomSheetWrapperHeightState", "getBottomSheetWrapperHeightState", "()I", "setBottomSheetWrapperHeightState", "(I)V", "bottomSheetWrapperHeightState$delegate", "Landroidx/compose/runtime/MutableIntState;", "targetSheetHeight", "getTargetSheetHeight", "setTargetSheetHeight", "targetSheetHeight$delegate", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "bottomSheetStateValue", "getBottomSheetStateValue", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "setBottomSheetStateValue", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;)V", "bottomSheetStateValue$delegate", "sheetHeights", "getSheetHeights", "bottomSheetWrapperHeight", "getBottomSheetWrapperHeight", "bottomSheetState", "getBottomSheetState", "updateSheetHeights", "", "newHeights", "UpdateContentState", "bottomSheetContentState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "onTradeSheetHidden", "Lkotlin/Function0;", "onPositionDetailSheetHidden", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-game-detail_externalDebug", "animatedSheetHeight", "latestOnTradeSheetHidden", "latestOnPositionDetailSheetHidden"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailBottomSheetStateHolder {
    public static final int $stable = 0;

    /* renamed from: bottomSheetStateValue$delegate, reason: from kotlin metadata */
    private final SnapshotState bottomSheetStateValue;

    /* renamed from: bottomSheetWrapperHeightState$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 bottomSheetWrapperHeightState;
    private final Density density;

    /* renamed from: doNotAnimateBottomSheet$delegate, reason: from kotlin metadata */
    private final SnapshotState doNotAnimateBottomSheet;

    /* renamed from: sheetHeightsState$delegate, reason: from kotlin metadata */
    private final SnapshotState sheetHeightsState;

    /* renamed from: targetSheetHeight$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 targetSheetHeight;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateContentState$lambda$7(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, GameDetailBottomSheetState gameDetailBottomSheetState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        gameDetailBottomSheetStateHolder.UpdateContentState(gameDetailBottomSheetState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public GameDetailBottomSheetStateHolder(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.density = density;
        this.doNotAnimateBottomSheet = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.sheetHeightsState = SnapshotState3.mutableStateOf$default(new SheetHeights(0, 0, 0, 7, null), null, 2, null);
        this.bottomSheetWrapperHeightState = SnapshotIntState3.mutableIntStateOf(0);
        this.targetSheetHeight = SnapshotIntState3.mutableIntStateOf(0);
        MultiModeSheetState2.Hidden hidden = MultiModeSheetState2.Hidden.INSTANCE;
        this.bottomSheetStateValue = SnapshotState3.mutableStateOf$default(new MultiModeSheetState(density, hidden, extensions2.persistentListOf(hidden), (Function1) null, (Function1) null, 24, (DefaultConstructorMarker) null), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getDoNotAnimateBottomSheet() {
        return ((Boolean) this.doNotAnimateBottomSheet.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDoNotAnimateBottomSheet(boolean z) {
        this.doNotAnimateBottomSheet.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SheetHeights getSheetHeightsState() {
        return (SheetHeights) this.sheetHeightsState.getValue();
    }

    private final void setSheetHeightsState(SheetHeights sheetHeights) {
        this.sheetHeightsState.setValue(sheetHeights);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBottomSheetWrapperHeightState() {
        return this.bottomSheetWrapperHeightState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomSheetWrapperHeightState(int i) {
        this.bottomSheetWrapperHeightState.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTargetSheetHeight() {
        return this.targetSheetHeight.getIntValue();
    }

    private final void setTargetSheetHeight(int i) {
        this.targetSheetHeight.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final MultiModeSheetState getBottomSheetStateValue() {
        return (MultiModeSheetState) this.bottomSheetStateValue.getValue();
    }

    private final void setBottomSheetStateValue(MultiModeSheetState multiModeSheetState) {
        this.bottomSheetStateValue.setValue(multiModeSheetState);
    }

    public final SheetHeights getSheetHeights() {
        return getSheetHeightsState();
    }

    public final int getBottomSheetWrapperHeight() {
        return getBottomSheetWrapperHeightState();
    }

    public final MultiModeSheetState getBottomSheetState() {
        return getBottomSheetStateValue();
    }

    public final void updateSheetHeights(SheetHeights newHeights) {
        Intrinsics.checkNotNullParameter(newHeights, "newHeights");
        setSheetHeightsState(newHeights);
    }

    public final void UpdateContentState(final GameDetailBottomSheetState gameDetailBottomSheetState, final Function0<Unit> onTradeSheetHidden, final Function0<Unit> onPositionDetailSheetHidden, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onTradeSheetHidden, "onTradeSheetHidden");
        Intrinsics.checkNotNullParameter(onPositionDetailSheetHidden, "onPositionDetailSheetHidden");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1312090575);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailBottomSheetState) : composerStartRestartGroup.changedInstance(gameDetailBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTradeSheetHidden) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositionDetailSheetHidden) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1312090575, i2, -1, "com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder.UpdateContentState (GameDetailBottomSheetStateHolder.kt:79)");
            }
            SheetHeights sheetHeightsState = getSheetHeightsState();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailBottomSheetStateHolder.UpdateContentState$lambda$1$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            setTargetSheetHeight(GameDetailBottomSheetStateHolder4.calculateTargetSheetHeight(gameDetailBottomSheetState, sheetHeightsState, (Function1) objRememberedValue));
            SnapshotState4<Integer> snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState(getTargetSheetHeight(), AnimationSpecKt.tween$default(getDoNotAnimateBottomSheet() ? 0 : 300, 0, null, 6, null), "sheetHeight", null, composerStartRestartGroup, 384, 8);
            Integer numValueOf = Integer.valueOf(getTargetSheetHeight());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i3 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GameDetailBottomSheetStateHolder2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            setBottomSheetStateValue(GameDetailBottomSheetStateHolder4.rememberBottomSheetState(UpdateContentState$lambda$2(snapshotState4AnimateIntAsState), this.density, composerStartRestartGroup, 0));
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTradeSheetHidden, composerStartRestartGroup, (i2 >> 3) & 14);
            SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onPositionDetailSheetHidden, composerStartRestartGroup, (i2 >> 6) & 14);
            MultiModeSheetState2 currentValue = getBottomSheetStateValue().getCurrentValue();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(gameDetailBottomSheetState))) | (i3 == 2048) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                GameDetailBottomSheetStateHolder3 gameDetailBottomSheetStateHolder3 = new GameDetailBottomSheetStateHolder3(gameDetailBottomSheetState, this, snapshotState4RememberUpdatedState, snapshotState4RememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(gameDetailBottomSheetStateHolder3);
                objRememberedValue3 = gameDetailBottomSheetStateHolder3;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(currentValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, MultiModeSheetState2.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailBottomSheetStateHolder.UpdateContentState$lambda$7(this.f$0, gameDetailBottomSheetState, onTradeSheetHidden, onPositionDetailSheetHidden, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateContentState$lambda$1$lambda$0(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, boolean z) {
        gameDetailBottomSheetStateHolder.setDoNotAnimateBottomSheet(!z);
        return Unit.INSTANCE;
    }

    private static final int UpdateContentState$lambda$2(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> UpdateContentState$lambda$4(SnapshotState4<? extends Function0<Unit>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> UpdateContentState$lambda$5(SnapshotState4<? extends Function0<Unit>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
