package com.robinhood.android.individualaccounts.onboarding.funding;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "deeplink", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment$ComposeContent$1$2$1$1", m3645f = "IndividualAccountFundingBottomSheetDialogFragment.kt", m3646l = {70}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment$ComposeContent$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndividualAccountFundingBottomSheetDialogFragment5 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndividualAccountFundingBottomSheetDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndividualAccountFundingBottomSheetDialogFragment5(Navigator navigator, Context context, IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment, Continuation<? super IndividualAccountFundingBottomSheetDialogFragment5> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.this$0 = individualAccountFundingBottomSheetDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndividualAccountFundingBottomSheetDialogFragment5 individualAccountFundingBottomSheetDialogFragment5 = new IndividualAccountFundingBottomSheetDialogFragment5(this.$navigator, this.$context, this.this$0, continuation);
        individualAccountFundingBottomSheetDialogFragment5.L$0 = obj;
        return individualAccountFundingBottomSheetDialogFragment5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((IndividualAccountFundingBottomSheetDialogFragment5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IndividualAccountFundingBottomSheetDialogFragment5 individualAccountFundingBottomSheetDialogFragment5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            Uri uri = Uri.parse(str);
            this.label = 1;
            individualAccountFundingBottomSheetDialogFragment5 = this;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, null, individualAccountFundingBottomSheetDialogFragment5, 28, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            individualAccountFundingBottomSheetDialogFragment5 = this;
        }
        individualAccountFundingBottomSheetDialogFragment5.this$0.dismiss();
        return Unit.INSTANCE;
    }
}
