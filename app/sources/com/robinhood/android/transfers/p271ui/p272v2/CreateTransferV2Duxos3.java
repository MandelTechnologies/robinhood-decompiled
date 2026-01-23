package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;

/* compiled from: CreateTransferV2Duxos.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$3$2", m3645f = "CreateTransferV2Duxos.kt", m3646l = {35, 40, 61}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$3$2, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2Duxos3 extends ContinuationImpl7 implements Function2<FlowCollector<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferConfiguration.OutgoingWire $outgoingWireConfig;
    final /* synthetic */ CreateTransferV2Duxo $this_streamOutgoingWireDetails;
    final /* synthetic */ TransferAccount $toAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxos3(TransferAccount transferAccount, TransferConfiguration.OutgoingWire outgoingWire, CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super CreateTransferV2Duxos3> continuation) {
        super(2, continuation);
        this.$toAccount = transferAccount;
        this.$outgoingWireConfig = outgoingWire;
        this.$this_streamOutgoingWireDetails = createTransferV2Duxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2Duxos3 createTransferV2Duxos3 = new CreateTransferV2Duxos3(this.$toAccount, this.$outgoingWireConfig, this.$this_streamOutgoingWireDetails, continuation);
        createTransferV2Duxos3.L$0 = obj;
        return createTransferV2Duxos3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Tuples2<ApiOutgoingWireDetails, TransferAccount>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Tuples2<ApiOutgoingWireDetails, TransferAccount>> flowCollector, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxos3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r1.emit(r10, r9) != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Collection collectionEmptyList;
        List<FormInputDto> reviewFields;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Tuples2 tuples2M3642to = Tuples4.m3642to(null, this.$toAccount);
            this.L$0 = flowCollector2;
            this.label = 1;
            if (flowCollector2.emit(tuples2M3642to, this) != coroutine_suspended) {
                flowCollector = flowCollector2;
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
            ApiOutgoingWireDetails apiOutgoingWireDetails = (ApiOutgoingWireDetails) obj;
            if (this.$outgoingWireConfig.isThirdPartyWireConfigured()) {
                ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo = this.$outgoingWireConfig.getThirdPartyWiresInfo();
                if (thirdPartyWiresInfo != null && (reviewFields = thirdPartyWiresInfo.getReviewFields()) != null) {
                    List<FormInputDto> list = reviewFields;
                    collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (FormInputDto formInputDto : list) {
                        collectionEmptyList.add(new ApiOutgoingWireDetails.Row(formInputDto.getHeader(), formInputDto.getValue()));
                    }
                } else {
                    collectionEmptyList = CollectionsKt.emptyList();
                }
                apiOutgoingWireDetails = new ApiOutgoingWireDetails(CollectionsKt.plus(collectionEmptyList, (Iterable) apiOutgoingWireDetails.getRows()));
            }
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(apiOutgoingWireDetails, this.$toAccount);
            this.L$0 = null;
            this.label = 3;
        }
        boolean z = (this.$outgoingWireConfig.getOutgoingWireRoutingNumber() == null || this.$outgoingWireConfig.getOutgoingWireAccountNumber() == null) ? false : true;
        TransfersBonfireApi transfersBonfireApi = this.$this_streamOutgoingWireDetails.getTransfersBonfireApi();
        String accountId = this.$toAccount.getAccountId();
        ApiTransferAccount.TransferAccountType type2 = this.$toAccount.getType();
        this.L$0 = flowCollector;
        this.label = 2;
        obj = transfersBonfireApi.getOutgoingWireDetails(accountId, type2, z, this);
        if (obj != coroutine_suspended) {
            ApiOutgoingWireDetails apiOutgoingWireDetails2 = (ApiOutgoingWireDetails) obj;
            if (this.$outgoingWireConfig.isThirdPartyWireConfigured()) {
            }
            Tuples2 tuples2M3642to22 = Tuples4.m3642to(apiOutgoingWireDetails2, this.$toAccount);
            this.L$0 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
