package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHub;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubSettingsMultiAccountsState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BS\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dJ\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010#\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;", "", "accountStatusMap", "", "", "Lcom/robinhood/models/db/SlipEnabledResponse;", "dialogToShow", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState$DialogToShowData;", "slipHub", "Lcom/robinhood/models/db/SlipHub;", "accountNumbersCurrentlyUpdating", "", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Ljava/util/Map;Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState$DialogToShowData;Lcom/robinhood/models/db/SlipHub;Ljava/util/Set;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getAccountStatusMap", "()Ljava/util/Map;", "getDialogToShow", "()Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState$DialogToShowData;", "getSlipHub", "()Lcom/robinhood/models/db/SlipHub;", "getAccountNumbersCurrentlyUpdating", "()Ljava/util/Set;", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getConfirmationText", "accountNumber", "isEnabled", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "DialogToShowData", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipHubSettingsMultiAccountsDataState {
    public static final int $stable = 8;
    private final Set<String> accountNumbersCurrentlyUpdating;
    private final Map<String, SlipEnabledResponse> accountStatusMap;
    private final DialogToShowData dialogToShow;
    private final SlipHub slipHub;
    private final CountryCode.Supported userLocality;

    public SlipHubSettingsMultiAccountsDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SlipHubSettingsMultiAccountsDataState copy$default(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Map map, DialogToShowData dialogToShowData, SlipHub slipHub, Set set, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            map = slipHubSettingsMultiAccountsDataState.accountStatusMap;
        }
        if ((i & 2) != 0) {
            dialogToShowData = slipHubSettingsMultiAccountsDataState.dialogToShow;
        }
        if ((i & 4) != 0) {
            slipHub = slipHubSettingsMultiAccountsDataState.slipHub;
        }
        if ((i & 8) != 0) {
            set = slipHubSettingsMultiAccountsDataState.accountNumbersCurrentlyUpdating;
        }
        if ((i & 16) != 0) {
            supported = slipHubSettingsMultiAccountsDataState.userLocality;
        }
        CountryCode.Supported supported2 = supported;
        SlipHub slipHub2 = slipHub;
        return slipHubSettingsMultiAccountsDataState.copy(map, dialogToShowData, slipHub2, set, supported2);
    }

    public final Map<String, SlipEnabledResponse> component1() {
        return this.accountStatusMap;
    }

    /* renamed from: component2, reason: from getter */
    public final DialogToShowData getDialogToShow() {
        return this.dialogToShow;
    }

    /* renamed from: component3, reason: from getter */
    public final SlipHub getSlipHub() {
        return this.slipHub;
    }

    public final Set<String> component4() {
        return this.accountNumbersCurrentlyUpdating;
    }

    /* renamed from: component5, reason: from getter */
    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public final SlipHubSettingsMultiAccountsDataState copy(Map<String, SlipEnabledResponse> accountStatusMap, DialogToShowData dialogToShow, SlipHub slipHub, Set<String> accountNumbersCurrentlyUpdating, CountryCode.Supported userLocality) {
        Intrinsics.checkNotNullParameter(accountNumbersCurrentlyUpdating, "accountNumbersCurrentlyUpdating");
        return new SlipHubSettingsMultiAccountsDataState(accountStatusMap, dialogToShow, slipHub, accountNumbersCurrentlyUpdating, userLocality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipHubSettingsMultiAccountsDataState)) {
            return false;
        }
        SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState = (SlipHubSettingsMultiAccountsDataState) other;
        return Intrinsics.areEqual(this.accountStatusMap, slipHubSettingsMultiAccountsDataState.accountStatusMap) && Intrinsics.areEqual(this.dialogToShow, slipHubSettingsMultiAccountsDataState.dialogToShow) && Intrinsics.areEqual(this.slipHub, slipHubSettingsMultiAccountsDataState.slipHub) && Intrinsics.areEqual(this.accountNumbersCurrentlyUpdating, slipHubSettingsMultiAccountsDataState.accountNumbersCurrentlyUpdating) && Intrinsics.areEqual(this.userLocality, slipHubSettingsMultiAccountsDataState.userLocality);
    }

    public int hashCode() {
        Map<String, SlipEnabledResponse> map = this.accountStatusMap;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        DialogToShowData dialogToShowData = this.dialogToShow;
        int iHashCode2 = (iHashCode + (dialogToShowData == null ? 0 : dialogToShowData.hashCode())) * 31;
        SlipHub slipHub = this.slipHub;
        int iHashCode3 = (((iHashCode2 + (slipHub == null ? 0 : slipHub.hashCode())) * 31) + this.accountNumbersCurrentlyUpdating.hashCode()) * 31;
        CountryCode.Supported supported = this.userLocality;
        return iHashCode3 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "SlipHubSettingsMultiAccountsDataState(accountStatusMap=" + this.accountStatusMap + ", dialogToShow=" + this.dialogToShow + ", slipHub=" + this.slipHub + ", accountNumbersCurrentlyUpdating=" + this.accountNumbersCurrentlyUpdating + ", userLocality=" + this.userLocality + ")";
    }

    public SlipHubSettingsMultiAccountsDataState(Map<String, SlipEnabledResponse> map, DialogToShowData dialogToShowData, SlipHub slipHub, Set<String> accountNumbersCurrentlyUpdating, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(accountNumbersCurrentlyUpdating, "accountNumbersCurrentlyUpdating");
        this.accountStatusMap = map;
        this.dialogToShow = dialogToShowData;
        this.slipHub = slipHub;
        this.accountNumbersCurrentlyUpdating = accountNumbersCurrentlyUpdating;
        this.userLocality = supported;
    }

    public final Map<String, SlipEnabledResponse> getAccountStatusMap() {
        return this.accountStatusMap;
    }

    public final DialogToShowData getDialogToShow() {
        return this.dialogToShow;
    }

    public final SlipHub getSlipHub() {
        return this.slipHub;
    }

    public /* synthetic */ SlipHubSettingsMultiAccountsDataState(Map map, DialogToShowData dialogToShowData, SlipHub slipHub, Set set, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : dialogToShowData, (i & 4) != 0 ? null : slipHub, (i & 8) != 0 ? SetsKt.emptySet() : set, (i & 16) != 0 ? null : supported);
    }

    public final Set<String> getAccountNumbersCurrentlyUpdating() {
        return this.accountNumbersCurrentlyUpdating;
    }

    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public final String getConfirmationText(String accountNumber, boolean isEnabled) {
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap;
        SlipHub.SlipHubAccountDetails slipHubAccountDetails;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        SlipHub slipHub = this.slipHub;
        if (slipHub == null || (accountDetailsMap = slipHub.getAccountDetailsMap()) == null || (slipHubAccountDetails = accountDetailsMap.get(accountNumber)) == null) {
            return null;
        }
        if (isEnabled) {
            return slipHubAccountDetails.getEnableConfirmationText();
        }
        return slipHubAccountDetails.getDisableConfirmationText();
    }

    /* compiled from: SlipHubSettingsMultiAccountsState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState$DialogToShowData;", "", "accountNumber", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogToShowData {
        public static final int $stable = 0;
        private final String accountNumber;
        private final boolean enabled;

        public static /* synthetic */ DialogToShowData copy$default(DialogToShowData dialogToShowData, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialogToShowData.accountNumber;
            }
            if ((i & 2) != 0) {
                z = dialogToShowData.enabled;
            }
            return dialogToShowData.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final DialogToShowData copy(String accountNumber, boolean enabled) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new DialogToShowData(accountNumber, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogToShowData)) {
                return false;
            }
            DialogToShowData dialogToShowData = (DialogToShowData) other;
            return Intrinsics.areEqual(this.accountNumber, dialogToShowData.accountNumber) && this.enabled == dialogToShowData.enabled;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "DialogToShowData(accountNumber=" + this.accountNumber + ", enabled=" + this.enabled + ")";
        }

        public DialogToShowData(String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.enabled = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }
}
