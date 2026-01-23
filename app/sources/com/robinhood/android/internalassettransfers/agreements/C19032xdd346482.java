package com.robinhood.android.internalassettransfers.agreements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.agreements.models.ApiAgreement;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: InternalAssetTransferAgreement.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt$lambda$432173172$1 */
/* loaded from: classes10.dex */
final class C19032xdd346482 implements Function2<Composer, Integer, Unit> {
    public static final C19032xdd346482 INSTANCE = new C19032xdd346482();

    C19032xdd346482() {
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
            ComposerKt.traceEventStart(432173172, i, -1, "com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt.lambda$432173172.<anonymous> (InternalAssetTransferAgreement.kt:203)");
        }
        InternalAssetTransferAgreementViewState.Success success = new InternalAssetTransferAgreementViewState.Success(new UiAgreementWithContent(new ApiAgreement(new UUID(0L, 0L), HttpUrl.INSTANCE.get("https://127.0.0.1/")), InternalAssetTransferAgreementKt.loremIpsum()), false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt$lambda$432173172$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InternalAssetTransferAgreementKt.InternalAssetTransferAgreementSuccess(success, (Function0) objRememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
