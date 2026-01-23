package com.robinhood.android.equityscreener.datadisplay;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayViewState;
import com.robinhood.equityscreener.models.api.ColumnInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerDataDisplayFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$1$1$1$5, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerDataDisplayFragment6 implements Function6<LazyItemScope, ColumnInformation, Integer, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ ScreenerDataDisplayViewState.Loaded $state;
    final /* synthetic */ ScreenerDataDisplayFragment this$0;

    ScreenerDataDisplayFragment6(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayViewState.Loaded loaded) {
        this.this$0 = screenerDataDisplayFragment;
        this.$state = loaded;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, ColumnInformation columnInformation, Integer num, Boolean bool, Composer composer, Integer num2) {
        invoke(lazyItemScope, columnInformation, num.intValue(), bool.booleanValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope reorderableItems, ColumnInformation item, int i, boolean z, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
        Intrinsics.checkNotNullParameter(item, "item");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1367195718, i2, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.DataDisplayList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenerDataDisplayFragment.kt:137)");
        }
        ScreenerDataDisplayFragment screenerDataDisplayFragment = this.this$0;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$state);
        final ScreenerDataDisplayFragment screenerDataDisplayFragment2 = this.this$0;
        final ScreenerDataDisplayViewState.Loaded loaded = this.$state;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$1$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerDataDisplayFragment6.invoke$lambda$1$lambda$0(screenerDataDisplayFragment2, loaded, (ColumnInformation) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        int i3 = i2 << 3;
        screenerDataDisplayFragment.DataDisplayRow(reorderableItems, null, item, true, z, z, (Function2) objRememberedValue, composer, (i2 & 14) | 3072 | (i3 & 896) | (i3 & 57344) | ((i2 << 6) & 458752), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayViewState.Loaded loaded, ColumnInformation columnInfo, boolean z) {
        Intrinsics.checkNotNullParameter(columnInfo, "columnInfo");
        screenerDataDisplayFragment.getDuxo().markColumnVisibility(loaded.getVisibleIndicators(), columnInfo, z);
        return Unit.INSTANCE;
    }
}
