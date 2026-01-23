package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.C5812C1;
import com.plaid.internal.C5925O3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/plaid/link/result/LinkAccountBalance;", "Landroid/os/Parcelable;", "available", "", "current", "currency", "", "localized", "Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)V", "getAvailable", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "getCurrent", "getLocalized", "()Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)Lcom/plaid/link/result/LinkAccountBalance;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LinkAccountBalance implements Parcelable {

    @SerializedName("available")
    private final Double available;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("current")
    private final Double current;

    @SerializedName("localized")
    private final LocalizedLinkAccountBalance localized;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkAccountBalance> CREATOR = new Creator();

    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/plaid/link/result/LinkAccountBalance$Companion;", "", "<init>", "()V", "Lcom/plaid/internal/C1;", "balance", "Lcom/plaid/link/result/LinkAccountBalance;", "convert$link_sdk_release", "(Lcom/plaid/internal/C1;)Lcom/plaid/link/result/LinkAccountBalance;", "convert", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccountBalance convert$link_sdk_release(C5812C1 balance) {
            if (balance == null) {
                return null;
            }
            Double dM1161a = balance.m1161a();
            Double dM1163c = balance.m1163c();
            String strM1162b = balance.m1162b();
            C5925O3 c5925o3M1164d = balance.m1164d();
            String strM1275a = c5925o3M1164d != null ? c5925o3M1164d.m1275a() : null;
            C5925O3 c5925o3M1164d2 = balance.m1164d();
            return new LinkAccountBalance(dM1161a, dM1163c, strM1162b, new LocalizedLinkAccountBalance(strM1275a, c5925o3M1164d2 != null ? c5925o3M1164d2.m1276b() : null));
        }

        private Companion() {
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkAccountBalance(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? LocalizedLinkAccountBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance[] newArray(int i) {
            return new LinkAccountBalance[i];
        }
    }

    public LinkAccountBalance() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LinkAccountBalance copy$default(LinkAccountBalance linkAccountBalance, Double d, Double d2, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i, Object obj) {
        if ((i & 1) != 0) {
            d = linkAccountBalance.available;
        }
        if ((i & 2) != 0) {
            d2 = linkAccountBalance.current;
        }
        if ((i & 4) != 0) {
            str = linkAccountBalance.currency;
        }
        if ((i & 8) != 0) {
            localizedLinkAccountBalance = linkAccountBalance.localized;
        }
        return linkAccountBalance.copy(d, d2, str, localizedLinkAccountBalance);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getAvailable() {
        return this.available;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getCurrent() {
        return this.current;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public final LinkAccountBalance copy(Double available, Double current, String currency, LocalizedLinkAccountBalance localized) {
        return new LinkAccountBalance(available, current, currency, localized);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountBalance)) {
            return false;
        }
        LinkAccountBalance linkAccountBalance = (LinkAccountBalance) other;
        return Intrinsics.areEqual((Object) this.available, (Object) linkAccountBalance.available) && Intrinsics.areEqual((Object) this.current, (Object) linkAccountBalance.current) && Intrinsics.areEqual(this.currency, linkAccountBalance.currency) && Intrinsics.areEqual(this.localized, linkAccountBalance.localized);
    }

    public final Double getAvailable() {
        return this.available;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getCurrent() {
        return this.current;
    }

    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public int hashCode() {
        Double d = this.available;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.current;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        return iHashCode3 + (localizedLinkAccountBalance != null ? localizedLinkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccountBalance(available=" + this.available + ", current=" + this.current + ", currency=" + this.currency + ", localized=" + this.localized + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.available;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.current;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.currency);
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        if (localizedLinkAccountBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizedLinkAccountBalance.writeToParcel(parcel, flags);
        }
    }

    public LinkAccountBalance(Double d, Double d2, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance) {
        this.available = d;
        this.current = d2;
        this.currency = str;
        this.localized = localizedLinkAccountBalance;
    }

    public /* synthetic */ LinkAccountBalance(Double d, Double d2, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : localizedLinkAccountBalance);
    }
}
