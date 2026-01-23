package androidx.compose.material;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Chip.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0019\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/material/ChipDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "filterChipColors", "Landroidx/compose/ui/unit/Dp;", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "LeadingIconSize", "getLeadingIconSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.ChipDefaults, reason: use source file name */
/* loaded from: classes4.dex */
public final class Chip2 {
    public static final Chip2 INSTANCE = new Chip2();
    private static final float MinHeight = C2002Dp.m7995constructorimpl(32);
    private static final float OutlinedBorderSize = C2002Dp.m7995constructorimpl(1);
    private static final float LeadingIconSize = C2002Dp.m7995constructorimpl(20);
    private static final float SelectedIconSize = C2002Dp.m7995constructorimpl(18);

    private Chip2() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5551getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final Chip5 m5550filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        long jM6732compositeOverOWjLjI;
        long jM6732compositeOverOWjLjI2;
        long j10;
        long jM6705copywmQWz5c$default;
        long j11;
        long jM6705copywmQWz5c$default2;
        long j12;
        long jM6732compositeOverOWjLjI3;
        long j13;
        long jM6732compositeOverOWjLjI4;
        long j14;
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM6732compositeOverOWjLjI = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(materialTheme.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m5563getSurface0d7_KjU());
        } else {
            jM6732compositeOverOWjLjI = j;
        }
        long jM6705copywmQWz5c$default3 = (i2 & 2) != 0 ? Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM6705copywmQWz5c$default4 = (i2 & 4) != 0 ? Color.m6705copywmQWz5c$default(jM6705copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM6732compositeOverOWjLjI2 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(materialTheme2.getColors(composer, 6).m5558getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m5563getSurface0d7_KjU());
        } else {
            jM6732compositeOverOWjLjI2 = j4;
        }
        if ((i2 & 16) != 0) {
            long j15 = jM6705copywmQWz5c$default3;
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j10 = j15;
        } else {
            j10 = jM6705copywmQWz5c$default3;
            jM6705copywmQWz5c$default = j5;
        }
        if ((i2 & 32) != 0) {
            long j16 = jM6705copywmQWz5c$default4;
            jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j16;
        } else {
            j11 = jM6705copywmQWz5c$default4;
            jM6705copywmQWz5c$default2 = j6;
        }
        if ((i2 & 64) != 0) {
            j12 = jM6705copywmQWz5c$default2;
            jM6732compositeOverOWjLjI3 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM6732compositeOverOWjLjI);
        } else {
            j12 = jM6705copywmQWz5c$default2;
            jM6732compositeOverOWjLjI3 = j7;
        }
        if ((i2 & 128) != 0) {
            j13 = jM6732compositeOverOWjLjI;
            jM6732compositeOverOWjLjI4 = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j10);
        } else {
            j13 = jM6732compositeOverOWjLjI;
            jM6732compositeOverOWjLjI4 = j8;
        }
        long jM6732compositeOverOWjLjI5 = (i2 & 256) != 0 ? Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j11) : j9;
        if (ComposerKt.isTraceInProgress()) {
            j14 = jM6732compositeOverOWjLjI5;
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:476)");
        } else {
            j14 = jM6732compositeOverOWjLjI5;
        }
        long j17 = jM6732compositeOverOWjLjI2;
        long j18 = j10;
        long j19 = j11;
        long j20 = j13;
        Chip4 chip4 = new Chip4(j20, j18, j19, j17, jM6705copywmQWz5c$default, j12, jM6732compositeOverOWjLjI3, jM6732compositeOverOWjLjI4, j14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chip4;
    }
}
