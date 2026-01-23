package com.robinhood.android.acatsin.intro;

import com.airbnb.lottie.compose.LottieClipSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PagedLottie.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/LottiePageSpecs;", "", "initialClipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "getInitialClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "loopClipSpec", "getLoopClipSpec", "Frame", "Lcom/robinhood/android/acatsin/intro/LottiePageSpecs$Frame;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.intro.LottiePageSpecs, reason: use source file name */
/* loaded from: classes24.dex */
public interface PagedLottie {
    LottieClipSpec getInitialClipSpec();

    LottieClipSpec getLoopClipSpec();

    /* compiled from: PagedLottie.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/LottiePageSpecs$Frame;", "Lcom/robinhood/android/acatsin/intro/LottiePageSpecs;", "initialClipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "loopClipSpec", "<init>", "(Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;)V", "getInitialClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "getLoopClipSpec", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.intro.LottiePageSpecs$Frame, reason: from toString */
    public static final /* data */ class Frame implements PagedLottie {
        public static final int $stable = LottieClipSpec.Frame.$stable;
        private final LottieClipSpec.Frame initialClipSpec;
        private final LottieClipSpec.Frame loopClipSpec;

        public static /* synthetic */ Frame copy$default(Frame frame, LottieClipSpec.Frame frame2, LottieClipSpec.Frame frame3, int i, Object obj) {
            if ((i & 1) != 0) {
                frame2 = frame.initialClipSpec;
            }
            if ((i & 2) != 0) {
                frame3 = frame.loopClipSpec;
            }
            return frame.copy(frame2, frame3);
        }

        /* renamed from: component1, reason: from getter */
        public final LottieClipSpec.Frame getInitialClipSpec() {
            return this.initialClipSpec;
        }

        /* renamed from: component2, reason: from getter */
        public final LottieClipSpec.Frame getLoopClipSpec() {
            return this.loopClipSpec;
        }

        public final Frame copy(LottieClipSpec.Frame initialClipSpec, LottieClipSpec.Frame loopClipSpec) {
            Intrinsics.checkNotNullParameter(initialClipSpec, "initialClipSpec");
            return new Frame(initialClipSpec, loopClipSpec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.areEqual(this.initialClipSpec, frame.initialClipSpec) && Intrinsics.areEqual(this.loopClipSpec, frame.loopClipSpec);
        }

        public int hashCode() {
            int iHashCode = this.initialClipSpec.hashCode() * 31;
            LottieClipSpec.Frame frame = this.loopClipSpec;
            return iHashCode + (frame == null ? 0 : frame.hashCode());
        }

        public String toString() {
            return "Frame(initialClipSpec=" + this.initialClipSpec + ", loopClipSpec=" + this.loopClipSpec + ")";
        }

        public Frame(LottieClipSpec.Frame initialClipSpec, LottieClipSpec.Frame frame) {
            Intrinsics.checkNotNullParameter(initialClipSpec, "initialClipSpec");
            this.initialClipSpec = initialClipSpec;
            this.loopClipSpec = frame;
        }

        public /* synthetic */ Frame(LottieClipSpec.Frame frame, LottieClipSpec.Frame frame2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(frame, (i & 2) != 0 ? null : frame2);
        }

        @Override // com.robinhood.android.acatsin.intro.PagedLottie
        public LottieClipSpec.Frame getInitialClipSpec() {
            return this.initialClipSpec;
        }

        @Override // com.robinhood.android.acatsin.intro.PagedLottie
        public LottieClipSpec.Frame getLoopClipSpec() {
            return this.loopClipSpec;
        }
    }
}
