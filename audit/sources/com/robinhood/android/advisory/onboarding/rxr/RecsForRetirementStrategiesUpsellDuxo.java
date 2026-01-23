package com.robinhood.android.advisory.onboarding.rxr;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetRXRStrategiesUpsellRequestDto;
import advisory.proto.p008v1.GetRXRStrategiesUpsellResponseDto;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.RecsForRetirementStrategiesUpsellKey;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchViewModel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RecsForRetirementStrategiesUpsellDuxo extends BaseDuxo<RecsForRetirementStrategiesUpsellDataState, RecsForRetirementStrategiesUpsellViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AdvisoryService advisoryService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {38}, m3647m = "fetchViewModel")
    /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$fetchViewModel$1 */
    static final class C91281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C91281(Continuation<? super C91281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecsForRetirementStrategiesUpsellDuxo.this.fetchViewModel(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsForRetirementStrategiesUpsellDuxo(AccountProvider accountProvider, AdvisoryService advisoryService, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RecsForRetirementStrategiesUpsellDataState(((RecsForRetirementStrategiesUpsellKey) INSTANCE.getArgs(savedStateHandle)).getSource(), null, null, null, 14, null), RecsForRetirementStrategiesUpsellDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.advisoryService = advisoryService;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchViewModel(Continuation<? super Unit> continuation) {
        C91281 c91281;
        if (continuation instanceof C91281) {
            c91281 = (C91281) continuation;
            int i = c91281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c91281.label = i - Integer.MIN_VALUE;
            } else {
                c91281 = new C91281(continuation);
            }
        }
        Object objGetRXRStrategiesUpsell = c91281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c91281.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
                AdvisoryService advisoryService = this.advisoryService;
                GetRXRStrategiesUpsellRequestDto getRXRStrategiesUpsellRequestDto = new GetRXRStrategiesUpsellRequestDto(((RecsForRetirementStrategiesUpsellKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber());
                c91281.label = 1;
                objGetRXRStrategiesUpsell = advisoryService.GetRXRStrategiesUpsell(getRXRStrategiesUpsellRequestDto, c91281);
                if (objGetRXRStrategiesUpsell == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
            }
            applyMutation(new C91292(RecsForRetirementStrategiesUpsellViewModel2.toUiModel((GetRXRStrategiesUpsellResponseDto) objGetRXRStrategiesUpsell), null));
        } catch (Exception e) {
            applyMutation(new C91303(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$fetchViewModel$2", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$fetchViewModel$2 */
    static final class C91292 extends ContinuationImpl7 implements Function2<RecsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState>, Object> {
        final /* synthetic */ RecsForRetirementStrategiesUpsellViewModel $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C91292(RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, Continuation<? super C91292> continuation) {
            super(2, continuation);
            this.$result = recsForRetirementStrategiesUpsellViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91292 c91292 = new C91292(this.$result, continuation);
            c91292.L$0 = obj;
            return c91292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RecsForRetirementStrategiesUpsellDataState recsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState> continuation) {
            return ((C91292) create(recsForRetirementStrategiesUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RecsForRetirementStrategiesUpsellDataState.copy$default((RecsForRetirementStrategiesUpsellDataState) this.L$0, null, this.$result, null, null, 13, null);
        }
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$fetchViewModel$3", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$fetchViewModel$3 */
    static final class C91303 extends ContinuationImpl7 implements Function2<RecsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3917$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C91303(Exception exc, Continuation<? super C91303> continuation) {
            super(2, continuation);
            this.f3917$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91303 c91303 = new C91303(this.f3917$e, continuation);
            c91303.L$0 = obj;
            return c91303;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RecsForRetirementStrategiesUpsellDataState recsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState> continuation) {
            return ((C91303) create(recsForRetirementStrategiesUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RecsForRetirementStrategiesUpsellDataState.copy$default((RecsForRetirementStrategiesUpsellDataState) this.L$0, null, null, null, this.f3917$e, 7, null);
        }
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1 */
    static final class C91311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C91311(Continuation<? super C91311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91311 c91311 = RecsForRetirementStrategiesUpsellDuxo.this.new C91311(continuation);
            c91311.L$0 = obj;
            return c91311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$1", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecsForRetirementStrategiesUpsellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recsForRetirementStrategiesUpsellDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo = this.this$0;
                    this.label = 1;
                    if (recsForRetirementStrategiesUpsellDuxo.fetchViewModel(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(RecsForRetirementStrategiesUpsellDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(RecsForRetirementStrategiesUpsellDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecsForRetirementStrategiesUpsellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recsForRetirementStrategiesUpsellDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccount(((RecsForRetirementStrategiesUpsellKey) RecsForRetirementStrategiesUpsellDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BrokerageAccountType>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    BrokerageAccountType brokerageAccountType = ((Account) obj).getBrokerageAccountType();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(brokerageAccountType, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super BrokerageAccountType> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    C495892 c495892 = new C495892(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c495892, this) == coroutine_suspended) {
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

            /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$2", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C495892 extends ContinuationImpl7 implements Function2<BrokerageAccountType, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RecsForRetirementStrategiesUpsellDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495892(RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo, Continuation<? super C495892> continuation) {
                    super(2, continuation);
                    this.this$0 = recsForRetirementStrategiesUpsellDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495892 c495892 = new C495892(this.this$0, continuation);
                    c495892.L$0 = obj;
                    return c495892;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BrokerageAccountType brokerageAccountType, Continuation<? super Unit> continuation) {
                    return ((C495892) create(brokerageAccountType, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$2$1", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$onStart$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RecsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState>, Object> {
                    final /* synthetic */ BrokerageAccountType $brokerageAccountType;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BrokerageAccountType brokerageAccountType, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$brokerageAccountType = brokerageAccountType;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$brokerageAccountType, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(RecsForRetirementStrategiesUpsellDataState recsForRetirementStrategiesUpsellDataState, Continuation<? super RecsForRetirementStrategiesUpsellDataState> continuation) {
                        return ((AnonymousClass1) create(recsForRetirementStrategiesUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return RecsForRetirementStrategiesUpsellDataState.copy$default((RecsForRetirementStrategiesUpsellDataState) this.L$0, null, null, this.$brokerageAccountType, null, 11, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BrokerageAccountType) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C91311(null));
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$retry$1", m3645f = "RecsForRetirementStrategiesUpsellDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellDuxo$retry$1 */
    static final class C91321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C91321(Continuation<? super C91321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecsForRetirementStrategiesUpsellDuxo.this.new C91321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo = RecsForRetirementStrategiesUpsellDuxo.this;
                this.label = 1;
                if (recsForRetirementStrategiesUpsellDuxo.fetchViewModel(this) == coroutine_suspended) {
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

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C91321(null), 3, null);
    }

    /* compiled from: RecsForRetirementStrategiesUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDuxo;", "Lcom/robinhood/android/advisory/contracts/RecsForRetirementStrategiesUpsellKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecsForRetirementStrategiesUpsellDuxo, RecsForRetirementStrategiesUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsForRetirementStrategiesUpsellKey getArgs(SavedStateHandle savedStateHandle) {
            return (RecsForRetirementStrategiesUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsForRetirementStrategiesUpsellKey getArgs(RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo) {
            return (RecsForRetirementStrategiesUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, recsForRetirementStrategiesUpsellDuxo);
        }
    }
}
