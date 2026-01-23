package com.robinhood.librobinhood.data.store;

import com.robinhood.android.models.taxcenter.api.ApiTaxDocument;
import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import com.robinhood.android.taxcenter.api.TaxCenterApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TaxCenterStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/taxcenter/db/TaxDocument;", "documentId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxCenterStore$taxDocumentEndpoint$1", m3645f = "TaxCenterStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TaxCenterStore$taxDocumentEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TaxCenterStore4 extends ContinuationImpl7 implements Function2<String, Continuation<? super TaxDocument>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxCenterStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxCenterStore4(TaxCenterStore taxCenterStore, Continuation<? super TaxCenterStore4> continuation) {
        super(2, continuation);
        this.this$0 = taxCenterStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxCenterStore4 taxCenterStore4 = new TaxCenterStore4(this.this$0, continuation);
        taxCenterStore4.L$0 = obj;
        return taxCenterStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super TaxDocument> continuation) {
        return ((TaxCenterStore4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.L$0;
            TaxCenterApi taxCenterApi = this.this$0.taxCenterApi;
            this.L$0 = str2;
            this.label = 1;
            Object taxDocument = taxCenterApi.getTaxDocument(str2, this);
            if (taxDocument == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = taxDocument;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiTaxDocument) obj).toDbModel(str);
    }
}
