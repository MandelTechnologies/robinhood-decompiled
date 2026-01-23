package io.ktor.client.plugins.contentnegotiation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentConverterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "ktor-client-content-negotiation"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.contentnegotiation.ContentConverterException, reason: use source file name */
/* loaded from: classes14.dex */
public final class ContentNegotiation2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentNegotiation2(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
