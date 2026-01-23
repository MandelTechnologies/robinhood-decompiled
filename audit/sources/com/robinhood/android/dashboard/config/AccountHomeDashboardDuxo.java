package com.robinhood.android.dashboard.config;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.dashboard.HomeDashboardEvent;
import com.robinhood.android.home.contracts.AccountHomeKey;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.home.iac.events.store.Alert;
import com.robinhood.android.home.iac.events.store.HomeIacEventsStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountHomeDashboardDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardViewState;", "Lcom/robinhood/android/dashboard/HomeDashboardEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "homeEventsStore", "Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AccountHomeDashboardDuxo extends BaseDuxo5<AccountHomeDashboardViewState, HomeDashboardEvent> implements HasSavedState {
    private final HomeIacEventsStore homeEventsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountHomeDashboardDuxo(HomeIacEventsStore homeEventsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(AccountHomeDashboardViewState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(homeEventsStore, "homeEventsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.homeEventsStore = homeEventsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C136621(null));
    }

    /* compiled from: AccountHomeDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1", m3645f = "AccountHomeDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1 */
    static final class C136621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C136621(Continuation<? super C136621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C136621 c136621 = AccountHomeDashboardDuxo.this.new C136621(continuation);
            c136621.L$0 = obj;
            return c136621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C136621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountHomeDashboardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1$1", m3645f = "AccountHomeDashboardDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$repeatOnLifecycle;
            int label;
            final /* synthetic */ AccountHomeDashboardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountHomeDashboardDuxo accountHomeDashboardDuxo, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountHomeDashboardDuxo;
                this.$$this$repeatOnLifecycle = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$$this$repeatOnLifecycle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Flow<Alert> flowFlowOf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HomeDashboardType dashboardType = ((AccountHomeKey) AccountHomeDashboardDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getDashboardType();
                    if (dashboardType instanceof HomeDashboardType.Account) {
                        flowFlowOf = this.this$0.homeEventsStore.streamEvents(((HomeDashboardType.Account) dashboardType).getAccountNumber(), this.$$this$repeatOnLifecycle);
                    } else {
                        if (!(dashboardType instanceof HomeDashboardType.Nux) && !(dashboardType instanceof HomeDashboardType.PendingApplication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowFlowOf = FlowKt.flowOf((Object) null);
                    }
                    Flow flowFilterNotNull = FlowKt.filterNotNull(flowFlowOf);
                    C498141 c498141 = new C498141(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, c498141, this) == coroutine_suspended) {
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

            /* compiled from: AccountHomeDashboardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/home/iac/events/store/Alert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1$1$1", m3645f = "AccountHomeDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.config.AccountHomeDashboardDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498141 extends ContinuationImpl7 implements Function2<Alert, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountHomeDashboardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498141(AccountHomeDashboardDuxo accountHomeDashboardDuxo, Continuation<? super C498141> continuation) {
                    super(2, continuation);
                    this.this$0 = accountHomeDashboardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498141 c498141 = new C498141(this.this$0, continuation);
                    c498141.L$0 = obj;
                    return c498141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Alert alert, Continuation<? super Unit> continuation) {
                    return ((C498141) create(alert, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new HomeDashboardEvent.IacAlert((Alert) this.L$0));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AccountHomeDashboardDuxo.this, coroutineScope, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AccountHomeDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardDuxo;", "Lcom/robinhood/android/home/contracts/AccountHomeKey;", "<init>", "()V", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountHomeDashboardDuxo, AccountHomeKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountHomeKey getArgs(SavedStateHandle savedStateHandle) {
            return (AccountHomeKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountHomeKey getArgs(AccountHomeDashboardDuxo accountHomeDashboardDuxo) {
            return (AccountHomeKey) DuxoCompanion.DefaultImpls.getArgs(this, accountHomeDashboardDuxo);
        }
    }
}
