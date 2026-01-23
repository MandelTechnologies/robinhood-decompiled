package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AddToListsBottomSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AddToListsBottomSheetStateProvider implements StateProvider<AddToListsBottomSheetDataState, AddToListsBottomSheetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AddToListsBottomSheetViewState reduce(AddToListsBottomSheetDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Security security = dataState.getSecurity();
        StringResource title = dataState.getTitle();
        ImmutableList<AddToListsBottomSheetViewState2> listRows = dataState.getListRows();
        ImmutableList<CuratedList> listsToAdd = dataState.getListsToAdd();
        ImmutableList<CuratedList> listsToRemove = dataState.getListsToRemove();
        ImmutableSet immutableSet = extensions2.toImmutableSet(dataState.getUserListIdsWithSecurity());
        Set<UUID> checkedListIds = dataState.getCheckedListIds();
        return new AddToListsBottomSheetViewState(dataState.getCanShowSaveButton(), checkedListIds != null ? extensions2.toImmutableSet(checkedListIds) : null, listRows, listsToAdd, listsToRemove, security, title, immutableSet);
    }
}
