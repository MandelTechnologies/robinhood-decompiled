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

/* compiled from: LegacyGoldUpgradeValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsDuxo$onStart$1$1", m3645f = "LegacyGoldUpgradeValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeValuePropsDuxo2 extends ContinuationImpl7 implements Function2<LegacyGoldUpgradeValuePropsViewState, Continuation<? super LegacyGoldUpgradeValuePropsViewState>, Object> {
    final /* synthetic */ UUID $selectedPlanId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyGoldUpgradeValuePropsDuxo2(UUID uuid, Continuation<? super LegacyGoldUpgradeValuePropsDuxo2> continuation) {
        super(2, continuation);
        this.$selectedPlanId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LegacyGoldUpgradeValuePropsDuxo2 legacyGoldUpgradeValuePropsDuxo2 = new LegacyGoldUpgradeValuePropsDuxo2(this.$selectedPlanId, continuation);
        legacyGoldUpgradeValuePropsDuxo2.L$0 = obj;
        return legacyGoldUpgradeValuePropsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LegacyGoldUpgradeValuePropsViewState legacyGoldUpgradeValuePropsViewState, Continuation<? super LegacyGoldUpgradeValuePropsViewState> continuation) {
        return ((LegacyGoldUpgradeValuePropsDuxo2) create(legacyGoldUpgradeValuePropsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((LegacyGoldUpgradeValuePropsViewState) this.L$0).copy(this.$selectedPlanId);
    }
}
