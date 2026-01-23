package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;

/* compiled from: NewUserExperiencePrompt.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1", m3645f = "NewUserExperiencePrompt.kt", m3646l = {99, 105, 112, 115, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class NewUserExperiencePrompt2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animatedOffset;
    final /* synthetic */ SnapshotState<Boolean> $readyToShow$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewUserExperiencePrompt2(Animatable<Float, AnimationVectors2> animatable, SnapshotState<Boolean> snapshotState, Continuation<? super NewUserExperiencePrompt2> continuation) {
        super(2, continuation);
        this.$animatedOffset = animatable;
        this.$readyToShow$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewUserExperiencePrompt2 newUserExperiencePrompt2 = new NewUserExperiencePrompt2(this.$animatedOffset, this.$readyToShow$delegate, continuation);
        newUserExperiencePrompt2.L$0 = obj;
        return newUserExperiencePrompt2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewUserExperiencePrompt2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[PHI: r1
      0x0068: PHI (r1v18 kotlinx.coroutines.CoroutineScope) = 
      (r1v3 kotlinx.coroutines.CoroutineScope)
      (r1v14 kotlinx.coroutines.CoroutineScope)
      (r1v20 kotlinx.coroutines.CoroutineScope)
     binds: [B:15:0x0063, B:31:0x00eb, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[PHI: r1 r11
      0x00a0: PHI (r1v16 kotlinx.coroutines.CoroutineScope) = (r1v9 kotlinx.coroutines.CoroutineScope), (r1v17 kotlinx.coroutines.CoroutineScope) binds: [B:9:0x0032, B:22:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r11v7 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1) = 
      (r11v2 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
      (r11v8 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
     binds: [B:9:0x0032, B:22:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd A[PHI: r1 r11
      0x00cd: PHI (r1v15 kotlinx.coroutines.CoroutineScope) = (r1v11 kotlinx.coroutines.CoroutineScope), (r1v16 kotlinx.coroutines.CoroutineScope) binds: [B:8:0x0028, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r11v6 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1) = 
      (r11v3 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
      (r11v7 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
     binds: [B:8:0x0028, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0 A[PHI: r1 r11
      0x00e0: PHI (r1v14 kotlinx.coroutines.CoroutineScope) = (r1v13 kotlinx.coroutines.CoroutineScope), (r1v15 kotlinx.coroutines.CoroutineScope) binds: [B:7:0x001e, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r11v5 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1) = 
      (r11v4 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
      (r11v6 com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$2$1)
     binds: [B:7:0x001e, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00eb -> B:16:0x0068). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        NewUserExperiencePrompt2 newUserExperiencePrompt2;
        Animatable<Float, AnimationVectors2> animatable;
        Float fBoxFloat;
        Animatable<Float, AnimationVectors2> animatable2;
        Float fBoxFloat2;
        TweenSpec tweenSpecTween$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$2(this.$readyToShow$delegate, true);
                if (!CoroutineScope2.isActive(coroutineScope)) {
                    Animatable<Float, AnimationVectors2> animatable3 = this.$animatedOffset;
                    Float fBoxFloat3 = boxing.boxFloat(0.1f);
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(200, 0, Easing3.getFastOutSlowInEasing(), 2, null);
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    newUserExperiencePrompt2 = this;
                    if (Animatable.animateTo$default(animatable3, fBoxFloat3, tweenSpecTween$default2, null, null, newUserExperiencePrompt2, 12, null) != coroutine_suspended) {
                        newUserExperiencePrompt2.L$0 = coroutineScope;
                        newUserExperiencePrompt2.label = 3;
                        if (DelayKt.delay(500L, this) != coroutine_suspended) {
                            animatable2 = newUserExperiencePrompt2.$animatedOffset;
                            fBoxFloat2 = boxing.boxFloat(1.0f);
                            tweenSpecTween$default = AnimationSpecKt.tween$default(900, 0, new CubicBezierEasing(0.17f, 0.67f, 0.83f, 0.67f), 2, null);
                            newUserExperiencePrompt2.L$0 = coroutineScope;
                            newUserExperiencePrompt2.label = 4;
                            if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default, null, null, newUserExperiencePrompt2, 12, null) != coroutine_suspended) {
                                animatable = newUserExperiencePrompt2.$animatedOffset;
                                fBoxFloat = boxing.boxFloat(0.0f);
                                newUserExperiencePrompt2.L$0 = coroutineScope;
                                newUserExperiencePrompt2.label = 5;
                                if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                                    newUserExperiencePrompt2.L$0 = coroutineScope;
                                    newUserExperiencePrompt2.label = 6;
                                    if (DelayKt.delay(200L, this) != coroutine_suspended) {
                                        if (!CoroutineScope2.isActive(coroutineScope)) {
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$2(this.$readyToShow$delegate, true);
                if (!CoroutineScope2.isActive(coroutineScope)) {
                }
                break;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                newUserExperiencePrompt2 = this;
                newUserExperiencePrompt2.L$0 = coroutineScope;
                newUserExperiencePrompt2.label = 3;
                if (DelayKt.delay(500L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                newUserExperiencePrompt2 = this;
                animatable2 = newUserExperiencePrompt2.$animatedOffset;
                fBoxFloat2 = boxing.boxFloat(1.0f);
                tweenSpecTween$default = AnimationSpecKt.tween$default(900, 0, new CubicBezierEasing(0.17f, 0.67f, 0.83f, 0.67f), 2, null);
                newUserExperiencePrompt2.L$0 = coroutineScope;
                newUserExperiencePrompt2.label = 4;
                if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default, null, null, newUserExperiencePrompt2, 12, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                newUserExperiencePrompt2 = this;
                animatable = newUserExperiencePrompt2.$animatedOffset;
                fBoxFloat = boxing.boxFloat(0.0f);
                newUserExperiencePrompt2.L$0 = coroutineScope;
                newUserExperiencePrompt2.label = 5;
                if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                newUserExperiencePrompt2 = this;
                newUserExperiencePrompt2.L$0 = coroutineScope;
                newUserExperiencePrompt2.label = 6;
                if (DelayKt.delay(200L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!CoroutineScope2.isActive(coroutineScope)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
