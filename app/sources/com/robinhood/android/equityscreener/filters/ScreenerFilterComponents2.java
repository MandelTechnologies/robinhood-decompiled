package com.robinhood.android.equityscreener.filters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.equityscreener.models.UtilsKt;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelection;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelectionParameters;
import java.util.Collection;
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
/* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$MultiSelectFilter$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerFilterComponents2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<ScreenerFilterSelection> $checkedItems;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSecondary;
    final /* synthetic */ Function1<ScreenerFilter, Unit> $onSelectionClicked;
    final /* synthetic */ ScreenerFilterSelectionParameters $option;
    final /* synthetic */ List<ScreenerFilterSelectionParameters> $options;

    /* JADX WARN: Multi-variable type inference failed */
    ScreenerFilterComponents2(ScreenerFilterSelectionParameters screenerFilterSelectionParameters, List<ScreenerFilterSelection> list, int i, List<ScreenerFilterSelectionParameters> list2, boolean z, Function1<? super ScreenerFilter, Unit> function1) {
        this.$option = screenerFilterSelectionParameters;
        this.$checkedItems = list;
        this.$index = i;
        this.$options = list2;
        this.$isSecondary = z;
        this.$onSelectionClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean z;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96546820, i, -1, "com.robinhood.android.equityscreener.filters.MultiSelectFilter.<anonymous>.<anonymous>.<anonymous> (ScreenerFilterComponents.kt:173)");
        }
        BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
        String title = this.$option.getTitle();
        String subtitle = this.$option.getSubtitle();
        BentoBaseRowState.Text.Plain plain = subtitle != null ? new BentoBaseRowState.Text.Plain(subtitle) : null;
        List<ScreenerFilterSelection> list = this.$checkedItems;
        ScreenerFilterSelectionParameters screenerFilterSelectionParameters = this.$option;
        boolean z2 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (ScreenerFilterSelection screenerFilterSelection : list) {
                if (Intrinsics.areEqual(screenerFilterSelectionParameters.getId(), screenerFilterSelection != null ? screenerFilterSelection.getId() : null)) {
                    z = false;
                    z2 = true;
                    break;
                }
            }
            z = false;
        }
        BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, title, z2, (BentoBaseRowState.Text) plain, false, (this.$index < this.$options.size() - 1 || this.$isSecondary) ? true : z, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$checkedItems) | composer.changed(this.$index) | composer.changedInstance(this.$option) | composer.changed(this.$onSelectionClicked);
        final List<ScreenerFilterSelection> list2 = this.$checkedItems;
        final int i2 = this.$index;
        final ScreenerFilterSelectionParameters screenerFilterSelectionParameters2 = this.$option;
        final Function1<ScreenerFilter, Unit> function1 = this.$onSelectionClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$MultiSelectFilter$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenerFilterComponents2.invoke$lambda$2$lambda$1(list2, i2, screenerFilterSelectionParameters2, function1);
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
    public static final Unit invoke$lambda$2$lambda$1(List list, int i, ScreenerFilterSelectionParameters screenerFilterSelectionParameters, Function1 function1) {
        ScreenerFilterSelection screenerFilterSelection = (ScreenerFilterSelection) list.get(i);
        if (Intrinsics.areEqual(screenerFilterSelection != null ? screenerFilterSelection.getId() : null, screenerFilterSelectionParameters.getId())) {
            list.set(i, null);
        } else {
            list.set(i, UtilsKt.toDefaultSelection(screenerFilterSelectionParameters));
        }
        ScreenerFilterComponents.MultiSelectFilter$updatedSelection(function1, list);
        return Unit.INSTANCE;
    }
}
