package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoUpgradeDisclosureMarkdownContentSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureMarkdownContentSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureMarkdownContentSection {
    public static final CryptoUpgradeDisclosureMarkdownContentSection INSTANCE = new CryptoUpgradeDisclosureMarkdownContentSection();

    /* renamed from: lambda$-623082174, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8856lambda$623082174 = ComposableLambda3.composableLambdaInstance(-623082174, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureMarkdownContentSectionKt$lambda$-623082174$1
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
                ComposerKt.traceEventStart(-623082174, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureMarkdownContentSectionKt.lambda$-623082174.<anonymous> (CryptoUpgradeDisclosureMarkdownContentSection.kt:39)");
            }
            CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSection(new GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto("Help keep your Robinhood Crypto account safe by adding multiple layers of protection. This helps prevent anyone from accessing your account, even if they know your password. [Learn more](https://robinhood.com/eu/en/support/articles/security/#2factorauthentication)"), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-623082174$feature_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13156getLambda$623082174$feature_crypto_externalDebug() {
        return f8856lambda$623082174;
    }
}
