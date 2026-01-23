package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HelmDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$helmCallback$1", m3645f = "HelmDuxo.kt", m3646l = {88, 105}, m3647m = "startNativeSubFlow")
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$helmCallback$1$startNativeSubFlow$1, reason: use source file name */
/* loaded from: classes10.dex */
final class HelmDuxo6 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HelmDuxo5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelmDuxo6(HelmDuxo5 helmDuxo5, Continuation<? super HelmDuxo6> continuation) {
        super(continuation);
        this.this$0 = helmDuxo5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startNativeSubFlow(null, null, this);
    }
}
