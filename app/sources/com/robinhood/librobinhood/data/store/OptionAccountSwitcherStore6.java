package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "", "Success", "Failure", "Loading", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Failure;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Loading;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Success;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionsAccountSwitcherRefreshState, reason: use source file name */
/* loaded from: classes13.dex */
public interface OptionAccountSwitcherStore6 {

    /* compiled from: OptionAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Success;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "switcher", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "<init>", "(Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;)V", "getSwitcher", "()Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionsAccountSwitcherRefreshState$Success, reason: from toString */
    public static final /* data */ class Success implements OptionAccountSwitcherStore6 {
        private final OptionsAccountSwitcher switcher;

        public static /* synthetic */ Success copy$default(Success success, OptionsAccountSwitcher optionsAccountSwitcher, int i, Object obj) {
            if ((i & 1) != 0) {
                optionsAccountSwitcher = success.switcher;
            }
            return success.copy(optionsAccountSwitcher);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionsAccountSwitcher getSwitcher() {
            return this.switcher;
        }

        public final Success copy(OptionsAccountSwitcher switcher) {
            Intrinsics.checkNotNullParameter(switcher, "switcher");
            return new Success(switcher);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.switcher, ((Success) other).switcher);
        }

        public int hashCode() {
            return this.switcher.hashCode();
        }

        public String toString() {
            return "Success(switcher=" + this.switcher + ")";
        }

        public Success(OptionsAccountSwitcher switcher) {
            Intrinsics.checkNotNullParameter(switcher, "switcher");
            this.switcher = switcher;
        }

        public final OptionsAccountSwitcher getSwitcher() {
            return this.switcher;
        }
    }

    /* compiled from: OptionAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Failure;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionsAccountSwitcherRefreshState$Failure, reason: from toString */
    public static final /* data */ class Failure implements OptionAccountSwitcherStore6 {
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

        public Failure(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: OptionAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState$Loading;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "<init>", "()V", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionsAccountSwitcherRefreshState$Loading */
    public static final class Loading implements OptionAccountSwitcherStore6 {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
