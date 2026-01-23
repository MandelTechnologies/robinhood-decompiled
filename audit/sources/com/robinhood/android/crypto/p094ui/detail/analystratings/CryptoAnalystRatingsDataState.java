package com.robinhood.android.crypto.p094ui.detail.analystratings;

import com.robinhood.android.crypto.C12757R;
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
import java.util.List;
import java.util.Map;
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

/* compiled from: CryptoAnalystRatingsDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDataState;", "", "analystRatings", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;)V", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "getSummary", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "ratings", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "getRatings", "()Lkotlinx/collections/immutable/ImmutableList;", "closeButtonText", "Lcom/robinhood/utils/resource/StringResource;", "getCloseButtonText$feature_crypto_externalDebug", "()Lcom/robinhood/utils/resource/StringResource;", "headerText", "getHeaderText$feature_crypto_externalDebug", "isVisible", "", "isVisible$feature_crypto_externalDebug", "()Z", "state", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "getState$feature_crypto_externalDebug", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoAnalystRatingsDataState {
    public static final int $stable = 8;
    private final InstrumentRatings analystRatings;

    /* compiled from: CryptoAnalystRatingsDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAnalystRatingsDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final InstrumentRatings getAnalystRatings() {
        return this.analystRatings;
    }

    public static /* synthetic */ CryptoAnalystRatingsDataState copy$default(CryptoAnalystRatingsDataState cryptoAnalystRatingsDataState, InstrumentRatings instrumentRatings, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentRatings = cryptoAnalystRatingsDataState.analystRatings;
        }
        return cryptoAnalystRatingsDataState.copy(instrumentRatings);
    }

    public final CryptoAnalystRatingsDataState copy(InstrumentRatings analystRatings) {
        return new CryptoAnalystRatingsDataState(analystRatings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoAnalystRatingsDataState) && Intrinsics.areEqual(this.analystRatings, ((CryptoAnalystRatingsDataState) other).analystRatings);
    }

    public int hashCode() {
        InstrumentRatings instrumentRatings = this.analystRatings;
        if (instrumentRatings == null) {
            return 0;
        }
        return instrumentRatings.hashCode();
    }

    public String toString() {
        return "CryptoAnalystRatingsDataState(analystRatings=" + this.analystRatings + ")";
    }

    public CryptoAnalystRatingsDataState(InstrumentRatings instrumentRatings) {
        this.analystRatings = instrumentRatings;
    }

    public /* synthetic */ CryptoAnalystRatingsDataState(InstrumentRatings instrumentRatings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrumentRatings);
    }

    private final AnalystRatingsComposableState.RatingSummary getSummary() {
        InstrumentRatings.Summary summary;
        InstrumentRatings instrumentRatings = this.analystRatings;
        if (instrumentRatings == null || (summary = instrumentRatings.getSummary()) == null) {
            return null;
        }
        NumberFormatter percentFormat = FormatsLocalized.getPercentFormat();
        percentFormat.setMaximumFractionalDigits((MathKt.roundToInt(summary.getBuyPercentage()) + MathKt.roundToInt(summary.getHoldPercentage())) + MathKt.roundToInt(summary.getSellPercentage()) == 100 ? 0 : 1);
        float buyFraction = summary.getBuyFraction();
        String str = percentFormat.format(Float.valueOf(summary.getBuyFraction()));
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AnalystRatingsComposableState.RatingSummary(percentFormat.format(Float.valueOf(Math.max(summary.getBuyFraction(), Math.max(summary.getHoldFraction(), summary.getSellFraction())))), buyFraction, companion.invoke(C12757R.string.crypto_detail_analyst_ratings_buy_label, new Object[0]), str, summary.getHoldFraction(), companion.invoke(C12757R.string.crypto_detail_analyst_ratings_hold_label, new Object[0]), percentFormat.format(Float.valueOf(summary.getHoldFraction())), summary.getSellFraction(), companion.invoke(C12757R.string.crypto_detail_analyst_ratings_sell_label, new Object[0]), percentFormat.format(Float.valueOf(summary.getSellFraction())));
    }

    private final ImmutableList<AnalystRatingsComposableState.AnalystRating> getRatings() {
        Map<RatingType, InstrumentRating> consolidated;
        Collection<InstrumentRating> collectionValues;
        int i;
        StringResource stringResourceInvoke;
        InstrumentRatings instrumentRatings = this.analystRatings;
        if (instrumentRatings != null && (consolidated = instrumentRatings.getConsolidated()) != null && (collectionValues = consolidated.values()) != null) {
            Collection<InstrumentRating> collection = collectionValues;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
            for (InstrumentRating instrumentRating : collection) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[instrumentRating.getType().ordinal()];
                if (i2 == 1) {
                    i = C12757R.string.crypto_detail_analyst_ratings_rating_header_buy;
                } else if (i2 == 2) {
                    i = C12757R.string.crypto_detail_analyst_ratings_rating_header_hold;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C12757R.string.crypto_detail_analyst_ratings_rating_header_sell;
                }
                StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
                Instant ratingsPublishedAt = this.analystRatings.getRatingsPublishedAt();
                StringResource stringResourceInvoke3 = ratingsPublishedAt != null ? companion.invoke(C12757R.string.crypto_detail_analyst_ratings_rating_published_on, InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) ratingsPublishedAt)) : null;
                String source = instrumentRating.getSource();
                if (source == null || (stringResourceInvoke = companion.invoke(source)) == null) {
                    stringResourceInvoke = companion.invoke(C12757R.string.f4074xe2e61d5a, new Object[0]);
                }
                arrayList.add(new AnalystRatingsComposableState.AnalystRating(stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke, companion.invoke(C12757R.string.crypto_detail_analyst_ratings_rating_body_format, instrumentRating.getText()), instrumentRating.getType()));
            }
            ImmutableList<AnalystRatingsComposableState.AnalystRating> immutableList = extensions2.toImmutableList(arrayList);
            if (immutableList != null) {
                return immutableList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final StringResource getCloseButtonText$feature_crypto_externalDebug() {
        return StringResource.INSTANCE.invoke(C12757R.string.crypto_detail_close, new Object[0]);
    }

    public final StringResource getHeaderText$feature_crypto_externalDebug() {
        List<InstrumentRating> ratings;
        InstrumentRatings instrumentRatings = this.analystRatings;
        int size = (instrumentRatings == null || (ratings = instrumentRatings.getRatings()) == null) ? 0 : ratings.size();
        if (size == 0) {
            return StringResource.INSTANCE.invoke(C12757R.string.crypto_detail_analyst_ratings_label_without_count, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12757R.plurals.analyst_ratings_label_with_count, size), Integer.valueOf(size));
    }

    public final boolean isVisible$feature_crypto_externalDebug() {
        return (getSummary() == null && getRatings().isEmpty()) ? false : true;
    }

    public final AnalystRatingsComposableState getState$feature_crypto_externalDebug() {
        return new AnalystRatingsComposableState(StringResource.INSTANCE.invoke(C12757R.string.crypto_detail_show_more, new Object[0]), getSummary(), getRatings());
    }
}
