package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.MarginBrokebackApi;
import com.robinhood.android.lib.margin.api.models.ApiMarginUpgradeRestriction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginUpgradeRestrictionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/models/ApiMarginUpgradeRestriction;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$endpoint$1", m3645f = "MarginUpgradeRestrictionStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$endpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeRestrictionStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiMarginUpgradeRestriction>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginUpgradeRestrictionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeRestrictionStore2(MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, Continuation<? super MarginUpgradeRestrictionStore2> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeRestrictionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginUpgradeRestrictionStore2 marginUpgradeRestrictionStore2 = new MarginUpgradeRestrictionStore2(this.this$0, continuation);
        marginUpgradeRestrictionStore2.L$0 = obj;
        return marginUpgradeRestrictionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiMarginUpgradeRestriction> continuation) {
        return ((MarginUpgradeRestrictionStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        MarginBrokebackApi marginBrokebackApi = this.this$0.api;
        this.label = 1;
        Object marginUpgradeRestrictions = marginBrokebackApi.getMarginUpgradeRestrictions(str, this);
        return marginUpgradeRestrictions == coroutine_suspended ? coroutine_suspended : marginUpgradeRestrictions;
    }
}
