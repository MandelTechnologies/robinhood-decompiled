package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AlertHubSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;", "param", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$DeleteApiParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteEndpoint$1", m3645f = "AlertHubSettingsStore.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AlertHubSettingsStore3 extends ContinuationImpl7 implements Function2<AlertHubSettingsStore.DeleteApiParams, Continuation<? super Optional<? extends AlertHubSettings>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AlertHubSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertHubSettingsStore3(AlertHubSettingsStore alertHubSettingsStore, Continuation<? super AlertHubSettingsStore3> continuation) {
        super(2, continuation);
        this.this$0 = alertHubSettingsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlertHubSettingsStore3 alertHubSettingsStore3 = new AlertHubSettingsStore3(this.this$0, continuation);
        alertHubSettingsStore3.L$0 = obj;
        return alertHubSettingsStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AlertHubSettingsStore.DeleteApiParams deleteApiParams, Continuation<? super Optional<AlertHubSettings>> continuation) {
        return ((AlertHubSettingsStore3) create(deleteApiParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AlertHubSettingsStore.DeleteApiParams deleteApiParams, Continuation<? super Optional<? extends AlertHubSettings>> continuation) {
        return invoke2(deleteApiParams, (Continuation<? super Optional<AlertHubSettings>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Optional.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AlertHubSettingsStore.DeleteApiParams deleteApiParams = (AlertHubSettingsStore.DeleteApiParams) this.L$0;
            Optional.Companion companion2 = Optional.INSTANCE;
            AdvancedAlertApi advancedAlertApi = this.this$0.advancedAlertApi;
            UUID entityId = deleteApiParams.getEntityId();
            AlertHubSettings2 entityType = deleteApiParams.getEntityType();
            this.L$0 = companion2;
            this.label = 1;
            obj = advancedAlertApi.deleteAlertHubSettingsItem(entityId, entityType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Optional.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return companion.m2972of(obj);
    }
}
