package com.robinhood.shared.common.instrumentratings;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.shared.equities.models.instrumentdetails.api.RatingType;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRating;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRatings;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: InstrumentRatingsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState$Loaded;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState$Loading;", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2DataState, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class InstrumentRatingsV2Duxo2 {
    public static final int $stable = 0;

    public /* synthetic */ InstrumentRatingsV2Duxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InstrumentRatingsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState$Loading;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2DataState$Loading */
    public static final /* data */ class Loading extends InstrumentRatingsV2Duxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1924025896;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private InstrumentRatingsV2Duxo2() {
    }

    /* compiled from: InstrumentRatingsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState$Loaded;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState;", "instrumentRatings", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;)V", "getInstrumentRatings", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "getSummary", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "ratings", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "getRatings", "()Lkotlinx/collections/immutable/ImmutableList;", "composableState", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "getComposableState$lib_instrument_ratings_externalDebug", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2DataState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends InstrumentRatingsV2Duxo2 {
        public static final int $stable = 8;
        private final AnalystRatingsComposableState composableState;
        private final InstrumentRatings instrumentRatings;

        /* compiled from: InstrumentRatingsV2Duxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2DataState$Loaded$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RatingType.values().length];
                try {
                    iArr[RatingType.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RatingType.HOLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RatingType.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, InstrumentRatings instrumentRatings, int i, Object obj) {
            if ((i & 1) != 0) {
                instrumentRatings = loaded.instrumentRatings;
            }
            return loaded.copy(instrumentRatings);
        }

        /* renamed from: component1, reason: from getter */
        public final InstrumentRatings getInstrumentRatings() {
            return this.instrumentRatings;
        }

        public final Loaded copy(InstrumentRatings instrumentRatings) {
            Intrinsics.checkNotNullParameter(instrumentRatings, "instrumentRatings");
            return new Loaded(instrumentRatings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.instrumentRatings, ((Loaded) other).instrumentRatings);
        }

        public int hashCode() {
            return this.instrumentRatings.hashCode();
        }

        public String toString() {
            return "Loaded(instrumentRatings=" + this.instrumentRatings + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(InstrumentRatings instrumentRatings) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentRatings, "instrumentRatings");
            this.instrumentRatings = instrumentRatings;
            this.composableState = new AnalystRatingsComposableState(StringResource.INSTANCE.invoke(C37466R.string.instrument_ratings_rating_show_more, new Object[0]), getSummary(), getRatings());
        }

        public final InstrumentRatings getInstrumentRatings() {
            return this.instrumentRatings;
        }

        private final AnalystRatingsComposableState.RatingSummary getSummary() {
            InstrumentRatings.Summary summary = this.instrumentRatings.getSummary();
            if (summary == null) {
                return null;
            }
            NumberFormatter percentFormat = FormatsLocalized.getPercentFormat();
            percentFormat.setMaximumFractionalDigits((MathKt.roundToInt(summary.getBuyPercentage()) + MathKt.roundToInt(summary.getHoldPercentage())) + MathKt.roundToInt(summary.getSellPercentage()) == 100 ? 0 : 1);
            float buyFraction = summary.getBuyFraction();
            String str = percentFormat.format(Float.valueOf(summary.getBuyFraction()));
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C37466R.string.instrument_ratings_summary_label_buy, new Object[0]);
            float holdFraction = summary.getHoldFraction();
            String str2 = percentFormat.format(Float.valueOf(summary.getHoldFraction()));
            return new AnalystRatingsComposableState.RatingSummary(Formats.getWholeNumberPercentFormat().format(Float.valueOf(Math.max(summary.getBuyFraction(), Math.max(summary.getHoldFraction(), summary.getSellFraction())))), buyFraction, stringResourceInvoke, str, holdFraction, companion.invoke(C37466R.string.instrument_ratings_summary_label_hold, new Object[0]), str2, summary.getSellFraction(), companion.invoke(C37466R.string.instrument_ratings_summary_label_sell, new Object[0]), percentFormat.format(Float.valueOf(summary.getSellFraction())));
        }

        private final ImmutableList<AnalystRatingsComposableState.AnalystRating> getRatings() {
            int i;
            StringResource stringResourceInvoke;
            Collection<InstrumentRating> collectionValues = this.instrumentRatings.getConsolidated().values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            for (InstrumentRating instrumentRating : collectionValues) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[instrumentRating.getType().ordinal()];
                if (i2 == 1) {
                    i = C37466R.string.instrument_ratings_rating_header_buy;
                } else if (i2 == 2) {
                    i = C37466R.string.instrument_ratings_rating_header_hold;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C37466R.string.instrument_ratings_rating_header_sell;
                }
                StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
                Instant ratingsPublishedAt = this.instrumentRatings.getRatingsPublishedAt();
                StringResource stringResourceInvoke3 = ratingsPublishedAt != null ? companion.invoke(C37466R.string.instrument_ratings_rating_published_on, InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) ratingsPublishedAt)) : null;
                String source = instrumentRating.getSource();
                if (source == null || (stringResourceInvoke = companion.invoke(source)) == null) {
                    stringResourceInvoke = companion.invoke(C37466R.string.gated_morningstar_instrument_ratings_rating_source_default, new Object[0]);
                }
                arrayList.add(new AnalystRatingsComposableState.AnalystRating(stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke, companion.invoke(C37466R.string.instrument_ratings_rating_body_format, instrumentRating.getText()), instrumentRating.getType()));
            }
            return extensions2.toImmutableList(arrayList);
        }

        /* renamed from: getComposableState$lib_instrument_ratings_externalDebug, reason: from getter */
        public final AnalystRatingsComposableState getComposableState() {
            return this.composableState;
        }
    }
}
