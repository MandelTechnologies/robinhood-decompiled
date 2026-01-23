package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRequestsListDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2$userView$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class DocumentRequestsListDuxo5 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
    DocumentRequestsListDuxo5(Object obj) {
        super(1, obj, DocumentRequestsListDuxo.class, "handleUserInputError", "handleUserInputError$feature_pathfinder_core_pages_externalDebug(Ljava/lang/Throwable;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((DocumentRequestsListDuxo) this.receiver).handleUserInputError$feature_pathfinder_core_pages_externalDebug(p0));
    }
}
