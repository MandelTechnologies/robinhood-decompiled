package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InsightsRowViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "showDivider", "", "getShowDivider", "()Z", "Loading", "Empty", "Loaded", "LoadedNewStyle", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Empty;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$LoadedNewStyle;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Loading;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface InsightsRowViewState {
    Context getEventContext();

    boolean getShowDivider();

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Loading;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "<init>", "()V", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements InsightsRowViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public Context getEventContext() {
            return null;
        }

        public int hashCode() {
            return -1087821197;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public boolean getShowDivider() {
            return DefaultImpls.getShowDivider(this);
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Empty;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "useNewStyling", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getUseNewStyling", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements InsightsRowViewState {
        public static final int $stable = 8;
        private final Context eventContext;
        private final boolean useNewStyling;

        public static /* synthetic */ Empty copy$default(Empty empty, Context context, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                context = empty.eventContext;
            }
            if ((i & 2) != 0) {
                z = empty.useNewStyling;
            }
            return empty.copy(context, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseNewStyling() {
            return this.useNewStyling;
        }

        public final Empty copy(Context eventContext, boolean useNewStyling) {
            return new Empty(eventContext, useNewStyling);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.areEqual(this.eventContext, empty.eventContext) && this.useNewStyling == empty.useNewStyling;
        }

        public int hashCode() {
            Context context = this.eventContext;
            return ((context == null ? 0 : context.hashCode()) * 31) + Boolean.hashCode(this.useNewStyling);
        }

        public String toString() {
            return "Empty(eventContext=" + this.eventContext + ", useNewStyling=" + this.useNewStyling + ")";
        }

        public Empty(Context context, boolean z) {
            this.eventContext = context;
            this.useNewStyling = z;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public boolean getShowDivider() {
            return DefaultImpls.getShowDivider(this);
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public Context getEventContext() {
            return this.eventContext;
        }

        public final boolean getUseNewStyling() {
            return this.useNewStyling;
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jw\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "title", "", "formattedTimeText", "currentInsight", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "unseenInsights", "", "pageSize", "", "contentfulId", "isRedesignEnabled", "", "chipText", "icon", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/contracts/InsightNavArg;Ljava/util/List;ILjava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getTitle", "()Ljava/lang/String;", "getFormattedTimeText", "getCurrentInsight", "()Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "getUnseenInsights", "()Ljava/util/List;", "getPageSize", "()I", "getContentfulId", "()Z", "getChipText", "getIcon", "()Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InsightsRowViewState {
        public static final int $stable = 8;
        private final String chipText;
        private final String contentfulId;
        private final InsightNavArg currentInsight;
        private final Context eventContext;
        private final String formattedTimeText;
        private final InsightsRowViewState3 icon;
        private final boolean isRedesignEnabled;
        private final int pageSize;
        private final String title;
        private final List<InsightNavArg> unseenInsights;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, InsightNavArg insightNavArg, List list, int i, String str3, boolean z, String str4, InsightsRowViewState3 insightsRowViewState3, Context context, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loaded.title;
            }
            if ((i2 & 2) != 0) {
                str2 = loaded.formattedTimeText;
            }
            if ((i2 & 4) != 0) {
                insightNavArg = loaded.currentInsight;
            }
            if ((i2 & 8) != 0) {
                list = loaded.unseenInsights;
            }
            if ((i2 & 16) != 0) {
                i = loaded.pageSize;
            }
            if ((i2 & 32) != 0) {
                str3 = loaded.contentfulId;
            }
            if ((i2 & 64) != 0) {
                z = loaded.isRedesignEnabled;
            }
            if ((i2 & 128) != 0) {
                str4 = loaded.chipText;
            }
            if ((i2 & 256) != 0) {
                insightsRowViewState3 = loaded.icon;
            }
            if ((i2 & 512) != 0) {
                context = loaded.eventContext;
            }
            InsightsRowViewState3 insightsRowViewState32 = insightsRowViewState3;
            Context context2 = context;
            boolean z2 = z;
            String str5 = str4;
            int i3 = i;
            String str6 = str3;
            return loaded.copy(str, str2, insightNavArg, list, i3, str6, z2, str5, insightsRowViewState32, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        /* renamed from: component3, reason: from getter */
        public final InsightNavArg getCurrentInsight() {
            return this.currentInsight;
        }

        public final List<InsightNavArg> component4() {
            return this.unseenInsights;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsRedesignEnabled() {
            return this.isRedesignEnabled;
        }

        /* renamed from: component8, reason: from getter */
        public final String getChipText() {
            return this.chipText;
        }

        /* renamed from: component9, reason: from getter */
        public final InsightsRowViewState3 getIcon() {
            return this.icon;
        }

        public final Loaded copy(String title, String formattedTimeText, InsightNavArg currentInsight, List<InsightNavArg> unseenInsights, int pageSize, String contentfulId, boolean isRedesignEnabled, String chipText, InsightsRowViewState3 icon, Context eventContext) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            Intrinsics.checkNotNullParameter(currentInsight, "currentInsight");
            Intrinsics.checkNotNullParameter(unseenInsights, "unseenInsights");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Loaded(title, formattedTimeText, currentInsight, unseenInsights, pageSize, contentfulId, isRedesignEnabled, chipText, icon, eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.formattedTimeText, loaded.formattedTimeText) && Intrinsics.areEqual(this.currentInsight, loaded.currentInsight) && Intrinsics.areEqual(this.unseenInsights, loaded.unseenInsights) && this.pageSize == loaded.pageSize && Intrinsics.areEqual(this.contentfulId, loaded.contentfulId) && this.isRedesignEnabled == loaded.isRedesignEnabled && Intrinsics.areEqual(this.chipText, loaded.chipText) && Intrinsics.areEqual(this.icon, loaded.icon) && Intrinsics.areEqual(this.eventContext, loaded.eventContext);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.title.hashCode() * 31) + this.formattedTimeText.hashCode()) * 31) + this.currentInsight.hashCode()) * 31) + this.unseenInsights.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.contentfulId.hashCode()) * 31) + Boolean.hashCode(this.isRedesignEnabled)) * 31;
            String str = this.chipText;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.icon.hashCode()) * 31;
            Context context = this.eventContext;
            return iHashCode2 + (context != null ? context.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", formattedTimeText=" + this.formattedTimeText + ", currentInsight=" + this.currentInsight + ", unseenInsights=" + this.unseenInsights + ", pageSize=" + this.pageSize + ", contentfulId=" + this.contentfulId + ", isRedesignEnabled=" + this.isRedesignEnabled + ", chipText=" + this.chipText + ", icon=" + this.icon + ", eventContext=" + this.eventContext + ")";
        }

        public Loaded(String title, String formattedTimeText, InsightNavArg currentInsight, List<InsightNavArg> unseenInsights, int i, String contentfulId, boolean z, String str, InsightsRowViewState3 icon, Context context) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(formattedTimeText, "formattedTimeText");
            Intrinsics.checkNotNullParameter(currentInsight, "currentInsight");
            Intrinsics.checkNotNullParameter(unseenInsights, "unseenInsights");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.formattedTimeText = formattedTimeText;
            this.currentInsight = currentInsight;
            this.unseenInsights = unseenInsights;
            this.pageSize = i;
            this.contentfulId = contentfulId;
            this.isRedesignEnabled = z;
            this.chipText = str;
            this.icon = icon;
            this.eventContext = context;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public boolean getShowDivider() {
            return DefaultImpls.getShowDivider(this);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getFormattedTimeText() {
            return this.formattedTimeText;
        }

        public final InsightNavArg getCurrentInsight() {
            return this.currentInsight;
        }

        public final List<InsightNavArg> getUnseenInsights() {
            return this.unseenInsights;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final boolean isRedesignEnabled() {
            return this.isRedesignEnabled;
        }

        public final String getChipText() {
            return this.chipText;
        }

        public final InsightsRowViewState3 getIcon() {
            return this.icon;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public Context getEventContext() {
            return this.eventContext;
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState$LoadedNewStyle;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;", "cards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getCards", "()Lkotlinx/collections/immutable/ImmutableList;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadedNewStyle implements InsightsRowViewState {
        public static final int $stable = 8;
        private final ImmutableList<InsightsRowViewState2> cards;
        private final Context eventContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadedNewStyle copy$default(LoadedNewStyle loadedNewStyle, ImmutableList immutableList, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = loadedNewStyle.cards;
            }
            if ((i & 2) != 0) {
                context = loadedNewStyle.eventContext;
            }
            return loadedNewStyle.copy(immutableList, context);
        }

        public final ImmutableList<InsightsRowViewState2> component1() {
            return this.cards;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        public final LoadedNewStyle copy(ImmutableList<? extends InsightsRowViewState2> cards, Context eventContext) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            return new LoadedNewStyle(cards, eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedNewStyle)) {
                return false;
            }
            LoadedNewStyle loadedNewStyle = (LoadedNewStyle) other;
            return Intrinsics.areEqual(this.cards, loadedNewStyle.cards) && Intrinsics.areEqual(this.eventContext, loadedNewStyle.eventContext);
        }

        public int hashCode() {
            int iHashCode = this.cards.hashCode() * 31;
            Context context = this.eventContext;
            return iHashCode + (context == null ? 0 : context.hashCode());
        }

        public String toString() {
            return "LoadedNewStyle(cards=" + this.cards + ", eventContext=" + this.eventContext + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoadedNewStyle(ImmutableList<? extends InsightsRowViewState2> cards, Context context) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            this.cards = cards;
            this.eventContext = context;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public boolean getShowDivider() {
            return DefaultImpls.getShowDivider(this);
        }

        public final ImmutableList<InsightsRowViewState2> getCards() {
            return this.cards;
        }

        @Override // com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState
        public Context getEventContext() {
            return this.eventContext;
        }
    }

    /* compiled from: InsightsRowViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getShowDivider(InsightsRowViewState insightsRowViewState) {
            if (insightsRowViewState instanceof Empty) {
                return !((Empty) insightsRowViewState).getUseNewStyling();
            }
            if (insightsRowViewState instanceof LoadedNewStyle) {
                return false;
            }
            if ((insightsRowViewState instanceof Loaded) || (insightsRowViewState instanceof Loading)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
