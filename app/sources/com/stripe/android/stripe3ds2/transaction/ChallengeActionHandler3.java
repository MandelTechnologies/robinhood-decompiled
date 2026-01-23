package com.stripe.android.stripe3ds2.transaction;

import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", m3645f = "ChallengeActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2, reason: use source file name */
/* loaded from: classes26.dex */
final class ChallengeActionHandler3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeAction $action;
    int label;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeActionHandler3(ChallengeActionHandler.Default r1, ChallengeAction challengeAction, Continuation<? super ChallengeActionHandler3> continuation) {
        super(2, continuation);
        this.this$0 = r1;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeActionHandler3(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChallengeRequestResult> continuation) {
        return ((ChallengeActionHandler3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ChallengeRequestData challengeRequestDataCopy$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ChallengeRequestData challengeRequestData = new ChallengeRequestData(this.this$0.creqData.getMessageVersion(), this.this$0.creqData.getThreeDsServerTransId(), this.this$0.creqData.getAcsTransId(), this.this$0.creqData.getSdkTransId(), null, null, null, this.this$0.creqData.getMessageExtensions(), null, null, 880, null);
        ChallengeAction challengeAction = this.$action;
        if (challengeAction instanceof ChallengeAction.NativeForm) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, ((ChallengeAction.NativeForm) challengeAction).getUserEntry(), null, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
        } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, ((ChallengeAction.HtmlForm) challengeAction).getUserEntry(), null, null, null, 959, null);
        } else if (challengeAction instanceof ChallengeAction.Oob) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, null, null, boxing.boxBoolean(true), null, 767, null);
        } else if (challengeAction instanceof ChallengeAction.Resend) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(true), 511, null);
        } else if (challengeAction instanceof ChallengeAction.Cancel) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, ChallengeRequestData.CancelReason.UserSelected, null, null, null, null, 991, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ChallengeActionHandler.Default r4 = this.this$0;
        this.label = 1;
        Object objExecuteChallengeRequest = r4.executeChallengeRequest(challengeRequestDataCopy$default, this);
        return objExecuteChallengeRequest == coroutine_suspended ? coroutine_suspended : objExecuteChallengeRequest;
    }
}
