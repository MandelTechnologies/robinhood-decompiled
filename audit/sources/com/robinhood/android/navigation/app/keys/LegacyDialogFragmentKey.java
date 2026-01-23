package com.robinhood.android.navigation.app.keys;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRow;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.android.navigation.app.keys.data.ThreadNotificationSettingsSource;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowup;
import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;

/* compiled from: LegacyDialogFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "ThreadNotificationSettings", "Logout", "CreateCuratedList", "DeleteCuratedList", ChartActionsRow.CHART_SETTINGS, "DetailError", "DirectIpoPostCobFollowup", "ReplaceOptionOrder", "MerchantChangeCategory", "ClientComponentAlert", "ClientComponentAlertSheet", "EquityOrderChecksAlert", "IacAlertSheet", "RecommendationsLearnMore", "TransferFundsBottomSheet", "ForcePostBottomSheet", "UnconfirmedTaxInfo", "MarginDefinitionBottomSheet", "LimitedMarginRisks", "CashCushionUpsell", "SlipUpdateAgreement", "RedirectDirectDeposit", "RhyAccountInformation", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CashCushionUpsell;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ChartSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlert;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlertSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CreateCuratedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DeleteCuratedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DetailError;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DirectIpoPostCobFollowup;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$EquityOrderChecksAlert;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ForcePostBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$IacAlertSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$LimitedMarginRisks;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$Logout;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MarginDefinitionBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MerchantChangeCategory;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RecommendationsLearnMore;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RedirectDirectDeposit;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ReplaceOptionOrder;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RhyAccountInformation;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$SlipUpdateAgreement;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ThreadNotificationSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$TransferFundsBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$UnconfirmedTaxInfo;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LegacyDialogFragmentKey extends DialogFragmentKey {

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ThreadNotificationSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;", "threadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;)V", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;", "getThreadSettingsItem", "()Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ThreadNotificationSettings implements LegacyDialogFragmentKey {
        private final ThreadNotificationSettingsSource source;
        private final ApiNotificationThreadSettingsItem threadSettingsItem;

        public ThreadNotificationSettings(ThreadNotificationSettingsSource source, ApiNotificationThreadSettingsItem threadSettingsItem) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(threadSettingsItem, "threadSettingsItem");
            this.source = source;
            this.threadSettingsItem = threadSettingsItem;
        }

        public final ThreadNotificationSettingsSource getSource() {
            return this.source;
        }

        public final ApiNotificationThreadSettingsItem getThreadSettingsItem() {
            return this.threadSettingsItem;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$Logout;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "context", "Landroid/content/Context;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "getContext", "()Landroid/content/Context;", "getSupportFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Logout implements LegacyDialogFragmentKey {
        private final Context context;
        private final FragmentManager supportFragmentManager;

        public Logout(Context context, FragmentManager supportFragmentManager) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
            this.context = context;
            this.supportFragmentManager = supportFragmentManager;
        }

        public final Context getContext() {
            return this.context;
        }

        public final FragmentManager getSupportFragmentManager() {
            return this.supportFragmentManager;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CreateCuratedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "redirect", "", "<init>", "(Z)V", "getRedirect", "()Z", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CreateCuratedList implements LegacyDialogFragmentKey {
        private final boolean redirect;

        public CreateCuratedList(boolean z) {
            this.redirect = z;
        }

        public final boolean getRedirect() {
            return this.redirect;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DeleteCuratedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "listId", "Ljava/util/UUID;", "listDisplayName", "", "listOwnerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;)V", "getListId", "()Ljava/util/UUID;", "getListDisplayName", "()Ljava/lang/String;", "getListOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DeleteCuratedList implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<DeleteCuratedList> CREATOR = new Creator();
        private final String listDisplayName;
        private final UUID listId;
        private final ApiCuratedList.OwnerType listOwnerType;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DeleteCuratedList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeleteCuratedList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteCuratedList((UUID) parcel.readSerializable(), parcel.readString(), ApiCuratedList.OwnerType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeleteCuratedList[] newArray(int i) {
                return new DeleteCuratedList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.listId);
            dest.writeString(this.listDisplayName);
            dest.writeString(this.listOwnerType.name());
        }

        public DeleteCuratedList(UUID listId, String str, ApiCuratedList.OwnerType listOwnerType) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(listOwnerType, "listOwnerType");
            this.listId = listId;
            this.listDisplayName = str;
            this.listOwnerType = listOwnerType;
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final String getListDisplayName() {
            return this.listDisplayName;
        }

        public final ApiCuratedList.OwnerType getListOwnerType() {
            return this.listOwnerType;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ChartSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "showExtendedHours", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/Boolean;)V", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getShowExtendedHours", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartSettings implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<ChartSettings> CREATOR = new Creator();
        private final Screen eventScreen;
        private final Boolean showExtendedHours;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ChartSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChartSettings createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Screen screen = (Screen) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ChartSettings(screen, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChartSettings[] newArray(int i) {
                return new ChartSettings[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChartSettings() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.eventScreen);
            Boolean bool = this.showExtendedHours;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public ChartSettings(Screen screen, Boolean bool) {
            this.eventScreen = screen;
            this.showExtendedHours = bool;
        }

        public /* synthetic */ ChartSettings(Screen screen, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : screen, (i & 2) != 0 ? null : bool);
        }

        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final Boolean getShowExtendedHours() {
            return this.showExtendedHours;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DetailError;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "context", "Landroid/content/Context;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "errorType", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;)V", "getContext", "()Landroid/content/Context;", "getSupportFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getErrorType", "()Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DetailError implements LegacyDialogFragmentKey {
        private final Context context;
        private final DetailErrorType errorType;
        private final FragmentManager supportFragmentManager;

        public DetailError(Context context, FragmentManager supportFragmentManager, DetailErrorType errorType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.context = context;
            this.supportFragmentManager = supportFragmentManager;
            this.errorType = errorType;
        }

        public final Context getContext() {
            return this.context;
        }

        public final FragmentManager getSupportFragmentManager() {
            return this.supportFragmentManager;
        }

        public final DetailErrorType getErrorType() {
            return this.errorType;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DirectIpoPostCobFollowup;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "postCobFollowup", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;)V", "getPostCobFollowup", "()Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectIpoPostCobFollowup implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<DirectIpoPostCobFollowup> CREATOR = new Creator();
        private final UiDirectIpoPostCobFollowup postCobFollowup;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectIpoPostCobFollowup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoPostCobFollowup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectIpoPostCobFollowup((UiDirectIpoPostCobFollowup) parcel.readParcelable(DirectIpoPostCobFollowup.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoPostCobFollowup[] newArray(int i) {
                return new DirectIpoPostCobFollowup[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.postCobFollowup, flags);
        }

        public DirectIpoPostCobFollowup(UiDirectIpoPostCobFollowup postCobFollowup) {
            Intrinsics.checkNotNullParameter(postCobFollowup, "postCobFollowup");
            this.postCobFollowup = postCobFollowup;
        }

        public final UiDirectIpoPostCobFollowup getPostCobFollowup() {
            return this.postCobFollowup;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ReplaceOptionOrder;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "context", "Landroid/content/Context;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "Ljava/util/UUID;", "accountNumber", "", "finishActivity", "", "source", "Lrosetta/option/OptionOrderFormSource;", "chainSymbol", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/util/UUID;Ljava/lang/String;ZLrosetta/option/OptionOrderFormSource;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getSupportFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getOptionOrderId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getFinishActivity", "()Z", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getChainSymbol", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReplaceOptionOrder implements LegacyDialogFragmentKey {
        private final String accountNumber;
        private final String chainSymbol;
        private final Context context;
        private final boolean finishActivity;
        private final UUID optionOrderId;
        private final OptionOrderFormSource source;
        private final FragmentManager supportFragmentManager;

        public ReplaceOptionOrder(Context context, FragmentManager supportFragmentManager, UUID optionOrderId, String accountNumber, boolean z, OptionOrderFormSource source, String chainSymbol) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
            Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
            this.context = context;
            this.supportFragmentManager = supportFragmentManager;
            this.optionOrderId = optionOrderId;
            this.accountNumber = accountNumber;
            this.finishActivity = z;
            this.source = source;
            this.chainSymbol = chainSymbol;
        }

        public final Context getContext() {
            return this.context;
        }

        public final FragmentManager getSupportFragmentManager() {
            return this.supportFragmentManager;
        }

        public final UUID getOptionOrderId() {
            return this.optionOrderId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getFinishActivity() {
            return this.finishActivity;
        }

        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        public final String getChainSymbol() {
            return this.chainSymbol;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MerchantChangeCategory;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "merchant", "Ljava/util/UUID;", "currentCategory", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getMerchant", "()Ljava/util/UUID;", "getCurrentCategory", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MerchantChangeCategory implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<MerchantChangeCategory> CREATOR = new Creator();
        private final String currentCategory;
        private final UUID merchant;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MerchantChangeCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantChangeCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantChangeCategory((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantChangeCategory[] newArray(int i) {
                return new MerchantChangeCategory[i];
            }
        }

        public static /* synthetic */ MerchantChangeCategory copy$default(MerchantChangeCategory merchantChangeCategory, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = merchantChangeCategory.merchant;
            }
            if ((i & 2) != 0) {
                str = merchantChangeCategory.currentCategory;
            }
            return merchantChangeCategory.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getMerchant() {
            return this.merchant;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrentCategory() {
            return this.currentCategory;
        }

        public final MerchantChangeCategory copy(UUID merchant, String currentCategory) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            return new MerchantChangeCategory(merchant, currentCategory);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantChangeCategory)) {
                return false;
            }
            MerchantChangeCategory merchantChangeCategory = (MerchantChangeCategory) other;
            return Intrinsics.areEqual(this.merchant, merchantChangeCategory.merchant) && Intrinsics.areEqual(this.currentCategory, merchantChangeCategory.currentCategory);
        }

        public int hashCode() {
            int iHashCode = this.merchant.hashCode() * 31;
            String str = this.currentCategory;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MerchantChangeCategory(merchant=" + this.merchant + ", currentCategory=" + this.currentCategory + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.merchant);
            dest.writeString(this.currentCategory);
        }

        public MerchantChangeCategory(UUID merchant, String str) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            this.merchant = merchant;
            this.currentCategory = str;
        }

        public final UUID getMerchant() {
            return this.merchant;
        }

        public final String getCurrentCategory() {
            return this.currentCategory;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\rB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\tJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlert;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "useDesignSystemOverlay", "", "useParentFragmentScarletContextWrapper", "dialogId", "", "<init>", "(Lcom/robinhood/models/ui/ServerDrivenAlert;ZZI)V", "Lcom/robinhood/models/db/ClientComponentAlert;", "(Lcom/robinhood/models/db/ClientComponentAlert;ZZ)V", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;ZZI)V", "getAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getUseDesignSystemOverlay", "()Z", "getUseParentFragmentScarletContextWrapper", "getDialogId", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClientComponentAlert implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<ClientComponentAlert> CREATOR = new Creator();
        private final ServerDrivenAlert alert;
        private final int dialogId;
        private final boolean useDesignSystemOverlay;
        private final boolean useParentFragmentScarletContextWrapper;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ClientComponentAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientComponentAlert createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClientComponentAlert((ServerDrivenAlert) parcel.readParcelable(ClientComponentAlert.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientComponentAlert[] newArray(int i) {
                return new ClientComponentAlert[i];
            }
        }

        public static /* synthetic */ ClientComponentAlert copy$default(ClientComponentAlert clientComponentAlert, ServerDrivenAlert serverDrivenAlert, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                serverDrivenAlert = clientComponentAlert.alert;
            }
            if ((i2 & 2) != 0) {
                z = clientComponentAlert.useDesignSystemOverlay;
            }
            if ((i2 & 4) != 0) {
                z2 = clientComponentAlert.useParentFragmentScarletContextWrapper;
            }
            if ((i2 & 8) != 0) {
                i = clientComponentAlert.dialogId;
            }
            return clientComponentAlert.copy(serverDrivenAlert, z, z2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerDrivenAlert getAlert() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseDesignSystemOverlay() {
            return this.useDesignSystemOverlay;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseParentFragmentScarletContextWrapper() {
            return this.useParentFragmentScarletContextWrapper;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDialogId() {
            return this.dialogId;
        }

        public final ClientComponentAlert copy(ServerDrivenAlert alert, boolean useDesignSystemOverlay, boolean useParentFragmentScarletContextWrapper, int dialogId) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ClientComponentAlert(alert, useDesignSystemOverlay, useParentFragmentScarletContextWrapper, dialogId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientComponentAlert)) {
                return false;
            }
            ClientComponentAlert clientComponentAlert = (ClientComponentAlert) other;
            return Intrinsics.areEqual(this.alert, clientComponentAlert.alert) && this.useDesignSystemOverlay == clientComponentAlert.useDesignSystemOverlay && this.useParentFragmentScarletContextWrapper == clientComponentAlert.useParentFragmentScarletContextWrapper && this.dialogId == clientComponentAlert.dialogId;
        }

        public int hashCode() {
            return (((((this.alert.hashCode() * 31) + Boolean.hashCode(this.useDesignSystemOverlay)) * 31) + Boolean.hashCode(this.useParentFragmentScarletContextWrapper)) * 31) + Integer.hashCode(this.dialogId);
        }

        public String toString() {
            return "ClientComponentAlert(alert=" + this.alert + ", useDesignSystemOverlay=" + this.useDesignSystemOverlay + ", useParentFragmentScarletContextWrapper=" + this.useParentFragmentScarletContextWrapper + ", dialogId=" + this.dialogId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
            dest.writeInt(this.useDesignSystemOverlay ? 1 : 0);
            dest.writeInt(this.useParentFragmentScarletContextWrapper ? 1 : 0);
            dest.writeInt(this.dialogId);
        }

        public ClientComponentAlert(ServerDrivenAlert alert, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
            this.useDesignSystemOverlay = z;
            this.useParentFragmentScarletContextWrapper = z2;
            this.dialogId = i;
        }

        public /* synthetic */ ClientComponentAlert(ServerDrivenAlert serverDrivenAlert, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(serverDrivenAlert, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i);
        }

        public final ServerDrivenAlert getAlert() {
            return this.alert;
        }

        public final boolean getUseDesignSystemOverlay() {
            return this.useDesignSystemOverlay;
        }

        public final boolean getUseParentFragmentScarletContextWrapper() {
            return this.useParentFragmentScarletContextWrapper;
        }

        public final int getDialogId() {
            return this.dialogId;
        }

        public /* synthetic */ ClientComponentAlert(com.robinhood.models.p320db.ClientComponentAlert clientComponentAlert, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(clientComponentAlert, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ClientComponentAlert(com.robinhood.models.p320db.ClientComponentAlert alert, boolean z, boolean z2) {
            this(ServerDrivenAlert.INSTANCE.from(alert), z, z2, 0, 8, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(alert, "alert");
        }

        public /* synthetic */ ClientComponentAlert(GenericAlert genericAlert, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(genericAlert, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ClientComponentAlert(GenericAlert alert, boolean z, boolean z2, int i) {
            this(ServerDrivenAlert.INSTANCE.from(alert), z, z2, i);
            Intrinsics.checkNotNullParameter(alert, "alert");
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\tJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlertSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "useDesignSystemOverlay", "", "forCrypto", "dialogId", "", "<init>", "(Lcom/robinhood/models/ui/ServerDrivenAlert;ZZI)V", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;ZZI)V", "getAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getUseDesignSystemOverlay", "()Z", "getForCrypto", "getDialogId", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClientComponentAlertSheet implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<ClientComponentAlertSheet> CREATOR = new Creator();
        private final ServerDrivenAlert alert;
        private final int dialogId;
        private final boolean forCrypto;
        private final boolean useDesignSystemOverlay;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ClientComponentAlertSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientComponentAlertSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClientComponentAlertSheet((ServerDrivenAlert) parcel.readParcelable(ClientComponentAlertSheet.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientComponentAlertSheet[] newArray(int i) {
                return new ClientComponentAlertSheet[i];
            }
        }

        public static /* synthetic */ ClientComponentAlertSheet copy$default(ClientComponentAlertSheet clientComponentAlertSheet, ServerDrivenAlert serverDrivenAlert, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                serverDrivenAlert = clientComponentAlertSheet.alert;
            }
            if ((i2 & 2) != 0) {
                z = clientComponentAlertSheet.useDesignSystemOverlay;
            }
            if ((i2 & 4) != 0) {
                z2 = clientComponentAlertSheet.forCrypto;
            }
            if ((i2 & 8) != 0) {
                i = clientComponentAlertSheet.dialogId;
            }
            return clientComponentAlertSheet.copy(serverDrivenAlert, z, z2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerDrivenAlert getAlert() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseDesignSystemOverlay() {
            return this.useDesignSystemOverlay;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForCrypto() {
            return this.forCrypto;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDialogId() {
            return this.dialogId;
        }

        public final ClientComponentAlertSheet copy(ServerDrivenAlert alert, boolean useDesignSystemOverlay, boolean forCrypto, int dialogId) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ClientComponentAlertSheet(alert, useDesignSystemOverlay, forCrypto, dialogId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientComponentAlertSheet)) {
                return false;
            }
            ClientComponentAlertSheet clientComponentAlertSheet = (ClientComponentAlertSheet) other;
            return Intrinsics.areEqual(this.alert, clientComponentAlertSheet.alert) && this.useDesignSystemOverlay == clientComponentAlertSheet.useDesignSystemOverlay && this.forCrypto == clientComponentAlertSheet.forCrypto && this.dialogId == clientComponentAlertSheet.dialogId;
        }

        public int hashCode() {
            return (((((this.alert.hashCode() * 31) + Boolean.hashCode(this.useDesignSystemOverlay)) * 31) + Boolean.hashCode(this.forCrypto)) * 31) + Integer.hashCode(this.dialogId);
        }

        public String toString() {
            return "ClientComponentAlertSheet(alert=" + this.alert + ", useDesignSystemOverlay=" + this.useDesignSystemOverlay + ", forCrypto=" + this.forCrypto + ", dialogId=" + this.dialogId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
            dest.writeInt(this.useDesignSystemOverlay ? 1 : 0);
            dest.writeInt(this.forCrypto ? 1 : 0);
            dest.writeInt(this.dialogId);
        }

        public ClientComponentAlertSheet(ServerDrivenAlert alert, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
            this.useDesignSystemOverlay = z;
            this.forCrypto = z2;
            this.dialogId = i;
        }

        public /* synthetic */ ClientComponentAlertSheet(ServerDrivenAlert serverDrivenAlert, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(serverDrivenAlert, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i);
        }

        public final ServerDrivenAlert getAlert() {
            return this.alert;
        }

        public final boolean getUseDesignSystemOverlay() {
            return this.useDesignSystemOverlay;
        }

        public final boolean getForCrypto() {
            return this.forCrypto;
        }

        public final int getDialogId() {
            return this.dialogId;
        }

        public /* synthetic */ ClientComponentAlertSheet(GenericAlert genericAlert, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(genericAlert, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ClientComponentAlertSheet(GenericAlert alert, boolean z, boolean z2, int i) {
            this(ServerDrivenAlert.INSTANCE.from(alert), z, z2, i);
            Intrinsics.checkNotNullParameter(alert, "alert");
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$EquityOrderChecksAlert;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "<init>", "(Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;)V", "getAlert", "()Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquityOrderChecksAlert implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<EquityOrderChecksAlert> CREATOR = new Creator();
        private final VisibleEquityOrderChecksAlert alert;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<EquityOrderChecksAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityOrderChecksAlert createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EquityOrderChecksAlert((VisibleEquityOrderChecksAlert) parcel.readParcelable(EquityOrderChecksAlert.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityOrderChecksAlert[] newArray(int i) {
                return new EquityOrderChecksAlert[i];
            }
        }

        public static /* synthetic */ EquityOrderChecksAlert copy$default(EquityOrderChecksAlert equityOrderChecksAlert, VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                visibleEquityOrderChecksAlert = equityOrderChecksAlert.alert;
            }
            return equityOrderChecksAlert.copy(visibleEquityOrderChecksAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final VisibleEquityOrderChecksAlert getAlert() {
            return this.alert;
        }

        public final EquityOrderChecksAlert copy(VisibleEquityOrderChecksAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new EquityOrderChecksAlert(alert);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EquityOrderChecksAlert) && Intrinsics.areEqual(this.alert, ((EquityOrderChecksAlert) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "EquityOrderChecksAlert(alert=" + this.alert + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
        }

        public EquityOrderChecksAlert(VisibleEquityOrderChecksAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final VisibleEquityOrderChecksAlert getAlert() {
            return this.alert;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$IacAlertSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "iacBottomSheet", "Lcom/robinhood/models/ui/IacAlertSheet;", "eventScreenId", "", "eventScreenIdentifier", "", "loggingIdentifier", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "<init>", "(Lcom/robinhood/models/ui/IacAlertSheet;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;)V", "getIacBottomSheet", "()Lcom/robinhood/models/ui/IacAlertSheet;", "getEventScreenId", "()I", "getEventScreenIdentifier", "()Ljava/lang/String;", "getLoggingIdentifier", "getProductTag", "()Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IacAlertSheet implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<IacAlertSheet> CREATOR = new Creator();
        private final int eventScreenId;
        private final String eventScreenIdentifier;
        private final com.robinhood.models.p355ui.IacAlertSheet iacBottomSheet;
        private final String loggingIdentifier;
        private final Context.ProductTag productTag;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<IacAlertSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IacAlertSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IacAlertSheet((com.robinhood.models.p355ui.IacAlertSheet) parcel.readParcelable(IacAlertSheet.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), Context.ProductTag.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IacAlertSheet[] newArray(int i) {
                return new IacAlertSheet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.iacBottomSheet, flags);
            dest.writeInt(this.eventScreenId);
            dest.writeString(this.eventScreenIdentifier);
            dest.writeString(this.loggingIdentifier);
            dest.writeString(this.productTag.name());
        }

        public IacAlertSheet(com.robinhood.models.p355ui.IacAlertSheet iacBottomSheet, int i, String str, String str2, Context.ProductTag productTag) {
            Intrinsics.checkNotNullParameter(iacBottomSheet, "iacBottomSheet");
            Intrinsics.checkNotNullParameter(productTag, "productTag");
            this.iacBottomSheet = iacBottomSheet;
            this.eventScreenId = i;
            this.eventScreenIdentifier = str;
            this.loggingIdentifier = str2;
            this.productTag = productTag;
        }

        public final com.robinhood.models.p355ui.IacAlertSheet getIacBottomSheet() {
            return this.iacBottomSheet;
        }

        public final int getEventScreenId() {
            return this.eventScreenId;
        }

        public final String getEventScreenIdentifier() {
            return this.eventScreenIdentifier;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public /* synthetic */ IacAlertSheet(com.robinhood.models.p355ui.IacAlertSheet iacAlertSheet, int i, String str, String str2, Context.ProductTag productTag, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(iacAlertSheet, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? Context.ProductTag.PRODUCT_TAG_UNSPECIFIED : productTag);
        }

        public final Context.ProductTag getProductTag() {
            return this.productTag;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RecommendationsLearnMore;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "source", "", "entryPoint", "Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "weight", "", "subtitleOverride", "pogColorOverride", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSubtitleOverride", "getPogColorOverride", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecommendationsLearnMore implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<RecommendationsLearnMore> CREATOR = new Creator();
        private final RecommendationsLearnMoreEntryPoint entryPoint;
        private final UUID instrumentId;
        private final String pogColorOverride;
        private final String source;
        private final String subtitleOverride;
        private final Float weight;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RecommendationsLearnMore> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendationsLearnMore createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecommendationsLearnMore((UUID) parcel.readSerializable(), parcel.readString(), RecommendationsLearnMoreEntryPoint.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendationsLearnMore[] newArray(int i) {
                return new RecommendationsLearnMore[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.source);
            dest.writeString(this.entryPoint.name());
            Float f = this.weight;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            dest.writeString(this.subtitleOverride);
            dest.writeString(this.pogColorOverride);
        }

        public RecommendationsLearnMore(UUID instrumentId, String str, RecommendationsLearnMoreEntryPoint entryPoint, Float f, String str2, String str3) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.instrumentId = instrumentId;
            this.source = str;
            this.entryPoint = entryPoint;
            this.weight = f;
            this.subtitleOverride = str2;
            this.pogColorOverride = str3;
        }

        public /* synthetic */ RecommendationsLearnMore(UUID uuid, String str, RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint, Float f, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, recommendationsLearnMoreEntryPoint, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSource() {
            return this.source;
        }

        public final RecommendationsLearnMoreEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final Float getWeight() {
            return this.weight;
        }

        public final String getSubtitleOverride() {
            return this.subtitleOverride;
        }

        public final String getPogColorOverride() {
            return this.pogColorOverride;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$TransferFundsBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "promptCashCushionWhenSkipped", "", "entryPoint", "", "<init>", "(ZLjava/lang/String;)V", "getPromptCashCushionWhenSkipped", "()Z", "getEntryPoint", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferFundsBottomSheet implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<TransferFundsBottomSheet> CREATOR = new Creator();
        private final String entryPoint;
        private final boolean promptCashCushionWhenSkipped;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TransferFundsBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferFundsBottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferFundsBottomSheet(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferFundsBottomSheet[] newArray(int i) {
                return new TransferFundsBottomSheet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.promptCashCushionWhenSkipped ? 1 : 0);
            dest.writeString(this.entryPoint);
        }

        public TransferFundsBottomSheet(boolean z, String entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.promptCashCushionWhenSkipped = z;
            this.entryPoint = entryPoint;
        }

        public final boolean getPromptCashCushionWhenSkipped() {
            return this.promptCashCushionWhenSkipped;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ForcePostBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;)V", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ForcePostBottomSheet implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<ForcePostBottomSheet> CREATOR = new Creator();
        private final TransactionReference transactionReference;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ForcePostBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForcePostBottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForcePostBottomSheet((TransactionReference) parcel.readParcelable(ForcePostBottomSheet.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForcePostBottomSheet[] newArray(int i) {
                return new ForcePostBottomSheet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transactionReference, flags);
        }

        public ForcePostBottomSheet(TransactionReference transactionReference) {
            Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
            this.transactionReference = transactionReference;
        }

        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$UnconfirmedTaxInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnconfirmedTaxInfo implements LegacyDialogFragmentKey, Parcelable {
        public static final UnconfirmedTaxInfo INSTANCE = new UnconfirmedTaxInfo();
        public static final Parcelable.Creator<UnconfirmedTaxInfo> CREATOR = new Creator();

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UnconfirmedTaxInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnconfirmedTaxInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnconfirmedTaxInfo.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnconfirmedTaxInfo[] newArray(int i) {
                return new UnconfirmedTaxInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private UnconfirmedTaxInfo() {
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MarginDefinitionBottomSheet;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginDefinitionBottomSheet implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<MarginDefinitionBottomSheet> CREATOR = new Creator();
        private final String contentfulId;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MarginDefinitionBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDefinitionBottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginDefinitionBottomSheet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDefinitionBottomSheet[] newArray(int i) {
                return new MarginDefinitionBottomSheet[i];
            }
        }

        public static /* synthetic */ MarginDefinitionBottomSheet copy$default(MarginDefinitionBottomSheet marginDefinitionBottomSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marginDefinitionBottomSheet.contentfulId;
            }
            return marginDefinitionBottomSheet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final MarginDefinitionBottomSheet copy(String contentfulId) {
            return new MarginDefinitionBottomSheet(contentfulId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarginDefinitionBottomSheet) && Intrinsics.areEqual(this.contentfulId, ((MarginDefinitionBottomSheet) other).contentfulId);
        }

        public int hashCode() {
            String str = this.contentfulId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MarginDefinitionBottomSheet(contentfulId=" + this.contentfulId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contentfulId);
        }

        public MarginDefinitionBottomSheet(String str) {
            this.contentfulId = str;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$LimitedMarginRisks;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LimitedMarginRisks implements LegacyDialogFragmentKey, Parcelable {
        public static final LimitedMarginRisks INSTANCE = new LimitedMarginRisks();
        public static final Parcelable.Creator<LimitedMarginRisks> CREATOR = new Creator();

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<LimitedMarginRisks> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitedMarginRisks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitedMarginRisks.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LimitedMarginRisks[] newArray(int i) {
                return new LimitedMarginRisks[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private LimitedMarginRisks() {
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CashCushionUpsell;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "entryPoint", "", "<init>", "(Ljava/lang/String;)V", "getEntryPoint", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CashCushionUpsell implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<CashCushionUpsell> CREATOR = new Creator();
        private final String entryPoint;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CashCushionUpsell> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashCushionUpsell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashCushionUpsell(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashCushionUpsell[] newArray(int i) {
                return new CashCushionUpsell[i];
            }
        }

        public static /* synthetic */ CashCushionUpsell copy$default(CashCushionUpsell cashCushionUpsell, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cashCushionUpsell.entryPoint;
            }
            return cashCushionUpsell.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final CashCushionUpsell copy(String entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new CashCushionUpsell(entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CashCushionUpsell) && Intrinsics.areEqual(this.entryPoint, ((CashCushionUpsell) other).entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return "CashCushionUpsell(entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPoint);
        }

        public CashCushionUpsell(String entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$SlipUpdateAgreement;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SlipUpdateAgreement implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<SlipUpdateAgreement> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SlipUpdateAgreement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipUpdateAgreement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlipUpdateAgreement(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipUpdateAgreement[] newArray(int i) {
                return new SlipUpdateAgreement[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        public SlipUpdateAgreement(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RedirectDirectDeposit;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "status", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "entryPoint", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getStatus", "()Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "getEntryPoint", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RedirectDirectDeposit implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<RedirectDirectDeposit> CREATOR = new Creator();
        private final String entryPoint;
        private final Screen screen;
        private final RhsNoaRedirectStatus.PromptRedirect status;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RedirectDirectDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedirectDirectDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedirectDirectDeposit((RhsNoaRedirectStatus.PromptRedirect) parcel.readParcelable(RedirectDirectDeposit.class.getClassLoader()), parcel.readString(), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedirectDirectDeposit[] newArray(int i) {
                return new RedirectDirectDeposit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.status, flags);
            dest.writeString(this.entryPoint);
            dest.writeSerializable(this.screen);
        }

        public RedirectDirectDeposit(RhsNoaRedirectStatus.PromptRedirect status, String entryPoint, Screen screen) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.status = status;
            this.entryPoint = entryPoint;
            this.screen = screen;
        }

        public final RhsNoaRedirectStatus.PromptRedirect getStatus() {
            return this.status;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final Screen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: LegacyDialogFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RhyAccountInformation;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey;", "Landroid/os/Parcelable;", "showContinueButtonInstead", "", "<init>", "(Z)V", "getShowContinueButtonInstead", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyAccountInformation implements LegacyDialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<RhyAccountInformation> CREATOR = new Creator();
        private final boolean showContinueButtonInstead;

        /* compiled from: LegacyDialogFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyAccountInformation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyAccountInformation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyAccountInformation(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyAccountInformation[] newArray(int i) {
                return new RhyAccountInformation[i];
            }
        }

        public static /* synthetic */ RhyAccountInformation copy$default(RhyAccountInformation rhyAccountInformation, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhyAccountInformation.showContinueButtonInstead;
            }
            return rhyAccountInformation.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowContinueButtonInstead() {
            return this.showContinueButtonInstead;
        }

        public final RhyAccountInformation copy(boolean showContinueButtonInstead) {
            return new RhyAccountInformation(showContinueButtonInstead);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyAccountInformation) && this.showContinueButtonInstead == ((RhyAccountInformation) other).showContinueButtonInstead;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showContinueButtonInstead);
        }

        public String toString() {
            return "RhyAccountInformation(showContinueButtonInstead=" + this.showContinueButtonInstead + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showContinueButtonInstead ? 1 : 0);
        }

        public RhyAccountInformation(boolean z) {
            this.showContinueButtonInstead = z;
        }

        public final boolean getShowContinueButtonInstead() {
            return this.showContinueButtonInstead;
        }
    }
}
