package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.compose.p011ui.state.ToggleableState;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;", "", "rowId", "", "title", "subtitle", "checkState", "Landroidx/compose/ui/state/ToggleableState;", "collapsed", "", "greeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;ZLcom/robinhood/android/options/calculation/greeks/OptionsGreeks;)V", "getRowId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getCheckState", "()Landroidx/compose/ui/state/ToggleableState;", "getCollapsed", "()Z", "getGreeks", "()Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "Leg", "Aggregate", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Aggregate;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Leg;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsPortfolioRiskAnalyzerOptionPositionRowViewState {
    public static final int $stable = OptionsGreeks.$stable;
    private final ToggleableState checkState;
    private final boolean collapsed;
    private final OptionsGreeks greeks;
    private final String rowId;
    private final String subtitle;
    private final String title;

    public /* synthetic */ OptionsPortfolioRiskAnalyzerOptionPositionRowViewState(String str, String str2, String str3, ToggleableState toggleableState, boolean z, OptionsGreeks optionsGreeks, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, toggleableState, z, optionsGreeks);
    }

    private OptionsPortfolioRiskAnalyzerOptionPositionRowViewState(String str, String str2, String str3, ToggleableState toggleableState, boolean z, OptionsGreeks optionsGreeks) {
        this.rowId = str;
        this.title = str2;
        this.subtitle = str3;
        this.checkState = toggleableState;
        this.collapsed = z;
        this.greeks = optionsGreeks;
    }

    public String getRowId() {
        return this.rowId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public ToggleableState getCheckState() {
        return this.checkState;
    }

    public boolean getCollapsed() {
        return this.collapsed;
    }

    public OptionsGreeks getGreeks() {
        return this.greeks;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Ji\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Leg;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;", "aggregatePositionId", "Ljava/util/UUID;", "instrumentPositionId", "instrumentId", "relatedLegPositionIds", "", "title", "", "subtitle", "checkState", "Landroidx/compose/ui/state/ToggleableState;", "collapsed", "", "greeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;ZLcom/robinhood/android/options/calculation/greeks/OptionsGreeks;)V", "getAggregatePositionId", "()Ljava/util/UUID;", "getInstrumentPositionId", "getInstrumentId", "getRelatedLegPositionIds", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCheckState", "()Landroidx/compose/ui/state/ToggleableState;", "getCollapsed", "()Z", "getGreeks", "()Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Leg extends OptionsPortfolioRiskAnalyzerOptionPositionRowViewState {
        public static final int $stable = 8;
        private final UUID aggregatePositionId;
        private final ToggleableState checkState;
        private final boolean collapsed;
        private final OptionsGreeks greeks;
        private final UUID instrumentId;
        private final UUID instrumentPositionId;
        private final List<UUID> relatedLegPositionIds;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Leg copy$default(Leg leg, UUID uuid, UUID uuid2, UUID uuid3, List list, String str, String str2, ToggleableState toggleableState, boolean z, OptionsGreeks optionsGreeks, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = leg.aggregatePositionId;
            }
            if ((i & 2) != 0) {
                uuid2 = leg.instrumentPositionId;
            }
            if ((i & 4) != 0) {
                uuid3 = leg.instrumentId;
            }
            if ((i & 8) != 0) {
                list = leg.relatedLegPositionIds;
            }
            if ((i & 16) != 0) {
                str = leg.title;
            }
            if ((i & 32) != 0) {
                str2 = leg.subtitle;
            }
            if ((i & 64) != 0) {
                toggleableState = leg.checkState;
            }
            if ((i & 128) != 0) {
                z = leg.collapsed;
            }
            if ((i & 256) != 0) {
                optionsGreeks = leg.greeks;
            }
            boolean z2 = z;
            OptionsGreeks optionsGreeks2 = optionsGreeks;
            String str3 = str2;
            ToggleableState toggleableState2 = toggleableState;
            String str4 = str;
            UUID uuid4 = uuid3;
            return leg.copy(uuid, uuid2, uuid4, list, str4, str3, toggleableState2, z2, optionsGreeks2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentPositionId() {
            return this.instrumentPositionId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final List<UUID> component4() {
            return this.relatedLegPositionIds;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component7, reason: from getter */
        public final ToggleableState getCheckState() {
            return this.checkState;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCollapsed() {
            return this.collapsed;
        }

        /* renamed from: component9, reason: from getter */
        public final OptionsGreeks getGreeks() {
            return this.greeks;
        }

        public final Leg copy(UUID aggregatePositionId, UUID instrumentPositionId, UUID instrumentId, List<UUID> relatedLegPositionIds, String title, String subtitle, ToggleableState checkState, boolean collapsed, OptionsGreeks greeks) {
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(instrumentPositionId, "instrumentPositionId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(relatedLegPositionIds, "relatedLegPositionIds");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(checkState, "checkState");
            Intrinsics.checkNotNullParameter(greeks, "greeks");
            return new Leg(aggregatePositionId, instrumentPositionId, instrumentId, relatedLegPositionIds, title, subtitle, checkState, collapsed, greeks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Leg)) {
                return false;
            }
            Leg leg = (Leg) other;
            return Intrinsics.areEqual(this.aggregatePositionId, leg.aggregatePositionId) && Intrinsics.areEqual(this.instrumentPositionId, leg.instrumentPositionId) && Intrinsics.areEqual(this.instrumentId, leg.instrumentId) && Intrinsics.areEqual(this.relatedLegPositionIds, leg.relatedLegPositionIds) && Intrinsics.areEqual(this.title, leg.title) && Intrinsics.areEqual(this.subtitle, leg.subtitle) && this.checkState == leg.checkState && this.collapsed == leg.collapsed && Intrinsics.areEqual(this.greeks, leg.greeks);
        }

        public int hashCode() {
            return (((((((((((((((this.aggregatePositionId.hashCode() * 31) + this.instrumentPositionId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.relatedLegPositionIds.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.checkState.hashCode()) * 31) + Boolean.hashCode(this.collapsed)) * 31) + this.greeks.hashCode();
        }

        public String toString() {
            return "Leg(aggregatePositionId=" + this.aggregatePositionId + ", instrumentPositionId=" + this.instrumentPositionId + ", instrumentId=" + this.instrumentId + ", relatedLegPositionIds=" + this.relatedLegPositionIds + ", title=" + this.title + ", subtitle=" + this.subtitle + ", checkState=" + this.checkState + ", collapsed=" + this.collapsed + ", greeks=" + this.greeks + ")";
        }

        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        public final UUID getInstrumentPositionId() {
            return this.instrumentPositionId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final List<UUID> getRelatedLegPositionIds() {
            return this.relatedLegPositionIds;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public ToggleableState getCheckState() {
            return this.checkState;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public boolean getCollapsed() {
            return this.collapsed;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public OptionsGreeks getGreeks() {
            return this.greeks;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Leg(UUID aggregatePositionId, UUID instrumentPositionId, UUID instrumentId, List<UUID> relatedLegPositionIds, String title, String subtitle, ToggleableState checkState, boolean z, OptionsGreeks greeks) {
            super(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(aggregatePositionId, instrumentPositionId), title, subtitle, checkState, z, greeks, null);
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(instrumentPositionId, "instrumentPositionId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(relatedLegPositionIds, "relatedLegPositionIds");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(checkState, "checkState");
            Intrinsics.checkNotNullParameter(greeks, "greeks");
            this.aggregatePositionId = aggregatePositionId;
            this.instrumentPositionId = instrumentPositionId;
            this.instrumentId = instrumentId;
            this.relatedLegPositionIds = relatedLegPositionIds;
            this.title = title;
            this.subtitle = subtitle;
            this.checkState = checkState;
            this.collapsed = z;
            this.greeks = greeks;
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003Ji\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 ¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Aggregate;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;", "aggregatePositionId", "Ljava/util/UUID;", "aggregatePosition", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "title", "", "subtitle", "checkState", "Landroidx/compose/ui/state/ToggleableState;", "collapsed", "", "greeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "simulatedQuantityDelta", "Ljava/math/BigDecimal;", "legs", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Leg;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;ZLcom/robinhood/android/options/calculation/greeks/OptionsGreeks;Ljava/math/BigDecimal;Ljava/util/List;)V", "getAggregatePositionId", "()Ljava/util/UUID;", "getAggregatePosition", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCheckState", "()Landroidx/compose/ui/state/ToggleableState;", "getCollapsed", "()Z", "getGreeks", "()Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "getSimulatedQuantityDelta", "()Ljava/math/BigDecimal;", "getLegs", "()Ljava/util/List;", "showLegs", "getShowLegs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Aggregate extends OptionsPortfolioRiskAnalyzerOptionPositionRowViewState {
        public static final int $stable = 8;
        private final UiAggregateOptionPositionFull aggregatePosition;
        private final UUID aggregatePositionId;
        private final ToggleableState checkState;
        private final boolean collapsed;
        private final OptionsGreeks greeks;
        private final List<Leg> legs;
        private final boolean showLegs;
        private final BigDecimal simulatedQuantityDelta;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Aggregate copy$default(Aggregate aggregate, UUID uuid, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, String str, String str2, ToggleableState toggleableState, boolean z, OptionsGreeks optionsGreeks, BigDecimal bigDecimal, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = aggregate.aggregatePositionId;
            }
            if ((i & 2) != 0) {
                uiAggregateOptionPositionFull = aggregate.aggregatePosition;
            }
            if ((i & 4) != 0) {
                str = aggregate.title;
            }
            if ((i & 8) != 0) {
                str2 = aggregate.subtitle;
            }
            if ((i & 16) != 0) {
                toggleableState = aggregate.checkState;
            }
            if ((i & 32) != 0) {
                z = aggregate.collapsed;
            }
            if ((i & 64) != 0) {
                optionsGreeks = aggregate.greeks;
            }
            if ((i & 128) != 0) {
                bigDecimal = aggregate.simulatedQuantityDelta;
            }
            if ((i & 256) != 0) {
                list = aggregate.legs;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            List list2 = list;
            boolean z2 = z;
            OptionsGreeks optionsGreeks2 = optionsGreeks;
            ToggleableState toggleableState2 = toggleableState;
            String str3 = str;
            return aggregate.copy(uuid, uiAggregateOptionPositionFull, str3, str2, toggleableState2, z2, optionsGreeks2, bigDecimal2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        /* renamed from: component2, reason: from getter */
        public final UiAggregateOptionPositionFull getAggregatePosition() {
            return this.aggregatePosition;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final ToggleableState getCheckState() {
            return this.checkState;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCollapsed() {
            return this.collapsed;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionsGreeks getGreeks() {
            return this.greeks;
        }

        /* renamed from: component8, reason: from getter */
        public final BigDecimal getSimulatedQuantityDelta() {
            return this.simulatedQuantityDelta;
        }

        public final List<Leg> component9() {
            return this.legs;
        }

        public final Aggregate copy(UUID aggregatePositionId, UiAggregateOptionPositionFull aggregatePosition, String title, String subtitle, ToggleableState checkState, boolean collapsed, OptionsGreeks greeks, BigDecimal simulatedQuantityDelta, List<Leg> legs) {
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(aggregatePosition, "aggregatePosition");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(checkState, "checkState");
            Intrinsics.checkNotNullParameter(greeks, "greeks");
            Intrinsics.checkNotNullParameter(simulatedQuantityDelta, "simulatedQuantityDelta");
            Intrinsics.checkNotNullParameter(legs, "legs");
            return new Aggregate(aggregatePositionId, aggregatePosition, title, subtitle, checkState, collapsed, greeks, simulatedQuantityDelta, legs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Aggregate)) {
                return false;
            }
            Aggregate aggregate = (Aggregate) other;
            return Intrinsics.areEqual(this.aggregatePositionId, aggregate.aggregatePositionId) && Intrinsics.areEqual(this.aggregatePosition, aggregate.aggregatePosition) && Intrinsics.areEqual(this.title, aggregate.title) && Intrinsics.areEqual(this.subtitle, aggregate.subtitle) && this.checkState == aggregate.checkState && this.collapsed == aggregate.collapsed && Intrinsics.areEqual(this.greeks, aggregate.greeks) && Intrinsics.areEqual(this.simulatedQuantityDelta, aggregate.simulatedQuantityDelta) && Intrinsics.areEqual(this.legs, aggregate.legs);
        }

        public int hashCode() {
            return (((((((((((((((this.aggregatePositionId.hashCode() * 31) + this.aggregatePosition.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.checkState.hashCode()) * 31) + Boolean.hashCode(this.collapsed)) * 31) + this.greeks.hashCode()) * 31) + this.simulatedQuantityDelta.hashCode()) * 31) + this.legs.hashCode();
        }

        public String toString() {
            return "Aggregate(aggregatePositionId=" + this.aggregatePositionId + ", aggregatePosition=" + this.aggregatePosition + ", title=" + this.title + ", subtitle=" + this.subtitle + ", checkState=" + this.checkState + ", collapsed=" + this.collapsed + ", greeks=" + this.greeks + ", simulatedQuantityDelta=" + this.simulatedQuantityDelta + ", legs=" + this.legs + ")";
        }

        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        public final UiAggregateOptionPositionFull getAggregatePosition() {
            return this.aggregatePosition;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public ToggleableState getCheckState() {
            return this.checkState;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public boolean getCollapsed() {
            return this.collapsed;
        }

        @Override // com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState
        public OptionsGreeks getGreeks() {
            return this.greeks;
        }

        public final BigDecimal getSimulatedQuantityDelta() {
            return this.simulatedQuantityDelta;
        }

        public final List<Leg> getLegs() {
            return this.legs;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Aggregate(UUID aggregatePositionId, UiAggregateOptionPositionFull aggregatePosition, String title, String subtitle, ToggleableState checkState, boolean z, OptionsGreeks greeks, BigDecimal simulatedQuantityDelta, List<Leg> legs) {
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(aggregatePosition, "aggregatePosition");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(checkState, "checkState");
            Intrinsics.checkNotNullParameter(greeks, "greeks");
            Intrinsics.checkNotNullParameter(simulatedQuantityDelta, "simulatedQuantityDelta");
            Intrinsics.checkNotNullParameter(legs, "legs");
            String string2 = aggregatePositionId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            super(string2, title, subtitle, checkState, z, greeks, null);
            this.aggregatePositionId = aggregatePositionId;
            this.aggregatePosition = aggregatePosition;
            this.title = title;
            this.subtitle = subtitle;
            this.checkState = checkState;
            this.collapsed = z;
            this.greeks = greeks;
            this.simulatedQuantityDelta = simulatedQuantityDelta;
            this.legs = legs;
            this.showLegs = legs.size() > 1;
        }

        public final boolean getShowLegs() {
            return this.showLegs;
        }
    }
}
