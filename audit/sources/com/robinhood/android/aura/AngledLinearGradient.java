package com.robinhood.android.aura;

import android.graphics.Shader;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.TileMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AngledLinearGradient.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B=\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/aura/AngledLinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "Lkotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/ui/graphics/Color;", "stops", "", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "angleInDegrees", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;IFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "normalizedAngle", "angleInRadians", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "getGradientCoordinates", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Offset;", "getGradientCoordinates-uvyYCjk", "(J)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-aura_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AngledLinearGradient extends Brush5 {
    public static final int $stable = 0;
    private final float angleInRadians;
    private final ImmutableList<Color> colors;
    private final float normalizedAngle;
    private final ImmutableList<Float> stops;
    private final int tileMode;

    public /* synthetic */ AngledLinearGradient(ImmutableList immutableList, ImmutableList immutableList2, int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, immutableList2, i, f);
    }

    /* renamed from: getGradientCoordinates-uvyYCjk, reason: not valid java name */
    private final Tuples2<Offset, Offset> m11340getGradientCoordinatesuvyYCjk(long size) {
        float f;
        int i = (int) (size >> 32);
        double d = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat(i), d)) + ((float) Math.pow(Float.intBitsToFloat((int) (size & 4294967295L)), d)));
        float fAcos = (float) Math.acos(Float.intBitsToFloat(i) / fSqrt);
        float f2 = this.normalizedAngle;
        if ((f2 > 90.0f && f2 < 180.0f) || (f2 > 270.0f && f2 < 360.0f)) {
            f = 3.1415927f - this.angleInRadians;
        } else {
            f = this.angleInRadians;
        }
        float fAbs = Math.abs(((float) Math.cos(f - fAcos)) * fSqrt) / 2;
        float fCos = ((float) Math.cos(this.angleInRadians)) * fAbs;
        float fSin = fAbs * ((float) Math.sin(this.angleInRadians));
        return Tuples4.m3642to(Offset.m6534boximpl(Offset.m6547plusMKHz9U(SizeKt.m6590getCenteruvyYCjk(size), Offset.m6535constructorimpl((Float.floatToRawIntBits(-fCos) << 32) | (Float.floatToRawIntBits(fSin) & 4294967295L)))), Offset.m6534boximpl(Offset.m6547plusMKHz9U(SizeKt.m6590getCenteruvyYCjk(size), Offset.m6535constructorimpl((Float.floatToRawIntBits(-fSin) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32)))));
    }

    public /* synthetic */ AngledLinearGradient(ImmutableList immutableList, ImmutableList immutableList2, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i2 & 2) != 0 ? null : immutableList2, (i2 & 4) != 0 ? TileMode.INSTANCE.m6862getClamp3opZhB0() : i, (i2 & 8) != 0 ? 0.0f : f, null);
    }

    private AngledLinearGradient(ImmutableList<Color> colors, ImmutableList<Float> immutableList, int i, float f) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        this.stops = immutableList;
        this.tileMode = i;
        float f2 = 360;
        float f3 = ((f % f2) + f2) % f2;
        this.normalizedAngle = f3;
        this.angleInRadians = (float) Math.toRadians(f3);
    }

    @Override // androidx.compose.p011ui.graphics.Brush5
    /* renamed from: createShader-uvyYCjk */
    public Shader mo6692createShaderuvyYCjk(long size) {
        Tuples2<Offset, Offset> tuples2M11340getGradientCoordinatesuvyYCjk = m11340getGradientCoordinatesuvyYCjk(size);
        return androidx.compose.p011ui.graphics.Shader.m6830LinearGradientShaderVjE6UOU(tuples2M11340getGradientCoordinatesuvyYCjk.component1().getPackedValue(), tuples2M11340getGradientCoordinatesuvyYCjk.component2().getPackedValue(), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AngledLinearGradient)) {
            return false;
        }
        AngledLinearGradient angledLinearGradient = (AngledLinearGradient) other;
        return Intrinsics.areEqual(this.colors, angledLinearGradient.colors) && Intrinsics.areEqual(this.stops, angledLinearGradient.stops) && TileMode.m6859equalsimpl0(this.tileMode, angledLinearGradient.tileMode) && this.normalizedAngle == angledLinearGradient.normalizedAngle && this.angleInRadians == angledLinearGradient.angleInRadians;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        ImmutableList<Float> immutableList = this.stops;
        return ((((((iHashCode + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + TileMode.m6860hashCodeimpl(this.tileMode)) * 31) + Float.hashCode(this.normalizedAngle)) * 31) + Float.hashCode(this.angleInRadians);
    }

    public String toString() {
        return "AngledLinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", tileMode=" + TileMode.m6861toStringimpl(this.tileMode) + ", normalizedAngle=" + this.normalizedAngle + ", angleInRadians=" + this.angleInRadians + ")";
    }
}
