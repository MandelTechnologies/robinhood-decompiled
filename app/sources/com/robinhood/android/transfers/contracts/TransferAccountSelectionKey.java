package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountSelectionKey.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001[B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010H\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010J\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003JÐ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020PJ\u0013\u0010Q\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020PHÖ\u0001J\t\u0010U\u001a\u00020\u000bHÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020PR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0015\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0018\u00103R\u0019\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "accounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "selectedAccountId", "", "isSinkAccountFixed", "", "transactingAccount", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "fromRetirementContributionsV2", "matchRateTypeOverride", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "useUkAddAccountExperience", "isOutgoingWire", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "isForFirstPartyOutgoingWires", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "goldApyMinDepositContext", "Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;", "guidedTransfersData", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;ZLcom/robinhood/android/models/retirement/api/MatchBreakdownType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/api/bonfire/wires/RecipientType;Ljava/lang/Boolean;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;)V", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getDirection", "()Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "getAccounts", "()Ljava/util/List;", "getSelectedAccountId", "()Ljava/lang/String;", "()Z", "getTransactingAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getFromRetirementContributionsV2", "getMatchRateTypeOverride", "()Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "getUseUkAddAccountExperience", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOutgoingWireRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getGoldApyMinDepositContext", "()Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;", "getGuidedTransfersData", "()Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;ZLcom/robinhood/android/models/retirement/api/MatchBreakdownType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/models/api/bonfire/wires/RecipientType;Ljava/lang/Boolean;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;)Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "GuidedTransfersData", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TransferAccountSelectionKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TransferAccountSelectionKey> CREATOR = new Creator();
    private final List<TransferAccount> accounts;
    private final TransferAccountDirection direction;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final Context eventContext;
    private final boolean fromRetirementContributionsV2;
    private final GoldApyBoostMinDepositContext goldApyMinDepositContext;
    private final GuidedTransfersData guidedTransfersData;
    private final IraContributionType iraContributionType;
    private final Boolean isForFirstPartyOutgoingWires;
    private final Boolean isOutgoingWire;
    private final boolean isSinkAccountFixed;
    private final ApiRetirementMatchResponse3 matchRateTypeOverride;
    private final RecipientType outgoingWireRecipientType;
    private final String selectedAccountId;
    private final TransferAccount transactingAccount;
    private final Boolean useUkAddAccountExperience;

    /* compiled from: TransferAccountSelectionKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransferAccountSelectionKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final TransferAccountSelectionKey createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            ApiRetirementMatchResponse3 apiRetirementMatchResponse3;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
            TransferAccountDirection transferAccountDirectionValueOf = TransferAccountDirection.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(TransferAccountSelectionKey.class.getClassLoader()));
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = TransferAccountSelectionKey.class;
                z = true;
            } else {
                cls = TransferAccountSelectionKey.class;
                z = false;
            }
            TransferAccount transferAccount = (TransferAccount) parcel.readParcelable(cls.getClassLoader());
            IraContributionType iraContributionTypeValueOf = parcel.readInt() == 0 ? null : IraContributionType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                apiRetirementMatchResponse3 = null;
                z2 = true;
            } else {
                apiRetirementMatchResponse3 = null;
                z2 = false;
            }
            return new TransferAccountSelectionKey(entryPointValueOf, transferAccountDirectionValueOf, arrayList, string2, z, transferAccount, iraContributionTypeValueOf, z2, parcel.readInt() == 0 ? apiRetirementMatchResponse3 : ApiRetirementMatchResponse3.valueOf(parcel.readString()), parcel.readInt() == 0 ? apiRetirementMatchResponse3 : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? apiRetirementMatchResponse3 : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? apiRetirementMatchResponse3 : RecipientType.valueOf(parcel.readString()), parcel.readInt() == 0 ? apiRetirementMatchResponse3 : Boolean.valueOf(parcel.readInt() != 0), (Context) parcel.readSerializable(), (GoldApyBoostMinDepositContext) (parcel.readInt() == 0 ? apiRetirementMatchResponse3 : GoldApyBoostMinDepositContext.CREATOR.createFromParcel(parcel)), (GuidedTransfersData) (parcel.readInt() == 0 ? apiRetirementMatchResponse3 : GuidedTransfersData.CREATOR.createFromParcel(parcel)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferAccountSelectionKey[] newArray(int i) {
            return new TransferAccountSelectionKey[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getUseUkAddAccountExperience() {
        return this.useUkAddAccountExperience;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsOutgoingWire() {
        return this.isOutgoingWire;
    }

    /* renamed from: component12, reason: from getter */
    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getIsForFirstPartyOutgoingWires() {
        return this.isForFirstPartyOutgoingWires;
    }

    /* renamed from: component14, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    /* renamed from: component15, reason: from getter */
    public final GoldApyBoostMinDepositContext getGoldApyMinDepositContext() {
        return this.goldApyMinDepositContext;
    }

    /* renamed from: component16, reason: from getter */
    public final GuidedTransfersData getGuidedTransfersData() {
        return this.guidedTransfersData;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    public final List<TransferAccount> component3() {
        return this.accounts;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSinkAccountFixed() {
        return this.isSinkAccountFixed;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getTransactingAccount() {
        return this.transactingAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getFromRetirementContributionsV2() {
        return this.fromRetirementContributionsV2;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
        return this.matchRateTypeOverride;
    }

    public final TransferAccountSelectionKey copy(MAXTransferContext.EntryPoint entryPoint, TransferAccountDirection direction, List<TransferAccount> accounts2, String selectedAccountId, boolean isSinkAccountFixed, TransferAccount transactingAccount, IraContributionType iraContributionType, boolean fromRetirementContributionsV2, ApiRetirementMatchResponse3 matchRateTypeOverride, Boolean useUkAddAccountExperience, Boolean isOutgoingWire, RecipientType outgoingWireRecipientType, Boolean isForFirstPartyOutgoingWires, Context eventContext, GoldApyBoostMinDepositContext goldApyMinDepositContext, GuidedTransfersData guidedTransfersData) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        return new TransferAccountSelectionKey(entryPoint, direction, accounts2, selectedAccountId, isSinkAccountFixed, transactingAccount, iraContributionType, fromRetirementContributionsV2, matchRateTypeOverride, useUkAddAccountExperience, isOutgoingWire, outgoingWireRecipientType, isForFirstPartyOutgoingWires, eventContext, goldApyMinDepositContext, guidedTransfersData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferAccountSelectionKey)) {
            return false;
        }
        TransferAccountSelectionKey transferAccountSelectionKey = (TransferAccountSelectionKey) other;
        return this.entryPoint == transferAccountSelectionKey.entryPoint && this.direction == transferAccountSelectionKey.direction && Intrinsics.areEqual(this.accounts, transferAccountSelectionKey.accounts) && Intrinsics.areEqual(this.selectedAccountId, transferAccountSelectionKey.selectedAccountId) && this.isSinkAccountFixed == transferAccountSelectionKey.isSinkAccountFixed && Intrinsics.areEqual(this.transactingAccount, transferAccountSelectionKey.transactingAccount) && this.iraContributionType == transferAccountSelectionKey.iraContributionType && this.fromRetirementContributionsV2 == transferAccountSelectionKey.fromRetirementContributionsV2 && this.matchRateTypeOverride == transferAccountSelectionKey.matchRateTypeOverride && Intrinsics.areEqual(this.useUkAddAccountExperience, transferAccountSelectionKey.useUkAddAccountExperience) && Intrinsics.areEqual(this.isOutgoingWire, transferAccountSelectionKey.isOutgoingWire) && this.outgoingWireRecipientType == transferAccountSelectionKey.outgoingWireRecipientType && Intrinsics.areEqual(this.isForFirstPartyOutgoingWires, transferAccountSelectionKey.isForFirstPartyOutgoingWires) && Intrinsics.areEqual(this.eventContext, transferAccountSelectionKey.eventContext) && Intrinsics.areEqual(this.goldApyMinDepositContext, transferAccountSelectionKey.goldApyMinDepositContext) && Intrinsics.areEqual(this.guidedTransfersData, transferAccountSelectionKey.guidedTransfersData);
    }

    public int hashCode() {
        int iHashCode = ((((this.entryPoint.hashCode() * 31) + this.direction.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        String str = this.selectedAccountId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSinkAccountFixed)) * 31;
        TransferAccount transferAccount = this.transactingAccount;
        int iHashCode3 = (iHashCode2 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        IraContributionType iraContributionType = this.iraContributionType;
        int iHashCode4 = (((iHashCode3 + (iraContributionType == null ? 0 : iraContributionType.hashCode())) * 31) + Boolean.hashCode(this.fromRetirementContributionsV2)) * 31;
        ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.matchRateTypeOverride;
        int iHashCode5 = (iHashCode4 + (apiRetirementMatchResponse3 == null ? 0 : apiRetirementMatchResponse3.hashCode())) * 31;
        Boolean bool = this.useUkAddAccountExperience;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOutgoingWire;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RecipientType recipientType = this.outgoingWireRecipientType;
        int iHashCode8 = (iHashCode7 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
        Boolean bool3 = this.isForFirstPartyOutgoingWires;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Context context = this.eventContext;
        int iHashCode10 = (iHashCode9 + (context == null ? 0 : context.hashCode())) * 31;
        GoldApyBoostMinDepositContext goldApyBoostMinDepositContext = this.goldApyMinDepositContext;
        int iHashCode11 = (iHashCode10 + (goldApyBoostMinDepositContext == null ? 0 : goldApyBoostMinDepositContext.hashCode())) * 31;
        GuidedTransfersData guidedTransfersData = this.guidedTransfersData;
        return iHashCode11 + (guidedTransfersData != null ? guidedTransfersData.hashCode() : 0);
    }

    public String toString() {
        return "TransferAccountSelectionKey(entryPoint=" + this.entryPoint + ", direction=" + this.direction + ", accounts=" + this.accounts + ", selectedAccountId=" + this.selectedAccountId + ", isSinkAccountFixed=" + this.isSinkAccountFixed + ", transactingAccount=" + this.transactingAccount + ", iraContributionType=" + this.iraContributionType + ", fromRetirementContributionsV2=" + this.fromRetirementContributionsV2 + ", matchRateTypeOverride=" + this.matchRateTypeOverride + ", useUkAddAccountExperience=" + this.useUkAddAccountExperience + ", isOutgoingWire=" + this.isOutgoingWire + ", outgoingWireRecipientType=" + this.outgoingWireRecipientType + ", isForFirstPartyOutgoingWires=" + this.isForFirstPartyOutgoingWires + ", eventContext=" + this.eventContext + ", goldApyMinDepositContext=" + this.goldApyMinDepositContext + ", guidedTransfersData=" + this.guidedTransfersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entryPoint.name());
        dest.writeString(this.direction.name());
        List<TransferAccount> list = this.accounts;
        dest.writeInt(list.size());
        Iterator<TransferAccount> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.selectedAccountId);
        dest.writeInt(this.isSinkAccountFixed ? 1 : 0);
        dest.writeParcelable(this.transactingAccount, flags);
        IraContributionType iraContributionType = this.iraContributionType;
        if (iraContributionType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iraContributionType.name());
        }
        dest.writeInt(this.fromRetirementContributionsV2 ? 1 : 0);
        ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.matchRateTypeOverride;
        if (apiRetirementMatchResponse3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(apiRetirementMatchResponse3.name());
        }
        Boolean bool = this.useUkAddAccountExperience;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isOutgoingWire;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        RecipientType recipientType = this.outgoingWireRecipientType;
        if (recipientType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(recipientType.name());
        }
        Boolean bool3 = this.isForFirstPartyOutgoingWires;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.eventContext);
        GoldApyBoostMinDepositContext goldApyBoostMinDepositContext = this.goldApyMinDepositContext;
        if (goldApyBoostMinDepositContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            goldApyBoostMinDepositContext.writeToParcel(dest, flags);
        }
        GuidedTransfersData guidedTransfersData = this.guidedTransfersData;
        if (guidedTransfersData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            guidedTransfersData.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public TransferAccountSelectionKey(MAXTransferContext.EntryPoint entryPoint, TransferAccountDirection direction, List<TransferAccount> accounts2, String str, boolean z, TransferAccount transferAccount, IraContributionType iraContributionType, boolean z2, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, Boolean bool, Boolean bool2, RecipientType recipientType, Boolean bool3, Context context, GoldApyBoostMinDepositContext goldApyBoostMinDepositContext, GuidedTransfersData guidedTransfersData) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        this.entryPoint = entryPoint;
        this.direction = direction;
        this.accounts = accounts2;
        this.selectedAccountId = str;
        this.isSinkAccountFixed = z;
        this.transactingAccount = transferAccount;
        this.iraContributionType = iraContributionType;
        this.fromRetirementContributionsV2 = z2;
        this.matchRateTypeOverride = apiRetirementMatchResponse3;
        this.useUkAddAccountExperience = bool;
        this.isOutgoingWire = bool2;
        this.outgoingWireRecipientType = recipientType;
        this.isForFirstPartyOutgoingWires = bool3;
        this.eventContext = context;
        this.goldApyMinDepositContext = goldApyBoostMinDepositContext;
        this.guidedTransfersData = guidedTransfersData;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferAccountSelectionKey(com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint r20, com.robinhood.android.transfers.contracts.TransferAccountDirection r21, java.util.List r22, java.lang.String r23, boolean r24, com.robinhood.models.p320db.bonfire.TransferAccount r25, com.robinhood.models.api.bonfire.IraContributionType r26, boolean r27, com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3 r28, java.lang.Boolean r29, java.lang.Boolean r30, com.robinhood.models.api.bonfire.wires.RecipientType r31, java.lang.Boolean r32, com.robinhood.rosetta.eventlogging.Context r33, com.robinhood.android.transfers.contracts.GoldApyBoostMinDepositContext r34, com.robinhood.android.transfers.contracts.TransferAccountSelectionKey.GuidedTransfersData r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto La
            com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint r1 = com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED
            r3 = r1
            goto Lc
        La:
            r3 = r20
        Lc:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L13
            r11 = r2
            goto L15
        L13:
            r11 = r28
        L15:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L1b
            r12 = r2
            goto L1d
        L1b:
            r12 = r29
        L1d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L23
            r13 = r2
            goto L25
        L23:
            r13 = r30
        L25:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2b
            r14 = r2
            goto L2d
        L2b:
            r14 = r31
        L2d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L33
            r15 = r2
            goto L35
        L33:
            r15 = r32
        L35:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L3c
            r16 = r2
            goto L3e
        L3c:
            r16 = r33
        L3e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L45
            r17 = r2
            goto L47
        L45:
            r17 = r34
        L47:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L60
            r18 = r2
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r2 = r19
            goto L72
        L60:
            r18 = r35
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
        L72:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.contracts.TransferAccountSelectionKey.<init>(com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint, com.robinhood.android.transfers.contracts.TransferAccountDirection, java.util.List, java.lang.String, boolean, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.api.bonfire.IraContributionType, boolean, com.robinhood.android.models.retirement.api.MatchBreakdownType, java.lang.Boolean, java.lang.Boolean, com.robinhood.models.api.bonfire.wires.RecipientType, java.lang.Boolean, com.robinhood.rosetta.eventlogging.Context, com.robinhood.android.transfers.contracts.GoldApyBoostMinDepositContext, com.robinhood.android.transfers.contracts.TransferAccountSelectionKey$GuidedTransfersData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }

    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final boolean isSinkAccountFixed() {
        return this.isSinkAccountFixed;
    }

    public final TransferAccount getTransactingAccount() {
        return this.transactingAccount;
    }

    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public final boolean getFromRetirementContributionsV2() {
        return this.fromRetirementContributionsV2;
    }

    public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
        return this.matchRateTypeOverride;
    }

    public final Boolean getUseUkAddAccountExperience() {
        return this.useUkAddAccountExperience;
    }

    public final Boolean isOutgoingWire() {
        return this.isOutgoingWire;
    }

    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    public final Boolean isForFirstPartyOutgoingWires() {
        return this.isForFirstPartyOutgoingWires;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final GoldApyBoostMinDepositContext getGoldApyMinDepositContext() {
        return this.goldApyMinDepositContext;
    }

    public final GuidedTransfersData getGuidedTransfersData() {
        return this.guidedTransfersData;
    }

    /* compiled from: TransferAccountSelectionKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;", "Landroid/os/Parcelable;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;)V", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final /* data */ class GuidedTransfersData implements Parcelable {
        public static final Parcelable.Creator<GuidedTransfersData> CREATOR = new Creator();
        private final TransferDirection transferDirection;

        /* compiled from: TransferAccountSelectionKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GuidedTransfersData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GuidedTransfersData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GuidedTransfersData(TransferDirection.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GuidedTransfersData[] newArray(int i) {
                return new GuidedTransfersData[i];
            }
        }

        public static /* synthetic */ GuidedTransfersData copy$default(GuidedTransfersData guidedTransfersData, TransferDirection transferDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                transferDirection = guidedTransfersData.transferDirection;
            }
            return guidedTransfersData.copy(transferDirection);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        public final GuidedTransfersData copy(TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            return new GuidedTransfersData(transferDirection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GuidedTransfersData) && this.transferDirection == ((GuidedTransfersData) other).transferDirection;
        }

        public int hashCode() {
            return this.transferDirection.hashCode();
        }

        public String toString() {
            return "GuidedTransfersData(transferDirection=" + this.transferDirection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.transferDirection.name());
        }

        public GuidedTransfersData(TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            this.transferDirection = transferDirection;
        }

        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }
    }
}
