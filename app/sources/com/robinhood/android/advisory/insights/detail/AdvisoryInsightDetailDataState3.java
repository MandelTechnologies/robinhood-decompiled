package com.robinhood.android.advisory.insights.detail;

import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState3;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAsset;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAudio;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAudioMux;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightContentViewModel;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightPostContentCta;
import com.robinhood.models.advisory.p304db.insights.TwoBarChartComparisonDetails;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AdvisoryInsightDetailDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "<init>", "()V", "reduce", "dataState", "getAssetUiModel", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "asset", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset;", "performanceChartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getTwoBarChartModel", "Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;", "chartDetails", "Lcom/robinhood/models/advisory/db/insights/TwoBarChartComparisonDetails;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailStateProvider, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailDataState3 implements StateProvider<AdvisoryInsightDetailDataState, AdvisoryInsightDetailViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdvisoryInsightDetailViewState reduce(AdvisoryInsightDetailDataState dataState) {
        AdvisoryInsightContentViewModel advisoryInsightContentViewModel;
        AdvisoryInsightDetailViewState2 advisoryInsightDetailViewState2;
        AdvisoryInsightAudioMux mux;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AdvisoryInsight insight = dataState.getInsight();
        if ((insight != null ? insight.getContentViewModel() : null) != null) {
            AdvisoryInsightContentViewModel contentViewModel = dataState.getInsight().getContentViewModel();
            if (contentViewModel == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AdvisoryInsightAudio audio = contentViewModel.getAudio();
            String url = (audio == null || (mux = audio.getMux()) == null) ? null : mux.getUrl();
            AdvisoryInsight.AdvisoryInsightType insightType = dataState.getInsight().getInsightType();
            List<String> contentMarkdownLines = contentViewModel.getContentMarkdownLines();
            String disclosureMarkdown = contentViewModel.getDisclosureMarkdown();
            String str = DateTimeFormatter.ofPattern("MMMM d, yyyy").format(Instants.toLocalDate$default(dataState.getInsight().getCreateAt(), null, 1, null));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            AdvisoryInsightPostContentCta postContentCta = contentViewModel.getPostContentCta();
            NavButtonsVisibility navButtonsVisibilityComputeNavButtons = AdvisoryInsightDetailDataState2.computeNavButtons(dataState);
            int currentInsightIndex = dataState.getCurrentInsightIndex();
            String contentfulId = contentViewModel.getContentfulId();
            AdvisoryInsightDetailViewState3 assetUiModel = getAssetUiModel(contentViewModel.getAsset(), dataState.getPerformanceChartModel());
            String id = dataState.getInsight().getId();
            AdvisoryInsight.PageType pageType = dataState.getInsight().getPageType();
            AdvisoryInsight.PageType pageType2 = AdvisoryInsight.PageType.MULTI_PAGE_CHILD;
            if (pageType == pageType2) {
                advisoryInsightContentViewModel = contentViewModel;
                MultiPageNavigationState multiPageNavigationState = dataState.getTotalMultiPageCount() > 1 ? new MultiPageNavigationState(dataState.getCurrentMultiPageIndex(), dataState.getTotalMultiPageCount()) : null;
                if (dataState.getInsight().getPageType() != pageType2 && url != null) {
                    advisoryInsightDetailViewState2 = AdvisoryInsightDetailViewState2.TOP_BAR;
                } else if (url == null) {
                    advisoryInsightDetailViewState2 = AdvisoryInsightDetailViewState2.BOTTOM_CTA;
                } else {
                    advisoryInsightDetailViewState2 = AdvisoryInsightDetailViewState2.NONE;
                }
                return new AdvisoryInsightDetailViewState.Loaded(insightType, contentMarkdownLines, disclosureMarkdown, url, str, assetUiModel, postContentCta, navButtonsVisibilityComputeNavButtons, currentInsightIndex, contentfulId, id, multiPageNavigationState, advisoryInsightDetailViewState2, dataState.getInsight().getPageType() == pageType2, advisoryInsightContentViewModel.getPrimaryCta(), advisoryInsightContentViewModel.getTopLineText());
            }
            advisoryInsightContentViewModel = contentViewModel;
            if (dataState.getInsight().getPageType() != pageType2) {
                if (url == null) {
                }
            }
            return new AdvisoryInsightDetailViewState.Loaded(insightType, contentMarkdownLines, disclosureMarkdown, url, str, assetUiModel, postContentCta, navButtonsVisibilityComputeNavButtons, currentInsightIndex, contentfulId, id, multiPageNavigationState, advisoryInsightDetailViewState2, dataState.getInsight().getPageType() == pageType2, advisoryInsightContentViewModel.getPrimaryCta(), advisoryInsightContentViewModel.getTopLineText());
        }
        return AdvisoryInsightDetailViewState.Loading.INSTANCE;
    }

    private final AdvisoryInsightDetailViewState3 getAssetUiModel(AdvisoryInsightAsset asset, PerformanceChartModel performanceChartModel) {
        if (asset == null) {
            return null;
        }
        if (asset instanceof AdvisoryInsightAsset.Image) {
            return new AdvisoryInsightDetailViewState3.Image(((AdvisoryInsightAsset.Image) asset).getUrl());
        }
        if (asset instanceof AdvisoryInsightAsset.Video) {
            AdvisoryInsightAsset.Video video = (AdvisoryInsightAsset.Video) asset;
            return new AdvisoryInsightDetailViewState3.Video(video.getLightModeMp4Url(), video.getDarkModeMp4Url());
        }
        if (asset instanceof AdvisoryInsightAsset.PerformanceChart) {
            if (performanceChartModel != null) {
                return new AdvisoryInsightDetailViewState3.PerformanceChart(performanceChartModel);
            }
            return null;
        }
        if (asset instanceof AdvisoryInsightAsset.TwoBarChartComparison) {
            return new AdvisoryInsightDetailViewState3.TwoBarChart(getTwoBarChartModel(((AdvisoryInsightAsset.TwoBarChartComparison) asset).getComparisonDetails()));
        }
        if (asset instanceof AdvisoryInsightAsset.ReturnsChart) {
            return new AdvisoryInsightDetailViewState3.ReturnsChart((AdvisoryInsightAsset.ReturnsChart) asset);
        }
        return null;
    }

    private final TwoBarChartModel getTwoBarChartModel(TwoBarChartComparisonDetails chartDetails) {
        BigDecimal bigDecimal;
        if (chartDetails.getOldValue().compareTo(chartDetails.getNewValue()) < 0) {
            BigDecimal oldValue = chartDetails.getOldValue();
            BigDecimal newValue = chartDetails.getNewValue();
            bigDecimal = Intrinsics.areEqual(newValue, BigDecimal.ZERO) ? null : newValue;
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ONE;
            }
            return new TwoBarChartModel(chartDetails, BigDecimals7.safeDivide$default(oldValue, bigDecimal, 2, null, 4, null).floatValue(), 1.0f);
        }
        BigDecimal newValue2 = chartDetails.getNewValue();
        BigDecimal oldValue2 = chartDetails.getOldValue();
        bigDecimal = Intrinsics.areEqual(oldValue2, BigDecimal.ZERO) ? null : oldValue2;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ONE;
        }
        return new TwoBarChartModel(chartDetails, 1.0f, BigDecimals7.safeDivide$default(newValue2, bigDecimal, 2, null, 4, null).floatValue());
    }
}
