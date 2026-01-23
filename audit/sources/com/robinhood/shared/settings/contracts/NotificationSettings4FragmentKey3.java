package com.robinhood.shared.settings.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4FragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SubPageReference;", "Landroid/os/Parcelable;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "FromId", "FromViews", "Lcom/robinhood/shared/settings/contracts/SubPageReference$FromId;", "Lcom/robinhood/shared/settings/contracts/SubPageReference$FromViews;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.settings.contracts.SubPageReference, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class NotificationSettings4FragmentKey3 implements Parcelable {
    private final String id;

    public /* synthetic */ NotificationSettings4FragmentKey3(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private NotificationSettings4FragmentKey3(String str) {
        this.id = str;
    }

    public String getId() {
        return this.id;
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SubPageReference$FromId;", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "id", "", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getItemId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.SubPageReference$FromId, reason: from toString */
    public static final /* data */ class FromId extends NotificationSettings4FragmentKey3 {
        public static final Parcelable.Creator<FromId> CREATOR = new Creator();
        private final String id;
        private final String itemId;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.SubPageReference$FromId$Creator */
        public static final class Creator implements Parcelable.Creator<FromId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromId(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromId[] newArray(int i) {
                return new FromId[i];
            }
        }

        public static /* synthetic */ FromId copy$default(FromId fromId, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fromId.id;
            }
            if ((i & 2) != 0) {
                str2 = fromId.itemId;
            }
            return fromId.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        public final FromId copy(String id, String itemId) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new FromId(id, itemId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromId)) {
                return false;
            }
            FromId fromId = (FromId) other;
            return Intrinsics.areEqual(this.id, fromId.id) && Intrinsics.areEqual(this.itemId, fromId.itemId);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.itemId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FromId(id=" + this.id + ", itemId=" + this.itemId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.itemId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromId(String id, String str) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.itemId = str;
        }

        public /* synthetic */ FromId(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3
        public String getId() {
            return this.id;
        }

        public final String getItemId() {
            return this.itemId;
        }
    }

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/SubPageReference$FromViews;", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "id", "", "rootSettingsId", "title", "views", "", "Lcom/robinhood/shared/settings/contracts/ViewType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getRootSettingsId", "getTitle", "getViews", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.settings.contracts.SubPageReference$FromViews, reason: from toString */
    public static final /* data */ class FromViews extends NotificationSettings4FragmentKey3 {
        public static final Parcelable.Creator<FromViews> CREATOR = new Creator();
        private final String id;
        private final String rootSettingsId;
        private final String title;
        private final List<NotificationSettings4FragmentKey4> views;

        /* compiled from: NotificationSettings4FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.settings.contracts.SubPageReference$FromViews$Creator */
        public static final class Creator implements Parcelable.Creator<FromViews> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromViews createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FromViews.class.getClassLoader()));
                }
                return new FromViews(string2, string3, string4, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromViews[] newArray(int i) {
                return new FromViews[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FromViews copy$default(FromViews fromViews, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fromViews.id;
            }
            if ((i & 2) != 0) {
                str2 = fromViews.rootSettingsId;
            }
            if ((i & 4) != 0) {
                str3 = fromViews.title;
            }
            if ((i & 8) != 0) {
                list = fromViews.views;
            }
            return fromViews.copy(str, str2, str3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRootSettingsId() {
            return this.rootSettingsId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<NotificationSettings4FragmentKey4> component4() {
            return this.views;
        }

        public final FromViews copy(String id, String rootSettingsId, String title, List<? extends NotificationSettings4FragmentKey4> views) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(rootSettingsId, "rootSettingsId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(views, "views");
            return new FromViews(id, rootSettingsId, title, views);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromViews)) {
                return false;
            }
            FromViews fromViews = (FromViews) other;
            return Intrinsics.areEqual(this.id, fromViews.id) && Intrinsics.areEqual(this.rootSettingsId, fromViews.rootSettingsId) && Intrinsics.areEqual(this.title, fromViews.title) && Intrinsics.areEqual(this.views, fromViews.views);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.rootSettingsId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.views.hashCode();
        }

        public String toString() {
            return "FromViews(id=" + this.id + ", rootSettingsId=" + this.rootSettingsId + ", title=" + this.title + ", views=" + this.views + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.rootSettingsId);
            dest.writeString(this.title);
            List<NotificationSettings4FragmentKey4> list = this.views;
            dest.writeInt(list.size());
            Iterator<NotificationSettings4FragmentKey4> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        @Override // com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3
        public String getId() {
            return this.id;
        }

        public final String getRootSettingsId() {
            return this.rootSettingsId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<NotificationSettings4FragmentKey4> getViews() {
            return this.views;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FromViews(String id, String rootSettingsId, String title, List<? extends NotificationSettings4FragmentKey4> views) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(rootSettingsId, "rootSettingsId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(views, "views");
            this.id = id;
            this.rootSettingsId = rootSettingsId;
            this.title = title;
            this.views = views;
        }
    }
}
