package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.models.p355ui.CuratedListEligible;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Failed;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Loading;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Success;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListItemState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class CuratedListRhListViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ CuratedListRhListViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CuratedListRhListViewState2() {
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Loading;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "<init>", "()V", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListItemState$Loading */
    public static final class Loading extends CuratedListRhListViewState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Success;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "curatedListEligibleItems", "", "Lcom/robinhood/models/ui/CuratedListEligible;", "<init>", "(Ljava/util/List;)V", "getCuratedListEligibleItems", "()Ljava/util/List;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListItemState$Success */
    public static final class Success extends CuratedListRhListViewState2 {
        public static final int $stable = 8;
        private final List<CuratedListEligible> curatedListEligibleItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(List<? extends CuratedListEligible> curatedListEligibleItems) {
            super(null);
            Intrinsics.checkNotNullParameter(curatedListEligibleItems, "curatedListEligibleItems");
            this.curatedListEligibleItems = curatedListEligibleItems;
        }

        public final List<CuratedListEligible> getCuratedListEligibleItems() {
            return this.curatedListEligibleItems;
        }
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState$Failed;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "<init>", "()V", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListItemState$Failed */
    public static final class Failed extends CuratedListRhListViewState2 {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }
}
