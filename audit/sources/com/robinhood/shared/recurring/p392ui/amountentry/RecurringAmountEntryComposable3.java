package com.robinhood.shared.recurring.p392ui.amountentry;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.numpad.BentoNumpadState;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringAmountEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt$lambda$-1701437431$1, reason: use source file name */
/* loaded from: classes6.dex */
final class RecurringAmountEntryComposable3 implements Function2<Composer, Integer, Unit> {
    public static final RecurringAmountEntryComposable3 INSTANCE = new RecurringAmountEntryComposable3();

    RecurringAmountEntryComposable3() {
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
            ComposerKt.traceEventStart(-1701437431, i, -1, "com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt.lambda$-1701437431.<anonymous> (RecurringAmountEntryComposable.kt:160)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        RecurringAmountEntryState recurringAmountEntryState = new RecurringAmountEntryState(companion.invoke("Buy BTC"), companion.invoke("Every week"), new CryptoAmountInputState("0", null, false), companion.invoke("Buying power: $100.00"), new BentoNumpadState(companion.invoke("Continue"), false, false, false, false, true, true, null, false, 414, null), companion.invoke("The amount you can use to trade."), NavigationType.PUSH);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt$lambda$-1701437431$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringAmountEntryComposable3.invoke$lambda$1$lambda$0((KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.ComposableSingletons$RecurringAmountEntryComposableKt$lambda$-1701437431$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        int i2 = StringResource.$stable;
        RecurringAmountEntryComposable4.RecurringAmountEntryComposable(recurringAmountEntryState, function1, (Function0) objRememberedValue2, null, composer, i2 | CryptoAmountInputState.$stable | i2 | i2 | BentoNumpadState.$stable | 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
