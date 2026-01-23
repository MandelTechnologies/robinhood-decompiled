package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.models.PaginatedResult;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Collection2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {HttpStatusCode.BAD_GATEWAY_502}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1 */
/* loaded from: classes13.dex */
final class C34414xfcf253f extends ContinuationImpl7 implements Function2<String, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34414xfcf253f(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Continuation<? super C34414xfcf253f> continuation) {
        super(2, continuation);
        this.this$0 = traderInvestmentScheduleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34414xfcf253f c34414xfcf253f = new C34414xfcf253f(this.this$0, continuation);
        c34414xfcf253f.L$0 = obj;
        return c34414xfcf253f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>> continuation) {
        return invoke2(str, (Continuation<? super PaginatedResult<ApiInvestmentSchedule>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super PaginatedResult<ApiInvestmentSchedule>> continuation) {
        return ((C34414xfcf253f) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            final Flow flowPaginate = PaginatedEndpointKt.paginate(str, new C34415x790ce5de(this.this$0, str, null));
            Flow<List<? extends ApiInvestmentSchedule>> flow = new Flow<List<? extends ApiInvestmentSchedule>>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends ApiInvestmentSchedule>> flowCollector, Continuation continuation) {
                    Object objCollect = flowPaginate.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$invokeSuspend$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            List<T> results = ((PaginatedResult) obj).getResults();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(results, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            this.label = 1;
            obj = Collection2.toList$default(flow, null, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new PaginatedResult(CollectionsKt.flatten((Iterable) obj), null, null, 6, null);
    }
}
