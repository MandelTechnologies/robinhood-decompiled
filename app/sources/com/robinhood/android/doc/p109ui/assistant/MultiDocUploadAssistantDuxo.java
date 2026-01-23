package com.robinhood.android.doc.p109ui.assistant;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.p109ui.assistant.MultiDocUploadAssistantDuxo;
import com.robinhood.android.doc.p109ui.assistant.MultiDocUploadAssistantFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiDocUploadAssistantDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Landroidx/lifecycle/SavedStateHandle;)V", "getDocumentRequestStore", "()Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "onDocRequestsLoaded", "docRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MultiDocUploadAssistantDuxo extends OldBaseDuxo<MultiDocUploadAssistantViewState> implements HasSavedState {
    private final DocumentRequestStore documentRequestStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final DocumentRequestStore getDocumentRequestStore() {
        return this.documentRequestStore;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiDocUploadAssistantDuxo(DocumentRequestStore documentRequestStore, SavedStateHandle savedStateHandle) {
        super(new MultiDocUploadAssistantViewState(null, null, false, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.documentRequestStore = documentRequestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiDocUploadAssistantDuxo.onCreate$lambda$0(this.f$0, (MultiDocUploadAssistantViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiDocUploadAssistantViewState onCreate$lambda$0(MultiDocUploadAssistantDuxo multiDocUploadAssistantDuxo, MultiDocUploadAssistantViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.getDocRequests().isEmpty() ? MultiDocUploadAssistantViewState.copy$default(applyMutation, ((MultiDocUploadAssistantFragment.Args) INSTANCE.getArgs((HasSavedState) multiDocUploadAssistantDuxo)).getDocRequests(), null, false, 6, null) : applyMutation;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        List<DocumentRequest> docRequests = ((MultiDocUploadAssistantFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDocRequests();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(docRequests, 10));
        for (DocumentRequest documentRequest : docRequests) {
            UUID id = documentRequest.getId();
            if (id == null) {
                throw new IllegalArgumentException(("Document request ID shouldn't be null: " + documentRequest).toString());
            }
            arrayList.add(id);
        }
        Single singleDoOnSubscribe = DocumentRequestStore.getDocumentRequestsByIds$default(this.documentRequestStore, arrayList, null, 2, null).doOnSubscribe(new C143361());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C143372(this), new Function1() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiDocUploadAssistantDuxo.onResume$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: MultiDocUploadAssistantDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$onResume$1 */
    static final class C143361<T> implements Consumer {
        C143361() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            MultiDocUploadAssistantDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$onResume$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiDocUploadAssistantDuxo.C143361.accept$lambda$0((MultiDocUploadAssistantViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiDocUploadAssistantViewState accept$lambda$0(MultiDocUploadAssistantViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return MultiDocUploadAssistantViewState.copy$default(applyMutation, null, null, true, 3, null);
        }
    }

    /* compiled from: MultiDocUploadAssistantDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$onResume$2 */
    /* synthetic */ class C143372 extends FunctionReferenceImpl implements Function1<List<? extends DocumentRequest>, Unit> {
        C143372(Object obj) {
            super(1, obj, MultiDocUploadAssistantDuxo.class, "onDocRequestsLoaded", "onDocRequestsLoaded(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DocumentRequest> list) {
            invoke2((List<DocumentRequest>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<DocumentRequest> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MultiDocUploadAssistantDuxo) this.receiver).onDocRequestsLoaded(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(MultiDocUploadAssistantDuxo multiDocUploadAssistantDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        multiDocUploadAssistantDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiDocUploadAssistantDuxo.onResume$lambda$4$lambda$3(throwable, (MultiDocUploadAssistantViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiDocUploadAssistantViewState onResume$lambda$4$lambda$3(Throwable th, MultiDocUploadAssistantViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MultiDocUploadAssistantViewState.copy$default(applyMutation, null, new UiEvent(th), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDocRequestsLoaded(final List<DocumentRequest> docRequests) {
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiDocUploadAssistantDuxo.onDocRequestsLoaded$lambda$5(docRequests, this, (MultiDocUploadAssistantViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiDocUploadAssistantViewState onDocRequestsLoaded$lambda$5(List list, MultiDocUploadAssistantDuxo multiDocUploadAssistantDuxo, MultiDocUploadAssistantViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (list.isEmpty()) {
            Companion companion = INSTANCE;
            if (!((MultiDocUploadAssistantFragment.Args) companion.getArgs((HasSavedState) multiDocUploadAssistantDuxo)).getIsMockingRequests()) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(((MultiDocUploadAssistantFragment.Args) companion.getArgs((HasSavedState) multiDocUploadAssistantDuxo)).getDocRequests());
                throw new ExceptionsH();
            }
            list = ((MultiDocUploadAssistantFragment.Args) companion.getArgs((HasSavedState) multiDocUploadAssistantDuxo)).getDocRequests();
        }
        return MultiDocUploadAssistantViewState.copy$default(applyMutation, list, null, false, 2, null);
    }

    /* compiled from: MultiDocUploadAssistantDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantDuxo;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MultiDocUploadAssistantDuxo, MultiDocUploadAssistantFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultiDocUploadAssistantFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MultiDocUploadAssistantFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultiDocUploadAssistantFragment.Args getArgs(MultiDocUploadAssistantDuxo multiDocUploadAssistantDuxo) {
            return (MultiDocUploadAssistantFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, multiDocUploadAssistantDuxo);
        }
    }
}
