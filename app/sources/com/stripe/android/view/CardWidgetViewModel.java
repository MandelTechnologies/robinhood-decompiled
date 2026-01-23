package com.stripe.android.view;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.view.CardWidgetViewModel;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CardWidgetViewModel.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/view/CardWidgetViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentConfigProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_isCbcEligible", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_onBehalfOf", "", "isCbcEligible", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "onBehalfOf", "getOnBehalfOf", "()Ljava/lang/String;", "determineCbcEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEligibility", "", "setOnBehalfOf", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CardWidgetViewModel extends ViewModel {
    private final StateFlow2<Boolean> _isCbcEligible;
    private String _onBehalfOf;
    private final CoroutineDispatcher dispatcher;
    private final StateFlow<Boolean> isCbcEligible;
    private final Provider<PaymentConfiguration> paymentConfigProvider;
    private final StripeRepository stripeRepository;

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.CardWidgetViewModel", m3645f = "CardWidgetViewModel.kt", m3646l = {60}, m3647m = "determineCbcEligibility")
    /* renamed from: com.stripe.android.view.CardWidgetViewModel$determineCbcEligibility$1 */
    static final class C426711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C426711(Continuation<? super C426711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardWidgetViewModel.this.determineCbcEligibility(this);
        }
    }

    public /* synthetic */ CardWidgetViewModel(Provider provider, StripeRepository stripeRepository, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, stripeRepository, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public CardWidgetViewModel(Provider<PaymentConfiguration> paymentConfigProvider, StripeRepository stripeRepository, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentConfigProvider, "paymentConfigProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentConfigProvider = paymentConfigProvider;
        this.stripeRepository = stripeRepository;
        this.dispatcher = dispatcher;
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this._isCbcEligible = stateFlow2MutableStateFlow;
        this.isCbcEligible = stateFlow2MutableStateFlow;
        getEligibility();
    }

    public final StateFlow<Boolean> isCbcEligible() {
        return this.isCbcEligible;
    }

    /* renamed from: getOnBehalfOf, reason: from getter */
    public final String get_onBehalfOf() {
        return this._onBehalfOf;
    }

    public final void setOnBehalfOf(String onBehalfOf) {
        this._onBehalfOf = onBehalfOf;
        getEligibility();
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.CardWidgetViewModel$getEligibility$1", m3645f = "CardWidgetViewModel.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.CardWidgetViewModel$getEligibility$1 */
    static final class C426721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C426721(Continuation<? super C426721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardWidgetViewModel.this.new C426721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            StateFlow2 stateFlow2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow22 = CardWidgetViewModel.this._isCbcEligible;
                CardWidgetViewModel cardWidgetViewModel = CardWidgetViewModel.this;
                this.L$0 = stateFlow22;
                this.label = 1;
                Object objDetermineCbcEligibility = cardWidgetViewModel.determineCbcEligibility(this);
                if (objDetermineCbcEligibility == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stateFlow2 = stateFlow22;
                obj = objDetermineCbcEligibility;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateFlow2 = (StateFlow2) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            stateFlow2.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    private final void getEligibility() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C426721(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object determineCbcEligibility(Continuation<? super Boolean> continuation) {
        C426711 c426711;
        Object objMo26884retrieveCardElementConfig0E7RQCE;
        MobileCardElementConfig.CardBrandChoice cardBrandChoice;
        if (continuation instanceof C426711) {
            c426711 = (C426711) continuation;
            int i = c426711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c426711.label = i - Integer.MIN_VALUE;
            } else {
                c426711 = new C426711(continuation);
            }
        }
        Object obj = c426711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c426711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = new ApiRequest.Options(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId(), null, 4, null);
            String str = get_onBehalfOf();
            Map<String, String> mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("on_behalf_of", str)) : null;
            c426711.label = 1;
            objMo26884retrieveCardElementConfig0E7RQCE = stripeRepository.mo26884retrieveCardElementConfig0E7RQCE(options, mapMapOf, c426711);
            if (objMo26884retrieveCardElementConfig0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo26884retrieveCardElementConfig0E7RQCE = ((Result) obj).getValue();
        }
        MobileCardElementConfig mobileCardElementConfig = (MobileCardElementConfig) (Result.m28555isFailureimpl(objMo26884retrieveCardElementConfig0E7RQCE) ? null : objMo26884retrieveCardElementConfig0E7RQCE);
        return boxing.boxBoolean((mobileCardElementConfig == null || (cardBrandChoice = mobileCardElementConfig.getCardBrandChoice()) == null || !cardBrandChoice.getEligible()) ? false : true);
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/CardWidgetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Context context;

        public Factory(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new CardWidgetViewModel(new Provider() { // from class: com.stripe.android.view.CardWidgetViewModel$Factory$$ExternalSyntheticLambda0
                @Override // javax.inject.Provider
                public final Object get() {
                    return CardWidgetViewModel.Factory.create$lambda$0(this.f$0);
                }
            }, new StripeApiRepository(this.context, new Function0<String>() { // from class: com.stripe.android.view.CardWidgetViewModel$Factory$create$stripeRepository$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return PaymentConfiguration.INSTANCE.getInstance(this.this$0.getContext()).getPublishableKey();
                }
            }, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentConfiguration create$lambda$0(Factory this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return PaymentConfiguration.INSTANCE.getInstance(this$0.context);
        }
    }
}
