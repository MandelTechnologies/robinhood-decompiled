package com.robinhood.shared.crypto.p375ui.staking;

import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiCryptoStakingDataRowCondensed.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensed$1$1 */
/* loaded from: classes6.dex */
public final class C38618xe7cbbf8f implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ CryptoDemeterDataRowCondensed<ActionT> $component;

    /* JADX WARN: Multi-variable type inference failed */
    public C38618xe7cbbf8f(CryptoDemeterDataRowCondensed<? extends ActionT> cryptoDemeterDataRowCondensed) {
        this.$component = cryptoDemeterDataRowCondensed;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SduiCryptoStakingDataRowCondensedKt.setCryptoDemeterDataRowCondensed(semantics, this.$component);
    }
}
