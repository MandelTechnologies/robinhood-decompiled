package com.robinhood.android.margin.upgrade.agreements;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AgreementDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.SignMarginAgreementsRequestDto;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$signMarginAgreementJob$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {96, 106}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$signMarginAgreementJob$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeAgreementDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiAgreementWithContent $agreement;
    final /* synthetic */ boolean $isJointAccount;
    int label;
    final /* synthetic */ MarginUpgradeAgreementDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeAgreementDuxo2(boolean z, MarginUpgradeAgreementDuxo marginUpgradeAgreementDuxo, UiAgreementWithContent uiAgreementWithContent, Continuation<? super MarginUpgradeAgreementDuxo2> continuation) {
        super(2, continuation);
        this.$isJointAccount = z;
        this.this$0 = marginUpgradeAgreementDuxo;
        this.$agreement = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeAgreementDuxo2(this.$isJointAccount, this.this$0, this.$agreement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginUpgradeAgreementDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r11.SignMarginAgreements(r1, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (com.robinhood.android.agreements.AgreementsStore.signAgreement$default(r3, r4, null, null, r10, 6, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isJointAccount) {
                JointAccountsOnboardingService jointAccountsOnboardingService = this.this$0.jointAccountsOnboardingService;
                String accountNumber = ((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                String string2 = this.$agreement.getApiAgreement().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                SignMarginAgreementsRequestDto signMarginAgreementsRequestDto = new SignMarginAgreementsRequestDto(accountNumber, new AgreementDto(string2, this.$agreement.getSha256()));
                this.label = 1;
            } else {
                AgreementsStore agreementsStore = this.this$0.agreementsStore;
                UiAgreementWithContent uiAgreementWithContent = this.$agreement;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
