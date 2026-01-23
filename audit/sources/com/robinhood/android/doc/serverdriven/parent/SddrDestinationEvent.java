package com.robinhood.android.doc.serverdriven.parent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrDestinationEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "", "Next", "Prev", "Error", "Finish", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Error;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Finish;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Next;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Prev;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrDestinationEvent {

    /* compiled from: SddrDestinationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Next;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "destination", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "addToBackStack", "", "<init>", "(Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;Z)V", "getDestination", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination;", "getAddToBackStack", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Next implements SddrDestinationEvent {
        public static final int $stable = 8;
        private final boolean addToBackStack;
        private final SddrDestination destination;

        public static /* synthetic */ Next copy$default(Next next, SddrDestination sddrDestination, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                sddrDestination = next.destination;
            }
            if ((i & 2) != 0) {
                z = next.addToBackStack;
            }
            return next.copy(sddrDestination, z);
        }

        /* renamed from: component1, reason: from getter */
        public final SddrDestination getDestination() {
            return this.destination;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAddToBackStack() {
            return this.addToBackStack;
        }

        public final Next copy(SddrDestination destination, boolean addToBackStack) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new Next(destination, addToBackStack);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Next)) {
                return false;
            }
            Next next = (Next) other;
            return Intrinsics.areEqual(this.destination, next.destination) && this.addToBackStack == next.addToBackStack;
        }

        public int hashCode() {
            return (this.destination.hashCode() * 31) + Boolean.hashCode(this.addToBackStack);
        }

        public String toString() {
            return "Next(destination=" + this.destination + ", addToBackStack=" + this.addToBackStack + ")";
        }

        public Next(SddrDestination destination, boolean z) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.addToBackStack = z;
        }

        public final SddrDestination getDestination() {
            return this.destination;
        }

        public final boolean getAddToBackStack() {
            return this.addToBackStack;
        }
    }

    /* compiled from: SddrDestinationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Prev;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Prev implements SddrDestinationEvent {
        public static final int $stable = 0;
        public static final Prev INSTANCE = new Prev();

        public boolean equals(Object other) {
            return this == other || (other instanceof Prev);
        }

        public int hashCode() {
            return -1523995153;
        }

        public String toString() {
            return "Prev";
        }

        private Prev() {
        }
    }

    /* compiled from: SddrDestinationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Error;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements SddrDestinationEvent {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -9355828;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: SddrDestinationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent$Finish;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finish implements SddrDestinationEvent {
        public static final int $stable = 0;
        public static final Finish INSTANCE = new Finish();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finish);
        }

        public int hashCode() {
            return -269838001;
        }

        public String toString() {
            return "Finish";
        }

        private Finish() {
        }
    }
}
