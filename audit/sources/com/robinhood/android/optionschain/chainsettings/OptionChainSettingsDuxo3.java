package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$3$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$3$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainSettingsDuxo3 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
    final /* synthetic */ OptionChainSelectedMetrics $selectedMetrics;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainSettingsDuxo3(OptionChainSelectedMetrics optionChainSelectedMetrics, Continuation<? super OptionChainSettingsDuxo3> continuation) {
        super(2, continuation);
        this.$selectedMetrics = optionChainSelectedMetrics;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainSettingsDuxo3 optionChainSettingsDuxo3 = new OptionChainSettingsDuxo3(this.$selectedMetrics, continuation);
        optionChainSettingsDuxo3.L$0 = obj;
        return optionChainSettingsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
        return ((OptionChainSettingsDuxo3) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, this.$selectedMetrics.getSelectedMetricOne(), this.$selectedMetrics.getSelectedMetricTwo(), null, null, null, null, false, false, false, null, null, false, false, false, 131047, null);
    }
}
