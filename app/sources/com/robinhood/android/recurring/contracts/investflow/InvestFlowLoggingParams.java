package com.robinhood.android.recurring.contracts.investflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowLoggingParams.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "Landroid/os/Parcelable;", "source", "", "sourceId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getSource", "()Ljava/lang/String;", "getSourceId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvestFlowLoggingParams implements Parcelable {
    public static final Parcelable.Creator<InvestFlowLoggingParams> CREATOR = new Creator();
    private final String source;
    private final UUID sourceId;

    /* compiled from: InvestFlowLoggingParams.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowLoggingParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowLoggingParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestFlowLoggingParams(parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowLoggingParams[] newArray(int i) {
            return new InvestFlowLoggingParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowLoggingParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InvestFlowLoggingParams copy$default(InvestFlowLoggingParams investFlowLoggingParams, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investFlowLoggingParams.source;
        }
        if ((i & 2) != 0) {
            uuid = investFlowLoggingParams.sourceId;
        }
        return investFlowLoggingParams.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getSourceId() {
        return this.sourceId;
    }

    public final InvestFlowLoggingParams copy(String source, UUID sourceId) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new InvestFlowLoggingParams(source, sourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowLoggingParams)) {
            return false;
        }
        InvestFlowLoggingParams investFlowLoggingParams = (InvestFlowLoggingParams) other;
        return Intrinsics.areEqual(this.source, investFlowLoggingParams.source) && Intrinsics.areEqual(this.sourceId, investFlowLoggingParams.sourceId);
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        UUID uuid = this.sourceId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "InvestFlowLoggingParams(source=" + this.source + ", sourceId=" + this.sourceId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeSerializable(this.sourceId);
    }

    public InvestFlowLoggingParams(String source, UUID uuid) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.sourceId = uuid;
    }

    public /* synthetic */ InvestFlowLoggingParams(String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : uuid);
    }

    public final String getSource() {
        return this.source;
    }

    public final UUID getSourceId() {
        return this.sourceId;
    }
}
