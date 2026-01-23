package io.ktor.serialization.kotlinx;

import io.ktor.http.ContentTypes2;
import io.ktor.serialization.ContentConverter2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialFormat3;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lio/ktor/serialization/Configuration;", "Lio/ktor/http/ContentType;", "contentType", "Lkotlinx/serialization/StringFormat;", "format", "", "serialization", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Lkotlinx/serialization/StringFormat;)V", "ktor-serialization-kotlinx"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverterKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class KotlinxSerializationConverter4 {
    public static final void serialization(ContentConverter2 contentConverter2, ContentTypes2 contentType, SerialFormat3 format2) {
        Intrinsics.checkNotNullParameter(contentConverter2, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(format2, "format");
        ContentConverter2.DefaultImpls.register$default(contentConverter2, contentType, new KotlinxSerializationConverter(format2), null, 4, null);
    }
}
