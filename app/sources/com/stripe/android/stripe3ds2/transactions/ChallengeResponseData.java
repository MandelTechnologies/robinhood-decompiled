package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChallengeResponseData.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0003a`bBÏ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020*HÖ\u0001¢\u0006\u0004\b1\u0010,J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020*HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\b\n\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bB\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bC\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bD\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bE\u0010)R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bF\u0010AR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bJ\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bK\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010NR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bO\u0010IR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\bP\u0010)R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bQ\u0010)R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bR\u0010)R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\bS\u0010)R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\bT\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\bU\u0010)R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010V\u001a\u0004\bW\u0010XR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\bY\u0010)R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bZ\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b[\u0010)R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\b\\\u0010)R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b]\u0010)R\u0014\u0010_\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010A¨\u0006c"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Landroid/os/Parcelable;", "", "serverTransId", "acsTransId", "acsHtml", "acsHtmlRefresh", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "uiType", "", "isChallengeCompleted", "challengeInfoHeader", "challengeInfoLabel", "challengeInfoText", "challengeAdditionalInfoText", "shouldShowChallengeInfoTextIndicator", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "challengeSelectOptions", "expandInfoLabel", "expandInfoText", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "issuerImage", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageExtensions", "messageVersion", "oobAppUrl", "oobAppLabel", "oobContinueLabel", "paymentSystemImage", "resendInformationLabel", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransId", "submitAuthenticationLabel", "whitelistingInfoText", "whyInfoLabel", "whyInfoText", "transStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getServerTransId", "getAcsTransId", "getAcsHtml", "getAcsHtmlRefresh", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Z", "()Z", "getChallengeInfoHeader", "getChallengeInfoLabel", "getChallengeInfoText", "getChallengeAdditionalInfoText", "getShouldShowChallengeInfoTextIndicator", "Ljava/util/List;", "getChallengeSelectOptions", "()Ljava/util/List;", "getExpandInfoLabel", "getExpandInfoText", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "getIssuerImage", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "getMessageExtensions", "getMessageVersion", "getOobAppUrl", "getOobAppLabel", "getOobContinueLabel", "getPaymentSystemImage", "getResendInformationLabel", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSubmitAuthenticationLabel", "getWhitelistingInfoText", "getWhyInfoLabel", "getWhyInfoText", "getTransStatus", "isValidForUi$3ds2sdk_release", "isValidForUi", "Companion", "ChallengeSelectOption", "Image", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final /* data */ class ChallengeResponseData implements Parcelable {
    private final String acsHtml;
    private final String acsHtmlRefresh;
    private final String acsTransId;
    private final String challengeAdditionalInfoText;
    private final String challengeInfoHeader;
    private final String challengeInfoLabel;
    private final String challengeInfoText;
    private final List<ChallengeSelectOption> challengeSelectOptions;
    private final String expandInfoLabel;
    private final String expandInfoText;
    private final boolean isChallengeCompleted;
    private final Image issuerImage;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final String oobAppLabel;
    private final String oobAppUrl;
    private final String oobContinueLabel;
    private final Image paymentSystemImage;
    private final String resendInformationLabel;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    private final boolean shouldShowChallengeInfoTextIndicator;
    private final String submitAuthenticationLabel;
    private final String transStatus;
    private final UiType uiType;
    private final String whitelistingInfoText;
    private final String whyInfoLabel;
    private final String whyInfoText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new Creator();
    private static final List<String> YES_NO_VALUES = CollectionsKt.listOf((Object[]) new String[]{"Y", "N"});
    private static final Set<String> FINAL_CRES_FIELDS = SetsKt.setOf((Object[]) new String[]{"threeDSServerTransID", "acsCounterAtoS", "acsTransID", "challengeCompletionInd", "messageExtension", "messageType", "messageVersion", "sdkTransID", "transStatus"});

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeResponseData> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            int i;
            boolean z;
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            UiType uiTypeValueOf = parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z2 = true;
                z = true;
            } else {
                i = 0;
                z = true;
            }
            String string6 = parcel.readString();
            boolean z3 = z;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z4 = z3;
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                z4 = i;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (i != i2) {
                    arrayList3.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel));
                    i++;
                }
                arrayList = arrayList3;
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Image imageCreateFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = string2;
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                str = string2;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList4.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList2 = arrayList4;
                imageCreateFromParcel = imageCreateFromParcel;
            }
            return new ChallengeResponseData(str, string3, string4, string5, uiTypeValueOf, z2, string6, string7, string8, string9, z4, arrayList, string10, string11, imageCreateFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData[] newArray(int i) {
            return new ChallengeResponseData[i];
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
        if (!(other instanceof ChallengeResponseData)) {
            return false;
        }
        ChallengeResponseData challengeResponseData = (ChallengeResponseData) other;
        return Intrinsics.areEqual(this.serverTransId, challengeResponseData.serverTransId) && Intrinsics.areEqual(this.acsTransId, challengeResponseData.acsTransId) && Intrinsics.areEqual(this.acsHtml, challengeResponseData.acsHtml) && Intrinsics.areEqual(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && Intrinsics.areEqual(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && Intrinsics.areEqual(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && Intrinsics.areEqual(this.challengeInfoText, challengeResponseData.challengeInfoText) && Intrinsics.areEqual(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && Intrinsics.areEqual(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && Intrinsics.areEqual(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && Intrinsics.areEqual(this.expandInfoText, challengeResponseData.expandInfoText) && Intrinsics.areEqual(this.issuerImage, challengeResponseData.issuerImage) && Intrinsics.areEqual(this.messageExtensions, challengeResponseData.messageExtensions) && Intrinsics.areEqual(this.messageVersion, challengeResponseData.messageVersion) && Intrinsics.areEqual(this.oobAppUrl, challengeResponseData.oobAppUrl) && Intrinsics.areEqual(this.oobAppLabel, challengeResponseData.oobAppLabel) && Intrinsics.areEqual(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && Intrinsics.areEqual(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && Intrinsics.areEqual(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && Intrinsics.areEqual(this.sdkTransId, challengeResponseData.sdkTransId) && Intrinsics.areEqual(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && Intrinsics.areEqual(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && Intrinsics.areEqual(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && Intrinsics.areEqual(this.whyInfoText, challengeResponseData.whyInfoText) && Intrinsics.areEqual(this.transStatus, challengeResponseData.transStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.serverTransId.hashCode() * 31) + this.acsTransId.hashCode()) * 31;
        String str = this.acsHtml;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiType uiType = this.uiType;
        int iHashCode4 = (iHashCode3 + (uiType == null ? 0 : uiType.hashCode())) * 31;
        boolean z = this.isChallengeCompleted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode4 + i) * 31;
        String str3 = this.challengeInfoHeader;
        int iHashCode5 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z2 = this.shouldShowChallengeInfoTextIndicator;
        int i3 = (iHashCode8 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int iHashCode9 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int iHashCode12 = (iHashCode11 + (image == null ? 0 : image.hashCode())) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int iHashCode13 = (((iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        String str9 = this.oobAppUrl;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int iHashCode17 = (iHashCode16 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int iHashCode18 = (((iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.sdkTransId.hashCode()) * 31;
        String str13 = this.submitAuthenticationLabel;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return iHashCode22 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", acsHtml=" + this.acsHtml + ", acsHtmlRefresh=" + this.acsHtmlRefresh + ", uiType=" + this.uiType + ", isChallengeCompleted=" + this.isChallengeCompleted + ", challengeInfoHeader=" + this.challengeInfoHeader + ", challengeInfoLabel=" + this.challengeInfoLabel + ", challengeInfoText=" + this.challengeInfoText + ", challengeAdditionalInfoText=" + this.challengeAdditionalInfoText + ", shouldShowChallengeInfoTextIndicator=" + this.shouldShowChallengeInfoTextIndicator + ", challengeSelectOptions=" + this.challengeSelectOptions + ", expandInfoLabel=" + this.expandInfoLabel + ", expandInfoText=" + this.expandInfoText + ", issuerImage=" + this.issuerImage + ", messageExtensions=" + this.messageExtensions + ", messageVersion=" + this.messageVersion + ", oobAppUrl=" + this.oobAppUrl + ", oobAppLabel=" + this.oobAppLabel + ", oobContinueLabel=" + this.oobContinueLabel + ", paymentSystemImage=" + this.paymentSystemImage + ", resendInformationLabel=" + this.resendInformationLabel + ", sdkTransId=" + this.sdkTransId + ", submitAuthenticationLabel=" + this.submitAuthenticationLabel + ", whitelistingInfoText=" + this.whitelistingInfoText + ", whyInfoLabel=" + this.whyInfoLabel + ", whyInfoText=" + this.whyInfoText + ", transStatus=" + this.transStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.acsHtml);
        parcel.writeString(this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        if (uiType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uiType.name());
        }
        parcel.writeInt(this.isChallengeCompleted ? 1 : 0);
        parcel.writeString(this.challengeInfoHeader);
        parcel.writeString(this.challengeInfoLabel);
        parcel.writeString(this.challengeInfoText);
        parcel.writeString(this.challengeAdditionalInfoText);
        parcel.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ChallengeSelectOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.expandInfoLabel);
        parcel.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<MessageExtension> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.oobAppUrl);
        parcel.writeString(this.oobAppLabel);
        parcel.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(parcel, flags);
        parcel.writeString(this.submitAuthenticationLabel);
        parcel.writeString(this.whitelistingInfoText);
        parcel.writeString(this.whyInfoLabel);
        parcel.writeString(this.whyInfoText);
        parcel.writeString(this.transStatus);
    }

    public ChallengeResponseData(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z, String str3, String str4, String str5, String str6, boolean z2, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        Intrinsics.checkNotNullParameter(serverTransId, "serverTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.serverTransId = serverTransId;
        this.acsTransId = acsTransId;
        this.acsHtml = str;
        this.acsHtmlRefresh = str2;
        this.uiType = uiType;
        this.isChallengeCompleted = z;
        this.challengeInfoHeader = str3;
        this.challengeInfoLabel = str4;
        this.challengeInfoText = str5;
        this.challengeAdditionalInfoText = str6;
        this.shouldShowChallengeInfoTextIndicator = z2;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str7;
        this.expandInfoText = str8;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = messageVersion;
        this.oobAppUrl = str9;
        this.oobAppLabel = str10;
        this.oobContinueLabel = str11;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str12;
        this.sdkTransId = sdkTransId;
        this.submitAuthenticationLabel = str13;
        this.whitelistingInfoText = str14;
        this.whyInfoLabel = str15;
        this.whyInfoText = str16;
        this.transStatus = str17;
    }

    public /* synthetic */ ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : uiType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : image, (32768 & i) != 0 ? null : list2, str11, (131072 & i) != 0 ? null : str12, (262144 & i) != 0 ? null : str13, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : image2, (2097152 & i) != 0 ? null : str15, sdkTransactionId, (8388608 & i) != 0 ? null : str16, (16777216 & i) != 0 ? null : str17, (33554432 & i) != 0 ? null : str18, (67108864 & i) != 0 ? null : str19, (i & 134217728) != 0 ? null : str20);
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getAcsHtml() {
        return this.acsHtml;
    }

    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    public final UiType getUiType() {
        return this.uiType;
    }

    /* renamed from: isChallengeCompleted, reason: from getter */
    public final boolean getIsChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> getChallengeSelectOptions() {
        return this.challengeSelectOptions;
    }

    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    public final String getTransStatus() {
        return this.transStatus;
    }

    public final boolean isValidForUi$3ds2sdk_release() {
        List<ChallengeSelectOption> list;
        UiType uiType = this.uiType;
        if (uiType == null) {
            return true;
        }
        if (uiType == UiType.Html) {
            String str = this.acsHtml;
            return !(str == null || StringsKt.isBlank(str));
        }
        Set of = SetsKt.setOf((Object[]) new String[]{this.challengeInfoHeader, this.challengeInfoLabel, this.challengeInfoText, this.whyInfoLabel, this.whyInfoText, this.expandInfoLabel, this.expandInfoText, this.resendInformationLabel});
        if (!(of instanceof Collection) || !of.isEmpty()) {
            Iterator it = of.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    UiType uiType2 = this.uiType;
                    if (uiType2 == UiType.OutOfBand) {
                        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{this.oobAppLabel, this.oobAppUrl, this.oobContinueLabel});
                        if ((of2 instanceof Collection) && of2.isEmpty()) {
                            return false;
                        }
                        for (String str3 : of2) {
                            if (!(str3 == null || StringsKt.isBlank(str3))) {
                                return true;
                            }
                        }
                        return false;
                    }
                    if ((uiType2 != UiType.SingleSelect && uiType2 != UiType.MultiSelect) || ((list = this.challengeSelectOptions) != null && !list.isEmpty())) {
                        String str4 = this.submitAuthenticationLabel;
                        return !(str4 == null || StringsKt.isBlank(str4));
                    }
                }
            }
        }
        return false;
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\r¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "Landroid/os/Parcelable;", "", "mediumUrl", "highUrl", "extraHighUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "density", "getUrlForDensity", "(I)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMediumUrl$3ds2sdk_release", "getHighUrl$3ds2sdk_release", "getExtraHighUrl$3ds2sdk_release", "getHighestFidelityImageUrl", "highestFidelityImageUrl", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Image implements Parcelable {
        private final String extraHighUrl;
        private final String highUrl;
        private final String mediumUrl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
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
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.areEqual(this.mediumUrl, image.mediumUrl) && Intrinsics.areEqual(this.highUrl, image.highUrl) && Intrinsics.areEqual(this.extraHighUrl, image.extraHighUrl);
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Image(mediumUrl=" + this.mediumUrl + ", highUrl=" + this.highUrl + ", extraHighUrl=" + this.extraHighUrl + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.mediumUrl);
            parcel.writeString(this.highUrl);
            parcel.writeString(this.extraHighUrl);
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public final String getHighestFidelityImageUrl() {
            Object next;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{this.extraHighUrl, this.highUrl, this.mediumUrl}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = (String) next;
                if (!(str == null || StringsKt.isBlank(str))) {
                    break;
                }
            }
            return (String) next;
        }

        public final String getUrlForDensity(int density) {
            String str;
            if (density <= 160) {
                str = this.mediumUrl;
            } else if (density >= 320) {
                str = this.extraHighUrl;
            } else {
                str = this.highUrl;
            }
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            return str == null ? getHighestFidelityImageUrl() : str;
        }

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image$Companion;", "", "()V", "FIELD_EXTRA_HIGH", "", "FIELD_HIGH", "FIELD_MEDIUM", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageJson", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Image fromJson$3ds2sdk_release(JSONObject imageJson) {
                if (imageJson != null) {
                    return new Image(imageJson.optString("medium"), imageJson.optString("high"), imageJson.optString("extraHigh"));
                }
                return null;
            }
        }
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "Landroid/os/Parcelable;", "", "name", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getText", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeSelectOption implements Parcelable {
        private final String name;
        private final String text;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new Creator();

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChallengeSelectOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption[] newArray(int i) {
                return new ChallengeSelectOption[i];
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
            if (!(other instanceof ChallengeSelectOption)) {
                return false;
            }
            ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) other;
            return Intrinsics.areEqual(this.name, challengeSelectOption.name) && Intrinsics.areEqual(this.text, challengeSelectOption.text);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.name + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.text);
        }

        public ChallengeSelectOption(String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.name = name;
            this.text = text;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;", "", "<init>", "()V", "Lorg/json/JSONArray;", "challengeSelectOptionsJson", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "fromJson$3ds2sdk_release", "(Lorg/json/JSONArray;)Ljava/util/List;", "fromJson", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final List<ChallengeSelectOption> fromJson$3ds2sdk_release(JSONArray challengeSelectOptionsJson) {
                if (challengeSelectOptionsJson == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = challengeSelectOptionsJson.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = challengeSelectOptionsJson.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String next = jSONObjectOptJSONObject.keys().next();
                        String strOptString = jSONObjectOptJSONObject.optString(next);
                        Intrinsics.checkNotNull(next);
                        Intrinsics.checkNotNull(strOptString);
                        arrayList.add(new ChallengeSelectOption(next, strOptString));
                    }
                }
                return arrayList;
            }
        }
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0015\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b/J\u0014\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0002J\u0015\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b4J\u0017\u00105\u001a\u0004\u0018\u0001062\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b7J\u001f\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;J\u001d\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010'2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b@J\u001f\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\bBJ\u001a\u0010C\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\u0004H\u0002J\u0017\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bGJ\u001f\u0010H\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0000¢\u0006\u0002\bIJ\u0015\u0010J\u001a\u00020K2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bLJ\u001d\u0010M\u001a\u00020N2\u0006\u0010+\u001a\u00020,2\u0006\u0010E\u001a\u00020\u0004H\u0001¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020:2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bQJ%\u0010R\u001a\u00020S2\u0006\u0010+\u001a\u00020,2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0002\bUR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006V"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;", "", "()V", "FIELD_ACS_COUNTER_ACS_TO_SDK", "", "FIELD_ACS_HTML", "FIELD_ACS_HTML_REFRESH", "FIELD_ACS_TRANS_ID", "FIELD_ACS_UI_TYPE", "FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT", "FIELD_CHALLENGE_COMPLETION_INDICATOR", "FIELD_CHALLENGE_INFO_HEADER", "FIELD_CHALLENGE_INFO_LABEL", "FIELD_CHALLENGE_INFO_TEXT", "FIELD_CHALLENGE_INFO_TEXT_INDICATOR", "FIELD_CHALLENGE_SELECT_INFO", "FIELD_EXPAND_INFO_LABEL", "FIELD_EXPAND_INFO_TEXT", "FIELD_ISSUER_IMAGE", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_APP_LABEL", "FIELD_OOB_APP_URL", "FIELD_OOB_CONTINUE_LABEL", "FIELD_PAYMENT_SYSTEM_IMAGE", "FIELD_RESEND_INFORMATION_LABEL", "FIELD_SDK_TRANS_ID", "FIELD_SERVER_TRANS_ID", "FIELD_SUBMIT_AUTHENTICATION_LABEL", "FIELD_TRANS_STATUS", "FIELD_WHITELISTING_INFO_TEXT", "FIELD_WHY_INFO_LABEL", "FIELD_WHY_INFO_TEXT", "FINAL_CRES_FIELDS", "", "MESSAGE_TYPE", "NO_VALUE", "YES_NO_VALUES", "", "YES_VALUE", "checkFinalCresFields", "", "cresJson", "Lorg/json/JSONObject;", "checkFinalCresFields$3ds2sdk_release", "checkMessageType", "checkMessageType$3ds2sdk_release", "decodeHtml", "encodedHtml", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "fromJson$3ds2sdk_release", "getChallengeSelectInfoArray", "Lorg/json/JSONArray;", "getChallengeSelectInfoArray$3ds2sdk_release", "getDecodedAcsHtml", "uiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getDecodedAcsHtml$3ds2sdk_release", "getMessageExtensions", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "getMessageExtensions$3ds2sdk_release", "getMessageVersion", "getMessageVersion$3ds2sdk_release", "getOobContinueLabel", "getOobContinueLabel$3ds2sdk_release", "getOrNull", "json", "fieldName", "getResendInformationLabel", "getResendInformationLabel$3ds2sdk_release", "getSubmitAuthenticationLabel", "getSubmitAuthenticationLabel$3ds2sdk_release", "getTransStatus", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "getTransStatus$3ds2sdk_release", "getTransactionId", "Ljava/util/UUID;", "getTransactionId$3ds2sdk_release", "getUiType", "getUiType$3ds2sdk_release", "getYesNoValue", "", "isRequired", "getYesNoValue$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeResponseData fromJson$3ds2sdk_release(JSONObject cresJson) throws JSONException, ChallengeResponseParseException {
            ChallengeResponseData challengeResponseData;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            checkMessageType$3ds2sdk_release(cresJson);
            boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release(cresJson, "challengeCompletionInd", true);
            SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release(cresJson, "sdkTransID"));
            String string2 = getTransactionId$3ds2sdk_release(cresJson, "threeDSServerTransID").toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String string3 = getTransactionId$3ds2sdk_release(cresJson, "acsTransID").toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            String messageVersion$3ds2sdk_release = getMessageVersion$3ds2sdk_release(cresJson);
            List<MessageExtension> messageExtensions$3ds2sdk_release = getMessageExtensions$3ds2sdk_release(cresJson);
            if (yesNoValue$3ds2sdk_release) {
                checkFinalCresFields$3ds2sdk_release(cresJson);
                challengeResponseData = new ChallengeResponseData(string2, string3, null, null, null, yesNoValue$3ds2sdk_release, null, null, null, null, false, null, null, null, null, messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, null, null, null, null, null, sdkTransactionId, null, null, null, null, getTransStatus$3ds2sdk_release(cresJson).getCode(), 129925084, null);
            } else {
                boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release(cresJson, "challengeInfoTextIndicator", false);
                String resendInformationLabel$3ds2sdk_release = getResendInformationLabel$3ds2sdk_release(cresJson);
                JSONArray challengeSelectInfoArray$3ds2sdk_release = getChallengeSelectInfoArray$3ds2sdk_release(cresJson);
                UiType uiType$3ds2sdk_release = getUiType$3ds2sdk_release(cresJson);
                String submitAuthenticationLabel$3ds2sdk_release = getSubmitAuthenticationLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String decodedAcsHtml$3ds2sdk_release = getDecodedAcsHtml$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String oobContinueLabel$3ds2sdk_release = getOobContinueLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                List<ChallengeSelectOption> listFromJson$3ds2sdk_release = ChallengeSelectOption.INSTANCE.fromJson$3ds2sdk_release(challengeSelectInfoArray$3ds2sdk_release);
                String strDecodeHtml = decodeHtml(cresJson.optString("acsHTMLRefresh"));
                String strOptString = cresJson.optString("challengeInfoHeader");
                String strOptString2 = cresJson.optString("challengeInfoLabel");
                String strOptString3 = cresJson.optString("challengeInfoText");
                String strOptString4 = cresJson.optString("challengeAddInfo");
                String strOptString5 = cresJson.optString("expandInfoLabel");
                String strOptString6 = cresJson.optString("expandInfoText");
                Image.Companion companion = Image.INSTANCE;
                challengeResponseData = new ChallengeResponseData(string2, string3, decodedAcsHtml$3ds2sdk_release, strDecodeHtml, uiType$3ds2sdk_release, yesNoValue$3ds2sdk_release, strOptString, strOptString2, strOptString3, strOptString4, yesNoValue$3ds2sdk_release2, listFromJson$3ds2sdk_release, strOptString5, strOptString6, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject("issuerImage")), messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, cresJson.optString("oobAppURL"), cresJson.optString("oobAppLabel"), oobContinueLabel$3ds2sdk_release, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject("psImage")), resendInformationLabel$3ds2sdk_release, sdkTransactionId, submitAuthenticationLabel$3ds2sdk_release, cresJson.optString("whitelistingInfoText"), cresJson.optString("whyInfoLabel"), cresJson.optString("whyInfoText"), "");
            }
            if (challengeResponseData.isValidForUi$3ds2sdk_release()) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("UI fields missing");
        }

        public final void checkFinalCresFields$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Iterator<String> itKeys = cresJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!ChallengeResponseData.FINAL_CRES_FIELDS.contains(next)) {
                    throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void checkMessageType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (!Intrinsics.areEqual("CRes", cresJson.optString("messageType"))) {
                throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final UiType getUiType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString("acsUiType");
            if (strOptString == null || StringsKt.isBlank(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("acsUiType");
            }
            UiType uiTypeFromCode$3ds2sdk_release = UiType.INSTANCE.fromCode$3ds2sdk_release(strOptString);
            if (uiTypeFromCode$3ds2sdk_release != null) {
                return uiTypeFromCode$3ds2sdk_release;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("acsUiType");
        }

        public final boolean getYesNoValue$3ds2sdk_release(JSONObject cresJson, String fieldName, boolean isRequired) throws JSONException, ChallengeResponseParseException {
            String orNull;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            if (isRequired) {
                if (cresJson.has(fieldName)) {
                    orNull = cresJson.getString(fieldName);
                } else {
                    throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
                }
            } else {
                orNull = getOrNull(cresJson, fieldName);
            }
            if (orNull != null && !ChallengeResponseData.YES_NO_VALUES.contains(orNull)) {
                if (isRequired && StringsKt.isBlank(orNull)) {
                    throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
                }
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(fieldName);
            }
            return Intrinsics.areEqual("Y", orNull);
        }

        public final String getResendInformationLabel$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String orNull = getOrNull(cresJson, "resendInformationLabel");
            if (orNull == null || orNull.length() != 0) {
                return orNull;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("resendInformationLabel");
        }

        public final JSONArray getChallengeSelectInfoArray$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (!cresJson.has("challengeSelectInfo")) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(cresJson.getJSONArray("challengeSelectInfo"));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                return (JSONArray) objM28550constructorimpl;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("challengeSelectInfo");
        }

        public final String getMessageVersion$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString("messageVersion");
            Intrinsics.checkNotNull(strOptString);
            if (StringsKt.isBlank(strOptString)) {
                strOptString = null;
            }
            if (strOptString != null) {
                return strOptString;
            }
            throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("messageVersion");
        }

        public final UUID getTransactionId$3ds2sdk_release(JSONObject cresJson, String fieldName) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            String strOptString = cresJson.optString(fieldName);
            if (strOptString == null || StringsKt.isBlank(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                UUID uuidFromString = UUID.fromString(strOptString);
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                return uuidFromString;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m28553exceptionOrNullimpl(Result.m28550constructorimpl(ResultKt.createFailure(th))) == null) {
                    throw new ExceptionsH();
                }
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(fieldName);
            }
        }

        public final TransactionStatus getTransStatus$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString("transStatus");
            if (strOptString == null || StringsKt.isBlank(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("transStatus");
            }
            TransactionStatus transactionStatusFromCode = TransactionStatus.INSTANCE.fromCode(strOptString);
            if (transactionStatusFromCode != null) {
                return transactionStatusFromCode;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("transStatus");
        }

        public final String getSubmitAuthenticationLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, "submitAuthenticationLabel");
            if ((orNull == null || StringsKt.isBlank(orNull)) && uiType.getRequiresSubmitButton()) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("submitAuthenticationLabel");
            }
            return orNull;
        }

        public final String getDecodedAcsHtml$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, "acsHTML");
            if ((orNull == null || StringsKt.isBlank(orNull)) && uiType == UiType.Html) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("acsHTML");
            }
            return decodeHtml(orNull);
        }

        private final String decodeHtml(String encodedHtml) {
            Object objM28550constructorimpl;
            if (encodedHtml == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                byte[] bArrDecode = Base64.decode(encodedHtml, 8);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                objM28550constructorimpl = Result.m28550constructorimpl(new String(bArrDecode, Charsets.UTF_8));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            return (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        }

        public final String getOobContinueLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String strOptString = cresJson.optString("oobContinueLabel");
            if ((strOptString == null || StringsKt.isBlank(strOptString)) && uiType == UiType.OutOfBand) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("oobContinueLabel");
            }
            return strOptString;
        }

        public final List<MessageExtension> getMessageExtensions$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            List<MessageExtension> listFromJson = MessageExtension.INSTANCE.fromJson(cresJson.optJSONArray("messageExtension"));
            if (listFromJson != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listFromJson) {
                    MessageExtension messageExtension = (MessageExtension) obj;
                    if (messageExtension.getCriticalityIndicator() && !messageExtension.isProcessable()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new ChallengeResponseParseException(ProtocolError.UnrecognizedCriticalMessageExtensions, CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                }
            }
            return listFromJson;
        }

        private final String getOrNull(JSONObject json, String fieldName) {
            if (json.has(fieldName)) {
                return json.getString(fieldName);
            }
            return null;
        }
    }
}
