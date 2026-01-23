package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.card.api.CardApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.card.api.ApiCard;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.CardDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import timber.log.Timber;

/* compiled from: CardStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0012J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0012J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\b\u0010\u001d\u001a\u00020\u0010H\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0081@¢\u0006\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CardStore;", "Lcom/robinhood/store/Store;", "cardApi", "Lcom/robinhood/android/card/api/CardApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CardDao;", "impressionLimiter", "Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;", "<init>", "(Lcom/robinhood/android/card/api/CardApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CardDao;Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;)V", "saveAction", "Lkotlin/Function1;", "", "Lcom/robinhood/models/card/db/Card;", "", "getLocalCards", "Lio/reactivex/Observable;", "", "getNetworkCards", "dismissCard", "cardId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCardImpression", "card", "(Lcom/robinhood/models/card/db/Card;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCardClick", "deleteCards", "refresh", "force", "", "fetchCards", "fetchCards$lib_store_card_externalDebug", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CardStore extends Store {
    private final CardApi cardApi;
    private final CardDao dao;
    private final IacCardImpressionLimiter impressionLimiter;
    private final Function1<Iterable<Card>, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStore(CardApi cardApi, StoreBundle storeBundle, final CardDao dao, IacCardImpressionLimiter impressionLimiter) {
        super(storeBundle, Card.INSTANCE);
        Intrinsics.checkNotNullParameter(cardApi, "cardApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(impressionLimiter, "impressionLimiter");
        this.cardApi = cardApi;
        this.dao = dao;
        this.impressionLimiter = impressionLimiter;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<Iterable<? extends Card>, Unit>() { // from class: com.robinhood.librobinhood.data.store.CardStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Iterable<? extends Card> iterable) {
                m22596invoke(iterable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22596invoke(Iterable<? extends Card> iterable) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(iterable);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    public final Observable<List<Card>> getLocalCards() {
        return asObservable(takeWhileLoggedIn(this.dao.getCards()));
    }

    /* compiled from: CardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/robinhood/models/card/db/Card;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardStore$getNetworkCards$1", m3645f = "CardStore.kt", m3646l = {33, 33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CardStore$getNetworkCards$1 */
    static final class C336291 extends ContinuationImpl7 implements Function2<Produce4<? super List<? extends Card>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C336291(Continuation<? super C336291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336291 c336291 = CardStore.this.new C336291(continuation);
            c336291.L$0 = obj;
            return c336291;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super List<? extends Card>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super List<Card>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super List<Card>> produce4, Continuation<? super Unit> continuation) {
            return ((C336291) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.send(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                CardStore cardStore = CardStore.this;
                this.L$0 = produce4;
                this.label = 1;
                obj = cardStore.fetchCards$lib_store_card_externalDebug(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final Observable<List<Card>> getNetworkCards() {
        Observable observableRxObservable$default = RxFactory.DefaultImpls.rxObservable$default(this, null, new C336291(null), 1, null);
        final Function1<Iterable<Card>, Unit> function1 = this.saveAction;
        Observable<List<Card>> observableDoOnNext = observableRxObservable$default.doOnNext(new Consumer(function1) { // from class: com.robinhood.librobinhood.data.store.CardStore$sam$io_reactivex_functions_Consumer$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    public final Object dismissCard(String str, Continuation<? super Unit> continuation) {
        Object objDismissCard = this.cardApi.dismissCard(str, continuation);
        return objDismissCard == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDismissCard : Unit.INSTANCE;
    }

    /* compiled from: CardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardStore$logCardImpression$2", m3645f = "CardStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CardStore$logCardImpression$2 */
    static final class C336302 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Card $card;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336302(Card card, Continuation<? super C336302> continuation) {
            super(1, continuation);
            this.$card = card;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CardStore.this.new C336302(this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C336302) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardApi cardApi = CardStore.this.cardApi;
                String id = this.$card.getId();
                this.label = 1;
                if (cardApi.logCardImpression(id, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object logCardImpression(Card card, Continuation<? super Unit> continuation) {
        Object objPerformIfAllowed = this.impressionLimiter.performIfAllowed(card, new C336302(card, null), continuation);
        return objPerformIfAllowed == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformIfAllowed : Unit.INSTANCE;
    }

    public final Object logCardClick(String str, Continuation<? super Unit> continuation) {
        Object objLogCardClick = this.cardApi.logCardClick(str, continuation);
        return objLogCardClick == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLogCardClick : Unit.INSTANCE;
    }

    public final void deleteCards() {
        this.dao.deleteAll();
    }

    /* compiled from: CardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/card/db/Card;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardStore$refresh$1", m3645f = "CardStore.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CardStore$refresh$1 */
    static final class C336311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Card>>, Object> {
        int label;

        C336311(Continuation<? super C336311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardStore.this.new C336311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Card>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Card>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Card>> continuation) {
            return ((C336311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CardStore cardStore = CardStore.this;
            this.label = 1;
            Object objFetchCards$lib_store_card_externalDebug = cardStore.fetchCards$lib_store_card_externalDebug(this);
            return objFetchCards$lib_store_card_externalDebug == coroutine_suspended ? coroutine_suspended : objFetchCards$lib_store_card_externalDebug;
        }
    }

    public static /* synthetic */ void refresh$default(CardStore cardStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        cardStore.refresh(z);
    }

    public final void refresh(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C336311(null), 1, null)).force(force).saveAction(this.saveAction).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchCards$lib_store_card_externalDebug(Continuation<? super List<Card>> continuation) {
        CardStore2 cardStore2;
        if (continuation instanceof CardStore2) {
            cardStore2 = (CardStore2) continuation;
            int i = cardStore2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardStore2.label = i - Integer.MIN_VALUE;
            } else {
                cardStore2 = new CardStore2(this, continuation);
            }
        }
        Object cardStack = cardStore2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cardStore2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cardStack);
            CardApi cardApi = this.cardApi;
            cardStore2.label = 1;
            cardStack = cardApi.getCardStack(cardStore2);
            if (cardStack == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cardStack);
        }
        Iterable iterable = (Iterable) cardStack;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiCard) it.next()).toDbModel());
        }
        return arrayList;
    }
}
