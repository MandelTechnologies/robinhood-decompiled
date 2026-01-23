package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountsListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$1$1$3, reason: use source file name */
/* loaded from: classes2.dex */
final class AccountsListComposable5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onAddAccountClicked;

    AccountsListComposable5(EventLogger eventLogger, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$onAddAccountClicked = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.ADD_ACCOUNT, loggingUtils.getCcScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1349963161, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountsListComposable.kt:67)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onAddAccountClicked);
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onAddAccountClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountsListComposableKt$AccountsList$2$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountsListComposable5.invoke$lambda$1$lambda$0(eventLogger, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AddAccountComposable.AddAccountListItem((Function0) objRememberedValue, null, composer, 0, 2);
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
