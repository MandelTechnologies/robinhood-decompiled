package com.robinhood.android.investmentstracker.linking;

import accio.service.p003v1.ProviderDto;
import accio.service.p003v1.PurposeDto;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.UnlinkInstitutionRequestDto;
import com.robinhood.android.investmentstracker.linking.models.UnlinkInstitutionDataState;
import com.robinhood.android.investmentstracker.linking.models.UnlinkInstitutionEvent;
import com.robinhood.android.investmentstracker.linking.models.UnlinkInstitutionViewState;
import com.robinhood.android.transfers.contracts.UnlinkInstitutionDialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnlinkInstitutionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/UnlinkInstitutionDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionDataState;", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionViewState;", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionEvent;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "unlinkConfirmationClicked", "", "Companion", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UnlinkInstitutionDuxo extends BaseDuxo3<UnlinkInstitutionDataState, UnlinkInstitutionViewState, UnlinkInstitutionEvent> implements HasSavedState {
    private final BffMoneyMovementService bffMoneyMovementService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlinkInstitutionDuxo(BffMoneyMovementService bffMoneyMovementService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new UnlinkInstitutionDataState(false, null, 2, null), new UnlinkInstitutionStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.savedStateHandle = savedStateHandle;
        applyMutation(new C196271(null));
    }

    /* compiled from: UnlinkInstitutionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$1", m3645f = "UnlinkInstitutionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$1 */
    static final class C196271 extends ContinuationImpl7 implements Function2<UnlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196271(Continuation<? super C196271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196271 c196271 = UnlinkInstitutionDuxo.this.new C196271(continuation);
            c196271.L$0 = obj;
            return c196271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UnlinkInstitutionDataState unlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState> continuation) {
            return ((C196271) create(unlinkInstitutionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UnlinkInstitutionDataState.copy$default((UnlinkInstitutionDataState) this.L$0, false, ((UnlinkInstitutionDialogFragmentKey) UnlinkInstitutionDuxo.INSTANCE.getArgs((HasSavedState) UnlinkInstitutionDuxo.this)).getName(), 1, null);
        }
    }

    /* compiled from: UnlinkInstitutionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$1", m3645f = "UnlinkInstitutionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$1 */
    static final class C196281 extends ContinuationImpl7 implements Function2<UnlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196281(Continuation<? super C196281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196281 c196281 = new C196281(continuation);
            c196281.L$0 = obj;
            return c196281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UnlinkInstitutionDataState unlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState> continuation) {
            return ((C196281) create(unlinkInstitutionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UnlinkInstitutionDataState.copy$default((UnlinkInstitutionDataState) this.L$0, true, null, 2, null);
        }
    }

    public final void unlinkConfirmationClicked() {
        applyMutation(new C196281(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C196292(null), 3, null);
    }

    /* compiled from: UnlinkInstitutionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$2", m3645f = "UnlinkInstitutionDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$2 */
    static final class C196292 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C196292(Continuation<? super C196292> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnlinkInstitutionDuxo.this.new C196292(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UnlinkInstitutionDuxo unlinkInstitutionDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        BffMoneyMovementService bffMoneyMovementService = UnlinkInstitutionDuxo.this.bffMoneyMovementService;
                        UnlinkInstitutionRequestDto unlinkInstitutionRequestDto = new UnlinkInstitutionRequestDto(((UnlinkInstitutionDialogFragmentKey) UnlinkInstitutionDuxo.INSTANCE.getArgs((HasSavedState) UnlinkInstitutionDuxo.this)).getInstitutionId(), ProviderDto.PLAID, CollectionsKt.listOf(PurposeDto.PURPOSE_INVESTMENT_TRACKING));
                        this.label = 1;
                        if (bffMoneyMovementService.UnlinkInstitution(unlinkInstitutionRequestDto, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    UnlinkInstitutionDuxo.this.submit(UnlinkInstitutionEvent.Close.INSTANCE);
                    unlinkInstitutionDuxo = UnlinkInstitutionDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Exception e) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                    UnlinkInstitutionDuxo.this.submit(UnlinkInstitutionEvent.Close.INSTANCE);
                    unlinkInstitutionDuxo = UnlinkInstitutionDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                }
                unlinkInstitutionDuxo.applyMutation(anonymousClass1);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                UnlinkInstitutionDuxo.this.submit(UnlinkInstitutionEvent.Close.INSTANCE);
                UnlinkInstitutionDuxo.this.applyMutation(new AnonymousClass1(null));
                throw th;
            }
        }

        /* compiled from: UnlinkInstitutionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/linking/models/UnlinkInstitutionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$2$1", m3645f = "UnlinkInstitutionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.linking.UnlinkInstitutionDuxo$unlinkConfirmationClicked$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UnlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState>, Object> {
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
            public final Object invoke(UnlinkInstitutionDataState unlinkInstitutionDataState, Continuation<? super UnlinkInstitutionDataState> continuation) {
                return ((AnonymousClass1) create(unlinkInstitutionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UnlinkInstitutionDataState.copy$default((UnlinkInstitutionDataState) this.L$0, false, null, 2, null);
            }
        }
    }

    /* compiled from: UnlinkInstitutionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/UnlinkInstitutionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investmentstracker/linking/UnlinkInstitutionDuxo;", "Lcom/robinhood/android/transfers/contracts/UnlinkInstitutionDialogFragmentKey;", "<init>", "()V", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UnlinkInstitutionDuxo, UnlinkInstitutionDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UnlinkInstitutionDialogFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (UnlinkInstitutionDialogFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UnlinkInstitutionDialogFragmentKey getArgs(UnlinkInstitutionDuxo unlinkInstitutionDuxo) {
            return (UnlinkInstitutionDialogFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, unlinkInstitutionDuxo);
        }
    }
}
