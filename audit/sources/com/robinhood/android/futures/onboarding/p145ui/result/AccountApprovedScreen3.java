package com.robinhood.android.futures.onboarding.p145ui.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultDuxo4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountApprovedScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$AccountApprovedScreenKt$lambda$1289542885$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AccountApprovedScreen3 implements Function2<Composer, Integer, Unit> {
    public static final AccountApprovedScreen3 INSTANCE = new AccountApprovedScreen3();

    AccountApprovedScreen3() {
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
            ComposerKt.traceEventStart(1289542885, i, -1, "com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$AccountApprovedScreenKt.lambda$1289542885.<anonymous> (AccountApprovedScreen.kt:104)");
        }
        FuturesAccountResultDuxo4.Approved approved = new FuturesAccountResultDuxo4.Approved(false, true, true, "123456789", true, true, StringResource.INSTANCE.invoke("Individual Investing"), false, false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$AccountApprovedScreenKt$lambda$1289542885$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AccountApprovedScreen.AccountApprovedScreen(approved, null, (Function0) objRememberedValue, composer, StringResource.$stable | 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
