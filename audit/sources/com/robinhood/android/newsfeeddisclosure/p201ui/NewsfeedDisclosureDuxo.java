package com.robinhood.android.newsfeeddisclosure.p201ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.education.contracts.NewsfeedDisclosureKey;
import com.robinhood.android.newsfeeddisclosure.p201ui.NewsfeedDisclosureDataState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.models.p355ui.UiExpandableContent;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContent;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContentSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: NewsfeedDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState;", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "onStart", "", "retrieveDisclosureContent", "Companion", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NewsfeedDisclosureDuxo extends BaseDuxo<NewsfeedDisclosureDataState, NewsfeedDisclosureViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsfeedDisclosureDuxo(StaticContentStore staticContentStore, SavedStateHandle savedStateHandle, NewsfeedDisclosureStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new NewsfeedDisclosureDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final String getContentfulId() {
        String contentfulId = ((NewsfeedDisclosureKey) INSTANCE.getArgs((HasSavedState) this)).getContentfulId();
        return contentfulId == null ? "54hpAhcLX86cSJYdQ0nS3Y" : contentfulId;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        retrieveDisclosureContent();
    }

    /* compiled from: NewsfeedDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1", m3645f = "NewsfeedDisclosureDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1 */
    static final class C225901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C225901(Continuation<? super C225901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C225901 c225901 = NewsfeedDisclosureDuxo.this.new C225901(continuation);
            c225901.L$0 = obj;
            return c225901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C225901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C225901 c225901;
            CoroutineScope coroutineScope;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    StaticContentStore staticContentStore = NewsfeedDisclosureDuxo.this.staticContentStore;
                    String contentfulId = NewsfeedDisclosureDuxo.this.getContentfulId();
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    c225901 = this;
                    try {
                        Object objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, c225901, 2, null);
                        if (objLoadEntry$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                        obj = objLoadEntry$default;
                    } catch (Exception unused) {
                        NewsfeedDisclosureDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c225901 = this;
                    coroutineScope = coroutineScope3;
                }
                ApiExpandableContent apiExpandableContent = (ApiExpandableContent) ((EntryResource) obj).getValue();
                List<ResourceLink<EntryResource<ApiExpandableContentSection>>> content = apiExpandableContent.getContent();
                if (content != null) {
                    List<ResourceLink<EntryResource<ApiExpandableContentSection>>> list = content;
                    NewsfeedDisclosureDuxo newsfeedDisclosureDuxo = NewsfeedDisclosureDuxo.this;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new NewsfeedDisclosureDuxo2(newsfeedDisclosureDuxo, (ResourceLink) it.next(), null), 3, null));
                    }
                } else {
                    arrayList = null;
                }
                NewsfeedDisclosureDuxo.this.applyMutation(new AnonymousClass1(apiExpandableContent, arrayList, null));
            } catch (Exception unused2) {
                c225901 = this;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: NewsfeedDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$1", m3645f = "NewsfeedDisclosureDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NewsfeedDisclosureDataState, Continuation<? super NewsfeedDisclosureDataState>, Object> {
            final /* synthetic */ ApiExpandableContent $disclosureContent;
            final /* synthetic */ List<Deferred<UiExpandableContentSection>> $itemList;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(ApiExpandableContent apiExpandableContent, List<? extends Deferred<UiExpandableContentSection>> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosureContent = apiExpandableContent;
                this.$itemList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosureContent, this.$itemList, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NewsfeedDisclosureDataState newsfeedDisclosureDataState, Continuation<? super NewsfeedDisclosureDataState> continuation) {
                return ((AnonymousClass1) create(newsfeedDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                NewsfeedDisclosureDataState newsfeedDisclosureDataState;
                String title;
                MarkdownContent subtitle;
                NewsfeedDisclosureDataState.Result result;
                List list;
                MarkdownContent markdownContent;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    newsfeedDisclosureDataState = (NewsfeedDisclosureDataState) this.L$0;
                    NewsfeedDisclosureDataState.Result result2 = NewsfeedDisclosureDataState.Result.SUCCESS;
                    title = this.$disclosureContent.getTitle();
                    subtitle = this.$disclosureContent.getSubtitle();
                    List<Deferred<UiExpandableContentSection>> list2 = this.$itemList;
                    if (list2 == null) {
                        result = result2;
                        list = null;
                        return newsfeedDisclosureDataState.copy(result, new UiExpandableContent(title, subtitle, list));
                    }
                    this.L$0 = newsfeedDisclosureDataState;
                    this.L$1 = result2;
                    this.L$2 = title;
                    this.L$3 = subtitle;
                    this.label = 1;
                    Object objAwaitAll = Await2.awaitAll(list2, this);
                    if (objAwaitAll == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = result2;
                    obj = objAwaitAll;
                    markdownContent = subtitle;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    markdownContent = (MarkdownContent) this.L$3;
                    title = (String) this.L$2;
                    result = (NewsfeedDisclosureDataState.Result) this.L$1;
                    newsfeedDisclosureDataState = (NewsfeedDisclosureDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                subtitle = markdownContent;
                return newsfeedDisclosureDataState.copy(result, new UiExpandableContent(title, subtitle, list));
            }
        }

        /* compiled from: NewsfeedDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$2", m3645f = "NewsfeedDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureDuxo$retrieveDisclosureContent$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<NewsfeedDisclosureDataState, Continuation<? super NewsfeedDisclosureDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NewsfeedDisclosureDataState newsfeedDisclosureDataState, Continuation<? super NewsfeedDisclosureDataState> continuation) {
                return ((AnonymousClass2) create(newsfeedDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return NewsfeedDisclosureDataState.copy$default((NewsfeedDisclosureDataState) this.L$0, NewsfeedDisclosureDataState.Result.ERROR, null, 2, null);
            }
        }
    }

    public final void retrieveDisclosureContent() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C225901(null), 3, null);
    }

    /* compiled from: NewsfeedDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDuxo;", "Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "<init>", "()V", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NewsfeedDisclosureDuxo, NewsfeedDisclosureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewsfeedDisclosureKey getArgs(SavedStateHandle savedStateHandle) {
            return (NewsfeedDisclosureKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewsfeedDisclosureKey getArgs(NewsfeedDisclosureDuxo newsfeedDisclosureDuxo) {
            return (NewsfeedDisclosureKey) DuxoCompanion.DefaultImpls.getArgs(this, newsfeedDisclosureDuxo);
        }
    }
}
