package com.robinhood.android.optionschain.sbschain;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$5$1 */
/* loaded from: classes11.dex */
final class C24335xbf880aeb implements PointerInputEventHandler {
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;

    C24335xbf880aeb(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        this.$duxo = optionSideBySideChainDuxo;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo = this.$duxo;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$5$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24335xbf880aeb.invoke$lambda$0(optionSideBySideChainDuxo);
            }
        };
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo2 = this.$duxo;
        Object objDetectPointerDownAndUp = OptionChainCustomGestureDetector.detectPointerDownAndUp(pointerInputScope, function0, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$5$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C24335xbf880aeb.invoke$lambda$1(optionSideBySideChainDuxo2);
            }
        }, continuation);
        return objDetectPointerDownAndUp == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectPointerDownAndUp : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        optionSideBySideChainDuxo.dismissSpreadTooltipIfSeen();
        optionSideBySideChainDuxo.resetUserIdleTimer(OptionSideBySideChainDataState3.USER_INTERACTION_IN_PROGRESS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        optionSideBySideChainDuxo.resetUserIdleTimer(OptionSideBySideChainDataState3.USER_INTERACTION_ENDED);
        return Unit.INSTANCE;
    }
}
