package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "contractIds", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$multiContractAndProductEndpoint$1", m3645f = "FuturesContractStore.kt", m3646l = {102, 104}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class FuturesContractStore$multiContractAndProductEndpoint$1 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Tuples2<? extends List<? extends FuturesContract>, ? extends List<? extends FuturesProduct>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$multiContractAndProductEndpoint$1(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$multiContractAndProductEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$multiContractAndProductEndpoint$1 futuresContractStore$multiContractAndProductEndpoint$1 = new FuturesContractStore$multiContractAndProductEndpoint$1(this.this$0, continuation);
        futuresContractStore$multiContractAndProductEndpoint$1.L$0 = obj;
        return futuresContractStore$multiContractAndProductEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Tuples2<? extends List<? extends FuturesContract>, ? extends List<? extends FuturesProduct>>> continuation) {
        return invoke2((List<UUID>) list, (Continuation<? super Tuples2<? extends List<FuturesContract>, ? extends List<FuturesProduct>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Continuation<? super Tuples2<? extends List<FuturesContract>, ? extends List<FuturesProduct>>> continuation) {
        return ((FuturesContractStore$multiContractAndProductEndpoint$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list2 = (List) this.L$0;
            InstrumentService instrumentService = this.this$0.arsenalService;
            this.label = 1;
            obj = ArsenalServiceExt.getFuturesContracts(instrumentService, list2, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to(list, (List) obj);
        }
        ResultKt.throwOnFailure(obj);
        List list3 = (List) obj;
        List list4 = list3;
        LinkedHashSet linkedHashSet = list4 instanceof Collection ? new LinkedHashSet(list4.size()) : new LinkedHashSet();
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((FuturesContract) it.next()).getProductId());
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        List list5 = CollectionsKt.toList(setUnmodifiableSet);
        InstrumentService instrumentService2 = this.this$0.arsenalService;
        this.L$0 = list3;
        this.label = 2;
        Object futuresProducts = ArsenalServiceExt.getFuturesProducts(instrumentService2, list5, this);
        if (futuresProducts != coroutine_suspended) {
            list = list3;
            obj = futuresProducts;
            return Tuples4.m3642to(list, (List) obj);
        }
        return coroutine_suspended;
    }
}
