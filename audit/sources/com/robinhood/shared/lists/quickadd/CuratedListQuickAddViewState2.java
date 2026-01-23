package com.robinhood.shared.lists.quickadd;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListQuickAddViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateDetail;", "", "security", "Lcom/robinhood/models/db/Security;", "updatedList", "Lcom/robinhood/models/db/CuratedList;", "listsWithSecurityCount", "", "customCompletionMessage", "", "showEditAction", "", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/models/db/CuratedList;ILjava/lang/String;Z)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getUpdatedList", "()Lcom/robinhood/models/db/CuratedList;", "getListsWithSecurityCount", "()I", "getCustomCompletionMessage", "()Ljava/lang/String;", "getShowEditAction", "()Z", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.lists.quickadd.UpdateDetail, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListQuickAddViewState2 {
    private final String customCompletionMessage;
    private final int listsWithSecurityCount;
    private final Security security;
    private final boolean showEditAction;
    private final CuratedList updatedList;

    public CuratedListQuickAddViewState2(Security security, CuratedList updatedList, int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(updatedList, "updatedList");
        this.security = security;
        this.updatedList = updatedList;
        this.listsWithSecurityCount = i;
        this.customCompletionMessage = str;
        this.showEditAction = z;
    }

    public /* synthetic */ CuratedListQuickAddViewState2(Security security, CuratedList curatedList, int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(security, curatedList, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? true : z);
    }

    public final Security getSecurity() {
        return this.security;
    }

    public final CuratedList getUpdatedList() {
        return this.updatedList;
    }

    public final int getListsWithSecurityCount() {
        return this.listsWithSecurityCount;
    }

    public final String getCustomCompletionMessage() {
        return this.customCompletionMessage;
    }

    public final boolean getShowEditAction() {
        return this.showEditAction;
    }
}
