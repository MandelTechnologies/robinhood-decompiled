package com.robinhood.android.cortex.digest.asset.splash;

import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashViewState;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isKillSwitchEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1$2$1", m3645f = "AssetDigestSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestSplashDuxo2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetDigestOnboarding $copilotOnboarding;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AssetDigestSplashDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestSplashDuxo2(AssetDigestSplashDuxo assetDigestSplashDuxo, AssetDigestOnboarding assetDigestOnboarding, Continuation<? super AssetDigestSplashDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = assetDigestSplashDuxo;
        this.$copilotOnboarding = assetDigestOnboarding;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestSplashDuxo2 assetDigestSplashDuxo2 = new AssetDigestSplashDuxo2(this.this$0, this.$copilotOnboarding, continuation);
        assetDigestSplashDuxo2.Z$0 = ((Boolean) obj).booleanValue();
        return assetDigestSplashDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((AssetDigestSplashDuxo2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AssetDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1$2$1$1", m3645f = "AssetDigestSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1$2$1$1 */
    static final class C120591 extends ContinuationImpl7 implements Function2<AssetDigestSplashViewState, Continuation<? super AssetDigestSplashViewState>, Object> {
        final /* synthetic */ AssetDigestOnboarding $copilotOnboarding;
        final /* synthetic */ boolean $isKillSwitchEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C120591(AssetDigestOnboarding assetDigestOnboarding, boolean z, Continuation<? super C120591> continuation) {
            super(2, continuation);
            this.$copilotOnboarding = assetDigestOnboarding;
            this.$isKillSwitchEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C120591(this.$copilotOnboarding, this.$isKillSwitchEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestSplashViewState assetDigestSplashViewState, Continuation<? super AssetDigestSplashViewState> continuation) {
            return ((C120591) create(assetDigestSplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new AssetDigestSplashViewState.Loaded(this.$copilotOnboarding, this.$isKillSwitchEnabled);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C120591(this.$copilotOnboarding, this.Z$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
