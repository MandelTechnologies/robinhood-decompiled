package com.robinhood.android.lib.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\bHÂ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/utils/LowPrecisionAbbreviations;", "", "trillions", "", "billions", "millions", "thousands", "addSpaceBeforeAbbreviation", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "abbrPrefix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LowPrecisionAbbreviations {
    private final String abbrPrefix;
    private final boolean addSpaceBeforeAbbreviation;
    private final String billions;
    private final String millions;
    private final String thousands;
    private final String trillions;

    public LowPrecisionAbbreviations() {
        this(null, null, null, null, false, 31, null);
    }

    /* renamed from: component1, reason: from getter */
    private final String getTrillions() {
        return this.trillions;
    }

    /* renamed from: component2, reason: from getter */
    private final String getBillions() {
        return this.billions;
    }

    /* renamed from: component3, reason: from getter */
    private final String getMillions() {
        return this.millions;
    }

    /* renamed from: component4, reason: from getter */
    private final String getThousands() {
        return this.thousands;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getAddSpaceBeforeAbbreviation() {
        return this.addSpaceBeforeAbbreviation;
    }

    public static /* synthetic */ LowPrecisionAbbreviations copy$default(LowPrecisionAbbreviations lowPrecisionAbbreviations, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lowPrecisionAbbreviations.trillions;
        }
        if ((i & 2) != 0) {
            str2 = lowPrecisionAbbreviations.billions;
        }
        if ((i & 4) != 0) {
            str3 = lowPrecisionAbbreviations.millions;
        }
        if ((i & 8) != 0) {
            str4 = lowPrecisionAbbreviations.thousands;
        }
        if ((i & 16) != 0) {
            z = lowPrecisionAbbreviations.addSpaceBeforeAbbreviation;
        }
        boolean z2 = z;
        String str5 = str3;
        return lowPrecisionAbbreviations.copy(str, str2, str5, str4, z2);
    }

    public final LowPrecisionAbbreviations copy(String trillions, String billions, String millions, String thousands, boolean addSpaceBeforeAbbreviation) {
        Intrinsics.checkNotNullParameter(trillions, "trillions");
        Intrinsics.checkNotNullParameter(billions, "billions");
        Intrinsics.checkNotNullParameter(millions, "millions");
        Intrinsics.checkNotNullParameter(thousands, "thousands");
        return new LowPrecisionAbbreviations(trillions, billions, millions, thousands, addSpaceBeforeAbbreviation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LowPrecisionAbbreviations)) {
            return false;
        }
        LowPrecisionAbbreviations lowPrecisionAbbreviations = (LowPrecisionAbbreviations) other;
        return Intrinsics.areEqual(this.trillions, lowPrecisionAbbreviations.trillions) && Intrinsics.areEqual(this.billions, lowPrecisionAbbreviations.billions) && Intrinsics.areEqual(this.millions, lowPrecisionAbbreviations.millions) && Intrinsics.areEqual(this.thousands, lowPrecisionAbbreviations.thousands) && this.addSpaceBeforeAbbreviation == lowPrecisionAbbreviations.addSpaceBeforeAbbreviation;
    }

    public int hashCode() {
        return (((((((this.trillions.hashCode() * 31) + this.billions.hashCode()) * 31) + this.millions.hashCode()) * 31) + this.thousands.hashCode()) * 31) + Boolean.hashCode(this.addSpaceBeforeAbbreviation);
    }

    public String toString() {
        return "LowPrecisionAbbreviations(trillions=" + this.trillions + ", billions=" + this.billions + ", millions=" + this.millions + ", thousands=" + this.thousands + ", addSpaceBeforeAbbreviation=" + this.addSpaceBeforeAbbreviation + ")";
    }

    public LowPrecisionAbbreviations(String trillions, String billions, String millions, String thousands, boolean z) {
        Intrinsics.checkNotNullParameter(trillions, "trillions");
        Intrinsics.checkNotNullParameter(billions, "billions");
        Intrinsics.checkNotNullParameter(millions, "millions");
        Intrinsics.checkNotNullParameter(thousands, "thousands");
        this.trillions = trillions;
        this.billions = billions;
        this.millions = millions;
        this.thousands = thousands;
        this.addSpaceBeforeAbbreviation = z;
        this.abbrPrefix = z ? " " : "";
    }

    public /* synthetic */ LowPrecisionAbbreviations(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "T" : str, (i & 2) != 0 ? "B" : str2, (i & 4) != 0 ? "M" : str3, (i & 8) != 0 ? "K" : str4, (i & 16) != 0 ? false : z);
    }

    public final String trillions() {
        return this.abbrPrefix + "T";
    }

    public final String billions() {
        return this.abbrPrefix + "B";
    }

    public final String millions() {
        return this.abbrPrefix + "M";
    }

    public final String thousands() {
        return this.abbrPrefix + "K";
    }
}
