package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getIndividualAccountInvestmentSchedules$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {602, 479}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getIndividualAccountInvestmentSchedules$1 */
/* loaded from: classes13.dex */
final class C34408x7924097d extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34408x7924097d(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Continuation<? super C34408x7924097d> continuation) {
        super(2, continuation);
        this.this$0 = traderInvestmentScheduleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34408x7924097d c34408x7924097d = new C34408x7924097d(this.this$0, continuation);
        c34408x7924097d.L$0 = obj;
        return c34408x7924097d;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>> continuation) {
        return invoke2((Tuples2<String, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiInvestmentSchedule>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiInvestmentSchedule>> continuation) {
        return ((C34408x7924097d) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        PaginationCursor paginationCursor;
        PaginationCursor paginationCursor2;
        Object investmentSchedules;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            str = (String) tuples2.component1();
            paginationCursor = (PaginationCursor) tuples2.component2();
            this.this$0.accountProvider.refresh(false);
            if (str == null) {
                Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                this.L$0 = paginationCursor;
                this.label = 1;
                Object objAwait = RxAwait3.await(individualAccountNumber, this);
                if (objAwait != coroutine_suspended) {
                    paginationCursor2 = paginationCursor;
                    obj = objAwait;
                }
            } else {
                RecurringApi recurringApi = this.this$0.recurringApi;
                String value = paginationCursor == null ? paginationCursor.getValue() : null;
                this.L$0 = null;
                this.label = 2;
                investmentSchedules = recurringApi.getInvestmentSchedules(str, value, this);
                if (investmentSchedules != coroutine_suspended) {
                    return investmentSchedules;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        paginationCursor2 = (PaginationCursor) this.L$0;
        ResultKt.throwOnFailure(obj);
        Optional optional = (Optional) obj;
        if (optional != null) {
            PaginationCursor paginationCursor3 = paginationCursor2;
            str = (String) optional.getOrNull();
            paginationCursor = paginationCursor3;
        } else {
            paginationCursor = paginationCursor2;
            str = null;
        }
        RecurringApi recurringApi2 = this.this$0.recurringApi;
        if (paginationCursor == null) {
        }
        this.L$0 = null;
        this.label = 2;
        investmentSchedules = recurringApi2.getInvestmentSchedules(str, value, this);
        if (investmentSchedules != coroutine_suspended) {
            return coroutine_suspended;
        }
    }
}
