package com.robinhood.android.acatsin.submit;

import android.graphics.Bitmap;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.submit.AcatsInSubmitViewState;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Either;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSubmitDataState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0015\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010J\u001a\u00020\u001cHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010L\u001a\u00020\u001cHÆ\u0003JÉ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001cHÆ\u0001J\u0013\u0010N\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00109R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001f\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b<\u00109¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;", "", "refId", "Ljava/util/UUID;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountType", "contraAccountNumber", "namesOnAccount", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "rhsAccountNumber", "selectedAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "selectedAccountManagementType", "Lcom/robinhood/models/api/ManagementType;", "acatsTransferRequestState", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "contraBrokerLogo", "Landroid/graphics/Bitmap;", "retirementMatchRate", "Ljava/math/BigDecimal;", "taxableAccountBonusRateString", "isAcatsBrokerageMatchSupported", "", "account", "Lcom/robinhood/models/db/Account;", "requiresCoOwnerSignature", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;Landroid/graphics/Bitmap;Ljava/math/BigDecimal;Ljava/lang/String;ZLcom/robinhood/models/db/Account;Z)V", "getRefId", "()Ljava/util/UUID;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountType", "()Ljava/lang/String;", "getContraAccountNumber", "getNamesOnAccount", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getAssets", "()Ljava/util/List;", "getRhsAccountNumber", "getSelectedAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSelectedAccountManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getAcatsTransferRequestState", "()Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "getContraBrokerLogo", "()Landroid/graphics/Bitmap;", "getRetirementMatchRate", "()Ljava/math/BigDecimal;", "getTaxableAccountBonusRateString", "()Z", "getAccount", "()Lcom/robinhood/models/db/Account;", "getRequiresCoOwnerSignature", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInSubmitDataState {
    public static final int $stable = 8;
    private final AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState;
    private final Account account;
    private final List<UiAcatsAsset> assets;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final String contraAccountNumber;
    private final Bitmap contraBrokerLogo;
    private final boolean isAcatsBrokerageMatchSupported;
    private final NamesOnAccount namesOnAccount;
    private final UUID refId;
    private final boolean requiresCoOwnerSignature;
    private final BigDecimal retirementMatchRate;
    private final String rhsAccountNumber;
    private final String rhsAccountType;
    private final ManagementType selectedAccountManagementType;
    private final BrokerageAccountType selectedAccountType;
    private final String taxableAccountBonusRateString;

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component10, reason: from getter */
    public final AcatsInSubmitViewState.AcatsTransferRequestState getAcatsTransferRequestState() {
        return this.acatsTransferRequestState;
    }

    /* renamed from: component11, reason: from getter */
    public final Bitmap getContraBrokerLogo() {
        return this.contraBrokerLogo;
    }

    /* renamed from: component12, reason: from getter */
    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTaxableAccountBonusRateString() {
        return this.taxableAccountBonusRateString;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAcatsBrokerageMatchSupported() {
        return this.isAcatsBrokerageMatchSupported;
    }

    /* renamed from: component15, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getRequiresCoOwnerSignature() {
        return this.requiresCoOwnerSignature;
    }

    public final Either<ApiBrokerage, String> component2() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRhsAccountType() {
        return this.rhsAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    public final List<UiAcatsAsset> component6() {
        return this.assets;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    /* renamed from: component9, reason: from getter */
    public final ManagementType getSelectedAccountManagementType() {
        return this.selectedAccountManagementType;
    }

    public final AcatsInSubmitDataState copy(UUID refId, Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountType, String contraAccountNumber, NamesOnAccount namesOnAccount, List<? extends UiAcatsAsset> assets, String rhsAccountNumber, BrokerageAccountType selectedAccountType, ManagementType selectedAccountManagementType, AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState, Bitmap contraBrokerLogo, BigDecimal retirementMatchRate, String taxableAccountBonusRateString, boolean isAcatsBrokerageMatchSupported, Account account, boolean requiresCoOwnerSignature) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(namesOnAccount, "namesOnAccount");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(selectedAccountManagementType, "selectedAccountManagementType");
        return new AcatsInSubmitDataState(refId, brokerageOrDtcNumber, rhsAccountType, contraAccountNumber, namesOnAccount, assets, rhsAccountNumber, selectedAccountType, selectedAccountManagementType, acatsTransferRequestState, contraBrokerLogo, retirementMatchRate, taxableAccountBonusRateString, isAcatsBrokerageMatchSupported, account, requiresCoOwnerSignature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInSubmitDataState)) {
            return false;
        }
        AcatsInSubmitDataState acatsInSubmitDataState = (AcatsInSubmitDataState) other;
        return Intrinsics.areEqual(this.refId, acatsInSubmitDataState.refId) && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInSubmitDataState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountType, acatsInSubmitDataState.rhsAccountType) && Intrinsics.areEqual(this.contraAccountNumber, acatsInSubmitDataState.contraAccountNumber) && Intrinsics.areEqual(this.namesOnAccount, acatsInSubmitDataState.namesOnAccount) && Intrinsics.areEqual(this.assets, acatsInSubmitDataState.assets) && Intrinsics.areEqual(this.rhsAccountNumber, acatsInSubmitDataState.rhsAccountNumber) && this.selectedAccountType == acatsInSubmitDataState.selectedAccountType && this.selectedAccountManagementType == acatsInSubmitDataState.selectedAccountManagementType && Intrinsics.areEqual(this.acatsTransferRequestState, acatsInSubmitDataState.acatsTransferRequestState) && Intrinsics.areEqual(this.contraBrokerLogo, acatsInSubmitDataState.contraBrokerLogo) && Intrinsics.areEqual(this.retirementMatchRate, acatsInSubmitDataState.retirementMatchRate) && Intrinsics.areEqual(this.taxableAccountBonusRateString, acatsInSubmitDataState.taxableAccountBonusRateString) && this.isAcatsBrokerageMatchSupported == acatsInSubmitDataState.isAcatsBrokerageMatchSupported && Intrinsics.areEqual(this.account, acatsInSubmitDataState.account) && this.requiresCoOwnerSignature == acatsInSubmitDataState.requiresCoOwnerSignature;
    }

    public int hashCode() {
        int iHashCode = ((this.refId.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
        String str = this.rhsAccountType;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contraAccountNumber.hashCode()) * 31) + this.namesOnAccount.hashCode()) * 31) + this.assets.hashCode()) * 31;
        String str2 = this.rhsAccountNumber;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectedAccountType.hashCode()) * 31) + this.selectedAccountManagementType.hashCode()) * 31;
        AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState = this.acatsTransferRequestState;
        int iHashCode4 = (iHashCode3 + (acatsTransferRequestState == null ? 0 : acatsTransferRequestState.hashCode())) * 31;
        Bitmap bitmap = this.contraBrokerLogo;
        int iHashCode5 = (iHashCode4 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        BigDecimal bigDecimal = this.retirementMatchRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.taxableAccountBonusRateString;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isAcatsBrokerageMatchSupported)) * 31;
        Account account = this.account;
        return ((iHashCode7 + (account != null ? account.hashCode() : 0)) * 31) + Boolean.hashCode(this.requiresCoOwnerSignature);
    }

    public String toString() {
        return "AcatsInSubmitDataState(refId=" + this.refId + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountType=" + this.rhsAccountType + ", contraAccountNumber=" + this.contraAccountNumber + ", namesOnAccount=" + this.namesOnAccount + ", assets=" + this.assets + ", rhsAccountNumber=" + this.rhsAccountNumber + ", selectedAccountType=" + this.selectedAccountType + ", selectedAccountManagementType=" + this.selectedAccountManagementType + ", acatsTransferRequestState=" + this.acatsTransferRequestState + ", contraBrokerLogo=" + this.contraBrokerLogo + ", retirementMatchRate=" + this.retirementMatchRate + ", taxableAccountBonusRateString=" + this.taxableAccountBonusRateString + ", isAcatsBrokerageMatchSupported=" + this.isAcatsBrokerageMatchSupported + ", account=" + this.account + ", requiresCoOwnerSignature=" + this.requiresCoOwnerSignature + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInSubmitDataState(UUID refId, Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, String contraAccountNumber, NamesOnAccount namesOnAccount, List<? extends UiAcatsAsset> assets, String str2, BrokerageAccountType selectedAccountType, ManagementType selectedAccountManagementType, AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState, Bitmap bitmap, BigDecimal bigDecimal, String str3, boolean z, Account account, boolean z2) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(namesOnAccount, "namesOnAccount");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(selectedAccountManagementType, "selectedAccountManagementType");
        this.refId = refId;
        this.brokerageOrDtcNumber = brokerageOrDtcNumber;
        this.rhsAccountType = str;
        this.contraAccountNumber = contraAccountNumber;
        this.namesOnAccount = namesOnAccount;
        this.assets = assets;
        this.rhsAccountNumber = str2;
        this.selectedAccountType = selectedAccountType;
        this.selectedAccountManagementType = selectedAccountManagementType;
        this.acatsTransferRequestState = acatsTransferRequestState;
        this.contraBrokerLogo = bitmap;
        this.retirementMatchRate = bigDecimal;
        this.taxableAccountBonusRateString = str3;
        this.isAcatsBrokerageMatchSupported = z;
        this.account = account;
        this.requiresCoOwnerSignature = z2;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final String getRhsAccountType() {
        return this.rhsAccountType;
    }

    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AcatsInSubmitDataState(java.util.UUID r20, com.robinhood.utils.Either r21, java.lang.String r22, java.lang.String r23, com.robinhood.android.acatsin.util.names.NamesOnAccount r24, java.util.List r25, java.lang.String r26, com.robinhood.models.api.BrokerageAccountType r27, com.robinhood.models.api.ManagementType r28, com.robinhood.android.acatsin.submit.AcatsInSubmitViewState.AcatsTransferRequestState r29, android.graphics.Bitmap r30, java.math.BigDecimal r31, java.lang.String r32, boolean r33, com.robinhood.models.p320db.Account r34, boolean r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            com.robinhood.models.api.ManagementType r1 = com.robinhood.models.api.ManagementType.UNKNOWN
            r11 = r1
            goto Lc
        La:
            r11 = r28
        Lc:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L13
            r12 = r2
            goto L15
        L13:
            r12 = r29
        L15:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L1b
            r13 = r2
            goto L1d
        L1b:
            r13 = r30
        L1d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L23
            r14 = r2
            goto L25
        L23:
            r14 = r31
        L25:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L2b
            r15 = r2
            goto L2d
        L2b:
            r15 = r32
        L2d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L35
            r1 = 0
            r16 = r1
            goto L37
        L35:
            r16 = r33
        L37:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L52
            r17 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r18 = r35
            r2 = r19
            goto L68
        L52:
            r17 = r34
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r18 = r35
        L68:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.submit.AcatsInSubmitDataState.<init>(java.util.UUID, com.robinhood.utils.Either, java.lang.String, java.lang.String, com.robinhood.android.acatsin.util.names.NamesOnAccount, java.util.List, java.lang.String, com.robinhood.models.api.BrokerageAccountType, com.robinhood.models.api.ManagementType, com.robinhood.android.acatsin.submit.AcatsInSubmitViewState$AcatsTransferRequestState, android.graphics.Bitmap, java.math.BigDecimal, java.lang.String, boolean, com.robinhood.models.db.Account, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ManagementType getSelectedAccountManagementType() {
        return this.selectedAccountManagementType;
    }

    public final AcatsInSubmitViewState.AcatsTransferRequestState getAcatsTransferRequestState() {
        return this.acatsTransferRequestState;
    }

    public final Bitmap getContraBrokerLogo() {
        return this.contraBrokerLogo;
    }

    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final String getTaxableAccountBonusRateString() {
        return this.taxableAccountBonusRateString;
    }

    public final boolean isAcatsBrokerageMatchSupported() {
        return this.isAcatsBrokerageMatchSupported;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getRequiresCoOwnerSignature() {
        return this.requiresCoOwnerSignature;
    }
}
