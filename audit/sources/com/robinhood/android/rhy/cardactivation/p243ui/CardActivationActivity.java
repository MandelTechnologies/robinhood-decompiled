package com.robinhood.android.rhy.cardactivation.p243ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.mcduckling.p084ui.card.pin.ChangeCardPinFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationLocationProtectionFragment;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationSplashFragment;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationSuccessFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardActivationActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001RB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010<\u001a\u00020=H\u0014J\b\u0010>\u001a\u00020=H\u0014J\u0010\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020-H\u0016J\u0010\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020=H\u0016J\u0010\u0010H\u001a\u00020=2\u0006\u0010I\u001a\u00020/H\u0016J\b\u0010J\u001a\u00020=H\u0016J\b\u0010K\u001a\u00020=H\u0016J\t\u0010L\u001a\u00020-H\u0096\u0001R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\fR\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010.R/\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u000f\u001a\u0004\u0018\u00010/8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0017\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Callbacks;", "<init>", "()V", "cardIdExtra", "Ljava/util/UUID;", "getCardIdExtra", "()Ljava/util/UUID;", "cardIdExtra$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "paymentCard", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "setPaymentCard", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "paymentCard$delegate", "Lkotlin/properties/ReadWriteProperty;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "getPaymentCardStore", "()Lcom/robinhood/librobinhood/store/PaymentCardStore;", "setPaymentCardStore", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;)V", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "getMinervaAccountStore", "()Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "setMinervaAccountStore", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "cardId", "getCardId", "isPinSet", "", "()Z", "", "proposedPin", "getProposedPin", "()Ljava/lang/String;", "setProposedPin", "(Ljava/lang/String;)V", "proposedPin$delegate", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showLoading", "show", "onResumeFragment", "fragment", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "onSplashContinue", "onPinEntered", "pin", "onPinCancel", "onLocationProtectionConfigured", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CardActivationActivity extends BaseActivity implements RegionGated, WizardFragment.Callbacks, CardActivationSplashFragment.Callbacks, ChangeCardPinFragment.Callbacks, CardActivationLocationProtectionFragment.Callbacks {
    private static final String EXTRA_CARD_ID = "extraCardId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: cardIdExtra$delegate, reason: from kotlin metadata */
    private final Lazy cardIdExtra;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;
    public MinervaAccountStore minervaAccountStore;

    /* renamed from: paymentCard$delegate, reason: from kotlin metadata */
    private final Interfaces3 paymentCard;
    public PaymentCardStore paymentCardStore;

    /* renamed from: proposedPin$delegate, reason: from kotlin metadata */
    private final Interfaces3 proposedPin;
    public RxFactory rxFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardActivationActivity.class, "paymentCard", "getPaymentCard()Lcom/robinhood/models/db/mcduckling/PaymentCard;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardActivationActivity.class, "proposedPin", "getProposedPin()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(CardActivationActivity.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardFragment.Callbacks
    public void onResumeFragment(WizardFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    public CardActivationActivity() {
        super(C27358R.layout.activity_card_activation);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.cardIdExtra = Activity.intentExtra(this, EXTRA_CARD_ID);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.paymentCard = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.proposedPin = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[1]);
        this.loadingView = bindView(C27358R.id.loading_view);
    }

    private final UUID getCardIdExtra() {
        return (UUID) this.cardIdExtra.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentCard getPaymentCard() {
        return (PaymentCard) this.paymentCard.getValue(this, $$delegatedProperties[0]);
    }

    private final void setPaymentCard(PaymentCard paymentCard) {
        this.paymentCard.setValue(this, $$delegatedProperties[0], paymentCard);
    }

    public final PaymentCardStore getPaymentCardStore() {
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        if (paymentCardStore != null) {
            return paymentCardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentCardStore");
        return null;
    }

    public final void setPaymentCardStore(PaymentCardStore paymentCardStore) {
        Intrinsics.checkNotNullParameter(paymentCardStore, "<set-?>");
        this.paymentCardStore = paymentCardStore;
    }

    public final MinervaAccountStore getMinervaAccountStore() {
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore;
        if (minervaAccountStore != null) {
            return minervaAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minervaAccountStore");
        return null;
    }

    public final void setMinervaAccountStore(MinervaAccountStore minervaAccountStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "<set-?>");
        this.minervaAccountStore = minervaAccountStore;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    @Override // com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment.Callbacks
    public UUID getCardId() {
        PaymentCard paymentCard = getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        return paymentCard.getId();
    }

    @Override // com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment.Callbacks
    public boolean isPinSet() {
        PaymentCard paymentCard = getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        return paymentCard.isPinSet();
    }

    private final String getProposedPin() {
        return (String) this.proposedPin.getValue(this, $$delegatedProperties[1]);
    }

    private final void setProposedPin(String str) {
        this.proposedPin.setValue(this, $$delegatedProperties[1], str);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getMinervaAccountStore().refresh(true);
        getPaymentCardStore().refresh(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        Observable<PaymentCard> observableStreamActiveCashManagementCard;
        super.onResume();
        UUID cardIdExtra = getCardIdExtra();
        if (cardIdExtra == null || (observableStreamActiveCashManagementCard = getPaymentCardStore().streamCard(cardIdExtra)) == null) {
            observableStreamActiveCashManagementCard = getPaymentCardStore().streamActiveCashManagementCard();
        }
        Observable<PaymentCard> observableDistinctUntilChanged = observableStreamActiveCashManagementCard.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableDoFinally = ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity.onResume.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CardActivationActivity.this.showProgressBar(true);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity.onResume.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                CardActivationActivity.this.showProgressBar(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoFinally, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationActivity.onResume$lambda$1(this.f$0, (PaymentCard) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationActivity.onResume$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(CardActivationActivity cardActivationActivity, PaymentCard paymentCard) {
        Fragment fragmentNewInstance;
        cardActivationActivity.setPaymentCard(paymentCard);
        if (cardActivationActivity.getCurrentFragment() == null) {
            if (!paymentCard.getCanActivate()) {
                CardActivationSuccessFragment.Companion companion = CardActivationSuccessFragment.INSTANCE;
                PaymentCard paymentCard2 = cardActivationActivity.getPaymentCard();
                Intrinsics.checkNotNull(paymentCard2);
                fragmentNewInstance = (WizardFragment) companion.newInstance((Parcelable) new CardActivationSuccessFragment.Args(paymentCard2.getId()));
            } else {
                fragmentNewInstance = CardActivationSplashFragment.INSTANCE.newInstance();
            }
            cardActivationActivity.replaceFragmentWithoutBackStack(fragmentNewInstance);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(CardActivationActivity cardActivationActivity, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!AbsErrorHandler.handleError$default(cardActivationActivity.getActivityErrorHandler(), t, false, 2, null)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardFragment.Callbacks
    public void showLoading(boolean show) {
        if (show) {
            getLoadingView().show();
        } else {
            getLoadingView().hide();
        }
    }

    /* compiled from: CardActivationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$onSplashContinue$1", m3645f = "CardActivationActivity.kt", m3646l = {123}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$onSplashContinue$1 */
    static final class C273631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C273631(Continuation<? super C273631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardActivationActivity.this.new C273631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentCardStore paymentCardStore = CardActivationActivity.this.getPaymentCardStore();
                UUID cardId = CardActivationActivity.this.getCardId();
                this.label = 1;
                if (paymentCardStore.activateCard(cardId, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment.Callbacks
    public void onSplashContinue() {
        Completable completableDoFinally = CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(RxFactory.DefaultImpls.rxCompletable$default(getRxFactory(), null, new C273631(null), 1, null), 1000L, null, 2, null)).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity.onSplashContinue.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CardActivationActivity.this.showProgressBar(true);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity.onSplashContinue.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                CardActivationActivity.this.showProgressBar(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardActivationActivity.onSplashContinue$lambda$3(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationActivity.onSplashContinue$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSplashContinue$lambda$3(CardActivationActivity cardActivationActivity) {
        Fragment fragmentNewInstance;
        PaymentCard paymentCard = cardActivationActivity.getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        if (paymentCard.isPinSet()) {
            CardActivationLocationProtectionFragment.Companion companion = CardActivationLocationProtectionFragment.INSTANCE;
            PaymentCard paymentCard2 = cardActivationActivity.getPaymentCard();
            Intrinsics.checkNotNull(paymentCard2);
            fragmentNewInstance = (WizardFragment) companion.newInstance((Parcelable) new CardActivationLocationProtectionFragment.Args(paymentCard2.getAccountId()));
        } else {
            ChangeCardPinFragment.Companion companion2 = ChangeCardPinFragment.INSTANCE;
            String string2 = cardActivationActivity.getString(C27358R.string.card_activation_set_pin_subtitle);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            fragmentNewInstance = companion2.newInstance(string2, cardActivationActivity.getString(C11257R.string.card_activation_set_pin_title));
        }
        cardActivationActivity.replaceFragmentWithoutBackStack(fragmentNewInstance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSplashContinue$lambda$4(CardActivationActivity cardActivationActivity, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!AbsErrorHandler.handleError$default(cardActivationActivity.getActivityErrorHandler(), throwable, false, 2, null)) {
            throw throwable;
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment.Callbacks
    public void onPinEntered(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (getProposedPin() == null) {
            setProposedPin(pin);
            String string2 = getString(C27358R.string.card_activation_confirm_your_pin_subtitle);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(C11257R.string.card_activation_confirm_your_pin_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            replaceFragment(ChangeCardPinFragment.INSTANCE.newInstance(string2, string3));
            return;
        }
        if (!Intrinsics.areEqual(pin, getProposedPin())) {
            Toast.makeText(this, C11257R.string.card_pin_change_failure_not_same, 0).show();
            setProposedPin(null);
            popLastFragment();
        } else {
            showLoading(true);
            Completable completableDoFinally = CompletablesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxCompletable$default(getRxFactory(), null, new C273591(pin, null), 1, null)).doFinally(new Action() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity.onPinEntered.2
                @Override // io.reactivex.functions.Action
                public final void run() {
                    CardActivationActivity.this.showLoading(false);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
            LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardActivationActivity.onPinEntered$lambda$5(this.f$0);
                }
            }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardActivationActivity.onPinEntered$lambda$6(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* compiled from: CardActivationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$onPinEntered$1", m3645f = "CardActivationActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationActivity$onPinEntered$1 */
    static final class C273591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pin;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C273591(String str, Continuation<? super C273591> continuation) {
            super(2, continuation);
            this.$pin = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardActivationActivity.this.new C273591(this.$pin, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentCardStore paymentCardStore = CardActivationActivity.this.getPaymentCardStore();
                PaymentCard paymentCard = CardActivationActivity.this.getPaymentCard();
                Intrinsics.checkNotNull(paymentCard);
                UUID id = paymentCard.getId();
                String str = this.$pin;
                this.label = 1;
                if (paymentCardStore.changePin(id, str, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPinEntered$lambda$5(CardActivationActivity cardActivationActivity) {
        CardActivationLocationProtectionFragment.Companion companion = CardActivationLocationProtectionFragment.INSTANCE;
        PaymentCard paymentCard = cardActivationActivity.getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        cardActivationActivity.replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new CardActivationLocationProtectionFragment.Args(paymentCard.getAccountId())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPinEntered$lambda$6(CardActivationActivity cardActivationActivity, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!AbsErrorHandler.handleError$default(cardActivationActivity.getActivityErrorHandler(), throwable, false, 2, null)) {
            throw throwable;
        }
        cardActivationActivity.setProposedPin(null);
        cardActivationActivity.popLastFragment();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment.Callbacks
    public void onPinCancel() {
        setProposedPin(null);
    }

    @Override // com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment.Callbacks
    public void onLocationProtectionConfigured() {
        CardActivationSuccessFragment.Companion companion = CardActivationSuccessFragment.INSTANCE;
        PaymentCard paymentCard = getPaymentCard();
        Intrinsics.checkNotNull(paymentCard);
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new CardActivationSuccessFragment.Args(paymentCard.getId())));
    }

    /* compiled from: CardActivationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ActivateCard;", "<init>", "()V", "EXTRA_CARD_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ActivateCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ActivateCard key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) CardActivationActivity.class);
            intent.putExtra(CardActivationActivity.EXTRA_CARD_ID, key.getCardId());
            return intent;
        }
    }
}
