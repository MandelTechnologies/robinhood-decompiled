package com.robinhood.android.gold.upgrade.legacy;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsDuxo$onStart$1$1", m3645f = "LegacyGoldUpgradeGoldDaysValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeGoldDaysValuePropsDuxo2 extends ContinuationImpl7 implements Function2<LegacyGoldUpgradeGoldDaysValuePropsViewState, Continuation<? super LegacyGoldUpgradeGoldDaysValuePropsViewState>, Object> {
    final /* synthetic */ UUID $selectedPlanId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyGoldUpgradeGoldDaysValuePropsDuxo2(UUID uuid, Continuation<? super LegacyGoldUpgradeGoldDaysValuePropsDuxo2> continuation) {
        super(2, continuation);
        this.$selectedPlanId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LegacyGoldUpgradeGoldDaysValuePropsDuxo2 legacyGoldUpgradeGoldDaysValuePropsDuxo2 = new LegacyGoldUpgradeGoldDaysValuePropsDuxo2(this.$selectedPlanId, continuation);
        legacyGoldUpgradeGoldDaysValuePropsDuxo2.L$0 = obj;
        return legacyGoldUpgradeGoldDaysValuePropsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LegacyGoldUpgradeGoldDaysValuePropsViewState legacyGoldUpgradeGoldDaysValuePropsViewState, Continuation<? super LegacyGoldUpgradeGoldDaysValuePropsViewState> continuation) {
        return ((LegacyGoldUpgradeGoldDaysValuePropsDuxo2) create(legacyGoldUpgradeGoldDaysValuePropsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((LegacyGoldUpgradeGoldDaysValuePropsViewState) this.L$0).copy(this.$selectedPlanId);
    }
}
