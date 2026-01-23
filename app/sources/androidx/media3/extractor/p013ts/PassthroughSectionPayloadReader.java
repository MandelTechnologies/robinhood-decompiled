package androidx.media3.extractor.p013ts;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p013ts.TsPayloadReader;

/* loaded from: classes4.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* renamed from: format, reason: collision with root package name */
    private Format f9751format;
    private TrackOutput output;
    private TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(String str) {
        this.f9751format = new Format.Builder().setSampleMimeType(str).build();
    }

    @Override // androidx.media3.extractor.p013ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(this.f9751format);
    }

    @Override // androidx.media3.extractor.p013ts.SectionPayloadReader
    public void consume(ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == -9223372036854775807L || timestampOffsetUs == -9223372036854775807L) {
            return;
        }
        Format format2 = this.f9751format;
        if (timestampOffsetUs != format2.subsampleOffsetUs) {
            Format formatBuild = format2.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f9751format = formatBuild;
            this.output.format(formatBuild);
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, iBytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.timestampAdjuster);
        Util.castNonNull(this.output);
    }
}
