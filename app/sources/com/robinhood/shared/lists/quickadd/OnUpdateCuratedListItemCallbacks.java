package com.robinhood.shared.lists.quickadd;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OnUpdateCuratedListItemCallbacks.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J,\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/OnUpdateCuratedListItemCallbacks;", "", "onAddToCuratedList", "", "security", "Lcom/robinhood/models/db/Security;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "onUpdateCuratedLists", "listsToAdd", "", "listsToDelete", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface OnUpdateCuratedListItemCallbacks {
    void onAddToCuratedList(Security security, CuratedList curatedList);

    void onUpdateCuratedLists(Security security, List<CuratedList> listsToAdd, List<CuratedList> listsToDelete);
}
