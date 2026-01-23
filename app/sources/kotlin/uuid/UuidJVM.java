package kotlin.uuid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UuidJVM.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", "formatBytesInto", "(J[BIII)V", "", "hexDashString", "Lkotlin/uuid/Uuid;", "uuidParseHexDash", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "hexString", "uuidParseHex", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
/* renamed from: kotlin.uuid.UuidKt__UuidJVMKt, reason: use source file name */
/* loaded from: classes14.dex */
class UuidJVM {
    @ExperimentalUuidApi
    public static final void formatBytesInto(long j, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Uuid2.formatBytesIntoCommonImpl(j, dst, i, i2, i3);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHexDash(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return Uuid2.uuidParseHexDashCommonImpl(hexDashString);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHex(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return Uuid2.uuidParseHexCommonImpl(hexString);
    }
}
