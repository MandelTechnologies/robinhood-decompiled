package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.home.contracts.HomeDashboardType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UpsellPillComponent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$1$1", m3645f = "UpsellPillComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class UpsellPillComponent2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeDashboardType $dashboardType;
    final /* synthetic */ DashboardHeaderPillDuxo $duxo;
    final /* synthetic */ NuxPillVisibilityExperiment.Variant $showPillInNuxVariant;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpsellPillComponent2(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, HomeDashboardType homeDashboardType, NuxPillVisibilityExperiment.Variant variant, Continuation<? super UpsellPillComponent2> continuation) {
        super(2, continuation);
        this.$duxo = dashboardHeaderPillDuxo;
        this.$dashboardType = homeDashboardType;
        this.$showPillInNuxVariant = variant;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpsellPillComponent2(this.$duxo, this.$dashboardType, this.$showPillInNuxVariant, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpsellPillComponent2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.initialize(this.$dashboardType, this.$showPillInNuxVariant);
        return Unit.INSTANCE;
    }
}
