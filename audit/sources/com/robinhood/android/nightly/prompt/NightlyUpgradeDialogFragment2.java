package com.robinhood.android.nightly.prompt;

import android.content.Intent;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NightlyUpgradeDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2$1$3, reason: use source file name */
/* loaded from: classes8.dex */
final class NightlyUpgradeDialogFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NightlyUpgradeDialogFragment this$0;

    NightlyUpgradeDialogFragment2(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
        this.this$0 = nightlyUpgradeDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment, String linkText) {
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        if (Intrinsics.areEqual(linkText, "add_account")) {
            nightlyUpgradeDialogFragment.requireContext().startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new String[]{"com.google"}));
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1864393531, i, -1, "com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (NightlyUpgradeDialogFragment.kt:47)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C22599R.string.nightly_dialog_content_markdown, composer, 0);
        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
        TextAlign.Companion companion = TextAlign.INSTANCE;
        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(null, companion.m7924getStarte0LSkKk(), 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 29);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NightlyUpgradeDialogFragment2.invoke$lambda$1$lambda$0(nightlyUpgradeDialogFragment, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoMarkdownText2.BentoMarkdownText(strStringResource, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
        String strStringResource2 = StringResources_androidKt.stringResource(C22599R.string.nightly_reminder_never, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
        final NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2$1$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NightlyUpgradeDialogFragment2.invoke$lambda$3$lambda$2(nightlyUpgradeDialogFragment2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 13, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A("", strStringResource2, function0, modifierM5146paddingqDBjuR0$default, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, bentoTheme.getTypography(composer, i2).getTextS(), companion.m7919getCentere0LSkKk(), composer, 3078, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
        nightlyUpgradeDialogFragment.getLastNightlyPromptPref().setNeverPromptAgainDate();
        nightlyUpgradeDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
