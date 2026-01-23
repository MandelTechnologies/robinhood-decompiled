package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDataState;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequestsListContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestsListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "<init>", "()V", "reduce", "dataState", "shouldShowContinueButton", "", "inputState", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState$InputState;", "documentRequests", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "shouldShowContinueButton$feature_pathfinder_core_pages_externalDebug", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DocumentRequestsListStateProvider implements StateProvider<DocumentRequestsListDataState, DocumentRequestsListViewState> {
    public static final int $stable = 0;

    /* compiled from: DocumentRequestsListStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentRequestsListDataState.InputState.values().length];
            try {
                iArr[DocumentRequestsListDataState.InputState.InputNotSent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentRequestsListDataState.InputState.SendingInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentRequestsListDataState.InputState.SendInputSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentRequestsListDataState.InputState.SendInputFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DocumentRequestsListViewState reduce(DocumentRequestsListDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        DocumentRequestsListContext context = dataState.getContext();
        List<DocumentRequest> listWithUpdatedSubmissionStatus = DocumentRequestsListStateProvider2.withUpdatedSubmissionStatus(context.getDocumentRequests(), dataState.getSubmittedDocumentRequestIds());
        boolean zM2365xcf059dd = m2365xcf059dd(dataState.getInputState(), listWithUpdatedSubmissionStatus);
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getInputState().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new DocumentRequestsListViewState.Loaded(listWithUpdatedSubmissionStatus, context.getPreheading(), context.getHeading(), context.getSubheading(), zM2365xcf059dd, DocumentRequestsListStateProvider2.isSendingInput(dataState.getInputState()));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new DocumentRequestsListViewState.Error(listWithUpdatedSubmissionStatus);
    }

    /* renamed from: shouldShowContinueButton$feature_pathfinder_core_pages_externalDebug */
    public final boolean m2365xcf059dd(DocumentRequestsListDataState.InputState inputState, List<DocumentRequest> documentRequests) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        if (inputState != DocumentRequestsListDataState.InputState.InputNotSent && inputState != DocumentRequestsListDataState.InputState.SendInputSuccess) {
            return false;
        }
        List<DocumentRequest> list = documentRequests;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((DocumentRequest) it.next()).isSubmitted()) {
                return false;
            }
        }
        return true;
    }
}
