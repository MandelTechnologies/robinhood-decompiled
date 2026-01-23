package com.robinhood.android.matcha.p177ui.memo;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MemoInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.memo.MemoInputDuxo$validateMemo$2$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$validateMemo$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MemoInputDuxo2 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
    final /* synthetic */ boolean $containsBannedWord;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemoInputDuxo2(boolean z, Continuation<? super MemoInputDuxo2> continuation) {
        super(2, continuation);
        this.$containsBannedWord = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemoInputDuxo2 memoInputDuxo2 = new MemoInputDuxo2(this.$containsBannedWord, continuation);
        memoInputDuxo2.L$0 = obj;
        return memoInputDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
        return ((MemoInputDuxo2) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MemoInputDataState memoInputDataState = (MemoInputDataState) this.L$0;
        if (this.$containsBannedWord) {
            return MemoInputDataState.copy$default(memoInputDataState, null, null, false, true, null, 19, null);
        }
        return MemoInputDataState.copy$default(memoInputDataState, null, null, false, false, new UiEvent(Unit.INSTANCE), 11, null);
    }
}
