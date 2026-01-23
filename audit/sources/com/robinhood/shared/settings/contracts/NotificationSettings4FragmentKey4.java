package com.robinhood.shared.settings.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationSettings4FragmentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType;", "Landroid/os/Parcelable;", "<init>", "()V", "Padding", "SectionTitle", "Toggle", "BottomSheetEntryPointRow", "SubPageEntry", "RadioGroup", "SubtitleRichText", "TitleSubtitle", "Lcom/robinhood/shared/settings/contracts/ViewType$Padding;", "Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;", "Lcom/robinhood/shared/settings/contracts/ViewType$SectionTitle;", "Lcom/robinhood/shared/settings/contracts/ViewType$SubPageEntry;", "Lcom/robinhood/shared/settings/contracts/ViewType$SubtitleRichText;", "Lcom/robinhood/shared/settings/contracts/ViewType$TitleSubtitle;", "Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.settings.contracts.ViewType, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class NotificationSettings4FragmentKey4 implements Parcelable {
    public /* synthetic */ NotificationSettings4FragmentKey4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NotificationSettings4FragmentKey4() {
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$Padding;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$Padding */
    public static final /* data */ class Padding extends NotificationSettings4FragmentKey4 {
        public static final Padding INSTANCE = new Padding();
        public static final Parcelable.Creator<Padding> CREATOR = new Creator();

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$Padding$Creator */
        public static final class Creator implements Parcelable.Creator<Padding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Padding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Padding.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Padding[] newArray(int i) {
                return new Padding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Padding);
        }

        public int hashCode() {
            return 603450470;
        }

        public String toString() {
            return "Padding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Padding() {
            super(null);
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$SectionTitle;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "title", "", "subtitle", "showInfoIcon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getShowInfoIcon", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SectionTitle, reason: from toString */
    public static final /* data */ class SectionTitle extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<SectionTitle> CREATOR = new Creator();
        private final boolean showInfoIcon;
        private final String subtitle;
        private final String title;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SectionTitle$Creator */
        public static final class Creator implements Parcelable.Creator<SectionTitle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionTitle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionTitle(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionTitle[] newArray(int i) {
                return new SectionTitle[i];
            }
        }

        public static /* synthetic */ SectionTitle copy$default(SectionTitle sectionTitle, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionTitle.title;
            }
            if ((i & 2) != 0) {
                str2 = sectionTitle.subtitle;
            }
            if ((i & 4) != 0) {
                z = sectionTitle.showInfoIcon;
            }
            return sectionTitle.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        public final SectionTitle copy(String title, String subtitle, boolean showInfoIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SectionTitle(title, subtitle, showInfoIcon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionTitle)) {
                return false;
            }
            SectionTitle sectionTitle = (SectionTitle) other;
            return Intrinsics.areEqual(this.title, sectionTitle.title) && Intrinsics.areEqual(this.subtitle, sectionTitle.subtitle) && this.showInfoIcon == sectionTitle.showInfoIcon;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showInfoIcon);
        }

        public String toString() {
            return "SectionTitle(title=" + this.title + ", subtitle=" + this.subtitle + ", showInfoIcon=" + this.showInfoIcon + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeInt(this.showInfoIcon ? 1 : 0);
        }

        public /* synthetic */ SectionTitle(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionTitle(String title, String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.showInfoIcon = z;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J_\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "sectionId", "", "id", "title", "description", "status", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "isFromConfigurableTypePage", "", "bottomSheetMultipleChoiceRow", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow;", "snoozeBottomSheetMultipleChoiceRow", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;ZLcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow;Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;)V", "getSectionId", "()Ljava/lang/String;", "getId", "getTitle", "getDescription", "getStatus", "()Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "()Z", "getBottomSheetMultipleChoiceRow", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow;", "getSnoozeBottomSheetMultipleChoiceRow", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$Toggle, reason: from toString */
    public static final /* data */ class Toggle extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<Toggle> CREATOR = new Creator();
        private final BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow;
        private final String description;
        private final String id;
        private final boolean isFromConfigurableTypePage;
        private final String sectionId;
        private final BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow;
        private final ApiNotificationSettingsToggleSettingsItem.Status status;
        private final String title;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$Toggle$Creator */
        public static final class Creator implements Parcelable.Creator<Toggle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Toggle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Toggle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ApiNotificationSettingsToggleSettingsItem.Status.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Toggle[] newArray(int i) {
                return new Toggle[i];
            }
        }

        public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, String str2, String str3, String str4, ApiNotificationSettingsToggleSettingsItem.Status status, boolean z, BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toggle.sectionId;
            }
            if ((i & 2) != 0) {
                str2 = toggle.id;
            }
            if ((i & 4) != 0) {
                str3 = toggle.title;
            }
            if ((i & 8) != 0) {
                str4 = toggle.description;
            }
            if ((i & 16) != 0) {
                status = toggle.status;
            }
            if ((i & 32) != 0) {
                z = toggle.isFromConfigurableTypePage;
            }
            if ((i & 64) != 0) {
                bottomSheetMultipleChoiceRow = toggle.bottomSheetMultipleChoiceRow;
            }
            if ((i & 128) != 0) {
                snoozeBottomSheetMultipleChoiceRow = toggle.snoozeBottomSheetMultipleChoiceRow;
            }
            BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow2 = bottomSheetMultipleChoiceRow;
            BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow2 = snoozeBottomSheetMultipleChoiceRow;
            ApiNotificationSettingsToggleSettingsItem.Status status2 = status;
            boolean z2 = z;
            return toggle.copy(str, str2, str3, str4, status2, z2, bottomSheetMultipleChoiceRow2, snoozeBottomSheetMultipleChoiceRow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSectionId() {
            return this.sectionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiNotificationSettingsToggleSettingsItem.Status getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFromConfigurableTypePage() {
            return this.isFromConfigurableTypePage;
        }

        /* renamed from: component7, reason: from getter */
        public final BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow getBottomSheetMultipleChoiceRow() {
            return this.bottomSheetMultipleChoiceRow;
        }

        /* renamed from: component8, reason: from getter */
        public final BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow getSnoozeBottomSheetMultipleChoiceRow() {
            return this.snoozeBottomSheetMultipleChoiceRow;
        }

        public final Toggle copy(String sectionId, String id, String title, String description, ApiNotificationSettingsToggleSettingsItem.Status status, boolean isFromConfigurableTypePage, BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow) {
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Toggle(sectionId, id, title, description, status, isFromConfigurableTypePage, bottomSheetMultipleChoiceRow, snoozeBottomSheetMultipleChoiceRow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) other;
            return Intrinsics.areEqual(this.sectionId, toggle.sectionId) && Intrinsics.areEqual(this.id, toggle.id) && Intrinsics.areEqual(this.title, toggle.title) && Intrinsics.areEqual(this.description, toggle.description) && this.status == toggle.status && this.isFromConfigurableTypePage == toggle.isFromConfigurableTypePage && Intrinsics.areEqual(this.bottomSheetMultipleChoiceRow, toggle.bottomSheetMultipleChoiceRow) && Intrinsics.areEqual(this.snoozeBottomSheetMultipleChoiceRow, toggle.snoozeBottomSheetMultipleChoiceRow);
        }

        public int hashCode() {
            int iHashCode = ((((this.sectionId.hashCode() * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.description;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isFromConfigurableTypePage)) * 31;
            BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = this.bottomSheetMultipleChoiceRow;
            int iHashCode3 = (iHashCode2 + (bottomSheetMultipleChoiceRow == null ? 0 : bottomSheetMultipleChoiceRow.hashCode())) * 31;
            BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = this.snoozeBottomSheetMultipleChoiceRow;
            return iHashCode3 + (snoozeBottomSheetMultipleChoiceRow != null ? snoozeBottomSheetMultipleChoiceRow.hashCode() : 0);
        }

        public String toString() {
            return "Toggle(sectionId=" + this.sectionId + ", id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", status=" + this.status + ", isFromConfigurableTypePage=" + this.isFromConfigurableTypePage + ", bottomSheetMultipleChoiceRow=" + this.bottomSheetMultipleChoiceRow + ", snoozeBottomSheetMultipleChoiceRow=" + this.snoozeBottomSheetMultipleChoiceRow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sectionId);
            dest.writeString(this.id);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.status.name());
            dest.writeInt(this.isFromConfigurableTypePage ? 1 : 0);
            BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = this.bottomSheetMultipleChoiceRow;
            if (bottomSheetMultipleChoiceRow == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bottomSheetMultipleChoiceRow.writeToParcel(dest, flags);
            }
            BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = this.snoozeBottomSheetMultipleChoiceRow;
            if (snoozeBottomSheetMultipleChoiceRow == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                snoozeBottomSheetMultipleChoiceRow.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Toggle(String str, String str2, String str3, String str4, ApiNotificationSettingsToggleSettingsItem.Status status, boolean z, BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, status, z, (i & 64) != 0 ? null : bottomSheetMultipleChoiceRow, (i & 128) != 0 ? null : snoozeBottomSheetMultipleChoiceRow);
        }

        public final String getSectionId() {
            return this.sectionId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ApiNotificationSettingsToggleSettingsItem.Status getStatus() {
            return this.status;
        }

        public final boolean isFromConfigurableTypePage() {
            return this.isFromConfigurableTypePage;
        }

        public final BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow getBottomSheetMultipleChoiceRow() {
            return this.bottomSheetMultipleChoiceRow;
        }

        public final BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow getSnoozeBottomSheetMultipleChoiceRow() {
            return this.snoozeBottomSheetMultipleChoiceRow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toggle(String sectionId, String id, String title, String str, ApiNotificationSettingsToggleSettingsItem.Status status, boolean z, BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow) {
            super(null);
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(status, "status");
            this.sectionId = sectionId;
            this.id = id;
            this.title = title;
            this.description = str;
            this.status = status;
            this.isFromConfigurableTypePage = z;
            this.bottomSheetMultipleChoiceRow = bottomSheetMultipleChoiceRow;
            this.snoozeBottomSheetMultipleChoiceRow = snoozeBottomSheetMultipleChoiceRow;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "Landroid/os/Parcelable;", "parentId", "", "getParentId", "()Ljava/lang/String;", "id", "getId", "BottomSheetMultipleChoiceRow", "SnoozeBottomSheetMultipleChoiceRow", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow;", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow */
    public interface BottomSheetEntryPointRow extends Parcelable {
        String getId();

        String getParentId();

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow;", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "parentId", "", "id", "primaryText", "bottomSheetData", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;)V", "getParentId", "()Ljava/lang/String;", "getId", "getPrimaryText", "getBottomSheetData", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BottomSheetData", "OptionItem", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow, reason: from toString */
        public static final /* data */ class BottomSheetMultipleChoiceRow implements BottomSheetEntryPointRow {
            public static final Parcelable.Creator<BottomSheetMultipleChoiceRow> CREATOR = new Creator();
            private final BottomSheetData bottomSheetData;
            private final String id;
            private final String parentId;
            private final String primaryText;

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$Creator */
            public static final class Creator implements Parcelable.Creator<BottomSheetMultipleChoiceRow> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BottomSheetMultipleChoiceRow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BottomSheetMultipleChoiceRow(parcel.readString(), parcel.readString(), parcel.readString(), BottomSheetData.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BottomSheetMultipleChoiceRow[] newArray(int i) {
                    return new BottomSheetMultipleChoiceRow[i];
                }
            }

            public static /* synthetic */ BottomSheetMultipleChoiceRow copy$default(BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, String str, String str2, String str3, BottomSheetData bottomSheetData, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bottomSheetMultipleChoiceRow.parentId;
                }
                if ((i & 2) != 0) {
                    str2 = bottomSheetMultipleChoiceRow.id;
                }
                if ((i & 4) != 0) {
                    str3 = bottomSheetMultipleChoiceRow.primaryText;
                }
                if ((i & 8) != 0) {
                    bottomSheetData = bottomSheetMultipleChoiceRow.bottomSheetData;
                }
                return bottomSheetMultipleChoiceRow.copy(str, str2, str3, bottomSheetData);
            }

            /* renamed from: component1, reason: from getter */
            public final String getParentId() {
                return this.parentId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPrimaryText() {
                return this.primaryText;
            }

            /* renamed from: component4, reason: from getter */
            public final BottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            public final BottomSheetMultipleChoiceRow copy(String parentId, String id, String primaryText, BottomSheetData bottomSheetData) {
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
                return new BottomSheetMultipleChoiceRow(parentId, id, primaryText, bottomSheetData);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BottomSheetMultipleChoiceRow)) {
                    return false;
                }
                BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = (BottomSheetMultipleChoiceRow) other;
                return Intrinsics.areEqual(this.parentId, bottomSheetMultipleChoiceRow.parentId) && Intrinsics.areEqual(this.id, bottomSheetMultipleChoiceRow.id) && Intrinsics.areEqual(this.primaryText, bottomSheetMultipleChoiceRow.primaryText) && Intrinsics.areEqual(this.bottomSheetData, bottomSheetMultipleChoiceRow.bottomSheetData);
            }

            public int hashCode() {
                return (((((this.parentId.hashCode() * 31) + this.id.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.bottomSheetData.hashCode();
            }

            public String toString() {
                return "BottomSheetMultipleChoiceRow(parentId=" + this.parentId + ", id=" + this.id + ", primaryText=" + this.primaryText + ", bottomSheetData=" + this.bottomSheetData + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.parentId);
                dest.writeString(this.id);
                dest.writeString(this.primaryText);
                this.bottomSheetData.writeToParcel(dest, flags);
            }

            public BottomSheetMultipleChoiceRow(String parentId, String id, String primaryText, BottomSheetData bottomSheetData) {
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
                this.parentId = parentId;
                this.id = id;
                this.primaryText = primaryText;
                this.bottomSheetData = bottomSheetData;
            }

            @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4.BottomSheetEntryPointRow
            public String getParentId() {
                return this.parentId;
            }

            @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4.BottomSheetEntryPointRow
            public String getId() {
                return this.id;
            }

            public final String getPrimaryText() {
                return this.primaryText;
            }

            public final BottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;", "Landroid/os/Parcelable;", "headerText", "", "selectedValues", "", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$OptionItem;", "canSelectMultiple", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Z)V", "getHeaderText", "()Ljava/lang/String;", "getSelectedValues", "()Ljava/util/Set;", "getChoices", "()Ljava/util/List;", "getCanSelectMultiple", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData, reason: from toString */
            public static final /* data */ class BottomSheetData implements Parcelable {
                public static final Parcelable.Creator<BottomSheetData> CREATOR = new Creator();
                private final boolean canSelectMultiple;
                private final List<OptionItem> choices;
                private final String headerText;
                private final Set<String> selectedValues;

                /* compiled from: NotificationSettings4FragmentKey.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData$Creator */
                public static final class Creator implements Parcelable.Creator<BottomSheetData> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final BottomSheetData createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string2 = parcel.readString();
                        int i = parcel.readInt();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            linkedHashSet.add(parcel.readString());
                        }
                        int i3 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i3);
                        for (int i4 = 0; i4 != i3; i4++) {
                            arrayList.add(OptionItem.CREATOR.createFromParcel(parcel));
                        }
                        return new BottomSheetData(string2, linkedHashSet, arrayList, parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final BottomSheetData[] newArray(int i) {
                        return new BottomSheetData[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ BottomSheetData copy$default(BottomSheetData bottomSheetData, String str, Set set, List list, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = bottomSheetData.headerText;
                    }
                    if ((i & 2) != 0) {
                        set = bottomSheetData.selectedValues;
                    }
                    if ((i & 4) != 0) {
                        list = bottomSheetData.choices;
                    }
                    if ((i & 8) != 0) {
                        z = bottomSheetData.canSelectMultiple;
                    }
                    return bottomSheetData.copy(str, set, list, z);
                }

                /* renamed from: component1, reason: from getter */
                public final String getHeaderText() {
                    return this.headerText;
                }

                public final Set<String> component2() {
                    return this.selectedValues;
                }

                public final List<OptionItem> component3() {
                    return this.choices;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getCanSelectMultiple() {
                    return this.canSelectMultiple;
                }

                public final BottomSheetData copy(String headerText, Set<String> selectedValues, List<OptionItem> choices, boolean canSelectMultiple) {
                    Intrinsics.checkNotNullParameter(headerText, "headerText");
                    Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
                    Intrinsics.checkNotNullParameter(choices, "choices");
                    return new BottomSheetData(headerText, selectedValues, choices, canSelectMultiple);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BottomSheetData)) {
                        return false;
                    }
                    BottomSheetData bottomSheetData = (BottomSheetData) other;
                    return Intrinsics.areEqual(this.headerText, bottomSheetData.headerText) && Intrinsics.areEqual(this.selectedValues, bottomSheetData.selectedValues) && Intrinsics.areEqual(this.choices, bottomSheetData.choices) && this.canSelectMultiple == bottomSheetData.canSelectMultiple;
                }

                public int hashCode() {
                    return (((((this.headerText.hashCode() * 31) + this.selectedValues.hashCode()) * 31) + this.choices.hashCode()) * 31) + Boolean.hashCode(this.canSelectMultiple);
                }

                public String toString() {
                    return "BottomSheetData(headerText=" + this.headerText + ", selectedValues=" + this.selectedValues + ", choices=" + this.choices + ", canSelectMultiple=" + this.canSelectMultiple + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.headerText);
                    Set<String> set = this.selectedValues;
                    dest.writeInt(set.size());
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        dest.writeString(it.next());
                    }
                    List<OptionItem> list = this.choices;
                    dest.writeInt(list.size());
                    Iterator<OptionItem> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().writeToParcel(dest, flags);
                    }
                    dest.writeInt(this.canSelectMultiple ? 1 : 0);
                }

                public BottomSheetData(String headerText, Set<String> selectedValues, List<OptionItem> choices, boolean z) {
                    Intrinsics.checkNotNullParameter(headerText, "headerText");
                    Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
                    Intrinsics.checkNotNullParameter(choices, "choices");
                    this.headerText = headerText;
                    this.selectedValues = selectedValues;
                    this.choices = choices;
                    this.canSelectMultiple = z;
                }

                public final String getHeaderText() {
                    return this.headerText;
                }

                public final Set<String> getSelectedValues() {
                    return this.selectedValues;
                }

                public final List<OptionItem> getChoices() {
                    return this.choices;
                }

                public final boolean getCanSelectMultiple() {
                    return this.canSelectMultiple;
                }
            }

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$OptionItem;", "Landroid/os/Parcelable;", "value", "", "displayTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getDisplayTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$OptionItem, reason: from toString */
            public static final /* data */ class OptionItem implements Parcelable {
                public static final Parcelable.Creator<OptionItem> CREATOR = new Creator();
                private final String displayTitle;
                private final String value;

                /* compiled from: NotificationSettings4FragmentKey.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$OptionItem$Creator */
                public static final class Creator implements Parcelable.Creator<OptionItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final OptionItem createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new OptionItem(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final OptionItem[] newArray(int i) {
                        return new OptionItem[i];
                    }
                }

                public static /* synthetic */ OptionItem copy$default(OptionItem optionItem, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = optionItem.value;
                    }
                    if ((i & 2) != 0) {
                        str2 = optionItem.displayTitle;
                    }
                    return optionItem.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final String getDisplayTitle() {
                    return this.displayTitle;
                }

                public final OptionItem copy(String value, String displayTitle) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    return new OptionItem(value, displayTitle);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof OptionItem)) {
                        return false;
                    }
                    OptionItem optionItem = (OptionItem) other;
                    return Intrinsics.areEqual(this.value, optionItem.value) && Intrinsics.areEqual(this.displayTitle, optionItem.displayTitle);
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + this.displayTitle.hashCode();
                }

                public String toString() {
                    return "OptionItem(value=" + this.value + ", displayTitle=" + this.displayTitle + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.value);
                    dest.writeString(this.displayTitle);
                }

                public OptionItem(String value, String displayTitle) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    this.value = value;
                    this.displayTitle = displayTitle;
                }

                public final String getValue() {
                    return this.value;
                }

                public final String getDisplayTitle() {
                    return this.displayTitle;
                }
            }
        }

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003'()B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "parentId", "", "id", "primaryText", "bottomSheetData", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData;)V", "getParentId", "()Ljava/lang/String;", "getId", "getPrimaryText", "getBottomSheetData", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData;", "selectedItems", "", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeOptionItem;", "getSelectedItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SnoozeBottomSheetData", "KeepCurrentOptionItem", "SnoozeOptionItem", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow, reason: from toString */
        public static final /* data */ class SnoozeBottomSheetMultipleChoiceRow implements BottomSheetEntryPointRow {
            public static final Parcelable.Creator<SnoozeBottomSheetMultipleChoiceRow> CREATOR = new Creator();
            private final SnoozeBottomSheetData bottomSheetData;
            private final String id;
            private final String parentId;
            private final String primaryText;

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$Creator */
            public static final class Creator implements Parcelable.Creator<SnoozeBottomSheetMultipleChoiceRow> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SnoozeBottomSheetMultipleChoiceRow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SnoozeBottomSheetMultipleChoiceRow(parcel.readString(), parcel.readString(), parcel.readString(), SnoozeBottomSheetData.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SnoozeBottomSheetMultipleChoiceRow[] newArray(int i) {
                    return new SnoozeBottomSheetMultipleChoiceRow[i];
                }
            }

            public static /* synthetic */ SnoozeBottomSheetMultipleChoiceRow copy$default(SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow, String str, String str2, String str3, SnoozeBottomSheetData snoozeBottomSheetData, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = snoozeBottomSheetMultipleChoiceRow.parentId;
                }
                if ((i & 2) != 0) {
                    str2 = snoozeBottomSheetMultipleChoiceRow.id;
                }
                if ((i & 4) != 0) {
                    str3 = snoozeBottomSheetMultipleChoiceRow.primaryText;
                }
                if ((i & 8) != 0) {
                    snoozeBottomSheetData = snoozeBottomSheetMultipleChoiceRow.bottomSheetData;
                }
                return snoozeBottomSheetMultipleChoiceRow.copy(str, str2, str3, snoozeBottomSheetData);
            }

            /* renamed from: component1, reason: from getter */
            public final String getParentId() {
                return this.parentId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPrimaryText() {
                return this.primaryText;
            }

            /* renamed from: component4, reason: from getter */
            public final SnoozeBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            public final SnoozeBottomSheetMultipleChoiceRow copy(String parentId, String id, String primaryText, SnoozeBottomSheetData bottomSheetData) {
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
                return new SnoozeBottomSheetMultipleChoiceRow(parentId, id, primaryText, bottomSheetData);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SnoozeBottomSheetMultipleChoiceRow)) {
                    return false;
                }
                SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = (SnoozeBottomSheetMultipleChoiceRow) other;
                return Intrinsics.areEqual(this.parentId, snoozeBottomSheetMultipleChoiceRow.parentId) && Intrinsics.areEqual(this.id, snoozeBottomSheetMultipleChoiceRow.id) && Intrinsics.areEqual(this.primaryText, snoozeBottomSheetMultipleChoiceRow.primaryText) && Intrinsics.areEqual(this.bottomSheetData, snoozeBottomSheetMultipleChoiceRow.bottomSheetData);
            }

            public int hashCode() {
                return (((((this.parentId.hashCode() * 31) + this.id.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.bottomSheetData.hashCode();
            }

            public String toString() {
                return "SnoozeBottomSheetMultipleChoiceRow(parentId=" + this.parentId + ", id=" + this.id + ", primaryText=" + this.primaryText + ", bottomSheetData=" + this.bottomSheetData + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.parentId);
                dest.writeString(this.id);
                dest.writeString(this.primaryText);
                this.bottomSheetData.writeToParcel(dest, flags);
            }

            public SnoozeBottomSheetMultipleChoiceRow(String parentId, String id, String primaryText, SnoozeBottomSheetData bottomSheetData) {
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
                this.parentId = parentId;
                this.id = id;
                this.primaryText = primaryText;
                this.bottomSheetData = bottomSheetData;
            }

            @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4.BottomSheetEntryPointRow
            public String getParentId() {
                return this.parentId;
            }

            @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4.BottomSheetEntryPointRow
            public String getId() {
                return this.id;
            }

            public final String getPrimaryText() {
                return this.primaryText;
            }

            public final SnoozeBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData;", "Landroid/os/Parcelable;", "headerText", "", "subheaderText", "adjustSnoozeHeaderText", "adjustSnoozeSubheaderText", "selectedValues", "", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeOptionItem;", "keepCurrentOptionItem", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem;", "lastSelectedAtSeconds", "", "defaultValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem;JLjava/util/Set;)V", "getHeaderText", "()Ljava/lang/String;", "getSubheaderText", "getAdjustSnoozeHeaderText", "getAdjustSnoozeSubheaderText", "getSelectedValues", "()Ljava/util/Set;", "getChoices", "()Ljava/util/List;", "getKeepCurrentOptionItem", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem;", "getLastSelectedAtSeconds", "()J", "getDefaultValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData, reason: from toString */
            public static final /* data */ class SnoozeBottomSheetData implements Parcelable {
                public static final Parcelable.Creator<SnoozeBottomSheetData> CREATOR = new Creator();
                private final String adjustSnoozeHeaderText;
                private final String adjustSnoozeSubheaderText;
                private final List<SnoozeOptionItem> choices;
                private final Set<String> defaultValues;
                private final String headerText;
                private final KeepCurrentOptionItem keepCurrentOptionItem;
                private final long lastSelectedAtSeconds;
                private final Set<String> selectedValues;
                private final String subheaderText;

                /* compiled from: NotificationSettings4FragmentKey.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeBottomSheetData$Creator */
                public static final class Creator implements Parcelable.Creator<SnoozeBottomSheetData> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SnoozeBottomSheetData createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        String string5 = parcel.readString();
                        int i = parcel.readInt();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            linkedHashSet.add(parcel.readString());
                        }
                        int i3 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i3);
                        for (int i4 = 0; i4 != i3; i4++) {
                            arrayList.add(SnoozeOptionItem.CREATOR.createFromParcel(parcel));
                        }
                        KeepCurrentOptionItem keepCurrentOptionItemCreateFromParcel = KeepCurrentOptionItem.CREATOR.createFromParcel(parcel);
                        long j = parcel.readLong();
                        int i5 = parcel.readInt();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
                        for (int i6 = 0; i6 != i5; i6++) {
                            linkedHashSet2.add(parcel.readString());
                        }
                        return new SnoozeBottomSheetData(string2, string3, string4, string5, linkedHashSet, arrayList, keepCurrentOptionItemCreateFromParcel, j, linkedHashSet2);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SnoozeBottomSheetData[] newArray(int i) {
                        return new SnoozeBottomSheetData[i];
                    }
                }

                public static /* synthetic */ SnoozeBottomSheetData copy$default(SnoozeBottomSheetData snoozeBottomSheetData, String str, String str2, String str3, String str4, Set set, List list, KeepCurrentOptionItem keepCurrentOptionItem, long j, Set set2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = snoozeBottomSheetData.headerText;
                    }
                    if ((i & 2) != 0) {
                        str2 = snoozeBottomSheetData.subheaderText;
                    }
                    if ((i & 4) != 0) {
                        str3 = snoozeBottomSheetData.adjustSnoozeHeaderText;
                    }
                    if ((i & 8) != 0) {
                        str4 = snoozeBottomSheetData.adjustSnoozeSubheaderText;
                    }
                    if ((i & 16) != 0) {
                        set = snoozeBottomSheetData.selectedValues;
                    }
                    if ((i & 32) != 0) {
                        list = snoozeBottomSheetData.choices;
                    }
                    if ((i & 64) != 0) {
                        keepCurrentOptionItem = snoozeBottomSheetData.keepCurrentOptionItem;
                    }
                    if ((i & 128) != 0) {
                        j = snoozeBottomSheetData.lastSelectedAtSeconds;
                    }
                    if ((i & 256) != 0) {
                        set2 = snoozeBottomSheetData.defaultValues;
                    }
                    Set set3 = set2;
                    long j2 = j;
                    List list2 = list;
                    KeepCurrentOptionItem keepCurrentOptionItem2 = keepCurrentOptionItem;
                    Set set4 = set;
                    String str5 = str3;
                    return snoozeBottomSheetData.copy(str, str2, str5, str4, set4, list2, keepCurrentOptionItem2, j2, set3);
                }

                /* renamed from: component1, reason: from getter */
                public final String getHeaderText() {
                    return this.headerText;
                }

                /* renamed from: component2, reason: from getter */
                public final String getSubheaderText() {
                    return this.subheaderText;
                }

                /* renamed from: component3, reason: from getter */
                public final String getAdjustSnoozeHeaderText() {
                    return this.adjustSnoozeHeaderText;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAdjustSnoozeSubheaderText() {
                    return this.adjustSnoozeSubheaderText;
                }

                public final Set<String> component5() {
                    return this.selectedValues;
                }

                public final List<SnoozeOptionItem> component6() {
                    return this.choices;
                }

                /* renamed from: component7, reason: from getter */
                public final KeepCurrentOptionItem getKeepCurrentOptionItem() {
                    return this.keepCurrentOptionItem;
                }

                /* renamed from: component8, reason: from getter */
                public final long getLastSelectedAtSeconds() {
                    return this.lastSelectedAtSeconds;
                }

                public final Set<String> component9() {
                    return this.defaultValues;
                }

                public final SnoozeBottomSheetData copy(String headerText, String subheaderText, String adjustSnoozeHeaderText, String adjustSnoozeSubheaderText, Set<String> selectedValues, List<SnoozeOptionItem> choices, KeepCurrentOptionItem keepCurrentOptionItem, long lastSelectedAtSeconds, Set<String> defaultValues) {
                    Intrinsics.checkNotNullParameter(headerText, "headerText");
                    Intrinsics.checkNotNullParameter(adjustSnoozeHeaderText, "adjustSnoozeHeaderText");
                    Intrinsics.checkNotNullParameter(adjustSnoozeSubheaderText, "adjustSnoozeSubheaderText");
                    Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
                    Intrinsics.checkNotNullParameter(choices, "choices");
                    Intrinsics.checkNotNullParameter(keepCurrentOptionItem, "keepCurrentOptionItem");
                    Intrinsics.checkNotNullParameter(defaultValues, "defaultValues");
                    return new SnoozeBottomSheetData(headerText, subheaderText, adjustSnoozeHeaderText, adjustSnoozeSubheaderText, selectedValues, choices, keepCurrentOptionItem, lastSelectedAtSeconds, defaultValues);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SnoozeBottomSheetData)) {
                        return false;
                    }
                    SnoozeBottomSheetData snoozeBottomSheetData = (SnoozeBottomSheetData) other;
                    return Intrinsics.areEqual(this.headerText, snoozeBottomSheetData.headerText) && Intrinsics.areEqual(this.subheaderText, snoozeBottomSheetData.subheaderText) && Intrinsics.areEqual(this.adjustSnoozeHeaderText, snoozeBottomSheetData.adjustSnoozeHeaderText) && Intrinsics.areEqual(this.adjustSnoozeSubheaderText, snoozeBottomSheetData.adjustSnoozeSubheaderText) && Intrinsics.areEqual(this.selectedValues, snoozeBottomSheetData.selectedValues) && Intrinsics.areEqual(this.choices, snoozeBottomSheetData.choices) && Intrinsics.areEqual(this.keepCurrentOptionItem, snoozeBottomSheetData.keepCurrentOptionItem) && this.lastSelectedAtSeconds == snoozeBottomSheetData.lastSelectedAtSeconds && Intrinsics.areEqual(this.defaultValues, snoozeBottomSheetData.defaultValues);
                }

                public int hashCode() {
                    int iHashCode = this.headerText.hashCode() * 31;
                    String str = this.subheaderText;
                    return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.adjustSnoozeHeaderText.hashCode()) * 31) + this.adjustSnoozeSubheaderText.hashCode()) * 31) + this.selectedValues.hashCode()) * 31) + this.choices.hashCode()) * 31) + this.keepCurrentOptionItem.hashCode()) * 31) + Long.hashCode(this.lastSelectedAtSeconds)) * 31) + this.defaultValues.hashCode();
                }

                public String toString() {
                    return "SnoozeBottomSheetData(headerText=" + this.headerText + ", subheaderText=" + this.subheaderText + ", adjustSnoozeHeaderText=" + this.adjustSnoozeHeaderText + ", adjustSnoozeSubheaderText=" + this.adjustSnoozeSubheaderText + ", selectedValues=" + this.selectedValues + ", choices=" + this.choices + ", keepCurrentOptionItem=" + this.keepCurrentOptionItem + ", lastSelectedAtSeconds=" + this.lastSelectedAtSeconds + ", defaultValues=" + this.defaultValues + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.headerText);
                    dest.writeString(this.subheaderText);
                    dest.writeString(this.adjustSnoozeHeaderText);
                    dest.writeString(this.adjustSnoozeSubheaderText);
                    Set<String> set = this.selectedValues;
                    dest.writeInt(set.size());
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        dest.writeString(it.next());
                    }
                    List<SnoozeOptionItem> list = this.choices;
                    dest.writeInt(list.size());
                    Iterator<SnoozeOptionItem> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().writeToParcel(dest, flags);
                    }
                    this.keepCurrentOptionItem.writeToParcel(dest, flags);
                    dest.writeLong(this.lastSelectedAtSeconds);
                    Set<String> set2 = this.defaultValues;
                    dest.writeInt(set2.size());
                    Iterator<String> it3 = set2.iterator();
                    while (it3.hasNext()) {
                        dest.writeString(it3.next());
                    }
                }

                public SnoozeBottomSheetData(String headerText, String str, String adjustSnoozeHeaderText, String adjustSnoozeSubheaderText, Set<String> selectedValues, List<SnoozeOptionItem> choices, KeepCurrentOptionItem keepCurrentOptionItem, long j, Set<String> defaultValues) {
                    Intrinsics.checkNotNullParameter(headerText, "headerText");
                    Intrinsics.checkNotNullParameter(adjustSnoozeHeaderText, "adjustSnoozeHeaderText");
                    Intrinsics.checkNotNullParameter(adjustSnoozeSubheaderText, "adjustSnoozeSubheaderText");
                    Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
                    Intrinsics.checkNotNullParameter(choices, "choices");
                    Intrinsics.checkNotNullParameter(keepCurrentOptionItem, "keepCurrentOptionItem");
                    Intrinsics.checkNotNullParameter(defaultValues, "defaultValues");
                    this.headerText = headerText;
                    this.subheaderText = str;
                    this.adjustSnoozeHeaderText = adjustSnoozeHeaderText;
                    this.adjustSnoozeSubheaderText = adjustSnoozeSubheaderText;
                    this.selectedValues = selectedValues;
                    this.choices = choices;
                    this.keepCurrentOptionItem = keepCurrentOptionItem;
                    this.lastSelectedAtSeconds = j;
                    this.defaultValues = defaultValues;
                }

                public final String getHeaderText() {
                    return this.headerText;
                }

                public final String getSubheaderText() {
                    return this.subheaderText;
                }

                public final String getAdjustSnoozeHeaderText() {
                    return this.adjustSnoozeHeaderText;
                }

                public final String getAdjustSnoozeSubheaderText() {
                    return this.adjustSnoozeSubheaderText;
                }

                public final Set<String> getSelectedValues() {
                    return this.selectedValues;
                }

                public final List<SnoozeOptionItem> getChoices() {
                    return this.choices;
                }

                public final KeepCurrentOptionItem getKeepCurrentOptionItem() {
                    return this.keepCurrentOptionItem;
                }

                public final long getLastSelectedAtSeconds() {
                    return this.lastSelectedAtSeconds;
                }

                public final Set<String> getDefaultValues() {
                    return this.defaultValues;
                }
            }

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem;", "Landroid/os/Parcelable;", "value", "", "displayTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getDisplayTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem, reason: from toString */
            public static final /* data */ class KeepCurrentOptionItem implements Parcelable {
                public static final Parcelable.Creator<KeepCurrentOptionItem> CREATOR = new Creator();
                private final String displayTitle;
                private final String value;

                /* compiled from: NotificationSettings4FragmentKey.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$KeepCurrentOptionItem$Creator */
                public static final class Creator implements Parcelable.Creator<KeepCurrentOptionItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final KeepCurrentOptionItem createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new KeepCurrentOptionItem(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final KeepCurrentOptionItem[] newArray(int i) {
                        return new KeepCurrentOptionItem[i];
                    }
                }

                public static /* synthetic */ KeepCurrentOptionItem copy$default(KeepCurrentOptionItem keepCurrentOptionItem, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = keepCurrentOptionItem.value;
                    }
                    if ((i & 2) != 0) {
                        str2 = keepCurrentOptionItem.displayTitle;
                    }
                    return keepCurrentOptionItem.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final String getDisplayTitle() {
                    return this.displayTitle;
                }

                public final KeepCurrentOptionItem copy(String value, String displayTitle) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    return new KeepCurrentOptionItem(value, displayTitle);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof KeepCurrentOptionItem)) {
                        return false;
                    }
                    KeepCurrentOptionItem keepCurrentOptionItem = (KeepCurrentOptionItem) other;
                    return Intrinsics.areEqual(this.value, keepCurrentOptionItem.value) && Intrinsics.areEqual(this.displayTitle, keepCurrentOptionItem.displayTitle);
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + this.displayTitle.hashCode();
                }

                public String toString() {
                    return "KeepCurrentOptionItem(value=" + this.value + ", displayTitle=" + this.displayTitle + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.value);
                    dest.writeString(this.displayTitle);
                }

                public KeepCurrentOptionItem(String value, String displayTitle) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    this.value = value;
                    this.displayTitle = displayTitle;
                }

                public final String getValue() {
                    return this.value;
                }

                public final String getDisplayTitle() {
                    return this.displayTitle;
                }
            }

            /* compiled from: NotificationSettings4FragmentKey.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0006\u0010 \u001a\u00020\u0006J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeOptionItem;", "Landroid/os/Parcelable;", "value", "", "displayTitle", "snoozeDurationInSeconds", "", "useSnoozeDisplayHeaders", "", "ifSelectedIncludeKeepCurrentSnoozeOption", "preselectValue", "hideWhenSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getDisplayTitle", "getSnoozeDurationInSeconds", "()I", "getUseSnoozeDisplayHeaders", "()Z", "getIfSelectedIncludeKeepCurrentSnoozeOption", "getPreselectValue", "getHideWhenSelected", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeOptionItem, reason: from toString */
            public static final /* data */ class SnoozeOptionItem implements Parcelable {
                public static final Parcelable.Creator<SnoozeOptionItem> CREATOR = new Creator();
                private final String displayTitle;
                private final boolean hideWhenSelected;
                private final boolean ifSelectedIncludeKeepCurrentSnoozeOption;
                private final String preselectValue;
                private final int snoozeDurationInSeconds;
                private final boolean useSnoozeDisplayHeaders;
                private final String value;

                /* compiled from: NotificationSettings4FragmentKey.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.settings.contracts.ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow$SnoozeOptionItem$Creator */
                public static final class Creator implements Parcelable.Creator<SnoozeOptionItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SnoozeOptionItem createFromParcel(Parcel parcel) {
                        boolean z;
                        boolean z2;
                        String str;
                        boolean z3;
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        int i = parcel.readInt();
                        boolean z4 = false;
                        boolean z5 = true;
                        if (parcel.readInt() != 0) {
                            z = false;
                            z4 = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                            z5 = z;
                        }
                        String string4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = z2;
                            str = string4;
                        } else {
                            str = string4;
                            z3 = z;
                        }
                        return new SnoozeOptionItem(string2, string3, i, z4, z5, str, z3);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SnoozeOptionItem[] newArray(int i) {
                        return new SnoozeOptionItem[i];
                    }
                }

                public static /* synthetic */ SnoozeOptionItem copy$default(SnoozeOptionItem snoozeOptionItem, String str, String str2, int i, boolean z, boolean z2, String str3, boolean z3, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = snoozeOptionItem.value;
                    }
                    if ((i2 & 2) != 0) {
                        str2 = snoozeOptionItem.displayTitle;
                    }
                    if ((i2 & 4) != 0) {
                        i = snoozeOptionItem.snoozeDurationInSeconds;
                    }
                    if ((i2 & 8) != 0) {
                        z = snoozeOptionItem.useSnoozeDisplayHeaders;
                    }
                    if ((i2 & 16) != 0) {
                        z2 = snoozeOptionItem.ifSelectedIncludeKeepCurrentSnoozeOption;
                    }
                    if ((i2 & 32) != 0) {
                        str3 = snoozeOptionItem.preselectValue;
                    }
                    if ((i2 & 64) != 0) {
                        z3 = snoozeOptionItem.hideWhenSelected;
                    }
                    String str4 = str3;
                    boolean z4 = z3;
                    boolean z5 = z2;
                    int i3 = i;
                    return snoozeOptionItem.copy(str, str2, i3, z, z5, str4, z4);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final String getDisplayTitle() {
                    return this.displayTitle;
                }

                /* renamed from: component3, reason: from getter */
                public final int getSnoozeDurationInSeconds() {
                    return this.snoozeDurationInSeconds;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getUseSnoozeDisplayHeaders() {
                    return this.useSnoozeDisplayHeaders;
                }

                /* renamed from: component5, reason: from getter */
                public final boolean getIfSelectedIncludeKeepCurrentSnoozeOption() {
                    return this.ifSelectedIncludeKeepCurrentSnoozeOption;
                }

                /* renamed from: component6, reason: from getter */
                public final String getPreselectValue() {
                    return this.preselectValue;
                }

                /* renamed from: component7, reason: from getter */
                public final boolean getHideWhenSelected() {
                    return this.hideWhenSelected;
                }

                public final SnoozeOptionItem copy(String value, String displayTitle, int snoozeDurationInSeconds, boolean useSnoozeDisplayHeaders, boolean ifSelectedIncludeKeepCurrentSnoozeOption, String preselectValue, boolean hideWhenSelected) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    Intrinsics.checkNotNullParameter(preselectValue, "preselectValue");
                    return new SnoozeOptionItem(value, displayTitle, snoozeDurationInSeconds, useSnoozeDisplayHeaders, ifSelectedIncludeKeepCurrentSnoozeOption, preselectValue, hideWhenSelected);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SnoozeOptionItem)) {
                        return false;
                    }
                    SnoozeOptionItem snoozeOptionItem = (SnoozeOptionItem) other;
                    return Intrinsics.areEqual(this.value, snoozeOptionItem.value) && Intrinsics.areEqual(this.displayTitle, snoozeOptionItem.displayTitle) && this.snoozeDurationInSeconds == snoozeOptionItem.snoozeDurationInSeconds && this.useSnoozeDisplayHeaders == snoozeOptionItem.useSnoozeDisplayHeaders && this.ifSelectedIncludeKeepCurrentSnoozeOption == snoozeOptionItem.ifSelectedIncludeKeepCurrentSnoozeOption && Intrinsics.areEqual(this.preselectValue, snoozeOptionItem.preselectValue) && this.hideWhenSelected == snoozeOptionItem.hideWhenSelected;
                }

                public int hashCode() {
                    return (((((((((((this.value.hashCode() * 31) + this.displayTitle.hashCode()) * 31) + Integer.hashCode(this.snoozeDurationInSeconds)) * 31) + Boolean.hashCode(this.useSnoozeDisplayHeaders)) * 31) + Boolean.hashCode(this.ifSelectedIncludeKeepCurrentSnoozeOption)) * 31) + this.preselectValue.hashCode()) * 31) + Boolean.hashCode(this.hideWhenSelected);
                }

                public String toString() {
                    return "SnoozeOptionItem(value=" + this.value + ", displayTitle=" + this.displayTitle + ", snoozeDurationInSeconds=" + this.snoozeDurationInSeconds + ", useSnoozeDisplayHeaders=" + this.useSnoozeDisplayHeaders + ", ifSelectedIncludeKeepCurrentSnoozeOption=" + this.ifSelectedIncludeKeepCurrentSnoozeOption + ", preselectValue=" + this.preselectValue + ", hideWhenSelected=" + this.hideWhenSelected + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.value);
                    dest.writeString(this.displayTitle);
                    dest.writeInt(this.snoozeDurationInSeconds);
                    dest.writeInt(this.useSnoozeDisplayHeaders ? 1 : 0);
                    dest.writeInt(this.ifSelectedIncludeKeepCurrentSnoozeOption ? 1 : 0);
                    dest.writeString(this.preselectValue);
                    dest.writeInt(this.hideWhenSelected ? 1 : 0);
                }

                public SnoozeOptionItem(String value, String displayTitle, int i, boolean z, boolean z2, String preselectValue, boolean z3) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
                    Intrinsics.checkNotNullParameter(preselectValue, "preselectValue");
                    this.value = value;
                    this.displayTitle = displayTitle;
                    this.snoozeDurationInSeconds = i;
                    this.useSnoozeDisplayHeaders = z;
                    this.ifSelectedIncludeKeepCurrentSnoozeOption = z2;
                    this.preselectValue = preselectValue;
                    this.hideWhenSelected = z3;
                }

                public final String getValue() {
                    return this.value;
                }

                public final String getDisplayTitle() {
                    return this.displayTitle;
                }

                public final int getSnoozeDurationInSeconds() {
                    return this.snoozeDurationInSeconds;
                }

                public final boolean getUseSnoozeDisplayHeaders() {
                    return this.useSnoozeDisplayHeaders;
                }

                public final boolean getIfSelectedIncludeKeepCurrentSnoozeOption() {
                    return this.ifSelectedIncludeKeepCurrentSnoozeOption;
                }

                public final String getPreselectValue() {
                    return this.preselectValue;
                }

                public final boolean getHideWhenSelected() {
                    return this.hideWhenSelected;
                }
            }

            public final List<SnoozeOptionItem> getSelectedItems() {
                List<SnoozeOptionItem> choices = this.bottomSheetData.getChoices();
                ArrayList arrayList = new ArrayList();
                for (Object obj : choices) {
                    if (this.bottomSheetData.getSelectedValues().contains(((SnoozeOptionItem) obj).getValue())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0005J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$SubPageEntry;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "primaryText", "", "secondaryTextRes", "", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/shared/settings/contracts/SubPageReference;)V", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubPageReference", "()Lcom/robinhood/shared/settings/contracts/SubPageReference;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/shared/settings/contracts/SubPageReference;)Lcom/robinhood/shared/settings/contracts/ViewType$SubPageEntry;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SubPageEntry, reason: from toString */
    public static final /* data */ class SubPageEntry extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<SubPageEntry> CREATOR = new Creator();
        private final String primaryText;
        private final Integer secondaryTextRes;
        private final NotificationSettings4FragmentKey3 subPageReference;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SubPageEntry$Creator */
        public static final class Creator implements Parcelable.Creator<SubPageEntry> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubPageEntry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubPageEntry(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (NotificationSettings4FragmentKey3) parcel.readParcelable(SubPageEntry.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubPageEntry[] newArray(int i) {
                return new SubPageEntry[i];
            }
        }

        public static /* synthetic */ SubPageEntry copy$default(SubPageEntry subPageEntry, String str, Integer num, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subPageEntry.primaryText;
            }
            if ((i & 2) != 0) {
                num = subPageEntry.secondaryTextRes;
            }
            if ((i & 4) != 0) {
                notificationSettings4FragmentKey3 = subPageEntry.subPageReference;
            }
            return subPageEntry.copy(str, num, notificationSettings4FragmentKey3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getSecondaryTextRes() {
            return this.secondaryTextRes;
        }

        /* renamed from: component3, reason: from getter */
        public final NotificationSettings4FragmentKey3 getSubPageReference() {
            return this.subPageReference;
        }

        public final SubPageEntry copy(String primaryText, Integer secondaryTextRes, NotificationSettings4FragmentKey3 subPageReference) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(subPageReference, "subPageReference");
            return new SubPageEntry(primaryText, secondaryTextRes, subPageReference);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubPageEntry)) {
                return false;
            }
            SubPageEntry subPageEntry = (SubPageEntry) other;
            return Intrinsics.areEqual(this.primaryText, subPageEntry.primaryText) && Intrinsics.areEqual(this.secondaryTextRes, subPageEntry.secondaryTextRes) && Intrinsics.areEqual(this.subPageReference, subPageEntry.subPageReference);
        }

        public int hashCode() {
            int iHashCode = this.primaryText.hashCode() * 31;
            Integer num = this.secondaryTextRes;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.subPageReference.hashCode();
        }

        public String toString() {
            return "SubPageEntry(primaryText=" + this.primaryText + ", secondaryTextRes=" + this.secondaryTextRes + ", subPageReference=" + this.subPageReference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.primaryText);
            Integer num = this.secondaryTextRes;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeParcelable(this.subPageReference, flags);
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final Integer getSecondaryTextRes() {
            return this.secondaryTextRes;
        }

        public final NotificationSettings4FragmentKey3 getSubPageReference() {
            return this.subPageReference;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubPageEntry(String primaryText, Integer num, NotificationSettings4FragmentKey3 subPageReference) {
            super(null);
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(subPageReference, "subPageReference");
            this.primaryText = primaryText;
            this.secondaryTextRes = num;
            this.subPageReference = subPageReference;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "parentId", "", "id", "options", "", "optionsSubtitle", "optionValues", "selectedValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getParentId", "()Ljava/lang/String;", "getId", "getOptions", "()Ljava/util/List;", "getOptionsSubtitle", "getOptionValues", "getSelectedValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$RadioGroup, reason: from toString */
    public static final /* data */ class RadioGroup extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<RadioGroup> CREATOR = new Creator();
        private final String id;
        private final List<String> optionValues;
        private final List<String> options;
        private final List<String> optionsSubtitle;
        private final String parentId;
        private final String selectedValue;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$RadioGroup$Creator */
        public static final class Creator implements Parcelable.Creator<RadioGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadioGroup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RadioGroup(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadioGroup[] newArray(int i) {
                return new RadioGroup[i];
            }
        }

        public static /* synthetic */ RadioGroup copy$default(RadioGroup radioGroup, String str, String str2, List list, List list2, List list3, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = radioGroup.parentId;
            }
            if ((i & 2) != 0) {
                str2 = radioGroup.id;
            }
            if ((i & 4) != 0) {
                list = radioGroup.options;
            }
            if ((i & 8) != 0) {
                list2 = radioGroup.optionsSubtitle;
            }
            if ((i & 16) != 0) {
                list3 = radioGroup.optionValues;
            }
            if ((i & 32) != 0) {
                str3 = radioGroup.selectedValue;
            }
            List list4 = list3;
            String str4 = str3;
            return radioGroup.copy(str, str2, list, list2, list4, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getParentId() {
            return this.parentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<String> component3() {
            return this.options;
        }

        public final List<String> component4() {
            return this.optionsSubtitle;
        }

        public final List<String> component5() {
            return this.optionValues;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSelectedValue() {
            return this.selectedValue;
        }

        public final RadioGroup copy(String parentId, String id, List<String> options, List<String> optionsSubtitle, List<String> optionValues, String selectedValue) {
            Intrinsics.checkNotNullParameter(parentId, "parentId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(optionsSubtitle, "optionsSubtitle");
            Intrinsics.checkNotNullParameter(optionValues, "optionValues");
            Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
            return new RadioGroup(parentId, id, options, optionsSubtitle, optionValues, selectedValue);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadioGroup)) {
                return false;
            }
            RadioGroup radioGroup = (RadioGroup) other;
            return Intrinsics.areEqual(this.parentId, radioGroup.parentId) && Intrinsics.areEqual(this.id, radioGroup.id) && Intrinsics.areEqual(this.options, radioGroup.options) && Intrinsics.areEqual(this.optionsSubtitle, radioGroup.optionsSubtitle) && Intrinsics.areEqual(this.optionValues, radioGroup.optionValues) && Intrinsics.areEqual(this.selectedValue, radioGroup.selectedValue);
        }

        public int hashCode() {
            return (((((((((this.parentId.hashCode() * 31) + this.id.hashCode()) * 31) + this.options.hashCode()) * 31) + this.optionsSubtitle.hashCode()) * 31) + this.optionValues.hashCode()) * 31) + this.selectedValue.hashCode();
        }

        public String toString() {
            return "RadioGroup(parentId=" + this.parentId + ", id=" + this.id + ", options=" + this.options + ", optionsSubtitle=" + this.optionsSubtitle + ", optionValues=" + this.optionValues + ", selectedValue=" + this.selectedValue + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.parentId);
            dest.writeString(this.id);
            dest.writeStringList(this.options);
            dest.writeStringList(this.optionsSubtitle);
            dest.writeStringList(this.optionValues);
            dest.writeString(this.selectedValue);
        }

        public final String getParentId() {
            return this.parentId;
        }

        public final String getId() {
            return this.id;
        }

        public final List<String> getOptions() {
            return this.options;
        }

        public final List<String> getOptionsSubtitle() {
            return this.optionsSubtitle;
        }

        public final List<String> getOptionValues() {
            return this.optionValues;
        }

        public final String getSelectedValue() {
            return this.selectedValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RadioGroup(String parentId, String id, List<String> options, List<String> optionsSubtitle, List<String> optionValues, String selectedValue) {
            super(null);
            Intrinsics.checkNotNullParameter(parentId, "parentId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(optionsSubtitle, "optionsSubtitle");
            Intrinsics.checkNotNullParameter(optionValues, "optionValues");
            Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
            this.parentId = parentId;
            this.id = id;
            this.options = options;
            this.optionsSubtitle = optionsSubtitle;
            this.optionValues = optionValues;
            this.selectedValue = selectedValue;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$SubtitleRichText;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "content", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(Lcom/robinhood/models/serverdriven/db/RichText;)V", "getContent", "()Lcom/robinhood/models/serverdriven/db/RichText;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SubtitleRichText, reason: from toString */
    public static final /* data */ class SubtitleRichText extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<SubtitleRichText> CREATOR = new Creator();
        private final RichText content;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$SubtitleRichText$Creator */
        public static final class Creator implements Parcelable.Creator<SubtitleRichText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubtitleRichText createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubtitleRichText((RichText) parcel.readParcelable(SubtitleRichText.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubtitleRichText[] newArray(int i) {
                return new SubtitleRichText[i];
            }
        }

        public static /* synthetic */ SubtitleRichText copy$default(SubtitleRichText subtitleRichText, RichText richText, int i, Object obj) {
            if ((i & 1) != 0) {
                richText = subtitleRichText.content;
            }
            return subtitleRichText.copy(richText);
        }

        /* renamed from: component1, reason: from getter */
        public final RichText getContent() {
            return this.content;
        }

        public final SubtitleRichText copy(RichText content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new SubtitleRichText(content);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubtitleRichText) && Intrinsics.areEqual(this.content, ((SubtitleRichText) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "SubtitleRichText(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubtitleRichText(RichText content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final RichText getContent() {
            return this.content;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/ViewType$TitleSubtitle;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "title", "", "subtitle", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/api/ApiGenericAction;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.ViewType$TitleSubtitle, reason: from toString */
    public static final /* data */ class TitleSubtitle extends NotificationSettings4FragmentKey4 {
        public static final Parcelable.Creator<TitleSubtitle> CREATOR = new Creator();
        private final ApiGenericAction action;
        private final String subtitle;
        private final String title;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.ViewType$TitleSubtitle$Creator */
        public static final class Creator implements Parcelable.Creator<TitleSubtitle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleSubtitle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TitleSubtitle(parcel.readString(), parcel.readString(), (ApiGenericAction) parcel.readParcelable(TitleSubtitle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleSubtitle[] newArray(int i) {
                return new TitleSubtitle[i];
            }
        }

        public static /* synthetic */ TitleSubtitle copy$default(TitleSubtitle titleSubtitle, String str, String str2, ApiGenericAction apiGenericAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleSubtitle.title;
            }
            if ((i & 2) != 0) {
                str2 = titleSubtitle.subtitle;
            }
            if ((i & 4) != 0) {
                apiGenericAction = titleSubtitle.action;
            }
            return titleSubtitle.copy(str, str2, apiGenericAction);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiGenericAction getAction() {
            return this.action;
        }

        public final TitleSubtitle copy(String title, String subtitle, ApiGenericAction action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            return new TitleSubtitle(title, subtitle, action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleSubtitle)) {
                return false;
            }
            TitleSubtitle titleSubtitle = (TitleSubtitle) other;
            return Intrinsics.areEqual(this.title, titleSubtitle.title) && Intrinsics.areEqual(this.subtitle, titleSubtitle.subtitle) && Intrinsics.areEqual(this.action, titleSubtitle.action);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "TitleSubtitle(title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.action, flags);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ApiGenericAction getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleSubtitle(String title, String subtitle, ApiGenericAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.subtitle = subtitle;
            this.action = action;
        }
    }
}
