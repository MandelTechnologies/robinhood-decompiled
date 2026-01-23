package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OptionStrategyLeg;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AggregateOptionStrategyQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/OptionStrategyInfo;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2", m3645f = "AggregateOptionStrategyQuoteStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AggregateOptionStrategyQuoteStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends OptionStrategyInfo>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiAggregateOptionQuote>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionStrategyQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregateOptionStrategyQuoteStore4(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, Continuation<? super AggregateOptionStrategyQuoteStore4> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionStrategyQuoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AggregateOptionStrategyQuoteStore4 aggregateOptionStrategyQuoteStore4 = new AggregateOptionStrategyQuoteStore4(this.this$0, continuation);
        aggregateOptionStrategyQuoteStore4.L$0 = obj;
        return aggregateOptionStrategyQuoteStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends OptionStrategyInfo>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiAggregateOptionQuote>> continuation) {
        return invoke2((Tuples2<? extends Iterable<OptionStrategyInfo>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiAggregateOptionQuote>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<OptionStrategyInfo>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiAggregateOptionQuote>> continuation) {
        return ((AggregateOptionStrategyQuoteStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List list = CollectionsKt.toList((Iterable) ((Tuples2) this.L$0).component1());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((OptionStrategyInfo) it.next()).getLegs());
        }
        OptionsApi optionsApi = this.this$0.optionsApi;
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AggregateOptionStrategyQuoteStore4.invokeSuspend$lambda$1((OptionStrategyLeg) obj2);
            }
        }, 30, null);
        String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AggregateOptionStrategyQuoteStore4.invokeSuspend$lambda$2((OptionStrategyLeg) obj2);
            }
        }, 30, null);
        String strJoinToString$default3 = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AggregateOptionStrategyQuoteStore4.invokeSuspend$lambda$4((OptionStrategyInfo) obj2);
            }
        }, 30, null);
        String strJoinToString$default4 = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AggregateOptionStrategyQuoteStore4.invokeSuspend$lambda$5((OptionStrategyLeg) obj2);
            }
        }, 30, null);
        this.label = 1;
        Object aggregateOptionQuotes = optionsApi.getAggregateOptionQuotes(strJoinToString$default, strJoinToString$default2, strJoinToString$default4, strJoinToString$default3, true, this);
        return aggregateOptionQuotes == coroutine_suspended ? coroutine_suspended : aggregateOptionQuotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$1(OptionStrategyLeg optionStrategyLeg) {
        return OptionInstrument.INSTANCE.getPath(optionStrategyLeg.getOptionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$2(OptionStrategyLeg optionStrategyLeg) {
        String string2 = optionStrategyLeg.getRatioQuantity().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$4(final OptionStrategyInfo optionStrategyInfo) {
        return CollectionsKt.joinToString$default(optionStrategyInfo.getLegs(), ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$extendedHoursEndpoint$2$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionStrategyQuoteStore4.invokeSuspend$lambda$4$lambda$3(optionStrategyInfo, (OptionStrategyLeg) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$4$lambda$3(OptionStrategyInfo optionStrategyInfo, OptionStrategyLeg optionStrategyLeg) {
        return optionStrategyInfo.getStrategyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$5(OptionStrategyLeg optionStrategyLeg) {
        return optionStrategyLeg.getPositionType().getServerValue();
    }
}
