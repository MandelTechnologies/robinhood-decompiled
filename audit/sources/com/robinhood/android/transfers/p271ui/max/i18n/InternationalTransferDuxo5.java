package com.robinhood.android.transfers.p271ui.max.i18n;

import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "Lkotlin/internal/Exact;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$3$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransferDuxo5 extends ContinuationImpl7 implements Function2<FlowCollector<? super TransferSummaryState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiTransferSummaryRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InternationalTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferDuxo5(ApiTransferSummaryRequest apiTransferSummaryRequest, InternationalTransferDuxo internationalTransferDuxo, Continuation<? super InternationalTransferDuxo5> continuation) {
        super(2, continuation);
        this.$request = apiTransferSummaryRequest;
        this.this$0 = internationalTransferDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransferDuxo5 internationalTransferDuxo5 = new InternationalTransferDuxo5(this.$request, this.this$0, continuation);
        internationalTransferDuxo5.L$0 = obj;
        return internationalTransferDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super TransferSummaryState> flowCollector, Continuation<? super Unit> continuation) {
        return ((InternationalTransferDuxo5) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r10.emit(r0, r9) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r0.emit(r4, r9) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:12:0x0025, B:30:0x0077, B:32:0x007f, B:33:0x0085), top: B:45:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:12:0x0025, B:30:0x0077, B:32:0x007f, B:33:0x0085), top: B:45:0x0025 }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Throwable th;
        Object objPostTransferSummary;
        FlowCollector flowCollector2;
        Parcelable success;
        List<UIComponent<GenericAction>> content;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.$request == null) {
                TransferSummaryState.None none = TransferSummaryState.None.INSTANCE;
                this.label = 1;
            } else {
                TransferSummaryState.Loading loading = TransferSummaryState.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 2;
                if (flowCollector.emit(loading, this) != coroutine_suspended) {
                    TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                    ApiTransferSummaryRequest apiTransferSummaryRequest = this.$request;
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 3;
                    objPostTransferSummary = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
                    if (objPostTransferSummary != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector3;
                try {
                    TransfersBonfireApi transfersBonfireApi2 = this.this$0.transfersBonfireApi;
                    ApiTransferSummaryRequest apiTransferSummaryRequest2 = this.$request;
                    this.L$0 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 3;
                    objPostTransferSummary = transfersBonfireApi2.postTransferSummary(apiTransferSummaryRequest2, this);
                    if (objPostTransferSummary != coroutine_suspended) {
                        FlowCollector flowCollector4 = flowCollector;
                        obj = objPostTransferSummary;
                        flowCollector2 = flowCollector4;
                        content = ((ApiTransferSummaryResponse) obj).getContent();
                        if (content == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    success = TransferSummaryState.None.INSTANCE;
                    flowCollector2 = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                }
                return coroutine_suspended;
            }
            if (i == 3) {
                flowCollector2 = (FlowCollector) this.L$1;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    content = ((ApiTransferSummaryResponse) obj).getContent();
                    if (content == null) {
                        success = new TransferSummaryState.Success(content);
                    } else {
                        success = TransferSummaryState.None.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    flowCollector = flowCollector5;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    success = TransferSummaryState.None.INSTANCE;
                    flowCollector2 = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                }
            } else if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
    }
}
