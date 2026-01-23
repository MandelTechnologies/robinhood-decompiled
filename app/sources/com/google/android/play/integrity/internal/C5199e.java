package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.e */
/* loaded from: classes27.dex */
final class C5199e extends AbstractC5200f {

    /* renamed from: a */
    private final int f853a;

    /* renamed from: b */
    private final long f854b;

    C5199e(int i, long j) {
        this.f853a = i;
        this.f854b = j;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5200f
    /* renamed from: a */
    public final int mo972a() {
        return this.f853a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5200f
    /* renamed from: b */
    public final long mo973b() {
        return this.f854b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5200f) {
            AbstractC5200f abstractC5200f = (AbstractC5200f) obj;
            if (this.f853a == abstractC5200f.mo972a() && this.f854b == abstractC5200f.mo973b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f854b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f853a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f853a + ", eventTimestamp=" + this.f854b + "}";
    }
}
