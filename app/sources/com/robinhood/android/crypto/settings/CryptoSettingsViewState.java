package com.robinhood.android.crypto.settings;

import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00012Bm\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\"\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0083\u0001\u0010,\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState;", "", "cryptoTransferHistoryItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "isActivateTransferButtonVisible", "", "receivingStatusTitle", "Lcom/robinhood/utils/resource/StringResource;", "receivingCryptoRowStatus", "", "sendingStatusTitle", "sendingCryptoRowStatus", "sendingCryptoRowDescription", "isUserEligibleForHigherLimit", "isVolumeTiersDiscoveryExperimentEnabled", "allowlistToggleState", "Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;)V", "getCryptoTransferHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getReceivingStatusTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getReceivingCryptoRowStatus", "()Ljava/lang/String;", "getSendingStatusTitle", "getSendingCryptoRowStatus", "getSendingCryptoRowDescription", "getAllowlistToggleState", "()Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "AllowlistToggleState", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoSettingsViewState {
    public static final int $stable = 8;
    private final AllowlistToggleState allowlistToggleState;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> cryptoTransferHistoryItems;
    private final boolean isActivateTransferButtonVisible;
    private final boolean isUserEligibleForHigherLimit;
    private final boolean isVolumeTiersDiscoveryExperimentEnabled;
    private final String receivingCryptoRowStatus;
    private final StringResource receivingStatusTitle;
    private final String sendingCryptoRowDescription;
    private final String sendingCryptoRowStatus;
    private final StringResource sendingStatusTitle;

    public static /* synthetic */ CryptoSettingsViewState copy$default(CryptoSettingsViewState cryptoSettingsViewState, ImmutableList immutableList, boolean z, StringResource stringResource, String str, StringResource stringResource2, String str2, String str3, boolean z2, boolean z3, AllowlistToggleState allowlistToggleState, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoSettingsViewState.cryptoTransferHistoryItems;
        }
        if ((i & 2) != 0) {
            z = cryptoSettingsViewState.isActivateTransferButtonVisible;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoSettingsViewState.receivingStatusTitle;
        }
        if ((i & 8) != 0) {
            str = cryptoSettingsViewState.receivingCryptoRowStatus;
        }
        if ((i & 16) != 0) {
            stringResource2 = cryptoSettingsViewState.sendingStatusTitle;
        }
        if ((i & 32) != 0) {
            str2 = cryptoSettingsViewState.sendingCryptoRowStatus;
        }
        if ((i & 64) != 0) {
            str3 = cryptoSettingsViewState.sendingCryptoRowDescription;
        }
        if ((i & 128) != 0) {
            z2 = cryptoSettingsViewState.isUserEligibleForHigherLimit;
        }
        if ((i & 256) != 0) {
            z3 = cryptoSettingsViewState.isVolumeTiersDiscoveryExperimentEnabled;
        }
        if ((i & 512) != 0) {
            allowlistToggleState = cryptoSettingsViewState.allowlistToggleState;
        }
        boolean z4 = z3;
        AllowlistToggleState allowlistToggleState2 = allowlistToggleState;
        String str4 = str3;
        boolean z5 = z2;
        StringResource stringResource3 = stringResource2;
        String str5 = str2;
        return cryptoSettingsViewState.copy(immutableList, z, stringResource, str, stringResource3, str5, str4, z5, z4, allowlistToggleState2);
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component1() {
        return this.cryptoTransferHistoryItems;
    }

    /* renamed from: component10, reason: from getter */
    public final AllowlistToggleState getAllowlistToggleState() {
        return this.allowlistToggleState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActivateTransferButtonVisible() {
        return this.isActivateTransferButtonVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getReceivingStatusTitle() {
        return this.receivingStatusTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReceivingCryptoRowStatus() {
        return this.receivingCryptoRowStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSendingStatusTitle() {
        return this.sendingStatusTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSendingCryptoRowStatus() {
        return this.sendingCryptoRowStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSendingCryptoRowDescription() {
        return this.sendingCryptoRowDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUserEligibleForHigherLimit() {
        return this.isUserEligibleForHigherLimit;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsVolumeTiersDiscoveryExperimentEnabled() {
        return this.isVolumeTiersDiscoveryExperimentEnabled;
    }

    public final CryptoSettingsViewState copy(ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> cryptoTransferHistoryItems, boolean isActivateTransferButtonVisible, StringResource receivingStatusTitle, String receivingCryptoRowStatus, StringResource sendingStatusTitle, String sendingCryptoRowStatus, String sendingCryptoRowDescription, boolean isUserEligibleForHigherLimit, boolean isVolumeTiersDiscoveryExperimentEnabled, AllowlistToggleState allowlistToggleState) {
        Intrinsics.checkNotNullParameter(receivingStatusTitle, "receivingStatusTitle");
        Intrinsics.checkNotNullParameter(receivingCryptoRowStatus, "receivingCryptoRowStatus");
        Intrinsics.checkNotNullParameter(sendingStatusTitle, "sendingStatusTitle");
        Intrinsics.checkNotNullParameter(sendingCryptoRowStatus, "sendingCryptoRowStatus");
        return new CryptoSettingsViewState(cryptoTransferHistoryItems, isActivateTransferButtonVisible, receivingStatusTitle, receivingCryptoRowStatus, sendingStatusTitle, sendingCryptoRowStatus, sendingCryptoRowDescription, isUserEligibleForHigherLimit, isVolumeTiersDiscoveryExperimentEnabled, allowlistToggleState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSettingsViewState)) {
            return false;
        }
        CryptoSettingsViewState cryptoSettingsViewState = (CryptoSettingsViewState) other;
        return Intrinsics.areEqual(this.cryptoTransferHistoryItems, cryptoSettingsViewState.cryptoTransferHistoryItems) && this.isActivateTransferButtonVisible == cryptoSettingsViewState.isActivateTransferButtonVisible && Intrinsics.areEqual(this.receivingStatusTitle, cryptoSettingsViewState.receivingStatusTitle) && Intrinsics.areEqual(this.receivingCryptoRowStatus, cryptoSettingsViewState.receivingCryptoRowStatus) && Intrinsics.areEqual(this.sendingStatusTitle, cryptoSettingsViewState.sendingStatusTitle) && Intrinsics.areEqual(this.sendingCryptoRowStatus, cryptoSettingsViewState.sendingCryptoRowStatus) && Intrinsics.areEqual(this.sendingCryptoRowDescription, cryptoSettingsViewState.sendingCryptoRowDescription) && this.isUserEligibleForHigherLimit == cryptoSettingsViewState.isUserEligibleForHigherLimit && this.isVolumeTiersDiscoveryExperimentEnabled == cryptoSettingsViewState.isVolumeTiersDiscoveryExperimentEnabled && Intrinsics.areEqual(this.allowlistToggleState, cryptoSettingsViewState.allowlistToggleState);
    }

    public int hashCode() {
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> immutableList = this.cryptoTransferHistoryItems;
        int iHashCode = (((((((((((immutableList == null ? 0 : immutableList.hashCode()) * 31) + Boolean.hashCode(this.isActivateTransferButtonVisible)) * 31) + this.receivingStatusTitle.hashCode()) * 31) + this.receivingCryptoRowStatus.hashCode()) * 31) + this.sendingStatusTitle.hashCode()) * 31) + this.sendingCryptoRowStatus.hashCode()) * 31;
        String str = this.sendingCryptoRowDescription;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isUserEligibleForHigherLimit)) * 31) + Boolean.hashCode(this.isVolumeTiersDiscoveryExperimentEnabled)) * 31;
        AllowlistToggleState allowlistToggleState = this.allowlistToggleState;
        return iHashCode2 + (allowlistToggleState != null ? allowlistToggleState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoSettingsViewState(cryptoTransferHistoryItems=" + this.cryptoTransferHistoryItems + ", isActivateTransferButtonVisible=" + this.isActivateTransferButtonVisible + ", receivingStatusTitle=" + this.receivingStatusTitle + ", receivingCryptoRowStatus=" + this.receivingCryptoRowStatus + ", sendingStatusTitle=" + this.sendingStatusTitle + ", sendingCryptoRowStatus=" + this.sendingCryptoRowStatus + ", sendingCryptoRowDescription=" + this.sendingCryptoRowDescription + ", isUserEligibleForHigherLimit=" + this.isUserEligibleForHigherLimit + ", isVolumeTiersDiscoveryExperimentEnabled=" + this.isVolumeTiersDiscoveryExperimentEnabled + ", allowlistToggleState=" + this.allowlistToggleState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoSettingsViewState(ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> immutableList, boolean z, StringResource receivingStatusTitle, String receivingCryptoRowStatus, StringResource sendingStatusTitle, String sendingCryptoRowStatus, String str, boolean z2, boolean z3, AllowlistToggleState allowlistToggleState) {
        Intrinsics.checkNotNullParameter(receivingStatusTitle, "receivingStatusTitle");
        Intrinsics.checkNotNullParameter(receivingCryptoRowStatus, "receivingCryptoRowStatus");
        Intrinsics.checkNotNullParameter(sendingStatusTitle, "sendingStatusTitle");
        Intrinsics.checkNotNullParameter(sendingCryptoRowStatus, "sendingCryptoRowStatus");
        this.cryptoTransferHistoryItems = immutableList;
        this.isActivateTransferButtonVisible = z;
        this.receivingStatusTitle = receivingStatusTitle;
        this.receivingCryptoRowStatus = receivingCryptoRowStatus;
        this.sendingStatusTitle = sendingStatusTitle;
        this.sendingCryptoRowStatus = sendingCryptoRowStatus;
        this.sendingCryptoRowDescription = str;
        this.isUserEligibleForHigherLimit = z2;
        this.isVolumeTiersDiscoveryExperimentEnabled = z3;
        this.allowlistToggleState = allowlistToggleState;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getCryptoTransferHistoryItems() {
        return this.cryptoTransferHistoryItems;
    }

    public final boolean isActivateTransferButtonVisible() {
        return this.isActivateTransferButtonVisible;
    }

    public final StringResource getReceivingStatusTitle() {
        return this.receivingStatusTitle;
    }

    public final String getReceivingCryptoRowStatus() {
        return this.receivingCryptoRowStatus;
    }

    public final StringResource getSendingStatusTitle() {
        return this.sendingStatusTitle;
    }

    public final String getSendingCryptoRowStatus() {
        return this.sendingCryptoRowStatus;
    }

    public final String getSendingCryptoRowDescription() {
        return this.sendingCryptoRowDescription;
    }

    public final boolean isUserEligibleForHigherLimit() {
        return this.isUserEligibleForHigherLimit;
    }

    public final boolean isVolumeTiersDiscoveryExperimentEnabled() {
        return this.isVolumeTiersDiscoveryExperimentEnabled;
    }

    public final AllowlistToggleState getAllowlistToggleState() {
        return this.allowlistToggleState;
    }

    /* compiled from: CryptoSettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;", "", "status", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "isToggleEnabled", "", "showLoading", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;ZZ)V", "getStatus", "()Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "()Z", "getShowLoading", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AllowlistToggleState {
        public static final int $stable = 8;
        private final boolean isToggleEnabled;
        private final boolean showLoading;
        private final AllowlistStatus status;

        public static /* synthetic */ AllowlistToggleState copy$default(AllowlistToggleState allowlistToggleState, AllowlistStatus allowlistStatus, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                allowlistStatus = allowlistToggleState.status;
            }
            if ((i & 2) != 0) {
                z = allowlistToggleState.isToggleEnabled;
            }
            if ((i & 4) != 0) {
                z2 = allowlistToggleState.showLoading;
            }
            return allowlistToggleState.copy(allowlistStatus, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final AllowlistStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsToggleEnabled() {
            return this.isToggleEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowLoading() {
            return this.showLoading;
        }

        public final AllowlistToggleState copy(AllowlistStatus status, boolean isToggleEnabled, boolean showLoading) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new AllowlistToggleState(status, isToggleEnabled, showLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllowlistToggleState)) {
                return false;
            }
            AllowlistToggleState allowlistToggleState = (AllowlistToggleState) other;
            return Intrinsics.areEqual(this.status, allowlistToggleState.status) && this.isToggleEnabled == allowlistToggleState.isToggleEnabled && this.showLoading == allowlistToggleState.showLoading;
        }

        public int hashCode() {
            return (((this.status.hashCode() * 31) + Boolean.hashCode(this.isToggleEnabled)) * 31) + Boolean.hashCode(this.showLoading);
        }

        public String toString() {
            return "AllowlistToggleState(status=" + this.status + ", isToggleEnabled=" + this.isToggleEnabled + ", showLoading=" + this.showLoading + ")";
        }

        public AllowlistToggleState(AllowlistStatus status, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.isToggleEnabled = z;
            this.showLoading = z2;
        }

        public final AllowlistStatus getStatus() {
            return this.status;
        }

        public final boolean isToggleEnabled() {
            return this.isToggleEnabled;
        }

        public final boolean getShowLoading() {
            return this.showLoading;
        }
    }
}
