package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.plaid.internal.EnumC7081g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
final class AtomParsers {
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.f9739type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i));
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i));
            } else if (i2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i);
        }
        return metadata;
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 >= 0 && i5 < i) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.m538w("AtomParsers", "Skipped metadata with unknown key index: " + i5);
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        long j2 = j == -9223372036854775807L ? tkhd.duration : j;
        long j3 = parseMvhd(leafAtom.data).timescale;
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafAtomOfType.data, tkhd.f257id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.f9740format == null) {
            return null;
        }
        return new Track(tkhd.f257id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j3, jScaleLargeTimestamp, stsd.f9740format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v23, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int i;
        long j;
        long[] jArrCopyOf;
        int i2;
        int i3;
        long j2;
        int i4;
        int[] iArr;
        long[] jArr;
        int i5;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        long j3;
        int[] iArr5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.f9741format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011827))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                i = 0;
            } else {
                unsignedIntToInt2 = -1;
                i = 0;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
            i = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.f9741format.sampleMimeType;
        int i9 = (fixedSampleSize == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) ? i : 1;
        SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
        if (i9 != 0) {
            int i10 = chunkIterator.length;
            long[] jArr2 = new long[i10];
            int[] iArr6 = new int[i10];
            while (chunkIterator.moveNext()) {
                int i11 = chunkIterator.index;
                jArr2[i11] = chunkIterator.offset;
                iArr6[i11] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr2, iArr6, unsignedIntToInt6);
            long[] jArr3 = resultsRechunk.offsets;
            iArr = resultsRechunk.sizes;
            int i12 = resultsRechunk.maximumSize;
            long[] jArr4 = resultsRechunk.timestamps;
            int[] iArr7 = resultsRechunk.flags;
            j2 = resultsRechunk.duration;
            jArr = jArr3;
            i5 = i12;
            jArrCopyOf = jArr4;
            iArr2 = iArr7;
            j = 0;
        } else {
            long[] jArr5 = new long[sampleCount];
            j = 0;
            int[] iArrCopyOf = new int[sampleCount];
            jArrCopyOf = new long[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            int[] iArrCopyOf2 = new int[sampleCount];
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i13 = i;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            long j4 = 0;
            long j5 = 0;
            int i17 = unsignedIntToInt;
            int i18 = unsignedIntToInt6;
            int i19 = unsignedIntToInt5;
            int i20 = unsignedIntToInt4;
            int i21 = i16;
            while (true) {
                if (i13 >= sampleCount) {
                    i2 = i19;
                    i3 = i15;
                    break;
                }
                long j6 = j5;
                int i22 = i15;
                boolean zMoveNext = true;
                while (i22 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i23 = i19;
                    long j7 = chunkIterator.offset;
                    i22 = chunkIterator.numSamples;
                    j6 = j7;
                    i19 = i23;
                    i18 = i18;
                    sampleCount = sampleCount;
                }
                int i24 = sampleCount;
                i2 = i19;
                int i25 = i18;
                if (!zMoveNext) {
                    Log.m538w("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i13);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i13);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i13;
                    i3 = i22;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int unsignedIntToInt8 = i16;
                    while (unsignedIntToInt8 == 0 && i17 > 0) {
                        unsignedIntToInt8 = parsableByteArray6.readUnsignedIntToInt();
                        i14 = parsableByteArray6.readInt();
                        i17--;
                    }
                    i16 = unsignedIntToInt8 - 1;
                }
                jArr5[i13] = j6;
                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArrCopyOf[i13] = nextSampleSize;
                if (nextSampleSize > i21) {
                    i21 = nextSampleSize;
                }
                jArrCopyOf[i13] = j4 + i14;
                iArrCopyOf2[i13] = parsableByteArray7 == null ? 1 : i;
                if (i13 == unsignedIntToInt7) {
                    iArrCopyOf2[i13] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j4 += i25;
                int unsignedIntToInt9 = i2 - 1;
                if (unsignedIntToInt9 != 0 || i20 <= 0) {
                    i18 = i25;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i20--;
                    i18 = parsableByteArray3.readInt();
                }
                i19 = unsignedIntToInt9;
                long j8 = j6 + iArrCopyOf[i13];
                i15 = i22 - 1;
                i13++;
                j5 = j8;
                sampleCount = i24;
            }
            j2 = j4 + i14;
            if (parsableByteArray6 != null) {
                while (i17 > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        i4 = i;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i17--;
                }
                i4 = 1;
                if (unsignedIntToInt3 == 0 || i2 != 0 || i3 != 0 || i20 != 0 || i16 != 0 || i4 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(track.f258id);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(unsignedIntToInt3);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i2);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i3);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i20);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i16);
                    sb.append(i4 != 0 ? ", ctts invalid" : "");
                    Log.m538w("AtomParsers", sb.toString());
                }
                iArr = iArrCopyOf;
                jArr = jArr5;
                i5 = i21;
                iArr2 = iArrCopyOf2;
            } else {
                i4 = 1;
                if (unsignedIntToInt3 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    sb2.append(track.f258id);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(unsignedIntToInt3);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(i2);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i3);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i20);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i16);
                    sb2.append(i4 != 0 ? ", ctts invalid" : "");
                    Log.m538w("AtomParsers", sb2.toString());
                    iArr = iArrCopyOf;
                    jArr = jArr5;
                    i5 = i21;
                    iArr2 = iArrCopyOf2;
                }
            }
        }
        long j9 = j2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j9, 1000000L, track.timescale);
        long[] jArr6 = track.editListDurations;
        if (jArr6 == null) {
            Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr, iArr, i5, jArrCopyOf, iArr2, jScaleLargeTimestamp);
        }
        int[] iArr8 = iArr;
        int i26 = sampleCount;
        int[] iArr9 = iArr8;
        if (jArr6.length == 1 && track.f9742type == 1 && jArrCopyOf.length >= 2) {
            long j10 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[i];
            long jScaleLargeTimestamp2 = j10 + Util.scaleLargeTimestamp(track.editListDurations[i], track.timescale, track.movieTimescale);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            boolean zCanApplyEditWithGaplessInfo = canApplyEditWithGaplessInfo(jArr8, j9, j10, jScaleLargeTimestamp2);
            jArrCopyOf = jArr8;
            j9 = j9;
            if (zCanApplyEditWithGaplessInfo) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j10 - jArrCopyOf[i], track.f9741format.sampleRate, track.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j9 - jScaleLargeTimestamp2, track.f9741format.sampleRate, track.timescale);
                if ((jScaleLargeTimestamp3 != j || jScaleLargeTimestamp4 != j) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
                    return new TrackSampleTable(track, jArr7, iArr9, i5, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(track.editListDurations[i], 1000000L, track.movieTimescale));
                }
            }
            jArr = jArr7;
            iArr9 = iArr9;
        }
        long[] jArr9 = track.editListDurations;
        if (jArr9.length == 1 && jArr9[i] == j) {
            long j11 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[i];
            for (int i27 = i; i27 < jArrCopyOf.length; i27++) {
                jArrCopyOf[i27] = Util.scaleLargeTimestamp(jArrCopyOf[i27] - j11, 1000000L, track.timescale);
            }
            return new TrackSampleTable(track, jArr, iArr9, i5, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(j9 - j11, 1000000L, track.timescale));
        }
        ?? r10 = track.f9742type == 1 ? 1 : i;
        int[] iArr10 = new int[jArr9.length];
        int[] iArr11 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track.editListMediaTimes);
        int i28 = i;
        int i29 = i28;
        int i30 = i29;
        int i31 = i30;
        while (true) {
            long[] jArr11 = track.editListDurations;
            iArr3 = iArr11;
            if (i28 >= jArr11.length) {
                break;
            }
            int[] iArr12 = iArr10;
            long[] jArr12 = jArr10;
            long j12 = jArr12[i28];
            if (j12 != -1) {
                long j13 = jArr11[i28];
                i6 = i28;
                int i32 = i29;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j13, track.timescale, track.movieTimescale);
                iArr5 = iArr12;
                iArr5[i6] = Util.binarySearchFloor(jArrCopyOf, j12, true, true);
                long j14 = j12 + jScaleLargeTimestamp5;
                r11 = i;
                iArr3[i6] = Util.binarySearchCeil(jArrCopyOf, j14, r10, r11);
                while (true) {
                    i7 = iArr5[i6];
                    i8 = iArr3[i6];
                    if (i7 >= i8 || (iArr2[i7] & 1) != 0) {
                        break;
                    }
                    iArr5[i6] = i7 + 1;
                }
                i30 += i8 - i7;
                i29 = i32 | (i31 != i7 ? 1 : r11 == true ? 1 : 0);
                i31 = i8;
            } else {
                iArr5 = iArr12;
                i6 = i28;
                r11 = i;
            }
            jArr10 = jArr12;
            i = r11;
            iArr11 = iArr3;
            i28 = i6 + 1;
            iArr10 = iArr5;
        }
        int[] iArr13 = iArr10;
        int i33 = i;
        int i34 = i29 | (i30 != i26 ? 1 : i33);
        long[] jArr13 = i34 != 0 ? new long[i30] : jArr;
        int[] iArr14 = i34 != 0 ? new int[i30] : iArr9;
        if (i34 != 0) {
            i5 = i33;
        }
        int[] iArr15 = i34 != 0 ? new int[i30] : iArr2;
        long[] jArr14 = new long[i30];
        int i35 = i33;
        long j15 = j;
        while (i33 < track.editListDurations.length) {
            long j16 = track.editListMediaTimes[i33];
            int i36 = iArr13[i33];
            int i37 = i34;
            int i38 = iArr3[i33];
            int i39 = i5;
            if (i37 != 0) {
                int i40 = i38 - i36;
                System.arraycopy(jArr, i36, jArr13, i35, i40);
                System.arraycopy(iArr9, i36, iArr14, i35, i40);
                System.arraycopy(iArr2, i36, iArr15, i35, i40);
            }
            i5 = i39;
            while (i36 < i38) {
                long[] jArr15 = jArr;
                int[] iArr16 = iArr9;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j15, 1000000L, track.movieTimescale);
                long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArrCopyOf[i36] - j16, 1000000L, track.timescale);
                int i41 = i38;
                long[] jArr16 = jArrCopyOf;
                if (canTrimSamplesWithTimestampChange(track.f9742type)) {
                    iArr4 = iArr2;
                    j3 = j;
                    jScaleLargeTimestamp7 = Math.max(j3, jScaleLargeTimestamp7);
                } else {
                    iArr4 = iArr2;
                    j3 = j;
                }
                jArr14[i35] = jScaleLargeTimestamp6 + jScaleLargeTimestamp7;
                if (i37 != 0 && iArr14[i35] > i5) {
                    i5 = iArr16[i36];
                }
                i35++;
                i36++;
                j = j3;
                jArr = jArr15;
                iArr9 = iArr16;
                jArrCopyOf = jArr16;
                iArr2 = iArr4;
                i38 = i41;
            }
            j15 += track.editListDurations[i33];
            i33++;
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            i34 = i37;
        }
        return new TrackSampleTable(track, jArr13, iArr14, i5, jArr14, iArr15, Util.scaleLargeTimestamp(j15, 1000000L, track.movieTimescale));
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string2 = parsableByteArray.readString(s);
        int iMax = Math.max(string2.lastIndexOf(43), string2.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string2.substring(0, iMax)), Float.parseFloat(string2.substring(iMax, string2.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i4 < i2) {
                if (parsableByteArray.getData()[position + i4] != -1) {
                    long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (unsignedInt != 0) {
                        j = unsignedInt;
                    }
                } else {
                    i4++;
                }
            } else {
                parsableByteArray.skipBytes(i2);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        return new TkhdData(i, j, i3);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i3 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i3);
        int i4 = 0;
        while (i4 < i3) {
            int position = parsableByteArray.getPosition();
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            int i6 = parsableByteArray.readInt();
            if (i6 == 1635148593 || i6 == 1635148595 || i6 == 1701733238 || i6 == 1831958048 || i6 == 1836070006 || i6 == 1752589105 || i6 == 1751479857 || i6 == 1932670515 || i6 == 1211250227 || i6 == 1987063864 || i6 == 1987063865 || i6 == 1635135537 || i6 == 1685479798 || i6 == 1685479729 || i6 == 1685481573 || i6 == 1685481521) {
                StsdData stsdData2 = stsdData;
                int i7 = i4;
                parseVideoSampleEntry(parsableByteArray, i6, position, i5, i, i2, drmInitData, stsdData2, i7);
                stsdData = stsdData2;
                i4 = i7;
            } else if (i6 == 1836069985 || i6 == 1701733217 || i6 == 1633889587 || i6 == 1700998451 || i6 == 1633889588 || i6 == 1835823201 || i6 == 1685353315 || i6 == 1685353317 || i6 == 1685353320 || i6 == 1685353324 || i6 == 1685353336 || i6 == 1935764850 || i6 == 1935767394 || i6 == 1819304813 || i6 == 1936684916 || i6 == 1953984371 || i6 == 778924082 || i6 == 778924083 || i6 == 1835557169 || i6 == 1835560241 || i6 == 1634492771 || i6 == 1634492791 || i6 == 1970037111 || i6 == 1332770163 || i6 == 1716281667) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i6, position, i5, i, str, z, drmInitData, stsdData3, i4);
                stsdData = stsdData3;
            } else if (i6 == 1414810956 || i6 == 1954034535 || i6 == 2004251764 || i6 == 1937010800 || i6 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, i6, position, i5, i, str, stsdData);
            } else if (i6 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i6, position, i, stsdData);
            } else if (i6 == 1667329389) {
                stsdData.f9740format = new Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + i5);
            i4++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListM1000of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableListM1000of = ImmutableList.m1000of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.f9740format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableListM1000of).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i12 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i13);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        } else {
            str = "video/mpeg";
        }
        float paspFromParent = 1.0f;
        int i14 = 8;
        int i15 = 8;
        List listM1000of = null;
        String str4 = null;
        byte[] projFromParent = null;
        int i16 = -1;
        int i17 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i18 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsFromParent = null;
        boolean z = false;
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i19 = parsableByteArray.readInt();
            if (i19 == 0 && parsableByteArray.getPosition() - i12 == i13) {
                break;
            }
            ExtractorUtil.checkContainerInput(i19 > 0, "childAtomSize must be positive");
            int i20 = parsableByteArray.readInt();
            if (i20 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List list = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str5 = avcConfig.codecs;
                int i21 = avcConfig.maxNumReorderFrames;
                int i22 = avcConfig.colorSpace;
                int i23 = avcConfig.colorRange;
                int i24 = avcConfig.colorTransfer;
                int i25 = avcConfig.bitdepthLuma;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i7 = position;
                i8 = iIntValue;
                str2 = str3;
                i17 = i21;
                iIsoColorPrimariesToColorSpace = i22;
                i18 = i23;
                iIsoTransferCharacteristicsToColorTransfer = i24;
                i15 = avcConfig.bitdepthChroma;
                i14 = i25;
                listM1000of = list;
                str = "video/avc";
                str4 = str5;
            } else if (i20 == 1752589123) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                List list2 = hevcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = hevcConfig.pixelWidthHeightRatio;
                }
                int i26 = hevcConfig.maxNumReorderPics;
                String str6 = hevcConfig.codecs;
                int i27 = hevcConfig.colorSpace;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i7 = position;
                i17 = i26;
                i8 = iIntValue;
                str2 = str3;
                iIsoColorPrimariesToColorSpace = i27;
                i18 = hevcConfig.colorRange;
                iIsoTransferCharacteristicsToColorTransfer = hevcConfig.colorTransfer;
                str = "video/hevc";
                i14 = hevcConfig.bitdepthLuma;
                str4 = str6;
                listM1000of = list2;
                i15 = hevcConfig.bitdepthChroma;
            } else {
                if (i20 == 1685480259 || i20 == 1685485123) {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = position;
                    i8 = iIntValue;
                    str2 = str3;
                    i9 = i14;
                    i10 = iIsoColorPrimariesToColorSpace;
                    i11 = iIsoTransferCharacteristicsToColorTransfer;
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                    if (dolbyVisionConfig != null) {
                        str = "video/dolby-vision";
                        str4 = dolbyVisionConfig.codecs;
                    }
                } else if (i20 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    parsableByteArray.setPosition(position2 + 12);
                    parsableByteArray.skipBytes(2);
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    int i28 = unsignedByte >> 4;
                    boolean z2 = (unsignedByte & 1) != 0;
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte2);
                    i18 = z2 ? 1 : 2;
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte3);
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = position;
                    i14 = i28;
                    i15 = i14;
                    i8 = iIntValue;
                    str2 = str3;
                    str = str7;
                } else if (i20 == 1635135811) {
                    int i29 = i19 - 8;
                    byte[] bArr = new byte[i29];
                    parsableByteArray.readBytes(bArr, 0, i29);
                    listM1000of = ImmutableList.m1000of(bArr);
                    parsableByteArray.setPosition(position2 + 8);
                    ColorInfo av1c = parseAv1c(parsableByteArray);
                    int i30 = av1c.lumaBitdepth;
                    int i31 = av1c.chromaBitdepth;
                    int i32 = av1c.colorSpace;
                    int i33 = av1c.colorRange;
                    iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = position;
                    i8 = iIntValue;
                    str2 = str3;
                    iIsoColorPrimariesToColorSpace = i32;
                    i18 = i33;
                    str = "video/av01";
                    i14 = i30;
                    i15 = i31;
                } else if (i20 == 1668050025) {
                    if (byteBufferAllocateHdrStaticInfo == null) {
                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                    byteBuffer.position(21);
                    byteBuffer.putShort(parsableByteArray.readShort());
                    byteBuffer.putShort(parsableByteArray.readShort());
                    byteBufferAllocateHdrStaticInfo = byteBuffer;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = position;
                    i8 = iIntValue;
                    str2 = str3;
                } else if (i20 == 1835295606) {
                    if (byteBufferAllocateHdrStaticInfo == null) {
                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                    short s = parsableByteArray.readShort();
                    short s2 = parsableByteArray.readShort();
                    short s3 = parsableByteArray.readShort();
                    i7 = position;
                    short s4 = parsableByteArray.readShort();
                    i8 = iIntValue;
                    short s5 = parsableByteArray.readShort();
                    str2 = str3;
                    short s6 = parsableByteArray.readShort();
                    short s7 = parsableByteArray.readShort();
                    int i34 = i14;
                    short s8 = parsableByteArray.readShort();
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    byteBuffer2.position(1);
                    byteBuffer2.putShort(s5);
                    byteBuffer2.putShort(s6);
                    byteBuffer2.putShort(s);
                    byteBuffer2.putShort(s2);
                    byteBuffer2.putShort(s3);
                    byteBuffer2.putShort(s4);
                    byteBuffer2.putShort(s7);
                    byteBuffer2.putShort(s8);
                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                    i14 = i34;
                } else {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i7 = position;
                    i8 = iIntValue;
                    str2 = str3;
                    i9 = i14;
                    if (i20 == 1681012275) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        str = str2;
                    } else if (i20 == 1702061171) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                        String str8 = esdsFromParent.mimeType;
                        byte[] bArr2 = esdsFromParent.initializationData;
                        if (bArr2 != null) {
                            listM1000of = ImmutableList.m1000of(bArr2);
                        }
                        str = str8;
                    } else if (i20 == 1885434736) {
                        paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                        i14 = i9;
                        z = true;
                    } else if (i20 == 1937126244) {
                        projFromParent = parseProjFromParent(parsableByteArray, position2, i19);
                    } else if (i20 == 1936995172) {
                        int unsignedByte4 = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (unsignedByte4 == 0) {
                            int unsignedByte5 = parsableByteArray.readUnsignedByte();
                            if (unsignedByte5 == 0) {
                                i16 = 0;
                            } else if (unsignedByte5 == 1) {
                                i16 = 1;
                            } else if (unsignedByte5 == 2) {
                                i16 = 2;
                            } else if (unsignedByte5 == 3) {
                                i16 = 3;
                            }
                        }
                    } else {
                        i10 = iIsoColorPrimariesToColorSpace;
                        if (i20 == 1668246642) {
                            i11 = iIsoTransferCharacteristicsToColorTransfer;
                            if (i10 == -1 && i11 == -1) {
                                int i35 = parsableByteArray.readInt();
                                if (i35 == 1852009592 || i35 == 1852009571) {
                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                    parsableByteArray.skipBytes(2);
                                    boolean z3 = i19 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                    i18 = z3 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                    i14 = i9;
                                } else {
                                    Log.m538w("AtomParsers", "Unsupported color type: " + Atom.getAtomTypeString(i35));
                                }
                            }
                        } else {
                            i11 = iIsoTransferCharacteristicsToColorTransfer;
                        }
                    }
                    i14 = i9;
                }
                iIsoTransferCharacteristicsToColorTransfer = i11;
                iIsoColorPrimariesToColorSpace = i10;
                i14 = i9;
            }
            position = i7 + i19;
            i12 = i2;
            i13 = i3;
            stsdData2 = stsdData;
            iIntValue = i8;
            str3 = str2;
            drmInitDataCopyWithSchemeType = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i36 = i14;
        int i37 = iIsoColorPrimariesToColorSpace;
        int i38 = iIsoTransferCharacteristicsToColorTransfer;
        if (str == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str4).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i16).setInitializationData(listM1000of).setMaxNumReorderSamples(i17).setDrmInitData(drmInitData3).setColorInfo(new ColorInfo.Builder().setColorSpace(i37).setColorRange(i18).setColorTransfer(i38).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i36).setChromaBitdepth(i15).build());
        if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.f9740format = colorInfo.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.m537i("AtomParsers", "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m537i("AtomParsers", "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.m537i("AtomParsers", "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.m537i("AtomParsers", "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m537i("AtomParsers", "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.m537i("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.f9740format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int i6;
        int unsignedShort2;
        int unsignedFixedPoint1616;
        int i7;
        int i8;
        String str2;
        String str3;
        int i9;
        String str4;
        char c;
        String str5;
        ImmutableList immutableListM1001of;
        int i10 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            i6 = 2;
            unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i7 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i8 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedShort2 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (unsignedIntToInt2 & 1) != 0;
            boolean z3 = (unsignedIntToInt2 & 2) != 0;
            i6 = 2;
            if (!z2) {
                i8 = unsignedIntToInt == 8 ? 3 : unsignedIntToInt == 16 ? z3 ? 268435456 : 2 : unsignedIntToInt == 24 ? z3 ? 1342177280 : 21 : unsignedIntToInt == 32 ? z3 ? 1610612736 : 22 : -1;
                parsableByteArray.skipBytes(8);
                i7 = 0;
            } else {
                if (unsignedIntToInt == 32) {
                    i8 = 4;
                }
                parsableByteArray.skipBytes(8);
                i7 = 0;
            }
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i10);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str6 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            str3 = "audio/raw";
            if (iIntValue != 1936684916) {
                if (iIntValue == 1953984371) {
                    i9 = 268435456;
                } else if (iIntValue == 1819304813) {
                    i9 = i8 == -1 ? i6 : i8;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    i9 = i8;
                    str3 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i9 = i8;
                    str3 = null;
                }
            }
            String str7 = str3;
            List<byte[]> listM1000of = null;
            String str8 = null;
            EsdsData esdsFromParent = null;
            while (position - i2 < i10) {
                parsableByteArray.setPosition(position);
                int i11 = parsableByteArray.readInt();
                int i12 = i9;
                ExtractorUtil.checkContainerInput(i11 > 0, "childAtomSize must be positive");
                int i13 = parsableByteArray.readInt();
                if (i13 == 1835557187) {
                    parsableByteArray.setPosition(position + 8);
                    parsableByteArray.skipBytes(1);
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (Objects.equals(str7, str6)) {
                        str5 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte));
                    } else {
                        str5 = String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                    }
                    String str9 = str5;
                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort3];
                    parsableByteArray.readBytes(bArr, 0, unsignedShort3);
                    if (listM1000of == null) {
                        immutableListM1001of = ImmutableList.m1000of(bArr);
                    } else {
                        immutableListM1001of = ImmutableList.m1001of(bArr, listM1000of.get(0));
                    }
                    listM1000of = immutableListM1001of;
                    str8 = str9;
                } else {
                    if (i13 == 1835557200) {
                        parsableByteArray.setPosition(position + 8);
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedByte2 > 0) {
                            byte[] bArr2 = new byte[unsignedByte2];
                            str4 = str6;
                            parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                            if (listM1000of == null) {
                                listM1000of = ImmutableList.m1000of(bArr2);
                            } else {
                                listM1000of = ImmutableList.m1001of(listM1000of.get(0), bArr2);
                            }
                        }
                    } else {
                        str4 = str6;
                        if (i13 == 1702061171 || (z && i13 == 2002876005)) {
                            int iFindBoxPosition = i13 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, i11);
                            if (iFindBoxPosition != -1) {
                                esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                                str7 = esdsFromParent.mimeType;
                                byte[] bArr3 = esdsFromParent.initializationData;
                                if (bArr3 != null) {
                                    if ("audio/vorbis".equals(str7)) {
                                        listM1000of = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                    } else {
                                        if ("audio/mp4a-latm".equals(str7)) {
                                            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                            int i14 = audioSpecificConfig.sampleRateHz;
                                            int i15 = audioSpecificConfig.channelCount;
                                            str8 = audioSpecificConfig.codecs;
                                            unsignedFixedPoint1616 = i14;
                                            unsignedShort2 = i15;
                                        }
                                        listM1000of = ImmutableList.m1000of(bArr3);
                                    }
                                }
                            }
                        } else {
                            if (i13 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.f9740format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.f9740format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.f9740format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i13 == 1684892784) {
                                if (i7 <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i7, null);
                                }
                                unsignedFixedPoint1616 = i7;
                                unsignedShort2 = i6;
                            } else if (i13 == 1684305011 || i13 == 1969517683) {
                                c = 24931;
                                stsdData.f9740format = new Format.Builder().setId(i4).setSampleMimeType(str7).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i13 == 1682927731) {
                                int i16 = i11 - 8;
                                byte[] bArr4 = opusMagic;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i16);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i16);
                                listM1000of = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i13 == 1684425825) {
                                byte[] bArr5 = new byte[i11 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[i6] = 97;
                                bArr5[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 4, i11 - 12);
                                listM1000of = ImmutableList.m1000of(bArr5);
                            } else {
                                c = 24931;
                                if (i13 == 1634492771) {
                                    int i17 = i11 - 12;
                                    byte[] bArr6 = new byte[i17];
                                    parsableByteArray.setPosition(position + 12);
                                    parsableByteArray.readBytes(bArr6, 0, i17);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                    int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    listM1000of = ImmutableList.m1000of(bArr6);
                                    unsignedFixedPoint1616 = iIntValue2;
                                    unsignedShort2 = iIntValue3;
                                }
                            }
                            c = 24931;
                        }
                        position += i11;
                        i10 = i3;
                        i9 = i12;
                        str6 = str4;
                    }
                    position += i11;
                    i10 = i3;
                    i9 = i12;
                    str6 = str4;
                }
                str4 = str6;
                position += i11;
                i10 = i3;
                i9 = i12;
                str6 = str4;
            }
            int i18 = i9;
            if (stsdData.f9740format == null || str7 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str7).setCodecs(str8).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i18).setInitializationData(listM1000of).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
            if (esdsFromParent != null) {
                language.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
            }
            stsdData.f9740format = language.build();
            return;
        }
        str3 = str2;
        String str72 = str3;
        List<byte[]> listM1000of2 = null;
        String str82 = null;
        EsdsData esdsFromParent2 = null;
        while (position - i2 < i10) {
        }
        int i182 = i9;
        if (stsdData.f9740format == null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String string2 = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string2 = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string2) && !"cbc1".equals(string2) && !"cens".equals(string2) && !"cbcs".equals(string2)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string2);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long unsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                unsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                unsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = unsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        private final long duration;

        /* renamed from: id */
        private final int f257id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f257id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {

        /* renamed from: format, reason: collision with root package name */
        public Format f9740format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format2) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format2.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format2.pcmEncoding, format2.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.m538w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int unsignedByte = this.data.readUnsignedByte();
                this.currentByte = unsignedByte;
                return (unsignedByte & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
