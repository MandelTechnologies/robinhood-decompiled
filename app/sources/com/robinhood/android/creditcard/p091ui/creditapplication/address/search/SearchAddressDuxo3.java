package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressEvent;", "", "Verify", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressEvent$Verify;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface SearchAddressDuxo3 {

    /* compiled from: SearchAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressEvent$Verify;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressEvent$Verify, reason: from toString */
    public static final /* data */ class Verify implements SearchAddressDuxo3 {
        public static final int $stable = 8;
        private final AddressType address;

        public static /* synthetic */ Verify copy$default(Verify verify, AddressType addressType, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = verify.address;
            }
            return verify.copy(addressType);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        public final Verify copy(AddressType address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Verify(address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Verify) && Intrinsics.areEqual(this.address, ((Verify) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "Verify(address=" + this.address + ")";
        }

        public Verify(AddressType address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
        }

        public final AddressType getAddress() {
            return this.address;
        }
    }
}
