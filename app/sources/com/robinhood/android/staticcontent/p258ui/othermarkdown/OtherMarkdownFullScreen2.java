package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OtherMarkdownFullScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$OtherMarkdownFullScreen$3$2$2, reason: use source file name */
/* loaded from: classes5.dex */
final class OtherMarkdownFullScreen2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OtherMarkdownFragmentKey.PrimaryButton $primaryButton;
    final /* synthetic */ UriHandler $uriHandler;

    OtherMarkdownFullScreen2(OtherMarkdownFragmentKey.PrimaryButton primaryButton, UriHandler uriHandler) {
        this.$primaryButton = primaryButton;
        this.$uriHandler = uriHandler;
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
            ComposerKt.traceEventStart(1294256736, i, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous>.<anonymous>.<anonymous> (OtherMarkdownFullScreen.kt:123)");
        }
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
        String text = this.$primaryButton.getText();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$uriHandler) | composer.changedInstance(this.$primaryButton);
        final UriHandler uriHandler = this.$uriHandler;
        final OtherMarkdownFragmentKey.PrimaryButton primaryButton = this.$primaryButton;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$OtherMarkdownFullScreen$3$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtherMarkdownFullScreen2.invoke$lambda$1$lambda$0(uriHandler, primaryButton);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, text, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UriHandler uriHandler, OtherMarkdownFragmentKey.PrimaryButton primaryButton) {
        uriHandler.openUri(primaryButton.getLink());
        return Unit.INSTANCE;
    }
}
