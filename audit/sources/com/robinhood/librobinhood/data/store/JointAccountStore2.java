package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.GetGoldFeaturesRequestDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.GetGoldFeaturesResponseDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: JointAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/jointaccounts/db/JointAccountFeatures;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.JointAccountStore$featuresEndpoint$1", m3645f = "JointAccountStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.JointAccountStore$featuresEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class JointAccountStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super JointAccountFeatures>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JointAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JointAccountStore2(JointAccountStore jointAccountStore, Continuation<? super JointAccountStore2> continuation) {
        super(2, continuation);
        this.this$0 = jointAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JointAccountStore2 jointAccountStore2 = new JointAccountStore2(this.this$0, continuation);
        jointAccountStore2.L$0 = obj;
        return jointAccountStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super JointAccountFeatures> continuation) {
        return ((JointAccountStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        JointAccountStore jointAccountStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            JointAccountStore jointAccountStore2 = this.this$0;
            JointAccountsOnboardingService jointAccountsOnboardingService = jointAccountStore2.service;
            GetGoldFeaturesRequestDto getGoldFeaturesRequestDto = new GetGoldFeaturesRequestDto(str);
            this.L$0 = jointAccountStore2;
            this.label = 1;
            obj = jointAccountsOnboardingService.GetGoldFeatures(getGoldFeaturesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            jointAccountStore = jointAccountStore2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jointAccountStore = (JointAccountStore) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return jointAccountStore.toDbModel((GetGoldFeaturesResponseDto) obj);
    }
}
