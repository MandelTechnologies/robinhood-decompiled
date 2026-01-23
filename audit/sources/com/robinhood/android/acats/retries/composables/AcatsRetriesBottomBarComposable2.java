package com.robinhood.android.acats.retries.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.retries.C7659R;
import com.robinhood.android.acats.retries.activity.AcatsRetriesViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsRetriesBottomBarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.retries.composables.AcatsRetriesBottomBarComposableKt$AcatsRetriesFooter$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsRetriesBottomBarComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onAgreementClicked;
    final /* synthetic */ Function0<Unit> $onSubmitClicked;
    final /* synthetic */ AcatsRetriesViewState $viewState;

    AcatsRetriesBottomBarComposable2(Function0<Unit> function0, AcatsRetriesViewState acatsRetriesViewState, Function0<Unit> function02) {
        this.$onAgreementClicked = function0;
        this.$viewState = acatsRetriesViewState;
        this.$onSubmitClicked = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(471945956, i, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesFooter.<anonymous>.<anonymous> (AcatsRetriesBottomBarComposable.kt:27)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C7659R.string.acats_retries_footer_disclosure_text, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C7659R.string.acats_retries_footer_disclosure_link, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), AcatsRetriesLayoutComposable.acatsRetriesFooterTextTestTag);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onAgreementClicked);
        final Function0<Unit> function0 = this.$onAgreementClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesBottomBarComposableKt$AcatsRetriesFooter$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsRetriesBottomBarComposable2.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, modifierTestTag, jM21426getFg20d7_KjU, 0L, textStyleM7655copyp1EtxEg$default, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        String strStringResource3 = StringResources_androidKt.stringResource(C7659R.string.acats_retries_footer_button_text, composer, 0);
        boolean z = this.$viewState.getSubmissionState() == AcatsRetriesViewState.SubmissionState.LOADING;
        BentoButtonKt.m20586BentoButtonEikTQX8(this.$onSubmitClicked, strStringResource3, TestTag3.testTag(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), AcatsRetriesLayoutComposable.acatsRetriesFooterButtonTestTag), null, null, this.$viewState.getSubmissionState().getReady() && this.$viewState.getEnableSubmitButton(), z, null, null, null, null, false, null, composer, 0, 0, 8088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
