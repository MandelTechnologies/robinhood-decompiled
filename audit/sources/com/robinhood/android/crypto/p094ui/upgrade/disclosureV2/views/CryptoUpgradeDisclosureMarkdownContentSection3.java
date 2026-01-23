package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoUpgradeDisclosureMarkdownContentSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CryptoUpgradeDisclosureMarkdownContentSection", "", "markdownContentSection", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoUpgradeDisclosureMarkdownContentSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureMarkdownContentSection3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureMarkdownContentSection$lambda$2(GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto markdownDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoUpgradeDisclosureMarkdownContentSection(markdownDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureMarkdownContentSectionPreview$lambda$3(int i, Composer composer, int i2) {
        CryptoUpgradeDisclosureMarkdownContentSectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoUpgradeDisclosureMarkdownContentSection(final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto markdownContentSection, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(markdownContentSection, "markdownContentSection");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1031536965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(markdownContentSection) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1031536965, i3, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSection (CryptoUpgradeDisclosureMarkdownContentSection.kt:18)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                int i5 = i3;
                String markdown_text = markdownContentSection.getMarkdown_text();
                MarkdownStyle style = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(style, null, null, null, null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), null, new MarkdownStyle.Link(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), true, false, 4, null), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, 0, null, 1839, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSection$lambda$1$lambda$0(context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(markdown_text, modifier3, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, (i5 & 112) | (MarkdownStyle.$stable << 6), 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSection$lambda$2(markdownContentSection, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i52 = i3;
            String markdown_text2 = markdownContentSection.getMarkdown_text();
            MarkdownStyle style2 = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            MarkdownStyle markdownStyleM16260copyR0sFphs$default2 = MarkdownStyle.m16260copyR0sFphs$default(style2, null, null, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), null, new MarkdownStyle.Link(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), true, false, 4, null), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null, 0, null, 1839, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(context);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSection$lambda$1$lambda$0(context, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(markdown_text2, modifier3, markdownStyleM16260copyR0sFphs$default2, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, (i52 & 112) | (MarkdownStyle.$stable << 6), 8);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureMarkdownContentSection$lambda$1$lambda$0(Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    public static final void CryptoUpgradeDisclosureMarkdownContentSectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1060851594);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1060851594, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionPreview (CryptoUpgradeDisclosureMarkdownContentSection.kt:37)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoUpgradeDisclosureMarkdownContentSection.INSTANCE.m13156getLambda$623082174$feature_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSectionPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
