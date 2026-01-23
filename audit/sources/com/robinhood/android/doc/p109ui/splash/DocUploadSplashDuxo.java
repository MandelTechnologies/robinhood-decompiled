package com.robinhood.android.doc.p109ui.splash;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.splash.DocUploadSplashDuxo;
import com.robinhood.android.doc.p109ui.splash.DocUploadSplashViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SinglesKt;
import java.util.Comparator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DocUploadSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00152\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "api", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/api/docupload/DocUploadApi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "loadData", "takePhoto", "loadMarkdown", "Lio/reactivex/Single;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "documentType", "Lcom/robinhood/models/api/IdDocument$Type;", "loadSides", "", "Lcom/robinhood/models/api/IdDocument$Side;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "backRequired", "", "(Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;Ljava/lang/Boolean;)Lio/reactivex/Single;", "checkForSidesRemote", "determineSidesForIdenti", "idDocumentType", "documentRequestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadSplashDuxo extends OldBaseDuxo<DocUploadSplashViewState> implements HasSavedState {
    private static final String PDF_ENABLED_BANK_STATEMENT_SPLASH_ID = "69Qdq2GdAecc7H94a4tqxH";
    private static final String PDF_ENABLED_BROKERAGE_STATEMENT_SPLASH_ID = "2SWgHCkTxRrj5waRC9ljSr";
    private static final String PDF_ENABLED_THIRD_PARTY_WIRE_SPLASH_ID = "641QQkpu8t7q4mpYW54fxh";
    private final DocUploadApi api;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocUploadSplashDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDocumentRequest.Type.values().length];
            try {
                iArr[ApiDocumentRequest.Type.LETTER_407.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDocumentRequest.Type.BANK_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDocumentRequest.Type.BROKERAGE_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDocumentRequest.Type.NAME_CHANGE_LEGAL_DOCUMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDocumentRequest.Type.UTILITY_BILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDocumentRequest.Type.SIGNED_CUSTOMER_DOCUMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiDocumentRequest.Type.FOREIGN_PASSPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiDocumentRequest.Type.FOREIGN_BANK_STATEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiDocumentRequest.Type.THIRD_PARTY_WIRE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiDocumentRequest.Type.WIRE_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiDocumentRequest.Type.PERMANENT_RESIDENT_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiDocumentRequest.Type.NATIONAL_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiDocumentRequest.Type.PHOTO_ID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiDocumentRequest.Type.PHOTO_ID_WITH_SELFIE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiDocumentRequest.Type.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiDocumentRequest.Type.THREE_POINT_SELFIE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiDocumentRequest.Type.VIDEO_SELFIE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadSplashDuxo(StaticContentStore staticContentStore, UserStore userStore, DocUploadApi api, SavedStateHandle savedStateHandle) {
        super(DocUploadSplashViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.userStore = userStore;
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        loadData();
    }

    public final void loadData() {
        Companion companion = INSTANCE;
        Single singleDoOnSubscribe = SinglesKt.zipWith(loadSides(((DocUploadDestination.Splash) companion.getArgs((HasSavedState) this)).getDetails(), ((DocUploadDestination.Splash) companion.getArgs((HasSavedState) this)).getBackRequired()), loadMarkdown(((DocUploadDestination.Splash) companion.getArgs((HasSavedState) this)).getDetails().getDocumentType())).doOnSubscribe(new C144261());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSplashDuxo.loadData$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSplashDuxo.loadData$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: DocUploadSplashDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$loadData$1 */
    static final class C144261<T> implements Consumer {
        C144261() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DocUploadSplashViewState accept$lambda$0(DocUploadSplashViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DocUploadSplashViewState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DocUploadSplashDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$loadData$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadSplashDuxo.C144261.accept$lambda$0((DocUploadSplashViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$1(DocUploadSplashDuxo docUploadSplashDuxo, Tuples2 tuples2) {
        final List list = (List) tuples2.component1();
        final OtherMarkdown otherMarkdown = (OtherMarkdown) tuples2.component2();
        docUploadSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSplashDuxo.loadData$lambda$1$lambda$0(otherMarkdown, list, (DocUploadSplashViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadSplashViewState loadData$lambda$1$lambda$0(OtherMarkdown otherMarkdown, List list, DocUploadSplashViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DocUploadSplashViewState.Loaded(otherMarkdown.getTitle(), otherMarkdown.getMarkdown2(), list, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$3(DocUploadSplashDuxo docUploadSplashDuxo, final Throwable error) {
        final DocUploadSplashViewState2 docUploadSplashViewState2;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof UnsupportedSideException) {
            docUploadSplashViewState2 = DocUploadSplashViewState2.UPDATE_REQUIRED;
        } else {
            docUploadSplashViewState2 = DocUploadSplashViewState2.LOADING_REQUIREMENTS_FAILED;
        }
        docUploadSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSplashDuxo.loadData$lambda$3$lambda$2(error, docUploadSplashViewState2, (DocUploadSplashViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadSplashViewState loadData$lambda$3$lambda$2(Throwable th, DocUploadSplashViewState2 docUploadSplashViewState2, DocUploadSplashViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DocUploadSplashViewState.Error(th, new UiEvent(docUploadSplashViewState2));
    }

    public final void takePhoto() {
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSplashDuxo.takePhoto$lambda$4((DocUploadSplashViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadSplashViewState takePhoto$lambda$4(DocUploadSplashViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation instanceof DocUploadSplashViewState.Loaded ? DocUploadSplashViewState.Loaded.copy$default((DocUploadSplashViewState.Loaded) applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), 7, null) : applyMutation;
    }

    /* compiled from: DocUploadSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$loadMarkdown$1", m3645f = "DocUploadSplashDuxo.kt", m3646l = {83, 86, 89, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$loadMarkdown$1 */
    static final class C144271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OtherMarkdown>, Object> {
        final /* synthetic */ IdDocument.Type $documentType;
        int label;
        final /* synthetic */ DocUploadSplashDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144271(IdDocument.Type type2, DocUploadSplashDuxo docUploadSplashDuxo, Continuation<? super C144271> continuation) {
            super(2, continuation);
            this.$documentType = type2;
            this.this$0 = docUploadSplashDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C144271(this.$documentType, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OtherMarkdown> continuation) {
            return ((C144271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r14 == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            if (r14 == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        
            if (r14 == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
        
            if (r14 != r0) goto L52;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C144271 c144271;
            CountryCode.Supported locality;
            String alternativeGbSplashId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$documentType == IdDocument.Type.BANK_STATEMENT && ((DocUploadDestination.Splash) DocUploadSplashDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEnabledFileUpload()) {
                    StaticContentStore staticContentStore = this.this$0.staticContentStore;
                    this.label = 1;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, DocUploadSplashDuxo.PDF_ENABLED_BANK_STATEMENT_SPLASH_ID, null, this, 2, null);
                } else if (this.$documentType == IdDocument.Type.BROKERAGE_STATEMENT && ((DocUploadDestination.Splash) DocUploadSplashDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEnabledFileUpload()) {
                    StaticContentStore staticContentStore2 = this.this$0.staticContentStore;
                    this.label = 2;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore2, DocUploadSplashDuxo.PDF_ENABLED_BROKERAGE_STATEMENT_SPLASH_ID, null, this, 2, null);
                } else if (this.$documentType == IdDocument.Type.THIRD_PARTY_WIRE) {
                    StaticContentStore staticContentStore3 = this.this$0.staticContentStore;
                    this.label = 3;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore3, DocUploadSplashDuxo.PDF_ENABLED_THIRD_PARTY_WIRE_SPLASH_ID, null, this, 2, null);
                } else {
                    c144271 = this;
                    Observable<User> user = c144271.this$0.userStore.getUser();
                    c144271.label = 4;
                    obj = RxAwait3.awaitFirst(user, this);
                    if (obj != coroutine_suspended) {
                        locality = ((User) obj).getOrigin().getLocality();
                        alternativeGbSplashId = c144271.$documentType.getContentfulBundle().getAlternativeGbSplashId();
                        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                        }
                        alternativeGbSplashId = c144271.$documentType.getContentfulBundle().getSplashId();
                        StaticContentStore staticContentStore4 = c144271.this$0.staticContentStore;
                        c144271.label = 5;
                        obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore4, alternativeGbSplashId, null, c144271, 2, null);
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (OtherMarkdown) ((EntryResource) obj).getValue();
            }
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return (OtherMarkdown) ((EntryResource) obj).getValue();
            }
            if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return (OtherMarkdown) ((EntryResource) obj).getValue();
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (OtherMarkdown) ((EntryResource) obj).getValue();
            }
            ResultKt.throwOnFailure(obj);
            c144271 = this;
            locality = ((User) obj).getOrigin().getLocality();
            alternativeGbSplashId = c144271.$documentType.getContentfulBundle().getAlternativeGbSplashId();
            if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) || alternativeGbSplashId == null) {
                alternativeGbSplashId = c144271.$documentType.getContentfulBundle().getSplashId();
            }
            StaticContentStore staticContentStore42 = c144271.this$0.staticContentStore;
            c144271.label = 5;
            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore42, alternativeGbSplashId, null, c144271, 2, null);
        }
    }

    private final Single<OtherMarkdown> loadMarkdown(IdDocument.Type documentType) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C144271(documentType, this, null), 1, null);
    }

    private final Single<List<IdDocument.Side>> loadSides(UploadFlowDetails details, Boolean backRequired) {
        List listListOf;
        switch (WhenMappings.$EnumSwitchMapping$0[details.getRequestType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Single<List<IdDocument.Side>> singleJust = Single.just(CollectionsKt.listOf(IdDocument.Side.FRONT));
                Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
                return singleJust;
            case 11:
                Single<List<IdDocument.Side>> singleJust2 = Single.just(CollectionsKt.listOf((Object[]) new IdDocument.Side[]{IdDocument.Side.FRONT, IdDocument.Side.BACK}));
                Intrinsics.checkNotNullExpressionValue(singleJust2, "just(...)");
                return singleJust2;
            case 12:
                if (backRequired != null) {
                    if (backRequired.booleanValue()) {
                        listListOf = CollectionsKt.listOf((Object[]) new IdDocument.Side[]{IdDocument.Side.FRONT, IdDocument.Side.BACK});
                    } else {
                        listListOf = CollectionsKt.listOf(IdDocument.Side.FRONT);
                    }
                    Single<List<IdDocument.Side>> singleJust3 = Single.just(listListOf);
                    if (singleJust3 != null) {
                        return singleJust3;
                    }
                }
                return checkForSidesRemote(details);
            case 13:
            case 14:
            case 15:
                return checkForSidesRemote(details);
            case 16:
            case 17:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(details);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Single<List<IdDocument.Side>> checkForSidesRemote(UploadFlowDetails details) {
        return determineSidesForIdenti(details.getDocumentType(), details.getRequestType());
    }

    /* compiled from: DocUploadSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/IdDocument$Side;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$determineSidesForIdenti$1", m3645f = "DocUploadSplashDuxo.kt", m3646l = {156}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$determineSidesForIdenti$1 */
    static final class C144251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends IdDocument.Side>>, Object> {
        final /* synthetic */ ApiDocumentRequest.Type $documentRequestType;
        final /* synthetic */ IdDocument.Type $idDocumentType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144251(ApiDocumentRequest.Type type2, IdDocument.Type type3, Continuation<? super C144251> continuation) {
            super(2, continuation);
            this.$documentRequestType = type2;
            this.$idDocumentType = type3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadSplashDuxo.this.new C144251(this.$documentRequestType, this.$idDocumentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends IdDocument.Side>> continuation) {
            return ((C144251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws UnsupportedSideException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DocUploadApi docUploadApi = DocUploadSplashDuxo.this.api;
                ApiDocumentRequest.Type type2 = this.$documentRequestType;
                IdDocument.Type type3 = this.$idDocumentType;
                this.label = 1;
                obj = docUploadApi.getDocumentSides(type2, type3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            IdDocument.SidesResponse sidesResponse = (IdDocument.SidesResponse) obj;
            if (sidesResponse.getSides().contains(IdDocument.Side.UNKNOWN)) {
                throw new UnsupportedSideException();
            }
            return CollectionsKt.sortedWith(sidesResponse.getSides(), new Comparator() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashDuxo$determineSidesForIdenti$1$invokeSuspend$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((IdDocument.Side) t).ordinal()), Integer.valueOf(((IdDocument.Side) t2).ordinal()));
                }
            });
        }
    }

    private final Single<List<IdDocument.Side>> determineSidesForIdenti(IdDocument.Type idDocumentType, ApiDocumentRequest.Type documentRequestType) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C144251(documentRequestType, idDocumentType, null), 1, null);
    }

    /* compiled from: DocUploadSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashDuxo;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Splash;", "<init>", "()V", "PDF_ENABLED_BANK_STATEMENT_SPLASH_ID", "", "PDF_ENABLED_BROKERAGE_STATEMENT_SPLASH_ID", "PDF_ENABLED_THIRD_PARTY_WIRE_SPLASH_ID", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadSplashDuxo, DocUploadDestination.Splash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.Splash getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadDestination.Splash) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.Splash getArgs(DocUploadSplashDuxo docUploadSplashDuxo) {
            return (DocUploadDestination.Splash) DuxoCompanion.DefaultImpls.getArgs(this, docUploadSplashDuxo);
        }
    }
}
