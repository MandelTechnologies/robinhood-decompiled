package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {150, 151, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyAndFooterFadeIn;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyTranslationY;
    final /* synthetic */ SnapshotState<Boolean> $enterAnimationPlayed$delegate;
    final /* synthetic */ float $footerStartOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $footerTranslationY;
    final /* synthetic */ float $headerImageAndBodyStartOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageFadeIn;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageTranslationY;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1(Animatable<Float, AnimationVectors2> animatable, float f, Animatable<Float, AnimationVectors2> animatable2, Animatable<Float, AnimationVectors2> animatable3, float f2, SnapshotState<Boolean> snapshotState, Animatable<Float, AnimationVectors2> animatable4, Animatable<Float, AnimationVectors2> animatable5, Continuation<? super CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1> continuation) {
        super(2, continuation);
        this.$headerImageTranslationY = animatable;
        this.$headerImageAndBodyStartOffset = f;
        this.$bodyTranslationY = animatable2;
        this.$footerTranslationY = animatable3;
        this.$footerStartOffset = f2;
        this.$enterAnimationPlayed$delegate = snapshotState;
        this.$headerImageFadeIn = animatable4;
        this.$bodyAndFooterFadeIn = animatable5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1 cryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1 = new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1(this.$headerImageTranslationY, this.$headerImageAndBodyStartOffset, this.$bodyTranslationY, this.$footerTranslationY, this.$footerStartOffset, this.$enterAnimationPlayed$delegate, this.$headerImageFadeIn, this.$bodyAndFooterFadeIn, continuation);
        cryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1.L$0 = obj;
        return cryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Animatable<Float, AnimationVectors2> animatable;
        Float fBoxFloat;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (!CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$4(this.$enterAnimationPlayed$delegate)) {
                Animatable<Float, AnimationVectors2> animatable2 = this.$headerImageTranslationY;
                Float fBoxFloat2 = boxing.boxFloat(this.$headerImageAndBodyStartOffset);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (animatable2.snapTo(fBoxFloat2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope3;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C404011(this.$headerImageFadeIn, this.$headerImageTranslationY, this.$bodyAndFooterFadeIn, this.$bodyTranslationY, this.$footerTranslationY, null), 3, null);
                CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$5(this.$enterAnimationPlayed$delegate, true);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            animatable = this.$footerTranslationY;
            fBoxFloat = boxing.boxFloat(this.$footerStartOffset);
            this.L$0 = coroutineScope;
            this.label = 3;
            if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                coroutineScope2 = coroutineScope;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C404011(this.$headerImageFadeIn, this.$headerImageTranslationY, this.$bodyAndFooterFadeIn, this.$bodyTranslationY, this.$footerTranslationY, null), 3, null);
                CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$5(this.$enterAnimationPlayed$delegate, true);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable3 = this.$bodyTranslationY;
        Float fBoxFloat3 = boxing.boxFloat(this.$headerImageAndBodyStartOffset);
        this.L$0 = coroutineScope;
        this.label = 2;
        if (animatable3.snapTo(fBoxFloat3, this) != coroutine_suspended) {
            animatable = this.$footerTranslationY;
            fBoxFloat = boxing.boxFloat(this.$footerStartOffset);
            this.L$0 = coroutineScope;
            this.label = 3;
            if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: CryptoFeeTierUpgradedComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {155, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1 */
    static final class C404011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyAndFooterFadeIn;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyTranslationY;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $footerTranslationY;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageFadeIn;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageTranslationY;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C404011(Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, Animatable<Float, AnimationVectors2> animatable3, Animatable<Float, AnimationVectors2> animatable4, Animatable<Float, AnimationVectors2> animatable5, Continuation<? super C404011> continuation) {
            super(2, continuation);
            this.$headerImageFadeIn = animatable;
            this.$headerImageTranslationY = animatable2;
            this.$bodyAndFooterFadeIn = animatable3;
            this.$bodyTranslationY = animatable4;
            this.$footerTranslationY = animatable5;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C404011 c404011 = new C404011(this.$headerImageFadeIn, this.$headerImageTranslationY, this.$bodyAndFooterFadeIn, this.$bodyTranslationY, this.$footerTranslationY, continuation);
            c404011.L$0 = obj;
            return c404011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(300, r17) == r8) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                Animatable<Float, AnimationVectors2> animatable = this.$headerImageFadeIn;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, CryptoFeeTierUpgradedComposableKt.easing, 2, null);
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) != coroutine_suspended) {
                    coroutineScope = coroutineScope2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = coroutineScope;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(this.$headerImageTranslationY, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass2(this.$bodyAndFooterFadeIn, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass3(this.$bodyTranslationY, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass4(this.$footerTranslationY, null), 3, null);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = coroutineScope;
            this.label = 2;
        }

        /* compiled from: CryptoFeeTierUpgradedComposable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$1", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageTranslationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Animatable<Float, AnimationVectors2> animatable, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$headerImageTranslationY = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$headerImageTranslationY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVectors2> animatable = this.$headerImageTranslationY;
                    Float fBoxFloat = boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, CryptoFeeTierUpgradedComposableKt.easing, 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

        /* compiled from: CryptoFeeTierUpgradedComposable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$2", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyAndFooterFadeIn;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Animatable<Float, AnimationVectors2> animatable, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$bodyAndFooterFadeIn = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$bodyAndFooterFadeIn, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVectors2> animatable = this.$bodyAndFooterFadeIn;
                    Float fBoxFloat = boxing.boxFloat(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, CryptoFeeTierUpgradedComposableKt.easing, 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

        /* compiled from: CryptoFeeTierUpgradedComposable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$3", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyTranslationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Animatable<Float, AnimationVectors2> animatable, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$bodyTranslationY = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$bodyTranslationY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVectors2> animatable = this.$bodyTranslationY;
                    Float fBoxFloat = boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, CryptoFeeTierUpgradedComposableKt.easing, 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

        /* compiled from: CryptoFeeTierUpgradedComposable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$4", m3645f = "CryptoFeeTierUpgradedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVectors2> $footerTranslationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Animatable<Float, AnimationVectors2> animatable, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$footerTranslationY = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$footerTranslationY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVectors2> animatable = this.$footerTranslationY;
                    Float fBoxFloat = boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, CryptoFeeTierUpgradedComposableKt.easing, 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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
}
