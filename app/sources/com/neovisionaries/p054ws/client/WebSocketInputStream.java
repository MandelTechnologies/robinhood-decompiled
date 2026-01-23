package com.neovisionaries.p054ws.client;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.math.p525ec.Tnaf;

/* loaded from: classes27.dex */
class WebSocketInputStream extends FilterInputStream {
    public WebSocketInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public String readLine() throws IOException {
        return Misc.readLine(this, "UTF-8");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebSocketFrame readFrame() throws WebSocketException, IOException {
        int i;
        byte b;
        byte[] bArr;
        byte[] bArr2 = new byte[8];
        try {
            readBytes(bArr2, 2);
            byte b2 = bArr2[0];
            boolean z = (b2 & 128) != 0;
            boolean z2 = (b2 & 64) != 0;
            boolean z3 = (b2 & 32) != 0;
            boolean z4 = (b2 & Tnaf.POW_2_WIDTH) != 0;
            int i2 = b2 & 15;
            byte b3 = bArr2[1];
            boolean z5 = (b3 & 128) != 0;
            long j = b3 & 127;
            if (j != 126) {
                if (j == 127) {
                    readBytes(bArr2, 8);
                    byte b4 = bArr2[0];
                    if ((b4 & 128) != 0) {
                        throw new WebSocketException(WebSocketError.INVALID_PAYLOAD_LENGTH, "The payload length of a frame is invalid.");
                    }
                    i = ((bArr2[6] & 255) << 8) | ((bArr2[2] & 255) << 40) | ((b4 & 255) << 56) | ((bArr2[1] & 255) << 48) | ((bArr2[3] & 255) << 32) | ((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16);
                    b = bArr2[7];
                }
                if (z5) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                    readBytes(bArr, 4);
                }
                if (2147483647L >= j) {
                    skipQuietly(j);
                    throw new WebSocketException(WebSocketError.TOO_LONG_PAYLOAD, "The payload length of a frame exceeds the maximum array size in Java.");
                }
                return new WebSocketFrame().setFin(z).setRsv1(z2).setRsv2(z3).setRsv3(z4).setOpcode(i2).setMask(z5).setPayload(readPayload(j, z5, bArr));
            }
            readBytes(bArr2, 2);
            i = (bArr2[0] & 255) << 8;
            b = bArr2[1];
            j = i | (b & 255);
            if (z5) {
            }
            if (2147483647L >= j) {
            }
        } catch (InsufficientDataException e) {
            if (e.getReadByteCount() == 0) {
                throw new NoMoreFrameException();
            }
            throw e;
        }
    }

    void readBytes(byte[] bArr, int i) throws WebSocketException, IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new InsufficientDataException(i, i2);
            }
            i2 += i3;
        }
    }

    private void skipQuietly(long j) throws IOException {
        try {
            skip(j);
        } catch (IOException unused) {
        }
    }

    private byte[] readPayload(long j, boolean z, byte[] bArr) throws WebSocketException, IOException {
        if (j == 0) {
            return null;
        }
        int i = (int) j;
        try {
            byte[] bArr2 = new byte[i];
            readBytes(bArr2, i);
            if (z) {
                WebSocketFrame.mask(bArr, bArr2);
            }
            return bArr2;
        } catch (OutOfMemoryError e) {
            skipQuietly(j);
            throw new WebSocketException(WebSocketError.INSUFFICIENT_MEMORY_FOR_PAYLOAD, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e.getMessage(), e);
        }
    }
}
