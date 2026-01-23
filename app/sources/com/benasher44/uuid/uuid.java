package com.benasher44.uuid;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: uuid.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b*\n\u0010\f\"\u00020\u00022\u00020\u0002¨\u0006\r"}, m3636d2 = {"", "string", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "uuidFrom", "(Ljava/lang/String;)Ljava/util/UUID;", "", "start", "end", "", "segmentToLong", "(Ljava/lang/String;II)J", "Uuid", "uuid"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.benasher44.uuid.UuidKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class uuid {
    public static final UUID uuidFrom(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        if (string2.length() == 36) {
            return new UUID(segmentToLong(string2, 0, 19), segmentToLong(string2, 19, 36));
        }
        throw new IllegalArgumentException("Invalid UUID string, expected exactly 36 characters but got " + string2.length() + ": " + string2);
    }

    private static final long segmentToLong(String str, int i, int i2) {
        long j;
        long j2 = 0;
        do {
            if (str.charAt(i) != '-') {
                j2 *= 16;
                char cCharAt = str.charAt(i);
                if (cCharAt != '0') {
                    if (cCharAt == '1') {
                        j = 1;
                    } else if (cCharAt == '2') {
                        j = 2;
                    } else if (cCharAt == '3') {
                        j = 3;
                    } else if (cCharAt == '4') {
                        j = 4;
                    } else if (cCharAt == '5') {
                        j = 5;
                    } else if (cCharAt == '6') {
                        j = 6;
                    } else if (cCharAt == '7') {
                        j = 7;
                    } else if (cCharAt == '8') {
                        j = 8;
                    } else if (cCharAt == '9') {
                        j = 9;
                    } else if (cCharAt == 'a' || cCharAt == 'A') {
                        j = 10;
                    } else if (cCharAt == 'b' || cCharAt == 'B') {
                        j = 11;
                    } else if (cCharAt == 'c' || cCharAt == 'C') {
                        j = 12;
                    } else if (cCharAt == 'd' || cCharAt == 'D') {
                        j = 13;
                    } else if (cCharAt == 'e' || cCharAt == 'E') {
                        j = 14;
                    } else {
                        if (cCharAt != 'f' && cCharAt != 'F') {
                            throw new IllegalArgumentException("Invalid UUID string, encountered non-hexadecimal digit `" + str.charAt(i) + "` at index " + i + " in: " + str);
                        }
                        j = 15;
                    }
                    j2 += j;
                }
            } else if (i != 8 && i != 13 && i != 18 && i != 23) {
                throw new IllegalArgumentException(("Invalid UUID string, encountered dash at index " + i + " but it can occur only at 8, 13, 18, or 23: " + str).toString());
            }
            i++;
        } while (i < i2);
        return j2;
    }
}
