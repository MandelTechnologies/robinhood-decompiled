package com.stripe.android.googlepaylauncher;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "getResultFromConfirmation$payments_core_release")
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GooglePayLauncherViewModel5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayLauncherViewModel5(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel5> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getResultFromConfirmation$payments_core_release(0, null, this);
    }
}
