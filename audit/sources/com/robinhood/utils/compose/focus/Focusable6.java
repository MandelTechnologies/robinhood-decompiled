package com.robinhood.utils.compose.focus;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Focusable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "requester", "Lkotlin/Function0;", "", "content", "Focusable", "(Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFocusRequester", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFocusRequester", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.focus.FocusableKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Focusable6 {
    private static final CompositionLocal6<FocusRequester> LocalFocusRequester = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.utils.compose.focus.FocusableKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Focusable6.LocalFocusRequester$lambda$1();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Focusable$lambda$0(FocusRequester focusRequester, Function2 function2, int i, Composer composer, int i2) {
        Focusable(focusRequester, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void Focusable(final FocusRequester requester, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(requester, "requester");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271859225);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(requester) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271859225, i2, -1, "com.robinhood.utils.compose.focus.Focusable (Focusable.kt:12)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalFocusRequester.provides(requester), ComposableLambda3.rememberComposableLambda(-2120545113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.focus.FocusableKt.Focusable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2120545113, i3, -1, "com.robinhood.utils.compose.focus.Focusable.<anonymous> (Focusable.kt:14)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.focus.FocusableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Focusable6.Focusable$lambda$0(requester, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final CompositionLocal6<FocusRequester> getLocalFocusRequester() {
        return LocalFocusRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FocusRequester LocalFocusRequester$lambda$1() {
        return new FocusRequester();
    }
}
