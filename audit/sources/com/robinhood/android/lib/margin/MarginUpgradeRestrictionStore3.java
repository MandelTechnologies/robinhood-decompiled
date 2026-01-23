package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.models.ApiMarginUpgradeRestriction;
import com.robinhood.android.lib.margin.p167db.models.MarginUpgradeRestriction2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginUpgradeRestrictionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/lib/margin/api/models/ApiMarginUpgradeRestriction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$endpoint$2", m3645f = "MarginUpgradeRestrictionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore$endpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeRestrictionStore3 extends ContinuationImpl7 implements Function2<ApiMarginUpgradeRestriction, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginUpgradeRestrictionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeRestrictionStore3(MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, Continuation<? super MarginUpgradeRestrictionStore3> continuation) {
        super(2, continuation);
        this.this$0 = marginUpgradeRestrictionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginUpgradeRestrictionStore3 marginUpgradeRestrictionStore3 = new MarginUpgradeRestrictionStore3(this.this$0, continuation);
        marginUpgradeRestrictionStore3.L$0 = obj;
        return marginUpgradeRestrictionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarginUpgradeRestriction apiMarginUpgradeRestriction, Continuation<? super Unit> continuation) {
        return ((MarginUpgradeRestrictionStore3) create(apiMarginUpgradeRestriction, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(MarginUpgradeRestriction2.toDbModel((ApiMarginUpgradeRestriction) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
