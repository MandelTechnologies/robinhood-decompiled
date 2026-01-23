package com.nimbusds.jose.shaded.ow2asm;

/* loaded from: classes27.dex */
public class TypeReference {
    static void putTarget(int i, ByteVector byteVector) {
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 1) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i2);
                    return;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case SDK_ASSET_ICON_HOME_VALUE:
                        case 69:
                        case 70:
                            break;
                        case SDK_ASSET_ICON_GUIDE_VALUE:
                        case SDK_ASSET_ICON_GLOBE_VALUE:
                        case 73:
                        case 74:
                        case 75:
                            byteVector.putInt(i);
                            return;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            byteVector.put12(i2, (i & 16776960) >> 8);
            return;
        }
        byteVector.putShort(i >>> 16);
    }
}
