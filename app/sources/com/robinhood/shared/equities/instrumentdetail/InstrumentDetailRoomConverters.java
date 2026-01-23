package com.robinhood.shared.equities.instrumentdetail;

import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRating;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentDetailRoomConverters.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007R'\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailRoomConverters;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "instrumentRatingListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRating;", "getInstrumentRatingListJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "instrumentRatingListJsonAdapter$delegate", "Lkotlin/Lazy;", "ratingsReviewListToString", "", "reviews", "stringToRatingsReviewList", "json", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class InstrumentDetailRoomConverters implements InjectedTypeConverter {

    /* renamed from: instrumentRatingListJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy instrumentRatingListJsonAdapter;

    public InstrumentDetailRoomConverters(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.instrumentRatingListJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailRoomConverters$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailRoomConverters.instrumentRatingListJsonAdapter_delegate$lambda$0(moshi);
            }
        });
    }

    private final JsonAdapter<List<InstrumentRating>> getInstrumentRatingListJsonAdapter() {
        return (JsonAdapter) this.instrumentRatingListJsonAdapter.getValue();
    }

    public final String ratingsReviewListToString(List<InstrumentRating> reviews) {
        if (reviews != null) {
            return getInstrumentRatingListJsonAdapter().toJson(reviews);
        }
        return null;
    }

    public final List<InstrumentRating> stringToRatingsReviewList(String json) {
        if (json != null) {
            return getInstrumentRatingListJsonAdapter().fromJson(json);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter instrumentRatingListJsonAdapter_delegate$lambda$0(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<List<? extends InstrumentRating>>() { // from class: com.robinhood.shared.equities.instrumentdetail.InstrumentDetailRoomConverters$instrumentRatingListJsonAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }
}
