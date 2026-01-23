package com.robinhood.android.charts.span;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.models.p080db.SpanOption;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SpanOptionsDynamicSelector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0011\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/models/db/SpanOption;", "spanOptions", "", "activeSpan", "Lkotlin/Function1;", "", "onSpanSelected", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "onScrollStart", "", "showFadeScrim", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "trailingButton", "SpanOptionsDynamicSelector", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "toUnifiedSpan", "(Lcom/robinhood/android/charts/models/db/SpanOption;)Lcom/robinhood/android/charts/span/UnifiedSpan;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.SpanOptionsDynamicSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpanOptionsDynamicSelector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanOptionsDynamicSelector$lambda$1(ImmutableList immutableList, String str, Function1 function1, Modifier modifier, Function0 function0, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        SpanOptionsDynamicSelector(immutableList, str, function1, modifier, function0, z, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126 A[LOOP:0: B:100:0x0120->B:102:0x0126, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpanOptionsDynamicSelector(final ImmutableList<SpanOption> spanOptions, final String str, final Function1<? super String, Unit> onSpanSelected, Modifier modifier, Function0<Unit> function0, boolean z, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        boolean z2;
        int i6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Iterator<SpanOption> it;
        Composer composer2;
        final boolean z3;
        final Modifier modifier3;
        final Function0<Unit> function03;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(spanOptions, "spanOptions");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-852706320);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(spanOptions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            function32 = function3;
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                        }
                        i7 = i3;
                        if ((599187 & i7) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            Function0<Unit> function04 = i4 == 0 ? null : function02;
                            boolean z4 = i5 == 0 ? true : z2;
                            if (i6 != 0) {
                                function32 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-852706320, i7, -1, "com.robinhood.android.charts.span.SpanOptionsDynamicSelector (SpanOptionsDynamicSelector.kt:18)");
                            }
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spanOptions, 10));
                            it = spanOptions.iterator();
                            while (it.hasNext()) {
                                arrayList.add(toUnifiedSpan(it.next()));
                            }
                            boolean z5 = z4;
                            composer2 = composerStartRestartGroup;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34 = function32;
                            Modifier modifier5 = modifier4;
                            Function0<Unit> function05 = function04;
                            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(extensions2.toImmutableList(arrayList), str != null ? "" : str, onSpanSelected, false, null, z4, 0.0f, 80, null), modifier5, null, null, function05, null, function34, composer2, ((i7 >> 6) & 112) | (57344 & i7) | (3670016 & i7), 44);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z5;
                            modifier3 = modifier5;
                            function03 = function05;
                            function33 = function34;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function03 = function02;
                            z3 = z2;
                            composer2 = composerStartRestartGroup;
                            function33 = function32;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanOptionsDynamicSelectorKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SpanOptionsDynamicSelector.SpanOptionsDynamicSelector$lambda$1(spanOptions, str, onSpanSelected, modifier3, function03, z3, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    function32 = function3;
                    i7 = i3;
                    if ((599187 & i7) != 599186) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(spanOptions, 10));
                        it = spanOptions.iterator();
                        while (it.hasNext()) {
                        }
                        boolean z52 = z4;
                        composer2 = composerStartRestartGroup;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function342 = function32;
                        Modifier modifier52 = modifier4;
                        Function0<Unit> function052 = function04;
                        UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(extensions2.toImmutableList(arrayList2), str != null ? "" : str, onSpanSelected, false, null, z4, 0.0f, 80, null), modifier52, null, null, function052, null, function342, composer2, ((i7 >> 6) & 112) | (57344 & i7) | (3670016 & i7), 44);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z52;
                        modifier3 = modifier52;
                        function03 = function052;
                        function33 = function342;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                function32 = function3;
                i7 = i3;
                if ((599187 & i7) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3;
            if ((599187 & i7) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3;
        if ((599187 & i7) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final UnifiedSpan<String> toUnifiedSpan(SpanOption spanOption) {
        return new UnifiedSpan<>(spanOption.getQueryValue(), spanOption.getDisplayValue(), spanOption.getHasBlinkingDot(), false, null, null, 56, null);
    }
}
