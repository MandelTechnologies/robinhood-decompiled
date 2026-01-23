package com.robinhood.android.futures.detail.p140ui.duxo;

import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onFlattenOrders$1$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {399}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onFlattenOrders$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesDetailDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $rhdAccountId;
    final /* synthetic */ UUID $selectedContractId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesDetailDuxo4(FuturesDetailDuxo futuresDetailDuxo, UUID uuid, UUID uuid2, Continuation<? super FuturesDetailDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = futuresDetailDuxo;
        this.$rhdAccountId = uuid;
        this.$selectedContractId = uuid2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesDetailDuxo4 futuresDetailDuxo4 = new FuturesDetailDuxo4(this.this$0, this.$rhdAccountId, this.$selectedContractId, continuation);
        futuresDetailDuxo4.L$0 = obj;
        return futuresDetailDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesDetailDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FuturesDetailDuxo4 futuresDetailDuxo4;
        Throwable th;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesDetailDuxo futuresDetailDuxo = this.this$0;
            UUID uuid = this.$rhdAccountId;
            UUID uuid2 = this.$selectedContractId;
            try {
                Result.Companion companion = Result.INSTANCE;
                FuturesOrderStore futuresOrderStore = futuresDetailDuxo.futuresOrderStore;
                this.label = 1;
                futuresDetailDuxo4 = this;
                try {
                    if (FuturesOrderStore.flattenPosition$default(futuresOrderStore, uuid, uuid2, null, futuresDetailDuxo4, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    FuturesDetailDuxo futuresDetailDuxo2 = futuresDetailDuxo4.this$0;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    FuturesDetailDuxo futuresDetailDuxo3 = futuresDetailDuxo4.this$0;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                futuresDetailDuxo4 = this;
                th = th;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                FuturesDetailDuxo futuresDetailDuxo22 = futuresDetailDuxo4.this$0;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                FuturesDetailDuxo futuresDetailDuxo32 = futuresDetailDuxo4.this$0;
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
                futuresDetailDuxo4 = this;
            } catch (Throwable th4) {
                th = th4;
                futuresDetailDuxo4 = this;
                Result.Companion companion222 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                FuturesDetailDuxo futuresDetailDuxo222 = futuresDetailDuxo4.this$0;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                FuturesDetailDuxo futuresDetailDuxo322 = futuresDetailDuxo4.this$0;
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        FuturesDetailDuxo futuresDetailDuxo2222 = futuresDetailDuxo4.this$0;
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            futuresDetailDuxo2222.applyMutation(new FuturesDetailDuxo5(null));
            Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
        }
        FuturesDetailDuxo futuresDetailDuxo3222 = futuresDetailDuxo4.this$0;
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            futuresDetailDuxo3222.applyMutation(new FuturesDetailDuxo6(null));
        }
        return Unit.INSTANCE;
    }
}
