package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: InternationalTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b=\u00107J\u0012\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b@\u00107J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u0010?J\u0012\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bD\u0010?J\u0012\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bE\u00105J\u0012\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020$HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020&HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0096\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bV\u00105J\u0010\u0010X\u001a\u00020WHÖ\u0001¢\u0006\u0004\bX\u0010YJ\u001a\u0010[\u001a\u00020\f2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b[\u0010\\R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010_\u001a\u0004\b`\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010a\u001a\u0004\bb\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bd\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bf\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bh\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010i\u001a\u0004\bj\u00109R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bk\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010<R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\bn\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010o\u001a\u0004\bp\u0010?R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bq\u00107R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\bt\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010o\u001a\u0004\bu\u0010?R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\bv\u00105R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010w\u001a\u0004\bx\u0010GR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010y\u001a\u0004\bz\u0010IR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010{\u001a\u0004\b|\u0010KR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010}\u001a\u0004\b~\u0010MR\u0018\u0010%\u001a\u00020$8\u0006¢\u0006\r\n\u0004\b%\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010OR\u0019\u0010'\u001a\u00020&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010QR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010SR\u001c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010o\u001a\u0005\b\u0086\u0001\u0010?R\u001a\u0010\u008b\u0001\u001a\b0\u0087\u0001j\u0003`\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/models/util/Money;", "amount", "j$/time/Instant", "lastUpdatedFxQuoteTime", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "fxQuote", "", "inputChars", "", "animateInput", "Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "mode", "displaySwitcher", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "createTransferResponse", "makingTransfer", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "selectedExternalAccount", "hasSelectedExternalAccount", "", "accounts", "fromAccount", "toAccount", "defaultUkExternalTransferAccountId", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "disclosureResponse", "Lcom/robinhood/models/db/TransferDirection;", "transferDirection", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "brokerageBalances", "Lcom/robinhood/models/db/Portfolio;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "transferSummaryState", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "locality", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lj$/time/Instant;Lcom/robinhood/models/fx/api/ApiFxQuote;Ljava/lang/String;ZLcom/robinhood/android/transfers/ui/max/i18n/TransferMode;ZLcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;ZLcom/robinhood/models/db/bonfire/TransferAccount;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/crypto/db/BrokerageBalances;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/util/Money;", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/models/fx/api/ApiFxQuote;", "component5", "()Ljava/lang/String;", "component6", "()Z", "component7", "()Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "component8", "component9", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "component10", "component11", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component12", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "()Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "component18", "()Lcom/robinhood/models/db/TransferDirection;", "component19", "()Lcom/robinhood/models/crypto/db/BrokerageBalances;", "component20", "()Lcom/robinhood/models/db/Portfolio;", "component21", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component22", "()Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "component23", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lj$/time/Instant;Lcom/robinhood/models/fx/api/ApiFxQuote;Ljava/lang/String;ZLcom/robinhood/android/transfers/ui/max/i18n/TransferMode;ZLcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;ZLcom/robinhood/models/db/bonfire/TransferAccount;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/crypto/db/BrokerageBalances;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getSessionId", "Lcom/robinhood/models/util/Money;", "getAmount", "Lj$/time/Instant;", "getLastUpdatedFxQuoteTime", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "getFxQuote", "Ljava/lang/String;", "getInputChars", "Z", "getAnimateInput", "Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "getMode", "getDisplaySwitcher", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "getCreateTransferResponse", "getMakingTransfer", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSelectedExternalAccount", "getHasSelectedExternalAccount", "Ljava/util/List;", "getAccounts", "getFromAccount", "getToAccount", "getDefaultUkExternalTransferAccountId", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "getDisclosureResponse", "Lcom/robinhood/models/db/TransferDirection;", "getTransferDirection", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "getBrokerageBalances", "Lcom/robinhood/models/db/Portfolio;", "getPortfolio", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "getTransferSummaryState", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getLocality", "externalAccount", "getExternalAccount", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getTransferSummaryRequest", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "transferSummaryRequest", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransferDataState {
    public static final int $stable = 8;
    private final List<TransferAccount> accounts;
    private final Money amount;
    private final boolean animateInput;
    private final BrokerageBalances brokerageBalances;
    private final ApiCreateTransferResponse createTransferResponse;
    private final String defaultUkExternalTransferAccountId;
    private final ApiDisclosureUIResponse disclosureResponse;
    private final boolean displaySwitcher;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final TransferAccount externalAccount;
    private final TransferAccount fromAccount;
    private final ApiFxQuote fxQuote;
    private final boolean hasSelectedExternalAccount;
    private final String inputChars;
    private final Instant lastUpdatedFxQuoteTime;
    private final CountryCode.Supported locality;
    private final boolean makingTransfer;
    private final TransferMode mode;
    private final Portfolio portfolio;
    private final TransferAccount selectedExternalAccount;
    private final UUID sessionId;
    private final TransferAccount toAccount;
    private final TransferDirection transferDirection;
    private final TransferSummaryState transferSummaryState;

    /* compiled from: InternationalTransferDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InternationalTransferDataState copy$default(InternationalTransferDataState internationalTransferDataState, UUID uuid, Money money, Instant instant, ApiFxQuote apiFxQuote, String str, boolean z, TransferMode transferMode, boolean z2, ApiCreateTransferResponse apiCreateTransferResponse, boolean z3, TransferAccount transferAccount, boolean z4, List list, TransferAccount transferAccount2, TransferAccount transferAccount3, String str2, ApiDisclosureUIResponse apiDisclosureUIResponse, TransferDirection transferDirection, BrokerageBalances brokerageBalances, Portfolio portfolio, MAXTransferContext.EntryPoint entryPoint, TransferSummaryState transferSummaryState, CountryCode.Supported supported, int i, Object obj) {
        CountryCode.Supported supported2;
        TransferSummaryState transferSummaryState2;
        UUID uuid2 = (i & 1) != 0 ? internationalTransferDataState.sessionId : uuid;
        Money money2 = (i & 2) != 0 ? internationalTransferDataState.amount : money;
        Instant instant2 = (i & 4) != 0 ? internationalTransferDataState.lastUpdatedFxQuoteTime : instant;
        ApiFxQuote apiFxQuote2 = (i & 8) != 0 ? internationalTransferDataState.fxQuote : apiFxQuote;
        String str3 = (i & 16) != 0 ? internationalTransferDataState.inputChars : str;
        boolean z5 = (i & 32) != 0 ? internationalTransferDataState.animateInput : z;
        TransferMode transferMode2 = (i & 64) != 0 ? internationalTransferDataState.mode : transferMode;
        boolean z6 = (i & 128) != 0 ? internationalTransferDataState.displaySwitcher : z2;
        ApiCreateTransferResponse apiCreateTransferResponse2 = (i & 256) != 0 ? internationalTransferDataState.createTransferResponse : apiCreateTransferResponse;
        boolean z7 = (i & 512) != 0 ? internationalTransferDataState.makingTransfer : z3;
        TransferAccount transferAccount4 = (i & 1024) != 0 ? internationalTransferDataState.selectedExternalAccount : transferAccount;
        boolean z8 = (i & 2048) != 0 ? internationalTransferDataState.hasSelectedExternalAccount : z4;
        List list2 = (i & 4096) != 0 ? internationalTransferDataState.accounts : list;
        TransferAccount transferAccount5 = (i & 8192) != 0 ? internationalTransferDataState.fromAccount : transferAccount2;
        UUID uuid3 = uuid2;
        TransferAccount transferAccount6 = (i & 16384) != 0 ? internationalTransferDataState.toAccount : transferAccount3;
        String str4 = (i & 32768) != 0 ? internationalTransferDataState.defaultUkExternalTransferAccountId : str2;
        ApiDisclosureUIResponse apiDisclosureUIResponse2 = (i & 65536) != 0 ? internationalTransferDataState.disclosureResponse : apiDisclosureUIResponse;
        TransferDirection transferDirection2 = (i & 131072) != 0 ? internationalTransferDataState.transferDirection : transferDirection;
        BrokerageBalances brokerageBalances2 = (i & 262144) != 0 ? internationalTransferDataState.brokerageBalances : brokerageBalances;
        Portfolio portfolio2 = (i & 524288) != 0 ? internationalTransferDataState.portfolio : portfolio;
        MAXTransferContext.EntryPoint entryPoint2 = (i & 1048576) != 0 ? internationalTransferDataState.entryPoint : entryPoint;
        TransferSummaryState transferSummaryState3 = (i & 2097152) != 0 ? internationalTransferDataState.transferSummaryState : transferSummaryState;
        if ((i & 4194304) != 0) {
            transferSummaryState2 = transferSummaryState3;
            supported2 = internationalTransferDataState.locality;
        } else {
            supported2 = supported;
            transferSummaryState2 = transferSummaryState3;
        }
        return internationalTransferDataState.copy(uuid3, money2, instant2, apiFxQuote2, str3, z5, transferMode2, z6, apiCreateTransferResponse2, z7, transferAccount4, z8, list2, transferAccount5, transferAccount6, str4, apiDisclosureUIResponse2, transferDirection2, brokerageBalances2, portfolio2, entryPoint2, transferSummaryState2, supported2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getMakingTransfer() {
        return this.makingTransfer;
    }

    /* renamed from: component11, reason: from getter */
    public final TransferAccount getSelectedExternalAccount() {
        return this.selectedExternalAccount;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasSelectedExternalAccount() {
        return this.hasSelectedExternalAccount;
    }

    public final List<TransferAccount> component13() {
        return this.accounts;
    }

    /* renamed from: component14, reason: from getter */
    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    /* renamed from: component15, reason: from getter */
    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDefaultUkExternalTransferAccountId() {
        return this.defaultUkExternalTransferAccountId;
    }

    /* renamed from: component17, reason: from getter */
    public final ApiDisclosureUIResponse getDisclosureResponse() {
        return this.disclosureResponse;
    }

    /* renamed from: component18, reason: from getter */
    public final TransferDirection getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component19, reason: from getter */
    public final BrokerageBalances getBrokerageBalances() {
        return this.brokerageBalances;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component20, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component21, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component22, reason: from getter */
    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    /* renamed from: component23, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getLastUpdatedFxQuoteTime() {
        return this.lastUpdatedFxQuoteTime;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInputChars() {
        return this.inputChars;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferMode getMode() {
        return this.mode;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDisplaySwitcher() {
        return this.displaySwitcher;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiCreateTransferResponse getCreateTransferResponse() {
        return this.createTransferResponse;
    }

    public final InternationalTransferDataState copy(UUID sessionId, Money amount, Instant lastUpdatedFxQuoteTime, ApiFxQuote fxQuote, String inputChars, boolean animateInput, TransferMode mode, boolean displaySwitcher, ApiCreateTransferResponse createTransferResponse, boolean makingTransfer, TransferAccount selectedExternalAccount, boolean hasSelectedExternalAccount, List<TransferAccount> accounts2, TransferAccount fromAccount, TransferAccount toAccount, String defaultUkExternalTransferAccountId, ApiDisclosureUIResponse disclosureResponse, TransferDirection transferDirection, BrokerageBalances brokerageBalances, Portfolio portfolio, MAXTransferContext.EntryPoint entryPoint, TransferSummaryState transferSummaryState, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        return new InternationalTransferDataState(sessionId, amount, lastUpdatedFxQuoteTime, fxQuote, inputChars, animateInput, mode, displaySwitcher, createTransferResponse, makingTransfer, selectedExternalAccount, hasSelectedExternalAccount, accounts2, fromAccount, toAccount, defaultUkExternalTransferAccountId, disclosureResponse, transferDirection, brokerageBalances, portfolio, entryPoint, transferSummaryState, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransferDataState)) {
            return false;
        }
        InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) other;
        return Intrinsics.areEqual(this.sessionId, internationalTransferDataState.sessionId) && Intrinsics.areEqual(this.amount, internationalTransferDataState.amount) && Intrinsics.areEqual(this.lastUpdatedFxQuoteTime, internationalTransferDataState.lastUpdatedFxQuoteTime) && Intrinsics.areEqual(this.fxQuote, internationalTransferDataState.fxQuote) && Intrinsics.areEqual(this.inputChars, internationalTransferDataState.inputChars) && this.animateInput == internationalTransferDataState.animateInput && this.mode == internationalTransferDataState.mode && this.displaySwitcher == internationalTransferDataState.displaySwitcher && Intrinsics.areEqual(this.createTransferResponse, internationalTransferDataState.createTransferResponse) && this.makingTransfer == internationalTransferDataState.makingTransfer && Intrinsics.areEqual(this.selectedExternalAccount, internationalTransferDataState.selectedExternalAccount) && this.hasSelectedExternalAccount == internationalTransferDataState.hasSelectedExternalAccount && Intrinsics.areEqual(this.accounts, internationalTransferDataState.accounts) && Intrinsics.areEqual(this.fromAccount, internationalTransferDataState.fromAccount) && Intrinsics.areEqual(this.toAccount, internationalTransferDataState.toAccount) && Intrinsics.areEqual(this.defaultUkExternalTransferAccountId, internationalTransferDataState.defaultUkExternalTransferAccountId) && Intrinsics.areEqual(this.disclosureResponse, internationalTransferDataState.disclosureResponse) && this.transferDirection == internationalTransferDataState.transferDirection && Intrinsics.areEqual(this.brokerageBalances, internationalTransferDataState.brokerageBalances) && Intrinsics.areEqual(this.portfolio, internationalTransferDataState.portfolio) && this.entryPoint == internationalTransferDataState.entryPoint && Intrinsics.areEqual(this.transferSummaryState, internationalTransferDataState.transferSummaryState) && Intrinsics.areEqual(this.locality, internationalTransferDataState.locality);
    }

    public int hashCode() {
        UUID uuid = this.sessionId;
        int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + this.amount.hashCode()) * 31;
        Instant instant = this.lastUpdatedFxQuoteTime;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        ApiFxQuote apiFxQuote = this.fxQuote;
        int iHashCode3 = (((((((((iHashCode2 + (apiFxQuote == null ? 0 : apiFxQuote.hashCode())) * 31) + this.inputChars.hashCode()) * 31) + Boolean.hashCode(this.animateInput)) * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.displaySwitcher)) * 31;
        ApiCreateTransferResponse apiCreateTransferResponse = this.createTransferResponse;
        int iHashCode4 = (((iHashCode3 + (apiCreateTransferResponse == null ? 0 : apiCreateTransferResponse.hashCode())) * 31) + Boolean.hashCode(this.makingTransfer)) * 31;
        TransferAccount transferAccount = this.selectedExternalAccount;
        int iHashCode5 = (((iHashCode4 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31) + Boolean.hashCode(this.hasSelectedExternalAccount)) * 31;
        List<TransferAccount> list = this.accounts;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        TransferAccount transferAccount2 = this.fromAccount;
        int iHashCode7 = (iHashCode6 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31;
        TransferAccount transferAccount3 = this.toAccount;
        int iHashCode8 = (iHashCode7 + (transferAccount3 == null ? 0 : transferAccount3.hashCode())) * 31;
        String str = this.defaultUkExternalTransferAccountId;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        ApiDisclosureUIResponse apiDisclosureUIResponse = this.disclosureResponse;
        int iHashCode10 = (((iHashCode9 + (apiDisclosureUIResponse == null ? 0 : apiDisclosureUIResponse.hashCode())) * 31) + this.transferDirection.hashCode()) * 31;
        BrokerageBalances brokerageBalances = this.brokerageBalances;
        int iHashCode11 = (iHashCode10 + (brokerageBalances == null ? 0 : brokerageBalances.hashCode())) * 31;
        Portfolio portfolio = this.portfolio;
        int iHashCode12 = (((((iHashCode11 + (portfolio == null ? 0 : portfolio.hashCode())) * 31) + this.entryPoint.hashCode()) * 31) + this.transferSummaryState.hashCode()) * 31;
        CountryCode.Supported supported = this.locality;
        return iHashCode12 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransferDataState(sessionId=" + this.sessionId + ", amount=" + this.amount + ", lastUpdatedFxQuoteTime=" + this.lastUpdatedFxQuoteTime + ", fxQuote=" + this.fxQuote + ", inputChars=" + this.inputChars + ", animateInput=" + this.animateInput + ", mode=" + this.mode + ", displaySwitcher=" + this.displaySwitcher + ", createTransferResponse=" + this.createTransferResponse + ", makingTransfer=" + this.makingTransfer + ", selectedExternalAccount=" + this.selectedExternalAccount + ", hasSelectedExternalAccount=" + this.hasSelectedExternalAccount + ", accounts=" + this.accounts + ", fromAccount=" + this.fromAccount + ", toAccount=" + this.toAccount + ", defaultUkExternalTransferAccountId=" + this.defaultUkExternalTransferAccountId + ", disclosureResponse=" + this.disclosureResponse + ", transferDirection=" + this.transferDirection + ", brokerageBalances=" + this.brokerageBalances + ", portfolio=" + this.portfolio + ", entryPoint=" + this.entryPoint + ", transferSummaryState=" + this.transferSummaryState + ", locality=" + this.locality + ")";
    }

    public InternationalTransferDataState(UUID uuid, Money amount, Instant instant, ApiFxQuote apiFxQuote, String inputChars, boolean z, TransferMode mode, boolean z2, ApiCreateTransferResponse apiCreateTransferResponse, boolean z3, TransferAccount transferAccount, boolean z4, List<TransferAccount> list, TransferAccount transferAccount2, TransferAccount transferAccount3, String str, ApiDisclosureUIResponse apiDisclosureUIResponse, TransferDirection transferDirection, BrokerageBalances brokerageBalances, Portfolio portfolio, MAXTransferContext.EntryPoint entryPoint, TransferSummaryState transferSummaryState, CountryCode.Supported supported) {
        String accountName;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        this.sessionId = uuid;
        this.amount = amount;
        this.lastUpdatedFxQuoteTime = instant;
        this.fxQuote = apiFxQuote;
        this.inputChars = inputChars;
        this.animateInput = z;
        this.mode = mode;
        this.displaySwitcher = z2;
        this.createTransferResponse = apiCreateTransferResponse;
        this.makingTransfer = z3;
        TransferAccount transferAccount4 = transferAccount;
        this.selectedExternalAccount = transferAccount4;
        this.hasSelectedExternalAccount = z4;
        this.accounts = list;
        this.fromAccount = transferAccount2;
        this.toAccount = transferAccount3;
        this.defaultUkExternalTransferAccountId = str;
        this.disclosureResponse = apiDisclosureUIResponse;
        this.transferDirection = transferDirection;
        this.brokerageBalances = brokerageBalances;
        this.portfolio = portfolio;
        this.entryPoint = entryPoint;
        this.transferSummaryState = transferSummaryState;
        this.locality = supported;
        if (!z4) {
            transferAccount4 = null;
            if (list != null) {
                TransferAccount transferAccount5 = null;
                for (TransferAccount transferAccount6 : list) {
                    if (transferAccount5 == null && InternationalTransferDataState2.isValidUkExternalAccount(transferAccount6)) {
                        transferAccount5 = transferAccount6;
                    }
                    if (Intrinsics.areEqual(transferAccount6.getAccountId(), this.defaultUkExternalTransferAccountId) && InternationalTransferDataState2.isValidUkExternalAccount(transferAccount6)) {
                        transferAccount4 = transferAccount6;
                    }
                }
                if (transferAccount4 == null || (accountName = transferAccount4.getAccountName()) == null || accountName.length() <= 0) {
                    transferAccount4 = transferAccount5;
                }
            }
        }
        this.externalAccount = transferAccount4;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Instant getLastUpdatedFxQuoteTime() {
        return this.lastUpdatedFxQuoteTime;
    }

    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    public final String getInputChars() {
        return this.inputChars;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final TransferMode getMode() {
        return this.mode;
    }

    public final boolean getDisplaySwitcher() {
        return this.displaySwitcher;
    }

    public final ApiCreateTransferResponse getCreateTransferResponse() {
        return this.createTransferResponse;
    }

    public final boolean getMakingTransfer() {
        return this.makingTransfer;
    }

    public final TransferAccount getSelectedExternalAccount() {
        return this.selectedExternalAccount;
    }

    public final boolean getHasSelectedExternalAccount() {
        return this.hasSelectedExternalAccount;
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }

    public final TransferAccount getFromAccount() {
        return this.fromAccount;
    }

    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    public final String getDefaultUkExternalTransferAccountId() {
        return this.defaultUkExternalTransferAccountId;
    }

    public final ApiDisclosureUIResponse getDisclosureResponse() {
        return this.disclosureResponse;
    }

    public final TransferDirection getTransferDirection() {
        return this.transferDirection;
    }

    public final BrokerageBalances getBrokerageBalances() {
        return this.brokerageBalances;
    }

    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public /* synthetic */ InternationalTransferDataState(UUID uuid, Money money, Instant instant, ApiFxQuote apiFxQuote, String str, boolean z, TransferMode transferMode, boolean z2, ApiCreateTransferResponse apiCreateTransferResponse, boolean z3, TransferAccount transferAccount, boolean z4, List list, TransferAccount transferAccount2, TransferAccount transferAccount3, String str2, ApiDisclosureUIResponse apiDisclosureUIResponse, TransferDirection transferDirection, BrokerageBalances brokerageBalances, Portfolio portfolio, MAXTransferContext.EntryPoint entryPoint, TransferSummaryState transferSummaryState, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, money, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : apiFxQuote, str, z, transferMode, z2, (i & 256) != 0 ? null : apiCreateTransferResponse, z3, transferAccount, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : transferAccount2, (i & 16384) != 0 ? null : transferAccount3, (32768 & i) != 0 ? null : str2, (65536 & i) != 0 ? null : apiDisclosureUIResponse, transferDirection, (262144 & i) != 0 ? null : brokerageBalances, (524288 & i) != 0 ? null : portfolio, entryPoint, (2097152 & i) != 0 ? TransferSummaryState.None.INSTANCE : transferSummaryState, (i & 4194304) != 0 ? null : supported);
    }

    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final TransferAccount getExternalAccount() {
        return this.externalAccount;
    }

    public final Context getEventContext() {
        MAXTransferContext.TransferAccount transferAccount;
        MAXTransferContext.TransferAccount transferAccount2;
        MAXTransferContext.CurrencyConversionData currencyConversionData;
        TransferAccount transferAccount3 = this.externalAccount;
        String accountId = transferAccount3 != null ? transferAccount3.getAccountId() : null;
        if (accountId == null) {
            accountId = "";
        }
        MAXTransferContext.TransferAccount transferAccount4 = new MAXTransferContext.TransferAccount(accountId, MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, null, null, 60, null);
        com.robinhood.rosetta.eventlogging.Money protobuf = Securities.toProtobuf(this.amount);
        TransferDirection transferDirection = this.transferDirection;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[transferDirection.ordinal()];
        if (i == 1) {
            transferAccount = transferAccount4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccount = new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, null, null, null, 61, null);
        }
        int i2 = iArr[this.transferDirection.ordinal()];
        if (i2 == 1) {
            transferAccount2 = new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, null, null, null, 61, null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccount2 = transferAccount4;
        }
        MAXTransferContext.EntryPoint entryPoint = this.entryPoint;
        UUID uuid = this.sessionId;
        String string2 = uuid != null ? uuid.toString() : null;
        String str = string2 == null ? "" : string2;
        ApiFxQuote apiFxQuote = this.fxQuote;
        if (apiFxQuote != null) {
            CountryCode.Supported supported = this.locality;
            currencyConversionData = ToCurrencyConversionData.toCurrencyConversionData(apiFxQuote, supported != null ? Locality2.getLocalCurrency(supported) : null, this.amount, this.transferDirection);
        } else {
            currencyConversionData = null;
        }
        CountryCode.Supported supported2 = this.locality;
        String iso3166CountryCode = supported2 != null ? supported2.getIso3166CountryCode() : null;
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, protobuf, transferAccount, transferAccount2, null, null, entryPoint, null, str, null, null, null, null, currencyConversionData, iso3166CountryCode == null ? "" : iso3166CountryCode, null, null, null, null, null, 1023665, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null);
    }

    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        if (this.mode != TransferMode.EDIT) {
            return null;
        }
        TransferAccount transferAccount = this.fromAccount;
        ApiTransferSummaryRequest.Account account = transferAccount != null ? new ApiTransferSummaryRequest.Account(transferAccount.getAccountId(), transferAccount.getType(), null, 4, null) : null;
        TransferAccount transferAccount2 = this.toAccount;
        return new ApiTransferSummaryRequest(account, transferAccount2 != null ? new ApiTransferSummaryRequest.Account(transferAccount2.getAccountId(), transferAccount2.getType(), null, 4, null) : null, Integer.valueOf(this.entryPoint.getValue()), null, null, null, null, 80, null);
    }
}
