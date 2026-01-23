package com.robinhood.android.equities.shortinterest;

import com.robinhood.android.trading.contracts.EquitiesSubzeroSiChart;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShortInterestSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.shortinterest.ShortInterestSectionDuxo$bind$1$2$1", m3645f = "ShortInterestSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.shortinterest.ShortInterestSectionDuxo$bind$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ShortInterestSectionDuxo2 extends ContinuationImpl7 implements Function2<ShortInterestSectionDataState, Continuation<? super ShortInterestSectionDataState>, Object> {
    final /* synthetic */ EquitiesSubzeroSiChart.Variant $variant;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortInterestSectionDuxo2(EquitiesSubzeroSiChart.Variant variant, Continuation<? super ShortInterestSectionDuxo2> continuation) {
        super(2, continuation);
        this.$variant = variant;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortInterestSectionDuxo2 shortInterestSectionDuxo2 = new ShortInterestSectionDuxo2(this.$variant, continuation);
        shortInterestSectionDuxo2.L$0 = obj;
        return shortInterestSectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShortInterestSectionDataState shortInterestSectionDataState, Continuation<? super ShortInterestSectionDataState> continuation) {
        return ((ShortInterestSectionDuxo2) create(shortInterestSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ShortInterestSectionDataState.copy$default((ShortInterestSectionDataState) this.L$0, null, null, this.$variant, 3, null);
    }
}
