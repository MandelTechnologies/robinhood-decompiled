package com.robinhood.android.acats.retries.activity;

import com.robinhood.android.acats.retries.AcatsRetriesRowState;
import com.robinhood.android.acats.retries.AcatsTransfers;
import com.robinhood.android.acats.retries.C7659R;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.AcatsInScreenContext2;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.utils.Either;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
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
import okhttp3.HttpUrl;

/* compiled from: AcatsRetriesDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001sB\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\rHÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010m\u001a\u00020\u0015HÆ\u0003J\u0085\u0001\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010o\u001a\u00020\r2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020BHÖ\u0001J\t\u0010r\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00102\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u000f8F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0014\u00106\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0016\u0010;\u001a\u0004\u0018\u0001048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0013\u0010=\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b>\u0010)R\u0013\u0010?\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b@\u0010\u001dR\u0013\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010%R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010%R\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020O8@X\u0081\u0004¢\u0006\f\u0012\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010X\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006t"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;", "", "retryAcatsId", "Ljava/util/UUID;", "retryAcatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "transferRhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "retryContraBrokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "newUserValues", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState$NewUserValues;", "submissionLoading", "", "retryInstruments", "", "Lcom/robinhood/models/db/Instrument;", "retryOptions", "Lcom/robinhood/models/db/OptionInstrument;", "retryOptionsInstruments", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;Lcom/robinhood/models/api/bonfire/ApiBrokerage;Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState$NewUserValues;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getRetryAcatsId", "()Ljava/util/UUID;", "getRetryAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getTransferRhsAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getRetryContraBrokerage", "()Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "getNewUserValues", "()Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState$NewUserValues;", "getSubmissionLoading", "()Z", "getRetryInstruments", "()Ljava/util/List;", "getRetryOptions", "getRetryOptionsInstruments", "getLoggingSource", "()Ljava/lang/String;", "headerTitle", "Lcom/robinhood/utils/resource/StringResource;", "getHeaderTitle", "()Lcom/robinhood/utils/resource/StringResource;", "headerInfoBanner", "getHeaderInfoBanner", "submissionEnabled", "getSubmissionEnabled", "isReady", "rowStates", "Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;", "getRowStates", "accountTypeRow", "getAccountTypeRow", "()Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;", "accountNumberRow", "getAccountNumberRow", "assetsRow", "getAssetsRow$feature_acats_retries_externalDebug", "contraAccountNumber", "getContraAccountNumber", "rhsAccount", "getRhsAccount", "numAssetsToTransfer", "", "getNumAssetsToTransfer", "()Ljava/lang/Integer;", "retryAssets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "getRetryAssets", "assets", "getAssets", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "getRequest", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "requestTransferType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$TransferType;", "getRequestTransferType$feature_acats_retries_externalDebug$annotations", "()V", "getRequestTransferType$feature_acats_retries_externalDebug", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$TransferType;", "assetRowClickedFragmentKey", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "getAssetRowClickedFragmentKey", "()Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "accountNumberRowClickedKey", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "getAccountNumberRowClickedKey", "()Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "accountTypeRowClickedKey", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "getAccountTypeRowClickedKey", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "NewUserValues", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsRetriesDataState {
    public static final int $stable = 8;
    private final String loggingSource;
    private final NewUserValues newUserValues;
    private final UUID retryAcatsId;
    private final AcatsTransfer retryAcatsTransfer;
    private final ApiBrokerage retryContraBrokerage;
    private final List<Instrument> retryInstruments;
    private final List<OptionInstrument> retryOptions;
    private final List<Instrument> retryOptionsInstruments;
    private final boolean submissionLoading;
    private final AvailableAccount transferRhsAccount;

    /* compiled from: AcatsRetriesDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAcatsTransfer.AcatRejectReasonEnum.values().length];
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ACCOUNT_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.ACCOUNT_TITLE_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ASSETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAcatsTransfer.TransferType.values().length];
            try {
                iArr2[ApiAcatsTransfer.TransferType.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAcatsTransfer.TransferType.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAcatsTransfer.TransferType.RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiAcatsTransfer.TransferType.RESIDUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiAcatsTransfer.TransferType.FAIL_REVERSAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiAcatsTransfer.TransferType.MUTUAL_FUND_CLEANUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ AcatsRetriesDataState copy$default(AcatsRetriesDataState acatsRetriesDataState, UUID uuid, AcatsTransfer acatsTransfer, AvailableAccount availableAccount, ApiBrokerage apiBrokerage, NewUserValues newUserValues, boolean z, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = acatsRetriesDataState.retryAcatsId;
        }
        if ((i & 2) != 0) {
            acatsTransfer = acatsRetriesDataState.retryAcatsTransfer;
        }
        if ((i & 4) != 0) {
            availableAccount = acatsRetriesDataState.transferRhsAccount;
        }
        if ((i & 8) != 0) {
            apiBrokerage = acatsRetriesDataState.retryContraBrokerage;
        }
        if ((i & 16) != 0) {
            newUserValues = acatsRetriesDataState.newUserValues;
        }
        if ((i & 32) != 0) {
            z = acatsRetriesDataState.submissionLoading;
        }
        if ((i & 64) != 0) {
            list = acatsRetriesDataState.retryInstruments;
        }
        if ((i & 128) != 0) {
            list2 = acatsRetriesDataState.retryOptions;
        }
        if ((i & 256) != 0) {
            list3 = acatsRetriesDataState.retryOptionsInstruments;
        }
        if ((i & 512) != 0) {
            str = acatsRetriesDataState.loggingSource;
        }
        List list4 = list3;
        String str2 = str;
        List list5 = list;
        List list6 = list2;
        NewUserValues newUserValues2 = newUserValues;
        boolean z2 = z;
        return acatsRetriesDataState.copy(uuid, acatsTransfer, availableAccount, apiBrokerage, newUserValues2, z2, list5, list6, list4, str2);
    }

    /* renamed from: getRequestTransferType$feature_acats_retries_externalDebug$annotations */
    public static /* synthetic */ void m1697xa920bd1f() {
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRetryAcatsId() {
        return this.retryAcatsId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component2, reason: from getter */
    public final AcatsTransfer getRetryAcatsTransfer() {
        return this.retryAcatsTransfer;
    }

    /* renamed from: component3, reason: from getter */
    public final AvailableAccount getTransferRhsAccount() {
        return this.transferRhsAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiBrokerage getRetryContraBrokerage() {
        return this.retryContraBrokerage;
    }

    /* renamed from: component5, reason: from getter */
    public final NewUserValues getNewUserValues() {
        return this.newUserValues;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSubmissionLoading() {
        return this.submissionLoading;
    }

    public final List<Instrument> component7() {
        return this.retryInstruments;
    }

    public final List<OptionInstrument> component8() {
        return this.retryOptions;
    }

    public final List<Instrument> component9() {
        return this.retryOptionsInstruments;
    }

    public final AcatsRetriesDataState copy(UUID retryAcatsId, AcatsTransfer retryAcatsTransfer, AvailableAccount transferRhsAccount, ApiBrokerage retryContraBrokerage, NewUserValues newUserValues, boolean submissionLoading, List<Instrument> retryInstruments, List<OptionInstrument> retryOptions, List<Instrument> retryOptionsInstruments, String loggingSource) {
        Intrinsics.checkNotNullParameter(retryAcatsId, "retryAcatsId");
        Intrinsics.checkNotNullParameter(newUserValues, "newUserValues");
        Intrinsics.checkNotNullParameter(retryInstruments, "retryInstruments");
        Intrinsics.checkNotNullParameter(retryOptions, "retryOptions");
        Intrinsics.checkNotNullParameter(retryOptionsInstruments, "retryOptionsInstruments");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        return new AcatsRetriesDataState(retryAcatsId, retryAcatsTransfer, transferRhsAccount, retryContraBrokerage, newUserValues, submissionLoading, retryInstruments, retryOptions, retryOptionsInstruments, loggingSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsRetriesDataState)) {
            return false;
        }
        AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) other;
        return Intrinsics.areEqual(this.retryAcatsId, acatsRetriesDataState.retryAcatsId) && Intrinsics.areEqual(this.retryAcatsTransfer, acatsRetriesDataState.retryAcatsTransfer) && Intrinsics.areEqual(this.transferRhsAccount, acatsRetriesDataState.transferRhsAccount) && Intrinsics.areEqual(this.retryContraBrokerage, acatsRetriesDataState.retryContraBrokerage) && Intrinsics.areEqual(this.newUserValues, acatsRetriesDataState.newUserValues) && this.submissionLoading == acatsRetriesDataState.submissionLoading && Intrinsics.areEqual(this.retryInstruments, acatsRetriesDataState.retryInstruments) && Intrinsics.areEqual(this.retryOptions, acatsRetriesDataState.retryOptions) && Intrinsics.areEqual(this.retryOptionsInstruments, acatsRetriesDataState.retryOptionsInstruments) && Intrinsics.areEqual(this.loggingSource, acatsRetriesDataState.loggingSource);
    }

    public int hashCode() {
        int iHashCode = this.retryAcatsId.hashCode() * 31;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        int iHashCode2 = (iHashCode + (acatsTransfer == null ? 0 : acatsTransfer.hashCode())) * 31;
        AvailableAccount availableAccount = this.transferRhsAccount;
        int iHashCode3 = (iHashCode2 + (availableAccount == null ? 0 : availableAccount.hashCode())) * 31;
        ApiBrokerage apiBrokerage = this.retryContraBrokerage;
        return ((((((((((((iHashCode3 + (apiBrokerage != null ? apiBrokerage.hashCode() : 0)) * 31) + this.newUserValues.hashCode()) * 31) + Boolean.hashCode(this.submissionLoading)) * 31) + this.retryInstruments.hashCode()) * 31) + this.retryOptions.hashCode()) * 31) + this.retryOptionsInstruments.hashCode()) * 31) + this.loggingSource.hashCode();
    }

    public String toString() {
        return "AcatsRetriesDataState(retryAcatsId=" + this.retryAcatsId + ", retryAcatsTransfer=" + this.retryAcatsTransfer + ", transferRhsAccount=" + this.transferRhsAccount + ", retryContraBrokerage=" + this.retryContraBrokerage + ", newUserValues=" + this.newUserValues + ", submissionLoading=" + this.submissionLoading + ", retryInstruments=" + this.retryInstruments + ", retryOptions=" + this.retryOptions + ", retryOptionsInstruments=" + this.retryOptionsInstruments + ", loggingSource=" + this.loggingSource + ")";
    }

    public AcatsRetriesDataState(UUID retryAcatsId, AcatsTransfer acatsTransfer, AvailableAccount availableAccount, ApiBrokerage apiBrokerage, NewUserValues newUserValues, boolean z, List<Instrument> retryInstruments, List<OptionInstrument> retryOptions, List<Instrument> retryOptionsInstruments, String loggingSource) {
        Intrinsics.checkNotNullParameter(retryAcatsId, "retryAcatsId");
        Intrinsics.checkNotNullParameter(newUserValues, "newUserValues");
        Intrinsics.checkNotNullParameter(retryInstruments, "retryInstruments");
        Intrinsics.checkNotNullParameter(retryOptions, "retryOptions");
        Intrinsics.checkNotNullParameter(retryOptionsInstruments, "retryOptionsInstruments");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        this.retryAcatsId = retryAcatsId;
        this.retryAcatsTransfer = acatsTransfer;
        this.transferRhsAccount = availableAccount;
        this.retryContraBrokerage = apiBrokerage;
        this.newUserValues = newUserValues;
        this.submissionLoading = z;
        this.retryInstruments = retryInstruments;
        this.retryOptions = retryOptions;
        this.retryOptionsInstruments = retryOptionsInstruments;
        this.loggingSource = loggingSource;
    }

    public final UUID getRetryAcatsId() {
        return this.retryAcatsId;
    }

    public final AcatsTransfer getRetryAcatsTransfer() {
        return this.retryAcatsTransfer;
    }

    public final AvailableAccount getTransferRhsAccount() {
        return this.transferRhsAccount;
    }

    public final ApiBrokerage getRetryContraBrokerage() {
        return this.retryContraBrokerage;
    }

    public /* synthetic */ AcatsRetriesDataState(UUID uuid, AcatsTransfer acatsTransfer, AvailableAccount availableAccount, ApiBrokerage apiBrokerage, NewUserValues newUserValues, boolean z, List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : acatsTransfer, (i & 4) != 0 ? null : availableAccount, (i & 8) != 0 ? null : apiBrokerage, (i & 16) != 0 ? new NewUserValues(null, null, null, 7, null) : newUserValues, (i & 32) != 0 ? false : z, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? CollectionsKt.emptyList() : list3, (i & 512) != 0 ? "" : str);
    }

    public final NewUserValues getNewUserValues() {
        return this.newUserValues;
    }

    public final boolean getSubmissionLoading() {
        return this.submissionLoading;
    }

    public final List<Instrument> getRetryInstruments() {
        return this.retryInstruments;
    }

    public final List<OptionInstrument> getRetryOptions() {
        return this.retryOptions;
    }

    public final List<Instrument> getRetryOptionsInstruments() {
        return this.retryOptionsInstruments;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final StringResource getHeaderTitle() {
        ApiAcatsTransfer.AcatRejectReasonEnum rejectReasonEnum;
        int i;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        if (acatsTransfer == null || (rejectReasonEnum = acatsTransfer.getRejectReasonEnum()) == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[rejectReasonEnum.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = C7659R.string.acats_retries_header_title_account;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C7659R.string.acats_retries_header_title_unsupported_assets;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getHeaderInfoBanner() {
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C7659R.string.acats_retries_info_banner_title, new Object[0]);
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        if ((acatsTransfer != null ? acatsTransfer.getRejectReasonEnum() : null) == ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ASSETS && this.newUserValues.getAssets() == null) {
            return stringResourceInvoke;
        }
        return null;
    }

    public final boolean getSubmissionEnabled() {
        List<AcatsRetriesRowState> rowStates = getRowStates();
        boolean z = false;
        if (!(rowStates instanceof Collection) || !rowStates.isEmpty()) {
            Iterator<T> it = rowStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AcatsRetriesRowState) it.next()).getRequiresAttention()) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public final boolean isReady() {
        return (this.retryAcatsTransfer == null || this.transferRhsAccount == null || this.retryContraBrokerage == null) ? false : true;
    }

    public final List<AcatsRetriesRowState> getRowStates() {
        String contraBrokerName;
        String contraAccountName;
        HttpUrl logo;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C7659R.string.acats_retries_brokerage_row_title, new Object[0]);
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        String str = "";
        if (acatsTransfer == null || (contraBrokerName = acatsTransfer.getContraBrokerName()) == null) {
            contraBrokerName = "";
        }
        StringResource stringResourceInvoke2 = companion.invoke(contraBrokerName);
        ApiBrokerage apiBrokerage = this.retryContraBrokerage;
        AcatsRetriesRowState acatsRetriesRowState = new AcatsRetriesRowState(stringResourceInvoke, stringResourceInvoke2, (apiBrokerage == null || (logo = apiBrokerage.getLogo()) == null) ? null : logo.getUrl(), null, null, 24, null);
        AcatsRetriesRowState accountTypeRow = getAccountTypeRow();
        AcatsRetriesRowState accountNumberRow = getAccountNumberRow();
        StringResource stringResourceInvoke3 = companion.invoke(C7659R.string.acats_retries_account_name_row_title, new Object[0]);
        AcatsTransfer acatsTransfer2 = this.retryAcatsTransfer;
        if (acatsTransfer2 != null && (contraAccountName = acatsTransfer2.getContraAccountName()) != null) {
            str = contraAccountName;
        }
        return CollectionsKt.listOfNotNull((Object[]) new AcatsRetriesRowState[]{acatsRetriesRowState, accountTypeRow, accountNumberRow, new AcatsRetriesRowState(stringResourceInvoke3, companion.invoke(str), null, null, null, 28, null), getAssetsRow$feature_acats_retries_externalDebug()});
    }

    private final AcatsRetriesRowState getAccountTypeRow() {
        String title;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C7659R.string.acats_retries_account_type_row_title, new Object[0]);
        AvailableAccount rhsAccount = getRhsAccount();
        if (rhsAccount == null || (title = rhsAccount.getTitle()) == null) {
            title = "";
        }
        StringResource stringResourceInvoke2 = companion.invoke(title);
        ApiAcatsTransfer.AcatRetryStep acatRetryStep = ApiAcatsTransfer.AcatRetryStep.ACCOUNT_TITLE;
        return new AcatsRetriesRowState(stringResourceInvoke, stringResourceInvoke2, null, acatRetryStep, AcatsTransfers.getInteractionState$default(this.retryAcatsTransfer, this.newUserValues.getRhsAccount(), CollectionsKt.listOf(ApiAcatsTransfer.AcatRetryStep.ACCOUNT_NUMBER), CollectionsKt.listOf(acatRetryStep), null, 8, null), 4, null);
    }

    private final AcatsRetriesRowState getAccountNumberRow() {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C7659R.string.acats_retries_account_number_row_title, new Object[0]);
        String contraAccountNumber = getContraAccountNumber();
        if (contraAccountNumber == null) {
            contraAccountNumber = "";
        }
        StringResource stringResourceInvoke2 = companion.invoke(contraAccountNumber);
        ApiAcatsTransfer.AcatRetryStep acatRetryStep = ApiAcatsTransfer.AcatRetryStep.ACCOUNT_NUMBER;
        return new AcatsRetriesRowState(stringResourceInvoke, stringResourceInvoke2, null, acatRetryStep, AcatsTransfers.getInteractionState$default(this.retryAcatsTransfer, this.newUserValues.getAccountNumber(), CollectionsKt.listOf(ApiAcatsTransfer.AcatRetryStep.ACCOUNT_TITLE), CollectionsKt.listOf(acatRetryStep), null, 8, null), 4, null);
    }

    public final AcatsRetriesRowState getAssetsRow$feature_acats_retries_externalDebug() {
        if (!AcatsTransfers.showAssetsRow(this.retryAcatsTransfer)) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C7659R.string.acats_retries_assets_row_title, new Object[0]);
        int i = C7659R.string.acats_retries_assets_row_label;
        Integer numAssetsToTransfer = getNumAssetsToTransfer();
        StringResource stringResourceInvoke2 = companion.invoke(i, Integer.valueOf(numAssetsToTransfer != null ? numAssetsToTransfer.intValue() : 0));
        ApiAcatsTransfer.AcatRetryStep acatRetryStep = ApiAcatsTransfer.AcatRetryStep.ASSETS;
        return new AcatsRetriesRowState(stringResourceInvoke, stringResourceInvoke2, null, acatRetryStep, AcatsTransfers.getInteractionState$default(this.retryAcatsTransfer, this.newUserValues.getAssets(), CollectionsKt.listOf((Object[]) new ApiAcatsTransfer.AcatRetryStep[]{ApiAcatsTransfer.AcatRetryStep.ACCOUNT_NUMBER, ApiAcatsTransfer.AcatRetryStep.ACCOUNT_TITLE}), null, CollectionsKt.listOf(acatRetryStep), 4, null), 4, null);
    }

    public final String getContraAccountNumber() {
        String accountNumber = this.newUserValues.getAccountNumber();
        if (accountNumber != null) {
            return accountNumber;
        }
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        if (acatsTransfer != null) {
            return acatsTransfer.getContraAccountNumber();
        }
        return null;
    }

    public final AvailableAccount getRhsAccount() {
        AvailableAccount rhsAccount = this.newUserValues.getRhsAccount();
        return rhsAccount == null ? this.transferRhsAccount : rhsAccount;
    }

    public final Integer getNumAssetsToTransfer() {
        AcatsTransfer acatsTransfer;
        List assets = this.newUserValues.getAssets();
        if (assets == null && ((acatsTransfer = this.retryAcatsTransfer) == null || (assets = acatsTransfer.getAssets()) == null)) {
            return null;
        }
        return Integer.valueOf(assets.size());
    }

    private final List<UiAcatsAsset> getRetryAssets() {
        List<AcatsTransfer.Asset> assets;
        List<UiAcatsAsset> uiModels;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        return (acatsTransfer == null || (assets = acatsTransfer.getAssets()) == null || (uiModels = AcatsRetriesDataState2.toUiModels(assets, this.retryInstruments, this.retryOptions, this.retryOptionsInstruments)) == null) ? CollectionsKt.emptyList() : uiModels;
    }

    public final List<UiAcatsAsset> getAssets() {
        List<UiAcatsAsset> assets = this.newUserValues.getAssets();
        return assets == null ? getRetryAssets() : assets;
    }

    public final ApiAcatsTransferRequest getRequest() {
        String contraAccountName;
        String contraAccountNumber;
        List listEmptyList;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        if (acatsTransfer == null || (contraAccountName = acatsTransfer.getContraAccountName()) == null || (contraAccountNumber = getContraAccountNumber()) == null) {
            return null;
        }
        String contraBrokerName = this.retryAcatsTransfer.getContraBrokerName();
        String contraDtccNumber = this.retryAcatsTransfer.getContraDtccNumber();
        ApiAcatsTransfer.TransferType requestTransferType$feature_acats_retries_externalDebug = getRequestTransferType$feature_acats_retries_externalDebug();
        AvailableAccount rhsAccount = getRhsAccount();
        String rhsAccountNumber = rhsAccount != null ? rhsAccount.getRhsAccountNumber() : null;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        switch (WhenMappings.$EnumSwitchMapping$1[getRequestTransferType$feature_acats_retries_externalDebug().ordinal()]) {
            case 1:
                listEmptyList = CollectionsKt.emptyList();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                List<UiAcatsAsset> assets = getAssets();
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
                Iterator<T> it = assets.iterator();
                while (it.hasNext()) {
                    listEmptyList.add(((UiAcatsAsset) it.next()).convertToApiModel());
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ApiAcatsTransferRequest(contraAccountName, contraAccountNumber, contraBrokerName, contraDtccNumber, requestTransferType$feature_acats_retries_externalDebug, rhsAccountNumber, uuidRandomUUID, listEmptyList);
    }

    public final ApiAcatsTransfer.TransferType getRequestTransferType$feature_acats_retries_externalDebug() {
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        if (acatsTransfer == null) {
            return ApiAcatsTransfer.TransferType.PARTIAL;
        }
        if (acatsTransfer.getTransferType() == ApiAcatsTransfer.TransferType.FULL && this.retryAcatsTransfer.getRejectReasonEnum() == ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ASSETS) {
            return ApiAcatsTransfer.TransferType.PARTIAL;
        }
        return this.retryAcatsTransfer.getTransferType();
    }

    public final AcatsInReviewAssetsContract.Key getAssetRowClickedFragmentKey() {
        List<UiAcatsAsset> assets = getAssets();
        AvailableAccount rhsAccount = getRhsAccount();
        String rhsAccountNumber = rhsAccount != null ? rhsAccount.getRhsAccountNumber() : null;
        AcatsInScreenContext screenContext = getScreenContext();
        AvailableAccount rhsAccount2 = getRhsAccount();
        return new AcatsInReviewAssetsContract.Key(assets, true, rhsAccountNumber, null, rhsAccount2 != null ? rhsAccount2.getBrokerageAccountType() : null, screenContext, 8, null);
    }

    public final AcatsInAccountNumberContract.Key getAccountNumberRowClickedKey() {
        Either right;
        AvailableAccount rhsAccount = getRhsAccount();
        String rhsAccountNumber = rhsAccount != null ? rhsAccount.getRhsAccountNumber() : null;
        AvailableAccount rhsAccount2 = getRhsAccount();
        BrokerageAccountType brokerageAccountType = rhsAccount2 != null ? rhsAccount2.getBrokerageAccountType() : null;
        ApiBrokerage apiBrokerage = this.retryContraBrokerage;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        String contraDtccNumber = acatsTransfer != null ? acatsTransfer.getContraDtccNumber() : null;
        if (rhsAccountNumber == null || brokerageAccountType == null || (apiBrokerage == null && contraDtccNumber == null)) {
            String str = contraDtccNumber;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new NullPointerException(StringsKt.trimIndent("\n                        unexpected null in accountNumberRowClickedKey\n                            rhsAccount.accountNumber: " + rhsAccountNumber + "\n                            rhsAccount.brokerageAccountType: " + brokerageAccountType + "\n                            retryAcatsTransfer.contraDtcNumber: " + str + "\n                            retryContraBrokerage: " + apiBrokerage + "\n                    ")), true, null, 4, null);
            return null;
        }
        String str2 = contraDtccNumber;
        AcatsInScreenContext screenContext = getScreenContext();
        if (apiBrokerage != null) {
            right = new Either.Left(apiBrokerage);
        } else {
            if (str2 == null) {
                return null;
            }
            right = new Either.Right(str2);
        }
        return new AcatsInAccountNumberContract.Key(screenContext, right, rhsAccountNumber, true, brokerageAccountType);
    }

    public final AcatsInAvailableDestinationsContract.Key getAccountTypeRowClickedKey() {
        return new AcatsInAvailableDestinationsContract.Key(getScreenContext(), true);
    }

    public final AcatsInScreenContext getScreenContext() {
        String contraDtccNumber;
        String str = this.loggingSource;
        AcatsTransfer acatsTransfer = this.retryAcatsTransfer;
        AcatsInContext.RejectReason loggingRejectReason = AcatsInScreenContext2.toLoggingRejectReason(acatsTransfer != null ? acatsTransfer.getRejectReasonEnum() : null);
        AcatsTransfer acatsTransfer2 = this.retryAcatsTransfer;
        if (acatsTransfer2 == null || (contraDtccNumber = acatsTransfer2.getContraDtccNumber()) == null) {
            contraDtccNumber = "";
        }
        return new AcatsInScreenContext(str, true, false, null, null, loggingRejectReason, true, contraDtccNumber, false, 280, null);
    }

    /* compiled from: AcatsRetriesDataState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState$NewUserValues;", "", "accountNumber", "", "rhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getRhsAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getAssets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NewUserValues {
        public static final int $stable = 8;
        private final String accountNumber;
        private final List<UiAcatsAsset> assets;
        private final AvailableAccount rhsAccount;

        public NewUserValues() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewUserValues copy$default(NewUserValues newUserValues, String str, AvailableAccount availableAccount, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newUserValues.accountNumber;
            }
            if ((i & 2) != 0) {
                availableAccount = newUserValues.rhsAccount;
            }
            if ((i & 4) != 0) {
                list = newUserValues.assets;
            }
            return newUserValues.copy(str, availableAccount, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final AvailableAccount getRhsAccount() {
            return this.rhsAccount;
        }

        public final List<UiAcatsAsset> component3() {
            return this.assets;
        }

        public final NewUserValues copy(String accountNumber, AvailableAccount rhsAccount, List<? extends UiAcatsAsset> assets) {
            return new NewUserValues(accountNumber, rhsAccount, assets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewUserValues)) {
                return false;
            }
            NewUserValues newUserValues = (NewUserValues) other;
            return Intrinsics.areEqual(this.accountNumber, newUserValues.accountNumber) && Intrinsics.areEqual(this.rhsAccount, newUserValues.rhsAccount) && Intrinsics.areEqual(this.assets, newUserValues.assets);
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AvailableAccount availableAccount = this.rhsAccount;
            int iHashCode2 = (iHashCode + (availableAccount == null ? 0 : availableAccount.hashCode())) * 31;
            List<UiAcatsAsset> list = this.assets;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "NewUserValues(accountNumber=" + this.accountNumber + ", rhsAccount=" + this.rhsAccount + ", assets=" + this.assets + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewUserValues(String str, AvailableAccount availableAccount, List<? extends UiAcatsAsset> list) {
            this.accountNumber = str;
            this.rhsAccount = availableAccount;
            this.assets = list;
        }

        public /* synthetic */ NewUserValues(String str, AvailableAccount availableAccount, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : availableAccount, (i & 4) != 0 ? null : list);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AvailableAccount getRhsAccount() {
            return this.rhsAccount;
        }

        public final List<UiAcatsAsset> getAssets() {
            return this.assets;
        }
    }
}
