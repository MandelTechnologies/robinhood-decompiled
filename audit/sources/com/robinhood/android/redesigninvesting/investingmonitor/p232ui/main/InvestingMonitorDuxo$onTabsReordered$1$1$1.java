package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p355ui.CuratedListEligible;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestingMonitorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1$1$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class InvestingMonitorDuxo$onTabsReordered$1$1$1 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
    final /* synthetic */ List<Tuples2<CuratedList, List<CuratedListEligible>>> $sortedCuratedListInfoPairs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InvestingMonitorDuxo$onTabsReordered$1$1$1(List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> list, Continuation<? super InvestingMonitorDuxo$onTabsReordered$1$1$1> continuation) {
        super(2, continuation);
        this.$sortedCuratedListInfoPairs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestingMonitorDuxo$onTabsReordered$1$1$1 investingMonitorDuxo$onTabsReordered$1$1$1 = new InvestingMonitorDuxo$onTabsReordered$1$1$1(this.$sortedCuratedListInfoPairs, continuation);
        investingMonitorDuxo$onTabsReordered$1$1$1.L$0 = obj;
        return investingMonitorDuxo$onTabsReordered$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
        return ((InvestingMonitorDuxo$onTabsReordered$1$1$1) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InvestingMonitorDataState.copy$default((InvestingMonitorDataState) this.L$0, false, false, null, this.$sortedCuratedListInfoPairs, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }
}
