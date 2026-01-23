package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionChain;
import java.util.UUID;
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

/* compiled from: OptionChainStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionChain;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainStore$getOptionChains$1", m3645f = "OptionChainStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionChainStore$getOptionChains$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionChain>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionChainStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainStore$getOptionChains$1(OptionChainStore optionChainStore, Continuation<? super OptionChainStore$getOptionChains$1> continuation) {
        super(2, continuation);
        this.this$0 = optionChainStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainStore$getOptionChains$1 optionChainStore$getOptionChains$1 = new OptionChainStore$getOptionChains$1(this.this$0, continuation);
        optionChainStore$getOptionChains$1.L$0 = obj;
        return optionChainStore$getOptionChains$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionChain>> continuation) {
        return invoke2((Tuples2<? extends Iterable<UUID>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionChain>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<UUID>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionChain>> continuation) {
        return ((OptionChainStore$getOptionChains$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Iterable iterable = (Iterable) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        String strJoinToString$default = CollectionsKt.joinToString$default(iterable, ",", null, null, 0, null, null, 62, null);
        OptionsApi optionsApi = this.this$0.optionsApi;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object optionChains = optionsApi.getOptionChains(value, strJoinToString$default, this);
        return optionChains == coroutine_suspended ? coroutine_suspended : optionChains;
    }
}
