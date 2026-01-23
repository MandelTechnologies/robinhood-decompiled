package com.robinhood.android.equityscreener.filters;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.equityscreener.models.UtilsKt;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelection;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelectionParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerFilterComponents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$SecondarySingleSelectFilter$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerFilterComponents6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<ScreenerFilterSelection> $activeItem;
    final /* synthetic */ Function1<ScreenerFilter, Unit> $onSelectionClicked;
    final /* synthetic */ ScreenerFilterSelectionParameters $option;

    /* JADX WARN: Multi-variable type inference failed */
    ScreenerFilterComponents6(ScreenerFilterSelectionParameters screenerFilterSelectionParameters, SnapshotState<ScreenerFilterSelection> snapshotState, Function1<? super ScreenerFilter, Unit> function1) {
        this.$option = screenerFilterSelectionParameters;
        this.$activeItem = snapshotState;
        this.$onSelectionClicked = function1;
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
            ComposerKt.traceEventStart(874185374, i, -1, "com.robinhood.android.equityscreener.filters.SecondarySingleSelectFilter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenerFilterComponents.kt:332)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
        String title = this.$option.getTitle();
        ScreenerFilterSelection value = this.$activeItem.getValue();
        boolean zAreEqual = Intrinsics.areEqual(value != null ? value.getId() : null, this.$option.getId());
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$activeItem) | composer.changedInstance(this.$option) | composer.changed(this.$onSelectionClicked);
        final SnapshotState<ScreenerFilterSelection> snapshotState = this.$activeItem;
        final ScreenerFilterSelectionParameters screenerFilterSelectionParameters = this.$option;
        final Function1<ScreenerFilter, Unit> function1 = this.$onSelectionClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$SecondarySingleSelectFilter$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenerFilterComponents6.invoke$lambda$1$lambda$0(snapshotState, screenerFilterSelectionParameters, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoChip.BentoSelectionChip((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, false, zAreEqual, null, title, composer, 0, 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, ScreenerFilterSelectionParameters screenerFilterSelectionParameters, Function1 function1) {
        ScreenerFilterSelection screenerFilterSelection = (ScreenerFilterSelection) snapshotState.getValue();
        if (!Intrinsics.areEqual(screenerFilterSelection != null ? screenerFilterSelection.getId() : null, screenerFilterSelectionParameters.getId())) {
            snapshotState.setValue(UtilsKt.toDefaultSelection(screenerFilterSelectionParameters));
            ScreenerFilterComponents.SecondarySingleSelectFilter$updateSelection$14(function1, UtilsKt.toDefaultSelection(screenerFilterSelectionParameters));
        }
        return Unit.INSTANCE;
    }
}
