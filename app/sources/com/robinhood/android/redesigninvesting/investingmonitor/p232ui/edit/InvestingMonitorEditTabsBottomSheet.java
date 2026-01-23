package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorEditTabsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.ComposableSingletons$InvestingMonitorEditTabsBottomSheetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorEditTabsBottomSheet {
    public static final InvestingMonitorEditTabsBottomSheet INSTANCE = new InvestingMonitorEditTabsBottomSheet();
    private static Function6<LazyItemScope, CuratedList, Integer, Boolean, Composer, Integer, Unit> lambda$1096342229 = ComposableLambda3.composableLambdaInstance(1096342229, false, new Function6<LazyItemScope, CuratedList, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.ComposableSingletons$InvestingMonitorEditTabsBottomSheetKt$lambda$1096342229$1
        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, CuratedList curatedList, Integer num, Boolean bool, Composer composer, Integer num2) {
            invoke(lazyItemScope, curatedList, num.intValue(), bool.booleanValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope reorderableItems, CuratedList tab, int i, boolean z, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
            Intrinsics.checkNotNullParameter(tab, "tab");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096342229, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.ComposableSingletons$InvestingMonitorEditTabsBottomSheetKt.lambda$1096342229.<anonymous> (InvestingMonitorEditTabsBottomSheet.kt:97)");
            }
            InvestingMonitorEditTabsBottomSheet3.CuratedListItem(tab, z, composer, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function6<LazyItemScope, CuratedList, Integer, Boolean, Composer, Integer, Unit> getLambda$1096342229$feature_investing_monitor_externalDebug() {
        return lambda$1096342229;
    }
}
