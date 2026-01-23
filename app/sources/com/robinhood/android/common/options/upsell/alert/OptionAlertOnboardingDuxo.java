package com.robinhood.android.common.options.upsell.alert;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionAlertOnboardingStore;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsRequest;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsRequest2;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsResponse;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionAlertOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingViewState;", "optionAlertOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;)V", "markOptionAlertOnboardingShown", "", "turnOnOptionAlert", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionAlertOnboardingDuxo extends OldBaseDuxo<OptionAlertOnboardingViewState> {
    public static final int $stable = 8;
    private final OptionsBonfireApi bonfireApi;
    private final OptionAlertOnboardingStore optionAlertOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionAlertOnboardingDuxo(OptionAlertOnboardingStore optionAlertOnboardingStore, OptionsBonfireApi bonfireApi) {
        super(new OptionAlertOnboardingViewState(null, false, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(optionAlertOnboardingStore, "optionAlertOnboardingStore");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        this.optionAlertOnboardingStore = optionAlertOnboardingStore;
        this.bonfireApi = bonfireApi;
    }

    public final void markOptionAlertOnboardingShown() {
        this.optionAlertOnboardingStore.markOptionAlertOnboardingShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionAlertOnboardingViewState turnOnOptionAlert$lambda$0(OptionAlertOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionAlertOnboardingViewState.copy$default(applyMutation, null, true, null, null, 13, null);
    }

    public final void turnOnOptionAlert() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$0((OptionAlertOnboardingViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C114732(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$3(this.f$0, (ApiToggleAllOptionsPriceMovementAlertsResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: OptionAlertOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$turnOnOptionAlert$2", m3645f = "OptionAlertOnboardingDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$turnOnOptionAlert$2 */
    static final class C114732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse>, Object> {
        int label;

        C114732(Continuation<? super C114732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionAlertOnboardingDuxo.this.new C114732(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse> continuation) {
            return ((C114732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionsBonfireApi optionsBonfireApi = OptionAlertOnboardingDuxo.this.bonfireApi;
            ApiToggleAllOptionsPriceMovementAlertsRequest apiToggleAllOptionsPriceMovementAlertsRequest = new ApiToggleAllOptionsPriceMovementAlertsRequest(ApiToggleAllOptionsPriceMovementAlertsRequest2.f5465ON);
            this.label = 1;
            Object obj2 = optionsBonfireApi.toggleAllOptionsPriceMovementAlerts(apiToggleAllOptionsPriceMovementAlertsRequest, this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnOptionAlert$lambda$3(OptionAlertOnboardingDuxo optionAlertOnboardingDuxo, ApiToggleAllOptionsPriceMovementAlertsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getFailed_toggles() != null && (!r2.isEmpty())) {
            optionAlertOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$3$lambda$1((OptionAlertOnboardingViewState) obj);
                }
            });
        } else {
            optionAlertOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$3$lambda$2((OptionAlertOnboardingViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionAlertOnboardingViewState turnOnOptionAlert$lambda$3$lambda$1(OptionAlertOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionAlertOnboardingViewState.copy$default(applyMutation, null, false, new UiEvent(new OptionAlertOnboardingDuxo2()), null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionAlertOnboardingViewState turnOnOptionAlert$lambda$3$lambda$2(OptionAlertOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionAlertOnboardingViewState.copy$default(applyMutation, null, false, null, new UiEvent(Unit.INSTANCE), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnOptionAlert$lambda$5(OptionAlertOnboardingDuxo optionAlertOnboardingDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        optionAlertOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionAlertOnboardingDuxo.turnOnOptionAlert$lambda$5$lambda$4(throwable, (OptionAlertOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionAlertOnboardingViewState turnOnOptionAlert$lambda$5$lambda$4(Throwable th, OptionAlertOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionAlertOnboardingViewState.copy$default(applyMutation, null, false, new UiEvent(th), null, 9, null);
    }
}
