package com.robinhood.staticcontent.store.margin;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparison;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparisonContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealMarginInterestRateComparisonStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent$BrokerageInterestRateItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.staticcontent.store.margin.RealMarginInterestRateComparisonStore$load$2$brokerageInterestRateItemsAsync$1$1", m3645f = "RealMarginInterestRateComparisonStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.staticcontent.store.margin.RealMarginInterestRateComparisonStore$load$2$brokerageInterestRateItemsAsync$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RealMarginInterestRateComparisonStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginInterestRateComparisonContent.BrokerageInterestRateItem>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>> $link;
    int label;
    final /* synthetic */ RealMarginInterestRateComparisonStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealMarginInterestRateComparisonStore2(RealMarginInterestRateComparisonStore realMarginInterestRateComparisonStore, ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>> resourceLink, Continuation<? super RealMarginInterestRateComparisonStore2> continuation) {
        super(2, continuation);
        this.this$0 = realMarginInterestRateComparisonStore;
        this.$link = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealMarginInterestRateComparisonStore2(this.this$0, this.$link, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginInterestRateComparisonContent.BrokerageInterestRateItem> continuation) {
        return ((RealMarginInterestRateComparisonStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            String id = this.$link.getSys().getId();
            this.label = 1;
            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, id, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MarginInterestRateComparison.BrokerageInterestRateItem brokerageInterestRateItem = (MarginInterestRateComparison.BrokerageInterestRateItem) ((EntryResource) obj).getValue();
        return new MarginInterestRateComparisonContent.BrokerageInterestRateItem(brokerageInterestRateItem.getTitle(), brokerageInterestRateItem.getInterestRate(), brokerageInterestRateItem.isBold());
    }
}
