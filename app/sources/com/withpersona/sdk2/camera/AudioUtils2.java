package com.withpersona.sdk2.camera;

import android.media.AudioRecord;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: AudioUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"SAMPLE_RATES", "", "", "getValidAudioConfiguration", "Lcom/withpersona/sdk2/camera/AudioConfiguration;", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.AudioUtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AudioUtils2 {
    private static final List<Integer> SAMPLE_RATES = CollectionsKt.listOf((Object[]) new Integer[]{48000, 44100, 22050, 16000, 11025, 8000});

    public static final AudioConfiguration getValidAudioConfiguration() throws Throwable {
        Iterator<Integer> it = SAMPLE_RATES.iterator();
        while (true) {
            AudioRecord audioRecord = null;
            if (!it.hasNext()) {
                return null;
            }
            int iIntValue = it.next().intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(iIntValue, 16, 2);
                if (minBufferSize != -2) {
                    AudioRecord audioRecord2 = new AudioRecord(1, iIntValue, 16, 2, minBufferSize);
                    try {
                        if (audioRecord2.getState() == 1) {
                            audioRecord2.release();
                            AudioConfiguration audioConfiguration = new AudioConfiguration(iIntValue, 16, 2, minBufferSize);
                            audioRecord2.release();
                            return audioConfiguration;
                        }
                        audioRecord2.release();
                    } catch (IllegalArgumentException unused) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (SecurityException unused2) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (Throwable th) {
                        th = th;
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                        throw th;
                    }
                }
            } catch (IllegalArgumentException unused3) {
            } catch (SecurityException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
