package com.robinhood.android.common.emojipicker;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CuratedListEmojiPickerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", "", "<init>", "()V", "Header", "Item", "ExpandFooter", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem$ExpandFooter;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem$Header;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem$Item;", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.emojipicker.UiEmojiItem, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class CuratedListEmojiPickerViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ CuratedListEmojiPickerViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CuratedListEmojiPickerViewState2() {
    }

    /* compiled from: CuratedListEmojiPickerViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/UiEmojiItem$Header;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.emojipicker.UiEmojiItem$Header, reason: from toString */
    public static final /* data */ class Header extends CuratedListEmojiPickerViewState2 {
        public static final int $stable = 0;
        private final String label;

        public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.label;
            }
            return header.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Header copy(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Header(label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && Intrinsics.areEqual(this.label, ((Header) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return "Header(label=" + this.label + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(String label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: CuratedListEmojiPickerViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/UiEmojiItem$Item;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "Lcom/robinhood/android/common/emojipicker/Emoji;", "<init>", "(Lcom/robinhood/android/common/emojipicker/Emoji;)V", "getEmoji", "()Lcom/robinhood/android/common/emojipicker/Emoji;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.emojipicker.UiEmojiItem$Item, reason: from toString */
    public static final /* data */ class Item extends CuratedListEmojiPickerViewState2 {
        public static final int $stable = 0;
        private final Emoji emoji;

        public static /* synthetic */ Item copy$default(Item item, Emoji emoji, int i, Object obj) {
            if ((i & 1) != 0) {
                emoji = item.emoji;
            }
            return item.copy(emoji);
        }

        /* renamed from: component1, reason: from getter */
        public final Emoji getEmoji() {
            return this.emoji;
        }

        public final Item copy(Emoji emoji) {
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            return new Item(emoji);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && Intrinsics.areEqual(this.emoji, ((Item) other).emoji);
        }

        public int hashCode() {
            return this.emoji.hashCode();
        }

        public String toString() {
            return "Item(emoji=" + this.emoji + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(Emoji emoji) {
            super(null);
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            this.emoji = emoji;
        }

        public final Emoji getEmoji() {
            return this.emoji;
        }
    }

    /* compiled from: CuratedListEmojiPickerViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/UiEmojiItem$ExpandFooter;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", "associatedSectionName", "", "<init>", "(Ljava/lang/String;)V", "getAssociatedSectionName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.emojipicker.UiEmojiItem$ExpandFooter, reason: from toString */
    public static final /* data */ class ExpandFooter extends CuratedListEmojiPickerViewState2 {
        public static final int $stable = 0;
        private final String associatedSectionName;

        public static /* synthetic */ ExpandFooter copy$default(ExpandFooter expandFooter, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = expandFooter.associatedSectionName;
            }
            return expandFooter.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssociatedSectionName() {
            return this.associatedSectionName;
        }

        public final ExpandFooter copy(String associatedSectionName) {
            Intrinsics.checkNotNullParameter(associatedSectionName, "associatedSectionName");
            return new ExpandFooter(associatedSectionName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpandFooter) && Intrinsics.areEqual(this.associatedSectionName, ((ExpandFooter) other).associatedSectionName);
        }

        public int hashCode() {
            return this.associatedSectionName.hashCode();
        }

        public String toString() {
            return "ExpandFooter(associatedSectionName=" + this.associatedSectionName + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpandFooter(String associatedSectionName) {
            super(null);
            Intrinsics.checkNotNullParameter(associatedSectionName, "associatedSectionName");
            this.associatedSectionName = associatedSectionName;
        }

        public final String getAssociatedSectionName() {
            return this.associatedSectionName;
        }
    }
}
