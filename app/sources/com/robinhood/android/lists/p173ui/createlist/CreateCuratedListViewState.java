package com.robinhood.android.lists.p173ui.createlist;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateCuratedListViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListViewState;", "", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "", "listName", "isCreatingList", "", "createListError", "Lcom/robinhood/udf/UiEvent;", "", "createListSuccess", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getEmoji", "()Ljava/lang/String;", "getListName", "()Z", "getCreateListError", "()Lcom/robinhood/udf/UiEvent;", "getCreateListSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreateCuratedListViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> createListError;
    private final UiEvent<CuratedList> createListSuccess;
    private final String emoji;
    private final boolean isCreatingList;
    private final String listName;

    public CreateCuratedListViewState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ CreateCuratedListViewState copy$default(CreateCuratedListViewState createCuratedListViewState, String str, String str2, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCuratedListViewState.emoji;
        }
        if ((i & 2) != 0) {
            str2 = createCuratedListViewState.listName;
        }
        if ((i & 4) != 0) {
            z = createCuratedListViewState.isCreatingList;
        }
        if ((i & 8) != 0) {
            uiEvent = createCuratedListViewState.createListError;
        }
        if ((i & 16) != 0) {
            uiEvent2 = createCuratedListViewState.createListSuccess;
        }
        UiEvent uiEvent3 = uiEvent2;
        boolean z2 = z;
        return createCuratedListViewState.copy(str, str2, z2, uiEvent, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component2, reason: from getter */
    public final String getListName() {
        return this.listName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCreatingList() {
        return this.isCreatingList;
    }

    public final UiEvent<Throwable> component4() {
        return this.createListError;
    }

    public final UiEvent<CuratedList> component5() {
        return this.createListSuccess;
    }

    public final CreateCuratedListViewState copy(String emoji, String listName, boolean isCreatingList, UiEvent<Throwable> createListError, UiEvent<CuratedList> createListSuccess) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        return new CreateCuratedListViewState(emoji, listName, isCreatingList, createListError, createListSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCuratedListViewState)) {
            return false;
        }
        CreateCuratedListViewState createCuratedListViewState = (CreateCuratedListViewState) other;
        return Intrinsics.areEqual(this.emoji, createCuratedListViewState.emoji) && Intrinsics.areEqual(this.listName, createCuratedListViewState.listName) && this.isCreatingList == createCuratedListViewState.isCreatingList && Intrinsics.areEqual(this.createListError, createCuratedListViewState.createListError) && Intrinsics.areEqual(this.createListSuccess, createCuratedListViewState.createListSuccess);
    }

    public int hashCode() {
        int iHashCode = this.emoji.hashCode() * 31;
        String str = this.listName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isCreatingList)) * 31;
        UiEvent<Throwable> uiEvent = this.createListError;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<CuratedList> uiEvent2 = this.createListSuccess;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "CreateCuratedListViewState(emoji=" + this.emoji + ", listName=" + this.listName + ", isCreatingList=" + this.isCreatingList + ", createListError=" + this.createListError + ", createListSuccess=" + this.createListSuccess + ")";
    }

    public CreateCuratedListViewState(String emoji, String str, boolean z, UiEvent<Throwable> uiEvent, UiEvent<CuratedList> uiEvent2) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.emoji = emoji;
        this.listName = str;
        this.isCreatingList = z;
        this.createListError = uiEvent;
        this.createListSuccess = uiEvent2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreateCuratedListViewState(java.lang.String r2, java.lang.String r3, boolean r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "💡"
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.lists.p173ui.createlist.CreateCuratedListViewState.<init>(java.lang.String, java.lang.String, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getListName() {
        return this.listName;
    }

    public final boolean isCreatingList() {
        return this.isCreatingList;
    }

    public final UiEvent<Throwable> getCreateListError() {
        return this.createListError;
    }

    public final UiEvent<CuratedList> getCreateListSuccess() {
        return this.createListSuccess;
    }
}
