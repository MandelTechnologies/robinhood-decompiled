package com.robinhood.android.doc.p109ui.photo;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.CameraUtils;
import com.robinhood.android.camera.process.PhotoProcessor;
import com.robinhood.android.camera.process.ProcessPhotoOptions;
import com.robinhood.android.camera.process.ProcessPhotoResult;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.photo.DocUploadCaptureDocumentDuxo;
import com.robinhood.android.doc.p109ui.photo.PhotoEvent;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: DocUploadCaptureDocumentDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0011J&\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "photoProcessor", "Lcom/robinhood/android/camera/process/PhotoProcessor;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/camera/process/PhotoProcessor;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadUserLocalityAndRequirements", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "acceptBlurryPhoto", "processPhoto", "bytes", "", "rotationDegrees", "", GoldFeature.MARGIN, "", "([BIFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reducePhotoResult", "result", "Lcom/robinhood/android/camera/process/ProcessPhotoResult;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadCaptureDocumentDuxo extends OldBaseDuxo<DocUploadCaptureDocumentViewState> implements HasSavedState {
    private final PhotoProcessor photoProcessor;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocUploadCaptureDocumentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo", m3645f = "DocUploadCaptureDocumentDuxo.kt", m3646l = {94}, m3647m = "processPhoto")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$processPhoto$1 */
    static final class C143961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C143961(Continuation<? super C143961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DocUploadCaptureDocumentDuxo.this.processPhoto(null, 0, 0.0f, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadCaptureDocumentDuxo(StaticContentStore staticContentStore, PhotoProcessor photoProcessor, UserStore userStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(photoProcessor, "photoProcessor");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(companion.getInitialState(((DocUploadDestination.CaptureDocument) companion.getArgs(savedStateHandle)).getSide()), null, 2, 0 == true ? 1 : 0);
        this.staticContentStore = staticContentStore;
        this.photoProcessor = photoProcessor;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C143951(null));
    }

    /* compiled from: DocUploadCaptureDocumentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1", m3645f = "DocUploadCaptureDocumentDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1 */
    static final class C143951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143951(Continuation<? super C143951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadCaptureDocumentDuxo.this.new C143951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM28818catch = FlowKt.m28818catch(DocUploadCaptureDocumentDuxo.this.loadUserLocalityAndRequirements(), new AnonymousClass1(DocUploadCaptureDocumentDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(DocUploadCaptureDocumentDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DocUploadCaptureDocumentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$1", m3645f = "DocUploadCaptureDocumentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown>>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocUploadCaptureDocumentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocUploadCaptureDocumentDuxo docUploadCaptureDocumentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = docUploadCaptureDocumentDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Tuples2<? extends CountryCode.Supported, OtherMarkdown>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Tuples2<? extends CountryCode.Supported, OtherMarkdown>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass1(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DocUploadCaptureDocumentDuxo.C143951.AnonymousClass1.invokeSuspend$lambda$0((DocUploadCaptureDocumentViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DocUploadCaptureDocumentViewState invokeSuspend$lambda$0(DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState) {
                return DocUploadCaptureDocumentViewState.copy$default(docUploadCaptureDocumentViewState, false, null, null, null, null, null, 62, null);
            }
        }

        /* compiled from: DocUploadCaptureDocumentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$2", m3645f = "DocUploadCaptureDocumentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocUploadCaptureDocumentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DocUploadCaptureDocumentDuxo docUploadCaptureDocumentDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = docUploadCaptureDocumentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends CountryCode.Supported, OtherMarkdown>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends CountryCode.Supported, OtherMarkdown> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                final CountryCode.Supported supported = (CountryCode.Supported) tuples2.component1();
                final OtherMarkdown otherMarkdown = (OtherMarkdown) tuples2.component2();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DocUploadCaptureDocumentDuxo.C143951.AnonymousClass2.invokeSuspend$lambda$0(supported, otherMarkdown, (DocUploadCaptureDocumentViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DocUploadCaptureDocumentViewState invokeSuspend$lambda$0(CountryCode.Supported supported, OtherMarkdown otherMarkdown, DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState) {
                return DocUploadCaptureDocumentViewState.copy$default(docUploadCaptureDocumentViewState, false, supported, null, otherMarkdown.getTitle(), otherMarkdown.getMarkdown2(), null, 36, null);
            }
        }
    }

    /* compiled from: DocUploadCaptureDocumentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$loadUserLocalityAndRequirements$1", m3645f = "DocUploadCaptureDocumentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 74, 75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$loadUserLocalityAndRequirements$1 */
    static final class C143931 extends ContinuationImpl7 implements Function2<FlowCollector<? super Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C143931(Continuation<? super C143931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143931 c143931 = DocUploadCaptureDocumentDuxo.this.new C143931(continuation);
            c143931.L$0 = obj;
            return c143931;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends CountryCode.Supported, ? extends OtherMarkdown>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Tuples2<? extends CountryCode.Supported, OtherMarkdown>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Tuples2<? extends CountryCode.Supported, OtherMarkdown>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C143931) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
        
            if (r3.emit(r14, r13) != r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IdDocument.Type documentType;
            FlowCollector flowCollector;
            C143931 c143931;
            CountryCode.Supported supported;
            FlowCollector flowCollector2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                documentType = ((DocUploadDestination.CaptureDocument) DocUploadCaptureDocumentDuxo.INSTANCE.getArgs((HasSavedState) DocUploadCaptureDocumentDuxo.this)).getDetails().getDocumentType();
                ObservableSource map = DocUploadCaptureDocumentDuxo.this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$loadUserLocalityAndRequirements$1$userLocality$1
                    @Override // io.reactivex.functions.Function
                    public final CountryCode.Supported apply(User it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getOrigin().getLocality();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                this.L$0 = flowCollector3;
                this.L$1 = documentType;
                this.label = 1;
                Object objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(map, this);
                if (objAwaitFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = flowCollector3;
                obj = objAwaitFirstOrNull;
            } else if (i == 1) {
                documentType = (IdDocument.Type) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                supported = (CountryCode.Supported) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                c143931 = this;
                Tuples2 tuples2M3642to = Tuples4.m3642to(supported, (OtherMarkdown) ((EntryResource) obj).getValue());
                c143931.L$0 = null;
                c143931.L$1 = null;
                c143931.label = 3;
            }
            CountryCode.Supported supported2 = (CountryCode.Supported) obj;
            String alternativeGbRequirementsId = documentType.getContentfulBundle().getAlternativeGbRequirementsId();
            if (!Intrinsics.areEqual(supported2, CountryCode.Supported.UnitedKingdom.INSTANCE) || alternativeGbRequirementsId == null) {
                alternativeGbRequirementsId = documentType.getContentfulBundle().getRequirementsId();
            }
            String str = alternativeGbRequirementsId;
            StaticContentStore staticContentStore = DocUploadCaptureDocumentDuxo.this.staticContentStore;
            this.L$0 = flowCollector;
            this.L$1 = supported2;
            this.label = 2;
            c143931 = this;
            Object objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, c143931, 2, null);
            if (objLoadEntry$default != coroutine_suspended) {
                supported = supported2;
                obj = objLoadEntry$default;
                flowCollector2 = flowCollector;
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(supported, (OtherMarkdown) ((EntryResource) obj).getValue());
                c143931.L$0 = null;
                c143931.L$1 = null;
                c143931.label = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Tuples2<CountryCode.Supported, OtherMarkdown>> loadUserLocalityAndRequirements() {
        return FlowKt.flow(new C143931(null));
    }

    public final void acceptBlurryPhoto() {
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadCaptureDocumentDuxo.acceptBlurryPhoto$lambda$0((DocUploadCaptureDocumentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadCaptureDocumentViewState acceptBlurryPhoto$lambda$0(DocUploadCaptureDocumentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadCaptureDocumentViewState.copy$default(applyMutation, false, null, null, null, null, new UiEvent(PhotoEvent.CaptureComplete.INSTANCE), 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processPhoto(byte[] bArr, int i, float f, Continuation<? super Unit> continuation) {
        C143961 c143961;
        if (continuation instanceof C143961) {
            c143961 = (C143961) continuation;
            int i2 = c143961.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c143961.label = i2 - Integer.MIN_VALUE;
            } else {
                c143961 = new C143961(continuation);
            }
        }
        Object objProcessPhoto = c143961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c143961.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objProcessPhoto);
                Companion companion = INSTANCE;
                ProcessPhotoOptions processPhotoOptions = new ProcessPhotoOptions(((DocUploadDestination.CaptureDocument) companion.getArgs((HasSavedState) this)).getSide().name(), i, ((DocUploadDestination.CaptureDocument) companion.getArgs((HasSavedState) this)).getSide().getCheckBlurriness(), ((DocUploadDestination.CaptureDocument) companion.getArgs((HasSavedState) this)).getDetails().getDocumentType().getAspectRatio(), f);
                PhotoProcessor photoProcessor = this.photoProcessor;
                c143961.label = 1;
                objProcessPhoto = photoProcessor.processPhoto(bArr, processPhotoOptions, c143961);
                if (objProcessPhoto == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objProcessPhoto);
            }
            reducePhotoResult((ProcessPhotoResult) objProcessPhoto);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadCaptureDocumentDuxo.processPhoto$lambda$1(e, (DocUploadCaptureDocumentViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadCaptureDocumentViewState processPhoto$lambda$1(Exception exc, DocUploadCaptureDocumentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadCaptureDocumentViewState.copy$default(applyMutation, false, null, null, null, null, new UiEvent(new PhotoEvent.CapturePhotoError(exc)), 30, null);
    }

    private final void reducePhotoResult(final ProcessPhotoResult result) {
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadCaptureDocumentDuxo.reducePhotoResult$lambda$2(result, (DocUploadCaptureDocumentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadCaptureDocumentViewState reducePhotoResult$lambda$2(ProcessPhotoResult processPhotoResult, DocUploadCaptureDocumentViewState applyMutation) {
        Object obj;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (processPhotoResult.isBlurry()) {
            obj = PhotoEvent.CapturedPhotoIsBlurry.INSTANCE;
        } else {
            obj = PhotoEvent.CaptureComplete.INSTANCE;
        }
        return DocUploadCaptureDocumentViewState.copy$default(applyMutation, false, null, null, null, null, new UiEvent(obj), 30, null);
    }

    /* compiled from: DocUploadCaptureDocumentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentDuxo;", "Lcom/robinhood/android/doc/event/DocUploadDestination$CaptureDocument;", "<init>", "()V", "getInitialState", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentViewState;", "activeSide", "Lcom/robinhood/models/api/IdDocument$Side;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadCaptureDocumentDuxo, DocUploadDestination.CaptureDocument> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.CaptureDocument getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadDestination.CaptureDocument) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.CaptureDocument getArgs(DocUploadCaptureDocumentDuxo docUploadCaptureDocumentDuxo) {
            return (DocUploadDestination.CaptureDocument) DuxoCompanion.DefaultImpls.getArgs(this, docUploadCaptureDocumentDuxo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DocUploadCaptureDocumentViewState getInitialState(IdDocument.Side activeSide) {
            if (CameraUtils.INSTANCE.getCameraSupported()) {
                return new DocUploadCaptureDocumentViewState(true, null, activeSide, null, null, null, 56, null);
            }
            return new DocUploadCaptureDocumentViewState(false, null, activeSide, null, null, new UiEvent(PhotoEvent.CameraUnsupported.INSTANCE), 24, null);
        }
    }
}
