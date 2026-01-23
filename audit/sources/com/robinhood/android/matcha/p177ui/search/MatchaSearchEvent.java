package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.android.matcha.models.p176ui.Transactor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent;", "", "TooManyPeopleError", "Error", "TransactorSelected", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$Error;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TooManyPeopleError;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaSearchEvent {

    /* compiled from: MatchaSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TooManyPeopleError;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TooManyPeopleError implements MatchaSearchEvent {
        public static final int $stable = 0;
        public static final TooManyPeopleError INSTANCE = new TooManyPeopleError();

        private TooManyPeopleError() {
        }
    }

    /* compiled from: MatchaSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$Error;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MatchaSearchEvent {
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

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
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

    /* compiled from: MatchaSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent;", "NextScreen", "ConfirmNewTransactor", "ReverseLookupContact", "ConfirmNewTransactors", "InviteContact", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ConfirmNewTransactor;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ConfirmNewTransactors;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$InviteContact;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$NextScreen;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ReverseLookupContact;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TransactorSelected extends MatchaSearchEvent {

        /* compiled from: MatchaSearchEvent.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$NextScreen;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Ljava/util/List;)V", "getTransactors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NextScreen implements TransactorSelected {
            public static final int $stable = 8;
            private final List<Transactor> transactors;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NextScreen copy$default(NextScreen nextScreen, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = nextScreen.transactors;
                }
                return nextScreen.copy(list);
            }

            public final List<Transactor> component1() {
                return this.transactors;
            }

            public final NextScreen copy(List<? extends Transactor> transactors) {
                Intrinsics.checkNotNullParameter(transactors, "transactors");
                return new NextScreen(transactors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NextScreen) && Intrinsics.areEqual(this.transactors, ((NextScreen) other).transactors);
            }

            public int hashCode() {
                return this.transactors.hashCode();
            }

            public String toString() {
                return "NextScreen(transactors=" + this.transactors + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NextScreen(List<? extends Transactor> transactors) {
                Intrinsics.checkNotNullParameter(transactors, "transactors");
                this.transactors = transactors;
            }

            public final List<Transactor> getTransactors() {
                return this.transactors;
            }
        }

        /* compiled from: MatchaSearchEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ConfirmNewTransactor;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor$User;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConfirmNewTransactor implements TransactorSelected {
            public static final int $stable = 8;
            private final Transactor.User transactor;

            public static /* synthetic */ ConfirmNewTransactor copy$default(ConfirmNewTransactor confirmNewTransactor, Transactor.User user, int i, Object obj) {
                if ((i & 1) != 0) {
                    user = confirmNewTransactor.transactor;
                }
                return confirmNewTransactor.copy(user);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor.User getTransactor() {
                return this.transactor;
            }

            public final ConfirmNewTransactor copy(Transactor.User transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new ConfirmNewTransactor(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmNewTransactor) && Intrinsics.areEqual(this.transactor, ((ConfirmNewTransactor) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "ConfirmNewTransactor(transactor=" + this.transactor + ")";
            }

            public ConfirmNewTransactor(Transactor.User transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
            }

            public final Transactor.User getTransactor() {
                return this.transactor;
            }
        }

        /* compiled from: MatchaSearchEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ReverseLookupContact;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReverseLookupContact implements TransactorSelected {
            public static final int $stable = 8;
            private final Transactor transactor;

            public static /* synthetic */ ReverseLookupContact copy$default(ReverseLookupContact reverseLookupContact, Transactor transactor, int i, Object obj) {
                if ((i & 1) != 0) {
                    transactor = reverseLookupContact.transactor;
                }
                return reverseLookupContact.copy(transactor);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor getTransactor() {
                return this.transactor;
            }

            public final ReverseLookupContact copy(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new ReverseLookupContact(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReverseLookupContact) && Intrinsics.areEqual(this.transactor, ((ReverseLookupContact) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "ReverseLookupContact(transactor=" + this.transactor + ")";
            }

            public ReverseLookupContact(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
            }

            public final Transactor getTransactor() {
                return this.transactor;
            }
        }

        /* compiled from: MatchaSearchEvent.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$ConfirmNewTransactors;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "firstTimeTransactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Ljava/util/List;)V", "getFirstTimeTransactors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConfirmNewTransactors implements TransactorSelected {
            public static final int $stable = 8;
            private final List<Transactor> firstTimeTransactors;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ConfirmNewTransactors copy$default(ConfirmNewTransactors confirmNewTransactors, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = confirmNewTransactors.firstTimeTransactors;
                }
                return confirmNewTransactors.copy(list);
            }

            public final List<Transactor> component1() {
                return this.firstTimeTransactors;
            }

            public final ConfirmNewTransactors copy(List<? extends Transactor> firstTimeTransactors) {
                Intrinsics.checkNotNullParameter(firstTimeTransactors, "firstTimeTransactors");
                return new ConfirmNewTransactors(firstTimeTransactors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmNewTransactors) && Intrinsics.areEqual(this.firstTimeTransactors, ((ConfirmNewTransactors) other).firstTimeTransactors);
            }

            public int hashCode() {
                return this.firstTimeTransactors.hashCode();
            }

            public String toString() {
                return "ConfirmNewTransactors(firstTimeTransactors=" + this.firstTimeTransactors + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ConfirmNewTransactors(List<? extends Transactor> firstTimeTransactors) {
                Intrinsics.checkNotNullParameter(firstTimeTransactors, "firstTimeTransactors");
                this.firstTimeTransactors = firstTimeTransactors;
            }

            public final List<Transactor> getFirstTimeTransactors() {
                return this.firstTimeTransactors;
            }
        }

        /* compiled from: MatchaSearchEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected$InviteContact;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchEvent$TransactorSelected;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InviteContact implements TransactorSelected {
            public static final int $stable = 8;
            private final Transactor transactor;

            public static /* synthetic */ InviteContact copy$default(InviteContact inviteContact, Transactor transactor, int i, Object obj) {
                if ((i & 1) != 0) {
                    transactor = inviteContact.transactor;
                }
                return inviteContact.copy(transactor);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor getTransactor() {
                return this.transactor;
            }

            public final InviteContact copy(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new InviteContact(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InviteContact) && Intrinsics.areEqual(this.transactor, ((InviteContact) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "InviteContact(transactor=" + this.transactor + ")";
            }

            public InviteContact(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
            }

            public final Transactor getTransactor() {
                return this.transactor;
            }
        }
    }
}
