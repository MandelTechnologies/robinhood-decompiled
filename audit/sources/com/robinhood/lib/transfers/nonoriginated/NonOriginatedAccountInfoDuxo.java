package com.robinhood.lib.transfers.nonoriginated;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoRequestDto;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoResponseDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo5;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NonOriginatedAccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDataState;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "expandOrCollapseSection", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onDoneButtonClick", "Companion", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NonOriginatedAccountInfoDuxo extends BaseDuxo3<NonOriginatedAccountInfoDataState, NonOriginatedAccountInfoViewState, NonOriginatedAccountInfoDuxo5> implements HasSavedState {
    private final BffMoneyMovementService bffMoneyMovementService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NonOriginatedAccountInfoDuxo(BffMoneyMovementService bffMoneyMovementService, SavedStateHandle savedStateHandle, NonOriginatedAccountInfoStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new NonOriginatedAccountInfoDataState(((NonOriginatedAccountInfoFragment.Args) companion.getArgs(savedStateHandle)).getTransferType(), ((NonOriginatedAccountInfoFragment.Args) companion.getArgs(savedStateHandle)).getCurrency(), null, null, null, 28, null), stateProvider, duxoBundle);
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: NonOriginatedAccountInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$onStart$1", m3645f = "NonOriginatedAccountInfoDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$onStart$1 */
    static final class C334121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C334121(Continuation<? super C334121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NonOriginatedAccountInfoDuxo.this.new C334121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C334121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo = NonOriginatedAccountInfoDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    BffMoneyMovementService bffMoneyMovementService = nonOriginatedAccountInfoDuxo.bffMoneyMovementService;
                    Companion companion2 = NonOriginatedAccountInfoDuxo.INSTANCE;
                    GetNonOriginatedTransferInfoRequestDto getNonOriginatedTransferInfoRequestDto = new GetNonOriginatedTransferInfoRequestDto(((NonOriginatedAccountInfoFragment.Args) companion2.getArgs((HasSavedState) nonOriginatedAccountInfoDuxo)).getTransferType(), ((NonOriginatedAccountInfoFragment.Args) companion2.getArgs((HasSavedState) nonOriginatedAccountInfoDuxo)).getCurrency(), ((NonOriginatedAccountInfoFragment.Args) companion2.getArgs((HasSavedState) nonOriginatedAccountInfoDuxo)).getRobinhoodAccount());
                    this.label = 1;
                    obj = bffMoneyMovementService.GetNonOriginatedTransferInfo(getNonOriginatedTransferInfoRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((GetNonOriginatedTransferInfoResponseDto) obj);
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo2 = NonOriginatedAccountInfoDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                nonOriginatedAccountInfoDuxo2.applyMutation(new NonOriginatedAccountInfoDuxo3((GetNonOriginatedTransferInfoResponseDto) objM28550constructorimpl, null));
            } else {
                nonOriginatedAccountInfoDuxo2.applyMutation(new NonOriginatedAccountInfoDuxo4(thM28553exceptionOrNullimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C334121(null));
    }

    public final void expandOrCollapseSection(final int index) {
        withDataState(new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedAccountInfoDuxo.expandOrCollapseSection$lambda$0(this.f$0, index, (NonOriginatedAccountInfoDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit expandOrCollapseSection$lambda$0(NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo, int i, NonOriginatedAccountInfoDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        nonOriginatedAccountInfoDuxo.applyMutation(new NonOriginatedAccountInfoDuxo2(state, i, null));
        return Unit.INSTANCE;
    }

    public final void onDoneButtonClick() {
        withDataState(new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedAccountInfoDuxo.onDoneButtonClick$lambda$2(this.f$0, (NonOriginatedAccountInfoDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDoneButtonClick$lambda$2(NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo, NonOriginatedAccountInfoDataState state) {
        NonOriginatedAccountInfoDuxo5 showConfirmation;
        StandardScreenDataDto confirmation_screen_data;
        Intrinsics.checkNotNullParameter(state, "state");
        GetNonOriginatedTransferInfoResponseDto nonOriginatedTransferInfoResponseDto = state.getNonOriginatedTransferInfoResponseDto();
        if (nonOriginatedTransferInfoResponseDto != null && (confirmation_screen_data = nonOriginatedTransferInfoResponseDto.getConfirmation_screen_data()) != null) {
            showConfirmation = new NonOriginatedAccountInfoDuxo5.ShowConfirmation(confirmation_screen_data);
        } else {
            showConfirmation = NonOriginatedAccountInfoDuxo5.Exit.INSTANCE;
        }
        nonOriginatedAccountInfoDuxo.submit(showConfirmation);
        return Unit.INSTANCE;
    }

    /* compiled from: NonOriginatedAccountInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Args;", "<init>", "()V", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NonOriginatedAccountInfoDuxo, NonOriginatedAccountInfoFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedAccountInfoFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (NonOriginatedAccountInfoFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedAccountInfoFragment.Args getArgs(NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo) {
            return (NonOriginatedAccountInfoFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, nonOriginatedAccountInfoDuxo);
        }
    }
}
