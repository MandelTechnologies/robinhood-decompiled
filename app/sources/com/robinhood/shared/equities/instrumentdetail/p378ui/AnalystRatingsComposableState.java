package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.equities.models.instrumentdetails.api.RatingType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AnalystRatingsComposableState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "", "showMoreButtonText", "Lcom/robinhood/utils/resource/StringResource;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "ratings", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;Lkotlinx/collections/immutable/ImmutableList;)V", "getShowMoreButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getSummary", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "getRatings", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RatingSummary", "AnalystRating", "lib-instrument-detail-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalystRatingsComposableState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<AnalystRating> ratings;
    private final StringResource showMoreButtonText;
    private final RatingSummary summary;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalystRatingsComposableState copy$default(AnalystRatingsComposableState analystRatingsComposableState, StringResource stringResource, RatingSummary ratingSummary, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = analystRatingsComposableState.showMoreButtonText;
        }
        if ((i & 2) != 0) {
            ratingSummary = analystRatingsComposableState.summary;
        }
        if ((i & 4) != 0) {
            immutableList = analystRatingsComposableState.ratings;
        }
        return analystRatingsComposableState.copy(stringResource, ratingSummary, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getShowMoreButtonText() {
        return this.showMoreButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final RatingSummary getSummary() {
        return this.summary;
    }

    public final ImmutableList<AnalystRating> component3() {
        return this.ratings;
    }

    public final AnalystRatingsComposableState copy(StringResource showMoreButtonText, RatingSummary summary, ImmutableList<AnalystRating> ratings) {
        Intrinsics.checkNotNullParameter(showMoreButtonText, "showMoreButtonText");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        return new AnalystRatingsComposableState(showMoreButtonText, summary, ratings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalystRatingsComposableState)) {
            return false;
        }
        AnalystRatingsComposableState analystRatingsComposableState = (AnalystRatingsComposableState) other;
        return Intrinsics.areEqual(this.showMoreButtonText, analystRatingsComposableState.showMoreButtonText) && Intrinsics.areEqual(this.summary, analystRatingsComposableState.summary) && Intrinsics.areEqual(this.ratings, analystRatingsComposableState.ratings);
    }

    public int hashCode() {
        int iHashCode = this.showMoreButtonText.hashCode() * 31;
        RatingSummary ratingSummary = this.summary;
        return ((iHashCode + (ratingSummary == null ? 0 : ratingSummary.hashCode())) * 31) + this.ratings.hashCode();
    }

    public String toString() {
        return "AnalystRatingsComposableState(showMoreButtonText=" + this.showMoreButtonText + ", summary=" + this.summary + ", ratings=" + this.ratings + ")";
    }

    public AnalystRatingsComposableState(StringResource showMoreButtonText, RatingSummary ratingSummary, ImmutableList<AnalystRating> ratings) {
        Intrinsics.checkNotNullParameter(showMoreButtonText, "showMoreButtonText");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        this.showMoreButtonText = showMoreButtonText;
        this.summary = ratingSummary;
        this.ratings = ratings;
    }

    public final StringResource getShowMoreButtonText() {
        return this.showMoreButtonText;
    }

    public final RatingSummary getSummary() {
        return this.summary;
    }

    public final ImmutableList<AnalystRating> getRatings() {
        return this.ratings;
    }

    /* compiled from: AnalystRatingsComposableState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003Jm\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u001e\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010$\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "", "mainPercentageText", "", "buyFraction", "", "buyLabelText", "Lcom/robinhood/utils/resource/StringResource;", "buyPercentageText", "holdFraction", "holdLabelText", "holdPercentageText", "sellFraction", "sellLabelText", "sellPercentageText", "<init>", "(Ljava/lang/String;FLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;FLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;FLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getMainPercentageText", "()Ljava/lang/String;", "getBuyFraction", "()F", "getBuyLabelText", "()Lcom/robinhood/utils/resource/StringResource;", "getBuyPercentageText", "getHoldFraction", "getHoldLabelText", "getHoldPercentageText", "getSellFraction", "getSellLabelText", "getSellPercentageText", "buyColor", "Landroidx/compose/ui/graphics/Color;", "getBuyColor", "(Landroidx/compose/runtime/Composer;I)J", "holdColor", "getHoldColor", "sellColor", "getSellColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-instrument-detail-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RatingSummary {
        public static final int $stable = StringResource.$stable;
        private final float buyFraction;
        private final StringResource buyLabelText;
        private final String buyPercentageText;
        private final float holdFraction;
        private final StringResource holdLabelText;
        private final String holdPercentageText;
        private final String mainPercentageText;
        private final float sellFraction;
        private final StringResource sellLabelText;
        private final String sellPercentageText;

        public static /* synthetic */ RatingSummary copy$default(RatingSummary ratingSummary, String str, float f, StringResource stringResource, String str2, float f2, StringResource stringResource2, String str3, float f3, StringResource stringResource3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ratingSummary.mainPercentageText;
            }
            if ((i & 2) != 0) {
                f = ratingSummary.buyFraction;
            }
            if ((i & 4) != 0) {
                stringResource = ratingSummary.buyLabelText;
            }
            if ((i & 8) != 0) {
                str2 = ratingSummary.buyPercentageText;
            }
            if ((i & 16) != 0) {
                f2 = ratingSummary.holdFraction;
            }
            if ((i & 32) != 0) {
                stringResource2 = ratingSummary.holdLabelText;
            }
            if ((i & 64) != 0) {
                str3 = ratingSummary.holdPercentageText;
            }
            if ((i & 128) != 0) {
                f3 = ratingSummary.sellFraction;
            }
            if ((i & 256) != 0) {
                stringResource3 = ratingSummary.sellLabelText;
            }
            if ((i & 512) != 0) {
                str4 = ratingSummary.sellPercentageText;
            }
            StringResource stringResource4 = stringResource3;
            String str5 = str4;
            String str6 = str3;
            float f4 = f3;
            float f5 = f2;
            StringResource stringResource5 = stringResource2;
            return ratingSummary.copy(str, f, stringResource, str2, f5, stringResource5, str6, f4, stringResource4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMainPercentageText() {
            return this.mainPercentageText;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSellPercentageText() {
            return this.sellPercentageText;
        }

        /* renamed from: component2, reason: from getter */
        public final float getBuyFraction() {
            return this.buyFraction;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getBuyLabelText() {
            return this.buyLabelText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBuyPercentageText() {
            return this.buyPercentageText;
        }

        /* renamed from: component5, reason: from getter */
        public final float getHoldFraction() {
            return this.holdFraction;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getHoldLabelText() {
            return this.holdLabelText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getHoldPercentageText() {
            return this.holdPercentageText;
        }

        /* renamed from: component8, reason: from getter */
        public final float getSellFraction() {
            return this.sellFraction;
        }

        /* renamed from: component9, reason: from getter */
        public final StringResource getSellLabelText() {
            return this.sellLabelText;
        }

        public final RatingSummary copy(String mainPercentageText, float buyFraction, StringResource buyLabelText, String buyPercentageText, float holdFraction, StringResource holdLabelText, String holdPercentageText, float sellFraction, StringResource sellLabelText, String sellPercentageText) {
            Intrinsics.checkNotNullParameter(mainPercentageText, "mainPercentageText");
            Intrinsics.checkNotNullParameter(buyLabelText, "buyLabelText");
            Intrinsics.checkNotNullParameter(buyPercentageText, "buyPercentageText");
            Intrinsics.checkNotNullParameter(holdLabelText, "holdLabelText");
            Intrinsics.checkNotNullParameter(holdPercentageText, "holdPercentageText");
            Intrinsics.checkNotNullParameter(sellLabelText, "sellLabelText");
            Intrinsics.checkNotNullParameter(sellPercentageText, "sellPercentageText");
            return new RatingSummary(mainPercentageText, buyFraction, buyLabelText, buyPercentageText, holdFraction, holdLabelText, holdPercentageText, sellFraction, sellLabelText, sellPercentageText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingSummary)) {
                return false;
            }
            RatingSummary ratingSummary = (RatingSummary) other;
            return Intrinsics.areEqual(this.mainPercentageText, ratingSummary.mainPercentageText) && Float.compare(this.buyFraction, ratingSummary.buyFraction) == 0 && Intrinsics.areEqual(this.buyLabelText, ratingSummary.buyLabelText) && Intrinsics.areEqual(this.buyPercentageText, ratingSummary.buyPercentageText) && Float.compare(this.holdFraction, ratingSummary.holdFraction) == 0 && Intrinsics.areEqual(this.holdLabelText, ratingSummary.holdLabelText) && Intrinsics.areEqual(this.holdPercentageText, ratingSummary.holdPercentageText) && Float.compare(this.sellFraction, ratingSummary.sellFraction) == 0 && Intrinsics.areEqual(this.sellLabelText, ratingSummary.sellLabelText) && Intrinsics.areEqual(this.sellPercentageText, ratingSummary.sellPercentageText);
        }

        public int hashCode() {
            return (((((((((((((((((this.mainPercentageText.hashCode() * 31) + Float.hashCode(this.buyFraction)) * 31) + this.buyLabelText.hashCode()) * 31) + this.buyPercentageText.hashCode()) * 31) + Float.hashCode(this.holdFraction)) * 31) + this.holdLabelText.hashCode()) * 31) + this.holdPercentageText.hashCode()) * 31) + Float.hashCode(this.sellFraction)) * 31) + this.sellLabelText.hashCode()) * 31) + this.sellPercentageText.hashCode();
        }

        public String toString() {
            return "RatingSummary(mainPercentageText=" + this.mainPercentageText + ", buyFraction=" + this.buyFraction + ", buyLabelText=" + this.buyLabelText + ", buyPercentageText=" + this.buyPercentageText + ", holdFraction=" + this.holdFraction + ", holdLabelText=" + this.holdLabelText + ", holdPercentageText=" + this.holdPercentageText + ", sellFraction=" + this.sellFraction + ", sellLabelText=" + this.sellLabelText + ", sellPercentageText=" + this.sellPercentageText + ")";
        }

        public RatingSummary(String mainPercentageText, float f, StringResource buyLabelText, String buyPercentageText, float f2, StringResource holdLabelText, String holdPercentageText, float f3, StringResource sellLabelText, String sellPercentageText) {
            Intrinsics.checkNotNullParameter(mainPercentageText, "mainPercentageText");
            Intrinsics.checkNotNullParameter(buyLabelText, "buyLabelText");
            Intrinsics.checkNotNullParameter(buyPercentageText, "buyPercentageText");
            Intrinsics.checkNotNullParameter(holdLabelText, "holdLabelText");
            Intrinsics.checkNotNullParameter(holdPercentageText, "holdPercentageText");
            Intrinsics.checkNotNullParameter(sellLabelText, "sellLabelText");
            Intrinsics.checkNotNullParameter(sellPercentageText, "sellPercentageText");
            this.mainPercentageText = mainPercentageText;
            this.buyFraction = f;
            this.buyLabelText = buyLabelText;
            this.buyPercentageText = buyPercentageText;
            this.holdFraction = f2;
            this.holdLabelText = holdLabelText;
            this.holdPercentageText = holdPercentageText;
            this.sellFraction = f3;
            this.sellLabelText = sellLabelText;
            this.sellPercentageText = sellPercentageText;
        }

        public final String getMainPercentageText() {
            return this.mainPercentageText;
        }

        public final float getBuyFraction() {
            return this.buyFraction;
        }

        public final StringResource getBuyLabelText() {
            return this.buyLabelText;
        }

        public final String getBuyPercentageText() {
            return this.buyPercentageText;
        }

        public final float getHoldFraction() {
            return this.holdFraction;
        }

        public final StringResource getHoldLabelText() {
            return this.holdLabelText;
        }

        public final String getHoldPercentageText() {
            return this.holdPercentageText;
        }

        public final float getSellFraction() {
            return this.sellFraction;
        }

        public final StringResource getSellLabelText() {
            return this.sellLabelText;
        }

        public final String getSellPercentageText() {
            return this.sellPercentageText;
        }

        @JvmName
        public final long getBuyColor(Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            composer.startReplaceGroup(1445013606);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445013606, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsComposableState.RatingSummary.<get-buyColor> (AnalystRatingsComposableState.kt:30)");
            }
            if (Intrinsics.areEqual(this.mainPercentageText, this.buyPercentageText)) {
                composer.startReplaceGroup(-56793278);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-56729976);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21425getFg0d7_KjU;
        }

        @JvmName
        public final long getHoldColor(Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            composer.startReplaceGroup(-765873502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-765873502, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsComposableState.RatingSummary.<get-holdColor> (AnalystRatingsComposableState.kt:38)");
            }
            if (Intrinsics.areEqual(this.mainPercentageText, this.holdPercentageText)) {
                composer.startReplaceGroup(-1271142554);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1271079252);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21425getFg0d7_KjU;
        }

        @JvmName
        public final long getSellColor(Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            composer.startReplaceGroup(187350524);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187350524, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsComposableState.RatingSummary.<get-sellColor> (AnalystRatingsComposableState.kt:46)");
            }
            if (Intrinsics.areEqual(this.mainPercentageText, this.sellPercentageText)) {
                composer.startReplaceGroup(-2097945140);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2097881838);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21425getFg0d7_KjU;
        }
    }

    /* compiled from: AnalystRatingsComposableState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "publishedDateText", "source", "text", "type", "Lcom/robinhood/shared/equities/models/instrumentdetails/api/RatingType;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/equities/models/instrumentdetails/api/RatingType;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPublishedDateText", "getSource", "getText", "getType", "()Lcom/robinhood/shared/equities/models/instrumentdetails/api/RatingType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-instrument-detail-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AnalystRating {
        public static final int $stable = StringResource.$stable;
        private final StringResource publishedDateText;
        private final StringResource source;
        private final StringResource text;
        private final StringResource title;
        private final RatingType type;

        public static /* synthetic */ AnalystRating copy$default(AnalystRating analystRating, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, RatingType ratingType, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = analystRating.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = analystRating.publishedDateText;
            }
            if ((i & 4) != 0) {
                stringResource3 = analystRating.source;
            }
            if ((i & 8) != 0) {
                stringResource4 = analystRating.text;
            }
            if ((i & 16) != 0) {
                ratingType = analystRating.type;
            }
            RatingType ratingType2 = ratingType;
            StringResource stringResource5 = stringResource3;
            return analystRating.copy(stringResource, stringResource2, stringResource5, stringResource4, ratingType2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPublishedDateText() {
            return this.publishedDateText;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final RatingType getType() {
            return this.type;
        }

        public final AnalystRating copy(StringResource title, StringResource publishedDateText, StringResource source, StringResource text, RatingType type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new AnalystRating(title, publishedDateText, source, text, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalystRating)) {
                return false;
            }
            AnalystRating analystRating = (AnalystRating) other;
            return Intrinsics.areEqual(this.title, analystRating.title) && Intrinsics.areEqual(this.publishedDateText, analystRating.publishedDateText) && Intrinsics.areEqual(this.source, analystRating.source) && Intrinsics.areEqual(this.text, analystRating.text) && this.type == analystRating.type;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            StringResource stringResource = this.publishedDateText;
            return ((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.source.hashCode()) * 31) + this.text.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "AnalystRating(title=" + this.title + ", publishedDateText=" + this.publishedDateText + ", source=" + this.source + ", text=" + this.text + ", type=" + this.type + ")";
        }

        public AnalystRating(StringResource title, StringResource stringResource, StringResource source, StringResource text, RatingType type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.title = title;
            this.publishedDateText = stringResource;
            this.source = source;
            this.text = text;
            this.type = type2;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getPublishedDateText() {
            return this.publishedDateText;
        }

        public final StringResource getSource() {
            return this.source;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final RatingType getType() {
            return this.type;
        }
    }
}
