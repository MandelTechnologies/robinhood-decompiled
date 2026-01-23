package com.robinhood.android.margin.upgrade.loading;

import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$info$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$info$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeLoadingDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMarginInvestingInfo>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ MarginUpgradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeLoadingDuxo3(MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo, String str, Continuation<? super MarginUpgradeLoadingDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeLoadingDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeLoadingDuxo3(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMarginInvestingInfo> continuation) {
        return ((MarginUpgradeLoadingDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MarginInvestingInfoStore marginInvestingInfoStore = this.this$0.marginInvestingInfoStore;
        String str = this.$accountNumber;
        this.label = 1;
        Object marginInvestingInfo = marginInvestingInfoStore.getMarginInvestingInfo(str, this);
        return marginInvestingInfo == coroutine_suspended ? coroutine_suspended : marginInvestingInfo;
    }
}
