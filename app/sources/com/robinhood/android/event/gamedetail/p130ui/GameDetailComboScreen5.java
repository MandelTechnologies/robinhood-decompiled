package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$GameDetailComboScreen$1$1", m3645f = "GameDetailComboScreen.kt", m3646l = {101}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$GameDetailComboScreen$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class GameDetailComboScreen5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiModeSheetState $sheetState;
    final /* synthetic */ GdpV2ComboUiCallbacks $subScreenCallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameDetailComboScreen5(MultiModeSheetState multiModeSheetState, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, Continuation<? super GameDetailComboScreen5> continuation) {
        super(2, continuation);
        this.$sheetState = multiModeSheetState;
        this.$subScreenCallback = gdpV2ComboUiCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GameDetailComboScreen5(this.$sheetState, this.$subScreenCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GameDetailComboScreen5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GameDetailComboScreen5 gameDetailComboScreen5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MultiModeSheetState multiModeSheetState = this.$sheetState;
            MultiModeSheetState2.Hidden hidden = MultiModeSheetState2.Hidden.INSTANCE;
            this.label = 1;
            gameDetailComboScreen5 = this;
            if (MultiModeSheetState.animateTo$default(multiModeSheetState, hidden, 0.0f, gameDetailComboScreen5, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            gameDetailComboScreen5 = this;
        }
        gameDetailComboScreen5.$subScreenCallback.resetEmptyState();
        return Unit.INSTANCE;
    }
}
