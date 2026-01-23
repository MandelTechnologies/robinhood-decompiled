package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionItem.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem;", "", "optionId", "", "parentMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOptionId", "()Ljava/lang/String;", "getParentMessageId", "setParentMessageId", "(Ljava/lang/String;)V", "SelectionsOptionItem", "TypedOptionItem", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$SelectionsOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class OptionItem {
    private final String optionId;
    private transient String parentMessageId;

    public /* synthetic */ OptionItem(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private OptionItem(String str, String str2) {
        this.optionId = str;
        this.parentMessageId = str2;
    }

    public /* synthetic */ OptionItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, null);
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final void setParentMessageId(String str) {
        this.parentMessageId = str;
    }

    /* compiled from: OptionItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$SelectionsOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem;", "optionId", "", "parentEntryId", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SelectionsOptionItem extends OptionItem {
        private final transient String title;

        public /* synthetic */ SelectionsOptionItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectionsOptionItem(@Json(name = "optionIdentifier") String optionId, String str, String str2) {
            super(optionId, str, null);
            Intrinsics.checkNotNullParameter(optionId, "optionId");
            this.title = str2;
        }
    }

    /* compiled from: OptionItem.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem;", "optionId", "", "parentMessageId", "itemType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ItemType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ItemType;)V", "getItemType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ItemType;", "TitleOptionItem", "ParticipantClientMenuOptionItem", "ItemType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ParticipantClientMenuOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class TypedOptionItem extends OptionItem {
        private final ItemType itemType;

        public /* synthetic */ TypedOptionItem(String str, String str2, ItemType itemType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, itemType);
        }

        public /* synthetic */ TypedOptionItem(String str, String str2, ItemType itemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, itemType, null);
        }

        public final ItemType getItemType() {
            return this.itemType;
        }

        /* compiled from: OptionItem.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "optionId", "", "parentMessageId", "titleItem", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "optionValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;)V", "getTitleItem", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "getOptionValue", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class TitleOptionItem extends TypedOptionItem {
            private final transient TitleItem optionValue;
            private final TitleItem titleItem;

            public /* synthetic */ TitleOptionItem(String str, String str2, TitleItem titleItem, TitleItem titleItem2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, titleItem, (i & 8) != 0 ? titleItem : titleItem2);
            }

            public final TitleItem getTitleItem() {
                return this.titleItem;
            }

            public final TitleItem getOptionValue() {
                return this.optionValue;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TitleOptionItem(@Json(name = "optionIdentifier") String optionId, String str, TitleItem titleItem, TitleItem optionValue) {
                super(optionId, str, ItemType.TitleOptionItem, null);
                Intrinsics.checkNotNullParameter(optionId, "optionId");
                Intrinsics.checkNotNullParameter(titleItem, "titleItem");
                Intrinsics.checkNotNullParameter(optionValue, "optionValue");
                this.titleItem = titleItem;
                this.optionValue = optionValue;
            }
        }

        private TypedOptionItem(String str, String str2, ItemType itemType) {
            super(str, str2, null);
            this.itemType = itemType;
        }

        /* compiled from: OptionItem.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ParticipantClientMenuOptionItem;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "optionId", "", "parentMessageId", "title", "optionValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getOptionValue", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class ParticipantClientMenuOptionItem extends TypedOptionItem {
            private final transient String optionValue;
            private final String title;

            public /* synthetic */ ParticipantClientMenuOptionItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? str3 : str4);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getOptionValue() {
                return this.optionValue;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ParticipantClientMenuOptionItem(@Json(name = "optionIdentifier") String optionId, String str, String title, String optionValue) {
                super(optionId, str, ItemType.ParticipantClientMenuOptionItem, null);
                Intrinsics.checkNotNullParameter(optionId, "optionId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(optionValue, "optionValue");
                this.title = title;
                this.optionValue = optionValue;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OptionItem.kt */
        @JsonClass(generateAdapter = false)
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ItemType;", "", "<init>", "(Ljava/lang/String;I)V", "OptionItem", "TitleOptionItem", "ParticipantClientMenuOptionItem", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class ItemType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ItemType[] $VALUES;
            public static final ItemType OptionItem = new ItemType("OptionItem", 0);
            public static final ItemType TitleOptionItem = new ItemType("TitleOptionItem", 1);
            public static final ItemType ParticipantClientMenuOptionItem = new ItemType("ParticipantClientMenuOptionItem", 2);

            private static final /* synthetic */ ItemType[] $values() {
                return new ItemType[]{OptionItem, TitleOptionItem, ParticipantClientMenuOptionItem};
            }

            public static EnumEntries<ItemType> getEntries() {
                return $ENTRIES;
            }

            private ItemType(String str, int i) {
            }

            static {
                ItemType[] itemTypeArr$values = $values();
                $VALUES = itemTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(itemTypeArr$values);
            }

            public static ItemType valueOf(String str) {
                return (ItemType) Enum.valueOf(ItemType.class, str);
            }

            public static ItemType[] values() {
                return (ItemType[]) $VALUES.clone();
            }
        }
    }
}
