package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamValuePropsContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedValuePropsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedValuePropsComposable7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<Action, Unit> $onAction;
    final /* synthetic */ StreamValuePropsContentResponse $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldUnifiedValuePropsComposable7(StreamValuePropsContentResponse streamValuePropsContentResponse, Function1<? super Action, Unit> function1) {
        this.$this_with = streamValuePropsContentResponse;
        this.$onAction = function1;
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
            ComposerKt.traceEventStart(-2069891082, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsComposable.kt:130)");
        }
        final Cta cta = this.$this_with.getCta();
        if (cta != null) {
            StreamValuePropsContentResponse streamValuePropsContentResponse = this.$this_with;
            final Function1<Action, Unit> function1 = this.$onAction;
            String text = cta.getText();
            String cta_disclosure_markdown = streamValuePropsContentResponse.getCta_disclosure_markdown();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(cta);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposableKt$Loaded$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedValuePropsComposable7.invoke$lambda$2$lambda$1$lambda$0(function1, cta);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldUnifiedBottomBar.GoldUnifiedBottomBar(text, (Function0) objRememberedValue, GoldUnifiedValuePropsComposable3.GoldValuePropsCtaTestTag, null, cta_disclosure_markdown, false, false, null, null, null, composer, 384, 1000);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, Cta cta) {
        function1.invoke(cta.getAction());
        return Unit.INSTANCE;
    }
}
