package io.ktor.serialization.kotlinx.json;

import io.ktor.utils.p478io.charsets.CharsetJVM;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Ljava/nio/charset/Charset;)V", "beginArray", "", "getBeginArray", "()[B", "endArray", "getEndArray", "objectSeparator", "getObjectSeparator", "ktor-serialization-kotlinx-json"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.serialization.kotlinx.json.JsonArraySymbols, reason: use source file name */
/* loaded from: classes14.dex */
final class KotlinxSerializationJsonExtensions2 {
    private final byte[] beginArray;
    private final byte[] endArray;
    private final byte[] objectSeparator;

    public KotlinxSerializationJsonExtensions2(Charset charset) {
        byte[] bArrEncodeToByteArray;
        byte[] bArrEncodeToByteArray2;
        byte[] bArrEncodeToByteArray3;
        Intrinsics.checkNotNullParameter(charset, "charset");
        Charset charset2 = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset2)) {
            bArrEncodeToByteArray = StringsKt.encodeToByteArray("[");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder, "[", 0, 1);
        }
        this.beginArray = bArrEncodeToByteArray;
        if (Intrinsics.areEqual(charset, charset2)) {
            bArrEncodeToByteArray2 = StringsKt.encodeToByteArray("]");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrEncodeToByteArray2 = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder2, "]", 0, 1);
        }
        this.endArray = bArrEncodeToByteArray2;
        if (Intrinsics.areEqual(charset, charset2)) {
            bArrEncodeToByteArray3 = StringsKt.encodeToByteArray(",");
        } else {
            CharsetEncoder charsetEncoderNewEncoder3 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder3, "charset.newEncoder()");
            bArrEncodeToByteArray3 = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder3, ",", 0, 1);
        }
        this.objectSeparator = bArrEncodeToByteArray3;
    }

    public final byte[] getBeginArray() {
        return this.beginArray;
    }

    public final byte[] getEndArray() {
        return this.endArray;
    }

    public final byte[] getObjectSeparator() {
        return this.objectSeparator;
    }
}
