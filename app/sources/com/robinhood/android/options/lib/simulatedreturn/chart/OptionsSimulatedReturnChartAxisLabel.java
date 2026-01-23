package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChartAxis.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003JX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "", "text", "", "position", "", "lineColor", "Landroidx/compose/ui/graphics/Color;", "lineDrawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textColor", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "isPriority", "", "<init>", "(Ljava/lang/String;FJLandroidx/compose/ui/graphics/drawscope/DrawStyle;JLandroidx/compose/ui/text/font/FontWeight;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getPosition", "()F", "getLineColor-0d7_KjU", "()J", "J", "getLineDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getTextColor-0d7_KjU", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "()Z", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component5", "component5-0d7_KjU", "component6", "component7", "copy", "copy-_759gn8", "(Ljava/lang/String;FJLandroidx/compose/ui/graphics/drawscope/DrawStyle;JLandroidx/compose/ui/text/font/FontWeight;Z)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "equals", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnChartAxisLabel {
    public static final int $stable = 8;
    private final FontWeight fontWeight;
    private final boolean isPriority;
    private final long lineColor;
    private final DrawScope2 lineDrawStyle;
    private final float position;
    private final String text;
    private final long textColor;

    public /* synthetic */ OptionsSimulatedReturnChartAxisLabel(String str, float f, long j, DrawScope2 drawScope2, long j2, FontWeight fontWeight, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, j, drawScope2, j2, fontWeight, z);
    }

    /* renamed from: copy-_759gn8$default, reason: not valid java name */
    public static /* synthetic */ OptionsSimulatedReturnChartAxisLabel m16934copy_759gn8$default(OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, String str, float f, long j, DrawScope2 drawScope2, long j2, FontWeight fontWeight, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsSimulatedReturnChartAxisLabel.text;
        }
        if ((i & 2) != 0) {
            f = optionsSimulatedReturnChartAxisLabel.position;
        }
        if ((i & 4) != 0) {
            j = optionsSimulatedReturnChartAxisLabel.lineColor;
        }
        if ((i & 8) != 0) {
            drawScope2 = optionsSimulatedReturnChartAxisLabel.lineDrawStyle;
        }
        if ((i & 16) != 0) {
            j2 = optionsSimulatedReturnChartAxisLabel.textColor;
        }
        if ((i & 32) != 0) {
            fontWeight = optionsSimulatedReturnChartAxisLabel.fontWeight;
        }
        if ((i & 64) != 0) {
            z = optionsSimulatedReturnChartAxisLabel.isPriority;
        }
        DrawScope2 drawScope22 = drawScope2;
        long j3 = j;
        return optionsSimulatedReturnChartAxisLabel.m16937copy_759gn8(str, f, j3, drawScope22, j2, fontWeight, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPosition() {
        return this.position;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getLineColor() {
        return this.lineColor;
    }

    /* renamed from: component4, reason: from getter */
    public final DrawScope2 getLineDrawStyle() {
        return this.lineDrawStyle;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component6, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPriority() {
        return this.isPriority;
    }

    /* renamed from: copy-_759gn8, reason: not valid java name */
    public final OptionsSimulatedReturnChartAxisLabel m16937copy_759gn8(String text, float position, long lineColor, DrawScope2 lineDrawStyle, long textColor, FontWeight fontWeight, boolean isPriority) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(lineDrawStyle, "lineDrawStyle");
        return new OptionsSimulatedReturnChartAxisLabel(text, position, lineColor, lineDrawStyle, textColor, fontWeight, isPriority, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnChartAxisLabel)) {
            return false;
        }
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = (OptionsSimulatedReturnChartAxisLabel) other;
        return Intrinsics.areEqual(this.text, optionsSimulatedReturnChartAxisLabel.text) && Float.compare(this.position, optionsSimulatedReturnChartAxisLabel.position) == 0 && Color.m6707equalsimpl0(this.lineColor, optionsSimulatedReturnChartAxisLabel.lineColor) && Intrinsics.areEqual(this.lineDrawStyle, optionsSimulatedReturnChartAxisLabel.lineDrawStyle) && Color.m6707equalsimpl0(this.textColor, optionsSimulatedReturnChartAxisLabel.textColor) && Intrinsics.areEqual(this.fontWeight, optionsSimulatedReturnChartAxisLabel.fontWeight) && this.isPriority == optionsSimulatedReturnChartAxisLabel.isPriority;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.text.hashCode() * 31) + Float.hashCode(this.position)) * 31) + Color.m6713hashCodeimpl(this.lineColor)) * 31) + this.lineDrawStyle.hashCode()) * 31) + Color.m6713hashCodeimpl(this.textColor)) * 31;
        FontWeight fontWeight = this.fontWeight;
        return ((iHashCode + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31) + Boolean.hashCode(this.isPriority);
    }

    public String toString() {
        return "OptionsSimulatedReturnChartAxisLabel(text=" + this.text + ", position=" + this.position + ", lineColor=" + Color.m6714toStringimpl(this.lineColor) + ", lineDrawStyle=" + this.lineDrawStyle + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ", fontWeight=" + this.fontWeight + ", isPriority=" + this.isPriority + ")";
    }

    private OptionsSimulatedReturnChartAxisLabel(String text, float f, long j, DrawScope2 lineDrawStyle, long j2, FontWeight fontWeight, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(lineDrawStyle, "lineDrawStyle");
        this.text = text;
        this.position = f;
        this.lineColor = j;
        this.lineDrawStyle = lineDrawStyle;
        this.textColor = j2;
        this.fontWeight = fontWeight;
        this.isPriority = z;
    }

    public /* synthetic */ OptionsSimulatedReturnChartAxisLabel(String str, float f, long j, DrawScope2 drawScope2, long j2, FontWeight fontWeight, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, j, drawScope2, j2, (i & 32) != 0 ? null : fontWeight, (i & 64) != 0 ? false : z, null);
    }

    public final String getText() {
        return this.text;
    }

    public final float getPosition() {
        return this.position;
    }

    /* renamed from: getLineColor-0d7_KjU, reason: not valid java name */
    public final long m16938getLineColor0d7_KjU() {
        return this.lineColor;
    }

    public final DrawScope2 getLineDrawStyle() {
        return this.lineDrawStyle;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m16939getTextColor0d7_KjU() {
        return this.textColor;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final boolean isPriority() {
        return this.isPriority;
    }
}
