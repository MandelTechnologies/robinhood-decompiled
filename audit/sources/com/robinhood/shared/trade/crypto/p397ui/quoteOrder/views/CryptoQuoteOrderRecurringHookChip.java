package com.robinhood.shared.trade.crypto.p397ui.quoteOrder.views;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuoteOrderRecurringHookChip.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CryptoQuoteOrderRecurringHookChip", "", "state", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/views/CryptoQuoteOrderRecurringHookChipState;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/views/CryptoQuoteOrderRecurringHookChipState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChipKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuoteOrderRecurringHookChip {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuoteOrderRecurringHookChip$lambda$0(CryptoQuoteOrderRecurringHookChipState cryptoQuoteOrderRecurringHookChipState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoQuoteOrderRecurringHookChip(cryptoQuoteOrderRecurringHookChipState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoQuoteOrderRecurringHookChip(final CryptoQuoteOrderRecurringHookChipState state, Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function0;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650931528);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function0 = onClick;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650931528, i3, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChip (CryptoQuoteOrderRecurringHookChip.kt:15)");
            }
            BentoChip.BentoDropdownChip(onClick, modifier3, false, state.getShouldDisplayRecurringIcon() ? new BentoChip2.Accessory.Dropdown.LeadingIcon(ServerToBentoAssetMapper2.RECURRING_16, null, 2, null) : null, StringResources6.getText(state.getText(), composerStartRestartGroup, StringResource.$stable).toString(), composerStartRestartGroup, ((i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (BentoChip2.Accessory.Dropdown.LeadingIcon.$stable << 9), 4);
            function0 = onClick;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuoteOrderRecurringHookChip.CryptoQuoteOrderRecurringHookChip$lambda$0(state, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
