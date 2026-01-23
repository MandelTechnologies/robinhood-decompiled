package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailBottomSheetStateHolder.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\b\u001a=\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u000fH\u0002\u001a\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"rememberBottomSheetStateHolder", "Lcom/robinhood/android/event/gamedetail/ui/BottomSheetStateHolder;", "bottomSheetContentState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "onTradeSheetHidden", "Lkotlin/Function0;", "", "onPositionDetailSheetHidden", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/event/gamedetail/ui/BottomSheetStateHolder;", "calculateTargetSheetHeight", "", "bottomSheetState", "sheetHeights", "Lcom/robinhood/android/event/gamedetail/ui/SheetHeights;", "onAnimationStateChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "shouldAnimate", "rememberBottomSheetState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "animatedSheetHeight", "density", "Landroidx/compose/ui/unit/Density;", "(ILandroidx/compose/ui/unit/Density;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailBottomSheetStateHolderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailBottomSheetStateHolder4 {
    public static final GameDetailBottomSheetStateHolder rememberBottomSheetStateHolder(GameDetailBottomSheetState gameDetailBottomSheetState, Function0<Unit> onTradeSheetHidden, Function0<Unit> onPositionDetailSheetHidden, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onTradeSheetHidden, "onTradeSheetHidden");
        Intrinsics.checkNotNullParameter(onPositionDetailSheetHidden, "onPositionDetailSheetHidden");
        composer.startReplaceGroup(-1397227508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1397227508, i, -1, "com.robinhood.android.event.gamedetail.ui.rememberBottomSheetStateHolder (GameDetailBottomSheetStateHolder.kt:30)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GameDetailBottomSheetStateHolder(density);
            composer.updateRememberedValue(objRememberedValue);
        }
        GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder = (GameDetailBottomSheetStateHolder) objRememberedValue;
        composer.endReplaceGroup();
        gameDetailBottomSheetStateHolder.UpdateContentState(gameDetailBottomSheetState, onTradeSheetHidden, onPositionDetailSheetHidden, composer, i & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gameDetailBottomSheetStateHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateTargetSheetHeight(GameDetailBottomSheetState gameDetailBottomSheetState, SheetHeights sheetHeights, Function1<? super Boolean, Unit> function1) {
        int dragHandleHeight;
        int positionDetailBottomSheetHeight;
        if (gameDetailBottomSheetState instanceof GameDetailBottomSheetState.Trade) {
            function1.invoke(Boolean.TRUE);
            dragHandleHeight = sheetHeights.getDragHandleHeight();
            positionDetailBottomSheetHeight = sheetHeights.getTradeSlipExpandedHeight();
        } else {
            if (!(gameDetailBottomSheetState instanceof GameDetailBottomSheetState.PositionDetail)) {
                if (gameDetailBottomSheetState == null) {
                    return 0;
                }
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(Boolean.TRUE);
            dragHandleHeight = sheetHeights.getDragHandleHeight();
            positionDetailBottomSheetHeight = sheetHeights.getPositionDetailBottomSheetHeight();
        }
        return dragHandleHeight + positionDetailBottomSheetHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiModeSheetState rememberBottomSheetState(int i, Density density, Composer composer, int i2) {
        ImmutableList3 immutableList3PersistentListOf;
        composer.startReplaceGroup(1068678498);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068678498, i2, -1, "com.robinhood.android.event.gamedetail.ui.rememberBottomSheetState (GameDetailBottomSheetStateHolder.kt:154)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i2 & 112) ^ 48) > 32 && composer.changed(density)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (i > 0) {
                immutableList3PersistentListOf = extensions2.persistentListOf(new MultiModeSheetState2.FixedHeight(i), MultiModeSheetState2.Hidden.INSTANCE);
            } else {
                immutableList3PersistentListOf = extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE);
            }
            ImmutableList3 immutableList3 = immutableList3PersistentListOf;
            objRememberedValue = new MultiModeSheetState(density, (MultiModeSheetState2) CollectionsKt.first((List) immutableList3), immutableList3, (Function1) null, (Function1) null, 24, (DefaultConstructorMarker) null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MultiModeSheetState multiModeSheetState = (MultiModeSheetState) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetState;
    }
}
