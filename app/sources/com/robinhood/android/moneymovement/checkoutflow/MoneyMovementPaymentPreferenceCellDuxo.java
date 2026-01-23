package com.robinhood.android.moneymovement.checkoutflow;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetSubscriptionPaymentMethodRequestDto;
import bff_money_movement.service.p019v1.GetSubscriptionPaymentMethodResponseDto;
import bff_money_movement.service.p019v1.SubscriptionTypeDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.PackagePreloader;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceViewState;", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceEvent;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Lmicrogram/android/PackagePreloader;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "cellSelected", "", "onResume", "alertIconSelected", "onCreate", "onStop", "reloadInstrumentPreference", "fromOnResume", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MoneyMovementPaymentPreferenceCellDuxo extends BaseDuxo3<MoneyMovementPaymentPreferenceDataState, MoneyMovementPaymentPreferenceViewState, MoneyMovementPaymentPreferenceEvent> {
    public static final int $stable = 8;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final EventLogger eventLogger;
    private final PackagePreloader microgramPackagePreloader;
    private final TransferAccountStore transferAccountStore;

    /* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {80}, m3647m = "reloadInstrumentPreference")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$1 */
    static final class C221691 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C221691(Continuation<? super C221691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MoneyMovementPaymentPreferenceCellDuxo.this.reloadInstrumentPreference(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyMovementPaymentPreferenceCellDuxo(TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, PackagePreloader microgramPackagePreloader, EventLogger eventLogger, DuxoBundle duxoBundle) {
        super(new MoneyMovementPaymentPreferenceDataState(null, null, false, 4, null), new MoneyMovementPaymentPreferenceStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transferAccountStore = transferAccountStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.microgramPackagePreloader = microgramPackagePreloader;
        this.eventLogger = eventLogger;
    }

    public final void cellSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoneyMovementPaymentPreferenceCellDuxo.cellSelected$lambda$0(this.f$0, (MoneyMovementPaymentPreferenceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cellSelected$lambda$0(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, MoneyMovementPaymentPreferenceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        moneyMovementPaymentPreferenceCellDuxo.submit(new MoneyMovementPaymentPreferenceEvent.NavigateToAccountSelection(it.getPreferredAccountId()));
        PaymentPreferenceLogging.logPaymentPreferenceCellTapped(moneyMovementPaymentPreferenceCellDuxo.eventLogger, it);
        return Unit.INSTANCE;
    }

    /* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$onResume$1", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$onResume$1 */
    static final class C221681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C221681(Continuation<? super C221681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MoneyMovementPaymentPreferenceCellDuxo.this.new C221681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C221681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo = MoneyMovementPaymentPreferenceCellDuxo.this;
                this.label = 1;
                if (moneyMovementPaymentPreferenceCellDuxo.reloadInstrumentPreference(true, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C221681(null), 3, null);
    }

    public final void alertIconSelected() {
        submit(MoneyMovementPaymentPreferenceEvent.ShowAlert.INSTANCE);
        PaymentPreferenceLogging.logPaymentPreferenceCellAlertTapped(this.eventLogger);
    }

    /* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$onCreate$1", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {60, 65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$onCreate$1 */
    static final class C221671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C221671(Continuation<? super C221671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MoneyMovementPaymentPreferenceCellDuxo.this.new C221671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C221671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo.reloadInstrumentPreference$default(r7, false, r6, 1, null) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PackagePreloader packagePreloader = MoneyMovementPaymentPreferenceCellDuxo.this.microgramPackagePreloader;
                RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(MicrogramConstants.PAYMENT_PREFERENCE_MICROGRAM_APP, null, 2, null);
                this.label = 1;
                if (packagePreloader.mo28945preloadgIAlus(remoteMicrogramApplication, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
            MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo = MoneyMovementPaymentPreferenceCellDuxo.this;
            this.label = 2;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C221671(null), 3, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        withDataState(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoneyMovementPaymentPreferenceCellDuxo.onStop$lambda$1(this.f$0, (MoneyMovementPaymentPreferenceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$1(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, MoneyMovementPaymentPreferenceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaymentPreferenceLogging.logPaymentPreferenceCellDisappear(moneyMovementPaymentPreferenceCellDuxo.eventLogger, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reloadInstrumentPreference(boolean z, Continuation<? super Unit> continuation) {
        C221691 c221691;
        final Response response;
        GetSubscriptionPaymentMethodResponseDto getSubscriptionPaymentMethodResponseDto;
        if (continuation instanceof C221691) {
            c221691 = (C221691) continuation;
            int i = c221691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c221691.label = i - Integer.MIN_VALUE;
            } else {
                c221691 = new C221691(continuation);
            }
        }
        Object objGetSubscriptionPaymentMethod = c221691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c221691.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
                BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                Request<GetSubscriptionPaymentMethodRequestDto> request = new Request<>(new GetSubscriptionPaymentMethodRequestDto(null, 1, null).copy(SubscriptionTypeDto.SUBSCRIPTION_TYPE_GOLD_MEMBERSHIP), null, 2, null);
                c221691.Z$0 = z;
                c221691.label = 1;
                objGetSubscriptionPaymentMethod = bffMoneyMovementService.GetSubscriptionPaymentMethod(request, c221691);
                if (objGetSubscriptionPaymentMethod == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c221691.Z$0;
                ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
            }
            response = (Response) objGetSubscriptionPaymentMethod;
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            response = null;
        }
        if (((response == null || (getSubscriptionPaymentMethodResponseDto = (GetSubscriptionPaymentMethodResponseDto) response.getData()) == null) ? null : getSubscriptionPaymentMethodResponseDto.getPayment_instrument_id()) == null) {
            applyMutation(new C221702(null));
            submit(MoneyMovementPaymentPreferenceEvent.UnexpectedState.INSTANCE);
        } else {
            this.transferAccountStore.refresh(true);
            LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MoneyMovementPaymentPreferenceCellDuxo.reloadInstrumentPreference$lambda$4(this.f$0, response, (List) obj);
                }
            });
        }
        if (z) {
            withDataState(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MoneyMovementPaymentPreferenceCellDuxo.reloadInstrumentPreference$lambda$5(this.f$0, (MoneyMovementPaymentPreferenceDataState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object reloadInstrumentPreference$default(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return moneyMovementPaymentPreferenceCellDuxo.reloadInstrumentPreference(z, continuation);
    }

    /* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$2", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$2 */
    static final class C221702 extends ContinuationImpl7 implements Function2<MoneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C221702(Continuation<? super C221702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221702 c221702 = new C221702(continuation);
            c221702.L$0 = obj;
            return c221702;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState> continuation) {
            return ((C221702) create(moneyMovementPaymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MoneyMovementPaymentPreferenceDataState.copy$default((MoneyMovementPaymentPreferenceDataState) this.L$0, null, null, true, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reloadInstrumentPreference$lambda$4(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, Response response, List instrumentList) {
        Object next;
        Intrinsics.checkNotNullParameter(instrumentList, "instrumentList");
        Iterator it = instrumentList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((TransferAccount) next).getAccountId(), ((GetSubscriptionPaymentMethodResponseDto) response.getData()).getPayment_instrument_id())) {
                break;
            }
        }
        TransferAccount transferAccount = (TransferAccount) next;
        if (transferAccount != null) {
            moneyMovementPaymentPreferenceCellDuxo.applyMutation(new MoneyMovementPaymentPreferenceCellDuxo2(transferAccount, null));
        } else {
            moneyMovementPaymentPreferenceCellDuxo.applyMutation(new MoneyMovementPaymentPreferenceCellDuxo3(response, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reloadInstrumentPreference$lambda$5(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, MoneyMovementPaymentPreferenceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaymentPreferenceLogging.logPaymentPreferenceCellAppear(moneyMovementPaymentPreferenceCellDuxo.eventLogger, it);
        return Unit.INSTANCE;
    }
}
