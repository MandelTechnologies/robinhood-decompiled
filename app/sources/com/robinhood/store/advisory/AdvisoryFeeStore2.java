package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryFeeDto;
import advisory.proto.p008v1.GetAdvisoryFeesListRequestDto;
import advisory.proto.p008v1.GetAdvisoryFeesListResponseDto;
import advisory.proto.p008v1.RestAdvisoryService;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.advisory.p304db.fee.AdvisoryFee;
import com.robinhood.models.advisory.p304db.fee.AdvisoryFee3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryFeeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;", "<destruct>", "Lkotlin/Pair;", "Ladvisory/proto/v1/GetAdvisoryFeesListRequestDto;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryFeeStore$advisoryFeesEndpoint$1", m3645f = "AdvisoryFeeStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.advisory.AdvisoryFeeStore$advisoryFeesEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryFeeStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetAdvisoryFeesListRequestDto, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends AdvisoryFee>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryFeeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryFeeStore2(AdvisoryFeeStore advisoryFeeStore, Continuation<? super AdvisoryFeeStore2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryFeeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryFeeStore2 advisoryFeeStore2 = new AdvisoryFeeStore2(this.this$0, continuation);
        advisoryFeeStore2.L$0 = obj;
        return advisoryFeeStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetAdvisoryFeesListRequestDto, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends AdvisoryFee>> continuation) {
        return invoke2((Tuples2<GetAdvisoryFeesListRequestDto, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<AdvisoryFee>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GetAdvisoryFeesListRequestDto, PaginationCursor> tuples2, Continuation<? super PaginatedResult<AdvisoryFee>> continuation) {
        return ((AdvisoryFeeStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetAdvisoryFeesListRequestDto getAdvisoryFeesListRequestDto = (GetAdvisoryFeesListRequestDto) ((Tuples2) this.L$0).component1();
            RestAdvisoryService restAdvisoryService = this.this$0.advisoryService;
            this.label = 1;
            obj = restAdvisoryService.GetAdvisoryFeesList(getAdvisoryFeesListRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        GetAdvisoryFeesListResponseDto getAdvisoryFeesListResponseDto = (GetAdvisoryFeesListResponseDto) obj;
        List<AdvisoryFeeDto> results = getAdvisoryFeesListResponseDto.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(AdvisoryFee3.toDbModel((AdvisoryFeeDto) it.next()));
        }
        String next = getAdvisoryFeesListResponseDto.getNext();
        return new PaginatedResult(arrayList, null, next != null ? new PaginationCursor(next) : null, 2, null);
    }
}
