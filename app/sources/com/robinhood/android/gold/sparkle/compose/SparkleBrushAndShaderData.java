package com.robinhood.android.gold.sparkle.compose;

import android.graphics.Shader;
import androidx.compose.p011ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSparkleBrush.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/compose/SparkleBrushAndShaderData;", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "shader", "Landroid/graphics/Shader;", "<init>", "(Landroidx/compose/ui/graphics/Brush;Landroid/graphics/Shader;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getShader", "()Landroid/graphics/Shader;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-gold-sparkle-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparkleBrushAndShaderData {
    public static final int $stable = 8;
    private final Brush brush;
    private final Shader shader;

    public static /* synthetic */ SparkleBrushAndShaderData copy$default(SparkleBrushAndShaderData sparkleBrushAndShaderData, Brush brush, Shader shader, int i, Object obj) {
        if ((i & 1) != 0) {
            brush = sparkleBrushAndShaderData.brush;
        }
        if ((i & 2) != 0) {
            shader = sparkleBrushAndShaderData.shader;
        }
        return sparkleBrushAndShaderData.copy(brush, shader);
    }

    /* renamed from: component1, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: component2, reason: from getter */
    public final Shader getShader() {
        return this.shader;
    }

    public final SparkleBrushAndShaderData copy(Brush brush, Shader shader) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new SparkleBrushAndShaderData(brush, shader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparkleBrushAndShaderData)) {
            return false;
        }
        SparkleBrushAndShaderData sparkleBrushAndShaderData = (SparkleBrushAndShaderData) other;
        return Intrinsics.areEqual(this.brush, sparkleBrushAndShaderData.brush) && Intrinsics.areEqual(this.shader, sparkleBrushAndShaderData.shader);
    }

    public int hashCode() {
        return (this.brush.hashCode() * 31) + this.shader.hashCode();
    }

    public String toString() {
        return "SparkleBrushAndShaderData(brush=" + this.brush + ", shader=" + this.shader + ")";
    }

    public SparkleBrushAndShaderData(Brush brush, Shader shader) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shader, "shader");
        this.brush = brush;
        this.shader = shader;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shader getShader() {
        return this.shader;
    }
}
