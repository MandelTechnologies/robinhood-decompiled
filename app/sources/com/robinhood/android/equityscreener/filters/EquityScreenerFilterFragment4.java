package com.robinhood.android.equityscreener.filters;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerFilterFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$FilterSegment$1$1$1$4, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerFilterFragment4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotStateMap<String, Boolean> $expandedGroupMap;
    final /* synthetic */ Boolean $expandedState;
    final /* synthetic */ ScreenerIndicatorGroup $group;
    final /* synthetic */ EquityScreenerFilterFragment this$0;

    EquityScreenerFilterFragment4(Boolean bool, EquityScreenerFilterFragment equityScreenerFilterFragment, SnapshotStateMap<String, Boolean> snapshotStateMap, ScreenerIndicatorGroup screenerIndicatorGroup) {
        this.$expandedState = bool;
        this.this$0 = equityScreenerFilterFragment;
        this.$expandedGroupMap = snapshotStateMap;
        this.$group = screenerIndicatorGroup;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotStateMap snapshotStateMap, ScreenerIndicatorGroup screenerIndicatorGroup, boolean z) {
        snapshotStateMap.put(screenerIndicatorGroup.getTitle(), Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1479518671, i, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.FilterSegment.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerFilterFragment.kt:151)");
        }
        Boolean bool = this.$expandedState;
        composer.startReplaceGroup(-183265837);
        if (bool == null) {
            composer2 = composer;
        } else {
            EquityScreenerFilterFragment equityScreenerFilterFragment = this.this$0;
            final SnapshotStateMap<String, Boolean> snapshotStateMap = this.$expandedGroupMap;
            final ScreenerIndicatorGroup screenerIndicatorGroup = this.$group;
            final boolean zBooleanValue = bool.booleanValue();
            String string2 = zBooleanValue ? equityScreenerFilterFragment.getString(C15652R.string.screener_filters_show_more) : equityScreenerFilterFragment.getString(C15652R.string.screener_filters_show_less);
            Intrinsics.checkNotNull(string2);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(snapshotStateMap) | composer.changedInstance(screenerIndicatorGroup) | composer.changed(zBooleanValue);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$FilterSegment$1$1$1$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityScreenerFilterFragment4.invoke$lambda$2$lambda$1$lambda$0(snapshotStateMap, screenerIndicatorGroup, zBooleanValue);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            composer2 = composer;
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, string2, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer2, 0, 120);
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        Spacer2.Spacer(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
