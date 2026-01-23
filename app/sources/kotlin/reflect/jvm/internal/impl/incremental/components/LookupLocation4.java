package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LookupLocation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.incremental.components.Position, reason: use source file name */
/* loaded from: classes14.dex */
public final class LookupLocation4 implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final LookupLocation4 NO_POSITION = new LookupLocation4(-1, -1);
    private final int column;
    private final int line;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookupLocation4)) {
            return false;
        }
        LookupLocation4 lookupLocation4 = (LookupLocation4) obj;
        return this.line == lookupLocation4.line && this.column == lookupLocation4.column;
    }

    public int hashCode() {
        return (Integer.hashCode(this.line) * 31) + Integer.hashCode(this.column);
    }

    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }

    /* compiled from: LookupLocation.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.incremental.components.Position$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LookupLocation4 getNO_POSITION() {
            return LookupLocation4.NO_POSITION;
        }
    }

    public LookupLocation4(int i, int i2) {
        this.line = i;
        this.column = i2;
    }
}
