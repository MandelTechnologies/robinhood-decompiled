package com.robinhood.android.margin.upgrade.loading;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$settings$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$settings$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeLoadingDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginSettings>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ MarginUpgradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeLoadingDuxo6(MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo, String str, Continuation<? super MarginUpgradeLoadingDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeLoadingDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeLoadingDuxo6(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginSettings> continuation) {
        return ((MarginUpgradeLoadingDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.this$0.leveredMarginSettingsStore;
        String str = this.$accountNumber;
        this.label = 1;
        Object objFetchMarginSettings = leveredMarginSettingsStore.fetchMarginSettings(str, this);
        return objFetchMarginSettings == coroutine_suspended ? coroutine_suspended : objFetchMarginSettings;
    }
}
