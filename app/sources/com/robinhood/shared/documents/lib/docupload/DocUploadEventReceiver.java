package com.robinhood.shared.documents.lib.docupload;

import kotlin.Metadata;

/* compiled from: DocUploadEventReceiver.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "", "onEvent", "", "event", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "showTransition", "", "onError", "error", "", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface DocUploadEventReceiver {
    void onError(Throwable error);

    void onEvent(DocUploadEvent event, boolean showTransition);

    /* compiled from: DocUploadEventReceiver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onEvent$default(DocUploadEventReceiver docUploadEventReceiver, DocUploadEvent docUploadEvent, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEvent");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            docUploadEventReceiver.onEvent(docUploadEvent, z);
        }
    }
}
