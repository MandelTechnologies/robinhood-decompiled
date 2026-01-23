package com.robinhood.android.advisory.returns;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$2$1", m3645f = "ReturnsChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ReturnsChart8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReturnsChart4 $animPhase;
    final /* synthetic */ int $barIndex;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $heightAnim;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $overlayAlpha;
    final /* synthetic */ float $targetBarHeightPx;
    int I$0;
    int label;

    /* compiled from: ReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$2$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReturnsChart4.values().length];
            try {
                iArr[ReturnsChart4.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReturnsChart4.REMOVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReturnsChart4.IN_PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnsChart8(ReturnsChart4 returnsChart4, int i, Animatable<Float, AnimationVectors2> animatable, float f, Animatable<Float, AnimationVectors2> animatable2, Continuation<? super ReturnsChart8> continuation) {
        super(2, continuation);
        this.$animPhase = returnsChart4;
        this.$barIndex = i;
        this.$heightAnim = animatable;
        this.$targetBarHeightPx = f;
        this.$overlayAlpha = animatable2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReturnsChart8(this.$animPhase, this.$barIndex, this.$heightAnim, this.$targetBarHeightPx, this.$overlayAlpha, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReturnsChart8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r0 != r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r0 != r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        if (r0 != r8) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Object objAnimateTo$default;
        Object objAnimateTo$default2;
        Object objAnimateTo$default3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ReturnsChart4 returnsChart4 = this.$animPhase;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i4 = iArr[returnsChart4.ordinal()];
                if (i4 != 1 && i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 0;
                    i2 = iArr[this.$animPhase.ordinal()];
                    if (i2 != 1) {
                    }
                    return coroutine_suspended;
                }
                int i5 = this.$barIndex;
                i = i5 * 83;
                i2 = iArr[this.$animPhase.ordinal()];
                if (i2 != 1) {
                    Animatable<Float, AnimationVectors2> animatable = this.$heightAnim;
                    Float fBoxFloat = boxing.boxFloat(this.$targetBarHeightPx);
                    TweenSpec tweenSpecTween = AnimationSpecKt.tween(333, i, ReturnsChart7.ExpansionEasing);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween, null, null, this, 12, null) != coroutine_suspended) {
                        Animatable<Float, AnimationVectors2> animatable2 = this.$overlayAlpha;
                        Float fBoxFloat2 = boxing.boxFloat(1.0f);
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(333, 0, ReturnsChart7.ExpansionEasing, 2, null);
                        this.label = 2;
                        objAnimateTo$default = Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default, null, null, this, 12, null);
                        break;
                    }
                } else if (i2 == 2) {
                    Animatable<Float, AnimationVectors2> animatable3 = this.$overlayAlpha;
                    Float fBoxFloat3 = boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(333, i, ReturnsChart7.ExpansionEasing);
                    this.I$0 = i;
                    this.label = 5;
                    if (Animatable.animateTo$default(animatable3, fBoxFloat3, tweenSpecTween2, null, null, this, 12, null) != coroutine_suspended) {
                        i3 = i;
                        Animatable<Float, AnimationVectors2> animatable4 = this.$heightAnim;
                        Float fBoxFloat4 = boxing.boxFloat(0.0f);
                        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(333, i3, ReturnsChart7.ExpansionEasing);
                        this.label = 6;
                        objAnimateTo$default3 = Animatable.animateTo$default(animatable4, fBoxFloat4, tweenSpecTween3, null, null, this, 12, null);
                        break;
                    }
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Animatable<Float, AnimationVectors2> animatable5 = this.$overlayAlpha;
                    Float fBoxFloat5 = boxing.boxFloat(1.0f);
                    this.label = 3;
                    if (animatable5.snapTo(fBoxFloat5, this) != coroutine_suspended) {
                        Animatable<Float, AnimationVectors2> animatable6 = this.$heightAnim;
                        Float fBoxFloat6 = boxing.boxFloat(this.$targetBarHeightPx);
                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(333, 0, ReturnsChart7.ExpansionEasing, 2, null);
                        this.label = 4;
                        objAnimateTo$default2 = Animatable.animateTo$default(animatable6, fBoxFloat6, tweenSpecTween$default2, null, null, this, 12, null);
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable22 = this.$overlayAlpha;
                Float fBoxFloat22 = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(333, 0, ReturnsChart7.ExpansionEasing, 2, null);
                this.label = 2;
                objAnimateTo$default = Animatable.animateTo$default(animatable22, fBoxFloat22, tweenSpecTween$default3, null, null, this, 12, null);
                break;
            case 2:
                ResultKt.throwOnFailure(obj);
                objAnimateTo$default = obj;
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable62 = this.$heightAnim;
                Float fBoxFloat62 = boxing.boxFloat(this.$targetBarHeightPx);
                TweenSpec tweenSpecTween$default22 = AnimationSpecKt.tween$default(333, 0, ReturnsChart7.ExpansionEasing, 2, null);
                this.label = 4;
                objAnimateTo$default2 = Animatable.animateTo$default(animatable62, fBoxFloat62, tweenSpecTween$default22, null, null, this, 12, null);
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                objAnimateTo$default2 = obj;
                return Unit.INSTANCE;
            case 5:
                i3 = this.I$0;
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable42 = this.$heightAnim;
                Float fBoxFloat42 = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween32 = AnimationSpecKt.tween(333, i3, ReturnsChart7.ExpansionEasing);
                this.label = 6;
                objAnimateTo$default3 = Animatable.animateTo$default(animatable42, fBoxFloat42, tweenSpecTween32, null, null, this, 12, null);
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                objAnimateTo$default3 = obj;
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
