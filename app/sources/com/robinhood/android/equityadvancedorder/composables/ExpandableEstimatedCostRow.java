package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ExpandableEstimatedCostRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$ExpandableEstimatedCostRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ExpandableEstimatedCostRow {
    public static final ExpandableEstimatedCostRow INSTANCE = new ExpandableEstimatedCostRow();
    private static Function2<Composer, Integer, Unit> lambda$918051299 = ComposableLambda3.composableLambdaInstance(918051299, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$ExpandableEstimatedCostRowKt$lambda$918051299$1
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
                ComposerKt.traceEventStart(918051299, i, -1, "com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$ExpandableEstimatedCostRowKt.lambda$918051299.<anonymous> (ExpandableEstimatedCostRow.kt:255)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("Estimated Cost");
            StringResource stringResourceInvoke2 = companion.invoke("$1,005.00");
            BigDecimal bigDecimal = new BigDecimal("10");
            BigDecimal bigDecimal2 = new BigDecimal("100.00");
            Result.Companion companion2 = Result.INSTANCE;
            ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow(new EquityOrderFormRowState.ExpandableEstimatedCost(stringResourceInvoke, stringResourceInvoke2, bigDecimal, bigDecimal2, Result.m28549boximpl(Result.m28550constructorimpl(new BigDecimal("5.00"))), extensions2.persistentListOf(), true, Result.m28549boximpl(Result.m28550constructorimpl(new BigDecimal("0.15"))), 0, 256, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$918051299$lib_equity_advanced_order_externalDebug() {
        return lambda$918051299;
    }
}
