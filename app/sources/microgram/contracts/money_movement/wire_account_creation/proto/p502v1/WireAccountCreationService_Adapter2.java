package microgram.contracts.money_movement.wire_account_creation.proto.p502v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.WireAccountCreationService_Adapter;

/* compiled from: WireAccountCreationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.money_movement.wire_account_creation.proto.v1.WireAccountCreationService_Adapter$DidLinkAccountEndpoint$call$1", m3645f = "WireAccountCreationService_Adapter.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.money_movement.wire_account_creation.proto.v1.WireAccountCreationService_Adapter$DidLinkAccountEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class WireAccountCreationService_Adapter2 extends ContinuationImpl7 implements Function2<DidLinkAccountRequestDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WireAccountCreationService_Adapter.DidLinkAccountEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WireAccountCreationService_Adapter2(WireAccountCreationService_Adapter.DidLinkAccountEndpoint didLinkAccountEndpoint, Continuation<? super WireAccountCreationService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = didLinkAccountEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WireAccountCreationService_Adapter2 wireAccountCreationService_Adapter2 = new WireAccountCreationService_Adapter2(this.this$0, continuation);
        wireAccountCreationService_Adapter2.L$0 = obj;
        return wireAccountCreationService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DidLinkAccountRequestDto didLinkAccountRequestDto, Continuation<? super Unit> continuation) {
        return ((WireAccountCreationService_Adapter2) create(didLinkAccountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DidLinkAccountRequestDto didLinkAccountRequestDto = (DidLinkAccountRequestDto) this.L$0;
            WireAccountCreationService wireAccountCreationService = this.this$0.service;
            this.label = 1;
            if (wireAccountCreationService.DidLinkAccount(didLinkAccountRequestDto, this) == coroutine_suspended) {
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
