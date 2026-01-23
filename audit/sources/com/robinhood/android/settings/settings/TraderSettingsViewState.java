package com.robinhood.android.settings.settings;

import android.content.res.Resources;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.settings.iibsettings.BaseSettingsFragment;
import com.robinhood.shared.settings.iibsettings.TypedSettingsItems;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010%\u001a\u00020&J\u001f\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b*J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\t\u00100\u001a\u00020\u000eHÂ\u0003J`\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsViewState;", "", "activeAccount", "Lcom/robinhood/models/db/Account;", "settingsPage", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "locationProtectionEnabled", "", "uiError", "Lcom/robinhood/udf/UiEvent;", "", "managedAccountError", "", "versionName", "", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/settings/models/api/ApiSettingsPage;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getSettingsPage", "()Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "getLocationProtectionEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUiError", "()Lcom/robinhood/udf/UiEvent;", "getManagedAccountError", "theme", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;", "getTheme", "()Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;", "showSettingsPlaceholder", "getShowSettingsPlaceholder", "()Z", "getSettingsItems", "", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "resources", "Landroid/content/res/Resources;", "processCustomItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$CustomItem;", "processCustomItem$feature_settings_externalDebug", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/settings/models/api/ApiSettingsPage;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)Lcom/robinhood/android/settings/settings/TraderSettingsViewState;", "equals", "other", "hashCode", "", "toString", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TraderSettingsViewState {
    public static final int $stable = 8;
    private final Account activeAccount;
    private final Boolean locationProtectionEnabled;
    private final UiEvent<Unit> managedAccountError;
    private final ApiSettingsPage settingsPage;
    private final UiEvent<Throwable> uiError;
    private final String versionName;

    /* renamed from: component6, reason: from getter */
    private final String getVersionName() {
        return this.versionName;
    }

    public static /* synthetic */ TraderSettingsViewState copy$default(TraderSettingsViewState traderSettingsViewState, Account account, ApiSettingsPage apiSettingsPage, Boolean bool, UiEvent uiEvent, UiEvent uiEvent2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            account = traderSettingsViewState.activeAccount;
        }
        if ((i & 2) != 0) {
            apiSettingsPage = traderSettingsViewState.settingsPage;
        }
        if ((i & 4) != 0) {
            bool = traderSettingsViewState.locationProtectionEnabled;
        }
        if ((i & 8) != 0) {
            uiEvent = traderSettingsViewState.uiError;
        }
        if ((i & 16) != 0) {
            uiEvent2 = traderSettingsViewState.managedAccountError;
        }
        if ((i & 32) != 0) {
            str = traderSettingsViewState.versionName;
        }
        UiEvent uiEvent3 = uiEvent2;
        String str2 = str;
        return traderSettingsViewState.copy(account, apiSettingsPage, bool, uiEvent, uiEvent3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiSettingsPage getSettingsPage() {
        return this.settingsPage;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getLocationProtectionEnabled() {
        return this.locationProtectionEnabled;
    }

    public final UiEvent<Throwable> component4() {
        return this.uiError;
    }

    public final UiEvent<Unit> component5() {
        return this.managedAccountError;
    }

    public final TraderSettingsViewState copy(Account activeAccount, ApiSettingsPage settingsPage, Boolean locationProtectionEnabled, UiEvent<Throwable> uiError, UiEvent<Unit> managedAccountError, String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        return new TraderSettingsViewState(activeAccount, settingsPage, locationProtectionEnabled, uiError, managedAccountError, versionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraderSettingsViewState)) {
            return false;
        }
        TraderSettingsViewState traderSettingsViewState = (TraderSettingsViewState) other;
        return Intrinsics.areEqual(this.activeAccount, traderSettingsViewState.activeAccount) && Intrinsics.areEqual(this.settingsPage, traderSettingsViewState.settingsPage) && Intrinsics.areEqual(this.locationProtectionEnabled, traderSettingsViewState.locationProtectionEnabled) && Intrinsics.areEqual(this.uiError, traderSettingsViewState.uiError) && Intrinsics.areEqual(this.managedAccountError, traderSettingsViewState.managedAccountError) && Intrinsics.areEqual(this.versionName, traderSettingsViewState.versionName);
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        ApiSettingsPage apiSettingsPage = this.settingsPage;
        int iHashCode2 = (iHashCode + (apiSettingsPage == null ? 0 : apiSettingsPage.hashCode())) * 31;
        Boolean bool = this.locationProtectionEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.uiError;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.managedAccountError;
        return ((iHashCode4 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + this.versionName.hashCode();
    }

    public String toString() {
        return "TraderSettingsViewState(activeAccount=" + this.activeAccount + ", settingsPage=" + this.settingsPage + ", locationProtectionEnabled=" + this.locationProtectionEnabled + ", uiError=" + this.uiError + ", managedAccountError=" + this.managedAccountError + ", versionName=" + this.versionName + ")";
    }

    public TraderSettingsViewState(Account account, ApiSettingsPage apiSettingsPage, Boolean bool, UiEvent<Throwable> uiEvent, UiEvent<Unit> uiEvent2, String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.activeAccount = account;
        this.settingsPage = apiSettingsPage;
        this.locationProtectionEnabled = bool;
        this.uiError = uiEvent;
        this.managedAccountError = uiEvent2;
        this.versionName = versionName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TraderSettingsViewState(Account account, ApiSettingsPage apiSettingsPage, Boolean bool, UiEvent uiEvent, UiEvent uiEvent2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        UiEvent uiEvent3;
        account = (i & 1) != 0 ? null : account;
        apiSettingsPage = (i & 2) != 0 ? null : apiSettingsPage;
        bool = (i & 4) != 0 ? null : bool;
        uiEvent = (i & 8) != 0 ? null : uiEvent;
        if ((i & 16) != 0) {
            str2 = str;
            uiEvent3 = null;
        } else {
            str2 = str;
            uiEvent3 = uiEvent2;
        }
        this(account, apiSettingsPage, bool, uiEvent, uiEvent3, str2);
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final ApiSettingsPage getSettingsPage() {
        return this.settingsPage;
    }

    public final Boolean getLocationProtectionEnabled() {
        return this.locationProtectionEnabled;
    }

    public final UiEvent<Throwable> getUiError() {
        return this.uiError;
    }

    public final UiEvent<Unit> getManagedAccountError() {
        return this.managedAccountError;
    }

    public final ApiSettingsPage.Theme getTheme() {
        ApiSettingsPage apiSettingsPage = this.settingsPage;
        if (apiSettingsPage != null) {
            return apiSettingsPage.getTheme();
        }
        return null;
    }

    public final boolean getShowSettingsPlaceholder() {
        return this.settingsPage == null;
    }

    public final List<TypedSettingsItem> getSettingsItems(final Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ApiSettingsPage apiSettingsPage = this.settingsPage;
        if (apiSettingsPage != null) {
            return TypedSettingsItems.transform(apiSettingsPage, new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsViewState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TraderSettingsViewState.getSettingsItems$lambda$0(this.f$0, resources, (TypedSettingsItem.CustomItem) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypedSettingsItem getSettingsItems$lambda$0(TraderSettingsViewState traderSettingsViewState, Resources resources, TypedSettingsItem.CustomItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return traderSettingsViewState.processCustomItem$feature_settings_externalDebug(item, resources);
    }

    public final TypedSettingsItem processCustomItem$feature_settings_externalDebug(TypedSettingsItem.CustomItem item, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String id = item.getId();
        if (Intrinsics.areEqual(id, BaseSettingsFragment.APP_VERSION_ITEM_ID)) {
            return TypedSettingsItems.generateAppVersionItem(item, resources, this.versionName);
        }
        if (!Intrinsics.areEqual(id, TraderSettingsFragment.CASH_MANAGEMENT_LOCATION_PROTECTION_ITEM_ID)) {
            return null;
        }
        String id2 = item.getId();
        String string2 = resources.getString(C28356R.string.cash_management_location_protection_item_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Boolean bool = this.locationProtectionEnabled;
        return new TypedSettingsItem.ToggleItem(id2, string2, null, Intrinsics.areEqual(bool, Boolean.TRUE), bool == null, bool != null, null, null, "");
    }
}
