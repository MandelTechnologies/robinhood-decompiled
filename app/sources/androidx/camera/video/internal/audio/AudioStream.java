package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z) {
        }
    }

    PacketInfo read(ByteBuffer byteBuffer);

    void release();

    void setCallback(AudioStreamCallback audioStreamCallback, Executor executor);

    void start() throws IllegalStateException, AudioStreamException;

    void stop() throws IllegalStateException;

    public static abstract class PacketInfo {
        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();

        /* renamed from: of */
        public static PacketInfo m86of(int i, long j) {
            return new AutoValue_AudioStream_PacketInfo(i, j);
        }
    }

    public static class AudioStreamException extends Exception {
        public AudioStreamException(String str) {
            super(str);
        }

        public AudioStreamException(Throwable th) {
            super(th);
        }
    }
}
