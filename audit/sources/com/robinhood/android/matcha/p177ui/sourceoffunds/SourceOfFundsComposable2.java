package com.robinhood.android.matcha.p177ui.sourceoffunds;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: SourceOfFundsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.ComposableSingletons$SourceOfFundsComposableKt$lambda$747694853$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SourceOfFundsComposable2 implements Function2<Composer, Integer, Unit> {
    public static final SourceOfFundsComposable2 INSTANCE = new SourceOfFundsComposable2();

    SourceOfFundsComposable2() {
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
            ComposerKt.traceEventStart(747694853, i, -1, "com.robinhood.android.matcha.ui.sourceoffunds.ComposableSingletons$SourceOfFundsComposableKt.lambda$747694853.<anonymous> (SourceOfFundsComposable.kt:52)");
        }
        BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, "------------", false, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain("------------ -------"), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2016, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.ComposableSingletons$SourceOfFundsComposableKt$lambda$747694853$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, (BentoSelectionRowState.$stable << 3) | 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
