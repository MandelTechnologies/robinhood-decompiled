package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionOrderDetailFragment$ComposeContent$1$1$9 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    final /* synthetic */ OptionOrderDetailViewState.ActionRow $actionRow;
    final /* synthetic */ OptionOrderDetailViewState $state;
    final /* synthetic */ OptionOrderDetailFragment this$0;

    OptionOrderDetailFragment$ComposeContent$1$1$9(OptionOrderDetailViewState.ActionRow actionRow, OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState) {
        this.$actionRow = actionRow;
        this.this$0 = optionOrderDetailFragment;
        this.$state = optionOrderDetailViewState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
        invoke(lazyGridItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyGridItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1195467901, i, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:320)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        StringResource labelResource = this.$actionRow.getLabelResource();
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = labelResource.getText(resources).toString();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$actionRow) | composer.changedInstance(this.$state);
        final OptionOrderDetailFragment optionOrderDetailFragment = this.this$0;
        final OptionOrderDetailViewState.ActionRow actionRow = this.$actionRow;
        final OptionOrderDetailViewState optionOrderDetailViewState = this.$state;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeContent$1$1$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderDetailFragment$ComposeContent$1$1$9.invoke$lambda$1$lambda$0(optionOrderDetailFragment, actionRow, optionOrderDetailViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierFillMaxWidth$default, null, string2, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 6, 0, 2042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState.ActionRow actionRow, OptionOrderDetailViewState optionOrderDetailViewState) {
        OptionOrderDetailDuxo duxo = optionOrderDetailFragment.getDuxo();
        Context contextRequireContext = optionOrderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.onClickActionRow(actionRow, contextRequireContext, optionOrderDetailFragment.getNavigator(), optionOrderDetailViewState.getOptionOrderDetailContext());
        return Unit.INSTANCE;
    }
}
