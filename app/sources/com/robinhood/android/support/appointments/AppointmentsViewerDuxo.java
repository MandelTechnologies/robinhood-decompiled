package com.robinhood.android.support.appointments;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.support.appointments.AppointmentsViewerEvent;
import com.robinhood.android.support.appointments.AppointmentsViewerViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.appointments.AppointmentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.support.contracts.AppointmentsViewerFragmentKey;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AppointmentsViewerDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001/B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\"J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0013¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "appointmentsStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileStore", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "fetchInitialData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Duration", "duration", "pollAppointment", "(Lj$/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/ui/appointments/Appointment;", "appointment", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "getBottomState", "(Lcom/robinhood/models/ui/appointments/Appointment;)Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "onCreate", "()V", "rescheduleAppointment", "(Lcom/robinhood/models/ui/appointments/Appointment;)V", "requestCancelAppointment", "Lkotlinx/coroutines/Job;", "confirmCancelAppointment", "(Lcom/robinhood/models/ui/appointments/Appointment;)Lkotlinx/coroutines/Job;", "dismissDialog", "Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AppointmentsViewerDuxo extends BaseDuxo5<AppointmentsViewerViewState, AppointmentsViewerEvent> implements HasSavedState {
    private final AppointmentsStore appointmentsStore;
    private final Clock clock;
    private final PhoneNumberFormatter phoneNumberFormatter;
    private final ProfileInfoStore profileStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {120, 123}, m3647m = "fetchInitialData")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$fetchInitialData$1 */
    static final class C288601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C288601(Continuation<? super C288601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsViewerDuxo.this.fetchInitialData(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppointmentsViewerDuxo(AppointmentsStore appointmentsStore, ProfileInfoStore profileStore, PhoneNumberFormatter phoneNumberFormatter, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new AppointmentsViewerViewState(AppointmentsViewerViewState.LoadingState.Loading.INSTANCE, ((AppointmentsViewerFragmentKey) INSTANCE.getArgs(savedStateHandle)).getAppointmentId(), null, null, 12, null), duxoBundle);
        Intrinsics.checkNotNullParameter(appointmentsStore, "appointmentsStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appointmentsStore = appointmentsStore;
        this.profileStore = profileStore;
        this.phoneNumberFormatter = phoneNumberFormatter;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C288631(null));
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$onCreate$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$onCreate$1 */
    static final class C288631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288631(Continuation<? super C288631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288631 c288631 = AppointmentsViewerDuxo.this.new C288631(continuation);
            c288631.L$0 = obj;
            return c288631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C288631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AppointmentsViewerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$onCreate$1$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {49, 50, 52}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AppointmentsViewerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AppointmentsViewerDuxo appointmentsViewerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = appointmentsViewerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
            
                if (r9.pollAppointment(r1, r8) != r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppointmentsViewerDuxo appointmentsViewerDuxo = this.this$0;
                    this.label = 1;
                    if (appointmentsViewerDuxo.fetchInitialData(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    AppointmentsViewerDuxo appointmentsViewerDuxo2 = this.this$0;
                    Duration durationOfSeconds = Duration.ofSeconds(30L);
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                    this.label = 3;
                }
                Duration durationOfSeconds2 = Duration.ofSeconds(30L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
                this.label = 2;
                if (Time4.delay(durationOfSeconds2, this) != coroutine_suspended) {
                    AppointmentsViewerDuxo appointmentsViewerDuxo22 = this.this$0;
                    Duration durationOfSeconds3 = Duration.ofSeconds(30L);
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
                    this.label = 3;
                }
                return coroutine_suspended;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AppointmentsViewerDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void rescheduleAppointment(Appointment appointment) {
        Intrinsics.checkNotNullParameter(appointment, "appointment");
        submit(new AppointmentsViewerEvent.RescheduleAppointment(appointment));
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$requestCancelAppointment$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$requestCancelAppointment$1 */
    static final class C288651 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
        final /* synthetic */ Appointment $appointment;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C288651(Appointment appointment, Continuation<? super C288651> continuation) {
            super(2, continuation);
            this.$appointment = appointment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288651 c288651 = new C288651(this.$appointment, continuation);
            c288651.L$0 = obj;
            return c288651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
            return ((C288651) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AppointmentsViewerViewState.copy$default((AppointmentsViewerViewState) this.L$0, null, null, null, new AppointmentsViewerViewState.DialogData.CancelAppointment(this.$appointment, false), 7, null);
        }
    }

    public final void requestCancelAppointment(Appointment appointment) {
        Intrinsics.checkNotNullParameter(appointment, "appointment");
        applyMutation(new C288651(appointment, null));
        submit(AppointmentsViewerEvent.ShowDialog.INSTANCE);
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1 */
    static final class C288591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Appointment $appointment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C288591(Appointment appointment, Continuation<? super C288591> continuation) {
            super(2, continuation);
            this.$appointment = appointment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppointmentsViewerDuxo.this.new C288591(this.$appointment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C288591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AppointmentsViewerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
            final /* synthetic */ Appointment $appointment;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Appointment appointment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$appointment = appointment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appointment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
                return ((AnonymousClass1) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AppointmentsViewerViewState.copy$default((AppointmentsViewerViewState) this.L$0, null, null, null, new AppointmentsViewerViewState.DialogData.CancelAppointment(this.$appointment, true), 7, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppointmentsViewerDuxo.this.applyMutation(new AnonymousClass1(this.$appointment, null));
                    AppointmentsStore appointmentsStore = AppointmentsViewerDuxo.this.appointmentsStore;
                    String id = this.$appointment.getId();
                    this.label = 1;
                    if (appointmentsStore.cancelAppointment(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AppointmentsViewerDuxo.this.submit(AppointmentsViewerEvent.HideDialog.INSTANCE);
                AppointmentsViewerDuxo.this.submit(new AppointmentsViewerEvent.ShowCancellationCompleted(this.$appointment));
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                AppointmentsViewerDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AppointmentsViewerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1$2", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$confirmCancelAppointment$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
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
            public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
                return ((AnonymousClass2) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AppointmentsViewerViewState.copy$default((AppointmentsViewerViewState) this.L$0, null, null, null, AppointmentsViewerViewState.DialogData.Error.INSTANCE, 7, null);
            }
        }
    }

    public final Job confirmCancelAppointment(Appointment appointment) {
        Intrinsics.checkNotNullParameter(appointment, "appointment");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C288591(appointment, null), 3, null);
    }

    public final void dismissDialog() {
        submit(AppointmentsViewerEvent.HideDialog.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInitialData(Continuation<? super Unit> continuation) {
        C288601 c288601;
        Throwable th;
        Appointment appointment;
        if (continuation instanceof C288601) {
            c288601 = (C288601) continuation;
            int i = c288601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c288601.label = i - Integer.MIN_VALUE;
            } else {
                c288601 = new C288601(continuation);
            }
        }
        Object objFetchAppointment = c288601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c288601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchAppointment);
            String appointmentId = ((AppointmentsViewerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAppointmentId();
            try {
                AppointmentsStore appointmentsStore = this.appointmentsStore;
                c288601.label = 1;
                objFetchAppointment = appointmentsStore.fetchAppointment(appointmentId, c288601);
                if (objFetchAppointment == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                applyMutation(new C288623(null));
                submit(AppointmentsViewerEvent.ShowDialog.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            applyMutation(new C288623(null));
            submit(AppointmentsViewerEvent.ShowDialog.INSTANCE);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Appointment appointment2 = (Appointment) c288601.L$0;
            ResultKt.throwOnFailure(objFetchAppointment);
            appointment = appointment2;
            UiProfileInfo uiProfileInfo = (UiProfileInfo) objFetchAppointment;
            try {
                applyMutation(new C288612(appointment, this, PhoneNumberFormatter.formatDisplayNumber$default(this.phoneNumberFormatter, uiProfileInfo.getPhoneNumber(), false, 2, null), uiProfileInfo.getPhoneNumber(), null));
            } catch (Throwable th4) {
                th = th4;
                th = th;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                applyMutation(new C288623(null));
                submit(AppointmentsViewerEvent.ShowDialog.INSTANCE);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFetchAppointment);
        Appointment appointment3 = (Appointment) objFetchAppointment;
        ProfileInfoStore.refreshProfileInfo$default(this.profileStore, false, 1, null);
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.profileStore.streamProfileInfo()), Integer.MAX_VALUE, null, 2, null);
        c288601.L$0 = appointment3;
        c288601.label = 2;
        Object objFirst = FlowKt.first(flowBuffer$default, c288601);
        if (objFirst != coroutine_suspended) {
            appointment = appointment3;
            objFetchAppointment = objFirst;
            UiProfileInfo uiProfileInfo2 = (UiProfileInfo) objFetchAppointment;
            applyMutation(new C288612(appointment, this, PhoneNumberFormatter.formatDisplayNumber$default(this.phoneNumberFormatter, uiProfileInfo2.getPhoneNumber(), false, 2, null), uiProfileInfo2.getPhoneNumber(), null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$fetchInitialData$2", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$fetchInitialData$2 */
    static final class C288612 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
        final /* synthetic */ Appointment $appointment;
        final /* synthetic */ String $formattedNumber;
        final /* synthetic */ String $number;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppointmentsViewerDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C288612(Appointment appointment, AppointmentsViewerDuxo appointmentsViewerDuxo, String str, String str2, Continuation<? super C288612> continuation) {
            super(2, continuation);
            this.$appointment = appointment;
            this.this$0 = appointmentsViewerDuxo;
            this.$formattedNumber = str;
            this.$number = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288612 c288612 = new C288612(this.$appointment, this.this$0, this.$formattedNumber, this.$number, continuation);
            c288612.L$0 = obj;
            return c288612;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
            return ((C288612) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppointmentsViewerViewState appointmentsViewerViewState = (AppointmentsViewerViewState) this.L$0;
            Appointment appointment = this.$appointment;
            AppointmentsViewerViewState.LoadingState.Loaded loaded = new AppointmentsViewerViewState.LoadingState.Loaded(appointment, this.this$0.getBottomState(appointment));
            String str = this.$formattedNumber;
            if (str == null) {
                str = this.$number;
            }
            return AppointmentsViewerViewState.copy$default(appointmentsViewerViewState, loaded, null, str, null, 10, null);
        }
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$fetchInitialData$3", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$fetchInitialData$3 */
    static final class C288623 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288623(Continuation<? super C288623> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288623 c288623 = new C288623(continuation);
            c288623.L$0 = obj;
            return c288623;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
            return ((C288623) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AppointmentsViewerViewState.copy$default((AppointmentsViewerViewState) this.L$0, null, null, null, AppointmentsViewerViewState.DialogData.Error.INSTANCE, 7, null);
        }
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$pollAppointment$2", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$pollAppointment$2 */
    static final class C288642 extends ContinuationImpl7 implements Function2<Appointment, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C288642(Continuation<? super C288642> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288642 c288642 = AppointmentsViewerDuxo.this.new C288642(continuation);
            c288642.L$0 = obj;
            return c288642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Appointment appointment, Continuation<? super Unit> continuation) {
            return ((C288642) create(appointment, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AppointmentsViewerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsViewerDuxo$pollAppointment$2$1", m3645f = "AppointmentsViewerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.appointments.AppointmentsViewerDuxo$pollAppointment$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AppointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState>, Object> {
            final /* synthetic */ Appointment $appointment;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AppointmentsViewerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Appointment appointment, AppointmentsViewerDuxo appointmentsViewerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$appointment = appointment;
                this.this$0 = appointmentsViewerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appointment, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppointmentsViewerViewState appointmentsViewerViewState, Continuation<? super AppointmentsViewerViewState> continuation) {
                return ((AnonymousClass1) create(appointmentsViewerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AppointmentsViewerViewState appointmentsViewerViewState = (AppointmentsViewerViewState) this.L$0;
                Appointment appointment = this.$appointment;
                return AppointmentsViewerViewState.copy$default(appointmentsViewerViewState, new AppointmentsViewerViewState.LoadingState.Loaded(appointment, this.this$0.getBottomState(appointment)), null, null, null, 14, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Appointment appointment = (Appointment) this.L$0;
            AppointmentsViewerDuxo appointmentsViewerDuxo = AppointmentsViewerDuxo.this;
            appointmentsViewerDuxo.applyMutation(new AnonymousClass1(appointment, appointmentsViewerDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pollAppointment(Duration duration, Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.appointmentsStore.pollAppointment(((AppointmentsViewerFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAppointmentId(), duration), new C288642(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState getBottomState(Appointment appointment) {
        if (!appointment.isActive()) {
            return AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.HIDDEN;
        }
        if (this.clock.instant().compareTo(appointment.getStartTime().minusSeconds(900L)) >= 0) {
            return AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.DISABLED;
        }
        return AppointmentsViewerViewState.LoadingState.Loaded.BottomControlState.ENABLED;
    }

    /* compiled from: AppointmentsViewerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerDuxo;", "Lcom/robinhood/shared/support/contracts/AppointmentsViewerFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AppointmentsViewerDuxo, AppointmentsViewerFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AppointmentsViewerFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AppointmentsViewerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AppointmentsViewerFragmentKey getArgs(AppointmentsViewerDuxo appointmentsViewerDuxo) {
            return (AppointmentsViewerFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, appointmentsViewerDuxo);
        }
    }
}
