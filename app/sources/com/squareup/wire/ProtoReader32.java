package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import okio.ByteString;

/* compiled from: ProtoReader32.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0005H&J\"\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u001e\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/ProtoReader32;", "", "asProtoReader", "Lcom/squareup/wire/ProtoReader;", "beginMessage", "", "endMessageAndGetUnknownFields", "Lokio/ByteString;", "token", "nextLengthDelimited", "nextTag", "peekFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "skip", "", "readBytes", "beforePossiblyPackedScalar", "", "readString", "", "readVarint32", "readVarint64", "", "readFixed32", "readFixed64", "readUnknownField", "tag", "addUnknownField", "fieldEncoding", "value", "nextFieldMinLengthInBytes", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ProtoReader32 {
    void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value);

    ProtoReader asProtoReader();

    boolean beforePossiblyPackedScalar() throws IOException;

    int beginMessage() throws IOException;

    ByteString endMessageAndGetUnknownFields(int token) throws IOException;

    int nextFieldMinLengthInBytes();

    int nextLengthDelimited() throws IOException;

    int nextTag() throws IOException;

    FieldEncoding peekFieldEncoding();

    ByteString readBytes() throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    String readString() throws IOException;

    void readUnknownField(int tag);

    int readVarint32() throws IOException;

    long readVarint64() throws IOException;

    void skip() throws IOException;
}
