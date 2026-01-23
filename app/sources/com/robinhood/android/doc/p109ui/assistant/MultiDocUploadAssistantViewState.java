package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Lists4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiDocUploadAssistantViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantViewState;", "", "docRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "error", "Lcom/robinhood/udf/UiEvent;", "", "isLoading", "", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;Z)V", "getDocRequests", "()Ljava/util/List;", "getError", "()Lcom/robinhood/udf/UiEvent;", "()Z", "areAllDocUploadsCompleted", "getAreAllDocUploadsCompleted", "completedDocRequests", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCompletedDocRequests", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class MultiDocUploadAssistantViewState {
    public static final int $stable = 8;
    private final boolean areAllDocUploadsCompleted;
    private final List<DocumentRequest> docRequests;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;

    public MultiDocUploadAssistantViewState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiDocUploadAssistantViewState copy$default(MultiDocUploadAssistantViewState multiDocUploadAssistantViewState, List list, UiEvent uiEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiDocUploadAssistantViewState.docRequests;
        }
        if ((i & 2) != 0) {
            uiEvent = multiDocUploadAssistantViewState.error;
        }
        if ((i & 4) != 0) {
            z = multiDocUploadAssistantViewState.isLoading;
        }
        return multiDocUploadAssistantViewState.copy(list, uiEvent, z);
    }

    public final List<DocumentRequest> component1() {
        return this.docRequests;
    }

    public final UiEvent<Throwable> component2() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final MultiDocUploadAssistantViewState copy(List<DocumentRequest> docRequests, UiEvent<Throwable> error, boolean isLoading) {
        Intrinsics.checkNotNullParameter(docRequests, "docRequests");
        return new MultiDocUploadAssistantViewState(docRequests, error, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocUploadAssistantViewState)) {
            return false;
        }
        MultiDocUploadAssistantViewState multiDocUploadAssistantViewState = (MultiDocUploadAssistantViewState) other;
        return Intrinsics.areEqual(this.docRequests, multiDocUploadAssistantViewState.docRequests) && Intrinsics.areEqual(this.error, multiDocUploadAssistantViewState.error) && this.isLoading == multiDocUploadAssistantViewState.isLoading;
    }

    public int hashCode() {
        int iHashCode = this.docRequests.hashCode() * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return ((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "MultiDocUploadAssistantViewState(docRequests=" + this.docRequests + ", error=" + this.error + ", isLoading=" + this.isLoading + ")";
    }

    public MultiDocUploadAssistantViewState(List<DocumentRequest> docRequests, UiEvent<Throwable> uiEvent, boolean z) {
        Intrinsics.checkNotNullParameter(docRequests, "docRequests");
        this.docRequests = docRequests;
        this.error = uiEvent;
        this.isLoading = z;
        boolean z2 = false;
        if (!docRequests.isEmpty()) {
            List<DocumentRequest> list = docRequests;
            if ((list instanceof Collection) && list.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ApiDocumentRequest.State state = ((DocumentRequest) it.next()).getState();
                    Intrinsics.checkNotNull(state);
                    if (state.isUploadRequiredFromApp()) {
                        break;
                    }
                }
                z2 = true;
            }
        }
        this.areAllDocUploadsCompleted = z2;
    }

    public /* synthetic */ MultiDocUploadAssistantViewState(List list, UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? true : z);
    }

    public final List<DocumentRequest> getDocRequests() {
        return this.docRequests;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getAreAllDocUploadsCompleted() {
        return this.areAllDocUploadsCompleted;
    }

    public final ArrayList<DocumentRequest> getCompletedDocRequests() {
        List<DocumentRequest> list = this.docRequests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ApiDocumentRequest.State state = ((DocumentRequest) obj).getState();
            Intrinsics.checkNotNull(state);
            if (!state.isUploadRequiredFromApp()) {
                arrayList.add(obj);
            }
        }
        return Lists4.toArrayList(arrayList);
    }
}
