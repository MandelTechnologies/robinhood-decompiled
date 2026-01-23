package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.equities.p034v1.AggregatedBorrowChargeDto;
import com.robinhood.models.dao.BorrowChargeDao;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
import p479j$.time.Instant;

/* compiled from: BorrowChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BorrowChargeStore$aggregatedBorrowChargeEndpoint$2", m3645f = "BorrowChargeStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class BorrowChargeStore$aggregatedBorrowChargeEndpoint$2 extends ContinuationImpl7 implements Function2<List<? extends AggregatedBorrowChargeDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BorrowChargeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BorrowChargeStore$aggregatedBorrowChargeEndpoint$2(BorrowChargeStore borrowChargeStore, Continuation<? super BorrowChargeStore$aggregatedBorrowChargeEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = borrowChargeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BorrowChargeStore$aggregatedBorrowChargeEndpoint$2 borrowChargeStore$aggregatedBorrowChargeEndpoint$2 = new BorrowChargeStore$aggregatedBorrowChargeEndpoint$2(this.this$0, continuation);
        borrowChargeStore$aggregatedBorrowChargeEndpoint$2.L$0 = obj;
        return borrowChargeStore$aggregatedBorrowChargeEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends AggregatedBorrowChargeDto> list, Continuation<? super Unit> continuation) {
        return invoke2((List<AggregatedBorrowChargeDto>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<AggregatedBorrowChargeDto> list, Continuation<? super Unit> continuation) {
        return ((BorrowChargeStore$aggregatedBorrowChargeEndpoint$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            BorrowChargeDao borrowChargeDao = this.this$0.borrowChargeDao;
            List<AggregatedBorrowChargeDto> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (AggregatedBorrowChargeDto aggregatedBorrowChargeDto : list2) {
                UUID uuid = StringsKt.toUuid(aggregatedBorrowChargeDto.getId());
                String account_number = aggregatedBorrowChargeDto.getAccount_number();
                Instant billing_end_date = aggregatedBorrowChargeDto.getBilling_end_date();
                if (billing_end_date == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Instant billing_start_date = aggregatedBorrowChargeDto.getBilling_start_date();
                if (billing_start_date == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Instant charge_date = aggregatedBorrowChargeDto.getCharge_date();
                if (charge_date == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                MoneyDto total_charge_amount = aggregatedBorrowChargeDto.getTotal_charge_amount();
                if (total_charge_amount == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrayList.add(new GroupedBorrowCharges(uuid, account_number, BorrowChargeStoreKt.toBorrowChargeStatus(aggregatedBorrowChargeDto.getStatus()), billing_end_date, billing_start_date, charge_date, Money3.toMoney(total_charge_amount), BorrowChargeStoreKt.toInstrumentBorrowCharge(aggregatedBorrowChargeDto.getCharges())));
            }
            this.label = 1;
            if (borrowChargeDao.insertGroupedBorrowCharges(arrayList, this) == coroutine_suspended) {
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
