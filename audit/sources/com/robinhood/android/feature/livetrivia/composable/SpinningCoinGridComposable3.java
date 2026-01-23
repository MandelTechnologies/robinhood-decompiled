package com.robinhood.android.feature.livetrivia.composable;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieClipSpec;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinComposable$2$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinComposable$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SpinningCoinGridComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ boolean $isDragging;
    final /* synthetic */ LottieAnimatable $lottieAnimatable;
    final /* synthetic */ SpinningCoinGridComposable $spinDirection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpinningCoinGridComposable3(LottieAnimatable lottieAnimatable, SpinningCoinGridComposable spinningCoinGridComposable, boolean z, HapticFeedback hapticFeedback, CoroutineScope coroutineScope, LottieComposition lottieComposition, Continuation<? super SpinningCoinGridComposable3> continuation) {
        super(2, continuation);
        this.$lottieAnimatable = lottieAnimatable;
        this.$spinDirection = spinningCoinGridComposable;
        this.$isDragging = z;
        this.$hapticFeedback = hapticFeedback;
        this.$coroutineScope = coroutineScope;
        this.$composition = lottieComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpinningCoinGridComposable3(this.$lottieAnimatable, this.$spinDirection, this.$isDragging, this.$hapticFeedback, this.$coroutineScope, this.$composition, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpinningCoinGridComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$lottieAnimatable.isPlaying() && this.$spinDirection != null) {
            if (this.$isDragging) {
                this.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
            }
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C167691(this.$lottieAnimatable, this.$composition, this.$spinDirection, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SpinningCoinGridComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinComposable$2$1$1", m3645f = "SpinningCoinGridComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinComposable$2$1$1 */
    static final class C167691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ LottieAnimatable $lottieAnimatable;
        final /* synthetic */ SpinningCoinGridComposable $spinDirection;
        int label;

        /* compiled from: SpinningCoinGridComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinComposable$2$1$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpinningCoinGridComposable.values().length];
                try {
                    iArr[SpinningCoinGridComposable.HORIZONTAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpinningCoinGridComposable.VERTICAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167691(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, SpinningCoinGridComposable spinningCoinGridComposable, Continuation<? super C167691> continuation) {
            super(2, continuation);
            this.$lottieAnimatable = lottieAnimatable;
            this.$composition = lottieComposition;
            this.$spinDirection = spinningCoinGridComposable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167691(this.$lottieAnimatable, this.$composition, this.$spinDirection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            LottieClipSpec.Frame frame;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LottieAnimatable lottieAnimatable = this.$lottieAnimatable;
                LottieComposition lottieComposition = this.$composition;
                SpinningCoinGridComposable spinningCoinGridComposable = this.$spinDirection;
                int i2 = spinningCoinGridComposable == null ? -1 : WhenMappings.$EnumSwitchMapping$0[spinningCoinGridComposable.ordinal()];
                if (i2 == 1) {
                    frame = new LottieClipSpec.Frame(boxing.boxInt(0), boxing.boxInt(19), false, 4, null);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    frame = new LottieClipSpec.Frame(boxing.boxInt(20), boxing.boxInt(40), false, 4, null);
                }
                this.label = 1;
                if (LottieAnimatable.DefaultImpls.animate$default(lottieAnimatable, lottieComposition, 0, 1, false, 0.0f, frame, 0.0f, false, null, false, false, this, 2010, null) == coroutine_suspended) {
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
    }
}
