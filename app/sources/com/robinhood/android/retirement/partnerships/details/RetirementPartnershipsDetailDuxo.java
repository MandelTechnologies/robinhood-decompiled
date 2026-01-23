package com.robinhood.android.retirement.partnerships.details;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementClaimPartnershipBody;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.retirement.contracts.RetirementPartnershipDetails;
import com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.RetirementClaimPartnershipOfferAction;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementPartnershipsDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refreshData", "claimPartnershipAndDeeplink", "action", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementClaimPartnershipOfferAction;", "Companion", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementPartnershipsDetailDuxo extends BaseDuxo3<RetirementPartnershipsDetailDataState, RetirementPartnershipsDetailViewState, RetirementPartnershipsDetailEvent> implements HasSavedState {
    private final RetirementApi retirementApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RetirementPartnershipsDetailDuxo(RetirementApi retirementApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RetirementPartnershipsDetailDataState(((RetirementPartnershipDetails) companion.getArgs(savedStateHandle)).getSource(), ((RetirementPartnershipDetails) companion.getArgs(savedStateHandle)).getPartnershipDetailsViewModel(), null, false, 12, null), RetirementPartnershipsDetailDataState.INSTANCE, duxoBundle);
        this.retirementApi = retirementApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementPartnershipsDetailDuxo.onStart$lambda$0(this.f$0, (RetirementPartnershipsDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementPartnershipsDetailDuxo retirementPartnershipsDetailDuxo, RetirementPartnershipsDetailDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getResponseViewModel() == null) {
            retirementPartnershipsDetailDuxo.refreshData();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementPartnershipsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$1", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$1 */
    static final class C271511 extends ContinuationImpl7 implements Function2<RetirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C271511(Continuation<? super C271511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271511 c271511 = new C271511(continuation);
            c271511.L$0 = obj;
            return c271511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState> continuation) {
            return ((C271511) create(retirementPartnershipsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementPartnershipsDetailDataState.copy$default((RetirementPartnershipsDetailDataState) this.L$0, null, null, null, false, 9, null);
        }
    }

    public final void refreshData() {
        applyMutation(new C271511(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C271522(null), 3, null);
    }

    /* compiled from: RetirementPartnershipsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2 */
    static final class C271522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C271522(Continuation<? super C271522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementPartnershipsDetailDuxo.this.new C271522(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementApi retirementApi = RetirementPartnershipsDetailDuxo.this.retirementApi;
                    String source = ((RetirementPartnershipDetails) RetirementPartnershipsDetailDuxo.INSTANCE.getArgs((HasSavedState) RetirementPartnershipsDetailDuxo.this)).getSource();
                    this.label = 1;
                    obj = retirementApi.getRetirement1099PartnershipDetails(source, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiRetirementPartnershipDetailResponse apiRetirementPartnershipDetailResponse = (ApiRetirementPartnershipDetailResponse) obj;
                AlertAction<RetirementPartnershipDetailAction> alert = apiRetirementPartnershipDetailResponse.getAlert();
                if (apiRetirementPartnershipDetailResponse.getMobile_view_model() != null) {
                    RetirementPartnershipsDetailDuxo.this.applyMutation(new AnonymousClass1(apiRetirementPartnershipDetailResponse, null));
                } else if (alert != null) {
                    RetirementPartnershipsDetailDuxo.this.submit(new RetirementPartnershipsDetailEvent.DisplayAlert(alert));
                } else {
                    RetirementPartnershipsDetailDuxo.this.submit(RetirementPartnershipsDetailEvent.NoPartnership.INSTANCE);
                }
            } catch (Exception e) {
                RetirementPartnershipsDetailDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementPartnershipsDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2$1", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState>, Object> {
            final /* synthetic */ ApiRetirementPartnershipDetailResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRetirementPartnershipDetailResponse apiRetirementPartnershipDetailResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiRetirementPartnershipDetailResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState> continuation) {
                return ((AnonymousClass1) create(retirementPartnershipsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RetirementPartnershipsDetailDataState.copy$default((RetirementPartnershipsDetailDataState) this.L$0, null, this.$response.getMobile_view_model(), null, false, 13, null);
            }
        }

        /* compiled from: RetirementPartnershipsDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2$2", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$refreshData$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RetirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4890$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4890$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4890$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState> continuation) {
                return ((AnonymousClass2) create(retirementPartnershipsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RetirementPartnershipsDetailDataState.copy$default((RetirementPartnershipsDetailDataState) this.L$0, null, null, this.f4890$e, false, 11, null);
            }
        }
    }

    /* compiled from: RetirementPartnershipsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$1", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$1 */
    static final class C271491 extends ContinuationImpl7 implements Function2<RetirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C271491(Continuation<? super C271491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271491 c271491 = new C271491(continuation);
            c271491.L$0 = obj;
            return c271491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState> continuation) {
            return ((C271491) create(retirementPartnershipsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementPartnershipsDetailDataState.copy$default((RetirementPartnershipsDetailDataState) this.L$0, null, null, null, true, 7, null);
        }
    }

    /* compiled from: RetirementPartnershipsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$2", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$2 */
    static final class C271502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RetirementClaimPartnershipOfferAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C271502(RetirementClaimPartnershipOfferAction retirementClaimPartnershipOfferAction, Continuation<? super C271502> continuation) {
            super(2, continuation);
            this.$action = retirementClaimPartnershipOfferAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementPartnershipsDetailDuxo.this.new C271502(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementApi retirementApi = RetirementPartnershipsDetailDuxo.this.retirementApi;
                    ApiRetirementClaimPartnershipBody apiRetirementClaimPartnershipBody = new ApiRetirementClaimPartnershipBody(this.$action.getPartnership_id());
                    this.label = 1;
                    if (retirementApi.postClaimPartnership(apiRetirementClaimPartnershipBody, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((RetirementPartnershipDetails) RetirementPartnershipsDetailDuxo.INSTANCE.getArgs((HasSavedState) RetirementPartnershipsDetailDuxo.this)).isFromRetirementOnboarding()) {
                    RetirementPartnershipsDetailDuxo.this.submit(RetirementPartnershipsDetailEvent.ClaimComplete.INSTANCE);
                } else {
                    String post_action_deeplink = this.$action.getPost_action_deeplink();
                    if (post_action_deeplink != null) {
                        RetirementPartnershipsDetailDuxo.this.submit(new RetirementPartnershipsDetailEvent.Deeplink(post_action_deeplink));
                    }
                }
            } catch (Exception e) {
                RetirementPartnershipsDetailDuxo.this.submit(new RetirementPartnershipsDetailEvent.ClaimError(e));
            }
            RetirementPartnershipsDetailDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementPartnershipsDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$2$2", m3645f = "RetirementPartnershipsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailDuxo$claimPartnershipAndDeeplink$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RetirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState>, Object> {
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
            public final Object invoke(RetirementPartnershipsDetailDataState retirementPartnershipsDetailDataState, Continuation<? super RetirementPartnershipsDetailDataState> continuation) {
                return ((AnonymousClass2) create(retirementPartnershipsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RetirementPartnershipsDetailDataState.copy$default((RetirementPartnershipsDetailDataState) this.L$0, null, null, null, false, 7, null);
            }
        }
    }

    public final void claimPartnershipAndDeeplink(RetirementClaimPartnershipOfferAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new C271491(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C271502(action, null), 3, null);
    }

    /* compiled from: RetirementPartnershipsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementPartnershipDetails;", "<init>", "()V", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementPartnershipsDetailDuxo, RetirementPartnershipDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementPartnershipDetails getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementPartnershipDetails) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementPartnershipDetails getArgs(RetirementPartnershipsDetailDuxo retirementPartnershipsDetailDuxo) {
            return (RetirementPartnershipDetails) DuxoCompanion.DefaultImpls.getArgs(this, retirementPartnershipsDetailDuxo);
        }
    }
}
