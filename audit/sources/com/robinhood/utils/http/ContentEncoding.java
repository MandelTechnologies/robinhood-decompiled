package com.robinhood.utils.http;

import kotlin.Metadata;

/* compiled from: ContentEncoding.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/utils/http/ContentEncoding;", "", "<init>", "()V", "GZIP", "", "IDENTITY", "lib-utils-http"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ContentEncoding {
    public static final String GZIP = "gzip";
    public static final String IDENTITY = "identity";
    public static final ContentEncoding INSTANCE = new ContentEncoding();

    private ContentEncoding() {
    }
}
