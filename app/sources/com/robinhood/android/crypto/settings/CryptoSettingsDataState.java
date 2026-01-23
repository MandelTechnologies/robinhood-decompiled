package com.robinhood.android.crypto.settings;

import androidx.paging.PagedList;
import com.robinhood.android.crypto.settings.CryptoSettingsViewState;
import com.robinhood.models.api.transfer.CryptoTransferAccountState;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoSettingsDataState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010-\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003HÂ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÂ\u0003J[\u00103\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u001bHÖ\u0001R \u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR)\u0010\"\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u00038F¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0011R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0011¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;", "", "cryptoTransferHistoryItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "isVolumeTiersDiscoveryExperimentEnabled", "", "allowlistingStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "isRefreshingAllowlistStatus", "isUpdatingAllowlistStatus", "cryptoTransferLimits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "<init>", "(Landroidx/paging/PagedList;ZLcom/robinhood/models/crypto/db/transfer/AllowlistStatus;ZZLcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;)V", "()Z", "getAllowlistingStatus", "()Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "receivingCryptoTitle", "Lcom/robinhood/utils/resource/StringResource;", "getReceivingCryptoTitle", "()Lcom/robinhood/utils/resource/StringResource;", "sendingStatusTitle", "getSendingStatusTitle", "receivingCryptoRowStatus", "", "getReceivingCryptoRowStatus", "()Ljava/lang/String;", "sendingCryptoRowStatus", "getSendingCryptoRowStatus", "sendingCryptoRowDescription", "getSendingCryptoRowDescription", "historyItems", "getHistoryItems$annotations", "()V", "getHistoryItems", "()Landroidx/paging/PagedList;", "isUserEligibleForHigherLimit", "allowlistToggleState", "Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;", "getAllowlistToggleState", "()Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState$AllowlistToggleState;", "isActivateTransferButtonVisible", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoSettingsDataState {
    public static final int $stable = 8;
    private final AllowlistStatus allowlistingStatus;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> cryptoTransferHistoryItems;
    private final CryptoTransferLimits cryptoTransferLimits;
    private final boolean isRefreshingAllowlistStatus;
    private final boolean isUpdatingAllowlistStatus;
    private final boolean isVolumeTiersDiscoveryExperimentEnabled;

    public CryptoSettingsDataState() {
        this(null, false, null, false, false, null, 63, null);
    }

    private final PagedList<StatefulHistoryEvent<HistoryEvent>> component1() {
        return this.cryptoTransferHistoryItems;
    }

    /* renamed from: component6, reason: from getter */
    private final CryptoTransferLimits getCryptoTransferLimits() {
        return this.cryptoTransferLimits;
    }

    public static /* synthetic */ CryptoSettingsDataState copy$default(CryptoSettingsDataState cryptoSettingsDataState, PagedList pagedList, boolean z, AllowlistStatus allowlistStatus, boolean z2, boolean z3, CryptoTransferLimits cryptoTransferLimits, int i, Object obj) {
        if ((i & 1) != 0) {
            pagedList = cryptoSettingsDataState.cryptoTransferHistoryItems;
        }
        if ((i & 2) != 0) {
            z = cryptoSettingsDataState.isVolumeTiersDiscoveryExperimentEnabled;
        }
        if ((i & 4) != 0) {
            allowlistStatus = cryptoSettingsDataState.allowlistingStatus;
        }
        if ((i & 8) != 0) {
            z2 = cryptoSettingsDataState.isRefreshingAllowlistStatus;
        }
        if ((i & 16) != 0) {
            z3 = cryptoSettingsDataState.isUpdatingAllowlistStatus;
        }
        if ((i & 32) != 0) {
            cryptoTransferLimits = cryptoSettingsDataState.cryptoTransferLimits;
        }
        boolean z4 = z3;
        CryptoTransferLimits cryptoTransferLimits2 = cryptoTransferLimits;
        return cryptoSettingsDataState.copy(pagedList, z, allowlistStatus, z2, z4, cryptoTransferLimits2);
    }

    public static /* synthetic */ void getHistoryItems$annotations() {
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVolumeTiersDiscoveryExperimentEnabled() {
        return this.isVolumeTiersDiscoveryExperimentEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final AllowlistStatus getAllowlistingStatus() {
        return this.allowlistingStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRefreshingAllowlistStatus() {
        return this.isRefreshingAllowlistStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsUpdatingAllowlistStatus() {
        return this.isUpdatingAllowlistStatus;
    }

    public final CryptoSettingsDataState copy(PagedList<StatefulHistoryEvent<HistoryEvent>> cryptoTransferHistoryItems, boolean isVolumeTiersDiscoveryExperimentEnabled, AllowlistStatus allowlistingStatus, boolean isRefreshingAllowlistStatus, boolean isUpdatingAllowlistStatus, CryptoTransferLimits cryptoTransferLimits) {
        return new CryptoSettingsDataState(cryptoTransferHistoryItems, isVolumeTiersDiscoveryExperimentEnabled, allowlistingStatus, isRefreshingAllowlistStatus, isUpdatingAllowlistStatus, cryptoTransferLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSettingsDataState)) {
            return false;
        }
        CryptoSettingsDataState cryptoSettingsDataState = (CryptoSettingsDataState) other;
        return Intrinsics.areEqual(this.cryptoTransferHistoryItems, cryptoSettingsDataState.cryptoTransferHistoryItems) && this.isVolumeTiersDiscoveryExperimentEnabled == cryptoSettingsDataState.isVolumeTiersDiscoveryExperimentEnabled && Intrinsics.areEqual(this.allowlistingStatus, cryptoSettingsDataState.allowlistingStatus) && this.isRefreshingAllowlistStatus == cryptoSettingsDataState.isRefreshingAllowlistStatus && this.isUpdatingAllowlistStatus == cryptoSettingsDataState.isUpdatingAllowlistStatus && Intrinsics.areEqual(this.cryptoTransferLimits, cryptoSettingsDataState.cryptoTransferLimits);
    }

    public int hashCode() {
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.cryptoTransferHistoryItems;
        int iHashCode = (((pagedList == null ? 0 : pagedList.hashCode()) * 31) + Boolean.hashCode(this.isVolumeTiersDiscoveryExperimentEnabled)) * 31;
        AllowlistStatus allowlistStatus = this.allowlistingStatus;
        int iHashCode2 = (((((iHashCode + (allowlistStatus == null ? 0 : allowlistStatus.hashCode())) * 31) + Boolean.hashCode(this.isRefreshingAllowlistStatus)) * 31) + Boolean.hashCode(this.isUpdatingAllowlistStatus)) * 31;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return iHashCode2 + (cryptoTransferLimits != null ? cryptoTransferLimits.hashCode() : 0);
    }

    public String toString() {
        return "CryptoSettingsDataState(cryptoTransferHistoryItems=" + this.cryptoTransferHistoryItems + ", isVolumeTiersDiscoveryExperimentEnabled=" + this.isVolumeTiersDiscoveryExperimentEnabled + ", allowlistingStatus=" + this.allowlistingStatus + ", isRefreshingAllowlistStatus=" + this.isRefreshingAllowlistStatus + ", isUpdatingAllowlistStatus=" + this.isUpdatingAllowlistStatus + ", cryptoTransferLimits=" + this.cryptoTransferLimits + ")";
    }

    public CryptoSettingsDataState(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, boolean z, AllowlistStatus allowlistStatus, boolean z2, boolean z3, CryptoTransferLimits cryptoTransferLimits) {
        this.cryptoTransferHistoryItems = pagedList;
        this.isVolumeTiersDiscoveryExperimentEnabled = z;
        this.allowlistingStatus = allowlistStatus;
        this.isRefreshingAllowlistStatus = z2;
        this.isUpdatingAllowlistStatus = z3;
        this.cryptoTransferLimits = cryptoTransferLimits;
    }

    public /* synthetic */ CryptoSettingsDataState(PagedList pagedList, boolean z, AllowlistStatus allowlistStatus, boolean z2, boolean z3, CryptoTransferLimits cryptoTransferLimits, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pagedList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : allowlistStatus, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : cryptoTransferLimits);
    }

    public final boolean isVolumeTiersDiscoveryExperimentEnabled() {
        return this.isVolumeTiersDiscoveryExperimentEnabled;
    }

    public final AllowlistStatus getAllowlistingStatus() {
        return this.allowlistingStatus;
    }

    public final boolean isRefreshingAllowlistStatus() {
        return this.isRefreshingAllowlistStatus;
    }

    public final boolean isUpdatingAllowlistStatus() {
        return this.isUpdatingAllowlistStatus;
    }

    public final StringResource getReceivingCryptoTitle() {
        String depositStatusTitle;
        StringResource stringResourceInvoke;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return (cryptoTransferLimits == null || (depositStatusTitle = cryptoTransferLimits.getDepositStatusTitle()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(depositStatusTitle)) == null) ? StringResource.INSTANCE.invoke(C13000R.string.crypto_limits_receiving_row_label, new Object[0]) : stringResourceInvoke;
    }

    public final StringResource getSendingStatusTitle() {
        String withdrawalStatusTitle;
        StringResource stringResourceInvoke;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return (cryptoTransferLimits == null || (withdrawalStatusTitle = cryptoTransferLimits.getWithdrawalStatusTitle()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(withdrawalStatusTitle)) == null) ? StringResource.INSTANCE.invoke(C13000R.string.crypto_limits_sending_row_label, new Object[0]) : stringResourceInvoke;
    }

    public final String getReceivingCryptoRowStatus() {
        String depositStatus;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return (cryptoTransferLimits == null || (depositStatus = cryptoTransferLimits.getDepositStatus()) == null) ? "" : depositStatus;
    }

    public final String getSendingCryptoRowStatus() {
        String withdrawalStatus;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return (cryptoTransferLimits == null || (withdrawalStatus = cryptoTransferLimits.getWithdrawalStatus()) == null) ? "" : withdrawalStatus;
    }

    public final String getSendingCryptoRowDescription() {
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        if (cryptoTransferLimits != null) {
            return cryptoTransferLimits.getStatusMarkdown();
        }
        return null;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        if ((cryptoTransferLimits != null ? cryptoTransferLimits.getAccountStatus() : null) != CryptoTransferAccountState.ACTIVE) {
            CryptoTransferLimits cryptoTransferLimits2 = this.cryptoTransferLimits;
            if ((cryptoTransferLimits2 != null ? cryptoTransferLimits2.getAccountStatus() : null) != CryptoTransferAccountState.INACTIVE) {
                return null;
            }
        }
        return this.cryptoTransferHistoryItems;
    }

    public final boolean isUserEligibleForHigherLimit() {
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return cryptoTransferLimits != null && cryptoTransferLimits.getEligibleForHigherLimit();
    }

    public final CryptoSettingsViewState.AllowlistToggleState getAllowlistToggleState() {
        CryptoTransferLimits cryptoTransferLimits;
        if (this.allowlistingStatus == null || (cryptoTransferLimits = this.cryptoTransferLimits) == null || cryptoTransferLimits.getEnrollmentRequired()) {
            return null;
        }
        return new CryptoSettingsViewState.AllowlistToggleState(this.allowlistingStatus, (this.isRefreshingAllowlistStatus || this.isUpdatingAllowlistStatus) ? false : true, this.isUpdatingAllowlistStatus);
    }

    public final boolean isActivateTransferButtonVisible() {
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        return cryptoTransferLimits != null && cryptoTransferLimits.getEnrollmentRequired();
    }
}
