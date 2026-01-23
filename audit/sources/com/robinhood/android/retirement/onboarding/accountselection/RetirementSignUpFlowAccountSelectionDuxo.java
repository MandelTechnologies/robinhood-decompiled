package com.robinhood.android.retirement.onboarding.accountselection;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.api.BrokerageAccountType;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpFlowAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionViewState;", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionEvent;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "selectAccountTypeRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/models/api/BrokerageAccountType;", "kotlin.jvm.PlatformType", "onStart", "", "onAccountTypeSelected", "brokerageAccountType", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAccountSelectionDuxo extends BaseDuxo5<AccountSelectionViewState, AccountSelectionEvent> {
    public static final int $stable = 8;
    private final RetirementOnboardingStore retirementOnboardingStore;
    private final PublishRelay<BrokerageAccountType> selectAccountTypeRelay;

    /* compiled from: RetirementSignUpFlowAccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpFlowAccountSelectionDuxo(RetirementOnboardingStore retirementOnboardingStore, DuxoBundle duxoBundle) {
        super(new AccountSelectionViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.retirementOnboardingStore = retirementOnboardingStore;
        PublishRelay<BrokerageAccountType> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.selectAccountTypeRelay = publishRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable observableOnErrorReturn = this.selectAccountTypeRelay.switchMapSingle(new Function() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends AccountSelectionEvent> apply(BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                return RetirementSignUpFlowAccountSelectionDuxo.this.retirementOnboardingStore.getRetirementSignupFlow(brokerageAccountType).map(new Function() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final AccountSelectionEvent.AccountTypeSelected apply(ApiRetirementSignUpFlow p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new AccountSelectionEvent.AccountTypeSelected(p0);
                    }
                });
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final AccountSelectionEvent.Error apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new AccountSelectionEvent.Error(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorReturn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowAccountSelectionDuxo.onStart$lambda$0(this.f$0, (AccountSelectionEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementSignUpFlowAccountSelectionDuxo retirementSignUpFlowAccountSelectionDuxo, AccountSelectionEvent accountSelectionEvent) {
        retirementSignUpFlowAccountSelectionDuxo.applyMutation(new RetirementSignUpFlowAccountSelectionDuxo2(null));
        Intrinsics.checkNotNull(accountSelectionEvent);
        retirementSignUpFlowAccountSelectionDuxo.submit(accountSelectionEvent);
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementSignUpFlowAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo$onAccountTypeSelected$1", m3645f = "RetirementSignUpFlowAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionDuxo$onAccountTypeSelected$1 */
    static final class C270531 extends ContinuationImpl7 implements Function2<AccountSelectionViewState, Continuation<? super AccountSelectionViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C270531(Continuation<? super C270531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C270531 c270531 = new C270531(continuation);
            c270531.L$0 = obj;
            return c270531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountSelectionViewState accountSelectionViewState, Continuation<? super AccountSelectionViewState> continuation) {
            return ((C270531) create(accountSelectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AccountSelectionViewState) this.L$0).copy(true);
        }
    }

    public final void onAccountTypeSelected(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        applyMutation(new C270531(null));
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                this.selectAccountTypeRelay.accept(brokerageAccountType);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException("Non-ira account types should be filtered out");
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
