package com.robinhood.android.acatsin.coowner;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.coowner.AcatsInCoOwnerState2;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jo\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerViewState;", "", "source", "", "isFromTransferDetails", "", "acatsTransferId", "Ljava/util/UUID;", "rhsAccountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "dtccNumber", "coOwnerName", "confirmationTitle", "Lcom/robinhood/utils/resource/StringResource;", "confirmationDescription", "<init>", "(Ljava/lang/String;ZLjava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getSource", "()Ljava/lang/String;", "()Z", "getAcatsTransferId", "()Ljava/util/UUID;", "getRhsAccountNumber", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDtccNumber", "getCoOwnerName", "getConfirmationTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getConfirmationDescription", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "buildAgreementsStep", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Agreements;", "buildConfirmationStep", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Confirmation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInCoOwnerViewState {
    public static final int $stable = 8;
    private final UUID acatsTransferId;
    private final BrokerageAccountType brokerageAccountType;
    private final String coOwnerName;
    private final StringResource confirmationDescription;
    private final StringResource confirmationTitle;
    private final String dtccNumber;
    private final boolean isFromTransferDetails;
    private final String rhsAccountNumber;
    private final String source;

    public static /* synthetic */ AcatsInCoOwnerViewState copy$default(AcatsInCoOwnerViewState acatsInCoOwnerViewState, String str, boolean z, UUID uuid, String str2, BrokerageAccountType brokerageAccountType, String str3, String str4, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsInCoOwnerViewState.source;
        }
        if ((i & 2) != 0) {
            z = acatsInCoOwnerViewState.isFromTransferDetails;
        }
        if ((i & 4) != 0) {
            uuid = acatsInCoOwnerViewState.acatsTransferId;
        }
        if ((i & 8) != 0) {
            str2 = acatsInCoOwnerViewState.rhsAccountNumber;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = acatsInCoOwnerViewState.brokerageAccountType;
        }
        if ((i & 32) != 0) {
            str3 = acatsInCoOwnerViewState.dtccNumber;
        }
        if ((i & 64) != 0) {
            str4 = acatsInCoOwnerViewState.coOwnerName;
        }
        if ((i & 128) != 0) {
            stringResource = acatsInCoOwnerViewState.confirmationTitle;
        }
        if ((i & 256) != 0) {
            stringResource2 = acatsInCoOwnerViewState.confirmationDescription;
        }
        StringResource stringResource3 = stringResource;
        StringResource stringResource4 = stringResource2;
        String str5 = str3;
        String str6 = str4;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        UUID uuid2 = uuid;
        return acatsInCoOwnerViewState.copy(str, z, uuid2, str2, brokerageAccountType2, str5, str6, stringResource3, stringResource4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromTransferDetails() {
        return this.isFromTransferDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getAcatsTransferId() {
        return this.acatsTransferId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDtccNumber() {
        return this.dtccNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCoOwnerName() {
        return this.coOwnerName;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final StringResource getConfirmationDescription() {
        return this.confirmationDescription;
    }

    public final AcatsInCoOwnerViewState copy(String source, boolean isFromTransferDetails, UUID acatsTransferId, String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber, String coOwnerName, StringResource confirmationTitle, StringResource confirmationDescription) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        return new AcatsInCoOwnerViewState(source, isFromTransferDetails, acatsTransferId, rhsAccountNumber, brokerageAccountType, dtccNumber, coOwnerName, confirmationTitle, confirmationDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInCoOwnerViewState)) {
            return false;
        }
        AcatsInCoOwnerViewState acatsInCoOwnerViewState = (AcatsInCoOwnerViewState) other;
        return Intrinsics.areEqual(this.source, acatsInCoOwnerViewState.source) && this.isFromTransferDetails == acatsInCoOwnerViewState.isFromTransferDetails && Intrinsics.areEqual(this.acatsTransferId, acatsInCoOwnerViewState.acatsTransferId) && Intrinsics.areEqual(this.rhsAccountNumber, acatsInCoOwnerViewState.rhsAccountNumber) && this.brokerageAccountType == acatsInCoOwnerViewState.brokerageAccountType && Intrinsics.areEqual(this.dtccNumber, acatsInCoOwnerViewState.dtccNumber) && Intrinsics.areEqual(this.coOwnerName, acatsInCoOwnerViewState.coOwnerName) && Intrinsics.areEqual(this.confirmationTitle, acatsInCoOwnerViewState.confirmationTitle) && Intrinsics.areEqual(this.confirmationDescription, acatsInCoOwnerViewState.confirmationDescription);
    }

    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + Boolean.hashCode(this.isFromTransferDetails)) * 31) + this.acatsTransferId.hashCode()) * 31;
        String str = this.rhsAccountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode3 = (iHashCode2 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        String str2 = this.dtccNumber;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coOwnerName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StringResource stringResource = this.confirmationTitle;
        int iHashCode6 = (iHashCode5 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.confirmationDescription;
        return iHashCode6 + (stringResource2 != null ? stringResource2.hashCode() : 0);
    }

    public String toString() {
        return "AcatsInCoOwnerViewState(source=" + this.source + ", isFromTransferDetails=" + this.isFromTransferDetails + ", acatsTransferId=" + this.acatsTransferId + ", rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", dtccNumber=" + this.dtccNumber + ", coOwnerName=" + this.coOwnerName + ", confirmationTitle=" + this.confirmationTitle + ", confirmationDescription=" + this.confirmationDescription + ")";
    }

    public AcatsInCoOwnerViewState(String source, boolean z, UUID acatsTransferId, String str, BrokerageAccountType brokerageAccountType, String str2, String str3, StringResource stringResource, StringResource stringResource2) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        this.source = source;
        this.isFromTransferDetails = z;
        this.acatsTransferId = acatsTransferId;
        this.rhsAccountNumber = str;
        this.brokerageAccountType = brokerageAccountType;
        this.dtccNumber = str2;
        this.coOwnerName = str3;
        this.confirmationTitle = stringResource;
        this.confirmationDescription = stringResource2;
    }

    public /* synthetic */ AcatsInCoOwnerViewState(String str, boolean z, UUID uuid, String str2, BrokerageAccountType brokerageAccountType, String str3, String str4, StringResource stringResource, StringResource stringResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, uuid, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : brokerageAccountType, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : stringResource, (i & 256) != 0 ? null : stringResource2);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isFromTransferDetails() {
        return this.isFromTransferDetails;
    }

    public final UUID getAcatsTransferId() {
        return this.acatsTransferId;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final String getDtccNumber() {
        return this.dtccNumber;
    }

    public final String getCoOwnerName() {
        return this.coOwnerName;
    }

    public final StringResource getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final StringResource getConfirmationDescription() {
        return this.confirmationDescription;
    }

    public final AcatsInScreenContext getScreenContext() {
        String str = this.source;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        rosetta.account.BrokerageAccountType protobuf = BrokerageAccountTypes3.toProtobuf(brokerageAccountType);
        String str2 = this.dtccNumber;
        if (str2 == null) {
            str2 = "";
        }
        return new AcatsInScreenContext(str, true, false, protobuf, null, null, false, str2, false, 368, null);
    }

    public final AcatsInCoOwnerState2.Agreements buildAgreementsStep() {
        String str = this.rhsAccountNumber;
        if (str == null) {
            throw new IllegalStateException("rhsAccountNumber required for co-owner ACATs flow agreements step");
        }
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        if (brokerageAccountType == null) {
            throw new IllegalStateException("brokerageAccountType required for co-owner ACATs flow agreements step");
        }
        String str2 = this.dtccNumber;
        if (str2 != null) {
            return new AcatsInCoOwnerState2.Agreements(str, brokerageAccountType, str2, getScreenContext());
        }
        throw new IllegalStateException("dtccNumber required for co-owner ACATs flow agreements step");
    }

    public final AcatsInCoOwnerState2.Confirmation buildConfirmationStep() {
        UUID uuid = this.acatsTransferId;
        if (uuid == null) {
            throw new IllegalStateException("acatsTransferId required for co-owner ACATs flow confirmation step");
        }
        String str = this.dtccNumber;
        if (str == null) {
            throw new IllegalStateException("dtccNumber required for co-owner ACATs flow confirmation step");
        }
        AcatsInScreenContext screenContext = getScreenContext();
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AcatsInCoOwnerState2.Confirmation(uuid, str, screenContext, companion.invoke(C7686R.string.acats_in_confirmation_title, new Object[0]), companion.invoke(C7686R.string.acats_in_confirmation_co_owner_reviewer_description, new Object[0]), this.isFromTransferDetails);
    }
}
