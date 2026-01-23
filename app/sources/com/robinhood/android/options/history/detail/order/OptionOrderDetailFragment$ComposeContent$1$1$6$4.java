package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
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
final class OptionOrderDetailFragment$ComposeContent$1$1$6$4 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    final /* synthetic */ OptionOrderDetailViewState.LegRow $legRow;
    final /* synthetic */ OptionOrderDetailFragment this$0;

    OptionOrderDetailFragment$ComposeContent$1$1$6$4(OptionOrderDetailViewState.LegRow legRow, OptionOrderDetailFragment optionOrderDetailFragment) {
        this.$legRow = legRow;
        this.this$0 = optionOrderDetailFragment;
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
            ComposerKt.traceEventStart(-1942433817, i, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:298)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        StringResource titleResource = this.$legRow.getTitleResource();
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = titleResource.getText(resources).toString();
        StringResource subtitleResource = this.$legRow.getSubtitleResource();
        Resources resources2 = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String string3 = subtitleResource.getText(resources2).toString();
        StringResource quoteResource = this.$legRow.getQuoteResource();
        Resources resources3 = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(quoteResource.getText(resources3).toString());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$legRow);
        final OptionOrderDetailFragment optionOrderDetailFragment = this.this$0;
        final OptionOrderDetailViewState.LegRow legRow = this.$legRow;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeContent$1$1$6$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderDetailFragment$ComposeContent$1$1$6$4.invoke$lambda$1$lambda$0(optionOrderDetailFragment, legRow);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierFillMaxWidth$default, null, string2, string3, null, singleLine, null, false, false, false, 0L, this.$legRow.getClickable() ? function0 : null, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 6, 0, 2002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState.LegRow legRow) {
        optionOrderDetailFragment.getDuxo().logLegTap(legRow.getLoggingContext());
        Navigator navigator = optionOrderDetailFragment.getNavigator();
        Context contextRequireContext = optionOrderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, legRow.getFragmentKey(), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }
}
