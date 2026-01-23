package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoTextInput4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneOtpComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PhoneOtpComposableKt$PhoneOtp$2$1$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SnapshotState<String> $otp$delegate;

    PhoneOtpComposableKt$PhoneOtp$2$1$1$2(FocusRequester focusRequester, SnapshotState<String> snapshotState) {
        this.$focusRequester = focusRequester;
        this.$otp$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1110516875, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:86)");
        }
        Modifier modifierTestTag = TestTag3.testTag(FocusRequesterModifier3.focusRequester(Modifier.INSTANCE, this.$focusRequester), PhoneOtpComposableKt.PHONE_OTP_CODE_INPUT_TEST_TAG);
        String strPhoneOtp$lambda$3 = PhoneOtpComposableKt.PhoneOtp$lambda$3(this.$otp$delegate);
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$otp$delegate);
        final SnapshotState<String> snapshotState = this.$otp$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneOtpComposableKt$PhoneOtp$2$1$1$2.invoke$lambda$2$lambda$1(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoHeroTextInput(strPhoneOtp$lambda$3, (Function1) objRememberedValue, modifierTestTag, null, "0000", null, null, null, null, keyboardOptions, null, null, false, false, composer, 805330944, 0, 15848);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 4) {
            if (it.length() == 0) {
                snapshotState.setValue(it);
            } else {
                for (int i = 0; i < it.length(); i++) {
                    if (!Character.isDigit(it.charAt(i))) {
                        break;
                    }
                }
                snapshotState.setValue(it);
            }
        }
        return Unit.INSTANCE;
    }
}
