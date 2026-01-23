package com.robinhood.android.acatsin.coowner;

import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "", "<init>", "()V", "Agreements", "Confirmation", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Agreements;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Confirmation;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerStep, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AcatsInCoOwnerState2 {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInCoOwnerState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInCoOwnerState2() {
    }

    /* compiled from: AcatsInCoOwnerState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Agreements;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "dtccNumber", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDtccNumber", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerStep$Agreements, reason: from toString */
    public static final /* data */ class Agreements extends AcatsInCoOwnerState2 {
        public static final int $stable = AcatsInScreenContext.$stable;
        private final BrokerageAccountType brokerageAccountType;
        private final String dtccNumber;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        public static /* synthetic */ Agreements copy$default(Agreements agreements, String str, BrokerageAccountType brokerageAccountType, String str2, AcatsInScreenContext acatsInScreenContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agreements.rhsAccountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = agreements.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                str2 = agreements.dtccNumber;
            }
            if ((i & 8) != 0) {
                acatsInScreenContext = agreements.screenContext;
            }
            return agreements.copy(str, brokerageAccountType, str2, acatsInScreenContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDtccNumber() {
            return this.dtccNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Agreements copy(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber, AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Agreements(rhsAccountNumber, brokerageAccountType, dtccNumber, screenContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Agreements)) {
                return false;
            }
            Agreements agreements = (Agreements) other;
            return Intrinsics.areEqual(this.rhsAccountNumber, agreements.rhsAccountNumber) && this.brokerageAccountType == agreements.brokerageAccountType && Intrinsics.areEqual(this.dtccNumber, agreements.dtccNumber) && Intrinsics.areEqual(this.screenContext, agreements.screenContext);
        }

        public int hashCode() {
            return (((((this.rhsAccountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.dtccNumber.hashCode()) * 31) + this.screenContext.hashCode();
        }

        public String toString() {
            return "Agreements(rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", dtccNumber=" + this.dtccNumber + ", screenContext=" + this.screenContext + ")";
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

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Agreements(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber, AcatsInScreenContext screenContext) {
            super(null);
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.rhsAccountNumber = rhsAccountNumber;
            this.brokerageAccountType = brokerageAccountType;
            this.dtccNumber = dtccNumber;
            this.screenContext = screenContext;
        }
    }

    /* compiled from: AcatsInCoOwnerState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep$Confirmation;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "acatsTransferId", "Ljava/util/UUID;", "dtccNumber", "", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "confirmationTitle", "Lcom/robinhood/utils/resource/StringResource;", "confirmationDescription", "isFromTransferDetails", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getAcatsTransferId", "()Ljava/util/UUID;", "getDtccNumber", "()Ljava/lang/String;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getConfirmationTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getConfirmationDescription", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerStep$Confirmation, reason: from toString */
    public static final /* data */ class Confirmation extends AcatsInCoOwnerState2 {
        public static final int $stable = 8;
        private final UUID acatsTransferId;
        private final StringResource confirmationDescription;
        private final StringResource confirmationTitle;
        private final String dtccNumber;
        private final boolean isFromTransferDetails;
        private final AcatsInScreenContext screenContext;

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, UUID uuid, String str, AcatsInScreenContext acatsInScreenContext, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = confirmation.acatsTransferId;
            }
            if ((i & 2) != 0) {
                str = confirmation.dtccNumber;
            }
            if ((i & 4) != 0) {
                acatsInScreenContext = confirmation.screenContext;
            }
            if ((i & 8) != 0) {
                stringResource = confirmation.confirmationTitle;
            }
            if ((i & 16) != 0) {
                stringResource2 = confirmation.confirmationDescription;
            }
            if ((i & 32) != 0) {
                z = confirmation.isFromTransferDetails;
            }
            StringResource stringResource3 = stringResource2;
            boolean z2 = z;
            return confirmation.copy(uuid, str, acatsInScreenContext, stringResource, stringResource3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAcatsTransferId() {
            return this.acatsTransferId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDtccNumber() {
            return this.dtccNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getConfirmationTitle() {
            return this.confirmationTitle;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getConfirmationDescription() {
            return this.confirmationDescription;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFromTransferDetails() {
            return this.isFromTransferDetails;
        }

        public final Confirmation copy(UUID acatsTransferId, String dtccNumber, AcatsInScreenContext screenContext, StringResource confirmationTitle, StringResource confirmationDescription, boolean isFromTransferDetails) {
            Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
            Intrinsics.checkNotNullParameter(confirmationDescription, "confirmationDescription");
            return new Confirmation(acatsTransferId, dtccNumber, screenContext, confirmationTitle, confirmationDescription, isFromTransferDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) other;
            return Intrinsics.areEqual(this.acatsTransferId, confirmation.acatsTransferId) && Intrinsics.areEqual(this.dtccNumber, confirmation.dtccNumber) && Intrinsics.areEqual(this.screenContext, confirmation.screenContext) && Intrinsics.areEqual(this.confirmationTitle, confirmation.confirmationTitle) && Intrinsics.areEqual(this.confirmationDescription, confirmation.confirmationDescription) && this.isFromTransferDetails == confirmation.isFromTransferDetails;
        }

        public int hashCode() {
            return (((((((((this.acatsTransferId.hashCode() * 31) + this.dtccNumber.hashCode()) * 31) + this.screenContext.hashCode()) * 31) + this.confirmationTitle.hashCode()) * 31) + this.confirmationDescription.hashCode()) * 31) + Boolean.hashCode(this.isFromTransferDetails);
        }

        public String toString() {
            return "Confirmation(acatsTransferId=" + this.acatsTransferId + ", dtccNumber=" + this.dtccNumber + ", screenContext=" + this.screenContext + ", confirmationTitle=" + this.confirmationTitle + ", confirmationDescription=" + this.confirmationDescription + ", isFromTransferDetails=" + this.isFromTransferDetails + ")";
        }

        public final UUID getAcatsTransferId() {
            return this.acatsTransferId;
        }

        public final String getDtccNumber() {
            return this.dtccNumber;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final StringResource getConfirmationTitle() {
            return this.confirmationTitle;
        }

        public final StringResource getConfirmationDescription() {
            return this.confirmationDescription;
        }

        public final boolean isFromTransferDetails() {
            return this.isFromTransferDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirmation(UUID acatsTransferId, String dtccNumber, AcatsInScreenContext screenContext, StringResource confirmationTitle, StringResource confirmationDescription, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
            Intrinsics.checkNotNullParameter(confirmationDescription, "confirmationDescription");
            this.acatsTransferId = acatsTransferId;
            this.dtccNumber = dtccNumber;
            this.screenContext = screenContext;
            this.confirmationTitle = confirmationTitle;
            this.confirmationDescription = confirmationDescription;
            this.isFromTransferDetails = z;
        }
    }
}
