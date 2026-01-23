package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAdrFee;
import com.robinhood.models.p320db.AdrFee;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p479j$.time.LocalDate;

/* compiled from: AdrFeeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAdrFee;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AdrFeeStore$endpoint$1", m3645f = "AdrFeeStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AdrFeeStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AdrFeeStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiAdrFee>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdrFeeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdrFeeStore2(AdrFeeStore adrFeeStore, Continuation<? super AdrFeeStore2> continuation) {
        super(2, continuation);
        this.this$0 = adrFeeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdrFeeStore2 adrFeeStore2 = new AdrFeeStore2(this.this$0, continuation);
        adrFeeStore2.L$0 = obj;
        return adrFeeStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiAdrFee>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiAdrFee>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiAdrFee>> continuation) {
        return ((AdrFeeStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
            LocalDate lastUpdatedAtDate = this.this$0.getLastUpdatedAtManager().getLastUpdatedAtDate(AdrFee.class);
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            this.label = 1;
            obj = equitiesBrokeback.getAdrFees(lastUpdatedAtDate, value, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        this.this$0.instrumentStore.pingInstruments(paginatedResult, new Function1() { // from class: com.robinhood.librobinhood.data.store.AdrFeeStore$endpoint$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((ApiAdrFee) obj2).getInstrumentId();
            }
        });
        return paginatedResult;
    }
}
