package com.robinhood.android.account.p060ui;

import android.content.res.Resources;
import android.net.Uri;
import com.robinhood.android.account.C8066R;
import com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable3;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.api.ApiSettingsSection;
import com.robinhood.android.settings.models.api.ApiTypedSettingsItem;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AccountNavigationViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Ji\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationViewState;", "", "hasAccount", "", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "settingsPage", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "settingsLoadError", "Lcom/robinhood/udf/UiEvent;", "", "userId", "", "username", "canShowGoldBadge", "isInGoldRegion", "<init>", "(ZLcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/settings/models/api/ApiSettingsPage;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getHasAccount", "()Z", "getSettingsPage", "()Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "getSettingsLoadError", "()Lcom/robinhood/udf/UiEvent;", "getUserId", "()Ljava/lang/String;", "getUsername", "getCanShowGoldBadge", "hasGold", "getHasGold", "show24kGoldBadge", "getShow24kGoldBadge", "getSettingsItems", "", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "resources", "Landroid/content/res/Resources;", "getFallbackSettingsItems", "getServerSettingsPage", "showSettingsPlaceholder", "getShowSettingsPlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AccountNavigationViewState {
    public static final String CONTACT_US_ITEM_ID = "support_disclosures_contact_support_row";
    public static final String LOG_OUT_DEEPLINK_START = "robinhood://relogin";
    public static final String LOG_OUT_ITEM_ID = "menu_sign_out_button_row";
    public static final String LOG_OUT_TEXT_COLOR = "positive";
    public static final String TRANSFERS_ITEM_ID = "menu_transfers_row";
    public static final String USERNAME_PARAM = "&username=";
    public static final String USER_ID_PARAM = "?current_user_id=";
    private final boolean canShowGoldBadge;
    private final boolean hasAccount;
    private final boolean hasGold;
    private final boolean isInGoldRegion;
    private final MarginSubscription marginSubscription;
    private final UiEvent<Throwable> settingsLoadError;
    private final ApiSettingsPage settingsPage;
    private final String userId;
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountNavigationViewState() {
        this(false, null, null, null, null, null, false, false, 255, null);
    }

    /* renamed from: component2, reason: from getter */
    private final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    public static /* synthetic */ AccountNavigationViewState copy$default(AccountNavigationViewState accountNavigationViewState, boolean z, MarginSubscription marginSubscription, ApiSettingsPage apiSettingsPage, UiEvent uiEvent, String str, String str2, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountNavigationViewState.hasAccount;
        }
        if ((i & 2) != 0) {
            marginSubscription = accountNavigationViewState.marginSubscription;
        }
        if ((i & 4) != 0) {
            apiSettingsPage = accountNavigationViewState.settingsPage;
        }
        if ((i & 8) != 0) {
            uiEvent = accountNavigationViewState.settingsLoadError;
        }
        if ((i & 16) != 0) {
            str = accountNavigationViewState.userId;
        }
        if ((i & 32) != 0) {
            str2 = accountNavigationViewState.username;
        }
        if ((i & 64) != 0) {
            z2 = accountNavigationViewState.canShowGoldBadge;
        }
        if ((i & 128) != 0) {
            z3 = accountNavigationViewState.isInGoldRegion;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        String str3 = str;
        String str4 = str2;
        return accountNavigationViewState.copy(z, marginSubscription, apiSettingsPage, uiEvent, str3, str4, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasAccount() {
        return this.hasAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiSettingsPage getSettingsPage() {
        return this.settingsPage;
    }

    public final UiEvent<Throwable> component4() {
        return this.settingsLoadError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanShowGoldBadge() {
        return this.canShowGoldBadge;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsInGoldRegion() {
        return this.isInGoldRegion;
    }

    public final AccountNavigationViewState copy(boolean hasAccount, MarginSubscription marginSubscription, ApiSettingsPage settingsPage, UiEvent<Throwable> settingsLoadError, String userId, String username, boolean canShowGoldBadge, boolean isInGoldRegion) {
        return new AccountNavigationViewState(hasAccount, marginSubscription, settingsPage, settingsLoadError, userId, username, canShowGoldBadge, isInGoldRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNavigationViewState)) {
            return false;
        }
        AccountNavigationViewState accountNavigationViewState = (AccountNavigationViewState) other;
        return this.hasAccount == accountNavigationViewState.hasAccount && Intrinsics.areEqual(this.marginSubscription, accountNavigationViewState.marginSubscription) && Intrinsics.areEqual(this.settingsPage, accountNavigationViewState.settingsPage) && Intrinsics.areEqual(this.settingsLoadError, accountNavigationViewState.settingsLoadError) && Intrinsics.areEqual(this.userId, accountNavigationViewState.userId) && Intrinsics.areEqual(this.username, accountNavigationViewState.username) && this.canShowGoldBadge == accountNavigationViewState.canShowGoldBadge && this.isInGoldRegion == accountNavigationViewState.isInGoldRegion;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasAccount) * 31;
        MarginSubscription marginSubscription = this.marginSubscription;
        int iHashCode2 = (iHashCode + (marginSubscription == null ? 0 : marginSubscription.hashCode())) * 31;
        ApiSettingsPage apiSettingsPage = this.settingsPage;
        int iHashCode3 = (iHashCode2 + (apiSettingsPage == null ? 0 : apiSettingsPage.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.settingsLoadError;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        String str = this.userId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        return ((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.canShowGoldBadge)) * 31) + Boolean.hashCode(this.isInGoldRegion);
    }

    public String toString() {
        return "AccountNavigationViewState(hasAccount=" + this.hasAccount + ", marginSubscription=" + this.marginSubscription + ", settingsPage=" + this.settingsPage + ", settingsLoadError=" + this.settingsLoadError + ", userId=" + this.userId + ", username=" + this.username + ", canShowGoldBadge=" + this.canShowGoldBadge + ", isInGoldRegion=" + this.isInGoldRegion + ")";
    }

    public AccountNavigationViewState(boolean z, MarginSubscription marginSubscription, ApiSettingsPage apiSettingsPage, UiEvent<Throwable> uiEvent, String str, String str2, boolean z2, boolean z3) {
        MarginSubscription3 plan;
        this.hasAccount = z;
        this.marginSubscription = marginSubscription;
        this.settingsPage = apiSettingsPage;
        this.settingsLoadError = uiEvent;
        this.userId = str;
        this.username = str2;
        this.canShowGoldBadge = z2;
        this.isInGoldRegion = z3;
        boolean z4 = false;
        if (marginSubscription != null && (plan = marginSubscription.getPlan()) != null && plan.is24Karat()) {
            z4 = true;
        }
        this.hasGold = z4;
    }

    public /* synthetic */ AccountNavigationViewState(boolean z, MarginSubscription marginSubscription, ApiSettingsPage apiSettingsPage, UiEvent uiEvent, String str, String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : marginSubscription, (i & 4) != 0 ? null : apiSettingsPage, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3);
    }

    public final boolean getHasAccount() {
        return this.hasAccount;
    }

    public final ApiSettingsPage getSettingsPage() {
        return this.settingsPage;
    }

    public final UiEvent<Throwable> getSettingsLoadError() {
        return this.settingsLoadError;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean getCanShowGoldBadge() {
        return this.canShowGoldBadge;
    }

    public final boolean isInGoldRegion() {
        return this.isInGoldRegion;
    }

    public final boolean getHasGold() {
        return this.hasGold;
    }

    public final boolean getShow24kGoldBadge() {
        if (this.canShowGoldBadge && this.isInGoldRegion) {
            return this.hasGold || this.hasAccount;
        }
        return false;
    }

    public final List<TypedSettingsItem> getSettingsItems(Resources resources) {
        List<TypedSettingsItem> fallbackSettingsItems;
        Intrinsics.checkNotNullParameter(resources, "resources");
        return (this.settingsLoadError == null || (fallbackSettingsItems = getFallbackSettingsItems(resources)) == null) ? getServerSettingsPage() : fallbackSettingsItems;
    }

    private final List<TypedSettingsItem> getFallbackSettingsItems(Resources resources) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        if (this.hasAccount) {
            GenericAction.DeeplinkAction deeplinkAction = new GenericAction.DeeplinkAction(INSTANCE.getTRANSFERS_ITEM_DEEPLINK());
            String string2 = resources.getString(C8066R.string.account_nav_item_transfers_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new TypedSettingsItem.TitleSubtitleItem(TRANSFERS_ITEM_ID, string2, resources.getString(C8066R.string.account_nav_item_transfers_subtitle), null, deeplinkAction, null, null, 8, null));
        }
        GenericAction.DeeplinkAction deeplinkAction2 = new GenericAction.DeeplinkAction(INSTANCE.getCONTACT_US_DEEPLINK());
        String string3 = resources.getString(C8066R.string.account_nav_item_contact_us_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new TypedSettingsItem.TitleSubtitleItem(CONTACT_US_ITEM_ID, string3, null, null, deeplinkAction2, null, null, 8, null));
        if (this.userId != null) {
            StringBuilder sb = new StringBuilder(LOG_OUT_DEEPLINK_START);
            sb.append(USER_ID_PARAM);
            sb.append(this.userId);
            String str = this.username;
            if (str != null && !StringsKt.isBlank(str)) {
                sb.append(USERNAME_PARAM);
                sb.append(this.username);
            }
            String string4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            GenericAction.DeeplinkAction deeplinkAction3 = new GenericAction.DeeplinkAction(Uri.parse(string4));
            String string5 = resources.getString(C8066R.string.account_log_out_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            arrayList.add(new TypedSettingsItem.ButtonItem(LOG_OUT_ITEM_ID, string5, LOG_OUT_TEXT_COLOR, deeplinkAction3));
        }
        return arrayList;
    }

    private final List<TypedSettingsItem> getServerSettingsPage() {
        ApiSettingsPage apiSettingsPage = this.settingsPage;
        if (apiSettingsPage == null) {
            return null;
        }
        if (apiSettingsPage.getSections().isEmpty()) {
            throw new IllegalStateException("Account menu page has no settings items");
        }
        List<ApiSettingsSection> sections = apiSettingsPage.getSections();
        if (sections == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            List<ApiTypedSettingsItem> items = ((ApiSettingsSection) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                TypedSettingsItem uiModel = ((ApiTypedSettingsItem) it2.next()).toUiModel();
                if (uiModel != null) {
                    arrayList2.add(uiModel);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public final boolean getShowSettingsPlaceholder() {
        return this.settingsPage == null && this.settingsLoadError == null;
    }

    /* compiled from: AccountNavigationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationViewState$Companion;", "", "<init>", "()V", "TRANSFERS_ITEM_DEEPLINK", "Landroid/net/Uri;", "getTRANSFERS_ITEM_DEEPLINK", "()Landroid/net/Uri;", "TRANSFERS_ITEM_ID", "", "CONTACT_US_ITEM_ID", "CONTACT_US_DEEPLINK", "getCONTACT_US_DEEPLINK", "LOG_OUT_ITEM_ID", "LOG_OUT_TEXT_COLOR", "LOG_OUT_DEEPLINK_START", "USER_ID_PARAM", "USERNAME_PARAM", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Uri getTRANSFERS_ITEM_DEEPLINK() {
            return Uri.parse("robinhood://account_banking");
        }

        public final Uri getCONTACT_US_DEEPLINK() {
            return Uri.parse(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK);
        }
    }
}
