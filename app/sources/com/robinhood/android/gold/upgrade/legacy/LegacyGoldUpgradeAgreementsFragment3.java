package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeAgreementsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment$ComposeContent$1$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeAgreementsFragment3 extends FunctionReferenceImpl implements Function2<Boolean, UUID, Unit> {
    LegacyGoldUpgradeAgreementsFragment3(Object obj) {
        super(2, obj, GoldUpgradeAgreementsFragmentContract.Callbacks.class, "onClickAgreementsCta", "onClickAgreementsCta(ZLjava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, UUID uuid) {
        invoke(bool.booleanValue(), uuid);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, UUID uuid) {
        ((GoldUpgradeAgreementsFragmentContract.Callbacks) this.receiver).onClickAgreementsCta(z, uuid);
    }
}
