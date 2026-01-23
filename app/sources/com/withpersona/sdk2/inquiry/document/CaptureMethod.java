package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CaptureMethod.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "Landroid/os/Parcelable;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "UPLOAD", "MANUAL", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CaptureMethod implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaptureMethod[] $VALUES;
    public static final Parcelable.Creator<CaptureMethod> CREATOR;
    private final String type;
    public static final CaptureMethod UPLOAD = new CaptureMethod("UPLOAD", 0, "upload");
    public static final CaptureMethod MANUAL = new CaptureMethod("MANUAL", 1, "manual");

    private static final /* synthetic */ CaptureMethod[] $values() {
        return new CaptureMethod[]{UPLOAD, MANUAL};
    }

    public static EnumEntries<CaptureMethod> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private CaptureMethod(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        CaptureMethod[] captureMethodArr$values = $values();
        $VALUES = captureMethodArr$values;
        $ENTRIES = EnumEntries2.enumEntries(captureMethodArr$values);
        CREATOR = new Parcelable.Creator<CaptureMethod>() { // from class: com.withpersona.sdk2.inquiry.document.CaptureMethod.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return CaptureMethod.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureMethod[] newArray(int i) {
                return new CaptureMethod[i];
            }
        };
    }

    public static CaptureMethod valueOf(String str) {
        return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
    }

    public static CaptureMethod[] values() {
        return (CaptureMethod[]) $VALUES.clone();
    }
}
