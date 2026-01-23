package com.robinhood.android.equityscreener.crud.save;

import com.robinhood.equityscreener.models.SaveScreenerResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SaveScreenerBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetDuxo$saveScreener$3$2", m3645f = "SaveScreenerBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetDuxo$saveScreener$3$2, reason: use source file name */
/* loaded from: classes3.dex */
final class SaveScreenerBottomSheetDuxo4 extends ContinuationImpl7 implements Function2<SaveScreenerBottomSheetDataState, Continuation<? super SaveScreenerBottomSheetDataState>, Object> {
    final /* synthetic */ SaveScreenerResult $saveResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveScreenerBottomSheetDuxo4(SaveScreenerResult saveScreenerResult, Continuation<? super SaveScreenerBottomSheetDuxo4> continuation) {
        super(2, continuation);
        this.$saveResult = saveScreenerResult;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SaveScreenerBottomSheetDuxo4 saveScreenerBottomSheetDuxo4 = new SaveScreenerBottomSheetDuxo4(this.$saveResult, continuation);
        saveScreenerBottomSheetDuxo4.L$0 = obj;
        return saveScreenerBottomSheetDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SaveScreenerBottomSheetDataState saveScreenerBottomSheetDataState, Continuation<? super SaveScreenerBottomSheetDataState> continuation) {
        return ((SaveScreenerBottomSheetDuxo4) create(saveScreenerBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SaveScreenerBottomSheetDataState.copy$default((SaveScreenerBottomSheetDataState) this.L$0, null, null, false, (SaveScreenerResult.Error) this.$saveResult, null, null, null, 115, null);
    }
}
