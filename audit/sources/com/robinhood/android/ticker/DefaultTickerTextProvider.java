package com.robinhood.android.ticker;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WrappedTicker.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/ticker/DefaultTickerTextProvider;", "Lcom/robinhood/android/ticker/TickerTextProvider;", "<init>", "()V", "TickerText", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Lcom/robinhood/android/ticker/TickerTextState$Style;", "TickerText-FNF3uiM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLcom/robinhood/android/ticker/TickerTextState$Style;Landroidx/compose/runtime/Composer;I)V", "lib-ticker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DefaultTickerTextProvider implements TickerTextProvider {
    public static final int $stable = 0;
    public static final DefaultTickerTextProvider INSTANCE = new DefaultTickerTextProvider();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerText_FNF3uiM$lambda$0(DefaultTickerTextProvider defaultTickerTextProvider, Modifier modifier, String str, long j, TickerTextState.Style style, int i, Composer composer, int i2) {
        defaultTickerTextProvider.mo19237TickerTextFNF3uiM(modifier, str, j, style, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private DefaultTickerTextProvider() {
    }

    @Override // com.robinhood.android.ticker.TickerTextProvider
    /* renamed from: TickerText-FNF3uiM, reason: not valid java name */
    public void mo19237TickerTextFNF3uiM(final Modifier modifier, final String text, final long j, final TickerTextState.Style style, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(1241206533);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(style.ordinal()) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241206533, i3, -1, "com.robinhood.android.ticker.DefaultTickerTextProvider.TickerText (WrappedTicker.kt:134)");
            }
            WrappedTickerKt.InternalTickerText(new TickerTextState(text, j, style, null, false, 24, null), modifier, composerStartRestartGroup, (i3 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ticker.DefaultTickerTextProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultTickerTextProvider.TickerText_FNF3uiM$lambda$0(this.f$0, modifier, text, j, style, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
