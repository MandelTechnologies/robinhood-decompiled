package com.robinhood.android.equities.contracts.tradeladder;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.store.linking.LinkingGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/tradeladder/EquityTradeLadderFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "", "source", "mobileLinkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "skipNux", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/store/linking/LinkingGroup;Z)V", "getInstrumentId", "()Ljava/lang/String;", "getSource", "getMobileLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "getSkipNux", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityTradeLadderFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<EquityTradeLadderFragmentKey> CREATOR = new Creator();
    private final String instrumentId;
    private final LinkingGroup mobileLinkingGroup;
    private final boolean skipNux;
    private final String source;

    /* compiled from: EquityTradeLadderFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EquityTradeLadderFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityTradeLadderFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EquityTradeLadderFragmentKey(parcel.readString(), parcel.readString(), (LinkingGroup) parcel.readParcelable(EquityTradeLadderFragmentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityTradeLadderFragmentKey[] newArray(int i) {
            return new EquityTradeLadderFragmentKey[i];
        }
    }

    public static /* synthetic */ EquityTradeLadderFragmentKey copy$default(EquityTradeLadderFragmentKey equityTradeLadderFragmentKey, String str, String str2, LinkingGroup linkingGroup, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityTradeLadderFragmentKey.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = equityTradeLadderFragmentKey.source;
        }
        if ((i & 4) != 0) {
            linkingGroup = equityTradeLadderFragmentKey.mobileLinkingGroup;
        }
        if ((i & 8) != 0) {
            z = equityTradeLadderFragmentKey.skipNux;
        }
        return equityTradeLadderFragmentKey.copy(str, str2, linkingGroup, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkingGroup getMobileLinkingGroup() {
        return this.mobileLinkingGroup;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSkipNux() {
        return this.skipNux;
    }

    public final EquityTradeLadderFragmentKey copy(String instrumentId, String source, LinkingGroup mobileLinkingGroup, boolean skipNux) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new EquityTradeLadderFragmentKey(instrumentId, source, mobileLinkingGroup, skipNux);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradeLadderFragmentKey)) {
            return false;
        }
        EquityTradeLadderFragmentKey equityTradeLadderFragmentKey = (EquityTradeLadderFragmentKey) other;
        return Intrinsics.areEqual(this.instrumentId, equityTradeLadderFragmentKey.instrumentId) && Intrinsics.areEqual(this.source, equityTradeLadderFragmentKey.source) && Intrinsics.areEqual(this.mobileLinkingGroup, equityTradeLadderFragmentKey.mobileLinkingGroup) && this.skipNux == equityTradeLadderFragmentKey.skipNux;
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkingGroup linkingGroup = this.mobileLinkingGroup;
        return ((iHashCode2 + (linkingGroup != null ? linkingGroup.hashCode() : 0)) * 31) + Boolean.hashCode(this.skipNux);
    }

    public String toString() {
        return "EquityTradeLadderFragmentKey(instrumentId=" + this.instrumentId + ", source=" + this.source + ", mobileLinkingGroup=" + this.mobileLinkingGroup + ", skipNux=" + this.skipNux + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.instrumentId);
        dest.writeString(this.source);
        dest.writeParcelable(this.mobileLinkingGroup, flags);
        dest.writeInt(this.skipNux ? 1 : 0);
    }

    public EquityTradeLadderFragmentKey(String instrumentId, String str, LinkingGroup linkingGroup, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.source = str;
        this.mobileLinkingGroup = linkingGroup;
        this.skipNux = z;
    }

    public /* synthetic */ EquityTradeLadderFragmentKey(String str, String str2, LinkingGroup linkingGroup, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : linkingGroup, (i & 8) != 0 ? false : z);
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSource() {
        return this.source;
    }

    public final LinkingGroup getMobileLinkingGroup() {
        return this.mobileLinkingGroup;
    }

    public final boolean getSkipNux() {
        return this.skipNux;
    }
}
