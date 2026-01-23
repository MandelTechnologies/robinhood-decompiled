package com.robinhood.android.individualaccounts.onboarding.funding;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$FundAccountBottomSheetContent$1$2$1$1", m3645f = "IndividualAccountFundingBottomSheetDialogFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$FundAccountBottomSheetContent$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndividualAccountFundingBottomSheetDialogFragment8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ SnapshotState<Boolean> $loading$delegate;
    final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> $onHandleDeeplink;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IndividualAccountFundingBottomSheetDialogFragment8(Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, String str, SnapshotState<Boolean> snapshotState, Continuation<? super IndividualAccountFundingBottomSheetDialogFragment8> continuation) {
        super(2, continuation);
        this.$onHandleDeeplink = function2;
        this.$deeplink = str;
        this.$loading$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndividualAccountFundingBottomSheetDialogFragment8(this.$onHandleDeeplink, this.$deeplink, this.$loading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndividualAccountFundingBottomSheetDialogFragment8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$2(this.$loading$delegate, true);
            Function2<String, Continuation<? super Unit>, Object> function2 = this.$onHandleDeeplink;
            String str = this.$deeplink;
            this.label = 1;
            if (function2.invoke(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$2(this.$loading$delegate, false);
        return Unit.INSTANCE;
    }
}
