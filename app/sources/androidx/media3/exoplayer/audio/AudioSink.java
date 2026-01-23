package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface AudioSink {

    public interface Listener {
        default void onAudioCapabilitiesChanged() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(AudioTrackConfig audioTrackConfig) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j) {
        }

        void onPositionDiscontinuity();

        default void onSilenceSkipped() {
        }

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    void configure(Format format2, int i, int[] iArr) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    long getCurrentPositionUs(boolean z);

    int getFormatSupport(Format format2);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    default void release() {
    }

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    default void setClock(Clock clock) {
    }

    void setListener(Listener listener);

    default void setOffloadDelayPadding(int i, int i2) {
    }

    default void setOffloadMode(int i) {
    }

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    default void setPlayerId(PlayerId playerId) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    boolean supportsFormat(Format format2);

    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;

        /* renamed from: encoding, reason: collision with root package name */
        public final int f9713encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.f9713encoding = i;
            this.sampleRate = i2;
            this.channelConfig = i3;
            this.tunneling = z;
            this.offload = z2;
            this.bufferSize = i4;
        }
    }

    public static final class ConfigurationException extends Exception {

        /* renamed from: format, reason: collision with root package name */
        public final Format f9714format;

        public ConfigurationException(Throwable th, Format format2) {
            super(th);
            this.f9714format = format2;
        }

        public ConfigurationException(String str, Format format2) {
            super(str);
            this.f9714format = format2;
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        /* renamed from: format, reason: collision with root package name */
        public final Format f9715format;
        public final boolean isRecoverable;

        public InitializationException(int i, int i2, int i3, int i4, Format format2, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(PlaceholderUtils.XXShortPlaceholderText);
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(PlaceholderUtils.XXShortPlaceholderText);
            sb.append(format2);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.f9715format = format2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        /* renamed from: format, reason: collision with root package name */
        public final Format f9716format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format2, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.f9716format = format2;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    default AudioOffloadSupport getFormatOffloadSupport(Format format2) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }
}
