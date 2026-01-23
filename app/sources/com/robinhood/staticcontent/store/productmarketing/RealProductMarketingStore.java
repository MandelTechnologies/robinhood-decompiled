package com.robinhood.staticcontent.store.productmarketing;

import android.text.Spanned;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.text.MessageFormatting;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
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
import kotlinx.coroutines.Deferred;

/* compiled from: RealProductMarketingStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "disclosureStore", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "featureStore", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/staticcontent/store/ContentStore;Lcom/robinhood/staticcontent/store/ContentStore;Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "contentfulId", "", "formatArguments", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealProductMarketingStore implements ContentStore<ProductMarketingContent> {
    private final ContentStore<DisclosureContent> disclosureStore;
    private final ContentStore<ProductMarketingContent.Feature> featureStore;
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;

    public RealProductMarketingStore(ContentStore<DisclosureContent> disclosureStore, ContentStore<ProductMarketingContent.Feature> featureStore, StaticContentStore staticContentStore, Markwon markwon) {
        Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
        Intrinsics.checkNotNullParameter(featureStore, "featureStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.disclosureStore = disclosureStore;
        this.featureStore = featureStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    /* compiled from: RealProductMarketingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2", m3645f = "RealProductMarketingStore.kt", m3646l = {32, 47, 48}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore$load$2 */
    static final class C412762 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
        final /* synthetic */ String $contentfulId;
        final /* synthetic */ Map<String, Object> $formatArguments;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412762(String str, Map<String, ? extends Object> map, Continuation<? super C412762> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
            this.$formatArguments = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412762 c412762 = RealProductMarketingStore.this.new C412762(this.$contentfulId, this.$formatArguments, continuation);
            c412762.L$0 = obj;
            return c412762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
            return ((C412762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
        
            if (r5 != r6) goto L8;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objLoadEntry$default;
            Spanned spanned$default;
            String messageWith;
            Object objAwaitAll;
            Deferred deferred;
            String str;
            CharSequence charSequence;
            MarkdownContent with;
            List list;
            Object objAwait;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                StaticContentStore staticContentStore = RealProductMarketingStore.this.staticContentStore;
                String str2 = this.$contentfulId;
                this.L$0 = coroutineScope;
                this.label = 1;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str2, null, this, 2, null);
                if (objLoadEntry$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                objLoadEntry$default = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$3;
                    charSequence = (CharSequence) this.L$2;
                    messageWith = (String) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                    return new ProductMarketingContent(str, messageWith, charSequence, list, (DisclosureContent) objAwait);
                }
                CharSequence charSequence2 = (CharSequence) this.L$3;
                String str3 = (String) this.L$2;
                String str4 = (String) this.L$1;
                Deferred deferred2 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferred = deferred2;
                str = str4;
                messageWith = str3;
                charSequence = charSequence2;
                objAwaitAll = obj;
                list = (List) objAwaitAll;
                this.L$0 = str;
                this.L$1 = messageWith;
                this.L$2 = charSequence;
                this.L$3 = list;
                this.label = 3;
                objAwait = deferred.await(this);
            }
            ProductMarketing productMarketing = (ProductMarketing) ((EntryResource) objLoadEntry$default).getValue();
            List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = productMarketing.getFeatures();
            RealProductMarketingStore realProductMarketingStore = RealProductMarketingStore.this;
            Map<String, Object> map = this.$formatArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
            Iterator<T> it = features.iterator();
            while (true) {
                spanned$default = null;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RealProductMarketingStore3(realProductMarketingStore, (ResourceLink) it.next(), map, null), 3, null));
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RealProductMarketingStore2(productMarketing, RealProductMarketingStore.this, this.$formatArguments, null), 3, null);
            String productIdentifier = productMarketing.getProductIdentifier();
            String pageTitle = productMarketing.getPageTitle();
            messageWith = pageTitle != null ? MessageFormatting.formatMessageWith(pageTitle, this.$formatArguments) : null;
            MarkdownContent productDescription = productMarketing.getProductDescription();
            if (productDescription != null && (with = productDescription.formatWith(this.$formatArguments)) != null) {
                spanned$default = Markwons.toSpanned$default(RealProductMarketingStore.this.markwon, with, null, 2, null);
            }
            this.L$0 = deferredAsync$default;
            this.L$1 = productIdentifier;
            this.L$2 = messageWith;
            this.L$3 = spanned$default;
            this.label = 2;
            objAwaitAll = Await2.awaitAll(arrayList, this);
            if (objAwaitAll != coroutine_suspended) {
                deferred = deferredAsync$default;
                str = productIdentifier;
                charSequence = spanned$default;
                list = (List) objAwaitAll;
                this.L$0 = str;
                this.L$1 = messageWith;
                this.L$2 = charSequence;
                this.L$3 = list;
                this.label = 3;
                objAwait = deferred.await(this);
            }
            return coroutine_suspended;
        }
    }

    @Override // com.robinhood.staticcontent.store.ContentStore
    public Object load(String str, Map<String, ? extends Object> map, Continuation<? super ProductMarketingContent> continuation) {
        return CoroutineScope2.coroutineScope(new C412762(str, map, null), continuation);
    }
}
