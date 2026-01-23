package com.robinhood.android.mcduckling.card.help.p179ui;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.mcduckling.card.help.p179ui.CardAddToGooglePayDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardAddToGooglePayDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardAddToGooglePayDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardAddToGooglePayViewState;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "<init>", "(Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/librobinhood/store/PaymentCardStore;)V", "isGetPushTokenizeRequestInFlight", "", "getPushTokenizeEvent", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardAddToGooglePayDuxo extends OldBaseDuxo<CardAddToGooglePayViewState> {
    public static final int $stable = 8;
    private final GooglePayManager googlePayManager;
    private boolean isGetPushTokenizeRequestInFlight;
    private final PaymentCardStore paymentCardStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardAddToGooglePayDuxo(GooglePayManager googlePayManager, PaymentCardStore paymentCardStore) {
        super(new CardAddToGooglePayViewState(false, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        this.googlePayManager = googlePayManager;
        this.paymentCardStore = paymentCardStore;
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single singleDoFinally = this.paymentCardStore.streamActiveCashManagementCard().firstOrError().flatMap(new Function() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo.getPushTokenizeEvent.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends PushTokenizeRequest> apply(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return CardAddToGooglePayDuxo.this.googlePayManager.getPushTokenizeRequest(paymentCard.getId());
            }
        }).doOnSubscribe(new C216312<>()).doFinally(new C216323());
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardAddToGooglePayDuxo.getPushTokenizeEvent$lambda$1(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardAddToGooglePayDuxo.getPushTokenizeEvent$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CardAddToGooglePayDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$getPushTokenizeEvent$2 */
    static final class C216312<T> implements Consumer {
        C216312() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardAddToGooglePayDuxo.this.isGetPushTokenizeRequestInFlight = true;
            CardAddToGooglePayDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$getPushTokenizeEvent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardAddToGooglePayDuxo.C216312.accept$lambda$0((CardAddToGooglePayViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardAddToGooglePayViewState accept$lambda$0(CardAddToGooglePayViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CardAddToGooglePayViewState.copy$default(applyMutation, true, null, null, 6, null);
        }
    }

    /* compiled from: CardAddToGooglePayDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$getPushTokenizeEvent$3 */
    static final class C216323 implements Action {
        C216323() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            CardAddToGooglePayDuxo.this.isGetPushTokenizeRequestInFlight = false;
            CardAddToGooglePayDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$getPushTokenizeEvent$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardAddToGooglePayDuxo.C216323.run$lambda$0((CardAddToGooglePayViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardAddToGooglePayViewState run$lambda$0(CardAddToGooglePayViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CardAddToGooglePayViewState.copy$default(applyMutation, false, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$1(CardAddToGooglePayDuxo cardAddToGooglePayDuxo, final PushTokenizeRequest pushTokenizeRequest) {
        cardAddToGooglePayDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardAddToGooglePayDuxo.getPushTokenizeEvent$lambda$1$lambda$0(pushTokenizeRequest, (CardAddToGooglePayViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardAddToGooglePayViewState getPushTokenizeEvent$lambda$1$lambda$0(PushTokenizeRequest pushTokenizeRequest, CardAddToGooglePayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardAddToGooglePayViewState.copy$default(applyMutation, false, new UiEvent(pushTokenizeRequest), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$3(CardAddToGooglePayDuxo cardAddToGooglePayDuxo, final Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        if (Throwables.isNetworkRelated(error)) {
            cardAddToGooglePayDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardAddToGooglePayDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardAddToGooglePayDuxo.getPushTokenizeEvent$lambda$3$lambda$2(error, (CardAddToGooglePayViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardAddToGooglePayViewState getPushTokenizeEvent$lambda$3$lambda$2(Throwable th, CardAddToGooglePayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CardAddToGooglePayViewState.copy$default(applyMutation, false, null, new UiEvent(th), 3, null);
    }
}
