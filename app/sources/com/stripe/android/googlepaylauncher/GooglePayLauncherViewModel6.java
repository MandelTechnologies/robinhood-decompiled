package com.stripe.android.googlepaylauncher;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "resolveLoadPaymentDataTask-IoAF18A")
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GooglePayLauncherViewModel6 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayLauncherViewModel6(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel6> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26850resolveLoadPaymentDataTaskIoAF18A = this.this$0.m26850resolveLoadPaymentDataTaskIoAF18A(this);
        return objM26850resolveLoadPaymentDataTaskIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26850resolveLoadPaymentDataTaskIoAF18A : Result.m28549boximpl(objM26850resolveLoadPaymentDataTaskIoAF18A);
    }
}
