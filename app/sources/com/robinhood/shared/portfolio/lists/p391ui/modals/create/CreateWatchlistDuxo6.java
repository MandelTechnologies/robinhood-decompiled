package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateWatchlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "", "NotStarted", "Creating", "Success", "GenericError", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$Creating;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$GenericError;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$NotStarted;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$Success;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreatingWatchlistState, reason: use source file name */
/* loaded from: classes6.dex */
public interface CreateWatchlistDuxo6 {

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$NotStarted;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreatingWatchlistState$NotStarted */
    public static final /* data */ class NotStarted implements CreateWatchlistDuxo6 {
        public static final int $stable = 0;
        public static final NotStarted INSTANCE = new NotStarted();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return -1713372754;
        }

        public String toString() {
            return "NotStarted";
        }

        private NotStarted() {
        }
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$Creating;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreatingWatchlistState$Creating */
    public static final /* data */ class Creating implements CreateWatchlistDuxo6 {
        public static final int $stable = 0;
        public static final Creating INSTANCE = new Creating();

        public boolean equals(Object other) {
            return this == other || (other instanceof Creating);
        }

        public int hashCode() {
            return 324691513;
        }

        public String toString() {
            return "Creating";
        }

        private Creating() {
        }
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$Success;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Lcom/robinhood/models/db/CuratedList;)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreatingWatchlistState$Success, reason: from toString */
    public static final /* data */ class Success implements CreateWatchlistDuxo6 {
        public static final int $stable = 8;
        private final CuratedList curatedList;

        public static /* synthetic */ Success copy$default(Success success, CuratedList curatedList, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = success.curatedList;
            }
            return success.copy(curatedList);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getCuratedList() {
            return this.curatedList;
        }

        public final Success copy(CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            return new Success(curatedList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.curatedList, ((Success) other).curatedList);
        }

        public int hashCode() {
            return this.curatedList.hashCode();
        }

        public String toString() {
            return "Success(curatedList=" + this.curatedList + ")";
        }

        public Success(CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            this.curatedList = curatedList;
        }

        public final CuratedList getCuratedList() {
            return this.curatedList;
        }
    }

    /* compiled from: CreateWatchlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState$GenericError;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreatingWatchlistState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreatingWatchlistState$GenericError */
    public static final /* data */ class GenericError implements CreateWatchlistDuxo6 {
        public static final int $stable = 0;
        public static final GenericError INSTANCE = new GenericError();

        public boolean equals(Object other) {
            return this == other || (other instanceof GenericError);
        }

        public int hashCode() {
            return 158965233;
        }

        public String toString() {
            return "GenericError";
        }

        private GenericError() {
        }
    }
}
