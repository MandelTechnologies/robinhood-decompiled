package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.p320db.OptionSettings;
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
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$2$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainSettingsDuxo2 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
    final /* synthetic */ OptionSettings $optionSettings;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainSettingsDuxo2(OptionSettings optionSettings, Continuation<? super OptionChainSettingsDuxo2> continuation) {
        super(2, continuation);
        this.$optionSettings = optionSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainSettingsDuxo2 optionChainSettingsDuxo2 = new OptionChainSettingsDuxo2(this.$optionSettings, continuation);
        optionChainSettingsDuxo2.L$0 = obj;
        return optionChainSettingsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
        return ((OptionChainSettingsDuxo2) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, this.$optionSettings.getDefaultPricingSetting(), null, false, null, null, null, null, null, null, false, false, false, null, null, false, false, false, 131070, null);
    }
}
