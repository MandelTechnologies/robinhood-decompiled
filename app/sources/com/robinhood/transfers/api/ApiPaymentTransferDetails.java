package com.robinhood.transfers.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.parceler.HttpUrlParceler;
import com.robinhood.models.util.ApiCurrencyOwner;
import com.robinhood.models.util.CurrencyContext;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.p405uk.ApiPaymentTransferFxConversion;
import com.robinhood.transfers.api.p405uk.UkBankTransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.utils.extensions.HttpUrls;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ApiPaymentTransferDetails.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\r\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Landroid/os/Parcelable;", "ApiClawbackTransfer", "ApiGoldDepositBoostTransfer", "ApiEnokiTransfer", "ApiAchTransfer", "ApiCheckTransfer", "ApiDebitCardTransfer", "ApiIncomingWireTransfer", "ApiOutgoingWireTransfer", "ApiInstantBankTransfer", "ApiInternalTransfer", "ApiNonOriginatedAchTransfer", "ApiRolloverAchTransfer", "ApiSentTransfer", "ApiSepaCredit", "ApiUkBankTransfer", "Unknown", "AdapterModule", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiCheckTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiDebitCardTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiIncomingWireTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInstantBankTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInternalTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiNonOriginatedAchTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiOutgoingWireTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiRolloverAchTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiSentTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiSepaCredit;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiUkBankTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$Unknown;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ApiPaymentTransferDetails extends Parcelable {

    /* compiled from: ApiPaymentTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "", "clawback_amount", "Lcom/robinhood/models/util/Money;", "getClawback_amount$annotations", "()V", "getClawback_amount", "()Lcom/robinhood/models/util/Money;", "clawback_amount_explanation", "", "getClawback_amount_explanation$annotations", "getClawback_amount_explanation", "()Ljava/lang/String;", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGrace_period_content$annotations", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ApiClawbackTransfer {

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void getClawback_amount$annotations() {
            }

            public static /* synthetic */ void getClawback_amount_explanation$annotations() {
            }

            public static /* synthetic */ void getGrace_period_content$annotations() {
            }
        }

        Money getClawback_amount();

        String getClawback_amount_explanation();

        ApiGracePeriodContent getGrace_period_content();
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "", "enoki_amount", "Lcom/robinhood/models/util/Money;", "getEnoki_amount$annotations", "()V", "getEnoki_amount", "()Lcom/robinhood/models/util/Money;", "enoki_removal_fee", "getEnoki_removal_fee$annotations", "getEnoki_removal_fee", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ApiEnokiTransfer {

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void getEnoki_amount$annotations() {
            }

            public static /* synthetic */ void getEnoki_removal_fee$annotations() {
            }
        }

        Money getEnoki_amount();

        Money getEnoki_removal_fee();
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getGold_deposit_boost$annotations", "()V", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ApiGoldDepositBoostTransfer {

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void getGold_deposit_boost$annotations() {
            }
        }

        ApiGoldDepositBoostTransferDetail getGold_deposit_boost();
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0087\u0001B×\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010 \u001a\u00020\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001d\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020.¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b?\u00108J\u0010\u0010@\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bB\u0010<J\u0012\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bC\u0010<J\u0010\u0010D\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bD\u00108J\u0010\u0010E\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bN\u0010:J\u0010\u0010O\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bO\u0010<J\u0012\u0010P\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bR\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bS\u0010QJ\u0012\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bT\u0010:J\u0012\u0010U\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u008c\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b[\u0010:J\u0010\u0010\\\u001a\u00020.HÖ\u0001¢\u0006\u0004\b\\\u00104J\u001a\u0010_\u001a\u00020\u00192\b\u0010^\u001a\u0004\u0018\u00010]HÖ\u0003¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010a\u001a\u0004\bb\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bd\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bf\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bh\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010i\u001a\u0004\bj\u0010>R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bk\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010AR\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\bn\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\bo\u0010<R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bp\u00108R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010q\u001a\u0004\br\u0010FR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010q\u001a\u0004\bs\u0010FR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010t\u001a\u0004\bu\u0010IR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010v\u001a\u0004\bw\u0010KR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010x\u001a\u0004\by\u0010MR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010e\u001a\u0004\bz\u0010:R\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\b{\u0010<R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010|\u001a\u0004\b}\u0010QR\u001c\u0010#\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010|\u001a\u0004\b~\u0010QR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010|\u001a\u0004\b\u007f\u0010QR\u001d\u0010%\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b%\u0010e\u001a\u0005\b\u0080\u0001\u0010:R\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010VR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010XR\u0013\u0010\u0086\u0001\u001a\u00020\u00168F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010F¨\u0006\u0088\u0001"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "Lcom/robinhood/models/util/ApiCurrencyOwner;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "Lokhttp3/HttpUrl;", "ach_relationship", "Ljava/math/BigDecimal;", "amount", "", "cancel", "j$/time/Instant", "created_at", "Lcom/robinhood/models/db/TransferDirection;", "direction", "early_access_amount", "j$/time/LocalDate", "expected_landing_date", "expected_landing_datetime", "expected_sweep_at", "fees", "Ljava/util/UUID;", "id", "investment_schedule_id", "", "managed_by_ph", "Lcom/robinhood/transfers/api/AchTransferRhsState;", "rhs_state", "Lcom/robinhood/android/models/transfer/shared/AchTransferState;", "state", "status_description", "updated_at", "Lcom/robinhood/models/util/Money;", "enoki_amount", "enoki_removal_fee", "clawback_amount", "clawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "grace_period_content", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "gold_deposit_boost", "<init>", "(Lokhttp3/HttpUrl;Ljava/math/BigDecimal;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/models/db/TransferDirection;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;Lj$/time/Instant;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/transfers/api/AchTransferRhsState;Lcom/robinhood/android/models/transfer/shared/AchTransferState;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lokhttp3/HttpUrl;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Ljava/lang/String;", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/models/db/TransferDirection;", "component6", "component7", "()Lj$/time/LocalDate;", "component8", "component9", "component10", "component11", "()Ljava/util/UUID;", "component12", "component13", "()Z", "component14", "()Lcom/robinhood/transfers/api/AchTransferRhsState;", "component15", "()Lcom/robinhood/android/models/transfer/shared/AchTransferState;", "component16", "component17", "component18", "()Lcom/robinhood/models/util/Money;", "component19", "component20", "component21", "component22", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "component23", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "copy", "(Lokhttp3/HttpUrl;Ljava/math/BigDecimal;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/models/db/TransferDirection;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;Lj$/time/Instant;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/transfers/api/AchTransferRhsState;Lcom/robinhood/android/models/transfer/shared/AchTransferState;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/HttpUrl;", "getAch_relationship", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCancel", "Lj$/time/Instant;", "getCreated_at", "Lcom/robinhood/models/db/TransferDirection;", "getDirection", "getEarly_access_amount", "Lj$/time/LocalDate;", "getExpected_landing_date", "getExpected_landing_datetime", "getExpected_sweep_at", "getFees", "Ljava/util/UUID;", "getId", "getInvestment_schedule_id", "Z", "getManaged_by_ph", "Lcom/robinhood/transfers/api/AchTransferRhsState;", "getRhs_state", "Lcom/robinhood/android/models/transfer/shared/AchTransferState;", "getState", "getStatus_description", "getUpdated_at", "Lcom/robinhood/models/util/Money;", "getEnoki_amount", "getEnoki_removal_fee", "getClawback_amount", "getClawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGrace_period_content", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getGold_deposit_boost", "getAchRelationshipId", "achRelationshipId", "Request", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiAchTransfer implements ApiCurrencyOwner, ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer, ApiEnokiTransfer {
        public static final Parcelable.Creator<ApiAchTransfer> CREATOR = new Creator();
        private final HttpUrl ach_relationship;
        private final BigDecimal amount;
        private final String cancel;
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final Instant created_at;
        private final TransferDirection direction;
        private final BigDecimal early_access_amount;
        private final Money enoki_amount;
        private final Money enoki_removal_fee;
        private final LocalDate expected_landing_date;
        private final Instant expected_landing_datetime;
        private final Instant expected_sweep_at;
        private final BigDecimal fees;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final UUID id;
        private final UUID investment_schedule_id;
        private final boolean managed_by_ph;
        private final AchTransferRhsState rhs_state;
        private final AchTransferState state;
        private final String status_description;
        private final Instant updated_at;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiAchTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiAchTransfer createFromParcel(Parcel parcel) {
                Money money;
                ApiGracePeriodContent apiGracePeriodContentCreateFromParcel;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                HttpUrl httpUrlCreate = HttpUrlParceler.INSTANCE.create(parcel);
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String string2 = parcel.readString();
                Instant instant = (Instant) parcel.readSerializable();
                TransferDirection transferDirectionValueOf = TransferDirection.valueOf(parcel.readString());
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                Instant instant2 = (Instant) parcel.readSerializable();
                Instant instant3 = (Instant) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                UUID uuid = (UUID) parcel.readSerializable();
                UUID uuid2 = (UUID) parcel.readSerializable();
                boolean z = parcel.readInt() != 0;
                AchTransferRhsState achTransferRhsStateValueOf = parcel.readInt() == 0 ? null : AchTransferRhsState.valueOf(parcel.readString());
                AchTransferState achTransferStateValueOf = AchTransferState.valueOf(parcel.readString());
                String string3 = parcel.readString();
                Instant instant4 = (Instant) parcel.readSerializable();
                AchTransferRhsState achTransferRhsState = achTransferRhsStateValueOf;
                Money money2 = (Money) parcel.readParcelable(ApiAchTransfer.class.getClassLoader());
                Money money3 = (Money) parcel.readParcelable(ApiAchTransfer.class.getClassLoader());
                Money money4 = (Money) parcel.readParcelable(ApiAchTransfer.class.getClassLoader());
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    money = money4;
                    apiGracePeriodContentCreateFromParcel = null;
                } else {
                    money = money4;
                    apiGracePeriodContentCreateFromParcel = ApiGracePeriodContent.CREATOR.createFromParcel(parcel);
                }
                return new ApiAchTransfer(httpUrlCreate, bigDecimal, string2, instant, transferDirectionValueOf, bigDecimal2, localDate, instant2, instant3, bigDecimal3, uuid, uuid2, z, achTransferRhsState, achTransferStateValueOf, string3, instant4, money2, money3, money, string4, apiGracePeriodContentCreateFromParcel, (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiAchTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiAchTransfer[] newArray(int i) {
                return new ApiAchTransfer[i];
            }
        }

        public static /* synthetic */ ApiAchTransfer copy$default(ApiAchTransfer apiAchTransfer, HttpUrl httpUrl, BigDecimal bigDecimal, String str, Instant instant, TransferDirection transferDirection, BigDecimal bigDecimal2, LocalDate localDate, Instant instant2, Instant instant3, BigDecimal bigDecimal3, UUID uuid, UUID uuid2, boolean z, AchTransferRhsState achTransferRhsState, AchTransferState achTransferState, String str2, Instant instant4, Money money, Money money2, Money money3, String str3, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, int i, Object obj) {
            ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail2;
            ApiGracePeriodContent apiGracePeriodContent2;
            HttpUrl httpUrl2 = (i & 1) != 0 ? apiAchTransfer.ach_relationship : httpUrl;
            BigDecimal bigDecimal4 = (i & 2) != 0 ? apiAchTransfer.amount : bigDecimal;
            String str4 = (i & 4) != 0 ? apiAchTransfer.cancel : str;
            Instant instant5 = (i & 8) != 0 ? apiAchTransfer.created_at : instant;
            TransferDirection transferDirection2 = (i & 16) != 0 ? apiAchTransfer.direction : transferDirection;
            BigDecimal bigDecimal5 = (i & 32) != 0 ? apiAchTransfer.early_access_amount : bigDecimal2;
            LocalDate localDate2 = (i & 64) != 0 ? apiAchTransfer.expected_landing_date : localDate;
            Instant instant6 = (i & 128) != 0 ? apiAchTransfer.expected_landing_datetime : instant2;
            Instant instant7 = (i & 256) != 0 ? apiAchTransfer.expected_sweep_at : instant3;
            BigDecimal bigDecimal6 = (i & 512) != 0 ? apiAchTransfer.fees : bigDecimal3;
            UUID uuid3 = (i & 1024) != 0 ? apiAchTransfer.id : uuid;
            UUID uuid4 = (i & 2048) != 0 ? apiAchTransfer.investment_schedule_id : uuid2;
            boolean z2 = (i & 4096) != 0 ? apiAchTransfer.managed_by_ph : z;
            AchTransferRhsState achTransferRhsState2 = (i & 8192) != 0 ? apiAchTransfer.rhs_state : achTransferRhsState;
            HttpUrl httpUrl3 = httpUrl2;
            AchTransferState achTransferState2 = (i & 16384) != 0 ? apiAchTransfer.state : achTransferState;
            String str5 = (i & 32768) != 0 ? apiAchTransfer.status_description : str2;
            Instant instant8 = (i & 65536) != 0 ? apiAchTransfer.updated_at : instant4;
            Money money4 = (i & 131072) != 0 ? apiAchTransfer.enoki_amount : money;
            Money money5 = (i & 262144) != 0 ? apiAchTransfer.enoki_removal_fee : money2;
            Money money6 = (i & 524288) != 0 ? apiAchTransfer.clawback_amount : money3;
            String str6 = (i & 1048576) != 0 ? apiAchTransfer.clawback_amount_explanation : str3;
            ApiGracePeriodContent apiGracePeriodContent3 = (i & 2097152) != 0 ? apiAchTransfer.grace_period_content : apiGracePeriodContent;
            if ((i & 4194304) != 0) {
                apiGracePeriodContent2 = apiGracePeriodContent3;
                apiGoldDepositBoostTransferDetail2 = apiAchTransfer.gold_deposit_boost;
            } else {
                apiGoldDepositBoostTransferDetail2 = apiGoldDepositBoostTransferDetail;
                apiGracePeriodContent2 = apiGracePeriodContent3;
            }
            return apiAchTransfer.copy(httpUrl3, bigDecimal4, str4, instant5, transferDirection2, bigDecimal5, localDate2, instant6, instant7, bigDecimal6, uuid3, uuid4, z2, achTransferRhsState2, achTransferState2, str5, instant8, money4, money5, money6, str6, apiGracePeriodContent2, apiGoldDepositBoostTransferDetail2);
        }

        /* renamed from: component1, reason: from getter */
        public final HttpUrl getAch_relationship() {
            return this.ach_relationship;
        }

        /* renamed from: component10, reason: from getter */
        public final BigDecimal getFees() {
            return this.fees;
        }

        /* renamed from: component11, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component12, reason: from getter */
        public final UUID getInvestment_schedule_id() {
            return this.investment_schedule_id;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getManaged_by_ph() {
            return this.managed_by_ph;
        }

        /* renamed from: component14, reason: from getter */
        public final AchTransferRhsState getRhs_state() {
            return this.rhs_state;
        }

        /* renamed from: component15, reason: from getter */
        public final AchTransferState getState() {
            return this.state;
        }

        /* renamed from: component16, reason: from getter */
        public final String getStatus_description() {
            return this.status_description;
        }

        /* renamed from: component17, reason: from getter */
        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component18, reason: from getter */
        public final Money getEnoki_amount() {
            return this.enoki_amount;
        }

        /* renamed from: component19, reason: from getter */
        public final Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component20, reason: from getter */
        public final Money getClawback_amount() {
            return this.clawback_amount;
        }

        /* renamed from: component21, reason: from getter */
        public final String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        /* renamed from: component22, reason: from getter */
        public final ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        /* renamed from: component23, reason: from getter */
        public final ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCancel() {
            return this.cancel;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getEarly_access_amount() {
            return this.early_access_amount;
        }

        /* renamed from: component7, reason: from getter */
        public final LocalDate getExpected_landing_date() {
            return this.expected_landing_date;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getExpected_landing_datetime() {
            return this.expected_landing_datetime;
        }

        /* renamed from: component9, reason: from getter */
        public final Instant getExpected_sweep_at() {
            return this.expected_sweep_at;
        }

        public final ApiAchTransfer copy(HttpUrl ach_relationship, BigDecimal amount, String cancel, Instant created_at, TransferDirection direction, BigDecimal early_access_amount, LocalDate expected_landing_date, Instant expected_landing_datetime, Instant expected_sweep_at, BigDecimal fees, UUID id, UUID investment_schedule_id, boolean managed_by_ph, AchTransferRhsState rhs_state, AchTransferState state, String status_description, Instant updated_at, Money enoki_amount, Money enoki_removal_fee, Money clawback_amount, String clawback_amount_explanation, ApiGracePeriodContent grace_period_content, ApiGoldDepositBoostTransferDetail gold_deposit_boost) {
            Intrinsics.checkNotNullParameter(ach_relationship, "ach_relationship");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(early_access_amount, "early_access_amount");
            Intrinsics.checkNotNullParameter(expected_landing_date, "expected_landing_date");
            Intrinsics.checkNotNullParameter(expected_landing_datetime, "expected_landing_datetime");
            Intrinsics.checkNotNullParameter(fees, "fees");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            return new ApiAchTransfer(ach_relationship, amount, cancel, created_at, direction, early_access_amount, expected_landing_date, expected_landing_datetime, expected_sweep_at, fees, id, investment_schedule_id, managed_by_ph, rhs_state, state, status_description, updated_at, enoki_amount, enoki_removal_fee, clawback_amount, clawback_amount_explanation, grace_period_content, gold_deposit_boost);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiAchTransfer)) {
                return false;
            }
            ApiAchTransfer apiAchTransfer = (ApiAchTransfer) other;
            return Intrinsics.areEqual(this.ach_relationship, apiAchTransfer.ach_relationship) && Intrinsics.areEqual(this.amount, apiAchTransfer.amount) && Intrinsics.areEqual(this.cancel, apiAchTransfer.cancel) && Intrinsics.areEqual(this.created_at, apiAchTransfer.created_at) && this.direction == apiAchTransfer.direction && Intrinsics.areEqual(this.early_access_amount, apiAchTransfer.early_access_amount) && Intrinsics.areEqual(this.expected_landing_date, apiAchTransfer.expected_landing_date) && Intrinsics.areEqual(this.expected_landing_datetime, apiAchTransfer.expected_landing_datetime) && Intrinsics.areEqual(this.expected_sweep_at, apiAchTransfer.expected_sweep_at) && Intrinsics.areEqual(this.fees, apiAchTransfer.fees) && Intrinsics.areEqual(this.id, apiAchTransfer.id) && Intrinsics.areEqual(this.investment_schedule_id, apiAchTransfer.investment_schedule_id) && this.managed_by_ph == apiAchTransfer.managed_by_ph && this.rhs_state == apiAchTransfer.rhs_state && this.state == apiAchTransfer.state && Intrinsics.areEqual(this.status_description, apiAchTransfer.status_description) && Intrinsics.areEqual(this.updated_at, apiAchTransfer.updated_at) && Intrinsics.areEqual(this.enoki_amount, apiAchTransfer.enoki_amount) && Intrinsics.areEqual(this.enoki_removal_fee, apiAchTransfer.enoki_removal_fee) && Intrinsics.areEqual(this.clawback_amount, apiAchTransfer.clawback_amount) && Intrinsics.areEqual(this.clawback_amount_explanation, apiAchTransfer.clawback_amount_explanation) && Intrinsics.areEqual(this.grace_period_content, apiAchTransfer.grace_period_content) && Intrinsics.areEqual(this.gold_deposit_boost, apiAchTransfer.gold_deposit_boost);
        }

        public int hashCode() {
            int iHashCode = ((this.ach_relationship.hashCode() * 31) + this.amount.hashCode()) * 31;
            String str = this.cancel;
            int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.created_at.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.early_access_amount.hashCode()) * 31) + this.expected_landing_date.hashCode()) * 31) + this.expected_landing_datetime.hashCode()) * 31;
            Instant instant = this.expected_sweep_at;
            int iHashCode3 = (((((iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31) + this.fees.hashCode()) * 31) + this.id.hashCode()) * 31;
            UUID uuid = this.investment_schedule_id;
            int iHashCode4 = (((iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.managed_by_ph)) * 31;
            AchTransferRhsState achTransferRhsState = this.rhs_state;
            int iHashCode5 = (((iHashCode4 + (achTransferRhsState == null ? 0 : achTransferRhsState.hashCode())) * 31) + this.state.hashCode()) * 31;
            String str2 = this.status_description;
            int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.updated_at.hashCode()) * 31;
            Money money = this.enoki_amount;
            int iHashCode7 = (iHashCode6 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.enoki_removal_fee;
            int iHashCode8 = (iHashCode7 + (money2 == null ? 0 : money2.hashCode())) * 31;
            Money money3 = this.clawback_amount;
            int iHashCode9 = (iHashCode8 + (money3 == null ? 0 : money3.hashCode())) * 31;
            String str3 = this.clawback_amount_explanation;
            int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            int iHashCode11 = (iHashCode10 + (apiGracePeriodContent == null ? 0 : apiGracePeriodContent.hashCode())) * 31;
            ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail = this.gold_deposit_boost;
            return iHashCode11 + (apiGoldDepositBoostTransferDetail != null ? apiGoldDepositBoostTransferDetail.hashCode() : 0);
        }

        public String toString() {
            return "ApiAchTransfer(ach_relationship=" + this.ach_relationship + ", amount=" + this.amount + ", cancel=" + this.cancel + ", created_at=" + this.created_at + ", direction=" + this.direction + ", early_access_amount=" + this.early_access_amount + ", expected_landing_date=" + this.expected_landing_date + ", expected_landing_datetime=" + this.expected_landing_datetime + ", expected_sweep_at=" + this.expected_sweep_at + ", fees=" + this.fees + ", id=" + this.id + ", investment_schedule_id=" + this.investment_schedule_id + ", managed_by_ph=" + this.managed_by_ph + ", rhs_state=" + this.rhs_state + ", state=" + this.state + ", status_description=" + this.status_description + ", updated_at=" + this.updated_at + ", enoki_amount=" + this.enoki_amount + ", enoki_removal_fee=" + this.enoki_removal_fee + ", clawback_amount=" + this.clawback_amount + ", clawback_amount_explanation=" + this.clawback_amount_explanation + ", grace_period_content=" + this.grace_period_content + ", gold_deposit_boost=" + this.gold_deposit_boost + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            HttpUrlParceler.INSTANCE.write(this.ach_relationship, dest, flags);
            dest.writeSerializable(this.amount);
            dest.writeString(this.cancel);
            dest.writeSerializable(this.created_at);
            dest.writeString(this.direction.name());
            dest.writeSerializable(this.early_access_amount);
            dest.writeSerializable(this.expected_landing_date);
            dest.writeSerializable(this.expected_landing_datetime);
            dest.writeSerializable(this.expected_sweep_at);
            dest.writeSerializable(this.fees);
            dest.writeSerializable(this.id);
            dest.writeSerializable(this.investment_schedule_id);
            dest.writeInt(this.managed_by_ph ? 1 : 0);
            AchTransferRhsState achTransferRhsState = this.rhs_state;
            if (achTransferRhsState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(achTransferRhsState.name());
            }
            dest.writeString(this.state.name());
            dest.writeString(this.status_description);
            dest.writeSerializable(this.updated_at);
            dest.writeParcelable(this.enoki_amount, flags);
            dest.writeParcelable(this.enoki_removal_fee, flags);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        @Override // com.robinhood.models.util.ApiCurrencyOwner
        public java.util.Currency getCurrency_code() {
            return ApiCurrencyOwner.DefaultImpls.getCurrency_code(this);
        }

        @Override // com.robinhood.models.util.ApiCurrencyOwner
        public <R> R withCurrencyContext(ApiCurrencyOwner apiCurrencyOwner, Function1<? super CurrencyContext, ? extends R> function1) {
            return (R) ApiCurrencyOwner.DefaultImpls.withCurrencyContext(this, apiCurrencyOwner, function1);
        }

        public ApiAchTransfer(HttpUrl ach_relationship, BigDecimal amount, String str, Instant created_at, TransferDirection direction, BigDecimal early_access_amount, LocalDate expected_landing_date, Instant expected_landing_datetime, Instant instant, BigDecimal fees, UUID id, UUID uuid, boolean z, AchTransferRhsState achTransferRhsState, AchTransferState state, String str2, Instant updated_at, Money money, Money money2, Money money3, String str3, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            Intrinsics.checkNotNullParameter(ach_relationship, "ach_relationship");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(early_access_amount, "early_access_amount");
            Intrinsics.checkNotNullParameter(expected_landing_date, "expected_landing_date");
            Intrinsics.checkNotNullParameter(expected_landing_datetime, "expected_landing_datetime");
            Intrinsics.checkNotNullParameter(fees, "fees");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            this.ach_relationship = ach_relationship;
            this.amount = amount;
            this.cancel = str;
            this.created_at = created_at;
            this.direction = direction;
            this.early_access_amount = early_access_amount;
            this.expected_landing_date = expected_landing_date;
            this.expected_landing_datetime = expected_landing_datetime;
            this.expected_sweep_at = instant;
            this.fees = fees;
            this.id = id;
            this.investment_schedule_id = uuid;
            this.managed_by_ph = z;
            this.rhs_state = achTransferRhsState;
            this.state = state;
            this.status_description = str2;
            this.updated_at = updated_at;
            this.enoki_amount = money;
            this.enoki_removal_fee = money2;
            this.clawback_amount = money3;
            this.clawback_amount_explanation = str3;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        public /* synthetic */ ApiAchTransfer(HttpUrl httpUrl, BigDecimal bigDecimal, String str, Instant instant, TransferDirection transferDirection, BigDecimal bigDecimal2, LocalDate localDate, Instant instant2, Instant instant3, BigDecimal bigDecimal3, UUID uuid, UUID uuid2, boolean z, AchTransferRhsState achTransferRhsState, AchTransferState achTransferState, String str2, Instant instant4, Money money, Money money2, Money money3, String str3, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(httpUrl, bigDecimal, str, instant, transferDirection, bigDecimal2, localDate, instant2, instant3, bigDecimal3, uuid, uuid2, (i & 4096) != 0 ? false : z, achTransferRhsState, achTransferState, str2, instant4, money, money2, money3, str3, apiGracePeriodContent, apiGoldDepositBoostTransferDetail);
        }

        public final HttpUrl getAch_relationship() {
            return this.ach_relationship;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCancel() {
            return this.cancel;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final TransferDirection getDirection() {
            return this.direction;
        }

        public final BigDecimal getEarly_access_amount() {
            return this.early_access_amount;
        }

        public final LocalDate getExpected_landing_date() {
            return this.expected_landing_date;
        }

        public final Instant getExpected_landing_datetime() {
            return this.expected_landing_datetime;
        }

        public final Instant getExpected_sweep_at() {
            return this.expected_sweep_at;
        }

        public final BigDecimal getFees() {
            return this.fees;
        }

        public final UUID getId() {
            return this.id;
        }

        public final UUID getInvestment_schedule_id() {
            return this.investment_schedule_id;
        }

        public final boolean getManaged_by_ph() {
            return this.managed_by_ph;
        }

        public final AchTransferRhsState getRhs_state() {
            return this.rhs_state;
        }

        public final AchTransferState getState() {
            return this.state;
        }

        public final String getStatus_description() {
            return this.status_description;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_amount() {
            return this.enoki_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }

        /* compiled from: ApiPaymentTransferDetails.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer$Request;", "", "ach_relationship", "", "amount", "Ljava/math/BigDecimal;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "ref_id", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/TransferDirection;Ljava/util/UUID;)V", "getAch_relationship", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getRef_id", "()Ljava/util/UUID;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Request {
            private final String ach_relationship;
            private final BigDecimal amount;
            private final TransferDirection direction;
            private final UUID ref_id;

            public Request(String ach_relationship, BigDecimal amount, TransferDirection direction, UUID ref_id) {
                Intrinsics.checkNotNullParameter(ach_relationship, "ach_relationship");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(ref_id, "ref_id");
                this.ach_relationship = ach_relationship;
                this.amount = amount;
                this.direction = direction;
                this.ref_id = ref_id;
            }

            public final String getAch_relationship() {
                return this.ach_relationship;
            }

            public final BigDecimal getAmount() {
                return this.amount;
            }

            public final TransferDirection getDirection() {
                return this.direction;
            }

            public final UUID getRef_id() {
                return this.ref_id;
            }
        }

        public final UUID getAchRelationshipId() {
            return StringsKt.toUuid(HttpUrls.lastNonEmptyPathSegment(this.ach_relationship));
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiCheckTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "j$/time/LocalDate", "limitation_release_date", "", "remitter_name", "Ljava/math/BigDecimal;", "return_fees", "Lcom/robinhood/models/util/Money;", "enoki_amount", "enoki_removal_fee", "<init>", "(Lj$/time/LocalDate;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lj$/time/LocalDate;", "getLimitation_release_date", "()Lj$/time/LocalDate;", "Ljava/lang/String;", "getRemitter_name", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getReturn_fees", "()Ljava/math/BigDecimal;", "Lcom/robinhood/models/util/Money;", "getEnoki_amount", "()Lcom/robinhood/models/util/Money;", "getEnoki_removal_fee", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiCheckTransfer implements ApiPaymentTransferDetails, ApiEnokiTransfer {
        public static final Parcelable.Creator<ApiCheckTransfer> CREATOR = new Creator();
        private final Money enoki_amount;
        private final Money enoki_removal_fee;
        private final LocalDate limitation_release_date;
        private final String remitter_name;
        private final BigDecimal return_fees;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiCheckTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiCheckTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiCheckTransfer((LocalDate) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (Money) parcel.readParcelable(ApiCheckTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiCheckTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiCheckTransfer[] newArray(int i) {
                return new ApiCheckTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.limitation_release_date);
            dest.writeString(this.remitter_name);
            dest.writeSerializable(this.return_fees);
            dest.writeParcelable(this.enoki_amount, flags);
            dest.writeParcelable(this.enoki_removal_fee, flags);
        }

        public ApiCheckTransfer(LocalDate localDate, String remitter_name, BigDecimal bigDecimal, Money money, Money money2) {
            Intrinsics.checkNotNullParameter(remitter_name, "remitter_name");
            this.limitation_release_date = localDate;
            this.remitter_name = remitter_name;
            this.return_fees = bigDecimal;
            this.enoki_amount = money;
            this.enoki_removal_fee = money2;
        }

        public /* synthetic */ ApiCheckTransfer(LocalDate localDate, String str, BigDecimal bigDecimal, Money money, Money money2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(localDate, str, bigDecimal, money, (i & 16) != 0 ? null : money2);
        }

        public final LocalDate getLimitation_release_date() {
            return this.limitation_release_date;
        }

        public final String getRemitter_name() {
            return this.remitter_name;
        }

        public final BigDecimal getReturn_fees() {
            return this.return_fees;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_amount() {
            return this.enoki_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiDebitCardTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "state", "Lcom/robinhood/transfers/api/DebitCardTransferState;", "clawback_amount", "Lcom/robinhood/models/util/Money;", "clawback_amount_explanation", "", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "<init>", "(Lcom/robinhood/transfers/api/DebitCardTransferState;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "getState", "()Lcom/robinhood/transfers/api/DebitCardTransferState;", "getClawback_amount", "()Lcom/robinhood/models/util/Money;", "getClawback_amount_explanation", "()Ljava/lang/String;", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiDebitCardTransfer implements ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer {
        public static final Parcelable.Creator<ApiDebitCardTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final DebitCardTransferState state;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiDebitCardTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiDebitCardTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiDebitCardTransfer(DebitCardTransferState.valueOf(parcel.readString()), (Money) parcel.readParcelable(ApiDebitCardTransfer.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ApiGracePeriodContent.CREATOR.createFromParcel(parcel), (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiDebitCardTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiDebitCardTransfer[] newArray(int i) {
                return new ApiDebitCardTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.state.name());
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        public ApiDebitCardTransfer(DebitCardTransferState state, Money money, String str, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.clawback_amount = money;
            this.clawback_amount_explanation = str;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        public final DebitCardTransferState getState() {
            return this.state;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiIncomingWireTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "originating_bank_name", "", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "clawback_amount", "Lcom/robinhood/models/util/Money;", "clawback_amount_explanation", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;)V", "getOriginating_bank_name", "()Ljava/lang/String;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getClawback_amount", "()Lcom/robinhood/models/util/Money;", "getClawback_amount_explanation", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiIncomingWireTransfer implements ApiPaymentTransferDetails, ApiGoldDepositBoostTransfer, ApiClawbackTransfer {
        public static final Parcelable.Creator<ApiIncomingWireTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final String originating_bank_name;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiIncomingWireTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiIncomingWireTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiIncomingWireTransfer(parcel.readString(), (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiIncomingWireTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiIncomingWireTransfer.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ApiGracePeriodContent.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiIncomingWireTransfer[] newArray(int i) {
                return new ApiIncomingWireTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.originating_bank_name);
            dest.writeParcelable(this.gold_deposit_boost, flags);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
        }

        public ApiIncomingWireTransfer(String str, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, Money money, String str2, ApiGracePeriodContent apiGracePeriodContent) {
            this.originating_bank_name = str;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
            this.clawback_amount = money;
            this.clawback_amount_explanation = str2;
            this.grace_period_content = apiGracePeriodContent;
        }

        public final String getOriginating_bank_name() {
            return this.originating_bank_name;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiOutgoingWireTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "id", "Ljava/util/UUID;", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "clawback_amount", "Lcom/robinhood/models/util/Money;", "clawback_amount_explanation", "", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;)V", "getId", "()Ljava/util/UUID;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getClawback_amount", "()Lcom/robinhood/models/util/Money;", "getClawback_amount_explanation", "()Ljava/lang/String;", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiOutgoingWireTransfer implements ApiPaymentTransferDetails, ApiGoldDepositBoostTransfer, ApiClawbackTransfer {
        public static final Parcelable.Creator<ApiOutgoingWireTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final UUID id;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiOutgoingWireTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiOutgoingWireTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiOutgoingWireTransfer((UUID) parcel.readSerializable(), (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiOutgoingWireTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiOutgoingWireTransfer.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ApiGracePeriodContent.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiOutgoingWireTransfer[] newArray(int i) {
                return new ApiOutgoingWireTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeParcelable(this.gold_deposit_boost, flags);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
        }

        public ApiOutgoingWireTransfer(UUID id, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, Money money, String str, ApiGracePeriodContent apiGracePeriodContent) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
            this.clawback_amount = money;
            this.clawback_amount_explanation = str;
            this.grace_period_content = apiGracePeriodContent;
        }

        public final UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInstantBankTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "error_details", "", "source_transfer_id", "requested_amount", "Ljava/math/BigDecimal;", "rfp_error_state", "Lcom/robinhood/transfers/api/RfpError;", "clawback_amount", "Lcom/robinhood/models/util/Money;", "clawback_amount_explanation", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/transfers/api/RfpError;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "getError_details", "()Ljava/lang/String;", "getSource_transfer_id", "getRequested_amount", "()Ljava/math/BigDecimal;", "getRfp_error_state", "()Lcom/robinhood/transfers/api/RfpError;", "getClawback_amount", "()Lcom/robinhood/models/util/Money;", "getClawback_amount_explanation", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiInstantBankTransfer implements ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer {
        public static final Parcelable.Creator<ApiInstantBankTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final String error_details;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final BigDecimal requested_amount;
        private final RfpError rfp_error_state;
        private final String source_transfer_id;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiInstantBankTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiInstantBankTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiInstantBankTransfer(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : RfpError.valueOf(parcel.readString()), (Money) parcel.readParcelable(ApiInstantBankTransfer.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? ApiGracePeriodContent.CREATOR.createFromParcel(parcel) : null, (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiInstantBankTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiInstantBankTransfer[] newArray(int i) {
                return new ApiInstantBankTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.error_details);
            dest.writeString(this.source_transfer_id);
            dest.writeSerializable(this.requested_amount);
            RfpError rfpError = this.rfp_error_state;
            if (rfpError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(rfpError.name());
            }
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        public ApiInstantBankTransfer(String str, String str2, BigDecimal bigDecimal, RfpError rfpError, Money money, String str3, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            this.error_details = str;
            this.source_transfer_id = str2;
            this.requested_amount = bigDecimal;
            this.rfp_error_state = rfpError;
            this.clawback_amount = money;
            this.clawback_amount_explanation = str3;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        public final String getError_details() {
            return this.error_details;
        }

        public final String getSource_transfer_id() {
            return this.source_transfer_id;
        }

        public final BigDecimal getRequested_amount() {
            return this.requested_amount;
        }

        public final RfpError getRfp_error_state() {
            return this.rfp_error_state;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bé\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010 \u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u001d\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020-¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b:\u00105J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b?\u00105J\u0010\u0010@\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bF\u00105J\u0010\u0010G\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bG\u00107J\u0010\u0010H\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bH\u00109J\u0012\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bI\u00105J\u0010\u0010J\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bJ\u0010>J\u0012\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bK\u0010<J\u0012\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bL\u00105J\u0010\u0010M\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bM\u00105J\u0012\u0010N\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bR\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bS\u0010QJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bT\u00105J\u0012\u0010U\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bW\u0010XJ¤\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b[\u00105J\u0010\u0010\\\u001a\u00020-HÖ\u0001¢\u0006\u0004\b\\\u00103J\u001a\u0010_\u001a\u00020\f2\b\u0010^\u001a\u0004\u0018\u00010]HÖ\u0003¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010a\u001a\u0004\bb\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\bd\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010e\u001a\u0004\bf\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bg\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010h\u001a\u0004\bi\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010j\u001a\u0004\bk\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bl\u00105R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010m\u001a\u0004\bn\u0010AR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010o\u001a\u0004\bp\u0010CR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010q\u001a\u0004\br\u0010ER\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bs\u00105R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010c\u001a\u0004\bt\u00107R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bu\u00109R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\bv\u00105R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010j\u001a\u0004\bw\u0010>R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bx\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010a\u001a\u0004\by\u00105R\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010a\u001a\u0004\bz\u00105R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010{\u001a\u0004\b|\u0010OR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010}\u001a\u0004\b~\u0010QR\u001c\u0010\"\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010}\u001a\u0004\b\u007f\u0010QR\u001d\u0010#\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b#\u0010}\u001a\u0005\b\u0080\u0001\u0010QR\u001d\u0010$\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\b$\u0010a\u001a\u0005\b\u0081\u0001\u00105R\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010VR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010X¨\u0006\u0086\u0001"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInternalTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "", "dest_account_id", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "dest_account_type", "Lcom/robinhood/transfers/api/RHEntity;", "dest_entity", "dest_hold_id", "", "dest_place_hold", "j$/time/LocalDate", "dest_record_date", "dest_user_id", "forced", "Lcom/robinhood/transfers/api/OriginatorType;", "originator", "Lcom/robinhood/transfers/api/TransferPurpose;", "purpose", "source_account_id", "source_account_type", "source_entity", "source_hold_id", "source_record_date", "source_release_hold", "source_user_id", "version", "Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;", "paycheck_investment_info", "Lcom/robinhood/models/util/Money;", "enoki_amount", "enoki_removal_fee", "clawback_amount", "clawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "grace_period_content", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "gold_deposit_boost", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/RHEntity;Ljava/lang/String;Ljava/lang/Boolean;Lj$/time/LocalDate;Ljava/lang/String;ZLcom/robinhood/transfers/api/OriginatorType;Lcom/robinhood/transfers/api/TransferPurpose;Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/RHEntity;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/android/models/transfer/shared/AccountType;", "component3", "()Lcom/robinhood/transfers/api/RHEntity;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lj$/time/LocalDate;", "component7", "component8", "()Z", "component9", "()Lcom/robinhood/transfers/api/OriginatorType;", "component10", "()Lcom/robinhood/transfers/api/TransferPurpose;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;", "component20", "()Lcom/robinhood/models/util/Money;", "component21", "component22", "component23", "component24", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "component25", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "copy", "(Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/RHEntity;Ljava/lang/String;Ljava/lang/Boolean;Lj$/time/LocalDate;Ljava/lang/String;ZLcom/robinhood/transfers/api/OriginatorType;Lcom/robinhood/transfers/api/TransferPurpose;Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/RHEntity;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInternalTransfer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDest_account_id", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "getDest_account_type", "Lcom/robinhood/transfers/api/RHEntity;", "getDest_entity", "getDest_hold_id", "Ljava/lang/Boolean;", "getDest_place_hold", "Lj$/time/LocalDate;", "getDest_record_date", "getDest_user_id", "Z", "getForced", "Lcom/robinhood/transfers/api/OriginatorType;", "getOriginator", "Lcom/robinhood/transfers/api/TransferPurpose;", "getPurpose", "getSource_account_id", "getSource_account_type", "getSource_entity", "getSource_hold_id", "getSource_record_date", "getSource_release_hold", "getSource_user_id", "getVersion", "Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;", "getPaycheck_investment_info", "Lcom/robinhood/models/util/Money;", "getEnoki_amount", "getEnoki_removal_fee", "getClawback_amount", "getClawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGrace_period_content", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getGold_deposit_boost", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiInternalTransfer implements ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer, ApiEnokiTransfer {
        public static final Parcelable.Creator<ApiInternalTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final String dest_account_id;
        private final AccountType dest_account_type;
        private final RHEntity dest_entity;
        private final String dest_hold_id;
        private final Boolean dest_place_hold;
        private final LocalDate dest_record_date;
        private final String dest_user_id;
        private final Money enoki_amount;
        private final Money enoki_removal_fee;
        private final boolean forced;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final OriginatorType originator;
        private final ApiPaycheckInvestmentInfo paycheck_investment_info;
        private final TransferPurpose purpose;
        private final String source_account_id;
        private final AccountType source_account_type;
        private final RHEntity source_entity;
        private final String source_hold_id;
        private final LocalDate source_record_date;
        private final Boolean source_release_hold;
        private final String source_user_id;
        private final String version;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiInternalTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiInternalTransfer createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                boolean z;
                LocalDate localDate;
                boolean z2;
                Boolean boolValueOf2;
                ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfoCreateFromParcel;
                Money money;
                ApiGracePeriodContent apiGracePeriodContentCreateFromParcel;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                AccountType accountTypeValueOf = AccountType.valueOf(parcel.readString());
                RHEntity rHEntityValueOf = RHEntity.valueOf(parcel.readString());
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                    localDate = localDate2;
                    z2 = true;
                } else {
                    z = true;
                    localDate = localDate2;
                    z2 = false;
                }
                OriginatorType originatorTypeValueOf = OriginatorType.valueOf(parcel.readString());
                TransferPurpose transferPurposeValueOf = TransferPurpose.valueOf(parcel.readString());
                String string5 = parcel.readString();
                AccountType accountTypeValueOf2 = AccountType.valueOf(parcel.readString());
                RHEntity rHEntityValueOf2 = RHEntity.valueOf(parcel.readString());
                boolean z3 = z;
                String string6 = parcel.readString();
                LocalDate localDate3 = (LocalDate) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    apiPaycheckInvestmentInfoCreateFromParcel = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : false);
                    apiPaycheckInvestmentInfoCreateFromParcel = null;
                }
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    apiPaycheckInvestmentInfoCreateFromParcel = ApiPaycheckInvestmentInfo.CREATOR.createFromParcel(parcel);
                }
                ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo = apiPaycheckInvestmentInfoCreateFromParcel;
                Boolean bool = boolValueOf;
                Money money2 = (Money) parcel.readParcelable(ApiInternalTransfer.class.getClassLoader());
                Money money3 = (Money) parcel.readParcelable(ApiInternalTransfer.class.getClassLoader());
                Money money4 = (Money) parcel.readParcelable(ApiInternalTransfer.class.getClassLoader());
                String string9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    money = money4;
                    apiGracePeriodContentCreateFromParcel = null;
                } else {
                    money = money4;
                    apiGracePeriodContentCreateFromParcel = ApiGracePeriodContent.CREATOR.createFromParcel(parcel);
                }
                return new ApiInternalTransfer(string2, accountTypeValueOf, rHEntityValueOf, string3, bool, localDate, string4, z2, originatorTypeValueOf, transferPurposeValueOf, string5, accountTypeValueOf2, rHEntityValueOf2, string6, localDate3, boolValueOf2, string7, string8, apiPaycheckInvestmentInfo, money2, money3, money, string9, apiGracePeriodContentCreateFromParcel, (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiInternalTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiInternalTransfer[] newArray(int i) {
                return new ApiInternalTransfer[i];
            }
        }

        public static /* synthetic */ ApiInternalTransfer copy$default(ApiInternalTransfer apiInternalTransfer, String str, AccountType accountType, RHEntity rHEntity, String str2, Boolean bool, LocalDate localDate, String str3, boolean z, OriginatorType originatorType, TransferPurpose transferPurpose, String str4, AccountType accountType2, RHEntity rHEntity2, String str5, LocalDate localDate2, Boolean bool2, String str6, String str7, ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo, Money money, Money money2, Money money3, String str8, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, int i, Object obj) {
            ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail2;
            ApiGracePeriodContent apiGracePeriodContent2;
            String str9 = (i & 1) != 0 ? apiInternalTransfer.dest_account_id : str;
            AccountType accountType3 = (i & 2) != 0 ? apiInternalTransfer.dest_account_type : accountType;
            RHEntity rHEntity3 = (i & 4) != 0 ? apiInternalTransfer.dest_entity : rHEntity;
            String str10 = (i & 8) != 0 ? apiInternalTransfer.dest_hold_id : str2;
            Boolean bool3 = (i & 16) != 0 ? apiInternalTransfer.dest_place_hold : bool;
            LocalDate localDate3 = (i & 32) != 0 ? apiInternalTransfer.dest_record_date : localDate;
            String str11 = (i & 64) != 0 ? apiInternalTransfer.dest_user_id : str3;
            boolean z2 = (i & 128) != 0 ? apiInternalTransfer.forced : z;
            OriginatorType originatorType2 = (i & 256) != 0 ? apiInternalTransfer.originator : originatorType;
            TransferPurpose transferPurpose2 = (i & 512) != 0 ? apiInternalTransfer.purpose : transferPurpose;
            String str12 = (i & 1024) != 0 ? apiInternalTransfer.source_account_id : str4;
            AccountType accountType4 = (i & 2048) != 0 ? apiInternalTransfer.source_account_type : accountType2;
            RHEntity rHEntity4 = (i & 4096) != 0 ? apiInternalTransfer.source_entity : rHEntity2;
            String str13 = (i & 8192) != 0 ? apiInternalTransfer.source_hold_id : str5;
            String str14 = str9;
            LocalDate localDate4 = (i & 16384) != 0 ? apiInternalTransfer.source_record_date : localDate2;
            Boolean bool4 = (i & 32768) != 0 ? apiInternalTransfer.source_release_hold : bool2;
            String str15 = (i & 65536) != 0 ? apiInternalTransfer.source_user_id : str6;
            String str16 = (i & 131072) != 0 ? apiInternalTransfer.version : str7;
            ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo2 = (i & 262144) != 0 ? apiInternalTransfer.paycheck_investment_info : apiPaycheckInvestmentInfo;
            Money money4 = (i & 524288) != 0 ? apiInternalTransfer.enoki_amount : money;
            Money money5 = (i & 1048576) != 0 ? apiInternalTransfer.enoki_removal_fee : money2;
            Money money6 = (i & 2097152) != 0 ? apiInternalTransfer.clawback_amount : money3;
            String str17 = (i & 4194304) != 0 ? apiInternalTransfer.clawback_amount_explanation : str8;
            ApiGracePeriodContent apiGracePeriodContent3 = (i & 8388608) != 0 ? apiInternalTransfer.grace_period_content : apiGracePeriodContent;
            if ((i & 16777216) != 0) {
                apiGracePeriodContent2 = apiGracePeriodContent3;
                apiGoldDepositBoostTransferDetail2 = apiInternalTransfer.gold_deposit_boost;
            } else {
                apiGoldDepositBoostTransferDetail2 = apiGoldDepositBoostTransferDetail;
                apiGracePeriodContent2 = apiGracePeriodContent3;
            }
            return apiInternalTransfer.copy(str14, accountType3, rHEntity3, str10, bool3, localDate3, str11, z2, originatorType2, transferPurpose2, str12, accountType4, rHEntity4, str13, localDate4, bool4, str15, str16, apiPaycheckInvestmentInfo2, money4, money5, money6, str17, apiGracePeriodContent2, apiGoldDepositBoostTransferDetail2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDest_account_id() {
            return this.dest_account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final TransferPurpose getPurpose() {
            return this.purpose;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSource_account_id() {
            return this.source_account_id;
        }

        /* renamed from: component12, reason: from getter */
        public final AccountType getSource_account_type() {
            return this.source_account_type;
        }

        /* renamed from: component13, reason: from getter */
        public final RHEntity getSource_entity() {
            return this.source_entity;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSource_hold_id() {
            return this.source_hold_id;
        }

        /* renamed from: component15, reason: from getter */
        public final LocalDate getSource_record_date() {
            return this.source_record_date;
        }

        /* renamed from: component16, reason: from getter */
        public final Boolean getSource_release_hold() {
            return this.source_release_hold;
        }

        /* renamed from: component17, reason: from getter */
        public final String getSource_user_id() {
            return this.source_user_id;
        }

        /* renamed from: component18, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component19, reason: from getter */
        public final ApiPaycheckInvestmentInfo getPaycheck_investment_info() {
            return this.paycheck_investment_info;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountType getDest_account_type() {
            return this.dest_account_type;
        }

        /* renamed from: component20, reason: from getter */
        public final Money getEnoki_amount() {
            return this.enoki_amount;
        }

        /* renamed from: component21, reason: from getter */
        public final Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }

        /* renamed from: component22, reason: from getter */
        public final Money getClawback_amount() {
            return this.clawback_amount;
        }

        /* renamed from: component23, reason: from getter */
        public final String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        /* renamed from: component24, reason: from getter */
        public final ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        /* renamed from: component25, reason: from getter */
        public final ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }

        /* renamed from: component3, reason: from getter */
        public final RHEntity getDest_entity() {
            return this.dest_entity;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDest_hold_id() {
            return this.dest_hold_id;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getDest_place_hold() {
            return this.dest_place_hold;
        }

        /* renamed from: component6, reason: from getter */
        public final LocalDate getDest_record_date() {
            return this.dest_record_date;
        }

        /* renamed from: component7, reason: from getter */
        public final String getDest_user_id() {
            return this.dest_user_id;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getForced() {
            return this.forced;
        }

        /* renamed from: component9, reason: from getter */
        public final OriginatorType getOriginator() {
            return this.originator;
        }

        public final ApiInternalTransfer copy(String dest_account_id, AccountType dest_account_type, RHEntity dest_entity, String dest_hold_id, Boolean dest_place_hold, LocalDate dest_record_date, String dest_user_id, boolean forced, OriginatorType originator, TransferPurpose purpose, String source_account_id, AccountType source_account_type, RHEntity source_entity, String source_hold_id, LocalDate source_record_date, Boolean source_release_hold, String source_user_id, String version, ApiPaycheckInvestmentInfo paycheck_investment_info, Money enoki_amount, Money enoki_removal_fee, Money clawback_amount, String clawback_amount_explanation, ApiGracePeriodContent grace_period_content, ApiGoldDepositBoostTransferDetail gold_deposit_boost) {
            Intrinsics.checkNotNullParameter(dest_account_id, "dest_account_id");
            Intrinsics.checkNotNullParameter(dest_account_type, "dest_account_type");
            Intrinsics.checkNotNullParameter(dest_entity, "dest_entity");
            Intrinsics.checkNotNullParameter(dest_record_date, "dest_record_date");
            Intrinsics.checkNotNullParameter(originator, "originator");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(source_account_id, "source_account_id");
            Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
            Intrinsics.checkNotNullParameter(source_entity, "source_entity");
            Intrinsics.checkNotNullParameter(source_record_date, "source_record_date");
            Intrinsics.checkNotNullParameter(version, "version");
            return new ApiInternalTransfer(dest_account_id, dest_account_type, dest_entity, dest_hold_id, dest_place_hold, dest_record_date, dest_user_id, forced, originator, purpose, source_account_id, source_account_type, source_entity, source_hold_id, source_record_date, source_release_hold, source_user_id, version, paycheck_investment_info, enoki_amount, enoki_removal_fee, clawback_amount, clawback_amount_explanation, grace_period_content, gold_deposit_boost);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiInternalTransfer)) {
                return false;
            }
            ApiInternalTransfer apiInternalTransfer = (ApiInternalTransfer) other;
            return Intrinsics.areEqual(this.dest_account_id, apiInternalTransfer.dest_account_id) && this.dest_account_type == apiInternalTransfer.dest_account_type && this.dest_entity == apiInternalTransfer.dest_entity && Intrinsics.areEqual(this.dest_hold_id, apiInternalTransfer.dest_hold_id) && Intrinsics.areEqual(this.dest_place_hold, apiInternalTransfer.dest_place_hold) && Intrinsics.areEqual(this.dest_record_date, apiInternalTransfer.dest_record_date) && Intrinsics.areEqual(this.dest_user_id, apiInternalTransfer.dest_user_id) && this.forced == apiInternalTransfer.forced && this.originator == apiInternalTransfer.originator && this.purpose == apiInternalTransfer.purpose && Intrinsics.areEqual(this.source_account_id, apiInternalTransfer.source_account_id) && this.source_account_type == apiInternalTransfer.source_account_type && this.source_entity == apiInternalTransfer.source_entity && Intrinsics.areEqual(this.source_hold_id, apiInternalTransfer.source_hold_id) && Intrinsics.areEqual(this.source_record_date, apiInternalTransfer.source_record_date) && Intrinsics.areEqual(this.source_release_hold, apiInternalTransfer.source_release_hold) && Intrinsics.areEqual(this.source_user_id, apiInternalTransfer.source_user_id) && Intrinsics.areEqual(this.version, apiInternalTransfer.version) && Intrinsics.areEqual(this.paycheck_investment_info, apiInternalTransfer.paycheck_investment_info) && Intrinsics.areEqual(this.enoki_amount, apiInternalTransfer.enoki_amount) && Intrinsics.areEqual(this.enoki_removal_fee, apiInternalTransfer.enoki_removal_fee) && Intrinsics.areEqual(this.clawback_amount, apiInternalTransfer.clawback_amount) && Intrinsics.areEqual(this.clawback_amount_explanation, apiInternalTransfer.clawback_amount_explanation) && Intrinsics.areEqual(this.grace_period_content, apiInternalTransfer.grace_period_content) && Intrinsics.areEqual(this.gold_deposit_boost, apiInternalTransfer.gold_deposit_boost);
        }

        public int hashCode() {
            int iHashCode = ((((this.dest_account_id.hashCode() * 31) + this.dest_account_type.hashCode()) * 31) + this.dest_entity.hashCode()) * 31;
            String str = this.dest_hold_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.dest_place_hold;
            int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.dest_record_date.hashCode()) * 31;
            String str2 = this.dest_user_id;
            int iHashCode4 = (((((((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.forced)) * 31) + this.originator.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.source_account_id.hashCode()) * 31) + this.source_account_type.hashCode()) * 31) + this.source_entity.hashCode()) * 31;
            String str3 = this.source_hold_id;
            int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.source_record_date.hashCode()) * 31;
            Boolean bool2 = this.source_release_hold;
            int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str4 = this.source_user_id;
            int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.version.hashCode()) * 31;
            ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo = this.paycheck_investment_info;
            int iHashCode8 = (iHashCode7 + (apiPaycheckInvestmentInfo == null ? 0 : apiPaycheckInvestmentInfo.hashCode())) * 31;
            Money money = this.enoki_amount;
            int iHashCode9 = (iHashCode8 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.enoki_removal_fee;
            int iHashCode10 = (iHashCode9 + (money2 == null ? 0 : money2.hashCode())) * 31;
            Money money3 = this.clawback_amount;
            int iHashCode11 = (iHashCode10 + (money3 == null ? 0 : money3.hashCode())) * 31;
            String str5 = this.clawback_amount_explanation;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            int iHashCode13 = (iHashCode12 + (apiGracePeriodContent == null ? 0 : apiGracePeriodContent.hashCode())) * 31;
            ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail = this.gold_deposit_boost;
            return iHashCode13 + (apiGoldDepositBoostTransferDetail != null ? apiGoldDepositBoostTransferDetail.hashCode() : 0);
        }

        public String toString() {
            return "ApiInternalTransfer(dest_account_id=" + this.dest_account_id + ", dest_account_type=" + this.dest_account_type + ", dest_entity=" + this.dest_entity + ", dest_hold_id=" + this.dest_hold_id + ", dest_place_hold=" + this.dest_place_hold + ", dest_record_date=" + this.dest_record_date + ", dest_user_id=" + this.dest_user_id + ", forced=" + this.forced + ", originator=" + this.originator + ", purpose=" + this.purpose + ", source_account_id=" + this.source_account_id + ", source_account_type=" + this.source_account_type + ", source_entity=" + this.source_entity + ", source_hold_id=" + this.source_hold_id + ", source_record_date=" + this.source_record_date + ", source_release_hold=" + this.source_release_hold + ", source_user_id=" + this.source_user_id + ", version=" + this.version + ", paycheck_investment_info=" + this.paycheck_investment_info + ", enoki_amount=" + this.enoki_amount + ", enoki_removal_fee=" + this.enoki_removal_fee + ", clawback_amount=" + this.clawback_amount + ", clawback_amount_explanation=" + this.clawback_amount_explanation + ", grace_period_content=" + this.grace_period_content + ", gold_deposit_boost=" + this.gold_deposit_boost + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.dest_account_id);
            dest.writeString(this.dest_account_type.name());
            dest.writeString(this.dest_entity.name());
            dest.writeString(this.dest_hold_id);
            Boolean bool = this.dest_place_hold;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeSerializable(this.dest_record_date);
            dest.writeString(this.dest_user_id);
            dest.writeInt(this.forced ? 1 : 0);
            dest.writeString(this.originator.name());
            dest.writeString(this.purpose.name());
            dest.writeString(this.source_account_id);
            dest.writeString(this.source_account_type.name());
            dest.writeString(this.source_entity.name());
            dest.writeString(this.source_hold_id);
            dest.writeSerializable(this.source_record_date);
            Boolean bool2 = this.source_release_hold;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.source_user_id);
            dest.writeString(this.version);
            ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo = this.paycheck_investment_info;
            if (apiPaycheckInvestmentInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiPaycheckInvestmentInfo.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.enoki_amount, flags);
            dest.writeParcelable(this.enoki_removal_fee, flags);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        public ApiInternalTransfer(String dest_account_id, AccountType dest_account_type, RHEntity dest_entity, String str, Boolean bool, LocalDate dest_record_date, String str2, boolean z, OriginatorType originator, TransferPurpose purpose, String source_account_id, AccountType source_account_type, RHEntity source_entity, String str3, LocalDate source_record_date, Boolean bool2, String str4, String version, ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo, Money money, Money money2, Money money3, String str5, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            Intrinsics.checkNotNullParameter(dest_account_id, "dest_account_id");
            Intrinsics.checkNotNullParameter(dest_account_type, "dest_account_type");
            Intrinsics.checkNotNullParameter(dest_entity, "dest_entity");
            Intrinsics.checkNotNullParameter(dest_record_date, "dest_record_date");
            Intrinsics.checkNotNullParameter(originator, "originator");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(source_account_id, "source_account_id");
            Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
            Intrinsics.checkNotNullParameter(source_entity, "source_entity");
            Intrinsics.checkNotNullParameter(source_record_date, "source_record_date");
            Intrinsics.checkNotNullParameter(version, "version");
            this.dest_account_id = dest_account_id;
            this.dest_account_type = dest_account_type;
            this.dest_entity = dest_entity;
            this.dest_hold_id = str;
            this.dest_place_hold = bool;
            this.dest_record_date = dest_record_date;
            this.dest_user_id = str2;
            this.forced = z;
            this.originator = originator;
            this.purpose = purpose;
            this.source_account_id = source_account_id;
            this.source_account_type = source_account_type;
            this.source_entity = source_entity;
            this.source_hold_id = str3;
            this.source_record_date = source_record_date;
            this.source_release_hold = bool2;
            this.source_user_id = str4;
            this.version = version;
            this.paycheck_investment_info = apiPaycheckInvestmentInfo;
            this.enoki_amount = money;
            this.enoki_removal_fee = money2;
            this.clawback_amount = money3;
            this.clawback_amount_explanation = str5;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        public final String getDest_account_id() {
            return this.dest_account_id;
        }

        public final AccountType getDest_account_type() {
            return this.dest_account_type;
        }

        public final RHEntity getDest_entity() {
            return this.dest_entity;
        }

        public final String getDest_hold_id() {
            return this.dest_hold_id;
        }

        public final Boolean getDest_place_hold() {
            return this.dest_place_hold;
        }

        public final LocalDate getDest_record_date() {
            return this.dest_record_date;
        }

        public final String getDest_user_id() {
            return this.dest_user_id;
        }

        public final boolean getForced() {
            return this.forced;
        }

        public final OriginatorType getOriginator() {
            return this.originator;
        }

        public final TransferPurpose getPurpose() {
            return this.purpose;
        }

        public final String getSource_account_id() {
            return this.source_account_id;
        }

        public final AccountType getSource_account_type() {
            return this.source_account_type;
        }

        public final RHEntity getSource_entity() {
            return this.source_entity;
        }

        public final String getSource_hold_id() {
            return this.source_hold_id;
        }

        public final LocalDate getSource_record_date() {
            return this.source_record_date;
        }

        public final Boolean getSource_release_hold() {
            return this.source_release_hold;
        }

        public final String getSource_user_id() {
            return this.source_user_id;
        }

        public final String getVersion() {
            return this.version;
        }

        public final ApiPaycheckInvestmentInfo getPaycheck_investment_info() {
            return this.paycheck_investment_info;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_amount() {
            return this.enoki_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B±\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b\u000f\u0010=R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b\u0010\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bF\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bG\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\bH\u00105R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\bL\u0010;R\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010@\u001a\u0004\bM\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\bN\u0010/R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010@\u001a\u0004\bO\u0010BR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010S\u001a\u0004\bT\u0010U¨\u0006V"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiNonOriginatedAchTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/models/util/Money$Direction;", "direction", "j$/time/LocalDate", "grant_date", "Ljava/util/UUID;", "id", "j$/time/Instant", "initiated_at", "", "is_early_pay", "is_redirected", "", "originator_name", "Lcom/robinhood/transfers/api/RejectionReason;", "rejection_reason", "rejection_reason_detail", "rejection_reason_display_name", "reversal_date", "Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "state", "updated_at", AnnotatedPrivateKey.LABEL, "clawback_amount", "clawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "grace_period_content", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "gold_deposit_boost", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money$Direction;Lj$/time/LocalDate;Ljava/util/UUID;Lj$/time/Instant;Ljava/lang/Boolean;ZLjava/lang/String;Lcom/robinhood/transfers/api/RejectionReason;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/util/Money$Direction;", "getDirection", "()Lcom/robinhood/models/util/Money$Direction;", "Lj$/time/LocalDate;", "getGrant_date", "()Lj$/time/LocalDate;", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lj$/time/Instant;", "getInitiated_at", "()Lj$/time/Instant;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "Ljava/lang/String;", "getOriginator_name", "()Ljava/lang/String;", "Lcom/robinhood/transfers/api/RejectionReason;", "getRejection_reason", "()Lcom/robinhood/transfers/api/RejectionReason;", "getRejection_reason_detail", "getRejection_reason_display_name", "getReversal_date", "Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "getState", "()Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "getUpdated_at", "getLabel", "getClawback_amount", "getClawback_amount_explanation", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiNonOriginatedAchTransfer implements ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer {
        public static final Parcelable.Creator<ApiNonOriginatedAchTransfer> CREATOR = new Creator();
        private final Money amount;
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final Money.Direction direction;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;
        private final LocalDate grant_date;
        private final UUID id;
        private final Instant initiated_at;
        private final Boolean is_early_pay;
        private final boolean is_redirected;
        private final String label;
        private final String originator_name;
        private final RejectionReason rejection_reason;
        private final String rejection_reason_detail;
        private final String rejection_reason_display_name;
        private final LocalDate reversal_date;
        private final NonOriginatedAchTransferState state;
        private final Instant updated_at;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiNonOriginatedAchTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiNonOriginatedAchTransfer createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Money money;
                ApiGracePeriodContent apiGracePeriodContentCreateFromParcel;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Money money2 = (Money) parcel.readParcelable(ApiNonOriginatedAchTransfer.class.getClassLoader());
                Money.Direction directionValueOf = Money.Direction.valueOf(parcel.readString());
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                UUID uuid = (UUID) parcel.readSerializable();
                Instant instant = (Instant) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                RejectionReason rejectionReasonValueOf = parcel.readInt() == 0 ? null : RejectionReason.valueOf(parcel.readString());
                String string3 = parcel.readString();
                RejectionReason rejectionReason = rejectionReasonValueOf;
                String string4 = parcel.readString();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                NonOriginatedAchTransferState nonOriginatedAchTransferStateValueOf = NonOriginatedAchTransferState.valueOf(parcel.readString());
                Instant instant2 = (Instant) parcel.readSerializable();
                String string5 = parcel.readString();
                Money money3 = (Money) parcel.readParcelable(ApiNonOriginatedAchTransfer.class.getClassLoader());
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    money = money3;
                    apiGracePeriodContentCreateFromParcel = null;
                } else {
                    money = money3;
                    apiGracePeriodContentCreateFromParcel = ApiGracePeriodContent.CREATOR.createFromParcel(parcel);
                }
                return new ApiNonOriginatedAchTransfer(money2, directionValueOf, localDate, uuid, instant, boolValueOf, z, string2, rejectionReason, string3, string4, localDate2, nonOriginatedAchTransferStateValueOf, instant2, string5, money, string6, apiGracePeriodContentCreateFromParcel, (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiNonOriginatedAchTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiNonOriginatedAchTransfer[] newArray(int i) {
                return new ApiNonOriginatedAchTransfer[i];
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
            dest.writeString(this.direction.name());
            dest.writeSerializable(this.grant_date);
            dest.writeSerializable(this.id);
            dest.writeSerializable(this.initiated_at);
            Boolean bool = this.is_early_pay;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeInt(this.is_redirected ? 1 : 0);
            dest.writeString(this.originator_name);
            RejectionReason rejectionReason = this.rejection_reason;
            if (rejectionReason == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(rejectionReason.name());
            }
            dest.writeString(this.rejection_reason_detail);
            dest.writeString(this.rejection_reason_display_name);
            dest.writeSerializable(this.reversal_date);
            dest.writeString(this.state.name());
            dest.writeSerializable(this.updated_at);
            dest.writeString(this.label);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        public ApiNonOriginatedAchTransfer(Money amount, Money.Direction direction, LocalDate grant_date, UUID id, Instant initiated_at, Boolean bool, boolean z, String originator_name, RejectionReason rejectionReason, String str, String str2, LocalDate localDate, NonOriginatedAchTransferState state, Instant updated_at, String label, Money money, String str3, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(grant_date, "grant_date");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(initiated_at, "initiated_at");
            Intrinsics.checkNotNullParameter(originator_name, "originator_name");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(label, "label");
            this.amount = amount;
            this.direction = direction;
            this.grant_date = grant_date;
            this.id = id;
            this.initiated_at = initiated_at;
            this.is_early_pay = bool;
            this.is_redirected = z;
            this.originator_name = originator_name;
            this.rejection_reason = rejectionReason;
            this.rejection_reason_detail = str;
            this.rejection_reason_display_name = str2;
            this.reversal_date = localDate;
            this.state = state;
            this.updated_at = updated_at;
            this.label = label;
            this.clawback_amount = money;
            this.clawback_amount_explanation = str3;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final Money.Direction getDirection() {
            return this.direction;
        }

        public final LocalDate getGrant_date() {
            return this.grant_date;
        }

        public final UUID getId() {
            return this.id;
        }

        public final Instant getInitiated_at() {
            return this.initiated_at;
        }

        /* renamed from: is_early_pay, reason: from getter */
        public final Boolean getIs_early_pay() {
            return this.is_early_pay;
        }

        /* renamed from: is_redirected, reason: from getter */
        public final boolean getIs_redirected() {
            return this.is_redirected;
        }

        public final String getOriginator_name() {
            return this.originator_name;
        }

        public final RejectionReason getRejection_reason() {
            return this.rejection_reason;
        }

        public final String getRejection_reason_detail() {
            return this.rejection_reason_detail;
        }

        public final String getRejection_reason_display_name() {
            return this.rejection_reason_display_name;
        }

        public final LocalDate getReversal_date() {
            return this.reversal_date;
        }

        public final NonOriginatedAchTransferState getState() {
            return this.state;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiRolloverAchTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "j$/time/LocalDate", "limitation_release_date", "Lcom/robinhood/models/util/Money;", "enoki_amount", "enoki_removal_fee", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lj$/time/LocalDate;", "getLimitation_release_date", "()Lj$/time/LocalDate;", "Lcom/robinhood/models/util/Money;", "getEnoki_amount", "()Lcom/robinhood/models/util/Money;", "getEnoki_removal_fee", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiRolloverAchTransfer implements ApiPaymentTransferDetails, ApiEnokiTransfer {
        public static final Parcelable.Creator<ApiRolloverAchTransfer> CREATOR = new Creator();
        private final Money enoki_amount;
        private final Money enoki_removal_fee;
        private final LocalDate limitation_release_date;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiRolloverAchTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiRolloverAchTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiRolloverAchTransfer((LocalDate) parcel.readSerializable(), (Money) parcel.readParcelable(ApiRolloverAchTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiRolloverAchTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiRolloverAchTransfer[] newArray(int i) {
                return new ApiRolloverAchTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.limitation_release_date);
            dest.writeParcelable(this.enoki_amount, flags);
            dest.writeParcelable(this.enoki_removal_fee, flags);
        }

        public ApiRolloverAchTransfer(LocalDate localDate, Money money, Money money2) {
            this.limitation_release_date = localDate;
            this.enoki_amount = money;
            this.enoki_removal_fee = money2;
        }

        public final LocalDate getLimitation_release_date() {
            return this.limitation_release_date;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_amount() {
            return this.enoki_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BC\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiSentTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiClawbackTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiGoldDepositBoostTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiEnokiTransfer;", "enoki_amount", "Lcom/robinhood/models/util/Money;", "enoki_removal_fee", "clawback_amount", "clawback_amount_explanation", "", "grace_period_content", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "gold_deposit_boost", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/transfers/api/ApiGracePeriodContent;Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;)V", "getEnoki_amount", "()Lcom/robinhood/models/util/Money;", "getEnoki_removal_fee", "getClawback_amount", "getClawback_amount_explanation", "()Ljava/lang/String;", "getGrace_period_content", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGold_deposit_boost", "()Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiSentTransfer implements ApiPaymentTransferDetails, ApiClawbackTransfer, ApiGoldDepositBoostTransfer, ApiEnokiTransfer {
        public static final Parcelable.Creator<ApiSentTransfer> CREATOR = new Creator();
        private final Money clawback_amount;
        private final String clawback_amount_explanation;
        private final Money enoki_amount;
        private final Money enoki_removal_fee;
        private final ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        private final ApiGracePeriodContent grace_period_content;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiSentTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiSentTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiSentTransfer((Money) parcel.readParcelable(ApiSentTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiSentTransfer.class.getClassLoader()), (Money) parcel.readParcelable(ApiSentTransfer.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ApiGracePeriodContent.CREATOR.createFromParcel(parcel), (ApiGoldDepositBoostTransferDetail) parcel.readParcelable(ApiSentTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiSentTransfer[] newArray(int i) {
                return new ApiSentTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.enoki_amount, flags);
            dest.writeParcelable(this.enoki_removal_fee, flags);
            dest.writeParcelable(this.clawback_amount, flags);
            dest.writeString(this.clawback_amount_explanation);
            ApiGracePeriodContent apiGracePeriodContent = this.grace_period_content;
            if (apiGracePeriodContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apiGracePeriodContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.gold_deposit_boost, flags);
        }

        public ApiSentTransfer(Money money, Money money2, Money money3, String str, ApiGracePeriodContent apiGracePeriodContent, ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
            this.enoki_amount = money;
            this.enoki_removal_fee = money2;
            this.clawback_amount = money3;
            this.clawback_amount_explanation = str;
            this.grace_period_content = apiGracePeriodContent;
            this.gold_deposit_boost = apiGoldDepositBoostTransferDetail;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_amount() {
            return this.enoki_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiEnokiTransfer
        public Money getEnoki_removal_fee() {
            return this.enoki_removal_fee;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public Money getClawback_amount() {
            return this.clawback_amount;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public String getClawback_amount_explanation() {
            return this.clawback_amount_explanation;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiClawbackTransfer
        public ApiGracePeriodContent getGrace_period_content() {
            return this.grace_period_content;
        }

        @Override // com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer
        public ApiGoldDepositBoostTransferDetail getGold_deposit_boost() {
            return this.gold_deposit_boost;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiSepaCredit;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "displayBankDetails", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayBankDetails", "()Ljava/lang/String;", "getReason", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiSepaCredit implements ApiPaymentTransferDetails {
        public static final Parcelable.Creator<ApiSepaCredit> CREATOR = new Creator();
        private final String displayBankDetails;
        private final String reason;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiSepaCredit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiSepaCredit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiSepaCredit(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiSepaCredit[] newArray(int i) {
                return new ApiSepaCredit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.displayBankDetails);
            dest.writeString(this.reason);
        }

        public ApiSepaCredit(@Json(name = "display_bank_details") String displayBankDetails, @Json(name = "error_details") String str) {
            Intrinsics.checkNotNullParameter(displayBankDetails, "displayBankDetails");
            this.displayBankDetails = displayBankDetails;
            this.reason = str;
        }

        public final String getDisplayBankDetails() {
            return this.displayBankDetails;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiUkBankTransfer;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "id", "Ljava/util/UUID;", "fx", "Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversion;", "state", "Lcom/robinhood/transfers/api/uk/UkBankTransferState;", "tl_payment_id", "tl_resource_id", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversion;Lcom/robinhood/transfers/api/uk/UkBankTransferState;Ljava/util/UUID;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getFx", "()Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversion;", "getState", "()Lcom/robinhood/transfers/api/uk/UkBankTransferState;", "getTl_payment_id", "getTl_resource_id", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApiUkBankTransfer implements ApiPaymentTransferDetails {
        public static final Parcelable.Creator<ApiUkBankTransfer> CREATOR = new Creator();
        private final ApiPaymentTransferFxConversion fx;
        private final UUID id;
        private final UkBankTransferState state;
        private final UUID tl_payment_id;
        private final String tl_resource_id;

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public static final class Creator implements Parcelable.Creator<ApiUkBankTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiUkBankTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApiUkBankTransfer((UUID) parcel.readSerializable(), ApiPaymentTransferFxConversion.CREATOR.createFromParcel(parcel), UkBankTransferState.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiUkBankTransfer[] newArray(int i) {
                return new ApiUkBankTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            this.fx.writeToParcel(dest, flags);
            dest.writeString(this.state.name());
            dest.writeSerializable(this.tl_payment_id);
            dest.writeString(this.tl_resource_id);
        }

        public ApiUkBankTransfer(UUID id, ApiPaymentTransferFxConversion fx, UkBankTransferState state, UUID uuid, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(fx, "fx");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.fx = fx;
            this.state = state;
            this.tl_payment_id = uuid;
            this.tl_resource_id = str;
        }

        public final UUID getId() {
            return this.id;
        }

        public final ApiPaymentTransferFxConversion getFx() {
            return this.fx;
        }

        public final UkBankTransferState getState() {
            return this.state;
        }

        public final UUID getTl_payment_id() {
            return this.tl_payment_id;
        }

        public final String getTl_resource_id() {
            return this.tl_resource_id;
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$Unknown;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AdapterModule", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unknown implements ApiPaymentTransferDetails {
        public static final Unknown INSTANCE = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 1303018520;
        }

        public String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Unknown() {
        }

        /* compiled from: ApiPaymentTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$Unknown$AdapterModule;", "", "<init>", "()V", "provideAdapter", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class AdapterModule {
            public static final AdapterModule INSTANCE = new AdapterModule();

            private AdapterModule() {
            }

            public final JsonAdapterBinding provideAdapter() {
                JsonAdapterBinding.Companion companion = JsonAdapterBinding.INSTANCE;
                return new JsonAdapterBinding(Unknown.class, new ObjectJsonAdapter(Unknown.INSTANCE));
            }
        }
    }

    /* compiled from: ApiPaymentTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithDefaultValue = PolymorphicJsonAdapterFactory.m3154of(ApiPaymentTransferDetails.class, "transfer_type").withSubtype(ApiAchTransfer.class, TransferType.ORIGINATED_ACH.getServerValue()).withSubtype(ApiCheckTransfer.class, TransferType.CHECK.getServerValue()).withSubtype(ApiDebitCardTransfer.class, TransferType.DEBIT_CARD_TRANSFER.getServerValue()).withSubtype(ApiIncomingWireTransfer.class, TransferType.INCOMING_WIRE.getServerValue()).withSubtype(ApiOutgoingWireTransfer.class, TransferType.OUTGOING_WIRE.getServerValue()).withSubtype(ApiInternalTransfer.class, TransferType.INTER_ENTITY.getServerValue()).withSubtype(ApiInternalTransfer.class, TransferType.INTERNAL.getServerValue()).withSubtype(ApiSentTransfer.class, TransferType.INTRA_ENTITY.getServerValue()).withSubtype(ApiInstantBankTransfer.class, TransferType.INSTANT_BANK_TRANSFER.getServerValue()).withSubtype(ApiNonOriginatedAchTransfer.class, TransferType.NON_ORIGINATED_ACH.getServerValue()).withSubtype(ApiNonOriginatedAchTransfer.class, TransferType.NON_ORIGINATED_ACH_EARLY_PAY.getServerValue()).withSubtype(ApiRolloverAchTransfer.class, TransferType.ROLLOVER_ACH.getServerValue()).withSubtype(ApiSepaCredit.class, TransferType.SEPA_CREDIT.getServerValue()).withSubtype(ApiUkBankTransfer.class, TransferType.UK_BANK_TRANSFER.getServerValue()).withSubtype(Unknown.class, TransferType.UNKNOWN.getServerValue()).withDefaultValue(Unknown.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithDefaultValue, "withDefaultValue(...)");
            return polymorphicJsonAdapterFactoryWithDefaultValue;
        }
    }
}
