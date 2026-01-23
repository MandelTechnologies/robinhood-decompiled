package com.robinhood.staticcontent.store.margin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparison;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparisonContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.util.Markwons;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: RealMarginInterestRateComparisonStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "contentfulId", "", "formatArguments", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealMarginInterestRateComparisonStore implements ContentStore<MarginInterestRateComparisonContent> {
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;

    public RealMarginInterestRateComparisonStore(StaticContentStore staticContentStore, Markwon markwon) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    /* compiled from: RealMarginInterestRateComparisonStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.staticcontent.store.margin.RealMarginInterestRateComparisonStore$load$2", m3645f = "RealMarginInterestRateComparisonStore.kt", m3646l = {25, 42}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.staticcontent.store.margin.RealMarginInterestRateComparisonStore$load$2 */
    static final class C412732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginInterestRateComparisonContent>, Object> {
        final /* synthetic */ String $contentfulId;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412732(String str, Continuation<? super C412732> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412732 c412732 = RealMarginInterestRateComparisonStore.this.new C412732(this.$contentfulId, continuation);
            c412732.L$0 = obj;
            return c412732;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginInterestRateComparisonContent> continuation) {
            return ((C412732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
        
            if (r4 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objLoadEntry$default;
            MarginInterestRateComparison marginInterestRateComparison;
            String title;
            CharSequence spanned$default;
            Object objAwaitAll;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                StaticContentStore staticContentStore = RealMarginInterestRateComparisonStore.this.staticContentStore;
                String str = this.$contentfulId;
                this.L$0 = coroutineScope;
                this.label = 1;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, this, 2, null);
                if (objLoadEntry$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                spanned$default = (CharSequence) this.L$2;
                title = (String) this.L$1;
                marginInterestRateComparison = (MarginInterestRateComparison) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitAll = obj;
                List list = (List) objAwaitAll;
                MarkdownContent disclosure = marginInterestRateComparison.getDisclosure();
                return new MarginInterestRateComparisonContent(title, spanned$default, list, disclosure != null ? Markwons.toSpanned$default(RealMarginInterestRateComparisonStore.this.markwon, disclosure, null, 2, null) : null);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            objLoadEntry$default = obj;
            marginInterestRateComparison = (MarginInterestRateComparison) ((EntryResource) objLoadEntry$default).getValue();
            List<ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>>> brokerageInterestRate = marginInterestRateComparison.getBrokerageInterestRate();
            RealMarginInterestRateComparisonStore realMarginInterestRateComparisonStore = RealMarginInterestRateComparisonStore.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(brokerageInterestRate, 10));
            Iterator<T> it = brokerageInterestRate.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RealMarginInterestRateComparisonStore2(realMarginInterestRateComparisonStore, (ResourceLink) it.next(), null), 3, null));
            }
            title = marginInterestRateComparison.getTitle();
            MarkdownContent description = marginInterestRateComparison.getDescription();
            spanned$default = description != null ? Markwons.toSpanned$default(RealMarginInterestRateComparisonStore.this.markwon, description, null, 2, null) : null;
            this.L$0 = marginInterestRateComparison;
            this.L$1 = title;
            this.L$2 = spanned$default;
            this.label = 2;
            objAwaitAll = Await2.awaitAll(arrayList, this);
        }
    }

    @Override // com.robinhood.staticcontent.store.ContentStore
    public Object load(String str, Map<String, ? extends Object> map, Continuation<? super MarginInterestRateComparisonContent> continuation) {
        return CoroutineScope2.coroutineScope(new C412732(str, null), continuation);
    }
}
