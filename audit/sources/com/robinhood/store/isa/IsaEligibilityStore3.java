package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaEligibilityStore$isUserEligibleEndpoint$2", m3645f = "IsaEligibilityStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaEligibilityStore$isUserEligibleEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaEligibilityStore3 extends ContinuationImpl7 implements Function2<IsUserEligibleForAccountResponseDto, Continuation<? super Unit>, Object> {
    int label;

    IsaEligibilityStore3(Continuation<? super IsaEligibilityStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsaEligibilityStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IsUserEligibleForAccountResponseDto isUserEligibleForAccountResponseDto, Continuation<? super Unit> continuation) {
        return ((IsaEligibilityStore3) create(isUserEligibleForAccountResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
