package com.robinhood.shared.crypto.p375ui.staking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SduiCryptoStakingDataRowCondensed.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensed$2$4$1 */
/* loaded from: classes6.dex */
public final class C38622x23e83f20 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UIComponent<ActionT> $it;

    /* JADX WARN: Multi-variable type inference failed */
    public C38622x23e83f20(UIComponent<? extends ActionT> uIComponent) {
        this.$it = uIComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355735006, i, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:123)");
        }
        SduiComponent3.SduiComponent(this.$it, null, null, composer, 0, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
