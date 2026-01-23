package microgram.android;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Monitoring.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/MicrogramState;", "", "Loading", "Ready", "Terminated", "Lmicrogram/android/MicrogramState$Loading;", "Lmicrogram/android/MicrogramState$Ready;", "Lmicrogram/android/MicrogramState$Terminated;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.MicrogramState, reason: use source file name */
/* loaded from: classes14.dex */
public interface Monitoring {

    /* compiled from: Monitoring.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Loading;", "Lmicrogram/android/MicrogramState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.MicrogramState$Loading */
    public static final /* data */ class Loading implements Monitoring {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1895464214;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: Monitoring.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Ready;", "Lmicrogram/android/MicrogramState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.MicrogramState$Ready */
    public static final /* data */ class Ready implements Monitoring {
        public static final Ready INSTANCE = new Ready();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ready);
        }

        public int hashCode() {
            return 887661565;
        }

        public String toString() {
            return "Ready";
        }

        private Ready() {
        }
    }

    /* compiled from: Monitoring.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\tR\u001a\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Terminated;", "Lmicrogram/android/MicrogramState;", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "getException", "()Ljava/io/IOException;", "Closed", "AppUpdateRequired", "Failure", "Lmicrogram/android/MicrogramState$Terminated$AppUpdateRequired;", "Lmicrogram/android/MicrogramState$Terminated$Closed;", "Lmicrogram/android/MicrogramState$Terminated$Failure;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.MicrogramState$Terminated */
    public interface Terminated extends Monitoring {
        IOException getException();

        /* compiled from: Monitoring.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Terminated$Closed;", "Lmicrogram/android/MicrogramState$Terminated;", "<init>", "()V", "exception", "", "getException", "()Ljava/lang/Void;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.android.MicrogramState$Terminated$Closed */
        public static final /* data */ class Closed implements Terminated {
            public static final Closed INSTANCE = new Closed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Closed);
            }

            /* renamed from: getException, reason: collision with other method in class */
            public Void m28944getException() {
                return null;
            }

            public int hashCode() {
                return 1444797201;
            }

            public String toString() {
                return "Closed";
            }

            private Closed() {
            }

            @Override // microgram.android.Monitoring.Terminated
            public /* bridge */ /* synthetic */ IOException getException() {
                return (IOException) m28944getException();
            }
        }

        /* compiled from: Monitoring.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Terminated$AppUpdateRequired;", "Lmicrogram/android/MicrogramState$Terminated;", "Lmicrogram/android/AppUpdateRequiredException;", "exception", "<init>", "(Lmicrogram/android/AppUpdateRequiredException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/AppUpdateRequiredException;", "getException", "()Lmicrogram/android/AppUpdateRequiredException;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.android.MicrogramState$Terminated$AppUpdateRequired, reason: from toString */
        public static final /* data */ class AppUpdateRequired implements Terminated {
            private final AppUpdateRequiredException exception;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AppUpdateRequired) && Intrinsics.areEqual(this.exception, ((AppUpdateRequired) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "AppUpdateRequired(exception=" + this.exception + ")";
            }

            public AppUpdateRequired(AppUpdateRequiredException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            @Override // microgram.android.Monitoring.Terminated
            public AppUpdateRequiredException getException() {
                return this.exception;
            }
        }

        /* compiled from: Monitoring.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/android/MicrogramState$Terminated$Failure;", "Lmicrogram/android/MicrogramState$Terminated;", "Ljava/io/IOException;", "Lokio/IOException;", "exception", "<init>", "(Ljava/io/IOException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/IOException;", "getException", "()Ljava/io/IOException;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.android.MicrogramState$Terminated$Failure, reason: from toString */
        public static final /* data */ class Failure implements Terminated {
            private final IOException exception;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Failure(exception=" + this.exception + ")";
            }

            public Failure(IOException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            @Override // microgram.android.Monitoring.Terminated
            public IOException getException() {
                return this.exception;
            }
        }
    }
}
