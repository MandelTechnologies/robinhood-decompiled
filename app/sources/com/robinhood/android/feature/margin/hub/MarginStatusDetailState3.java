package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.lib.margin.hub.p168db.models.MarginStatusDetailView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginStatusDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "", "<init>", "()V", "Loading", "Loaded", "Failure", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Failure;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Loaded;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Loading;", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginStatusDetailState3 {
    public static final int $stable = 0;

    public /* synthetic */ MarginStatusDetailState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginStatusDetailState3() {
    }

    /* compiled from: MarginStatusDetailState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Loading;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailViewState$Loading */
    public static final class Loading extends MarginStatusDetailState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginStatusDetailState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Loaded;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "marginStatusDetailResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginStatusDetailView$Success;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/db/models/MarginStatusDetailView$Success;)V", "getMarginStatusDetailResponse", "()Lcom/robinhood/android/lib/margin/hub/db/models/MarginStatusDetailView$Success;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends MarginStatusDetailState3 {
        public static final int $stable = 8;
        private final MarginStatusDetailView.Success marginStatusDetailResponse;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, MarginStatusDetailView.Success success, int i, Object obj) {
            if ((i & 1) != 0) {
                success = loaded.marginStatusDetailResponse;
            }
            return loaded.copy(success);
        }

        /* renamed from: component1, reason: from getter */
        public final MarginStatusDetailView.Success getMarginStatusDetailResponse() {
            return this.marginStatusDetailResponse;
        }

        public final Loaded copy(MarginStatusDetailView.Success marginStatusDetailResponse) {
            Intrinsics.checkNotNullParameter(marginStatusDetailResponse, "marginStatusDetailResponse");
            return new Loaded(marginStatusDetailResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.marginStatusDetailResponse, ((Loaded) other).marginStatusDetailResponse);
        }

        public int hashCode() {
            return this.marginStatusDetailResponse.hashCode();
        }

        public String toString() {
            return "Loaded(marginStatusDetailResponse=" + this.marginStatusDetailResponse + ")";
        }

        public final MarginStatusDetailView.Success getMarginStatusDetailResponse() {
            return this.marginStatusDetailResponse;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(MarginStatusDetailView.Success marginStatusDetailResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(marginStatusDetailResponse, "marginStatusDetailResponse");
            this.marginStatusDetailResponse = marginStatusDetailResponse;
        }
    }

    /* compiled from: MarginStatusDetailState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState$Failure;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailViewState$Failure, reason: from toString */
    public static final /* data */ class Failure extends MarginStatusDetailState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
