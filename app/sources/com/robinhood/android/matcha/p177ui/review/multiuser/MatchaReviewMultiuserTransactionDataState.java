package com.robinhood.android.matcha.p177ui.review.multiuser;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionFragment;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MatchaReviewMultiuserTransactionDataState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0001[B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010,\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010U\u001a\u00020\u000eHÆ\u0003J\u0089\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001J\u0013\u0010W\u001a\u00020\u000e2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020@HÖ\u0001J\t\u0010Z\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010$R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u00104\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u001c\u00106\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u00108\u001a\u0004\b9\u0010\"R\u001c\u0010:\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u00108\u001a\u0004\b<\u0010\"R\u0011\u0010=\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010A\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0011\u0010C\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010E\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010G\u001a\u00020H¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;", "", "amount", "Lcom/robinhood/models/util/Money;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", MemoInputActivity.EXTRA_MEMO, "", "showLoading", "", "transferId", "Ljava/util/UUID;", "selectedTransferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "requestId", "incentivesSummary", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "isMatchaIncentivesExperimentMember", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/util/List;Ljava/lang/String;ZLjava/util/UUID;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/util/UUID;Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getTransactors", "()Ljava/util/List;", "getMemo", "()Ljava/lang/String;", "getShowLoading", "()Z", "getTransferId", "()Ljava/util/UUID;", "getSelectedTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getRequestId", "getIncentivesSummary", "()Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "hasInsufficientFunds", "toolbarSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "avatars", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "getAvatars", "amountText", "getAmountText", "totalAmountText", "getTotalAmountText$annotations", "()V", "getTotalAmountText", "usersText", "getUsersText$annotations", "getUsersText", ErrorBundle.SUMMARY_ENTRY, "getSummary", "firstTimeTransactorCount", "", "summaryFirstTimeSuffix", "getSummaryFirstTimeSuffix", "memoTitle", "getMemoTitle", "memoSubtitle", "getMemoSubtitle", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "getMemoState", "()Lcom/robinhood/android/matcha/ui/review/MemoState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class MatchaReviewMultiuserTransactionDataState {
    private final Money amount;
    private final String amountText;
    private final List<ProfileAvatarState> avatars;
    private final Direction direction;
    private final int firstTimeTransactorCount;
    private final MatchaIncentivesSummary incentivesSummary;
    private final boolean isMatchaIncentivesExperimentMember;
    private final String memo;
    private final MatchaReviewTransactionViewState3 memoState;
    private final StringResource memoSubtitle;
    private final StringResource memoTitle;
    private final UUID requestId;
    private final TransferAccount selectedTransferAccount;
    private final boolean showLoading;
    private final SourceOfFunds sourceOfFunds;
    private final StringResource summary;
    private final StringResource summaryFirstTimeSuffix;
    private final StringResource toolbarSubtitle;
    private final String totalAmountText;
    private final List<Transactor> transactors;
    private final UUID transferId;
    private final String usersText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaReviewMultiuserTransactionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ MatchaReviewMultiuserTransactionDataState copy$default(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Money money, SourceOfFunds sourceOfFunds, Direction direction, List list, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = matchaReviewMultiuserTransactionDataState.amount;
        }
        if ((i & 2) != 0) {
            sourceOfFunds = matchaReviewMultiuserTransactionDataState.sourceOfFunds;
        }
        if ((i & 4) != 0) {
            direction = matchaReviewMultiuserTransactionDataState.direction;
        }
        if ((i & 8) != 0) {
            list = matchaReviewMultiuserTransactionDataState.transactors;
        }
        if ((i & 16) != 0) {
            str = matchaReviewMultiuserTransactionDataState.memo;
        }
        if ((i & 32) != 0) {
            z = matchaReviewMultiuserTransactionDataState.showLoading;
        }
        if ((i & 64) != 0) {
            uuid = matchaReviewMultiuserTransactionDataState.transferId;
        }
        if ((i & 128) != 0) {
            transferAccount = matchaReviewMultiuserTransactionDataState.selectedTransferAccount;
        }
        if ((i & 256) != 0) {
            uuid2 = matchaReviewMultiuserTransactionDataState.requestId;
        }
        if ((i & 512) != 0) {
            matchaIncentivesSummary = matchaReviewMultiuserTransactionDataState.incentivesSummary;
        }
        if ((i & 1024) != 0) {
            z2 = matchaReviewMultiuserTransactionDataState.isMatchaIncentivesExperimentMember;
        }
        MatchaIncentivesSummary matchaIncentivesSummary2 = matchaIncentivesSummary;
        boolean z3 = z2;
        TransferAccount transferAccount2 = transferAccount;
        UUID uuid3 = uuid2;
        boolean z4 = z;
        UUID uuid4 = uuid;
        String str2 = str;
        Direction direction2 = direction;
        return matchaReviewMultiuserTransactionDataState.copy(money, sourceOfFunds, direction2, list, str2, z4, uuid4, transferAccount2, uuid3, matchaIncentivesSummary2, z3);
    }

    public static /* synthetic */ void getTotalAmountText$annotations() {
    }

    public static /* synthetic */ void getUsersText$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    /* renamed from: component2, reason: from getter */
    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* renamed from: component3, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final List<Transactor> component4() {
        return this.transactors;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferAccount getSelectedTransferAccount() {
        return this.selectedTransferAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getRequestId() {
        return this.requestId;
    }

    public final MatchaReviewMultiuserTransactionDataState copy(Money amount, SourceOfFunds sourceOfFunds, Direction direction, List<? extends Transactor> transactors, String memo, boolean showLoading, UUID transferId, TransferAccount selectedTransferAccount, UUID requestId, MatchaIncentivesSummary incentivesSummary, boolean isMatchaIncentivesExperimentMember) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        return new MatchaReviewMultiuserTransactionDataState(amount, sourceOfFunds, direction, transactors, memo, showLoading, transferId, selectedTransferAccount, requestId, incentivesSummary, isMatchaIncentivesExperimentMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaReviewMultiuserTransactionDataState)) {
            return false;
        }
        MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState = (MatchaReviewMultiuserTransactionDataState) other;
        return Intrinsics.areEqual(this.amount, matchaReviewMultiuserTransactionDataState.amount) && Intrinsics.areEqual(this.sourceOfFunds, matchaReviewMultiuserTransactionDataState.sourceOfFunds) && this.direction == matchaReviewMultiuserTransactionDataState.direction && Intrinsics.areEqual(this.transactors, matchaReviewMultiuserTransactionDataState.transactors) && Intrinsics.areEqual(this.memo, matchaReviewMultiuserTransactionDataState.memo) && this.showLoading == matchaReviewMultiuserTransactionDataState.showLoading && Intrinsics.areEqual(this.transferId, matchaReviewMultiuserTransactionDataState.transferId) && Intrinsics.areEqual(this.selectedTransferAccount, matchaReviewMultiuserTransactionDataState.selectedTransferAccount) && Intrinsics.areEqual(this.requestId, matchaReviewMultiuserTransactionDataState.requestId) && Intrinsics.areEqual(this.incentivesSummary, matchaReviewMultiuserTransactionDataState.incentivesSummary) && this.isMatchaIncentivesExperimentMember == matchaReviewMultiuserTransactionDataState.isMatchaIncentivesExperimentMember;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        int iHashCode2 = (((((iHashCode + (sourceOfFunds == null ? 0 : sourceOfFunds.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.transactors.hashCode()) * 31;
        String str = this.memo;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showLoading)) * 31;
        UUID uuid = this.transferId;
        int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        TransferAccount transferAccount = this.selectedTransferAccount;
        int iHashCode5 = (iHashCode4 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        UUID uuid2 = this.requestId;
        int iHashCode6 = (iHashCode5 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        MatchaIncentivesSummary matchaIncentivesSummary = this.incentivesSummary;
        return ((iHashCode6 + (matchaIncentivesSummary != null ? matchaIncentivesSummary.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMatchaIncentivesExperimentMember);
    }

    public String toString() {
        return "MatchaReviewMultiuserTransactionDataState(amount=" + this.amount + ", sourceOfFunds=" + this.sourceOfFunds + ", direction=" + this.direction + ", transactors=" + this.transactors + ", memo=" + this.memo + ", showLoading=" + this.showLoading + ", transferId=" + this.transferId + ", selectedTransferAccount=" + this.selectedTransferAccount + ", requestId=" + this.requestId + ", incentivesSummary=" + this.incentivesSummary + ", isMatchaIncentivesExperimentMember=" + this.isMatchaIncentivesExperimentMember + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaReviewMultiuserTransactionDataState(Money amount, SourceOfFunds sourceOfFunds, Direction direction, List<? extends Transactor> transactors, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2) {
        StringResource stringResourceInvoke;
        List<ProfileAvatarState> listPlus;
        int i;
        int i2;
        MatchaReviewTransactionViewState3 memo;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        this.amount = amount;
        this.sourceOfFunds = sourceOfFunds;
        this.direction = direction;
        this.transactors = transactors;
        this.memo = str;
        this.showLoading = z;
        this.transferId = uuid;
        this.selectedTransferAccount = transferAccount;
        this.requestId = uuid2;
        this.incentivesSummary = matchaIncentivesSummary;
        this.isMatchaIncentivesExperimentMember = z2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        StringResource stringResourceInvoke2 = null;
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C21284R.plurals.matcha_search_toolbar_subtitle, transactors.size()), Integer.valueOf(transactors.size()));
        } else if ((sourceOfFunds != null ? sourceOfFunds.getLabel() : null) != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String label = sourceOfFunds.getLabel();
            Intrinsics.checkNotNull(label);
            stringResourceInvoke = companion.invoke(label);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_detail_account, new Object[0]);
        }
        this.toolbarSubtitle = stringResourceInvoke;
        if (transactors.size() > 3) {
            List listTake = CollectionsKt.take(transactors, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it = listTake.iterator();
            while (it.hasNext()) {
                arrayList.add(ProfileAvatars.getAvatar((Transactor) it.next()));
            }
            listPlus = CollectionsKt.plus((Collection<? extends ProfileAvatarState.Text>) arrayList, new ProfileAvatarState.Text("+" + (this.transactors.size() - 3)));
        } else {
            List listTake2 = CollectionsKt.take(transactors, 3);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake2, 10));
            Iterator it2 = listTake2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ProfileAvatars.getAvatar((Transactor) it2.next()));
            }
            listPlus = arrayList2;
        }
        this.avatars = listPlus;
        BigDecimal decimalValue = this.amount.getDecimalValue();
        this.amountText = (BigDecimals7.isInteger(decimalValue) ? Formats.getWholeNumberAmountFormat() : Formats.getAmountFormat()).format(decimalValue);
        BigDecimal bigDecimalTimes = BigDecimals7.times(this.amount.getDecimalValue(), this.transactors.size());
        this.totalAmountText = (BigDecimals7.isInteger(bigDecimalTimes) ? Formats.getWholeNumberAmountFormat() : Formats.getAmountFormat()).format(bigDecimalTimes);
        List<Transactor> list = this.transactors;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Transactor transactor = (Transactor) obj;
            arrayList3.add(i4 == CollectionsKt.getLastIndex(this.transactors) ? "and " + transactor.getDisplayName() : transactor.getDisplayName());
            i4 = i5;
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((String) next) + ", " + ((String) it3.next());
        }
        String str2 = (String) next;
        this.usersText = str2;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i6 == 1) {
            i = C21284R.string.matcha_transfer_multiuser_review_summary;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C21284R.string.matcha_request_multiuser_review_summary;
        }
        this.summary = companion2.invoke(i, this.totalAmountText, Integer.valueOf(this.transactors.size()), this.amountText, str2);
        List<Transactor> list2 = this.transactors;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            Transactor transactor2 = (Transactor) obj2;
            if (!(transactor2 instanceof Transactor.User) || !((Transactor.User) transactor2).isConnection()) {
                arrayList4.add(obj2);
            }
        }
        int size = arrayList4.size();
        this.firstTimeTransactorCount = size;
        if (size == this.transactors.size()) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_all_first_time_suffix, new Object[0]);
        } else if (size > 0) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_some_first_time_suffix, new Object[0]);
        }
        this.summaryFirstTimeSuffix = stringResourceInvoke2;
        StringResource.Companion companion3 = StringResource.INSTANCE;
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i7 == 1) {
            i2 = C21284R.string.matcha_transfer_memo_multiuser_title;
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C21284R.string.matcha_request_memo_multiuser_title;
        }
        this.memoTitle = companion3.invoke(i2, Integer.valueOf(this.transactors.size()));
        this.memoSubtitle = companion3.invoke(C21284R.string.matcha_memo_multiuser_subtitle, this.amountText);
        if (this.requestId == null) {
            String str3 = this.memo;
            memo = (str3 == null || StringsKt.isBlank(str3)) ? MatchaReviewTransactionViewState3.AddMemo.INSTANCE : new MatchaReviewTransactionViewState3.Memo(this.memo, true);
        } else {
            String str4 = this.memo;
            memo = new MatchaReviewTransactionViewState3.Memo(str4 == null ? "" : str4, false);
        }
        this.memoState = memo;
    }

    public /* synthetic */ MatchaReviewMultiuserTransactionDataState(Money money, SourceOfFunds sourceOfFunds, Direction direction, List list, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, sourceOfFunds, direction, list, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : uuid, (i & 128) != 0 ? null : transferAccount, (i & 256) != 0 ? null : uuid2, (i & 512) != 0 ? null : matchaIncentivesSummary, (i & 1024) != 0 ? false : z2);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final List<Transactor> getTransactors() {
        return this.transactors;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final TransferAccount getSelectedTransferAccount() {
        return this.selectedTransferAccount;
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final boolean isMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    public final boolean hasInsufficientFunds(TransferAccount selectedTransferAccount) {
        return this.direction == Direction.SEND && selectedTransferAccount != null && selectedTransferAccount.getWithdrawableCash() != null && BigDecimals7.times(this.amount.getDecimalValue(), this.transactors.size()).compareTo(selectedTransferAccount.getWithdrawableCash()) > 0;
    }

    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final List<ProfileAvatarState> getAvatars() {
        return this.avatars;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final String getTotalAmountText() {
        return this.totalAmountText;
    }

    public final String getUsersText() {
        return this.usersText;
    }

    public final StringResource getSummary() {
        return this.summary;
    }

    public final StringResource getSummaryFirstTimeSuffix() {
        return this.summaryFirstTimeSuffix;
    }

    public final StringResource getMemoTitle() {
        return this.memoTitle;
    }

    public final StringResource getMemoSubtitle() {
        return this.memoSubtitle;
    }

    public final MatchaReviewTransactionViewState3 getMemoState() {
        return this.memoState;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState$Companion;", "", "<init>", "()V", "initial", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchaReviewMultiuserTransactionDataState initial(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            MatchaReviewMultiuserTransactionDuxo.Companion companion = MatchaReviewMultiuserTransactionDuxo.Companion;
            Money amount = ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getAmount();
            Direction direction = ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getDirection();
            List<Transactor> transactors = ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getTransactors();
            return new MatchaReviewMultiuserTransactionDataState(amount, ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getSourceOfFunds(), direction, transactors, ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getMemo(), false, (UUID) savedStateHandle.get("transferId"), null, ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs(savedStateHandle)).getRequestId(), null, false, 1696, null);
        }
    }
}
