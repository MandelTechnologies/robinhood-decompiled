package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "ssn", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "lat", "", "long", "income", "", "<init>", "(Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;Ljava/lang/String;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "getInfo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "getSsn", "()Ljava/lang/String;", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLong", "getIncome", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;Ljava/lang/String;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;", "equals", "", "other", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IdentityViewState {
    public static final int $stable = 8;
    private final AddressType address;
    private final Long income;
    private final PersonalInfo info;
    private final Double lat;
    private final Double long;
    private final String ssn;

    public IdentityViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ IdentityViewState copy$default(IdentityViewState identityViewState, PersonalInfo personalInfo, String str, AddressType addressType, Double d, Double d2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            personalInfo = identityViewState.info;
        }
        if ((i & 2) != 0) {
            str = identityViewState.ssn;
        }
        if ((i & 4) != 0) {
            addressType = identityViewState.address;
        }
        if ((i & 8) != 0) {
            d = identityViewState.lat;
        }
        if ((i & 16) != 0) {
            d2 = identityViewState.long;
        }
        if ((i & 32) != 0) {
            l = identityViewState.income;
        }
        Double d3 = d2;
        Long l2 = l;
        return identityViewState.copy(personalInfo, str, addressType, d, d3, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final PersonalInfo getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSsn() {
        return this.ssn;
    }

    /* renamed from: component3, reason: from getter */
    public final AddressType getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getLong() {
        return this.long;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getIncome() {
        return this.income;
    }

    public final IdentityViewState copy(PersonalInfo info, String ssn, AddressType address, Double lat, Double d, Long income) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        Intrinsics.checkNotNullParameter(address, "address");
        return new IdentityViewState(info, ssn, address, lat, d, income);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityViewState)) {
            return false;
        }
        IdentityViewState identityViewState = (IdentityViewState) other;
        return Intrinsics.areEqual(this.info, identityViewState.info) && Intrinsics.areEqual(this.ssn, identityViewState.ssn) && Intrinsics.areEqual(this.address, identityViewState.address) && Intrinsics.areEqual((Object) this.lat, (Object) identityViewState.lat) && Intrinsics.areEqual((Object) this.long, (Object) identityViewState.long) && Intrinsics.areEqual(this.income, identityViewState.income);
    }

    public int hashCode() {
        int iHashCode = ((((this.info.hashCode() * 31) + this.ssn.hashCode()) * 31) + this.address.hashCode()) * 31;
        Double d = this.lat;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.long;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.income;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "IdentityViewState(info=" + this.info + ", ssn=" + this.ssn + ", address=" + this.address + ", lat=" + this.lat + ", long=" + this.long + ", income=" + this.income + ")";
    }

    public IdentityViewState(PersonalInfo info, String ssn, AddressType address, Double d, Double d2, Long l) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        Intrinsics.checkNotNullParameter(address, "address");
        this.info = info;
        this.ssn = ssn;
        this.address = address;
        this.lat = d;
        this.long = d2;
        this.income = l;
    }

    public /* synthetic */ IdentityViewState(PersonalInfo personalInfo, String str, AddressType addressType, Double d, Double d2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PersonalInfo(null, null, null, null, null, null, 63, null) : personalInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new AddressType(null, null, null, null, null, 31, null) : addressType, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : l);
    }

    public final PersonalInfo getInfo() {
        return this.info;
    }

    public final String getSsn() {
        return this.ssn;
    }

    public final AddressType getAddress() {
        return this.address;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLong() {
        return this.long;
    }

    public final Long getIncome() {
        return this.income;
    }
}
