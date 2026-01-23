package com.robinhood.android.equityscreener.filters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.equityscreener.models.UtilsKt;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelection;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelectionParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ScreenerFilterComponents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerFilterComponents4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<ScreenerFilterSelection> $activeItem;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSelectedMultiSelectParent;
    final /* synthetic */ Function1<ScreenerFilter, Unit> $onSelectionClicked;
    final /* synthetic */ ScreenerFilterSelectionParameters $option;
    final /* synthetic */ boolean $optionSelected;
    final /* synthetic */ List<ScreenerFilterSelectionParameters> $options;

    /* JADX WARN: Multi-variable type inference failed */
    ScreenerFilterComponents4(ScreenerFilterSelectionParameters screenerFilterSelectionParameters, int i, List<ScreenerFilterSelectionParameters> list, boolean z, boolean z2, SnapshotState<ScreenerFilterSelection> snapshotState, Function1<? super ScreenerFilter, Unit> function1) {
        this.$option = screenerFilterSelectionParameters;
        this.$index = i;
        this.$options = list;
        this.$isSelectedMultiSelectParent = z;
        this.$optionSelected = z2;
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
            ComposerKt.traceEventStart(937847761, i, -1, "com.robinhood.android.equityscreener.filters.PrimarySingleSelectFilter.<anonymous>.<anonymous>.<anonymous> (ScreenerFilterComponents.kt:265)");
        }
        BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
        String title = this.$option.getTitle();
        String subtitle = this.$option.getSubtitle();
        BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, title, this.$optionSelected, (BentoBaseRowState.Text) (subtitle != null ? new BentoBaseRowState.Text.Plain(subtitle) : null), false, this.$index < this.$options.size() - 1 && !this.$isSelectedMultiSelectParent, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$activeItem) | composer.changedInstance(this.$option) | composer.changed(this.$onSelectionClicked);
        final SnapshotState<ScreenerFilterSelection> snapshotState = this.$activeItem;
        final ScreenerFilterSelectionParameters screenerFilterSelectionParameters = this.$option;
        final Function1<ScreenerFilter, Unit> function1 = this.$onSelectionClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenerFilterComponents4.invoke$lambda$1$lambda$0(snapshotState, screenerFilterSelectionParameters, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, ScreenerFilterSelectionParameters screenerFilterSelectionParameters, Function1 function1) {
        ScreenerFilterSelection screenerFilterSelection = (ScreenerFilterSelection) snapshotState.getValue();
        if (!Intrinsics.areEqual(screenerFilterSelection != null ? screenerFilterSelection.getId() : null, screenerFilterSelectionParameters.getId())) {
            snapshotState.setValue(UtilsKt.toDefaultSelection(screenerFilterSelectionParameters));
            ScreenerFilterComponents.PrimarySingleSelectFilter$updateSelection(function1, UtilsKt.toDefaultSelection(screenerFilterSelectionParameters));
        }
        return Unit.INSTANCE;
    }
}
