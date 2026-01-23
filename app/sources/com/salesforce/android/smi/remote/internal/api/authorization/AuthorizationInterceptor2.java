package com.salesforce.android.smi.remote.internal.api.authorization;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AuthorizationInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationInterceptor$intercept$authResult$1$1", m3645f = "AuthorizationInterceptor.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationInterceptor$intercept$authResult$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AuthorizationInterceptor2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Auth>>, Object> {
    int label;
    final /* synthetic */ AuthorizationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthorizationInterceptor2(AuthorizationInterceptor authorizationInterceptor, Continuation<? super AuthorizationInterceptor2> continuation) {
        super(2, continuation);
        this.this$0 = authorizationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthorizationInterceptor2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Auth>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Auth>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Auth>> continuation) {
        return ((AuthorizationInterceptor2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AuthorizationService authorizationService = this.this$0.authorizationService;
        this.label = 1;
        Object objAuthorization$default = AuthorizationService.authorization$default(authorizationService, false, this, 1, null);
        return objAuthorization$default == coroutine_suspended ? coroutine_suspended : objAuthorization$default;
    }
}
