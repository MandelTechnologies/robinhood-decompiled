package com.robinhood.android.waitlist.loading;

import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpot;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitlistLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/waitlist/loading/WaitlistLoadingViewState;", "", "response", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "", "<init>", "(Lcom/robinhood/utils/Either;)V", "getResponse", "()Lcom/robinhood/utils/Either;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WaitlistLoadingViewState {
    public static final int $stable = 8;
    private final Either<WaitlistSpot, Throwable> response;

    /* JADX WARN: Multi-variable type inference failed */
    public WaitlistLoadingViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WaitlistLoadingViewState copy$default(WaitlistLoadingViewState waitlistLoadingViewState, Either either, int i, Object obj) {
        if ((i & 1) != 0) {
            either = waitlistLoadingViewState.response;
        }
        return waitlistLoadingViewState.copy(either);
    }

    public final Either<WaitlistSpot, Throwable> component1() {
        return this.response;
    }

    public final WaitlistLoadingViewState copy(Either<WaitlistSpot, ? extends Throwable> response) {
        return new WaitlistLoadingViewState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WaitlistLoadingViewState) && Intrinsics.areEqual(this.response, ((WaitlistLoadingViewState) other).response);
    }

    public int hashCode() {
        Either<WaitlistSpot, Throwable> either = this.response;
        if (either == null) {
            return 0;
        }
        return either.hashCode();
    }

    public String toString() {
        return "WaitlistLoadingViewState(response=" + this.response + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WaitlistLoadingViewState(Either<WaitlistSpot, ? extends Throwable> either) {
        this.response = either;
    }

    public /* synthetic */ WaitlistLoadingViewState(Either either, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either);
    }

    public final Either<WaitlistSpot, Throwable> getResponse() {
        return this.response;
    }
}
