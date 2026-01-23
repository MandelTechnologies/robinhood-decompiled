package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PointAnimatable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u0002\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m3636d2 = {"PointTwoWayConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "Landroidx/compose/animation/core/AnimationVector2D;", "getPointTwoWayConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "animatable", "Landroidx/compose/animation/core/Animatable;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.segmented.PointAnimatableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PointAnimatable {
    private static final TwoWayConverter<Point, AnimationVectors3> PointTwoWayConverter = VectorConvertersKt.TwoWayConverter(new Function1() { // from class: com.robinhood.android.charts.segmented.PointAnimatableKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PointAnimatable.PointTwoWayConverter$lambda$0((Point) obj);
        }
    }, new Function1() { // from class: com.robinhood.android.charts.segmented.PointAnimatableKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PointAnimatable.PointTwoWayConverter$lambda$1((AnimationVectors3) obj);
        }
    });

    public static final TwoWayConverter<Point, AnimationVectors3> getPointTwoWayConverter() {
        return PointTwoWayConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 PointTwoWayConverter$lambda$0(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new AnimationVectors3(point.getX(), point.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point PointTwoWayConverter$lambda$1(AnimationVectors3 vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return new Point(vector.getV1(), vector.getV2(), null, 4, null);
    }

    public static final Animatable<Point, AnimationVectors3> animatable(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new Animatable<>(point, PointTwoWayConverter, null, null, 12, null);
    }
}
