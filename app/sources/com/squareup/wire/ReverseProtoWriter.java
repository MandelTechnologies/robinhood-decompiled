package com.squareup.wire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: ReverseProtoWriter.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\fH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J0\u0010!\u001a\u00020\u001b2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u001b0#H\u0000¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020+J\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/J\u0015\u00100\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\fH\u0000¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\fJ\u000e\u00103\u001a\u00020\u001b2\u0006\u0010(\u001a\u000204J\u000e\u00105\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\fJ\u000e\u00106\u001a\u00020\u001b2\u0006\u0010(\u001a\u000204R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u00068"}, m3636d2 = {"Lcom/squareup/wire/ReverseProtoWriter;", "", "<init>", "()V", "tail", "Lokio/Buffer;", "head", "cursor", "Lokio/Buffer$UnsafeCursor;", ResourceTypes.ARRAY, "", "arrayLimit", "", "forwardBuffer", "getForwardBuffer", "()Lokio/Buffer;", "forwardBuffer$delegate", "Lkotlin/Lazy;", "forwardWriter", "Lcom/squareup/wire/ProtoWriter;", "getForwardWriter", "()Lcom/squareup/wire/ProtoWriter;", "forwardWriter$delegate", "byteCount", "getByteCount", "()I", "writeTo", "", "sink", "Lokio/BufferedSink;", "require", "minByteCount", "emitCurrentSegment", "writeForward", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "writeForward$wire_runtime", "writeBytes", "value", "Lokio/ByteString;", "writeString", "", "writeTag", "fieldNumber", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "writeSignedVarint32", "writeSignedVarint32$wire_runtime", "writeVarint32", "writeVarint64", "", "writeFixed32", "writeFixed64", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;

    /* renamed from: forwardBuffer$delegate, reason: from kotlin metadata */
    private final Lazy forwardBuffer;

    /* renamed from: forwardWriter$delegate, reason: from kotlin metadata */
    private final Lazy forwardWriter;
    private Buffer tail = new Buffer();
    private Buffer head = new Buffer();
    private final Buffer.UnsafeCursor cursor = new Buffer.UnsafeCursor();
    private byte[] array = EMPTY_ARRAY;

    public ReverseProtoWriter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.forwardBuffer = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
            }
        });
        this.forwardWriter = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReverseProtoWriter.forwardWriter_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Buffer forwardBuffer_delegate$lambda$0() {
        return new Buffer();
    }

    private final Buffer getForwardBuffer() {
        return (Buffer) this.forwardBuffer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoWriter forwardWriter_delegate$lambda$1(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter.getValue();
    }

    public final int getByteCount() {
        return ((int) this.tail.getSize()) + (this.array.length - this.arrayLimit);
    }

    public final void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        emitCurrentSegment();
        sink.writeAll(this.tail);
    }

    private final void require(int minByteCount) throws IOException {
        if (this.arrayLimit >= minByteCount) {
            return;
        }
        emitCurrentSegment();
        this.head.readAndWriteUnsafe(this.cursor);
        this.cursor.expandBuffer(minByteCount);
        Buffer.UnsafeCursor unsafeCursor = this.cursor;
        if (unsafeCursor.offset == 0) {
            int i = unsafeCursor.end;
            byte[] bArr = unsafeCursor.data;
            Intrinsics.checkNotNull(bArr);
            if (i == bArr.length) {
                byte[] bArr2 = this.cursor.data;
                Intrinsics.checkNotNull(bArr2);
                this.array = bArr2;
                this.arrayLimit = this.cursor.end;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void emitCurrentSegment() throws IOException {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.writeAll(this.tail);
        Buffer buffer = this.tail;
        this.tail = this.head;
        this.head = buffer;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    public final void writeForward$wire_runtime(Function1<? super ProtoWriter, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().readByteString());
    }

    public final void writeBytes(ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        while (size != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, size);
            int i = this.arrayLimit - iMin;
            this.arrayLimit = i;
            size -= iMin;
            value.copyInto(size, this.array, i, iMin);
        }
    }

    public final void writeString(String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        int length = value.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char cCharAt = value.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i2 = this.arrayLimit;
                byte[] bArr = this.array;
                int i3 = i2 - 1;
                bArr[i3] = (byte) cCharAt;
                int iMax = Math.max(-1, i - i3);
                int i4 = i3;
                length = i;
                while (length > iMax) {
                    char cCharAt2 = value.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i4--;
                    bArr[i4] = (byte) cCharAt2;
                }
                this.arrayLimit = i4;
            } else {
                if (cCharAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i5 = this.arrayLimit;
                    int i6 = i5 - 1;
                    this.arrayLimit = i6;
                    bArr2[i6] = (byte) (128 | (cCharAt & '?'));
                    int i7 = i5 - 2;
                    this.arrayLimit = i7;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i8 = this.arrayLimit;
                    int i9 = i8 - 1;
                    this.arrayLimit = i9;
                    bArr3[i9] = (byte) ((cCharAt & '?') | 128);
                    int i10 = i8 - 2;
                    this.arrayLimit = i10;
                    bArr3[i10] = (byte) (128 | (63 & (cCharAt >> 6)));
                    int i11 = i8 - 3;
                    this.arrayLimit = i11;
                    bArr3[i11] = (byte) ((cCharAt >> '\f') | 224);
                } else {
                    char cCharAt3 = i >= 0 ? value.charAt(i) : (char) 65535;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i12 = this.arrayLimit - 1;
                        this.arrayLimit = i12;
                        bArr4[i12] = 63;
                    } else {
                        length -= 2;
                        int i13 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i14 = this.arrayLimit;
                        int i15 = i14 - 1;
                        this.arrayLimit = i15;
                        bArr5[i15] = (byte) ((i13 & 63) | 128);
                        int i16 = i14 - 2;
                        this.arrayLimit = i16;
                        bArr5[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        int i17 = i14 - 3;
                        this.arrayLimit = i17;
                        bArr5[i17] = (byte) (128 | (63 & (i13 >> 12)));
                        int i18 = i14 - 4;
                        this.arrayLimit = i18;
                        bArr5[i18] = (byte) ((i13 >> 18) | EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                    }
                }
                length = i;
            }
        }
    }

    public final void writeTag(int fieldNumber, FieldEncoding fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        writeVarint32(ProtoWriter.INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeSignedVarint32$wire_runtime(int value) throws IOException {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    public final void writeVarint32(int value) {
        int iVarint32Size$wire_runtime = ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
        require(iVarint32Size$wire_runtime);
        int i = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i;
        while ((value & (-128)) != 0) {
            this.array[i] = (byte) ((value & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) | 128);
            value >>>= 7;
            i++;
        }
        this.array[i] = (byte) value;
    }

    public final void writeVarint64(long value) throws IOException {
        int iVarint64Size$wire_runtime = ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
        require(iVarint64Size$wire_runtime);
        int i = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i;
        while (((-128) & value) != 0) {
            this.array[i] = (byte) ((127 & value) | 128);
            value >>>= 7;
            i++;
        }
        this.array[i] = (byte) value;
    }

    public final void writeFixed32(int value) throws IOException {
        require(4);
        int i = this.arrayLimit;
        int i2 = i - 4;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 3] = (byte) ((value >>> 8) & 255);
        bArr[i - 2] = (byte) ((value >>> 16) & 255);
        bArr[i - 1] = (byte) ((value >>> 24) & 255);
    }

    public final void writeFixed64(long value) throws IOException {
        require(8);
        int i = this.arrayLimit;
        int i2 = i - 8;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 7] = (byte) ((value >>> 8) & 255);
        bArr[i - 6] = (byte) ((value >>> 16) & 255);
        bArr[i - 5] = (byte) ((value >>> 24) & 255);
        bArr[i - 4] = (byte) ((value >>> 32) & 255);
        bArr[i - 3] = (byte) ((value >>> 40) & 255);
        bArr[i - 2] = (byte) ((value >>> 48) & 255);
        bArr[i - 1] = (byte) ((value >>> 56) & 255);
    }

    /* compiled from: ReverseProtoWriter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/squareup/wire/ReverseProtoWriter$Companion;", "", "<init>", "()V", "EMPTY_ARRAY", "", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
