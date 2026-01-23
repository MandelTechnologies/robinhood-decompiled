package com.robinhood.android.slip.onboarding.checklist;

import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SlipOnboardingChecklistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistDuxo$onStart$1$eligibilityDeferred$1", m3645f = "SlipOnboardingChecklistDuxo.kt", m3646l = {88, 89}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistDuxo$onStart$1$eligibilityDeferred$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipOnboardingChecklistDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiSlipOnboardingEligibility>, Object> {
    int label;
    final /* synthetic */ SlipOnboardingChecklistDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipOnboardingChecklistDuxo2(SlipOnboardingChecklistDuxo slipOnboardingChecklistDuxo, Continuation<? super SlipOnboardingChecklistDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = slipOnboardingChecklistDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipOnboardingChecklistDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiSlipOnboardingEligibility> continuation) {
        return ((SlipOnboardingChecklistDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String accountNumber;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            accountNumber = ((SlipOnboardingChecklistFragment.Args) SlipOnboardingChecklistDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
            if (accountNumber == null) {
                Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                this.label = 1;
                obj = RxAwait3.await(individualAccountNumber, this);
            } else if (accountNumber == null) {
                Single<UiSlipOnboardingEligibility> onboardingEligibility = this.this$0.slipEligibilityStore.getOnboardingEligibility(accountNumber);
                this.label = 2;
                Object objAwait = RxAwait3.await(onboardingEligibility, this);
                if (objAwait != coroutine_suspended) {
                    return objAwait;
                }
            } else {
                throw new IllegalStateException("User must have an individual account to get SLIP eligibility");
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        accountNumber = (String) ((Optional) obj).getOrNull();
        if (accountNumber == null) {
        }
    }
}
