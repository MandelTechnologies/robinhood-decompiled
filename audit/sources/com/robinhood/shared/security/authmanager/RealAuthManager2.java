package com.robinhood.shared.security.authmanager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealAuthManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager", m3645f = "RealAuthManager.kt", m3646l = {616, 630, 651}, m3647m = "logoutLocal$lib_auth_manager_externalRelease")
/* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutLocal$1, reason: use source file name */
/* loaded from: classes6.dex */
final class RealAuthManager2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealAuthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealAuthManager2(RealAuthManager realAuthManager, Continuation<? super RealAuthManager2> continuation) {
        super(continuation);
        this.this$0 = realAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logoutLocal$lib_auth_manager_externalRelease(this);
    }
}
