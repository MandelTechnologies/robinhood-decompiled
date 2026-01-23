package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeAgreementsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeAgreementsFragment2 extends FunctionReferenceImpl implements Function1<ApiGoldSweepAgreement, Unit> {
    LegacyGoldUpgradeAgreementsFragment2(Object obj) {
        super(1, obj, GoldUpgradeAgreementsFragmentContract.Callbacks.class, "onClickFullAgreement", "onClickFullAgreement(Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiGoldSweepAgreement apiGoldSweepAgreement) {
        invoke2(apiGoldSweepAgreement);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiGoldSweepAgreement p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GoldUpgradeAgreementsFragmentContract.Callbacks) this.receiver).onClickFullAgreement(p0);
    }
}
