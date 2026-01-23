package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AddToListsBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÂ\u0003JY\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0011¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;", "", "isSingleSelectMode", "", "security", "Lcom/robinhood/models/db/Security;", "checkedListIds", "", "Ljava/util/UUID;", "userListIdsWithSecurity", "followedLists", "", "Lcom/robinhood/models/db/CuratedList;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(ZLcom/robinhood/models/db/Security;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "()Z", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getCheckedListIds", "()Ljava/util/Set;", "getUserListIdsWithSecurity", "getFollowedLists", "()Ljava/util/List;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "listRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow;", "getListRows", "()Lkotlinx/collections/immutable/ImmutableList;", "listsToAdd", "getListsToAdd", "listsToRemove", "getListsToRemove", "canShowSaveButton", "getCanShowSaveButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class AddToListsBottomSheetDataState {
    public static final int $stable = 8;
    private final Set<UUID> checkedListIds;
    private final Screen eventScreen;
    private final List<CuratedList> followedLists;
    private final boolean isSingleSelectMode;
    private final Security security;
    private final Set<UUID> userListIdsWithSecurity;

    /* renamed from: component6, reason: from getter */
    private final Screen getEventScreen() {
        return this.eventScreen;
    }

    public static /* synthetic */ AddToListsBottomSheetDataState copy$default(AddToListsBottomSheetDataState addToListsBottomSheetDataState, boolean z, Security security, Set set, Set set2, List list, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addToListsBottomSheetDataState.isSingleSelectMode;
        }
        if ((i & 2) != 0) {
            security = addToListsBottomSheetDataState.security;
        }
        if ((i & 4) != 0) {
            set = addToListsBottomSheetDataState.checkedListIds;
        }
        if ((i & 8) != 0) {
            set2 = addToListsBottomSheetDataState.userListIdsWithSecurity;
        }
        if ((i & 16) != 0) {
            list = addToListsBottomSheetDataState.followedLists;
        }
        if ((i & 32) != 0) {
            screen = addToListsBottomSheetDataState.eventScreen;
        }
        List list2 = list;
        Screen screen2 = screen;
        return addToListsBottomSheetDataState.copy(z, security, set, set2, list2, screen2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Security getSecurity() {
        return this.security;
    }

    public final Set<UUID> component3() {
        return this.checkedListIds;
    }

    public final Set<UUID> component4() {
        return this.userListIdsWithSecurity;
    }

    public final List<CuratedList> component5() {
        return this.followedLists;
    }

    public final AddToListsBottomSheetDataState copy(boolean isSingleSelectMode, Security security, Set<UUID> checkedListIds, Set<UUID> userListIdsWithSecurity, List<CuratedList> followedLists, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(userListIdsWithSecurity, "userListIdsWithSecurity");
        Intrinsics.checkNotNullParameter(followedLists, "followedLists");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        return new AddToListsBottomSheetDataState(isSingleSelectMode, security, checkedListIds, userListIdsWithSecurity, followedLists, eventScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToListsBottomSheetDataState)) {
            return false;
        }
        AddToListsBottomSheetDataState addToListsBottomSheetDataState = (AddToListsBottomSheetDataState) other;
        return this.isSingleSelectMode == addToListsBottomSheetDataState.isSingleSelectMode && Intrinsics.areEqual(this.security, addToListsBottomSheetDataState.security) && Intrinsics.areEqual(this.checkedListIds, addToListsBottomSheetDataState.checkedListIds) && Intrinsics.areEqual(this.userListIdsWithSecurity, addToListsBottomSheetDataState.userListIdsWithSecurity) && Intrinsics.areEqual(this.followedLists, addToListsBottomSheetDataState.followedLists) && Intrinsics.areEqual(this.eventScreen, addToListsBottomSheetDataState.eventScreen);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isSingleSelectMode) * 31) + this.security.hashCode()) * 31;
        Set<UUID> set = this.checkedListIds;
        return ((((((iHashCode + (set == null ? 0 : set.hashCode())) * 31) + this.userListIdsWithSecurity.hashCode()) * 31) + this.followedLists.hashCode()) * 31) + this.eventScreen.hashCode();
    }

    public String toString() {
        return "AddToListsBottomSheetDataState(isSingleSelectMode=" + this.isSingleSelectMode + ", security=" + this.security + ", checkedListIds=" + this.checkedListIds + ", userListIdsWithSecurity=" + this.userListIdsWithSecurity + ", followedLists=" + this.followedLists + ", eventScreen=" + this.eventScreen + ")";
    }

    public AddToListsBottomSheetDataState(boolean z, Security security, Set<UUID> set, Set<UUID> userListIdsWithSecurity, List<CuratedList> followedLists, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(userListIdsWithSecurity, "userListIdsWithSecurity");
        Intrinsics.checkNotNullParameter(followedLists, "followedLists");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        this.isSingleSelectMode = z;
        this.security = security;
        this.checkedListIds = set;
        this.userListIdsWithSecurity = userListIdsWithSecurity;
        this.followedLists = followedLists;
        this.eventScreen = eventScreen;
    }

    public final boolean isSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    public final Security getSecurity() {
        return this.security;
    }

    public final Set<UUID> getCheckedListIds() {
        return this.checkedListIds;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AddToListsBottomSheetDataState(boolean r8, com.robinhood.models.p320db.Security r9, java.util.Set r10, java.util.Set r11, java.util.List r12, com.robinhood.rosetta.eventlogging.Screen r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L5
            r8 = 0
        L5:
            r15 = r14 & 4
            if (r15 == 0) goto La
            r10 = 0
        La:
            r15 = r14 & 8
            if (r15 == 0) goto L12
            java.util.Set r11 = kotlin.collections.SetsKt.emptySet()
        L12:
            r15 = r14 & 16
            if (r15 == 0) goto L1a
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
        L1a:
            r14 = r14 & 32
            if (r14 == 0) goto L33
            com.robinhood.rosetta.eventlogging.Screen r0 = new com.robinhood.rosetta.eventlogging.Screen
            com.robinhood.rosetta.eventlogging.Screen$Name r1 = com.robinhood.rosetta.eventlogging.Screen.Name.NAME_UNSPECIFIED
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            goto L3a
        L33:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r9 = r7
        L3a:
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetDataState.<init>(boolean, com.robinhood.models.db.Security, java.util.Set, java.util.Set, java.util.List, com.robinhood.rosetta.eventlogging.Screen, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Set<UUID> getUserListIdsWithSecurity() {
        return this.userListIdsWithSecurity;
    }

    public final List<CuratedList> getFollowedLists() {
        return this.followedLists;
    }

    public final StringResource getTitle() {
        return StringResource.INSTANCE.invoke(C39419R.string.lists_addition_sheet_title, this.security.getDisplaySymbol());
    }

    public final ImmutableList<AddToListsBottomSheetViewState2> getListRows() {
        return extensions2.toImmutableList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.followedLists), new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AddToListsBottomSheetDataState._get_listRows_$lambda$0((CuratedList) obj));
            }
        }), new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddToListsBottomSheetDataState._get_listRows_$lambda$1(this.f$0, (CuratedList) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_listRows_$lambda$0(CuratedList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.getOwnerType() == ApiCuratedList.OwnerType.CUSTOM && !list.isOptionsWatchlist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToListsBottomSheetViewState2 _get_listRows_$lambda$1(AddToListsBottomSheetDataState addToListsBottomSheetDataState, CuratedList userList) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(userList, "userList");
        boolean zContains = addToListsBottomSheetDataState.userListIdsWithSecurity.contains(userList.getId());
        if (zContains) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C39419R.string.lists_added_item_subtitle, addToListsBottomSheetDataState.security.getDisplaySymbol());
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C39419R.plurals.lists_number_of_items, userList.getItemCount()), Integer.valueOf(userList.getItemCount()));
        }
        if (addToListsBottomSheetDataState.isSingleSelectMode) {
            return new AddToListsBottomSheetViewState2.Selectable(userList, stringResourceInvoke);
        }
        Set<UUID> set = addToListsBottomSheetDataState.checkedListIds;
        return new AddToListsBottomSheetViewState2.Checkable(userList, stringResourceInvoke, set != null ? set.contains(userList.getId()) : zContains, zContains);
    }

    public final ImmutableList<CuratedList> getListsToAdd() {
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(getListRows()), new Function1<Object, Boolean>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AddToListsBottomSheetViewState2.Checkable);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return extensions2.toImmutableList(SequencesKt.map(SequencesKt.filter(sequenceFilter, new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AddToListsBottomSheetDataState._get_listsToAdd_$lambda$2((AddToListsBottomSheetViewState2.Checkable) obj));
            }
        }), new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddToListsBottomSheetDataState._get_listsToAdd_$lambda$3((AddToListsBottomSheetViewState2.Checkable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_listsToAdd_$lambda$2(AddToListsBottomSheetViewState2.Checkable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isChecked() && !it.isSecurityInList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedList _get_listsToAdd_$lambda$3(AddToListsBottomSheetViewState2.Checkable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getList();
    }

    public final ImmutableList<CuratedList> getListsToRemove() {
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(getListRows()), new Function1<Object, Boolean>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$special$$inlined$filterIsInstance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AddToListsBottomSheetViewState2.Checkable);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return extensions2.toImmutableList(SequencesKt.map(SequencesKt.filter(sequenceFilter, new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AddToListsBottomSheetDataState._get_listsToRemove_$lambda$4((AddToListsBottomSheetViewState2.Checkable) obj));
            }
        }), new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDataState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddToListsBottomSheetDataState._get_listsToRemove_$lambda$5((AddToListsBottomSheetViewState2.Checkable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_listsToRemove_$lambda$4(AddToListsBottomSheetViewState2.Checkable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isChecked() && it.isSecurityInList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedList _get_listsToRemove_$lambda$5(AddToListsBottomSheetViewState2.Checkable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getList();
    }

    public final boolean getCanShowSaveButton() {
        return !this.isSingleSelectMode;
    }
}
