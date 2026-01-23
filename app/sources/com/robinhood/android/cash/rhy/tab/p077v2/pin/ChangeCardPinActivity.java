package com.robinhood.android.cash.rhy.tab.p077v2.pin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.wizard.WizardActivity;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.p084ui.card.pin.ChangeCardPinFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChangeCardPinActivity.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020#H\u0016J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020%H\u0014J\u0010\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J\b\u0010/\u001a\u00020#H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u0010*\u001a\u00020!H\u0002J\b\u00101\u001a\u00020#H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/pin/ChangeCardPinActivity;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/wizard/WizardActivity;", "Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", "<init>", "()V", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "getPaymentCardStore", "()Lcom/robinhood/librobinhood/store/PaymentCardStore;", "setPaymentCardStore", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", ChangeCardPinActivity.EXTRA_CARD_ID, "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "cardId$delegate", "Lkotlin/Lazy;", ChangeCardPinActivity.EXTRA_CARD_IS_VIRTUAL, "", "()Z", "isVirtual$delegate", ChangeCardPinActivity.EXTRA_TYPE, "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;", "getActionType", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;", "actionType$delegate", ChangeCardPinActivity.SAVE_FIRST_PIN, "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPinEntered", "pin", "onPinCancel", "onSaveInstanceState", "outState", "onRestoreInstanceState", "onBackPressed", "submitPinChange", "restartPinChange", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChangeCardPinActivity extends WizardActivity implements ChangeCardPinFragment.Callbacks {
    private static final String EXTRA_CARD_ID = "cardId";
    private static final String EXTRA_CARD_IS_VIRTUAL = "isVirtual";
    private static final String EXTRA_TYPE = "actionType";
    private static final String SAVE_FIRST_PIN = "firstPin";
    private String firstPin;
    public PaymentCardStore paymentCardStore;
    public RxFactory rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: cardId$delegate, reason: from kotlin metadata */
    private final Lazy cardId = Activity.intentExtra(this, EXTRA_CARD_ID);

    /* renamed from: isVirtual$delegate, reason: from kotlin metadata */
    private final Lazy isVirtual = Activity.intentExtra(this, EXTRA_CARD_IS_VIRTUAL);

    /* renamed from: actionType$delegate, reason: from kotlin metadata */
    private final Lazy actionType = Activity.intentExtra(this, EXTRA_TYPE);

    /* compiled from: ChangeCardPinActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyIntentKey.ChangeCardPin.Action.values().length];
            try {
                iArr[LegacyIntentKey.ChangeCardPin.Action.CHANGE_PIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyIntentKey.ChangeCardPin.Action.SET_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getCardId() {
        return (UUID) this.cardId.getValue();
    }

    private final boolean isVirtual() {
        return ((Boolean) this.isVirtual.getValue()).booleanValue();
    }

    private final LegacyIntentKey.ChangeCardPin.Action getActionType() {
        return (LegacyIntentKey.ChangeCardPin.Action) this.actionType.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        int i2;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            if (isVirtual()) {
                i = C10285R.string.card_pin_change_entry_prompt_virtual;
            } else {
                i = C10285R.string.card_pin_change_entry_prompt;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[getActionType().ordinal()];
            if (i3 == 1) {
                i2 = C10285R.string.card_pin_change_flow_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C11257R.string.card_activation_set_pin_title;
            }
            int i4 = C10285R.id.fragment_container;
            ChangeCardPinFragment.Companion companion = ChangeCardPinFragment.INSTANCE;
            String string2 = getString(i2);
            String string3 = getString(i);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            setFragment(i4, companion.newInstance(string3, string2));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C10285R.string.card_pin_change_flow_title));
    }

    @Override // com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment.Callbacks
    public void onPinEntered(String pin) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String str = this.firstPin;
        if (str == null) {
            Fragment currentFragment = getCurrentFragment();
            Intrinsics.checkNotNull(currentFragment, "null cannot be cast to non-null type com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment");
            this.firstPin = pin;
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C10285R.id.fragment_container;
            ChangeCardPinFragment.Companion companion = ChangeCardPinFragment.INSTANCE;
            String string2 = getString(C11257R.string.card_activation_confirm_your_pin_title);
            String string3 = getString(C11257R.string.card_pin_change_confirmation_prompt);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            FragmentTransaction fragmentTransactionReplace = fragmentTransactionBeginTransaction.replace(i, companion.newInstance(string3, string2));
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(...)");
            ((ChangeCardPinFragment) currentFragment).addSharedElements(fragmentTransactionReplace);
            fragmentTransactionReplace.addToBackStack(null).commit();
            return;
        }
        if (Intrinsics.areEqual(pin, str)) {
            submitPinChange(pin);
        } else {
            ContextsUiExtensions.showShortToast(this, C11257R.string.card_pin_change_failure_not_same);
            restartPinChange();
        }
    }

    @Override // com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment.Callbacks
    public void onPinCancel() {
        this.firstPin = null;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(SAVE_FIRST_PIN, this.firstPin);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.firstPin = savedInstanceState.getString(SAVE_FIRST_PIN);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.firstPin = null;
    }

    /* compiled from: ChangeCardPinActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.pin.ChangeCardPinActivity$submitPinChange$1", m3645f = "ChangeCardPinActivity.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.pin.ChangeCardPinActivity$submitPinChange$1 */
    static final class C103141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pin;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C103141(String str, Continuation<? super C103141> continuation) {
            super(2, continuation);
            this.$pin = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChangeCardPinActivity.this.new C103141(this.$pin, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C103141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentCardStore paymentCardStore = ChangeCardPinActivity.this.getPaymentCardStore();
                UUID cardId = ChangeCardPinActivity.this.getCardId();
                String str = this.$pin;
                this.label = 1;
                if (paymentCardStore.changePin(cardId, str, this) == coroutine_suspended) {
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

    private final void submitPinChange(String pin) {
        showLoading(true);
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxCompletable$default(getRxFactory(), null, new C103141(pin, null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.pin.ChangeCardPinActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChangeCardPinActivity.submitPinChange$lambda$0(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.pin.ChangeCardPinActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeCardPinActivity.submitPinChange$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitPinChange$lambda$0(ChangeCardPinActivity changeCardPinActivity) throws Resources.NotFoundException {
        ContextsUiExtensions.showShortToast(changeCardPinActivity, C10285R.string.card_pin_change_success_message);
        changeCardPinActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitPinChange$lambda$1(ChangeCardPinActivity changeCardPinActivity, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!AbsErrorHandler.handleError$default(changeCardPinActivity.getActivityErrorHandler(), throwable, false, 2, null)) {
            throw throwable;
        }
        changeCardPinActivity.showLoading(false);
        changeCardPinActivity.restartPinChange();
        return Unit.INSTANCE;
    }

    private final void restartPinChange() {
        popEntireFragmentBackstack();
        this.firstPin = null;
    }

    /* compiled from: ChangeCardPinActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/pin/ChangeCardPinActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "EXTRA_CARD_ID", "", "EXTRA_CARD_IS_VIRTUAL", "EXTRA_TYPE", "SAVE_FIRST_PIN", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ChangeCardPin> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ChangeCardPin key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) ChangeCardPinActivity.class);
            intent.putExtra(ChangeCardPinActivity.EXTRA_CARD_ID, key.getCardId());
            intent.putExtra(ChangeCardPinActivity.EXTRA_CARD_IS_VIRTUAL, key.getIsVirtual());
            intent.putExtra(ChangeCardPinActivity.EXTRA_TYPE, key.getAction());
            return intent;
        }
    }
}
