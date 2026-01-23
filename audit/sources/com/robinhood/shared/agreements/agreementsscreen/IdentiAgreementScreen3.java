package com.robinhood.shared.agreements.agreementsscreen;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.common.agreementview.AgreementScaffold;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdentiAgreementScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt$lambda$1115154398$1, reason: use source file name */
/* loaded from: classes26.dex */
final class IdentiAgreementScreen3 implements Function2<Composer, Integer, Unit> {
    public static final IdentiAgreementScreen3 INSTANCE = new IdentiAgreementScreen3();

    IdentiAgreementScreen3() {
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
            ComposerKt.traceEventStart(1115154398, i, -1, "com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt.lambda$1115154398.<anonymous> (IdentiAgreementScreen.kt:105)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C37339R.string.agreement_title_drip_individual, composer, 0);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.agreements.agreementsscreen.ComposableSingletons$IdentiAgreementScreenKt$lambda$1115154398$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AgreementScaffold.AgreementScaffold(strStringResource, (Function0) objRememberedValue, null, true, false, null, IdentiAgreementScreen.INSTANCE.m24773getLambda$1104989870$lib_agreements_screen_externalDebug(), composer, 1575984, 52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
