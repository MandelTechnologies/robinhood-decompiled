package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AboutV2Info.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", "", AnnotatedPrivateKey.LABEL, "", "value", "educationTourId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getEducationTourId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AboutV2Info {
    public static final int $stable = 0;
    private final String educationTourId;
    private final String label;
    private final String value;

    public static /* synthetic */ AboutV2Info copy$default(AboutV2Info aboutV2Info, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aboutV2Info.label;
        }
        if ((i & 2) != 0) {
            str2 = aboutV2Info.value;
        }
        if ((i & 4) != 0) {
            str3 = aboutV2Info.educationTourId;
        }
        return aboutV2Info.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEducationTourId() {
        return this.educationTourId;
    }

    public final AboutV2Info copy(String label, String value, String educationTourId) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AboutV2Info(label, value, educationTourId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutV2Info)) {
            return false;
        }
        AboutV2Info aboutV2Info = (AboutV2Info) other;
        return Intrinsics.areEqual(this.label, aboutV2Info.label) && Intrinsics.areEqual(this.value, aboutV2Info.value) && Intrinsics.areEqual(this.educationTourId, aboutV2Info.educationTourId);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
        String str = this.educationTourId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AboutV2Info(label=" + this.label + ", value=" + this.value + ", educationTourId=" + this.educationTourId + ")";
    }

    public AboutV2Info(String label, String value, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.educationTourId = str;
    }

    public /* synthetic */ AboutV2Info(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getEducationTourId() {
        return this.educationTourId;
    }
}
