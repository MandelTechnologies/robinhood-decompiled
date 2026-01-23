package com.robinhood.android.advisory.insights.detail;

import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "", "Image", "Video", "PerformanceChart", "TwoBarChart", "ReturnsChart", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$Image;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$PerformanceChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$ReturnsChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$TwoBarChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$Video;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryInsightDetailViewState3 {

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$Image;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel$Image, reason: from toString */
    public static final /* data */ class Image implements AdvisoryInsightDetailViewState3 {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ Image copy$default(Image image, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.url;
            }
            return image.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Image copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Image(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Image) && Intrinsics.areEqual(this.url, ((Image) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "Image(url=" + this.url + ")";
        }

        public Image(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$Video;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "lightModeMp4Url", "", "darkModeMp4Url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLightModeMp4Url", "()Ljava/lang/String;", "getDarkModeMp4Url", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel$Video, reason: from toString */
    public static final /* data */ class Video implements AdvisoryInsightDetailViewState3 {
        public static final int $stable = 0;
        private final String darkModeMp4Url;
        private final String lightModeMp4Url;

        public static /* synthetic */ Video copy$default(Video video, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = video.lightModeMp4Url;
            }
            if ((i & 2) != 0) {
                str2 = video.darkModeMp4Url;
            }
            return video.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLightModeMp4Url() {
            return this.lightModeMp4Url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDarkModeMp4Url() {
            return this.darkModeMp4Url;
        }

        public final Video copy(String lightModeMp4Url, String darkModeMp4Url) {
            Intrinsics.checkNotNullParameter(lightModeMp4Url, "lightModeMp4Url");
            Intrinsics.checkNotNullParameter(darkModeMp4Url, "darkModeMp4Url");
            return new Video(lightModeMp4Url, darkModeMp4Url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.areEqual(this.lightModeMp4Url, video.lightModeMp4Url) && Intrinsics.areEqual(this.darkModeMp4Url, video.darkModeMp4Url);
        }

        public int hashCode() {
            return (this.lightModeMp4Url.hashCode() * 31) + this.darkModeMp4Url.hashCode();
        }

        public String toString() {
            return "Video(lightModeMp4Url=" + this.lightModeMp4Url + ", darkModeMp4Url=" + this.darkModeMp4Url + ")";
        }

        public Video(String lightModeMp4Url, String darkModeMp4Url) {
            Intrinsics.checkNotNullParameter(lightModeMp4Url, "lightModeMp4Url");
            Intrinsics.checkNotNullParameter(darkModeMp4Url, "darkModeMp4Url");
            this.lightModeMp4Url = lightModeMp4Url;
            this.darkModeMp4Url = darkModeMp4Url;
        }

        public final String getLightModeMp4Url() {
            return this.lightModeMp4Url;
        }

        public final String getDarkModeMp4Url() {
            return this.darkModeMp4Url;
        }
    }

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$PerformanceChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartModel;)V", "getChartModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel$PerformanceChart, reason: from toString */
    public static final /* data */ class PerformanceChart implements AdvisoryInsightDetailViewState3 {
        public static final int $stable = 8;
        private final PerformanceChartModel chartModel;

        public static /* synthetic */ PerformanceChart copy$default(PerformanceChart performanceChart, PerformanceChartModel performanceChartModel, int i, Object obj) {
            if ((i & 1) != 0) {
                performanceChartModel = performanceChart.chartModel;
            }
            return performanceChart.copy(performanceChartModel);
        }

        /* renamed from: component1, reason: from getter */
        public final PerformanceChartModel getChartModel() {
            return this.chartModel;
        }

        public final PerformanceChart copy(PerformanceChartModel chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            return new PerformanceChart(chartModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PerformanceChart) && Intrinsics.areEqual(this.chartModel, ((PerformanceChart) other).chartModel);
        }

        public int hashCode() {
            return this.chartModel.hashCode();
        }

        public String toString() {
            return "PerformanceChart(chartModel=" + this.chartModel + ")";
        }

        public PerformanceChart(PerformanceChartModel chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            this.chartModel = chartModel;
        }

        public final PerformanceChartModel getChartModel() {
            return this.chartModel;
        }
    }

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$TwoBarChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "chartModel", "Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;", "<init>", "(Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;)V", "getChartModel", "()Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel$TwoBarChart, reason: from toString */
    public static final /* data */ class TwoBarChart implements AdvisoryInsightDetailViewState3 {
        public static final int $stable = 8;
        private final TwoBarChartModel chartModel;

        public static /* synthetic */ TwoBarChart copy$default(TwoBarChart twoBarChart, TwoBarChartModel twoBarChartModel, int i, Object obj) {
            if ((i & 1) != 0) {
                twoBarChartModel = twoBarChart.chartModel;
            }
            return twoBarChart.copy(twoBarChartModel);
        }

        /* renamed from: component1, reason: from getter */
        public final TwoBarChartModel getChartModel() {
            return this.chartModel;
        }

        public final TwoBarChart copy(TwoBarChartModel chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            return new TwoBarChart(chartModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TwoBarChart) && Intrinsics.areEqual(this.chartModel, ((TwoBarChart) other).chartModel);
        }

        public int hashCode() {
            return this.chartModel.hashCode();
        }

        public String toString() {
            return "TwoBarChart(chartModel=" + this.chartModel + ")";
        }

        public TwoBarChart(TwoBarChartModel chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            this.chartModel = chartModel;
        }

        public final TwoBarChartModel getChartModel() {
            return this.chartModel;
        }
    }

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel$ReturnsChart;", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "chartModel", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset$ReturnsChart;", "<init>", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset$ReturnsChart;)V", "getChartModel", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset$ReturnsChart;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAssetUiModel$ReturnsChart, reason: from toString */
    public static final /* data */ class ReturnsChart implements AdvisoryInsightDetailViewState3 {
        public static final int $stable = 8;
        private final AdvisoryInsightAsset.ReturnsChart chartModel;

        public static /* synthetic */ ReturnsChart copy$default(ReturnsChart returnsChart, AdvisoryInsightAsset.ReturnsChart returnsChart2, int i, Object obj) {
            if ((i & 1) != 0) {
                returnsChart2 = returnsChart.chartModel;
            }
            return returnsChart.copy(returnsChart2);
        }

        /* renamed from: component1, reason: from getter */
        public final AdvisoryInsightAsset.ReturnsChart getChartModel() {
            return this.chartModel;
        }

        public final ReturnsChart copy(AdvisoryInsightAsset.ReturnsChart chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            return new ReturnsChart(chartModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReturnsChart) && Intrinsics.areEqual(this.chartModel, ((ReturnsChart) other).chartModel);
        }

        public int hashCode() {
            return this.chartModel.hashCode();
        }

        public String toString() {
            return "ReturnsChart(chartModel=" + this.chartModel + ")";
        }

        public ReturnsChart(AdvisoryInsightAsset.ReturnsChart chartModel) {
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            this.chartModel = chartModel;
        }

        public final AdvisoryInsightAsset.ReturnsChart getChartModel() {
            return this.chartModel;
        }
    }
}
