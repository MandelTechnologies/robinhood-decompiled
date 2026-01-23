package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

/* loaded from: classes4.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z) throws IOException {
        return sniffInternal(extractorInput, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z, boolean z2) throws IOException {
        SniffFailure sniffFailure;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long length = extractorInput.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i5 = (int) j3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (i7 < i5) {
            parsableByteArray.reset(8);
            boolean z4 = true;
            if (!extractorInput.peekFully(parsableByteArray.getData(), i6, 8, true)) {
                break;
            }
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i8 = parsableByteArray.readInt();
            if (unsignedInt == 1) {
                j = j2;
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i3 = 16;
                parsableByteArray.setLimit(16);
                unsignedInt = parsableByteArray.readLong();
                i2 = i7;
            } else {
                j = j2;
                if (unsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j) {
                        i2 = i7;
                        unsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    } else {
                        i2 = i7;
                    }
                    i3 = 8;
                }
            }
            long j4 = unsignedInt;
            long j5 = i3;
            if (j4 < j5) {
                return new AtomSizeTooSmallSniffFailure(i8, j4, i3);
            }
            int i9 = i2 + i3;
            sniffFailure = null;
            if (i8 == 1836019574) {
                i5 += (int) j4;
                if (length != -1 && i5 > length) {
                    i5 = (int) length;
                }
                i7 = i9;
                j2 = j;
                i6 = 0;
            } else {
                if (i8 == 1836019558 || i8 == 1836475768) {
                    i = 1;
                    break;
                }
                if (i8 == 1835295092) {
                    z3 = true;
                }
                long j6 = length;
                if ((i9 + j4) - j5 >= i5) {
                    i = 0;
                    break;
                }
                int i10 = (int) (j4 - j5);
                i7 = i9 + i10;
                if (i8 != 1718909296) {
                    i4 = 0;
                    if (i10 != 0) {
                        extractorInput.advancePeekPosition(i10);
                    }
                } else {
                    if (i10 < 8) {
                        return new AtomSizeTooSmallSniffFailure(i8, i10, 8);
                    }
                    parsableByteArray.reset(i10);
                    i4 = 0;
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i10);
                    int i11 = parsableByteArray.readInt();
                    if (isCompatibleBrand(i11, z2)) {
                        z3 = true;
                    }
                    parsableByteArray.skipBytes(4);
                    int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                    if (!z3 && iBytesLeft > 0) {
                        iArr = new int[iBytesLeft];
                        int i12 = 0;
                        while (true) {
                            if (i12 >= iBytesLeft) {
                                z4 = z3;
                                break;
                            }
                            int i13 = parsableByteArray.readInt();
                            iArr[i12] = i13;
                            if (isCompatibleBrand(i13, z2)) {
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z4 = z3;
                        iArr = null;
                    }
                    if (!z4) {
                        return new UnsupportedBrandsSniffFailure(i11, iArr);
                    }
                    z3 = z4;
                }
                i6 = i4;
                j2 = j;
                length = j6;
            }
        }
        sniffFailure = null;
        i = i6;
        if (!z3) {
            return NoDeclaredBrandSniffFailure.INSTANCE;
        }
        if (z == i) {
            return sniffFailure;
        }
        if (i != 0) {
            return IncorrectFragmentationSniffFailure.FILE_FRAGMENTED;
        }
        return IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED;
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
