package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.android.matcha.p177ui.profile.MatchaProfileMenuBottomSheet;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.models.matcha.api.MatchaMemo;
import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import com.robinhood.models.p320db.matcha.MatchaProfileInfo;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MatchaTransferDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0005HÆ\u0003Jc\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;", "", "transfer", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "showMenuSheet", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "launchReporting", "Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;", "showBlockConfirmationDialog", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/ShowBlockConfirmationDialogEvent;", "blockResultEvent", "Lkotlin/Result;", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaTransfer;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getTransfer", "()Lcom/robinhood/models/db/matcha/MatchaTransfer;", "getShowMenuSheet", "()Lcom/robinhood/udf/UiEvent;", "getLaunchReporting", "getShowBlockConfirmationDialog", "getBlockResultEvent", "canReport", "", "getCanReport", "()Z", "canBlock", "getCanBlock", "isBlocked", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaTransferDetailDataState {
    public static final int $stable = 8;
    private final UiEvent<Result<StringResource>> blockResultEvent;
    private final UiEvent<CreateReportFragmentKey> launchReporting;
    private final UiEvent<ShowBlockConfirmationDialogEvent> showBlockConfirmationDialog;
    private final UiEvent<MatchaProfileMenuBottomSheet.Args> showMenuSheet;
    private final MatchaTransfer transfer;

    public MatchaTransferDetailDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MatchaTransferDetailDataState copy$default(MatchaTransferDetailDataState matchaTransferDetailDataState, MatchaTransfer matchaTransfer, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, Object obj) {
        if ((i & 1) != 0) {
            matchaTransfer = matchaTransferDetailDataState.transfer;
        }
        if ((i & 2) != 0) {
            uiEvent = matchaTransferDetailDataState.showMenuSheet;
        }
        if ((i & 4) != 0) {
            uiEvent2 = matchaTransferDetailDataState.launchReporting;
        }
        if ((i & 8) != 0) {
            uiEvent3 = matchaTransferDetailDataState.showBlockConfirmationDialog;
        }
        if ((i & 16) != 0) {
            uiEvent4 = matchaTransferDetailDataState.blockResultEvent;
        }
        UiEvent uiEvent5 = uiEvent4;
        UiEvent uiEvent6 = uiEvent2;
        return matchaTransferDetailDataState.copy(matchaTransfer, uiEvent, uiEvent6, uiEvent3, uiEvent5);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchaTransfer getTransfer() {
        return this.transfer;
    }

    public final UiEvent<MatchaProfileMenuBottomSheet.Args> component2() {
        return this.showMenuSheet;
    }

    public final UiEvent<CreateReportFragmentKey> component3() {
        return this.launchReporting;
    }

    public final UiEvent<ShowBlockConfirmationDialogEvent> component4() {
        return this.showBlockConfirmationDialog;
    }

    public final UiEvent<Result<StringResource>> component5() {
        return this.blockResultEvent;
    }

    public final MatchaTransferDetailDataState copy(MatchaTransfer transfer, UiEvent<MatchaProfileMenuBottomSheet.Args> showMenuSheet, UiEvent<CreateReportFragmentKey> launchReporting, UiEvent<ShowBlockConfirmationDialogEvent> showBlockConfirmationDialog, UiEvent<Result<StringResource>> blockResultEvent) {
        return new MatchaTransferDetailDataState(transfer, showMenuSheet, launchReporting, showBlockConfirmationDialog, blockResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaTransferDetailDataState)) {
            return false;
        }
        MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) other;
        return Intrinsics.areEqual(this.transfer, matchaTransferDetailDataState.transfer) && Intrinsics.areEqual(this.showMenuSheet, matchaTransferDetailDataState.showMenuSheet) && Intrinsics.areEqual(this.launchReporting, matchaTransferDetailDataState.launchReporting) && Intrinsics.areEqual(this.showBlockConfirmationDialog, matchaTransferDetailDataState.showBlockConfirmationDialog) && Intrinsics.areEqual(this.blockResultEvent, matchaTransferDetailDataState.blockResultEvent);
    }

    public int hashCode() {
        MatchaTransfer matchaTransfer = this.transfer;
        int iHashCode = (matchaTransfer == null ? 0 : matchaTransfer.hashCode()) * 31;
        UiEvent<MatchaProfileMenuBottomSheet.Args> uiEvent = this.showMenuSheet;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<CreateReportFragmentKey> uiEvent2 = this.launchReporting;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<ShowBlockConfirmationDialogEvent> uiEvent3 = this.showBlockConfirmationDialog;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Result<StringResource>> uiEvent4 = this.blockResultEvent;
        return iHashCode4 + (uiEvent4 != null ? uiEvent4.hashCode() : 0);
    }

    public String toString() {
        return "MatchaTransferDetailDataState(transfer=" + this.transfer + ", showMenuSheet=" + this.showMenuSheet + ", launchReporting=" + this.launchReporting + ", showBlockConfirmationDialog=" + this.showBlockConfirmationDialog + ", blockResultEvent=" + this.blockResultEvent + ")";
    }

    public MatchaTransferDetailDataState(MatchaTransfer matchaTransfer, UiEvent<MatchaProfileMenuBottomSheet.Args> uiEvent, UiEvent<CreateReportFragmentKey> uiEvent2, UiEvent<ShowBlockConfirmationDialogEvent> uiEvent3, UiEvent<Result<StringResource>> uiEvent4) {
        this.transfer = matchaTransfer;
        this.showMenuSheet = uiEvent;
        this.launchReporting = uiEvent2;
        this.showBlockConfirmationDialog = uiEvent3;
        this.blockResultEvent = uiEvent4;
    }

    public /* synthetic */ MatchaTransferDetailDataState(MatchaTransfer matchaTransfer, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : matchaTransfer, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : uiEvent3, (i & 16) != 0 ? null : uiEvent4);
    }

    public final MatchaTransfer getTransfer() {
        return this.transfer;
    }

    public final UiEvent<MatchaProfileMenuBottomSheet.Args> getShowMenuSheet() {
        return this.showMenuSheet;
    }

    public final UiEvent<CreateReportFragmentKey> getLaunchReporting() {
        return this.launchReporting;
    }

    public final UiEvent<ShowBlockConfirmationDialogEvent> getShowBlockConfirmationDialog() {
        return this.showBlockConfirmationDialog;
    }

    public final UiEvent<Result<StringResource>> getBlockResultEvent() {
        return this.blockResultEvent;
    }

    public final boolean getCanReport() {
        MatchaUser transactor;
        MatchaProfileInfo profileInfo;
        MatchaTransfer matchaTransfer = this.transfer;
        if (matchaTransfer != null && (transactor = matchaTransfer.getTransactor()) != null && (profileInfo = transactor.getProfileInfo()) != null) {
            String profilePictureUrl = profileInfo.getProfilePictureUrl();
            if (profilePictureUrl != null && !StringsKt.isBlank(profilePictureUrl)) {
                return true;
            }
            String username = profileInfo.getUsername();
            if (username != null && !StringsKt.isBlank(username)) {
                return true;
            }
            MatchaMemo memo = this.transfer.getMemo();
            String content = memo != null ? memo.getContent() : null;
            if (content != null && !StringsKt.isBlank(content)) {
                return true;
            }
        }
        return false;
    }

    public final boolean getCanBlock() {
        MatchaUser transactor;
        ApiMatchaIdentifier identifier;
        MatchaTransfer matchaTransfer = this.transfer;
        return (matchaTransfer == null || (transactor = matchaTransfer.getTransactor()) == null || (identifier = transactor.getIdentifier()) == null || identifier.getType() != ApiMatchaIdentifier2.USER_UUID) ? false : true;
    }

    public final boolean isBlocked() {
        MatchaUser transactor;
        MatchaProfileInfo profileInfo;
        MatchaTransfer matchaTransfer = this.transfer;
        return (matchaTransfer == null || (transactor = matchaTransfer.getTransactor()) == null || (profileInfo = transactor.getProfileInfo()) == null || !profileInfo.isBlocked()) ? false : true;
    }
}
