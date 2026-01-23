package com.robinhood.android.advisory.withdrawal;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetFullWithdrawalSummaryRequestDto;
import advisory.proto.p008v1.GetFullWithdrawalSummaryResponseDto;
import advisory.proto.p008v1.IRADistributionDataDto;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.CreateTransferResult;
import com.robinhood.android.lib.transfers.TransferData;
import com.robinhood.android.lib.transfers.TransferDataExtensions;
import com.robinhood.android.lib.transfers.TransferFactoryForV2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import p479j$.time.Year;
import yoda.service.Yoda;
import yoda.service.withdrawal.GetAccountTransferSummaryRequestDto;
import yoda.service.withdrawal.GetAccountTransferSummaryResponseDto;

/* compiled from: AdvisoryFullWithdrawalDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001,BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "Lcom/robinhood/android/udf/HasSavedState;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferFactory", "Lyoda/service/Yoda;", "yodaService", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;Lyoda/service/Yoda;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "fetchSummary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "()V", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "", "resubmissionAfter3ds", "withdrawAndCloseAccount", "(Z)V", "invalidateCurrentTransfer", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "Ladvisory/proto/v1/AdvisoryService;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "Lyoda/service/Yoda;", "Lcom/robinhood/android/lib/transfers/TransferData;", "lastAttemptedTransfer", "Lcom/robinhood/android/lib/transfers/TransferData;", "Companion", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFullWithdrawalDuxo extends BaseDuxo3<AdvisoryFullWithdrawalDataState, AdvisoryFullWithdrawalViewState, CreateTransferResult.Required> implements HasSavedState {
    private final AdvisoryService advisoryService;
    private final Clock clock;
    private TransferData lastAttemptedTransfer;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;
    private final TransferFactoryForV2 transferFactory;
    private final Yoda yodaService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {69}, m3647m = "fetchSummary")
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$fetchSummary$1 */
    static final class C94921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C94921(Continuation<? super C94921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryFullWithdrawalDuxo.this.fetchSummary(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFullWithdrawalDuxo(SavedStateHandle savedStateHandle, Clock clock, AdvisoryService advisoryService, TransferAccountStore transferAccountStore, TransferFactoryForV2 transferFactory, Yoda yodaService, DuxoBundle duxoBundle) {
        super(new AdvisoryFullWithdrawalDataState(null, null, false, 7, null), AdvisoryFullWithdrawalDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
        Intrinsics.checkNotNullParameter(yodaService, "yodaService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.advisoryService = advisoryService;
        this.transferAccountStore = transferAccountStore;
        this.transferFactory = transferFactory;
        this.yodaService = yodaService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSummary(Continuation<? super Unit> continuation) {
        C94921 c94921;
        if (continuation instanceof C94921) {
            c94921 = (C94921) continuation;
            int i = c94921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c94921.label = i - Integer.MIN_VALUE;
            } else {
                c94921 = new C94921(continuation);
            }
        }
        Object objGetFullWithdrawalSummary = c94921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c94921.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
                Companion companion = INSTANCE;
                ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = ((AdvisoryFullWithdrawalKey) companion.getArgs((HasSavedState) this)).getIraDistributionData();
                GetFullWithdrawalSummaryRequestDto getFullWithdrawalSummaryRequestDto = new GetFullWithdrawalSummaryRequestDto(((AdvisoryFullWithdrawalKey) companion.getArgs((HasSavedState) this)).getManagedAccountNumber(), iraDistributionData != null ? new IRADistributionDataDto(iraDistributionData.getFederal_tax_withholding_percent().doubleValue(), iraDistributionData.getState_tax_withholding_percent().doubleValue(), iraDistributionData.getState()) : null);
                AdvisoryService advisoryService = this.advisoryService;
                c94921.label = 1;
                objGetFullWithdrawalSummary = advisoryService.GetFullWithdrawalSummary(getFullWithdrawalSummaryRequestDto, c94921);
                if (objGetFullWithdrawalSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
            }
            applyMutation(new C94932((GetFullWithdrawalSummaryResponseDto) objGetFullWithdrawalSummary, null));
        } catch (Exception e) {
            applyMutation(new C94943(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$fetchSummary$2", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$fetchSummary$2 */
    static final class C94932 extends ContinuationImpl7 implements Function2<AdvisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState>, Object> {
        final /* synthetic */ GetFullWithdrawalSummaryResponseDto $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C94932(GetFullWithdrawalSummaryResponseDto getFullWithdrawalSummaryResponseDto, Continuation<? super C94932> continuation) {
            super(2, continuation);
            this.$response = getFullWithdrawalSummaryResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94932 c94932 = new C94932(this.$response, continuation);
            c94932.L$0 = obj;
            return c94932;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState> continuation) {
            return ((C94932) create(advisoryFullWithdrawalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFullWithdrawalDataState.copy$default((AdvisoryFullWithdrawalDataState) this.L$0, FullWithdrawalSummary2.toUiModel(this.$response), null, false, 6, null);
        }
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$fetchSummary$3", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$fetchSummary$3 */
    static final class C94943 extends ContinuationImpl7 implements Function2<AdvisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3919$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C94943(Exception exc, Continuation<? super C94943> continuation) {
            super(2, continuation);
            this.f3919$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94943 c94943 = new C94943(this.f3919$e, continuation);
            c94943.L$0 = obj;
            return c94943;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState> continuation) {
            return ((C94943) create(advisoryFullWithdrawalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFullWithdrawalDataState.copy$default((AdvisoryFullWithdrawalDataState) this.L$0, null, this.f3919$e, false, 5, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        TransferAccountStore.refresh$default(this.transferAccountStore, false, 1, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94951(null));
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$onStart$1", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$onStart$1 */
    static final class C94951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94951(Continuation<? super C94951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94951 c94951 = AdvisoryFullWithdrawalDuxo.this.new C94951(continuation);
            c94951.L$0 = obj;
            return c94951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$onStart$1$1", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryFullWithdrawalDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisoryFullWithdrawalDuxo;
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
                    AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo = this.this$0;
                    this.label = 1;
                    if (advisoryFullWithdrawalDuxo.fetchSummary(this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AdvisoryFullWithdrawalDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$retry$1", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$retry$1 */
    static final class C94961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C94961(Continuation<? super C94961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryFullWithdrawalDuxo.this.new C94961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo = AdvisoryFullWithdrawalDuxo.this;
                this.label = 1;
                if (advisoryFullWithdrawalDuxo.fetchSummary(this) == coroutine_suspended) {
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C94961(null), 3, null);
    }

    public static /* synthetic */ void withdrawAndCloseAccount$default(AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        advisoryFullWithdrawalDuxo.withdrawAndCloseAccount(z);
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {105, 192, 144}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1 */
    static final class C94971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $resubmissionAfter3ds;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C94971(boolean z, Continuation<? super C94971> continuation) {
            super(2, continuation);
            this.$resubmissionAfter3ds = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryFullWithdrawalDuxo.this.new C94971(this.$resubmissionAfter3ds, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$1", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState> continuation) {
                return ((AnonymousClass1) create(advisoryFullWithdrawalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AdvisoryFullWithdrawalDataState.copy$default((AdvisoryFullWithdrawalDataState) this.L$0, null, null, true, 3, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:54:0x0167, B:56:0x016d, B:57:0x0172, B:15:0x002f, B:29:0x008f, B:31:0x0093, B:32:0x0097, B:33:0x00a0, B:35:0x00a6, B:39:0x00c5, B:40:0x00d0, B:42:0x00d6, B:46:0x00f5, B:50:0x00fe, B:70:0x0195, B:71:0x01c7, B:16:0x0035, B:22:0x006b, B:24:0x0073, B:26:0x0079, B:19:0x0048), top: B:75:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:54:0x0167, B:56:0x016d, B:57:0x0172, B:15:0x002f, B:29:0x008f, B:31:0x0093, B:32:0x0097, B:33:0x00a0, B:35:0x00a6, B:39:0x00c5, B:40:0x00d0, B:42:0x00d6, B:46:0x00f5, B:50:0x00fe, B:70:0x0195, B:71:0x01c7, B:16:0x0035, B:22:0x006b, B:24:0x0073, B:26:0x0079, B:19:0x0048), top: B:75:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:54:0x0167, B:56:0x016d, B:57:0x0172, B:15:0x002f, B:29:0x008f, B:31:0x0093, B:32:0x0097, B:33:0x00a0, B:35:0x00a6, B:39:0x00c5, B:40:0x00d0, B:42:0x00d6, B:46:0x00f5, B:50:0x00fe, B:70:0x0195, B:71:0x01c7, B:16:0x0035, B:22:0x006b, B:24:0x0073, B:26:0x0079, B:19:0x0048), top: B:75:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:54:0x0167, B:56:0x016d, B:57:0x0172, B:15:0x002f, B:29:0x008f, B:31:0x0093, B:32:0x0097, B:33:0x00a0, B:35:0x00a6, B:39:0x00c5, B:40:0x00d0, B:42:0x00d6, B:46:0x00f5, B:50:0x00fe, B:70:0x0195, B:71:0x01c7, B:16:0x0035, B:22:0x006b, B:24:0x0073, B:26:0x0079, B:19:0x0048), top: B:75:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00c4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00f4 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objGetAccountTransferSummary;
            IdlDecimal amount;
            Object objAwaitFirstOrNull;
            List listEmptyList;
            Iterator it;
            Object next;
            TransferAccount transferAccount;
            Iterator it2;
            Object next2;
            TransferAccount transferAccount2;
            Object objCreateTransferSkippingOptionalChecks;
            TransferData transferData;
            CreateTransferResult.Required required;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, new EventMetadata(SentryTeam.RAD, null, null, 6, null), 2, null);
                AdvisoryFullWithdrawalDuxo.this.submit(new CreateTransferResult.Failure.Generic(e));
                AdvisoryFullWithdrawalDuxo.this.applyMutation(new AnonymousClass4(null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryFullWithdrawalDuxo.this.applyMutation(new AnonymousClass1(null));
                Yoda yoda2 = AdvisoryFullWithdrawalDuxo.this.yodaService;
                GetAccountTransferSummaryRequestDto getAccountTransferSummaryRequestDto = new GetAccountTransferSummaryRequestDto(((AdvisoryFullWithdrawalKey) AdvisoryFullWithdrawalDuxo.INSTANCE.getArgs((HasSavedState) AdvisoryFullWithdrawalDuxo.this)).getManagedAccountNumber());
                this.label = 1;
                objGetAccountTransferSummary = yoda2.GetAccountTransferSummary(getAccountTransferSummaryRequestDto, this);
                if (objGetAccountTransferSummary == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transferData = (TransferData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objCreateTransferSkippingOptionalChecks = obj;
                    required = (CreateTransferResult.Required) objCreateTransferSkippingOptionalChecks;
                    if (required instanceof CreateTransferResult.Failure.ThreeDs) {
                        AdvisoryFullWithdrawalDuxo.this.lastAttemptedTransfer = transferData;
                    }
                    AdvisoryFullWithdrawalDuxo.this.submit(required);
                    AdvisoryFullWithdrawalDuxo.this.applyMutation(new AnonymousClass3(null));
                    return Unit.INSTANCE;
                }
                amount = (IdlDecimal) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitFirstOrNull = obj;
                listEmptyList = (List) objAwaitFirstOrNull;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo = AdvisoryFullWithdrawalDuxo.this;
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((TransferAccount) next).getAccountId(), ((AdvisoryFullWithdrawalKey) AdvisoryFullWithdrawalDuxo.INSTANCE.getArgs((HasSavedState) advisoryFullWithdrawalDuxo)).getSinkAccountId())) {
                        break;
                    }
                }
                transferAccount = (TransferAccount) next;
                AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo2 = AdvisoryFullWithdrawalDuxo.this;
                it2 = listEmptyList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((TransferAccount) next2).getAccountNumber(), ((AdvisoryFullWithdrawalKey) AdvisoryFullWithdrawalDuxo.INSTANCE.getArgs((HasSavedState) advisoryFullWithdrawalDuxo2)).getManagedAccountNumber())) {
                        break;
                    }
                }
                transferAccount2 = (TransferAccount) next2;
                if (amount != null || transferAccount == null || transferAccount2 == null) {
                    String str = "Transfer amount from yoda is null";
                    if (amount == null) {
                        str = null;
                    }
                    String str2 = "Sink account is null";
                    if (transferAccount == null) {
                        str2 = null;
                    }
                    String str3 = "Source account is null";
                    if (transferAccount2 == null) {
                        str3 = null;
                    }
                    throw new IllegalStateException(("Cannot initiate transfer request: " + CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), null, null, null, 0, null, null, 63, null)).toString());
                }
                BigDecimal bigDecimalOrThrow = amount.toBigDecimalOrThrow();
                TransferDirectionV2 transferDirectionV2 = TransferDirectionV2.WITHDRAW;
                ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
                AchTransferOption achTransferOption = AchTransferOption.STANDARD;
                Companion companion = AdvisoryFullWithdrawalDuxo.INSTANCE;
                ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = ((AdvisoryFullWithdrawalKey) companion.getArgs((HasSavedState) AdvisoryFullWithdrawalDuxo.this)).getIraDistributionData();
                Year yearNow = Year.now(AdvisoryFullWithdrawalDuxo.this.clock);
                Intrinsics.checkNotNullExpressionValue(yearNow, "now(...)");
                TransferData transferData2 = new TransferData(bigDecimalOrThrow, transferDirectionV2, transferAccount2, transferAccount, apiCreateTransferRequest2, achTransferOption, iraDistributionData, null, ((AdvisoryFullWithdrawalKey) companion.getArgs((HasSavedState) AdvisoryFullWithdrawalDuxo.this)).getEntryPoint(), null, null, yearNow, false, null, null, boxing.boxBoolean(true), 20480, null);
                TransferFactoryForV2 transferFactoryForV2 = AdvisoryFullWithdrawalDuxo.this.transferFactory;
                boolean z = this.$resubmissionAfter3ds;
                final AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo3 = AdvisoryFullWithdrawalDuxo.this;
                Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function1 = new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AdvisoryFullWithdrawalDuxo.C94971.invokeSuspend$lambda$6(advisoryFullWithdrawalDuxo3, (ApiCreateTransferRequest) obj2);
                    }
                };
                this.L$0 = transferData2;
                this.label = 3;
                objCreateTransferSkippingOptionalChecks = transferFactoryForV2.createTransferSkippingOptionalChecks(transferData2, z, function1, this);
                if (objCreateTransferSkippingOptionalChecks != coroutine_suspended) {
                    transferData = transferData2;
                    required = (CreateTransferResult.Required) objCreateTransferSkippingOptionalChecks;
                    if (required instanceof CreateTransferResult.Failure.ThreeDs) {
                    }
                    AdvisoryFullWithdrawalDuxo.this.submit(required);
                    AdvisoryFullWithdrawalDuxo.this.applyMutation(new AnonymousClass3(null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            objGetAccountTransferSummary = obj;
            MoneyDto withdrawable_amount = ((GetAccountTransferSummaryResponseDto) objGetAccountTransferSummary).getWithdrawable_amount();
            amount = withdrawable_amount != null ? withdrawable_amount.getAmount() : null;
            Observable<List<TransferAccount>> observableStream = AdvisoryFullWithdrawalDuxo.this.transferAccountStore.stream();
            this.L$0 = amount;
            this.label = 2;
            objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStream, this);
            if (objAwaitFirstOrNull != coroutine_suspended) {
                listEmptyList = (List) objAwaitFirstOrNull;
                if (listEmptyList == null) {
                }
                AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo4 = AdvisoryFullWithdrawalDuxo.this;
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                transferAccount = (TransferAccount) next;
                AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo22 = AdvisoryFullWithdrawalDuxo.this;
                it2 = listEmptyList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                transferAccount2 = (TransferAccount) next2;
                if (amount != null) {
                }
                String str4 = "Transfer amount from yoda is null";
                if (amount == null) {
                }
                String str22 = "Sink account is null";
                if (transferAccount == null) {
                }
                String str32 = "Source account is null";
                if (transferAccount2 == null) {
                }
                throw new IllegalStateException(("Cannot initiate transfer request: " + CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str4, str22, str32}), null, null, null, 0, null, null, 63, null)).toString());
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserInteractionEventData invokeSuspend$lambda$6(AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo, ApiCreateTransferRequest apiCreateTransferRequest) {
            return new UserInteractionEventData(null, new Screen(Screen.Name.ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TransferDataExtensions.toTransferContext$default(apiCreateTransferRequest, ((AdvisoryFullWithdrawalKey) AdvisoryFullWithdrawalDuxo.INSTANCE.getArgs((HasSavedState) advisoryFullWithdrawalDuxo)).getEntryPoint(), MAXTransferContext.TransferV2Direction.WITHDRAWAL, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), null, null, 109, null);
        }

        /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$3", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AdvisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState>, Object> {
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
            public final Object invoke(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState> continuation) {
                return ((AnonymousClass3) create(advisoryFullWithdrawalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AdvisoryFullWithdrawalDataState.copy$default((AdvisoryFullWithdrawalDataState) this.L$0, null, null, false, 3, null);
            }
        }

        /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$4", m3645f = "AdvisoryFullWithdrawalDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalDuxo$withdrawAndCloseAccount$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<AdvisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AdvisoryFullWithdrawalDataState advisoryFullWithdrawalDataState, Continuation<? super AdvisoryFullWithdrawalDataState> continuation) {
                return ((AnonymousClass4) create(advisoryFullWithdrawalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AdvisoryFullWithdrawalDataState.copy$default((AdvisoryFullWithdrawalDataState) this.L$0, null, null, false, 3, null);
            }
        }
    }

    public final void withdrawAndCloseAccount(boolean resubmissionAfter3ds) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C94971(resubmissionAfter3ds, null), 3, null);
    }

    public final void invalidateCurrentTransfer() {
        TransferData transferData = this.lastAttemptedTransfer;
        if (transferData != null) {
            this.transferFactory.invalidatePreviousState(transferData);
        }
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;", "<init>", "()V", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryFullWithdrawalDuxo, AdvisoryFullWithdrawalKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFullWithdrawalKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryFullWithdrawalKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFullWithdrawalKey getArgs(AdvisoryFullWithdrawalDuxo advisoryFullWithdrawalDuxo) {
            return (AdvisoryFullWithdrawalKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryFullWithdrawalDuxo);
        }
    }
}
