package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors3;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SegmentedLineAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.charts.segmented.SegmentedLineAnimationKt$animatePointListAsState$1$1$1$2$1", m3645f = "SegmentedLineAnimation.kt", m3646l = {81}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.segmented.SegmentedLineAnimationKt$animatePointListAsState$1$1$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SegmentedLineAnimation3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Point, AnimationVectors3> $animatable;
    final /* synthetic */ List<Animatable<Point, AnimationVectors3>> $animatablePoints;

    /* renamed from: $i */
    final /* synthetic */ int f3970$i;
    final /* synthetic */ Ref.IntRef $numFinished;
    final /* synthetic */ ImmutableList<Point> $targetSegment;
    final /* synthetic */ List<Point> $targetSegmentProcessed;
    final /* synthetic */ AnimationSpec<Point> $useAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedLineAnimation3(int i, List<Animatable<Point, AnimationVectors3>> list, List<Point> list2, Animatable<Point, AnimationVectors3> animatable, AnimationSpec<Point> animationSpec, Ref.IntRef intRef, ImmutableList<Point> immutableList, Continuation<? super SegmentedLineAnimation3> continuation) {
        super(2, continuation);
        this.f3970$i = i;
        this.$animatablePoints = list;
        this.$targetSegmentProcessed = list2;
        this.$animatable = animatable;
        this.$useAnimation = animationSpec;
        this.$numFinished = intRef;
        this.$targetSegment = immutableList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SegmentedLineAnimation3(this.f3970$i, this.$animatablePoints, this.$targetSegmentProcessed, this.$animatable, this.$useAnimation, this.$numFinished, this.$targetSegment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SegmentedLineAnimation3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SegmentedLineAnimation3 segmentedLineAnimation3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int iDeriveIndex = SegmentedLineAnimation.deriveIndex(this.f3970$i, this.$animatablePoints.size(), this.$targetSegmentProcessed.size());
            Animatable<Point, AnimationVectors3> animatable = this.$animatable;
            Point point = this.$targetSegmentProcessed.get(iDeriveIndex);
            AnimationSpec<Point> animationSpec = this.$useAnimation;
            this.label = 1;
            segmentedLineAnimation3 = this;
            if (Animatable.animateTo$default(animatable, point, animationSpec, null, null, segmentedLineAnimation3, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            segmentedLineAnimation3 = this;
        }
        Ref.IntRef intRef = segmentedLineAnimation3.$numFinished;
        int i2 = intRef.element + 1;
        intRef.element = i2;
        if (i2 == segmentedLineAnimation3.$animatablePoints.size()) {
            ImmutableList<Point> immutableList = segmentedLineAnimation3.$targetSegment;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<Point> it = immutableList.iterator();
            while (it.hasNext()) {
                arrayList.add(PointAnimatable.animatable(it.next()));
            }
            Animatable[] animatableArr = (Animatable[]) arrayList.toArray(new Animatable[0]);
            List listListOf = CollectionsKt.listOf(Arrays.copyOf(animatableArr, animatableArr.length));
            segmentedLineAnimation3.$animatablePoints.clear();
            segmentedLineAnimation3.$animatablePoints.addAll(listListOf);
        }
        return Unit.INSTANCE;
    }
}
