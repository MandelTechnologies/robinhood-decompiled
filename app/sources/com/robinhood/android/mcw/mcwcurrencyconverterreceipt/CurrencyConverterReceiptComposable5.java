package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CurrencyConverterReceiptComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$2$1", m3645f = "CurrencyConverterReceiptComposable.kt", m3646l = {316, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class CurrencyConverterReceiptComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $bannerTranslationX;
    final /* synthetic */ ScrollState $scrollState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterReceiptComposable5(ScrollState scrollState, Animatable<Float, AnimationVectors2> animatable, Continuation<? super CurrencyConverterReceiptComposable5> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$bannerTranslationX = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyConverterReceiptComposable5 currencyConverterReceiptComposable5 = new CurrencyConverterReceiptComposable5(this.$scrollState, this.$bannerTranslationX, continuation);
        currencyConverterReceiptComposable5.L$0 = obj;
        return currencyConverterReceiptComposable5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrencyConverterReceiptComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CurrencyConverterReceiptComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$2$1$1", m3645f = "CurrencyConverterReceiptComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bannerTranslationX;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVectors2> animatable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bannerTranslationX = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bannerTranslationX, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r9, 12, null) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r13.snapTo(r1, r12) != r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVectors2> animatable = this.$bannerTranslationX;
                    Float fBoxFloat = boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, null, 6, null);
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                    } catch (CancellationException unused) {
                        Animatable<Float, AnimationVectors2> animatable2 = anonymousClass1.$bannerTranslationX;
                        Float fBoxFloat2 = boxing.boxFloat(0.0f);
                        anonymousClass1.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (CancellationException unused2) {
                anonymousClass1 = this;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r12.animateScrollTo(r1, r2, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.$bannerTranslationX, null), 3, null);
            this.label = 1;
            if (DelayKt.delay(UtilKt.ARROW_ANIMATION_DURATION_MS, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ScrollState scrollState = this.$scrollState;
        int maxValue = scrollState.getMaxValue();
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 0, Easing3.getLinearEasing(), 3, null);
        this.label = 2;
    }
}
