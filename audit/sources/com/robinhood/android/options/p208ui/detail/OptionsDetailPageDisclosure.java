package com.robinhood.android.options.p208ui.detail;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"OptionsDetailPageDisclosure", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;", "onDisclosureTapped", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDisclosureKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageDisclosure$lambda$2(OptionsDetailPageBodyState2.Disclosure disclosure, Function1 function1, int i, Composer composer, int i2) {
        OptionsDetailPageDisclosure(disclosure, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsDetailPageDisclosure(final OptionsDetailPageBodyState2.Disclosure state, final Function1<? super String, Unit> onDisclosureTapped, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDisclosureTapped, "onDisclosureTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1058079155);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDisclosureTapped) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058079155, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageDisclosure (OptionsDetailPageDisclosure.kt:14)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM());
            int i4 = i2;
            String disclosure = state.getDisclosure();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            long jM21368getAccent0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDisclosureKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsDetailPageDisclosure.OptionsDetailPageDisclosure$lambda$1$lambda$0(onDisclosureTapped, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(disclosure, strStringResource, (Function0) objRememberedValue, modifierM5143paddingVpY3zN4, jM21426getFg20d7_KjU, jM21368getAccent0d7_KjU, textS, 0, composerStartRestartGroup, 0, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDisclosureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageDisclosure.OptionsDetailPageDisclosure$lambda$2(state, onDisclosureTapped, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageDisclosure$lambda$1$lambda$0(Function1 function1, OptionsDetailPageBodyState2.Disclosure disclosure) {
        function1.invoke(disclosure.getFullDisclosureContentfulId());
        return Unit.INSTANCE;
    }
}
