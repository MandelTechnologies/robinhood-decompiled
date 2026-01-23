package com.robinhood.android.transfers.p271ui.p272v2;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccounts7;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$3$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$onCreate$8$3$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferV2EligibleInstantBundle $eligibleInstantBundle;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$onCreate$8$3$1(CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle, CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super CreateTransferV2Duxo$onCreate$8$3$1> continuation) {
        super(2, continuation);
        this.$eligibleInstantBundle = createTransferV2EligibleInstantBundle;
        this.this$0 = createTransferV2Duxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2Duxo$onCreate$8$3$1 createTransferV2Duxo$onCreate$8$3$1 = new CreateTransferV2Duxo$onCreate$8$3$1(this.$eligibleInstantBundle, this.this$0, continuation);
        createTransferV2Duxo$onCreate$8$3$1.L$0 = obj;
        return createTransferV2Duxo$onCreate$8$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$onCreate$8$3$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        if (r2.emit(r4, r40) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object preCreateTransferContent;
        List<ApiPreCreateTransferSduiContainer> preTransferActions;
        Iterator<T> it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Boolean boolBoxBoolean = boxing.boxBoolean(false);
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(boolBoxBoolean, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            preCreateTransferContent = obj;
            preTransferActions = ((ApiPreCreateTransferResponse) preCreateTransferContent).getPreTransferActions();
            if ((preTransferActions instanceof Collection) || !preTransferActions.isEmpty()) {
                it = preTransferActions.iterator();
                while (it.hasNext()) {
                    if (((ApiPreCreateTransferSduiContainer) it.next()).getType() == PreCreatePopupType.INSTANT_UPSELL) {
                        break;
                    }
                }
            }
            z = true;
            Boolean boolBoxBoolean2 = boxing.boxBoolean(z);
            this.L$0 = null;
            this.label = 3;
        }
        if (this.$eligibleInstantBundle.getShouldQueryForInstantAmount()) {
            TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
            CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle = this.$eligibleInstantBundle;
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            BigDecimal amount = createTransferV2EligibleInstantBundle.getAmount();
            TransferAccount fromAccount = createTransferV2EligibleInstantBundle.getFromAccount();
            ApiCreateTransferRequest.ApiTransferAccount apiAccount = fromAccount != null ? TransferAccounts7.toApiAccount(fromAccount) : null;
            if (apiAccount == null) {
                throw new IllegalStateException("Required value was null.");
            }
            TransferAccount toAccount = createTransferV2EligibleInstantBundle.getToAccount();
            ApiCreateTransferRequest.ApiTransferAccount apiAccount2 = toAccount != null ? TransferAccounts7.toApiAccount(toAccount) : null;
            if (apiAccount2 != null) {
                ApiCreateTransferRequest apiCreateTransferRequest = new ApiCreateTransferRequest(uuidFromString, amount, apiAccount, apiAccount2, ApiCreateTransferRequest2.ONCE, null, new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, 0, null, boxing.boxBoolean(false), null, null, null, null, null, null, null, null, false, null, null, null, null, null, 2097087, null), null, null, null, null, false, null, 8096, null);
                this.L$0 = flowCollector;
                this.label = 2;
                preCreateTransferContent = transfersBonfireApi.getPreCreateTransferContent(apiCreateTransferRequest, this);
                if (preCreateTransferContent != coroutine_suspended) {
                    preTransferActions = ((ApiPreCreateTransferResponse) preCreateTransferContent).getPreTransferActions();
                    if (preTransferActions instanceof Collection) {
                    }
                    it = preTransferActions.iterator();
                    while (it.hasNext()) {
                    }
                    z = true;
                    Boolean boolBoxBoolean22 = boxing.boxBoolean(z);
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return Unit.INSTANCE;
    }
}
