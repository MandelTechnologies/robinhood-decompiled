package com.robinhood.android.advisory.withdrawal;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FullWithdrawalSummary.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "", "title", "", "subtitle", "breakdown", "", "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;", "amountReceived", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBreakdown", "()Ljava/util/List;", "getAmountReceived", "()Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;", "getDisclosure", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "BottomSheetData", "Item", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FullWithdrawalSummary {
    public static final int $stable = 8;
    private final Item amountReceived;
    private final List<Item> breakdown;
    private final String disclosure;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ FullWithdrawalSummary copy$default(FullWithdrawalSummary fullWithdrawalSummary, String str, String str2, List list, Item item, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullWithdrawalSummary.title;
        }
        if ((i & 2) != 0) {
            str2 = fullWithdrawalSummary.subtitle;
        }
        if ((i & 4) != 0) {
            list = fullWithdrawalSummary.breakdown;
        }
        if ((i & 8) != 0) {
            item = fullWithdrawalSummary.amountReceived;
        }
        if ((i & 16) != 0) {
            str3 = fullWithdrawalSummary.disclosure;
        }
        String str4 = str3;
        List list2 = list;
        return fullWithdrawalSummary.copy(str, str2, list2, item, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Item> component3() {
        return this.breakdown;
    }

    /* renamed from: component4, reason: from getter */
    public final Item getAmountReceived() {
        return this.amountReceived;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final FullWithdrawalSummary copy(String title, String subtitle, List<Item> breakdown, Item amountReceived, String disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        return new FullWithdrawalSummary(title, subtitle, breakdown, amountReceived, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullWithdrawalSummary)) {
            return false;
        }
        FullWithdrawalSummary fullWithdrawalSummary = (FullWithdrawalSummary) other;
        return Intrinsics.areEqual(this.title, fullWithdrawalSummary.title) && Intrinsics.areEqual(this.subtitle, fullWithdrawalSummary.subtitle) && Intrinsics.areEqual(this.breakdown, fullWithdrawalSummary.breakdown) && Intrinsics.areEqual(this.amountReceived, fullWithdrawalSummary.amountReceived) && Intrinsics.areEqual(this.disclosure, fullWithdrawalSummary.disclosure);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.breakdown.hashCode()) * 31;
        Item item = this.amountReceived;
        return ((iHashCode + (item == null ? 0 : item.hashCode())) * 31) + this.disclosure.hashCode();
    }

    public String toString() {
        return "FullWithdrawalSummary(title=" + this.title + ", subtitle=" + this.subtitle + ", breakdown=" + this.breakdown + ", amountReceived=" + this.amountReceived + ", disclosure=" + this.disclosure + ")";
    }

    public FullWithdrawalSummary(String title, String subtitle, List<Item> breakdown, Item item, String disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.title = title;
        this.subtitle = subtitle;
        this.breakdown = breakdown;
        this.amountReceived = item;
        this.disclosure = disclosure;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Item> getBreakdown() {
        return this.breakdown;
    }

    public final Item getAmountReceived() {
        return this.amountReceived;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: FullWithdrawalSummary.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;", "", "title", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BottomSheetData {
        public static final int $stable = 0;
        private final String content;
        private final String title;

        public static /* synthetic */ BottomSheetData copy$default(BottomSheetData bottomSheetData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bottomSheetData.title;
            }
            if ((i & 2) != 0) {
                str2 = bottomSheetData.content;
            }
            return bottomSheetData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final BottomSheetData copy(String title, String content) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            return new BottomSheetData(title, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheetData)) {
                return false;
            }
            BottomSheetData bottomSheetData = (BottomSheetData) other;
            return Intrinsics.areEqual(this.title, bottomSheetData.title) && Intrinsics.areEqual(this.content, bottomSheetData.content);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "BottomSheetData(title=" + this.title + ", content=" + this.content + ")";
        }

        public BottomSheetData(String title, String content) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            this.title = title;
            this.content = content;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getContent() {
            return this.content;
        }
    }

    /* compiled from: FullWithdrawalSummary.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;", "", "title", "", "value", "bottomSheet", "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getBottomSheet", "()Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final BottomSheetData bottomSheet;
        private final String title;
        private final String value;

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, BottomSheetData bottomSheetData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.title;
            }
            if ((i & 2) != 0) {
                str2 = item.value;
            }
            if ((i & 4) != 0) {
                bottomSheetData = item.bottomSheet;
            }
            return item.copy(str, str2, bottomSheetData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final BottomSheetData getBottomSheet() {
            return this.bottomSheet;
        }

        public final Item copy(String title, String value, BottomSheetData bottomSheet) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Item(title, value, bottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.value, item.value) && Intrinsics.areEqual(this.bottomSheet, item.bottomSheet);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.value.hashCode()) * 31;
            BottomSheetData bottomSheetData = this.bottomSheet;
            return iHashCode + (bottomSheetData == null ? 0 : bottomSheetData.hashCode());
        }

        public String toString() {
            return "Item(title=" + this.title + ", value=" + this.value + ", bottomSheet=" + this.bottomSheet + ")";
        }

        public Item(String title, String value, BottomSheetData bottomSheetData) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.title = title;
            this.value = value;
            this.bottomSheet = bottomSheetData;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getValue() {
            return this.value;
        }

        public final BottomSheetData getBottomSheet() {
            return this.bottomSheet;
        }
    }
}
