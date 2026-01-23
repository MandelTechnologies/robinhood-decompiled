package com.robinhood.shared.support.supportchat.util;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ChatImages.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"generateImageUrl", "Lokhttp3/HttpUrl;", "identiBaseUrl", "documentId", "Ljava/util/UUID;", "width", "", "height", "(Lokhttp3/HttpUrl;Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;)Lokhttp3/HttpUrl;", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.util.ChatImagesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatImages {
    public static /* synthetic */ HttpUrl generateImageUrl$default(HttpUrl httpUrl, UUID uuid, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return generateImageUrl(httpUrl, uuid, num, num2);
    }

    public static final HttpUrl generateImageUrl(HttpUrl identiBaseUrl, UUID documentId, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(identiBaseUrl, "identiBaseUrl");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        HttpUrl.Builder builderAddPathSegment = identiBaseUrl.newBuilder().addPathSegment("document");
        String string2 = documentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        HttpUrl.Builder builderAddPathSegment2 = builderAddPathSegment.addPathSegment(string2).addPathSegment("view").addPathSegment("");
        if (num != null && num2 != null) {
            builderAddPathSegment2.addQueryParameter("width", num.toString());
            builderAddPathSegment2.addQueryParameter("height", num2.toString());
        }
        return builderAddPathSegment2.build();
    }
}
