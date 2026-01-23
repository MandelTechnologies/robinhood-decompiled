package com.robinhood.android.tracing;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.tracing.RhTrace6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTrace.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/tracing/TagTrace;", "Lcom/robinhood/android/tracing/Tracer;", "Landroid/os/Parcelable;", "forTrack", "Lcom/robinhood/android/tracing/TrackTrace;", "trackName", "", GoldFeature.INSTANT, "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "Noop", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tracing.TagTrace, reason: use source file name */
/* loaded from: classes9.dex */
public interface RhTrace4 extends RhTrace5, Parcelable {
    RhTrace3 beginSpan(String trackName, String methodName);

    RhTrace6 forTrack(String trackName);

    void instant(String trackName, String methodName);

    /* compiled from: RhTrace.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/tracing/TagTrace$Noop;", "Lcom/robinhood/android/tracing/TagTrace;", "<init>", "()V", "isEnabled", "", "()Z", "forTrack", "Lcom/robinhood/android/tracing/TrackTrace;", "trackName", "", GoldFeature.INSTANT, "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.tracing.TagTrace$Noop */
    public static final class Noop implements RhTrace4 {
        public static final Noop INSTANCE = new Noop();
        public static final Parcelable.Creator<Noop> CREATOR = new Creator();

        /* compiled from: RhTrace.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.tracing.TagTrace$Noop$Creator */
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

        @Override // com.robinhood.android.tracing.RhTrace4
        public RhTrace3 beginSpan(String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.android.tracing.RhTrace4
        public void instant(String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
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

        @Override // com.robinhood.android.tracing.RhTrace4
        public RhTrace6 forTrack(String trackName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            return RhTrace6.Noop.INSTANCE;
        }
    }
}
