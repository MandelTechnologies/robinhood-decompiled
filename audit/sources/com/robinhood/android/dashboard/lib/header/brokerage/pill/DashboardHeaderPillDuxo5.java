package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.DashboardTypeExtensions;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: DashboardHeaderPillDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$sortingHatRecordStream$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$sortingHatRecordStream$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardHeaderPillDuxo5 extends ContinuationImpl7 implements Function2<FlowCollector<? super SortingHatRecord>, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeDashboardType $currentDashboardType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DashboardHeaderPillDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardHeaderPillDuxo5(HomeDashboardType homeDashboardType, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super DashboardHeaderPillDuxo5> continuation) {
        super(2, continuation);
        this.$currentDashboardType = homeDashboardType;
        this.this$0 = dashboardHeaderPillDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DashboardHeaderPillDuxo5 dashboardHeaderPillDuxo5 = new DashboardHeaderPillDuxo5(this.$currentDashboardType, this.this$0, continuation);
        dashboardHeaderPillDuxo5.L$0 = obj;
        return dashboardHeaderPillDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super SortingHatRecord> flowCollector, Continuation<? super Unit> continuation) {
        return ((DashboardHeaderPillDuxo5) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            SortingHatQueryArgs sortingHatQueryArgsCopy$default = SortingHatQueryArgs.copy$default(DashboardTypeExtensions.getSortingHatQuery(this.$currentDashboardType), null, null, this.this$0.getHasCryptoImpressionPref().get(), 3, null);
            BaseSortingHatStore baseSortingHatStore = this.this$0.sortingHatStore;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = baseSortingHatStore.getSortingHatRecord(sortingHatQueryArgsCopy$default, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
