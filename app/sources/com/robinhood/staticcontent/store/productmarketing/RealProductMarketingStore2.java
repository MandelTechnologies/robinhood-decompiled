package com.robinhood.staticcontent.store.productmarketing;

import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealProductMarketingStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2$disclosureAsync$1", m3645f = "RealProductMarketingStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2$disclosureAsync$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RealProductMarketingStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DisclosureContent>, Object> {
    final /* synthetic */ Map<String, Object> $formatArguments;
    final /* synthetic */ ProductMarketing $marketing;
    int label;
    final /* synthetic */ RealProductMarketingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealProductMarketingStore2(ProductMarketing productMarketing, RealProductMarketingStore realProductMarketingStore, Map<String, ? extends Object> map, Continuation<? super RealProductMarketingStore2> continuation) {
        super(2, continuation);
        this.$marketing = productMarketing;
        this.this$0 = realProductMarketingStore;
        this.$formatArguments = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealProductMarketingStore2(this.$marketing, this.this$0, this.$formatArguments, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisclosureContent> continuation) {
        return ((RealProductMarketingStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ResourceLink<EntryResource<Disclosure>> disclosure = this.$marketing.getDisclosure();
            if (disclosure == null) {
                return null;
            }
            RealProductMarketingStore realProductMarketingStore = this.this$0;
            Map<String, ? extends Object> map = this.$formatArguments;
            ContentStore contentStore = realProductMarketingStore.disclosureStore;
            String id = disclosure.getSys().getId();
            this.label = 1;
            obj = contentStore.load(id, map, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (DisclosureContent) obj;
    }
}
