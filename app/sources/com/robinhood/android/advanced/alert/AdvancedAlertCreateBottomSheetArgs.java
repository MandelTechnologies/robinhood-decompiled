package com.robinhood.android.advanced.alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertCreateBottomSheetArgs.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetArgs;", "Landroid/os/Parcelable;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "entityId", "Ljava/util/UUID;", "maximumFractionDigits", "", "settingItem", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "<init>", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;Ljava/lang/Integer;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)V", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getEntityId", "()Ljava/util/UUID;", "getMaximumFractionDigits", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSettingItem", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;Ljava/util/UUID;Ljava/lang/Integer;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetArgs;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AdvancedAlertCreateBottomSheetArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedAlertCreateBottomSheetArgs> CREATOR = new Creator();
    private final UUID entityId;
    private final ApiAdvancedAlert2 entityType;
    private final Integer maximumFractionDigits;
    private final Screen.Name screenName;
    private final AlertHubSettingItem settingItem;

    /* compiled from: AdvancedAlertCreateBottomSheetArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvancedAlertCreateBottomSheetArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedAlertCreateBottomSheetArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedAlertCreateBottomSheetArgs(ApiAdvancedAlert2.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AlertHubSettingItem) parcel.readParcelable(AdvancedAlertCreateBottomSheetArgs.class.getClassLoader()), Screen.Name.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedAlertCreateBottomSheetArgs[] newArray(int i) {
            return new AdvancedAlertCreateBottomSheetArgs[i];
        }
    }

    public static /* synthetic */ AdvancedAlertCreateBottomSheetArgs copy$default(AdvancedAlertCreateBottomSheetArgs advancedAlertCreateBottomSheetArgs, ApiAdvancedAlert2 apiAdvancedAlert2, UUID uuid, Integer num, AlertHubSettingItem alertHubSettingItem, Screen.Name name, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAdvancedAlert2 = advancedAlertCreateBottomSheetArgs.entityType;
        }
        if ((i & 2) != 0) {
            uuid = advancedAlertCreateBottomSheetArgs.entityId;
        }
        if ((i & 4) != 0) {
            num = advancedAlertCreateBottomSheetArgs.maximumFractionDigits;
        }
        if ((i & 8) != 0) {
            alertHubSettingItem = advancedAlertCreateBottomSheetArgs.settingItem;
        }
        if ((i & 16) != 0) {
            name = advancedAlertCreateBottomSheetArgs.screenName;
        }
        Screen.Name name2 = name;
        Integer num2 = num;
        return advancedAlertCreateBottomSheetArgs.copy(apiAdvancedAlert2, uuid, num2, alertHubSettingItem, name2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAdvancedAlert2 getEntityType() {
        return this.entityType;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getEntityId() {
        return this.entityId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    /* renamed from: component4, reason: from getter */
    public final AlertHubSettingItem getSettingItem() {
        return this.settingItem;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public final AdvancedAlertCreateBottomSheetArgs copy(ApiAdvancedAlert2 entityType, UUID entityId, Integer maximumFractionDigits, AlertHubSettingItem settingItem, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(settingItem, "settingItem");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        return new AdvancedAlertCreateBottomSheetArgs(entityType, entityId, maximumFractionDigits, settingItem, screenName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAlertCreateBottomSheetArgs)) {
            return false;
        }
        AdvancedAlertCreateBottomSheetArgs advancedAlertCreateBottomSheetArgs = (AdvancedAlertCreateBottomSheetArgs) other;
        return this.entityType == advancedAlertCreateBottomSheetArgs.entityType && Intrinsics.areEqual(this.entityId, advancedAlertCreateBottomSheetArgs.entityId) && Intrinsics.areEqual(this.maximumFractionDigits, advancedAlertCreateBottomSheetArgs.maximumFractionDigits) && Intrinsics.areEqual(this.settingItem, advancedAlertCreateBottomSheetArgs.settingItem) && this.screenName == advancedAlertCreateBottomSheetArgs.screenName;
    }

    public int hashCode() {
        int iHashCode = ((this.entityType.hashCode() * 31) + this.entityId.hashCode()) * 31;
        Integer num = this.maximumFractionDigits;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.settingItem.hashCode()) * 31) + this.screenName.hashCode();
    }

    public String toString() {
        return "AdvancedAlertCreateBottomSheetArgs(entityType=" + this.entityType + ", entityId=" + this.entityId + ", maximumFractionDigits=" + this.maximumFractionDigits + ", settingItem=" + this.settingItem + ", screenName=" + this.screenName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entityType.name());
        dest.writeSerializable(this.entityId);
        Integer num = this.maximumFractionDigits;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.settingItem, flags);
        dest.writeString(this.screenName.name());
    }

    public AdvancedAlertCreateBottomSheetArgs(ApiAdvancedAlert2 entityType, UUID entityId, Integer num, AlertHubSettingItem settingItem, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(settingItem, "settingItem");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        this.entityType = entityType;
        this.entityId = entityId;
        this.maximumFractionDigits = num;
        this.settingItem = settingItem;
        this.screenName = screenName;
    }

    public /* synthetic */ AdvancedAlertCreateBottomSheetArgs(ApiAdvancedAlert2 apiAdvancedAlert2, UUID uuid, Integer num, AlertHubSettingItem alertHubSettingItem, Screen.Name name, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiAdvancedAlert2, uuid, (i & 4) != 0 ? null : num, alertHubSettingItem, name);
    }

    public final ApiAdvancedAlert2 getEntityType() {
        return this.entityType;
    }

    public final UUID getEntityId() {
        return this.entityId;
    }

    public final Integer getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    public final AlertHubSettingItem getSettingItem() {
        return this.settingItem;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }
}
