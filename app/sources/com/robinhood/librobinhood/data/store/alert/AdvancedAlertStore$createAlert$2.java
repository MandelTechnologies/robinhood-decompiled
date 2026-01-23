package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/librobinhood/data/store/alert/CreateAlertParams;", "alert", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createAlert$2", m3645f = "AdvancedAlertStore.kt", m3646l = {111}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$createAlert$2 extends ContinuationImpl7 implements Function3<CreateAlertParams, Optional<? extends ApiAdvancedAlert>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$createAlert$2(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$createAlert$2> continuation) {
        super(3, continuation);
        this.this$0 = advancedAlertStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CreateAlertParams createAlertParams, Optional<ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        AdvancedAlertStore$createAlert$2 advancedAlertStore$createAlert$2 = new AdvancedAlertStore$createAlert$2(this.this$0, continuation);
        advancedAlertStore$createAlert$2.L$0 = createAlertParams;
        advancedAlertStore$createAlert$2.L$1 = optional;
        return advancedAlertStore$createAlert$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CreateAlertParams createAlertParams, Optional<? extends ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        return invoke2(createAlertParams, (Optional<ApiAdvancedAlert>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateAlertParams createAlertParams = (CreateAlertParams) this.L$0;
            Optional optional = (Optional) this.L$1;
            Function3 function3 = this.this$0.saveAlertActionWithSettingsUpdate;
            ApiAdvancedAlert2 entityType = createAlertParams.getEntityType();
            this.L$0 = null;
            this.label = 1;
            if (function3.invoke(entityType, optional, this) == coroutine_suspended) {
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
