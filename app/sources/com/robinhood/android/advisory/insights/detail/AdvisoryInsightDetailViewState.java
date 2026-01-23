package com.robinhood.android.advisory.insights.detail;

import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightCta;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightPostContentCta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loaded;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loading;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryInsightDetailViewState {

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loading;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisoryInsightDetailViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 2009485237;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisoryInsightDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010F\u001a\u00020\u0017HÆ\u0003J\t\u0010G\u001a\u00020\u0019HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J½\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010K\u001a\u00020\u00192\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0011HÖ\u0001J\t\u0010O\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loaded;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "insightType", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;", "contentMarkdown", "", "", "disclosureMarkdown", "audioUrl", "formattedDate", "assetUiModel", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "postContentCta", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightPostContentCta;", "navButtonsVisibility", "Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;", "currentInsightIndex", "", "contentfulId", "insightId", "multiPageNavigationState", "Lcom/robinhood/android/advisory/insights/detail/MultiPageNavigationState;", "audioButtonPosition", "Lcom/robinhood/android/advisory/insights/detail/AudioButtonPosition;", "showListButton", "", "primaryCta", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightCta;", "topLineText", "<init>", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightPostContentCta;Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/insights/detail/MultiPageNavigationState;Lcom/robinhood/android/advisory/insights/detail/AudioButtonPosition;ZLcom/robinhood/models/advisory/db/insights/AdvisoryInsightCta;Ljava/lang/String;)V", "getInsightType", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight$AdvisoryInsightType;", "getContentMarkdown", "()Ljava/util/List;", "getDisclosureMarkdown", "()Ljava/lang/String;", "getAudioUrl", "getFormattedDate", "getAssetUiModel", "()Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "getPostContentCta", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightPostContentCta;", "getNavButtonsVisibility", "()Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;", "getCurrentInsightIndex", "()I", "getContentfulId", "getInsightId", "getMultiPageNavigationState", "()Lcom/robinhood/android/advisory/insights/detail/MultiPageNavigationState;", "getAudioButtonPosition", "()Lcom/robinhood/android/advisory/insights/detail/AudioButtonPosition;", "getShowListButton", "()Z", "getPrimaryCta", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightCta;", "getTopLineText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "", "hashCode", "toString", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisoryInsightDetailViewState {
        public static final int $stable = 8;
        private final AdvisoryInsightDetailViewState3 assetUiModel;
        private final AdvisoryInsightDetailViewState2 audioButtonPosition;
        private final String audioUrl;
        private final List<String> contentMarkdown;
        private final String contentfulId;
        private final int currentInsightIndex;
        private final String disclosureMarkdown;
        private final String formattedDate;
        private final String insightId;
        private final AdvisoryInsight.AdvisoryInsightType insightType;
        private final MultiPageNavigationState multiPageNavigationState;
        private final NavButtonsVisibility navButtonsVisibility;
        private final AdvisoryInsightPostContentCta postContentCta;
        private final AdvisoryInsightCta primaryCta;
        private final boolean showListButton;
        private final String topLineText;

        /* renamed from: component1, reason: from getter */
        public final AdvisoryInsight.AdvisoryInsightType getInsightType() {
            return this.insightType;
        }

        /* renamed from: component10, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getInsightId() {
            return this.insightId;
        }

        /* renamed from: component12, reason: from getter */
        public final MultiPageNavigationState getMultiPageNavigationState() {
            return this.multiPageNavigationState;
        }

        /* renamed from: component13, reason: from getter */
        public final AdvisoryInsightDetailViewState2 getAudioButtonPosition() {
            return this.audioButtonPosition;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShowListButton() {
            return this.showListButton;
        }

        /* renamed from: component15, reason: from getter */
        public final AdvisoryInsightCta getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTopLineText() {
            return this.topLineText;
        }

        public final List<String> component2() {
            return this.contentMarkdown;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAudioUrl() {
            return this.audioUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFormattedDate() {
            return this.formattedDate;
        }

        /* renamed from: component6, reason: from getter */
        public final AdvisoryInsightDetailViewState3 getAssetUiModel() {
            return this.assetUiModel;
        }

        /* renamed from: component7, reason: from getter */
        public final AdvisoryInsightPostContentCta getPostContentCta() {
            return this.postContentCta;
        }

        /* renamed from: component8, reason: from getter */
        public final NavButtonsVisibility getNavButtonsVisibility() {
            return this.navButtonsVisibility;
        }

        /* renamed from: component9, reason: from getter */
        public final int getCurrentInsightIndex() {
            return this.currentInsightIndex;
        }

        public final Loaded copy(AdvisoryInsight.AdvisoryInsightType insightType, List<String> contentMarkdown, String disclosureMarkdown, String audioUrl, String formattedDate, AdvisoryInsightDetailViewState3 assetUiModel, AdvisoryInsightPostContentCta postContentCta, NavButtonsVisibility navButtonsVisibility, int currentInsightIndex, String contentfulId, String insightId, MultiPageNavigationState multiPageNavigationState, AdvisoryInsightDetailViewState2 audioButtonPosition, boolean showListButton, AdvisoryInsightCta primaryCta, String topLineText) {
            Intrinsics.checkNotNullParameter(insightType, "insightType");
            Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            Intrinsics.checkNotNullParameter(navButtonsVisibility, "navButtonsVisibility");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            Intrinsics.checkNotNullParameter(insightId, "insightId");
            Intrinsics.checkNotNullParameter(audioButtonPosition, "audioButtonPosition");
            return new Loaded(insightType, contentMarkdown, disclosureMarkdown, audioUrl, formattedDate, assetUiModel, postContentCta, navButtonsVisibility, currentInsightIndex, contentfulId, insightId, multiPageNavigationState, audioButtonPosition, showListButton, primaryCta, topLineText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.insightType == loaded.insightType && Intrinsics.areEqual(this.contentMarkdown, loaded.contentMarkdown) && Intrinsics.areEqual(this.disclosureMarkdown, loaded.disclosureMarkdown) && Intrinsics.areEqual(this.audioUrl, loaded.audioUrl) && Intrinsics.areEqual(this.formattedDate, loaded.formattedDate) && Intrinsics.areEqual(this.assetUiModel, loaded.assetUiModel) && Intrinsics.areEqual(this.postContentCta, loaded.postContentCta) && Intrinsics.areEqual(this.navButtonsVisibility, loaded.navButtonsVisibility) && this.currentInsightIndex == loaded.currentInsightIndex && Intrinsics.areEqual(this.contentfulId, loaded.contentfulId) && Intrinsics.areEqual(this.insightId, loaded.insightId) && Intrinsics.areEqual(this.multiPageNavigationState, loaded.multiPageNavigationState) && this.audioButtonPosition == loaded.audioButtonPosition && this.showListButton == loaded.showListButton && Intrinsics.areEqual(this.primaryCta, loaded.primaryCta) && Intrinsics.areEqual(this.topLineText, loaded.topLineText);
        }

        public int hashCode() {
            int iHashCode = ((this.insightType.hashCode() * 31) + this.contentMarkdown.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.audioUrl;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.formattedDate.hashCode()) * 31;
            AdvisoryInsightDetailViewState3 advisoryInsightDetailViewState3 = this.assetUiModel;
            int iHashCode4 = (iHashCode3 + (advisoryInsightDetailViewState3 == null ? 0 : advisoryInsightDetailViewState3.hashCode())) * 31;
            AdvisoryInsightPostContentCta advisoryInsightPostContentCta = this.postContentCta;
            int iHashCode5 = (((((((((iHashCode4 + (advisoryInsightPostContentCta == null ? 0 : advisoryInsightPostContentCta.hashCode())) * 31) + this.navButtonsVisibility.hashCode()) * 31) + Integer.hashCode(this.currentInsightIndex)) * 31) + this.contentfulId.hashCode()) * 31) + this.insightId.hashCode()) * 31;
            MultiPageNavigationState multiPageNavigationState = this.multiPageNavigationState;
            int iHashCode6 = (((((iHashCode5 + (multiPageNavigationState == null ? 0 : multiPageNavigationState.hashCode())) * 31) + this.audioButtonPosition.hashCode()) * 31) + Boolean.hashCode(this.showListButton)) * 31;
            AdvisoryInsightCta advisoryInsightCta = this.primaryCta;
            int iHashCode7 = (iHashCode6 + (advisoryInsightCta == null ? 0 : advisoryInsightCta.hashCode())) * 31;
            String str3 = this.topLineText;
            return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(insightType=" + this.insightType + ", contentMarkdown=" + this.contentMarkdown + ", disclosureMarkdown=" + this.disclosureMarkdown + ", audioUrl=" + this.audioUrl + ", formattedDate=" + this.formattedDate + ", assetUiModel=" + this.assetUiModel + ", postContentCta=" + this.postContentCta + ", navButtonsVisibility=" + this.navButtonsVisibility + ", currentInsightIndex=" + this.currentInsightIndex + ", contentfulId=" + this.contentfulId + ", insightId=" + this.insightId + ", multiPageNavigationState=" + this.multiPageNavigationState + ", audioButtonPosition=" + this.audioButtonPosition + ", showListButton=" + this.showListButton + ", primaryCta=" + this.primaryCta + ", topLineText=" + this.topLineText + ")";
        }

        public Loaded(AdvisoryInsight.AdvisoryInsightType insightType, List<String> contentMarkdown, String str, String str2, String formattedDate, AdvisoryInsightDetailViewState3 advisoryInsightDetailViewState3, AdvisoryInsightPostContentCta advisoryInsightPostContentCta, NavButtonsVisibility navButtonsVisibility, int i, String contentfulId, String insightId, MultiPageNavigationState multiPageNavigationState, AdvisoryInsightDetailViewState2 audioButtonPosition, boolean z, AdvisoryInsightCta advisoryInsightCta, String str3) {
            Intrinsics.checkNotNullParameter(insightType, "insightType");
            Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            Intrinsics.checkNotNullParameter(navButtonsVisibility, "navButtonsVisibility");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            Intrinsics.checkNotNullParameter(insightId, "insightId");
            Intrinsics.checkNotNullParameter(audioButtonPosition, "audioButtonPosition");
            this.insightType = insightType;
            this.contentMarkdown = contentMarkdown;
            this.disclosureMarkdown = str;
            this.audioUrl = str2;
            this.formattedDate = formattedDate;
            this.assetUiModel = advisoryInsightDetailViewState3;
            this.postContentCta = advisoryInsightPostContentCta;
            this.navButtonsVisibility = navButtonsVisibility;
            this.currentInsightIndex = i;
            this.contentfulId = contentfulId;
            this.insightId = insightId;
            this.multiPageNavigationState = multiPageNavigationState;
            this.audioButtonPosition = audioButtonPosition;
            this.showListButton = z;
            this.primaryCta = advisoryInsightCta;
            this.topLineText = str3;
        }

        public final AdvisoryInsight.AdvisoryInsightType getInsightType() {
            return this.insightType;
        }

        public final List<String> getContentMarkdown() {
            return this.contentMarkdown;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final String getAudioUrl() {
            return this.audioUrl;
        }

        public final String getFormattedDate() {
            return this.formattedDate;
        }

        public final AdvisoryInsightDetailViewState3 getAssetUiModel() {
            return this.assetUiModel;
        }

        public final AdvisoryInsightPostContentCta getPostContentCta() {
            return this.postContentCta;
        }

        public final NavButtonsVisibility getNavButtonsVisibility() {
            return this.navButtonsVisibility;
        }

        public final int getCurrentInsightIndex() {
            return this.currentInsightIndex;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final String getInsightId() {
            return this.insightId;
        }

        public final MultiPageNavigationState getMultiPageNavigationState() {
            return this.multiPageNavigationState;
        }

        public final AdvisoryInsightDetailViewState2 getAudioButtonPosition() {
            return this.audioButtonPosition;
        }

        public final boolean getShowListButton() {
            return this.showListButton;
        }

        public final AdvisoryInsightCta getPrimaryCta() {
            return this.primaryCta;
        }

        public final String getTopLineText() {
            return this.topLineText;
        }
    }
}
