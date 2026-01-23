package com.robinhood.android.common.p088ui;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.api.ApiCuratedList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListChipItem.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0086\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u000bHÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010%¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipItem;", "", "id", "Ljava/util/UUID;", "displayName", "", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "circleSizedUrlHolder", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "iconDrawableRes", "", "itemCount", "eventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "isIconChip", "", "isBadged", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "isClosable", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;ZZLcom/robinhood/android/navigation/keys/FragmentKey;Z)V", "getId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getCircleSizedUrlHolder", "()Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "getIconDrawableRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemCount", "getEventData", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "()Z", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;ZZLcom/robinhood/android/navigation/keys/FragmentKey;Z)Lcom/robinhood/android/common/ui/CuratedListChipItem;", "equals", "other", "hashCode", "toString", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CuratedListChipItem {
    private final SizedUrlHolder circleSizedUrlHolder;
    private final String displayName;
    private final UserInteractionEventDescriptor eventData;
    private final FragmentKey fragmentKey;
    private final Integer iconDrawableRes;
    private final UUID id;
    private final boolean isBadged;
    private final boolean isClosable;
    private final boolean isIconChip;
    private final Integer itemCount;
    private final ApiCuratedList.OwnerType ownerType;

    public static /* synthetic */ CuratedListChipItem copy$default(CuratedListChipItem curatedListChipItem, UUID uuid, String str, ApiCuratedList.OwnerType ownerType, SizedUrlHolder sizedUrlHolder, Integer num, Integer num2, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, boolean z2, FragmentKey fragmentKey, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = curatedListChipItem.id;
        }
        if ((i & 2) != 0) {
            str = curatedListChipItem.displayName;
        }
        if ((i & 4) != 0) {
            ownerType = curatedListChipItem.ownerType;
        }
        if ((i & 8) != 0) {
            sizedUrlHolder = curatedListChipItem.circleSizedUrlHolder;
        }
        if ((i & 16) != 0) {
            num = curatedListChipItem.iconDrawableRes;
        }
        if ((i & 32) != 0) {
            num2 = curatedListChipItem.itemCount;
        }
        if ((i & 64) != 0) {
            userInteractionEventDescriptor = curatedListChipItem.eventData;
        }
        if ((i & 128) != 0) {
            z = curatedListChipItem.isIconChip;
        }
        if ((i & 256) != 0) {
            z2 = curatedListChipItem.isBadged;
        }
        if ((i & 512) != 0) {
            fragmentKey = curatedListChipItem.fragmentKey;
        }
        if ((i & 1024) != 0) {
            z3 = curatedListChipItem.isClosable;
        }
        FragmentKey fragmentKey2 = fragmentKey;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        Integer num3 = num2;
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
        Integer num4 = num;
        ApiCuratedList.OwnerType ownerType2 = ownerType;
        return curatedListChipItem.copy(uuid, str, ownerType2, sizedUrlHolder, num4, num3, userInteractionEventDescriptor2, z5, z6, fragmentKey2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsClosable() {
        return this.isClosable;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCuratedList.OwnerType getOwnerType() {
        return this.ownerType;
    }

    /* renamed from: component4, reason: from getter */
    public final SizedUrlHolder getCircleSizedUrlHolder() {
        return this.circleSizedUrlHolder;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getItemCount() {
        return this.itemCount;
    }

    /* renamed from: component7, reason: from getter */
    public final UserInteractionEventDescriptor getEventData() {
        return this.eventData;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsIconChip() {
        return this.isIconChip;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBadged() {
        return this.isBadged;
    }

    public final CuratedListChipItem copy(UUID id, String displayName, ApiCuratedList.OwnerType ownerType, SizedUrlHolder circleSizedUrlHolder, Integer iconDrawableRes, Integer itemCount, UserInteractionEventDescriptor eventData, boolean isIconChip, boolean isBadged, FragmentKey fragmentKey, boolean isClosable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        return new CuratedListChipItem(id, displayName, ownerType, circleSizedUrlHolder, iconDrawableRes, itemCount, eventData, isIconChip, isBadged, fragmentKey, isClosable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListChipItem)) {
            return false;
        }
        CuratedListChipItem curatedListChipItem = (CuratedListChipItem) other;
        return Intrinsics.areEqual(this.id, curatedListChipItem.id) && Intrinsics.areEqual(this.displayName, curatedListChipItem.displayName) && this.ownerType == curatedListChipItem.ownerType && Intrinsics.areEqual(this.circleSizedUrlHolder, curatedListChipItem.circleSizedUrlHolder) && Intrinsics.areEqual(this.iconDrawableRes, curatedListChipItem.iconDrawableRes) && Intrinsics.areEqual(this.itemCount, curatedListChipItem.itemCount) && Intrinsics.areEqual(this.eventData, curatedListChipItem.eventData) && this.isIconChip == curatedListChipItem.isIconChip && this.isBadged == curatedListChipItem.isBadged && Intrinsics.areEqual(this.fragmentKey, curatedListChipItem.fragmentKey) && this.isClosable == curatedListChipItem.isClosable;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.ownerType.hashCode()) * 31;
        SizedUrlHolder sizedUrlHolder = this.circleSizedUrlHolder;
        int iHashCode2 = (iHashCode + (sizedUrlHolder == null ? 0 : sizedUrlHolder.hashCode())) * 31;
        Integer num = this.iconDrawableRes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserInteractionEventDescriptor userInteractionEventDescriptor = this.eventData;
        int iHashCode5 = (((((iHashCode4 + (userInteractionEventDescriptor == null ? 0 : userInteractionEventDescriptor.hashCode())) * 31) + Boolean.hashCode(this.isIconChip)) * 31) + Boolean.hashCode(this.isBadged)) * 31;
        FragmentKey fragmentKey = this.fragmentKey;
        return ((iHashCode5 + (fragmentKey != null ? fragmentKey.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClosable);
    }

    public String toString() {
        return "CuratedListChipItem(id=" + this.id + ", displayName=" + this.displayName + ", ownerType=" + this.ownerType + ", circleSizedUrlHolder=" + this.circleSizedUrlHolder + ", iconDrawableRes=" + this.iconDrawableRes + ", itemCount=" + this.itemCount + ", eventData=" + this.eventData + ", isIconChip=" + this.isIconChip + ", isBadged=" + this.isBadged + ", fragmentKey=" + this.fragmentKey + ", isClosable=" + this.isClosable + ")";
    }

    public CuratedListChipItem(UUID id, String displayName, ApiCuratedList.OwnerType ownerType, SizedUrlHolder sizedUrlHolder, Integer num, Integer num2, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, boolean z2, FragmentKey fragmentKey, boolean z3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        this.id = id;
        this.displayName = displayName;
        this.ownerType = ownerType;
        this.circleSizedUrlHolder = sizedUrlHolder;
        this.iconDrawableRes = num;
        this.itemCount = num2;
        this.eventData = userInteractionEventDescriptor;
        this.isIconChip = z;
        this.isBadged = z2;
        this.fragmentKey = fragmentKey;
        this.isClosable = z3;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ApiCuratedList.OwnerType getOwnerType() {
        return this.ownerType;
    }

    public final SizedUrlHolder getCircleSizedUrlHolder() {
        return this.circleSizedUrlHolder;
    }

    public final Integer getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    public final Integer getItemCount() {
        return this.itemCount;
    }

    public final UserInteractionEventDescriptor getEventData() {
        return this.eventData;
    }

    public final boolean isIconChip() {
        return this.isIconChip;
    }

    public final boolean isBadged() {
        return this.isBadged;
    }

    public /* synthetic */ CuratedListChipItem(UUID uuid, String str, ApiCuratedList.OwnerType ownerType, SizedUrlHolder sizedUrlHolder, Integer num, Integer num2, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, boolean z2, FragmentKey fragmentKey, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, ownerType, (i & 8) != 0 ? null : sizedUrlHolder, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : userInteractionEventDescriptor, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? new CuratedListKey.RhList(uuid, null, null, null, 14, null) : fragmentKey, (i & 1024) != 0 ? false : z3);
    }

    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    public final boolean isClosable() {
        return this.isClosable;
    }
}
