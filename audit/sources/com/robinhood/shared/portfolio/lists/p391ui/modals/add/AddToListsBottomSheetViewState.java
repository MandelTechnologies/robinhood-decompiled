package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: AddToListsBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003Jy\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetViewState;", "", "canShowSaveButton", "", "checkedListIds", "Lkotlinx/collections/immutable/ImmutableSet;", "Ljava/util/UUID;", "listRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow;", "listsToAdd", "Lcom/robinhood/models/db/CuratedList;", "listsToRemove", "security", "Lcom/robinhood/models/db/Security;", "title", "Lcom/robinhood/utils/resource/StringResource;", "userListIdsWithSecurity", "<init>", "(ZLkotlinx/collections/immutable/ImmutableSet;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/Security;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableSet;)V", "getCanShowSaveButton", "()Z", "getCheckedListIds", "()Lkotlinx/collections/immutable/ImmutableSet;", "getListRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getListsToAdd", "getListsToRemove", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getUserListIdsWithSecurity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddToListsBottomSheetViewState {
    public static final int $stable = 8;
    private final boolean canShowSaveButton;
    private final ImmutableSet<UUID> checkedListIds;
    private final ImmutableList<AddToListsBottomSheetViewState2> listRows;
    private final ImmutableList<CuratedList> listsToAdd;
    private final ImmutableList<CuratedList> listsToRemove;
    private final Security security;
    private final StringResource title;
    private final ImmutableSet<UUID> userListIdsWithSecurity;

    public static /* synthetic */ AddToListsBottomSheetViewState copy$default(AddToListsBottomSheetViewState addToListsBottomSheetViewState, boolean z, ImmutableSet immutableSet, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Security security, StringResource stringResource, ImmutableSet immutableSet2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addToListsBottomSheetViewState.canShowSaveButton;
        }
        if ((i & 2) != 0) {
            immutableSet = addToListsBottomSheetViewState.checkedListIds;
        }
        if ((i & 4) != 0) {
            immutableList = addToListsBottomSheetViewState.listRows;
        }
        if ((i & 8) != 0) {
            immutableList2 = addToListsBottomSheetViewState.listsToAdd;
        }
        if ((i & 16) != 0) {
            immutableList3 = addToListsBottomSheetViewState.listsToRemove;
        }
        if ((i & 32) != 0) {
            security = addToListsBottomSheetViewState.security;
        }
        if ((i & 64) != 0) {
            stringResource = addToListsBottomSheetViewState.title;
        }
        if ((i & 128) != 0) {
            immutableSet2 = addToListsBottomSheetViewState.userListIdsWithSecurity;
        }
        StringResource stringResource2 = stringResource;
        ImmutableSet immutableSet3 = immutableSet2;
        ImmutableList immutableList4 = immutableList3;
        Security security2 = security;
        return addToListsBottomSheetViewState.copy(z, immutableSet, immutableList, immutableList2, immutableList4, security2, stringResource2, immutableSet3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanShowSaveButton() {
        return this.canShowSaveButton;
    }

    public final ImmutableSet<UUID> component2() {
        return this.checkedListIds;
    }

    public final ImmutableList<AddToListsBottomSheetViewState2> component3() {
        return this.listRows;
    }

    public final ImmutableList<CuratedList> component4() {
        return this.listsToAdd;
    }

    public final ImmutableList<CuratedList> component5() {
        return this.listsToRemove;
    }

    /* renamed from: component6, reason: from getter */
    public final Security getSecurity() {
        return this.security;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableSet<UUID> component8() {
        return this.userListIdsWithSecurity;
    }

    public final AddToListsBottomSheetViewState copy(boolean canShowSaveButton, ImmutableSet<UUID> checkedListIds, ImmutableList<? extends AddToListsBottomSheetViewState2> listRows, ImmutableList<CuratedList> listsToAdd, ImmutableList<CuratedList> listsToRemove, Security security, StringResource title, ImmutableSet<UUID> userListIdsWithSecurity) {
        Intrinsics.checkNotNullParameter(listRows, "listRows");
        Intrinsics.checkNotNullParameter(listsToAdd, "listsToAdd");
        Intrinsics.checkNotNullParameter(listsToRemove, "listsToRemove");
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(userListIdsWithSecurity, "userListIdsWithSecurity");
        return new AddToListsBottomSheetViewState(canShowSaveButton, checkedListIds, listRows, listsToAdd, listsToRemove, security, title, userListIdsWithSecurity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToListsBottomSheetViewState)) {
            return false;
        }
        AddToListsBottomSheetViewState addToListsBottomSheetViewState = (AddToListsBottomSheetViewState) other;
        return this.canShowSaveButton == addToListsBottomSheetViewState.canShowSaveButton && Intrinsics.areEqual(this.checkedListIds, addToListsBottomSheetViewState.checkedListIds) && Intrinsics.areEqual(this.listRows, addToListsBottomSheetViewState.listRows) && Intrinsics.areEqual(this.listsToAdd, addToListsBottomSheetViewState.listsToAdd) && Intrinsics.areEqual(this.listsToRemove, addToListsBottomSheetViewState.listsToRemove) && Intrinsics.areEqual(this.security, addToListsBottomSheetViewState.security) && Intrinsics.areEqual(this.title, addToListsBottomSheetViewState.title) && Intrinsics.areEqual(this.userListIdsWithSecurity, addToListsBottomSheetViewState.userListIdsWithSecurity);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canShowSaveButton) * 31;
        ImmutableSet<UUID> immutableSet = this.checkedListIds;
        return ((((((((((((iHashCode + (immutableSet == null ? 0 : immutableSet.hashCode())) * 31) + this.listRows.hashCode()) * 31) + this.listsToAdd.hashCode()) * 31) + this.listsToRemove.hashCode()) * 31) + this.security.hashCode()) * 31) + this.title.hashCode()) * 31) + this.userListIdsWithSecurity.hashCode();
    }

    public String toString() {
        return "AddToListsBottomSheetViewState(canShowSaveButton=" + this.canShowSaveButton + ", checkedListIds=" + this.checkedListIds + ", listRows=" + this.listRows + ", listsToAdd=" + this.listsToAdd + ", listsToRemove=" + this.listsToRemove + ", security=" + this.security + ", title=" + this.title + ", userListIdsWithSecurity=" + this.userListIdsWithSecurity + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddToListsBottomSheetViewState(boolean z, ImmutableSet<UUID> immutableSet, ImmutableList<? extends AddToListsBottomSheetViewState2> listRows, ImmutableList<CuratedList> listsToAdd, ImmutableList<CuratedList> listsToRemove, Security security, StringResource title, ImmutableSet<UUID> userListIdsWithSecurity) {
        Intrinsics.checkNotNullParameter(listRows, "listRows");
        Intrinsics.checkNotNullParameter(listsToAdd, "listsToAdd");
        Intrinsics.checkNotNullParameter(listsToRemove, "listsToRemove");
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(userListIdsWithSecurity, "userListIdsWithSecurity");
        this.canShowSaveButton = z;
        this.checkedListIds = immutableSet;
        this.listRows = listRows;
        this.listsToAdd = listsToAdd;
        this.listsToRemove = listsToRemove;
        this.security = security;
        this.title = title;
        this.userListIdsWithSecurity = userListIdsWithSecurity;
    }

    public final boolean getCanShowSaveButton() {
        return this.canShowSaveButton;
    }

    public final ImmutableSet<UUID> getCheckedListIds() {
        return this.checkedListIds;
    }

    public final ImmutableList<AddToListsBottomSheetViewState2> getListRows() {
        return this.listRows;
    }

    public final ImmutableList<CuratedList> getListsToAdd() {
        return this.listsToAdd;
    }

    public final ImmutableList<CuratedList> getListsToRemove() {
        return this.listsToRemove;
    }

    public final Security getSecurity() {
        return this.security;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableSet<UUID> getUserListIdsWithSecurity() {
        return this.userListIdsWithSecurity;
    }
}
