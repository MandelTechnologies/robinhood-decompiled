package com.robinhood.android.investFlow.frequency;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Account;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowFrequencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "Lcom/robinhood/android/investFlow/frequency/FrequencyViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "onStart", "()V", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "selectedFrequency", "onFrequencyUpdated", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "frequency", "onFrequencyClicked", "(Lcom/robinhood/android/investFlow/frequency/Frequency;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "onStartDateSelected", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowFrequencyDuxo extends BaseDuxo<InvestFlowFrequencyDataState, FrequencyViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvestFlowFrequencyDuxo(AccountProvider accountProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        InvestFlowFrequencyDataState.Companion companion = InvestFlowFrequencyDataState.INSTANCE;
        super(companion.from((InvestFlowFrequencyArgs) INSTANCE.getArgs(savedStateHandle)), companion.getStateProvider(), duxoBundle);
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccount(((InvestFlowFrequencyArgs) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowFrequencyDuxo.onStart$lambda$0(this.f$0, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(InvestFlowFrequencyDuxo investFlowFrequencyDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        investFlowFrequencyDuxo.applyMutation(new InvestFlowFrequencyDuxo2(account, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowFrequencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onFrequencyUpdated$1", m3645f = "InvestFlowFrequencyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onFrequencyUpdated$1 */
    static final class C193691 extends ContinuationImpl7 implements Function2<InvestFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState>, Object> {
        final /* synthetic */ InvestFlowFrequency $selectedFrequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C193691(InvestFlowFrequency investFlowFrequency, Continuation<? super C193691> continuation) {
            super(2, continuation);
            this.$selectedFrequency = investFlowFrequency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193691 c193691 = new C193691(this.$selectedFrequency, continuation);
            c193691.L$0 = obj;
            return c193691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestFlowFrequencyDataState investFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState> continuation) {
            return ((C193691) create(investFlowFrequencyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((InvestFlowFrequencyDataState) this.L$0).mutateFromInvestFlowFrequency(this.$selectedFrequency);
        }
    }

    public final void onFrequencyUpdated(InvestFlowFrequency selectedFrequency) {
        applyMutation(new C193691(selectedFrequency, null));
    }

    /* compiled from: InvestFlowFrequencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onFrequencyClicked$1", m3645f = "InvestFlowFrequencyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onFrequencyClicked$1 */
    static final class C193681 extends ContinuationImpl7 implements Function2<InvestFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState>, Object> {
        final /* synthetic */ Frequency $frequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C193681(Frequency frequency, Continuation<? super C193681> continuation) {
            super(2, continuation);
            this.$frequency = frequency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193681 c193681 = new C193681(this.$frequency, continuation);
            c193681.L$0 = obj;
            return c193681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestFlowFrequencyDataState investFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState> continuation) {
            return ((C193681) create(investFlowFrequencyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((InvestFlowFrequencyDataState) this.L$0).mutateFrequency(this.$frequency);
        }
    }

    public final void onFrequencyClicked(Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new C193681(frequency, null));
    }

    /* compiled from: InvestFlowFrequencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onStartDateSelected$1", m3645f = "InvestFlowFrequencyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDuxo$onStartDateSelected$1 */
    static final class C193701 extends ContinuationImpl7 implements Function2<InvestFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState>, Object> {
        final /* synthetic */ LocalDate $date;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C193701(LocalDate localDate, Continuation<? super C193701> continuation) {
            super(2, continuation);
            this.$date = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193701 c193701 = new C193701(this.$date, continuation);
            c193701.L$0 = obj;
            return c193701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestFlowFrequencyDataState investFlowFrequencyDataState, Continuation<? super InvestFlowFrequencyDataState> continuation) {
            return ((C193701) create(investFlowFrequencyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestFlowFrequencyDataState.copy$default((InvestFlowFrequencyDataState) this.L$0, false, null, null, this.$date, false, null, 55, null);
        }
    }

    public final void onStartDateSelected(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        applyMutation(new C193701(date, null));
    }

    /* compiled from: InvestFlowFrequencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDuxo;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowFrequencyDuxo, InvestFlowFrequencyArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowFrequencyArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowFrequencyArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowFrequencyArgs getArgs(InvestFlowFrequencyDuxo investFlowFrequencyDuxo) {
            return (InvestFlowFrequencyArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowFrequencyDuxo);
        }
    }
}
