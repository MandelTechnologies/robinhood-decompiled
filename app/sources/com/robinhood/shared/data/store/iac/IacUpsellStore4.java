package com.robinhood.shared.data.store.iac;

import com.robinhood.shared.api.iac.IacUpsellApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IacUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "receiptUuid", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$seenEndpoint$1", m3645f = "IacUpsellStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$seenEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class IacUpsellStore4 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IacUpsellStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacUpsellStore4(IacUpsellStore iacUpsellStore, Continuation<? super IacUpsellStore4> continuation) {
        super(2, continuation);
        this.this$0 = iacUpsellStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IacUpsellStore4 iacUpsellStore4 = new IacUpsellStore4(this.this$0, continuation);
        iacUpsellStore4.L$0 = obj;
        return iacUpsellStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
        return ((IacUpsellStore4) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            IacUpsellApi iacUpsellApi = this.this$0.getIacUpsellApi();
            this.label = 1;
            if (iacUpsellApi.postHeroCardSeen(uuid, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
