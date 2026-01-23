package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.models.p355ui.DocumentRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DocUploadAssistantBaseCallbacks.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "", "onSkipClicked", "", "completedDocRequests", "Ljava/util/ArrayList;", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlin/collections/ArrayList;", "startDocUpload", "documentRequests", "", "onAllDocsUploaded", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DocUploadAssistantBaseCallbacks {
    void onAllDocsUploaded();

    void onSkipClicked(ArrayList<DocumentRequest> completedDocRequests);

    void startDocUpload(List<DocumentRequest> documentRequests);

    /* compiled from: DocUploadAssistantBaseCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onSkipClicked$default(DocUploadAssistantBaseCallbacks docUploadAssistantBaseCallbacks, ArrayList arrayList, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSkipClicked");
            }
            if ((i & 1) != 0) {
                arrayList = new ArrayList();
            }
            docUploadAssistantBaseCallbacks.onSkipClicked(arrayList);
        }
    }
}
