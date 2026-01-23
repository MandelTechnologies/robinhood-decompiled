package com.robinhood.android.trade.directipo.util;

import com.robinhood.directipo.models.p293ui.UiDirectIpoOrderResponse;
import com.robinhood.models.api.bonfire.ApiDirectIpoPostCobFollowup;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowup;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: DirectIpoOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1", m3645f = "DirectIpoOrderSubmissionManager.kt", m3646l = {70, 70}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1, reason: use source file name */
/* loaded from: classes9.dex */
final class DirectIpoOrderSubmissionManager3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>>, Object> {
    final /* synthetic */ UUID $orderId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DirectIpoOrderSubmissionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectIpoOrderSubmissionManager3(DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager, UUID uuid, Continuation<? super DirectIpoOrderSubmissionManager3> continuation) {
        super(2, continuation);
        this.this$0 = directIpoOrderSubmissionManager;
        this.$orderId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectIpoOrderSubmissionManager3 directIpoOrderSubmissionManager3 = new DirectIpoOrderSubmissionManager3(this.this$0, this.$orderId, continuation);
        directIpoOrderSubmissionManager3.L$0 = obj;
        return directIpoOrderSubmissionManager3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>> continuation) {
        return ((DirectIpoOrderSubmissionManager3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferredAsync$default;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOrderSubmissionManager5(this.this$0, this.$orderId, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DirectIpoOrderSubmissionManager4(this.this$0, this.$orderId, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            obj = deferredAsync$default2.await(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            ApiDirectIpoPostCobFollowup apiDirectIpoPostCobFollowup = (ApiDirectIpoPostCobFollowup) obj;
            return Tuples4.m3642to(obj2, apiDirectIpoPostCobFollowup != null ? apiDirectIpoPostCobFollowup.toUiModel() : null);
        }
        deferredAsync$default = (Deferred) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = obj;
        this.label = 2;
        Object objAwait = deferredAsync$default.await(this);
        if (objAwait != coroutine_suspended) {
            obj2 = obj;
            obj = objAwait;
            ApiDirectIpoPostCobFollowup apiDirectIpoPostCobFollowup2 = (ApiDirectIpoPostCobFollowup) obj;
            return Tuples4.m3642to(obj2, apiDirectIpoPostCobFollowup2 != null ? apiDirectIpoPostCobFollowup2.toUiModel() : null);
        }
        return coroutine_suspended;
    }
}
