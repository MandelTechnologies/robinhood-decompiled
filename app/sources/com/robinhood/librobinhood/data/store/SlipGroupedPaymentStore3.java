package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.slip.p039v1.GetSlipPaymentsResponseDto;
import bonfire.proto.idl.slip.p039v1.SlipGroupedPaymentDto;
import com.robinhood.models.dao.SlipGroupedPaymentDao;
import com.robinhood.models.p320db.SlipGroupedPayment4;
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

/* compiled from: SlipGroupedPaymentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/slip/v1/GetSlipPaymentsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$getSlipPayments$2", m3645f = "SlipGroupedPaymentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$getSlipPayments$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipGroupedPaymentStore3 extends ContinuationImpl7 implements Function2<GetSlipPaymentsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipGroupedPaymentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipGroupedPaymentStore3(SlipGroupedPaymentStore slipGroupedPaymentStore, Continuation<? super SlipGroupedPaymentStore3> continuation) {
        super(2, continuation);
        this.this$0 = slipGroupedPaymentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipGroupedPaymentStore3 slipGroupedPaymentStore3 = new SlipGroupedPaymentStore3(this.this$0, continuation);
        slipGroupedPaymentStore3.L$0 = obj;
        return slipGroupedPaymentStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetSlipPaymentsResponseDto getSlipPaymentsResponseDto, Continuation<? super Unit> continuation) {
        return ((SlipGroupedPaymentStore3) create(getSlipPaymentsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GetSlipPaymentsResponseDto getSlipPaymentsResponseDto = (GetSlipPaymentsResponseDto) this.L$0;
        SlipGroupedPaymentDao slipGroupedPaymentDao = this.this$0.getSlipGroupedPaymentDao();
        List<SlipGroupedPaymentDto> results = getSlipPaymentsResponseDto.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(SlipGroupedPayment4.toDbModel((SlipGroupedPaymentDto) it.next()));
        }
        slipGroupedPaymentDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
