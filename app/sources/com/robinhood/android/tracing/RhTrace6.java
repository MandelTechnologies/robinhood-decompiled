package com.robinhood.android.tracing;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTrace.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bJ\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/tracing/TrackTrace;", "Lcom/robinhood/android/tracing/Tracer;", "Landroid/os/Parcelable;", "withMethodNamePrefix", "prefix", "", GoldFeature.INSTANT, "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "Noop", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tracing.TrackTrace, reason: use source file name */
/* loaded from: classes9.dex */
public interface RhTrace6 extends RhTrace5, Parcelable {
    RhTrace3 beginSpan(String methodName);

    void instant(String methodName);

    RhTrace6 withMethodNamePrefix(String prefix);

    /* compiled from: RhTrace.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/tracing/TrackTrace$Noop;", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "()V", "isEnabled", "", "()Z", "withMethodNamePrefix", "prefix", "", GoldFeature.INSTANT, "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.tracing.TrackTrace$Noop */
    public static final class Noop implements RhTrace6 {
        public static final Noop INSTANCE = new Noop();
        public static final Parcelable.Creator<Noop> CREATOR = new Creator();

        /* compiled from: RhTrace.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.tracing.TrackTrace$Noop$Creator */
        public static final class Creator implements Parcelable.Creator<Noop> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Noop createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Noop.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Noop[] newArray(int i) {
                return new Noop[i];
            }
        }

        @Override // com.robinhood.android.tracing.RhTrace6
        public RhTrace3 beginSpan(String methodName) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.android.tracing.RhTrace6
        public void instant(String methodName) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
        }

        @Override // com.robinhood.android.tracing.RhTrace5
        public boolean isEnabled() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Noop() {
        }

        @Override // com.robinhood.android.tracing.RhTrace6
        public RhTrace6 withMethodNamePrefix(String prefix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            return INSTANCE;
        }
    }
}
