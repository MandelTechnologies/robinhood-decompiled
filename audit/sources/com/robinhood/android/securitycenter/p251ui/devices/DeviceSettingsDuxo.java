package com.robinhood.android.securitycenter.p251ui.devices;

import com.robinhood.android.securitycenter.p251ui.devices.DeviceSettingsDuxo3;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeviceSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsEvent;", "trustedDeviceStore", "Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onStart", "removeDevices", "refreshDevices", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DeviceSettingsDuxo extends BaseDuxo5<DeviceSettingsViewState, DeviceSettingsDuxo3> {
    public static final int $stable = 8;
    private final TrustedDeviceStore trustedDeviceStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsDuxo(TrustedDeviceStore trustedDeviceStore, DuxoBundle duxoBundle) {
        super(new DeviceSettingsViewState(null, false, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(trustedDeviceStore, "trustedDeviceStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.trustedDeviceStore = trustedDeviceStore;
    }

    /* compiled from: DeviceSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onCreate$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onCreate$1 */
    static final class C282461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C282461(Continuation<? super C282461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceSettingsDuxo.this.new C282461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrustedDeviceStore trustedDeviceStore = DeviceSettingsDuxo.this.trustedDeviceStore;
                this.label = 1;
                obj = trustedDeviceStore.isRemoveDevicesDisabled(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceSettingsDuxo.this.applyMutation(new AnonymousClass1(!((Boolean) obj).booleanValue(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: DeviceSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onCreate$1$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceSettingsViewState, Continuation<? super DeviceSettingsViewState>, Object> {
            final /* synthetic */ boolean $isRemoveDevicesEnabled;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isRemoveDevicesEnabled = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRemoveDevicesEnabled, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DeviceSettingsViewState deviceSettingsViewState, Continuation<? super DeviceSettingsViewState> continuation) {
                return ((AnonymousClass1) create(deviceSettingsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeviceSettingsViewState.copy$default((DeviceSettingsViewState) this.L$0, null, false, this.$isRemoveDevicesEnabled, 3, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C282461(null), 3, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        TrustedDeviceStore.refresh$default(this.trustedDeviceStore, false, 1, null);
        Observable<List<TrustedDevice>> observableDistinctUntilChanged = this.trustedDeviceStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceSettingsDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DeviceSettingsDuxo deviceSettingsDuxo, List list) {
        deviceSettingsDuxo.applyMutation(new DeviceSettingsDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DeviceSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$1 */
    static final class C282471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C282471(Continuation<? super C282471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceSettingsDuxo.this.new C282471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrustedDeviceStore trustedDeviceStore = DeviceSettingsDuxo.this.trustedDeviceStore;
                this.label = 1;
                if (trustedDeviceStore.removeDevices(this) == coroutine_suspended) {
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

    public final void removeDevices() {
        Completable completableDoOnTerminate = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C282471(null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo.removeDevices.2

            /* compiled from: DeviceSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$2$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceSettingsViewState, Continuation<? super DeviceSettingsViewState>, Object> {
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
                public final Object invoke(DeviceSettingsViewState deviceSettingsViewState, Continuation<? super DeviceSettingsViewState> continuation) {
                    return ((AnonymousClass1) create(deviceSettingsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DeviceSettingsViewState.copy$default((DeviceSettingsViewState) this.L$0, null, true, false, 5, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                DeviceSettingsDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doOnTerminate(new Action() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo.removeDevices.3

            /* compiled from: DeviceSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$3$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$removeDevices$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeviceSettingsViewState, Continuation<? super DeviceSettingsViewState>, Object> {
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
                public final Object invoke(DeviceSettingsViewState deviceSettingsViewState, Continuation<? super DeviceSettingsViewState> continuation) {
                    return ((AnonymousClass1) create(deviceSettingsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DeviceSettingsViewState.copy$default((DeviceSettingsViewState) this.L$0, null, false, false, 5, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                DeviceSettingsDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnTerminate, "doOnTerminate(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSettingsDuxo.removeDevices$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceSettingsDuxo.removeDevices$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeDevices$lambda$1(DeviceSettingsDuxo deviceSettingsDuxo) {
        deviceSettingsDuxo.refreshDevices();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeDevices$lambda$2(DeviceSettingsDuxo deviceSettingsDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        deviceSettingsDuxo.submit(new DeviceSettingsDuxo3.DeviceRemovalFailure(throwable));
        return Unit.INSTANCE;
    }

    private final void refreshDevices() {
        this.trustedDeviceStore.refresh(true);
    }
}
