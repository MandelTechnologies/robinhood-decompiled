package com.robinhood.android.acatsin.plaidintro;

import acats_aggregation.service.p001v1.AcatsAggregationService;
import acats_aggregation.service.p001v1.PlaidIntroRequestDto;
import acats_aggregation.service.p001v1.PlaidIntroResponseDto;
import acats_aggregation.service.p001v1.PlaidIntroSelectionDto;
import com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroEvent;
import com.robinhood.android.udf.BaseDuxo5;
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
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AcatsInPlaidIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroViewState;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "acatsAggregationService", "Lacats_aggregation/service/v1/AcatsAggregationService;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lacats_aggregation/service/v1/AcatsAggregationService;)V", "onStart", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPlaidIntroDuxo extends BaseDuxo5<AcatsInPlaidIntroViewState, AcatsInPlaidIntroEvent> {
    public static final int $stable = 8;
    private final AcatsAggregationService acatsAggregationService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInPlaidIntroDuxo(DuxoBundle duxoBundle, AcatsAggregationService acatsAggregationService) {
        super(new AcatsInPlaidIntroViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(acatsAggregationService, "acatsAggregationService");
        this.acatsAggregationService = acatsAggregationService;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C80151(null));
    }

    /* compiled from: AcatsInPlaidIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroDuxo$onStart$1", m3645f = "AcatsInPlaidIntroDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroDuxo$onStart$1 */
    static final class C80151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80151(Continuation<? super C80151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPlaidIntroDuxo.this.new C80151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsAggregationService acatsAggregationService = AcatsInPlaidIntroDuxo.this.acatsAggregationService;
                    PlaidIntroRequestDto plaidIntroRequestDto = new PlaidIntroRequestDto();
                    this.label = 1;
                    obj = acatsAggregationService.PlaidIntro(plaidIntroRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AcatsInPlaidIntroDuxo.this.applyMutation(new AnonymousClass1((PlaidIntroResponseDto) obj, null));
            } catch (Exception unused) {
                AcatsInPlaidIntroDuxo.this.submit(AcatsInPlaidIntroEvent.LoadingError.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInPlaidIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroDuxo$onStart$1$1", m3645f = "AcatsInPlaidIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInPlaidIntroViewState, Continuation<? super AcatsInPlaidIntroViewState>, Object> {
            final /* synthetic */ PlaidIntroResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PlaidIntroResponseDto plaidIntroResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = plaidIntroResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInPlaidIntroViewState acatsInPlaidIntroViewState, Continuation<? super AcatsInPlaidIntroViewState> continuation) {
                return ((AnonymousClass1) create(acatsInPlaidIntroViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AcatsInPlaidIntroViewState acatsInPlaidIntroViewState = (AcatsInPlaidIntroViewState) this.L$0;
                UIComponentDto body_content = this.$response.getBody_content();
                UIComponentDto.ConcreteDto concrete = body_content != null ? body_content.getConcrete() : null;
                if (concrete == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                UIComponentDto footer_content = this.$response.getFooter_content();
                UIComponentDto.ConcreteDto concrete2 = footer_content != null ? footer_content.getConcrete() : null;
                if (concrete2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                PlaidIntroSelectionDto plaid_selection = this.$response.getPlaid_selection();
                if (plaid_selection == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                PlaidIntroSelectionDto manual_selection = this.$response.getManual_selection();
                if (manual_selection != null) {
                    return acatsInPlaidIntroViewState.copy(new PlaidIntroScreenData(concrete, concrete2, plaid_selection, manual_selection));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
