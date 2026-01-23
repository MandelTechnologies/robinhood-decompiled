package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountTab$4$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ HapticFeedback $haptics;
    final /* synthetic */ Function0<Unit> $onTabLongPressed;
    final /* synthetic */ Function0<Unit> $onTabSelected;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<Boolean> $triggerBounceAnimationClick$delegate;

    AccountSelectorTabsRowKt$AccountTab$4$1$1$1(CoroutineScope coroutineScope, HapticFeedback hapticFeedback, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Function0<Unit> function02) {
        this.$scope = coroutineScope;
        this.$haptics = hapticFeedback;
        this.$onTabLongPressed = function0;
        this.$triggerBounceAnimationClick$delegate = snapshotState;
        this.$onTabSelected = function02;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final CoroutineScope coroutineScope = this.$scope;
        final HapticFeedback hapticFeedback = this.$haptics;
        final Function0<Unit> function0 = this.$onTabLongPressed;
        final SnapshotState<Boolean> snapshotState = this.$triggerBounceAnimationClick$delegate;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectorTabsRowKt$AccountTab$4$1$1$1.invoke$lambda$0(coroutineScope, hapticFeedback, function0, snapshotState, (Offset) obj);
            }
        };
        final HapticFeedback hapticFeedback2 = this.$haptics;
        final Function0<Unit> function02 = this.$onTabSelected;
        final SnapshotState<Boolean> snapshotState2 = this.$triggerBounceAnimationClick$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, function1, null, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectorTabsRowKt$AccountTab$4$1$1$1.invoke$lambda$1(hapticFeedback2, function02, snapshotState2, (Offset) obj);
            }
        }, continuation, 5, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState, Offset offset) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        AccountSelectorTabsRowKt.AccountTab$lambda$21(snapshotState, true);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(CoroutineScope coroutineScope, HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState, Offset offset) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1(hapticFeedback, function0, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }
}
