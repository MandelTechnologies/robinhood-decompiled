package com.robinhood.android.common.history.p082ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HistoryFilterHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryFilterHeaderKt$lambda$-416728188$1, reason: use source file name */
/* loaded from: classes2.dex */
final class HistoryFilterHeader2 implements Function2<Composer, Integer, Unit> {
    public static final HistoryFilterHeader2 INSTANCE = new HistoryFilterHeader2();

    HistoryFilterHeader2() {
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
            ComposerKt.traceEventStart(-416728188, i, -1, "com.robinhood.android.common.history.ui.ComposableSingletons$HistoryFilterHeaderKt.lambda$-416728188.<anonymous> (HistoryFilterHeader.kt:91)");
        }
        HistoryFilter historyFilter = HistoryFilter.ALL;
        HistoryFilter historyFilter2 = HistoryFilter.PERPETUALS_ORDERS;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(historyFilter, historyFilter2, HistoryFilter.PERPETUALS_MARGIN_CHANGE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.history.ui.ComposableSingletons$HistoryFilterHeaderKt$lambda$-416728188$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HistoryFilterHeader2.invoke$lambda$1$lambda$0((HistoryFilter) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HistoryFilterHeader4.HistoryFilterHeader(immutableList3PersistentListOf, historyFilter2, null, null, (Function1) objRememberedValue, composer, 24630, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(HistoryFilter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
