package com.robinhood.android.securitycenter.p251ui.devices;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.securitycenter.p251ui.devices.DeviceDetailsDuxo;
import com.robinhood.android.securitycenter.p251ui.devices.DeviceDetailsFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeviceDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "trustedDeviceStore", "Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "removeDevice", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DeviceDetailsDuxo extends OldBaseDuxo<DeviceDetailsViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final TrustedDeviceStore trustedDeviceStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceDetailsDuxo(TrustedDeviceStore trustedDeviceStore, SavedStateHandle savedStateHandle) {
        super(new DeviceDetailsViewState(null, false, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(trustedDeviceStore, "trustedDeviceStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.trustedDeviceStore = trustedDeviceStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.trustedDeviceStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.trustedDeviceStore.stream(((DeviceDetailsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDeviceId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.onStart$lambda$1(this.f$0, (TrustedDevice) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DeviceDetailsDuxo deviceDetailsDuxo, final TrustedDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        deviceDetailsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.onStart$lambda$1$lambda$0(device, (DeviceDetailsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDetailsViewState onStart$lambda$1$lambda$0(TrustedDevice trustedDevice, DeviceDetailsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeviceDetailsViewState.copy$default(applyMutation, trustedDevice, false, null, null, 14, null);
    }

    /* compiled from: DeviceDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/TrustedDevice;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$1", m3645f = "DeviceDetailsDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$1 */
    static final class C282371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super TrustedDevice>, Object> {
        int label;

        C282371(Continuation<? super C282371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceDetailsDuxo.this.new C282371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TrustedDevice> continuation) {
            return ((C282371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TrustedDeviceStore trustedDeviceStore = DeviceDetailsDuxo.this.trustedDeviceStore;
            UUID deviceId = ((DeviceDetailsFragment.Args) DeviceDetailsDuxo.INSTANCE.getArgs((HasSavedState) DeviceDetailsDuxo.this)).getDeviceId();
            this.label = 1;
            Object objReport = trustedDeviceStore.report(deviceId, this);
            return objReport == coroutine_suspended ? coroutine_suspended : objReport;
        }
    }

    public final void removeDevice() {
        Observable observableDoOnTerminate = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282371(null), 1, null).toObservable().doOnSubscribe(new C282382()).doOnTerminate(new C282393());
        Intrinsics.checkNotNullExpressionValue(observableDoOnTerminate, "doOnTerminate(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservableDelay2.minTimeInFlight$default(observableDoOnTerminate, 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.removeDevice$lambda$3(this.f$0, (TrustedDevice) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.removeDevice$lambda$5(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: DeviceDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$2 */
    static final class C282382<T> implements Consumer {
        C282382() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeviceDetailsViewState accept$lambda$0(DeviceDetailsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DeviceDetailsViewState.copy$default(applyMutation, null, true, null, null, 13, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DeviceDetailsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceDetailsDuxo.C282382.accept$lambda$0((DeviceDetailsViewState) obj);
                }
            });
        }
    }

    /* compiled from: DeviceDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$3 */
    static final class C282393 implements Action {
        C282393() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeviceDetailsViewState run$lambda$0(DeviceDetailsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DeviceDetailsViewState.copy$default(applyMutation, null, false, null, null, 13, null);
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            DeviceDetailsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$removeDevice$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceDetailsDuxo.C282393.run$lambda$0((DeviceDetailsViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeDevice$lambda$3(DeviceDetailsDuxo deviceDetailsDuxo, TrustedDevice trustedDevice) {
        deviceDetailsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.removeDevice$lambda$3$lambda$2((DeviceDetailsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDetailsViewState removeDevice$lambda$3$lambda$2(DeviceDetailsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeviceDetailsViewState.copy$default(applyMutation, null, false, new UiEvent(Unit.INSTANCE), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeDevice$lambda$5(DeviceDetailsDuxo deviceDetailsDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deviceDetailsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceDetailsDuxo.removeDevice$lambda$5$lambda$4(it, (DeviceDetailsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDetailsViewState removeDevice$lambda$5$lambda$4(Throwable th, DeviceDetailsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DeviceDetailsViewState.copy$default(applyMutation, null, false, null, new UiEvent(th), 7, null);
    }

    /* compiled from: DeviceDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsDuxo;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DeviceDetailsDuxo, DeviceDetailsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeviceDetailsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DeviceDetailsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeviceDetailsFragment.Args getArgs(DeviceDetailsDuxo deviceDetailsDuxo) {
            return (DeviceDetailsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, deviceDetailsDuxo);
        }
    }
}
