package com.robinhood.android.rhy.cardactivation.p243ui;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationSuccessDuxo;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationSuccessFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardActivationSuccessDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/librobinhood/store/PaymentCardStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isGetPushTokenizeRequestInFlight", "", "onStart", "", "getPushTokenizeRequest", "setDayNightOverlay", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "toErrorUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CardActivationSuccessDuxo extends OldBaseDuxo<CardActivationSuccessViewState> implements HasSavedState {
    private final GooglePayManager googlePayManager;
    private boolean isGetPushTokenizeRequestInFlight;
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
    public CardActivationSuccessDuxo(GooglePayManager googlePayManager, PaymentCardStore paymentCardStore, SavedStateHandle savedStateHandle) {
        super(new CardActivationSuccessViewState(null, null, null, false, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.googlePayManager = googlePayManager;
        this.paymentCardStore = paymentCardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
        this.paymentCardStore.refresh(true);
        Observable<PaymentCard> observableDistinctUntilChanged = this.paymentCardStore.streamCard(((CardActivationSuccessFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCardId()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$5(this.f$0, (PaymentCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CardActivationSuccessDuxo cardActivationSuccessDuxo, final List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        cardActivationSuccessDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$1$lambda$0(tokenList, (CardActivationSuccessViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState onStart$lambda$1$lambda$0(List list, CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, null, null, list, false, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(CardActivationSuccessDuxo cardActivationSuccessDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        cardActivationSuccessDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$3$lambda$2((CardActivationSuccessViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState onStart$lambda$3$lambda$2(CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, null, null, null, false, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(CardActivationSuccessDuxo cardActivationSuccessDuxo, final PaymentCard paymentCard) {
        cardActivationSuccessDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.onStart$lambda$5$lambda$4(paymentCard, (CardActivationSuccessViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState onStart$lambda$5$lambda$4(PaymentCard paymentCard, CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, paymentCard, null, null, false, null, null, 62, null);
    }

    public final void getPushTokenizeRequest() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single singleDoOnSubscribe = this.paymentCardStore.streamCard(((CardActivationSuccessFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCardId()).firstOrError().flatMap(new Function() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo.getPushTokenizeRequest.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends PushTokenizeRequest> apply(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return CardActivationSuccessDuxo.this.googlePayManager.getPushTokenizeRequest(paymentCard.getId());
            }
        }).doOnSubscribe(new C273752<>());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.getPushTokenizeRequest$lambda$7(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.getPushTokenizeRequest$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CardActivationSuccessDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$getPushTokenizeRequest$2 */
    static final class C273752<T> implements Consumer {
        C273752() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardActivationSuccessDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$getPushTokenizeRequest$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardActivationSuccessDuxo.C273752.accept$lambda$0((CardActivationSuccessViewState) obj);
                }
            });
            CardActivationSuccessDuxo.this.isGetPushTokenizeRequestInFlight = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardActivationSuccessViewState accept$lambda$0(CardActivationSuccessViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CardActivationSuccessViewState.copy$default(applyMutation, null, null, null, true, null, null, 55, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeRequest$lambda$7(CardActivationSuccessDuxo cardActivationSuccessDuxo, final PushTokenizeRequest pushTokenizeRequest) {
        cardActivationSuccessDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.getPushTokenizeRequest$lambda$7$lambda$6(pushTokenizeRequest, (CardActivationSuccessViewState) obj);
            }
        });
        cardActivationSuccessDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState getPushTokenizeRequest$lambda$7$lambda$6(PushTokenizeRequest pushTokenizeRequest, CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, null, null, null, false, new UiEvent(pushTokenizeRequest), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeRequest$lambda$9(final CardActivationSuccessDuxo cardActivationSuccessDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cardActivationSuccessDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.getPushTokenizeRequest$lambda$9$lambda$8(this.f$0, throwable, (CardActivationSuccessViewState) obj);
            }
        });
        cardActivationSuccessDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState getPushTokenizeRequest$lambda$9$lambda$8(CardActivationSuccessDuxo cardActivationSuccessDuxo, Throwable th, CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, null, null, null, false, null, cardActivationSuccessDuxo.toErrorUiEvent(th), 23, null);
    }

    public final void setDayNightOverlay(final DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        applyMutation(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationSuccessDuxo.setDayNightOverlay$lambda$10(dayNightOverlay, (CardActivationSuccessViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardActivationSuccessViewState setDayNightOverlay$lambda$10(DayNightOverlay dayNightOverlay, CardActivationSuccessViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardActivationSuccessViewState.copy$default(applyMutation, null, dayNightOverlay, null, false, null, null, 61, null);
    }

    private final UiEvent<Throwable> toErrorUiEvent(Throwable th) throws Throwable {
        if (Throwables.isNetworkRelated(th)) {
            return new UiEvent<>(th);
        }
        throw th;
    }

    /* compiled from: CardActivationSuccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessDuxo;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment$Args;", "<init>", "()V", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardActivationSuccessDuxo, CardActivationSuccessFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardActivationSuccessFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardActivationSuccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardActivationSuccessFragment.Args getArgs(CardActivationSuccessDuxo cardActivationSuccessDuxo) {
            return (CardActivationSuccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardActivationSuccessDuxo);
        }
    }
}
