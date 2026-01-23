package com.robinhood.android.advanced.alert.alerthubsettings;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AlertHubSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$removeItem$3$1", m3645f = "AlertHubSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$removeItem$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AlertHubSettingsDuxo6 extends ContinuationImpl7 implements Function2<AlertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState>, Object> {
    final /* synthetic */ UUID $id;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertHubSettingsDuxo6(UUID uuid, Continuation<? super AlertHubSettingsDuxo6> continuation) {
        super(2, continuation);
        this.$id = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlertHubSettingsDuxo6 alertHubSettingsDuxo6 = new AlertHubSettingsDuxo6(this.$id, continuation);
        alertHubSettingsDuxo6.L$0 = obj;
        return alertHubSettingsDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AlertHubSettingsDataState alertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState> continuation) {
        return ((AlertHubSettingsDuxo6) create(alertHubSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlertHubSettingsDataState alertHubSettingsDataState = (AlertHubSettingsDataState) this.L$0;
        return AlertHubSettingsDataState.copy$default(alertHubSettingsDataState, null, null, null, SetsKt.minus(alertHubSettingsDataState.getItemsToBeRemoved(), this.$id), false, 23, null);
    }
}
