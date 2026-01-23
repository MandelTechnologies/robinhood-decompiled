package com.robinhood.android.aura;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.TileMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AngledLinearGradient.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"angledLinearGradient", "Lcom/robinhood/android/aura/AngledLinearGradient;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "angleInDegrees", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "angledLinearGradient-3YTHUZs", "([Lkotlin/Pair;FI)Lcom/robinhood/android/aura/AngledLinearGradient;", "lib-aura_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.aura.AngledLinearGradientKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AngledLinearGradient2 {
    /* renamed from: angledLinearGradient-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ AngledLinearGradient m11342angledLinearGradient3YTHUZs$default(Tuples2[] tuples2Arr, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            i = TileMode.INSTANCE.m6862getClamp3opZhB0();
        }
        return m11341angledLinearGradient3YTHUZs(tuples2Arr, f, i);
    }

    /* renamed from: angledLinearGradient-3YTHUZs, reason: not valid java name */
    public static final AngledLinearGradient m11341angledLinearGradient3YTHUZs(Tuples2<Float, Color>[] colorStops, float f, int i) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        ArrayList arrayList = new ArrayList(colorStops.length);
        for (Tuples2<Float, Color> tuples2 : colorStops) {
            arrayList.add(Color.m6701boximpl(tuples2.getSecond().getValue()));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        ArrayList arrayList2 = new ArrayList(colorStops.length);
        for (Tuples2<Float, Color> tuples22 : colorStops) {
            arrayList2.add(Float.valueOf(tuples22.getFirst().floatValue()));
        }
        return new AngledLinearGradient(immutableList, extensions2.toImmutableList(arrayList2), i, f, null);
    }
}
