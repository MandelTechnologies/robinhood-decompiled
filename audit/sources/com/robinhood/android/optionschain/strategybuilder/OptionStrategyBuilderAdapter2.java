package com.robinhood.android.optionschain.strategybuilder;

import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter;
import com.robinhood.models.api.strategybuilder.StrategyBuilderOptionsLevel;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.models.api.strategybuilder.StrategyBuilderStrategyCardState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyBuilderAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "", "viewType", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderAdapter$ViewType;", "<init>", "(Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderAdapter$ViewType;)V", "getViewType", "()Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderAdapter$ViewType;", "HeaderData", "TitleData", "SubtitleData", "StrategyCardData", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$HeaderData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$SubtitleData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$TitleData;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.strategybuilder.BuilderData, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionStrategyBuilderAdapter2 {
    public static final int $stable = 0;
    private final OptionStrategyBuilderAdapter.ViewType viewType;

    public /* synthetic */ OptionStrategyBuilderAdapter2(OptionStrategyBuilderAdapter.ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType);
    }

    private OptionStrategyBuilderAdapter2(OptionStrategyBuilderAdapter.ViewType viewType) {
        this.viewType = viewType;
    }

    public final OptionStrategyBuilderAdapter.ViewType getViewType() {
        return this.viewType;
    }

    /* compiled from: OptionStrategyBuilderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$HeaderData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "chainIdsForLogging", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "sentiments", "", "Lcom/robinhood/models/db/OptionStrategyBuilder$SentimentFilter;", "selectedSentiment", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "uiOptionChains", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;Ljava/util/List;Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;Lkotlinx/collections/immutable/ImmutableList;)V", "getChainIdsForLogging", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSentiments", "()Ljava/util/List;", "getSelectedSentiment", "()Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "getUiOptionChains", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.strategybuilder.BuilderData$HeaderData, reason: from toString */
    public static final /* data */ class HeaderData extends OptionStrategyBuilderAdapter2 {
        public static final int $stable = 8;
        private final String chainIdsForLogging;
        private final Instrument instrument;
        private final StrategyBuilderSentiment selectedSentiment;
        private final List<OptionStrategyBuilder.SentimentFilter> sentiments;
        private final ImmutableList<UiOptionChain> uiOptionChains;

        public static /* synthetic */ HeaderData copy$default(HeaderData headerData, String str, Instrument instrument, List list, StrategyBuilderSentiment strategyBuilderSentiment, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerData.chainIdsForLogging;
            }
            if ((i & 2) != 0) {
                instrument = headerData.instrument;
            }
            if ((i & 4) != 0) {
                list = headerData.sentiments;
            }
            if ((i & 8) != 0) {
                strategyBuilderSentiment = headerData.selectedSentiment;
            }
            if ((i & 16) != 0) {
                immutableList = headerData.uiOptionChains;
            }
            ImmutableList immutableList2 = immutableList;
            List list2 = list;
            return headerData.copy(str, instrument, list2, strategyBuilderSentiment, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChainIdsForLogging() {
            return this.chainIdsForLogging;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final List<OptionStrategyBuilder.SentimentFilter> component3() {
            return this.sentiments;
        }

        /* renamed from: component4, reason: from getter */
        public final StrategyBuilderSentiment getSelectedSentiment() {
            return this.selectedSentiment;
        }

        public final ImmutableList<UiOptionChain> component5() {
            return this.uiOptionChains;
        }

        public final HeaderData copy(String chainIdsForLogging, Instrument instrument, List<OptionStrategyBuilder.SentimentFilter> sentiments, StrategyBuilderSentiment selectedSentiment, ImmutableList<UiOptionChain> uiOptionChains) {
            Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
            Intrinsics.checkNotNullParameter(sentiments, "sentiments");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            return new HeaderData(chainIdsForLogging, instrument, sentiments, selectedSentiment, uiOptionChains);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderData)) {
                return false;
            }
            HeaderData headerData = (HeaderData) other;
            return Intrinsics.areEqual(this.chainIdsForLogging, headerData.chainIdsForLogging) && Intrinsics.areEqual(this.instrument, headerData.instrument) && Intrinsics.areEqual(this.sentiments, headerData.sentiments) && this.selectedSentiment == headerData.selectedSentiment && Intrinsics.areEqual(this.uiOptionChains, headerData.uiOptionChains);
        }

        public int hashCode() {
            int iHashCode = this.chainIdsForLogging.hashCode() * 31;
            Instrument instrument = this.instrument;
            int iHashCode2 = (((iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31) + this.sentiments.hashCode()) * 31;
            StrategyBuilderSentiment strategyBuilderSentiment = this.selectedSentiment;
            return ((iHashCode2 + (strategyBuilderSentiment != null ? strategyBuilderSentiment.hashCode() : 0)) * 31) + this.uiOptionChains.hashCode();
        }

        public String toString() {
            return "HeaderData(chainIdsForLogging=" + this.chainIdsForLogging + ", instrument=" + this.instrument + ", sentiments=" + this.sentiments + ", selectedSentiment=" + this.selectedSentiment + ", uiOptionChains=" + this.uiOptionChains + ")";
        }

        public final String getChainIdsForLogging() {
            return this.chainIdsForLogging;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final List<OptionStrategyBuilder.SentimentFilter> getSentiments() {
            return this.sentiments;
        }

        public final StrategyBuilderSentiment getSelectedSentiment() {
            return this.selectedSentiment;
        }

        public final ImmutableList<UiOptionChain> getUiOptionChains() {
            return this.uiOptionChains;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderData(String chainIdsForLogging, Instrument instrument, List<OptionStrategyBuilder.SentimentFilter> sentiments, StrategyBuilderSentiment strategyBuilderSentiment, ImmutableList<UiOptionChain> uiOptionChains) {
            super(OptionStrategyBuilderAdapter.ViewType.VIEW_TYPE_HEADER, null);
            Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
            Intrinsics.checkNotNullParameter(sentiments, "sentiments");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            this.chainIdsForLogging = chainIdsForLogging;
            this.instrument = instrument;
            this.sentiments = sentiments;
            this.selectedSentiment = strategyBuilderSentiment;
            this.uiOptionChains = uiOptionChains;
        }
    }

    /* compiled from: OptionStrategyBuilderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$TitleData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "title", "", "showComingSoonTag", "", "<init>", "(Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getShowComingSoonTag", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.strategybuilder.BuilderData$TitleData, reason: from toString */
    public static final /* data */ class TitleData extends OptionStrategyBuilderAdapter2 {
        public static final int $stable = 0;
        private final boolean showComingSoonTag;
        private final String title;

        public static /* synthetic */ TitleData copy$default(TitleData titleData, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleData.title;
            }
            if ((i & 2) != 0) {
                z = titleData.showComingSoonTag;
            }
            return titleData.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowComingSoonTag() {
            return this.showComingSoonTag;
        }

        public final TitleData copy(String title, boolean showComingSoonTag) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TitleData(title, showComingSoonTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleData)) {
                return false;
            }
            TitleData titleData = (TitleData) other;
            return Intrinsics.areEqual(this.title, titleData.title) && this.showComingSoonTag == titleData.showComingSoonTag;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + Boolean.hashCode(this.showComingSoonTag);
        }

        public String toString() {
            return "TitleData(title=" + this.title + ", showComingSoonTag=" + this.showComingSoonTag + ")";
        }

        public final boolean getShowComingSoonTag() {
            return this.showComingSoonTag;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleData(String title, boolean z) {
            super(OptionStrategyBuilderAdapter.ViewType.VIEW_TYPE_TITLE, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.showComingSoonTag = z;
        }
    }

    /* compiled from: OptionStrategyBuilderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$SubtitleData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "subtitle", "", "<init>", "(Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.strategybuilder.BuilderData$SubtitleData, reason: from toString */
    public static final /* data */ class SubtitleData extends OptionStrategyBuilderAdapter2 {
        public static final int $stable = 0;
        private final String subtitle;

        public static /* synthetic */ SubtitleData copy$default(SubtitleData subtitleData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subtitleData.subtitle;
            }
            return subtitleData.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final SubtitleData copy(String subtitle) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new SubtitleData(subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubtitleData) && Intrinsics.areEqual(this.subtitle, ((SubtitleData) other).subtitle);
        }

        public int hashCode() {
            return this.subtitle.hashCode();
        }

        public String toString() {
            return "SubtitleData(subtitle=" + this.subtitle + ")";
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubtitleData(String subtitle) {
            super(OptionStrategyBuilderAdapter.ViewType.VIEW_TYPE_SUBTITLE, null);
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.subtitle = subtitle;
        }
    }

    /* compiled from: OptionStrategyBuilderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "account", "Lcom/robinhood/models/db/Account;", "strategyCard", "Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$StrategyCard;", "isDay", "", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$StrategyCard;ZLjava/util/List;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getStrategyCard", "()Lcom/robinhood/models/db/OptionStrategyBuilder$StrategySection$StrategyCard;", "()Z", "getUiOptionChains", "()Ljava/util/List;", "canShowStrategyChain", "getCanShowStrategyChain", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.strategybuilder.BuilderData$StrategyCardData, reason: from toString */
    public static final /* data */ class StrategyCardData extends OptionStrategyBuilderAdapter2 {
        public static final int $stable = 8;
        private final Account account;
        private final boolean isDay;
        private final OptionStrategyBuilder.StrategySection.StrategyCard strategyCard;
        private final List<UiOptionChain> uiOptionChains;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StrategyCardData copy$default(StrategyCardData strategyCardData, Account account, OptionStrategyBuilder.StrategySection.StrategyCard strategyCard, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                account = strategyCardData.account;
            }
            if ((i & 2) != 0) {
                strategyCard = strategyCardData.strategyCard;
            }
            if ((i & 4) != 0) {
                z = strategyCardData.isDay;
            }
            if ((i & 8) != 0) {
                list = strategyCardData.uiOptionChains;
            }
            return strategyCardData.copy(account, strategyCard, z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionStrategyBuilder.StrategySection.StrategyCard getStrategyCard() {
            return this.strategyCard;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDay() {
            return this.isDay;
        }

        public final List<UiOptionChain> component4() {
            return this.uiOptionChains;
        }

        public final StrategyCardData copy(Account account, OptionStrategyBuilder.StrategySection.StrategyCard strategyCard, boolean isDay, List<UiOptionChain> uiOptionChains) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(strategyCard, "strategyCard");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            return new StrategyCardData(account, strategyCard, isDay, uiOptionChains);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategyCardData)) {
                return false;
            }
            StrategyCardData strategyCardData = (StrategyCardData) other;
            return Intrinsics.areEqual(this.account, strategyCardData.account) && Intrinsics.areEqual(this.strategyCard, strategyCardData.strategyCard) && this.isDay == strategyCardData.isDay && Intrinsics.areEqual(this.uiOptionChains, strategyCardData.uiOptionChains);
        }

        public int hashCode() {
            return (((((this.account.hashCode() * 31) + this.strategyCard.hashCode()) * 31) + Boolean.hashCode(this.isDay)) * 31) + this.uiOptionChains.hashCode();
        }

        public String toString() {
            return "StrategyCardData(account=" + this.account + ", strategyCard=" + this.strategyCard + ", isDay=" + this.isDay + ", uiOptionChains=" + this.uiOptionChains + ")";
        }

        public final Account getAccount() {
            return this.account;
        }

        public final OptionStrategyBuilder.StrategySection.StrategyCard getStrategyCard() {
            return this.strategyCard;
        }

        public final boolean isDay() {
            return this.isDay;
        }

        public final List<UiOptionChain> getUiOptionChains() {
            return this.uiOptionChains;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrategyCardData(Account account, OptionStrategyBuilder.StrategySection.StrategyCard strategyCard, boolean z, List<UiOptionChain> uiOptionChains) {
            super(OptionStrategyBuilderAdapter.ViewType.VIEW_TYPE_STRATEGY_CARD, null);
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(strategyCard, "strategyCard");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            this.account = account;
            this.strategyCard = strategyCard;
            this.isDay = z;
            this.uiOptionChains = uiOptionChains;
        }

        public final boolean getCanShowStrategyChain() {
            return (this.strategyCard.getState() == StrategyBuilderStrategyCardState.ENABLED) && this.strategyCard.getAllowedLevels().contains(StrategyBuilderOptionsLevel.INSTANCE.getStrategyBuilderOptionsLevel(this.account.getOptionLevel()));
        }
    }
}
