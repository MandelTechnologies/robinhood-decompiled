package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.advisory.dashboard.LoggingUtils2;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState3;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.ManagedAccountState2;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightContentViewModel;
import com.robinhood.models.advisory.p304db.insights.RemoteIcon;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InsightsRowStateProvider.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightContentViewModel;", "viewModel", "", "useV3Styling", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "getIcon", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightContentViewModel;Z)Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "j$/time/Instant", "createAt", "isRedesignEnabled", "", "formatTimeText", "(Lj$/time/Instant;ZZ)Ljava/lang/String;", "", "unseenCount", "", "impressionCount", "getChipText", "(ZIJLj$/time/Instant;)Ljava/lang/String;", "dataState", "reduce", "(Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDataState;)Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "Lj$/time/Clock;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InsightsRowStateProvider implements StateProvider<InsightsRowDataState, InsightsRowViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    public InsightsRowStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public InsightsRowViewState reduce(InsightsRowDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<AdvisoryInsight> unseenInsights = dataState.getUnseenInsights();
        Context contextBuildManagedAccountLoggingContext = (dataState.getBrokerageAccountType() == null || dataState.getAccountState() == null) ? null : LoggingUtils2.buildManagedAccountLoggingContext(dataState.getAccountState(), dataState.getBrokerageAccountType());
        if (unseenInsights == null) {
            return InsightsRowViewState.Loading.INSTANCE;
        }
        if (unseenInsights.isEmpty() || dataState.getBrokerageAccountType() == null || dataState.getAccountState() == null) {
            return new InsightsRowViewState.Empty(contextBuildManagedAccountLoggingContext, dataState.getInPortfolioDigestExperiment());
        }
        boolean zIsFunded = ManagedAccountState2.isFunded(dataState.getAccountState());
        if (dataState.getInPortfolioDigestExperiment()) {
            List<AdvisoryInsight> list = unseenInsights;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AdvisoryInsight advisoryInsight : list) {
                arrayList.add(new InsightsRowViewState2.StrategiesTeam(advisoryInsight.getContentViewModel().getDashboardHighlight().getTitle(), formatTimeText(advisoryInsight.getCreateAt(), zIsFunded, true), getIcon(advisoryInsight.getContentViewModel(), true), new InsightNavArg(advisoryInsight.getId(), advisoryInsight.getPageType()), advisoryInsight.getContentViewModel().getContentfulId()));
            }
            PortfolioDigest.HasOnboarded latestDigest = dataState.getLatestDigest();
            return new InsightsRowViewState.LoadedNewStyle(extensions2.toPersistentList(CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOfNotNull(latestDigest != null ? new InsightsRowViewState2.CortexInsight(latestDigest, formatTimeText(latestDigest.getUpdatedAt(), zIsFunded, true)) : null))), contextBuildManagedAccountLoggingContext);
        }
        AdvisoryInsight advisoryInsight2 = (AdvisoryInsight) CollectionsKt.first((List) unseenInsights);
        String title = advisoryInsight2.getContentViewModel().getDashboardHighlight().getTitle();
        InsightNavArg insightNavArg = new InsightNavArg(advisoryInsight2.getId(), advisoryInsight2.getPageType());
        List<AdvisoryInsight> list2 = unseenInsights;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AdvisoryInsight advisoryInsight3 : list2) {
            arrayList2.add(new InsightNavArg(advisoryInsight3.getId(), advisoryInsight3.getPageType()));
        }
        return new InsightsRowViewState.Loaded(title, formatTimeText(advisoryInsight2.getCreateAt(), zIsFunded, false), insightNavArg, arrayList2, 10, advisoryInsight2.getContentViewModel().getContentfulId(), zIsFunded, getChipText(zIsFunded, unseenInsights.size(), dataState.getImpressionCount(), advisoryInsight2.getCreateAt()), getIcon(advisoryInsight2.getContentViewModel(), false), contextBuildManagedAccountLoggingContext);
    }

    private final InsightsRowViewState3 getIcon(AdvisoryInsightContentViewModel viewModel, boolean useV3Styling) {
        InsightsRowViewState3.Background background;
        RemoteIcon remoteIcon = viewModel.getDashboardHighlight().getRemoteIcon();
        if (remoteIcon != null) {
            return new InsightsRowViewState3.Remote(remoteIcon.getLightUrl(), remoteIcon.getDarkUrl());
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(viewModel.getIconName());
        if (serverToBentoAssetMapper2FromServerValue == null || serverToBentoAssetMapper2FromServerValue == ServerToBentoAssetMapper2.UNKNOWN) {
            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.SPARKLE_DOUBLE_24;
        }
        if (useV3Styling) {
            background = InsightsRowViewState3.Background.GRADIENT;
        } else {
            background = InsightsRowViewState3.Background.IMAGE;
        }
        return new InsightsRowViewState3.Local(serverToBentoAssetMapper2FromServerValue, background);
    }

    private final String formatTimeText(Instant createAt, boolean isRedesignEnabled, boolean useV3Styling) {
        LocalDateFormatter localDateFormatter;
        String str = LocalDateFormatter.MEDIUM_WITHOUT_PADDING_NO_YEAR.format(Instants.toLocalDate$default(createAt, null, 1, null));
        if (isRedesignEnabled) {
            Duration durationBetween = Duration.between(createAt, Instant.now(this.clock));
            if (durationBetween.compareTo(Duration.ofMinutes(60L)) < 0) {
                return RangesKt.coerceAtLeast(durationBetween.toMinutes(), 1L) + "m ago";
            }
            if (durationBetween.compareTo(Duration.ofHours(24L)) < 0) {
                return durationBetween.toHours() + "h ago";
            }
            if (durationBetween.compareTo(Duration.ofDays(7L)) < 0) {
                if (useV3Styling) {
                    localDateFormatter = LocalDateFormatter.SHORT_WEEKDAY;
                } else {
                    localDateFormatter = LocalDateFormatter.WEEKDAY_ONLY;
                }
                return localDateFormatter.format(Instants.toLocalDate$default(createAt, null, 1, null));
            }
        }
        return str;
    }

    private final String getChipText(boolean isRedesignEnabled, int unseenCount, long impressionCount, Instant createAt) {
        if (!isRedesignEnabled) {
            return null;
        }
        boolean z = Duration.between(createAt, Instant.now(this.clock)).toDays() > 3;
        if (unseenCount > 5) {
            return "5+ unread";
        }
        if (unseenCount > 1) {
            return unseenCount + " unread";
        }
        if (unseenCount == 1 && impressionCount == 0 && z) {
            return "1 unread";
        }
        if (unseenCount != 1 || impressionCount >= 3) {
            return null;
        }
        return "New";
    }
}
