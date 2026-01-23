package com.robinhood.android.advisory.projection;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ResourceTypes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, m3636d2 = {"dashed", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "startFraction", "Landroidx/compose/ui/geometry/Offset;", "endFraction", "lineThickness", "Landroidx/compose/ui/unit/Dp;", "dashLength", "gapLength", "dashed-tGfji40", "(Landroidx/compose/ui/Modifier;JJJFFF)Landroidx/compose/ui/Modifier;", "generateMoneyList", "", "Lcom/robinhood/models/util/Money;", "sliderMinimumValue", "", "sliderMaximumValue", "sliderIncrementValue", "currency", "Ljava/util/Currency;", "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilsKt {
    /* renamed from: dashed-tGfji40, reason: not valid java name */
    public static final Modifier m11197dashedtGfji40(Modifier dashed, final long j, final long j2, final long j3, final float f, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(dashed, "$this$dashed");
        return dashed.then(DrawModifierKt.drawWithCache(Modifier.INSTANCE, new Function1() { // from class: com.robinhood.android.advisory.projection.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtilsKt.dashed_tGfji40$lambda$1(f, f2, f3, j2, j3, j, (CacheDrawScope) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult dashed_tGfji40$lambda$1(float f, float f2, float f3, long j, long j2, final long j3, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final float fMo5016toPx0680j_4 = drawWithCache.mo5016toPx0680j_4(f);
        final PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{drawWithCache.mo5016toPx0680j_4(f2), drawWithCache.mo5016toPx0680j_4(f3)}, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        final long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        final long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.advisory.projection.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtilsKt.dashed_tGfji40$lambda$1$lambda$0(j3, jM6535constructorimpl, jM6535constructorimpl2, fMo5016toPx0680j_4, pathEffectDashPathEffect, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dashed_tGfji40$lambda$1$lambda$0(long j, long j2, long j3, float f, PathEffect pathEffect, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6951drawLineNGM6Ib0$default(onDrawBehind, j, j2, j3, f, StrokeCap.INSTANCE.m6848getButtKaPHkGw(), pathEffect, 0.0f, null, 0, 448, null);
        return Unit.INSTANCE;
    }

    public static final List<Money> generateMoneyList(double d, double d2, double d3, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        ArrayList arrayList = new ArrayList();
        while (d <= d2) {
            arrayList.add(new Money(currency, new BigDecimal(String.valueOf(d))));
            d += d3;
        }
        return arrayList;
    }
}
