package com.robinhood.android.trade.configuration;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OrderConfigurationDisclosureComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDisclosureClicked", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-trade-configuration_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.configuration.OrderConfigurationDisclosureComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderConfigurationDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderConfigurationDisclosureComposable$lambda$0(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OrderConfigurationDisclosureComposable(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OrderConfigurationDisclosureComposable(Modifier modifier, final Function0<Unit> onDisclosureClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onDisclosureClicked, "onDisclosureClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(834114905);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisclosureClicked) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(834114905, i3, -1, "com.robinhood.android.trade.configuration.OrderConfigurationDisclosureComposable (OrderConfigurationDisclosureComposable.kt:13)");
            }
            modifier3 = modifier4;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-460138735, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationDisclosureComposableKt.OrderConfigurationDisclosureComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-460138735, i5, -1, "com.robinhood.android.trade.configuration.OrderConfigurationDisclosureComposable.<anonymous> (OrderConfigurationDisclosureComposable.kt:15)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C29312R.string.order_configuration_stop_market_disclosure, composer2, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM();
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), fM21590getDefaultD9Ej5fM);
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, StringResources_androidKt.stringResource(C29312R.string.order_configuration_stop_market_disclosure_link_cta, composer2, 0), onDisclosureClicked, modifierM5143paddingVpY3zN4, bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composer2, i6).getTextS(), 0, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationDisclosureComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderConfigurationDisclosureComposable.OrderConfigurationDisclosureComposable$lambda$0(modifier3, onDisclosureClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
