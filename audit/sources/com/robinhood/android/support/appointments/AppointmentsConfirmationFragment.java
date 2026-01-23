package com.robinhood.android.support.appointments;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.support.appointments.AppointmentsConfirmationFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AppointmentsConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\fH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "getLoggingScreen", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AppointmentsConfirmationFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AppointmentsConfirmationFragment appointmentsConfirmationFragment, int i, Composer composer, int i2) {
        appointmentsConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return getLoggingScreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        SupportAppointmentSettingContext.AppointmentSchedulingType appointmentSchedulingType;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1054014296);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1054014296, i2, -1, "com.robinhood.android.support.appointments.AppointmentsConfirmationFragment.ComposeContent (AppointmentsConfirmationFragment.kt:48)");
            }
            Screen eventScreen = getEventScreen();
            Companion companion = INSTANCE;
            String id = ((AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this)).getAppointment().getId();
            String campaignId = ((AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this)).getAppointment().getCampaignId();
            AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey = (AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this);
            if ((appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Cancelled) || (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView)) {
                appointmentSchedulingType = SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
            } else if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
                appointmentSchedulingType = SupportAppointmentSettingContext.AppointmentSchedulingType.SCHEDULE;
            } else {
                if (!(appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Rescheduled)) {
                    throw new NoWhenBranchMatchedException();
                }
                appointmentSchedulingType = SupportAppointmentSettingContext.AppointmentSchedulingType.RESCHEDULE;
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SupportAppointmentSettingContext(null, campaignId, appointmentSchedulingType, id, null, 17, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -524289, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1678993939, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsConfirmationFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1678993939, i3, -1, "com.robinhood.android.support.appointments.AppointmentsConfirmationFragment.ComposeContent.<anonymous> (AppointmentsConfirmationFragment.kt:67)");
                    }
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1199167141, true, new AnonymousClass1(AppointmentsConfirmationFragment.this), composer2, 54), composer2, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AppointmentsConfirmationFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.appointments.AppointmentsConfirmationFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AppointmentsConfirmationFragment this$0;

                    AnonymousClass1(AppointmentsConfirmationFragment appointmentsConfirmationFragment) {
                        this.this$0 = appointmentsConfirmationFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        Painter painterPainterResource;
                        String strStringResource;
                        String strStringResource2;
                        String strStringResource3;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199167141, i, -1, "com.robinhood.android.support.appointments.AppointmentsConfirmationFragment.ComposeContent.<anonymous>.<anonymous> (AppointmentsConfirmationFragment.kt:71)");
                        }
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        Companion companion = AppointmentsConfirmationFragment.INSTANCE;
                        ZonedDateTime zonedDateTimeAtZone = ((AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0)).getAppointment().getStartTime().atZone(zoneIdSystemDefault);
                        Locale locale = Locale.ENGLISH;
                        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE, MMMM d", locale);
                        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h:mm a", locale);
                        DateTimeFormatter dateTimeFormatterOfPattern3 = DateTimeFormatter.ofPattern("zz", locale);
                        String str = dateTimeFormatterOfPattern.format(zonedDateTimeAtZone);
                        String str2 = dateTimeFormatterOfPattern2.format(zonedDateTimeAtZone);
                        String string2 = dateTimeFormatterOfPattern3.format(zonedDateTimeAtZone);
                        if (string2.length() > 2) {
                            Intrinsics.checkNotNull(string2);
                            char cFirst = StringsKt.first(string2);
                            char cLast = StringsKt.last(string2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(cFirst);
                            sb.append(cLast);
                            string2 = sb.toString();
                        }
                        String str3 = str + " at " + str2 + PlaceholderUtils.XXShortPlaceholderText + string2;
                        AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey = (AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0);
                        if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
                            composer.startReplaceGroup(-1348354661);
                            painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_appointments_scheduled, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView) {
                            composer.startReplaceGroup(-1348350981);
                            painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_appointments_scheduled, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Rescheduled) {
                            composer.startReplaceGroup(-1348347685);
                            painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_appointments_scheduled, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Cancelled)) {
                                composer.startReplaceGroup(-1348355874);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1348344453);
                            painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_appointments_cancelled, composer, 0);
                            composer.endReplaceGroup();
                        }
                        AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey2 = (AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0);
                        if (appointmentsConfirmationFragmentKey2 instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
                            composer.startReplaceGroup(-1348339293);
                            strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_scheduled_title, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey2 instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView) {
                            composer.startReplaceGroup(-1348335360);
                            strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_booked_title, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey2 instanceof AppointmentsConfirmationFragmentKey.Rescheduled) {
                            composer.startReplaceGroup(-1348331899);
                            strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_rescheduled_title, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(appointmentsConfirmationFragmentKey2 instanceof AppointmentsConfirmationFragmentKey.Cancelled)) {
                                composer.startReplaceGroup(-1348340483);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1348328349);
                            strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_cancelled_title, composer, 0);
                            composer.endReplaceGroup();
                        }
                        AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey3 = (AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0);
                        if (appointmentsConfirmationFragmentKey3 instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
                            composer.startReplaceGroup(-1348322828);
                            strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_scheduled_subtitle, new Object[]{str3}, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey3 instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView) {
                            composer.startReplaceGroup(-1348318365);
                            strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_booked_subtitle, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey3 instanceof AppointmentsConfirmationFragmentKey.Rescheduled) {
                            composer.startReplaceGroup(-1348314794);
                            strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_rescheduled_subtitle, new Object[]{str3}, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(appointmentsConfirmationFragmentKey3 instanceof AppointmentsConfirmationFragmentKey.Cancelled)) {
                                composer.startReplaceGroup(-1348323995);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1348310714);
                            strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_cancelled_subtitle, composer, 0);
                            composer.endReplaceGroup();
                        }
                        AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey4 = (AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0);
                        if (appointmentsConfirmationFragmentKey4 instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
                            composer.startReplaceGroup(-1348305300);
                            strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey4 instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView) {
                            composer.startReplaceGroup(-1348302082);
                            strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.appointments_viewer_appointment_booked_cta, composer, 0);
                            composer.endReplaceGroup();
                        } else if (appointmentsConfirmationFragmentKey4 instanceof AppointmentsConfirmationFragmentKey.Rescheduled) {
                            composer.startReplaceGroup(-1348298708);
                            strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(appointmentsConfirmationFragmentKey4 instanceof AppointmentsConfirmationFragmentKey.Cancelled)) {
                                composer.startReplaceGroup(-1348306540);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1348295956);
                            strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                            composer.endReplaceGroup();
                        }
                        Appointment appointment = ((AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0)).getAppointment();
                        boolean z = companion.getArgs((Fragment) this.this$0) instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AppointmentsConfirmationFragment appointmentsConfirmationFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsConfirmationFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AppointmentsConfirmationFragment.C287791.AnonymousClass1.invoke$lambda$1$lambda$0(appointmentsConfirmationFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        AppointmentsConfirmationComposable.AppointmentsConfirmationComposable(appointment, painterPainterResource, strStringResource, strStringResource2, strStringResource3, z, (Function0) objRememberedValue, ((AppointmentsConfirmationFragmentKey) companion.getArgs((Fragment) this.this$0)).getSource(), null, composer, 0, 256);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AppointmentsConfirmationFragment appointmentsConfirmationFragment) {
                        appointmentsConfirmationFragment.requireActivity().finish();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsConfirmationFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final Screen getLoggingScreen() {
        AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey = (AppointmentsConfirmationFragmentKey) INSTANCE.getArgs((Fragment) this);
        if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Cancelled) {
            return new Screen(Screen.Name.CX_APPOINTMENT_CANCEL_CONFIRMATION, null, null, null, 14, null);
        }
        if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Scheduled) {
            return new Screen(Screen.Name.CX_APPOINTMENT_CONFIRMATION, null, null, null, 14, null);
        }
        if (appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.ScheduledRedirectToView) {
            return new Screen(Screen.Name.CX_APPOINTMENT_ALREADY_BOOKED, null, null, null, 14, null);
        }
        if (!(appointmentsConfirmationFragmentKey instanceof AppointmentsConfirmationFragmentKey.Rescheduled)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Screen(Screen.Name.CX_APPOINTMENT_CONFIRMATION, null, null, null, 14, null);
    }

    /* compiled from: AppointmentsConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsConfirmationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/appointments/AppointmentsConfirmationFragment;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AppointmentsConfirmationFragment, AppointmentsConfirmationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, appointmentsConfirmationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AppointmentsConfirmationFragmentKey getArgs(AppointmentsConfirmationFragment appointmentsConfirmationFragment) {
            return (AppointmentsConfirmationFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, appointmentsConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AppointmentsConfirmationFragment newInstance(AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey) {
            return (AppointmentsConfirmationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, appointmentsConfirmationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AppointmentsConfirmationFragment appointmentsConfirmationFragment, AppointmentsConfirmationFragmentKey appointmentsConfirmationFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, appointmentsConfirmationFragment, appointmentsConfirmationFragmentKey);
        }
    }
}
