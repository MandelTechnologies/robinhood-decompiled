package com.robinhood.android.mcw.currencyconverter.util;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;

/* compiled from: Animations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0003\u001a\r\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"doEnterAnimation", "Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/mcw/currencyconverter/util/FieldAnimationValues;", "(Lcom/robinhood/android/mcw/currencyconverter/util/FieldAnimationValues;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberFieldAnimationValues", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/mcw/currencyconverter/util/FieldAnimationValues;", "rememberIconFlipAnimationValues", "Lcom/robinhood/android/mcw/currencyconverter/util/IconFlipAnimationValues;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/mcw/currencyconverter/util/IconFlipAnimationValues;", "numpadEnterTransition", "Landroidx/compose/animation/EnterTransition;", "getNumpadEnterTransition", "()Landroidx/compose/animation/EnterTransition;", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Animations2 {
    private static final EnterTransition numpadEnterTransition = EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween(300, 300, EasingFunctions.getEaseOut()), null, false, null, 14, null);

    /* compiled from: Animations.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2", m3645f = "Animations.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2 */
    static final class C217172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ FieldAnimationValues $this_doEnterAnimation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C217172(FieldAnimationValues fieldAnimationValues, Continuation<? super C217172> continuation) {
            super(2, continuation);
            this.$this_doEnterAnimation = fieldAnimationValues;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217172 c217172 = new C217172(this.$this_doEnterAnimation, continuation);
            c217172.L$0 = obj;
            return c217172;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C217172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Animations.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$1", m3645f = "Animations.kt", m3646l = {42, 51}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FieldAnimationValues $this_doEnterAnimation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FieldAnimationValues fieldAnimationValues, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_doEnterAnimation = fieldAnimationValues;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_doEnterAnimation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
            
                if (r14.snapTo(r1, r13) != r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
            
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
                        Animatable<Float, AnimationVectors2> fromAlpha = this.$this_doEnterAnimation.getFromAlpha();
                        Float fBoxFloat = boxing.boxFloat(1.0f);
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(300, 0, EasingFunctions.getEaseOut());
                        this.label = 1;
                        anonymousClass1 = this;
                        try {
                        } catch (CancellationException unused) {
                            Animatable<Float, AnimationVectors2> fromAlpha2 = anonymousClass1.$this_doEnterAnimation.getFromAlpha();
                            Float fBoxFloat2 = boxing.boxFloat(1.0f);
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$this_doEnterAnimation, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$this_doEnterAnimation, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$this_doEnterAnimation, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.$this_doEnterAnimation, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: Animations.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$2", m3645f = "Animations.kt", m3646l = {56, 65}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FieldAnimationValues $this_doEnterAnimation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FieldAnimationValues fieldAnimationValues, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_doEnterAnimation = fieldAnimationValues;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_doEnterAnimation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
            
                if (r14.snapTo(r1, r13) != r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass2 anonymousClass2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVectors2> fromYOffsetPx = this.$this_doEnterAnimation.getFromYOffsetPx();
                        Float fBoxFloat = boxing.boxFloat(0.0f);
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(300, 0, EasingFunctions.getEaseOut());
                        this.label = 1;
                        anonymousClass2 = this;
                        try {
                        } catch (CancellationException unused) {
                            Animatable<Float, AnimationVectors2> fromYOffsetPx2 = anonymousClass2.$this_doEnterAnimation.getFromYOffsetPx();
                            Float fBoxFloat2 = boxing.boxFloat(0.0f);
                            anonymousClass2.label = 2;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (CancellationException unused2) {
                    anonymousClass2 = this;
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: Animations.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$3", m3645f = "Animations.kt", m3646l = {70, 79}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FieldAnimationValues $this_doEnterAnimation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FieldAnimationValues fieldAnimationValues, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$this_doEnterAnimation = fieldAnimationValues;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$this_doEnterAnimation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            
                if (r14.snapTo(r1, r13) != r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass3 anonymousClass3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVectors2> toAlpha = this.$this_doEnterAnimation.getToAlpha();
                        Float fBoxFloat = boxing.boxFloat(1.0f);
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(300, 150, EasingFunctions.getEaseOut());
                        this.label = 1;
                        anonymousClass3 = this;
                        try {
                        } catch (CancellationException unused) {
                            Animatable<Float, AnimationVectors2> toAlpha2 = anonymousClass3.$this_doEnterAnimation.getToAlpha();
                            Float fBoxFloat2 = boxing.boxFloat(1.0f);
                            anonymousClass3.label = 2;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (CancellationException unused2) {
                    anonymousClass3 = this;
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: Animations.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$4", m3645f = "Animations.kt", m3646l = {84, 93}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.currencyconverter.util.AnimationsKt$doEnterAnimation$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FieldAnimationValues $this_doEnterAnimation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FieldAnimationValues fieldAnimationValues, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$this_doEnterAnimation = fieldAnimationValues;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$this_doEnterAnimation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
            
                if (r14.snapTo(r1, r13) != r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass4 anonymousClass4;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVectors2> toYOffsetPx = this.$this_doEnterAnimation.getToYOffsetPx();
                        Float fBoxFloat = boxing.boxFloat(0.0f);
                        TweenSpec tweenSpecTween = AnimationSpecKt.tween(300, 150, EasingFunctions.getEaseOut());
                        this.label = 1;
                        anonymousClass4 = this;
                        try {
                        } catch (CancellationException unused) {
                            Animatable<Float, AnimationVectors2> toYOffsetPx2 = anonymousClass4.$this_doEnterAnimation.getToYOffsetPx();
                            Float fBoxFloat2 = boxing.boxFloat(0.0f);
                            anonymousClass4.label = 2;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (CancellationException unused2) {
                    anonymousClass4 = this;
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final Object doEnterAnimation(FieldAnimationValues fieldAnimationValues, Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C217172(fieldAnimationValues, null), continuation);
    }

    public static final EnterTransition getNumpadEnterTransition() {
        return numpadEnterTransition;
    }

    public static final FieldAnimationValues rememberFieldAnimationValues(Composer composer, int i) {
        composer.startReplaceGroup(-1848066552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1848066552, i, -1, "com.robinhood.android.mcw.currencyconverter.util.rememberFieldAnimationValues (Animations.kt:98)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new FieldAnimationValues(Animatable2.Animatable$default(0.0f, 0.0f, 2, null), Animatable2.Animatable$default(24.0f, 0.0f, 2, null), Animatable2.Animatable$default(0.0f, 0.0f, 2, null), Animatable2.Animatable$default(24.0f, 0.0f, 2, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        FieldAnimationValues fieldAnimationValues = (FieldAnimationValues) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fieldAnimationValues;
    }

    public static final IconFlipAnimationValues rememberIconFlipAnimationValues(Composer composer, int i) {
        composer.startReplaceGroup(-1701065458);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1701065458, i, -1, "com.robinhood.android.mcw.currencyconverter.util.rememberIconFlipAnimationValues (Animations.kt:108)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        IconFlipAnimationValues iconFlipAnimationValues = new IconFlipAnimationValues(snapshotState, AnimateAsState.animateFloatAsState(((Boolean) snapshotState.getValue()).booleanValue() ? 180.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composer, 48, 28));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconFlipAnimationValues;
    }
}
