package com.robinhood.android.acats.acatsclawbackdetails;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import bonfire.proto.idl.acats.p027v1.GetAcatsClawbackDetailsRequestDto;
import bonfire.proto.idl.acats.p027v1.GetAcatsClawbackDetailsResponseDto;
import com.robinhood.android.acats.contracts.CreateTransferBonusRemovalDetailsKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
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

/* compiled from: CreateTransferBonusRemovalDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDataState;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "stateProvider", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lbonfire/proto/idl/acats/v1/AcatsService;Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class CreateTransferBonusRemovalDetailsDuxo extends BaseDuxo<CreateTransferBonusRemovalDetailsDataState, CreateTransferBonusRemovalDetailsViewState> implements HasSavedState {
    private final AcatsService acatsService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTransferBonusRemovalDetailsDuxo(AcatsService acatsService, CreateTransferBonusRemovalDetailsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CreateTransferBonusRemovalDetailsDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.acatsService = acatsService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CreateTransferBonusRemovalDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1", m3645f = "CreateTransferBonusRemovalDetailsDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1 */
    static final class C73801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C73801(Continuation<? super C73801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferBonusRemovalDetailsDuxo.this.new C73801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C73801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsService acatsService = CreateTransferBonusRemovalDetailsDuxo.this.acatsService;
                    Companion companion = CreateTransferBonusRemovalDetailsDuxo.INSTANCE;
                    GetAcatsClawbackDetailsRequestDto getAcatsClawbackDetailsRequestDto = new GetAcatsClawbackDetailsRequestDto(((CreateTransferBonusRemovalDetailsKey) companion.getArgs(CreateTransferBonusRemovalDetailsDuxo.this.getSavedStateHandle())).getClawbackId(), ((CreateTransferBonusRemovalDetailsKey) companion.getArgs(CreateTransferBonusRemovalDetailsDuxo.this.getSavedStateHandle())).getAccountNumber(), ((CreateTransferBonusRemovalDetailsKey) companion.getArgs(CreateTransferBonusRemovalDetailsDuxo.this.getSavedStateHandle())).getTransferAmount());
                    this.label = 1;
                    obj = acatsService.GetAcatsClawbackDetails(getAcatsClawbackDetailsRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CreateTransferBonusRemovalDetailsDuxo.this.applyMutation(new AnonymousClass1((GetAcatsClawbackDetailsResponseDto) obj, null));
            } catch (Exception e) {
                CreateTransferBonusRemovalDetailsDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CreateTransferBonusRemovalDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1$1", m3645f = "CreateTransferBonusRemovalDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferBonusRemovalDetailsDataState, Continuation<? super CreateTransferBonusRemovalDetailsDataState>, Object> {
            final /* synthetic */ GetAcatsClawbackDetailsResponseDto $acatsClawbackDetails;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetAcatsClawbackDetailsResponseDto getAcatsClawbackDetailsResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$acatsClawbackDetails = getAcatsClawbackDetailsResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$acatsClawbackDetails, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferBonusRemovalDetailsDataState createTransferBonusRemovalDetailsDataState, Continuation<? super CreateTransferBonusRemovalDetailsDataState> continuation) {
                return ((AnonymousClass1) create(createTransferBonusRemovalDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateTransferBonusRemovalDetailsDataState.copy$default((CreateTransferBonusRemovalDetailsDataState) this.L$0, null, this.$acatsClawbackDetails.getTitle(), this.$acatsClawbackDetails.getRows(), 1, null);
            }
        }

        /* compiled from: CreateTransferBonusRemovalDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1$2", m3645f = "CreateTransferBonusRemovalDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreateTransferBonusRemovalDetailsDataState, Continuation<? super CreateTransferBonusRemovalDetailsDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f3872$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3872$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3872$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferBonusRemovalDetailsDataState createTransferBonusRemovalDetailsDataState, Continuation<? super CreateTransferBonusRemovalDetailsDataState> continuation) {
                return ((AnonymousClass2) create(createTransferBonusRemovalDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateTransferBonusRemovalDetailsDataState.copy$default((CreateTransferBonusRemovalDetailsDataState) this.L$0, this.f3872$e, null, null, 6, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C73801(null), 3, null);
    }

    /* compiled from: CreateTransferBonusRemovalDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDuxo;", "Lcom/robinhood/android/acats/contracts/CreateTransferBonusRemovalDetailsKey;", "<init>", "()V", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateTransferBonusRemovalDetailsDuxo, CreateTransferBonusRemovalDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateTransferBonusRemovalDetailsKey getArgs(SavedStateHandle savedStateHandle) {
            return (CreateTransferBonusRemovalDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateTransferBonusRemovalDetailsKey getArgs(CreateTransferBonusRemovalDetailsDuxo createTransferBonusRemovalDetailsDuxo) {
            return (CreateTransferBonusRemovalDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, createTransferBonusRemovalDetailsDuxo);
        }
    }
}
