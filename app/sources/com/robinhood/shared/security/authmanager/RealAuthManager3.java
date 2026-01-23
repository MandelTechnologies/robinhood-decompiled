package com.robinhood.shared.security.authmanager;

import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: RealAuthManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$2", m3645f = "RealAuthManager.kt", m3646l = {621, 628}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$2, reason: use source file name */
/* loaded from: classes6.dex */
final class RealAuthManager3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RealAuthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealAuthManager3(RealAuthManager realAuthManager, Continuation<? super RealAuthManager3> continuation) {
        super(2, continuation);
        this.this$0 = realAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealAuthManager3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealAuthManager3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Timber.INSTANCE.mo3356i("User logged out", new Object[0]);
            Preconditions4.checkNotOnMainThread(Preconditions.INSTANCE);
            LogoutKillswitch logoutKillswitch = this.this$0.getLogoutKillswitch().get();
            this.label = 1;
            if (logoutKillswitch.onLoggedOut(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getLoggedInFlow().setValue(boxing.boxBoolean(false));
        this.label = 2;
    }
}
