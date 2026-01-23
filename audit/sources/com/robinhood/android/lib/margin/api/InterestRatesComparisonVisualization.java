package com.robinhood.android.lib.margin.api;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterestRatesComparisonVisualization.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization;", "", "productMarketingContentfulId", "", "title", "charts", "", "Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Chart;", "legend", "Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend;Ljava/lang/String;)V", "getProductMarketingContentfulId", "()Ljava/lang/String;", "getTitle", "getCharts", "()Ljava/util/List;", "getLegend", "()Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend;", "getDisclosure", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Chart", "Legend", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InterestRatesComparisonVisualization {
    private final List<Chart> charts;
    private final String disclosure;
    private final Legend legend;
    private final String productMarketingContentfulId;
    private final String title;

    public static /* synthetic */ InterestRatesComparisonVisualization copy$default(InterestRatesComparisonVisualization interestRatesComparisonVisualization, String str, String str2, List list, Legend legend, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestRatesComparisonVisualization.productMarketingContentfulId;
        }
        if ((i & 2) != 0) {
            str2 = interestRatesComparisonVisualization.title;
        }
        if ((i & 4) != 0) {
            list = interestRatesComparisonVisualization.charts;
        }
        if ((i & 8) != 0) {
            legend = interestRatesComparisonVisualization.legend;
        }
        if ((i & 16) != 0) {
            str3 = interestRatesComparisonVisualization.disclosure;
        }
        String str4 = str3;
        List list2 = list;
        return interestRatesComparisonVisualization.copy(str, str2, list2, legend, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductMarketingContentfulId() {
        return this.productMarketingContentfulId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Chart> component3() {
        return this.charts;
    }

    /* renamed from: component4, reason: from getter */
    public final Legend getLegend() {
        return this.legend;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final InterestRatesComparisonVisualization copy(@Json(name = "product_marketing_contentful_id") String productMarketingContentfulId, String title, List<Chart> charts, Legend legend, String disclosure) {
        Intrinsics.checkNotNullParameter(productMarketingContentfulId, "productMarketingContentfulId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(legend, "legend");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        return new InterestRatesComparisonVisualization(productMarketingContentfulId, title, charts, legend, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestRatesComparisonVisualization)) {
            return false;
        }
        InterestRatesComparisonVisualization interestRatesComparisonVisualization = (InterestRatesComparisonVisualization) other;
        return Intrinsics.areEqual(this.productMarketingContentfulId, interestRatesComparisonVisualization.productMarketingContentfulId) && Intrinsics.areEqual(this.title, interestRatesComparisonVisualization.title) && Intrinsics.areEqual(this.charts, interestRatesComparisonVisualization.charts) && Intrinsics.areEqual(this.legend, interestRatesComparisonVisualization.legend) && Intrinsics.areEqual(this.disclosure, interestRatesComparisonVisualization.disclosure);
    }

    public int hashCode() {
        return (((((((this.productMarketingContentfulId.hashCode() * 31) + this.title.hashCode()) * 31) + this.charts.hashCode()) * 31) + this.legend.hashCode()) * 31) + this.disclosure.hashCode();
    }

    public String toString() {
        return "InterestRatesComparisonVisualization(productMarketingContentfulId=" + this.productMarketingContentfulId + ", title=" + this.title + ", charts=" + this.charts + ", legend=" + this.legend + ", disclosure=" + this.disclosure + ")";
    }

    public InterestRatesComparisonVisualization(@Json(name = "product_marketing_contentful_id") String productMarketingContentfulId, String title, List<Chart> charts, Legend legend, String disclosure) {
        Intrinsics.checkNotNullParameter(productMarketingContentfulId, "productMarketingContentfulId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(legend, "legend");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.productMarketingContentfulId = productMarketingContentfulId;
        this.title = title;
        this.charts = charts;
        this.legend = legend;
        this.disclosure = disclosure;
    }

    public final String getProductMarketingContentfulId() {
        return this.productMarketingContentfulId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Chart> getCharts() {
        return this.charts;
    }

    public final Legend getLegend() {
        return this.legend;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: InterestRatesComparisonVisualization.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Chart;", "", "identifier", "", "title", "description", "width", "", "regions", "", "Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Chart$Region;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "getDescription", "getWidth", "()F", "getRegions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Region", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Chart {
        private final String description;
        private final String identifier;
        private final List<Region> regions;
        private final String title;
        private final float width;

        public static /* synthetic */ Chart copy$default(Chart chart, String str, String str2, String str3, float f, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chart.identifier;
            }
            if ((i & 2) != 0) {
                str2 = chart.title;
            }
            if ((i & 4) != 0) {
                str3 = chart.description;
            }
            if ((i & 8) != 0) {
                f = chart.width;
            }
            if ((i & 16) != 0) {
                list = chart.regions;
            }
            List list2 = list;
            String str4 = str3;
            return chart.copy(str, str2, str4, f, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        public final List<Region> component5() {
            return this.regions;
        }

        public final Chart copy(String identifier, String title, String description, float width, List<Region> regions) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(regions, "regions");
            return new Chart(identifier, title, description, width, regions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chart)) {
                return false;
            }
            Chart chart = (Chart) other;
            return Intrinsics.areEqual(this.identifier, chart.identifier) && Intrinsics.areEqual(this.title, chart.title) && Intrinsics.areEqual(this.description, chart.description) && Float.compare(this.width, chart.width) == 0 && Intrinsics.areEqual(this.regions, chart.regions);
        }

        public int hashCode() {
            return (((((((this.identifier.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Float.hashCode(this.width)) * 31) + this.regions.hashCode();
        }

        public String toString() {
            return "Chart(identifier=" + this.identifier + ", title=" + this.title + ", description=" + this.description + ", width=" + this.width + ", regions=" + this.regions + ")";
        }

        public Chart(String identifier, String title, String description, float f, List<Region> regions) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(regions, "regions");
            this.identifier = identifier;
            this.title = title;
            this.description = description;
            this.width = f;
            this.regions = regions;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final float getWidth() {
            return this.width;
        }

        public final List<Region> getRegions() {
            return this.regions;
        }

        /* compiled from: InterestRatesComparisonVisualization.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Chart$Region;", "", "identifier", "", "weight", "", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "<init>", "(Ljava/lang/String;FLcom/robinhood/models/serverdriven/experimental/api/Color;)V", "getIdentifier", "()Ljava/lang/String;", "getWeight", "()F", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Region {
            private final Color color;
            private final String identifier;
            private final float weight;

            public static /* synthetic */ Region copy$default(Region region, String str, float f, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = region.identifier;
                }
                if ((i & 2) != 0) {
                    f = region.weight;
                }
                if ((i & 4) != 0) {
                    color = region.color;
                }
                return region.copy(str, f, color);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIdentifier() {
                return this.identifier;
            }

            /* renamed from: component2, reason: from getter */
            public final float getWeight() {
                return this.weight;
            }

            /* renamed from: component3, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            public final Region copy(String identifier, float weight, Color color) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(color, "color");
                return new Region(identifier, weight, color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Region)) {
                    return false;
                }
                Region region = (Region) other;
                return Intrinsics.areEqual(this.identifier, region.identifier) && Float.compare(this.weight, region.weight) == 0 && this.color == region.color;
            }

            public int hashCode() {
                return (((this.identifier.hashCode() * 31) + Float.hashCode(this.weight)) * 31) + this.color.hashCode();
            }

            public String toString() {
                return "Region(identifier=" + this.identifier + ", weight=" + this.weight + ", color=" + this.color + ")";
            }

            public Region(String identifier, float f, Color color) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(color, "color");
                this.identifier = identifier;
                this.weight = f;
                this.color = color;
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public final float getWeight() {
                return this.weight;
            }

            public final Color getColor() {
                return this.color;
            }
        }
    }

    /* compiled from: InterestRatesComparisonVisualization.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend;", "", "labels", "", "Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend$Label;", "<init>", "(Ljava/util/List;)V", "getLabels", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Label", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Legend {
        private final List<Label> labels;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Legend copy$default(Legend legend, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = legend.labels;
            }
            return legend.copy(list);
        }

        public final List<Label> component1() {
            return this.labels;
        }

        public final Legend copy(List<Label> labels) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            return new Legend(labels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Legend) && Intrinsics.areEqual(this.labels, ((Legend) other).labels);
        }

        public int hashCode() {
            return this.labels.hashCode();
        }

        public String toString() {
            return "Legend(labels=" + this.labels + ")";
        }

        public Legend(List<Label> labels) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            this.labels = labels;
        }

        public final List<Label> getLabels() {
            return this.labels;
        }

        /* compiled from: InterestRatesComparisonVisualization.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/InterestRatesComparisonVisualization$Legend$Label;", "", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "text", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Color;Ljava/lang/String;)V", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Label {
            private final Color color;
            private final String text;

            public static /* synthetic */ Label copy$default(Label label, Color color, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    color = label.color;
                }
                if ((i & 2) != 0) {
                    str = label.text;
                }
                return label.copy(color, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Label copy(Color color, String text) {
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(text, "text");
                return new Label(color, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Label)) {
                    return false;
                }
                Label label = (Label) other;
                return this.color == label.color && Intrinsics.areEqual(this.text, label.text);
            }

            public int hashCode() {
                return (this.color.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "Label(color=" + this.color + ", text=" + this.text + ")";
            }

            public Label(Color color, String text) {
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(text, "text");
                this.color = color;
                this.text = text;
            }

            public final Color getColor() {
                return this.color;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
