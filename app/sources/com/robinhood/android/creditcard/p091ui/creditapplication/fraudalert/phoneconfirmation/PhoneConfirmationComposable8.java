package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.textinputs.PhoneNumberHeroInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$2$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneConfirmationComposable8 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ String $last4Digits;
    final /* synthetic */ SnapshotState<String> $phoneNumber$delegate;

    PhoneConfirmationComposable8(String str, SnapshotState<String> snapshotState) {
        this.$last4Digits = str;
        this.$phoneNumber$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(112057857, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneConfirmationComposable.kt:110)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PhoneConfirmationComposable6.PHONE_CONFIRMATION_PHONE_INPUT_TEST_TAG);
        String strPhoneConfirmation$lambda$2 = PhoneConfirmationComposable6.PhoneConfirmation$lambda$2(this.$phoneNumber$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_placeholder, new Object[]{this.$last4Digits}, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$phoneNumber$delegate);
        final SnapshotState<String> snapshotState = this.$phoneNumber$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneConfirmationComposable8.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PhoneNumberHeroInput.PhoneNumberHeroInput(strPhoneConfirmation$lambda$2, (Function1) objRememberedValue, modifierTestTag, strStringResource, false, null, composer, 384, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }
}
