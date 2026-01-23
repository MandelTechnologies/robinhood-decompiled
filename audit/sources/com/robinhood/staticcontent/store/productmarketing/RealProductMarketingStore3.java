package com.robinhood.staticcontent.store.productmarketing;

import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealProductMarketingStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2$featuresAsync$1$1", m3645f = "RealProductMarketingStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2$featuresAsync$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RealProductMarketingStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent.Feature>, Object> {
    final /* synthetic */ Map<String, Object> $formatArguments;
    final /* synthetic */ ResourceLink<EntryResource<ProductMarketing.Feature>> $link;
    int label;
    final /* synthetic */ RealProductMarketingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealProductMarketingStore3(RealProductMarketingStore realProductMarketingStore, ResourceLink<EntryResource<ProductMarketing.Feature>> resourceLink, Map<String, ? extends Object> map, Continuation<? super RealProductMarketingStore3> continuation) {
        super(2, continuation);
        this.this$0 = realProductMarketingStore;
        this.$link = resourceLink;
        this.$formatArguments = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealProductMarketingStore3(this.this$0, this.$link, this.$formatArguments, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent.Feature> continuation) {
        return ((RealProductMarketingStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ContentStore contentStore = this.this$0.featureStore;
        String id = this.$link.getSys().getId();
        Map<String, ? extends Object> map = this.$formatArguments;
        this.label = 1;
        Object objLoad = contentStore.load(id, map, this);
        return objLoad == coroutine_suspended ? coroutine_suspended : objLoad;
    }
}
