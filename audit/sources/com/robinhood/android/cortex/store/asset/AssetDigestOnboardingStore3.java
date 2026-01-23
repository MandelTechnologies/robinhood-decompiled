package com.robinhood.android.cortex.store.asset;

import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetDigestOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/cortex/models/asset/onboarding/AssetDigestOnboarding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore$onboardingEndpoint$2", m3645f = "AssetDigestOnboardingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore$onboardingEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestOnboardingStore3 extends ContinuationImpl7 implements Function2<AssetDigestOnboarding, Continuation<? super Unit>, Object> {
    int label;

    AssetDigestOnboardingStore3(Continuation<? super AssetDigestOnboardingStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetDigestOnboardingStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetDigestOnboarding assetDigestOnboarding, Continuation<? super Unit> continuation) {
        return ((AssetDigestOnboardingStore3) create(assetDigestOnboarding, continuation)).invokeSuspend(Unit.INSTANCE);
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
