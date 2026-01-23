package com.robinhood.android.slip.onboarding.hub;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1$4$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipHubSettingsMultiAccountsDuxo3 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
    final /* synthetic */ String $accountNumber;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipHubSettingsMultiAccountsDuxo3(String str, Continuation<? super SlipHubSettingsMultiAccountsDuxo3> continuation) {
        super(2, continuation);
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipHubSettingsMultiAccountsDuxo3 slipHubSettingsMultiAccountsDuxo3 = new SlipHubSettingsMultiAccountsDuxo3(this.$accountNumber, continuation);
        slipHubSettingsMultiAccountsDuxo3.L$0 = obj;
        return slipHubSettingsMultiAccountsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
        return ((SlipHubSettingsMultiAccountsDuxo3) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState = (SlipHubSettingsMultiAccountsDataState) this.L$0;
        return SlipHubSettingsMultiAccountsDataState.copy$default(slipHubSettingsMultiAccountsDataState, null, null, null, SetsKt.minus(slipHubSettingsMultiAccountsDataState.getAccountNumbersCurrentlyUpdating(), this.$accountNumber), null, 23, null);
    }
}
