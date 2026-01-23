package com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo;

import android.util.Patterns;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.PersonalInfo;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UpdateInfoComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\u001aF\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\fH\u0001\u001a\f\u0010\r\u001a\u00020\f*\u00020\fH\u0001\"\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002"}, m3636d2 = {"UpdateInfo", "", "onBack", "Lkotlin/Function0;", "onContinue", "Lkotlin/Function1;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "Lkotlin/ParameterName;", "name", SduiFeatureDiscovery3.INFO_TAG, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;Landroidx/compose/runtime/Composer;I)V", "digitOnly", "", "formattedDate", "UPDATE_INFO_FIRST_NAME_KEY", "UPDATE_INFO_LAST_NAME_KEY", "UPDATE_INFO_EMAIL_KEY", "UPDATE_INFO_E164_KEY", "UPDATE_INFO_DATE_OF_BIRTH_KEY", "UPDATE_INFO_LIST_TEST_TAG", "UPDATE_INFO_FIRST_NAME_TEST_TAG", "UPDATE_INFO_LAST_NAME_TEST_TAG", "UPDATE_INFO_EMAIL_TEST_TAG", "UPDATE_INFO_E164_TEST_TAG", "UPDATE_INFO_DATE_OF_BIRTH_TEST_TAG", "feature-credit-card_externalDebug", "firstName", "lastName", "email", "phone", "dob", "dobError", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UpdateInfoComposableKt {
    public static final String UPDATE_INFO_DATE_OF_BIRTH_KEY = "update-info-date-of-birth-key";
    public static final String UPDATE_INFO_DATE_OF_BIRTH_TEST_TAG = "update-info-date-of-birth-test-tag";
    public static final String UPDATE_INFO_E164_KEY = "update-info-e164-key";
    public static final String UPDATE_INFO_E164_TEST_TAG = "update-info-e164-test-tag";
    public static final String UPDATE_INFO_EMAIL_KEY = "update-info-email-key";
    public static final String UPDATE_INFO_EMAIL_TEST_TAG = "update-info-email-test-tag";
    public static final String UPDATE_INFO_FIRST_NAME_KEY = "update-info-first-name-key";
    public static final String UPDATE_INFO_FIRST_NAME_TEST_TAG = "update-info-first-name-test-tag";
    public static final String UPDATE_INFO_LAST_NAME_KEY = "update-info-last-name-key";
    public static final String UPDATE_INFO_LAST_NAME_TEST_TAG = "update-info-last-name-test-tag";
    public static final String UPDATE_INFO_LIST_TEST_TAG = "update-info-list-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInfo$lambda$24(Function0 function0, Function1 function1, PersonalInfo personalInfo, int i, Composer composer, int i2) {
        UpdateInfo(function0, function1, personalInfo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdateInfo(final Function0<Unit> onBack, final Function1<? super PersonalInfo, Unit> onContinue, final PersonalInfo info, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(info, "info");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1032351131);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(info) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1032351131, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo (UpdateInfoComposable.kt:52)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Screen.Name name = Screen.Name.CC_APPLICATION_PROFILE_INFO_EDIT;
            UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null));
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$1$lambda$0(info);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i3 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$5$lambda$4(info);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$9$lambda$8(info);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
            Object[] objArr4 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$13$lambda$12(info);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 6);
            Object[] objArr5 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z5 = i3 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$17$lambda$16(info);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 6);
            Object[] objArr6 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInfoComposableKt.UpdateInfo$lambda$21$lambda$20();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState6 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) objRememberedValue6, composerStartRestartGroup, 3072, 6);
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(name, null, null, null, 14, null), null, null, onBack, null, null, null, ComposableLambda3.rememberComposableLambda(-51680512, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt.UpdateInfo.1

                /* compiled from: UpdateInfoComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<String> $dob$delegate;
                    final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;
                    final /* synthetic */ SnapshotState<String> $email$delegate;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ SnapshotState<String> $firstName$delegate;
                    final /* synthetic */ PersonalInfo $info;
                    final /* synthetic */ SnapshotState<String> $lastName$delegate;
                    final /* synthetic */ Function1<PersonalInfo, Unit> $onContinue;
                    final /* synthetic */ SnapshotState<String> $phone$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(EventLogger eventLogger, Function1<? super PersonalInfo, Unit> function1, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<String> snapshotState4, SnapshotState<String> snapshotState5, PersonalInfo personalInfo, SnapshotState<Boolean> snapshotState6) {
                        this.$eventLogger = eventLogger;
                        this.$onContinue = function1;
                        this.$firstName$delegate = snapshotState;
                        this.$lastName$delegate = snapshotState2;
                        this.$email$delegate = snapshotState3;
                        this.$phone$delegate = snapshotState4;
                        this.$dob$delegate = snapshotState5;
                        this.$info = personalInfo;
                        this.$dobError$delegate = snapshotState6;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws IOException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer, int i) throws IOException {
                        boolean z;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(274389074, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous>.<anonymous> (UpdateInfoComposable.kt:74)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_update_helper_text, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
                        if (StringsKt.isBlank(UpdateInfoComposableKt.UpdateInfo$lambda$2(this.$firstName$delegate)) || StringsKt.isBlank(UpdateInfoComposableKt.UpdateInfo$lambda$6(this.$lastName$delegate)) || !Patterns.EMAIL_ADDRESS.matcher(UpdateInfoComposableKt.UpdateInfo$lambda$10(this.$email$delegate)).matches()) {
                            z = false;
                        } else {
                            String strUpdateInfo$lambda$14 = UpdateInfoComposableKt.UpdateInfo$lambda$14(this.$phone$delegate);
                            StringBuilder sb = new StringBuilder();
                            int length = strUpdateInfo$lambda$14.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                char cCharAt = strUpdateInfo$lambda$14.charAt(i2);
                                if (Character.isDigit(cCharAt)) {
                                    sb.append(cCharAt);
                                }
                            }
                            if (sb.toString().length() == 10 && !UpdateInfoComposableKt.UpdateInfo$lambda$22(this.$dobError$delegate)) {
                                z = true;
                            }
                        }
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changed(this.$firstName$delegate) | composer.changed(this.$lastName$delegate) | composer.changed(this.$email$delegate) | composer.changed(this.$phone$delegate) | composer.changed(this.$dob$delegate) | composer.changed(this.$info);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function1<PersonalInfo, Unit> function1 = this.$onContinue;
                        final PersonalInfo personalInfo = this.$info;
                        final SnapshotState<String> snapshotState = this.$firstName$delegate;
                        final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
                        final SnapshotState<String> snapshotState3 = this.$email$delegate;
                        final SnapshotState<String> snapshotState4 = this.$phone$delegate;
                        final SnapshotState<String> snapshotState5 = this.$dob$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UpdateInfoComposableKt.C124251.AnonymousClass1.invoke$lambda$2$lambda$1(eventLogger, function1, personalInfo, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, z, null, null, false, null, false, composer, 0, 0, 64316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, Function1 function1, PersonalInfo personalInfo, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
                        loggingUtils.logContinue$default(eventLogger, null, 1, null);
                        function1.invoke(new PersonalInfo(UpdateInfoComposableKt.UpdateInfo$lambda$2(snapshotState), UpdateInfoComposableKt.UpdateInfo$lambda$6(snapshotState2), UpdateInfoComposableKt.UpdateInfo$lambda$10(snapshotState3), "+1" + UpdateInfoComposableKt.UpdateInfo$lambda$14(snapshotState4), UpdateInfoComposableKt.formattedDate(UpdateInfoComposableKt.UpdateInfo$lambda$18(snapshotState5)), personalInfo.getSsnLast4()));
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-51680512, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous> (UpdateInfoComposable.kt:73)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(274389074, true, new AnonymousClass1(current, onContinue, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, info, snapshotState6), composer3, 54), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(103908657, true, new C124262(snapshotState, info, new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.LOCK_24, null, null, 6, null), snapshotState2, snapshotState3, snapshotState4, snapshotState5, snapshotState6), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 9) & 7168) | 12582912, 384, 3958);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateInfoComposableKt.UpdateInfo$lambda$24(onBack, onContinue, info, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$1$lambda$0(PersonalInfo personalInfo) {
        return SnapshotState3.mutableStateOf$default(personalInfo.getFirstName(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$5$lambda$4(PersonalInfo personalInfo) {
        return SnapshotState3.mutableStateOf$default(personalInfo.getLastName(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$9$lambda$8(PersonalInfo personalInfo) {
        return SnapshotState3.mutableStateOf$default(personalInfo.getEmail(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$13$lambda$12(PersonalInfo personalInfo) {
        return SnapshotState3.mutableStateOf$default(personalInfo.getE164(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$17$lambda$16(PersonalInfo personalInfo) {
        return SnapshotState3.mutableStateOf$default(digitOnly(personalInfo.getDateOfBirth()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UpdateInfo$lambda$21$lambda$20() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateInfo$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateInfo$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateInfo$lambda$14(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateInfo$lambda$18(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateInfo$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UpdateInfo$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateInfo$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: UpdateInfoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2 */
    static final class C124262 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $dob$delegate;
        final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ SnapshotState<String> $firstName$delegate;
        final /* synthetic */ PersonalInfo $info;
        final /* synthetic */ SnapshotState<String> $lastName$delegate;
        final /* synthetic */ BentoTextInput8.Icon.Size24 $lock;
        final /* synthetic */ SnapshotState<String> $phone$delegate;

        C124262(SnapshotState<String> snapshotState, PersonalInfo personalInfo, BentoTextInput8.Icon.Size24 size24, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<String> snapshotState4, SnapshotState<String> snapshotState5, SnapshotState<Boolean> snapshotState6) {
            this.$firstName$delegate = snapshotState;
            this.$info = personalInfo;
            this.$lock = size24;
            this.$lastName$delegate = snapshotState2;
            this.$email$delegate = snapshotState3;
            this.$phone$delegate = snapshotState4;
            this.$dob$delegate = snapshotState5;
            this.$dobError$delegate = snapshotState6;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
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
                ComposerKt.traceEventStart(103908657, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous> (UpdateInfoComposable.kt:102)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), UpdateInfoComposableKt.UPDATE_INFO_LIST_TEST_TAG);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$firstName$delegate) | composer.changed(this.$info) | composer.changedInstance(this.$lock) | composer.changed(this.$lastName$delegate) | composer.changed(this.$email$delegate) | composer.changed(this.$phone$delegate) | composer.changed(this.$dob$delegate) | composer.changed(this.$dobError$delegate);
            final PersonalInfo personalInfo = this.$info;
            final BentoTextInput8.Icon.Size24 size24 = this.$lock;
            final SnapshotState<String> snapshotState = this.$firstName$delegate;
            final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
            final SnapshotState<String> snapshotState3 = this.$email$delegate;
            final SnapshotState<String> snapshotState4 = this.$phone$delegate;
            final SnapshotState<String> snapshotState5 = this.$dob$delegate;
            final SnapshotState<Boolean> snapshotState6 = this.$dobError$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdateInfoComposableKt.C124262.invoke$lambda$1$lambda$0(personalInfo, size24, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, snapshotState6, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PersonalInfo personalInfo, BentoTextInput8.Icon.Size24 size24, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, SnapshotState snapshotState6, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            ComposableSingletons$UpdateInfoComposableKt composableSingletons$UpdateInfoComposableKt = ComposableSingletons$UpdateInfoComposableKt.INSTANCE;
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$UpdateInfoComposableKt.m12736getLambda$2101595844$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$UpdateInfoComposableKt.getLambda$139702949$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$UpdateInfoComposableKt.getLambda$1816726276$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, UpdateInfoComposableKt.UPDATE_INFO_FIRST_NAME_KEY, null, ComposableLambda3.composableLambdaInstance(-801217693, true, new UpdateInfoComposableKt$UpdateInfo$2$1$1$1(personalInfo, size24, snapshotState)), 2, null);
            LazyListScope.item$default(LazyColumn, UpdateInfoComposableKt.UPDATE_INFO_LAST_NAME_KEY, null, ComposableLambda3.composableLambdaInstance(875805634, true, new UpdateInfoComposableKt$UpdateInfo$2$1$1$2(personalInfo, size24, snapshotState2)), 2, null);
            LazyListScope.item$default(LazyColumn, UpdateInfoComposableKt.UPDATE_INFO_EMAIL_KEY, null, ComposableLambda3.composableLambdaInstance(-1742138335, true, new UpdateInfoComposableKt$UpdateInfo$2$1$1$3(personalInfo, size24, snapshotState3)), 2, null);
            LazyListScope.item$default(LazyColumn, UpdateInfoComposableKt.UPDATE_INFO_E164_KEY, null, ComposableLambda3.composableLambdaInstance(-65115008, true, new UpdateInfoComposableKt$UpdateInfo$2$1$1$4(personalInfo, size24, snapshotState4)), 2, null);
            LazyListScope.item$default(LazyColumn, UpdateInfoComposableKt.UPDATE_INFO_DATE_OF_BIRTH_KEY, null, ComposableLambda3.composableLambdaInstance(1611908319, true, new UpdateInfoComposableKt$UpdateInfo$2$1$1$5(personalInfo, size24, snapshotState5, snapshotState6)), 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final String digitOnly(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final String formattedDate(String str) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (i2 == 2 || i2 == 4) {
                objValueOf = "/" + cCharAt;
            } else {
                objValueOf = Character.valueOf(cCharAt);
            }
            arrayList.add(objValueOf);
            i++;
            i2 = i3;
        }
        return CollectionsKt.joinToString$default(arrayList, "", "", null, 0, null, null, 60, null);
    }
}
