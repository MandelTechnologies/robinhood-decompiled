package com.robinhood.android.doc.p109ui.initial;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.doc.p109ui.initial.DocUploadInitialIdentiFragment;
import com.robinhood.android.doc.p109ui.initial.DocUploadInitialIdentiViewState;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SddrRegionGate;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.models.api.UserRegion;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest2;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001bH\u0081@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0081@¢\u0006\u0004\b!\u0010\u001dJ\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010$J*\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "getGdprApplicable", "", "getGdprApplicable$feature_doc_upload_externalRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentRequestsStates", "", "Lcom/robinhood/models/ui/DocumentRequest;", "getDocumentRequestsStates$feature_doc_upload_externalRelease", "injectServerDrivenContent", "requests", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processByRequestIds", "documentRequests", "requestIds", "Ljava/util/UUID;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadInitialIdentiDuxo extends BaseDuxo4<DocUploadInitialIdentiViewState> implements HasSavedState {
    private final AuthManager authManager;
    private final CryptoResidencyDocumentStore cryptoResidencyDocumentStore;
    private final DocumentRequestStore documentRequestStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserRegionStore userRegionStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<ApiDocumentRequest.Type> CLIENT_DRIVEN_DOC_REQUEST_TYPES = CollectionsKt.listOf((Object[]) new ApiDocumentRequest.Type[]{ApiDocumentRequest.Type.PHOTO_ID, ApiDocumentRequest.Type.PHOTO_ID_WITH_SELFIE, ApiDocumentRequest.Type.THREE_POINT_SELFIE, ApiDocumentRequest.Type.VIDEO_SELFIE});

    /* compiled from: DocUploadInitialIdentiDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "injectServerDrivenContent")
    /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$injectServerDrivenContent$1 */
    static final class C143531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C143531(Continuation<? super C143531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DocUploadInitialIdentiDuxo.this.injectServerDrivenContent(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocUploadInitialIdentiDuxo(DocumentRequestStore documentRequestStore, UserStore userStore, UserRegionStore userRegionStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, RegionGateProvider regionGateProvider, AuthManager authManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(DocUploadInitialIdentiViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.documentRequestStore = documentRequestStore;
        this.userStore = userStore;
        this.userRegionStore = userRegionStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.regionGateProvider = regionGateProvider;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C143541(null));
    }

    /* compiled from: DocUploadInitialIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {52, 53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1 */
    static final class C143541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143541(Continuation<? super C143541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143541 c143541 = DocUploadInitialIdentiDuxo.this.new C143541(continuation);
            c143541.L$0 = obj;
            return c143541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            Deferred deferred2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                DocUploadInitialIdentiDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new DocUploadInitialIdentiDuxo9(DocUploadInitialIdentiDuxo.this, null), 3, null);
                DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo = DocUploadInitialIdentiDuxo.this;
                this.L$0 = deferredAsync$default;
                this.label = 1;
                Object documentRequestsStates$feature_doc_upload_externalRelease = docUploadInitialIdentiDuxo.getDocumentRequestsStates$feature_doc_upload_externalRelease(this);
                if (documentRequestsStates$feature_doc_upload_externalRelease == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred = deferredAsync$default;
                obj = documentRequestsStates$feature_doc_upload_externalRelease;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deferred2 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    DocUploadInitialIdentiDuxo.this.applyMutation(new AnonymousClass1((List) obj, deferred2, null));
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo2 = DocUploadInitialIdentiDuxo.this;
            this.L$0 = deferred;
            this.label = 2;
            obj = docUploadInitialIdentiDuxo2.injectServerDrivenContent((List) obj, this);
            if (obj != coroutine_suspended) {
                deferred2 = deferred;
                DocUploadInitialIdentiDuxo.this.applyMutation(new AnonymousClass1((List) obj, deferred2, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: DocUploadInitialIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$1", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DocUploadInitialIdentiViewState, Continuation<? super DocUploadInitialIdentiViewState>, Object> {
            final /* synthetic */ List<DocumentRequest> $injectedRequests;
            final /* synthetic */ Deferred<Boolean> $isGdpr;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<DocumentRequest> list, Deferred<Boolean> deferred, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$injectedRequests = list;
                this.$isGdpr = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$injectedRequests, this.$isGdpr, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocUploadInitialIdentiViewState docUploadInitialIdentiViewState, Continuation<? super DocUploadInitialIdentiViewState> continuation) {
                return ((AnonymousClass1) create(docUploadInitialIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                List<DocumentRequest> list;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List<DocumentRequest> list2 = this.$injectedRequests;
                    Deferred<Boolean> deferred = this.$isGdpr;
                    this.L$0 = list2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new DocUploadInitialIdentiViewState.Loaded(list, ((Boolean) obj).booleanValue());
            }
        }

        /* compiled from: DocUploadInitialIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$2", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DocUploadInitialIdentiViewState, Continuation<? super DocUploadInitialIdentiViewState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Throwable f4114$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4114$e = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.f4114$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocUploadInitialIdentiViewState docUploadInitialIdentiViewState, Continuation<? super DocUploadInitialIdentiViewState> continuation) {
                return ((AnonymousClass2) create(docUploadInitialIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new DocUploadInitialIdentiViewState.Error(new UiEvent(this.f4114$e));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGdprApplicable$feature_doc_upload_externalRelease(Continuation<? super Boolean> continuation) {
        DocUploadInitialIdentiDuxo7 docUploadInitialIdentiDuxo7;
        boolean zIsGdprApplicable;
        String origin;
        if (continuation instanceof DocUploadInitialIdentiDuxo7) {
            docUploadInitialIdentiDuxo7 = (DocUploadInitialIdentiDuxo7) continuation;
            int i = docUploadInitialIdentiDuxo7.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                docUploadInitialIdentiDuxo7.label = i - Integer.MIN_VALUE;
            } else {
                docUploadInitialIdentiDuxo7 = new DocUploadInitialIdentiDuxo7(this, continuation);
            }
        }
        Object objCoGetCurrentRegion = docUploadInitialIdentiDuxo7.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = docUploadInitialIdentiDuxo7.label;
        boolean zBooleanValue = false;
        try {
        } catch (Exception unused) {
            zIsGdprApplicable = false;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoGetCurrentRegion);
            if (this.authManager.isLoggedIn()) {
                Observable observableOnErrorReturnItem = this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getGdprApplicable$2
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(User it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(it.getOrigin().getLocality().isGdprApplicable());
                    }
                }).onErrorReturnItem(boxing.boxBoolean(false));
                Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
                docUploadInitialIdentiDuxo7.label = 1;
                objCoGetCurrentRegion = RxAwait3.awaitFirst(observableOnErrorReturnItem, docUploadInitialIdentiDuxo7);
            } else {
                Iterator<T> it = ((DocUploadInitialIdentiFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDocRequests().iterator();
                do {
                    origin = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    DocumentRequest.User user = ((DocumentRequest) it.next()).getUser();
                    if (user != null) {
                        origin = user.getOrigin();
                    }
                } while (origin == null);
                if (origin == null) {
                    UserRegionStore userRegionStore = this.userRegionStore;
                    docUploadInitialIdentiDuxo7.label = 2;
                    objCoGetCurrentRegion = userRegionStore.coGetCurrentRegion(docUploadInitialIdentiDuxo7);
                }
                zIsGdprApplicable = CountryCode.INSTANCE.getInstance(origin).isGdprApplicable();
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objCoGetCurrentRegion);
            Intrinsics.checkNotNull(objCoGetCurrentRegion);
            zBooleanValue = ((Boolean) objCoGetCurrentRegion).booleanValue();
            return boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objCoGetCurrentRegion);
        origin = ((UserRegion) objCoGetCurrentRegion).getRegion();
        zIsGdprApplicable = CountryCode.INSTANCE.getInstance(origin).isGdprApplicable();
        if (zIsGdprApplicable) {
            zBooleanValue = true;
        }
        return boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r8 == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012f -> B:44:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01d5 -> B:73:0x01d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDocumentRequestsStates$feature_doc_upload_externalRelease(Continuation<? super List<DocumentRequest>> continuation) {
        DocUploadInitialIdentiDuxo2 docUploadInitialIdentiDuxo2;
        Collection arrayList;
        Iterator it;
        Collection arrayList2;
        Iterator it2;
        if (continuation instanceof DocUploadInitialIdentiDuxo2) {
            docUploadInitialIdentiDuxo2 = (DocUploadInitialIdentiDuxo2) continuation;
            int i = docUploadInitialIdentiDuxo2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                docUploadInitialIdentiDuxo2.label = i - Integer.MIN_VALUE;
            } else {
                docUploadInitialIdentiDuxo2 = new DocUploadInitialIdentiDuxo2(this, continuation);
            }
        }
        Object objAwait = docUploadInitialIdentiDuxo2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = docUploadInitialIdentiDuxo2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Companion companion = INSTANCE;
            if (((DocUploadInitialIdentiFragment.Args) companion.getArgs((HasSavedState) this)).getMockRequests()) {
                return ((DocUploadInitialIdentiFragment.Args) companion.getArgs((HasSavedState) this)).getDocRequests();
            }
            List<DocumentRequest> docRequests = ((DocUploadInitialIdentiFragment.Args) companion.getArgs((HasSavedState) this)).getDocRequests();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = docRequests.iterator();
            while (it3.hasNext()) {
                UUID id = ((DocumentRequest) it3.next()).getId();
                if (id != null) {
                    arrayList3.add(id);
                }
            }
            final List listDistinct = CollectionsKt.distinct(arrayList3);
            if (this.authManager.isLoggedIn()) {
                Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocUploadInitialIdentiDuxo6(this, null), 1, null);
                Single singleOnErrorReturnItem = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocUploadInitialIdentiDuxo4(this, null), 1, null).map(new Function() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$cryptoResidencyDocSingle$2
                    @Override // io.reactivex.functions.Function
                    public final List<DocumentRequest> apply(PaginatedResult<ApiResidencyDocument> it4) {
                        Intrinsics.checkNotNullParameter(it4, "it");
                        List<ApiResidencyDocument> results = it4.getResults();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                        Iterator<T> it5 = results.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(DocumentRequest2.toDocumentRequest((ApiResidencyDocument) it5.next()));
                        }
                        return arrayList4;
                    }
                }).onErrorReturnItem(CollectionsKt.emptyList());
                Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
                Single singleZip = Single.zip(singleRxSingle$default, singleOnErrorReturnItem, new BiFunction() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$2
                    @Override // io.reactivex.functions.BiFunction
                    public final List<DocumentRequest> apply(List<DocumentRequest> docs, List<DocumentRequest> cryptoDocs) {
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        Intrinsics.checkNotNullParameter(cryptoDocs, "cryptoDocs");
                        return this.this$0.processByRequestIds(CollectionsKt.plus((Collection) docs, (Iterable) cryptoDocs), listDistinct);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleZip, "zip(...)");
                docUploadInitialIdentiDuxo2.label = 1;
                objAwait = RxAwait3.await(singleZip, docUploadInitialIdentiDuxo2);
            } else if (((DocUploadInitialIdentiFragment.Args) INSTANCE.getArgs((HasSavedState) this)).isOnboardingOnly()) {
                List list = listDistinct;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                if (it2.hasNext()) {
                }
            } else {
                List list2 = listDistinct;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                if (it.hasNext()) {
                }
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objAwait);
        } else if (i2 == 2) {
            arrayList2 = (Collection) docUploadInitialIdentiDuxo2.L$2;
            it2 = (Iterator) docUploadInitialIdentiDuxo2.L$1;
            Collection collection = (Collection) docUploadInitialIdentiDuxo2.L$0;
            ResultKt.throwOnFailure(objAwait);
            arrayList2.add((DocumentRequest) objAwait);
            arrayList2 = collection;
            if (it2.hasNext()) {
                UUID uuid = (UUID) it2.next();
                DocumentRequestStore documentRequestStore = this.documentRequestStore;
                docUploadInitialIdentiDuxo2.L$0 = arrayList2;
                docUploadInitialIdentiDuxo2.L$1 = it2;
                docUploadInitialIdentiDuxo2.L$2 = arrayList2;
                docUploadInitialIdentiDuxo2.label = 2;
                objAwait = documentRequestStore.getDocumentRequest(uuid, docUploadInitialIdentiDuxo2);
                if (objAwait != coroutine_suspended) {
                    collection = arrayList2;
                    arrayList2.add((DocumentRequest) objAwait);
                    arrayList2 = collection;
                    if (it2.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : (List) arrayList2) {
                            if (((DocumentRequest) obj).getState() == ApiDocumentRequest.State.PENDING_UPLOAD) {
                                arrayList4.add(obj);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            List<ApiDocumentRequest.Reason> reasons = ((DocumentRequest) obj2).getReasons();
                            if (!(reasons instanceof Collection) || !reasons.isEmpty()) {
                                Iterator<T> it4 = reasons.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (ApiDocumentRequest.Reason.INSTANCE.getONBOARDING_SUPPORTED_REASONS().contains((ApiDocumentRequest.Reason) it4.next())) {
                                            arrayList5.add(obj2);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return arrayList5;
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) docUploadInitialIdentiDuxo2.L$2;
            it = (Iterator) docUploadInitialIdentiDuxo2.L$1;
            Collection collection2 = (Collection) docUploadInitialIdentiDuxo2.L$0;
            ResultKt.throwOnFailure(objAwait);
            arrayList.add((DocumentRequest) objAwait);
            arrayList = collection2;
            if (it.hasNext()) {
                UUID uuid2 = (UUID) it.next();
                DocumentRequestStore documentRequestStore2 = this.documentRequestStore;
                docUploadInitialIdentiDuxo2.L$0 = arrayList;
                docUploadInitialIdentiDuxo2.L$1 = it;
                docUploadInitialIdentiDuxo2.L$2 = arrayList;
                docUploadInitialIdentiDuxo2.label = 3;
                objAwait = documentRequestStore2.getDocumentRequest(uuid2, docUploadInitialIdentiDuxo2);
                if (objAwait != coroutine_suspended) {
                    collection2 = arrayList;
                    arrayList.add((DocumentRequest) objAwait);
                    arrayList = collection2;
                    if (it.hasNext()) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj3 : (List) arrayList) {
                            if (((DocumentRequest) obj3).getState() == ApiDocumentRequest.State.PENDING_UPLOAD) {
                                arrayList6.add(obj3);
                            }
                        }
                        return arrayList6;
                    }
                }
                return coroutine_suspended;
            }
        }
        Intrinsics.checkNotNull(objAwait);
        return (List) objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r2 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c2 -> B:38:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object injectServerDrivenContent(List<DocumentRequest> list, Continuation<? super List<DocumentRequest>> continuation) {
        C143531 c143531;
        Iterator it;
        Collection collection;
        ApiDocumentRequestContent apiDocumentRequestContent;
        List<DocumentRequest> list2 = list;
        if (continuation instanceof C143531) {
            c143531 = (C143531) continuation;
            int i = c143531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c143531.label = i - Integer.MIN_VALUE;
            } else {
                c143531 = new C143531(continuation);
            }
        }
        C143531 c1435312 = c143531;
        Object regionGateState$default = c1435312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1435312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            if (!this.authManager.isLoggedIn()) {
                return list2;
            }
            RegionGateProvider regionGateProvider = this.regionGateProvider;
            SddrRegionGate sddrRegionGate = SddrRegionGate.INSTANCE;
            c1435312.L$0 = list2;
            c1435312.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, sddrRegionGate, false, c1435312, 2, null);
        } else if (i2 == 1) {
            list2 = (List) c1435312.L$0;
            ResultKt.throwOnFailure(regionGateState$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) c1435312.L$3;
            DocumentRequest documentRequestCopy$default = (DocumentRequest) c1435312.L$2;
            it = (Iterator) c1435312.L$1;
            Collection collection2 = (Collection) c1435312.L$0;
            try {
                ResultKt.throwOnFailure(regionGateState$default);
            } catch (Throwable unused) {
                apiDocumentRequestContent = null;
            }
            apiDocumentRequestContent = (ApiDocumentRequestContent) regionGateState$default;
            documentRequestCopy$default = DocumentRequest.copy$default(documentRequestCopy$default, null, null, null, null, false, null, null, null, null, null, apiDocumentRequestContent, 1023, null);
            collection.add(documentRequestCopy$default);
            collection = collection2;
            if (!it.hasNext()) {
                documentRequestCopy$default = (DocumentRequest) it.next();
                UUID id = documentRequestCopy$default.getId();
                if (!CLIENT_DRIVEN_DOC_REQUEST_TYPES.contains(documentRequestCopy$default.getType()) && id != null) {
                    try {
                    } catch (Throwable unused2) {
                        collection2 = collection;
                        apiDocumentRequestContent = null;
                    }
                    DocumentRequestStore documentRequestStore = this.documentRequestStore;
                    c1435312.L$0 = collection;
                    c1435312.L$1 = it;
                    c1435312.L$2 = documentRequestCopy$default;
                    c1435312.L$3 = collection;
                    c1435312.label = 2;
                    regionGateState$default = documentRequestStore.getDocumentRequestContentById(id, c1435312);
                    if (regionGateState$default != coroutine_suspended) {
                        collection2 = collection;
                        apiDocumentRequestContent = (ApiDocumentRequestContent) regionGateState$default;
                        documentRequestCopy$default = DocumentRequest.copy$default(documentRequestCopy$default, null, null, null, null, false, null, null, null, null, null, apiDocumentRequestContent, 1023, null);
                        collection.add(documentRequestCopy$default);
                        collection = collection2;
                        if (!it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                }
                collection2 = collection;
                collection.add(documentRequestCopy$default);
                collection = collection2;
                if (!it.hasNext()) {
                    return (List) collection;
                }
            }
        }
        if (!((Boolean) regionGateState$default).booleanValue()) {
            return list2;
        }
        List<DocumentRequest> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        it = list3.iterator();
        collection = arrayList;
        if (!it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DocumentRequest> processByRequestIds(List<DocumentRequest> documentRequests, final List<UUID> requestIds) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : documentRequests) {
            if (CollectionsKt.contains(requestIds, ((DocumentRequest) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$processByRequestIds$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(CollectionsKt.indexOf((List<? extends UUID>) requestIds, ((DocumentRequest) t).getId())), Integer.valueOf(CollectionsKt.indexOf((List<? extends UUID>) requestIds, ((DocumentRequest) t2).getId())));
            }
        });
    }

    /* compiled from: DocUploadInitialIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiDuxo;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment$Args;", "<init>", "()V", "CLIENT_DRIVEN_DOC_REQUEST_TYPES", "", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadInitialIdentiDuxo, DocUploadInitialIdentiFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadInitialIdentiFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadInitialIdentiFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadInitialIdentiFragment.Args getArgs(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo) {
            return (DocUploadInitialIdentiFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, docUploadInitialIdentiDuxo);
        }
    }
}
