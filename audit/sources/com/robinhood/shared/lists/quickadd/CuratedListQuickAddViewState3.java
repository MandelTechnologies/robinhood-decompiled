package com.robinhood.shared.lists.quickadd;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListQuickAddViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateMultipleDetail;", "", "security", "Lcom/robinhood/models/db/Security;", "addedToLists", "", "Lcom/robinhood/models/db/CuratedList;", "removedFromLists", "<init>", "(Lcom/robinhood/models/db/Security;Ljava/util/List;Ljava/util/List;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getAddedToLists", "()Ljava/util/List;", "getRemovedFromLists", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.lists.quickadd.UpdateMultipleDetail, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListQuickAddViewState3 {
    private final List<CuratedList> addedToLists;
    private final List<CuratedList> removedFromLists;
    private final Security security;

    public CuratedListQuickAddViewState3(Security security, List<CuratedList> addedToLists, List<CuratedList> removedFromLists) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(addedToLists, "addedToLists");
        Intrinsics.checkNotNullParameter(removedFromLists, "removedFromLists");
        this.security = security;
        this.addedToLists = addedToLists;
        this.removedFromLists = removedFromLists;
    }

    public final Security getSecurity() {
        return this.security;
    }

    public final List<CuratedList> getAddedToLists() {
        return this.addedToLists;
    }

    public final List<CuratedList> getRemovedFromLists() {
        return this.removedFromLists;
    }
}
