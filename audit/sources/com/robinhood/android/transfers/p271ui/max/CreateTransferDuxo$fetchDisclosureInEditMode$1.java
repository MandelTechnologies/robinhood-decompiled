package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosureInEditMode$1", m3645f = "CreateTransferDuxo.kt", m3646l = {992}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferDuxo$fetchDisclosureInEditMode$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ DisclosureBundle $disclosureBundle;
    final /* synthetic */ ApiCreateTransferRequest2 $frequency;
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$fetchDisclosureInEditMode$1(DisclosureBundle disclosureBundle, CreateTransferDuxo createTransferDuxo, ApiCreateTransferRequest2 apiCreateTransferRequest2, BigDecimal bigDecimal, Continuation<? super CreateTransferDuxo$fetchDisclosureInEditMode$1> continuation) {
        super(2, continuation);
        this.$disclosureBundle = disclosureBundle;
        this.this$0 = createTransferDuxo;
        this.$frequency = apiCreateTransferRequest2;
        this.$amount = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$fetchDisclosureInEditMode$1(this.$disclosureBundle, this.this$0, this.$frequency, this.$amount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferDuxo$fetchDisclosureInEditMode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        final List<UIComponent<GenericAction>> content;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferAccount sourceAccount = this.$disclosureBundle.getSourceAccount();
                ApiTransferSummaryRequest.Account account = sourceAccount != null ? new ApiTransferSummaryRequest.Account(sourceAccount.getAccountId(), sourceAccount.getType(), null, 4, null) : null;
                TransferAccount sinkAccount = this.$disclosureBundle.getSinkAccount();
                ApiTransferSummaryRequest apiTransferSummaryRequest = new ApiTransferSummaryRequest(account, sinkAccount != null ? new ApiTransferSummaryRequest.Account(sinkAccount.getAccountId(), sinkAccount.getType(), null, 4, null) : null, boxing.boxInt(((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTransferConfiguration().getEntryPoint().getValue()), this.$frequency, null, this.$amount, null, 80, null);
                TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                this.label = 1;
                obj = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            content = ((ApiTransferSummaryResponse) obj).getContent();
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosureInEditMode$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferDuxo$fetchDisclosureInEditMode$1.invokeSuspend$lambda$2(content, (CreateTransferViewState) obj2);
                }
            });
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
        }
        if (content == null) {
            if (((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTransferConfiguration() instanceof TransferConfiguration.OutgoingWire) {
                this.this$0.fetchOutgoingWireDisclosure(this.$disclosureBundle, this.$amount, DisclosureLocation.CREATE_TRANSFER_EDIT_PAGE);
            } else {
                this.this$0.disclosureFallback(this.$disclosureBundle);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$2(List list, CreateTransferViewState createTransferViewState) {
        return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, list, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -257, 262143, null);
    }
}
