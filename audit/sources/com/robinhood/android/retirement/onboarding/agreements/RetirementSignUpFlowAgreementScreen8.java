package com.robinhood.android.retirement.onboarding.agreements;

import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpFlowAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$5$1", m3645f = "RetirementSignUpFlowAgreementScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$5$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowAgreementScreen8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RetirementSignUpFlowAgreementScreen $callbacks;
    final /* synthetic */ SnapshotState4<Integer> $deepestScrollIndex$delegate;
    final /* synthetic */ SnapshotState4<Integer> $totalItemsCount$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpFlowAgreementScreen8(RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, SnapshotState4<Integer> snapshotState4, SnapshotState4<Integer> snapshotState42, Continuation<? super RetirementSignUpFlowAgreementScreen8> continuation) {
        super(2, continuation);
        this.$callbacks = retirementSignUpFlowAgreementScreen;
        this.$deepestScrollIndex$delegate = snapshotState4;
        this.$totalItemsCount$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementSignUpFlowAgreementScreen8(this.$callbacks, this.$deepestScrollIndex$delegate, this.$totalItemsCount$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RetirementSignUpFlowAgreementScreen8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$callbacks.onDeepestScrollIncremented(RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$20(this.$deepestScrollIndex$delegate) / RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$2(this.$totalItemsCount$delegate));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
