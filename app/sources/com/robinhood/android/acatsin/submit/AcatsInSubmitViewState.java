package com.robinhood.android.acatsin.submit;

import android.graphics.Bitmap;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInSubmitViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001kB³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u0015\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0013HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010b\u001a\u00020\u001cHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010d\u001a\u00020\u001cHÆ\u0003JÉ\u0001\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001cHÆ\u0001J\u0013\u0010f\u001a\u00020\u001c2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00109R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001f\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0013\u0010=\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b>\u0010'R\u0011\u0010?\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b@\u00109R\u0011\u0010A\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bB\u0010'R\u0013\u0010C\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0011\u0010E\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bF\u00109R\u0011\u0010G\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010'R\u0011\u0010I\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010;R\u0011\u0010K\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bP\u0010;R\u0011\u0010Q\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bR\u0010;R\u0011\u0010S\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bT\u0010;¨\u0006l"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState;", "", "refId", "Ljava/util/UUID;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountType", "contraAccountNumber", "namesOnAccount", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "rhsAccountNumber", "selectedAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "selectedAccountManagementType", "Lcom/robinhood/models/api/ManagementType;", "acatsTransferRequestState", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "contraBrokerLogo", "Landroid/graphics/Bitmap;", "retirementMatchRate", "Ljava/math/BigDecimal;", "taxableAccountBonusRateString", "isAcatsBrokerageMatchSupported", "", "accountName", "Lcom/robinhood/utils/resource/StringResource;", "requiresCoOwnerSignature", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;Landroid/graphics/Bitmap;Ljava/math/BigDecimal;Ljava/lang/String;ZLcom/robinhood/utils/resource/StringResource;Z)V", "getRefId", "()Ljava/util/UUID;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountType", "()Ljava/lang/String;", "getContraAccountNumber", "getNamesOnAccount", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getAssets", "()Ljava/util/List;", "getRhsAccountNumber", "getSelectedAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSelectedAccountManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getAcatsTransferRequestState", "()Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "getContraBrokerLogo", "()Landroid/graphics/Bitmap;", "getRetirementMatchRate", "()Ljava/math/BigDecimal;", "getTaxableAccountBonusRateString", "()Z", "getAccountName", "()Lcom/robinhood/utils/resource/StringResource;", "getRequiresCoOwnerSignature", "displayTaxableAccountBonusRate", "getDisplayTaxableAccountBonusRate", "matchRowVisible", "getMatchRowVisible", "brokerageDisplayLabel", "getBrokerageDisplayLabel", "assetsDisplayLabel", "getAssetsDisplayLabel", "showAssetsRow", "getShowAssetsRow", "namesOnAccountValue", "getNamesOnAccountValue", "namesOnAccountLabel", "getNamesOnAccountLabel", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "getRequest", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "disclaimer", "getDisclaimer", "title", "getTitle", "submitButtonText", "getSubmitButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "AcatsTransferRequestState", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInSubmitViewState {
    public static final int $stable = 8;
    private final AcatsTransferRequestState acatsTransferRequestState;
    private final StringResource accountName;
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
    public final AcatsTransferRequestState getAcatsTransferRequestState() {
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
    public final StringResource getAccountName() {
        return this.accountName;
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

    public final AcatsInSubmitViewState copy(UUID refId, Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountType, String contraAccountNumber, NamesOnAccount namesOnAccount, List<? extends UiAcatsAsset> assets, String rhsAccountNumber, BrokerageAccountType selectedAccountType, ManagementType selectedAccountManagementType, AcatsTransferRequestState acatsTransferRequestState, Bitmap contraBrokerLogo, BigDecimal retirementMatchRate, String taxableAccountBonusRateString, boolean isAcatsBrokerageMatchSupported, StringResource accountName, boolean requiresCoOwnerSignature) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(namesOnAccount, "namesOnAccount");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(selectedAccountManagementType, "selectedAccountManagementType");
        return new AcatsInSubmitViewState(refId, brokerageOrDtcNumber, rhsAccountType, contraAccountNumber, namesOnAccount, assets, rhsAccountNumber, selectedAccountType, selectedAccountManagementType, acatsTransferRequestState, contraBrokerLogo, retirementMatchRate, taxableAccountBonusRateString, isAcatsBrokerageMatchSupported, accountName, requiresCoOwnerSignature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInSubmitViewState)) {
            return false;
        }
        AcatsInSubmitViewState acatsInSubmitViewState = (AcatsInSubmitViewState) other;
        return Intrinsics.areEqual(this.refId, acatsInSubmitViewState.refId) && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInSubmitViewState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountType, acatsInSubmitViewState.rhsAccountType) && Intrinsics.areEqual(this.contraAccountNumber, acatsInSubmitViewState.contraAccountNumber) && Intrinsics.areEqual(this.namesOnAccount, acatsInSubmitViewState.namesOnAccount) && Intrinsics.areEqual(this.assets, acatsInSubmitViewState.assets) && Intrinsics.areEqual(this.rhsAccountNumber, acatsInSubmitViewState.rhsAccountNumber) && this.selectedAccountType == acatsInSubmitViewState.selectedAccountType && this.selectedAccountManagementType == acatsInSubmitViewState.selectedAccountManagementType && Intrinsics.areEqual(this.acatsTransferRequestState, acatsInSubmitViewState.acatsTransferRequestState) && Intrinsics.areEqual(this.contraBrokerLogo, acatsInSubmitViewState.contraBrokerLogo) && Intrinsics.areEqual(this.retirementMatchRate, acatsInSubmitViewState.retirementMatchRate) && Intrinsics.areEqual(this.taxableAccountBonusRateString, acatsInSubmitViewState.taxableAccountBonusRateString) && this.isAcatsBrokerageMatchSupported == acatsInSubmitViewState.isAcatsBrokerageMatchSupported && Intrinsics.areEqual(this.accountName, acatsInSubmitViewState.accountName) && this.requiresCoOwnerSignature == acatsInSubmitViewState.requiresCoOwnerSignature;
    }

    public int hashCode() {
        int iHashCode = ((this.refId.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
        String str = this.rhsAccountType;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contraAccountNumber.hashCode()) * 31) + this.namesOnAccount.hashCode()) * 31) + this.assets.hashCode()) * 31;
        String str2 = this.rhsAccountNumber;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectedAccountType.hashCode()) * 31) + this.selectedAccountManagementType.hashCode()) * 31;
        AcatsTransferRequestState acatsTransferRequestState = this.acatsTransferRequestState;
        int iHashCode4 = (iHashCode3 + (acatsTransferRequestState == null ? 0 : acatsTransferRequestState.hashCode())) * 31;
        Bitmap bitmap = this.contraBrokerLogo;
        int iHashCode5 = (iHashCode4 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        BigDecimal bigDecimal = this.retirementMatchRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.taxableAccountBonusRateString;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isAcatsBrokerageMatchSupported)) * 31;
        StringResource stringResource = this.accountName;
        return ((iHashCode7 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + Boolean.hashCode(this.requiresCoOwnerSignature);
    }

    public String toString() {
        return "AcatsInSubmitViewState(refId=" + this.refId + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountType=" + this.rhsAccountType + ", contraAccountNumber=" + this.contraAccountNumber + ", namesOnAccount=" + this.namesOnAccount + ", assets=" + this.assets + ", rhsAccountNumber=" + this.rhsAccountNumber + ", selectedAccountType=" + this.selectedAccountType + ", selectedAccountManagementType=" + this.selectedAccountManagementType + ", acatsTransferRequestState=" + this.acatsTransferRequestState + ", contraBrokerLogo=" + this.contraBrokerLogo + ", retirementMatchRate=" + this.retirementMatchRate + ", taxableAccountBonusRateString=" + this.taxableAccountBonusRateString + ", isAcatsBrokerageMatchSupported=" + this.isAcatsBrokerageMatchSupported + ", accountName=" + this.accountName + ", requiresCoOwnerSignature=" + this.requiresCoOwnerSignature + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInSubmitViewState(UUID refId, Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, String contraAccountNumber, NamesOnAccount namesOnAccount, List<? extends UiAcatsAsset> assets, String str2, BrokerageAccountType selectedAccountType, ManagementType selectedAccountManagementType, AcatsTransferRequestState acatsTransferRequestState, Bitmap bitmap, BigDecimal bigDecimal, String str3, boolean z, StringResource stringResource, boolean z2) {
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
        this.accountName = stringResource;
        this.requiresCoOwnerSignature = z2;
    }

    public /* synthetic */ AcatsInSubmitViewState(UUID uuid, Either either, String str, String str2, NamesOnAccount namesOnAccount, List list, String str3, BrokerageAccountType brokerageAccountType, ManagementType managementType, AcatsTransferRequestState acatsTransferRequestState, Bitmap bitmap, BigDecimal bigDecimal, String str4, boolean z, StringResource stringResource, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, either, str, str2, namesOnAccount, list, str3, brokerageAccountType, managementType, (i & 512) != 0 ? null : acatsTransferRequestState, (i & 1024) != 0 ? null : bitmap, (i & 2048) != 0 ? null : bigDecimal, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? null : stringResource, z2);
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

    public final ManagementType getSelectedAccountManagementType() {
        return this.selectedAccountManagementType;
    }

    public final AcatsTransferRequestState getAcatsTransferRequestState() {
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

    public final StringResource getAccountName() {
        return this.accountName;
    }

    public final boolean getRequiresCoOwnerSignature() {
        return this.requiresCoOwnerSignature;
    }

    public final String getDisplayTaxableAccountBonusRate() {
        String str = this.taxableAccountBonusRateString;
        if (this.isAcatsBrokerageMatchSupported) {
            return str;
        }
        return null;
    }

    public final boolean getMatchRowVisible() {
        return !(this.retirementMatchRate == null && this.taxableAccountBonusRateString == null) && this.selectedAccountManagementType == ManagementType.SELF_DIRECTED;
    }

    public final String getBrokerageDisplayLabel() {
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getName();
        }
        if (either instanceof Either.Right) {
            return (String) ((Either.Right) either).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getAssetsDisplayLabel() {
        if (getShowAssetsRow()) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C7686R.plurals.acats_in_review_assets_count, this.assets.size()), Integer.valueOf(this.assets.size()));
        }
        return null;
    }

    public final boolean getShowAssetsRow() {
        return !this.assets.isEmpty();
    }

    public final String getNamesOnAccountValue() {
        return CollectionsKt.joinToString$default(this.namesOnAccount.getAllNames(), "\n", null, null, 0, null, null, 62, null);
    }

    public final StringResource getNamesOnAccountLabel() {
        if (this.namesOnAccount.getAllNames().size() > 1) {
            return StringResource.INSTANCE.invoke(C7686R.string.acats_in_review_names_on_account_many, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_review_name_on_account_single, new Object[0]);
    }

    public final ApiAcatsTransferRequest getRequest() {
        ApiAcatsTransfer.TransferType transferType;
        if (this.assets.isEmpty()) {
            transferType = ApiAcatsTransfer.TransferType.FULL;
        } else {
            transferType = ApiAcatsTransfer.TransferType.PARTIAL;
        }
        ApiAcatsTransfer.TransferType transferType2 = transferType;
        List<UiAcatsAsset> list = this.assets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiAcatsAsset) it.next()).convertToApiModel());
        }
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (either instanceof Either.Left) {
            return new ApiAcatsTransferRequest(this.namesOnAccount.getCurrentUserName().getFullName(), this.contraAccountNumber, ((ApiBrokerage) ((Either.Left) this.brokerageOrDtcNumber).getValue()).getName(), ((ApiBrokerage) ((Either.Left) this.brokerageOrDtcNumber).getValue()).getDtcc_number(), transferType2, this.rhsAccountNumber, this.refId, arrayList);
        }
        if (!(either instanceof Either.Right)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ApiAcatsTransferRequest(this.namesOnAccount.getCurrentUserName().getFullName(), this.contraAccountNumber, null, (String) ((Either.Right) this.brokerageOrDtcNumber).getValue(), transferType2, this.rhsAccountNumber, this.refId, arrayList);
    }

    public final StringResource getDisclaimer() {
        if (this.requiresCoOwnerSignature) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_disclaimer_requires_co_owner, new Object[0]);
        }
        if (this.selectedAccountManagementType == ManagementType.MANAGED) {
            if (this.selectedAccountType.isRetirement()) {
                return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_disclaimer_managed_retirement, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_disclaimer_managed_taxable, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_review_disclaimer_default, new Object[0]);
    }

    public final StringResource getTitle() {
        if (this.requiresCoOwnerSignature) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_submit_for_co_owner_approval_title, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_submit_title, new Object[0]);
    }

    public final StringResource getSubmitButtonText() {
        if (this.requiresCoOwnerSignature) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_send_to_co_owner_button_text, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.acats_in_review_submit_button_text, new Object[0]);
    }

    /* compiled from: AcatsInSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Error;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Loading;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Success;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class AcatsTransferRequestState {
        public static final int $stable = 0;

        public /* synthetic */ AcatsTransferRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AcatsInSubmitViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Loading;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends AcatsTransferRequestState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private AcatsTransferRequestState() {
        }

        /* compiled from: AcatsInSubmitViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Success;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "acatsTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAcatsTransferId", "()Ljava/util/UUID;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends AcatsTransferRequestState {
            public static final int $stable = 8;
            private final UUID acatsTransferId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UUID acatsTransferId) {
                super(null);
                Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
                this.acatsTransferId = acatsTransferId;
            }

            public final UUID getAcatsTransferId() {
                return this.acatsTransferId;
            }
        }

        /* compiled from: AcatsInSubmitViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState$Error;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends AcatsTransferRequestState {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }
}
