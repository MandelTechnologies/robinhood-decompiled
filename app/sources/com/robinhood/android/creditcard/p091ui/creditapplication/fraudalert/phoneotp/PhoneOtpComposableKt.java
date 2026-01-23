package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhoneOtpComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"PhoneOtp", "", "phoneNumber", "", "onContinue", "Lkotlin/Function1;", "onGetHelp", "Lkotlin/Function0;", "isLoading", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "PHONE_OTP_TITLE_KEY", "PHONE_OTP_SUBTITLE_KEY", "PHONE_OTP_CODE_INPUT_KEY", "PHONE_OTP_CHECK_BUTTON_KEY", "PHONE_OTP_LIST_TEST_TAG", "PHONE_OTP_TITLE_TEST_TAG", "PHONE_OTP_SUBTITLE_TEST_TAG", "PHONE_OTP_CODE_INPUT_TEST_TAG", "PHONE_OTP_CHECK_BUTTON_TEST_TAG", "feature-credit-card_externalDebug", "otp"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PhoneOtpComposableKt {
    public static final String PHONE_OTP_CHECK_BUTTON_KEY = "phone-otp-check-button-key";
    public static final String PHONE_OTP_CHECK_BUTTON_TEST_TAG = "phone-otp-check-button-test-tag";
    public static final String PHONE_OTP_CODE_INPUT_KEY = "phone-otp-code-input-key";
    public static final String PHONE_OTP_CODE_INPUT_TEST_TAG = "phone-otp-code-input-test-tag";
    public static final String PHONE_OTP_LIST_TEST_TAG = "phone-otp-list-test-tag";
    public static final String PHONE_OTP_SUBTITLE_KEY = "phone-otp-subtitle-key";
    public static final String PHONE_OTP_SUBTITLE_TEST_TAG = "phone-otp-subtitle-test-tag";
    public static final String PHONE_OTP_TITLE_KEY = "phone-otp-title-key";
    public static final String PHONE_OTP_TITLE_TEST_TAG = "phone-otp-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneOtp$lambda$5(String str, Function1 function1, Function0 function0, boolean z, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        PhoneOtp(str, function1, function0, z, focusRequester, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneOtp(final String phoneNumber, final Function1<? super String, Unit> onContinue, final Function0<Unit> onGetHelp, final boolean z, FocusRequester focusRequester, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        FocusRequester focusRequester2;
        FocusRequester focusRequester3;
        Object objRememberedValue;
        final FocusRequester focusRequester4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onGetHelp, "onGetHelp");
        Composer composerStartRestartGroup = composer.startRestartGroup(1871736520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(phoneNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGetHelp) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    focusRequester3 = (FocusRequester) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    focusRequester3 = focusRequester2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1871736520, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp (PhoneOtpComposable.kt:46)");
                }
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PhoneOtpComposableKt.PhoneOtp$lambda$2$lambda$1();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                FocusRequester focusRequester5 = focusRequester3;
                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, false, false, ComposableLambda3.rememberComposableLambda(1707894652, true, new C123802(phoneNumber, focusRequester5, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6), current, onGetHelp, onContinue, z2), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 384, 4094);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                focusRequester4 = focusRequester5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester4 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PhoneOtpComposableKt.PhoneOtp$lambda$5(phoneNumber, onContinue, onGetHelp, z, focusRequester4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        focusRequester2 = focusRequester;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            FocusRequester focusRequester52 = focusRequester3;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, false, false, ComposableLambda3.rememberComposableLambda(1707894652, true, new C123802(phoneNumber, focusRequester52, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6), current2, onGetHelp, onContinue, z2), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 384, 4094);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            focusRequester4 = focusRequester52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PhoneOtp$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* compiled from: PhoneOtpComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2 */
    static final class C123802 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ Function1<String, Unit> $onContinue;
        final /* synthetic */ Function0<Unit> $onGetHelp;
        final /* synthetic */ SnapshotState<String> $otp$delegate;
        final /* synthetic */ String $phoneNumber;

        /* JADX WARN: Multi-variable type inference failed */
        C123802(String str, FocusRequester focusRequester, SnapshotState<String> snapshotState, EventLogger eventLogger, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z) {
            this.$phoneNumber = str;
            this.$focusRequester = focusRequester;
            this.$otp$delegate = snapshotState;
            this.$eventLogger = eventLogger;
            this.$onGetHelp = function0;
            this.$onContinue = function1;
            this.$isLoading = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(final String str, FocusRequester focusRequester, final SnapshotState snapshotState, final EventLogger eventLogger, Function0 function0, final Function1 function1, final boolean z, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            ComposableSingletons$PhoneOtpComposableKt composableSingletons$PhoneOtpComposableKt = ComposableSingletons$PhoneOtpComposableKt.INSTANCE;
            LazyListScope.item$default(LazyColumn, PhoneOtpComposableKt.PHONE_OTP_TITLE_KEY, null, composableSingletons$PhoneOtpComposableKt.m12715getLambda$780081839$feature_credit_card_externalDebug(), 2, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PhoneOtpComposableKt.m12714getLambda$1076185464$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, PhoneOtpComposableKt.PHONE_OTP_SUBTITLE_KEY, null, ComposableLambda3.composableLambdaInstance(1084371081, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$1
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
                        ComposerKt.traceEventStart(1084371081, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:74)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PhoneOtpComposableKt.PHONE_OTP_SUBTITLE_TEST_TAG);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_otp_subtitle, new Object[]{str}, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 48, 0, 8124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PhoneOtpComposableKt.m12713getLambda$1050039670$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, PhoneOtpComposableKt.PHONE_OTP_CODE_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(1110516875, true, new PhoneOtpComposableKt$PhoneOtp$2$1$1$2(focusRequester, snapshotState)), 2, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PhoneOtpComposableKt.m12712getLambda$1023893876$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1136662669, true, new PhoneOtpComposableKt$PhoneOtp$2$1$1$3(eventLogger, function0)), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PhoneOtpComposableKt.m12716getLambda$997748082$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, PhoneOtpComposableKt.PHONE_OTP_CHECK_BUTTON_KEY, null, ComposableLambda3.composableLambdaInstance(1162808463, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4

                /* compiled from: PhoneOtpComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4$1 */
                static final class C123811 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isLoading;
                    final /* synthetic */ Function1<String, Unit> $onContinue;
                    final /* synthetic */ SnapshotState<String> $otp$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    C123811(EventLogger eventLogger, Function1<? super String, Unit> function1, SnapshotState<String> snapshotState, boolean z) {
                        this.$eventLogger = eventLogger;
                        this.$onContinue = function1;
                        this.$otp$delegate = snapshotState;
                        this.$isLoading = z;
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
                            ComposerKt.traceEventStart(-1154770947, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:120)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PhoneOtpComposableKt.PHONE_OTP_CHECK_BUTTON_TEST_TAG);
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_otp_cta, composer, 0);
                        boolean z = PhoneOtpComposableKt.PhoneOtp$lambda$3(this.$otp$delegate).length() == 4;
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changed(this.$otp$delegate);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function1<String, Unit> function1 = this.$onContinue;
                        final SnapshotState<String> snapshotState = this.$otp$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR (r8v1 'objRememberedValue' java.lang.Object) = 
                                  (r4v5 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                  (r5v3 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE])
                                  (r7v0 'snapshotState' androidx.compose.runtime.MutableState<java.lang.String> A[DONT_INLINE])
                                 A[MD:(com.robinhood.analytics.EventLogger, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState):void (m)] (LINE:125) call: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4$1$$ExternalSyntheticLambda0.<init>(com.robinhood.analytics.EventLogger, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r18
                                r14 = r19
                                r1 = r20
                                r2 = r1 & 3
                                r3 = 2
                                if (r2 != r3) goto L16
                                boolean r2 = r14.getSkipping()
                                if (r2 != 0) goto L12
                                goto L16
                            L12:
                                r14.skipToGroupEnd()
                                return
                            L16:
                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r2 == 0) goto L25
                                r2 = -1
                                java.lang.String r3 = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:120)"
                                r4 = -1154770947(0xffffffffbb2b97fd, float:-0.0026183121)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                            L25:
                                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                r2 = 0
                                r3 = 0
                                r4 = 1
                                androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r2, r4, r3)
                                java.lang.String r2 = "phone-otp-check-button-test-tag"
                                androidx.compose.ui.Modifier r3 = androidx.compose.p011ui.platform.TestTag3.testTag(r1, r2)
                                int r1 = com.robinhood.android.creditcard.C12201R.string.credit_app_fraud_alert_otp_cta
                                r2 = 0
                                java.lang.String r1 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r1, r14, r2)
                                androidx.compose.runtime.MutableState<java.lang.String> r5 = r0.$otp$delegate
                                java.lang.String r5 = com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt.access$PhoneOtp$lambda$3(r5)
                                int r5 = r5.length()
                                r6 = 4
                                if (r5 != r6) goto L4a
                                r6 = r4
                                goto L4b
                            L4a:
                                r6 = r2
                            L4b:
                                r2 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                r14.startReplaceGroup(r2)
                                com.robinhood.analytics.EventLogger r2 = r0.$eventLogger
                                boolean r2 = r14.changedInstance(r2)
                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r4 = r0.$onContinue
                                boolean r4 = r14.changed(r4)
                                r2 = r2 | r4
                                androidx.compose.runtime.MutableState<java.lang.String> r4 = r0.$otp$delegate
                                boolean r4 = r14.changed(r4)
                                r2 = r2 | r4
                                com.robinhood.analytics.EventLogger r4 = r0.$eventLogger
                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r5 = r0.$onContinue
                                androidx.compose.runtime.MutableState<java.lang.String> r7 = r0.$otp$delegate
                                java.lang.Object r8 = r14.rememberedValue()
                                if (r2 != 0) goto L79
                                androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r2 = r2.getEmpty()
                                if (r8 != r2) goto L81
                            L79:
                                com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4$1$$ExternalSyntheticLambda0 r8 = new com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4$1$$ExternalSyntheticLambda0
                                r8.<init>(r4, r5, r7)
                                r14.updateRememberedValue(r8)
                            L81:
                                kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                                r14.endReplaceGroup()
                                boolean r7 = r0.$isLoading
                                r16 = 0
                                r17 = 8088(0x1f98, float:1.1334E-41)
                                r4 = 0
                                r5 = 0
                                r2 = r1
                                r1 = r8
                                r8 = 0
                                r9 = 0
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r15 = 384(0x180, float:5.38E-43)
                                com.robinhood.compose.bento.component.BentoButtonKt.m20586BentoButtonEikTQX8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r1 == 0) goto La4
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            La4:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$4.C123811.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function1 function1, SnapshotState snapshotState) {
                            loggingUtils.logContinue$default(eventLogger, null, 1, null);
                            function1.invoke(PhoneOtpComposableKt.PhoneOtp$lambda$3(snapshotState));
                            return Unit.INSTANCE;
                        }
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
                            ComposerKt.traceEventStart(1162808463, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:119)");
                        }
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1154770947, true, new C123811(eventLogger, function1, snapshotState, z), composer, 54), composer, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1707894652, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous> (PhoneOtpComposable.kt:53)");
                }
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), PhoneOtpComposableKt.PHONE_OTP_LIST_TEST_TAG);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(this.$phoneNumber) | composer.changed(this.$focusRequester) | composer.changed(this.$otp$delegate) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$onGetHelp) | composer.changed(this.$onContinue) | composer.changed(this.$isLoading);
                final String str = this.$phoneNumber;
                final FocusRequester focusRequester = this.$focusRequester;
                final SnapshotState<String> snapshotState = this.$otp$delegate;
                final EventLogger eventLogger = this.$eventLogger;
                final Function0<Unit> function0 = this.$onGetHelp;
                final Function1<String, Unit> function1 = this.$onContinue;
                final boolean z = this.$isLoading;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PhoneOtpComposableKt.C123802.invoke$lambda$1$lambda$0(str, focusRequester, snapshotState, eventLogger, function0, function1, z, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(function12);
                    objRememberedValue = function12;
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 478);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(this.$focusRequester);
                FocusRequester focusRequester2 = this.$focusRequester;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PhoneOtpComposableKt$PhoneOtp$2$2$1(focusRequester2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String PhoneOtp$lambda$3(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }
    }
