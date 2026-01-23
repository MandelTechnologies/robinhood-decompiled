package com.robinhood.android.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringGenericCreationFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0001bB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0010\u00106\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b9\u00104J\u0010\u0010:\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b:\u0010,J\u0010\u0010;\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b;\u0010,J\u0010\u0010<\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b<\u0010,J\u0012\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u0010,J\u0010\u0010@\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b@\u0010,JÄ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bC\u00104J\u0010\u0010D\u001a\u00020 HÖ\u0001¢\u0006\u0004\bD\u0010&J\u001a\u0010G\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\b\u0007\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u00104R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bV\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bX\u00107R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bY\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bZ\u00104R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\b[\u0010,R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\b\\\u0010,R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\b]\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\b_\u0010>R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\b`\u0010,R\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\ba\u0010,¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "investmentTarget", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "entryPoint", "", "isFromHook", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/util/Money;", "amount", "", "source", "useFragmentResult", "Lcom/robinhood/android/recurring/contracts/ForceIntro;", "forceIntro", "skipDirectDepositRelationshipSelection", "accountNumber", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "assetCategory", "userSweepEligible", "userSweepEnabled", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Ljava/lang/String;ZLcom/robinhood/android/recurring/contracts/ForceIntro;ZLjava/lang/String;ZZZLcom/robinhood/recurring/models/RecurringInvestmentCategory;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "component2", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "component3", "()Z", "component4", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component5", "()Lj$/time/LocalDate;", "component6", "()Lcom/robinhood/models/util/Money;", "component7", "()Ljava/lang/String;", "component8", "component9", "()Lcom/robinhood/android/recurring/contracts/ForceIntro;", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "component16", "component17", "copy", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Ljava/lang/String;ZLcom/robinhood/android/recurring/contracts/ForceIntro;ZLjava/lang/String;ZZZLcom/robinhood/recurring/models/RecurringInvestmentCategory;ZZ)Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getInvestmentTarget", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getEntryPoint", "Z", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "Lcom/robinhood/models/util/Money;", "getAmount", "Ljava/lang/String;", "getSource", "getUseFragmentResult", "Lcom/robinhood/android/recurring/contracts/ForceIntro;", "getForceIntro", "getSkipDirectDepositRelationshipSelection", "getAccountNumber", "getBrokerageCashOptionEnabled", "getRetirementCashOptionEnabled", "getInvestmentOptionEnabled", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "getAssetCategory", "getUserSweepEligible", "getUserSweepEnabled", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecurringGenericCreationFragmentKey implements FragmentKey {
    private final String accountNumber;
    private final Money amount;
    private final RecurringInvestmentCategory assetCategory;
    private final boolean brokerageCashOptionEnabled;
    private final RecurringContext.EntryPoint entryPoint;
    private final ForceIntro forceIntro;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final boolean investmentOptionEnabled;
    private final InvestmentTarget investmentTarget;
    private final boolean isFromHook;
    private final boolean retirementCashOptionEnabled;
    private final boolean skipDirectDepositRelationshipSelection;
    private final String source;
    private final LocalDate startDate;
    private final boolean useFragmentResult;
    private final boolean userSweepEligible;
    private final boolean userSweepEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<RecurringGenericCreationFragmentKey> CREATOR = new Creator();

    /* compiled from: RecurringGenericCreationFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RecurringGenericCreationFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringGenericCreationFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            ApiInvestmentSchedule.Frequency frequency;
            Money money;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InvestmentTarget investmentTarget = (InvestmentTarget) parcel.readParcelable(RecurringGenericCreationFragmentKey.class.getClassLoader());
            RecurringContext.EntryPoint entryPointValueOf = RecurringContext.EntryPoint.valueOf(parcel.readString());
            boolean z8 = parcel.readInt() != 0;
            ApiInvestmentSchedule.Frequency frequencyValueOf = parcel.readInt() == 0 ? null : ApiInvestmentSchedule.Frequency.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            Money money2 = (Money) parcel.readParcelable(RecurringGenericCreationFragmentKey.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = false;
                frequency = frequencyValueOf;
                money = money2;
                z2 = true;
            } else {
                z = false;
                frequency = frequencyValueOf;
                money = money2;
                z2 = false;
            }
            ForceIntro forceIntroValueOf = ForceIntro.valueOf(parcel.readString());
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z3 = z;
                z = true;
            } else {
                z3 = z;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
                z3 = true;
            } else {
                z4 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = true;
                z9 = z4;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
                z4 = z5;
            } else {
                z6 = z4;
            }
            RecurringInvestmentCategory recurringInvestmentCategory = (RecurringInvestmentCategory) parcel.readParcelable(RecurringGenericCreationFragmentKey.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z7 = z6;
                z6 = z5;
            } else {
                z7 = z6;
            }
            if (parcel.readInt() != 0) {
                z7 = z5;
            }
            return new RecurringGenericCreationFragmentKey(investmentTarget, entryPointValueOf, z8, frequency, localDate, money, string2, z2, forceIntroValueOf, z, string3, z3, z9, z4, recurringInvestmentCategory, z6, z7);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringGenericCreationFragmentKey[] newArray(int i) {
            return new RecurringGenericCreationFragmentKey[i];
        }
    }

    public static /* synthetic */ RecurringGenericCreationFragmentKey copy$default(RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey, InvestmentTarget investmentTarget, RecurringContext.EntryPoint entryPoint, boolean z, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, String str, boolean z2, ForceIntro forceIntro, boolean z3, String str2, boolean z4, boolean z5, boolean z6, RecurringInvestmentCategory recurringInvestmentCategory, boolean z7, boolean z8, int i, Object obj) {
        boolean z9;
        boolean z10;
        InvestmentTarget investmentTarget2;
        RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey2;
        RecurringInvestmentCategory recurringInvestmentCategory2;
        RecurringContext.EntryPoint entryPoint2;
        boolean z11;
        ApiInvestmentSchedule.Frequency frequency2;
        LocalDate localDate2;
        Money money2;
        String str3;
        boolean z12;
        ForceIntro forceIntro2;
        boolean z13;
        String str4;
        boolean z14;
        boolean z15;
        boolean z16;
        InvestmentTarget investmentTarget3 = (i & 1) != 0 ? recurringGenericCreationFragmentKey.investmentTarget : investmentTarget;
        RecurringContext.EntryPoint entryPoint3 = (i & 2) != 0 ? recurringGenericCreationFragmentKey.entryPoint : entryPoint;
        boolean z17 = (i & 4) != 0 ? recurringGenericCreationFragmentKey.isFromHook : z;
        ApiInvestmentSchedule.Frequency frequency3 = (i & 8) != 0 ? recurringGenericCreationFragmentKey.frequency : frequency;
        LocalDate localDate3 = (i & 16) != 0 ? recurringGenericCreationFragmentKey.startDate : localDate;
        Money money3 = (i & 32) != 0 ? recurringGenericCreationFragmentKey.amount : money;
        String str5 = (i & 64) != 0 ? recurringGenericCreationFragmentKey.source : str;
        boolean z18 = (i & 128) != 0 ? recurringGenericCreationFragmentKey.useFragmentResult : z2;
        ForceIntro forceIntro3 = (i & 256) != 0 ? recurringGenericCreationFragmentKey.forceIntro : forceIntro;
        boolean z19 = (i & 512) != 0 ? recurringGenericCreationFragmentKey.skipDirectDepositRelationshipSelection : z3;
        String str6 = (i & 1024) != 0 ? recurringGenericCreationFragmentKey.accountNumber : str2;
        boolean z20 = (i & 2048) != 0 ? recurringGenericCreationFragmentKey.brokerageCashOptionEnabled : z4;
        boolean z21 = (i & 4096) != 0 ? recurringGenericCreationFragmentKey.retirementCashOptionEnabled : z5;
        boolean z22 = (i & 8192) != 0 ? recurringGenericCreationFragmentKey.investmentOptionEnabled : z6;
        InvestmentTarget investmentTarget4 = investmentTarget3;
        RecurringInvestmentCategory recurringInvestmentCategory3 = (i & 16384) != 0 ? recurringGenericCreationFragmentKey.assetCategory : recurringInvestmentCategory;
        boolean z23 = (i & 32768) != 0 ? recurringGenericCreationFragmentKey.userSweepEligible : z7;
        if ((i & 65536) != 0) {
            z10 = z23;
            z9 = recurringGenericCreationFragmentKey.userSweepEnabled;
            recurringInvestmentCategory2 = recurringInvestmentCategory3;
            entryPoint2 = entryPoint3;
            z11 = z17;
            frequency2 = frequency3;
            localDate2 = localDate3;
            money2 = money3;
            str3 = str5;
            z12 = z18;
            forceIntro2 = forceIntro3;
            z13 = z19;
            str4 = str6;
            z14 = z20;
            z15 = z21;
            z16 = z22;
            investmentTarget2 = investmentTarget4;
            recurringGenericCreationFragmentKey2 = recurringGenericCreationFragmentKey;
        } else {
            z9 = z8;
            z10 = z23;
            investmentTarget2 = investmentTarget4;
            recurringGenericCreationFragmentKey2 = recurringGenericCreationFragmentKey;
            recurringInvestmentCategory2 = recurringInvestmentCategory3;
            entryPoint2 = entryPoint3;
            z11 = z17;
            frequency2 = frequency3;
            localDate2 = localDate3;
            money2 = money3;
            str3 = str5;
            z12 = z18;
            forceIntro2 = forceIntro3;
            z13 = z19;
            str4 = str6;
            z14 = z20;
            z15 = z21;
            z16 = z22;
        }
        return recurringGenericCreationFragmentKey2.copy(investmentTarget2, entryPoint2, z11, frequency2, localDate2, money2, str3, z12, forceIntro2, z13, str4, z14, z15, z16, recurringInvestmentCategory2, z10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSkipDirectDepositRelationshipSelection() {
        return this.skipDirectDepositRelationshipSelection;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getBrokerageCashOptionEnabled() {
        return this.brokerageCashOptionEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getRetirementCashOptionEnabled() {
        return this.retirementCashOptionEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getInvestmentOptionEnabled() {
        return this.investmentOptionEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final RecurringInvestmentCategory getAssetCategory() {
        return this.assetCategory;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getUserSweepEligible() {
        return this.userSweepEligible;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getUserSweepEnabled() {
        return this.userSweepEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final RecurringContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFromHook() {
        return this.isFromHook;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUseFragmentResult() {
        return this.useFragmentResult;
    }

    /* renamed from: component9, reason: from getter */
    public final ForceIntro getForceIntro() {
        return this.forceIntro;
    }

    public final RecurringGenericCreationFragmentKey copy(InvestmentTarget investmentTarget, RecurringContext.EntryPoint entryPoint, boolean isFromHook, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount, String source, boolean useFragmentResult, ForceIntro forceIntro, boolean skipDirectDepositRelationshipSelection, String accountNumber, boolean brokerageCashOptionEnabled, boolean retirementCashOptionEnabled, boolean investmentOptionEnabled, RecurringInvestmentCategory assetCategory, boolean userSweepEligible, boolean userSweepEnabled) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(forceIntro, "forceIntro");
        return new RecurringGenericCreationFragmentKey(investmentTarget, entryPoint, isFromHook, frequency, startDate, amount, source, useFragmentResult, forceIntro, skipDirectDepositRelationshipSelection, accountNumber, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, assetCategory, userSweepEligible, userSweepEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringGenericCreationFragmentKey)) {
            return false;
        }
        RecurringGenericCreationFragmentKey recurringGenericCreationFragmentKey = (RecurringGenericCreationFragmentKey) other;
        return Intrinsics.areEqual(this.investmentTarget, recurringGenericCreationFragmentKey.investmentTarget) && this.entryPoint == recurringGenericCreationFragmentKey.entryPoint && this.isFromHook == recurringGenericCreationFragmentKey.isFromHook && this.frequency == recurringGenericCreationFragmentKey.frequency && Intrinsics.areEqual(this.startDate, recurringGenericCreationFragmentKey.startDate) && Intrinsics.areEqual(this.amount, recurringGenericCreationFragmentKey.amount) && Intrinsics.areEqual(this.source, recurringGenericCreationFragmentKey.source) && this.useFragmentResult == recurringGenericCreationFragmentKey.useFragmentResult && this.forceIntro == recurringGenericCreationFragmentKey.forceIntro && this.skipDirectDepositRelationshipSelection == recurringGenericCreationFragmentKey.skipDirectDepositRelationshipSelection && Intrinsics.areEqual(this.accountNumber, recurringGenericCreationFragmentKey.accountNumber) && this.brokerageCashOptionEnabled == recurringGenericCreationFragmentKey.brokerageCashOptionEnabled && this.retirementCashOptionEnabled == recurringGenericCreationFragmentKey.retirementCashOptionEnabled && this.investmentOptionEnabled == recurringGenericCreationFragmentKey.investmentOptionEnabled && Intrinsics.areEqual(this.assetCategory, recurringGenericCreationFragmentKey.assetCategory) && this.userSweepEligible == recurringGenericCreationFragmentKey.userSweepEligible && this.userSweepEnabled == recurringGenericCreationFragmentKey.userSweepEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((this.investmentTarget.hashCode() * 31) + this.entryPoint.hashCode()) * 31) + Boolean.hashCode(this.isFromHook)) * 31;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        int iHashCode2 = (iHashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Money money = this.amount;
        int iHashCode4 = (((((((((iHashCode3 + (money == null ? 0 : money.hashCode())) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.useFragmentResult)) * 31) + this.forceIntro.hashCode()) * 31) + Boolean.hashCode(this.skipDirectDepositRelationshipSelection)) * 31;
        String str = this.accountNumber;
        int iHashCode5 = (((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.brokerageCashOptionEnabled)) * 31) + Boolean.hashCode(this.retirementCashOptionEnabled)) * 31) + Boolean.hashCode(this.investmentOptionEnabled)) * 31;
        RecurringInvestmentCategory recurringInvestmentCategory = this.assetCategory;
        return ((((iHashCode5 + (recurringInvestmentCategory != null ? recurringInvestmentCategory.hashCode() : 0)) * 31) + Boolean.hashCode(this.userSweepEligible)) * 31) + Boolean.hashCode(this.userSweepEnabled);
    }

    public String toString() {
        return "RecurringGenericCreationFragmentKey(investmentTarget=" + this.investmentTarget + ", entryPoint=" + this.entryPoint + ", isFromHook=" + this.isFromHook + ", frequency=" + this.frequency + ", startDate=" + this.startDate + ", amount=" + this.amount + ", source=" + this.source + ", useFragmentResult=" + this.useFragmentResult + ", forceIntro=" + this.forceIntro + ", skipDirectDepositRelationshipSelection=" + this.skipDirectDepositRelationshipSelection + ", accountNumber=" + this.accountNumber + ", brokerageCashOptionEnabled=" + this.brokerageCashOptionEnabled + ", retirementCashOptionEnabled=" + this.retirementCashOptionEnabled + ", investmentOptionEnabled=" + this.investmentOptionEnabled + ", assetCategory=" + this.assetCategory + ", userSweepEligible=" + this.userSweepEligible + ", userSweepEnabled=" + this.userSweepEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.investmentTarget, flags);
        dest.writeString(this.entryPoint.name());
        dest.writeInt(this.isFromHook ? 1 : 0);
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(frequency.name());
        }
        dest.writeSerializable(this.startDate);
        dest.writeParcelable(this.amount, flags);
        dest.writeString(this.source);
        dest.writeInt(this.useFragmentResult ? 1 : 0);
        dest.writeString(this.forceIntro.name());
        dest.writeInt(this.skipDirectDepositRelationshipSelection ? 1 : 0);
        dest.writeString(this.accountNumber);
        dest.writeInt(this.brokerageCashOptionEnabled ? 1 : 0);
        dest.writeInt(this.retirementCashOptionEnabled ? 1 : 0);
        dest.writeInt(this.investmentOptionEnabled ? 1 : 0);
        dest.writeParcelable(this.assetCategory, flags);
        dest.writeInt(this.userSweepEligible ? 1 : 0);
        dest.writeInt(this.userSweepEnabled ? 1 : 0);
    }

    public RecurringGenericCreationFragmentKey(InvestmentTarget investmentTarget, RecurringContext.EntryPoint entryPoint, boolean z, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, String source, boolean z2, ForceIntro forceIntro, boolean z3, String str, boolean z4, boolean z5, boolean z6, RecurringInvestmentCategory recurringInvestmentCategory, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(forceIntro, "forceIntro");
        this.investmentTarget = investmentTarget;
        this.entryPoint = entryPoint;
        this.isFromHook = z;
        this.frequency = frequency;
        this.startDate = localDate;
        this.amount = money;
        this.source = source;
        this.useFragmentResult = z2;
        this.forceIntro = forceIntro;
        this.skipDirectDepositRelationshipSelection = z3;
        this.accountNumber = str;
        this.brokerageCashOptionEnabled = z4;
        this.retirementCashOptionEnabled = z5;
        this.investmentOptionEnabled = z6;
        this.assetCategory = recurringInvestmentCategory;
        this.userSweepEligible = z7;
        this.userSweepEnabled = z8;
    }

    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    public final RecurringContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean isFromHook() {
        return this.isFromHook;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public /* synthetic */ RecurringGenericCreationFragmentKey(InvestmentTarget investmentTarget, RecurringContext.EntryPoint entryPoint, boolean z, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, String str, boolean z2, ForceIntro forceIntro, boolean z3, String str2, boolean z4, boolean z5, boolean z6, RecurringInvestmentCategory recurringInvestmentCategory, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentTarget, entryPoint, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : frequency, (i & 16) != 0 ? null : localDate, (i & 32) != 0 ? null : money, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? ForceIntro.FALSE : forceIntro, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? true : z6, (i & 16384) != 0 ? null : recurringInvestmentCategory, (32768 & i) != 0 ? false : z7, (i & 65536) != 0 ? false : z8);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getUseFragmentResult() {
        return this.useFragmentResult;
    }

    public final ForceIntro getForceIntro() {
        return this.forceIntro;
    }

    public final boolean getSkipDirectDepositRelationshipSelection() {
        return this.skipDirectDepositRelationshipSelection;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getBrokerageCashOptionEnabled() {
        return this.brokerageCashOptionEnabled;
    }

    public final boolean getRetirementCashOptionEnabled() {
        return this.retirementCashOptionEnabled;
    }

    public final boolean getInvestmentOptionEnabled() {
        return this.investmentOptionEnabled;
    }

    public final RecurringInvestmentCategory getAssetCategory() {
        return this.assetCategory;
    }

    public final boolean getUserSweepEligible() {
        return this.userSweepEligible;
    }

    public final boolean getUserSweepEnabled() {
        return this.userSweepEnabled;
    }

    /* compiled from: RecurringGenericCreationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey$Companion;", "", "<init>", "()V", "getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey", "Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "skipDirectDepositRelationshipSelection", "", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "userSweepEligible", "userSweepEnabled", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringGenericCreationFragmentKey getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey(boolean skipDirectDepositRelationshipSelection, boolean brokerageCashOptionEnabled, boolean retirementCashOptionEnabled, boolean investmentOptionEnabled, boolean userSweepEligible, boolean userSweepEnabled) {
            return new RecurringGenericCreationFragmentKey(new InvestmentTarget(null, null, ApiAssetType.EQUITY), RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, false, ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK, null, null, "paycheckRecurringInvestmentsWithDirectDepositsOnboarding", false, null, skipDirectDepositRelationshipSelection, null, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, null, userSweepEligible, userSweepEnabled, 17844, null);
        }
    }
}
