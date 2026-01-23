package contracts.money_movement.crypto_account_selection.proto.p432v1;

import contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoAccountSelectionManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "request"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService_Adapter$DidSelectAddAccountEndpoint$call$1", m3645f = "CryptoAccountSelectionManagedService_Adapter.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* renamed from: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService_Adapter$DidSelectAddAccountEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class CryptoAccountSelectionManagedService_Adapter3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CryptoAccountSelectionManagedService_Adapter.DidSelectAddAccountEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountSelectionManagedService_Adapter3(CryptoAccountSelectionManagedService_Adapter.DidSelectAddAccountEndpoint didSelectAddAccountEndpoint, Continuation<? super CryptoAccountSelectionManagedService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = didSelectAddAccountEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoAccountSelectionManagedService_Adapter3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((CryptoAccountSelectionManagedService_Adapter3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoAccountSelectionManagedService cryptoAccountSelectionManagedService = this.this$0.service;
            this.label = 1;
            if (cryptoAccountSelectionManagedService.DidSelectAddAccount(this) == coroutine_suspended) {
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
