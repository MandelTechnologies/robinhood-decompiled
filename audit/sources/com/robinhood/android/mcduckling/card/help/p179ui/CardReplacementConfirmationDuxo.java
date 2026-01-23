package com.robinhood.android.mcduckling.card.help.p179ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.functions.Function;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardReplacementConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardReplacementConfirmationDuxo extends OldBaseDuxo<CardReplacementConfirmationViewState> implements HasSavedState {
    private final GooglePayManager googlePayManager;
    private final Minerva minerva;
    private final PaymentCardStore paymentCardStore;
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
    public CardReplacementConfirmationDuxo(Minerva minerva, PaymentCardStore paymentCardStore, GooglePayManager googlePayManager, SavedStateHandle savedStateHandle) {
        super(new CardReplacementConfirmationViewState(null, ((CardReplacementConfirmationFragment.Args) INSTANCE.getArgs(savedStateHandle)).getType(), null, null, null, 29, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minerva = minerva;
        this.paymentCardStore = paymentCardStore;
        this.googlePayManager = googlePayManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        Companion companion = INSTANCE;
        paymentCardStore.refresh(((CardReplacementConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getCardId(), true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentCardStore.streamCard(((CardReplacementConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getCardId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$1(this.f$0, (PaymentCard) obj);
            }
        });
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C216382(null), 1, null).map(new Function() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final List<ApiCardColorOption> apply(PaginatedResult<ApiCardColorOption> apiCardOptions) {
                Intrinsics.checkNotNullParameter(apiCardOptions, "apiCardOptions");
                return CollectionsKt.toList(apiCardOptions.getResults());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$3(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$5(this.f$0, (Throwable) obj);
            }
        });
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$7(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$9(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo, final PaymentCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        cardReplacementConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$1$lambda$0(card, (CardReplacementConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardReplacementConfirmationViewState onStart$lambda$1$lambda$0(PaymentCard paymentCard, CardReplacementConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardReplacementConfirmationViewState.copy$default(applyMutation, paymentCard, null, null, null, null, 30, null);
    }

    /* compiled from: CardReplacementConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$onStart$2", m3645f = "CardReplacementConfirmationDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$onStart$2 */
    static final class C216382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiCardColorOption>>, Object> {
        int label;

        C216382(Continuation<? super C216382> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardReplacementConfirmationDuxo.this.new C216382(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiCardColorOption>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiCardColorOption>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiCardColorOption>> continuation) {
            return ((C216382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = CardReplacementConfirmationDuxo.this.minerva;
            this.label = 1;
            Object cardColorOptions = minerva.getCardColorOptions(this);
            return cardColorOptions == coroutine_suspended ? coroutine_suspended : cardColorOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo, final List list) {
        cardReplacementConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$3$lambda$2(list, (CardReplacementConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardReplacementConfirmationViewState onStart$lambda$3$lambda$2(List list, CardReplacementConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardReplacementConfirmationViewState.copy$default(applyMutation, null, null, list, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            cardReplacementConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardReplacementConfirmationDuxo.onStart$lambda$5$lambda$4(t, (CardReplacementConfirmationViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardReplacementConfirmationViewState onStart$lambda$5$lambda$4(Throwable th, CardReplacementConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardReplacementConfirmationViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo, final List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        cardReplacementConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$7$lambda$6(tokenList, (CardReplacementConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardReplacementConfirmationViewState onStart$lambda$7$lambda$6(List list, CardReplacementConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardReplacementConfirmationViewState.copy$default(applyMutation, null, null, null, list, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        cardReplacementConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementConfirmationDuxo.onStart$lambda$9$lambda$8((CardReplacementConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardReplacementConfirmationViewState onStart$lambda$9$lambda$8(CardReplacementConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardReplacementConfirmationViewState.copy$default(applyMutation, null, null, null, null, null, 23, null);
    }

    /* compiled from: CardReplacementConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardReplacementConfirmationDuxo, CardReplacementConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardReplacementConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardReplacementConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardReplacementConfirmationFragment.Args getArgs(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo) {
            return (CardReplacementConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardReplacementConfirmationDuxo);
        }
    }
}
