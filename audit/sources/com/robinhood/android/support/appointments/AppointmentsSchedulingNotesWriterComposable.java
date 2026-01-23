package com.robinhood.android.support.appointments;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppointmentsSchedulingNotesWriterComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"AppointmentsSchedulingNotesWriterComposable", "", "duxo", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "state", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "subScreen", "Lcom/robinhood/android/support/appointments/SubScreen;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;Lcom/robinhood/android/support/appointments/SubScreen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomControls", "ctaEnabled", "", "onNext", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulingNotesWriterComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsSchedulingNotesWriterComposable$lambda$8(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState appointmentsSchedulerViewState, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AppointmentsSchedulingNotesWriterComposable(appointmentsSchedulerDuxo, appointmentsSchedulerViewState, appointmentsSchedulerViewState6, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControls$lambda$10(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomControls(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a3  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppointmentsSchedulingNotesWriterComposable(AppointmentsSchedulerDuxo duxo, final AppointmentsSchedulerViewState state, final AppointmentsSchedulerViewState6 subScreen, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String agentName;
        ?? r1;
        final AppointmentsSchedulerDuxo appointmentsSchedulerDuxo;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subScreen, "subScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1528104494);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(subScreen.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1528104494, i3, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposable (AppointmentsSchedulingNotesWriterComposable.kt:45)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    String notes = state.getNotes();
                    if (notes == null) {
                        notes = "";
                    }
                    objRememberedValue = SnapshotState3.mutableStateOf$default(new TextFieldValue(notes, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), 0.0f, 1, null);
                Screen.Name name = Screen.Name.CX_APPOINTMENT_NOTES_ENTRY;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_notes_writer_title, composerStartRestartGroup, 0);
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                Modifier modifier4 = modifier3;
                int i6 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), companion5.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 12582912, 0, 7996);
                composerStartRestartGroup = composerStartRestartGroup;
                agentName = state.getAgentName();
                composerStartRestartGroup.startReplaceGroup(1706825336);
                if (agentName != null) {
                    r1 = 0;
                } else {
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_notes_writer_subtitle, new Object[]{agentName}, composerStartRestartGroup, 0);
                    int iM7919getCentere0LSkKk2 = companion4.m7919getCentere0LSkKk();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    int iM7959getEllipsisgIe3tQ8 = companion5.m7959getEllipsisgIe3tQ8();
                    TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                    r1 = 0;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, null, null, textAlignM7912boximpl, iM7959getEllipsisgIe3tQ8, false, 0, 0, null, 0, textM, composerStartRestartGroup, 12582912, 0, 7996);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(jM21425getFg0d7_KjU, Color.m6705copywmQWz5c$default(jM21425getFg0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(1679325412, true, new AppointmentsSchedulingNotesWriterComposable2(column6, jM21425getFg0d7_KjU, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                boolean canContinue = state.getCanContinue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                appointmentsSchedulerDuxo = duxo;
                zChangedInstance = composerStartRestartGroup.changedInstance(appointmentsSchedulerDuxo) | ((i6 & 896) != 256 ? true : r1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingNotesWriterComposable.m2474x6739ff43(appointmentsSchedulerDuxo, subScreen);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BottomControls(canContinue, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                TextFieldValue textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$1 = AppointmentsSchedulingNotesWriterComposable$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(appointmentsSchedulerDuxo);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new AppointmentsSchedulingNotesWriterComposable3(appointmentsSchedulerDuxo, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (int) r1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                appointmentsSchedulerDuxo = duxo;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final AppointmentsSchedulerDuxo appointmentsSchedulerDuxo2 = appointmentsSchedulerDuxo;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingNotesWriterComposable.AppointmentsSchedulingNotesWriterComposable$lambda$8(appointmentsSchedulerDuxo2, state, subScreen, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), 0.0f, 1, null);
            Screen.Name name2 = Screen.Name.CX_APPOINTMENT_NOTES_ENTRY;
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_notes_writer_title, composerStartRestartGroup, 0);
                TextAlign.Companion companion42 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk3 = companion42.m7919getCentere0LSkKk();
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                TextOverflow.Companion companion52 = TextOverflow.INSTANCE;
                Modifier modifier42 = modifier3;
                int i62 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierM5146paddingqDBjuR0$default3, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk3), companion52.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 12582912, 0, 7996);
                composerStartRestartGroup = composerStartRestartGroup;
                agentName = state.getAgentName();
                composerStartRestartGroup.startReplaceGroup(1706825336);
                if (agentName != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(jM21425getFg0d7_KjU2, Color.m6705copywmQWz5c$default(jM21425getFg0d7_KjU2, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(1679325412, true, new AppointmentsSchedulingNotesWriterComposable2(column62, jM21425getFg0d7_KjU2, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                boolean canContinue2 = state.getCanContinue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                appointmentsSchedulerDuxo = duxo;
                zChangedInstance = composerStartRestartGroup.changedInstance(appointmentsSchedulerDuxo) | ((i62 & 896) != 256 ? true : r1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingNotesWriterComposable.m2474x6739ff43(appointmentsSchedulerDuxo, subScreen);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BottomControls(canContinue2, (Function0) objRememberedValue2, modifierAutoLogEvents$default22, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endNode();
                    TextFieldValue textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$12 = AppointmentsSchedulingNotesWriterComposable$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(appointmentsSchedulerDuxo);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue3 = new AppointmentsSchedulingNotesWriterComposable3(appointmentsSchedulerDuxo, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (int) r1);
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
    public static final TextFieldValue AppointmentsSchedulingNotesWriterComposable$lambda$1(SnapshotState<TextFieldValue> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AppointmentsSchedulingNotesWriterComposable$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2474x6739ff43(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6) {
        appointmentsSchedulerDuxo.handleNext(appointmentsSchedulerViewState6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomControls(final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(804208210);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(804208210, i3, -1, "com.robinhood.android.support.appointments.BottomControls (AppointmentsSchedulingNotesWriterComposable.kt:167)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, StringResources_androidKt.stringResource(C39996R.string.appointments_cta_continue, composerStartRestartGroup, 0), false, null, z2, null, null, false, null, false, composer2, (i3 << 15) & 3670016, i3 & 14, 64319);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingNotesWriterComposable.BottomControls$lambda$10(z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, StringResources_androidKt.stringResource(C39996R.string.appointments_cta_continue, composerStartRestartGroup, 0), false, null, z2, null, null, false, null, false, composer2, (i3 << 15) & 3670016, i3 & 14, 64319);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
