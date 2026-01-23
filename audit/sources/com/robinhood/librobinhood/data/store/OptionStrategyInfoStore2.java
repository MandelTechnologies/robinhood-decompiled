package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionStrategyInfo;
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

/* compiled from: OptionStrategyInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionStrategyInfo;", "<destruct>", "Lkotlin/Pair;", "", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyInfoStore$getOptionStrategyInfo$1", m3645f = "OptionStrategyInfoStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyInfoStore$getOptionStrategyInfo$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionStrategyInfoStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends String>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionStrategyInfo>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyInfoStore2(OptionStrategyInfoStore optionStrategyInfoStore, Continuation<? super OptionStrategyInfoStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyInfoStore2 optionStrategyInfoStore2 = new OptionStrategyInfoStore2(this.this$0, continuation);
        optionStrategyInfoStore2.L$0 = obj;
        return optionStrategyInfoStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends String>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionStrategyInfo>> continuation) {
        return invoke2((Tuples2<? extends Iterable<String>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionStrategyInfo>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<String>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionStrategyInfo>> continuation) {
        return ((OptionStrategyInfoStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Iterable iterable = (Iterable) ((Tuples2) this.L$0).component1();
        OptionsApi optionsApi = this.this$0.optionsApi;
        String strJoinToString$default = CollectionsKt.joinToString$default(iterable, null, null, null, 0, null, null, 63, null);
        this.label = 1;
        Object optionStrategyInfo = optionsApi.getOptionStrategyInfo(strJoinToString$default, this);
        return optionStrategyInfo == coroutine_suspended ? coroutine_suspended : optionStrategyInfo;
    }
}
