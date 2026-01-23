package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.CornerSize2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCardBadge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"BentoCardBadge", "", "modifier", "Landroidx/compose/ui/Modifier;", "badge", "Lcom/robinhood/compose/bento/component/cards/CardBadge;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/cards/CardBadge;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCardBadgeKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCardBadge {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCardBadge$lambda$0(Modifier modifier, CardBadge cardBadge, int i, int i2, Composer composer, int i3) {
        BentoCardBadge(modifier, cardBadge, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BentoCardBadge(Modifier modifier, final CardBadge badge, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813449347);
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
            i3 |= composerStartRestartGroup.changed(badge) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813449347, i3, -1, "com.robinhood.compose.bento.component.cards.BentoCardBadge (BentoCardBadge.kt:24)");
            }
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long jM20884getBackgroundColor0d7_KjU = badge.m20884getBackgroundColor0d7_KjU();
            int i5 = CardDefaults.$stable;
            CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM20884getBackgroundColor0d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i5 << 12, 14);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            CardKt.Card(modifier3, RoundedCornerShape2.RoundedCornerShape(CornerSize2.CornerSize(50)), cardColorsM5729cardColorsro_MJ88, cardDefaults.m5730cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i5 << 18, 63), null, ComposableLambda3.rememberComposableLambda(-346647825, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCardBadgeKt.BentoCardBadge.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 Card, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-346647825, i6, -1, "com.robinhood.compose.bento.component.cards.BentoCardBadge.<anonymous> (BentoCardBadge.kt:33)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, 6).m21595getXsmallD9Ej5fM());
                    String text = badge.getText();
                    long jM20885getTextColor0d7_KjU = badge.m20885getTextColor0d7_KjU();
                    TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                    BentoText2.m20747BentoText38GnDrw(text, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM20885getTextColor0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, (i3 & 14) | 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCardBadgeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoCardBadge.BentoCardBadge$lambda$0(modifier3, badge, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
