package com.robinhood.android.acats.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsRetriesIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "acatsId", "Ljava/util/UUID;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getAcatsId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AcatsRetriesIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<AcatsRetriesIntentKey> CREATOR = new Creator();
    private final UUID acatsId;
    private final String source;

    /* compiled from: AcatsIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AcatsRetriesIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcatsRetriesIntentKey((UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesIntentKey[] newArray(int i) {
            return new AcatsRetriesIntentKey[i];
        }
    }

    public static /* synthetic */ AcatsRetriesIntentKey copy$default(AcatsRetriesIntentKey acatsRetriesIntentKey, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = acatsRetriesIntentKey.acatsId;
        }
        if ((i & 2) != 0) {
            str = acatsRetriesIntentKey.source;
        }
        return acatsRetriesIntentKey.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAcatsId() {
        return this.acatsId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AcatsRetriesIntentKey copy(UUID acatsId, String source) {
        Intrinsics.checkNotNullParameter(acatsId, "acatsId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new AcatsRetriesIntentKey(acatsId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsRetriesIntentKey)) {
            return false;
        }
        AcatsRetriesIntentKey acatsRetriesIntentKey = (AcatsRetriesIntentKey) other;
        return Intrinsics.areEqual(this.acatsId, acatsRetriesIntentKey.acatsId) && Intrinsics.areEqual(this.source, acatsRetriesIntentKey.source);
    }

    public int hashCode() {
        return (this.acatsId.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "AcatsRetriesIntentKey(acatsId=" + this.acatsId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.acatsId);
        dest.writeString(this.source);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public AcatsRetriesIntentKey(UUID acatsId, String source) {
        Intrinsics.checkNotNullParameter(acatsId, "acatsId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.acatsId = acatsId;
        this.source = source;
    }

    public final UUID getAcatsId() {
        return this.acatsId;
    }

    public /* synthetic */ AcatsRetriesIntentKey(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? "" : str);
    }

    public final String getSource() {
        return this.source;
    }
}
