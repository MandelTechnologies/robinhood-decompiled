package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* compiled from: ProtoReader32AsProtoReader.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\r\u0010\u0015\u001a\u00020\u0016H\u0010¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\"\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, m3636d2 = {"Lcom/squareup/wire/ProtoReader32AsProtoReader;", "Lcom/squareup/wire/ProtoReader;", "delegate", "Lcom/squareup/wire/ProtoReader32;", "<init>", "(Lcom/squareup/wire/ProtoReader32;)V", "getDelegate", "()Lcom/squareup/wire/ProtoReader32;", "beginMessage", "", "endMessageAndGetUnknownFields", "Lokio/ByteString;", "token", "nextLengthDelimited", "", "nextTag", "peekFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "skip", "", "readBytes", "beforePossiblyPackedScalar", "", "beforePossiblyPackedScalar$wire_runtime", "readString", "", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "readUnknownField", "tag", "addUnknownField", "fieldEncoding", "value", "", "nextFieldMinLengthInBytes", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ProtoReader32AsProtoReader extends ProtoReader {
    private final ProtoReader32 delegate;

    public final ProtoReader32 getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoReader32AsProtoReader(ProtoReader32 delegate) {
        super(new Buffer());
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.wire.ProtoReader
    public long beginMessage() {
        return this.delegate.beginMessage();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString endMessageAndGetUnknownFields(long token) {
        return this.delegate.endMessageAndGetUnknownFields((int) token);
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextLengthDelimited() {
        return this.delegate.nextLengthDelimited();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextTag() {
        return this.delegate.nextTag();
    }

    @Override // com.squareup.wire.ProtoReader
    /* renamed from: peekFieldEncoding */
    public FieldEncoding getNextFieldEncoding() {
        return this.delegate.getNextFieldEncoding();
    }

    @Override // com.squareup.wire.ProtoReader
    public void skip() throws IOException {
        this.delegate.skip();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString readBytes() {
        return this.delegate.readBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public boolean beforePossiblyPackedScalar$wire_runtime() {
        return this.delegate.beforePossiblyPackedScalar();
    }

    @Override // com.squareup.wire.ProtoReader
    public String readString() {
        return this.delegate.readString();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readVarint32() {
        return this.delegate.readVarint32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readVarint64() {
        return this.delegate.readVarint64();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readFixed32() {
        return this.delegate.readFixed32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readFixed64() {
        return this.delegate.readFixed64();
    }

    @Override // com.squareup.wire.ProtoReader
    public void readUnknownField(int tag) {
        this.delegate.readUnknownField(tag);
    }

    @Override // com.squareup.wire.ProtoReader
    public void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        this.delegate.addUnknownField(tag, fieldEncoding, value);
    }

    @Override // com.squareup.wire.ProtoReader
    public long nextFieldMinLengthInBytes() {
        return this.delegate.nextFieldMinLengthInBytes();
    }
}
