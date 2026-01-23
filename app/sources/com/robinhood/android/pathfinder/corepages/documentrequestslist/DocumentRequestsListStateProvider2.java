package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDataState;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestsListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005¨\u0006\u000b"}, m3636d2 = {"isSendingInput", "", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;", "isSendingInput$annotations", "(Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;)V", "(Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;)Z", "withUpdatedSubmissionStatus", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "submittedDocumentRequestIds", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DocumentRequestsListStateProvider2 {
    public static /* synthetic */ void isSendingInput$annotations(DocumentRequestsListDataState.InputState inputState) {
    }

    public static final boolean isSendingInput(DocumentRequestsListDataState.InputState inputState) {
        Intrinsics.checkNotNullParameter(inputState, "<this>");
        return inputState == DocumentRequestsListDataState.InputState.SendingInput;
    }

    public static final List<DocumentRequest> withUpdatedSubmissionStatus(List<DocumentRequest> list, List<String> submittedDocumentRequestIds) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(submittedDocumentRequestIds, "submittedDocumentRequestIds");
        List<DocumentRequest> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DocumentRequest documentRequest : list2) {
            arrayList.add(DocumentRequest.copy$default(documentRequest, null, null, null, null, documentRequest.isSubmitted() || submittedDocumentRequestIds.contains(documentRequest.getId()), 15, null));
        }
        return arrayList;
    }
}
