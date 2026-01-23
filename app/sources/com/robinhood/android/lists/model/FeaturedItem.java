package com.robinhood.android.lists.model;

import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.api.ApiCuratedList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeaturedItem.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/model/FeaturedItem;", "", "<init>", "()V", "Data", "Browse", "Lcom/robinhood/android/lists/model/FeaturedItem$Browse;", "Lcom/robinhood/android/lists/model/FeaturedItem$Data;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class FeaturedItem {
    public static final int $stable = 0;

    public /* synthetic */ FeaturedItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FeaturedItem() {
    }

    /* compiled from: FeaturedItem.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lists/model/FeaturedItem$Data;", "Lcom/robinhood/android/lists/model/FeaturedItem;", "id", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "displayName", "", "itemCount", "", "headerImages", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "backgroundColor", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Ljava/lang/String;ILcom/robinhood/lists/models/shared/db/SizedUrlHolder;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getDisplayName", "()Ljava/lang/String;", "getItemCount", "()I", "getHeaderImages", "()Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data extends FeaturedItem {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final String displayName;
        private final SizedUrlHolder headerImages;
        private final UUID id;
        private final int itemCount;
        private final ApiCuratedList.OwnerType ownerType;

        public static /* synthetic */ Data copy$default(Data data, UUID uuid, ApiCuratedList.OwnerType ownerType, String str, int i, SizedUrlHolder sizedUrlHolder, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = data.id;
            }
            if ((i2 & 2) != 0) {
                ownerType = data.ownerType;
            }
            if ((i2 & 4) != 0) {
                str = data.displayName;
            }
            if ((i2 & 8) != 0) {
                i = data.itemCount;
            }
            if ((i2 & 16) != 0) {
                sizedUrlHolder = data.headerImages;
            }
            if ((i2 & 32) != 0) {
                str2 = data.backgroundColor;
            }
            SizedUrlHolder sizedUrlHolder2 = sizedUrlHolder;
            String str3 = str2;
            return data.copy(uuid, ownerType, str, i, sizedUrlHolder2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component4, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        /* renamed from: component5, reason: from getter */
        public final SizedUrlHolder getHeaderImages() {
            return this.headerImages;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Data copy(UUID id, ApiCuratedList.OwnerType ownerType, String displayName, int itemCount, SizedUrlHolder headerImages, String backgroundColor) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(headerImages, "headerImages");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Data(id, ownerType, displayName, itemCount, headerImages, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.id, data.id) && this.ownerType == data.ownerType && Intrinsics.areEqual(this.displayName, data.displayName) && this.itemCount == data.itemCount && Intrinsics.areEqual(this.headerImages, data.headerImages) && Intrinsics.areEqual(this.backgroundColor, data.backgroundColor);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.ownerType.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.itemCount)) * 31) + this.headerImages.hashCode()) * 31) + this.backgroundColor.hashCode();
        }

        public String toString() {
            return "Data(id=" + this.id + ", ownerType=" + this.ownerType + ", displayName=" + this.displayName + ", itemCount=" + this.itemCount + ", headerImages=" + this.headerImages + ", backgroundColor=" + this.backgroundColor + ")";
        }

        public final UUID getId() {
            return this.id;
        }

        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final SizedUrlHolder getHeaderImages() {
            return this.headerImages;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(UUID id, ApiCuratedList.OwnerType ownerType, String displayName, int i, SizedUrlHolder headerImages, String backgroundColor) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(headerImages, "headerImages");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.id = id;
            this.ownerType = ownerType;
            this.displayName = displayName;
            this.itemCount = i;
            this.headerImages = headerImages;
            this.backgroundColor = backgroundColor;
        }
    }

    /* compiled from: FeaturedItem.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lists/model/FeaturedItem$Browse;", "Lcom/robinhood/android/lists/model/FeaturedItem;", "sectionId", "Ljava/util/UUID;", "firstUnseenListPosition", "", "<init>", "(Ljava/util/UUID;I)V", "getSectionId", "()Ljava/util/UUID;", "getFirstUnseenListPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Browse extends FeaturedItem {
        public static final int $stable = 8;
        private final int firstUnseenListPosition;
        private final UUID sectionId;

        public static /* synthetic */ Browse copy$default(Browse browse, UUID uuid, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = browse.sectionId;
            }
            if ((i2 & 2) != 0) {
                i = browse.firstUnseenListPosition;
            }
            return browse.copy(uuid, i);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getSectionId() {
            return this.sectionId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFirstUnseenListPosition() {
            return this.firstUnseenListPosition;
        }

        public final Browse copy(UUID sectionId, int firstUnseenListPosition) {
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            return new Browse(sectionId, firstUnseenListPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Browse)) {
                return false;
            }
            Browse browse = (Browse) other;
            return Intrinsics.areEqual(this.sectionId, browse.sectionId) && this.firstUnseenListPosition == browse.firstUnseenListPosition;
        }

        public int hashCode() {
            return (this.sectionId.hashCode() * 31) + Integer.hashCode(this.firstUnseenListPosition);
        }

        public String toString() {
            return "Browse(sectionId=" + this.sectionId + ", firstUnseenListPosition=" + this.firstUnseenListPosition + ")";
        }

        public final UUID getSectionId() {
            return this.sectionId;
        }

        public final int getFirstUnseenListPosition() {
            return this.firstUnseenListPosition;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Browse(UUID sectionId, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            this.sectionId = sectionId;
            this.firstUnseenListPosition = i;
        }
    }
}
