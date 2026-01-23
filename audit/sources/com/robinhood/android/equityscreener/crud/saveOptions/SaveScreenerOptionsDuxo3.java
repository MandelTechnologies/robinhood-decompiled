package com.robinhood.android.equityscreener.crud.saveOptions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SaveScreenerOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$onSave$3$1", m3645f = "SaveScreenerOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsDuxo$onSave$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SaveScreenerOptionsDuxo3 extends ContinuationImpl7 implements Function2<SaveScreenerOptionsDataState, Continuation<? super SaveScreenerOptionsDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    SaveScreenerOptionsDuxo3(Continuation<? super SaveScreenerOptionsDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SaveScreenerOptionsDuxo3 saveScreenerOptionsDuxo3 = new SaveScreenerOptionsDuxo3(continuation);
        saveScreenerOptionsDuxo3.L$0 = obj;
        return saveScreenerOptionsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SaveScreenerOptionsDataState saveScreenerOptionsDataState, Continuation<? super SaveScreenerOptionsDataState> continuation) {
        return ((SaveScreenerOptionsDuxo3) create(saveScreenerOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SaveScreenerOptionsDataState.copy$default((SaveScreenerOptionsDataState) this.L$0, false, false, 2, null);
    }
}
