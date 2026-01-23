package com.robinhood.android.newsfeed.p200ui;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.newsfeed.api.ApiNewsFeedAssetType;
import com.robinhood.models.p320db.Quote;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiAssetQuoteFetcher.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;)V", "assetIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedAssetType;", "setAssetId", "", "assetId", "assetType", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result;", "Result", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MultiAssetQuoteFetcher {
    public static final int $stable = 8;
    private final AppType appType;
    private final BehaviorRelay<Optional<Tuples2<UUID, ApiNewsFeedAssetType>>> assetIdRelay;
    private final IndexStore indexStore;
    private final QuoteStore quoteStore;

    public MultiAssetQuoteFetcher(AppType appType, QuoteStore quoteStore, IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        this.appType = appType;
        this.quoteStore = quoteStore;
        this.indexStore = indexStore;
        BehaviorRelay<Optional<Tuples2<UUID, ApiNewsFeedAssetType>>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.assetIdRelay = behaviorRelayCreate;
    }

    /* compiled from: MultiAssetQuoteFetcher.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result;", "", "<init>", "()V", "Equity", "Index", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Equity;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Index;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        /* compiled from: MultiAssetQuoteFetcher.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Equity;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Quote;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Equity extends Result {
            public static final int $stable = 8;
            private final Quote quote;

            public static /* synthetic */ Equity copy$default(Equity equity, Quote quote, int i, Object obj) {
                if ((i & 1) != 0) {
                    quote = equity.quote;
                }
                return equity.copy(quote);
            }

            /* renamed from: component1, reason: from getter */
            public final Quote getQuote() {
                return this.quote;
            }

            public final Equity copy(Quote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new Equity(quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Equity) && Intrinsics.areEqual(this.quote, ((Equity) other).quote);
            }

            public int hashCode() {
                return this.quote.hashCode();
            }

            public String toString() {
                return "Equity(quote=" + this.quote + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Equity(Quote quote) {
                super(null);
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.quote = quote;
            }

            public final Quote getQuote() {
                return this.quote;
            }
        }

        /* compiled from: MultiAssetQuoteFetcher.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Index;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "<init>", "(Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;)V", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexCloseValue", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Index extends Result {
            public static final int $stable = 8;
            private final IndexCloseValue indexCloseValue;
            private final IndexValue indexValue;

            public static /* synthetic */ Index copy$default(Index index, IndexValue indexValue, IndexCloseValue indexCloseValue, int i, Object obj) {
                if ((i & 1) != 0) {
                    indexValue = index.indexValue;
                }
                if ((i & 2) != 0) {
                    indexCloseValue = index.indexCloseValue;
                }
                return index.copy(indexValue, indexCloseValue);
            }

            /* renamed from: component1, reason: from getter */
            public final IndexValue getIndexValue() {
                return this.indexValue;
            }

            /* renamed from: component2, reason: from getter */
            public final IndexCloseValue getIndexCloseValue() {
                return this.indexCloseValue;
            }

            public final Index copy(IndexValue indexValue, IndexCloseValue indexCloseValue) {
                Intrinsics.checkNotNullParameter(indexValue, "indexValue");
                Intrinsics.checkNotNullParameter(indexCloseValue, "indexCloseValue");
                return new Index(indexValue, indexCloseValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Index)) {
                    return false;
                }
                Index index = (Index) other;
                return Intrinsics.areEqual(this.indexValue, index.indexValue) && Intrinsics.areEqual(this.indexCloseValue, index.indexCloseValue);
            }

            public int hashCode() {
                return (this.indexValue.hashCode() * 31) + this.indexCloseValue.hashCode();
            }

            public String toString() {
                return "Index(indexValue=" + this.indexValue + ", indexCloseValue=" + this.indexCloseValue + ")";
            }

            public final IndexValue getIndexValue() {
                return this.indexValue;
            }

            public final IndexCloseValue getIndexCloseValue() {
                return this.indexCloseValue;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Index(IndexValue indexValue, IndexCloseValue indexCloseValue) {
                super(null);
                Intrinsics.checkNotNullParameter(indexValue, "indexValue");
                Intrinsics.checkNotNullParameter(indexCloseValue, "indexCloseValue");
                this.indexValue = indexValue;
                this.indexCloseValue = indexCloseValue;
            }
        }
    }

    public final void setAssetId(UUID assetId, ApiNewsFeedAssetType assetType) {
        if (assetId == null || assetType == null) {
            this.assetIdRelay.accept(Optional2.INSTANCE);
        } else {
            this.assetIdRelay.accept(Optional3.asOptional(Tuples4.m3642to(assetId, assetType)));
        }
    }

    public final Observable<Optional<Result>> streamQuote() {
        Observable observableSwitchMap = this.assetIdRelay.switchMap(new Function() { // from class: com.robinhood.android.newsfeed.ui.MultiAssetQuoteFetcher.streamQuote.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Result>> apply(Optional<? extends Tuples2<UUID, ? extends ApiNewsFeedAssetType>> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Tuples2<UUID, ? extends ApiNewsFeedAssetType> tuples2Component1 = optional.component1();
                if (tuples2Component1 == null) {
                    return Observable.just(Optional2.INSTANCE);
                }
                UUID uuidComponent1 = tuples2Component1.component1();
                ApiNewsFeedAssetType apiNewsFeedAssetTypeComponent2 = tuples2Component1.component2();
                if (MultiAssetQuoteFetcher.this.appType == AppType.RHC) {
                    return Observable.just(Optional2.INSTANCE);
                }
                if (apiNewsFeedAssetTypeComponent2 == ApiNewsFeedAssetType.EQUITY) {
                    Observable<R> map = MultiAssetQuoteFetcher.this.quoteStore.getStreamQuote().asObservable(uuidComponent1).map(new Function() { // from class: com.robinhood.android.newsfeed.ui.MultiAssetQuoteFetcher.streamQuote.1.1
                        @Override // io.reactivex.functions.Function
                        public final Result.Equity apply(Quote it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new Result.Equity(it);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return ObservablesKt.toOptionals(map).startWith((Observable) Optional2.INSTANCE);
                }
                if (apiNewsFeedAssetTypeComponent2 == ApiNewsFeedAssetType.INDEX) {
                    Observable<R> map2 = Observables.INSTANCE.combineLatest(MultiAssetQuoteFetcher.this.indexStore.getIndexValueQuery().asObservable(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(uuidComponent1)), MultiAssetQuoteFetcher.this.indexStore.getIndexCloseValueQuery().asObservable(new ApiIndexCloseDetailRequest.ApiIndexCloseRequestById(uuidComponent1))).map(new Function() { // from class: com.robinhood.android.newsfeed.ui.MultiAssetQuoteFetcher.streamQuote.1.2
                        @Override // io.reactivex.functions.Function
                        public final Result.Index apply(Tuples2<IndexValue, IndexCloseValue> tuples2) {
                            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                            return new Result.Index(tuples2.component1(), tuples2.component2());
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    return ObservablesKt.toOptionals(map2).startWith((Observable) Optional2.INSTANCE);
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
