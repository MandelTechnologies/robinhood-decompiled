package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AlertHubSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "param", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$DeleteApiParams;", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteSaveSettingsAction$1", m3645f = "AlertHubSettingsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteSaveSettingsAction$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AlertHubSettingsStore4 extends ContinuationImpl7 implements Function3<AlertHubSettingsStore.DeleteApiParams, Optional<? extends AlertHubSettings>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AlertHubSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertHubSettingsStore4(AlertHubSettingsStore alertHubSettingsStore, Continuation<? super AlertHubSettingsStore4> continuation) {
        super(3, continuation);
        this.this$0 = alertHubSettingsStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AlertHubSettingsStore.DeleteApiParams deleteApiParams, Optional<AlertHubSettings> optional, Continuation<? super Unit> continuation) {
        AlertHubSettingsStore4 alertHubSettingsStore4 = new AlertHubSettingsStore4(this.this$0, continuation);
        alertHubSettingsStore4.L$0 = deleteApiParams;
        alertHubSettingsStore4.L$1 = optional;
        return alertHubSettingsStore4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(AlertHubSettingsStore.DeleteApiParams deleteApiParams, Optional<? extends AlertHubSettings> optional, Continuation<? super Unit> continuation) {
        return invoke2(deleteApiParams, (Optional<AlertHubSettings>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlertHubSettingsStore.DeleteApiParams deleteApiParams = (AlertHubSettingsStore.DeleteApiParams) this.L$0;
        AlertHubSettings alertHubSettings = (AlertHubSettings) ((Optional) this.L$1).component1();
        if (alertHubSettings != null) {
            this.this$0.dao.insert(alertHubSettings);
            this.this$0.advancedAlertDao.deleteAdvancedAlert(deleteApiParams.getEntityId());
        }
        return Unit.INSTANCE;
    }
}
