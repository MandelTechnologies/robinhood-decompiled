package com.robinhood.android.designsystem.chart;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BlockRegion.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/BlockRegion;", "", "identifier", "", "weight", "", AnnotatedPrivateKey.LABEL, "defaultColor", "", "segmentWeights", "", "segmentLabel", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getWeight", "()F", "getLabel", "getDefaultColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSegmentWeights", "()Ljava/util/List;", "getSegmentLabel", "segmentTotal", "getSegmentTotal$lib_design_system_externalDebug", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/android/designsystem/chart/BlockRegion;", "equals", "", "other", "hashCode", "toString", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockRegion {
    private final Integer defaultColor;
    private final String identifier;
    private final String label;
    private final String segmentLabel;
    private final float segmentTotal;
    private final List<Float> segmentWeights;
    private final float weight;

    public static /* synthetic */ BlockRegion copy$default(BlockRegion blockRegion, String str, float f, String str2, Integer num, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockRegion.identifier;
        }
        if ((i & 2) != 0) {
            f = blockRegion.weight;
        }
        if ((i & 4) != 0) {
            str2 = blockRegion.label;
        }
        if ((i & 8) != 0) {
            num = blockRegion.defaultColor;
        }
        if ((i & 16) != 0) {
            list = blockRegion.segmentWeights;
        }
        if ((i & 32) != 0) {
            str3 = blockRegion.segmentLabel;
        }
        List list2 = list;
        String str4 = str3;
        return blockRegion.copy(str, f, str2, num, list2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getDefaultColor() {
        return this.defaultColor;
    }

    public final List<Float> component5() {
        return this.segmentWeights;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSegmentLabel() {
        return this.segmentLabel;
    }

    public final BlockRegion copy(String identifier, float weight, String label, Integer defaultColor, List<Float> segmentWeights, String segmentLabel) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(segmentWeights, "segmentWeights");
        return new BlockRegion(identifier, weight, label, defaultColor, segmentWeights, segmentLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockRegion)) {
            return false;
        }
        BlockRegion blockRegion = (BlockRegion) other;
        return Intrinsics.areEqual(this.identifier, blockRegion.identifier) && Float.compare(this.weight, blockRegion.weight) == 0 && Intrinsics.areEqual(this.label, blockRegion.label) && Intrinsics.areEqual(this.defaultColor, blockRegion.defaultColor) && Intrinsics.areEqual(this.segmentWeights, blockRegion.segmentWeights) && Intrinsics.areEqual(this.segmentLabel, blockRegion.segmentLabel);
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + Float.hashCode(this.weight)) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.defaultColor;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.segmentWeights.hashCode()) * 31;
        String str2 = this.segmentLabel;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BlockRegion(identifier=" + this.identifier + ", weight=" + this.weight + ", label=" + this.label + ", defaultColor=" + this.defaultColor + ", segmentWeights=" + this.segmentWeights + ", segmentLabel=" + this.segmentLabel + ")";
    }

    public BlockRegion(String identifier, float f, String str, Integer num, List<Float> segmentWeights, String str2) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(segmentWeights, "segmentWeights");
        this.identifier = identifier;
        this.weight = f;
        this.label = str;
        this.defaultColor = num;
        this.segmentWeights = segmentWeights;
        this.segmentLabel = str2;
        this.segmentTotal = CollectionsKt.sumOfFloat(segmentWeights);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getDefaultColor() {
        return this.defaultColor;
    }

    public /* synthetic */ BlockRegion(String str, float f, String str2, Integer num, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : str3);
    }

    public final List<Float> getSegmentWeights() {
        return this.segmentWeights;
    }

    public final String getSegmentLabel() {
        return this.segmentLabel;
    }

    /* renamed from: getSegmentTotal$lib_design_system_externalDebug, reason: from getter */
    public final float getSegmentTotal() {
        return this.segmentTotal;
    }
}
