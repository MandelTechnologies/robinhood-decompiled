package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountRequestDto;
import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountResponseDto;
import bonfire.proto.idl.accounts.p028v1.RhukIsaService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;", "request", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaEligibilityStore$isUserEligibleEndpoint$1", m3645f = "IsaEligibilityStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaEligibilityStore$isUserEligibleEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaEligibilityStore2 extends ContinuationImpl7 implements Function2<IsUserEligibleForAccountRequestDto, Continuation<? super IsUserEligibleForAccountResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaEligibilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaEligibilityStore2(IsaEligibilityStore isaEligibilityStore, Continuation<? super IsaEligibilityStore2> continuation) {
        super(2, continuation);
        this.this$0 = isaEligibilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaEligibilityStore2 isaEligibilityStore2 = new IsaEligibilityStore2(this.this$0, continuation);
        isaEligibilityStore2.L$0 = obj;
        return isaEligibilityStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto, Continuation<? super IsUserEligibleForAccountResponseDto> continuation) {
        return ((IsaEligibilityStore2) create(isUserEligibleForAccountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto = (IsUserEligibleForAccountRequestDto) this.L$0;
        RhukIsaService rhukIsaService = this.this$0.isaService;
        this.label = 1;
        Object objIsUserEligibleForAccount = rhukIsaService.IsUserEligibleForAccount(isUserEligibleForAccountRequestDto, this);
        return objIsUserEligibleForAccount == coroutine_suspended ? coroutine_suspended : objIsUserEligibleForAccount;
    }
}
