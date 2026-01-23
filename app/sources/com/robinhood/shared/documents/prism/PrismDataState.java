package com.robinhood.shared.documents.prism;

import com.robinhood.shared.documents.prism.animations.FaceIconComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDataState;", "", "isLoading", "", "state", "Lcom/robinhood/shared/documents/prism/PrismState;", "<init>", "(ZLcom/robinhood/shared/documents/prism/PrismState;)V", "()Z", "getState", "()Lcom/robinhood/shared/documents/prism/PrismState;", "statusDetailRes", "Lcom/robinhood/utils/resource/StringResource;", "getStatusDetailRes", "()Lcom/robinhood/utils/resource/StringResource;", "faceIconAnimationState", "Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;", "getFaceIconAnimationState", "()Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;", "showFlareRing", "getShowFlareRing", "showSuccess", "getShowSuccess", "showFailure", "getShowFailure", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrismDataState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final PrismState state;

    /* compiled from: PrismDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrismState.values().length];
            try {
                iArr[PrismState.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrismState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrismState.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrismState.FACE_SCANNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrismState.INSUFFICIENT_MOTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrismDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PrismDataState copy$default(PrismDataState prismDataState, boolean z, PrismState prismState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = prismDataState.isLoading;
        }
        if ((i & 2) != 0) {
            prismState = prismDataState.state;
        }
        return prismDataState.copy(z, prismState);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final PrismState getState() {
        return this.state;
    }

    public final PrismDataState copy(boolean isLoading, PrismState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new PrismDataState(isLoading, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrismDataState)) {
            return false;
        }
        PrismDataState prismDataState = (PrismDataState) other;
        return this.isLoading == prismDataState.isLoading && this.state == prismDataState.state;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "PrismDataState(isLoading=" + this.isLoading + ", state=" + this.state + ")";
    }

    public PrismDataState(boolean z, PrismState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.isLoading = z;
        this.state = state;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ PrismDataState(boolean z, PrismState prismState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? PrismState.STARTED : prismState);
    }

    public final PrismState getState() {
        return this.state;
    }

    public final StringResource getStatusDetailRes() {
        return PrismState2.toStringResource(this.state);
    }

    public final FaceIconComposable getFaceIconAnimationState() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            return FaceIconComposable.Processing.INSTANCE;
        }
        if (i == 2) {
            return FaceIconComposable.Success.INSTANCE;
        }
        if (i == 3) {
            return FaceIconComposable.Failure.INSTANCE;
        }
        if (i == 4 || i == 5) {
            return FaceIconComposable.Capturing.INSTANCE;
        }
        return FaceIconComposable.Idling.INSTANCE;
    }

    public final boolean getShowFlareRing() {
        return this.state == PrismState.PROCESSING;
    }

    public final boolean getShowSuccess() {
        return this.state == PrismState.SUCCESS;
    }

    public final boolean getShowFailure() {
        return this.state == PrismState.FAILURE;
    }
}
