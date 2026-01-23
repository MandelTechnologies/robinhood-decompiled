package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "", "Ssn", "Address", "UpdatedAddress", "Income", "Complete", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Address;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Complete;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Income;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Ssn;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$UpdatedAddress;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface IdentityDuxo4 {

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Ssn;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent$Ssn */
    public static final /* data */ class Ssn implements IdentityDuxo4 {
        public static final int $stable = 0;
        public static final Ssn INSTANCE = new Ssn();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ssn);
        }

        public int hashCode() {
            return -2110818868;
        }

        public String toString() {
            return "Ssn";
        }

        private Ssn() {
        }
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Address;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent$Address */
    public static final /* data */ class Address implements IdentityDuxo4 {
        public static final int $stable = 0;
        public static final Address INSTANCE = new Address();

        public boolean equals(Object other) {
            return this == other || (other instanceof Address);
        }

        public int hashCode() {
            return 2089239730;
        }

        public String toString() {
            return "Address";
        }

        private Address() {
        }
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$UpdatedAddress;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "lat", "", "long", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLong", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;)Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$UpdatedAddress;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent$UpdatedAddress, reason: from toString */
    public static final /* data */ class UpdatedAddress implements IdentityDuxo4 {
        public static final int $stable = 8;
        private final AddressType address;
        private final Double lat;
        private final Double long;

        public static /* synthetic */ UpdatedAddress copy$default(UpdatedAddress updatedAddress, AddressType addressType, Double d, Double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = updatedAddress.address;
            }
            if ((i & 2) != 0) {
                d = updatedAddress.lat;
            }
            if ((i & 4) != 0) {
                d2 = updatedAddress.long;
            }
            return updatedAddress.copy(addressType, d, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final Double getLat() {
            return this.lat;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getLong() {
            return this.long;
        }

        public final UpdatedAddress copy(AddressType address, Double lat, Double d) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new UpdatedAddress(address, lat, d);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedAddress)) {
                return false;
            }
            UpdatedAddress updatedAddress = (UpdatedAddress) other;
            return Intrinsics.areEqual(this.address, updatedAddress.address) && Intrinsics.areEqual((Object) this.lat, (Object) updatedAddress.lat) && Intrinsics.areEqual((Object) this.long, (Object) updatedAddress.long);
        }

        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            Double d = this.lat;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.long;
            return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
        }

        public String toString() {
            return "UpdatedAddress(address=" + this.address + ", lat=" + this.lat + ", long=" + this.long + ")";
        }

        public UpdatedAddress(AddressType address, Double d, Double d2) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.lat = d;
            this.long = d2;
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
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Income;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent$Income */
    public static final /* data */ class Income implements IdentityDuxo4 {
        public static final int $stable = 0;
        public static final Income INSTANCE = new Income();

        public boolean equals(Object other) {
            return this == other || (other instanceof Income);
        }

        public int hashCode() {
            return -1079842517;
        }

        public String toString() {
            return "Income";
        }

        private Income() {
        }
    }

    /* compiled from: IdentityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent$Complete;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "state", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;)V", "getState", "()Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityEvent$Complete, reason: from toString */
    public static final /* data */ class Complete implements IdentityDuxo4 {
        public static final int $stable = 8;
        private final CreateCreditApplicationRequest state;

        public static /* synthetic */ Complete copy$default(Complete complete, CreateCreditApplicationRequest createCreditApplicationRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationRequest = complete.state;
            }
            return complete.copy(createCreditApplicationRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final CreateCreditApplicationRequest getState() {
            return this.state;
        }

        public final Complete copy(CreateCreditApplicationRequest state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Complete(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && Intrinsics.areEqual(this.state, ((Complete) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Complete(state=" + this.state + ")";
        }

        public Complete(CreateCreditApplicationRequest state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final CreateCreditApplicationRequest getState() {
            return this.state;
        }
    }
}
