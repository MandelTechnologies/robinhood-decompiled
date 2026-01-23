package com.robinhood.android.newsfeed.extensions;

import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.newsfeed.p334db.NewsFeedAsset;
import com.robinhood.models.newsfeed.p334db.NewsFeedInstrument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: NewsFeedInstruments.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\b\u0012\u0004\u0012\u00020\b0\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\t"}, m3636d2 = {"takeRelatedInstruments", "", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "Lcom/robinhood/models/newsfeed/db/NewsFeedInstrument;", "count", "", "takeRelatedAssets", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "Lcom/robinhood/models/newsfeed/db/NewsFeedAsset;", "feature-lib-newsfeed_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.extensions.NewsFeedInstrumentsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NewsFeedInstruments {
    public static final List<RelatedInstrument> takeRelatedInstruments(List<NewsFeedInstrument> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return SequencesKt.toList(SequencesKt.take(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.NewsFeedInstrumentsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedInstruments.takeRelatedInstruments$lambda$0((NewsFeedInstrument) obj);
            }
        }), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelatedInstrument takeRelatedInstruments$lambda$0(NewsFeedInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new RelatedInstrument(instrument.getInstrumentId(), instrument.getSymbol());
    }

    public static final List<RelatedAsset> takeRelatedAssets(List<NewsFeedAsset> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return SequencesKt.toList(SequencesKt.take(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.NewsFeedInstrumentsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedInstruments.takeRelatedAssets$lambda$1((NewsFeedAsset) obj);
            }
        }), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelatedAsset takeRelatedAssets$lambda$1(NewsFeedAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new RelatedAsset(asset.getAssetId(), asset.getSymbol(), asset.getAssetType());
    }
}
