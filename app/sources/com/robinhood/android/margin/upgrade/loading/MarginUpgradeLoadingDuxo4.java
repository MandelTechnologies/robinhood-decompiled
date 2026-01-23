package com.robinhood.android.margin.upgrade.loading;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.brokeragecontent.BrokerageOtherMarkdown;
import com.robinhood.staticcontent.model.OtherMarkdown;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$lossesContent$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$lossesContent$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeLoadingDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OtherMarkdown>, Object> {
    int label;
    final /* synthetic */ MarginUpgradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeLoadingDuxo4(MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo, Continuation<? super MarginUpgradeLoadingDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeLoadingDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OtherMarkdown> continuation) {
        return ((MarginUpgradeLoadingDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Single singleLoadResource = this.this$0.brokerageResourceManager.loadResource(BrokerageOtherMarkdown.MARGIN_LOSSES_EDUCATION);
        this.label = 1;
        Object objAwait = RxAwait3.await(singleLoadResource, this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
