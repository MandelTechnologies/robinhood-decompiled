package com.robinhood.android.transfers.p271ui.p272v2;

import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.lib.transfers.TransferData;
import com.robinhood.android.lib.transfers.TransferFactoryForV2;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Event;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.ToTransferData;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {1230}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$createTransfer$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $clawbackGracePeriodOptIn;
    final /* synthetic */ boolean $continuingTransferAfterValidation;
    final /* synthetic */ CreateTransferV2DataState $dataState;
    final /* synthetic */ boolean $resubmissionAfter3DS;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$createTransfer$1$1(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState createTransferV2DataState, Boolean bool, boolean z, boolean z2, Continuation<? super CreateTransferV2Duxo$createTransfer$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2Duxo;
        this.$dataState = createTransferV2DataState;
        this.$clawbackGracePeriodOptIn = bool;
        this.$continuingTransferAfterValidation = z;
        this.$resubmissionAfter3DS = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2Duxo$createTransfer$1$1(this.this$0, this.$dataState, this.$clawbackGracePeriodOptIn, this.$continuingTransferAfterValidation, this.$resubmissionAfter3DS, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$createTransfer$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$7(CreateTransferV2Duxo createTransferV2Duxo, Either either, PreCreatePopupType preCreatePopupType) {
        if (!(either instanceof Either.Left)) {
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            createTransferV2Duxo.submit(new CreateTransferV2Event.PrecreateAssetRetention((AssetRetentionUpsellContent) ((Either.Right) either).getValue()));
        } else {
            createTransferV2Duxo.submit(new CreateTransferV2Event.Precreate((AlertAction) ((Either.Left) either).getValue(), preCreatePopupType));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferFactoryForV2 transferFactoryForV2 = this.this$0.transferFactory;
            TransferData transferData = ToTransferData.toTransferData(this.$dataState, this.$clawbackGracePeriodOptIn);
            boolean z = this.$continuingTransferAfterValidation;
            boolean z2 = this.$resubmissionAfter3DS;
            final CreateTransferV2Duxo createTransferV2Duxo = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$0(createTransferV2Duxo);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo2 = this.this$0;
            Function0<Unit> function02 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$1(createTransferV2Duxo2);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo3 = this.this$0;
            Function1<? super String, Unit> function1 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$2(createTransferV2Duxo3, (String) obj2);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo4 = this.this$0;
            Function1<? super PostTransferFlow, Unit> function12 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$3(createTransferV2Duxo4, (PostTransferFlow) obj2);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo5 = this.this$0;
            Function1<? super Throwable, Unit> function13 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$4(createTransferV2Duxo5, (Throwable) obj2);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo6 = this.this$0;
            Function2<? super Either<? extends AlertAction<? extends DisplayRTPUpsellAction>, AssetRetentionUpsellContent>, ? super PreCreatePopupType, Unit> function2 = new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$7(createTransferV2Duxo6, (Either) obj2, (PreCreatePopupType) obj3);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo7 = this.this$0;
            Function2<? super UUID, ? super Boolean, Unit> function22 = new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$8(createTransferV2Duxo7, (UUID) obj2, ((Boolean) obj3).booleanValue());
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo8 = this.this$0;
            Function1<? super TransferValidationErrorDetailsDto, Unit> function14 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$9(createTransferV2Duxo8, (TransferValidationErrorDetailsDto) obj2);
                }
            };
            final CreateTransferV2Duxo createTransferV2Duxo9 = this.this$0;
            Function1<? super ClawbackGracePeriodContent, Unit> function15 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$10(createTransferV2Duxo9, (ClawbackGracePeriodContent) obj2);
                }
            };
            final CreateTransferV2DataState createTransferV2DataState = this.$dataState;
            Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function16 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$createTransfer$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferV2Duxo$createTransfer$1$1.invokeSuspend$lambda$11(createTransferV2DataState, (ApiCreateTransferRequest) obj2);
                }
            };
            this.label = 1;
            if (transferFactoryForV2.create(transferData, z, z2, function0, function02, function1, function12, function13, function2, function22, function14, function15, function16, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData invokeSuspend$lambda$11(CreateTransferV2DataState createTransferV2DataState, ApiCreateTransferRequest apiCreateTransferRequest) {
        Screen screen$feature_transfers_externalRelease = CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease();
        MAXTransferContext maxTransferContext = createTransferV2DataState.getMaxTransferContext();
        String string2 = apiCreateTransferRequest.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventData(null, screen$feature_transfers_externalRelease, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext.copy((377169 & 1) != 0 ? maxTransferContext.id : string2, (377169 & 2) != 0 ? maxTransferContext.amount : null, (377169 & 4) != 0 ? maxTransferContext.source_account : null, (377169 & 8) != 0 ? maxTransferContext.sink_account : null, (377169 & 16) != 0 ? maxTransferContext.frequency : null, (377169 & 32) != 0 ? maxTransferContext.ira_contribution_data : null, (377169 & 64) != 0 ? maxTransferContext.entry_point : null, (377169 & 128) != 0 ? maxTransferContext.ira_distribution_data : null, (377169 & 256) != 0 ? maxTransferContext.session_id : null, (377169 & 512) != 0 ? maxTransferContext.ach_transfer_data : null, (377169 & 1024) != 0 ? maxTransferContext.deposit_suggestions : null, (377169 & 2048) != 0 ? maxTransferContext.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? maxTransferContext.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? maxTransferContext.currency_conversion_data : null, (377169 & 16384) != 0 ? maxTransferContext.locality : null, (377169 & 32768) != 0 ? maxTransferContext.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? maxTransferContext.transfer_v2_direction : null, (377169 & 131072) != 0 ? maxTransferContext.selected_pill_amount : null, (377169 & 262144) != 0 ? maxTransferContext.transfer_method : null, (377169 & 524288) != 0 ? maxTransferContext.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CreateTransferV2Duxo createTransferV2Duxo) {
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$createTransfer$1$1$1$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(CreateTransferV2Duxo createTransferV2Duxo) {
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$createTransfer$1$1$2$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(CreateTransferV2Duxo createTransferV2Duxo, String str) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.ThreeDSVerification(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(CreateTransferV2Duxo createTransferV2Duxo, PostTransferFlow postTransferFlow) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.Success(postTransferFlow));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(CreateTransferV2Duxo createTransferV2Duxo, Throwable th) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.CreateTransferError(th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8(CreateTransferV2Duxo createTransferV2Duxo, UUID uuid, boolean z) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.VerificationWorkflow(uuid, z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9(CreateTransferV2Duxo createTransferV2Duxo, TransferValidationErrorDetailsDto transferValidationErrorDetailsDto) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.ShowValidationAlert(false, transferValidationErrorDetailsDto));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$10(CreateTransferV2Duxo createTransferV2Duxo, ClawbackGracePeriodContent clawbackGracePeriodContent) {
        createTransferV2Duxo.submit(new CreateTransferV2Event.ShowClawbackGracePeriodContent(clawbackGracePeriodContent));
        return Unit.INSTANCE;
    }
}
