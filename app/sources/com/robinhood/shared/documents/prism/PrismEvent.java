package com.robinhood.shared.documents.prism;

import kotlin.Metadata;

/* compiled from: PrismEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismEvent;", "", "Finished", "StartCapture", "StartFaceTracking", "Lcom/robinhood/shared/documents/prism/PrismEvent$Finished;", "Lcom/robinhood/shared/documents/prism/PrismEvent$StartCapture;", "Lcom/robinhood/shared/documents/prism/PrismEvent$StartFaceTracking;", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PrismEvent {

    /* compiled from: PrismEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismEvent$Finished;", "Lcom/robinhood/shared/documents/prism/PrismEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finished implements PrismEvent {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finished);
        }

        public int hashCode() {
            return 1306864496;
        }

        public String toString() {
            return "Finished";
        }

        private Finished() {
        }
    }

    /* compiled from: PrismEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismEvent$StartCapture;", "Lcom/robinhood/shared/documents/prism/PrismEvent;", "videoBitRate", "", "<init>", "(I)V", "getVideoBitRate", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartCapture implements PrismEvent {
        public static final int $stable = 0;
        private final int videoBitRate;

        public static /* synthetic */ StartCapture copy$default(StartCapture startCapture, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = startCapture.videoBitRate;
            }
            return startCapture.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getVideoBitRate() {
            return this.videoBitRate;
        }

        public final StartCapture copy(int videoBitRate) {
            return new StartCapture(videoBitRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartCapture) && this.videoBitRate == ((StartCapture) other).videoBitRate;
        }

        public int hashCode() {
            return Integer.hashCode(this.videoBitRate);
        }

        public String toString() {
            return "StartCapture(videoBitRate=" + this.videoBitRate + ")";
        }

        public StartCapture(int i) {
            this.videoBitRate = i;
        }

        public final int getVideoBitRate() {
            return this.videoBitRate;
        }
    }

    /* compiled from: PrismEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismEvent$StartFaceTracking;", "Lcom/robinhood/shared/documents/prism/PrismEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartFaceTracking implements PrismEvent {
        public static final int $stable = 0;
        public static final StartFaceTracking INSTANCE = new StartFaceTracking();

        public boolean equals(Object other) {
            return this == other || (other instanceof StartFaceTracking);
        }

        public int hashCode() {
            return 1410094200;
        }

        public String toString() {
            return "StartFaceTracking";
        }

        private StartFaceTracking() {
        }
    }
}
