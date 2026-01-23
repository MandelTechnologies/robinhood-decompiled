package com.robinhood.android.redesign.accounttab.scrollstate;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorScrollable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable;", "", "<init>", "()V", "animateToTop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAtTop", "", "()Z", "isScrolling", "LazyList", "Column", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable$Column;", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable$LazyList;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class AccountSelectorScrollable {
    public static final int $stable = 0;

    public /* synthetic */ AccountSelectorScrollable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object animateToTop(Continuation<? super Unit> continuation);

    public abstract boolean isAtTop();

    public abstract boolean isScrolling();

    private AccountSelectorScrollable() {
    }

    /* compiled from: AccountSelectorScrollable.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable$LazyList;", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "animateToTop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAtTop", "", "()Z", "isScrolling", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LazyList extends AccountSelectorScrollable {
        public static final int $stable = 0;
        private final LazyListState state;

        public static /* synthetic */ LazyList copy$default(LazyList lazyList, LazyListState lazyListState, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyListState = lazyList.state;
            }
            return lazyList.copy(lazyListState);
        }

        /* renamed from: component1, reason: from getter */
        public final LazyListState getState() {
            return this.state;
        }

        public final LazyList copy(LazyListState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new LazyList(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LazyList) && Intrinsics.areEqual(this.state, ((LazyList) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "LazyList(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LazyList(LazyListState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final LazyListState getState() {
            return this.state;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public Object animateToTop(Continuation<? super Unit> continuation) {
            Object objAnimateScrollToItem$default = LazyListState.animateScrollToItem$default(this.state, 0, 0, continuation, 2, null);
            return objAnimateScrollToItem$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem$default : Unit.INSTANCE;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public boolean isAtTop() {
            return this.state.getFirstVisibleItemIndex() == 0 && this.state.getFirstVisibleItemScrollOffset() < 20;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public boolean isScrolling() {
            return this.state.isScrollInProgress();
        }
    }

    /* compiled from: AccountSelectorScrollable.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable$Column;", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable;", "state", "Landroidx/compose/foundation/ScrollState;", "<init>", "(Landroidx/compose/foundation/ScrollState;)V", "getState", "()Landroidx/compose/foundation/ScrollState;", "animateToTop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAtTop", "", "()Z", "isScrolling", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Column extends AccountSelectorScrollable {
        public static final int $stable = 0;
        private final ScrollState state;

        public static /* synthetic */ Column copy$default(Column column, ScrollState scrollState, int i, Object obj) {
            if ((i & 1) != 0) {
                scrollState = column.state;
            }
            return column.copy(scrollState);
        }

        /* renamed from: component1, reason: from getter */
        public final ScrollState getState() {
            return this.state;
        }

        public final Column copy(ScrollState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Column(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Column) && Intrinsics.areEqual(this.state, ((Column) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Column(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Column(ScrollState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final ScrollState getState() {
            return this.state;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public Object animateToTop(Continuation<? super Unit> continuation) {
            Object objAnimateScrollTo$default = ScrollState.animateScrollTo$default(this.state, 0, null, continuation, 2, null);
            return objAnimateScrollTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollTo$default : Unit.INSTANCE;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public boolean isAtTop() {
            return this.state.getValue() < 20;
        }

        @Override // com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable
        public boolean isScrolling() {
            return this.state.isScrollInProgress();
        }
    }
}
