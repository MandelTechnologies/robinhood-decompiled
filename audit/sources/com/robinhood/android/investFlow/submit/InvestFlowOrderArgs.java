package com.robinhood.android.investFlow.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboViewState;
import com.robinhood.android.investFlow.nbbosingle.InvestFlowSingleNbboViewState;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowOrderArgs.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003-./Bc\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0014\u0010\u000e\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u0018R\u001b\u0010(\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u001b\u0010+\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019\u0082\u0001\u0003012¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "isCrypto", "", "accountNumber", "", "refId", "Ljava/util/UUID;", "sourceId", "skipForceSuitability", "viewState", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;ZLjava/lang/String;Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getAssetAllocations", "()Ljava/util/List;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getRefId", "()Ljava/util/UUID;", "setRefId", "(Ljava/util/UUID;)V", "getSourceId", "getSkipForceSuitability", "getViewState", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmitViewState;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "instrumentIds", "getInstrumentIds", "isOneTimeMultiple", "isOneTimeMultiple$delegate", "Lkotlin/Lazy;", "isRecurring", "isRecurring$delegate", "OneTimeSingle", "OneTimeMultiple", "Recurring", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$OneTimeMultiple;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$OneTimeSingle;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$Recurring;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class InvestFlowOrderArgs implements Parcelable {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Money amount;
    private final List<ApiAssetAllocation> assetAllocations;
    private final boolean isCrypto;

    /* renamed from: isOneTimeMultiple$delegate, reason: from kotlin metadata */
    private final Lazy isOneTimeMultiple;

    /* renamed from: isRecurring$delegate, reason: from kotlin metadata */
    private final Lazy isRecurring;
    private final InvestFlowLoggingParams loggingParams;
    private UUID refId;
    private final boolean skipForceSuitability;
    private final UUID sourceId;
    private final InvestFlowOrderArgs2 viewState;

    public /* synthetic */ InvestFlowOrderArgs(Money money, List list, boolean z, String str, UUID uuid, UUID uuid2, boolean z2, InvestFlowOrderArgs2 investFlowOrderArgs2, InvestFlowLoggingParams investFlowLoggingParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, list, z, str, uuid, uuid2, z2, investFlowOrderArgs2, investFlowLoggingParams);
    }

    private InvestFlowOrderArgs(Money money, List<ApiAssetAllocation> list, boolean z, String str, UUID uuid, UUID uuid2, boolean z2, InvestFlowOrderArgs2 investFlowOrderArgs2, InvestFlowLoggingParams investFlowLoggingParams) {
        this.amount = money;
        this.assetAllocations = list;
        this.isCrypto = z;
        this.accountNumber = str;
        this.refId = uuid;
        this.sourceId = uuid2;
        this.skipForceSuitability = z2;
        this.viewState = investFlowOrderArgs2;
        this.loggingParams = investFlowLoggingParams;
        this.isOneTimeMultiple = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderArgs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InvestFlowOrderArgs.isOneTimeMultiple_delegate$lambda$1(this.f$0));
            }
        });
        this.isRecurring = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderArgs$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InvestFlowOrderArgs.isRecurring_delegate$lambda$2(this.f$0));
            }
        });
    }

    public Money getAmount() {
        return this.amount;
    }

    public List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    /* renamed from: isCrypto, reason: from getter */
    public boolean getIsCrypto() {
        return this.isCrypto;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ InvestFlowOrderArgs(Money money, List list, boolean z, String str, UUID uuid, UUID uuid2, boolean z2, InvestFlowOrderArgs2 investFlowOrderArgs2, InvestFlowLoggingParams investFlowLoggingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, list, (i & 4) != 0 ? false : z, str, (i & 16) != 0 ? UUID.randomUUID() : uuid, (i & 32) != 0 ? null : uuid2, (i & 64) != 0 ? false : z2, investFlowOrderArgs2, investFlowLoggingParams, null);
    }

    public UUID getRefId() {
        return this.refId;
    }

    public void setRefId(UUID uuid) {
        this.refId = uuid;
    }

    public UUID getSourceId() {
        return this.sourceId;
    }

    public boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    public final InvestFlowOrderArgs2 getViewState() {
        return this.viewState;
    }

    public InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final List<UUID> getInstrumentIds() {
        List<ApiAssetAllocation> assetAllocations = getAssetAllocations();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = assetAllocations.iterator();
        while (it.hasNext()) {
            UUID asset_id = ((ApiAssetAllocation) it.next()).getAsset().getAsset_id();
            if (asset_id != null) {
                arrayList.add(asset_id);
            }
        }
        return arrayList;
    }

    public final boolean isOneTimeMultiple() {
        return ((Boolean) this.isOneTimeMultiple.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isOneTimeMultiple_delegate$lambda$1(InvestFlowOrderArgs investFlowOrderArgs) {
        return investFlowOrderArgs instanceof OneTimeMultiple;
    }

    public final boolean isRecurring() {
        return ((Boolean) this.isRecurring.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRecurring_delegate$lambda$2(InvestFlowOrderArgs investFlowOrderArgs) {
        return investFlowOrderArgs instanceof Recurring;
    }

    /* compiled from: InvestFlowOrderArgs.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$OneTimeSingle;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "amount", "Lcom/robinhood/models/util/Money;", "isCrypto", "", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "accountNumber", "", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "nbboResponse", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "<init>", "(Lcom/robinhood/models/util/Money;ZLjava/util/List;Ljava/lang/String;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "()Z", "getAssetAllocations", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "getNbboResponse", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OneTimeSingle extends InvestFlowOrderArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<OneTimeSingle> CREATOR = new Creator();
        private final String accountNumber;
        private final Money amount;
        private final List<ApiAssetAllocation> assetAllocations;
        private final boolean isCrypto;
        private final InvestFlowLoggingParams loggingParams;
        private final ApiInvestFlowNbboResponse nbboResponse;

        /* compiled from: InvestFlowOrderArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OneTimeSingle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OneTimeSingle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Money money = (Money) parcel.readParcelable(OneTimeSingle.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(OneTimeSingle.class.getClassLoader()));
                }
                return new OneTimeSingle(money, z, arrayList, parcel.readString(), (InvestFlowLoggingParams) parcel.readParcelable(OneTimeSingle.class.getClassLoader()), (ApiInvestFlowNbboResponse) parcel.readParcelable(OneTimeSingle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OneTimeSingle[] newArray(int i) {
                return new OneTimeSingle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeInt(this.isCrypto ? 1 : 0);
            List<ApiAssetAllocation> list = this.assetAllocations;
            dest.writeInt(list.size());
            Iterator<ApiAssetAllocation> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.loggingParams, flags);
            dest.writeParcelable(this.nbboResponse, flags);
        }

        public /* synthetic */ OneTimeSingle(Money money, boolean z, List list, String str, InvestFlowLoggingParams investFlowLoggingParams, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(money, (i & 2) != 0 ? false : z, list, str, investFlowLoggingParams, apiInvestFlowNbboResponse);
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        /* renamed from: isCrypto, reason: from getter */
        public boolean getIsCrypto() {
            return this.isCrypto;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public List<ApiAssetAllocation> getAssetAllocations() {
            return this.assetAllocations;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public InvestFlowLoggingParams getLoggingParams() {
            return this.loggingParams;
        }

        public final ApiInvestFlowNbboResponse getNbboResponse() {
            return this.nbboResponse;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneTimeSingle(Money amount, boolean z, List<ApiAssetAllocation> assetAllocations, String accountNumber, InvestFlowLoggingParams loggingParams, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse) {
            super(amount, assetAllocations, z, accountNumber, null, null, false, new InvestFlowSingleNbboViewState(apiInvestFlowNbboResponse != null ? apiInvestFlowNbboResponse.getNbbo_shares() : null, apiInvestFlowNbboResponse != null ? apiInvestFlowNbboResponse.getNbbo_string_1() : null, apiInvestFlowNbboResponse != null ? apiInvestFlowNbboResponse.getNbbo_string_2() : null, apiInvestFlowNbboResponse != null ? apiInvestFlowNbboResponse.getLast_refresh_string() : null, assetAllocations), loggingParams, 112, null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
            this.amount = amount;
            this.isCrypto = z;
            this.assetAllocations = assetAllocations;
            this.accountNumber = accountNumber;
            this.loggingParams = loggingParams;
            this.nbboResponse = apiInvestFlowNbboResponse;
        }
    }

    /* compiled from: InvestFlowOrderArgs.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$OneTimeMultiple;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "amount", "Lcom/robinhood/models/util/Money;", "isCrypto", "", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "accountNumber", "", "loggingParams", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "sourceId", "Ljava/util/UUID;", "nbboResponse", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "<init>", "(Lcom/robinhood/models/util/Money;ZLjava/util/List;Ljava/lang/String;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;Ljava/util/UUID;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "()Z", "getAssetAllocations", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "getSourceId", "()Ljava/util/UUID;", "getNbboResponse", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OneTimeMultiple extends InvestFlowOrderArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<OneTimeMultiple> CREATOR = new Creator();
        private final String accountNumber;
        private final Money amount;
        private final List<ApiAssetAllocation> assetAllocations;
        private final boolean isCrypto;
        private final InvestFlowLoggingParams loggingParams;
        private final ApiInvestFlowNbboResponse nbboResponse;
        private final UUID sourceId;

        /* compiled from: InvestFlowOrderArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OneTimeMultiple> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OneTimeMultiple createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Money money = (Money) parcel.readParcelable(OneTimeMultiple.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(OneTimeMultiple.class.getClassLoader()));
                }
                return new OneTimeMultiple(money, z, arrayList, parcel.readString(), (InvestFlowLoggingParams) parcel.readParcelable(OneTimeMultiple.class.getClassLoader()), (UUID) parcel.readSerializable(), (ApiInvestFlowNbboResponse) parcel.readParcelable(OneTimeMultiple.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OneTimeMultiple[] newArray(int i) {
                return new OneTimeMultiple[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeInt(this.isCrypto ? 1 : 0);
            List<ApiAssetAllocation> list = this.assetAllocations;
            dest.writeInt(list.size());
            Iterator<ApiAssetAllocation> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.loggingParams, flags);
            dest.writeSerializable(this.sourceId);
            dest.writeParcelable(this.nbboResponse, flags);
        }

        public /* synthetic */ OneTimeMultiple(Money money, boolean z, List list, String str, InvestFlowLoggingParams investFlowLoggingParams, UUID uuid, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(money, (i & 2) != 0 ? false : z, list, str, investFlowLoggingParams, (i & 32) != 0 ? null : uuid, apiInvestFlowNbboResponse);
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        /* renamed from: isCrypto, reason: from getter */
        public boolean getIsCrypto() {
            return this.isCrypto;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public List<ApiAssetAllocation> getAssetAllocations() {
            return this.assetAllocations;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public InvestFlowLoggingParams getLoggingParams() {
            return this.loggingParams;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public UUID getSourceId() {
            return this.sourceId;
        }

        public final ApiInvestFlowNbboResponse getNbboResponse() {
            return this.nbboResponse;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OneTimeMultiple(Money amount, boolean z, List<ApiAssetAllocation> assetAllocations, String accountNumber, InvestFlowLoggingParams loggingParams, UUID uuid, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
            UUID uuid2 = null;
            boolean z2 = false;
            super(amount, assetAllocations, z, accountNumber, uuid2, uuid, z2, new InvestFlowMultipleNbboViewState(false, amount, apiInvestFlowNbboResponse, null, assetAllocations, accountNumber, 9, null), loggingParams, 80, null);
            this.amount = amount;
            this.isCrypto = z;
            this.assetAllocations = assetAllocations;
            this.accountNumber = accountNumber;
            this.loggingParams = loggingParams;
            this.sourceId = uuid;
            this.nbboResponse = apiInvestFlowNbboResponse;
        }
    }

    /* compiled from: InvestFlowOrderArgs.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010*R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bD\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs$Recurring;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "Lcom/robinhood/models/util/Money;", "amount", "", "isCrypto", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "", "accountNumber", "skipForceSuitability", "Ljava/util/UUID;", "sourceId", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "loggingParams", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "primaryPaymentMethod", "j$/time/LocalDate", "startDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "backupPaymentMethod", "Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "<init>", "(Lcom/robinhood/models/util/Money;ZLjava/util/List;Ljava/lang/String;ZLjava/util/UUID;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/models/db/AchRelationship;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", "Z", "()Z", "Ljava/util/List;", "getAssetAllocations", "()Ljava/util/List;", "Ljava/lang/String;", "getAccountNumber", "()Ljava/lang/String;", "getSkipForceSuitability", "Ljava/util/UUID;", "getSourceId", "()Ljava/util/UUID;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "getLoggingParams", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getPrimaryPaymentMethod", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getBackupPaymentMethod", "Lcom/robinhood/models/db/AchRelationship;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Recurring extends InvestFlowOrderArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Recurring> CREATOR = new Creator();
        private final String accountNumber;
        private final AchRelationship achRelationship;
        private final Money amount;
        private final List<ApiAssetAllocation> assetAllocations;
        private final InvestFlowPaymentMethod backupPaymentMethod;
        private final BrokerageAccountType brokerageAccountType;
        private final ApiInvestmentSchedule.Frequency frequency;
        private final boolean isCrypto;
        private final InvestFlowLoggingParams loggingParams;
        private final InvestFlowPaymentMethod primaryPaymentMethod;
        private final boolean skipForceSuitability;
        private final UUID sourceId;
        private final LocalDate startDate;

        /* compiled from: InvestFlowOrderArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Recurring> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Money money = (Money) parcel.readParcelable(Recurring.class.getClassLoader());
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Recurring.class.getClassLoader()));
                }
                return new Recurring(money, z2, arrayList, parcel.readString(), parcel.readInt() != 0 ? z : false, (UUID) parcel.readSerializable(), (InvestFlowLoggingParams) parcel.readParcelable(Recurring.class.getClassLoader()), BrokerageAccountType.valueOf(parcel.readString()), (InvestFlowPaymentMethod) parcel.readParcelable(Recurring.class.getClassLoader()), (LocalDate) parcel.readSerializable(), ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (InvestFlowPaymentMethod) parcel.readParcelable(Recurring.class.getClassLoader()), (AchRelationship) parcel.readParcelable(Recurring.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring[] newArray(int i) {
                return new Recurring[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeInt(this.isCrypto ? 1 : 0);
            List<ApiAssetAllocation> list = this.assetAllocations;
            dest.writeInt(list.size());
            Iterator<ApiAssetAllocation> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.accountNumber);
            dest.writeInt(this.skipForceSuitability ? 1 : 0);
            dest.writeSerializable(this.sourceId);
            dest.writeParcelable(this.loggingParams, flags);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeParcelable(this.primaryPaymentMethod, flags);
            dest.writeSerializable(this.startDate);
            dest.writeString(this.frequency.name());
            dest.writeParcelable(this.backupPaymentMethod, flags);
            dest.writeParcelable(this.achRelationship, flags);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Recurring(com.robinhood.models.util.Money r17, boolean r18, java.util.List r19, java.lang.String r20, boolean r21, java.util.UUID r22, com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams r23, com.robinhood.models.api.BrokerageAccountType r24, com.robinhood.android.investFlow.core.InvestFlowPaymentMethod r25, p479j$.time.LocalDate r26, com.robinhood.recurring.models.api.ApiInvestmentSchedule.Frequency r27, com.robinhood.android.investFlow.core.InvestFlowPaymentMethod r28, com.robinhood.models.p320db.AchRelationship r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 2
                if (r1 == 0) goto L9
                r1 = 0
                r4 = r1
                goto Lb
            L9:
                r4 = r18
            Lb:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L12
                r8 = r2
                goto L14
            L12:
                r8 = r22
            L14:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L1a
                r14 = r2
                goto L1c
            L1a:
                r14 = r28
            L1c:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L36
                r15 = r2
                r3 = r17
                r5 = r19
                r6 = r20
                r7 = r21
                r9 = r23
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
                r2 = r16
                goto L4c
            L36:
                r15 = r29
                r2 = r16
                r3 = r17
                r5 = r19
                r6 = r20
                r7 = r21
                r9 = r23
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
            L4c:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investFlow.submit.InvestFlowOrderArgs.Recurring.<init>(com.robinhood.models.util.Money, boolean, java.util.List, java.lang.String, boolean, java.util.UUID, com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams, com.robinhood.models.api.BrokerageAccountType, com.robinhood.android.investFlow.core.InvestFlowPaymentMethod, j$.time.LocalDate, com.robinhood.recurring.models.api.ApiInvestmentSchedule$Frequency, com.robinhood.android.investFlow.core.InvestFlowPaymentMethod, com.robinhood.models.db.AchRelationship, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        /* renamed from: isCrypto, reason: from getter */
        public boolean getIsCrypto() {
            return this.isCrypto;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public List<ApiAssetAllocation> getAssetAllocations() {
            return this.assetAllocations;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public boolean getSkipForceSuitability() {
            return this.skipForceSuitability;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public UUID getSourceId() {
            return this.sourceId;
        }

        @Override // com.robinhood.android.investFlow.submit.InvestFlowOrderArgs
        public InvestFlowLoggingParams getLoggingParams() {
            return this.loggingParams;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
            return this.primaryPaymentMethod;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final InvestFlowPaymentMethod getBackupPaymentMethod() {
            return this.backupPaymentMethod;
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Recurring(Money amount, boolean z, List<ApiAssetAllocation> assetAllocations, String accountNumber, boolean z2, UUID uuid, InvestFlowLoggingParams loggingParams, BrokerageAccountType brokerageAccountType, InvestFlowPaymentMethod primaryPaymentMethod, LocalDate startDate, ApiInvestmentSchedule.Frequency frequency, InvestFlowPaymentMethod investFlowPaymentMethod, AchRelationship achRelationship) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(primaryPaymentMethod, "primaryPaymentMethod");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            UUID uuid2 = null;
            boolean z3 = false;
            super(amount, assetAllocations, z, accountNumber, uuid2, uuid, z3, new InvestFlowRecurringViewState(amount, frequency, startDate, primaryPaymentMethod, investFlowPaymentMethod, false, null, brokerageAccountType, assetAllocations, null, null, false, accountNumber, null, 11872, null), loggingParams, 80, 0 == true ? 1 : 0);
            this.amount = amount;
            this.isCrypto = z;
            this.assetAllocations = assetAllocations;
            this.accountNumber = accountNumber;
            this.skipForceSuitability = z2;
            this.sourceId = uuid;
            this.loggingParams = loggingParams;
            this.brokerageAccountType = brokerageAccountType;
            this.primaryPaymentMethod = primaryPaymentMethod;
            this.startDate = startDate;
            this.frequency = frequency;
            this.backupPaymentMethod = investFlowPaymentMethod;
            this.achRelationship = achRelationship;
        }
    }
}
