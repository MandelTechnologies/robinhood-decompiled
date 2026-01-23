package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

/* compiled from: boxing.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"", "primitive", "Ljava/lang/Boolean;", "boxBoolean", "(Z)Ljava/lang/Boolean;", "", "Ljava/lang/Integer;", "boxInt", "(I)Ljava/lang/Integer;", "", "Ljava/lang/Long;", "boxLong", "(J)Ljava/lang/Long;", "", "Ljava/lang/Float;", "boxFloat", "(F)Ljava/lang/Float;", "", "Ljava/lang/Double;", "boxDouble", "(D)Ljava/lang/Double;", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* renamed from: kotlin.coroutines.jvm.internal.Boxing, reason: use source file name */
/* loaded from: classes21.dex */
public final class boxing {
    @SinceKotlin
    @PublishedApi
    public static final Boolean boxBoolean(boolean z) {
        return Boolean.valueOf(z);
    }

    @SinceKotlin
    @PublishedApi
    public static final Integer boxInt(int i) {
        return new Integer(i);
    }

    @SinceKotlin
    @PublishedApi
    public static final Long boxLong(long j) {
        return new Long(j);
    }

    @SinceKotlin
    @PublishedApi
    public static final Float boxFloat(float f) {
        return new Float(f);
    }

    @SinceKotlin
    @PublishedApi
    public static final Double boxDouble(double d) {
        return new Double(d);
    }
}
