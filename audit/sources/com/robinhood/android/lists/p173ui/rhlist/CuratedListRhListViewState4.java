package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Failed;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Loading;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Success;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class CuratedListRhListViewState4 {
    public static final int $stable = 0;

    public /* synthetic */ CuratedListRhListViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CuratedListRhListViewState4() {
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Loading;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "<init>", "()V", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListState$Loading */
    public static final class Loading extends CuratedListRhListViewState4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Success;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Lcom/robinhood/models/db/CuratedList;)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListState$Success */
    public static final class Success extends CuratedListRhListViewState4 {
        public static final int $stable = 8;
        private final CuratedList curatedList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CuratedList curatedList) {
            super(null);
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            this.curatedList = curatedList;
        }

        public final CuratedList getCuratedList() {
            return this.curatedList;
        }
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListState$Failed;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "<init>", "()V", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListState$Failed */
    public static final class Failed extends CuratedListRhListViewState4 {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }
}
