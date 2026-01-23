package com.robinhood.android.support.appointments;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider2;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.DayOfWeek;
import p479j$.time.Month;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001ag\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001aC\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001c\u001a[\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010!\u001ai\u0010\"\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010*\u001aC\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010.\u001a-\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020(2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0001022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00103¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"AppointmentsSchedulingDatetimePickerComposable", "", "duxo", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "subScreen", "Lcom/robinhood/android/support/appointments/SubScreen;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;Lcom/robinhood/android/support/appointments/SubScreen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DayOfWeekSelectorSection", "appointmentSlots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/support/appointments/AppointmentWeek;", "selectedWeekIndex", "", "selectedDayOfWeekIndex", "onScrollToWeek", "Lkotlin/Function1;", "onSelectDayOfWeek", "Lkotlin/Function2;", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimeOfDaySelectorSection", "timeOfDaySlots", "Lcom/robinhood/android/support/appointments/AppointmentTimeOfDay;", "selectedTimeOfDayIndex", "onClick", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyTimeOfDaySelectorSection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WeekPage", "weekIndex", "days", "Lcom/robinhood/android/support/appointments/AppointmentDayOfWeek;", "(ILkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DateCard", "dayIndex", "displayMonth", "displayDayOfMonth", "displayDayOfWeek", "isAvailable", "", "isSelected", "(IIIIIZZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimeInDayCard", "time", "timeOfDayIndex", "(Lcom/robinhood/android/support/appointments/AppointmentTimeOfDay;IZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomControls", "canContinue", "onNext", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease", "state", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "canScrollLeft", "canScrollRight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AppointmentsSchedulingDatetimePickerComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsSchedulingDatetimePickerComposable$lambda$7(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsSchedulingDatetimePickerComposable(appointmentsSchedulerDuxo, appointmentsSchedulerViewState6, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControls$lambda$41(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomControls(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateCard$lambda$37(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Function2 function2, Modifier modifier, int i6, int i7, Composer composer, int i8) {
        DateCard(i, i2, i3, i4, i5, z, z2, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayOfWeekSelectorSection$lambda$23(ImmutableList immutableList, Integer num, Integer num2, Function1 function1, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DayOfWeekSelectorSection(immutableList, num, num2, function1, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyTimeOfDaySelectorSection$lambda$29(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EmptyTimeOfDaySelectorSection(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInDayCard$lambda$40(AppointmentTimeOfDay appointmentTimeOfDay, int i, boolean z, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        TimeInDayCard(appointmentTimeOfDay, i, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeOfDaySelectorSection$lambda$27(ImmutableList immutableList, Integer num, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimeOfDaySelectorSection(immutableList, num, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeekPage$lambda$32(int i, ImmutableList immutableList, Integer num, Integer num2, Function2 function2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        WeekPage(i, immutableList, num, num2, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppointmentsSchedulingDatetimePickerComposable(final AppointmentsSchedulerDuxo duxo, final AppointmentsSchedulerViewState6 subScreen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        ImmutableList<AppointmentTimeOfDay> immutableListPersistentListOf;
        boolean z;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(subScreen, "subScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1944926115);
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
            i3 |= composerStartRestartGroup.changed(subScreen.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1944926115, i3, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposable (AppointmentsSchedulingDatetimePickerComposable.kt:62)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Screen.Name name = Screen.Name.CX_APPOINTMENT_TIME_SELECTION;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_datetime_picker_title, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                int i6 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 12582912, 0, 7996);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                ImmutableList<AppointmentWeek> appointmentSlots = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppointmentSlots();
                Integer selectedWeekIndex = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedWeekIndex();
                Integer selectedDayOfWeekIndex = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedDayOfWeekIndex();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C28833x65ab33e2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C28834x65ab37a3(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                DayOfWeekSelectorSection(appointmentSlots, selectedWeekIndex, selectedDayOfWeekIndex, (Function1) kFunction, (Function2) ((KFunction) objRememberedValue2), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, composerStartRestartGroup, 0, 0);
                if (AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedWeekIndex() != null || AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedDayOfWeekIndex() == null) {
                    immutableListPersistentListOf = extensions2.persistentListOf();
                } else {
                    ImmutableList<AppointmentWeek> appointmentSlots2 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppointmentSlots();
                    Integer selectedWeekIndex2 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedWeekIndex();
                    if (selectedWeekIndex2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ImmutableList<AppointmentDayOfWeek> daysOfWeek = appointmentSlots2.get(selectedWeekIndex2.intValue()).getDaysOfWeek();
                    Integer selectedDayOfWeekIndex2 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedDayOfWeekIndex();
                    if (selectedDayOfWeekIndex2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    immutableListPersistentListOf = daysOfWeek.get(selectedDayOfWeekIndex2.intValue()).getTimeSlots();
                }
                if (immutableListPersistentListOf.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-1128248644);
                    Modifier modifierWeight$default = Column5.weight$default(column6, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                    Integer selectedTimeOfDayIndex = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedTimeOfDayIndex();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new C28835x65ab3b64(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    TimeOfDaySelectorSection(immutableListPersistentListOf, selectedTimeOfDayIndex, (Function1) ((KFunction) objRememberedValue4), modifierWeight$default, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    z = false;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1127899584);
                    z = false;
                    EmptyTimeOfDaySelectorSection(Column5.weight$default(column6, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                boolean canContinue = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCanContinue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo) | ((i6 & 112) != 32 ? true : z);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingDatetimePickerComposableKt.m2473xb7576ebe(duxo, subScreen);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BottomControls(canContinue, (Function0) objRememberedValue3, modifierAutoLogEvents$default2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.AppointmentsSchedulingDatetimePickerComposable$lambda$7(duxo, subScreen, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Screen.Name name2 = Screen.Name.CX_APPOINTMENT_TIME_SELECTION;
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Modifier modifier52 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_datetime_picker_title, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                int i62 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 12582912, 0, 7996);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null);
                ImmutableList<AppointmentWeek> appointmentSlots3 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAppointmentSlots();
                Integer selectedWeekIndex3 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedWeekIndex();
                Integer selectedDayOfWeekIndex3 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedDayOfWeekIndex();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new C28833x65ab33e2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    KFunction kFunction2 = (KFunction) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new C28834x65ab37a3(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        DayOfWeekSelectorSection(appointmentSlots3, selectedWeekIndex3, selectedDayOfWeekIndex3, (Function1) kFunction2, (Function2) ((KFunction) objRememberedValue2), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, composerStartRestartGroup, 0, 0);
                        if (AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedWeekIndex() != null) {
                            immutableListPersistentListOf = extensions2.persistentListOf();
                            if (immutableListPersistentListOf.isEmpty()) {
                            }
                            Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name2, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                            boolean canContinue2 = AppointmentsSchedulingDatetimePickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCanContinue();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo) | ((i62 & 112) != 32 ? true : z);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AppointmentsSchedulingDatetimePickerComposableKt.m2473xb7576ebe(duxo, subScreen);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                BottomControls(canContinue2, (Function0) objRememberedValue3, modifierAutoLogEvents$default22, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final AppointmentsSchedulerViewState AppointmentsSchedulingDatetimePickerComposable$lambda$0(SnapshotState4<AppointmentsSchedulerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean DayOfWeekSelectorSection$lambda$10(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean DayOfWeekSelectorSection$lambda$13(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AppointmentsSchedulingDatetimePickerComposable$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2473xb7576ebe(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6) {
        appointmentsSchedulerDuxo.handleNext(appointmentsSchedulerViewState6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DayOfWeekSelectorSection(final ImmutableList<AppointmentWeek> immutableList, Integer num, Integer num2, final Function1<? super Integer, Unit> function1, final Function2<? super Integer, ? super Integer, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        Object objRememberedValue2;
        SnapshotState4 snapshotState42;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue3;
        long jM21427getFg30d7_KjU;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean zChanged2;
        Object objRememberedValue5;
        long jM21427getFg30d7_KjU2;
        boolean zChanged3;
        Object objRememberedValue6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Integer num3 = num;
        final Integer num4 = num2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854528016);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num3) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(num4) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-854528016, i3, -1, "com.robinhood.android.support.appointments.DayOfWeekSelectorSection (AppointmentsSchedulingDatetimePickerComposable.kt:150)");
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$9$lambda$8(lazyListStateRememberLazyListState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$12$lambda$11(lazyListStateRememberLazyListState, immutableList));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState42 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Modifier modifier5 = modifier4;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 5, null);
                boolean zDayOfWeekSelectorSection$lambda$10 = DayOfWeekSelectorSection$lambda$10(snapshotState4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i3 & 7168;
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | (i6 != 2048);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$15$lambda$14(lazyListStateRememberLazyListState, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default2, zDayOfWeekSelectorSection$lambda$10, null, null, (Function0) objRememberedValue3, 6, null);
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_LEFT_16);
                if (DayOfWeekSelectorSection$lambda$10(snapshotState4)) {
                    composerStartRestartGroup.startReplaceGroup(200876111);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(200875278);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = BentoIcon4.Size16.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU, modifierM4893clickableXHw0xAI$default, null, false, composerStartRestartGroup, i7 | 48, 48);
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, SnapPosition.Center.INSTANCE, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i8 = i3 & 112;
                zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | (i8 != 32) | ((i3 & 896) != 256) | ((57344 & i3) != 16384);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    num3 = num;
                    num4 = num2;
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$18$lambda$17(immutableList, num3, num4, function2, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    num3 = num;
                    num4 = num2;
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyDslKt.LazyRow(modifierWeight$default, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, flingBehaviorRememberSnapFlingBehavior, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 428);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 5, null);
                boolean zDayOfWeekSelectorSection$lambda$13 = DayOfWeekSelectorSection$lambda$13(snapshotState42);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(immutableList) | (i6 != 2048);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$20$lambda$19(lazyListStateRememberLazyListState, immutableList, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default3, zDayOfWeekSelectorSection$lambda$13, null, null, (Function0) objRememberedValue5, 6, null);
                BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16);
                if (DayOfWeekSelectorSection$lambda$13(snapshotState42)) {
                    composerStartRestartGroup.startReplaceGroup(200925391);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(200924558);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size162, null, jM21427getFg30d7_KjU2, modifierM4893clickableXHw0xAI$default2, null, false, composerStartRestartGroup, i7 | 48, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged3 = (i8 != 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new C28836xcbd77217(num3, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(num3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i3 >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$23(immutableList, num3, num4, function1, function2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState42 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Modifier modifier52 = modifier4;
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 5, null);
                boolean zDayOfWeekSelectorSection$lambda$102 = DayOfWeekSelectorSection$lambda$10(snapshotState4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i62 = i3 & 7168;
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | (i62 != 2048);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$15$lambda$14(lazyListStateRememberLazyListState, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default3 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default22, zDayOfWeekSelectorSection$lambda$102, null, null, (Function0) objRememberedValue3, 6, null);
                    BentoIcon4.Size16 size163 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_LEFT_16);
                    if (DayOfWeekSelectorSection$lambda$10(snapshotState4)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i72 = BentoIcon4.Size16.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(size163, null, jM21427getFg30d7_KjU, modifierM4893clickableXHw0xAI$default3, null, false, composerStartRestartGroup, i72 | 48, 48);
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, SnapPosition.Center.INSTANCE, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i82 = i3 & 112;
                    zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | (i82 != 32) | ((i3 & 896) != 256) | ((57344 & i3) != 16384);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        num3 = num;
                        num4 = num2;
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$18$lambda$17(immutableList, num3, num4, function2, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyRow(modifierWeight$default2, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM5089spacedBy0680j_42, null, flingBehaviorRememberSnapFlingBehavior2, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 428);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifierM5146paddingqDBjuR0$default32 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 5, null);
                        boolean zDayOfWeekSelectorSection$lambda$132 = DayOfWeekSelectorSection$lambda$13(snapshotState42);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(immutableList) | (i62 != 2048);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AppointmentsSchedulingDatetimePickerComposableKt.DayOfWeekSelectorSection$lambda$21$lambda$20$lambda$19(lazyListStateRememberLazyListState, immutableList, function1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default22 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default32, zDayOfWeekSelectorSection$lambda$132, null, null, (Function0) objRememberedValue5, 6, null);
                            BentoIcon4.Size16 size1622 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16);
                            if (DayOfWeekSelectorSection$lambda$13(snapshotState42)) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size1622, null, jM21427getFg30d7_KjU2, modifierM4893clickableXHw0xAI$default22, null, false, composerStartRestartGroup, i72 | 48, 48);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged3 = (i82 != 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue6 = new C28836xcbd77217(num3, lazyListStateRememberLazyListState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(num3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i3 >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DayOfWeekSelectorSection$lambda$9$lambda$8(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DayOfWeekSelectorSection$lambda$12$lambda$11(LazyListState lazyListState, ImmutableList immutableList) {
        return lazyListState.getFirstVisibleItemIndex() + lazyListState.getLayoutInfo().getVisibleItemsInfo().size() < immutableList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayOfWeekSelectorSection$lambda$21$lambda$15$lambda$14(LazyListState lazyListState, Function1 function1) {
        function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(lazyListState.getFirstVisibleItemIndex() - 1, 0)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayOfWeekSelectorSection$lambda$21$lambda$18$lambda$17(final ImmutableList immutableList, final Integer num, final Integer num2, final Function2 function2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DayOfWeekSelectorSection$lambda$21$lambda$18$lambda$17$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num3) {
                return invoke(num3.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DayOfWeekSelectorSection$lambda$21$lambda$18$lambda$17$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num3, Composer composer, Integer num4) {
                invoke(lazyItemScope, num3.intValue(), composer, num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = immutableList.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                composer.startReplaceGroup(1789253356);
                AppointmentsSchedulingDatetimePickerComposableKt.WeekPage(i, ((AppointmentWeek) obj).getDaysOfWeek(), num, num2, function2, LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null), composer, (i4 >> 3) & 14, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeOfDaySelectorSection$lambda$26$lambda$25(final ImmutableList immutableList, final Integer num, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$TimeOfDaySelectorSection$lambda$26$lambda$25$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$TimeOfDaySelectorSection$lambda$26$lambda$25$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                AppointmentTimeOfDay appointmentTimeOfDay = (AppointmentTimeOfDay) immutableList.get(i);
                composer.startReplaceGroup(635795961);
                Integer num2 = num;
                AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard(appointmentTimeOfDay, i, num2 != null && i == num2.intValue(), function1, null, composer, i3 & 112, 16);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, C28868x18e1cb76.INSTANCE.m19048getLambda$2000527975$feature_support_externalRelease(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayOfWeekSelectorSection$lambda$21$lambda$20$lambda$19(LazyListState lazyListState, ImmutableList immutableList, Function1 function1) {
        function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(lazyListState.getFirstVisibleItemIndex() + 1, immutableList.size() - 1)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TimeOfDaySelectorSection(final ImmutableList<AppointmentTimeOfDay> immutableList, final Integer num, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869031666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1869031666, i3, -1, "com.robinhood.android.support.appointments.TimeOfDaySelectorSection (AppointmentsSchedulingDatetimePickerComposable.kt:254)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AppointmentsSchedulingDatetimePickerComposableKt.TimeOfDaySelectorSection$lambda$26$lambda$25(immutableList, num, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 9) & 14;
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                LazyDslKt.LazyColumn(modifier4, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, i5, 494);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.TimeOfDaySelectorSection$lambda$27(immutableList, num, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.TimeOfDaySelectorSection$lambda$26$lambda$25(immutableList, num, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (i3 >> 9) & 14;
                composer2 = composerStartRestartGroup;
                Modifier modifier42 = modifier2;
                LazyDslKt.LazyColumn(modifier42, null, null, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composer2, i52, 494);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void EmptyTimeOfDaySelectorSection(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1317210629);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317210629, i3, -1, "com.robinhood.android.support.appointments.EmptyTimeOfDaySelectorSection (AppointmentsSchedulingDatetimePickerComposable.kt:277)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoPogSize bentoPogSize = BentoPogSize.Hero;
            int i5 = C20690R.drawable.pict_mono_rds_calendar;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(i5, null, false, bentoPogSize, null, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU()), composerStartRestartGroup, 3072, 54);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_datetime_no_available_appointments, composerStartRestartGroup, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textM, composerStartRestartGroup, 12582912, 0, 7992);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsSchedulingDatetimePickerComposableKt.EmptyTimeOfDaySelectorSection$lambda$29(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WeekPage(final int i, ImmutableList<AppointmentDayOfWeek> immutableList, final Integer num, final Integer num2, final Function2<? super Integer, ? super Integer, Unit> function2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        ImmutableList<AppointmentDayOfWeek> immutableList2;
        Function2<? super Integer, ? super Integer, Unit> function22;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5 = i;
        Integer num3 = num;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985154870);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            immutableList2 = immutableList;
        } else {
            immutableList2 = immutableList;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(immutableList2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(num3) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
        }
        int i6 = i3 & 32;
        if (i6 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i4) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1985154870, i4, -1, "com.robinhood.android.support.appointments.WeekPage (AppointmentsSchedulingDatetimePickerComposable.kt:311)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                int i7 = 0;
                Spacer2.Spacer(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(875219575);
                int i8 = 0;
                for (AppointmentDayOfWeek appointmentDayOfWeek : immutableList2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AppointmentDayOfWeek appointmentDayOfWeek2 = appointmentDayOfWeek;
                    int i10 = i4;
                    DateCard(i5, i8, appointmentDayOfWeek2.getDisplayMonth(), appointmentDayOfWeek2.getDisplayDay(), DayOfWeek.MONDAY.getValue() + i8, appointmentDayOfWeek2.getAvailable(), (num3 != null && num3.intValue() == i5 && num2 != null && num2.intValue() == i8) ? 1 : i7, function22, null, composerStartRestartGroup, (i10 & 14) | ((i10 << 9) & 29360128), 256);
                    i5 = i;
                    function22 = function2;
                    i7 = i7;
                    i8 = i9;
                    i4 = i10;
                    modifier4 = modifier4;
                    num3 = num;
                }
                Modifier modifier5 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, i7);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final ImmutableList<AppointmentDayOfWeek> immutableList3 = immutableList2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.WeekPage$lambda$32(i, immutableList3, num, num2, function2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        if ((74899 & i4) != 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                int i72 = 0;
                Spacer2.Spacer(Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(875219575);
                int i82 = 0;
                while (r17.hasNext()) {
                }
                Modifier modifier52 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, i72);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DateCard(final int i, final int i2, int i3, final int i4, int i5, final boolean z, final boolean z2, final Function2<? super Integer, ? super Integer, Unit> function2, Modifier modifier, Composer composer, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        Function2<? super Integer, ? super Integer, Unit> function22;
        int i12;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-438037809);
        if ((i7 & 1) != 0) {
            i8 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else {
            if ((i6 & 48) == 0) {
                i8 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
            }
            if ((i7 & 4) == 0) {
                i8 |= 384;
                i9 = i3;
            } else {
                i9 = i3;
                if ((i6 & 384) == 0) {
                    i8 |= composerStartRestartGroup.changed(i9) ? 256 : 128;
                }
            }
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else {
                if ((i6 & 3072) == 0) {
                    i10 = i4;
                    i8 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
                }
                if ((i7 & 16) != 0) {
                    i8 |= 24576;
                } else {
                    if ((i6 & 24576) == 0) {
                        i11 = i5;
                        i8 |= composerStartRestartGroup.changed(i11) ? 16384 : 8192;
                    }
                    if ((i7 & 32) == 0) {
                        i8 |= 196608;
                    } else {
                        if ((i6 & 196608) == 0) {
                            z3 = z;
                            i8 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                        if ((i7 & 64) != 0) {
                            i8 |= 1572864;
                        } else {
                            if ((i6 & 1572864) == 0) {
                                i8 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                            }
                            if ((i7 & 128) == 0) {
                                i8 |= 12582912;
                            } else {
                                if ((i6 & 12582912) == 0) {
                                    function22 = function2;
                                    i8 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                                }
                                i12 = i7 & 256;
                                if (i12 == 0) {
                                    if ((100663296 & i6) == 0) {
                                        modifier2 = modifier;
                                        i8 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                                    }
                                    if ((i8 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-438037809, i8, -1, "com.robinhood.android.support.appointments.DateCard (AppointmentsSchedulingDatetimePickerComposable.kt:347)");
                                        }
                                        DayOfWeek dayOfWeekM3368of = DayOfWeek.m3368of(i11);
                                        p479j$.time.format.TextStyle textStyle = p479j$.time.format.TextStyle.SHORT;
                                        Locale locale = Locale.ENGLISH;
                                        final String displayName = dayOfWeekM3368of.getDisplayName(textStyle, locale);
                                        final String displayName2 = Month.m3422of(i9).getDisplayName(textStyle, locale);
                                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                                        composerStartRestartGroup.startReplaceGroup(212064437);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new Measurer2(density);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        measurer2 = (Measurer2) objRememberedValue;
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new ConstraintLayoutScope();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        snapshotState = (SnapshotState) objRememberedValue3;
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue5 == companion.getEmpty()) {
                                            objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        snapshotState2 = (SnapshotState) objRememberedValue5;
                                        zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                                            final int i13 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                            objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$2
                                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i14);
                                                }

                                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i14);
                                                }

                                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i14);
                                                }

                                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i14);
                                                }

                                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    snapshotState2.getValue();
                                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i13);
                                                    snapshotState.getValue();
                                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                                    final Measurer2 measurer22 = measurer2;
                                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$2.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                            snapshotState3 = snapshotState;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        } else {
                                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                            snapshotState3 = snapshotState;
                                        }
                                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue7 == companion.getEmpty()) {
                                            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                                    constraintSetForInlineDsl2.setKnownDirty(true);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        final Function0 function0 = (Function0) objRememberedValue7;
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$4
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        }
                                        final int i14 = i10;
                                        final boolean z4 = z3;
                                        final Function2<? super Integer, ? super Integer, Unit> function23 = function22;
                                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i15) {
                                                long jM21371getBg0d7_KjU;
                                                if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                                    }
                                                    snapshotState2.setValue(Unit.INSTANCE);
                                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                                    constraintLayoutScope.reset();
                                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                                    composer2.startReplaceGroup(141184454);
                                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    composer2.startReplaceGroup(5004770);
                                                    boolean zChanged = composer2.changed(constraintLayoutBaseScope4Component2);
                                                    Object objRememberedValue9 = composer2.rememberedValue();
                                                    if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue9 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$1$1(constraintLayoutBaseScope4Component2);
                                                        composer2.updateRememberedValue(objRememberedValue9);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                                    Intrinsics.checkNotNull(displayName);
                                                    String str = displayName;
                                                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i16 = BentoTheme.$stable;
                                                    BentoText2.m20747BentoText38GnDrw(str, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer2, i16).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i16).getTextS(), composer2, 12582912, 0, 7992);
                                                    composer2.startReplaceGroup(5004770);
                                                    boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                                                    Object objRememberedValue10 = composer2.rememberedValue();
                                                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue10 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$2$1(constraintLayoutBaseScope4Component2);
                                                        composer2.updateRememberedValue(objRememberedValue10);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), 0.0f, bentoTheme.getSpacing(composer2, i16).m21593getSmallD9Ej5fM(), 1, null);
                                                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                                                    if (z2) {
                                                        composer2.startReplaceGroup(-133961638);
                                                        jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i16).m21425getFg0d7_KjU();
                                                    } else {
                                                        composer2.startReplaceGroup(-133960806);
                                                        jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i16).m21371getBg0d7_KjU();
                                                    }
                                                    composer2.endReplaceGroup();
                                                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composer2, 0), bentoTheme.getColors(composer2, i16).m21373getBg30d7_KjU());
                                                    composer2.startReplaceGroup(-1224400529);
                                                    boolean zChanged3 = composer2.changed(z4) | composer2.changed(function23) | composer2.changed(i) | composer2.changed(i2);
                                                    Object objRememberedValue11 = composer2.rememberedValue();
                                                    if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue11 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$3$1(z4, function23, i, i2);
                                                        composer2.updateRememberedValue(objRememberedValue11);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue11, modifierM5144paddingVpY3zN4$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(-1665195603, true, new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$4(z2, z4, displayName2, i14), composer2, 54), composer2, 0, 6, 740);
                                                    composer2.endReplaceGroup();
                                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                        EffectsKt.SideEffect(function0, composer2, 6);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final int i15 = i9;
                                        final int i16 = i11;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return AppointmentsSchedulingDatetimePickerComposableKt.DateCard$lambda$37(i, i2, i15, i4, i16, z, z2, function2, modifier3, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i8 |= 100663296;
                                modifier2 = modifier;
                                if ((i8 & 38347923) == 38347922) {
                                    if (i12 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    DayOfWeek dayOfWeekM3368of2 = DayOfWeek.m3368of(i11);
                                    p479j$.time.format.TextStyle textStyle2 = p479j$.time.format.TextStyle.SHORT;
                                    Locale locale2 = Locale.ENGLISH;
                                    final String displayName3 = dayOfWeekM3368of2.getDisplayName(textStyle2, locale2);
                                    final String displayName22 = Month.m3422of(i9).getDisplayName(textStyle2, locale2);
                                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                                    composerStartRestartGroup.startReplaceGroup(212064437);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    measurer2 = (Measurer2) objRememberedValue;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                    }
                                    snapshotState = (SnapshotState) objRememberedValue3;
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                    }
                                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    snapshotState2 = (SnapshotState) objRememberedValue5;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        final int i132 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$2
                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i142) {
                                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i142);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i142) {
                                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i142);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i142) {
                                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i142);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i142) {
                                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i142);
                                            }

                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                            /* renamed from: measure-3p2s80s */
                                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                                final Map linkedHashMap = new LinkedHashMap();
                                                snapshotState2.getValue();
                                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i132);
                                                snapshotState.getValue();
                                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                                final Measurer2 measurer22 = measurer2;
                                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$2.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                        snapshotState3 = snapshotState;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue7 == companion.getEmpty()) {
                                        }
                                        final Function0 function02 = (Function0) objRememberedValue7;
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance2) {
                                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$4
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                            final int i142 = i10;
                                            final boolean z42 = z3;
                                            final Function2 function232 = function22;
                                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i152) {
                                                    long jM21371getBg0d7_KjU;
                                                    if ((i152 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1200550679, i152, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                                        }
                                                        snapshotState2.setValue(Unit.INSTANCE);
                                                        int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                                        constraintLayoutScope2.reset();
                                                        ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                                        composer2.startReplaceGroup(141184454);
                                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        composer2.startReplaceGroup(5004770);
                                                        boolean zChanged = composer2.changed(constraintLayoutBaseScope4Component2);
                                                        Object objRememberedValue9 = composer2.rememberedValue();
                                                        if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue9 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$1$1(constraintLayoutBaseScope4Component2);
                                                            composer2.updateRememberedValue(objRememberedValue9);
                                                        }
                                                        composer2.endReplaceGroup();
                                                        Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                                        Intrinsics.checkNotNull(displayName3);
                                                        String str = displayName3;
                                                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                        int i162 = BentoTheme.$stable;
                                                        BentoText2.m20747BentoText38GnDrw(str, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer2, i162).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i162).getTextS(), composer2, 12582912, 0, 7992);
                                                        composer2.startReplaceGroup(5004770);
                                                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                                                        Object objRememberedValue10 = composer2.rememberedValue();
                                                        if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue10 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$2$1(constraintLayoutBaseScope4Component2);
                                                            composer2.updateRememberedValue(objRememberedValue10);
                                                        }
                                                        composer2.endReplaceGroup();
                                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), 0.0f, bentoTheme.getSpacing(composer2, i162).m21593getSmallD9Ej5fM(), 1, null);
                                                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                                                        if (z2) {
                                                            composer2.startReplaceGroup(-133961638);
                                                            jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i162).m21425getFg0d7_KjU();
                                                        } else {
                                                            composer2.startReplaceGroup(-133960806);
                                                            jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i162).m21371getBg0d7_KjU();
                                                        }
                                                        composer2.endReplaceGroup();
                                                        BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composer2, 0), bentoTheme.getColors(composer2, i162).m21373getBg30d7_KjU());
                                                        composer2.startReplaceGroup(-1224400529);
                                                        boolean zChanged3 = composer2.changed(z42) | composer2.changed(function232) | composer2.changed(i) | composer2.changed(i2);
                                                        Object objRememberedValue11 = composer2.rememberedValue();
                                                        if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue11 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$3$1(z42, function232, i, i2);
                                                            composer2.updateRememberedValue(objRememberedValue11);
                                                        }
                                                        composer2.endReplaceGroup();
                                                        SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue11, modifierM5144paddingVpY3zN4$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(-1665195603, true, new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$4(z2, z42, displayName22, i142), composer2, 54), composer2, 0, 6, 740);
                                                        composer2.endReplaceGroup();
                                                        if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                                            EffectsKt.SideEffect(function02, composer2, 6);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier3 = modifier4;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            function22 = function2;
                            i12 = i7 & 256;
                            if (i12 == 0) {
                            }
                            modifier2 = modifier;
                            if ((i8 & 38347923) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i7 & 128) == 0) {
                        }
                        function22 = function2;
                        i12 = i7 & 256;
                        if (i12 == 0) {
                        }
                        modifier2 = modifier;
                        if ((i8 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z3 = z;
                    if ((i7 & 64) != 0) {
                    }
                    if ((i7 & 128) == 0) {
                    }
                    function22 = function2;
                    i12 = i7 & 256;
                    if (i12 == 0) {
                    }
                    modifier2 = modifier;
                    if ((i8 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i11 = i5;
                if ((i7 & 32) == 0) {
                }
                z3 = z;
                if ((i7 & 64) != 0) {
                }
                if ((i7 & 128) == 0) {
                }
                function22 = function2;
                i12 = i7 & 256;
                if (i12 == 0) {
                }
                modifier2 = modifier;
                if ((i8 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i10 = i4;
            if ((i7 & 16) != 0) {
            }
            i11 = i5;
            if ((i7 & 32) == 0) {
            }
            z3 = z;
            if ((i7 & 64) != 0) {
            }
            if ((i7 & 128) == 0) {
            }
            function22 = function2;
            i12 = i7 & 256;
            if (i12 == 0) {
            }
            modifier2 = modifier;
            if ((i8 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i7 & 4) == 0) {
        }
        if ((i7 & 8) == 0) {
        }
        i10 = i4;
        if ((i7 & 16) != 0) {
        }
        i11 = i5;
        if ((i7 & 32) == 0) {
        }
        z3 = z;
        if ((i7 & 64) != 0) {
        }
        if ((i7 & 128) == 0) {
        }
        function22 = function2;
        i12 = i7 & 256;
        if (i12 == 0) {
        }
        modifier2 = modifier;
        if ((i8 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInDayCard(final AppointmentTimeOfDay appointmentTimeOfDay, final int i, final boolean z, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long jM21371getBg0d7_KjU;
        boolean z2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(873342411);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(appointmentTimeOfDay) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(873342411, i4, -1, "com.robinhood.android.support.appointments.TimeInDayCard (AppointmentsSchedulingDatetimePickerComposable.kt:434)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-1167782357);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1167732757);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard$lambda$39$lambda$38(function1, i);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierFillMaxWidth$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(55900832, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard.2
                    public final void invoke(Composer composer3, int i6) {
                        long jM21425getFg0d7_KjU;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(55900832, i6, -1, "com.robinhood.android.support.appointments.TimeInDayCard.<anonymous> (AppointmentsSchedulingDatetimePickerComposable.kt:452)");
                        }
                        AppointmentTimeOfDay appointmentTimeOfDay2 = appointmentTimeOfDay;
                        boolean z3 = z;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                        String displayStartTime = appointmentTimeOfDay2.getDisplayStartTime();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        TextStyle textM = bentoTheme.getTypography(composer3, i7).getTextM();
                        if (z3) {
                            composer3.startReplaceGroup(1139574090);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1139639562);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(displayStartTime, modifierFillMaxWidth$default2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textM, composer3, 12582912, 0, 7992);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 0, 6, 740);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard$lambda$40(appointmentTimeOfDay, i, z, function1, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        modifier2 = modifier;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            if (!z) {
            }
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z2 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard$lambda$39$lambda$38(function1, i);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierFillMaxWidth$default2, false, roundedCornerShapeM5327RoundedCornerShape0680j_42, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U2, null, ComposableLambda3.rememberComposableLambda(55900832, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt.TimeInDayCard.2
                    public final void invoke(Composer composer3, int i6) {
                        long jM21425getFg0d7_KjU;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(55900832, i6, -1, "com.robinhood.android.support.appointments.TimeInDayCard.<anonymous> (AppointmentsSchedulingDatetimePickerComposable.kt:452)");
                        }
                        AppointmentTimeOfDay appointmentTimeOfDay2 = appointmentTimeOfDay;
                        boolean z3 = z;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                        String displayStartTime = appointmentTimeOfDay2.getDisplayStartTime();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        TextStyle textM = bentoTheme.getTypography(composer3, i7).getTextM();
                        if (z3) {
                            composer3.startReplaceGroup(1139574090);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1139639562);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(displayStartTime, modifierFillMaxWidth$default22, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textM, composer3, 12582912, 0, 7992);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 0, 6, 740);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInDayCard$lambda$39$lambda$38(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomControls(final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(414064741);
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
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(414064741, i3, -1, "com.robinhood.android.support.appointments.BottomControls (AppointmentsSchedulingDatetimePickerComposable.kt:478)");
                }
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(modifier2, null, null, false, null, null, function02, StringResources_androidKt.stringResource(C39996R.string.appointments_cta_continue, composerStartRestartGroup, 0), false, null, z2, null, null, false, null, false, composer2, ((i3 >> 6) & 14) | ((i3 << 15) & 3670016), i3 & 14, 64318);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulingDatetimePickerComposableKt.BottomControls$lambda$41(z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoButtonBar2.BentoButtonBar(modifier2, null, null, false, null, null, function02, StringResources_androidKt.stringResource(C39996R.string.appointments_cta_continue, composerStartRestartGroup, 0), false, null, z2, null, null, false, null, false, composer2, ((i3 >> 6) & 14) | ((i3 << 15) & 3670016), i3 & 14, 64318);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
