package com.robinhood.lib.equity.order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderService.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.equity.order.OrderServiceImplementation$waitForOrdersToReachState$2", m3645f = "OrderService.kt", m3646l = {82, 89}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$waitForOrdersToReachState$2, reason: use source file name */
/* loaded from: classes27.dex */
final class OrderService7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ int $numAttempts;
    final /* synthetic */ List<String> $orderIds;
    final /* synthetic */ long $pollInterval;
    final /* synthetic */ OrderState $state;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderService7(int i, List<String> list, long j, OrderService2 orderService2, OrderState orderState, Continuation<? super OrderService7> continuation) {
        super(2, continuation);
        this.$numAttempts = i;
        this.$orderIds = list;
        this.$pollInterval = j;
        this.this$0 = orderService2;
        this.$state = orderState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderService7 orderService7 = new OrderService7(this.$numAttempts, this.$orderIds, this.$pollInterval, this.this$0, this.$state, continuation);
        orderService7.L$0 = obj;
        return orderService7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((OrderService7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r13) == r0) goto L34;
     */
    /* JADX WARN: Path cross not found for [B:23:0x0084, B:26:0x008e], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[LOOP:0: B:14:0x004d->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:35:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        int i2;
        List list;
        Iterator it;
        Iterator<T> it2;
        Object objAwaitAll;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (1 <= this.$numAttempts) {
                coroutineScope = coroutineScope2;
                i = 1;
                List<String> list2 = this.$orderIds;
                OrderService2 orderService2 = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                this.L$0 = coroutineScope;
                this.I$0 = i;
                this.label = 1;
                objAwaitAll = Await2.awaitAll(arrayList, this);
                if (objAwaitAll != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new Exception("Orders didn't reach expected state"))));
        }
        if (i3 == 1) {
            i2 = this.I$0;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            list = (List) obj;
            OrderState orderState = this.$state;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (it.hasNext()) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE));
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = this.I$0;
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (i2 != this.$numAttempts) {
            i = i2 + 1;
            List<String> list22 = this.$orderIds;
            OrderService2 orderService22 = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
            it2 = list22.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OrderService8(orderService22, (String) it2.next(), null), 3, null));
            }
            this.L$0 = coroutineScope;
            this.I$0 = i;
            this.label = 1;
            objAwaitAll = Await2.awaitAll(arrayList2, this);
            if (objAwaitAll != coroutine_suspended) {
                i2 = i;
                obj = objAwaitAll;
                list = (List) obj;
                OrderState orderState2 = this.$state;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((OrderState) it.next()) != orderState2) {
                            long j = this.$pollInterval;
                            this.L$0 = coroutineScope;
                            this.I$0 = i2;
                            this.label = 2;
                        }
                    }
                }
                Result.Companion companion22 = Result.INSTANCE;
                return Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE));
            }
            return coroutine_suspended;
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new Exception("Orders didn't reach expected state"))));
    }
}
