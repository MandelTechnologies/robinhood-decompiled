package com.robinhood.android.accountcenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.robinhood.android.accountcenter.AccountCenterViewState2;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterBanner;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterItemGroup;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterSection;
import com.robinhood.android.models.accountcenter.api.ApiTypedAccountCenterItem;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountCenterViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001c2\u0006\u0010>\u001a\u00020?J\"\u0010C\u001a\u00020D*\b\u0012\u0004\u0012\u00020=0E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0010H\u0002J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010P\u001a\u00020\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\u0012HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0012HÆ\u0003J\t\u0010U\u001a\u00020\u0012HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÂ\u0003JÀ\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u0010HÖ\u0001J\t\u0010]\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00100R\u0011\u0010\u0018\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00108\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0011\u0010@\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u00100R\u0011\u0010B\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bB\u00100¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterViewState;", "", "accountCenterPage", "Lcom/robinhood/android/accountcenter/AccountCenterPage;", "uiError", "Lcom/robinhood/udf/UiEvent;", "", "profile", "Lcom/robinhood/models/db/Profile;", "profilePictureLocal", "Landroid/graphics/Bitmap;", "updateProfilePictureStatus", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "removeProfilePictureStatus", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "inviteCount", "", "showSearchInToolbar", "", "showRewardInProfile", "featureDiscoveryData", "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "showFxTooltipButton", "isRhubarbMember", "showMcwCurrencySwitcher", "individualAccountNumber", "", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/android/accountcenter/AccountCenterPage;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/Profile;Landroid/graphics/Bitmap;Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;Ljava/lang/Integer;ZZLcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;ZZZLjava/lang/String;Ljava/util/List;)V", "getAccountCenterPage", "()Lcom/robinhood/android/accountcenter/AccountCenterPage;", "getUiError", "()Lcom/robinhood/udf/UiEvent;", "getProfile", "()Lcom/robinhood/models/db/Profile;", "getProfilePictureLocal", "()Landroid/graphics/Bitmap;", "getUpdateProfilePictureStatus", "()Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "getRemoveProfilePictureStatus", "()Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "getInviteCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowSearchInToolbar", "()Z", "getShowRewardInProfile", "getFeatureDiscoveryData", "()Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "getShowFxTooltipButton", "getShowMcwCurrencySwitcher", "getIndividualAccountNumber", "()Ljava/lang/String;", "isLegacyDesign", "upsellBanner", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterBanner;", "isTopNavReferralIconVisible", "accountCenterItems", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem;", "context", "Landroid/content/Context;", "showReferral", "getShowReferral", "isProfileTransferContentVisible", "processSection", "", "", "section", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterSection;", "sectionIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/robinhood/android/accountcenter/AccountCenterPage;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/Profile;Landroid/graphics/Bitmap;Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;Ljava/lang/Integer;ZZLcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;ZZZLjava/lang/String;Ljava/util/List;)Lcom/robinhood/android/accountcenter/AccountCenterViewState;", "equals", "other", "hashCode", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AccountCenterViewState {
    public static final int $stable = 8;
    private final AccountCenterViewState2 accountCenterPage;
    private final FeatureDiscoveryResponse featureDiscoveryData;
    private final String individualAccountNumber;
    private final Integer inviteCount;
    private final boolean isLegacyDesign;
    private final boolean isRhubarbMember;
    private final boolean isTopNavReferralIconVisible;
    private final Profile profile;
    private final Bitmap profilePictureLocal;
    private final AccountCenterViewState3 removeProfilePictureStatus;
    private final boolean showFxTooltipButton;
    private final boolean showMcwCurrencySwitcher;
    private final boolean showReferral;
    private final boolean showRewardInProfile;
    private final boolean showSearchInToolbar;
    private final List<TransferAccount> transferAccounts;
    private final UiEvent<Throwable> uiError;
    private final AccountCenterViewState4 updateProfilePictureStatus;
    private final ApiAccountCenterBanner upsellBanner;

    public AccountCenterViewState() {
        this(null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 32767, null);
    }

    private final List<TransferAccount> component15() {
        return this.transferAccounts;
    }

    /* renamed from: component1, reason: from getter */
    public final AccountCenterViewState2 getAccountCenterPage() {
        return this.accountCenterPage;
    }

    /* renamed from: component10, reason: from getter */
    public final FeatureDiscoveryResponse getFeatureDiscoveryData() {
        return this.featureDiscoveryData;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowFxTooltipButton() {
        return this.showFxTooltipButton;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsRhubarbMember() {
        return this.isRhubarbMember;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowMcwCurrencySwitcher() {
        return this.showMcwCurrencySwitcher;
    }

    /* renamed from: component14, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final UiEvent<Throwable> component2() {
        return this.uiError;
    }

    /* renamed from: component3, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    /* renamed from: component4, reason: from getter */
    public final Bitmap getProfilePictureLocal() {
        return this.profilePictureLocal;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountCenterViewState4 getUpdateProfilePictureStatus() {
        return this.updateProfilePictureStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final AccountCenterViewState3 getRemoveProfilePictureStatus() {
        return this.removeProfilePictureStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getInviteCount() {
        return this.inviteCount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSearchInToolbar() {
        return this.showSearchInToolbar;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowRewardInProfile() {
        return this.showRewardInProfile;
    }

    public final AccountCenterViewState copy(AccountCenterViewState2 accountCenterPage, UiEvent<Throwable> uiError, Profile profile, Bitmap profilePictureLocal, AccountCenterViewState4 updateProfilePictureStatus, AccountCenterViewState3 removeProfilePictureStatus, Integer inviteCount, boolean showSearchInToolbar, boolean showRewardInProfile, FeatureDiscoveryResponse featureDiscoveryData, boolean showFxTooltipButton, boolean isRhubarbMember, boolean showMcwCurrencySwitcher, String individualAccountNumber, List<TransferAccount> transferAccounts) {
        Intrinsics.checkNotNullParameter(accountCenterPage, "accountCenterPage");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        return new AccountCenterViewState(accountCenterPage, uiError, profile, profilePictureLocal, updateProfilePictureStatus, removeProfilePictureStatus, inviteCount, showSearchInToolbar, showRewardInProfile, featureDiscoveryData, showFxTooltipButton, isRhubarbMember, showMcwCurrencySwitcher, individualAccountNumber, transferAccounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCenterViewState)) {
            return false;
        }
        AccountCenterViewState accountCenterViewState = (AccountCenterViewState) other;
        return Intrinsics.areEqual(this.accountCenterPage, accountCenterViewState.accountCenterPage) && Intrinsics.areEqual(this.uiError, accountCenterViewState.uiError) && Intrinsics.areEqual(this.profile, accountCenterViewState.profile) && Intrinsics.areEqual(this.profilePictureLocal, accountCenterViewState.profilePictureLocal) && Intrinsics.areEqual(this.updateProfilePictureStatus, accountCenterViewState.updateProfilePictureStatus) && Intrinsics.areEqual(this.removeProfilePictureStatus, accountCenterViewState.removeProfilePictureStatus) && Intrinsics.areEqual(this.inviteCount, accountCenterViewState.inviteCount) && this.showSearchInToolbar == accountCenterViewState.showSearchInToolbar && this.showRewardInProfile == accountCenterViewState.showRewardInProfile && Intrinsics.areEqual(this.featureDiscoveryData, accountCenterViewState.featureDiscoveryData) && this.showFxTooltipButton == accountCenterViewState.showFxTooltipButton && this.isRhubarbMember == accountCenterViewState.isRhubarbMember && this.showMcwCurrencySwitcher == accountCenterViewState.showMcwCurrencySwitcher && Intrinsics.areEqual(this.individualAccountNumber, accountCenterViewState.individualAccountNumber) && Intrinsics.areEqual(this.transferAccounts, accountCenterViewState.transferAccounts);
    }

    public int hashCode() {
        int iHashCode = this.accountCenterPage.hashCode() * 31;
        UiEvent<Throwable> uiEvent = this.uiError;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        Profile profile = this.profile;
        int iHashCode3 = (iHashCode2 + (profile == null ? 0 : profile.hashCode())) * 31;
        Bitmap bitmap = this.profilePictureLocal;
        int iHashCode4 = (iHashCode3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        AccountCenterViewState4 accountCenterViewState4 = this.updateProfilePictureStatus;
        int iHashCode5 = (iHashCode4 + (accountCenterViewState4 == null ? 0 : accountCenterViewState4.hashCode())) * 31;
        AccountCenterViewState3 accountCenterViewState3 = this.removeProfilePictureStatus;
        int iHashCode6 = (iHashCode5 + (accountCenterViewState3 == null ? 0 : accountCenterViewState3.hashCode())) * 31;
        Integer num = this.inviteCount;
        int iHashCode7 = (((((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.showSearchInToolbar)) * 31) + Boolean.hashCode(this.showRewardInProfile)) * 31;
        FeatureDiscoveryResponse featureDiscoveryResponse = this.featureDiscoveryData;
        int iHashCode8 = (((((((iHashCode7 + (featureDiscoveryResponse == null ? 0 : featureDiscoveryResponse.hashCode())) * 31) + Boolean.hashCode(this.showFxTooltipButton)) * 31) + Boolean.hashCode(this.isRhubarbMember)) * 31) + Boolean.hashCode(this.showMcwCurrencySwitcher)) * 31;
        String str = this.individualAccountNumber;
        return ((iHashCode8 + (str != null ? str.hashCode() : 0)) * 31) + this.transferAccounts.hashCode();
    }

    public String toString() {
        return "AccountCenterViewState(accountCenterPage=" + this.accountCenterPage + ", uiError=" + this.uiError + ", profile=" + this.profile + ", profilePictureLocal=" + this.profilePictureLocal + ", updateProfilePictureStatus=" + this.updateProfilePictureStatus + ", removeProfilePictureStatus=" + this.removeProfilePictureStatus + ", inviteCount=" + this.inviteCount + ", showSearchInToolbar=" + this.showSearchInToolbar + ", showRewardInProfile=" + this.showRewardInProfile + ", featureDiscoveryData=" + this.featureDiscoveryData + ", showFxTooltipButton=" + this.showFxTooltipButton + ", isRhubarbMember=" + this.isRhubarbMember + ", showMcwCurrencySwitcher=" + this.showMcwCurrencySwitcher + ", individualAccountNumber=" + this.individualAccountNumber + ", transferAccounts=" + this.transferAccounts + ")";
    }

    public AccountCenterViewState(AccountCenterViewState2 accountCenterPage, UiEvent<Throwable> uiEvent, Profile profile, Bitmap bitmap, AccountCenterViewState4 accountCenterViewState4, AccountCenterViewState3 accountCenterViewState3, Integer num, boolean z, boolean z2, FeatureDiscoveryResponse featureDiscoveryResponse, boolean z3, boolean z4, boolean z5, String str, List<TransferAccount> transferAccounts) {
        ApiAccountCenterPage apiAccountCenterPage;
        ApiAccountCenterPage apiAccountCenterPage2;
        Intrinsics.checkNotNullParameter(accountCenterPage, "accountCenterPage");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        this.accountCenterPage = accountCenterPage;
        this.uiError = uiEvent;
        this.profile = profile;
        this.profilePictureLocal = bitmap;
        this.updateProfilePictureStatus = accountCenterViewState4;
        this.removeProfilePictureStatus = accountCenterViewState3;
        this.inviteCount = num;
        this.showSearchInToolbar = z;
        this.showRewardInProfile = z2;
        this.featureDiscoveryData = featureDiscoveryResponse;
        this.showFxTooltipButton = z3;
        this.isRhubarbMember = z4;
        this.showMcwCurrencySwitcher = z5;
        this.individualAccountNumber = str;
        this.transferAccounts = transferAccounts;
        ApiAccountCenterBanner upsell_banner = null;
        AccountCenterViewState2.Loaded loaded = accountCenterPage instanceof AccountCenterViewState2.Loaded ? (AccountCenterViewState2.Loaded) accountCenterPage : null;
        this.isLegacyDesign = (loaded == null || (apiAccountCenterPage2 = loaded.getApiAccountCenterPage()) == null) ? false : apiAccountCenterPage2.getShould_follow_legacy_profile_design();
        AccountCenterViewState2.Loaded loaded2 = accountCenterPage instanceof AccountCenterViewState2.Loaded ? (AccountCenterViewState2.Loaded) accountCenterPage : null;
        if (loaded2 != null && (apiAccountCenterPage = loaded2.getApiAccountCenterPage()) != null) {
            upsell_banner = apiAccountCenterPage.getUpsell_banner();
        }
        this.upsellBanner = upsell_banner;
        this.showReferral = num != null;
    }

    public /* synthetic */ AccountCenterViewState(AccountCenterViewState2 accountCenterViewState2, UiEvent uiEvent, Profile profile, Bitmap bitmap, AccountCenterViewState4 accountCenterViewState4, AccountCenterViewState3 accountCenterViewState3, Integer num, boolean z, boolean z2, FeatureDiscoveryResponse featureDiscoveryResponse, boolean z3, boolean z4, boolean z5, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountCenterViewState2.Loading.INSTANCE : accountCenterViewState2, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : profile, (i & 8) != 0 ? null : bitmap, (i & 16) != 0 ? null : accountCenterViewState4, (i & 32) != 0 ? null : accountCenterViewState3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : featureDiscoveryResponse, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) == 0 ? z5 : false, (i & 8192) == 0 ? str : null, (i & 16384) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final AccountCenterViewState2 getAccountCenterPage() {
        return this.accountCenterPage;
    }

    public final UiEvent<Throwable> getUiError() {
        return this.uiError;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final Bitmap getProfilePictureLocal() {
        return this.profilePictureLocal;
    }

    public final AccountCenterViewState4 getUpdateProfilePictureStatus() {
        return this.updateProfilePictureStatus;
    }

    public final AccountCenterViewState3 getRemoveProfilePictureStatus() {
        return this.removeProfilePictureStatus;
    }

    public final Integer getInviteCount() {
        return this.inviteCount;
    }

    public final boolean getShowSearchInToolbar() {
        return this.showSearchInToolbar;
    }

    public final boolean getShowRewardInProfile() {
        return this.showRewardInProfile;
    }

    public final FeatureDiscoveryResponse getFeatureDiscoveryData() {
        return this.featureDiscoveryData;
    }

    public final boolean getShowFxTooltipButton() {
        return this.showFxTooltipButton;
    }

    public final boolean isRhubarbMember() {
        return this.isRhubarbMember;
    }

    public final boolean getShowMcwCurrencySwitcher() {
        return this.showMcwCurrencySwitcher;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: isLegacyDesign, reason: from getter */
    public final boolean getIsLegacyDesign() {
        return this.isLegacyDesign;
    }

    /* renamed from: isTopNavReferralIconVisible, reason: from getter */
    public final boolean getIsTopNavReferralIconVisible() {
        return this.isTopNavReferralIconVisible;
    }

    public final List<UiTypedAccountCenterItem> accountCenterItems(Context context) {
        UiTypedAccountCenterItem.ErrorItem errorItem;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        AccountCenterViewState2 accountCenterViewState2 = this.accountCenterPage;
        if (accountCenterViewState2 instanceof AccountCenterViewState2.Loaded) {
            Profile profile = this.profile;
            if (profile != null) {
                arrayList.add(new UiTypedAccountCenterItem.ProfileHeaderItem("account_center_profile_header", profile.getMedia(), this.profilePictureLocal, this.upsellBanner == null, this.profile.getUsername()));
            }
            UiTypedAccountCenterItem.AccountTotalItem accountTotalItem = new UiTypedAccountCenterItem.AccountTotalItem("account_center_account_total", ((AccountCenterViewState2.Loaded) this.accountCenterPage).getApiAccountCenterPage().getRobinhood_total(), this.showFxTooltipButton, false, null, 24, null);
            UIComponent<GenericAction> add_account_upsell = ((AccountCenterViewState2.Loaded) this.accountCenterPage).getApiAccountCenterPage().getAdd_account_upsell();
            UiTypedAccountCenterItem.AddAccount addAccount = add_account_upsell != null ? new UiTypedAccountCenterItem.AddAccount("account_center_add_account", add_account_upsell) : null;
            arrayList.add(accountTotalItem);
            if (addAccount != null) {
                arrayList.add(addAccount);
            }
            ApiAccountCenterBanner apiAccountCenterBanner = this.upsellBanner;
            if (apiAccountCenterBanner != null) {
                arrayList.add(new UiTypedAccountCenterItem.ReferralBanner("account_center_referral_card", apiAccountCenterBanner));
            }
            List<ApiAccountCenterSection> sections_data = ((AccountCenterViewState2.Loaded) this.accountCenterPage).getApiAccountCenterPage().getSections_data();
            if (sections_data == null) {
                sections_data = CollectionsKt.emptyList();
            }
            Iterator itWithIndex = CollectionsKt.withIndex(sections_data.iterator());
            while (itWithIndex.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) itWithIndex.next();
                processSection(arrayList, (ApiAccountCenterSection) indexedValue.component2(), indexedValue.getIndex());
            }
            arrayList.add(new UiTypedAccountCenterItem.SpacerItem("account_center_info_bottom_spacer"));
            arrayList.add(new UiTypedAccountCenterItem.CreditAppInviteBanner("account_center_credit_application_invite_banner"));
            if (this.isLegacyDesign) {
                arrayList.add(new UiTypedAccountCenterItem.BubbleItem("account_center_bubble", this.featureDiscoveryData));
                return arrayList;
            }
            FeatureDiscoveryResponse featureDiscoveryResponse = this.featureDiscoveryData;
            if (featureDiscoveryResponse != null) {
                arrayList.add(new UiTypedAccountCenterItem.FeatureDiscovery("account_center_feature_discovery", featureDiscoveryResponse));
                arrayList.add(new UiTypedAccountCenterItem.SpacerItem("account_center_fd_bottom_spacer"));
            }
            arrayList.add(new UiTypedAccountCenterItem.MarkdownItem("account_center_disclosure", new MarkdownContent(((AccountCenterViewState2.Loaded) this.accountCenterPage).getApiAccountCenterPage().getDisclosure_markdown())));
            return arrayList;
        }
        if (accountCenterViewState2 instanceof AccountCenterViewState2.Error) {
            Profile profile2 = this.profile;
            if (profile2 != null) {
                arrayList.add(new UiTypedAccountCenterItem.ProfileHeaderItem("account_center_profile_header", profile2.getMedia(), this.profilePictureLocal, this.upsellBanner == null, this.profile.getUsername()));
            }
            arrayList.add(new UiTypedAccountCenterItem.DividerItem("account_center_info_top_divider"));
            if (Throwables.isConnectivityException(((AccountCenterViewState2.Error) this.accountCenterPage).getThrowable())) {
                String string2 = context.getString(C8293R.string.account_center_connection_error_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = context.getString(C8293R.string.account_center_connection_error_message);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = context.getString(C8293R.string.account_center_connection_error_action);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                errorItem = new UiTypedAccountCenterItem.ErrorItem("account_center_error_item", string2, string3, string4);
            } else {
                String string5 = context.getString(C8293R.string.account_center_server_error_title);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = context.getString(C8293R.string.account_center_server_error_message);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                String string7 = context.getString(C8293R.string.account_center_server_error_action);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                errorItem = new UiTypedAccountCenterItem.ErrorItem("account_center_error_item", string5, string6, string7);
            }
            arrayList.add(errorItem);
            return arrayList;
        }
        if (!(accountCenterViewState2 instanceof AccountCenterViewState2.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        arrayList.add(new UiTypedAccountCenterItem.LoadingItem("account_center_loading_item"));
        return arrayList;
    }

    public final boolean getShowReferral() {
        return this.showReferral;
    }

    public final boolean isProfileTransferContentVisible() {
        if (this.isLegacyDesign && this.showRewardInProfile) {
            return false;
        }
        List<TransferAccount> list = this.transferAccounts;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((TransferAccount) it.next()).isExternal()) {
                return true;
            }
        }
        return false;
    }

    private final void processSection(List<UiTypedAccountCenterItem> list, ApiAccountCenterSection apiAccountCenterSection, int i) {
        Parcelable uiModel;
        if (apiAccountCenterSection instanceof ApiAccountCenterSection.Expanded) {
            ApiAccountCenterSection.Expanded.Data data = ((ApiAccountCenterSection.Expanded) apiAccountCenterSection).getData();
            String header = data.getHeader();
            Locale locale = Locale.ROOT;
            String lowerCase = header.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String str = lowerCase + "_section_header";
            String header2 = data.getHeader();
            com.robinhood.models.serverdriven.p347db.GenericAction dbModel = data.getInfo_action().toDbModel();
            Intrinsics.checkNotNull(dbModel);
            list.add(new UiTypedAccountCenterItem.SectionHeaderItem(str, header2, dbModel, data.getInfo_action_content_description(), data.getDefinitions_markdown(), i > 0));
            String lowerCase2 = data.getHeader().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            list.add(new UiTypedAccountCenterItem.ValueItem(lowerCase2 + "_total_value", data.getTotal_value_description(), true, new MarkdownContent("**" + data.getTotal_value() + "**"), null, null, null));
            Iterator<ApiTypedAccountCenterItem> it = data.getItems().iterator();
            while (it.hasNext()) {
                UiTypedAccountCenterItem uiModel2 = it.next().toUiModel();
                if (uiModel2 != null) {
                    list.add(uiModel2);
                }
            }
            return;
        }
        if (apiAccountCenterSection instanceof ApiAccountCenterSection.Collapsed) {
            ApiAccountCenterSection.Collapsed.Data data2 = ((ApiAccountCenterSection.Collapsed) apiAccountCenterSection).getData();
            String lowerCase3 = data2.getTitle().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String str2 = lowerCase3 + "_collapsed_section";
            String title = data2.getTitle();
            String subtitle = data2.getSubtitle();
            List<ApiAccountCenterItemGroup> items = data2.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            for (ApiAccountCenterItemGroup apiAccountCenterItemGroup : items) {
                String leading_label = apiAccountCenterItemGroup.getLeading_label();
                String str3 = "**" + apiAccountCenterItemGroup.getTrailing_label() + "**";
                List<ApiTypedAccountCenterItem> items2 = apiAccountCenterItemGroup.getItems();
                ArrayList arrayList2 = new ArrayList();
                for (ApiTypedAccountCenterItem apiTypedAccountCenterItem : items2) {
                    if (apiTypedAccountCenterItem instanceof ApiTypedAccountCenterItem.ValueItem) {
                        uiModel = ((ApiTypedAccountCenterItem.ValueItem) apiTypedAccountCenterItem).toUiModel();
                    } else if (apiTypedAccountCenterItem instanceof ApiTypedAccountCenterItem.InfoBannerItem) {
                        uiModel = ((ApiTypedAccountCenterItem.InfoBannerItem) apiTypedAccountCenterItem).toUiModel();
                    } else {
                        if (!Intrinsics.areEqual(apiTypedAccountCenterItem, ApiTypedAccountCenterItem.UnknownItem.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uiModel = null;
                    }
                    if (uiModel != null) {
                        arrayList2.add(uiModel);
                    }
                }
                arrayList.add(new UiTypedAccountCenterItem.CollapsedSectionItem.ItemGroup(leading_label, str3, arrayList2));
            }
            list.add(new UiTypedAccountCenterItem.CollapsedSectionItem(str2, title, subtitle, arrayList, data2.getInfo_action().toDbModel(), data2.getInfo_action_content_description(), data2.getDefinitions_markdown()));
            return;
        }
        if (!Intrinsics.areEqual(apiAccountCenterSection, ApiAccountCenterSection.Unknown.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
