package com.robinhood.android.isa.onboarding;

import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountResponseDto;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.isa.onboarding.IsaSignUpDuxo3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.isa.IsaEligibilityStore;
import com.robinhood.store.isa.IsaPromotionStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpViewState;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "isaEligibilityStore", "Lcom/robinhood/store/isa/IsaEligibilityStore;", "promotionStore", "Lcom/robinhood/store/isa/IsaPromotionStore;", "stateProvider", "Lcom/robinhood/android/isa/onboarding/IsaSignUpStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/isa/IsaEligibilityStore;Lcom/robinhood/store/isa/IsaPromotionStore;Lcom/robinhood/android/isa/onboarding/IsaSignUpStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "checkEligibility", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaSignUpDuxo extends BaseDuxo3<IsaSignUpDataState, IsaSignUpViewState, IsaSignUpDuxo3> {
    public static final int $stable = 8;
    private final IsaEligibilityStore isaEligibilityStore;
    private final IsaPromotionStore promotionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaSignUpDuxo(IsaEligibilityStore isaEligibilityStore, IsaPromotionStore promotionStore, IsaSignUpDuxo4 stateProvider, DuxoBundle duxoBundle) {
        super(new IsaSignUpDataState(false, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(isaEligibilityStore, "isaEligibilityStore");
        Intrinsics.checkNotNullParameter(promotionStore, "promotionStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.isaEligibilityStore = isaEligibilityStore;
        this.promotionStore = promotionStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C199611(null));
    }

    /* compiled from: IsaSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1 */
    static final class C199611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C199611(Continuation<? super C199611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaSignUpDuxo.this.new C199611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C199611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IsaSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "promotion", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IsaPromotion, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaSignUpDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IsaSignUpDuxo isaSignUpDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = isaSignUpDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IsaPromotion isaPromotion, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(isaPromotion, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IsaSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1$1$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502491 extends ContinuationImpl7 implements Function2<IsaSignUpDataState, Continuation<? super IsaSignUpDataState>, Object> {
                final /* synthetic */ IsaPromotion $promotion;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502491(IsaPromotion isaPromotion, Continuation<? super C502491> continuation) {
                    super(2, continuation);
                    this.$promotion = isaPromotion;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502491 c502491 = new C502491(this.$promotion, continuation);
                    c502491.L$0 = obj;
                    return c502491;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaSignUpDataState isaSignUpDataState, Continuation<? super IsaSignUpDataState> continuation) {
                    return ((C502491) create(isaSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaSignUpDataState.copy$default((IsaSignUpDataState) this.L$0, false, this.$promotion, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502491((IsaPromotion) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<IsaPromotion> flowStreamPromotion = IsaSignUpDuxo.this.promotionStore.streamPromotion();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IsaSignUpDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamPromotion, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: IsaSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1 */
    static final class C199601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C199601(Continuation<? super C199601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaSignUpDuxo.this.new C199601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C199601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AsyncResult<IsUserEligibleForAccountResponseDto>> eligibility = IsaSignUpDuxo.this.isaEligibilityStore.getEligibility();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IsaSignUpDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eligibility, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IsaSignUpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AsyncResult<? extends IsUserEligibleForAccountResponseDto>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaSignUpDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IsaSignUpDuxo isaSignUpDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = isaSignUpDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<IsUserEligibleForAccountResponseDto> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends IsUserEligibleForAccountResponseDto> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<IsUserEligibleForAccountResponseDto>) asyncResult, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AsyncResult asyncResult = (AsyncResult) this.L$0;
                if (asyncResult instanceof AsyncResult.Loading) {
                    this.this$0.applyMutation(new C502481(null));
                } else if (asyncResult instanceof AsyncResult.Success) {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                    AsyncResult.Success success = (AsyncResult.Success) asyncResult;
                    if (((IsUserEligibleForAccountResponseDto) success.getValue()).is_eligible()) {
                        this.this$0.submit(IsaSignUpDuxo3.Onboarding.INSTANCE);
                    } else {
                        String info_sheet_id = ((IsUserEligibleForAccountResponseDto) success.getValue()).getInfo_sheet_id();
                        if (!StringsKt.isBlank(info_sheet_id)) {
                            this.this$0.submit(new IsaSignUpDuxo3.InfoSheet(info_sheet_id));
                        } else {
                            this.this$0.submit(IsaSignUpDuxo3.Error.INSTANCE);
                        }
                    }
                } else if (asyncResult instanceof AsyncResult.Failure) {
                    this.this$0.applyMutation(new AnonymousClass3(null));
                    this.this$0.submit(IsaSignUpDuxo3.Error.INSTANCE);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }

            /* compiled from: IsaSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$1", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502481 extends ContinuationImpl7 implements Function2<IsaSignUpDataState, Continuation<? super IsaSignUpDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C502481(Continuation<? super C502481> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502481 c502481 = new C502481(continuation);
                    c502481.L$0 = obj;
                    return c502481;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaSignUpDataState isaSignUpDataState, Continuation<? super IsaSignUpDataState> continuation) {
                    return ((C502481) create(isaSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaSignUpDataState.copy$default((IsaSignUpDataState) this.L$0, true, null, 2, null);
                }
            }

            /* compiled from: IsaSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$2", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IsaSignUpDataState, Continuation<? super IsaSignUpDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaSignUpDataState isaSignUpDataState, Continuation<? super IsaSignUpDataState> continuation) {
                    return ((AnonymousClass2) create(isaSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaSignUpDataState.copy$default((IsaSignUpDataState) this.L$0, false, null, 2, null);
                }
            }

            /* compiled from: IsaSignUpDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$3", m3645f = "IsaSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpDuxo$checkEligibility$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<IsaSignUpDataState, Continuation<? super IsaSignUpDataState>, Object> {
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
                public final Object invoke(IsaSignUpDataState isaSignUpDataState, Continuation<? super IsaSignUpDataState> continuation) {
                    return ((AnonymousClass3) create(isaSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaSignUpDataState.copy$default((IsaSignUpDataState) this.L$0, false, null, 2, null);
                }
            }
        }
    }

    public final void checkEligibility() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C199601(null), 3, null);
    }
}
