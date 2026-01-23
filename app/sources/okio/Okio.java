package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;

@Metadata(m3635d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt", "okio/Okio__ZlibOkioKt"}, m3637k = 4, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Okio {
    public static final Sink appendingSink(File file) throws FileNotFoundException {
        return JvmOkio2.appendingSink(file);
    }

    @JvmName
    public static final Sink blackhole() {
        return Okio4.blackhole();
    }

    public static final BufferedSink buffer(Sink sink) {
        return Okio4.buffer(sink);
    }

    public static final BufferedSource buffer(Source source) {
        return Okio4.buffer(source);
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
        return JvmOkio2.hashingSink(sink, messageDigest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
        return JvmOkio2.hashingSource(source, messageDigest);
    }

    public static final FileSystem openZip(FileSystem fileSystem, Path path) throws IOException {
        return ZlibOkio.openZip(fileSystem, path);
    }

    @JvmOverloads
    public static final Sink sink(File file, boolean z) throws FileNotFoundException {
        return JvmOkio2.sink(file, z);
    }

    public static final Sink sink(OutputStream outputStream) {
        return JvmOkio2.sink(outputStream);
    }

    public static final Sink sink(Socket socket) throws IOException {
        return JvmOkio2.sink(socket);
    }

    public static final Source source(File file) throws FileNotFoundException {
        return JvmOkio2.source(file);
    }

    public static final Source source(InputStream inputStream) {
        return JvmOkio2.source(inputStream);
    }

    public static final Source source(Socket socket) throws IOException {
        return JvmOkio2.source(socket);
    }
}
