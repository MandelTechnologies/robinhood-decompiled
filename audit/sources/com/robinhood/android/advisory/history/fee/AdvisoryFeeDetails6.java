package com.robinhood.android.advisory.history.fee;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryFeeDetails.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt$lambda$-409030867$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryFeeDetails6 implements Function2<Composer, Integer, Unit> {
    public static final AdvisoryFeeDetails6 INSTANCE = new AdvisoryFeeDetails6();

    AdvisoryFeeDetails6() {
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
            ComposerKt.traceEventStart(-409030867, i, -1, "com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt.lambda$-409030867.<anonymous> (AdvisoryFeeDetails.kt:127)");
        }
        PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt$lambda$-409030867$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryFeeDetails6.invoke$lambda$1$lambda$0((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(null, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 507);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        AdvisoryFeeDetails5 advisoryFeeDetails5 = AdvisoryFeeDetails5.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, advisoryFeeDetails5.getLambda$1286332738$feature_advisory_history_externalDebug(), 3, null);
        LazyListScope.items$default(LazyColumn, 5, null, null, advisoryFeeDetails5.getLambda$1152556235$feature_advisory_history_externalDebug(), 6, null);
        return Unit.INSTANCE;
    }
}
