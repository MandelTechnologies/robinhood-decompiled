package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.List;
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

/* compiled from: AllocationBar.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$1$1", m3645f = "AllocationBar.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AllocationBarKt$AllocationsIsometricBar$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<List<Animatable<Float, AnimationVectors2>>> $animatablesForPosition$delegate;
    final /* synthetic */ CubicBezierEasing $easeOutCubic;
    final /* synthetic */ SnapshotState<List<Float>> $previousXPositions$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $targetXPositions$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllocationBarKt$AllocationsIsometricBar$1$1(SnapshotState<List<Float>> snapshotState, CubicBezierEasing cubicBezierEasing, SnapshotState<List<Float>> snapshotState2, SnapshotState<List<Animatable<Float, AnimationVectors2>>> snapshotState3, Continuation<? super AllocationBarKt$AllocationsIsometricBar$1$1> continuation) {
        super(2, continuation);
        this.$previousXPositions$delegate = snapshotState;
        this.$easeOutCubic = cubicBezierEasing;
        this.$targetXPositions$delegate = snapshotState2;
        this.$animatablesForPosition$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AllocationBarKt$AllocationsIsometricBar$1$1 allocationBarKt$AllocationsIsometricBar$1$1 = new AllocationBarKt$AllocationsIsometricBar$1$1(this.$previousXPositions$delegate, this.$easeOutCubic, this.$targetXPositions$delegate, this.$animatablesForPosition$delegate, continuation);
        allocationBarKt$AllocationsIsometricBar$1$1.L$0 = obj;
        return allocationBarKt$AllocationsIsometricBar$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AllocationBarKt$AllocationsIsometricBar$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ArrayList arrayList = new ArrayList();
        int size = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$37(this.$previousXPositions$delegate).size();
        int i = 0;
        while (i < size) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C195311(i, arrayList, this.$easeOutCubic, this.$previousXPositions$delegate, this.$targetXPositions$delegate, null), 3, null);
            i++;
            arrayList = arrayList;
        }
        this.$animatablesForPosition$delegate.setValue(arrayList);
        return Unit.INSTANCE;
    }

    /* compiled from: AllocationBar.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$1$1$1", m3645f = "AllocationBar.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$1$1$1 */
    static final class C195311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CubicBezierEasing $easeOutCubic;

        /* renamed from: $i */
        final /* synthetic */ int f4239$i;
        final /* synthetic */ List<Animatable<Float, AnimationVectors2>> $newAnimationList;
        final /* synthetic */ SnapshotState<List<Float>> $previousXPositions$delegate;
        final /* synthetic */ SnapshotState<List<Float>> $targetXPositions$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C195311(int i, List<Animatable<Float, AnimationVectors2>> list, CubicBezierEasing cubicBezierEasing, SnapshotState<List<Float>> snapshotState, SnapshotState<List<Float>> snapshotState2, Continuation<? super C195311> continuation) {
            super(2, continuation);
            this.f4239$i = i;
            this.$newAnimationList = list;
            this.$easeOutCubic = cubicBezierEasing;
            this.$previousXPositions$delegate = snapshotState;
            this.$targetXPositions$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195311(this.f4239$i, this.$newAnimationList, this.$easeOutCubic, this.$previousXPositions$delegate, this.$targetXPositions$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C195311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatableAnimatable$default = Animatable2.Animatable$default(((Number) AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$37(this.$previousXPositions$delegate).get(this.f4239$i)).floatValue(), 0.0f, 2, null);
                this.$newAnimationList.add(animatableAnimatable$default);
                Object obj2 = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$41(this.$targetXPositions$delegate).get(this.f4239$i);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, this.$easeOutCubic, 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatableAnimatable$default, obj2, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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
