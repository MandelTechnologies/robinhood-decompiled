package com.robinhood.android.account.settings.accountnumbers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountNumbersComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.settings.accountnumbers.ComposableSingletons$AccountNumbersComposableKt$lambda$-1541284603$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountNumbersComposable5 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
    public static final AccountNumbersComposable5 INSTANCE = new AccountNumbersComposable5();

    AccountNumbersComposable5() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
        invoke(bentoAppBarScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541284603, i, -1, "com.robinhood.android.account.settings.accountnumbers.ComposableSingletons$AccountNumbersComposableKt.lambda$-1541284603.<anonymous> (AccountNumbersComposable.kt:40)");
        }
        OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
        final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.account.settings.accountnumbers.ComposableSingletons$AccountNumbersComposableKt$lambda$-1541284603$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountNumbersComposable5.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
