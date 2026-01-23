package com.robinhood.android.crypto.costbasis.details.entry;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$1$1$1", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {116}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$1$1$1 */
/* loaded from: classes2.dex */
final class C12811xd32a9f50 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoCostBasisEntryDuxo $duxo;
    final /* synthetic */ InputRow $focusedRow;
    final /* synthetic */ KeyEvent $keyEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C12811xd32a9f50(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, InputRow inputRow, KeyEvent keyEvent, Continuation<? super C12811xd32a9f50> continuation) {
        super(2, continuation);
        this.$duxo = cryptoCostBasisEntryDuxo;
        this.$focusedRow = inputRow;
        this.$keyEvent = keyEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C12811xd32a9f50(this.$duxo, this.$focusedRow, this.$keyEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C12811xd32a9f50) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.$duxo;
            InputRow inputRow = this.$focusedRow;
            KeyEvent keyEvent = this.$keyEvent;
            this.label = 1;
            if (cryptoCostBasisEntryDuxo.consumeKeyEvent(inputRow, keyEvent, this) == coroutine_suspended) {
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
