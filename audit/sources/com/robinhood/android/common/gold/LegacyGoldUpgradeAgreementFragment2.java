package com.robinhood.android.common.gold;

import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class LegacyGoldUpgradeAgreementFragment2 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    LegacyGoldUpgradeAgreementFragment2(Object obj) {
        super(1, obj, LegacyGoldUpgradeAgreementFragment.Callbacks.class, "onDisclosureAccepted", "onDisclosureAccepted(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID uuid) {
        ((LegacyGoldUpgradeAgreementFragment.Callbacks) this.receiver).onDisclosureAccepted(uuid);
    }
}
