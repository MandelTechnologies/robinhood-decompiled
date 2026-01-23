package com.robinhood.android.optionsupgrade;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$NewOnboardingUpsellTradeOnExpiration$4$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationFragment.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$NewOnboardingUpsellTradeOnExpiration$4$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingUpsellTradeOnExpirationFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Animatable<Float, AnimationVectors2>> $translations;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingUpsellTradeOnExpirationFragment2(List<Animatable<Float, AnimationVectors2>> list, Continuation<? super OptionOnboardingUpsellTradeOnExpirationFragment2> continuation) {
        super(2, continuation);
        this.$translations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionOnboardingUpsellTradeOnExpirationFragment2(this.$translations, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingUpsellTradeOnExpirationFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$translations.iterator();
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$0;
            it = (Iterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = i3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Float fBoxFloat = boxing.boxFloat(0.0f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, 0, OptionOnboardingUpsellAnimationConstants.getUpsellAnimationEasingCurve(), 2, null);
            this.L$0 = it;
            this.I$0 = i4;
            this.label = 1;
            if (Animatable.animateTo$default((Animatable) next, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i4;
        }
        return Unit.INSTANCE;
    }
}
