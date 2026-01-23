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
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "NONE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement, reason: use source file name */
/* loaded from: classes18.dex */
public final class InquirySessionConfig2 implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InquirySessionConfig2[] $VALUES;
    public static final Parcelable.Creator<InquirySessionConfig2> CREATOR;
    public static final InquirySessionConfig2 REQUIRED = new InquirySessionConfig2("REQUIRED", 0);
    public static final InquirySessionConfig2 OPTIONAL = new InquirySessionConfig2("OPTIONAL", 1);
    public static final InquirySessionConfig2 NONE = new InquirySessionConfig2("NONE", 2);

    private static final /* synthetic */ InquirySessionConfig2[] $values() {
        return new InquirySessionConfig2[]{REQUIRED, OPTIONAL, NONE};
    }

    public static EnumEntries<InquirySessionConfig2> getEntries() {
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

    private InquirySessionConfig2(String str, int i) {
    }

    static {
        InquirySessionConfig2[] inquirySessionConfig2Arr$values = $values();
        $VALUES = inquirySessionConfig2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(inquirySessionConfig2Arr$values);
        CREATOR = new Parcelable.Creator<InquirySessionConfig2>() { // from class: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquirySessionConfig2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return InquirySessionConfig2.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquirySessionConfig2[] newArray(int i) {
                return new InquirySessionConfig2[i];
            }
        };
    }

    public static InquirySessionConfig2 valueOf(String str) {
        return (InquirySessionConfig2) Enum.valueOf(InquirySessionConfig2.class, str);
    }

    public static InquirySessionConfig2[] values() {
        return (InquirySessionConfig2[]) $VALUES.clone();
    }
}
