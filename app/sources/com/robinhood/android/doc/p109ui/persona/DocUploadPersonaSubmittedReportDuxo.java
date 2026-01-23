package com.robinhood.android.doc.p109ui.persona;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.doc.p109ui.persona.DocUploadPersonaSubmittedReportFragment;
import com.robinhood.android.doc.p109ui.persona.DocUploadPersonaSubmittedReportViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p370rx.delay.CompletableDelay2;
import io.reactivex.Completable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadPersonaSubmittedReportDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/docupload/DocUploadApi;Landroidx/lifecycle/SavedStateHandle;)V", "getApi", "()Lcom/robinhood/android/api/docupload/DocUploadApi;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadPersonaSubmittedReportDuxo extends OldBaseDuxo<DocUploadPersonaSubmittedReportViewState> implements HasSavedState {
    private final DocUploadApi api;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final DocUploadApi getApi() {
        return this.api;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadPersonaSubmittedReportDuxo(DocUploadApi api, SavedStateHandle savedStateHandle) {
        super(DocUploadPersonaSubmittedReportViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Completable completableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C143581(null), 1, null).onErrorComplete().subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(completableSubscribeOn, 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadPersonaSubmittedReportDuxo.onCreate$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: DocUploadPersonaSubmittedReportDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$onCreate$1", m3645f = "DocUploadPersonaSubmittedReportDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$onCreate$1 */
    static final class C143581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143581(Continuation<? super C143581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143581 c143581 = DocUploadPersonaSubmittedReportDuxo.this.new C143581(continuation);
            c143581.L$0 = obj;
            return c143581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<UUID> documentRequestIds = ((DocUploadPersonaSubmittedReportFragment.Args) DocUploadPersonaSubmittedReportDuxo.INSTANCE.getArgs((HasSavedState) DocUploadPersonaSubmittedReportDuxo.this)).getDocumentRequestIds();
                DocUploadPersonaSubmittedReportDuxo docUploadPersonaSubmittedReportDuxo = DocUploadPersonaSubmittedReportDuxo.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documentRequestIds, 10));
                Iterator<T> it = documentRequestIds.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DocUploadPersonaSubmittedReportDuxo2(docUploadPersonaSubmittedReportDuxo, (UUID) it.next(), null), 3, null));
                }
                this.label = 1;
                if (Await2.awaitAll(arrayList, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DocUploadPersonaSubmittedReportDuxo docUploadPersonaSubmittedReportDuxo) {
        docUploadPersonaSubmittedReportDuxo.mutate(new Function1() { // from class: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadPersonaSubmittedReportDuxo.onCreate$lambda$1$lambda$0((DocUploadPersonaSubmittedReportViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadPersonaSubmittedReportViewState onCreate$lambda$1$lambda$0(DocUploadPersonaSubmittedReportViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DocUploadPersonaSubmittedReportViewState.Loaded.INSTANCE;
    }

    /* compiled from: DocUploadPersonaSubmittedReportDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportDuxo;", "Lcom/robinhood/android/doc/ui/persona/DocUploadPersonaSubmittedReportFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadPersonaSubmittedReportDuxo, DocUploadPersonaSubmittedReportFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadPersonaSubmittedReportFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadPersonaSubmittedReportFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadPersonaSubmittedReportFragment.Args getArgs(DocUploadPersonaSubmittedReportDuxo docUploadPersonaSubmittedReportDuxo) {
            return (DocUploadPersonaSubmittedReportFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, docUploadPersonaSubmittedReportDuxo);
        }
    }
}
