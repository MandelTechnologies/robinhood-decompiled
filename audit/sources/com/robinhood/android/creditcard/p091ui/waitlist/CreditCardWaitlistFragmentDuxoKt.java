package com.robinhood.android.creditcard.p091ui.waitlist;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import kotlin.Metadata;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"mediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroid/net/Uri;", "getMediaSource", "(Landroid/net/Uri;)Landroidx/media3/exoplayer/source/MediaSource;", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditCardWaitlistFragmentDuxoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaSource getMediaSource(Uri uri) {
        try {
            final FileDataSource fileDataSource = new FileDataSource();
            fileDataSource.open(new DataSpec(uri));
            return new ProgressiveMediaSource.Factory(new DataSource.Factory() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxoKt$mediaSource$factory$1
                @Override // androidx.media3.datasource.DataSource.Factory
                public final DataSource createDataSource() {
                    return fileDataSource;
                }
            }, Mp4Extractor.newFactory(SubtitleParser.Factory.UNSUPPORTED)).createMediaSource(MediaItem.fromUri(uri));
        } catch (Exception unused) {
            return null;
        }
    }
}
