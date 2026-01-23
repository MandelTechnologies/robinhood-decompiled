package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.PathfinderInquirySessionStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderInquirySessionStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"getLoggedOutSelfieSubmittedItem", "Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore$SessionItem;", "", "Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;", "inquiryId", "Ljava/util/UUID;", "getSelectedAccountType", "", "getSubmittedDocumentRequestIds", "", "KEY_LOGGED_OUT_SELFIE_SUBMITTED", "KEY_SELECTED_ACCOUNT_TYPE", "KEY_SUBMITTED_DOCUMENT_REQUEST_IDS", "lib-store-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PathfinderInquirySessionStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class PathfinderInquirySessionStore2 {
    private static final String KEY_LOGGED_OUT_SELFIE_SUBMITTED = "logged_out_selfie_submitted";
    private static final String KEY_SELECTED_ACCOUNT_TYPE = "key_selected_account_type";
    private static final String KEY_SUBMITTED_DOCUMENT_REQUEST_IDS = "key_submitted_document_request_ids";

    public static final PathfinderInquirySessionStore.SessionItem<Boolean> getLoggedOutSelfieSubmittedItem(PathfinderInquirySessionStore pathfinderInquirySessionStore, UUID inquiryId) {
        Intrinsics.checkNotNullParameter(pathfinderInquirySessionStore, "<this>");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return pathfinderInquirySessionStore.getItem(inquiryId, KEY_LOGGED_OUT_SELFIE_SUBMITTED);
    }

    public static final PathfinderInquirySessionStore.SessionItem<String> getSelectedAccountType(PathfinderInquirySessionStore pathfinderInquirySessionStore, UUID inquiryId) {
        Intrinsics.checkNotNullParameter(pathfinderInquirySessionStore, "<this>");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return pathfinderInquirySessionStore.getItem(inquiryId, KEY_SELECTED_ACCOUNT_TYPE);
    }

    public static final PathfinderInquirySessionStore.SessionItem<List<String>> getSubmittedDocumentRequestIds(PathfinderInquirySessionStore pathfinderInquirySessionStore, UUID inquiryId) {
        Intrinsics.checkNotNullParameter(pathfinderInquirySessionStore, "<this>");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return pathfinderInquirySessionStore.getItem(inquiryId, KEY_SUBMITTED_DOCUMENT_REQUEST_IDS);
    }
}
