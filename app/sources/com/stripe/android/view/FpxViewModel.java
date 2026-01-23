package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FpxViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/view/FpxViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "publishableKey", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Landroid/app/Application;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)V", "_fpxBankStatues", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/model/BankStatuses;", "fpxBankStatues", "Lkotlinx/coroutines/flow/StateFlow;", "getFpxBankStatues", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedPosition", "", "getSelectedPosition$payments_core_release", "()Ljava/lang/Integer;", "setSelectedPosition$payments_core_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class FpxViewModel extends AndroidViewModel {
    private final StateFlow2<BankStatuses> _fpxBankStatues;
    private final StateFlow<BankStatuses> fpxBankStatues;
    private final String publishableKey;
    private Integer selectedPosition;
    private final StripeRepository stripeRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpxViewModel(Application application, String publishableKey, StripeRepository stripeRepository) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.publishableKey = publishableKey;
        this.stripeRepository = stripeRepository;
        StateFlow2<BankStatuses> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._fpxBankStatues = stateFlow2MutableStateFlow;
        this.fpxBankStatues = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C426761(null), 3, null);
    }

    /* renamed from: getSelectedPosition$payments_core_release, reason: from getter */
    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition$payments_core_release(Integer num) {
        this.selectedPosition = num;
    }

    public final StateFlow<BankStatuses> getFpxBankStatues() {
        return this.fpxBankStatues;
    }

    /* compiled from: FpxViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.FpxViewModel$1", m3645f = "FpxViewModel.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.FpxViewModel$1 */
    static final class C426761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C426761(Continuation<? super C426761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FpxViewModel.this.new C426761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            StateFlow2 stateFlow2;
            Object bankStatuses;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow22 = FpxViewModel.this._fpxBankStatues;
                StripeRepository stripeRepository = FpxViewModel.this.stripeRepository;
                ApiRequest.Options options = new ApiRequest.Options(FpxViewModel.this.publishableKey, null, null, 6, null);
                this.L$0 = stateFlow22;
                this.label = 1;
                Object objMo26881getFpxBankStatusgIAlus = stripeRepository.mo26881getFpxBankStatusgIAlus(options, this);
                if (objMo26881getFpxBankStatusgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stateFlow2 = stateFlow22;
                bankStatuses = objMo26881getFpxBankStatusgIAlus;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateFlow2 = (StateFlow2) this.L$0;
                ResultKt.throwOnFailure(obj);
                bankStatuses = ((Result) obj).getValue();
            }
            if (Result.m28553exceptionOrNullimpl(bankStatuses) != null) {
                bankStatuses = new BankStatuses(null, 1, null);
            }
            stateFlow2.setValue(bankStatuses);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FpxViewModel.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/view/FpxViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Application application;

        public Factory(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            final String publishableKey = PaymentConfiguration.INSTANCE.getInstance(this.application).getPublishableKey();
            return new FpxViewModel(this.application, publishableKey, new StripeApiRepository(this.application, new Function0<String>() { // from class: com.stripe.android.view.FpxViewModel$Factory$create$stripeRepository$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return publishableKey;
                }
            }, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }
}
