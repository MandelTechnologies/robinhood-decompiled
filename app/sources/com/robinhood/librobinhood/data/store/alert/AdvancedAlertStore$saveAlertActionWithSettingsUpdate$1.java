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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1", m3645f = "AdvancedAlertStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1 extends ContinuationImpl7 implements Function3<ApiAdvancedAlert2, Optional<? extends ApiAdvancedAlert>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1> continuation) {
        super(3, continuation);
        this.this$0 = advancedAlertStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ApiAdvancedAlert2 apiAdvancedAlert2, Optional<ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1 advancedAlertStore$saveAlertActionWithSettingsUpdate$1 = new AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1(this.this$0, continuation);
        advancedAlertStore$saveAlertActionWithSettingsUpdate$1.L$0 = apiAdvancedAlert2;
        advancedAlertStore$saveAlertActionWithSettingsUpdate$1.L$1 = optional;
        return advancedAlertStore$saveAlertActionWithSettingsUpdate$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ApiAdvancedAlert2 apiAdvancedAlert2, Optional<? extends ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        return invoke2(apiAdvancedAlert2, (Optional<ApiAdvancedAlert>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiAdvancedAlert2 apiAdvancedAlert2 = (ApiAdvancedAlert2) this.L$0;
        ApiAdvancedAlert apiAdvancedAlert = (ApiAdvancedAlert) ((Optional) this.L$1).component1();
        if (apiAdvancedAlert != null) {
            this.this$0.dao.insert(apiAdvancedAlert.toDbModel());
            this.this$0.fetchAlertHubSettings(apiAdvancedAlert2);
        }
        return Unit.INSTANCE;
    }
}
