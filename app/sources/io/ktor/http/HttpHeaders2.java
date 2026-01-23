package io.ktor.http;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: HttpHeaders.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"isDelimiter", "", "ch", "", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.http.HttpHeadersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpHeaders2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDelimiter(char c) {
        return StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (Object) null);
    }
}
