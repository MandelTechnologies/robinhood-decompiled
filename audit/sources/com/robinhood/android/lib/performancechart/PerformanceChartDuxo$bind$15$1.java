package com.robinhood.android.lib.performancechart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$15$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PerformanceChartDuxo$bind$15$1 extends ContinuationImpl7 implements Function2<PerformanceChartDataState, Continuation<? super PerformanceChartDataState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartDuxo$bind$15$1(boolean z, Continuation<? super PerformanceChartDuxo$bind$15$1> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartDuxo$bind$15$1 performanceChartDuxo$bind$15$1 = new PerformanceChartDuxo$bind$15$1(this.$it, continuation);
        performanceChartDuxo$bind$15$1.L$0 = obj;
        return performanceChartDuxo$bind$15$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartDataState performanceChartDataState, Continuation<? super PerformanceChartDataState> continuation) {
        return ((PerformanceChartDuxo$bind$15$1) create(performanceChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to inline method: com.robinhood.android.lib.performancechart.PerformanceChartDataState.copy$default(com.robinhood.android.lib.performancechart.PerformanceChartDataState, com.robinhood.android.models.portfolio.api.PerformanceChartType, com.robinhood.android.models.portfolio.PerformanceChartModel, java.lang.String, com.robinhood.android.models.portfolio.api.AccountMarketValuesType, boolean, com.robinhood.android.models.portfolio.PerformanceChartSettingsV2, boolean, boolean, boolean, boolean, boolean, boolean, boolean, com.robinhood.shared.app.type.AppType, int, java.lang.Object):com.robinhood.android.lib.performancechart.PerformanceChartDataState */
    /* JADX WARN: Method inline failed with exception
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1685)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1660)
    	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:139)
    	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:170)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:137)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:141)
    	at jadx.core.dex.regions.conditions.IfCondition.replaceArg(IfCondition.java:270)
    	at jadx.core.dex.instructions.mods.TernaryInsn.replaceArg(TernaryInsn.java:67)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:141)
    	at jadx.core.dex.visitors.InlineMethods.replaceRegs(InlineMethods.java:127)
    	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:86)
    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
    	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PerformanceChartDataState.copy$default((PerformanceChartDataState) this.L$0, null, null, null, null, false, null, false, false, false, false, false, false, this.$it, null, 12287, null);
    }
}
