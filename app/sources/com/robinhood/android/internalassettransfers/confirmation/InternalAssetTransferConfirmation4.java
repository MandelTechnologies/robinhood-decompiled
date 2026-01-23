package com.robinhood.android.internalassettransfers.confirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: InternalAssetTransferConfirmation.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-320413881$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferConfirmation4 implements Function2<Composer, Integer, Unit> {
    public static final InternalAssetTransferConfirmation4 INSTANCE = new InternalAssetTransferConfirmation4();

    InternalAssetTransferConfirmation4() {
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
            ComposerKt.traceEventStart(-320413881, i, -1, "com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt.lambda$-320413881.<anonymous> (InternalAssetTransferConfirmation.kt:287)");
        }
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        ManagementType managementType = ManagementType.SELF_DIRECTED;
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        UiIatAccount uiIatAccount = new UiIatAccount("123456789", "987654321", brokerageAccountType, true, true, null, managementType, "My Account", instantNow, 32, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-320413881$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-320413881$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-320413881$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        InternalAssetTransferConfirmation5.InternalAssetTransferConfirmation(uiIatAccount, true, function0, function02, (Function0) objRememberedValue3, null, composer, 28080, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
