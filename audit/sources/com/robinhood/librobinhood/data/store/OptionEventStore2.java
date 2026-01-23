package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionEventStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionEvent;", "<destruct>", "Lkotlin/Pair;", "", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionEventStore$getOptionEvents$1", m3645f = "OptionEventStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$getOptionEvents$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionEventStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends String>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionEvent>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionEventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionEventStore2(OptionEventStore optionEventStore, Continuation<? super OptionEventStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionEventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionEventStore2 optionEventStore2 = new OptionEventStore2(this.this$0, continuation);
        optionEventStore2.L$0 = obj;
        return optionEventStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends String>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionEvent>> continuation) {
        return invoke2((Tuples2<? extends List<String>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionEvent>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends List<String>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionEvent>> continuation) {
        return ((OptionEventStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        List list = (List) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        OptionsApi optionsApi = this.this$0.optionsApi;
        CommaSeparatedList<String> commaSeparatedList = new CommaSeparatedList<>(list);
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object optionEvents = optionsApi.getOptionEvents(commaSeparatedList, value, this);
        return optionEvents == coroutine_suspended ? coroutine_suspended : optionEvents;
    }
}
