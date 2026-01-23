package com.robinhood.android.futures.sharedfuturesui;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransparentSelectionColors.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlin/Function0;", "", "content", "TransparentSelectionColors", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-shared-futures-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColorsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TransparentSelectionColors2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransparentSelectionColors$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        TransparentSelectionColors(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TransparentSelectionColors(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(736281500);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(736281500, i2, -1, "com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColors (TransparentSelectionColors.kt:31)");
            }
            Color.Companion companion = Color.INSTANCE;
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), null)), CompositionLocalsKt.getLocalTextToolbar().provides(TransparentSelectionColors.INSTANCE)}, content, composerStartRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColorsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransparentSelectionColors2.TransparentSelectionColors$lambda$0(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
