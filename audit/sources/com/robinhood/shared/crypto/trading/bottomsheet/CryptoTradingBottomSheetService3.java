package com.robinhood.shared.crypto.trading.bottomsheet;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: CryptoTradingBottomSheetService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$3$1", m3645f = "CryptoTradingBottomSheetService.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService$bottomSheetService$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTradingBottomSheetService3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogFragmentKey $it;
    int label;
    final /* synthetic */ CryptoTradingBottomSheetService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradingBottomSheetService3(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, DialogFragmentKey dialogFragmentKey, Continuation<? super CryptoTradingBottomSheetService3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTradingBottomSheetService;
        this.$it = dialogFragmentKey;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTradingBottomSheetService3(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoTradingBottomSheetService3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = this.this$0.dialogStateFlow;
            DialogFragmentKey dialogFragmentKey = this.$it;
            this.label = 1;
            if (sharedFlow2.emit(dialogFragmentKey, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
