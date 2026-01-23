package com.robinhood.android.educationtour.compose;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeEducationTourHighlightData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/educationtour/compose/ComposeEducationTourHighlightData;", "", "elementId", "", "parentLocation", "", "elementData", "Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "<init>", "(Ljava/lang/String;[ILcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;)V", "getElementId", "()Ljava/lang/String;", "getParentLocation", "()[I", "getElementData", "()Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ComposeEducationTourHighlightData {
    public static final int $stable = 8;
    private final ComposeEducationTourElementData elementData;
    private final String elementId;
    private final int[] parentLocation;

    public static /* synthetic */ ComposeEducationTourHighlightData copy$default(ComposeEducationTourHighlightData composeEducationTourHighlightData, String str, int[] iArr, ComposeEducationTourElementData composeEducationTourElementData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composeEducationTourHighlightData.elementId;
        }
        if ((i & 2) != 0) {
            iArr = composeEducationTourHighlightData.parentLocation;
        }
        if ((i & 4) != 0) {
            composeEducationTourElementData = composeEducationTourHighlightData.elementData;
        }
        return composeEducationTourHighlightData.copy(str, iArr, composeEducationTourElementData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getElementId() {
        return this.elementId;
    }

    /* renamed from: component2, reason: from getter */
    public final int[] getParentLocation() {
        return this.parentLocation;
    }

    /* renamed from: component3, reason: from getter */
    public final ComposeEducationTourElementData getElementData() {
        return this.elementData;
    }

    public final ComposeEducationTourHighlightData copy(String elementId, int[] parentLocation, ComposeEducationTourElementData elementData) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(parentLocation, "parentLocation");
        Intrinsics.checkNotNullParameter(elementData, "elementData");
        return new ComposeEducationTourHighlightData(elementId, parentLocation, elementData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeEducationTourHighlightData)) {
            return false;
        }
        ComposeEducationTourHighlightData composeEducationTourHighlightData = (ComposeEducationTourHighlightData) other;
        return Intrinsics.areEqual(this.elementId, composeEducationTourHighlightData.elementId) && Intrinsics.areEqual(this.parentLocation, composeEducationTourHighlightData.parentLocation) && Intrinsics.areEqual(this.elementData, composeEducationTourHighlightData.elementData);
    }

    public int hashCode() {
        return (((this.elementId.hashCode() * 31) + Arrays.hashCode(this.parentLocation)) * 31) + this.elementData.hashCode();
    }

    public String toString() {
        return "ComposeEducationTourHighlightData(elementId=" + this.elementId + ", parentLocation=" + Arrays.toString(this.parentLocation) + ", elementData=" + this.elementData + ")";
    }

    public ComposeEducationTourHighlightData(String elementId, int[] parentLocation, ComposeEducationTourElementData elementData) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(parentLocation, "parentLocation");
        Intrinsics.checkNotNullParameter(elementData, "elementData");
        this.elementId = elementId;
        this.parentLocation = parentLocation;
        this.elementData = elementData;
    }

    public final String getElementId() {
        return this.elementId;
    }

    public final int[] getParentLocation() {
        return this.parentLocation;
    }

    public final ComposeEducationTourElementData getElementData() {
        return this.elementData;
    }
}
