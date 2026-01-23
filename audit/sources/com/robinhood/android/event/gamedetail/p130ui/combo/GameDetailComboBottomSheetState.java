package com.robinhood.android.event.gamedetail.p130ui.combo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailComboBottomSheetState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"availableMultiModeSheetStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "headerHeight", "", "rememberComboSheetState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "onValueChangeSettled", "Lkotlin/Function1;", "", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboBottomSheetState {
    public static final ImmutableList<MultiModeSheetState2> availableMultiModeSheetStates(int i) {
        return extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE, new MultiModeSheetState2.FixedHeight(i), MultiModeSheetState2.Expanded.INSTANCE);
    }

    public static final MultiModeSheetState rememberComboSheetState(int i, Function1<? super MultiModeSheetState2, Unit> onValueChangeSettled, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
        composer.startReplaceGroup(-345152074);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-345152074, i2, -1, "com.robinhood.android.event.gamedetail.ui.combo.rememberComboSheetState (GameDetailComboBottomSheetState.kt:23)");
        }
        MultiModeSheetState multiModeSheetStateRememberMultiModeStandardBottomSheetState = MultiModeBottomSheetScaffoldKt.rememberMultiModeStandardBottomSheetState(MultiModeSheetState2.Hidden.INSTANCE, (Function1<? super MultiModeSheetState2, Boolean>) null, onValueChangeSettled, availableMultiModeSheetStates(i), composer, MultiModeSheetState2.Hidden.$stable | ((i2 << 3) & 896) | (MultiModeSheetState2.$stable << 9), 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetStateRememberMultiModeStandardBottomSheetState;
    }
}
