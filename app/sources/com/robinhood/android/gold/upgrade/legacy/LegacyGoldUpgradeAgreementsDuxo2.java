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

/* compiled from: LegacyGoldUpgradeAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsDuxo$onStart$1$1", m3645f = "LegacyGoldUpgradeAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeAgreementsDuxo2 extends ContinuationImpl7 implements Function2<LegacyGoldUpgradeAgreementsViewState, Continuation<? super LegacyGoldUpgradeAgreementsViewState>, Object> {
    final /* synthetic */ UUID $selectedPlanId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyGoldUpgradeAgreementsDuxo2(UUID uuid, Continuation<? super LegacyGoldUpgradeAgreementsDuxo2> continuation) {
        super(2, continuation);
        this.$selectedPlanId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LegacyGoldUpgradeAgreementsDuxo2 legacyGoldUpgradeAgreementsDuxo2 = new LegacyGoldUpgradeAgreementsDuxo2(this.$selectedPlanId, continuation);
        legacyGoldUpgradeAgreementsDuxo2.L$0 = obj;
        return legacyGoldUpgradeAgreementsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LegacyGoldUpgradeAgreementsViewState legacyGoldUpgradeAgreementsViewState, Continuation<? super LegacyGoldUpgradeAgreementsViewState> continuation) {
        return ((LegacyGoldUpgradeAgreementsDuxo2) create(legacyGoldUpgradeAgreementsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((LegacyGoldUpgradeAgreementsViewState) this.L$0).copy(this.$selectedPlanId);
    }
}
