package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", m3645f = "ChallengeActionHandler.kt", m3646l = {78, 81}, m3647m = "executeChallengeRequest")
/* renamed from: com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1, reason: use source file name */
/* loaded from: classes26.dex */
final class ChallengeActionHandler2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeActionHandler2(ChallengeActionHandler.Default r1, Continuation<? super ChallengeActionHandler2> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeChallengeRequest(null, this);
    }
}
