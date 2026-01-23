package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLesson;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLesson;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSection;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSection2;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSlide;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSlide2;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import okhttp3.HttpUrl;

/* compiled from: SafetyLabelsStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015H\u0082@¢\u0006\u0002\u0010\u0017J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u001a0\u001cH\u0096\u0001J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cH\u0096\u0001J?\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$¢\u0006\u0002\b(H\u0096\u0001¢\u0006\u0002\u0010)JS\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u001a0+\"\n\b\u0000\u0010\u001a*\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\"2)\u0010#\u001a%\b\u0001\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u001a0&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$¢\u0006\u0002\b(H\u0096\u0001¢\u0006\u0002\u0010,JW\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\"2/\b\u0001\u0010#\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$¢\u0006\u0002\b(H\u0096\u0001¢\u0006\u0002\u0010/JO\u00100\u001a\b\u0012\u0004\u0012\u0002H\u001a0\b\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\"2'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0&\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$¢\u0006\u0002\b(H\u0096\u0001¢\u0006\u0002\u00101R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/SafetyLabelsStore;", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Lcom/robinhood/coroutines/rx/RxFactory;Lcom/robinhood/contentful/StaticContentStore;)V", "loadSafetyLabelsLesson", "Lio/reactivex/Single;", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLesson;", "contentfulId", "", "createLessonSections", "", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLessonSection;", "lesson", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLesson;", "(Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLesson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAssetResourceUrl", "Lokhttp3/HttpUrl;", "assetResource", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "(Lcom/robinhood/contentful/model/ResourceLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asObservable", "Lio/reactivex/Observable;", "T", "", "Lkotlinx/coroutines/flow/Flow;", "convertToObservable", "flow", "rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "rxSingle", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SafetyLabelsStore implements RxFactory {
    private final RxFactory rxFactory;
    private final StaticContentStore staticContentStore;

    /* compiled from: SafetyLabelsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSafetyLabelsLessonSection2.values().length];
            try {
                iArr[ApiSafetyLabelsLessonSection2.TEXT_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSafetyLabelsLessonSection2.SLIDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SafetyLabelsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore", m3645f = "SafetyLabelsStore.kt", m3646l = {43, 50, 51, 52, 53, 54}, m3647m = "createLessonSections")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore$createLessonSections$1 */
    static final class C345841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C345841(Continuation<? super C345841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafetyLabelsStore.this.createLessonSections(null, this);
        }
    }

    /* compiled from: SafetyLabelsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore", m3645f = "SafetyLabelsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "loadAssetResourceUrl")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore$loadAssetResourceUrl$1 */
    static final class C345851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C345851(Continuation<? super C345851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafetyLabelsStore.this.loadAssetResourceUrl(null, this);
        }
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return this.rxFactory.asObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return this.rxFactory.convertToObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxCompletable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxMaybe(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxObservable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxSingle(context, block);
    }

    public SafetyLabelsStore(RxFactory rxFactory, StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.rxFactory = rxFactory;
        this.staticContentStore = staticContentStore;
    }

    /* compiled from: SafetyLabelsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLesson;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore$loadSafetyLabelsLesson$1", m3645f = "SafetyLabelsStore.kt", m3646l = {25, 29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore$loadSafetyLabelsLesson$1 */
    static final class C345861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SafetyLabelsLesson>, Object> {
        final /* synthetic */ String $contentfulId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345861(String str, Continuation<? super C345861> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SafetyLabelsStore.this.new C345861(this.$contentfulId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SafetyLabelsLesson> continuation) {
            return ((C345861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        
            if (r4 == r6) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objLoadEntry$default;
            EntryResource entryResource;
            ApiSafetyLabelsLesson apiSafetyLabelsLesson;
            SafetyLabelsLessonSection.Header header;
            Object objCreateLessonSections;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = SafetyLabelsStore.this.staticContentStore;
                String str = this.$contentfulId;
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
                header = (SafetyLabelsLessonSection.Header) this.L$2;
                apiSafetyLabelsLesson = (ApiSafetyLabelsLesson) this.L$1;
                entryResource = (EntryResource) this.L$0;
                ResultKt.throwOnFailure(obj);
                objCreateLessonSections = obj;
                return new SafetyLabelsLesson(entryResource.getSys().getId(), apiSafetyLabelsLesson.getIdentifier(), CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) objCreateLessonSections), apiSafetyLabelsLesson.getDelimiter(), apiSafetyLabelsLesson.getCollapsedDisclosure(), apiSafetyLabelsLesson.getExpandedDisclosure());
            }
            ResultKt.throwOnFailure(obj);
            objLoadEntry$default = obj;
            entryResource = (EntryResource) objLoadEntry$default;
            apiSafetyLabelsLesson = (ApiSafetyLabelsLesson) entryResource.getValue();
            header = new SafetyLabelsLessonSection.Header(apiSafetyLabelsLesson.getTitle());
            SafetyLabelsStore safetyLabelsStore = SafetyLabelsStore.this;
            this.L$0 = entryResource;
            this.L$1 = apiSafetyLabelsLesson;
            this.L$2 = header;
            this.label = 2;
            objCreateLessonSections = safetyLabelsStore.createLessonSections(apiSafetyLabelsLesson, this);
        }
    }

    public final Single<SafetyLabelsLesson> loadSafetyLabelsLesson(String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345861(contentfulId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ab, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d6, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0224, code lost:
    
        r7 = new com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection.TextContent(r1);
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.robinhood.shared.models.db.bonfire.education.safetylabels.SafetyLabelsLessonSection$SlidesContent] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d6 -> B:56:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01e3 -> B:57:0x01dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLessonSections(ApiSafetyLabelsLesson apiSafetyLabelsLesson, Continuation<? super List<? extends SafetyLabelsLessonSection>> continuation) {
        C345841 c345841;
        Collection arrayList;
        Iterator it;
        C345841 c3458412;
        Iterator it2;
        Collection collection;
        Iterator it3;
        Collection collection2;
        Collection collection3;
        Iterator it4;
        ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide;
        HttpUrl httpUrl;
        HttpUrl httpUrl2;
        HttpUrl httpUrl3;
        ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide2;
        Iterator it5;
        Collection collection4;
        Collection collection5;
        Iterator it6;
        ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide3;
        HttpUrl httpUrl4;
        HttpUrl httpUrl5;
        ResourceLink<AssetResource<?>> nightSecondAsset;
        HttpUrl httpUrl6;
        ResourceLink<AssetResource<?>> daySecondAsset;
        ResourceLink<AssetResource<?>> nightFirstAsset;
        Object objLoadAssetResourceUrl;
        int i;
        SafetyLabelsLessonSection.TextContent textContent;
        if (continuation instanceof C345841) {
            c345841 = (C345841) continuation;
            int i2 = c345841.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c345841.label = i2 - Integer.MIN_VALUE;
            } else {
                c345841 = new C345841(continuation);
            }
        }
        Object objLoadAssetResourceUrl2 = c345841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c345841.label) {
            case 0:
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                List<ResourceLink<EntryResource<ApiSafetyLabelsLessonSection>>> sections = apiSafetyLabelsLesson.getSections();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                it = sections.iterator();
                c3458412 = c345841;
                if (!it.hasNext()) {
                    ResourceLink resourceLink = (ResourceLink) it.next();
                    StaticContentStore staticContentStore = this.staticContentStore;
                    c3458412.L$0 = arrayList;
                    c3458412.L$1 = it;
                    c3458412.L$2 = arrayList;
                    c3458412.L$3 = null;
                    c3458412.L$4 = null;
                    c3458412.L$5 = null;
                    c3458412.L$6 = null;
                    c3458412.label = 1;
                    Object objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, c3458412, 2, null);
                    if (objLoad$default != coroutine_suspended) {
                        it2 = it;
                        objLoadAssetResourceUrl2 = objLoad$default;
                        collection = arrayList;
                        ApiSafetyLabelsLessonSection apiSafetyLabelsLessonSection = (ApiSafetyLabelsLessonSection) ((EntryResource) objLoadAssetResourceUrl2).getValue();
                        i = WhenMappings.$EnumSwitchMapping$0[apiSafetyLabelsLessonSection.getType().ordinal()];
                        if (i == 1) {
                            MarkdownContent content = apiSafetyLabelsLessonSection.getContent();
                            if (content == null) {
                                textContent = new SafetyLabelsLessonSection.TextContent(MarkdownContent.INSTANCE.getEMPTY());
                                it = it2;
                            } else {
                                textContent = new SafetyLabelsLessonSection.TextContent(MarkdownContent.INSTANCE.getEMPTY());
                                it = it2;
                            }
                            arrayList.add(textContent);
                            arrayList = collection;
                            if (!it.hasNext()) {
                                return (List) arrayList;
                            }
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            StaticContentStore staticContentStore2 = this.staticContentStore;
                            ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> slides = apiSafetyLabelsLessonSection.getSlides();
                            Intrinsics.checkNotNull(slides);
                            c3458412.L$0 = collection;
                            c3458412.L$1 = it2;
                            c3458412.L$2 = arrayList;
                            c3458412.label = 2;
                            objLoadAssetResourceUrl2 = ContentRepository.DefaultImpls.load$default(staticContentStore2, slides, null, c3458412, 2, null);
                            if (objLoadAssetResourceUrl2 != coroutine_suspended) {
                                it3 = it2;
                                c345841 = c3458412;
                                collection2 = collection;
                                ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide4 = (ApiSafetyLabelsLessonSlide) ((EntryResource) objLoadAssetResourceUrl2).getValue();
                                ResourceLink<AssetResource<?>> dayFirstAsset = apiSafetyLabelsLessonSlide4.getDayFirstAsset();
                                c345841.L$0 = collection2;
                                c345841.L$1 = it3;
                                c345841.L$2 = apiSafetyLabelsLessonSlide4;
                                c345841.L$3 = arrayList;
                                c345841.label = 3;
                                objLoadAssetResourceUrl = loadAssetResourceUrl(dayFirstAsset, c345841);
                                if (objLoadAssetResourceUrl != coroutine_suspended) {
                                    collection3 = collection2;
                                    apiSafetyLabelsLessonSlide = apiSafetyLabelsLessonSlide4;
                                    objLoadAssetResourceUrl2 = objLoadAssetResourceUrl;
                                    it4 = it3;
                                    httpUrl = (HttpUrl) objLoadAssetResourceUrl2;
                                    nightFirstAsset = apiSafetyLabelsLessonSlide.getNightFirstAsset();
                                    if (nightFirstAsset == null) {
                                        c345841.L$0 = collection3;
                                        c345841.L$1 = it4;
                                        c345841.L$2 = apiSafetyLabelsLessonSlide;
                                        c345841.L$3 = httpUrl;
                                        c345841.L$4 = arrayList;
                                        c345841.label = 4;
                                        objLoadAssetResourceUrl2 = loadAssetResourceUrl(nightFirstAsset, c345841);
                                        break;
                                    } else {
                                        collection4 = collection3;
                                        it5 = it4;
                                        apiSafetyLabelsLessonSlide2 = apiSafetyLabelsLessonSlide;
                                        httpUrl3 = httpUrl;
                                        httpUrl2 = null;
                                        daySecondAsset = apiSafetyLabelsLessonSlide2.getDaySecondAsset();
                                        if (daySecondAsset == null) {
                                            c345841.L$0 = collection4;
                                            c345841.L$1 = it5;
                                            c345841.L$2 = apiSafetyLabelsLessonSlide2;
                                            c345841.L$3 = httpUrl3;
                                            c345841.L$4 = httpUrl2;
                                            c345841.L$5 = arrayList;
                                            c345841.label = 5;
                                            objLoadAssetResourceUrl2 = loadAssetResourceUrl(daySecondAsset, c345841);
                                            break;
                                        } else {
                                            collection5 = collection4;
                                            it6 = it5;
                                            apiSafetyLabelsLessonSlide3 = apiSafetyLabelsLessonSlide2;
                                            httpUrl4 = httpUrl3;
                                            httpUrl5 = null;
                                            nightSecondAsset = apiSafetyLabelsLessonSlide3.getNightSecondAsset();
                                            if (nightSecondAsset == null) {
                                                c345841.L$0 = collection5;
                                                c345841.L$1 = it6;
                                                c345841.L$2 = apiSafetyLabelsLessonSlide3;
                                                c345841.L$3 = httpUrl4;
                                                c345841.L$4 = httpUrl5;
                                                c345841.L$5 = httpUrl2;
                                                c345841.L$6 = arrayList;
                                                c345841.label = 6;
                                                objLoadAssetResourceUrl2 = loadAssetResourceUrl(nightSecondAsset, c345841);
                                                break;
                                            } else {
                                                httpUrl6 = null;
                                                ?? slidesContent = new SafetyLabelsLessonSection.SlidesContent(apiSafetyLabelsLessonSlide3.getTitle(), httpUrl4, httpUrl2, httpUrl5, httpUrl6, apiSafetyLabelsLessonSlide3.getType() != ApiSafetyLabelsLessonSlide2.ANIMATION, apiSafetyLabelsLessonSlide3.getFirstToggleLabel(), apiSafetyLabelsLessonSlide3.getSecondToggleLabel(), SafetyLabelsLessonSection.SlidesContent.LabelSelection.LEFT);
                                                c3458412 = c345841;
                                                it = it6;
                                                textContent = slidesContent;
                                                collection = collection5;
                                                arrayList.add(textContent);
                                                arrayList = collection;
                                                if (!it.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                break;
            case 1:
                arrayList = (Collection) c345841.L$2;
                Iterator it7 = (Iterator) c345841.L$1;
                Collection collection6 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                c3458412 = c345841;
                it2 = it7;
                collection = collection6;
                ApiSafetyLabelsLessonSection apiSafetyLabelsLessonSection2 = (ApiSafetyLabelsLessonSection) ((EntryResource) objLoadAssetResourceUrl2).getValue();
                i = WhenMappings.$EnumSwitchMapping$0[apiSafetyLabelsLessonSection2.getType().ordinal()];
                if (i == 1) {
                }
                break;
            case 2:
                arrayList = (Collection) c345841.L$2;
                it3 = (Iterator) c345841.L$1;
                collection2 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide42 = (ApiSafetyLabelsLessonSlide) ((EntryResource) objLoadAssetResourceUrl2).getValue();
                ResourceLink<AssetResource<?>> dayFirstAsset2 = apiSafetyLabelsLessonSlide42.getDayFirstAsset();
                c345841.L$0 = collection2;
                c345841.L$1 = it3;
                c345841.L$2 = apiSafetyLabelsLessonSlide42;
                c345841.L$3 = arrayList;
                c345841.label = 3;
                objLoadAssetResourceUrl = loadAssetResourceUrl(dayFirstAsset2, c345841);
                if (objLoadAssetResourceUrl != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                arrayList = (Collection) c345841.L$3;
                ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide5 = (ApiSafetyLabelsLessonSlide) c345841.L$2;
                Iterator it8 = (Iterator) c345841.L$1;
                Collection collection7 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                collection3 = collection7;
                it4 = it8;
                apiSafetyLabelsLessonSlide = apiSafetyLabelsLessonSlide5;
                httpUrl = (HttpUrl) objLoadAssetResourceUrl2;
                nightFirstAsset = apiSafetyLabelsLessonSlide.getNightFirstAsset();
                if (nightFirstAsset == null) {
                }
                break;
            case 4:
                arrayList = (Collection) c345841.L$4;
                httpUrl = (HttpUrl) c345841.L$3;
                apiSafetyLabelsLessonSlide = (ApiSafetyLabelsLessonSlide) c345841.L$2;
                it4 = (Iterator) c345841.L$1;
                collection3 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                collection4 = collection3;
                it5 = it4;
                apiSafetyLabelsLessonSlide2 = apiSafetyLabelsLessonSlide;
                httpUrl3 = httpUrl;
                httpUrl2 = (HttpUrl) objLoadAssetResourceUrl2;
                daySecondAsset = apiSafetyLabelsLessonSlide2.getDaySecondAsset();
                if (daySecondAsset == null) {
                }
                break;
            case 5:
                arrayList = (Collection) c345841.L$5;
                httpUrl2 = (HttpUrl) c345841.L$4;
                httpUrl3 = (HttpUrl) c345841.L$3;
                apiSafetyLabelsLessonSlide2 = (ApiSafetyLabelsLessonSlide) c345841.L$2;
                it5 = (Iterator) c345841.L$1;
                collection4 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                collection5 = collection4;
                it6 = it5;
                apiSafetyLabelsLessonSlide3 = apiSafetyLabelsLessonSlide2;
                httpUrl4 = httpUrl3;
                httpUrl5 = (HttpUrl) objLoadAssetResourceUrl2;
                nightSecondAsset = apiSafetyLabelsLessonSlide3.getNightSecondAsset();
                if (nightSecondAsset == null) {
                }
                break;
            case 6:
                arrayList = (Collection) c345841.L$6;
                httpUrl2 = (HttpUrl) c345841.L$5;
                httpUrl5 = (HttpUrl) c345841.L$4;
                httpUrl4 = (HttpUrl) c345841.L$3;
                apiSafetyLabelsLessonSlide3 = (ApiSafetyLabelsLessonSlide) c345841.L$2;
                it6 = (Iterator) c345841.L$1;
                collection5 = (Collection) c345841.L$0;
                ResultKt.throwOnFailure(objLoadAssetResourceUrl2);
                httpUrl6 = (HttpUrl) objLoadAssetResourceUrl2;
                ?? slidesContent2 = new SafetyLabelsLessonSection.SlidesContent(apiSafetyLabelsLessonSlide3.getTitle(), httpUrl4, httpUrl2, httpUrl5, httpUrl6, apiSafetyLabelsLessonSlide3.getType() != ApiSafetyLabelsLessonSlide2.ANIMATION, apiSafetyLabelsLessonSlide3.getFirstToggleLabel(), apiSafetyLabelsLessonSlide3.getSecondToggleLabel(), SafetyLabelsLessonSection.SlidesContent.LabelSelection.LEFT);
                c3458412 = c345841;
                it = it6;
                textContent = slidesContent2;
                collection = collection5;
                arrayList.add(textContent);
                arrayList = collection;
                if (!it.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAssetResourceUrl(ResourceLink<AssetResource<?>> resourceLink, Continuation<? super HttpUrl> continuation) {
        C345851 c345851;
        if (continuation instanceof C345851) {
            c345851 = (C345851) continuation;
            int i = c345851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c345851.label = i - Integer.MIN_VALUE;
            } else {
                c345851 = new C345851(continuation);
            }
        }
        C345851 c3458512 = c345851;
        Object objLoad$default = c3458512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3458512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            c3458512.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, c3458512, 2, null);
            if (objLoad$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoad$default);
        }
        return ((AssetResource) objLoad$default).getContent().getFile().getUrl();
    }
}
