package com.robinhood.android.cash.flat.cashback.p071ui.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFlatCashbackViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "VS", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Error;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loaded;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loading;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BaseFlatCashbackViewState<VS> {

    /* compiled from: BaseFlatCashbackViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loading;", "VS", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "mockViewState", "<init>", "(Ljava/lang/Object;)V", "getMockViewState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loading;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading<VS> implements BaseFlatCashbackViewState<VS> {
        public static final int $stable = 0;
        private final VS mockViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loading.mockViewState;
            }
            return loading.copy(obj);
        }

        public final VS component1() {
            return this.mockViewState;
        }

        public final Loading<VS> copy(VS mockViewState) {
            return new Loading<>(mockViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mockViewState, ((Loading) other).mockViewState);
        }

        public int hashCode() {
            VS vs = this.mockViewState;
            if (vs == null) {
                return 0;
            }
            return vs.hashCode();
        }

        public String toString() {
            return "Loading(mockViewState=" + this.mockViewState + ")";
        }

        public Loading(VS vs) {
            this.mockViewState = vs;
        }

        public final VS getMockViewState() {
            return this.mockViewState;
        }
    }

    /* compiled from: BaseFlatCashbackViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Error;", "VS", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error<VS> implements BaseFlatCashbackViewState<VS> {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error<VS> copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error<>(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: BaseFlatCashbackViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loaded;", "VS", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "loadedViewState", "<init>", "(Ljava/lang/Object;)V", "getLoadedViewState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loaded;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded<VS> implements BaseFlatCashbackViewState<VS> {
        public static final int $stable = 0;
        private final VS loadedViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loaded.loadedViewState;
            }
            return loaded.copy(obj);
        }

        public final VS component1() {
            return this.loadedViewState;
        }

        public final Loaded<VS> copy(VS loadedViewState) {
            return new Loaded<>(loadedViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.loadedViewState, ((Loaded) other).loadedViewState);
        }

        public int hashCode() {
            VS vs = this.loadedViewState;
            if (vs == null) {
                return 0;
            }
            return vs.hashCode();
        }

        public String toString() {
            return "Loaded(loadedViewState=" + this.loadedViewState + ")";
        }

        public Loaded(VS vs) {
            this.loadedViewState = vs;
        }

        public final VS getLoadedViewState() {
            return this.loadedViewState;
        }
    }
}
