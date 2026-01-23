package com.robinhood.android.individualaccounts.onboarding.funding;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.funding.ComposableSingletons$IndividualAccountFundingBottomSheetDialogFragmentKt$lambda$376891638$1$1$1", m3645f = "IndividualAccountFundingBottomSheetDialogFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.ComposableSingletons$IndividualAccountFundingBottomSheetDialogFragmentKt$lambda$376891638$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndividualAccountFundingBottomSheetDialogFragment4 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    int label;

    IndividualAccountFundingBottomSheetDialogFragment4(Continuation<? super IndividualAccountFundingBottomSheetDialogFragment4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndividualAccountFundingBottomSheetDialogFragment4(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((IndividualAccountFundingBottomSheetDialogFragment4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
