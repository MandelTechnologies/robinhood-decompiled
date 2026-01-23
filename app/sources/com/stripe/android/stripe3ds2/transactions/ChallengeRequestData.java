package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ChallengeRequestData.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002BABu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0086\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b9\u0010\u001fR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b@\u0010?¨\u0006C"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "messageVersion", "threeDsServerTransId", "acsTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransId", "challengeDataEntry", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "cancelReason", "challengeHtmlDataEntry", "", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageExtensions", "", "oobContinue", "shouldResendChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "sanitize$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "sanitize", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessageVersion", "getThreeDsServerTransId", "getAcsTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getChallengeDataEntry", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "getCancelReason", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "getChallengeHtmlDataEntry", "Ljava/util/List;", "getMessageExtensions", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getOobContinue", "()Ljava/lang/Boolean;", "getShouldResendChallenge", "Companion", "CancelReason", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ChallengeRequestData implements Serializable, Parcelable {
    private final String acsTransId;
    private final CancelReason cancelReason;
    private final String challengeDataEntry;
    private final String challengeHtmlDataEntry;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final Boolean oobContinue;
    private final SdkTransactionId sdkTransId;
    private final Boolean shouldResendChallenge;
    private final String threeDsServerTransId;
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new Creator();

    /* compiled from: ChallengeRequestData.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeRequestData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            SdkTransactionId sdkTransactionIdCreateFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            CancelReason cancelReasonValueOf = parcel.readInt() == 0 ? null : CancelReason.valueOf(parcel.readString());
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChallengeRequestData(string2, string3, string4, sdkTransactionIdCreateFromParcel, string5, cancelReasonValueOf, string6, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData[] newArray(int i) {
            return new ChallengeRequestData[i];
        }
    }

    public static /* synthetic */ ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeRequestData.messageVersion;
        }
        if ((i & 2) != 0) {
            str2 = challengeRequestData.threeDsServerTransId;
        }
        if ((i & 4) != 0) {
            str3 = challengeRequestData.acsTransId;
        }
        if ((i & 8) != 0) {
            sdkTransactionId = challengeRequestData.sdkTransId;
        }
        if ((i & 16) != 0) {
            str4 = challengeRequestData.challengeDataEntry;
        }
        if ((i & 32) != 0) {
            cancelReason = challengeRequestData.cancelReason;
        }
        if ((i & 64) != 0) {
            str5 = challengeRequestData.challengeHtmlDataEntry;
        }
        if ((i & 128) != 0) {
            list = challengeRequestData.messageExtensions;
        }
        if ((i & 256) != 0) {
            bool = challengeRequestData.oobContinue;
        }
        if ((i & 512) != 0) {
            bool2 = challengeRequestData.shouldResendChallenge;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        CancelReason cancelReason2 = cancelReason;
        return challengeRequestData.copy(str, str2, str3, sdkTransactionId, str7, cancelReason2, str6, list2, bool3, bool4);
    }

    public final ChallengeRequestData copy(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String challengeDataEntry, CancelReason cancelReason, String challengeHtmlDataEntry, List<MessageExtension> messageExtensions, Boolean oobContinue, Boolean shouldResendChallenge) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        return new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, challengeDataEntry, cancelReason, challengeHtmlDataEntry, messageExtensions, oobContinue, shouldResendChallenge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeRequestData)) {
            return false;
        }
        ChallengeRequestData challengeRequestData = (ChallengeRequestData) other;
        return Intrinsics.areEqual(this.messageVersion, challengeRequestData.messageVersion) && Intrinsics.areEqual(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && Intrinsics.areEqual(this.acsTransId, challengeRequestData.acsTransId) && Intrinsics.areEqual(this.sdkTransId, challengeRequestData.sdkTransId) && Intrinsics.areEqual(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && Intrinsics.areEqual(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && Intrinsics.areEqual(this.messageExtensions, challengeRequestData.messageExtensions) && Intrinsics.areEqual(this.oobContinue, challengeRequestData.oobContinue) && Intrinsics.areEqual(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge);
    }

    public int hashCode() {
        int iHashCode = ((((((this.messageVersion.hashCode() * 31) + this.threeDsServerTransId.hashCode()) * 31) + this.acsTransId.hashCode()) * 31) + this.sdkTransId.hashCode()) * 31;
        String str = this.challengeDataEntry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CancelReason cancelReason = this.cancelReason;
        int iHashCode3 = (iHashCode2 + (cancelReason == null ? 0 : cancelReason.hashCode())) * 31;
        String str2 = this.challengeHtmlDataEntry;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.messageVersion + ", threeDsServerTransId=" + this.threeDsServerTransId + ", acsTransId=" + this.acsTransId + ", sdkTransId=" + this.sdkTransId + ", challengeDataEntry=" + this.challengeDataEntry + ", cancelReason=" + this.cancelReason + ", challengeHtmlDataEntry=" + this.challengeHtmlDataEntry + ", messageExtensions=" + this.messageExtensions + ", oobContinue=" + this.oobContinue + ", shouldResendChallenge=" + this.shouldResendChallenge + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.threeDsServerTransId);
        parcel.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(parcel, flags);
        parcel.writeString(this.challengeDataEntry);
        CancelReason cancelReason = this.cancelReason;
        if (cancelReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cancelReason.name());
        }
        parcel.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MessageExtension> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public ChallengeRequestData(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, CancelReason cancelReason, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.messageVersion = messageVersion;
        this.threeDsServerTransId = threeDsServerTransId;
        this.acsTransId = acsTransId;
        this.sdkTransId = sdkTransId;
        this.challengeDataEntry = str;
        this.cancelReason = cancelReason;
        this.challengeHtmlDataEntry = str2;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, sdkTransactionId, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : cancelReason, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final JSONObject toJson$3ds2sdk_release() {
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObjectPut = new JSONObject().put("messageType", "CReq").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId.getValue()).put("threeDSServerTransID", this.threeDsServerTransId).put("acsTransID", this.acsTransId);
            CancelReason cancelReason = this.cancelReason;
            if (cancelReason != null) {
                jSONObjectPut.put("challengeCancel", cancelReason.getCode());
            }
            String str = this.challengeDataEntry;
            if (str != null) {
                jSONObjectPut.put("challengeDataEntry", str);
            }
            String str2 = this.challengeHtmlDataEntry;
            if (str2 != null) {
                jSONObjectPut.put("challengeHTMLDataEntry", str2);
            }
            JSONArray jsonArray = MessageExtension.INSTANCE.toJsonArray(this.messageExtensions);
            if (jsonArray != null) {
                jSONObjectPut.put("messageExtensions", jsonArray);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                jSONObjectPut.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                jSONObjectPut.put("resendChallenge", bool2.booleanValue() ? "Y" : "N");
            }
            Intrinsics.checkNotNull(jSONObjectPut);
            return jSONObjectPut;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(Result.m28550constructorimpl(ResultKt.createFailure(th)));
            if (thM28553exceptionOrNullimpl == null) {
                throw new ExceptionsH();
            }
            throw new SDKRuntimeException(thM28553exceptionOrNullimpl);
        }
    }

    public final ChallengeRequestData sanitize$3ds2sdk_release() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeRequestData.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "UserSelected", "Reserved", "TransactionTimedOutDecoupled", "TransactionTimedOutOther", "TransactionTimedOutFirstCreq", "TransactionError", "Unknown", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CancelReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CancelReason[] $VALUES;
        private final String code;
        public static final CancelReason UserSelected = new CancelReason("UserSelected", 0, "01");
        public static final CancelReason Reserved = new CancelReason("Reserved", 1, "02");
        public static final CancelReason TransactionTimedOutDecoupled = new CancelReason("TransactionTimedOutDecoupled", 2, "03");
        public static final CancelReason TransactionTimedOutOther = new CancelReason("TransactionTimedOutOther", 3, "04");
        public static final CancelReason TransactionTimedOutFirstCreq = new CancelReason("TransactionTimedOutFirstCreq", 4, "05");
        public static final CancelReason TransactionError = new CancelReason("TransactionError", 5, "06");
        public static final CancelReason Unknown = new CancelReason("Unknown", 6, "07");

        private static final /* synthetic */ CancelReason[] $values() {
            return new CancelReason[]{UserSelected, Reserved, TransactionTimedOutDecoupled, TransactionTimedOutOther, TransactionTimedOutFirstCreq, TransactionError, Unknown};
        }

        public static EnumEntries<CancelReason> getEntries() {
            return $ENTRIES;
        }

        public static CancelReason valueOf(String str) {
            return (CancelReason) Enum.valueOf(CancelReason.class, str);
        }

        public static CancelReason[] values() {
            return (CancelReason[]) $VALUES.clone();
        }

        private CancelReason(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            CancelReason[] cancelReasonArr$values = $values();
            $VALUES = cancelReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cancelReasonArr$values);
        }
    }
}
