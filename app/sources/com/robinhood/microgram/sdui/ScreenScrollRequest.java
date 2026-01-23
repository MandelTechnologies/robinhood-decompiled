package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.enums.RhEnum;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenScrollRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenScrollRequest;", "Landroid/os/Parcelable;", "id", "", "alignment", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;", "<init>", "(Ljava/lang/String;Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;)V", "getId", "()Ljava/lang/String;", "getAlignment", "()Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Alignment", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ScreenScrollRequest implements Parcelable {
    public static final Parcelable.Creator<ScreenScrollRequest> CREATOR = new Creator();
    private final Alignment alignment;
    private final String id;

    /* compiled from: ScreenScrollRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ScreenScrollRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenScrollRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenScrollRequest(parcel.readString(), Alignment.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenScrollRequest[] newArray(int i) {
            return new ScreenScrollRequest[i];
        }
    }

    public static /* synthetic */ ScreenScrollRequest copy$default(ScreenScrollRequest screenScrollRequest, String str, Alignment alignment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screenScrollRequest.id;
        }
        if ((i & 2) != 0) {
            alignment = screenScrollRequest.alignment;
        }
        return screenScrollRequest.copy(str, alignment);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ScreenScrollRequest copy(String id, Alignment alignment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new ScreenScrollRequest(id, alignment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenScrollRequest)) {
            return false;
        }
        ScreenScrollRequest screenScrollRequest = (ScreenScrollRequest) other;
        return Intrinsics.areEqual(this.id, screenScrollRequest.id) && this.alignment == screenScrollRequest.alignment;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "ScreenScrollRequest(id=" + this.id + ", alignment=" + this.alignment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.alignment.name());
    }

    public ScreenScrollRequest(String id, Alignment alignment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.id = id;
        this.alignment = alignment;
    }

    public final String getId() {
        return this.id;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenScrollRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "TOP", "CENTER", "BOTTOM", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Alignment implements RhEnum<Alignment> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        private final String serverValue;
        public static final Alignment TOP = new Alignment("TOP", 0, "TOP");
        public static final Alignment CENTER = new Alignment("CENTER", 1, "CENTER");
        public static final Alignment BOTTOM = new Alignment("BOTTOM", 2, "BOTTOM");

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{TOP, CENTER, BOTTOM};
        }

        public static EnumEntries<Alignment> getEntries() {
            return $ENTRIES;
        }

        private Alignment(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Alignment[] alignmentArr$values = $values();
            $VALUES = alignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(alignmentArr$values);
            INSTANCE = new Companion(null);
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }
}
