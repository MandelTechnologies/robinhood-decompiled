package com.robinhood.android.dashboard.lib;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.models.home.HomeState;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.DashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "DashboardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super HomeState>, Account, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DashboardDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, DashboardDuxo dashboardDuxo) {
        super(3, continuation);
        this.this$0 = dashboardDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super HomeState> flowCollector, Account account, Continuation<? super Unit> continuation) {
        DashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1 dashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1 = new DashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        dashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        dashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = account;
        return dashboardDuxo$onStart$1$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r8, r1, r7) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Account account;
        Flow<HomeState> flowFlowOf;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            account = (Account) this.L$1;
            if (account != null && !account.getBrokerageAccountType().isRetirement()) {
                HomeDashboardStore homeDashboardStore = this.this$0.homeDashboardStore;
                String accountNumber = account.getAccountNumber();
                this.L$0 = flowCollector;
                this.L$1 = account;
                this.label = 1;
                if (homeDashboardStore.refreshHomeState(accountNumber, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                }
                return coroutine_suspended;
            }
            flowFlowOf = FlowKt.flowOf((Object) null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            account = (Account) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        flowFlowOf = this.this$0.homeDashboardStore.getHomeStateQuery().asFlow(account.getAccountNumber());
        flowCollector = flowCollector2;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
