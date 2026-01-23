package com.salesforce.android.smi.remote.internal.api.rest.interceptors;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.salesforce.android.smi.remote.internal.dto.request.RegisterDeviceRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeviceRegistrationInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.interceptors.DeviceRegistrationInterceptor$interceptAllowedEndpoints$1$1", m3645f = "DeviceRegistrationInterceptor.kt", m3646l = {17}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.remote.internal.api.rest.interceptors.DeviceRegistrationInterceptor$interceptAllowedEndpoints$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DeviceRegistrationInterceptor2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends RegisterDeviceRequest>>, Object> {
    int label;
    final /* synthetic */ DeviceRegistrationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInterceptor2(DeviceRegistrationInterceptor deviceRegistrationInterceptor, Continuation<? super DeviceRegistrationInterceptor2> continuation) {
        super(2, continuation);
        this.this$0 = deviceRegistrationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceRegistrationInterceptor2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends RegisterDeviceRequest>> continuation) {
        return ((DeviceRegistrationInterceptor2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RestService restService = this.this$0.restService;
        this.label = 1;
        Object objRegisterDevice = restService.registerDevice(this);
        return objRegisterDevice == coroutine_suspended ? coroutine_suspended : objRegisterDevice;
    }
}
