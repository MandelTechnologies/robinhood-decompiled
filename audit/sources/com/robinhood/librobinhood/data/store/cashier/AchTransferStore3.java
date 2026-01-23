package com.robinhood.librobinhood.data.store.cashier;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "conflictingResourceId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.cashier.AchTransferStore$createAchTransfer$apiAchTransfer$2", m3645f = "AchTransferStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.cashier.AchTransferStore$createAchTransfer$apiAchTransfer$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AchTransferStore3 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiPaymentTransferDetails.ApiAchTransfer>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AchTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferStore3(AchTransferStore achTransferStore, Continuation<? super AchTransferStore3> continuation) {
        super(2, continuation);
        this.this$0 = achTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AchTransferStore3 achTransferStore3 = new AchTransferStore3(this.this$0, continuation);
        achTransferStore3.L$0 = obj;
        return achTransferStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiPaymentTransferDetails.ApiAchTransfer> continuation) {
        return ((AchTransferStore3) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        Cashier cashier = this.this$0.cashier;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.label = 1;
        Object achTransfer = cashier.getAchTransfer(string2, this);
        return achTransfer == coroutine_suspended ? coroutine_suspended : achTransfer;
    }
}
