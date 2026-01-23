package com.robinhood.android.lists.p173ui.userlist;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListUserListViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\t\u0010h\u001a\u00020\u000eHÆ\u0003J\t\u0010i\u001a\u00020\u000eHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010n\u001a\u00020\u000eHÆ\u0003J\t\u0010o\u001a\u00020\u000eHÆ\u0003J\t\u0010p\u001a\u00020\u000eHÆ\u0003J\t\u0010q\u001a\u00020\u000eHÆ\u0003J\t\u0010r\u001a\u00020\u000eHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010u\u001a\u00020\u000eHÆ\u0003J\t\u0010v\u001a\u00020\u000eHÂ\u0003Jû\u0001\u0010w\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u000eHÆ\u0001J\u0013\u0010x\u001a\u00020\u000e2\b\u0010y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010z\u001a\u00020:HÖ\u0001J\t\u0010{\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010+R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010+R\u0011\u0010\u001a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010+R\u000e\u0010 \u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00109\u001a\u00020:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b>\u0010&R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00058F¢\u0006\u0006\u001a\u0004\b@\u0010&R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010&R\u0011\u0010C\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0011\u0010E\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0013\u0010G\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0011\u0010I\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bJ\u0010+R\u0013\u0010K\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bP\u0010+R\u0011\u0010Q\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010+R\u0011\u0010S\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bT\u0010+R\u0011\u0010U\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010+R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\bW\u0010&R\u0011\u0010X\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010+R\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010+R\u0011\u0010[\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010+R\u0011\u0010]\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b^\u0010+R\u0011\u0010_\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010+R\u0011\u0010a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bb\u0010+¨\u0006|"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;", "", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "internalCuratedListEligibleItems", "", "Lcom/robinhood/models/ui/CuratedListEligible;", "previewCuratedListEligibleItems", "deletedListEvent", "Lcom/robinhood/udf/UiEvent;", "", "updatedListErrorEvent", "", "isLoadingListItems", "", "isEditing", "editedEmoji", "", "editedTitle", "currentSortOption", "Lcom/robinhood/models/ui/SortOption;", "viewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "expandDisclosure", "hasFuturesContracts", "isSwipeToBuyEnabled", "subzeroEnabled", "isBuyEnabled", "buyErrorMessage", "pendingBuyInstrumentId", "Ljava/util/UUID;", "isInEtfSupportedRegion", "updatingList", "<init>", "(Lcom/robinhood/models/db/CuratedList;Ljava/util/List;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/SortOption;Lcom/robinhood/models/db/CuratedListViewMode;ZZZZZLjava/lang/String;Ljava/util/UUID;ZZ)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "getInternalCuratedListEligibleItems", "()Ljava/util/List;", "getPreviewCuratedListEligibleItems", "getDeletedListEvent", "()Lcom/robinhood/udf/UiEvent;", "getUpdatedListErrorEvent", "()Z", "getEditedEmoji", "()Ljava/lang/String;", "getEditedTitle", "getCurrentSortOption", "()Lcom/robinhood/models/ui/SortOption;", "getViewMode", "()Lcom/robinhood/models/db/CuratedListViewMode;", "getExpandDisclosure", "getHasFuturesContracts", "getSubzeroEnabled", "getBuyErrorMessage", "getPendingBuyInstrumentId", "()Ljava/util/UUID;", "totalListItemCount", "", "getTotalListItemCount", "()I", "curatedListEligibleItems", "getCuratedListEligibleItems", "curatedListInstrumentItemsIds", "getCuratedListInstrumentItemsIds", "curatedListCurrencyPairIds", "getCuratedListCurrencyPairIds", "showHeader", "getShowHeader", "showHeaderEdit", "getShowHeaderEdit", "toolbarTitle", "getToolbarTitle", "showEmptyState", "getShowEmptyState", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/db/RichText;", "getDisclosure", "()Lcom/robinhood/models/serverdriven/db/RichText;", "showDisclosure", "getShowDisclosure", "canAppendToggleText", "getCanAppendToggleText", "showUserSortOption", "getShowUserSortOption", "isEditingWithChanges", "removedItems", "getRemovedItems", "isItemRemoved", "reorderedInEditMode", "getReorderedInEditMode", "showAddToListMenuOption", "getShowAddToListMenuOption", "showLoadingListMenuOption", "getShowLoadingListMenuOption", "showOverflowMenuOption", "getShowOverflowMenuOption", "showDoneButton", "getShowDoneButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class CuratedListUserListViewState {
    public static final int $stable = 8;
    private final String buyErrorMessage;
    private final CuratedList curatedList;
    private final SortOption currentSortOption;
    private final UiEvent<Unit> deletedListEvent;
    private final String editedEmoji;
    private final String editedTitle;
    private final boolean expandDisclosure;
    private final boolean hasFuturesContracts;
    private final List<CuratedListEligible> internalCuratedListEligibleItems;
    private final boolean isBuyEnabled;
    private final boolean isEditing;
    private final boolean isEditingWithChanges;
    private final boolean isInEtfSupportedRegion;
    private final boolean isLoadingListItems;
    private final boolean isSwipeToBuyEnabled;
    private final UUID pendingBuyInstrumentId;
    private final List<CuratedListEligible> previewCuratedListEligibleItems;
    private final boolean showAddToListMenuOption;
    private final boolean showDoneButton;
    private final boolean showHeader;
    private final boolean showHeaderEdit;
    private final boolean showLoadingListMenuOption;
    private final boolean showOverflowMenuOption;
    private final boolean subzeroEnabled;
    private final String toolbarTitle;
    private final int totalListItemCount;
    private final UiEvent<Throwable> updatedListErrorEvent;
    private final boolean updatingList;
    private final CuratedListViewMode viewMode;

    public CuratedListUserListViewState() {
        this(null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048575, null);
    }

    /* renamed from: component20, reason: from getter */
    private final boolean getUpdatingList() {
        return this.updatingList;
    }

    public static /* synthetic */ CuratedListUserListViewState copy$default(CuratedListUserListViewState curatedListUserListViewState, CuratedList curatedList, List list, List list2, UiEvent uiEvent, UiEvent uiEvent2, boolean z, boolean z2, String str, String str2, SortOption sortOption, CuratedListViewMode curatedListViewMode, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, UUID uuid, boolean z8, boolean z9, int i, Object obj) {
        boolean z10;
        boolean z11;
        CuratedList curatedList2 = (i & 1) != 0 ? curatedListUserListViewState.curatedList : curatedList;
        List list3 = (i & 2) != 0 ? curatedListUserListViewState.internalCuratedListEligibleItems : list;
        List list4 = (i & 4) != 0 ? curatedListUserListViewState.previewCuratedListEligibleItems : list2;
        UiEvent uiEvent3 = (i & 8) != 0 ? curatedListUserListViewState.deletedListEvent : uiEvent;
        UiEvent uiEvent4 = (i & 16) != 0 ? curatedListUserListViewState.updatedListErrorEvent : uiEvent2;
        boolean z12 = (i & 32) != 0 ? curatedListUserListViewState.isLoadingListItems : z;
        boolean z13 = (i & 64) != 0 ? curatedListUserListViewState.isEditing : z2;
        String str4 = (i & 128) != 0 ? curatedListUserListViewState.editedEmoji : str;
        String str5 = (i & 256) != 0 ? curatedListUserListViewState.editedTitle : str2;
        SortOption sortOption2 = (i & 512) != 0 ? curatedListUserListViewState.currentSortOption : sortOption;
        CuratedListViewMode curatedListViewMode2 = (i & 1024) != 0 ? curatedListUserListViewState.viewMode : curatedListViewMode;
        boolean z14 = (i & 2048) != 0 ? curatedListUserListViewState.expandDisclosure : z3;
        boolean z15 = (i & 4096) != 0 ? curatedListUserListViewState.hasFuturesContracts : z4;
        boolean z16 = (i & 8192) != 0 ? curatedListUserListViewState.isSwipeToBuyEnabled : z5;
        CuratedList curatedList3 = curatedList2;
        boolean z17 = (i & 16384) != 0 ? curatedListUserListViewState.subzeroEnabled : z6;
        boolean z18 = (i & 32768) != 0 ? curatedListUserListViewState.isBuyEnabled : z7;
        String str6 = (i & 65536) != 0 ? curatedListUserListViewState.buyErrorMessage : str3;
        UUID uuid2 = (i & 131072) != 0 ? curatedListUserListViewState.pendingBuyInstrumentId : uuid;
        boolean z19 = (i & 262144) != 0 ? curatedListUserListViewState.isInEtfSupportedRegion : z8;
        if ((i & 524288) != 0) {
            z11 = z19;
            z10 = curatedListUserListViewState.updatingList;
        } else {
            z10 = z9;
            z11 = z19;
        }
        return curatedListUserListViewState.copy(curatedList3, list3, list4, uiEvent3, uiEvent4, z12, z13, str4, str5, sortOption2, curatedListViewMode2, z14, z15, z16, z17, z18, str6, uuid2, z11, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    /* renamed from: component10, reason: from getter */
    public final SortOption getCurrentSortOption() {
        return this.currentSortOption;
    }

    /* renamed from: component11, reason: from getter */
    public final CuratedListViewMode getViewMode() {
        return this.viewMode;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasFuturesContracts() {
        return this.hasFuturesContracts;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSwipeToBuyEnabled() {
        return this.isSwipeToBuyEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsBuyEnabled() {
        return this.isBuyEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final String getBuyErrorMessage() {
        return this.buyErrorMessage;
    }

    /* renamed from: component18, reason: from getter */
    public final UUID getPendingBuyInstrumentId() {
        return this.pendingBuyInstrumentId;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    public final List<CuratedListEligible> component2() {
        return this.internalCuratedListEligibleItems;
    }

    public final List<CuratedListEligible> component3() {
        return this.previewCuratedListEligibleItems;
    }

    public final UiEvent<Unit> component4() {
        return this.deletedListEvent;
    }

    public final UiEvent<Throwable> component5() {
        return this.updatedListErrorEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingListItems() {
        return this.isLoadingListItems;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEditedEmoji() {
        return this.editedEmoji;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEditedTitle() {
        return this.editedTitle;
    }

    public final CuratedListUserListViewState copy(CuratedList curatedList, List<? extends CuratedListEligible> internalCuratedListEligibleItems, List<? extends CuratedListEligible> previewCuratedListEligibleItems, UiEvent<Unit> deletedListEvent, UiEvent<Throwable> updatedListErrorEvent, boolean isLoadingListItems, boolean isEditing, String editedEmoji, String editedTitle, SortOption currentSortOption, CuratedListViewMode viewMode, boolean expandDisclosure, boolean hasFuturesContracts, boolean isSwipeToBuyEnabled, boolean subzeroEnabled, boolean isBuyEnabled, String buyErrorMessage, UUID pendingBuyInstrumentId, boolean isInEtfSupportedRegion, boolean updatingList) {
        Intrinsics.checkNotNullParameter(internalCuratedListEligibleItems, "internalCuratedListEligibleItems");
        Intrinsics.checkNotNullParameter(previewCuratedListEligibleItems, "previewCuratedListEligibleItems");
        return new CuratedListUserListViewState(curatedList, internalCuratedListEligibleItems, previewCuratedListEligibleItems, deletedListEvent, updatedListErrorEvent, isLoadingListItems, isEditing, editedEmoji, editedTitle, currentSortOption, viewMode, expandDisclosure, hasFuturesContracts, isSwipeToBuyEnabled, subzeroEnabled, isBuyEnabled, buyErrorMessage, pendingBuyInstrumentId, isInEtfSupportedRegion, updatingList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListUserListViewState)) {
            return false;
        }
        CuratedListUserListViewState curatedListUserListViewState = (CuratedListUserListViewState) other;
        return Intrinsics.areEqual(this.curatedList, curatedListUserListViewState.curatedList) && Intrinsics.areEqual(this.internalCuratedListEligibleItems, curatedListUserListViewState.internalCuratedListEligibleItems) && Intrinsics.areEqual(this.previewCuratedListEligibleItems, curatedListUserListViewState.previewCuratedListEligibleItems) && Intrinsics.areEqual(this.deletedListEvent, curatedListUserListViewState.deletedListEvent) && Intrinsics.areEqual(this.updatedListErrorEvent, curatedListUserListViewState.updatedListErrorEvent) && this.isLoadingListItems == curatedListUserListViewState.isLoadingListItems && this.isEditing == curatedListUserListViewState.isEditing && Intrinsics.areEqual(this.editedEmoji, curatedListUserListViewState.editedEmoji) && Intrinsics.areEqual(this.editedTitle, curatedListUserListViewState.editedTitle) && Intrinsics.areEqual(this.currentSortOption, curatedListUserListViewState.currentSortOption) && this.viewMode == curatedListUserListViewState.viewMode && this.expandDisclosure == curatedListUserListViewState.expandDisclosure && this.hasFuturesContracts == curatedListUserListViewState.hasFuturesContracts && this.isSwipeToBuyEnabled == curatedListUserListViewState.isSwipeToBuyEnabled && this.subzeroEnabled == curatedListUserListViewState.subzeroEnabled && this.isBuyEnabled == curatedListUserListViewState.isBuyEnabled && Intrinsics.areEqual(this.buyErrorMessage, curatedListUserListViewState.buyErrorMessage) && Intrinsics.areEqual(this.pendingBuyInstrumentId, curatedListUserListViewState.pendingBuyInstrumentId) && this.isInEtfSupportedRegion == curatedListUserListViewState.isInEtfSupportedRegion && this.updatingList == curatedListUserListViewState.updatingList;
    }

    public int hashCode() {
        CuratedList curatedList = this.curatedList;
        int iHashCode = (((((curatedList == null ? 0 : curatedList.hashCode()) * 31) + this.internalCuratedListEligibleItems.hashCode()) * 31) + this.previewCuratedListEligibleItems.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.deletedListEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.updatedListErrorEvent;
        int iHashCode3 = (((((iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.isLoadingListItems)) * 31) + Boolean.hashCode(this.isEditing)) * 31;
        String str = this.editedEmoji;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editedTitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SortOption sortOption = this.currentSortOption;
        int iHashCode6 = (iHashCode5 + (sortOption == null ? 0 : sortOption.hashCode())) * 31;
        CuratedListViewMode curatedListViewMode = this.viewMode;
        int iHashCode7 = (((((((((((iHashCode6 + (curatedListViewMode == null ? 0 : curatedListViewMode.hashCode())) * 31) + Boolean.hashCode(this.expandDisclosure)) * 31) + Boolean.hashCode(this.hasFuturesContracts)) * 31) + Boolean.hashCode(this.isSwipeToBuyEnabled)) * 31) + Boolean.hashCode(this.subzeroEnabled)) * 31) + Boolean.hashCode(this.isBuyEnabled)) * 31;
        String str3 = this.buyErrorMessage;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UUID uuid = this.pendingBuyInstrumentId;
        return ((((iHashCode8 + (uuid != null ? uuid.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInEtfSupportedRegion)) * 31) + Boolean.hashCode(this.updatingList);
    }

    public String toString() {
        return "CuratedListUserListViewState(curatedList=" + this.curatedList + ", internalCuratedListEligibleItems=" + this.internalCuratedListEligibleItems + ", previewCuratedListEligibleItems=" + this.previewCuratedListEligibleItems + ", deletedListEvent=" + this.deletedListEvent + ", updatedListErrorEvent=" + this.updatedListErrorEvent + ", isLoadingListItems=" + this.isLoadingListItems + ", isEditing=" + this.isEditing + ", editedEmoji=" + this.editedEmoji + ", editedTitle=" + this.editedTitle + ", currentSortOption=" + this.currentSortOption + ", viewMode=" + this.viewMode + ", expandDisclosure=" + this.expandDisclosure + ", hasFuturesContracts=" + this.hasFuturesContracts + ", isSwipeToBuyEnabled=" + this.isSwipeToBuyEnabled + ", subzeroEnabled=" + this.subzeroEnabled + ", isBuyEnabled=" + this.isBuyEnabled + ", buyErrorMessage=" + this.buyErrorMessage + ", pendingBuyInstrumentId=" + this.pendingBuyInstrumentId + ", isInEtfSupportedRegion=" + this.isInEtfSupportedRegion + ", updatingList=" + this.updatingList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuratedListUserListViewState(CuratedList curatedList, List<? extends CuratedListEligible> internalCuratedListEligibleItems, List<? extends CuratedListEligible> previewCuratedListEligibleItems, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, boolean z, boolean z2, String str, String str2, SortOption sortOption, CuratedListViewMode curatedListViewMode, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, UUID uuid, boolean z8, boolean z9) {
        boolean z10;
        Intrinsics.checkNotNullParameter(internalCuratedListEligibleItems, "internalCuratedListEligibleItems");
        Intrinsics.checkNotNullParameter(previewCuratedListEligibleItems, "previewCuratedListEligibleItems");
        this.curatedList = curatedList;
        this.internalCuratedListEligibleItems = internalCuratedListEligibleItems;
        this.previewCuratedListEligibleItems = previewCuratedListEligibleItems;
        this.deletedListEvent = uiEvent;
        this.updatedListErrorEvent = uiEvent2;
        this.isLoadingListItems = z;
        this.isEditing = z2;
        this.editedEmoji = str;
        this.editedTitle = str2;
        this.currentSortOption = sortOption;
        this.viewMode = curatedListViewMode;
        this.expandDisclosure = z3;
        this.hasFuturesContracts = z4;
        this.isSwipeToBuyEnabled = z5;
        this.subzeroEnabled = z6;
        this.isBuyEnabled = z7;
        this.buyErrorMessage = str3;
        this.pendingBuyInstrumentId = uuid;
        this.isInEtfSupportedRegion = z8;
        this.updatingList = z9;
        boolean z11 = false;
        this.totalListItemCount = curatedList != null ? curatedList.getItemCount() : 0;
        this.showHeader = !z2;
        this.showHeaderEdit = z2;
        this.toolbarTitle = curatedList != null ? curatedList.getDisplayName() : null;
        if (!z2) {
            z10 = false;
        } else if (str != null) {
            if (Intrinsics.areEqual(curatedList != null ? curatedList.getIconEmoji() : null, str)) {
            }
            z10 = true;
        } else if (str2 != null) {
            if (Intrinsics.areEqual(curatedList != null ? curatedList.getDisplayName() : null, str2)) {
            }
            z10 = true;
        } else if (isItemRemoved() || getReorderedInEditMode()) {
            z10 = true;
        }
        this.isEditingWithChanges = z10;
        this.showAddToListMenuOption = !z2;
        this.showLoadingListMenuOption = z9;
        this.showOverflowMenuOption = !z2;
        if (z2 && !z9) {
            z11 = true;
        }
        this.showDoneButton = z11;
    }

    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    public /* synthetic */ CuratedListUserListViewState(CuratedList curatedList, List list, List list2, UiEvent uiEvent, UiEvent uiEvent2, boolean z, boolean z2, String str, String str2, SortOption sortOption, CuratedListViewMode curatedListViewMode, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, UUID uuid, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : curatedList, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : sortOption, (i & 1024) != 0 ? null : curatedListViewMode, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? false : z5, (i & 16384) != 0 ? false : z6, (i & 32768) != 0 ? false : z7, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : uuid, (i & 262144) != 0 ? false : z8, (i & 524288) != 0 ? false : z9);
    }

    public final List<CuratedListEligible> getInternalCuratedListEligibleItems() {
        return this.internalCuratedListEligibleItems;
    }

    public final List<CuratedListEligible> getPreviewCuratedListEligibleItems() {
        return this.previewCuratedListEligibleItems;
    }

    public final UiEvent<Unit> getDeletedListEvent() {
        return this.deletedListEvent;
    }

    public final UiEvent<Throwable> getUpdatedListErrorEvent() {
        return this.updatedListErrorEvent;
    }

    public final boolean isLoadingListItems() {
        return this.isLoadingListItems;
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    public final String getEditedEmoji() {
        return this.editedEmoji;
    }

    public final String getEditedTitle() {
        return this.editedTitle;
    }

    public final SortOption getCurrentSortOption() {
        return this.currentSortOption;
    }

    public final CuratedListViewMode getViewMode() {
        return this.viewMode;
    }

    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    public final boolean getHasFuturesContracts() {
        return this.hasFuturesContracts;
    }

    public final boolean isSwipeToBuyEnabled() {
        return this.isSwipeToBuyEnabled;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    public final boolean isBuyEnabled() {
        return this.isBuyEnabled;
    }

    public final String getBuyErrorMessage() {
        return this.buyErrorMessage;
    }

    public final UUID getPendingBuyInstrumentId() {
        return this.pendingBuyInstrumentId;
    }

    public final boolean isInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    public final int getTotalListItemCount() {
        return this.totalListItemCount;
    }

    public final List<CuratedListEligible> getCuratedListEligibleItems() {
        if (this.isEditing) {
            return this.previewCuratedListEligibleItems;
        }
        return this.internalCuratedListEligibleItems;
    }

    public final List<UUID> getCuratedListInstrumentItemsIds() {
        List<CuratedListEligible> curatedListEligibleItems = getCuratedListEligibleItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : curatedListEligibleItems) {
            if (obj instanceof InstrumentCuratedListEligible) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InstrumentCuratedListEligible) it.next()).getCuratedListItem().getId());
        }
        return arrayList2;
    }

    public final List<UUID> getCuratedListCurrencyPairIds() {
        List<CuratedListEligible> curatedListEligibleItems = getCuratedListEligibleItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : curatedListEligibleItems) {
            if (obj instanceof CryptoCuratedListEligible) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CryptoCuratedListEligible) it.next()).getCuratedListItem().getId());
        }
        return arrayList2;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final boolean getShowHeaderEdit() {
        return this.showHeaderEdit;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final boolean getShowEmptyState() {
        CuratedList curatedList = this.curatedList;
        return (curatedList != null ? curatedList.getOwnerType() : null) == ApiCuratedList.OwnerType.CUSTOM && !this.isLoadingListItems && getCuratedListEligibleItems().isEmpty() && !this.isEditing && this.totalListItemCount == 0;
    }

    public final RichText getDisclosure() {
        RichText disclosure;
        if (getShowDisclosure() && !getCanAppendToggleText()) {
            CuratedList curatedList = this.curatedList;
            if (curatedList != null && (disclosure = curatedList.getDisclosure()) != null) {
                return disclosure;
            }
            CuratedList curatedList2 = this.curatedList;
            if (curatedList2 != null) {
                return curatedList2.getCollapsedDisclosure();
            }
            return null;
        }
        if (this.expandDisclosure) {
            CuratedList curatedList3 = this.curatedList;
            if (curatedList3 != null) {
                return curatedList3.getDisclosure();
            }
            return null;
        }
        CuratedList curatedList4 = this.curatedList;
        if (curatedList4 != null) {
            return curatedList4.getCollapsedDisclosure();
        }
        return null;
    }

    public final boolean getShowDisclosure() {
        CuratedList curatedList = this.curatedList;
        if ((curatedList != null ? curatedList.getDisclosure() : null) != null) {
            return true;
        }
        CuratedList curatedList2 = this.curatedList;
        return (curatedList2 != null ? curatedList2.getCollapsedDisclosure() : null) != null;
    }

    public final boolean getCanAppendToggleText() {
        CuratedList curatedList = this.curatedList;
        return ((curatedList != null ? curatedList.getDisclosure() : null) == null || this.curatedList.getCollapsedDisclosure() == null) ? false : true;
    }

    public final boolean getShowUserSortOption() {
        return (this.currentSortOption == null || this.isEditing) ? false : true;
    }

    /* renamed from: isEditingWithChanges, reason: from getter */
    public final boolean getIsEditingWithChanges() {
        return this.isEditingWithChanges;
    }

    public final List<CuratedListEligible> getRemovedItems() {
        return CollectionsKt.minus((Iterable) this.internalCuratedListEligibleItems, (Iterable) this.previewCuratedListEligibleItems);
    }

    public final boolean isItemRemoved() {
        return !getRemovedItems().isEmpty();
    }

    public final boolean getReorderedInEditMode() {
        return !Intrinsics.areEqual(CollectionsKt.minus((Iterable) this.internalCuratedListEligibleItems, (Iterable) getRemovedItems()), this.previewCuratedListEligibleItems);
    }

    public final boolean getShowAddToListMenuOption() {
        return this.showAddToListMenuOption;
    }

    public final boolean getShowLoadingListMenuOption() {
        return this.showLoadingListMenuOption;
    }

    public final boolean getShowOverflowMenuOption() {
        return this.showOverflowMenuOption;
    }

    public final boolean getShowDoneButton() {
        return this.showDoneButton;
    }
}
