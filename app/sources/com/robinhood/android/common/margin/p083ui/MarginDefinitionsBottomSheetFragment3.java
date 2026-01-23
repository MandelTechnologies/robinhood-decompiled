package com.robinhood.android.common.margin.p083ui;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginDefinitionsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$onViewCreated$2$1", m3645f = "MarginDefinitionsBottomSheetFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$onViewCreated$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class MarginDefinitionsBottomSheetFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
    final /* synthetic */ String $contentfulId;
    int label;
    final /* synthetic */ MarginDefinitionsBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginDefinitionsBottomSheetFragment3(MarginDefinitionsBottomSheetFragment marginDefinitionsBottomSheetFragment, String str, Continuation<? super MarginDefinitionsBottomSheetFragment3> continuation) {
        super(2, continuation);
        this.this$0 = marginDefinitionsBottomSheetFragment;
        this.$contentfulId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginDefinitionsBottomSheetFragment3(this.this$0, this.$contentfulId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
        return ((MarginDefinitionsBottomSheetFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ContentStore<ProductMarketingContent> productMarketingStore = this.this$0.getProductMarketingStore();
        String str = this.$contentfulId;
        this.label = 1;
        Object objLoad$default = ContentStore.DefaultImpls.load$default(productMarketingStore, str, null, this, 2, null);
        return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
    }
}
