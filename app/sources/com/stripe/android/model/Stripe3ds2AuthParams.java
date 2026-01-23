package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Stripe3ds2AuthParams.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006,"}, m3636d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "sourceId", "sdkAppId", "sdkReferenceNumber", "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "", "maxTimeout", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "I", "Lorg/json/JSONObject;", "getDeviceRenderOptions", "()Lorg/json/JSONObject;", "deviceRenderOptions", "getAppParams$payments_core_release", "appParams", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Stripe3ds2AuthParams implements StripeParamsModel, Parcelable {
    private final String deviceData;
    private final int maxTimeout;
    private final String messageVersion;
    private final String returnUrl;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final String sdkTransactionId;
    private final String sourceId;
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new Creator();

    /* compiled from: Stripe3ds2AuthParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams[] newArray(int i) {
            return new Stripe3ds2AuthParams[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2AuthParams)) {
            return false;
        }
        Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) other;
        return Intrinsics.areEqual(this.sourceId, stripe3ds2AuthParams.sourceId) && Intrinsics.areEqual(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && Intrinsics.areEqual(this.deviceData, stripe3ds2AuthParams.deviceData) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && Intrinsics.areEqual(this.returnUrl, stripe3ds2AuthParams.returnUrl);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.sourceId.hashCode() * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkTransactionId.hashCode()) * 31) + this.deviceData.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode()) * 31) + Integer.hashCode(this.maxTimeout)) * 31;
        String str = this.returnUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.sourceId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkTransactionId=" + this.sdkTransactionId + ", deviceData=" + this.deviceData + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ", maxTimeout=" + this.maxTimeout + ", returnUrl=" + this.returnUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.sourceId);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkTransactionId);
        parcel.writeString(this.deviceData);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
        parcel.writeInt(this.maxTimeout);
        parcel.writeString(this.returnUrl);
    }

    public Stripe3ds2AuthParams(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.sourceId = sourceId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkTransactionId = sdkTransactionId;
        this.deviceData = deviceData;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
        this.maxTimeout = i;
        this.returnUrl = str;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("source", this.sourceId), Tuples4.m3642to("app", getAppParams$payments_core_release().toString()));
        String str = this.returnUrl;
        Map mapMapOf2 = str != null ? MapsKt.mapOf(Tuples4.m3642to("fallback_return_url", str)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapMapOf2);
    }

    public final /* synthetic */ JSONObject getAppParams$payments_core_release() {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new JSONObject().put("sdkAppID", this.sdkAppId).put("sdkTransID", this.sdkTransactionId).put("sdkEncData", this.deviceData).put("sdkEphemPubKey", new JSONObject(this.sdkEphemeralPublicKey)).put("sdkMaxTimeout", StringsKt.padStart(String.valueOf(this.maxTimeout), 2, '0')).put("sdkReferenceNumber", this.sdkReferenceNumber).put("messageVersion", this.messageVersion).put("deviceRenderOptions", getDeviceRenderOptions()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = jSONObject;
        }
        return (JSONObject) objM28550constructorimpl;
    }

    private final JSONObject getDeviceRenderOptions() {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection<?>) CollectionsKt.listOf((Object[]) new String[]{"01", "02", "03", "04", "05"}))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = jSONObject;
        }
        return (JSONObject) objM28550constructorimpl;
    }
}
