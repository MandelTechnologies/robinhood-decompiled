package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoClassificationConfig.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "extractTextFromImage", "idSideConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V", "()Z", "getExtractTextFromImage", "getIdSideConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AutoClassificationConfig implements Parcelable {
    private final boolean extractTextFromImage;
    private final IdConfig.IdSideConfig idSideConfig;
    private final boolean isEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new Creator();

    /* compiled from: AutoClassificationConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoClassificationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoClassificationConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoClassificationConfig(parcel.readInt() != 0, parcel.readInt() != 0, IdConfig.IdSideConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoClassificationConfig[] newArray(int i) {
            return new AutoClassificationConfig[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.extractTextFromImage ? 1 : 0);
        this.idSideConfig.writeToParcel(dest, flags);
    }

    public AutoClassificationConfig(boolean z, boolean z2, IdConfig.IdSideConfig idSideConfig) {
        Intrinsics.checkNotNullParameter(idSideConfig, "idSideConfig");
        this.isEnabled = z;
        this.extractTextFromImage = z2;
        this.idSideConfig = idSideConfig;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean getExtractTextFromImage() {
        return this.extractTextFromImage;
    }

    public final IdConfig.IdSideConfig getIdSideConfig() {
        return this.idSideConfig;
    }

    /* compiled from: AutoClassificationConfig.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0002¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$Companion;", "", "<init>", "()V", "newInstance", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "isEnabled", "", "extractTextFromImage", "idSideConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "defaultIdSideConfig", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AutoClassificationConfig newInstance(Boolean isEnabled, Boolean extractTextFromImage, IdConfig.IdSideConfig idSideConfig) {
            boolean zBooleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
            boolean zBooleanValue2 = extractTextFromImage != null ? extractTextFromImage.booleanValue() : true;
            if (idSideConfig == null) {
                idSideConfig = defaultIdSideConfig();
            }
            return new AutoClassificationConfig(zBooleanValue, zBooleanValue2, idSideConfig);
        }

        private final IdConfig.IdSideConfig defaultIdSideConfig() {
            return new IdConfig.IdSideConfig("unknown", IdConfig.Side.Front, GovernmentIdScreen2.Overlay.CornersOnly.INSTANCE, new IdConfig.AutoCaptureConfig(null, 1, null), new IdConfig.ManualCaptureConfig(true, 0L));
        }
    }
}
