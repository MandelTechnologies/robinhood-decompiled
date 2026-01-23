package com.robinhood.android.settings.p254ui.drip;

import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DripSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/drip/DripSettingsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.settings.ui.drip.DripSettingsDuxo$onResume$3$1", m3645f = "DripSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class DripSettingsDuxo3 extends ContinuationImpl7 implements Function2<DripSettingsViewState, Continuation<? super DripSettingsViewState>, Object> {
    final /* synthetic */ List<UiInstrumentDripSettings> $instrumentDripSettings;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DripSettingsDuxo3(List<UiInstrumentDripSettings> list, Continuation<? super DripSettingsDuxo3> continuation) {
        super(2, continuation);
        this.$instrumentDripSettings = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DripSettingsDuxo3 dripSettingsDuxo3 = new DripSettingsDuxo3(this.$instrumentDripSettings, continuation);
        dripSettingsDuxo3.L$0 = obj;
        return dripSettingsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DripSettingsViewState dripSettingsViewState, Continuation<? super DripSettingsViewState> continuation) {
        return ((DripSettingsDuxo3) create(dripSettingsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DripSettingsViewState.copy$default((DripSettingsViewState) this.L$0, this.$instrumentDripSettings, null, 2, null);
    }
}
