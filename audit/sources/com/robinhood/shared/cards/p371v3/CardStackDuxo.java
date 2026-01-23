package com.robinhood.shared.cards.p371v3;

import android.content.Context;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.cards.CardHelper;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardStackDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u001c\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/cards/v3/CardStackDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/cards/v3/CardStackDataState;", "Lcom/robinhood/shared/cards/v3/CardStackViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/cards/v3/CardStackStateProvider;", "appContext", "Landroid/content/Context;", "cardHelper", "Lcom/robinhood/shared/cards/CardHelper;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/cards/v3/CardStackStateProvider;Landroid/content/Context;Lcom/robinhood/shared/cards/CardHelper;Lcom/robinhood/librobinhood/data/store/CardStore;Lcom/robinhood/shared/app/type/AppType;)V", "onStart", "", "dismissCardAndNotifyServer", "card", "Lcom/robinhood/shared/cards/compose/NotificationCardState;", "dismissedCards", "Lkotlinx/collections/immutable/ImmutableSet;", "dismissCard", "initialize", "newDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "isDay", "", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CardStackDuxo extends BaseDuxo<CardStackDataState, CardStackViewState> {
    public static final int $stable = 8;
    private final Context appContext;
    private final CardHelper cardHelper;
    private final CardStore cardStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackDuxo(DuxoBundle duxoBundle, CardStackDuxo4 stateProvider, Context appContext, CardHelper cardHelper, CardStore cardStore, AppType appType) {
        super(new CardStackDataState(appType, null, null, null, null, 30, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appContext = appContext;
        this.cardHelper = cardHelper;
        this.cardStore = cardStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<NotificationCard.Stack> observableDistinctUntilChanged = this.cardHelper.getCardStack(this.appContext).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.cards.v3.CardStackDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardStackDuxo.onStart$lambda$0(this.f$0, (NotificationCard.Stack) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.cards.v3.CardStackDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardStackDuxo.onStart$lambda$1((Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CardStackDuxo cardStackDuxo, NotificationCard.Stack stack) {
        cardStackDuxo.applyMutation(new CardStackDuxo3(stack, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t) && BuildFlavors.INSTANCE.isDebugOrInternal()) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CardStackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.v3.CardStackDuxo$dismissCardAndNotifyServer$1", m3645f = "CardStackDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.v3.CardStackDuxo$dismissCardAndNotifyServer$1 */
    static final class C373811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NotificationCardComposable4 $card;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373811(NotificationCardComposable4 notificationCardComposable4, Continuation<? super C373811> continuation) {
            super(2, continuation);
            this.$card = notificationCardComposable4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardStackDuxo.this.new C373811(this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardStore cardStore = CardStackDuxo.this.cardStore;
                String id = this.$card.getId();
                this.label = 1;
                if (cardStore.dismissCard(id, this) == coroutine_suspended) {
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

    public final void dismissCardAndNotifyServer(NotificationCardComposable4 card, ImmutableSet<? extends NotificationCardComposable4> dismissedCards) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(dismissedCards, "dismissedCards");
        if (dismissedCards.contains(card)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C373811(card, null), 3, null);
        dismissCard(card, dismissedCards);
    }

    /* compiled from: CardStackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/cards/v3/CardStackDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.v3.CardStackDuxo$dismissCard$1", m3645f = "CardStackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.v3.CardStackDuxo$dismissCard$1 */
    static final class C373801 extends ContinuationImpl7 implements Function2<CardStackDataState, Continuation<? super CardStackDataState>, Object> {
        final /* synthetic */ NotificationCardComposable4 $card;
        final /* synthetic */ ImmutableSet<NotificationCardComposable4> $dismissedCards;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C373801(ImmutableSet<? extends NotificationCardComposable4> immutableSet, NotificationCardComposable4 notificationCardComposable4, Continuation<? super C373801> continuation) {
            super(2, continuation);
            this.$dismissedCards = immutableSet;
            this.$card = notificationCardComposable4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373801 c373801 = new C373801(this.$dismissedCards, this.$card, continuation);
            c373801.L$0 = obj;
            return c373801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CardStackDataState cardStackDataState, Continuation<? super CardStackDataState> continuation) {
            return ((C373801) create(cardStackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CardStackDataState.copy$default((CardStackDataState) this.L$0, null, null, null, null, extensions2.toImmutableSet(SetsKt.plus(this.$dismissedCards, this.$card)), 15, null);
        }
    }

    public final void dismissCard(NotificationCardComposable4 card, ImmutableSet<? extends NotificationCardComposable4> dismissedCards) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(dismissedCards, "dismissedCards");
        if (dismissedCards.contains(card)) {
            return;
        }
        applyMutation(new C373801(dismissedCards, card, null));
    }

    /* compiled from: CardStackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/cards/v3/CardStackDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.v3.CardStackDuxo$initialize$1", m3645f = "CardStackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.v3.CardStackDuxo$initialize$1 */
    static final class C373821 extends ContinuationImpl7 implements Function2<CardStackDataState, Continuation<? super CardStackDataState>, Object> {
        final /* synthetic */ boolean $isDay;
        final /* synthetic */ BentoTheme4 $newDirection;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373821(BentoTheme4 bentoTheme4, boolean z, Continuation<? super C373821> continuation) {
            super(2, continuation);
            this.$newDirection = bentoTheme4;
            this.$isDay = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373821 c373821 = new C373821(this.$newDirection, this.$isDay, continuation);
            c373821.L$0 = obj;
            return c373821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CardStackDataState cardStackDataState, Continuation<? super CardStackDataState> continuation) {
            return ((C373821) create(cardStackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CardStackDataState.copy$default((CardStackDataState) this.L$0, null, this.$newDirection, boxing.boxBoolean(this.$isDay), null, null, 25, null);
        }
    }

    public final void initialize(BentoTheme4 newDirection, boolean isDay) {
        Intrinsics.checkNotNullParameter(newDirection, "newDirection");
        applyMutation(new C373821(newDirection, isDay, null));
    }
}
