package com.robinhood.android.support.appointments;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppointmentsSchedulingReviewerComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"AppointmentsSchedulingReviewerComposable", "", "duxo", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomControls", "onNext", "Lkotlin/Function0;", "isLoading", "", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease", "state", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulingReviewerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsSchedulingReviewerComposable$lambda$13(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsSchedulingReviewerComposable(appointmentsSchedulerDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControls$lambda$17(Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomControls(function0, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppointmentsSchedulingReviewerComposable(final AppointmentsSchedulerDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String appointmentDisplayText;
        int i4;
        String notes;
        String userNumber;
        String userEmail;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1288100893);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1288100893, i3, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposable (AppointmentsSchedulingReviewerComposable.kt:32)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Screen.Name name = Screen.Name.CX_APPOINTMENT_REVIEW_DETAILS;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_title, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 12582912, 0, 7996);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(companion3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                appointmentDisplayText = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppointmentDisplayText();
                composerStartRestartGroup.startReplaceGroup(503342905);
                if (appointmentDisplayText != null) {
                    i4 = 2;
                } else {
                    String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_datetime_label, composerStartRestartGroup, 0);
                    BentoSettingsRows.EndElement.Metadata metadata = new BentoSettingsRows.EndElement.Metadata(StringResources_androidKt.stringResource(C11048R.string.general_action_edit, composerStartRestartGroup, 0), null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsSchedulingReviewerComposable.m2476x2b2dd42d(duxo, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = 2;
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, strStringResource, appointmentDisplayText, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) metadata, false, false, (Function0<Unit>) objRememberedValue2, composerStartRestartGroup, BentoSettingsRows.EndElement.Metadata.$stable << 12, 105);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                notes = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNotes();
                composerStartRestartGroup.startReplaceGroup(503363084);
                if (notes != null) {
                    String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_notes_label, composerStartRestartGroup, 0);
                    BentoSettingsRows.EndElement.Metadata metadata2 = new BentoSettingsRows.EndElement.Metadata(StringResources_androidKt.stringResource(C11048R.string.general_action_edit, composerStartRestartGroup, 0), null, i4, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsSchedulingReviewerComposable.m2477x71094cd0(duxo, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, strStringResource2, notes, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) metadata2, false, false, (Function0<Unit>) objRememberedValue3, composerStartRestartGroup, BentoSettingsRows.EndElement.Metadata.$stable << 12, 105);
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                userNumber = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUserNumber();
                composerStartRestartGroup.startReplaceGroup(503382895);
                if (userNumber != null) {
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_phone_nubmer_label, composerStartRestartGroup, 0), userNumber, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composerStartRestartGroup, 0, EnumC7081g.f2779x59907a3d);
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                userEmail = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUserEmail();
                composerStartRestartGroup.startReplaceGroup(503391654);
                if (userEmail != null) {
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_email_label, composerStartRestartGroup, 0), userEmail, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composerStartRestartGroup, 0, EnumC7081g.f2779x59907a3d);
                    Unit unit4 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.SCHEDULE_APPOINTMENT, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                boolean zIsCreatingAppointment = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isCreatingAppointment();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingReviewerComposable.m2475x359a9c45(duxo, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BottomControls((Function0) objRememberedValue, zIsCreatingAppointment, modifierAutoLogEvents$default2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingReviewerComposable.AppointmentsSchedulingReviewerComposable$lambda$13(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Screen.Name name2 = Screen.Name.CX_APPOINTMENT_REVIEW_DETAILS;
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_title, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 12582912, 0, 7996);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierWeight$default2 = Column5.weight$default(column62, SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(companion32, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    appointmentDisplayText = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppointmentDisplayText();
                    composerStartRestartGroup.startReplaceGroup(503342905);
                    if (appointmentDisplayText != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    notes = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNotes();
                    composerStartRestartGroup.startReplaceGroup(503363084);
                    if (notes != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    userNumber = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUserNumber();
                    composerStartRestartGroup.startReplaceGroup(503382895);
                    if (userNumber != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    userEmail = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUserEmail();
                    composerStartRestartGroup.startReplaceGroup(503391654);
                    if (userEmail != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), UserInteractionEventData.Action.SCHEDULE_APPOINTMENT, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                    boolean zIsCreatingAppointment2 = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isCreatingAppointment();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsSchedulingReviewerComposable.m2475x359a9c45(duxo, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BottomControls((Function0) objRememberedValue, zIsCreatingAppointment2, modifierAutoLogEvents$default22, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AppointmentsSchedulingReviewerComposable$lambda$12$lambda$9$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2476x2b2dd42d(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, SnapshotState4 snapshotState4) {
        if (AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4).isCreatingAppointment()) {
            return Unit.INSTANCE;
        }
        appointmentsSchedulerDuxo.navigateToDatetimePicker();
        return Unit.INSTANCE;
    }

    private static final AppointmentsSchedulerViewState AppointmentsSchedulingReviewerComposable$lambda$0(SnapshotState4<AppointmentsSchedulerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AppointmentsSchedulingReviewerComposable$lambda$12$lambda$9$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2477x71094cd0(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, SnapshotState4 snapshotState4) {
        if (AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4).isCreatingAppointment()) {
            return Unit.INSTANCE;
        }
        appointmentsSchedulerDuxo.navigateToNoteWriter();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AppointmentsSchedulingReviewerComposable$lambda$12$lambda$11$lambda$10 */
    public static final Unit m2475x359a9c45(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, SnapshotState4 snapshotState4) {
        String campaignId = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4).getCampaignId();
        String notes = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4).getNotes();
        if (notes == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppointmentSlot selectedAppointment = AppointmentsSchedulingReviewerComposable$lambda$0(snapshotState4).getSelectedAppointment();
        if (selectedAppointment != null) {
            appointmentsSchedulerDuxo.commitAppointment(campaignId, notes, selectedAppointment);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomControls(final Function0<Unit> function0, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-985286199);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-985286199, i3, -1, "com.robinhood.android.support.appointments.BottomControls (AppointmentsSchedulingReviewerComposable.kt:137)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_footer, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 12582912, 0, 7992);
                String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_schedule, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i3 & 112) != 32) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingReviewerComposable.BottomControls$lambda$16$lambda$15$lambda$14(z, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, strStringResource2, z, null, false, null, null, false, null, false, composer2, (i3 << 21) & 234881024, 0, 65087);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingReviewerComposable.BottomControls$lambda$17(function0, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_reviewer_footer, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 12582912, 0, 7992);
                String strStringResource22 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_schedule, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i3 & 112) != 32) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingReviewerComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingReviewerComposable.BottomControls$lambda$16$lambda$15$lambda$14(z, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, strStringResource22, z, null, false, null, null, false, null, false, composer2, (i3 << 21) & 234881024, 0, 65087);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControls$lambda$16$lambda$15$lambda$14(boolean z, Function0 function0) {
        if (z) {
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
