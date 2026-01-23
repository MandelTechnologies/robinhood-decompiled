package com.robinhood.android.matcha.p177ui.amount;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ImageSpan;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.sourceoffunds.TransferAccounts3;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaAmountInputViewState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u001f\u0010E\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\fHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\fHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010,Jº\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u000208HÖ\u0001J\t\u0010P\u001a\u00020QHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R'\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0018\u0010,R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u00107\u001a\u0004\u0018\u0001088G¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0011\u0010?\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputViewState;", "", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "amount", "Ljava/math/BigDecimal;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "inputChars", "", "animateInput", "Lcom/robinhood/udf/UiEvent;", "", "continueEvent", "Lkotlin/Pair;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "showInsufficientFundsError", "sourceOfFunds", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferAccounts", "restrictionAlert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "isMatchaMultiuserExperimentMember", "", "<init>", "(Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/math/BigDecimal;Ljava/util/List;[CLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;)V", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getAmount", "()Ljava/math/BigDecimal;", "getTransactors", "()Ljava/util/List;", "getInputChars", "()[C", "getAnimateInput", "()Lcom/robinhood/udf/UiEvent;", "getContinueEvent", "getShowInsufficientFundsError", "getSourceOfFunds", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getTransferAccounts", "getRestrictionAlert", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToolbarSubtitle", "", "resources", "Landroid/content/res/Resources;", "endDrawable", "Landroid/graphics/drawable/Drawable;", "profileAvatarStates", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "getProfileAvatarStates", "inputErrorText", "", "getInputErrorText", "()Ljava/lang/Integer;", "hasInsufficientFunds", "getHasInsufficientFunds", "()Z", "isContinueButtonEnabled", "isAddTransactorIconVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/math/BigDecimal;Ljava/util/List;[CLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/lang/Boolean;)Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputViewState;", "equals", "other", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class MatchaAmountInputViewState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final UiEvent<Unit> animateInput;
    private final UiEvent<Tuples2<Money, SourceOfFunds>> continueEvent;
    private final Direction direction;
    private final char[] inputChars;
    private final Boolean isMatchaMultiuserExperimentMember;
    private final List<ProfileAvatarState> profileAvatarStates;
    private final UiEvent<GenericAlert> restrictionAlert;
    private final UiEvent<Unit> showInsufficientFundsError;
    private final TransferAccount sourceOfFunds;
    private final List<Transactor> transactors;
    private final List<TransferAccount> transferAccounts;

    /* compiled from: MatchaAmountInputViewState.kt */
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

    public static /* synthetic */ MatchaAmountInputViewState copy$default(MatchaAmountInputViewState matchaAmountInputViewState, Direction direction, BigDecimal bigDecimal, List list, char[] cArr, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, TransferAccount transferAccount, List list2, UiEvent uiEvent4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            direction = matchaAmountInputViewState.direction;
        }
        if ((i & 2) != 0) {
            bigDecimal = matchaAmountInputViewState.amount;
        }
        if ((i & 4) != 0) {
            list = matchaAmountInputViewState.transactors;
        }
        if ((i & 8) != 0) {
            cArr = matchaAmountInputViewState.inputChars;
        }
        if ((i & 16) != 0) {
            uiEvent = matchaAmountInputViewState.animateInput;
        }
        if ((i & 32) != 0) {
            uiEvent2 = matchaAmountInputViewState.continueEvent;
        }
        if ((i & 64) != 0) {
            uiEvent3 = matchaAmountInputViewState.showInsufficientFundsError;
        }
        if ((i & 128) != 0) {
            transferAccount = matchaAmountInputViewState.sourceOfFunds;
        }
        if ((i & 256) != 0) {
            list2 = matchaAmountInputViewState.transferAccounts;
        }
        if ((i & 512) != 0) {
            uiEvent4 = matchaAmountInputViewState.restrictionAlert;
        }
        if ((i & 1024) != 0) {
            bool = matchaAmountInputViewState.isMatchaMultiuserExperimentMember;
        }
        UiEvent uiEvent5 = uiEvent4;
        Boolean bool2 = bool;
        TransferAccount transferAccount2 = transferAccount;
        List list3 = list2;
        UiEvent uiEvent6 = uiEvent2;
        UiEvent uiEvent7 = uiEvent3;
        UiEvent uiEvent8 = uiEvent;
        List list4 = list;
        return matchaAmountInputViewState.copy(direction, bigDecimal, list4, cArr, uiEvent8, uiEvent6, uiEvent7, transferAccount2, list3, uiEvent5, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final UiEvent<GenericAlert> component10() {
        return this.restrictionAlert;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsMatchaMultiuserExperimentMember() {
        return this.isMatchaMultiuserExperimentMember;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<Transactor> component3() {
        return this.transactors;
    }

    /* renamed from: component4, reason: from getter */
    public final char[] getInputChars() {
        return this.inputChars;
    }

    public final UiEvent<Unit> component5() {
        return this.animateInput;
    }

    public final UiEvent<Tuples2<Money, SourceOfFunds>> component6() {
        return this.continueEvent;
    }

    public final UiEvent<Unit> component7() {
        return this.showInsufficientFundsError;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferAccount getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final List<TransferAccount> component9() {
        return this.transferAccounts;
    }

    public final MatchaAmountInputViewState copy(Direction direction, BigDecimal amount, List<? extends Transactor> transactors, char[] inputChars, UiEvent<Unit> animateInput, UiEvent<Tuples2<Money, SourceOfFunds>> continueEvent, UiEvent<Unit> showInsufficientFundsError, TransferAccount sourceOfFunds, List<TransferAccount> transferAccounts, UiEvent<GenericAlert> restrictionAlert, Boolean isMatchaMultiuserExperimentMember) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        return new MatchaAmountInputViewState(direction, amount, transactors, inputChars, animateInput, continueEvent, showInsufficientFundsError, sourceOfFunds, transferAccounts, restrictionAlert, isMatchaMultiuserExperimentMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaAmountInputViewState)) {
            return false;
        }
        MatchaAmountInputViewState matchaAmountInputViewState = (MatchaAmountInputViewState) other;
        return this.direction == matchaAmountInputViewState.direction && Intrinsics.areEqual(this.amount, matchaAmountInputViewState.amount) && Intrinsics.areEqual(this.transactors, matchaAmountInputViewState.transactors) && Intrinsics.areEqual(this.inputChars, matchaAmountInputViewState.inputChars) && Intrinsics.areEqual(this.animateInput, matchaAmountInputViewState.animateInput) && Intrinsics.areEqual(this.continueEvent, matchaAmountInputViewState.continueEvent) && Intrinsics.areEqual(this.showInsufficientFundsError, matchaAmountInputViewState.showInsufficientFundsError) && Intrinsics.areEqual(this.sourceOfFunds, matchaAmountInputViewState.sourceOfFunds) && Intrinsics.areEqual(this.transferAccounts, matchaAmountInputViewState.transferAccounts) && Intrinsics.areEqual(this.restrictionAlert, matchaAmountInputViewState.restrictionAlert) && Intrinsics.areEqual(this.isMatchaMultiuserExperimentMember, matchaAmountInputViewState.isMatchaMultiuserExperimentMember);
    }

    public int hashCode() {
        int iHashCode = ((((((this.direction.hashCode() * 31) + this.amount.hashCode()) * 31) + this.transactors.hashCode()) * 31) + Arrays.hashCode(this.inputChars)) * 31;
        UiEvent<Unit> uiEvent = this.animateInput;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Tuples2<Money, SourceOfFunds>> uiEvent2 = this.continueEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.showInsufficientFundsError;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        TransferAccount transferAccount = this.sourceOfFunds;
        int iHashCode5 = (((iHashCode4 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31) + this.transferAccounts.hashCode()) * 31;
        UiEvent<GenericAlert> uiEvent4 = this.restrictionAlert;
        int iHashCode6 = (iHashCode5 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        Boolean bool = this.isMatchaMultiuserExperimentMember;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "MatchaAmountInputViewState(direction=" + this.direction + ", amount=" + this.amount + ", transactors=" + this.transactors + ", inputChars=" + Arrays.toString(this.inputChars) + ", animateInput=" + this.animateInput + ", continueEvent=" + this.continueEvent + ", showInsufficientFundsError=" + this.showInsufficientFundsError + ", sourceOfFunds=" + this.sourceOfFunds + ", transferAccounts=" + this.transferAccounts + ", restrictionAlert=" + this.restrictionAlert + ", isMatchaMultiuserExperimentMember=" + this.isMatchaMultiuserExperimentMember + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaAmountInputViewState(Direction direction, BigDecimal amount, List<? extends Transactor> transactors, char[] inputChars, UiEvent<Unit> uiEvent, UiEvent<Tuples2<Money, SourceOfFunds>> uiEvent2, UiEvent<Unit> uiEvent3, TransferAccount transferAccount, List<TransferAccount> transferAccounts, UiEvent<GenericAlert> uiEvent4, Boolean bool) {
        List<ProfileAvatarState> listPlus;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        this.direction = direction;
        this.amount = amount;
        this.transactors = transactors;
        this.inputChars = inputChars;
        this.animateInput = uiEvent;
        this.continueEvent = uiEvent2;
        this.showInsufficientFundsError = uiEvent3;
        this.sourceOfFunds = transferAccount;
        this.transferAccounts = transferAccounts;
        this.restrictionAlert = uiEvent4;
        this.isMatchaMultiuserExperimentMember = bool;
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
        this.profileAvatarStates = listPlus;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MatchaAmountInputViewState(Direction direction, BigDecimal bigDecimal, List list, char[] cArr, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, TransferAccount transferAccount, List list2, UiEvent uiEvent4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        char[] charArray;
        BigDecimal bigDecimal2 = (i & 2) != 0 ? BigDecimal.ZERO : bigDecimal;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 8) != 0) {
            charArray = "$0".toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        } else {
            charArray = cArr;
        }
        this(direction, bigDecimal2, listEmptyList, charArray, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2, (i & 64) != 0 ? null : uiEvent3, (i & 128) != 0 ? null : transferAccount, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : uiEvent4, (i & 1024) != 0 ? null : bool);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<Transactor> getTransactors() {
        return this.transactors;
    }

    public final char[] getInputChars() {
        return this.inputChars;
    }

    public final UiEvent<Unit> getAnimateInput() {
        return this.animateInput;
    }

    public final UiEvent<Tuples2<Money, SourceOfFunds>> getContinueEvent() {
        return this.continueEvent;
    }

    public final UiEvent<Unit> getShowInsufficientFundsError() {
        return this.showInsufficientFundsError;
    }

    public final TransferAccount getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final List<TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final UiEvent<GenericAlert> getRestrictionAlert() {
        return this.restrictionAlert;
    }

    public final Boolean isMatchaMultiuserExperimentMember() {
        return this.isMatchaMultiuserExperimentMember;
    }

    public final CharSequence getToolbarSubtitle(Resources resources, Drawable endDrawable) {
        String sourceOfFundsLabel;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(endDrawable, "endDrawable");
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.transactors.size() == 1) {
                return ((Transactor) CollectionsKt.first((List) this.transactors)).getDisplayName();
            }
            if (this.transactors.isEmpty()) {
                return null;
            }
            return resources.getQuantityString(C21284R.plurals.matcha_search_toolbar_subtitle, this.transactors.size(), Integer.valueOf(this.transactors.size()));
        }
        TransferAccount transferAccount = this.sourceOfFunds;
        if (transferAccount == null || (sourceOfFundsLabel = TransferAccounts3.getSourceOfFundsLabel(transferAccount)) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (sourceOfFundsLabel + PlaceholderUtils.XXShortPlaceholderText));
        ImageSpan imageSpan = new ImageSpan(endDrawable, Build.VERSION.SDK_INT < 29 ? 0 : 2);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(' ');
        spannableStringBuilder.setSpan(imageSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    public final List<ProfileAvatarState> getProfileAvatarStates() {
        return this.profileAvatarStates;
    }

    public final Integer getInputErrorText() {
        int i;
        if (this.amount.compareTo(BigDecimal.ZERO) <= 0 || this.amount.compareTo(BigDecimal.ONE) >= 0) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i2 == 1) {
            i = C21284R.string.matcha_transfer_minimum_error;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C21284R.string.matcha_request_minimum_error;
        }
        return Integer.valueOf(i);
    }

    public final boolean getHasInsufficientFunds() {
        TransferAccount transferAccount;
        return this.direction == Direction.SEND && (transferAccount = this.sourceOfFunds) != null && transferAccount.getWithdrawableCash() != null && this.amount.compareTo(this.sourceOfFunds.getWithdrawableCash()) > 0;
    }

    public final boolean isContinueButtonEnabled() {
        return this.amount.compareTo(BigDecimal.ONE) >= 0;
    }

    public final boolean isAddTransactorIconVisible() {
        return Intrinsics.areEqual(this.isMatchaMultiuserExperimentMember, Boolean.TRUE) && this.transactors.size() == 1;
    }
}
