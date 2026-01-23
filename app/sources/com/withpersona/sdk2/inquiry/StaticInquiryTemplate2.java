package com.withpersona.sdk2.inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticInquiryTemplate.kt */
@ExperimentalInquiryTemplate
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "resourceId", "", "<init>", "(I)V", "getResourceId", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate, reason: use source file name */
/* loaded from: classes18.dex */
public final class StaticInquiryTemplate2 implements StaticInquiryTemplate {
    public static final Parcelable.Creator<StaticInquiryTemplate2> CREATOR = new Creator();
    private final int resourceId;

    /* compiled from: StaticInquiryTemplate.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate$Creator */
    public static final class Creator implements Parcelable.Creator<StaticInquiryTemplate2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticInquiryTemplate2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StaticInquiryTemplate2(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticInquiryTemplate2[] newArray(int i) {
            return new StaticInquiryTemplate2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.resourceId);
    }

    public StaticInquiryTemplate2(int i) {
        this.resourceId = i;
    }

    public final int getResourceId() {
        return this.resourceId;
    }
}
