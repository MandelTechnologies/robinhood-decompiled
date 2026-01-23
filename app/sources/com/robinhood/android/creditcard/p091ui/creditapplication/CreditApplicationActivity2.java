package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreditApplicationActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity", m3645f = "CreditApplicationActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "onAcceptDownsell-IoAF18A")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity$onAcceptDownsell$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CreditApplicationActivity2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreditApplicationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditApplicationActivity2(CreditApplicationActivity creditApplicationActivity, Continuation<? super CreditApplicationActivity2> continuation) {
        super(continuation);
        this.this$0 = creditApplicationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo12620onAcceptDownsellIoAF18A = this.this$0.mo12620onAcceptDownsellIoAF18A(this);
        return objMo12620onAcceptDownsellIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo12620onAcceptDownsellIoAF18A : Result.m28549boximpl(objMo12620onAcceptDownsellIoAF18A);
    }
}
