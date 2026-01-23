package com.robinhood.android.equityscreener.table;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equityscreener.table.EquityScreenerTableFragment;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $displayShowAll$delegate;

    EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2$1$1(SnapshotState<Boolean> snapshotState) {
        this.$displayShowAll$delegate = snapshotState;
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
            ComposerKt.traceEventStart(1992123535, i, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:337)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composer, 0);
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$displayShowAll$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2$1$1.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer, 6, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        EquityScreenerTableFragment.C157642.AnonymousClass2.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$6(snapshotState, false);
        return Unit.INSTANCE;
    }
}
