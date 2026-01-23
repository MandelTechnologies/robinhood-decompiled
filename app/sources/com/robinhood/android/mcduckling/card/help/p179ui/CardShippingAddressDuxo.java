package com.robinhood.android.mcduckling.card.help.p179ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.mcduckling.card.help.p179ui.CardShippingAddressFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.ApiShippingUpdateRequest;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
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

/* compiled from: CardShippingAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setShippingAddress", "shippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardShippingAddressDuxo extends OldBaseDuxo<CardShippingAddressViewState> implements HasSavedState {
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentCardStore paymentCardStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardShippingAddressDuxo(MinervaAccountStore minervaAccountStore, PaymentCardStore paymentCardStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new CardShippingAddressViewState(((CardShippingAddressFragment.Args) INSTANCE.getArgs(savedStateHandle)).getReplacementType(), null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minervaAccountStore = minervaAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$1(this.f$0, (User) obj);
            }
        });
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        Companion companion = INSTANCE;
        PaymentCardStore.refresh$default(paymentCardStore, ((CardShippingAddressFragment.Args) companion.getArgs((HasSavedState) this)).getCardId(), false, 2, null);
        Observable<R> map = this.paymentCardStore.streamCard(((CardShippingAddressFragment.Args) companion.getArgs((HasSavedState) this)).getCardId()).map(new Function() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((PaymentCard) it).getShippingUpdateRequestId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CardShippingAddressDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFlatMap = ObservablesKt.filterIsPresent(map).distinctUntilChanged().flatMap(new Function() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$onCreate$minervaShippingAddressObs$2

            /* compiled from: CardShippingAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$onCreate$minervaShippingAddressObs$2$1", m3645f = "CardShippingAddressDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$onCreate$minervaShippingAddressObs$2$1 */
            static final class C216451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiShippingUpdateRequest>, Object> {
                final /* synthetic */ UUID $updateRequestId;
                int label;
                final /* synthetic */ CardShippingAddressDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C216451(CardShippingAddressDuxo cardShippingAddressDuxo, UUID uuid, Continuation<? super C216451> continuation) {
                    super(2, continuation);
                    this.this$0 = cardShippingAddressDuxo;
                    this.$updateRequestId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C216451(this.this$0, this.$updateRequestId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiShippingUpdateRequest> continuation) {
                    return ((C216451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    MinervaAccountStore minervaAccountStore = this.this$0.minervaAccountStore;
                    UUID uuid = this.$updateRequestId;
                    Intrinsics.checkNotNull(uuid);
                    this.label = 1;
                    Object shippingUpdateRequest = minervaAccountStore.getShippingUpdateRequest(uuid, this);
                    return shippingUpdateRequest == coroutine_suspended ? coroutine_suspended : shippingUpdateRequest;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiShippingUpdateRequest> apply(UUID updateRequestId) {
                Intrinsics.checkNotNullParameter(updateRequestId, "updateRequestId");
                CardShippingAddressDuxo cardShippingAddressDuxo = this.this$0;
                return RxFactory.DefaultImpls.rxSingle$default(cardShippingAddressDuxo, null, new C216451(cardShippingAddressDuxo, updateRequestId, null), 1, null).toObservable();
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$2((CardShippingAddressViewState) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableFlatMap);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableFlatMap, this.userStore.getUser()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$4(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CardShippingAddressDuxo cardShippingAddressDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        cardShippingAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$1$lambda$0(user, (CardShippingAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardShippingAddressViewState onCreate$lambda$1$lambda$0(User user, CardShippingAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardShippingAddressViewState.copy$default(applyMutation, null, user, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardShippingAddressViewState onCreate$lambda$2(CardShippingAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardShippingAddressViewState.copy$default(applyMutation, null, null, null, null, null, null, true, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CardShippingAddressDuxo cardShippingAddressDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final ApiShippingUpdateRequest apiShippingUpdateRequest = (ApiShippingUpdateRequest) tuples2.component1();
        final User user = (User) tuples2.component2();
        cardShippingAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$4$lambda$3(user, apiShippingUpdateRequest, (CardShippingAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardShippingAddressViewState onCreate$lambda$4$lambda$3(User user, ApiShippingUpdateRequest apiShippingUpdateRequest, CardShippingAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardShippingAddressViewState.copy$default(applyMutation, null, user, apiShippingUpdateRequest, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(CardShippingAddressDuxo cardShippingAddressDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cardShippingAddressDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.onCreate$lambda$6$lambda$5(throwable, (CardShippingAddressViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardShippingAddressViewState onCreate$lambda$6$lambda$5(Throwable th, CardShippingAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardShippingAddressViewState.copy$default(applyMutation, null, null, null, null, null, null, false, new UiEvent(th), 63, null);
    }

    public final void setShippingAddress(final CardShippingAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressDuxo.setShippingAddress$lambda$7(shippingAddress, (CardShippingAddressViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardShippingAddressViewState setShippingAddress$lambda$7(CardShippingAddress cardShippingAddress, CardShippingAddressViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardShippingAddressViewState.copy$default(applyMutation, null, null, null, cardShippingAddress.getMailingAddress(), cardShippingAddress.getId(), Boolean.valueOf(cardShippingAddress.isBillingAddress()), false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, null);
    }

    /* compiled from: CardShippingAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardShippingAddressDuxo, CardShippingAddressFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardShippingAddressFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardShippingAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardShippingAddressFragment.Args getArgs(CardShippingAddressDuxo cardShippingAddressDuxo) {
            return (CardShippingAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardShippingAddressDuxo);
        }
    }
}
