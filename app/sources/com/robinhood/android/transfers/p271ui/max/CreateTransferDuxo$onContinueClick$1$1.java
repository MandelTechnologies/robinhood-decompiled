package com.robinhood.android.transfers.p271ui.max;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.composecomponents.OutgoingWireMemoEntryData;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.ManagedValidationResult;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1195}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferDuxo$onContinueClick$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferViewState $this_applyMutation;
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$onContinueClick$1$1(CreateTransferDuxo createTransferDuxo, CreateTransferViewState createTransferViewState, Continuation<? super CreateTransferDuxo$onContinueClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferDuxo;
        this.$this_applyMutation = createTransferViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$onContinueClick$1$1(this.this$0, this.$this_applyMutation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferDuxo$onContinueClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateTransferDuxo createTransferDuxo = this.this$0;
            CreateTransferViewState createTransferViewState = this.$this_applyMutation;
            this.label = 1;
            obj = CreateTransferDuxoKt.runManagedValidationCheck(createTransferDuxo, createTransferViewState, false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final ManagedValidationResult managedValidationResult = (ManagedValidationResult) obj;
        if (managedValidationResult instanceof ManagedValidationResult.ValidationErrorsWereDisplayed) {
            return Unit.INSTANCE;
        }
        if (managedValidationResult instanceof ManagedValidationResult.ExceptionOccuredDuringValidation) {
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferDuxo$onContinueClick$1$1.invokeSuspend$lambda$0(managedValidationResult, (CreateTransferViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        if (!(managedValidationResult instanceof ManagedValidationResult.Continue)) {
            throw new NoWhenBranchMatchedException();
        }
        final CreateTransferDuxo createTransferDuxo2 = this.this$0;
        createTransferDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CreateTransferDuxo$onContinueClick$1$1.invokeSuspend$lambda$1(createTransferDuxo2, (CreateTransferViewState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$0(ManagedValidationResult managedValidationResult, CreateTransferViewState createTransferViewState) {
        return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, new UiEvent(((ManagedValidationResult.ExceptionOccuredDuringValidation) managedValidationResult).getE()), false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1073741825, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$1(CreateTransferDuxo createTransferDuxo, CreateTransferViewState createTransferViewState) {
        UiEvent uiEvent;
        PublishRelay publishRelay = createTransferDuxo.disclosureBundlePublishSubject;
        CreateTransferViewState.Mode mode = CreateTransferViewState.Mode.REVIEW;
        publishRelay.accept(new DisclosureBundle(mode, createTransferViewState.getSourceAccount(), createTransferViewState.getSinkAccount()));
        if (createTransferViewState.isOutgoingWireMemoExperimentEnabled()) {
            if (createTransferDuxo.transferConfig instanceof TransferConfiguration.OutgoingWire) {
                OutgoingWireMemoEntryData.Companion companion = OutgoingWireMemoEntryData.INSTANCE;
                String confirmedMemoText = createTransferViewState.getConfirmedMemoText();
                if (confirmedMemoText == null) {
                    confirmedMemoText = "";
                }
                uiEvent = new UiEvent(new ShowOutgoingWireMemoDataHolder(companion.withMemoText(confirmedMemoText)));
            } else {
                uiEvent = null;
            }
            return CreateTransferViewState.copy$default(createTransferViewState, mode, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, uiEvent, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1073741826, -1, 262143, null);
        }
        return CreateTransferViewState.copy$default(createTransferViewState, mode, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -2, -1, 262143, null);
    }
}
