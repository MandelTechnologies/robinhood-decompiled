package com.robinhood.microgram.authentication;

import com.robinhood.microgram.authentication.AuthenticationService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AuthenticationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter$Endpoint_isAuthenticated$Emission;", "it", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.authentication.AuthenticationService_Adapter$Endpoint_isAuthenticated$call$1", m3645f = "AuthenticationService_Adapter.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.authentication.AuthenticationService_Adapter$Endpoint_isAuthenticated$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AuthenticationService_Adapter3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super AuthenticationService_Adapter.Endpoint_isAuthenticated.Emission>, Object> {
    int label;
    final /* synthetic */ AuthenticationService_Adapter.Endpoint_isAuthenticated this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticationService_Adapter3(AuthenticationService_Adapter.Endpoint_isAuthenticated endpoint_isAuthenticated, Continuation<? super AuthenticationService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_isAuthenticated;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthenticationService_Adapter3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super AuthenticationService_Adapter.Endpoint_isAuthenticated.Emission> continuation) {
        return ((AuthenticationService_Adapter3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AuthenticationService authenticationService = this.this$0.service;
            this.label = 1;
            obj = authenticationService.isAuthenticated(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AuthenticationService_Adapter.Endpoint_isAuthenticated.Emission.m22902boximpl(AuthenticationService_Adapter.Endpoint_isAuthenticated.Emission.m22903constructorimpl(((Boolean) obj).booleanValue()));
    }
}
