package okio;

import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: BufferedSource.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010$J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b*\u0010,J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020)H&¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020)H&¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u0010-\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u0002062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b7\u00109J\u000f\u0010:\u001a\u000206H&¢\u0006\u0004\b:\u00108J\u0017\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\tH&¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020\u0017H&¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010?\u001a\u0002062\u0006\u0010>\u001a\u00020=H&¢\u0006\u0004\b?\u0010@J'\u0010D\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH&¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010F\u001a\u00020!H&¢\u0006\u0004\bD\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020!H&¢\u0006\u0004\bI\u0010GJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\t2\u0006\u0010F\u001a\u00020!H&¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0000H&¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH&¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0005\u0082\u0001\u0002\u0003Sø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006TÀ\u0006\u0001"}, m3636d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "", "exhausted", "()Z", "", "byteCount", "", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "readShortLe", "", "readInt", "()I", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", "options", Fields4.TYPE, "(Lokio/Options;)I", "", "readByteArray", "()[B", "(J)[B", "sink", "read", "([B)I", "readFully", "([B)V", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "b", "fromIndex", "toIndex", "indexOf", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "targetBytes", "indexOfElement", "offset", "rangeEquals", "(JLokio/ByteString;)Z", "peek", "()Lokio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "getBuffer", "Lokio/RealBufferedSource;", "okio"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    @Deprecated
    Buffer buffer();

    boolean exhausted() throws IOException;

    Buffer getBuffer();

    long indexOf(byte b, long fromIndex, long toIndex) throws IOException;

    long indexOf(ByteString bytes) throws IOException;

    long indexOfElement(ByteString targetBytes) throws IOException;

    InputStream inputStream();

    BufferedSource peek();

    boolean rangeEquals(long offset, ByteString bytes) throws IOException;

    int read(byte[] sink) throws IOException;

    long readAll(Sink sink) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long byteCount) throws IOException;

    ByteString readByteString() throws IOException;

    ByteString readByteString(long byteCount) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(Buffer sink, long byteCount) throws IOException;

    void readFully(byte[] sink) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8() throws IOException;

    String readUtf8(long byteCount) throws IOException;

    int readUtf8CodePoint() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long limit) throws IOException;

    boolean request(long byteCount) throws IOException;

    void require(long byteCount) throws IOException;

    int select(Options options) throws IOException;

    void skip(long byteCount) throws IOException;
}
