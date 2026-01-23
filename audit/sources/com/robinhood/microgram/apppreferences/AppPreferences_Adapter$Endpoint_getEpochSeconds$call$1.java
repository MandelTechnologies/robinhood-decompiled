package com.robinhood.microgram.apppreferences;

import com.plaid.internal.EnumC7081g;
import com.robinhood.microgram.apppreferences.AppPreferences_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AppPreferences_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Emission;", "it", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1", m3645f = "AppPreferences_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1 extends ContinuationImpl7 implements Function2<AppPreferences_Adapter.Endpoint_getEpochSeconds.Arguments, Continuation<? super AppPreferences_Adapter.Endpoint_getEpochSeconds.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppPreferences_Adapter.Endpoint_getEpochSeconds this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1(AppPreferences_Adapter.Endpoint_getEpochSeconds endpoint_getEpochSeconds, Continuation<? super AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getEpochSeconds;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1 appPreferences_Adapter$Endpoint_getEpochSeconds$call$1 = new AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1(this.this$0, continuation);
        appPreferences_Adapter$Endpoint_getEpochSeconds$call$1.L$0 = obj;
        return appPreferences_Adapter$Endpoint_getEpochSeconds$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppPreferences_Adapter.Endpoint_getEpochSeconds.Arguments arguments, Continuation<? super AppPreferences_Adapter.Endpoint_getEpochSeconds.Emission> continuation) {
        return ((AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppPreferences_Adapter.Endpoint_getEpochSeconds.Arguments arguments = (AppPreferences_Adapter.Endpoint_getEpochSeconds.Arguments) this.L$0;
            AppPreferences appPreferences = this.this$0.service;
            String key = arguments.getKey();
            this.label = 1;
            obj = appPreferences.getEpochSeconds(key, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AppPreferences_Adapter.Endpoint_getEpochSeconds.Emission.m22872boximpl(AppPreferences_Adapter.Endpoint_getEpochSeconds.Emission.m22873constructorimpl((Long) obj));
    }
}
