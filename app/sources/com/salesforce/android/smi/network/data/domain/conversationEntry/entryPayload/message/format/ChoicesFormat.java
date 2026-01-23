package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChoicesFormat.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem;", "getOptionItems", "()Ljava/util/List;", "ChoicesFormatType", "QuickRepliesFormat", "DisplayableOptionsFormat", "CarouselFormat", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$CarouselFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$DisplayableOptionsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$QuickRepliesFormat;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ChoicesFormat extends MessageFormat {
    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
    ChoicesFormatType getFormatType();

    List<OptionItem> getOptionItems();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChoicesFormat.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType;", "", "<init>", "(Ljava/lang/String;I)V", "QuickReplies", "Buttons", "Carousel", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesFormatType implements MessageFormat.FormatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChoicesFormatType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChoicesFormatType QuickReplies = new ChoicesFormatType("QuickReplies", 0);
        public static final ChoicesFormatType Buttons = new ChoicesFormatType("Buttons", 1);
        public static final ChoicesFormatType Carousel = new ChoicesFormatType("Carousel", 2);

        private static final /* synthetic */ ChoicesFormatType[] $values() {
            return new ChoicesFormatType[]{QuickReplies, Buttons, Carousel};
        }

        public static EnumEntries<ChoicesFormatType> getEntries() {
            return $ENTRIES;
        }

        private ChoicesFormatType(String str, int i) {
        }

        static {
            ChoicesFormatType[] choicesFormatTypeArr$values = $values();
            $VALUES = choicesFormatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(choicesFormatTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ChoicesFormat.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "<init>", "()V", "enumValueOfOrNull", "name", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements MessageFormat.FormatType.EnumValueTypeHelper<ChoicesFormatType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat.FormatType.EnumValueTypeHelper
            public ChoicesFormatType enumValueOfOrNull(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                for (ChoicesFormatType choicesFormatType : ChoicesFormatType.values()) {
                    if (Intrinsics.areEqual(choicesFormatType.name(), name)) {
                        return choicesFormatType;
                    }
                }
                return null;
            }
        }

        public static ChoicesFormatType valueOf(String str) {
            return (ChoicesFormatType) Enum.valueOf(ChoicesFormatType.class, str);
        }

        public static ChoicesFormatType[] values() {
            return (ChoicesFormatType[]) $VALUES.clone();
        }
    }

    /* compiled from: ChoicesFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$QuickRepliesFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "text", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOptionItems", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class QuickRepliesFormat implements ChoicesFormat {
        private final ChoicesFormatType formatType;
        private final List<OptionItem.TypedOptionItem> optionItems;
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public QuickRepliesFormat(List<? extends OptionItem.TypedOptionItem> optionItems, String text) {
            Intrinsics.checkNotNullParameter(optionItems, "optionItems");
            Intrinsics.checkNotNullParameter(text, "text");
            this.optionItems = optionItems;
            this.text = text;
            this.formatType = ChoicesFormatType.QuickReplies;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat
        public List<OptionItem.TypedOptionItem> getOptionItems() {
            return this.optionItems;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public ChoicesFormatType getFormatType() {
            return this.formatType;
        }
    }

    /* compiled from: ChoicesFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$DisplayableOptionsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem;", "text", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOptionItems", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DisplayableOptionsFormat implements ChoicesFormat {
        private final ChoicesFormatType formatType;
        private final List<OptionItem.TypedOptionItem> optionItems;
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public DisplayableOptionsFormat(List<? extends OptionItem.TypedOptionItem> optionItems, String text) {
            Intrinsics.checkNotNullParameter(optionItems, "optionItems");
            Intrinsics.checkNotNullParameter(text, "text");
            this.optionItems = optionItems;
            this.text = text;
            this.formatType = ChoicesFormatType.Buttons;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat
        public List<OptionItem.TypedOptionItem> getOptionItems() {
            return this.optionItems;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public ChoicesFormatType getFormatType() {
            return this.formatType;
        }
    }

    /* compiled from: ChoicesFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$CarouselFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "items", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleItemWithInteractions;", "images", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$CarouselImage;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getImages", "optionItems", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "getOptionItems", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat$ChoicesFormatType;", "findImageByInteractionItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class CarouselFormat implements ChoicesFormat {
        private final ChoicesFormatType formatType;
        private final List<FileAsset.ImageAsset.CarouselImage> images;
        private final List<TitleItem.TitleItemWithInteractions> items;
        private final List<OptionItem.TypedOptionItem.TitleOptionItem> optionItems;

        public CarouselFormat(List<TitleItem.TitleItemWithInteractions> items, List<FileAsset.ImageAsset.CarouselImage> images) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(images, "images");
            this.items = items;
            this.images = images;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((TitleItem.TitleItemWithInteractions) it.next()).getInteractionItems());
            }
            this.optionItems = arrayList;
            this.formatType = ChoicesFormatType.Carousel;
        }

        public final List<TitleItem.TitleItemWithInteractions> getItems() {
            return this.items;
        }

        public final List<FileAsset.ImageAsset.CarouselImage> getImages() {
            return this.images;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat
        public List<OptionItem.TypedOptionItem.TitleOptionItem> getOptionItems() {
            return this.optionItems;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public ChoicesFormatType getFormatType() {
            return this.formatType;
        }

        public final FileAsset.ImageAsset.CarouselImage findImageByInteractionItem(TitleItem.TitleItemWithInteractions item) {
            Object next;
            Intrinsics.checkNotNullParameter(item, "item");
            Iterator<T> it = this.images.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((FileAsset.ImageAsset.CarouselImage) next).getId(), item.getTitleItem().getImageId())) {
                    break;
                }
            }
            return (FileAsset.ImageAsset.CarouselImage) next;
        }
    }
}
