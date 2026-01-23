package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {104, 116}, m3647m = "createPaymentDataRequest-gIAlu-s")
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createPaymentDataRequest$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GooglePayLauncherViewModel4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayLauncherViewModel4(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel4> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26851createPaymentDataRequestgIAlus = this.this$0.m26851createPaymentDataRequestgIAlus(null, this);
        return objM26851createPaymentDataRequestgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26851createPaymentDataRequestgIAlus : Result.m28549boximpl(objM26851createPaymentDataRequestgIAlus);
    }
}
