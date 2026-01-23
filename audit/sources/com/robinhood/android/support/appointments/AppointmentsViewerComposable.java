package com.robinhood.android.support.appointments;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.support.appointments.AppointmentsViewerComposable;
import com.robinhood.android.support.appointments.AppointmentsViewerEvent;
import com.robinhood.android.support.appointments.AppointmentsViewerViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.TextStyle;

/* compiled from: AppointmentsViewerComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\u001a/\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002"}, m3636d2 = {"AppointmentsViewerComposable", "", "duxo", "Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "onCloseAll", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "userPhoneNumber", "", "bottomControlState", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;Lcom/robinhood/models/ui/appointments/Appointment;Ljava/lang/String;Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;Landroidx/compose/runtime/Composer;I)V", "HeadVisual", "(Lcom/robinhood/models/ui/appointments/Appointment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DateBox", "AppointmentsContent", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;Lcom/robinhood/models/ui/appointments/Appointment;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomControl", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Dialog", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;Landroidx/compose/runtime/Composer;I)V", "feature-support_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "state", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;", "showDialog", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsViewerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsContent$lambda$24(AppointmentsViewerDuxo appointmentsViewerDuxo, Appointment appointment, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsContent(appointmentsViewerDuxo, appointment, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsViewerComposable$lambda$9(AppointmentsViewerDuxo appointmentsViewerDuxo, AppointmentsSchedulerFragmentKey.Source source, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsViewerComposable(appointmentsViewerDuxo, source, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControl$lambda$32(AppointmentsViewerDuxo appointmentsViewerDuxo, Appointment appointment, AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomControl(appointmentsViewerDuxo, appointment, bottomControlState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$13(AppointmentsViewerDuxo appointmentsViewerDuxo, Appointment appointment, String str, AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState, int i, Composer composer, int i2) {
        Content(appointmentsViewerDuxo, appointment, str, bottomControlState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateBox$lambda$19(Appointment appointment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DateBox(appointment, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$43(AppointmentsViewerDuxo appointmentsViewerDuxo, AppointmentsViewerViewState.DialogData dialogData, int i, Composer composer, int i2) {
        Dialog(appointmentsViewerDuxo, dialogData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeadVisual$lambda$16(Appointment appointment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HeadVisual(appointment, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$11(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Event<AppointmentsViewerEvent> AppointmentsViewerComposable$lambda$0(SnapshotState4<Event<AppointmentsViewerEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppointmentsViewerViewState AppointmentsViewerComposable$lambda$1(SnapshotState4<AppointmentsViewerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean AppointmentsViewerComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: AppointmentsViewerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$2 */
    static final class C288572 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ AppointmentsViewerDuxo $duxo;
        final /* synthetic */ SnapshotState4<AppointmentsViewerViewState> $state$delegate;

        C288572(SnapshotState4<AppointmentsViewerViewState> snapshotState4, AppointmentsViewerDuxo appointmentsViewerDuxo) {
            this.$state$delegate = snapshotState4;
            this.$duxo = appointmentsViewerDuxo;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969026716, i, -1, "com.robinhood.android.support.appointments.AppointmentsViewerComposable.<anonymous> (AppointmentsViewerComposable.kt:116)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            final SnapshotState4<AppointmentsViewerViewState> snapshotState4 = this.$state$delegate;
            final AppointmentsViewerDuxo appointmentsViewerDuxo = this.$duxo;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            AppointmentsViewerViewState.LoadingState loadingState = AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$1(snapshotState4).getLoadingState();
            AppointmentsViewerViewState.LoadingState.Loaded loaded = loadingState instanceof AppointmentsViewerViewState.LoadingState.Loaded ? (AppointmentsViewerViewState.LoadingState.Loaded) loadingState : null;
            AppointmentsViewerComposable.HeadVisual(loaded != null ? loaded.getAppointment() : null, null, composer, 0, 2);
            AppointmentsViewerViewState.LoadingState loadingState2 = AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$1(snapshotState4).getLoadingState();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppointmentsViewerComposable.C288572.invoke$lambda$2$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(loadingState2, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(1967943016, true, new Function4<AnimatedContentScope, AppointmentsViewerViewState.LoadingState, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$2$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AppointmentsViewerViewState.LoadingState loadingState3, Composer composer2, Integer num) {
                    invoke(animatedContentScope, loadingState3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, AppointmentsViewerViewState.LoadingState loadingState3, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(loadingState3, "loadingState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1967943016, i2, -1, "com.robinhood.android.support.appointments.AppointmentsViewerComposable.<anonymous>.<anonymous>.<anonymous> (AppointmentsViewerComposable.kt:130)");
                    }
                    if (loadingState3 instanceof AppointmentsViewerViewState.LoadingState.Loading) {
                        composer2.startReplaceGroup(686903201);
                        AppointmentsViewerComposable.Loading(null, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(loadingState3 instanceof AppointmentsViewerViewState.LoadingState.Loaded)) {
                            composer2.startReplaceGroup(1407629757);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(687015204);
                        AppointmentsViewerViewState.LoadingState.Loaded loaded2 = (AppointmentsViewerViewState.LoadingState.Loaded) loadingState3;
                        AppointmentsViewerComposable.Content(appointmentsViewerDuxo, loaded2.getAppointment(), AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$1(snapshotState4).getUserPhoneNumber(), loaded2.getBottomControlState(), composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1573248, 58);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$2$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f4  */
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppointmentsViewerComposable(final AppointmentsViewerDuxo duxo, final AppointmentsSchedulerFragmentKey.Source source, final Function0<Unit> onCloseAll, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Context context;
        Navigator navigator;
        Event<AppointmentsViewerEvent> event;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        Composer composer2;
        final Event<AppointmentsViewerEvent> eventAppointmentsViewerComposable$lambda$0;
        final Event<AppointmentsViewerEvent> eventAppointmentsViewerComposable$lambda$02;
        final Event<AppointmentsViewerEvent> eventAppointmentsViewerComposable$lambda$03;
        final Context context2;
        final Navigator navigator2;
        final Event<AppointmentsViewerEvent> eventAppointmentsViewerComposable$lambda$04;
        final Modifier modifier3;
        EventConsumer<AppointmentsViewerEvent> eventConsumerInvoke;
        EventConsumer<AppointmentsViewerEvent> eventConsumerInvoke2;
        EventConsumer<AppointmentsViewerEvent> eventConsumerInvoke3;
        EventConsumer<AppointmentsViewerEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onCloseAll, "onCloseAll");
        Composer composerStartRestartGroup = composer.startRestartGroup(1402613779);
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
            i3 |= composerStartRestartGroup.changedInstance(source) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseAll) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1402613779, i3, -1, "com.robinhood.android.support.appointments.AppointmentsViewerComposable (AppointmentsViewerComposable.kt:93)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final StateFlow<Event<AppointmentsViewerEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AppointmentsViewerComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AppointmentsViewerEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<AppointmentsViewerEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof AppointmentsViewerEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composerStartRestartGroup, 6);
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-895809585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt.AppointmentsViewerComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-895809585, i5, -1, "com.robinhood.android.support.appointments.AppointmentsViewerComposable.<anonymous> (AppointmentsViewerComposable.kt:107)");
                        }
                        BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(WindowInsetsPadding_androidKt.statusBarsPadding(TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton")), false, Color.INSTANCE.m6727getWhite0d7_KjU(), onCloseAll, composer3, (BentoAppBarScope.$stable << 12) | 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1969026716, true, new C288572(snapshotState4CollectAsStateWithLifecycle2, duxo), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 805306416, 508);
                composer2 = composerStartRestartGroup;
                if (AppointmentsViewerComposable$lambda$3(snapshotState)) {
                    Dialog(duxo, AppointmentsViewerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getDialogData(), composer2, i3 & 14);
                }
                eventAppointmentsViewerComposable$lambda$0 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventAppointmentsViewerComposable$lambda$0 != null && (eventAppointmentsViewerComposable$lambda$0.getData() instanceof AppointmentsViewerEvent.ShowDialog) && (eventConsumerInvoke4 = eventAppointmentsViewerComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(eventAppointmentsViewerComposable$lambda$0, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19043invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19043invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$4(snapshotState, true);
                        }
                    });
                }
                eventAppointmentsViewerComposable$lambda$02 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventAppointmentsViewerComposable$lambda$02 != null && (eventAppointmentsViewerComposable$lambda$02.getData() instanceof AppointmentsViewerEvent.HideDialog) && (eventConsumerInvoke3 = eventAppointmentsViewerComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventAppointmentsViewerComposable$lambda$02, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19044invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19044invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$4(snapshotState, false);
                        }
                    });
                }
                eventAppointmentsViewerComposable$lambda$03 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventAppointmentsViewerComposable$lambda$03 == null && (eventAppointmentsViewerComposable$lambda$03.getData() instanceof AppointmentsViewerEvent.RescheduleAppointment) && (eventConsumerInvoke2 = eventAppointmentsViewerComposable$lambda$03.getGetEventConsumer().invoke()) != null) {
                    context2 = context;
                    navigator2 = navigator;
                    eventConsumerInvoke2.consume(eventAppointmentsViewerComposable$lambda$03, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19045invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19045invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsViewerEvent.RescheduleAppointment rescheduleAppointment = (AppointmentsViewerEvent.RescheduleAppointment) eventAppointmentsViewerComposable$lambda$03.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context2, new AppointmentsSchedulerFragmentKey(rescheduleAppointment.getAppointment().getCampaignId(), rescheduleAppointment.getAppointment().getId(), null, source, false, 20, null), false, false, false, false, null, true, null, null, 892, null);
                        }
                    });
                } else {
                    context2 = context;
                    navigator2 = navigator;
                }
                eventAppointmentsViewerComposable$lambda$04 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventAppointmentsViewerComposable$lambda$04 != null && (eventAppointmentsViewerComposable$lambda$04.getData() instanceof AppointmentsViewerEvent.ShowCancellationCompleted) && (eventConsumerInvoke = eventAppointmentsViewerComposable$lambda$04.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventAppointmentsViewerComposable$lambda$04, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19046invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19046invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsViewerEvent.ShowCancellationCompleted showCancellationCompleted = (AppointmentsViewerEvent.ShowCancellationCompleted) eventAppointmentsViewerComposable$lambda$04.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context2, new AppointmentsConfirmationFragmentKey.Cancelled(showCancellationCompleted.getAppointment(), source), false, false, false, false, null, true, null, null, 892, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$9(duxo, source, onCloseAll, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AppointmentsViewerComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof AppointmentsViewerEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<AppointmentsViewerEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof AppointmentsViewerEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composerStartRestartGroup, 6);
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-895809585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt.AppointmentsViewerComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895809585, i5, -1, "com.robinhood.android.support.appointments.AppointmentsViewerComposable.<anonymous> (AppointmentsViewerComposable.kt:107)");
                    }
                    BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(WindowInsetsPadding_androidKt.statusBarsPadding(TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton")), false, Color.INSTANCE.m6727getWhite0d7_KjU(), onCloseAll, composer3, (BentoAppBarScope.$stable << 12) | 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1969026716, true, new C288572(snapshotState4CollectAsStateWithLifecycle22, duxo), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 805306416, 508);
            composer2 = composerStartRestartGroup;
            if (AppointmentsViewerComposable$lambda$3(snapshotState)) {
            }
            eventAppointmentsViewerComposable$lambda$0 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
            if (eventAppointmentsViewerComposable$lambda$0 != null) {
                eventConsumerInvoke4.consume(eventAppointmentsViewerComposable$lambda$0, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19043invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19043invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$4(snapshotState, true);
                    }
                });
            }
            eventAppointmentsViewerComposable$lambda$02 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
            if (eventAppointmentsViewerComposable$lambda$02 != null) {
                eventConsumerInvoke3.consume(eventAppointmentsViewerComposable$lambda$02, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19044invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19044invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AppointmentsViewerComposable.AppointmentsViewerComposable$lambda$4(snapshotState, false);
                    }
                });
            }
            eventAppointmentsViewerComposable$lambda$03 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
            if (eventAppointmentsViewerComposable$lambda$03 == null) {
                context2 = context;
                navigator2 = navigator;
                eventAppointmentsViewerComposable$lambda$04 = AppointmentsViewerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                if (eventAppointmentsViewerComposable$lambda$04 != null) {
                    eventConsumerInvoke.consume(eventAppointmentsViewerComposable$lambda$04, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$AppointmentsViewerComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19046invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19046invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsViewerEvent.ShowCancellationCompleted showCancellationCompleted = (AppointmentsViewerEvent.ShowCancellationCompleted) eventAppointmentsViewerComposable$lambda$04.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context2, new AppointmentsConfirmationFragmentKey.Cancelled(showCancellationCompleted.getAppointment(), source), false, false, false, false, null, true, null, null, 892, null);
                        }
                    });
                }
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
    public static final void AppointmentsViewerComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-187530041);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-187530041, i3, -1, "com.robinhood.android.support.appointments.Loading (AppointmentsViewerComposable.kt:191)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.8f), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.8f), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8188);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.25f), true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getDisplayCapsuleMedium(), composer2, 6, 0, 8184);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.7f), true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8184);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.6f), true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8184);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.8f), true, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8184);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsViewerComposable.Loading$lambda$11(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final AppointmentsViewerDuxo appointmentsViewerDuxo, final Appointment appointment, final String str, final AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1022802580);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(appointmentsViewerDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(appointment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomControlState.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022802580, i2, -1, "com.robinhood.android.support.appointments.Content (AppointmentsViewerComposable.kt:304)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, appointment.getCampaignId(), null, appointment.getId(), null, 21, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            int i3 = i2 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            AppointmentsContent(appointmentsViewerDuxo, appointment, str, modifierVerticalScroll$default, composerStartRestartGroup, i2 & 1022, 0);
            composerStartRestartGroup.startReplaceGroup(-2019312640);
            if (bottomControlState != AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.HIDDEN) {
                BottomControl(appointmentsViewerDuxo, appointment, bottomControlState, null, composerStartRestartGroup, i3 | ((i2 >> 3) & 896), 8);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsViewerComposable.Content$lambda$13(appointmentsViewerDuxo, appointment, str, bottomControlState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeadVisual(final Appointment appointment, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-800315270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(appointment) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-800315270, i3, -1, "com.robinhood.android.support.appointments.HeadVisual (AppointmentsViewerComposable.kt:345)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE));
                float f = EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs, C2002Dp.m7995constructorimpl(f));
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierClipToBounds = Clip.clipToBounds(Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i4).getJet(), null, 2, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifier4 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_support_247_hero_image, composerStartRestartGroup, 0), (String) null, OffsetKt.m5124offsetVpY3zN4(SizeKt.m5158heightInVpY3zN4$default(boxScopeInstance.align(companion3, companion.getTopEnd()), 0.0f, C2002Dp.m7995constructorimpl(128), 1, null), C2002Dp.m7995constructorimpl(-36), C2002Dp.m7995constructorimpl(65)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU(), 0, 2, null), composerStartRestartGroup, 24624, 40);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(2091887083);
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(OffsetKt.m5125offsetVpY3zN4$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(appointment == null, boxScopeInstance.align(OffsetKt.m5125offsetVpY3zN4$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(32), 1, null), companion.getBottomStart()), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(640682972, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$HeadVisual$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(640682972, i6, -1, "com.robinhood.android.support.appointments.HeadVisual.<anonymous>.<anonymous> (AppointmentsViewerComposable.kt:389)");
                        }
                        Appointment appointment2 = appointment;
                        if (appointment2 != null) {
                            AppointmentsViewerComposable.DateBox(appointment2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), composer2, 0, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 24);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsViewerComposable.HeadVisual$lambda$16(appointment, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE));
                float f2 = EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs2, C2002Dp.m7995constructorimpl(f2));
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierClipToBounds2 = Clip.clipToBounds(Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs2, bentoTheme.getColors(composerStartRestartGroup, i4).getJet(), null, 2, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClipToBounds2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Modifier modifier42 = modifier3;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_support_247_hero_image, composerStartRestartGroup, 0), (String) null, OffsetKt.m5124offsetVpY3zN4(SizeKt.m5158heightInVpY3zN4$default(boxScopeInstance2.align(companion32, companion4.getTopEnd()), 0.0f, C2002Dp.m7995constructorimpl(128), 1, null), C2002Dp.m7995constructorimpl(-36), C2002Dp.m7995constructorimpl(65)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU(), 0, 2, null), composerStartRestartGroup, 24624, 40);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(2091887083);
                    if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedVisibilityKt.AnimatedVisibility(appointment == null, boxScopeInstance2.align(OffsetKt.m5125offsetVpY3zN4$default(companion32, 0.0f, C2002Dp.m7995constructorimpl(32), 1, null), companion4.getBottomStart()), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(640682972, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$HeadVisual$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(640682972, i6, -1, "com.robinhood.android.support.appointments.HeadVisual.<anonymous>.<anonymous> (AppointmentsViewerComposable.kt:389)");
                            }
                            Appointment appointment2 = appointment;
                            if (appointment2 != null) {
                                AppointmentsViewerComposable.DateBox(appointment2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), composer2, 0, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 24);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateBox(final Appointment appointment, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374783771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(appointment) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1374783771, i3, -1, "com.robinhood.android.support.appointments.DateBox (AppointmentsViewerComposable.kt:406)");
                }
                ZonedDateTime zonedDateTimeAtZone = appointment.getStartTime().atZone(ZoneId.systemDefault());
                String displayName = zonedDateTimeAtZone.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
                int dayOfMonth = zonedDateTimeAtZone.getDayOfMonth();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null);
                Modifier modifier3 = modifier2;
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default);
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
                Modifier modifierAlign = column6.align(companion3, companion.getCenterHorizontally());
                Intrinsics.checkNotNull(displayName);
                androidx.compose.p011ui.text.TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(displayName, modifierAlign, null, null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textS, composer2, 12582912, 0, 8060);
                BentoText2.m20747BentoText38GnDrw(String.valueOf(dayOfMonth), column6.align(companion3, companion.getCenterHorizontally()), null, null, FontWeight.INSTANCE.getBold(), null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextL(), composer2, 12607488, 0, 8044);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsViewerComposable.DateBox$lambda$19(appointment, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ZonedDateTime zonedDateTimeAtZone2 = appointment.getStartTime().atZone(ZoneId.systemDefault());
            String displayName2 = zonedDateTimeAtZone2.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            int dayOfMonth2 = zonedDateTimeAtZone2.getDayOfMonth();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null);
            Modifier modifier32 = modifier2;
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
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
                Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default2);
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
                    Modifier modifierAlign2 = column62.align(companion32, companion5.getCenterHorizontally());
                    Intrinsics.checkNotNull(displayName2);
                    androidx.compose.p011ui.text.TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(displayName2, modifierAlign2, null, null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textS2, composer2, 12582912, 0, 8060);
                    BentoText2.m20747BentoText38GnDrw(String.valueOf(dayOfMonth2), column62.align(companion32, companion5.getCenterHorizontally()), null, null, FontWeight.INSTANCE.getBold(), null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextL(), composer2, 12607488, 0, 8044);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AppointmentsContent(final AppointmentsViewerDuxo appointmentsViewerDuxo, final Appointment appointment, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        Appointment appointment2;
        int i3;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String agentName;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String string2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String notes;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1822930944);
        if ((i2 & 2) != 0) {
            i3 = i | 48;
            appointment2 = appointment;
        } else {
            appointment2 = appointment;
            if ((i & 48) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(appointment2) ? 32 : 16) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1169) == 1168 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1822930944, i3, -1, "com.robinhood.android.support.appointments.AppointmentsContent (AppointmentsViewerComposable.kt:456)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(48);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), fM7995constructorimpl, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    agentName = appointment2.getAgentName();
                    composerStartRestartGroup.startReplaceGroup(1656006226);
                    if (agentName == null) {
                        agentName = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_agent_name_placeholder, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_title, new Object[]{agentName}, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CALENDAR_16);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    int i6 = BentoIcon4.Size16.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21425getFg0d7_KjU, null, null, false, composerStartRestartGroup, i6 | 48, 56);
                    ZonedDateTime zonedDateTimeAtZone = appointment.getStartTime().atZone(ZoneId.systemDefault());
                    Locale locale = Locale.ENGLISH;
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE, MMMM d", locale);
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h:mm a", locale);
                    DateTimeFormatter dateTimeFormatterOfPattern3 = DateTimeFormatter.ofPattern("zz", locale);
                    String str2 = dateTimeFormatterOfPattern.format(zonedDateTimeAtZone);
                    String str3 = dateTimeFormatterOfPattern2.format(zonedDateTimeAtZone);
                    string2 = dateTimeFormatterOfPattern3.format(zonedDateTimeAtZone);
                    if (string2.length() > 2) {
                        Intrinsics.checkNotNull(string2);
                        char cFirst = StringsKt.first(string2);
                        char cLast = StringsKt.last(string2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(cFirst);
                        sb.append(cLast);
                        string2 = sb.toString();
                    }
                    BentoText2.m20747BentoText38GnDrw(str2 + " at " + str3 + PlaceholderUtils.XXShortPlaceholderText + string2, row6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), companion.getCenterVertically()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup.endNode();
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.PHONE_16), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, i6 | 48, 56);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_representative_call, new Object[]{str}, composerStartRestartGroup, 0), row6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), companion.getCenterVertically()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup.endNode();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    notes = appointment.getNotes();
                    composerStartRestartGroup.startReplaceGroup(1656098241);
                    if (notes != null) {
                        composer2 = composerStartRestartGroup;
                    } else {
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_note_subtitle, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(notes, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 0, 0, 8188);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AppointmentsViewerComposable.AppointmentsContent$lambda$24(appointmentsViewerDuxo, appointment, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1169) == 1168) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(48);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), fM7995constructorimpl2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    agentName = appointment2.getAgentName();
                    composerStartRestartGroup.startReplaceGroup(1656006226);
                    if (agentName == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_title, new Object[]{agentName}, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default22);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CALENDAR_16);
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                        int i62 = BentoIcon4.Size16.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size162, null, jM21425getFg0d7_KjU2, null, null, false, composerStartRestartGroup, i62 | 48, 56);
                        ZonedDateTime zonedDateTimeAtZone2 = appointment.getStartTime().atZone(ZoneId.systemDefault());
                        Locale locale2 = Locale.ENGLISH;
                        DateTimeFormatter dateTimeFormatterOfPattern4 = DateTimeFormatter.ofPattern("EEEE, MMMM d", locale2);
                        DateTimeFormatter dateTimeFormatterOfPattern22 = DateTimeFormatter.ofPattern("h:mm a", locale2);
                        DateTimeFormatter dateTimeFormatterOfPattern32 = DateTimeFormatter.ofPattern("zz", locale2);
                        String str22 = dateTimeFormatterOfPattern4.format(zonedDateTimeAtZone2);
                        String str32 = dateTimeFormatterOfPattern22.format(zonedDateTimeAtZone2);
                        string2 = dateTimeFormatterOfPattern32.format(zonedDateTimeAtZone2);
                        if (string2.length() > 2) {
                        }
                        BentoText2.m20747BentoText38GnDrw(str22 + " at " + str32 + PlaceholderUtils.XXShortPlaceholderText + string2, row62.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), companion4.getCenterVertically()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM5146paddingqDBjuR0$default32 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default32);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.PHONE_16), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, i62 | 48, 56);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_representative_call, new Object[]{str}, composerStartRestartGroup, 0), row62.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), companion4.getCenterVertically()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                            composerStartRestartGroup.endNode();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 1, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                            notes = appointment.getNotes();
                            composerStartRestartGroup.startReplaceGroup(1656098241);
                            if (notes != null) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1169) == 1168) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomControl(final AppointmentsViewerDuxo appointmentsViewerDuxo, final Appointment appointment, AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final AppointmentsViewerDuxo appointmentsViewerDuxo2 = appointmentsViewerDuxo;
        final Appointment appointment2 = appointment;
        Composer composerStartRestartGroup = composer.startRestartGroup(817190523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(appointmentsViewerDuxo2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(appointment2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(bottomControlState.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                bottomControlState2 = bottomControlState;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(817190523, i3, -1, "com.robinhood.android.support.appointments.BottomControl (AppointmentsViewerComposable.kt:560)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_change_policy, composerStartRestartGroup, 0);
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$26$lambda$25(context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(strStringResource, modifierFillMaxWidth$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, MarkdownStyle.$stable << 6, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.RESCHEDULE_APPOINTMENT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, appointment.getCampaignId(), SupportAppointmentSettingContext.AppointmentSchedulingType.RESCHEDULE, appointment.getId(), null, 17, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 51, null), false, false, false, true, false, null, 110, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_reschedule, composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState3 = AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.ENABLED;
                bottomControlState2 = bottomControlState;
                BentoButtonState bentoButtonState = new BentoButtonState(strStringResource2, (BentoButtons.Icon.Size16) null, type2, bottomControlState2 != bottomControlState3, false, (Color) null, (Color) null, (Color) null, (androidx.compose.p011ui.text.TextStyle) null, (Color) null, false, 2032, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo) | composerStartRestartGroup.changedInstance(appointment);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$28$lambda$27(appointmentsViewerDuxo, appointment);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = BentoButtonState.$stable;
                BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue2, modifierAutoLogEvents$default, (String) null, composerStartRestartGroup, i6, 8);
                Modifier modifierAutoLogEvents$default2 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.CANCEL_APPOINTMENT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, appointment.getCampaignId(), SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED, appointment.getId(), null, 17, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 51, null), false, false, false, true, false, null, 110, null);
                BentoButtonState bentoButtonState2 = new BentoButtonState(StringResources_androidKt.stringResource(C39996R.string.appointments_cta_cancel_appointment, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, type2, bottomControlState2 != bottomControlState3, false, (Color) null, (Color) null, (Color) null, (androidx.compose.p011ui.text.TextStyle) null, (Color) null, false, 2032, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                appointmentsViewerDuxo2 = appointmentsViewerDuxo;
                appointment2 = appointment;
                zChangedInstance3 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo2) | composerStartRestartGroup.changedInstance(appointment2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$30$lambda$29(appointmentsViewerDuxo2, appointment2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.BentoButton(bentoButtonState2, (Function0<Unit>) objRememberedValue3, modifierAutoLogEvents$default2, (String) null, composerStartRestartGroup, i6, 8);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState4 = bottomControlState2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsViewerComposable.BottomControl$lambda$32(appointmentsViewerDuxo2, appointment2, bottomControlState4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_change_policy, composerStartRestartGroup, 0);
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$26$lambda$25(context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(strStringResource3, modifierFillMaxWidth$default2, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, MarkdownStyle.$stable << 6, 8);
                    composerStartRestartGroup = composerStartRestartGroup;
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Modifier modifierAutoLogEvents$default3 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, UserInteractionEventData.Action.RESCHEDULE_APPOINTMENT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, appointment.getCampaignId(), SupportAppointmentSettingContext.AppointmentSchedulingType.RESCHEDULE, appointment.getId(), null, 17, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 51, null), false, false, false, true, false, null, 110, null);
                    String strStringResource22 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_reschedule, composerStartRestartGroup, 0);
                    BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                    AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState bottomControlState32 = AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.ENABLED;
                    bottomControlState2 = bottomControlState;
                    BentoButtonState bentoButtonState3 = new BentoButtonState(strStringResource22, (BentoButtons.Icon.Size16) null, type22, bottomControlState2 != bottomControlState32, false, (Color) null, (Color) null, (Color) null, (androidx.compose.p011ui.text.TextStyle) null, (Color) null, false, 2032, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo) | composerStartRestartGroup.changedInstance(appointment);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$28$lambda$27(appointmentsViewerDuxo, appointment);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        int i62 = BentoButtonState.$stable;
                        BentoButtonKt.BentoButton(bentoButtonState3, (Function0<Unit>) objRememberedValue2, modifierAutoLogEvents$default3, (String) null, composerStartRestartGroup, i62, 8);
                        Modifier modifierAutoLogEvents$default22 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5145paddingqDBjuR0(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, UserInteractionEventData.Action.CANCEL_APPOINTMENT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, appointment.getCampaignId(), SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED, appointment.getId(), null, 17, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 51, null), false, false, false, true, false, null, 110, null);
                        BentoButtonState bentoButtonState22 = new BentoButtonState(StringResources_androidKt.stringResource(C39996R.string.appointments_cta_cancel_appointment, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, type22, bottomControlState2 != bottomControlState32, false, (Color) null, (Color) null, (Color) null, (androidx.compose.p011ui.text.TextStyle) null, (Color) null, false, 2032, (DefaultConstructorMarker) null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        appointmentsViewerDuxo2 = appointmentsViewerDuxo;
                        appointment2 = appointment;
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo2) | composerStartRestartGroup.changedInstance(appointment2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AppointmentsViewerComposable.BottomControl$lambda$31$lambda$30$lambda$29(appointmentsViewerDuxo2, appointment2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.BentoButton(bentoButtonState22, (Function0<Unit>) objRememberedValue3, modifierAutoLogEvents$default22, (String) null, composerStartRestartGroup, i62, 8);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
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
    public static final Unit BottomControl$lambda$31$lambda$26$lambda$25(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils.viewUrl$default(context, url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControl$lambda$31$lambda$28$lambda$27(AppointmentsViewerDuxo appointmentsViewerDuxo, Appointment appointment) {
        appointmentsViewerDuxo.rescheduleAppointment(appointment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomControl$lambda$31$lambda$30$lambda$29(AppointmentsViewerDuxo appointmentsViewerDuxo, Appointment appointment) {
        appointmentsViewerDuxo.requestCancelAppointment(appointment);
        return Unit.INSTANCE;
    }

    private static final void Dialog(final AppointmentsViewerDuxo appointmentsViewerDuxo, final AppointmentsViewerViewState.DialogData dialogData, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(489329530);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(appointmentsViewerDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(dialogData) : composerStartRestartGroup.changedInstance(dialogData) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489329530, i2, -1, "com.robinhood.android.support.appointments.Dialog (AppointmentsViewerComposable.kt:661)");
            }
            if (Intrinsics.areEqual(dialogData, AppointmentsViewerViewState.DialogData.None.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(497162504);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                boolean z = false;
                if (Intrinsics.areEqual(dialogData, AppointmentsViewerViewState.DialogData.Error.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(497241337);
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C11048R.string.general_error_summary, composerStartRestartGroup, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.Dialog$lambda$34$lambda$33(appointmentsViewerDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.Dialog$lambda$36$lambda$35(appointmentsViewerDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(dialogData instanceof AppointmentsViewerViewState.DialogData.CancelAppointment)) {
                        composerStartRestartGroup.startReplaceGroup(2094247946);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(497915711);
                    String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.appointments_cancel_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text("");
                    boolean processing = ((AppointmentsViewerViewState.DialogData.CancelAppointment) dialogData).getProcessing();
                    String strStringResource4 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_cancel_appointment_confirm, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i3 = i2 & 112;
                    boolean zChangedInstance3 = (i3 == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(dialogData))) | composerStartRestartGroup.changedInstance(appointmentsViewerDuxo);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.Dialog$lambda$38$lambda$37(dialogData, appointmentsViewerDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue3, null, null, null, processing, 28, null);
                    String strStringResource5 = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_cancel_appointment_withdraw, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if (i3 == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(dialogData))) {
                        z = true;
                    }
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo) | z;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.Dialog$lambda$40$lambda$39(dialogData, appointmentsViewerDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource5, (Function0) objRememberedValue4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(appointmentsViewerDuxo);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppointmentsViewerComposable.Dialog$lambda$42$lambda$41(appointmentsViewerDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function0 = (Function0) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i5 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource3, text2, bentoAlertButton2, null, bentoAlertButton3, null, false, null, function0, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsViewerComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsViewerComposable.Dialog$lambda$43(appointmentsViewerDuxo, dialogData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$34$lambda$33(AppointmentsViewerDuxo appointmentsViewerDuxo) {
        appointmentsViewerDuxo.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$36$lambda$35(AppointmentsViewerDuxo appointmentsViewerDuxo) {
        appointmentsViewerDuxo.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$38$lambda$37(AppointmentsViewerViewState.DialogData dialogData, AppointmentsViewerDuxo appointmentsViewerDuxo) {
        AppointmentsViewerViewState.DialogData.CancelAppointment cancelAppointment = (AppointmentsViewerViewState.DialogData.CancelAppointment) dialogData;
        if (cancelAppointment.getProcessing()) {
            return Unit.INSTANCE;
        }
        appointmentsViewerDuxo.confirmCancelAppointment(cancelAppointment.getAppointment());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$40$lambda$39(AppointmentsViewerViewState.DialogData dialogData, AppointmentsViewerDuxo appointmentsViewerDuxo) {
        if (((AppointmentsViewerViewState.DialogData.CancelAppointment) dialogData).getProcessing()) {
            return Unit.INSTANCE;
        }
        appointmentsViewerDuxo.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$42$lambda$41(AppointmentsViewerDuxo appointmentsViewerDuxo) {
        appointmentsViewerDuxo.dismissDialog();
        return Unit.INSTANCE;
    }
}
