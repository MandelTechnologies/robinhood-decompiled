package com.robinhood.android.securitycenter.p251ui.devices;

import com.robinhood.models.p320db.TrustedDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onStart$1$1", m3645f = "DeviceSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class DeviceSettingsDuxo2 extends ContinuationImpl7 implements Function2<DeviceSettingsViewState, Continuation<? super DeviceSettingsViewState>, Object> {
    final /* synthetic */ List<TrustedDevice> $devices;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSettingsDuxo2(List<TrustedDevice> list, Continuation<? super DeviceSettingsDuxo2> continuation) {
        super(2, continuation);
        this.$devices = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeviceSettingsDuxo2 deviceSettingsDuxo2 = new DeviceSettingsDuxo2(this.$devices, continuation);
        deviceSettingsDuxo2.L$0 = obj;
        return deviceSettingsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeviceSettingsViewState deviceSettingsViewState, Continuation<? super DeviceSettingsViewState> continuation) {
        return ((DeviceSettingsDuxo2) create(deviceSettingsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DeviceSettingsViewState deviceSettingsViewState = (DeviceSettingsViewState) this.L$0;
        List<TrustedDevice> list = this.$devices;
        Intrinsics.checkNotNull(list);
        return DeviceSettingsViewState.copy$default(deviceSettingsViewState, list, false, false, 6, null);
    }
}
