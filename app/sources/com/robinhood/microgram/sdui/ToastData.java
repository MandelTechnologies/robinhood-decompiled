package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToastData.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ToastData;", "Landroid/os/Parcelable;", "id", "", "text", "leadingIcon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "actionData", "Lcom/robinhood/microgram/sdui/ToastData$ActionData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Lcom/robinhood/microgram/sdui/ToastData$ActionData;)V", "getId", "()Ljava/lang/String;", "getText", "getLeadingIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getActionData", "()Lcom/robinhood/microgram/sdui/ToastData$ActionData;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ActionData", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ToastData implements Parcelable {
    public static final Parcelable.Creator<ToastData> CREATOR = new Creator();
    private final ActionData actionData;
    private final String id;
    private final Icon leadingIcon;
    private final String text;

    /* compiled from: ToastData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ToastData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToastData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ToastData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.valueOf(parcel.readString()), parcel.readInt() != 0 ? ActionData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToastData[] newArray(int i) {
            return new ToastData[i];
        }
    }

    public static /* synthetic */ ToastData copy$default(ToastData toastData, String str, String str2, Icon icon, ActionData actionData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toastData.id;
        }
        if ((i & 2) != 0) {
            str2 = toastData.text;
        }
        if ((i & 4) != 0) {
            icon = toastData.leadingIcon;
        }
        if ((i & 8) != 0) {
            actionData = toastData.actionData;
        }
        return toastData.copy(str, str2, icon, actionData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Icon getLeadingIcon() {
        return this.leadingIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionData getActionData() {
        return this.actionData;
    }

    public final ToastData copy(String id, String text, Icon leadingIcon, ActionData actionData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ToastData(id, text, leadingIcon, actionData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastData)) {
            return false;
        }
        ToastData toastData = (ToastData) other;
        return Intrinsics.areEqual(this.id, toastData.id) && Intrinsics.areEqual(this.text, toastData.text) && this.leadingIcon == toastData.leadingIcon && Intrinsics.areEqual(this.actionData, toastData.actionData);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
        Icon icon = this.leadingIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        ActionData actionData = this.actionData;
        return iHashCode2 + (actionData != null ? actionData.hashCode() : 0);
    }

    public String toString() {
        return "ToastData(id=" + this.id + ", text=" + this.text + ", leadingIcon=" + this.leadingIcon + ", actionData=" + this.actionData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.text);
        Icon icon = this.leadingIcon;
        if (icon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(icon.name());
        }
        ActionData actionData = this.actionData;
        if (actionData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            actionData.writeToParcel(dest, flags);
        }
    }

    public ToastData(String id, String text, Icon icon, ActionData actionData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = id;
        this.text = text;
        this.leadingIcon = icon;
        this.actionData = actionData;
    }

    public /* synthetic */ ToastData(String str, String str2, Icon icon, ActionData actionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : actionData);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final Icon getLeadingIcon() {
        return this.leadingIcon;
    }

    public final ActionData getActionData() {
        return this.actionData;
    }

    /* compiled from: ToastData.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ToastData$ActionData;", "Landroid/os/Parcelable;", "title", "", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "action", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Lcom/robinhood/microgram/sdui/MicrogramAction;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getAction", "()Lcom/robinhood/microgram/sdui/MicrogramAction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ActionData implements Parcelable {
        public static final Parcelable.Creator<ActionData> CREATOR = new Creator();
        private final MicrogramAction action;
        private final Icon icon;
        private final String title;

        /* compiled from: ToastData.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionData(parcel.readString(), parcel.readInt() == 0 ? null : Icon.valueOf(parcel.readString()), MicrogramAction.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionData[] newArray(int i) {
                return new ActionData[i];
            }
        }

        public static /* synthetic */ ActionData copy$default(ActionData actionData, String str, Icon icon, MicrogramAction microgramAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionData.title;
            }
            if ((i & 2) != 0) {
                icon = actionData.icon;
            }
            if ((i & 4) != 0) {
                microgramAction = actionData.action;
            }
            return actionData.copy(str, icon, microgramAction);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final MicrogramAction getAction() {
            return this.action;
        }

        public final ActionData copy(String title, Icon icon, MicrogramAction action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ActionData(title, icon, action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionData)) {
                return false;
            }
            ActionData actionData = (ActionData) other;
            return Intrinsics.areEqual(this.title, actionData.title) && this.icon == actionData.icon && Intrinsics.areEqual(this.action, actionData.action);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Icon icon = this.icon;
            return ((iHashCode + (icon == null ? 0 : icon.hashCode())) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "ActionData(title=" + this.title + ", icon=" + this.icon + ", action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            Icon icon = this.icon;
            if (icon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(icon.name());
            }
            this.action.writeToParcel(dest, flags);
        }

        public ActionData(String title, Icon icon, MicrogramAction action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.icon = icon;
            this.action = action;
        }

        public /* synthetic */ ActionData(String str, Icon icon, MicrogramAction microgramAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : icon, microgramAction);
        }

        public final String getTitle() {
            return this.title;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final MicrogramAction getAction() {
            return this.action;
        }
    }
}
