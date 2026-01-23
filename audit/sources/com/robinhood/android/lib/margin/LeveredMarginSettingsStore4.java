package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.api.ApiMarginSettingsRequestBody;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: LeveredMarginSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "update", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore$MarginSettingsUpdate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.LeveredMarginSettingsStore$postEndpoint$1", m3645f = "LeveredMarginSettingsStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$postEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class LeveredMarginSettingsStore4 extends ContinuationImpl7 implements Function2<LeveredMarginSettingsStore.MarginSettingsUpdate, Continuation<? super ApiMarginSettings>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LeveredMarginSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LeveredMarginSettingsStore4(LeveredMarginSettingsStore leveredMarginSettingsStore, Continuation<? super LeveredMarginSettingsStore4> continuation) {
        super(2, continuation);
        this.this$0 = leveredMarginSettingsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LeveredMarginSettingsStore4 leveredMarginSettingsStore4 = new LeveredMarginSettingsStore4(this.this$0, continuation);
        leveredMarginSettingsStore4.L$0 = obj;
        return leveredMarginSettingsStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LeveredMarginSettingsStore.MarginSettingsUpdate marginSettingsUpdate, Continuation<? super ApiMarginSettings> continuation) {
        return ((LeveredMarginSettingsStore4) create(marginSettingsUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        LeveredMarginSettingsStore.MarginSettingsUpdate marginSettingsUpdate = (LeveredMarginSettingsStore.MarginSettingsUpdate) this.L$0;
        MarginInvestingApi marginInvestingApi = this.this$0.marginInvestingApi;
        String accountNumber = marginSettingsUpdate.getAccountNumber();
        ApiMarginSettingsRequestBody requestBody = marginSettingsUpdate.getRequestBody();
        this.label = 1;
        Object objUpdateMarginSettings = marginInvestingApi.updateMarginSettings(accountNumber, requestBody, this);
        return objUpdateMarginSettings == coroutine_suspended ? coroutine_suspended : objUpdateMarginSettings;
    }
}
