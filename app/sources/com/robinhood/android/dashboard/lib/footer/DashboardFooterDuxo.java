package com.robinhood.android.dashboard.lib.footer;

import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterResponseDto;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DashboardFooterDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterViewState;", "accountOnboardingStore", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DashboardFooterDuxo extends BaseDuxo4<DashboardFooterViewState> {
    public static final int $stable = 8;
    private final AccountOnboardingStore accountOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DashboardFooterDuxo(AccountOnboardingStore accountOnboardingStore, DuxoBundle duxoBundle) {
        super(new DashboardFooterViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountOnboardingStore = accountOnboardingStore;
    }

    /* compiled from: DashboardFooterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1", m3645f = "DashboardFooterDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1 */
    static final class C137371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137371(String str, Continuation<? super C137371> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardFooterDuxo.this.new C137371(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<AccountDashboardFooterResponseDto> flowStreamAccountDashboardFooter = DashboardFooterDuxo.this.accountOnboardingStore.streamAccountDashboardFooter(this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(DashboardFooterDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamAccountDashboardFooter, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                DashboardFooterDuxo.this.applyMutation(new AnonymousClass3(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DashboardFooterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$1", m3645f = "DashboardFooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountDashboardFooterResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardFooterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardFooterDuxo dashboardFooterDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardFooterDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountDashboardFooterResponseDto accountDashboardFooterResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accountDashboardFooterResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardFooterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$1$1", m3645f = "DashboardFooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498381 extends ContinuationImpl7 implements Function2<DashboardFooterViewState, Continuation<? super DashboardFooterViewState>, Object> {
                final /* synthetic */ AccountDashboardFooterResponseDto $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498381(AccountDashboardFooterResponseDto accountDashboardFooterResponseDto, Continuation<? super C498381> continuation) {
                    super(2, continuation);
                    this.$response = accountDashboardFooterResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498381 c498381 = new C498381(this.$response, continuation);
                    c498381.L$0 = obj;
                    return c498381;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardFooterViewState dashboardFooterViewState, Continuation<? super DashboardFooterViewState> continuation) {
                    return ((C498381) create(dashboardFooterViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((DashboardFooterViewState) this.L$0).copy(extensions2.toImmutableList(this.$response.getFooter_contents()));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498381((AccountDashboardFooterResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: DashboardFooterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$3", m3645f = "DashboardFooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<DashboardFooterViewState, Continuation<? super DashboardFooterViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DashboardFooterViewState dashboardFooterViewState, Continuation<? super DashboardFooterViewState> continuation) {
                return ((AnonymousClass3) create(dashboardFooterViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((DashboardFooterViewState) this.L$0).copy(extensions2.persistentListOf());
            }
        }
    }

    public final Job bind(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C137371(accountNumber, null), 3, null);
    }
}
