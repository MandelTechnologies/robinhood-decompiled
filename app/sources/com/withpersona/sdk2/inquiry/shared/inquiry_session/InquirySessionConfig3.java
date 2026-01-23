package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InquirySessionConfig.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement, reason: use source file name */
/* loaded from: classes18.dex */
public final class InquirySessionConfig3 implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InquirySessionConfig3[] $VALUES;
    public static final Parcelable.Creator<InquirySessionConfig3> CREATOR;
    public static final InquirySessionConfig3 ROUGH = new InquirySessionConfig3("ROUGH", 0);
    public static final InquirySessionConfig3 PRECISE = new InquirySessionConfig3("PRECISE", 1);

    private static final /* synthetic */ InquirySessionConfig3[] $values() {
        return new InquirySessionConfig3[]{ROUGH, PRECISE};
    }

    public static EnumEntries<InquirySessionConfig3> getEntries() {
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

    private InquirySessionConfig3(String str, int i) {
    }

    static {
        InquirySessionConfig3[] inquirySessionConfig3Arr$values = $values();
        $VALUES = inquirySessionConfig3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(inquirySessionConfig3Arr$values);
        CREATOR = new Parcelable.Creator<InquirySessionConfig3>() { // from class: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquirySessionConfig3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return InquirySessionConfig3.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquirySessionConfig3[] newArray(int i) {
                return new InquirySessionConfig3[i];
            }
        };
    }

    public static InquirySessionConfig3 valueOf(String str) {
        return (InquirySessionConfig3) Enum.valueOf(InquirySessionConfig3.class, str);
    }

    public static InquirySessionConfig3[] values() {
        return (InquirySessionConfig3[]) $VALUES.clone();
    }
}
