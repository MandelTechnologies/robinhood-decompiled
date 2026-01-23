package com.robinhood.android.gold.upgrade.legacy;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeLoadPlanDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$onCreate$2$1", m3645f = "LegacyGoldUpgradeLoadPlanDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeLoadPlanDuxo2 extends ContinuationImpl7 implements Function2<LegacyGoldUpgradeLoadPlanState, Continuation<? super LegacyGoldUpgradeLoadPlanState>, Object> {
    final /* synthetic */ LegacyGoldUpgradeLoadPlanState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyGoldUpgradeLoadPlanDuxo2(LegacyGoldUpgradeLoadPlanState legacyGoldUpgradeLoadPlanState, Continuation<? super LegacyGoldUpgradeLoadPlanDuxo2> continuation) {
        super(2, continuation);
        this.$state = legacyGoldUpgradeLoadPlanState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyGoldUpgradeLoadPlanDuxo2(this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LegacyGoldUpgradeLoadPlanState legacyGoldUpgradeLoadPlanState, Continuation<? super LegacyGoldUpgradeLoadPlanState> continuation) {
        return ((LegacyGoldUpgradeLoadPlanDuxo2) create(legacyGoldUpgradeLoadPlanState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LegacyGoldUpgradeLoadPlanState legacyGoldUpgradeLoadPlanState = this.$state;
        Intrinsics.checkNotNull(legacyGoldUpgradeLoadPlanState);
        return legacyGoldUpgradeLoadPlanState;
    }
}
