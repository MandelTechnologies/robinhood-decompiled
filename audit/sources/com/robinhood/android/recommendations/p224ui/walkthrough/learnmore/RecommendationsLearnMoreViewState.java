package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import com.robinhood.android.recommendations.C25978R;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsLearnMoreViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u00012B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JF\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;", "", "instrumentId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "learnMore", "Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "weight", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;Lcom/robinhood/models/db/EtpDetails;Ljava/lang/Float;)V", "getInstrumentId", "()Ljava/util/UUID;", "getEntryPoint", "()Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "getLearnMore", "()Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "isLoading", "", "()Z", "expandableRows", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState$ExpandableRow;", "getExpandableRows", "()Ljava/util/List;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;Lcom/robinhood/models/db/EtpDetails;Ljava/lang/Float;)Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;", "equals", "other", "hashCode", "", "toString", "", "ExpandableRow", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsLearnMoreViewState {
    private final RecommendationsLearnMoreEntryPoint entryPoint;
    private final EtpDetails etpDetails;
    private final UUID instrumentId;
    private final RecommendationsLearnMore learnMore;
    private final Float weight;

    /* compiled from: RecommendationsLearnMoreViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsLearnMoreEntryPoint.values().length];
            try {
                iArr[RecommendationsLearnMoreEntryPoint.FIRST_TRADE_RECOMMENDATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsLearnMoreEntryPoint.RECOMMENDATIONS_FOR_RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ RecommendationsLearnMoreViewState copy$default(RecommendationsLearnMoreViewState recommendationsLearnMoreViewState, UUID uuid, RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint, RecommendationsLearnMore recommendationsLearnMore, EtpDetails etpDetails, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recommendationsLearnMoreViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            recommendationsLearnMoreEntryPoint = recommendationsLearnMoreViewState.entryPoint;
        }
        if ((i & 4) != 0) {
            recommendationsLearnMore = recommendationsLearnMoreViewState.learnMore;
        }
        if ((i & 8) != 0) {
            etpDetails = recommendationsLearnMoreViewState.etpDetails;
        }
        if ((i & 16) != 0) {
            f = recommendationsLearnMoreViewState.weight;
        }
        Float f2 = f;
        RecommendationsLearnMore recommendationsLearnMore2 = recommendationsLearnMore;
        return recommendationsLearnMoreViewState.copy(uuid, recommendationsLearnMoreEntryPoint, recommendationsLearnMore2, etpDetails, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final RecommendationsLearnMoreEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final RecommendationsLearnMore getLearnMore() {
        return this.learnMore;
    }

    /* renamed from: component4, reason: from getter */
    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    public final RecommendationsLearnMoreViewState copy(UUID instrumentId, RecommendationsLearnMoreEntryPoint entryPoint, RecommendationsLearnMore learnMore, EtpDetails etpDetails, Float weight) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new RecommendationsLearnMoreViewState(instrumentId, entryPoint, learnMore, etpDetails, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsLearnMoreViewState)) {
            return false;
        }
        RecommendationsLearnMoreViewState recommendationsLearnMoreViewState = (RecommendationsLearnMoreViewState) other;
        return Intrinsics.areEqual(this.instrumentId, recommendationsLearnMoreViewState.instrumentId) && this.entryPoint == recommendationsLearnMoreViewState.entryPoint && Intrinsics.areEqual(this.learnMore, recommendationsLearnMoreViewState.learnMore) && Intrinsics.areEqual(this.etpDetails, recommendationsLearnMoreViewState.etpDetails) && Intrinsics.areEqual((Object) this.weight, (Object) recommendationsLearnMoreViewState.weight);
    }

    public int hashCode() {
        int iHashCode = ((this.instrumentId.hashCode() * 31) + this.entryPoint.hashCode()) * 31;
        RecommendationsLearnMore recommendationsLearnMore = this.learnMore;
        int iHashCode2 = (iHashCode + (recommendationsLearnMore == null ? 0 : recommendationsLearnMore.hashCode())) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode3 = (iHashCode2 + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31;
        Float f = this.weight;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationsLearnMoreViewState(instrumentId=" + this.instrumentId + ", entryPoint=" + this.entryPoint + ", learnMore=" + this.learnMore + ", etpDetails=" + this.etpDetails + ", weight=" + this.weight + ")";
    }

    public RecommendationsLearnMoreViewState(UUID instrumentId, RecommendationsLearnMoreEntryPoint entryPoint, RecommendationsLearnMore recommendationsLearnMore, EtpDetails etpDetails, Float f) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.instrumentId = instrumentId;
        this.entryPoint = entryPoint;
        this.learnMore = recommendationsLearnMore;
        this.etpDetails = etpDetails;
        this.weight = f;
    }

    public /* synthetic */ RecommendationsLearnMoreViewState(UUID uuid, RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint, RecommendationsLearnMore recommendationsLearnMore, EtpDetails etpDetails, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, recommendationsLearnMoreEntryPoint, (i & 4) != 0 ? null : recommendationsLearnMore, (i & 8) != 0 ? null : etpDetails, (i & 16) != 0 ? null : f);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final RecommendationsLearnMoreEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final RecommendationsLearnMore getLearnMore() {
        return this.learnMore;
    }

    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public final boolean isLoading() {
        return this.learnMore == null || this.etpDetails == null;
    }

    public final List<ExpandableRow> getExpandableRows() {
        List<RecommendationsLearnMore.ExpandableContentRow> contents;
        RecommendationsLearnMore recommendationsLearnMore = this.learnMore;
        if (recommendationsLearnMore == null || (contents = recommendationsLearnMore.getContents()) == null) {
            return null;
        }
        List<RecommendationsLearnMore.ExpandableContentRow> list = contents;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (RecommendationsLearnMore.ExpandableContentRow expandableContentRow : list) {
            arrayList.add(new ExpandableRow(expandableContentRow.getTitle(), expandableContentRow.getValue(), expandableContentRow.getExpandedContent(), !expandableContentRow.getReturnDetails().isEmpty() ? this.etpDetails : null));
        }
        return arrayList;
    }

    public final StringResource getTitle() {
        String title;
        String pogTitle;
        int i = WhenMappings.$EnumSwitchMapping$0[this.entryPoint.ordinal()];
        if (i == 1) {
            RecommendationsLearnMore recommendationsLearnMore = this.learnMore;
            if (recommendationsLearnMore == null || (title = recommendationsLearnMore.getTitle()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(title);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = C25978R.string.recommendations_learn_more_title_recs_retirement;
        Float f = this.weight;
        String strValueOf = String.valueOf(f != null ? Integer.valueOf((int) (f.floatValue() * 100.0f)) : null);
        RecommendationsLearnMore recommendationsLearnMore2 = this.learnMore;
        if (recommendationsLearnMore2 == null || (pogTitle = recommendationsLearnMore2.getPogTitle()) == null) {
            pogTitle = "";
        }
        return companion.invoke(i2, strValueOf, pogTitle);
    }

    /* compiled from: RecommendationsLearnMoreViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState$ExpandableRow;", "", "title", "", "value", "expandedContent", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/EtpDetails;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getExpandedContent", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExpandableRow {
        private final EtpDetails etpDetails;
        private final String expandedContent;
        private final String title;
        private final String value;

        public static /* synthetic */ ExpandableRow copy$default(ExpandableRow expandableRow, String str, String str2, String str3, EtpDetails etpDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = expandableRow.title;
            }
            if ((i & 2) != 0) {
                str2 = expandableRow.value;
            }
            if ((i & 4) != 0) {
                str3 = expandableRow.expandedContent;
            }
            if ((i & 8) != 0) {
                etpDetails = expandableRow.etpDetails;
            }
            return expandableRow.copy(str, str2, str3, etpDetails);
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
        public final String getExpandedContent() {
            return this.expandedContent;
        }

        /* renamed from: component4, reason: from getter */
        public final EtpDetails getEtpDetails() {
            return this.etpDetails;
        }

        public final ExpandableRow copy(String title, String value, String expandedContent, EtpDetails etpDetails) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expandedContent, "expandedContent");
            return new ExpandableRow(title, value, expandedContent, etpDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandableRow)) {
                return false;
            }
            ExpandableRow expandableRow = (ExpandableRow) other;
            return Intrinsics.areEqual(this.title, expandableRow.title) && Intrinsics.areEqual(this.value, expandableRow.value) && Intrinsics.areEqual(this.expandedContent, expandableRow.expandedContent) && Intrinsics.areEqual(this.etpDetails, expandableRow.etpDetails);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.value.hashCode()) * 31) + this.expandedContent.hashCode()) * 31;
            EtpDetails etpDetails = this.etpDetails;
            return iHashCode + (etpDetails == null ? 0 : etpDetails.hashCode());
        }

        public String toString() {
            return "ExpandableRow(title=" + this.title + ", value=" + this.value + ", expandedContent=" + this.expandedContent + ", etpDetails=" + this.etpDetails + ")";
        }

        public ExpandableRow(String title, String value, String expandedContent, EtpDetails etpDetails) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expandedContent, "expandedContent");
            this.title = title;
            this.value = value;
            this.expandedContent = expandedContent;
            this.etpDetails = etpDetails;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getExpandedContent() {
            return this.expandedContent;
        }

        public final EtpDetails getEtpDetails() {
            return this.etpDetails;
        }
    }
}
