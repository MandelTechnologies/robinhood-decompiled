package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiDocument;
import java.text.ParseException;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"HEADER_LOCATION", "", "isRedirect", "", "code", "", "getDownloadUrl", "Lokhttp3/HttpUrl;", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "id", "lib-store-identi_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DocumentStoreKt {
    private static final String HEADER_LOCATION = "Location";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRedirect(int i) {
        return 300 <= i && i < 400;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpUrl getDownloadUrl(ApiDocument.DownloadResponse downloadResponse, String str) throws ParseException {
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(downloadResponse.getDownload_url());
        if (httpUrl != null) {
            return httpUrl;
        }
        throw new ParseException("Document " + str + " returned invalid download URL: " + downloadResponse.getDownload_url(), 0);
    }
}
