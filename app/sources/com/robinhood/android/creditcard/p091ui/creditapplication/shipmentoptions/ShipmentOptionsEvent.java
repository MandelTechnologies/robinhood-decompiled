package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", "", "Error", "AddressValidationError", "Continue", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$AddressValidationError;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$Continue;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$Error;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface ShipmentOptionsEvent {

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements ShipmentOptionsEvent {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1605439110;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$AddressValidationError;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isSkippable", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "sigRequired", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;ZLcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;Z)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "()Z", "getOption", "()Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "getSigRequired", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddressValidationError implements ShipmentOptionsEvent {
        public static final int $stable = 8;
        private final AddressType address;
        private final AddressType2 error;
        private final boolean isSkippable;
        private final ShipmentOption option;
        private final boolean sigRequired;

        public static /* synthetic */ AddressValidationError copy$default(AddressValidationError addressValidationError, AddressType addressType, AddressType2 addressType2, boolean z, ShipmentOption shipmentOption, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = addressValidationError.address;
            }
            if ((i & 2) != 0) {
                addressType2 = addressValidationError.error;
            }
            if ((i & 4) != 0) {
                z = addressValidationError.isSkippable;
            }
            if ((i & 8) != 0) {
                shipmentOption = addressValidationError.option;
            }
            if ((i & 16) != 0) {
                z2 = addressValidationError.sigRequired;
            }
            boolean z3 = z2;
            boolean z4 = z;
            return addressValidationError.copy(addressType, addressType2, z4, shipmentOption, z3);
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

        /* renamed from: component4, reason: from getter */
        public final ShipmentOption getOption() {
            return this.option;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSigRequired() {
            return this.sigRequired;
        }

        public final AddressValidationError copy(AddressType address, AddressType2 error, boolean isSkippable, ShipmentOption option, boolean sigRequired) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(option, "option");
            return new AddressValidationError(address, error, isSkippable, option, sigRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressValidationError)) {
                return false;
            }
            AddressValidationError addressValidationError = (AddressValidationError) other;
            return Intrinsics.areEqual(this.address, addressValidationError.address) && this.error == addressValidationError.error && this.isSkippable == addressValidationError.isSkippable && Intrinsics.areEqual(this.option, addressValidationError.option) && this.sigRequired == addressValidationError.sigRequired;
        }

        public int hashCode() {
            return (((((((this.address.hashCode() * 31) + this.error.hashCode()) * 31) + Boolean.hashCode(this.isSkippable)) * 31) + this.option.hashCode()) * 31) + Boolean.hashCode(this.sigRequired);
        }

        public String toString() {
            return "AddressValidationError(address=" + this.address + ", error=" + this.error + ", isSkippable=" + this.isSkippable + ", option=" + this.option + ", sigRequired=" + this.sigRequired + ")";
        }

        public AddressValidationError(AddressType address, AddressType2 error, boolean z, ShipmentOption option, boolean z2) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(option, "option");
            this.address = address;
            this.error = error;
            this.isSkippable = z;
            this.option = option;
            this.sigRequired = z2;
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

        public final ShipmentOption getOption() {
            return this.option;
        }

        public final boolean getSigRequired() {
            return this.sigRequired;
        }
    }

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent$Continue;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;)V", "getOption", "()Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Continue implements ShipmentOptionsEvent {
        public static final int $stable = 8;
        private final ShipmentOption option;

        public static /* synthetic */ Continue copy$default(Continue r0, ShipmentOption shipmentOption, int i, Object obj) {
            if ((i & 1) != 0) {
                shipmentOption = r0.option;
            }
            return r0.copy(shipmentOption);
        }

        /* renamed from: component1, reason: from getter */
        public final ShipmentOption getOption() {
            return this.option;
        }

        public final Continue copy(ShipmentOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            return new Continue(option);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Continue) && Intrinsics.areEqual(this.option, ((Continue) other).option);
        }

        public int hashCode() {
            return this.option.hashCode();
        }

        public String toString() {
            return "Continue(option=" + this.option + ")";
        }

        public Continue(ShipmentOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.option = option;
        }

        public final ShipmentOption getOption() {
            return this.option;
        }
    }
}
