package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: ProtoReader32.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u001a\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m3636d2 = {"forEachTag", "Lokio/ByteString;", "Lcom/squareup/wire/ProtoReader32;", "tagHandler", "Lkotlin/Function1;", "", "", "-forEachTag", "ProtoReader32", "source", "pos", "limit", "", "wire-runtime"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.ProtoReader32Kt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ProtoReader322 {
    @JvmName
    /* renamed from: -forEachTag, reason: not valid java name */
    public static final ByteString m26819forEachTag(ProtoReader32 protoReader32, Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        Intrinsics.checkNotNullParameter(protoReader32, "<this>");
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        int iBeginMessage = protoReader32.beginMessage();
        while (true) {
            int iNextTag = protoReader32.nextTag();
            if (iNextTag != -1) {
                tagHandler.invoke(Integer.valueOf(iNextTag));
            } else {
                return protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
            }
        }
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        return ProtoReader32(byteString, i, i2);
    }

    public static final ProtoReader32 ProtoReader32(ByteString source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ByteArrayProtoReader32(source.toByteArray(), i, i2);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ProtoReader32(bArr, i, i2);
    }

    public static final ProtoReader32 ProtoReader32(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ByteArrayProtoReader32(source, i, i2);
    }
}
