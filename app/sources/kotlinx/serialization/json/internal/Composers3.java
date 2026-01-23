package kotlinx.serialization.json.internal;

import com.ionspin.kotlin.bignum.integer.base63.BigInteger63UtilityKt$$ExternalSyntheticBackport1;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composers.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.ComposerForUnsignedNumbers, reason: use source file name */
/* loaded from: classes14.dex */
public final class Composers3 extends Composers {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Composers3(JsonStreams3 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composers
    public void print(int v) {
        boolean z = this.forceQuoting;
        String string2 = Long.toString(UInt.m28582constructorimpl(v) & 4294967295L, 10);
        if (z) {
            printQuoted(string2);
        } else {
            print(string2);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composers
    public void print(long v) {
        boolean z = this.forceQuoting;
        long jM28605constructorimpl = ULong.m28605constructorimpl(v);
        if (z) {
            printQuoted(BigInteger63UtilityKt$$ExternalSyntheticBackport1.m1067m(jM28605constructorimpl, 10));
        } else {
            print(BigInteger63UtilityKt$$ExternalSyntheticBackport1.m1067m(jM28605constructorimpl, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composers
    public void print(byte v) {
        boolean z = this.forceQuoting;
        String strM28563toStringimpl = UByte.m28563toStringimpl(UByte.m28560constructorimpl(v));
        if (z) {
            printQuoted(strM28563toStringimpl);
        } else {
            print(strM28563toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composers
    public void print(short v) {
        boolean z = this.forceQuoting;
        String strM28632toStringimpl = UShort.m28632toStringimpl(UShort.m28629constructorimpl(v));
        if (z) {
            printQuoted(strM28632toStringimpl);
        } else {
            print(strM28632toStringimpl);
        }
    }
}
