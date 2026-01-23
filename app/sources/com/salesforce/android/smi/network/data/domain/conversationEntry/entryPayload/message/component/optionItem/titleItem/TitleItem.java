package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TitleItem.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "", "title", "", "subTitle", "itemType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemType;)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getItemType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemType;", "DefaultTitleItem", "TitleLinkItem", "TitleImageItem", "TitleItemWithInteractions", "TitleItemType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleImageItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleLinkItem;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class TitleItem {
    private final TitleItemType itemType;
    private final String subTitle;
    private final String title;

    public /* synthetic */ TitleItem(String str, String str2, TitleItemType titleItemType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, titleItemType);
    }

    private TitleItem(String str, String str2, TitleItemType titleItemType) {
        this.title = str;
        this.subTitle = str2;
        this.itemType = titleItemType;
    }

    public /* synthetic */ TitleItem(String str, String str2, TitleItemType titleItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, titleItemType, null);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final TitleItemType getItemType() {
        return this.itemType;
    }

    /* compiled from: TitleItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "title", "", "subTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultTitleItem extends TitleItem {
        public /* synthetic */ DefaultTitleItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultTitleItem(String title, String str) {
            super(title, str, TitleItemType.TitleItem, null);
            Intrinsics.checkNotNullParameter(title, "title");
        }
    }

    /* compiled from: TitleItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleLinkItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "title", "", "subTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TitleLinkItem extends TitleItem {
        public /* synthetic */ TitleLinkItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleLinkItem(String title, String str) {
            super(title, str, TitleItemType.TitleLinkItem, null);
            Intrinsics.checkNotNullParameter(title, "title");
        }
    }

    /* compiled from: TitleItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleImageItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "imageId", "", "title", "subTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageId", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TitleImageItem extends TitleItem {
        private final String imageId;

        public /* synthetic */ TitleImageItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String getImageId() {
            return this.imageId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleImageItem(String imageId, String title, String str) {
            super(title, str, TitleItemType.TitleImageItem, null);
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.imageId = imageId;
        }
    }

    /* compiled from: TitleItem.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemWithInteractions;", "", "titleItem", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleImageItem;", "interactionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleImageItem;Ljava/util/List;)V", "getTitleItem", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleImageItem;", "getInteractionItems", "()Ljava/util/List;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TitleItemWithInteractions {
        private final List<OptionItem.TypedOptionItem.TitleOptionItem> interactionItems;
        private final TitleImageItem titleItem;

        public TitleItemWithInteractions(TitleImageItem titleItem, List<OptionItem.TypedOptionItem.TitleOptionItem> interactionItems) {
            Intrinsics.checkNotNullParameter(titleItem, "titleItem");
            Intrinsics.checkNotNullParameter(interactionItems, "interactionItems");
            this.titleItem = titleItem;
            this.interactionItems = interactionItems;
        }

        public final TitleImageItem getTitleItem() {
            return this.titleItem;
        }

        public final List<OptionItem.TypedOptionItem.TitleOptionItem> getInteractionItems() {
            return this.interactionItems;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TitleItem.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemType;", "", "<init>", "(Ljava/lang/String;I)V", "TitleItem", "TitleLinkItem", "TitleImageItem", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TitleItemType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TitleItemType[] $VALUES;
        public static final TitleItemType TitleItem = new TitleItemType("TitleItem", 0);
        public static final TitleItemType TitleLinkItem = new TitleItemType("TitleLinkItem", 1);
        public static final TitleItemType TitleImageItem = new TitleItemType("TitleImageItem", 2);

        private static final /* synthetic */ TitleItemType[] $values() {
            return new TitleItemType[]{TitleItem, TitleLinkItem, TitleImageItem};
        }

        public static EnumEntries<TitleItemType> getEntries() {
            return $ENTRIES;
        }

        private TitleItemType(String str, int i) {
        }

        static {
            TitleItemType[] titleItemTypeArr$values = $values();
            $VALUES = titleItemTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(titleItemTypeArr$values);
        }

        public static TitleItemType valueOf(String str) {
            return (TitleItemType) Enum.valueOf(TitleItemType.class, str);
        }

        public static TitleItemType[] values() {
            return (TitleItemType[]) $VALUES.clone();
        }
    }
}
