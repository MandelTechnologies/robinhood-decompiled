package com.robinhood.android.equityscreener.filters;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerFilterFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$FilterSegment$1$1$1$3, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerFilterFragment3 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ ScreenerIndicatorGroup $group;
    final /* synthetic */ Set<String> $selectedColumns;
    final /* synthetic */ EquityScreenerFilterFragment this$0;

    EquityScreenerFilterFragment3(ScreenerIndicatorGroup screenerIndicatorGroup, EquityScreenerFilterFragment equityScreenerFilterFragment, Set<String> set) {
        this.$group = screenerIndicatorGroup;
        this.this$0 = equityScreenerFilterFragment;
        this.$selectedColumns = set;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1921112634, i2, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.FilterSegment.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerFilterFragment.kt:141)");
        }
        final ScreenerIndicator screenerIndicator = this.$group.getIndicators().get(i);
        EquityScreenerFilterFragment equityScreenerFilterFragment = this.this$0;
        String title = screenerIndicator.getTitle();
        boolean zContains = this.$selectedColumns.contains(screenerIndicator.getKey());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(screenerIndicator);
        final EquityScreenerFilterFragment equityScreenerFilterFragment2 = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$FilterSegment$1$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityScreenerFilterFragment3.invoke$lambda$1$lambda$0(equityScreenerFilterFragment2, screenerIndicator);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        equityScreenerFilterFragment.IndicatorRow(null, title, zContains, (Function0) objRememberedValue, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EquityScreenerFilterFragment equityScreenerFilterFragment, ScreenerIndicator screenerIndicator) {
        equityScreenerFilterFragment.showIndicatorScreen(screenerIndicator);
        return Unit.INSTANCE;
    }
}
