package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;

/* compiled from: DocumentRequestsListFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toIdentiDocumentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DocumentRequestsListFragment3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentRequest toIdentiDocumentRequest(com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest documentRequest) {
        return new DocumentRequest(null, null, StringsKt.toUuid(documentRequest.getId()), null, false, null, null, null, null, null, null, 2043, null);
    }
}
