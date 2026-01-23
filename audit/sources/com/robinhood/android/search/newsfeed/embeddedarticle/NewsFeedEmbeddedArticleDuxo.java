package com.robinhood.android.search.newsfeed.embeddedarticle;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo;
import com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedContentViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedEmbeddedContentStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedInstrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewsFeedEmbeddedArticleDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0006\u0010\u0015\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "embeddedContentStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedEmbeddedContentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedEmbeddedContentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "instrumentIdsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Ljava/util/UUID;", "onCreate", "", "onResume", "refreshEmbeddedArticle", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Quote;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedEmbeddedArticleDuxo extends OldBaseDuxo<NewsFeedEmbeddedContentViewState> implements HasSavedState {
    private final NewsFeedEmbeddedContentStore embeddedContentStore;
    private final BehaviorRelay<List<UUID>> instrumentIdsRelay;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedEmbeddedArticleDuxo(NewsFeedEmbeddedContentStore embeddedContentStore, QuoteStore quoteStore, SavedStateHandle savedStateHandle) {
        super(new NewsFeedEmbeddedContentViewState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(embeddedContentStore, "embeddedContentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.embeddedContentStore = embeddedContentStore;
        this.quoteStore = quoteStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<List<UUID>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.instrumentIdsRelay = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        refreshEmbeddedArticle();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, streamQuote(0), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.onResume$lambda$1(this.f$0, (Quote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, streamQuote(1), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.onResume$lambda$3(this.f$0, (Quote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo, final Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        newsFeedEmbeddedArticleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.onResume$lambda$1$lambda$0(quote, (NewsFeedEmbeddedContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedEmbeddedContentViewState onResume$lambda$1$lambda$0(Quote quote, NewsFeedEmbeddedContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedEmbeddedContentViewState.copy$default(applyMutation, null, quote, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo, final Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        newsFeedEmbeddedArticleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.onResume$lambda$3$lambda$2(quote, (NewsFeedEmbeddedContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedEmbeddedContentViewState onResume$lambda$3$lambda$2(Quote quote, NewsFeedEmbeddedContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedEmbeddedContentViewState.copy$default(applyMutation, null, null, quote, 3, null);
    }

    /* compiled from: NewsFeedEmbeddedArticleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$refreshEmbeddedArticle$1", m3645f = "NewsFeedEmbeddedArticleDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$refreshEmbeddedArticle$1 */
    static final class C280511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super NewsFeedEmbeddedContent>, Object> {
        int label;

        C280511(Continuation<? super C280511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewsFeedEmbeddedArticleDuxo.this.new C280511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NewsFeedEmbeddedContent> continuation) {
            return ((C280511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            NewsFeedEmbeddedContentStore newsFeedEmbeddedContentStore = NewsFeedEmbeddedArticleDuxo.this.embeddedContentStore;
            UUID articleId = ((LegacyFragmentKey.NewsFeedEmbeddedArticle) NewsFeedEmbeddedArticleDuxo.INSTANCE.getArgs((HasSavedState) NewsFeedEmbeddedArticleDuxo.this)).getArticleId();
            this.label = 1;
            Object objFetchNewsFeedEmbeddedContent = newsFeedEmbeddedContentStore.fetchNewsFeedEmbeddedContent(articleId, this);
            return objFetchNewsFeedEmbeddedContent == coroutine_suspended ? coroutine_suspended : objFetchNewsFeedEmbeddedContent;
        }
    }

    public final void refreshEmbeddedArticle() {
        Single singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new C280511(null), 1, null).doOnSubscribe(new C280522());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.refreshEmbeddedArticle$lambda$6(this.f$0, (NewsFeedEmbeddedContent) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.refreshEmbeddedArticle$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: NewsFeedEmbeddedArticleDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$refreshEmbeddedArticle$2 */
    static final class C280522<T> implements Consumer {
        C280522() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewsFeedEmbeddedContentViewState accept$lambda$0(NewsFeedEmbeddedContentViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return NewsFeedEmbeddedContentViewState.copy$default(applyMutation, NewsFeedEmbeddedContentViewState.ContentState.Loading.INSTANCE, null, null, 6, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            NewsFeedEmbeddedArticleDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$refreshEmbeddedArticle$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedEmbeddedArticleDuxo.C280522.accept$lambda$0((NewsFeedEmbeddedContentViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshEmbeddedArticle$lambda$6(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo, final NewsFeedEmbeddedContent newsFeedEmbeddedContent) {
        List<NewsFeedInstrument> relatedInstruments = newsFeedEmbeddedContent.getRelatedInstruments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(relatedInstruments, 10));
        Iterator<T> it = relatedInstruments.iterator();
        while (it.hasNext()) {
            arrayList.add(((NewsFeedInstrument) it.next()).getInstrumentId());
        }
        newsFeedEmbeddedArticleDuxo.instrumentIdsRelay.accept(CollectionsKt.take(arrayList, 2));
        newsFeedEmbeddedArticleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleDuxo.refreshEmbeddedArticle$lambda$6$lambda$5(newsFeedEmbeddedContent, (NewsFeedEmbeddedContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedEmbeddedContentViewState refreshEmbeddedArticle$lambda$6$lambda$5(NewsFeedEmbeddedContent newsFeedEmbeddedContent, NewsFeedEmbeddedContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(newsFeedEmbeddedContent);
        return NewsFeedEmbeddedContentViewState.copy$default(applyMutation, new NewsFeedEmbeddedContentViewState.ContentState.Success(newsFeedEmbeddedContent), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshEmbeddedArticle$lambda$8(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            newsFeedEmbeddedArticleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedEmbeddedArticleDuxo.refreshEmbeddedArticle$lambda$8$lambda$7((NewsFeedEmbeddedContentViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedEmbeddedContentViewState refreshEmbeddedArticle$lambda$8$lambda$7(NewsFeedEmbeddedContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedEmbeddedContentViewState.copy$default(applyMutation, NewsFeedEmbeddedContentViewState.ContentState.Failed.INSTANCE, null, null, 6, null);
    }

    private final Observable<Quote> streamQuote(final int index) {
        Observable<R> map = this.instrumentIdsRelay.map(new Function() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo$streamQuote$$inlined$mapNotNull$1
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((UUID) CollectionsKt.getOrNull((List) it, index));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((NewsFeedEmbeddedArticleDuxo$streamQuote$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<Quote> observableSwitchMap = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleDuxo.streamQuote.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return NewsFeedEmbeddedArticleDuxo.this.quoteStore.getStreamQuote().asObservable(id);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: NewsFeedEmbeddedArticleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedEmbeddedArticle;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NewsFeedEmbeddedArticleDuxo, LegacyFragmentKey.NewsFeedEmbeddedArticle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedEmbeddedArticle getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.NewsFeedEmbeddedArticle) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedEmbeddedArticle getArgs(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo) {
            return (LegacyFragmentKey.NewsFeedEmbeddedArticle) DuxoCompanion.DefaultImpls.getArgs(this, newsFeedEmbeddedArticleDuxo);
        }
    }
}
