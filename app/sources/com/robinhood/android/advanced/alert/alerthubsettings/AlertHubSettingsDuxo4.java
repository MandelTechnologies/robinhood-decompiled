package com.robinhood.android.advanced.alert.alerthubsettings;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AlertHubSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$onResume$1$3$1", m3645f = "AlertHubSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$onResume$1$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AlertHubSettingsDuxo4 extends ContinuationImpl7 implements Function2<AlertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState>, Object> {
    final /* synthetic */ List<UiCurrencyPair> $currencyPairs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertHubSettingsDuxo4(List<UiCurrencyPair> list, Continuation<? super AlertHubSettingsDuxo4> continuation) {
        super(2, continuation);
        this.$currencyPairs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlertHubSettingsDuxo4 alertHubSettingsDuxo4 = new AlertHubSettingsDuxo4(this.$currencyPairs, continuation);
        alertHubSettingsDuxo4.L$0 = obj;
        return alertHubSettingsDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AlertHubSettingsDataState alertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState> continuation) {
        return ((AlertHubSettingsDuxo4) create(alertHubSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AlertHubSettingsDataState.copy$default((AlertHubSettingsDataState) this.L$0, null, null, this.$currencyPairs, null, false, 27, null);
    }
}
