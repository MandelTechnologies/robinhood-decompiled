package com.robinhood.staticcontent.store.disclosure;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.store.ContentStore;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: RealDisclosureStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "markwon", "Lio/noties/markwon/Markwon;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Lio/noties/markwon/Markwon;Lcom/robinhood/contentful/StaticContentStore;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "contentfulId", "", "formatArguments", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealDisclosureStore implements ContentStore<DisclosureContent> {
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;

    public RealDisclosureStore(Markwon markwon, StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.markwon = markwon;
        this.staticContentStore = staticContentStore;
    }

    /* compiled from: RealDisclosureStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.staticcontent.store.disclosure.RealDisclosureStore$load$2", m3645f = "RealDisclosureStore.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.staticcontent.store.disclosure.RealDisclosureStore$load$2 */
    static final class C412722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DisclosureContent>, Object> {
        final /* synthetic */ String $contentfulId;
        final /* synthetic */ Map<String, Object> $formatArguments;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412722(String str, Map<String, ? extends Object> map, Continuation<? super C412722> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
            this.$formatArguments = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealDisclosureStore.this.new C412722(this.$contentfulId, this.$formatArguments, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisclosureContent> continuation) {
            return ((C412722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C412722 c412722;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RealDisclosureStore.this.staticContentStore;
                String str = this.$contentfulId;
                this.label = 1;
                c412722 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, c412722, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c412722 = this;
            }
            return ((Disclosure) ((EntryResource) obj).getValue()).toDisclosureContent(RealDisclosureStore.this.markwon, c412722.$formatArguments);
        }
    }

    @Override // com.robinhood.staticcontent.store.ContentStore
    public Object load(String str, Map<String, ? extends Object> map, Continuation<? super DisclosureContent> continuation) {
        return CoroutineScope2.coroutineScope(new C412722(str, map, null), continuation);
    }
}
