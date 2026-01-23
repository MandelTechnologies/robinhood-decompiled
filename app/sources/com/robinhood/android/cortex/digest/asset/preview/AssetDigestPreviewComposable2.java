package com.robinhood.android.cortex.digest.asset.preview;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposable2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AssetDigestPreviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$4$1$1$3$1", m3645f = "AssetDigestPreviewComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$4$1$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestPreviewComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<String> $currentText$delegate;
    final /* synthetic */ String $description;
    final /* synthetic */ SnapshotState<Boolean> $isAccessoriesVisible$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isBlurred$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $textAnimation;
    final /* synthetic */ TextLayoutResult $textMeasureResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestPreviewComposable2(TextLayoutResult textLayoutResult, Animatable<Float, AnimationVectors2> animatable, String str, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AssetDigestPreviewComposable2> continuation) {
        super(2, continuation);
        this.$textMeasureResult = textLayoutResult;
        this.$textAnimation = animatable;
        this.$description = str;
        this.$currentText$delegate = snapshotState;
        this.$isAccessoriesVisible$delegate = snapshotState2;
        this.$isBlurred$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestPreviewComposable2 assetDigestPreviewComposable2 = new AssetDigestPreviewComposable2(this.$textMeasureResult, this.$textAnimation, this.$description, this.$currentText$delegate, this.$isAccessoriesVisible$delegate, this.$isBlurred$delegate, continuation);
        assetDigestPreviewComposable2.L$0 = obj;
        return assetDigestPreviewComposable2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AssetDigestPreviewComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.$textAnimation, TextLayoutResult.getLineEnd$default(this.$textMeasureResult, r15.getLineCount() - 1, false, 2, null), this.$description, this.$currentText$delegate, this.$isAccessoriesVisible$delegate, null), 3, null);
        AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$32$lambda$16(this.$isBlurred$delegate, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AssetDigestPreviewComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$4$1$1$3$1$1", m3645f = "AssetDigestPreviewComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$4$1$1$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<String> $currentText$delegate;
        final /* synthetic */ String $description;
        final /* synthetic */ SnapshotState<Boolean> $isAccessoriesVisible$delegate;
        final /* synthetic */ int $lastVisibleCharacterOffset;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $textAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVectors2> animatable, int i, String str, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$textAnimation = animatable;
            this.$lastVisibleCharacterOffset = i;
            this.$description = str;
            this.$currentText$delegate = snapshotState;
            this.$isAccessoriesVisible$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$textAnimation, this.$lastVisibleCharacterOffset, this.$description, this.$currentText$delegate, this.$isAccessoriesVisible$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(300, r12) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$textAnimation;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(800, 0, Easing3.getLinearEasing(), 2, null);
                final int i2 = this.$lastVisibleCharacterOffset;
                final String str = this.$description;
                final SnapshotState<String> snapshotState = this.$currentText$delegate;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposableKt$AssetDigestPreviewComposable$4$1$1$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetDigestPreviewComposable2.AnonymousClass1.invokeSuspend$lambda$0(i2, str, snapshotState, (Animatable) obj2);
                    }
                };
                this.label = 1;
                anonymousClass1 = this;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, function1, anonymousClass1, 4, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = this;
                AssetDigestPreviewComposable.AssetDigestPreviewComposable$lambda$32$lambda$13(anonymousClass1.$isAccessoriesVisible$delegate, true);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            anonymousClass1 = this;
            anonymousClass1.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(int i, String str, SnapshotState snapshotState, Animatable animatable) {
            snapshotState.setValue(str.subSequence(0, (int) (((Number) animatable.getValue()).floatValue() * i)).toString());
            return Unit.INSTANCE;
        }
    }
}
