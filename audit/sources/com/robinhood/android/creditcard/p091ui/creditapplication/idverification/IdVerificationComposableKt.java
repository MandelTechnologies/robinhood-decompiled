package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.idverification.IdVerificationComposableKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdVerificationComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"IdVerification", "", "onHelpPress", "Lkotlin/Function0;", "onClose", "onContinue", "Lkotlin/Function1;", "Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;", WebsocketGatewayConstants.DATA_KEY, "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;ZLandroidx/compose/runtime/Composer;I)V", "ID_VERIFICATION_FIRST_NAME_KEY", "", "ID_VERIFICATION_LAST_NAME_KEY", "ID_VERIFICATION_DATE_OF_BIRTH_KEY", "ID_VERIFICATION_SSN_KEY", "ID_VERIFICATION_LIST_TEST_TAG", "ID_VERIFICATION_TITLE_TEST_TAG", "ID_VERIFICATION_SUBTITLE_TEST_TAG", "ID_VERIFICATION_FIRST_NAME_TEST_TAG", "ID_VERIFICATION_LAST_NAME_TEST_TAG", "ID_VERIFICATION_DATE_OF_BIRTH_TEST_TAG", "ID_VERIFICATION_SSN_TEST_TAG", "feature-credit-card_externalDebug", "firstName", "lastName", "dob", "dobError", "ssn"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IdVerificationComposableKt {
    public static final String ID_VERIFICATION_DATE_OF_BIRTH_KEY = "id-verification-date-of-birth-key";
    public static final String ID_VERIFICATION_DATE_OF_BIRTH_TEST_TAG = "id-verification-date-of-birth-test-tag";
    public static final String ID_VERIFICATION_FIRST_NAME_KEY = "id-verification-first-name-key";
    public static final String ID_VERIFICATION_FIRST_NAME_TEST_TAG = "id-verification-first-name-test-tag";
    public static final String ID_VERIFICATION_LAST_NAME_KEY = "id-verification-last-name-key";
    public static final String ID_VERIFICATION_LAST_NAME_TEST_TAG = "id-verification-last-name-test-tag";
    public static final String ID_VERIFICATION_LIST_TEST_TAG = "id-verification-list-test-tag";
    public static final String ID_VERIFICATION_SSN_KEY = "id-verification-ssn-key";
    public static final String ID_VERIFICATION_SSN_TEST_TAG = "id-verification-ssn-test-tag";
    public static final String ID_VERIFICATION_SUBTITLE_TEST_TAG = "id-verification-subtitle-test-tag";
    public static final String ID_VERIFICATION_TITLE_TEST_TAG = "id-verification-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdVerification$lambda$20(Function0 function0, Function0 function02, Function1 function1, IdVerificationData idVerificationData, boolean z, int i, Composer composer, int i2) {
        IdVerification(function0, function02, function1, idVerificationData, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IdVerification(final Function0<Unit> onHelpPress, final Function0<Unit> onClose, final Function1<? super IdVerificationData, Unit> onContinue, final IdVerificationData data, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1484318334);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onHelpPress) ? 4 : 2) | i;
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
            i2 |= composerStartRestartGroup.changedInstance(data) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1484318334, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification (IdVerificationComposable.kt:53)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(data);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdVerificationComposableKt.IdVerification$lambda$1$lambda$0(data);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(data);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdVerificationComposableKt.IdVerification$lambda$5$lambda$4(data);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(data);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdVerificationComposableKt.IdVerification$lambda$9$lambda$8(data);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
            Object[] objArr4 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdVerificationComposableKt.IdVerification$lambda$13$lambda$12();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 3072, 6);
            Object[] objArr5 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdVerificationComposableKt.IdVerification$lambda$17$lambda$16();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_IDV_FAIL, null, null, null, 14, null), null, null, null, null, onHelpPress, null, ComposableLambda3.rememberComposableLambda(1525515523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt.IdVerification.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1525515523, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous> (IdVerificationComposable.kt:67)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    IdVerificationData idVerificationData = data;
                    EventLogger eventLogger = current;
                    FocusManager focusManager2 = focusManager;
                    Function1<IdVerificationData, Unit> function1 = onContinue;
                    SnapshotState<String> snapshotState6 = snapshotState;
                    SnapshotState<String> snapshotState7 = snapshotState2;
                    SnapshotState<String> snapshotState8 = snapshotState3;
                    SnapshotState<String> snapshotState9 = snapshotState5;
                    boolean z2 = z;
                    Function0<Unit> function0 = onClose;
                    SnapshotState<Boolean> snapshotState10 = snapshotState4;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.LOCK_12);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(size12, null, bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), null, null, false, composer2, BentoIcon4.Size12.$stable | 48, 56);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_idv_encryption_disclaimer, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8188);
                    composer2.endNode();
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1942033895, true, new IdVerificationComposableKt$IdVerification$1$1$2(idVerificationData, eventLogger, focusManager2, function1, snapshotState6, snapshotState7, snapshotState8, snapshotState9, z2, function0, snapshotState10), composer2, 54), composer2, 805306368, 510);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(145331250, true, new C124402(data, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 15) & 458752) | 12582912, 384, 3934);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdVerificationComposableKt.IdVerification$lambda$20(onHelpPress, onClose, onContinue, data, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState IdVerification$lambda$1$lambda$0(IdVerificationData idVerificationData) {
        return SnapshotState3.mutableStateOf$default(idVerificationData.getFirstName(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState IdVerification$lambda$5$lambda$4(IdVerificationData idVerificationData) {
        return SnapshotState3.mutableStateOf$default(idVerificationData.getLastName(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState IdVerification$lambda$9$lambda$8(IdVerificationData idVerificationData) {
        return SnapshotState3.mutableStateOf$default(idVerificationData.getDob(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState IdVerification$lambda$13$lambda$12() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IdVerification$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState IdVerification$lambda$17$lambda$16() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IdVerification$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IdVerification$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IdVerification$lambda$18(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IdVerification$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IdVerification$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: IdVerificationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2 */
    static final class C124402 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ IdVerificationData $data;
        final /* synthetic */ SnapshotState<String> $dob$delegate;
        final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;
        final /* synthetic */ SnapshotState<String> $firstName$delegate;
        final /* synthetic */ SnapshotState<String> $lastName$delegate;
        final /* synthetic */ SnapshotState<String> $ssn$delegate;

        C124402(IdVerificationData idVerificationData, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<Boolean> snapshotState4, SnapshotState<String> snapshotState5) {
            this.$data = idVerificationData;
            this.$firstName$delegate = snapshotState;
            this.$lastName$delegate = snapshotState2;
            this.$dob$delegate = snapshotState3;
            this.$dobError$delegate = snapshotState4;
            this.$ssn$delegate = snapshotState5;
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
                ComposerKt.traceEventStart(145331250, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous> (IdVerificationComposable.kt:119)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), IdVerificationComposableKt.ID_VERIFICATION_LIST_TEST_TAG);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$data) | composer.changed(this.$firstName$delegate) | composer.changed(this.$lastName$delegate) | composer.changed(this.$dob$delegate) | composer.changed(this.$dobError$delegate) | composer.changed(this.$ssn$delegate);
            final IdVerificationData idVerificationData = this.$data;
            final SnapshotState<String> snapshotState = this.$firstName$delegate;
            final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
            final SnapshotState<String> snapshotState3 = this.$dob$delegate;
            final SnapshotState<Boolean> snapshotState4 = this.$dobError$delegate;
            final SnapshotState<String> snapshotState5 = this.$ssn$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IdVerificationComposableKt.C124402.invoke$lambda$1$lambda$0(idVerificationData, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, (LazyListScope) obj);
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
        public static final Unit invoke$lambda$1$lambda$0(IdVerificationData idVerificationData, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            ComposableSingletons$IdVerificationComposableKt composableSingletons$IdVerificationComposableKt = ComposableSingletons$IdVerificationComposableKt.INSTANCE;
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$IdVerificationComposableKt.m12750getLambda$808535737$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$IdVerificationComposableKt.m12749getLambda$1639276994$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$IdVerificationComposableKt.m12748getLambda$1588592001$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$IdVerificationComposableKt.m12747getLambda$1537907008$feature_credit_card_externalDebug(), 3, null);
            if (idVerificationData.getFirstNameEditable()) {
                LazyListScope.item$default(LazyColumn, IdVerificationComposableKt.ID_VERIFICATION_FIRST_NAME_KEY, null, ComposableLambda3.composableLambdaInstance(-554147486, true, new IdVerificationComposableKt$IdVerification$2$1$1$1(snapshotState)), 2, null);
            }
            if (idVerificationData.getLastNameEditable()) {
                LazyListScope.item$default(LazyColumn, IdVerificationComposableKt.ID_VERIFICATION_LAST_NAME_KEY, null, ComposableLambda3.composableLambdaInstance(-1985303655, true, new IdVerificationComposableKt$IdVerification$2$1$1$2(snapshotState2)), 2, null);
            }
            if (idVerificationData.getDobEditable()) {
                LazyListScope.item$default(LazyColumn, IdVerificationComposableKt.ID_VERIFICATION_DATE_OF_BIRTH_KEY, null, ComposableLambda3.composableLambdaInstance(-1934618662, true, new IdVerificationComposableKt$IdVerification$2$1$1$3(snapshotState3, snapshotState4)), 2, null);
            }
            if (idVerificationData.getSsnEditable()) {
                LazyListScope.item$default(LazyColumn, IdVerificationComposableKt.ID_VERIFICATION_SSN_KEY, null, ComposableLambda3.composableLambdaInstance(-1883933669, true, new IdVerificationComposableKt$IdVerification$2$1$1$4(snapshotState5)), 2, null);
            }
            return Unit.INSTANCE;
        }
    }
}
