package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposable6;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a\\\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\n\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"PhoneConfirmation", "", "last4Digits", "", "onClose", "Lkotlin/Function0;", "onContinue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "phoneNumber", "onGetHelp", "isLoading", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "PHONE_CONFIRMATION_TITLE_KEY", "PHONE_CONFIRMATION_SUBTITLE_KEY", "PHONE_CONFIRMATION_PHONE_INPUT_KEY", "PHONE_CONFIRMATION_LIST_TEST_TAG", "PHONE_CONFIRMATION_TITLE_TEST_TAG", "PHONE_CONFIRMATION_SUBTITLE_TEST_TAG", "PHONE_CONFIRMATION_PHONE_INPUT_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PhoneConfirmationComposable6 {
    public static final String PHONE_CONFIRMATION_LIST_TEST_TAG = "phone-confirmation-list-test-tag";
    public static final String PHONE_CONFIRMATION_PHONE_INPUT_KEY = "phone-confirmation-phone-input-key";
    public static final String PHONE_CONFIRMATION_PHONE_INPUT_TEST_TAG = "phone-confirmation-phone-input-test-tag";
    public static final String PHONE_CONFIRMATION_SUBTITLE_KEY = "phone-confirmation-subtitle-key";
    public static final String PHONE_CONFIRMATION_SUBTITLE_TEST_TAG = "phone-confirmation-subtitle-test-tag";
    public static final String PHONE_CONFIRMATION_TITLE_KEY = "phone-confirmation-title-key";
    public static final String PHONE_CONFIRMATION_TITLE_TEST_TAG = "phone-confirmation-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneConfirmation$lambda$4(String str, Function0 function0, Function1 function1, Function0 function02, boolean z, int i, Composer composer, int i2) {
        PhoneConfirmation(str, function0, function1, function02, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PhoneConfirmation(final String str, final Function0<Unit> onClose, final Function1<? super String, Unit> onContinue, final Function0<Unit> onGetHelp, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        final String last4Digits = str;
        Intrinsics.checkNotNullParameter(last4Digits, "last4Digits");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onGetHelp, "onGetHelp");
        Composer composerStartRestartGroup = composer.startRestartGroup(1458252926);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(last4Digits) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGetHelp) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1458252926, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmation (PhoneConfirmationComposable.kt:42)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhoneConfirmationComposable6.PhoneConfirmation$lambda$1$lambda$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            final boolean z3 = z2;
            last4Digits = str;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_FRAUD_ALERT, null, null, null, 14, null), null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-378571261, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt.PhoneConfirmation.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-378571261, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmation.<anonymous> (PhoneConfirmationComposable.kt:49)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    EventLogger eventLogger = current;
                    Function0<Unit> function0 = onGetHelp;
                    Function1<String, Unit> function1 = onContinue;
                    SnapshotState<String> snapshotState2 = snapshotState;
                    boolean z4 = z3;
                    String str2 = str;
                    Function0<Unit> function02 = onClose;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(178643687, true, new PhoneConfirmationComposable7(eventLogger, function0, function1, snapshotState2, z4, str2, function02), composer2, 54), composer2, 805306368, 510);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(1446831666, true, new C123702(snapshotState, last4Digits), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 384, 3966);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhoneConfirmationComposable6.PhoneConfirmation$lambda$4(last4Digits, onClose, onContinue, onGetHelp, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PhoneConfirmation$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* compiled from: PhoneConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$2 */
    static final class C123702 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ String $last4Digits;
        final /* synthetic */ SnapshotState<String> $phoneNumber$delegate;

        C123702(SnapshotState<String> snapshotState, String str) {
            this.$phoneNumber$delegate = snapshotState;
            this.$last4Digits = str;
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
                ComposerKt.traceEventStart(1446831666, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmation.<anonymous> (PhoneConfirmationComposable.kt:81)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), PhoneConfirmationComposable6.PHONE_CONFIRMATION_LIST_TEST_TAG);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$phoneNumber$delegate) | composer.changed(this.$last4Digits);
            final String str = this.$last4Digits;
            final SnapshotState<String> snapshotState = this.$phoneNumber$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PhoneConfirmationComposable6.C123702.invoke$lambda$1$lambda$0(str, snapshotState, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 478);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String str, SnapshotState snapshotState, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            PhoneConfirmationComposable phoneConfirmationComposable = PhoneConfirmationComposable.INSTANCE;
            LazyListScope.item$default(LazyColumn, PhoneConfirmationComposable6.PHONE_CONFIRMATION_TITLE_KEY, null, phoneConfirmationComposable.getLambda$906634823$feature_credit_card_externalDebug(), 2, null);
            LazyListScope.item$default(LazyColumn, null, null, phoneConfirmationComposable.getLambda$1516839998$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, PhoneConfirmationComposable6.PHONE_CONFIRMATION_SUBTITLE_KEY, null, phoneConfirmationComposable.m12707getLambda$383076481$feature_credit_card_externalDebug(), 2, null);
            LazyListScope.item$default(LazyColumn, null, null, phoneConfirmationComposable.getLambda$2011974336$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, PhoneConfirmationComposable6.PHONE_CONFIRMATION_PHONE_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(112057857, true, new PhoneConfirmationComposable8(str, snapshotState)), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PhoneConfirmation$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
