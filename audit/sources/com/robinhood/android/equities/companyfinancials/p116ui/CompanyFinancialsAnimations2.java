package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.PointDto;

/* compiled from: CompanyFinancialsAnimations.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1", m3645f = "CompanyFinancialsAnimations.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class CompanyFinancialsAnimations2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<Animatable<PointDto, AnimationVectors3>> $animatablePoints;
    final /* synthetic */ boolean $hasAllRoundedCorners;
    final /* synthetic */ PointDto $targetBottomLeft;
    final /* synthetic */ PointDto $targetBottomRight;
    final /* synthetic */ PointDto $targetTopLeft;
    final /* synthetic */ PointDto $targetTopRight;
    final /* synthetic */ AnimationSpec<PointDto> $useAnimation;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanyFinancialsAnimations2(boolean z, SnapshotStateList<Animatable<PointDto, AnimationVectors3>> snapshotStateList, PointDto pointDto, AnimationSpec<PointDto> animationSpec, PointDto pointDto2, PointDto pointDto3, PointDto pointDto4, Continuation<? super CompanyFinancialsAnimations2> continuation) {
        super(2, continuation);
        this.$hasAllRoundedCorners = z;
        this.$animatablePoints = snapshotStateList;
        this.$targetTopLeft = pointDto;
        this.$useAnimation = animationSpec;
        this.$targetTopRight = pointDto2;
        this.$targetBottomRight = pointDto3;
        this.$targetBottomLeft = pointDto4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CompanyFinancialsAnimations2 companyFinancialsAnimations2 = new CompanyFinancialsAnimations2(this.$hasAllRoundedCorners, this.$animatablePoints, this.$targetTopLeft, this.$useAnimation, this.$targetTopRight, this.$targetBottomRight, this.$targetBottomLeft, continuation);
        companyFinancialsAnimations2.L$0 = obj;
        return companyFinancialsAnimations2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompanyFinancialsAnimations2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C146241(this.$animatablePoints, this.$targetTopLeft, this.$useAnimation, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C146252(this.$animatablePoints, this.$targetTopRight, this.$useAnimation, null), 3, null);
            if (this.$hasAllRoundedCorners) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C146263(this.$animatablePoints, this.$targetBottomRight, this.$useAnimation, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C146274(this.$animatablePoints, this.$targetBottomLeft, this.$useAnimation, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: CompanyFinancialsAnimations.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$1", m3645f = "CompanyFinancialsAnimations.kt", m3646l = {167}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$1 */
    static final class C146241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotStateList<Animatable<PointDto, AnimationVectors3>> $animatablePoints;
        final /* synthetic */ PointDto $targetTopLeft;
        final /* synthetic */ AnimationSpec<PointDto> $useAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146241(SnapshotStateList<Animatable<PointDto, AnimationVectors3>> snapshotStateList, PointDto pointDto, AnimationSpec<PointDto> animationSpec, Continuation<? super C146241> continuation) {
            super(2, continuation);
            this.$animatablePoints = snapshotStateList;
            this.$targetTopLeft = pointDto;
            this.$useAnimation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146241(this.$animatablePoints, this.$targetTopLeft, this.$useAnimation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<PointDto, AnimationVectors3> animatable = this.$animatablePoints.get(0);
                PointDto pointDto = this.$targetTopLeft;
                AnimationSpec<PointDto> animationSpec = this.$useAnimation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, pointDto, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

    /* compiled from: CompanyFinancialsAnimations.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$2", m3645f = "CompanyFinancialsAnimations.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$2 */
    static final class C146252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotStateList<Animatable<PointDto, AnimationVectors3>> $animatablePoints;
        final /* synthetic */ PointDto $targetTopRight;
        final /* synthetic */ AnimationSpec<PointDto> $useAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146252(SnapshotStateList<Animatable<PointDto, AnimationVectors3>> snapshotStateList, PointDto pointDto, AnimationSpec<PointDto> animationSpec, Continuation<? super C146252> continuation) {
            super(2, continuation);
            this.$animatablePoints = snapshotStateList;
            this.$targetTopRight = pointDto;
            this.$useAnimation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146252(this.$animatablePoints, this.$targetTopRight, this.$useAnimation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<PointDto, AnimationVectors3> animatable = this.$animatablePoints.get(1);
                PointDto pointDto = this.$targetTopRight;
                AnimationSpec<PointDto> animationSpec = this.$useAnimation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, pointDto, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

    /* compiled from: CompanyFinancialsAnimations.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$3", m3645f = "CompanyFinancialsAnimations.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$3 */
    static final class C146263 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotStateList<Animatable<PointDto, AnimationVectors3>> $animatablePoints;
        final /* synthetic */ PointDto $targetBottomRight;
        final /* synthetic */ AnimationSpec<PointDto> $useAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146263(SnapshotStateList<Animatable<PointDto, AnimationVectors3>> snapshotStateList, PointDto pointDto, AnimationSpec<PointDto> animationSpec, Continuation<? super C146263> continuation) {
            super(2, continuation);
            this.$animatablePoints = snapshotStateList;
            this.$targetBottomRight = pointDto;
            this.$useAnimation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146263(this.$animatablePoints, this.$targetBottomRight, this.$useAnimation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146263) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<PointDto, AnimationVectors3> animatable = this.$animatablePoints.get(2);
                PointDto pointDto = this.$targetBottomRight;
                AnimationSpec<PointDto> animationSpec = this.$useAnimation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, pointDto, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

    /* compiled from: CompanyFinancialsAnimations.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$4", m3645f = "CompanyFinancialsAnimations.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$animateBarFillAsState$1$1$4 */
    static final class C146274 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotStateList<Animatable<PointDto, AnimationVectors3>> $animatablePoints;
        final /* synthetic */ PointDto $targetBottomLeft;
        final /* synthetic */ AnimationSpec<PointDto> $useAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146274(SnapshotStateList<Animatable<PointDto, AnimationVectors3>> snapshotStateList, PointDto pointDto, AnimationSpec<PointDto> animationSpec, Continuation<? super C146274> continuation) {
            super(2, continuation);
            this.$animatablePoints = snapshotStateList;
            this.$targetBottomLeft = pointDto;
            this.$useAnimation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146274(this.$animatablePoints, this.$targetBottomLeft, this.$useAnimation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146274) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<PointDto, AnimationVectors3> animatable = this.$animatablePoints.get(3);
                PointDto pointDto = this.$targetBottomLeft;
                AnimationSpec<PointDto> animationSpec = this.$useAnimation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, pointDto, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
