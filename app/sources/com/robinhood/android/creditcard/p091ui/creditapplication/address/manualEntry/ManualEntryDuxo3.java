package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent;", "", "Error", "Suggestion", "Continue", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Continue;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Suggestion;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface ManualEntryDuxo3 {

    /* compiled from: ManualEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isSkippable", "", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;Z)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryEvent$Error, reason: from toString */
    public static final /* data */ class Error implements ManualEntryDuxo3 {
        public static final int $stable = 8;
        private final AddressType address;
        private final AddressType2 error;
        private final boolean isSkippable;

        public static /* synthetic */ Error copy$default(Error error, AddressType addressType, AddressType2 addressType2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = error.address;
            }
            if ((i & 2) != 0) {
                addressType2 = error.error;
            }
            if ((i & 4) != 0) {
                z = error.isSkippable;
            }
            return error.copy(addressType, addressType2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressType2 getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSkippable() {
            return this.isSkippable;
        }

        public final Error copy(AddressType address, AddressType2 error, boolean isSkippable) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(address, error, isSkippable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.address, error.address) && this.error == error.error && this.isSkippable == error.isSkippable;
        }

        public int hashCode() {
            return (((this.address.hashCode() * 31) + this.error.hashCode()) * 31) + Boolean.hashCode(this.isSkippable);
        }

        public String toString() {
            return "Error(address=" + this.address + ", error=" + this.error + ", isSkippable=" + this.isSkippable + ")";
        }

        public Error(AddressType address, AddressType2 error, boolean z) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(error, "error");
            this.address = address;
            this.error = error;
            this.isSkippable = z;
        }

        public final AddressType getAddress() {
            return this.address;
        }

        public final AddressType2 getError() {
            return this.error;
        }

        public final boolean isSkippable() {
            return this.isSkippable;
        }
    }

    /* compiled from: ManualEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Suggestion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "suggestedAddress", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getSuggestedAddress", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryEvent$Suggestion, reason: from toString */
    public static final /* data */ class Suggestion implements ManualEntryDuxo3 {
        public static final int $stable = 8;
        private final AddressType address;
        private final AddressType suggestedAddress;

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, AddressType addressType, AddressType addressType2, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = suggestion.address;
            }
            if ((i & 2) != 0) {
                addressType2 = suggestion.suggestedAddress;
            }
            return suggestion.copy(addressType, addressType2);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressType getSuggestedAddress() {
            return this.suggestedAddress;
        }

        public final Suggestion copy(AddressType address, AddressType suggestedAddress) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(suggestedAddress, "suggestedAddress");
            return new Suggestion(address, suggestedAddress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) other;
            return Intrinsics.areEqual(this.address, suggestion.address) && Intrinsics.areEqual(this.suggestedAddress, suggestion.suggestedAddress);
        }

        public int hashCode() {
            return (this.address.hashCode() * 31) + this.suggestedAddress.hashCode();
        }

        public String toString() {
            return "Suggestion(address=" + this.address + ", suggestedAddress=" + this.suggestedAddress + ")";
        }

        public Suggestion(AddressType address, AddressType suggestedAddress) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(suggestedAddress, "suggestedAddress");
            this.address = address;
            this.suggestedAddress = suggestedAddress;
        }

        public final AddressType getAddress() {
            return this.address;
        }

        public final AddressType getSuggestedAddress() {
            return this.suggestedAddress;
        }
    }

    /* compiled from: ManualEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent$Continue;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryEvent$Continue, reason: from toString */
    public static final /* data */ class Continue implements ManualEntryDuxo3 {
        public static final int $stable = 8;
        private final AddressType address;

        public static /* synthetic */ Continue copy$default(Continue r0, AddressType addressType, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = r0.address;
            }
            return r0.copy(addressType);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        public final Continue copy(AddressType address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Continue(address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Continue) && Intrinsics.areEqual(this.address, ((Continue) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "Continue(address=" + this.address + ")";
        }

        public Continue(AddressType address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
        }

        public final AddressType getAddress() {
            return this.address;
        }
    }
}
