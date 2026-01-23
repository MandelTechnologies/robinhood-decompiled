package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayResult.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,BQ\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/stripe/android/model/GooglePayResult;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/Token;", "token", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "", "name", "email", "phoneNumber", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "<init>", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Token;", "getToken", "()Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/Address;", "getAddress", "()Lcom/stripe/android/model/Address;", "Ljava/lang/String;", "getName", "getEmail", "getPhoneNumber", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GooglePayResult implements Parcelable {
    private final Address address;
    private final String email;
    private final String name;
    private final String phoneNumber;
    private final ShippingInformation shippingInformation;
    private final Token token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new Creator();

    /* compiled from: GooglePayResult.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayResult((Token) parcel.readParcelable(GooglePayResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult[] newArray(int i) {
            return new GooglePayResult[i];
        }
    }

    public GooglePayResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayResult)) {
            return false;
        }
        GooglePayResult googlePayResult = (GooglePayResult) other;
        return Intrinsics.areEqual(this.token, googlePayResult.token) && Intrinsics.areEqual(this.address, googlePayResult.address) && Intrinsics.areEqual(this.name, googlePayResult.name) && Intrinsics.areEqual(this.email, googlePayResult.email) && Intrinsics.areEqual(this.phoneNumber, googlePayResult.phoneNumber) && Intrinsics.areEqual(this.shippingInformation, googlePayResult.shippingInformation);
    }

    public int hashCode() {
        Token token = this.token;
        int iHashCode = (token == null ? 0 : token.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        return iHashCode5 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
    }

    public String toString() {
        return "GooglePayResult(token=" + this.token + ", address=" + this.address + ", name=" + this.name + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", shippingInformation=" + this.shippingInformation + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.token, flags);
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.phoneNumber);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
    }

    public GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        this.token = token;
        this.address = address;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation;
    }

    public /* synthetic */ GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : token, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : shippingInformation);
    }

    public final Token getToken() {
        return this.token;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* compiled from: GooglePayResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/GooglePayResult$Companion;", "", "()V", "createShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "paymentDataJson", "Lorg/json/JSONObject;", "fromJson", "Lcom/stripe/android/model/GooglePayResult;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GooglePayResult fromJson(JSONObject paymentDataJson) throws JSONException {
            Address address;
            Intrinsics.checkNotNullParameter(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            Token token = new TokenJsonParser().parse(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject jSONObjectOptJSONObject = jSONObject.getJSONObject(SduiFeatureDiscovery3.INFO_TAG).optJSONObject("billingAddress");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address1");
                String strOptString2 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address2");
                address = new Address(StripeJsonUtils.optString(jSONObjectOptJSONObject, "locality"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "countryCode"), strOptString, strOptString2, StripeJsonUtils.optString(jSONObjectOptJSONObject, "postalCode"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "administrativeArea"));
            } else {
                address = null;
            }
            return new GooglePayResult(token, address, StripeJsonUtils.optString(jSONObjectOptJSONObject, "name"), StripeJsonUtils.optString(paymentDataJson, "email"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "phoneNumber"), createShippingInformation(paymentDataJson));
        }

        private final ShippingInformation createShippingInformation(JSONObject paymentDataJson) {
            JSONObject jSONObjectOptJSONObject = paymentDataJson.optJSONObject("shippingAddress");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            String strOptString = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address1");
            String strOptString2 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address2");
            String strOptString3 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "postalCode");
            return new ShippingInformation(new Address(StripeJsonUtils.optString(jSONObjectOptJSONObject, "locality"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "countryCode"), strOptString, strOptString2, strOptString3, StripeJsonUtils.optString(jSONObjectOptJSONObject, "administrativeArea")), StripeJsonUtils.optString(jSONObjectOptJSONObject, "name"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "phoneNumber"));
        }
    }
}
