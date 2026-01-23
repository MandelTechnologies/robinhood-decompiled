package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpResponse.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "", "content", "", "contentType", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "isJsonContentType", "", "()Z", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HttpResponse {
    private final String content;
    private final boolean isJsonContentType;

    public HttpResponse(String content, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        boolean z = false;
        if (str != null && StringsKt.startsWith$default(str, "application/json", false, 2, (Object) null)) {
            z = true;
        }
        this.isJsonContentType = z;
    }

    public final String getContent() {
        return this.content;
    }

    /* renamed from: isJsonContentType, reason: from getter */
    public final boolean getIsJsonContentType() {
        return this.isJsonContentType;
    }
}
