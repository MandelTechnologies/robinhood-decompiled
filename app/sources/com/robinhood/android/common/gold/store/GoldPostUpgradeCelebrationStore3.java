package com.robinhood.android.common.gold.store;

import com.robinhood.android.common.gold.api.ApiGoldCelebrationQueryParams;
import com.robinhood.android.common.gold.api.GoldCommonApi;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldPostUpgradeCelebrationStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "<destruct>", "Lcom/robinhood/android/common/gold/api/ApiGoldCelebrationQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.gold.store.GoldPostUpgradeCelebrationStore$goldCelebrationEndpoint$2", m3645f = "GoldPostUpgradeCelebrationStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.gold.store.GoldPostUpgradeCelebrationStore$goldCelebrationEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class GoldPostUpgradeCelebrationStore3 extends ContinuationImpl7 implements Function2<ApiGoldCelebrationQueryParams, Continuation<? super UiPostTransferPage.PostTransferGoldCelebration>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldPostUpgradeCelebrationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldPostUpgradeCelebrationStore3(GoldPostUpgradeCelebrationStore goldPostUpgradeCelebrationStore, Continuation<? super GoldPostUpgradeCelebrationStore3> continuation) {
        super(2, continuation);
        this.this$0 = goldPostUpgradeCelebrationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldPostUpgradeCelebrationStore3 goldPostUpgradeCelebrationStore3 = new GoldPostUpgradeCelebrationStore3(this.this$0, continuation);
        goldPostUpgradeCelebrationStore3.L$0 = obj;
        return goldPostUpgradeCelebrationStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldCelebrationQueryParams apiGoldCelebrationQueryParams, Continuation<? super UiPostTransferPage.PostTransferGoldCelebration> continuation) {
        return ((GoldPostUpgradeCelebrationStore3) create(apiGoldCelebrationQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String source = ((ApiGoldCelebrationQueryParams) this.L$0).getSource();
        GoldCommonApi goldCommonApi = this.this$0.postUpgradeCelebrationApi;
        this.label = 1;
        Object postUpgradeCelebration = goldCommonApi.getPostUpgradeCelebration(source, this);
        return postUpgradeCelebration == coroutine_suspended ? coroutine_suspended : postUpgradeCelebration;
    }
}
