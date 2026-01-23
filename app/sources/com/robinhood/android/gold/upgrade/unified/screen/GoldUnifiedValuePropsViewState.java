package com.robinhood.android.gold.upgrade.unified.screen;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import gold_flow.proto.p466v1.StreamValuePropsContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedValuePropsViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "<init>", "()V", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "Loading", "Loaded", "Error", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Error;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loading;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldUnifiedValuePropsViewState implements LoggableViewState {
    public static final int $stable = 0;

    public /* synthetic */ GoldUnifiedValuePropsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldUnifiedValuePropsViewState() {
    }

    /* compiled from: GoldUnifiedValuePropsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loading;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldUnifiedValuePropsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1211477347;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GoldUnifiedValuePropsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState;", "valuePropsContent", "Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "<init>", "(Lgold_flow/proto/v1/StreamValuePropsContentResponse;)V", "getValuePropsContent", "()Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldUnifiedValuePropsViewState {
        public static final int $stable = 8;
        private final StreamValuePropsContentResponse valuePropsContent;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StreamValuePropsContentResponse streamValuePropsContentResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                streamValuePropsContentResponse = loaded.valuePropsContent;
            }
            return loaded.copy(streamValuePropsContentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamValuePropsContentResponse getValuePropsContent() {
            return this.valuePropsContent;
        }

        public final Loaded copy(StreamValuePropsContentResponse valuePropsContent) {
            Intrinsics.checkNotNullParameter(valuePropsContent, "valuePropsContent");
            return new Loaded(valuePropsContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.valuePropsContent, ((Loaded) other).valuePropsContent);
        }

        public int hashCode() {
            return this.valuePropsContent.hashCode();
        }

        public String toString() {
            return "Loaded(valuePropsContent=" + this.valuePropsContent + ")";
        }

        public final StreamValuePropsContentResponse getValuePropsContent() {
            return this.valuePropsContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(StreamValuePropsContentResponse valuePropsContent) {
            super(null);
            Intrinsics.checkNotNullParameter(valuePropsContent, "valuePropsContent");
            this.valuePropsContent = valuePropsContent;
        }
    }

    /* compiled from: GoldUnifiedValuePropsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState$Error;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldUnifiedValuePropsViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        if (this instanceof Loaded) {
            return new LoggableViewState2.Completed(null, null, 3, null);
        }
        if (this instanceof Error) {
            return new LoggableViewState2.Failed(null, 1, null);
        }
        if (Intrinsics.areEqual(this, Loading.INSTANCE)) {
            return new LoggableViewState2.Loading(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
