package com.robinhood.android.optionschain.sbschain.appbar;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$drawNuxDot$2$1$1", m3645f = "OptionSideBySideChainTopAppBar.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 200, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$drawNuxDot$2$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainTopAppBar5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $blink;
    final /* synthetic */ Function0<Unit> $onBlinkComplete;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $pulseState;
    final /* synthetic */ int $remainingBlinks;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainTopAppBar5(boolean z, int i, Animatable<Float, AnimationVectors2> animatable, Function0<Unit> function0, Continuation<? super OptionSideBySideChainTopAppBar5> continuation) {
        super(2, continuation);
        this.$blink = z;
        this.$remainingBlinks = i;
        this.$pulseState = animatable;
        this.$onBlinkComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainTopAppBar5(this.$blink, this.$remainingBlinks, this.$pulseState, this.$onBlinkComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainTopAppBar5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r16) != r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b6 -> B:29:0x00b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Function0<Unit> function0;
        Animatable<Float, AnimationVectors2> animatable;
        int i2;
        int i3;
        int i4;
        Animatable<Float, AnimationVectors2> animatable2;
        Float fBoxFloat;
        TweenSpec tweenSpecTween$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$blink && (i = this.$remainingBlinks) > 0) {
                Animatable<Float, AnimationVectors2> animatable3 = this.$pulseState;
                function0 = this.$onBlinkComplete;
                animatable = animatable3;
                i2 = i;
                i3 = 0;
                if (i3 < i2) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i5 == 1) {
            i3 = this.I$1;
            i2 = this.I$0;
            function0 = (Function0) this.L$1;
            animatable = (Animatable) this.L$0;
            ResultKt.throwOnFailure(obj);
            int i6 = i3;
            int i7 = i2;
            Function0<Unit> function02 = function0;
            animatable2 = animatable;
            fBoxFloat = boxing.boxFloat(1.0f);
            tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, Easing3.getLinearEasing(), 2, null);
            this.L$0 = animatable2;
            this.L$1 = function02;
            this.I$0 = i7;
            this.I$1 = i6;
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.I$1;
            i2 = this.I$0;
            function0 = (Function0) this.L$1;
            animatable = (Animatable) this.L$0;
            ResultKt.throwOnFailure(obj);
            function0.invoke();
            i3 = i4 + 1;
            if (i3 < i2) {
                Float fBoxFloat2 = boxing.boxFloat(0.0f);
                this.L$0 = animatable;
                this.L$1 = function0;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 1;
                if (animatable.snapTo(fBoxFloat2, this) != coroutine_suspended) {
                    int i62 = i3;
                    int i72 = i2;
                    Function0<Unit> function022 = function0;
                    animatable2 = animatable;
                    fBoxFloat = boxing.boxFloat(1.0f);
                    tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, Easing3.getLinearEasing(), 2, null);
                    this.L$0 = animatable2;
                    this.L$1 = function022;
                    this.I$0 = i72;
                    this.I$1 = i62;
                    this.label = 2;
                    if (Animatable.animateTo$default(animatable2, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) != coroutine_suspended) {
                        animatable = animatable2;
                        i4 = i62;
                        i2 = i72;
                        function0 = function022;
                        this.L$0 = animatable;
                        this.L$1 = function0;
                        this.I$0 = i2;
                        this.I$1 = i4;
                        this.label = 3;
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        i4 = this.I$1;
        i2 = this.I$0;
        function0 = (Function0) this.L$1;
        animatable = (Animatable) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = animatable;
        this.L$1 = function0;
        this.I$0 = i2;
        this.I$1 = i4;
        this.label = 3;
    }
}
