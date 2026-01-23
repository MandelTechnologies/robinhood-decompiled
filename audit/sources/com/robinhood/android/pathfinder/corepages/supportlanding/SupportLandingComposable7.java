package com.robinhood.android.pathfinder.corepages.supportlanding;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors5;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportLandingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Tabs$1$1", m3645f = "SupportLandingComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Tabs$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class SupportLandingComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Color, AnimationVectors5> $animatedContainerBackground;
    final /* synthetic */ long $containerBackground;
    final /* synthetic */ Function1<Color, Unit> $onTabBackgroundChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SupportLandingComposable7(Animatable<Color, AnimationVectors5> animatable, long j, Function1<? super Color, Unit> function1, Continuation<? super SupportLandingComposable7> continuation) {
        super(2, continuation);
        this.$animatedContainerBackground = animatable;
        this.$containerBackground = j;
        this.$onTabBackgroundChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportLandingComposable7(this.$animatedContainerBackground, this.$containerBackground, this.$onTabBackgroundChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportLandingComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Color, AnimationVectors5> animatable = this.$animatedContainerBackground;
            Color colorM6701boximpl = Color.m6701boximpl(this.$containerBackground);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
            final Function1<Color, Unit> function1 = this.$onTabBackgroundChanged;
            Function1 function12 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$Tabs$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SupportLandingComposable7.invokeSuspend$lambda$0(function1, (Animatable) obj2);
                }
            };
            this.label = 1;
            if (Animatable.animateTo$default(animatable, colorM6701boximpl, tweenSpecTween$default, null, function12, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function1 function1, Animatable animatable) {
        function1.invoke(animatable.getValue());
        return Unit.INSTANCE;
    }
}
