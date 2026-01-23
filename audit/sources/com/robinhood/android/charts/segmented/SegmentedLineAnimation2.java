package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors3;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.ArrayList;
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
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SegmentedLineAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.charts.segmented.SegmentedLineAnimationKt$animatePointListAsState$1$1", m3645f = "SegmentedLineAnimation.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.segmented.SegmentedLineAnimationKt$animatePointListAsState$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SegmentedLineAnimation2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Animatable<Point, AnimationVectors3>> $animatablePoints;
    final /* synthetic */ ImmutableList<Point> $targetSegment;
    final /* synthetic */ AnimationSpec<Point> $useAnimation;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedLineAnimation2(ImmutableList<Point> immutableList, List<Animatable<Point, AnimationVectors3>> list, AnimationSpec<Point> animationSpec, Continuation<? super SegmentedLineAnimation2> continuation) {
        super(2, continuation);
        this.$targetSegment = immutableList;
        this.$animatablePoints = list;
        this.$useAnimation = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SegmentedLineAnimation2 segmentedLineAnimation2 = new SegmentedLineAnimation2(this.$targetSegment, this.$animatablePoints, this.$useAnimation, continuation);
        segmentedLineAnimation2.L$0 = obj;
        return segmentedLineAnimation2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SegmentedLineAnimation2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        if (this.$targetSegment.isEmpty()) {
            return Unit.INSTANCE;
        }
        float fCoerceAtMost = RangesKt.coerceAtMost(1.0f / CollectionsKt.distinct(this.$targetSegment).size(), 1.0f / CollectionsKt.distinct(this.$animatablePoints).size());
        List<Point> listPreProcessDensity = SegmentedLineAnimation.preProcessDensity(this.$targetSegment, fCoerceAtMost);
        List<Animatable<Point, AnimationVectors3>> list = this.$animatablePoints;
        AnimationSpec<Point> animationSpec = this.$useAnimation;
        ImmutableList<Point> immutableList = this.$targetSegment;
        if (listPreProcessDensity.size() != list.size()) {
            List<Animatable<Point, AnimationVectors3>> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((Point) ((Animatable) it.next()).getValue());
            }
            List<Point> listNormalizeLists = SegmentedLineAnimation.normalizeLists(SegmentedLineAnimation.preProcessDensity(arrayList, fCoerceAtMost), listPreProcessDensity);
            list.clear();
            List<Point> list3 = listNormalizeLists;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(PointAnimatable.animatable((Point) it2.next()));
            }
            list.addAll(arrayList2);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SegmentedLineAnimation3(i, list, listPreProcessDensity, (Animatable) obj2, animationSpec, intRef, immutableList, null), 3, null);
            listPreProcessDensity = listPreProcessDensity;
            list = list;
            animationSpec = animationSpec;
            intRef = intRef;
            i = i2;
        }
        return Unit.INSTANCE;
    }
}
