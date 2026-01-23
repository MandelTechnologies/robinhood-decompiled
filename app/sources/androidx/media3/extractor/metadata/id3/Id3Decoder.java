package androidx.media3.extractor.metadata.id3;

import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: androidx.media3.extractor.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return Id3Decoder.$r8$lambda$OHbcD1hYkGZ4XWUc9y6URLEaOao(i, i2, i3, i4, i5);
        }
    };
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean $r8$lambda$OHbcD1hYkGZ4XWUc9y6URLEaOao(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata decode(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i2, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                Log.m538w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.m538w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.m538w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.m538w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                Log.m538w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int unsignedInt24;
        long unsignedInt242;
        int unsignedShort;
        int i3;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt242 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt242 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt242 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & unsignedInt242) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt242 = (((unsignedInt242 >> 24) & 255) << 21) | (unsignedInt242 & 255) | (((unsignedInt242 >> 8) & 255) << 7) | (((unsignedInt242 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (unsignedInt242 < i3) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() >= unsignedInt242) {
                    parsableByteArray.skipBytes((int) unsignedInt242);
                } else {
                    parsableByteArray.setPosition(position);
                    return false;
                }
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, FramePredicate framePredicate) throws Throwable {
        int unsignedInt24;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        ParsableByteArray parsableByteArray2;
        Throwable th;
        ParsableByteArray parsableByteArray3;
        int i7;
        ParsableByteArray parsableByteArray4;
        ?? r12;
        Parcelable parcelableDecodeBinaryFrame;
        int i8 = i;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        int unsignedByte4 = i8 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i8 == 4) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
            if (!z) {
                unsignedInt24 = (((unsignedInt24 >> 24) & 255) << 21) | (unsignedInt24 & 255) | (((unsignedInt24 >> 8) & 255) << 7) | (((unsignedInt24 >> 16) & 255) << 14);
            }
        } else if (i8 == 3) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedInt24 = parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedInt24;
        int unsignedShort = i8 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            Log.m538w("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            boolean zEvaluate = framePredicate.evaluate(i8, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            i8 = i8;
            r1 = unsignedByte;
            i3 = unsignedByte2;
            if (!zEvaluate) {
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            i3 = unsignedByte2;
            r1 = unsignedByte;
        }
        if (i8 == 3) {
            z2 = (unsignedShort & 128) != 0;
            z4 = (unsignedShort & 64) != 0;
            z3 = (unsignedShort & 32) != 0;
            z5 = false;
            z = z2;
        } else if (i8 == 4) {
            boolean z6 = (unsignedShort & 64) != 0;
            boolean z7 = (unsignedShort & 8) != 0;
            boolean z8 = (unsignedShort & 4) != 0;
            z5 = (unsignedShort & 2) != 0;
            z = (unsignedShort & 1) != 0;
            z3 = z6;
            z2 = z;
            z = z7;
            z4 = z8;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (z || z4) {
            Log.m538w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(position);
            return null;
        }
        if (z3) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z2) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z5) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                parsableByteArray3 = parsableByteArray;
            }
        } catch (Exception e) {
            e = e;
            i4 = r1;
            i5 = i3;
            i6 = unsignedByte4;
            parsableByteArray2 = parsableByteArray;
            i3 = iRemoveUnsynchronization;
            th = null;
            i7 = unsignedByte3;
            parsableByteArray4 = parsableByteArray2;
            parsableByteArray4.setPosition(position);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e2) {
            e = e2;
            i4 = r1;
            i5 = i3;
            i6 = unsignedByte4;
            parsableByteArray2 = parsableByteArray;
            i3 = iRemoveUnsynchronization;
            th = null;
            i7 = unsignedByte3;
            parsableByteArray4 = parsableByteArray2;
            parsableByteArray4.setPosition(position);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (r1 == 84 && i3 == 88 && unsignedByte3 == 88 && (i8 == 2 || unsignedByte4 == 88)) {
            parcelableDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
        } else if (r1 == 84) {
            parcelableDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i8, r1, i3, unsignedByte3, unsignedByte4));
        } else if (r1 == 87 && i3 == 88 && unsignedByte3 == 88 && (i8 == 2 || unsignedByte4 == 88)) {
            parcelableDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
        } else if (r1 == 87) {
            parcelableDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i8, r1, i3, unsignedByte3, unsignedByte4));
        } else if (r1 == 80 && i3 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
            parcelableDecodeBinaryFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
        } else if (r1 == 71 && i3 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i8 == 2)) {
            parcelableDecodeBinaryFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
        } else {
            th = null;
            try {
            } catch (Exception e3) {
                e = e3;
                i4 = r1;
                i5 = i3;
                i6 = unsignedByte4;
                parsableByteArray2 = parsableByteArray;
                i3 = iRemoveUnsynchronization;
                i7 = unsignedByte3;
                parsableByteArray4 = parsableByteArray2;
                parsableByteArray4.setPosition(position);
                r12 = th;
                if (r12 == 0) {
                }
                return r12;
            } catch (OutOfMemoryError e4) {
                e = e4;
                i4 = r1;
                i5 = i3;
                i6 = unsignedByte4;
                parsableByteArray2 = parsableByteArray;
                i3 = iRemoveUnsynchronization;
                i7 = unsignedByte3;
                parsableByteArray4 = parsableByteArray2;
                parsableByteArray4.setPosition(position);
                r12 = th;
                if (r12 == 0) {
                }
                return r12;
            }
            if (i8 != 2 ? r1 == 65 && i3 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67 : r1 == 80 && i3 == 73 && unsignedByte3 == 67) {
                parcelableDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i8);
            } else {
                if (r1 != 67 || i3 != 79 || unsignedByte3 != 77 || (unsignedByte4 != 77 && i8 != 2)) {
                    if (r1 == 67 && i3 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                        i4 = r1;
                        i5 = i3;
                        i6 = unsignedByte4;
                        i3 = iRemoveUnsynchronization;
                        i7 = unsignedByte3;
                        try {
                            parcelableDecodeBinaryFrame = decodeChapterFrame(parsableByteArray, i3, i8, z, i2, framePredicate);
                            i8 = i;
                            r1 = parsableByteArray;
                            r1.setPosition(position);
                            r12 = parcelableDecodeBinaryFrame;
                            e = th;
                        } catch (Exception e5) {
                            e = e5;
                            i8 = i;
                            parsableByteArray4 = parsableByteArray;
                            parsableByteArray4.setPosition(position);
                            r12 = th;
                            if (r12 == 0) {
                            }
                            return r12;
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                            i8 = i;
                            parsableByteArray4 = parsableByteArray;
                            parsableByteArray4.setPosition(position);
                            r12 = th;
                            if (r12 == 0) {
                            }
                            return r12;
                        } catch (Throwable th3) {
                            th = th3;
                            parsableByteArray3 = parsableByteArray;
                            parsableByteArray3.setPosition(position);
                            throw th;
                        }
                    } else {
                        i4 = r1;
                        i5 = i3;
                        i6 = unsignedByte4;
                        i3 = iRemoveUnsynchronization;
                        i7 = unsignedByte3;
                        try {
                            if (i4 == 67 && i5 == 84 && i7 == 79 && i6 == 67) {
                                i8 = i;
                                ParsableByteArray parsableByteArray5 = parsableByteArray;
                                parcelableDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray5, i3, i8, z, i2, framePredicate);
                                r1 = parsableByteArray5;
                            } else {
                                i8 = i;
                                ParsableByteArray parsableByteArray6 = parsableByteArray;
                                if (i4 == 77 && i5 == 76 && i7 == 76 && i6 == 84) {
                                    parcelableDecodeBinaryFrame = decodeMlltFrame(parsableByteArray6, i3);
                                    r1 = parsableByteArray6;
                                } else {
                                    parcelableDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray6, i3, getFrameId(i8, i4, i5, i7, i6));
                                    r1 = parsableByteArray6;
                                }
                            }
                            r1.setPosition(position);
                            r12 = parcelableDecodeBinaryFrame;
                            e = th;
                        } catch (Exception e7) {
                            e = e7;
                            parsableByteArray4 = r1;
                            parsableByteArray4.setPosition(position);
                            r12 = th;
                            if (r12 == 0) {
                            }
                            return r12;
                        } catch (OutOfMemoryError e8) {
                            e = e8;
                            parsableByteArray4 = r1;
                            parsableByteArray4.setPosition(position);
                            r12 = th;
                            if (r12 == 0) {
                            }
                            return r12;
                        } catch (Throwable th4) {
                            th = th4;
                            parsableByteArray3 = r1;
                            parsableByteArray3.setPosition(position);
                            throw th;
                        }
                    }
                    if (r12 == 0) {
                        Log.m539w("Id3Decoder", "Failed to decode frame: id=" + getFrameId(i8, i4, i5, i7, i6) + ", frameSize=" + i3, e);
                    }
                    return r12;
                }
                parcelableDecodeBinaryFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
            }
            i4 = r1;
            i5 = i3;
            i6 = unsignedByte4;
            r1 = parsableByteArray;
            i3 = iRemoveUnsynchronization;
            r1 = r1;
            i7 = unsignedByte3;
            r1.setPosition(position);
            r12 = parcelableDecodeBinaryFrame;
            e = th;
            if (r12 == 0) {
            }
            return r12;
        }
        i4 = r1;
        i5 = i3;
        i6 = unsignedByte4;
        r1 = parsableByteArray;
        i3 = iRemoveUnsynchronization;
        th = null;
        r1 = r1;
        i7 = unsignedByte3;
        r1.setPosition(position);
        r12 = parcelableDecodeBinaryFrame;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m1000of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < iIndexOfTerminator) {
            builder.add((ImmutableList.Builder) new String(bArr, i2, iIndexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        ImmutableList<String> immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.m1000of("") : immutableListBuild;
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), Charsets.ISO_8859_1));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), Charsets.ISO_8859_1));
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, Charsets.ISO_8859_1));
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i3, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i2));
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iIndexOfZeroByte, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i5, unsignedByte);
        return new ApicFrame(str, new String(bArr, i5, iIndexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i3));
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (parsableByteArray.getPosition() < i6) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i4, i5, unsignedInt, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, Charsets.ISO_8859_1);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt242 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static Charset getCharset(int i) {
        if (i == 1) {
            return Charsets.UTF_16;
        }
        if (i == 2) {
            return Charsets.UTF_16BE;
        }
        if (i == 3) {
            return Charsets.UTF_8;
        }
        return Charsets.ISO_8859_1;
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if ((iIndexOfZeroByte - i) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, charset);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }
}
