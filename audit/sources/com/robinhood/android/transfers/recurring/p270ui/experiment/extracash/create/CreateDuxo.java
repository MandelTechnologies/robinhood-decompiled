package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccounts7;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.transfers.api.TransferType;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CreateDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "transferBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateDuxo extends BaseDuxo5<Unit, CreateEvent> implements HasArgs<RecurringExtraCashData> {
    private final AutomaticDepositStore automaticDepositStore;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transferBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public RecurringExtraCashData getArgs(SavedStateHandle savedStateHandle) {
        return (RecurringExtraCashData) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDuxo(AutomaticDepositStore automaticDepositStore, TransfersBonfireApi transferBonfireApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(transferBonfireApi, "transferBonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.automaticDepositStore = automaticDepositStore;
        this.transferBonfireApi = transferBonfireApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C305181((RecurringExtraCashData) INSTANCE.getArgs((HasArgs) this), null), 3, null);
    }

    /* compiled from: CreateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateDuxo$onCreate$1", m3645f = "CreateDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateDuxo$onCreate$1 */
    static final class C305181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecurringExtraCashData $args;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C305181(RecurringExtraCashData recurringExtraCashData, Continuation<? super C305181> continuation) {
            super(2, continuation);
            this.$args = recurringExtraCashData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateDuxo.this.new C305181(this.$args, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C305181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objCreateTransfer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = CreateDuxo.this.transferBonfireApi;
                    UUID uuidRandomUUID = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                    BigDecimal amount = this.$args.getAmount();
                    if (amount == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    AchRelationship fromAccount = this.$args.getFromAccount();
                    if (fromAccount == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = fromAccount.getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = new ApiCreateTransferRequest.ApiTransferAccount(string2, ApiTransferAccount.TransferAccountType.ACH, null, null, 12, null);
                    TransferAccount toAccount = this.$args.getToAccount();
                    if (toAccount == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ApiCreateTransferRequest apiCreateTransferRequest = new ApiCreateTransferRequest(uuidRandomUUID, amount, apiTransferAccount, TransferAccounts7.toApiAccount(toAccount), ApiCreateTransferRequest2.WEEKLY, null, new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, boxing.boxBoolean(true), 1048575, null), null, null, null, TransferType.ORIGINATED_ACH, false, null, 7072, null);
                    this.label = 1;
                    objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, this);
                    if (objCreateTransfer == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objCreateTransfer = obj;
                }
                Response response = (Response) objCreateTransfer;
                if (response.isSuccessful()) {
                    CreateDuxo.this.automaticDepositStore.refresh(true);
                    CreateDuxo createDuxo = CreateDuxo.this;
                    Object objBody = response.body();
                    if (objBody != null) {
                        createDuxo.submit(new CreateEvent.Success(PostTransferFlow2.toUiModel((ApiCreateTransferResponse) objBody, this.$args.getToAccount().getType())));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    CreateDuxo.this.submit(new CreateEvent.Error(new HttpException(response)));
                }
            } catch (Throwable th) {
                CreateDuxo.this.submit(new CreateEvent.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CreateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CreateDuxo, RecurringExtraCashData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public RecurringExtraCashData getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringExtraCashData) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public RecurringExtraCashData getArgs(CreateDuxo createDuxo) {
            return (RecurringExtraCashData) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, createDuxo);
        }
    }
}
