package com.robinhood.android.support.appointments;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.support.appointments.AppointmentsSchedulerEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.appointments.AppointmentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.appointments.ApiAppointment2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import com.robinhood.models.p355ui.appointments.AppointmentsAvailability;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: AppointmentsSchedulerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 [2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001[BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001a¢\u0006\u0004\b.\u0010(JG\u00108\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u001a2\u0006\u00102\u001a\u000201¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020/¢\u0006\u0004\b<\u0010=J%\u0010B\u001a\u00020A2\u0006\u0010>\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u001a¢\u0006\u0004\bD\u0010(J\r\u0010E\u001a\u00020\u001a¢\u0006\u0004\bE\u0010(J\u0015\u0010G\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001f¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020\u001f¢\u0006\u0004\bN\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;", "stateProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "Landroid/content/res/Resources;", "resources", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "checkEligibilityAndAvailability", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/ZoneId", "zoneId", "", "getTodayIndexOfWeek", "(Lj$/time/ZoneId;)I", "", "Lcom/robinhood/models/ui/appointments/Appointment;", "appointments", "getMostRecentActiveAppointment", "(Ljava/util/List;)Lcom/robinhood/models/ui/appointments/Appointment;", "onCreate", "()V", "", "withTryAgain", "closeAllOnDone", "showGenericErrorDialog", "(ZZ)V", "hideGenericErrorDialog", "Lcom/robinhood/android/support/appointments/SubScreen;", "subScreen", "", "notes", "agentName", "userNumber", "userEmail", "debugScreen$feature_support_externalRelease", "(Lcom/robinhood/android/support/appointments/SubScreen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "debugScreen", "updateNotes", "(Ljava/lang/String;)V", "current", "handleNext", "(Lcom/robinhood/android/support/appointments/SubScreen;)V", "campaignId", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "appointmentSlot", "Lkotlinx/coroutines/Job;", "commitAppointment", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/appointments/AppointmentSlot;)Lkotlinx/coroutines/Job;", "navigateToNoteWriter", "navigateToDatetimePicker", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "focusOnWeek", "(I)V", "weekIndex", "dayOfWeekIndex", "selectDayOfWeek", "(II)V", "timeOfDayIndex", "selectTimeOfDay", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "Landroid/content/res/Resources;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "debugOverride", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerDuxo extends BaseDuxo3<AppointmentsSchedulerDataState, AppointmentsSchedulerViewState, AppointmentsSchedulerEvent> implements HasSavedState {
    private final AppointmentsStore appointmentsStore;
    private final Clock clock;
    private final AtomicBoolean debugOverride;
    private final PhoneNumberFormatter phoneNumberFormatter;
    private final ProfileInfoStore profileStore;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppointmentsSchedulerViewState6.values().length];
            try {
                iArr[AppointmentsSchedulerViewState6.DatetimePicker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppointmentsSchedulerViewState6.NotesWriter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppointmentsSchedulerViewState6.Review.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "checkEligibilityAndAvailability")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$checkEligibilityAndAvailability$1 */
    static final class C287881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C287881(Continuation<? super C287881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsSchedulerDuxo.this.checkEligibilityAndAvailability(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppointmentsSchedulerDuxo(AppointmentsSchedulerStateProvider stateProvider, Clock clock, AppointmentsStore appointmentsStore, UserStore userStore, ProfileInfoStore profileStore, PhoneNumberFormatter phoneNumberFormatter, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        String campaignId = ((AppointmentsSchedulerFragmentKey) companion.getArgs(savedStateHandle)).getCampaignId();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        super(new AppointmentsSchedulerDataState(campaignId, zoneIdSystemDefault, null, null, null, false, false, null, null, null, null, null, null, ((AppointmentsSchedulerFragmentKey) companion.getArgs(savedStateHandle)).getUseCloseNavButton(), 8176, null), stateProvider, duxoBundle);
        this.clock = clock;
        this.appointmentsStore = appointmentsStore;
        this.userStore = userStore;
        this.profileStore = profileStore;
        this.phoneNumberFormatter = phoneNumberFormatter;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.debugOverride = new AtomicBoolean(false);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C287961(null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$onCreate$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$onCreate$1 */
    static final class C287961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C287961(Continuation<? super C287961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287961 c287961 = AppointmentsSchedulerDuxo.this.new C287961(continuation);
            c287961.L$0 = obj;
            return c287961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C287961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AppointmentsSchedulerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$onCreate$1$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AppointmentsSchedulerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = appointmentsSchedulerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppointmentsSchedulerDuxo appointmentsSchedulerDuxo = this.this$0;
                    this.label = 1;
                    if (appointmentsSchedulerDuxo.checkEligibilityAndAvailability(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AppointmentsSchedulerDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void showGenericErrorDialog$default(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        appointmentsSchedulerDuxo.showGenericErrorDialog(z, z2);
    }

    public final void showGenericErrorDialog(boolean withTryAgain, boolean closeAllOnDone) {
        submit(new AppointmentsSchedulerEvent.ShowErrorDialog(withTryAgain, closeAllOnDone));
    }

    public final void hideGenericErrorDialog() {
        submit(AppointmentsSchedulerEvent.HideErrorDialog.INSTANCE);
    }

    public static /* synthetic */ void debugScreen$feature_support_externalRelease$default(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        appointmentsSchedulerDuxo.debugScreen$feature_support_externalRelease(appointmentsSchedulerViewState6, str, str2, str3, str4);
    }

    public final void debugScreen$feature_support_externalRelease(AppointmentsSchedulerViewState6 subScreen, String notes, String agentName, String userNumber, String userEmail) {
        Intrinsics.checkNotNullParameter(subScreen, "subScreen");
        this.debugOverride.set(true);
        applyMutation(new AppointmentsSchedulerDuxo2(userNumber, userEmail, agentName, subScreen, notes, null));
    }

    public final void updateNotes(String notes) {
        Intrinsics.checkNotNullParameter(notes, "notes");
        getSavedStateHandle().set("current_notes", notes);
        applyMutation(new C287991(notes, null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$updateNotes$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$updateNotes$1 */
    static final class C287991 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ String $notes;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287991(String str, Continuation<? super C287991> continuation) {
            super(2, continuation);
            this.$notes = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287991 c287991 = new C287991(this.$notes, continuation);
            c287991.L$0 = obj;
            return c287991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287991) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : this.$notes, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    public final void handleNext(AppointmentsSchedulerViewState6 current) {
        AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6;
        Intrinsics.checkNotNullParameter(current, "current");
        int i = WhenMappings.$EnumSwitchMapping$0[current.ordinal()];
        if (i == 1) {
            appointmentsSchedulerViewState6 = AppointmentsSchedulerViewState6.NotesWriter;
        } else if (i == 2) {
            appointmentsSchedulerViewState6 = AppointmentsSchedulerViewState6.Review;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appointmentsSchedulerViewState6 = null;
        }
        if (appointmentsSchedulerViewState6 == null) {
            return;
        }
        getSavedStateHandle().set("current_screen", Integer.valueOf(appointmentsSchedulerViewState6.getValue()));
        applyMutation(new C287931(appointmentsSchedulerViewState6, null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$handleNext$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$handleNext$1 */
    static final class C287931 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ AppointmentsSchedulerViewState6 $next;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287931(AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Continuation<? super C287931> continuation) {
            super(2, continuation);
            this.$next = appointmentsSchedulerViewState6;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287931 c287931 = new C287931(this.$next, continuation);
            c287931.L$0 = obj;
            return c287931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287931) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : this.$next, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1 */
    static final class C287911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppointmentSlot $appointmentSlot;
        final /* synthetic */ String $campaignId;
        final /* synthetic */ String $notes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287911(String str, String str2, AppointmentSlot appointmentSlot, Continuation<? super C287911> continuation) {
            super(2, continuation);
            this.$campaignId = str;
            this.$notes = str2;
            this.$appointmentSlot = appointmentSlot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppointmentsSchedulerDuxo.this.new C287911(this.$campaignId, this.$notes, this.$appointmentSlot, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C287911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        
            if (r0 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AppointmentsSchedulerDuxo appointmentsSchedulerDuxo;
            AnonymousClass2 anonymousClass2;
            Object objScheduleAppointment;
            Object objRescheduleAppointment;
            Appointment appointment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppointmentsSchedulerDuxo.this.applyMutation(new AnonymousClass1(null));
                    String appointmentId = ((AppointmentsSchedulerFragmentKey) AppointmentsSchedulerDuxo.INSTANCE.getArgs((HasSavedState) AppointmentsSchedulerDuxo.this)).getAppointmentId();
                    if (appointmentId != null) {
                        AppointmentsStore appointmentsStore = AppointmentsSchedulerDuxo.this.appointmentsStore;
                        String str = this.$campaignId;
                        String str2 = this.$notes;
                        AppointmentSlot appointmentSlot = this.$appointmentSlot;
                        this.label = 1;
                        objRescheduleAppointment = appointmentsStore.rescheduleAppointment(appointmentId, str, str2, appointmentSlot, this);
                        if (objRescheduleAppointment == coroutine_suspended) {
                        }
                        appointment = (Appointment) objRescheduleAppointment;
                    } else {
                        AppointmentsStore appointmentsStore2 = AppointmentsSchedulerDuxo.this.appointmentsStore;
                        String str3 = this.$campaignId;
                        String str4 = this.$notes;
                        AppointmentSlot appointmentSlot2 = this.$appointmentSlot;
                        this.label = 2;
                        objScheduleAppointment = appointmentsStore2.scheduleAppointment(str3, str4, appointmentSlot2, this);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objRescheduleAppointment = obj;
                    appointment = (Appointment) objRescheduleAppointment;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objScheduleAppointment = obj;
                    appointment = (Appointment) objScheduleAppointment;
                }
                AppointmentsSchedulerDuxo.this.submit(new AppointmentsSchedulerEvent.ShowScheduledConfirmation(appointment));
                appointmentsSchedulerDuxo = AppointmentsSchedulerDuxo.this;
                anonymousClass2 = new AnonymousClass2(null);
            } catch (Throwable th) {
                try {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    AppointmentsSchedulerDuxo.this.showGenericErrorDialog(true, false);
                    appointmentsSchedulerDuxo = AppointmentsSchedulerDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Throwable th2) {
                    AppointmentsSchedulerDuxo.this.applyMutation(new AnonymousClass2(null));
                    throw th2;
                }
            }
            appointmentsSchedulerDuxo.applyMutation(anonymousClass2);
            return Unit.INSTANCE;
        }

        /* compiled from: AppointmentsSchedulerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
                return ((AnonymousClass1) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
                return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : true, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
            }
        }

        /* compiled from: AppointmentsSchedulerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1$2", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$commitAppointment$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
                return ((AnonymousClass2) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
                return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
            }
        }
    }

    public final Job commitAppointment(String campaignId, String notes, AppointmentSlot appointmentSlot) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(appointmentSlot, "appointmentSlot");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C287911(campaignId, notes, appointmentSlot, null), 3, null);
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$navigateToNoteWriter$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$navigateToNoteWriter$1 */
    static final class C287951 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C287951(Continuation<? super C287951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287951 c287951 = new C287951(continuation);
            c287951.L$0 = obj;
            return c287951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287951) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : AppointmentsSchedulerViewState6.NotesWriter, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    public final void navigateToNoteWriter() {
        applyMutation(new C287951(null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$navigateToDatetimePicker$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$navigateToDatetimePicker$1 */
    static final class C287941 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C287941(Continuation<? super C287941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287941 c287941 = new C287941(continuation);
            c287941.L$0 = obj;
            return c287941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287941) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : AppointmentsSchedulerViewState6.DatetimePicker, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    public final void navigateToDatetimePicker() {
        applyMutation(new C287941(null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$focusOnWeek$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$focusOnWeek$1 */
    static final class C287921 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287921(int i, Continuation<? super C287921> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287921 c287921 = new C287921(this.$index, continuation);
            c287921.L$0 = obj;
            return c287921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287921) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : boxing.boxInt(this.$index), (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    public final void focusOnWeek(int index) {
        applyMutation(new C287921(index, null));
    }

    public final void selectDayOfWeek(int weekIndex, int dayOfWeekIndex) {
        getSavedStateHandle().set("current_week_index", Integer.valueOf(weekIndex));
        getSavedStateHandle().set("current_day_of_week_index", Integer.valueOf(dayOfWeekIndex));
        applyMutation(new C287971(weekIndex, dayOfWeekIndex, null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$selectDayOfWeek$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$selectDayOfWeek$1 */
    static final class C287971 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ int $dayOfWeekIndex;
        final /* synthetic */ int $weekIndex;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287971(int i, int i2, Continuation<? super C287971> continuation) {
            super(2, continuation);
            this.$weekIndex = i;
            this.$dayOfWeekIndex = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287971 c287971 = new C287971(this.$weekIndex, this.$dayOfWeekIndex, continuation);
            c287971.L$0 = obj;
            return c287971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287971) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : boxing.boxInt(this.$weekIndex), (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : boxing.boxInt(this.$dayOfWeekIndex), (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    public final void selectTimeOfDay(int timeOfDayIndex) {
        getSavedStateHandle().set("current_time_of_day_index", Integer.valueOf(timeOfDayIndex));
        applyMutation(new C287981(timeOfDayIndex, null));
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$selectTimeOfDay$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$selectTimeOfDay$1 */
    static final class C287981 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ int $timeOfDayIndex;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287981(int i, Continuation<? super C287981> continuation) {
            super(2, continuation);
            this.$timeOfDayIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287981 c287981 = new C287981(this.$timeOfDayIndex, continuation);
            c287981.L$0 = obj;
            return c287981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287981) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : boxing.boxInt(this.$timeOfDayIndex), (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122 A[Catch: all -> 0x0056, PHI: r0 r2 r6
      0x0122: PHI (r0v18 int) = (r0v15 int), (r0v34 int) binds: [B:47:0x011f, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r2v11 kotlinx.coroutines.channels.BufferOverflow) = (r2v10 kotlinx.coroutines.channels.BufferOverflow), (r2v19 kotlinx.coroutines.channels.BufferOverflow) binds: [B:47:0x011f, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r6v12 java.lang.Object) = (r6v11 java.lang.Object), (r6v23 java.lang.Object) binds: [B:47:0x011f, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0056, blocks: (B:17:0x004c, B:57:0x0179, B:59:0x018a, B:62:0x0199, B:61:0x0196, B:24:0x006a, B:53:0x014e, B:25:0x0071, B:49:0x0122, B:26:0x007a, B:40:0x00de, B:42:0x00e9, B:44:0x00f7, B:46:0x0106, B:27:0x0082, B:33:0x00a9, B:35:0x00b1, B:37:0x00b9, B:30:0x0089), top: B:67:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:17:0x004c, B:57:0x0179, B:59:0x018a, B:62:0x0199, B:61:0x0196, B:24:0x006a, B:53:0x014e, B:25:0x0071, B:49:0x0122, B:26:0x007a, B:40:0x00de, B:42:0x00e9, B:44:0x00f7, B:46:0x0106, B:27:0x0082, B:33:0x00a9, B:35:0x00b1, B:37:0x00b9, B:30:0x0089), top: B:67:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:17:0x004c, B:57:0x0179, B:59:0x018a, B:62:0x0199, B:61:0x0196, B:24:0x006a, B:53:0x014e, B:25:0x0071, B:49:0x0122, B:26:0x007a, B:40:0x00de, B:42:0x00e9, B:44:0x00f7, B:46:0x0106, B:27:0x0082, B:33:0x00a9, B:35:0x00b1, B:37:0x00b9, B:30:0x0089), top: B:67:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkEligibilityAndAvailability(Continuation<? super Unit> continuation) {
        C287881 c287881;
        int i;
        BufferOverflow bufferOverflow;
        Object appointments$default;
        List<Appointment> list;
        Object objFirst;
        String phoneNumber;
        String str;
        Object appointmentsAvailability;
        ZoneId zoneId;
        User user;
        String str2;
        String str3;
        if (continuation instanceof C287881) {
            c287881 = (C287881) continuation;
            int i2 = c287881.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c287881.label = i2 - Integer.MIN_VALUE;
            } else {
                c287881 = new C287881(continuation);
            }
        }
        C287881 c2878812 = c287881;
        Object eligibility = c2878812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2878812.label;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            submit(new AppointmentsSchedulerEvent.ShowErrorDialog(false, true));
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(eligibility);
            applyMutation(new C287892(null));
            AppointmentsStore appointmentsStore = this.appointmentsStore;
            String campaignId = ((AppointmentsSchedulerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCampaignId();
            c2878812.label = 1;
            eligibility = appointmentsStore.getEligibility(campaignId, c2878812);
            if (eligibility == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ResultKt.throwOnFailure(eligibility);
                appointments$default = eligibility;
                i = 2;
                bufferOverflow = null;
                list = (List) appointments$default;
                if (list.isEmpty() && ((AppointmentsSchedulerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAppointmentId() == null) {
                    submit(new AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView(getMostRecentActiveAppointment(list)));
                    return Unit.INSTANCE;
                }
                ProfileInfoStore.refreshProfileInfo$default(this.profileStore, false, 1, bufferOverflow);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.profileStore.streamProfileInfo()), Integer.MAX_VALUE, bufferOverflow, i, bufferOverflow);
                c2878812.label = 3;
                objFirst = FlowKt.first(flowBuffer$default, c2878812);
                if (objFirst == coroutine_suspended) {
                    UiProfileInfo uiProfileInfo = (UiProfileInfo) objFirst;
                    phoneNumber = uiProfileInfo.getPhoneNumber();
                    String displayNumber$default = PhoneNumberFormatter.formatDisplayNumber$default(this.phoneNumberFormatter, uiProfileInfo.getPhoneNumber(), false, i, bufferOverflow);
                    Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, bufferOverflow, i, bufferOverflow);
                    c2878812.L$0 = phoneNumber;
                    c2878812.L$1 = displayNumber$default;
                    c2878812.label = 4;
                    eligibility = FlowKt.first(flowBuffer$default2, c2878812);
                    if (eligibility != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 3) {
                ResultKt.throwOnFailure(eligibility);
                objFirst = eligibility;
                i = 2;
                bufferOverflow = null;
                UiProfileInfo uiProfileInfo2 = (UiProfileInfo) objFirst;
                phoneNumber = uiProfileInfo2.getPhoneNumber();
                String displayNumber$default2 = PhoneNumberFormatter.formatDisplayNumber$default(this.phoneNumberFormatter, uiProfileInfo2.getPhoneNumber(), false, i, bufferOverflow);
                Flow flowBuffer$default22 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, bufferOverflow, i, bufferOverflow);
                c2878812.L$0 = phoneNumber;
                c2878812.L$1 = displayNumber$default2;
                c2878812.label = 4;
                eligibility = FlowKt.first(flowBuffer$default22, c2878812);
                if (eligibility != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = displayNumber$default2;
                User user2 = (User) eligibility;
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                String campaignId2 = ((AppointmentsSchedulerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCampaignId();
                AppointmentsStore appointmentsStore2 = this.appointmentsStore;
                c2878812.L$0 = phoneNumber;
                c2878812.L$1 = str;
                c2878812.L$2 = user2;
                c2878812.L$3 = zoneIdSystemDefault;
                c2878812.label = 5;
                appointmentsAvailability = appointmentsStore2.getAppointmentsAvailability(campaignId2, c2878812);
                if (appointmentsAvailability != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ZoneId zoneId2 = (ZoneId) c2878812.L$3;
                User user3 = (User) c2878812.L$2;
                String str4 = (String) c2878812.L$1;
                String str5 = (String) c2878812.L$0;
                ResultKt.throwOnFailure(eligibility);
                user = user3;
                str2 = str4;
                str3 = str5;
                zoneId = zoneId2;
                AppointmentsAvailability appointmentsAvailability2 = (AppointmentsAvailability) eligibility;
                Integer num = (Integer) getSavedStateHandle().get("current_screen");
                applyMutation(new C287903(appointmentsAvailability2, str2, str3, user, this, zoneId, num == null ? AppointmentsSchedulerViewState6.INSTANCE.fromInt(num.intValue()) : AppointmentsSchedulerViewState6.DatetimePicker, null));
                return Unit.INSTANCE;
            }
            String str6 = (String) c2878812.L$1;
            String str7 = (String) c2878812.L$0;
            ResultKt.throwOnFailure(eligibility);
            phoneNumber = str7;
            str = str6;
            User user22 = (User) eligibility;
            ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
            String campaignId22 = ((AppointmentsSchedulerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCampaignId();
            AppointmentsStore appointmentsStore22 = this.appointmentsStore;
            c2878812.L$0 = phoneNumber;
            c2878812.L$1 = str;
            c2878812.L$2 = user22;
            c2878812.L$3 = zoneIdSystemDefault2;
            c2878812.label = 5;
            appointmentsAvailability = appointmentsStore22.getAppointmentsAvailability(campaignId22, c2878812);
            if (appointmentsAvailability != coroutine_suspended) {
                zoneId = zoneIdSystemDefault2;
                eligibility = appointmentsAvailability;
                user = user22;
                str2 = str;
                str3 = phoneNumber;
                AppointmentsAvailability appointmentsAvailability22 = (AppointmentsAvailability) eligibility;
                Integer num2 = (Integer) getSavedStateHandle().get("current_screen");
                applyMutation(new C287903(appointmentsAvailability22, str2, str3, user, this, zoneId, num2 == null ? AppointmentsSchedulerViewState6.INSTANCE.fromInt(num2.intValue()) : AppointmentsSchedulerViewState6.DatetimePicker, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(eligibility);
        if (!((Boolean) eligibility).booleanValue()) {
            submit(AppointmentsSchedulerEvent.ShowSupportHub.INSTANCE);
            return Unit.INSTANCE;
        }
        AppointmentsStore appointmentsStore3 = this.appointmentsStore;
        String campaignId3 = ((AppointmentsSchedulerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCampaignId();
        c2878812.label = 2;
        i = 2;
        bufferOverflow = null;
        appointments$default = AppointmentsStore.getAppointments$default(appointmentsStore3, campaignId3, false, c2878812, 2, null);
        if (appointments$default != coroutine_suspended) {
            list = (List) appointments$default;
            if (list.isEmpty()) {
            }
            ProfileInfoStore.refreshProfileInfo$default(this.profileStore, false, 1, bufferOverflow);
            Flow flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(this.profileStore.streamProfileInfo()), Integer.MAX_VALUE, bufferOverflow, i, bufferOverflow);
            c2878812.label = 3;
            objFirst = FlowKt.first(flowBuffer$default3, c2878812);
            if (objFirst == coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$checkEligibilityAndAvailability$2", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$checkEligibilityAndAvailability$2 */
    static final class C287892 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C287892(Continuation<? super C287892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287892 c287892 = new C287892(continuation);
            c287892.L$0 = obj;
            return c287892;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287892) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : null, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : null, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : null, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : true, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : null, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : null, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$checkEligibilityAndAvailability$3", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$checkEligibilityAndAvailability$3 */
    static final class C287903 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
        final /* synthetic */ AppointmentsAvailability $availability;
        final /* synthetic */ String $formattedNumber;
        final /* synthetic */ String $number;
        final /* synthetic */ AppointmentsSchedulerViewState6 $startScreen;
        final /* synthetic */ User $user;
        final /* synthetic */ ZoneId $zone;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppointmentsSchedulerDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287903(AppointmentsAvailability appointmentsAvailability, String str, String str2, User user, AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, ZoneId zoneId, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Continuation<? super C287903> continuation) {
            super(2, continuation);
            this.$availability = appointmentsAvailability;
            this.$formattedNumber = str;
            this.$number = str2;
            this.$user = user;
            this.this$0 = appointmentsSchedulerDuxo;
            this.$zone = zoneId;
            this.$startScreen = appointmentsSchedulerViewState6;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287903 c287903 = new C287903(this.$availability, this.$formattedNumber, this.$number, this.$user, this.this$0, this.$zone, this.$startScreen, continuation);
            c287903.L$0 = obj;
            return c287903;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
            return ((C287903) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            int todayIndexOfWeek;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
            ImmutableList3 persistentList = extensions2.toPersistentList(this.$availability.getAppointmentSlots());
            String agentName = this.$availability.getAgentName();
            String str = this.$formattedNumber;
            if (str == null) {
                str = this.$number;
            }
            String str2 = str;
            String email = this.$user.getEmail();
            Integer numBoxInt = (Integer) this.this$0.getSavedStateHandle().get("current_week_index");
            if (numBoxInt == null) {
                numBoxInt = boxing.boxInt(0);
            }
            Integer num = numBoxInt;
            Integer num2 = (Integer) this.this$0.getSavedStateHandle().get("current_day_of_week_index");
            if (num2 != null) {
                todayIndexOfWeek = num2.intValue();
            } else {
                AppointmentsSchedulerDuxo appointmentsSchedulerDuxo = this.this$0;
                ZoneId zoneId = this.$zone;
                Intrinsics.checkNotNull(zoneId);
                todayIndexOfWeek = appointmentsSchedulerDuxo.getTodayIndexOfWeek(zoneId);
            }
            return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : str2, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : email, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : agentName, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : persistentList, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : this.$startScreen, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : num, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : boxing.boxInt(todayIndexOfWeek), (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : (Integer) this.this$0.getSavedStateHandle().get("current_time_of_day_index"), (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : (String) this.this$0.getSavedStateHandle().get("current_notes"), (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTodayIndexOfWeek(ZoneId zoneId) {
        return RangesKt.coerceIn(Instant.now(this.clock).atZone(zoneId).mo3459a().getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue(), 0, 4);
    }

    private final Appointment getMostRecentActiveAppointment(List<Appointment> appointments) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : appointments) {
            if (((Appointment) obj2).getStatus() == ApiAppointment2.SCHEDULED) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Instant startTime = ((Appointment) next).getStartTime();
                do {
                    Object next2 = it.next();
                    Instant startTime2 = ((Appointment) next2).getStartTime();
                    if (startTime.compareTo(startTime2) < 0) {
                        next = next2;
                        startTime = startTime2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Appointment appointment = (Appointment) obj;
        if (appointment != null) {
            return appointment;
        }
        throw new IllegalStateException("Expected at least one appointment in the list");
    }

    /* compiled from: AppointmentsSchedulerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AppointmentsSchedulerDuxo, AppointmentsSchedulerFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AppointmentsSchedulerFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AppointmentsSchedulerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AppointmentsSchedulerFragmentKey getArgs(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo) {
            return (AppointmentsSchedulerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, appointmentsSchedulerDuxo);
        }
    }
}
