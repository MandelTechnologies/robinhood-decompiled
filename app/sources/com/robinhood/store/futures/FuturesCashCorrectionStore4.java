package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesCashCorrectionDao;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection2;
import com.robinhood.ceres.p284v1.FuturesManualCashCorrectionDto;
import com.robinhood.ceres.p284v1.ListManualCashCorrectionsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesCashCorrectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "responseDto", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesCashCorrectionStore$getCashCorrectionsEndpoint$2", m3645f = "FuturesCashCorrectionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$getCashCorrectionsEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesCashCorrectionStore4 extends ContinuationImpl7 implements Function2<ListManualCashCorrectionsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesCashCorrectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesCashCorrectionStore4(FuturesCashCorrectionStore futuresCashCorrectionStore, Continuation<? super FuturesCashCorrectionStore4> continuation) {
        super(2, continuation);
        this.this$0 = futuresCashCorrectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesCashCorrectionStore4 futuresCashCorrectionStore4 = new FuturesCashCorrectionStore4(this.this$0, continuation);
        futuresCashCorrectionStore4.L$0 = obj;
        return futuresCashCorrectionStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListManualCashCorrectionsResponseDto listManualCashCorrectionsResponseDto, Continuation<? super Unit> continuation) {
        return ((FuturesCashCorrectionStore4) create(listManualCashCorrectionsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ListManualCashCorrectionsResponseDto listManualCashCorrectionsResponseDto = (ListManualCashCorrectionsResponseDto) this.L$0;
            FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
            List<FuturesManualCashCorrectionDto> results = listManualCashCorrectionsResponseDto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesCashCorrection2.toDbModel((FuturesManualCashCorrectionDto) it.next()));
            }
            futuresCashCorrectionDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
