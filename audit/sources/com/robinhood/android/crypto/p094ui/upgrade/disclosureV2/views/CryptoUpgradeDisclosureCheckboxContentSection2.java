package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoUpgradeDisclosureCheckboxContentSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureCheckboxContentSectionKt$lambda$-170124845$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureCheckboxContentSection2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoUpgradeDisclosureCheckboxContentSection2 INSTANCE = new CryptoUpgradeDisclosureCheckboxContentSection2();

    CryptoUpgradeDisclosureCheckboxContentSection2() {
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
            ComposerKt.traceEventStart(-170124845, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureCheckboxContentSectionKt.lambda$-170124845.<anonymous> (CryptoUpgradeDisclosureCheckboxContentSection.kt:105)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        CryptoUpgradeDisclosureCheckboxContentSectionState cryptoUpgradeDisclosureCheckboxContentSectionState = new CryptoUpgradeDisclosureCheckboxContentSectionState(uuidRandomUUID, new GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto(null, "I agree to the terms and conditions", "By checking this box, you acknowledge that you have read and agree to the [Terms and Conditions](https://robinhood.com/terms) and [Privacy Policy](https://robinhood.com/privacy). You also consent to receive electronic communications from Robinhood.", 1, null), false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.ComposableSingletons$CryptoUpgradeDisclosureCheckboxContentSectionKt$lambda$-170124845$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoUpgradeDisclosureCheckboxContentSection2.invoke$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoUpgradeDisclosureCheckboxContentSection4.CryptoUpgradeDisclosureCheckboxContentSection(cryptoUpgradeDisclosureCheckboxContentSectionState, (Function1) objRememberedValue, modifierM5142padding3ABfNKs, composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }
}
