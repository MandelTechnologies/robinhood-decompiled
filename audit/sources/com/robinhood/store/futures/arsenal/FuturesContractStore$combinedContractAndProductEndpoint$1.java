package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "contractId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$combinedContractAndProductEndpoint$1", m3645f = "FuturesContractStore.kt", m3646l = {69, 70}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesContractStore$combinedContractAndProductEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Tuples2<? extends FuturesContract, ? extends FuturesProduct>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$combinedContractAndProductEndpoint$1(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$combinedContractAndProductEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$combinedContractAndProductEndpoint$1 futuresContractStore$combinedContractAndProductEndpoint$1 = new FuturesContractStore$combinedContractAndProductEndpoint$1(this.this$0, continuation);
        futuresContractStore$combinedContractAndProductEndpoint$1.L$0 = obj;
        return futuresContractStore$combinedContractAndProductEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Tuples2<? extends FuturesContract, ? extends FuturesProduct>> continuation) {
        return invoke2(uuid, (Continuation<? super Tuples2<FuturesContract, FuturesProduct>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super Tuples2<FuturesContract, FuturesProduct>> continuation) {
        return ((FuturesContractStore$combinedContractAndProductEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        FuturesContract futuresContract;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            InstrumentService instrumentService = this.this$0.arsenalService;
            this.label = 1;
            obj = ArsenalServiceExt.getFuturesContract(instrumentService, uuid, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            futuresContract = (FuturesContract) this.L$0;
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to(futuresContract, (FuturesProduct) obj);
        }
        ResultKt.throwOnFailure(obj);
        FuturesContract futuresContract2 = (FuturesContract) obj;
        InstrumentService instrumentService2 = this.this$0.arsenalService;
        UUID productId = futuresContract2.getProductId();
        this.L$0 = futuresContract2;
        this.label = 2;
        Object futuresProduct = ArsenalServiceExt.getFuturesProduct(instrumentService2, productId, this);
        if (futuresProduct != coroutine_suspended) {
            futuresContract = futuresContract2;
            obj = futuresProduct;
            return Tuples4.m3642to(futuresContract, (FuturesProduct) obj);
        }
        return coroutine_suspended;
    }
}
