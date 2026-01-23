package com.robinhood.android.matcha.p177ui.search.confirm;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactDuxo;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactFragment;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmContactDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010B\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b2\u0010(R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0013\u00105\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0011\u00107\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b8\u0010.¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;", "", "amount", "Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "showLoading", "", "transferId", "Ljava/util/UUID;", "requestId", "incentiveAmount", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/android/matcha/models/ui/Transactor;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;ZLjava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getShowLoading", "()Z", "getTransferId", "()Ljava/util/UUID;", "getRequestId", "getIncentiveAmount", "()Ljava/math/BigDecimal;", "hasInsufficientFunds", "selectedTransferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transactorName", "", "getTransactorName", "()Ljava/lang/String;", "amountText", "getAmountText", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "subtitleText", "getSubtitleText", "identifierSubtitle", "getIdentifierSubtitle", "disclosureText", "getDisclosureText", "disclosureLinkText", "getDisclosureLinkText", "confirmText", "getConfirmText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConfirmContactDataState {
    private final Money amount;
    private final Direction direction;
    private final BigDecimal incentiveAmount;
    private final UUID requestId;
    private final boolean showLoading;
    private final SourceOfFunds sourceOfFunds;
    private final Transactor transactor;
    private final String transactorName;
    private final UUID transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConfirmContactDataState.kt */
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

    public static /* synthetic */ ConfirmContactDataState copy$default(ConfirmContactDataState confirmContactDataState, Money money, Direction direction, Transactor transactor, SourceOfFunds sourceOfFunds, boolean z, UUID uuid, UUID uuid2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            money = confirmContactDataState.amount;
        }
        if ((i & 2) != 0) {
            direction = confirmContactDataState.direction;
        }
        if ((i & 4) != 0) {
            transactor = confirmContactDataState.transactor;
        }
        if ((i & 8) != 0) {
            sourceOfFunds = confirmContactDataState.sourceOfFunds;
        }
        if ((i & 16) != 0) {
            z = confirmContactDataState.showLoading;
        }
        if ((i & 32) != 0) {
            uuid = confirmContactDataState.transferId;
        }
        if ((i & 64) != 0) {
            uuid2 = confirmContactDataState.requestId;
        }
        if ((i & 128) != 0) {
            bigDecimal = confirmContactDataState.incentiveAmount;
        }
        UUID uuid3 = uuid2;
        BigDecimal bigDecimal2 = bigDecimal;
        boolean z2 = z;
        UUID uuid4 = uuid;
        return confirmContactDataState.copy(money, direction, transactor, sourceOfFunds, z2, uuid4, uuid3, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final Transactor getTransactor() {
        return this.transactor;
    }

    /* renamed from: component4, reason: from getter */
    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getRequestId() {
        return this.requestId;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final ConfirmContactDataState copy(Money amount, Direction direction, Transactor transactor, SourceOfFunds sourceOfFunds, boolean showLoading, UUID transferId, UUID requestId, BigDecimal incentiveAmount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        return new ConfirmContactDataState(amount, direction, transactor, sourceOfFunds, showLoading, transferId, requestId, incentiveAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmContactDataState)) {
            return false;
        }
        ConfirmContactDataState confirmContactDataState = (ConfirmContactDataState) other;
        return Intrinsics.areEqual(this.amount, confirmContactDataState.amount) && this.direction == confirmContactDataState.direction && Intrinsics.areEqual(this.transactor, confirmContactDataState.transactor) && Intrinsics.areEqual(this.sourceOfFunds, confirmContactDataState.sourceOfFunds) && this.showLoading == confirmContactDataState.showLoading && Intrinsics.areEqual(this.transferId, confirmContactDataState.transferId) && Intrinsics.areEqual(this.requestId, confirmContactDataState.requestId) && Intrinsics.areEqual(this.incentiveAmount, confirmContactDataState.incentiveAmount);
    }

    public int hashCode() {
        int iHashCode = ((((this.amount.hashCode() * 31) + this.direction.hashCode()) * 31) + this.transactor.hashCode()) * 31;
        SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        int iHashCode2 = (((iHashCode + (sourceOfFunds == null ? 0 : sourceOfFunds.hashCode())) * 31) + Boolean.hashCode(this.showLoading)) * 31;
        UUID uuid = this.transferId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.requestId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        BigDecimal bigDecimal = this.incentiveAmount;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmContactDataState(amount=" + this.amount + ", direction=" + this.direction + ", transactor=" + this.transactor + ", sourceOfFunds=" + this.sourceOfFunds + ", showLoading=" + this.showLoading + ", transferId=" + this.transferId + ", requestId=" + this.requestId + ", incentiveAmount=" + this.incentiveAmount + ")";
    }

    public ConfirmContactDataState(Money amount, Direction direction, Transactor transactor, SourceOfFunds sourceOfFunds, boolean z, UUID uuid, UUID uuid2, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        this.amount = amount;
        this.direction = direction;
        this.transactor = transactor;
        this.sourceOfFunds = sourceOfFunds;
        this.showLoading = z;
        this.transferId = uuid;
        this.requestId = uuid2;
        this.incentiveAmount = bigDecimal;
        this.transactorName = transactor.getDisplayName();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ConfirmContactDataState(com.robinhood.models.util.Money r12, com.robinhood.android.matcha.p177ui.models.Direction r13, com.robinhood.android.matcha.models.p176ui.Transactor r14, com.robinhood.android.models.matcha.api.SourceOfFunds r15, boolean r16, java.util.UUID r17, java.util.UUID r18, java.math.BigDecimal r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r16
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r17
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r18
        L1c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L27
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2 = r11
            goto L2e
        L27:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
        L2e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactDataState.<init>(com.robinhood.models.util.Money, com.robinhood.android.matcha.ui.models.Direction, com.robinhood.android.matcha.models.ui.Transactor, com.robinhood.android.models.matcha.api.SourceOfFunds, boolean, java.util.UUID, java.util.UUID, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Transactor getTransactor() {
        return this.transactor;
    }

    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final BigDecimal getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final boolean hasInsufficientFunds(TransferAccount selectedTransferAccount) {
        return this.direction == Direction.SEND && selectedTransferAccount != null && selectedTransferAccount.getWithdrawableCash() != null && this.amount.getDecimalValue().compareTo(selectedTransferAccount.getWithdrawableCash()) > 0;
    }

    public final String getTransactorName() {
        return this.transactorName;
    }

    public final String getAmountText() {
        NumberFormatter amountFormat;
        BigDecimal decimalValue = this.amount.getDecimalValue();
        if (BigDecimals7.isInteger(decimalValue)) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        return amountFormat.format(decimalValue);
    }

    public final StringResource getTitleText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_pay_title, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_request_title, getAmountText());
    }

    public final StringResource getSubtitleText() {
        BigDecimal bigDecimal = this.incentiveAmount;
        if (bigDecimal == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_pay_subtitle, Formats.getWholeNumberAmountFormat().format(bigDecimal), this.transactorName);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_request_subtitle, Formats.getWholeNumberAmountFormat().format(bigDecimal), this.transactorName);
    }

    public final String getIdentifierSubtitle() {
        String contactName;
        String contactName2;
        Transactor transactor = this.transactor;
        if ((transactor instanceof Transactor.Email) && (contactName2 = ((Transactor.Email) transactor).getContactName()) != null && contactName2.length() != 0) {
            return this.transactor.getIdentifier();
        }
        Transactor transactor2 = this.transactor;
        if (!(transactor2 instanceof Transactor.Phone) || (contactName = ((Transactor.Phone) transactor2).getContactName()) == null || contactName.length() == 0) {
            return null;
        }
        return ((Transactor.Phone) this.transactor).getPhoneNumber();
    }

    public final StringResource getDisclosureText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{companion.invoke(C21284R.string.matcha_confirm_contact_pay_disclosure, getAmountText(), this.transactorName), companion.invoke(C21284R.string.matcha_confirm_transactor_disclosure, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_request_disclosure, getAmountText(), this.transactorName);
    }

    public final StringResource getDisclosureLinkText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_protect_against_scams, new Object[0]);
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getConfirmText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_pay_confirm, this.transactorName);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_confirm_contact_request_confirm, getAmountText());
    }

    /* compiled from: ConfirmContactDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState$Companion;", "", "<init>", "()V", "initial", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfirmContactDataState initial(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            ConfirmContactDuxo.Companion companion = ConfirmContactDuxo.Companion;
            return new ConfirmContactDataState(((ConfirmContactFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((ConfirmContactFragment.Args) companion.getArgs(savedStateHandle)).getDirection(), ((ConfirmContactFragment.Args) companion.getArgs(savedStateHandle)).getTransactor(), ((ConfirmContactFragment.Args) companion.getArgs(savedStateHandle)).getSourceOfFunds(), false, null, null, ((ConfirmContactFragment.Args) companion.getArgs(savedStateHandle)).getIncentiveAmount(), 112, null);
        }
    }
}
