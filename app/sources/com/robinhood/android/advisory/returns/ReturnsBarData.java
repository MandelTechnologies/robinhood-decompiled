package com.robinhood.android.advisory.returns;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsBarData;", "", AnnotatedPrivateKey.LABEL, "", "compactValueText", "fullValueText", "valueRatio", "", "colors", "Lcom/robinhood/android/advisory/returns/ReturnsBarColors;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/android/advisory/returns/ReturnsBarColors;)V", "getLabel", "()Ljava/lang/String;", "getCompactValueText", "getFullValueText", "getValueRatio", "()F", "getColors", "()Lcom/robinhood/android/advisory/returns/ReturnsBarColors;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReturnsBarData {
    public static final int $stable = 8;
    private final ReturnsBarColors colors;
    private final String compactValueText;
    private final String fullValueText;
    private final String label;
    private final float valueRatio;

    public static /* synthetic */ ReturnsBarData copy$default(ReturnsBarData returnsBarData, String str, String str2, String str3, float f, ReturnsBarColors returnsBarColors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnsBarData.label;
        }
        if ((i & 2) != 0) {
            str2 = returnsBarData.compactValueText;
        }
        if ((i & 4) != 0) {
            str3 = returnsBarData.fullValueText;
        }
        if ((i & 8) != 0) {
            f = returnsBarData.valueRatio;
        }
        if ((i & 16) != 0) {
            returnsBarColors = returnsBarData.colors;
        }
        ReturnsBarColors returnsBarColors2 = returnsBarColors;
        String str4 = str3;
        return returnsBarData.copy(str, str2, str4, f, returnsBarColors2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCompactValueText() {
        return this.compactValueText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFullValueText() {
        return this.fullValueText;
    }

    /* renamed from: component4, reason: from getter */
    public final float getValueRatio() {
        return this.valueRatio;
    }

    /* renamed from: component5, reason: from getter */
    public final ReturnsBarColors getColors() {
        return this.colors;
    }

    public final ReturnsBarData copy(String label, String compactValueText, String fullValueText, float valueRatio, ReturnsBarColors colors) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(compactValueText, "compactValueText");
        Intrinsics.checkNotNullParameter(fullValueText, "fullValueText");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new ReturnsBarData(label, compactValueText, fullValueText, valueRatio, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnsBarData)) {
            return false;
        }
        ReturnsBarData returnsBarData = (ReturnsBarData) other;
        return Intrinsics.areEqual(this.label, returnsBarData.label) && Intrinsics.areEqual(this.compactValueText, returnsBarData.compactValueText) && Intrinsics.areEqual(this.fullValueText, returnsBarData.fullValueText) && Float.compare(this.valueRatio, returnsBarData.valueRatio) == 0 && Intrinsics.areEqual(this.colors, returnsBarData.colors);
    }

    public int hashCode() {
        return (((((((this.label.hashCode() * 31) + this.compactValueText.hashCode()) * 31) + this.fullValueText.hashCode()) * 31) + Float.hashCode(this.valueRatio)) * 31) + this.colors.hashCode();
    }

    public String toString() {
        return "ReturnsBarData(label=" + this.label + ", compactValueText=" + this.compactValueText + ", fullValueText=" + this.fullValueText + ", valueRatio=" + this.valueRatio + ", colors=" + this.colors + ")";
    }

    public ReturnsBarData(String label, String compactValueText, String fullValueText, float f, ReturnsBarColors colors) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(compactValueText, "compactValueText");
        Intrinsics.checkNotNullParameter(fullValueText, "fullValueText");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.label = label;
        this.compactValueText = compactValueText;
        this.fullValueText = fullValueText;
        this.valueRatio = f;
        this.colors = colors;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getCompactValueText() {
        return this.compactValueText;
    }

    public final String getFullValueText() {
        return this.fullValueText;
    }

    public final float getValueRatio() {
        return this.valueRatio;
    }

    public final ReturnsBarColors getColors() {
        return this.colors;
    }
}
