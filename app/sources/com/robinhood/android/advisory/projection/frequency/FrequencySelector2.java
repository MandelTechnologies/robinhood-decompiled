package com.robinhood.android.advisory.projection.frequency;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FrequencySelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.frequency.ComposableSingletons$FrequencySelectorKt$lambda$-1464420908$1, reason: use source file name */
/* loaded from: classes7.dex */
final class FrequencySelector2 implements Function2<Composer, Integer, Unit> {
    public static final FrequencySelector2 INSTANCE = new FrequencySelector2();

    FrequencySelector2() {
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
            ComposerKt.traceEventStart(-1464420908, i, -1, "com.robinhood.android.advisory.projection.frequency.ComposableSingletons$FrequencySelectorKt.lambda$-1464420908.<anonymous> (FrequencySelector.kt:169)");
        }
        SimulateDepositFrequency simulateDepositFrequency = SimulateDepositFrequency.ONE_TIME;
        ImmutableList immutableList = extensions2.toImmutableList(SimulateDepositFrequency.getEntries());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.frequency.ComposableSingletons$FrequencySelectorKt$lambda$-1464420908$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FrequencySelector2.invoke$lambda$1$lambda$0((SimulateDepositFrequency) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FrequencySelector3.FrequencySelector(simulateDepositFrequency, immutableList, null, false, (Function1) objRememberedValue, composer, 24582, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SimulateDepositFrequency it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
