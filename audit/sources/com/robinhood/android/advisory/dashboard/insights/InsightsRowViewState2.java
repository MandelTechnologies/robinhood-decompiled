package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState3;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsightsRowViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;", "", "title", "", "getTitle", "()Ljava/lang/String;", "formattedTimeText", "getFormattedTimeText", "icon", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "getIcon", "()Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "StrategiesTeam", "CortexInsight", "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData$CortexInsight;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData$StrategiesTeam;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightCardData, reason: use source file name */
/* loaded from: classes7.dex */
public interface InsightsRowViewState2 {
    String getFormattedTimeText();

    InsightsRowViewState3 getIcon();

    String getTitle();

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData$StrategiesTeam;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;", "title", "", "formattedTimeText", "icon", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "navArg", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "contentfulId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;Lcom/robinhood/android/advisory/contracts/InsightNavArg;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getFormattedTimeText", "getIcon", "()Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "getNavArg", "()Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "getContentfulId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightCardData$StrategiesTeam, reason: from toString */
    public static final /* data */ class StrategiesTeam implements InsightsRowViewState2 {
        public static final int $stable = 0;
        private final String contentfulId;
        private final String formattedTimeText;
        private final InsightsRowViewState3 icon;
        private final InsightNavArg navArg;
        private final String title;

        public static /* synthetic */ StrategiesTeam copy$default(StrategiesTeam strategiesTeam, String str, String str2, InsightsRowViewState3 insightsRowViewState3, InsightNavArg insightNavArg, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = strategiesTeam.title;
            }
            if ((i & 2) != 0) {
                str2 = strategiesTeam.formattedTimeText;
            }
            if ((i & 4) != 0) {
                insightsRowViewState3 = strategiesTeam.icon;
            }
            if ((i & 8) != 0) {
                insightNavArg = strategiesTeam.navArg;
            }
            if ((i & 16) != 0) {
                str3 = strategiesTeam.contentfulId;
            }
            String str4 = str3;
            InsightsRowViewState3 insightsRowViewState32 = insightsRowViewState3;
            return strategiesTeam.copy(str, str2, insightsRowViewState32, insightNavArg, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        /* renamed from: component3, reason: from getter */
        public final InsightsRowViewState3 getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final InsightNavArg getNavArg() {
            return this.navArg;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final StrategiesTeam copy(String title, String formattedTimeText, InsightsRowViewState3 icon, InsightNavArg navArg, String contentfulId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(navArg, "navArg");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            return new StrategiesTeam(title, formattedTimeText, icon, navArg, contentfulId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategiesTeam)) {
                return false;
            }
            StrategiesTeam strategiesTeam = (StrategiesTeam) other;
            return Intrinsics.areEqual(this.title, strategiesTeam.title) && Intrinsics.areEqual(this.formattedTimeText, strategiesTeam.formattedTimeText) && Intrinsics.areEqual(this.icon, strategiesTeam.icon) && Intrinsics.areEqual(this.navArg, strategiesTeam.navArg) && Intrinsics.areEqual(this.contentfulId, strategiesTeam.contentfulId);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.formattedTimeText.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.navArg.hashCode()) * 31) + this.contentfulId.hashCode();
        }

        public String toString() {
            return "StrategiesTeam(title=" + this.title + ", formattedTimeText=" + this.formattedTimeText + ", icon=" + this.icon + ", navArg=" + this.navArg + ", contentfulId=" + this.contentfulId + ")";
        }

        public StrategiesTeam(String title, String formattedTimeText, InsightsRowViewState3 icon, InsightNavArg navArg, String contentfulId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(navArg, "navArg");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            this.title = title;
            this.formattedTimeText = formattedTimeText;
            this.icon = icon;
            this.navArg = navArg;
            this.contentfulId = contentfulId;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public InsightsRowViewState3 getIcon() {
            return this.icon;
        }

        public final InsightNavArg getNavArg() {
            return this.navArg;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData$CortexInsight;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "formattedTimeText", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "getFormattedTimeText", "()Ljava/lang/String;", "title", "getTitle", "icon", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "getIcon", "()Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightCardData$CortexInsight, reason: from toString */
    public static final /* data */ class CortexInsight implements InsightsRowViewState2 {
        public static final int $stable = 0;
        private final PortfolioDigest.HasOnboarded digest;
        private final String formattedTimeText;

        public static /* synthetic */ CortexInsight copy$default(CortexInsight cortexInsight, PortfolioDigest.HasOnboarded hasOnboarded, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hasOnboarded = cortexInsight.digest;
            }
            if ((i & 2) != 0) {
                str = cortexInsight.formattedTimeText;
            }
            return cortexInsight.copy(hasOnboarded, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        public final CortexInsight copy(PortfolioDigest.HasOnboarded digest, String formattedTimeText) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            return new CortexInsight(digest, formattedTimeText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CortexInsight)) {
                return false;
            }
            CortexInsight cortexInsight = (CortexInsight) other;
            return Intrinsics.areEqual(this.digest, cortexInsight.digest) && Intrinsics.areEqual(this.formattedTimeText, cortexInsight.formattedTimeText);
        }

        public int hashCode() {
            return (this.digest.hashCode() * 31) + this.formattedTimeText.hashCode();
        }

        public String toString() {
            return "CortexInsight(digest=" + this.digest + ", formattedTimeText=" + this.formattedTimeText + ")";
        }

        public CortexInsight(PortfolioDigest.HasOnboarded digest, String formattedTimeText) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            this.digest = digest;
            this.formattedTimeText = formattedTimeText;
        }

        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public String getTitle() {
            return this.digest.getPreview().getTitle();
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2
        public InsightsRowViewState3 getIcon() {
            return new InsightsRowViewState3.Local(ServerToBentoAssetMapper2.CORTEX_16, InsightsRowViewState3.Background.BG2);
        }
    }
}
