package com.robinhood.android.account.naming.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.account.naming.common.AccountNicknameViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountNicknameScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$-2026457222$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountNicknameScreen5 implements Function2<Composer, Integer, Unit> {
    public static final AccountNicknameScreen5 INSTANCE = new AccountNicknameScreen5();

    AccountNicknameScreen5() {
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
            ComposerKt.traceEventStart(-2026457222, i, -1, "com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt.lambda$-2026457222.<anonymous> (AccountNicknameScreen.kt:196)");
        }
        AccountNicknameViewState accountNicknameViewState = new AccountNicknameViewState("Goat", false, new AccountNicknameViewState2.Info(StringResource.INSTANCE.invoke("1/14 characters entered")), C8116R.string.button_continue, true, BrokerageAccountType.UNKNOWN, ManagementType.UNKNOWN);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$-2026457222$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountNicknameScreen5.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$-2026457222$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$-2026457222$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        AccountNicknameScreen.AccountNicknameScreen(accountNicknameViewState, function1, function0, (Function0) objRememberedValue3, new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null), null, composer, 3504, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
