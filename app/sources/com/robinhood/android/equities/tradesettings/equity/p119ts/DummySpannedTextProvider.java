package com.robinhood.android.equities.tradesettings.equity.p119ts;

import android.text.Spanned;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradingSessionBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/DummySpannedTextProvider;", "Lcom/robinhood/compose/bento/component/text/SpannedTextProvider;", "<init>", "()V", "SpannedText", "", "spanned", "Landroid/text/Spanned;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "SpannedText-gPmlwdY", "(Landroid/text/Spanned;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class DummySpannedTextProvider implements BentoSpannedText4 {
    public static final DummySpannedTextProvider INSTANCE = new DummySpannedTextProvider();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpannedText_gPmlwdY$lambda$3(DummySpannedTextProvider dummySpannedTextProvider, Spanned spanned, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0 function0, int i4, Composer composer, int i5) {
        dummySpannedTextProvider.mo13684SpannedTextgPmlwdY(spanned, modifier, color, color2, i, num, i2, i3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1));
        return Unit.INSTANCE;
    }

    private DummySpannedTextProvider() {
    }

    @Override // com.robinhood.compose.bento.component.text.BentoSpannedText4
    /* renamed from: SpannedText-gPmlwdY, reason: not valid java name */
    public void mo13684SpannedTextgPmlwdY(final Spanned spanned, final Modifier modifier, final Color color, final Color color2, final int i, final Integer num, final int i2, final int i3, final Function0<Unit> function0, Composer composer, final int i4) {
        int i5;
        int i6;
        Modifier modifierM4893clickableXHw0xAI$default;
        TextAlign textAlignM7912boximpl;
        Composer composer2;
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-379160259);
        if ((i4 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(spanned) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(color) ? 256 : 128;
        }
        if ((196608 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(num) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if ((100663296 & i4) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
        }
        int i7 = i5;
        if ((34144403 & i7) != 34144402 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-379160259, i7, -1, "com.robinhood.android.equities.tradesettings.equity.ts.DummySpannedTextProvider.SpannedText (EquityTradingSessionBottomSheet.kt:383)");
            }
            String string2 = spanned.toString();
            composerStartRestartGroup.startReplaceGroup(699225511);
            composerStartRestartGroup.startReplaceGroup(699226179);
            if (function0 != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (234881024 & i7) == 67108864;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.DummySpannedTextProvider$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DummySpannedTextProvider.SpannedText_gPmlwdY$lambda$2$lambda$1$lambda$0(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6 = 1;
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier, false, null, null, (Function0) objRememberedValue, 7, null);
            } else {
                i6 = 1;
                modifierM4893clickableXHw0xAI$default = modifier;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            if (num != null && num.intValue() == 8388611) {
                textAlignM7912boximpl = TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk());
            } else if (num != null && num.intValue() == 8388613) {
                textAlignM7912boximpl = TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk());
            } else {
                textAlignM7912boximpl = (num != null && num.intValue() == i6) ? TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()) : null;
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(string2, modifierM4893clickableXHw0xAI$default, color, null, null, null, textAlignM7912boximpl, 0, false, i2, 0, null, 0, null, composer2, (i7 & 896) | ((i7 << 9) & 1879048192), 0, 15800);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.DummySpannedTextProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DummySpannedTextProvider.SpannedText_gPmlwdY$lambda$3(this.f$0, spanned, modifier, color, color2, i, num, i2, i3, function0, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpannedText_gPmlwdY$lambda$2$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
