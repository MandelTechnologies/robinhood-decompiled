package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData;", "", "title", "", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "screenIdentifier", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData$Row;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosure", "getScreenIdentifier", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Row", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AssetClassBreakdownData {
    public static final int $stable = 0;
    private final String disclosure;
    private final ImmutableList<Row> rows;
    private final String screenIdentifier;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ AssetClassBreakdownData copy$default(AssetClassBreakdownData assetClassBreakdownData, String str, String str2, String str3, String str4, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetClassBreakdownData.title;
        }
        if ((i & 2) != 0) {
            str2 = assetClassBreakdownData.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = assetClassBreakdownData.disclosure;
        }
        if ((i & 8) != 0) {
            str4 = assetClassBreakdownData.screenIdentifier;
        }
        if ((i & 16) != 0) {
            immutableList = assetClassBreakdownData.rows;
        }
        ImmutableList immutableList2 = immutableList;
        String str5 = str3;
        return assetClassBreakdownData.copy(str, str2, str5, str4, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    public final ImmutableList<Row> component5() {
        return this.rows;
    }

    public final AssetClassBreakdownData copy(String title, String subtitle, String disclosure, String screenIdentifier, ImmutableList<Row> rows) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new AssetClassBreakdownData(title, subtitle, disclosure, screenIdentifier, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetClassBreakdownData)) {
            return false;
        }
        AssetClassBreakdownData assetClassBreakdownData = (AssetClassBreakdownData) other;
        return Intrinsics.areEqual(this.title, assetClassBreakdownData.title) && Intrinsics.areEqual(this.subtitle, assetClassBreakdownData.subtitle) && Intrinsics.areEqual(this.disclosure, assetClassBreakdownData.disclosure) && Intrinsics.areEqual(this.screenIdentifier, assetClassBreakdownData.screenIdentifier) && Intrinsics.areEqual(this.rows, assetClassBreakdownData.rows);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.screenIdentifier.hashCode()) * 31) + this.rows.hashCode();
    }

    public String toString() {
        return "AssetClassBreakdownData(title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ", screenIdentifier=" + this.screenIdentifier + ", rows=" + this.rows + ")";
    }

    public AssetClassBreakdownData(String title, String subtitle, String disclosure, String screenIdentifier, ImmutableList<Row> rows) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure = disclosure;
        this.screenIdentifier = screenIdentifier;
        this.rows = rows;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    public final ImmutableList<Row> getRows() {
        return this.rows;
    }

    /* compiled from: AdvisoryPortfolioRevealAssetBreakdownComposable.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AssetClassBreakdownData$Row;", "", "title", "", "allocationPercentage", "description", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAllocationPercentage", "getDescription", "getIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 0;
        private final String allocationPercentage;
        private final String description;
        private final String identifier;
        private final String title;

        public static /* synthetic */ Row copy$default(Row row, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.title;
            }
            if ((i & 2) != 0) {
                str2 = row.allocationPercentage;
            }
            if ((i & 4) != 0) {
                str3 = row.description;
            }
            if ((i & 8) != 0) {
                str4 = row.identifier;
            }
            return row.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAllocationPercentage() {
            return this.allocationPercentage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Row copy(String title, String allocationPercentage, String description, String identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allocationPercentage, "allocationPercentage");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new Row(title, allocationPercentage, description, identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.allocationPercentage, row.allocationPercentage) && Intrinsics.areEqual(this.description, row.description) && Intrinsics.areEqual(this.identifier, row.identifier);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.allocationPercentage.hashCode()) * 31) + this.description.hashCode()) * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "Row(title=" + this.title + ", allocationPercentage=" + this.allocationPercentage + ", description=" + this.description + ", identifier=" + this.identifier + ")";
        }

        public Row(String title, String allocationPercentage, String description, String identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allocationPercentage, "allocationPercentage");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.title = title;
            this.allocationPercentage = allocationPercentage;
            this.description = description;
            this.identifier = identifier;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getAllocationPercentage() {
            return this.allocationPercentage;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }
}
