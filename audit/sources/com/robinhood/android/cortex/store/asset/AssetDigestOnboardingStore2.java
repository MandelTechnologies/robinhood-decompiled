package com.robinhood.android.cortex.store.asset;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.DigestOnboardingRequestDto;
import bonfire.proto.idl.copilot.p032v1.DigestOnboardingResponseDto;
import bonfire.proto.idl.copilot.p032v1.FlowTypeDto;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetDigestOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/models/asset/onboarding/AssetDigestOnboarding;", "it", "Lbonfire/proto/idl/copilot/v1/FlowTypeDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore$onboardingEndpoint$1", m3645f = "AssetDigestOnboardingStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore$onboardingEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestOnboardingStore2 extends ContinuationImpl7 implements Function2<FlowTypeDto, Continuation<? super AssetDigestOnboarding>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetDigestOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestOnboardingStore2(AssetDigestOnboardingStore assetDigestOnboardingStore, Continuation<? super AssetDigestOnboardingStore2> continuation) {
        super(2, continuation);
        this.this$0 = assetDigestOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestOnboardingStore2 assetDigestOnboardingStore2 = new AssetDigestOnboardingStore2(this.this$0, continuation);
        assetDigestOnboardingStore2.L$0 = obj;
        return assetDigestOnboardingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowTypeDto flowTypeDto, Continuation<? super AssetDigestOnboarding> continuation) {
        return ((AssetDigestOnboardingStore2) create(flowTypeDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowTypeDto flowTypeDto = (FlowTypeDto) this.L$0;
            CopilotService copilotService = this.this$0.copilotService;
            DigestOnboardingRequestDto digestOnboardingRequestDto = new DigestOnboardingRequestDto(flowTypeDto);
            this.label = 1;
            obj = copilotService.DigestOnboarding(digestOnboardingRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AssetDigestOnboarding2.toUiModel((DigestOnboardingResponseDto) obj);
    }
}
