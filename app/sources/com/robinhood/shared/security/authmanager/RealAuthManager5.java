package com.robinhood.shared.security.authmanager;

import com.robinhood.android.util.login.UserLifecycleListener;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealAuthManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$4", m3645f = "RealAuthManager.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$4, reason: use source file name */
/* loaded from: classes6.dex */
final class RealAuthManager5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RealAuthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealAuthManager5(RealAuthManager realAuthManager, Continuation<? super RealAuthManager5> continuation) {
        super(2, continuation);
        this.this$0 = realAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealAuthManager5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealAuthManager5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Set<UserLifecycleListener> userLifecycleListeners = this.this$0.getUserLifecycleListeners();
        RealAuthManager realAuthManager = this.this$0;
        Iterator<T> it = userLifecycleListeners.iterator();
        while (it.hasNext()) {
            ((UserLifecycleListener) it.next()).onUserStateChanged(realAuthManager.getContext(), UserLifecycleListener.State.LOGGED_OUT);
        }
        return Unit.INSTANCE;
    }
}
