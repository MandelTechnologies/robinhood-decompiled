package com.robinhood.android.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.util.notification.RhGcmListenerService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkOrigin.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin;", "Landroid/os/Parcelable;", "<init>", "()V", "isExternalOrNotification", "", "()Z", "Internal", "AppLink", "Notification", "External", "Lcom/robinhood/android/navigation/DeepLinkOrigin$AppLink;", "Lcom/robinhood/android/navigation/DeepLinkOrigin$External;", "Lcom/robinhood/android/navigation/DeepLinkOrigin$Internal;", "Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class DeepLinkOrigin implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ DeepLinkOrigin(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeepLinkOrigin() {
    }

    /* compiled from: DeepLinkOrigin.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin$Internal;", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Internal extends DeepLinkOrigin {
        public static final int $stable = 0;
        public static final Internal INSTANCE = new Internal();
        public static final Parcelable.Creator<Internal> CREATOR = new Creator();

        /* compiled from: DeepLinkOrigin.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Internal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Internal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Internal.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Internal[] newArray(int i) {
                return new Internal[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Internal);
        }

        public int hashCode() {
            return -1347847655;
        }

        public String toString() {
            return "Internal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Internal() {
            super(null);
        }
    }

    /* compiled from: DeepLinkOrigin.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin$AppLink;", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AppLink extends DeepLinkOrigin {
        public static final int $stable = 0;
        public static final AppLink INSTANCE = new AppLink();
        public static final Parcelable.Creator<AppLink> CREATOR = new Creator();

        /* compiled from: DeepLinkOrigin.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AppLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AppLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppLink.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AppLink[] newArray(int i) {
                return new AppLink[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AppLink);
        }

        public int hashCode() {
            return 529405663;
        }

        public String toString() {
            return "AppLink";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AppLink() {
            super(null);
        }
    }

    /* compiled from: DeepLinkOrigin.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jy\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001c¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification;", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "uuid", "", "type", "title", CarResultComposable2.BODY, "expandedBodyOverride", "stacking", "Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification$Stacking;", "poBox", RhGcmListenerService.EXTRA_CATEGORY, "actionIdentifier", "isFromNotificationAction", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification$Stacking;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getUuid", "()Ljava/lang/String;", "getType", "getTitle", "getBody", "getExpandedBodyOverride", "getStacking", "()Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification$Stacking;", "getPoBox", "getCategory", "getActionIdentifier", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Stacking", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Notification extends DeepLinkOrigin {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Notification> CREATOR = new Creator();
        private final String actionIdentifier;
        private final String body;
        private final String category;
        private final String expandedBodyOverride;
        private final boolean isFromNotificationAction;
        private final String poBox;
        private final Stacking stacking;
        private final String title;
        private final String type;
        private final String uuid;

        /* compiled from: DeepLinkOrigin.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Notification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Notification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Stacking.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notification[] newArray(int i) {
                return new Notification[i];
            }
        }

        public static /* synthetic */ Notification copy$default(Notification notification, String str, String str2, String str3, String str4, String str5, Stacking stacking, String str6, String str7, String str8, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notification.uuid;
            }
            if ((i & 2) != 0) {
                str2 = notification.type;
            }
            if ((i & 4) != 0) {
                str3 = notification.title;
            }
            if ((i & 8) != 0) {
                str4 = notification.body;
            }
            if ((i & 16) != 0) {
                str5 = notification.expandedBodyOverride;
            }
            if ((i & 32) != 0) {
                stacking = notification.stacking;
            }
            if ((i & 64) != 0) {
                str6 = notification.poBox;
            }
            if ((i & 128) != 0) {
                str7 = notification.category;
            }
            if ((i & 256) != 0) {
                str8 = notification.actionIdentifier;
            }
            if ((i & 512) != 0) {
                z = notification.isFromNotificationAction;
            }
            String str9 = str8;
            boolean z2 = z;
            String str10 = str6;
            String str11 = str7;
            String str12 = str5;
            Stacking stacking2 = stacking;
            return notification.copy(str, str2, str3, str4, str12, stacking2, str10, str11, str9, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsFromNotificationAction() {
            return this.isFromNotificationAction;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component5, reason: from getter */
        public final String getExpandedBodyOverride() {
            return this.expandedBodyOverride;
        }

        /* renamed from: component6, reason: from getter */
        public final Stacking getStacking() {
            return this.stacking;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPoBox() {
            return this.poBox;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component9, reason: from getter */
        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final Notification copy(String uuid, String type2, String title, String body, String expandedBodyOverride, Stacking stacking, String poBox, String category, String actionIdentifier, boolean isFromNotificationAction) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(stacking, "stacking");
            return new Notification(uuid, type2, title, body, expandedBodyOverride, stacking, poBox, category, actionIdentifier, isFromNotificationAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) other;
            return Intrinsics.areEqual(this.uuid, notification.uuid) && Intrinsics.areEqual(this.type, notification.type) && Intrinsics.areEqual(this.title, notification.title) && Intrinsics.areEqual(this.body, notification.body) && Intrinsics.areEqual(this.expandedBodyOverride, notification.expandedBodyOverride) && this.stacking == notification.stacking && Intrinsics.areEqual(this.poBox, notification.poBox) && Intrinsics.areEqual(this.category, notification.category) && Intrinsics.areEqual(this.actionIdentifier, notification.actionIdentifier) && this.isFromNotificationAction == notification.isFromNotificationAction;
        }

        public int hashCode() {
            int iHashCode = ((this.uuid.hashCode() * 31) + this.type.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.expandedBodyOverride;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.stacking.hashCode()) * 31;
            String str4 = this.poBox;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.category;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.actionIdentifier;
            return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromNotificationAction);
        }

        public String toString() {
            return "Notification(uuid=" + this.uuid + ", type=" + this.type + ", title=" + this.title + ", body=" + this.body + ", expandedBodyOverride=" + this.expandedBodyOverride + ", stacking=" + this.stacking + ", poBox=" + this.poBox + ", category=" + this.category + ", actionIdentifier=" + this.actionIdentifier + ", isFromNotificationAction=" + this.isFromNotificationAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uuid);
            dest.writeString(this.type);
            dest.writeString(this.title);
            dest.writeString(this.body);
            dest.writeString(this.expandedBodyOverride);
            dest.writeString(this.stacking.name());
            dest.writeString(this.poBox);
            dest.writeString(this.category);
            dest.writeString(this.actionIdentifier);
            dest.writeInt(this.isFromNotificationAction ? 1 : 0);
        }

        public /* synthetic */ Notification(String str, String str2, String str3, String str4, String str5, Stacking stacking, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, stacking, str6, str7, str8, (i & 512) != 0 ? false : z);
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getType() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getExpandedBodyOverride() {
            return this.expandedBodyOverride;
        }

        public final Stacking getStacking() {
            return this.stacking;
        }

        public final String getPoBox() {
            return this.poBox;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final boolean isFromNotificationAction() {
            return this.isFromNotificationAction;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeepLinkOrigin.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin$Notification$Stacking;", "", "<init>", "(Ljava/lang/String;I)V", "UNSTACKED", "STACKED", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes17.dex */
        public static final class Stacking {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Stacking[] $VALUES;
            public static final Stacking UNSTACKED = new Stacking("UNSTACKED", 0);
            public static final Stacking STACKED = new Stacking("STACKED", 1);

            private static final /* synthetic */ Stacking[] $values() {
                return new Stacking[]{UNSTACKED, STACKED};
            }

            public static EnumEntries<Stacking> getEntries() {
                return $ENTRIES;
            }

            private Stacking(String str, int i) {
            }

            static {
                Stacking[] stackingArr$values = $values();
                $VALUES = stackingArr$values;
                $ENTRIES = EnumEntries2.enumEntries(stackingArr$values);
            }

            public static Stacking valueOf(String str) {
                return (Stacking) Enum.valueOf(Stacking.class, str);
            }

            public static Stacking[] values() {
                return (Stacking[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Notification(String uuid, String type2, String str, String str2, String str3, Stacking stacking, String str4, String str5, String str6, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(stacking, "stacking");
            this.uuid = uuid;
            this.type = type2;
            this.title = str;
            this.body = str2;
            this.expandedBodyOverride = str3;
            this.stacking = stacking;
            this.poBox = str4;
            this.category = str5;
            this.actionIdentifier = str6;
            this.isFromNotificationAction = z;
        }
    }

    /* compiled from: DeepLinkOrigin.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLinkOrigin$External;", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class External extends DeepLinkOrigin {
        public static final int $stable = 0;
        public static final External INSTANCE = new External();
        public static final Parcelable.Creator<External> CREATOR = new Creator();

        /* compiled from: DeepLinkOrigin.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<External> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return External.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External[] newArray(int i) {
                return new External[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof External);
        }

        public int hashCode() {
            return 555947815;
        }

        public String toString() {
            return "External";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private External() {
            super(null);
        }
    }

    public final boolean isExternalOrNotification() {
        return (this instanceof External) || (this instanceof Notification);
    }
}
