package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo", m3645f = "FinalTermsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "onGoldBasicDownsellCtaClick-IoAF18A$feature_credit_card_externalDebug")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onGoldBasicDownsellCtaClick$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsDuxo4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinalTermsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinalTermsDuxo4(FinalTermsDuxo finalTermsDuxo, Continuation<? super FinalTermsDuxo4> continuation) {
        super(continuation);
        this.this$0 = finalTermsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM1877x54ae50ef = this.this$0.m1877x54ae50ef(this);
        return objM1877x54ae50ef == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1877x54ae50ef : Result.m28549boximpl(objM1877x54ae50ef);
    }
}
