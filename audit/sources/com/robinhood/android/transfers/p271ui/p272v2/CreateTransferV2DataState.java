package com.robinhood.android.transfers.p271ui.p272v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentiveCancellationDialogData;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentivePillData;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TransferContext;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;
import p479j$.time.Year;

/* compiled from: CreateTransferV2DataState.kt */
@Metadata(m3635d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u0091\u00022\u00020\u0001:\u0002\u0091\u0002B\u008d\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012&\b\u0002\u0010.\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)j\u0002`,\u0012\u0004\u0012\u00020-0\u000e\u0012\b\b\u0002\u0010/\u001a\u00020\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002020\u000e\u0012\b\b\u0002\u00104\u001a\u00020\f\u0012\b\b\u0002\u00105\u001a\u00020\f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010F\u001a\u00020E\u0012\b\b\u0002\u0010G\u001a\u00020\f\u0012\b\b\u0002\u0010H\u001a\u00020\f\u0012\b\b\u0002\u0010I\u001a\u00020\f\u0012\b\b\u0002\u0010J\u001a\u00020\f\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010Q\u001a\u00020\f\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010S\u001a\u00020\f\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T\u0012\b\b\u0002\u0010V\u001a\u00020\f\u0012\b\b\u0002\u0010W\u001a\u00020\f\u0012\b\b\u0002\u0010X\u001a\u00020\f\u0012\b\b\u0002\u0010Y\u001a\u00020\f¢\u0006\u0004\bZ\u0010[J\u001d\u0010a\u001a\u00020`2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020^¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bo\u0010pJ\u001c\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bs\u0010nJ\u0010\u0010t\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bt\u0010pJ\u0012\u0010u\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bu\u0010nJ\u0010\u0010v\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bv\u0010pJ\u0010\u0010w\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\fHÆ\u0003¢\u0006\u0004\by\u0010pJ\u0010\u0010z\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bz\u0010pJ\u0010\u0010{\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b{\u0010pJ\u0010\u0010|\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010pJ\u0012\u0010\u0081\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010pJ\u0013\u0010\u0082\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0013\u0010\u0084\u0001\u001a\u00020#HÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0013\u0010\u0086\u0001\u001a\u00020%HÆ\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J0\u0010\u008a\u0001\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)j\u0002`,\u0012\u0004\u0012\u00020-0\u000eHÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010rJ\u0012\u0010\u008b\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010pJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010lJ\u0012\u0010\u008d\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010pJ\u001e\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002020\u000eHÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010rJ\u0012\u0010\u008f\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010pJ\u0012\u0010\u0090\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010pJ\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0095\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010pJ\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0013\u0010\u009a\u0001\u001a\u00020?HÆ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0005\b\u009c\u0001\u0010lJ\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010lJ\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0013\u0010 \u0001\u001a\u00020EHÆ\u0003¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b¢\u0001\u0010pJ\u0012\u0010£\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b£\u0001\u0010pJ\u0012\u0010¤\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b¤\u0001\u0010pJ\u0012\u0010¥\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b¥\u0001\u0010pJ\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010KHÆ\u0003¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010MHÆ\u0003¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0005\bª\u0001\u0010nJ\u0014\u0010«\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0005\b«\u0001\u0010nJ\u0012\u0010¬\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b¬\u0001\u0010pJ\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0012\u0010¯\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b¯\u0001\u0010pJ\u0015\u0010°\u0001\u001a\u0004\u0018\u00010THÆ\u0003¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0012\u0010²\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b²\u0001\u0010pJ\u0012\u0010³\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b³\u0001\u0010pJ\u0012\u0010´\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b´\u0001\u0010pJ\u0012\u0010µ\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\bµ\u0001\u0010pJ£\u0005\u0010¶\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2&\b\u0002\u0010.\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)j\u0002`,\u0012\u0004\u0012\u00020-0\u000e2\b\b\u0002\u0010/\u001a\u00020\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00101\u001a\u00020\f2\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002020\u000e2\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020\f2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020\f2\b\b\u0002\u0010H\u001a\u00020\f2\b\b\u0002\u0010I\u001a\u00020\f2\b\b\u0002\u0010J\u001a\u00020\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010Q\u001a\u00020\f2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010S\u001a\u00020\f2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010V\u001a\u00020\f2\b\b\u0002\u0010W\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\b\b\u0002\u0010Y\u001a\u00020\fHÆ\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0012\u0010¸\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0005\b¸\u0001\u0010nJ\u0012\u0010¹\u0001\u001a\u00020^HÖ\u0001¢\u0006\u0005\b¹\u0001\u0010dJ\u001f\u0010¼\u0001\u001a\u00020\f2\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u0001HÖ\u0003¢\u0006\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010fR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010hR\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010Â\u0001\u001a\u0005\bÃ\u0001\u0010jR\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010lR\u0019\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010Æ\u0001\u001a\u0005\bÇ\u0001\u0010nR\u0019\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\r\u0010È\u0001\u001a\u0005\bÉ\u0001\u0010pR%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010rR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010Æ\u0001\u001a\u0005\bÌ\u0001\u0010nR\u0018\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b\u0012\u0010È\u0001\u001a\u0004\b\u0012\u0010pR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010Æ\u0001\u001a\u0005\bÍ\u0001\u0010nR\u0018\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b\u0014\u0010È\u0001\u001a\u0004\b\u0014\u0010pR$\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0016\u0010Î\u0001\u0012\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0005\bÏ\u0001\u0010xR\u0019\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010È\u0001\u001a\u0005\bÒ\u0001\u0010pR\u0019\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010È\u0001\u001a\u0005\bÓ\u0001\u0010pR\u0019\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010È\u0001\u001a\u0005\bÔ\u0001\u0010pR\u0019\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010Õ\u0001\u001a\u0005\bÖ\u0001\u0010}R!\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010×\u0001\u001a\u0005\bØ\u0001\u0010\u007fR\u0019\u0010\u001f\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010È\u0001\u001a\u0005\bÙ\u0001\u0010pR\u0018\u0010 \u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b \u0010È\u0001\u001a\u0004\b \u0010pR\u001a\u0010\"\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b\"\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010\u0083\u0001R\u001a\u0010$\u001a\u00020#8\u0006¢\u0006\u000f\n\u0005\b$\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010\u0085\u0001R\u001a\u0010&\u001a\u00020%8\u0006¢\u0006\u000f\n\u0005\b&\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010\u0087\u0001R'\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b(\u0010à\u0001\u0012\u0006\bâ\u0001\u0010Ñ\u0001\u001a\u0006\bá\u0001\u0010\u0089\u0001R7\u0010.\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)j\u0002`,\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\u000e\n\u0005\b.\u0010Ê\u0001\u001a\u0005\bã\u0001\u0010rR\u0018\u0010/\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b/\u0010È\u0001\u001a\u0004\b/\u0010pR\u001b\u00100\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b0\u0010Ä\u0001\u001a\u0005\bä\u0001\u0010lR\u0019\u00101\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b1\u0010È\u0001\u001a\u0005\bå\u0001\u0010pR%\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002020\u000e8\u0006¢\u0006\u000e\n\u0005\b3\u0010Ê\u0001\u001a\u0005\bæ\u0001\u0010rR\u0018\u00104\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b4\u0010È\u0001\u001a\u0004\b4\u0010pR\u0019\u00105\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b5\u0010È\u0001\u001a\u0005\bç\u0001\u0010pR\u001c\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000f\n\u0005\b7\u0010è\u0001\u001a\u0006\bé\u0001\u0010\u0092\u0001R\u001c\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000f\n\u0005\b9\u0010ê\u0001\u001a\u0006\bë\u0001\u0010\u0094\u0001R\u0019\u0010:\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b:\u0010È\u0001\u001a\u0005\bì\u0001\u0010pR\u001c\u0010<\u001a\u0004\u0018\u00010;8\u0006¢\u0006\u000f\n\u0005\b<\u0010í\u0001\u001a\u0006\bî\u0001\u0010\u0097\u0001R\u001c\u0010>\u001a\u0004\u0018\u00010=8\u0006¢\u0006\u000f\n\u0005\b>\u0010ï\u0001\u001a\u0006\bð\u0001\u0010\u0099\u0001R\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0005\b@\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010\u009b\u0001R\u001b\u0010A\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\bA\u0010Ä\u0001\u001a\u0005\bó\u0001\u0010lR\u001b\u0010B\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\bB\u0010Ä\u0001\u001a\u0005\bô\u0001\u0010lR\u001c\u0010D\u001a\u0004\u0018\u00010C8\u0006¢\u0006\u000f\n\u0005\bD\u0010õ\u0001\u001a\u0006\bö\u0001\u0010\u009f\u0001R\u001a\u0010F\u001a\u00020E8\u0006¢\u0006\u000f\n\u0005\bF\u0010÷\u0001\u001a\u0006\bø\u0001\u0010¡\u0001R\u0019\u0010G\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bG\u0010È\u0001\u001a\u0005\bù\u0001\u0010pR\u0019\u0010H\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bH\u0010È\u0001\u001a\u0005\bú\u0001\u0010pR\u0019\u0010I\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bI\u0010È\u0001\u001a\u0005\bû\u0001\u0010pR\u0019\u0010J\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bJ\u0010È\u0001\u001a\u0005\bü\u0001\u0010pR\u001c\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\u000f\n\u0005\bL\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010§\u0001R\u001c\u0010N\u001a\u0004\u0018\u00010M8\u0006¢\u0006\u000f\n\u0005\bN\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010©\u0001R\u001b\u0010O\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\bO\u0010Æ\u0001\u001a\u0005\b\u0081\u0002\u0010nR\u001b\u0010P\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\bP\u0010Æ\u0001\u001a\u0005\b\u0082\u0002\u0010nR\u0019\u0010Q\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bQ\u0010È\u0001\u001a\u0005\b\u0083\u0002\u0010pR\u001c\u0010R\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bR\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010®\u0001R\u0019\u0010S\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bS\u0010È\u0001\u001a\u0005\b\u0086\u0002\u0010pR\u001c\u0010U\u001a\u0004\u0018\u00010T8\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010±\u0001R\u0019\u0010V\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bV\u0010È\u0001\u001a\u0005\b\u0089\u0002\u0010pR\u0019\u0010W\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bW\u0010È\u0001\u001a\u0005\b\u008a\u0002\u0010pR\u0018\u0010X\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\bX\u0010È\u0001\u001a\u0004\bX\u0010pR\u0018\u0010Y\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\bY\u0010È\u0001\u001a\u0004\bY\u0010pR%\u0010\u008c\u0002\u001a\u00030\u008b\u00028\u0006¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u0012\u0006\b\u0090\u0002\u0010Ñ\u0001\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002¨\u0006\u0092\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "direction", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "Ljava/math/BigDecimal;", "amount", "", "inputChars", "", "animateInput", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferAccounts", "fromAccountId", "isFromAccountFixed", "toAccountId", "isToAccountFixed", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "hideFrequency", "shouldShowFrequencyBottomSheetOnLaunch", "stopShowingFrequencyBottomSheetOnLaunch", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "mode", "", "Lcom/robinhood/models/util/Money;", "depositSuggestionPills", "skipWaitingForSuggestionPills", "isCreatingTransfer", "Lmicrogram/android/RemoteMicrogramApplication;", "disclosureMicrogramApplication", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "transferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "additionalDataState", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "selectedAchTransferOption", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "Lcom/robinhood/models/db/TransferDirection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsKey;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "transferLimits", "isEligibleForInstantDeposits", "eligbleDepositAsInstant", "hasSeenGoldNativeFundingUpsell", "", "paymentMethodLastUsagesMap", "isInIndividualAccountDepositsDefaultingExperiment", "configureForOutgoingWires", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "outgoingWireDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "outgoingWireRoutingDetails", "overrideNoEnokiAlert", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", CreateTransferDuxo.SAVED_STATE_DISTRIBUTION_INFO, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", CreateTransferDuxo.SAVED_STATE_IRA_DISTRIBUTION_FEE, "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "iraCalculatedTaxWithholdingResult", "iraFederalWithholdingPercentOverride", "iraStateWithholdingPercentOverride", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "j$/time/Year", "systemCalendarYear", "overrideDistributionEnokiRemovalAlert", "overrideDistributionPreReviewAlert", "overrideGoldApyBoostMinDepositCheck", "showDisclosure", "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "depositIncentivePillData", "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "depositIncentiveCancelDialog", "promotionName", "promotionType", "inRecurringIncludeDepositExperiment", "pendingTransferAccountToSet", "inRothConversionAdvisoryExperiment", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "rothConversionTransferInfo", "shouldShowRothIraReviewStateErrorRetryText", "makingRothConversion", "isLimitWireUpsellEnabled", "isMemberPdtRevampV1", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/models/api/bonfire/TransferFrequency;ZZZLcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Ljava/util/List;ZZLmicrogram/android/RemoteMicrogramApplication;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;Lcom/robinhood/android/lib/transfers/AchTransferOption;Ljava/util/Map;ZLjava/math/BigDecimal;ZLjava/util/Map;ZZLcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;ZLcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lj$/time/Year;ZZZZLcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/TransferAccount;ZLcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;ZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "component3", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component4", "()Ljava/math/BigDecimal;", "component5", "()Ljava/lang/String;", "component6", "()Z", "component7", "()Ljava/util/Map;", "component8", "component9", "component10", "component11", "component12", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component13", "component14", "component15", "component16", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "component17", "()Ljava/util/List;", "component18", "component19", "component20", "()Lmicrogram/android/RemoteMicrogramApplication;", "component21", "()Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "component22", "()Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "component23", "()Lcom/robinhood/android/lib/transfers/AchTransferOption;", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "()Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "component32", "()Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "component33", "component34", "()Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "component35", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "component36", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "component37", "component38", "component39", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "component40", "()Lj$/time/Year;", "component41", "component42", "component43", "component44", "component45", "()Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "component46", "()Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "component47", "component48", "component49", "component50", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component51", "component52", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "component53", "component54", "component55", "component56", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/models/api/bonfire/TransferFrequency;ZZZLcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Ljava/util/List;ZZLmicrogram/android/RemoteMicrogramApplication;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;Lcom/robinhood/android/lib/transfers/AchTransferOption;Ljava/util/Map;ZLjava/math/BigDecimal;ZLjava/util/Map;ZZLcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;ZLcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lj$/time/Year;ZZZZLcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/TransferAccount;ZLcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;ZZZZ)Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getSessionId", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getDirection", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getInputChars", "Z", "getAnimateInput", "Ljava/util/Map;", "getTransferAccounts", "getFromAccountId", "getToAccountId", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "getFrequency$annotations", "()V", "getHideFrequency", "getShouldShowFrequencyBottomSheetOnLaunch", "getStopShowingFrequencyBottomSheetOnLaunch", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "getMode", "Ljava/util/List;", "getDepositSuggestionPills", "getSkipWaitingForSuggestionPills", "Lmicrogram/android/RemoteMicrogramApplication;", "getDisclosureMicrogramApplication", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "getTransferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "getAdditionalDataState", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "getSelectedAchTransferOption", "getSelectedAchTransferOption$annotations", "getTransferLimits", "getEligbleDepositAsInstant", "getHasSeenGoldNativeFundingUpsell", "getPaymentMethodLastUsagesMap", "getConfigureForOutgoingWires", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "getOutgoingWireDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "getOutgoingWireRoutingDetails", "getOverrideNoEnokiAlert", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "getIraDistribution", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "getIraDistributionFee", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "getIraCalculatedTaxWithholdingResult", "getIraFederalWithholdingPercentOverride", "getIraStateWithholdingPercentOverride", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getIraContribution", "Lj$/time/Year;", "getSystemCalendarYear", "getOverrideDistributionEnokiRemovalAlert", "getOverrideDistributionPreReviewAlert", "getOverrideGoldApyBoostMinDepositCheck", "getShowDisclosure", "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "getDepositIncentivePillData", "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "getDepositIncentiveCancelDialog", "getPromotionName", "getPromotionType", "getInRecurringIncludeDepositExperiment", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getPendingTransferAccountToSet", "getInRothConversionAdvisoryExperiment", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "getRothConversionTransferInfo", "getShouldShowRothIraReviewStateErrorRetryText", "getMakingRothConversion", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "maxTransferContext", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "getMaxTransferContext", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "getMaxTransferContext$annotations", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferV2DataState implements Parcelable {
    private final CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState;
    private final BigDecimal amount;
    private final boolean animateInput;
    private final boolean configureForOutgoingWires;
    private final DepositIncentiveCancellationDialogData depositIncentiveCancelDialog;
    private final DepositIncentivePillData depositIncentivePillData;
    private final List<Money> depositSuggestionPills;
    private final TransferDirectionV2 direction;
    private final RemoteMicrogramApplication disclosureMicrogramApplication;
    private final BigDecimal eligbleDepositAsInstant;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiCreateTransferRequest2 frequency;
    private final String fromAccountId;
    private final boolean hasSeenGoldNativeFundingUpsell;
    private final boolean hideFrequency;
    private final boolean inRecurringIncludeDepositExperiment;
    private final boolean inRothConversionAdvisoryExperiment;
    private final String inputChars;
    private final CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult;
    private final IraContributionQuestionnaireResult.IraContribution iraContribution;
    private final IraDistributionQuestionnaireResult.IraDistribution iraDistribution;
    private final ApiIraDistributionFee iraDistributionFee;
    private final BigDecimal iraFederalWithholdingPercentOverride;
    private final BigDecimal iraStateWithholdingPercentOverride;
    private final boolean isCreatingTransfer;
    private final boolean isEligibleForInstantDeposits;
    private final boolean isFromAccountFixed;
    private final boolean isInIndividualAccountDepositsDefaultingExperiment;
    private final boolean isLimitWireUpsellEnabled;
    private final boolean isMemberPdtRevampV1;
    private final boolean isToAccountFixed;
    private final boolean makingRothConversion;
    private final MAXTransferContext maxTransferContext;
    private final CreateTransferViewState.Mode mode;
    private final ApiOutgoingWireDetails outgoingWireDetails;
    private final WireRoutingDetailsInputActivityResultContract3.Success outgoingWireRoutingDetails;
    private final boolean overrideDistributionEnokiRemovalAlert;
    private final boolean overrideDistributionPreReviewAlert;
    private final boolean overrideGoldApyBoostMinDepositCheck;
    private final boolean overrideNoEnokiAlert;
    private final Map<String, Long> paymentMethodLastUsagesMap;
    private final TransferAccount pendingTransferAccountToSet;
    private final String promotionName;
    private final String promotionType;
    private final ApiRothConversionTransferInfo rothConversionTransferInfo;
    private final AchTransferOption selectedAchTransferOption;
    private final UUID sessionId;
    private final boolean shouldShowFrequencyBottomSheetOnLaunch;
    private final boolean shouldShowRothIraReviewStateErrorRetryText;
    private final boolean showDisclosure;
    private final boolean skipWaitingForSuggestionPills;
    private final boolean stopShowingFrequencyBottomSheetOnLaunch;
    private final Year systemCalendarYear;
    private final String toAccountId;
    private final Map<String, TransferAccount> transferAccounts;
    private final Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> transferLimits;
    private final TransferSummaryState transferSummaryState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateTransferV2DataState> CREATOR = new Creator();
    private static final Screen screen = new Screen(Screen.Name.CREATE_TRANSFER_V2, null, null, null, 14, null);

    /* compiled from: CreateTransferV2DataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateTransferV2DataState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateTransferV2DataState createFromParcel(Parcel parcel) {
            boolean z;
            Class cls;
            boolean z2;
            Class cls2;
            ApiCreateTransferRequest2 apiCreateTransferRequest2;
            boolean z3;
            Class cls3;
            boolean z4;
            Class cls4;
            boolean z5;
            ArrayList arrayList;
            UUID uuid;
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState;
            boolean z6;
            Class cls5;
            CreateTransferViewState.Mode mode;
            ArrayList arrayList2;
            BigDecimal bigDecimal;
            UUID uuid2;
            TransferSummaryState transferSummaryState;
            boolean z7;
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState2;
            boolean z8;
            boolean z9;
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution;
            CreateTransferDuxo.CalculatedTaxWithholdingResult calculatedTaxWithholdingResult;
            Year year;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            TransferAccount transferAccount;
            boolean z16;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid3 = (UUID) parcel.readSerializable();
            TransferDirectionV2 transferDirectionV2ValueOf = TransferDirectionV2.valueOf(parcel.readString());
            MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            boolean z17 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z17 = false;
            }
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateTransferV2DataState.class.getClassLoader()));
            }
            String string3 = parcel.readString();
            boolean z18 = parcel.readInt() != 0 ? z : false;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = CreateTransferV2DataState.class;
                z2 = z;
            } else {
                cls = CreateTransferV2DataState.class;
                z2 = false;
            }
            ApiCreateTransferRequest2 apiCreateTransferRequest2ValueOf = ApiCreateTransferRequest2.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                cls2 = cls;
                apiCreateTransferRequest2 = apiCreateTransferRequest2ValueOf;
                z3 = z;
            } else {
                cls2 = cls;
                apiCreateTransferRequest2 = apiCreateTransferRequest2ValueOf;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                cls3 = cls2;
                z4 = z;
            } else {
                cls3 = cls2;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                cls4 = cls3;
                z5 = z;
            } else {
                cls4 = cls3;
                z5 = false;
            }
            CreateTransferViewState.Mode modeValueOf = CreateTransferViewState.Mode.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                uuid = uuid3;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                uuid = uuid3;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList.add(parcel.readParcelable(cls4.getClassLoader()));
                    i4++;
                    i3 = i3;
                }
            }
            boolean z19 = parcel.readInt() != 0;
            boolean z20 = parcel.readInt() != 0;
            RemoteMicrogramApplication remoteMicrogramApplication = (RemoteMicrogramApplication) parcel.readParcelable(cls4.getClassLoader());
            TransferSummaryState transferSummaryState2 = (TransferSummaryState) parcel.readParcelable(cls4.getClassLoader());
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState3 = (CreateTransferV2AdditionalDataClient.AdditionalDataState) parcel.readParcelable(cls4.getClassLoader());
            AchTransferOption achTransferOptionValueOf = parcel.readInt() == 0 ? null : AchTransferOption.valueOf(parcel.readString());
            int i5 = parcel.readInt();
            ArrayList arrayList3 = arrayList;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
            int i6 = 0;
            while (i6 != i5) {
                linkedHashMap2.put(parcel.readSerializable(), parcel.readParcelable(cls4.getClassLoader()));
                i6++;
                i5 = i5;
            }
            if (parcel.readInt() != 0) {
                additionalDataState = additionalDataState3;
                z6 = true;
            } else {
                additionalDataState = additionalDataState3;
                z6 = false;
            }
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                cls5 = cls4;
                mode = modeValueOf;
                arrayList2 = arrayList3;
                bigDecimal = bigDecimal3;
                uuid2 = uuid;
                transferSummaryState = transferSummaryState2;
                z7 = true;
            } else {
                cls5 = cls4;
                mode = modeValueOf;
                arrayList2 = arrayList3;
                bigDecimal = bigDecimal3;
                uuid2 = uuid;
                transferSummaryState = transferSummaryState2;
                z7 = false;
            }
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState4 = additionalDataState;
            int i7 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
            UUID uuid4 = uuid2;
            int i8 = 0;
            while (i8 != i7) {
                linkedHashMap3.put(parcel.readString(), Long.valueOf(parcel.readLong()));
                i8++;
                i7 = i7;
            }
            if (parcel.readInt() != 0) {
                additionalDataState2 = additionalDataState4;
                z8 = true;
            } else {
                additionalDataState2 = additionalDataState4;
                z8 = false;
            }
            boolean z21 = parcel.readInt() != 0;
            ApiOutgoingWireDetails apiOutgoingWireDetails = (ApiOutgoingWireDetails) parcel.readParcelable(cls5.getClassLoader());
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState5 = additionalDataState2;
            WireRoutingDetailsInputActivityResultContract3.Success success = (WireRoutingDetailsInputActivityResultContract3.Success) parcel.readParcelable(cls5.getClassLoader());
            boolean z22 = parcel.readInt() != 0;
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution2 = (IraDistributionQuestionnaireResult.IraDistribution) parcel.readParcelable(cls5.getClassLoader());
            ApiIraDistributionFee apiIraDistributionFee = (ApiIraDistributionFee) parcel.readParcelable(cls5.getClassLoader());
            CreateTransferDuxo.CalculatedTaxWithholdingResult calculatedTaxWithholdingResult2 = (CreateTransferDuxo.CalculatedTaxWithholdingResult) parcel.readParcelable(cls5.getClassLoader());
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) parcel.readParcelable(cls5.getClassLoader());
            Year year2 = (Year) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z9 = true;
                iraDistribution = iraDistribution2;
                calculatedTaxWithholdingResult = calculatedTaxWithholdingResult2;
                year = year2;
                z10 = true;
            } else {
                z9 = true;
                iraDistribution = iraDistribution2;
                calculatedTaxWithholdingResult = calculatedTaxWithholdingResult2;
                year = year2;
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = z9;
            } else {
                z11 = z9;
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = z12;
            } else {
                z13 = z12;
                z12 = false;
            }
            DepositIncentivePillData depositIncentivePillData = (DepositIncentivePillData) parcel.readParcelable(cls5.getClassLoader());
            DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData = (DepositIncentiveCancellationDialogData) parcel.readParcelable(cls5.getClassLoader());
            String string5 = parcel.readString();
            boolean z23 = z13;
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = z23;
            } else {
                z14 = z23;
                z23 = false;
            }
            TransferAccount transferAccount2 = (TransferAccount) parcel.readParcelable(cls5.getClassLoader());
            boolean z24 = parcel.readInt() != 0 ? z14 : false;
            ApiRothConversionTransferInfo apiRothConversionTransferInfo = (ApiRothConversionTransferInfo) parcel.readParcelable(cls5.getClassLoader());
            if (parcel.readInt() != 0) {
                z15 = z14;
                transferAccount = transferAccount2;
                z16 = z15;
            } else {
                z15 = z14;
                transferAccount = transferAccount2;
                z16 = false;
            }
            return new CreateTransferV2DataState(uuid4, transferDirectionV2ValueOf, entryPointValueOf, bigDecimal2, string2, z17, linkedHashMap, string3, z18, string4, z2, apiCreateTransferRequest2, z3, z4, z5, mode, arrayList2, z19, z20, remoteMicrogramApplication, transferSummaryState, additionalDataState5, achTransferOptionValueOf, linkedHashMap2, z6, bigDecimal, z7, linkedHashMap3, z8, z21, apiOutgoingWireDetails, success, z22, iraDistribution, apiIraDistributionFee, calculatedTaxWithholdingResult, bigDecimal4, bigDecimal5, iraContribution, year, z10, z9, z11, z12, depositIncentivePillData, depositIncentiveCancellationDialogData, string5, string6, z23, transferAccount, z24, apiRothConversionTransferInfo, z16, parcel.readInt() != 0 ? z15 : false, parcel.readInt() != 0 ? z15 : false, parcel.readInt() != 0 ? z15 : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateTransferV2DataState[] newArray(int i) {
            return new CreateTransferV2DataState[i];
        }
    }

    /* compiled from: CreateTransferV2DataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated
    public static /* synthetic */ void getFrequency$annotations() {
    }

    public static /* synthetic */ void getMaxTransferContext$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSelectedAchTransferOption$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getToAccountId() {
        return this.toAccountId;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsToAccountFixed() {
        return this.isToAccountFixed;
    }

    /* renamed from: component12, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHideFrequency() {
        return this.hideFrequency;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShouldShowFrequencyBottomSheetOnLaunch() {
        return this.shouldShowFrequencyBottomSheetOnLaunch;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getStopShowingFrequencyBottomSheetOnLaunch() {
        return this.stopShowingFrequencyBottomSheetOnLaunch;
    }

    /* renamed from: component16, reason: from getter */
    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    public final List<Money> component17() {
        return this.depositSuggestionPills;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getSkipWaitingForSuggestionPills() {
        return this.skipWaitingForSuggestionPills;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    /* renamed from: component20, reason: from getter */
    public final RemoteMicrogramApplication getDisclosureMicrogramApplication() {
        return this.disclosureMicrogramApplication;
    }

    /* renamed from: component21, reason: from getter */
    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    /* renamed from: component22, reason: from getter */
    public final CreateTransferV2AdditionalDataClient.AdditionalDataState getAdditionalDataState() {
        return this.additionalDataState;
    }

    /* renamed from: component23, reason: from getter */
    public final AchTransferOption getSelectedAchTransferOption() {
        return this.selectedAchTransferOption;
    }

    public final Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> component24() {
        return this.transferLimits;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsEligibleForInstantDeposits() {
        return this.isEligibleForInstantDeposits;
    }

    /* renamed from: component26, reason: from getter */
    public final BigDecimal getEligbleDepositAsInstant() {
        return this.eligbleDepositAsInstant;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getHasSeenGoldNativeFundingUpsell() {
        return this.hasSeenGoldNativeFundingUpsell;
    }

    public final Map<String, Long> component28() {
        return this.paymentMethodLastUsagesMap;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsInIndividualAccountDepositsDefaultingExperiment() {
        return this.isInIndividualAccountDepositsDefaultingExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getConfigureForOutgoingWires() {
        return this.configureForOutgoingWires;
    }

    /* renamed from: component31, reason: from getter */
    public final ApiOutgoingWireDetails getOutgoingWireDetails() {
        return this.outgoingWireDetails;
    }

    /* renamed from: component32, reason: from getter */
    public final WireRoutingDetailsInputActivityResultContract3.Success getOutgoingWireRoutingDetails() {
        return this.outgoingWireRoutingDetails;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    /* renamed from: component34, reason: from getter */
    public final IraDistributionQuestionnaireResult.IraDistribution getIraDistribution() {
        return this.iraDistribution;
    }

    /* renamed from: component35, reason: from getter */
    public final ApiIraDistributionFee getIraDistributionFee() {
        return this.iraDistributionFee;
    }

    /* renamed from: component36, reason: from getter */
    public final CreateTransferDuxo.CalculatedTaxWithholdingResult getIraCalculatedTaxWithholdingResult() {
        return this.iraCalculatedTaxWithholdingResult;
    }

    /* renamed from: component37, reason: from getter */
    public final BigDecimal getIraFederalWithholdingPercentOverride() {
        return this.iraFederalWithholdingPercentOverride;
    }

    /* renamed from: component38, reason: from getter */
    public final BigDecimal getIraStateWithholdingPercentOverride() {
        return this.iraStateWithholdingPercentOverride;
    }

    /* renamed from: component39, reason: from getter */
    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component40, reason: from getter */
    public final Year getSystemCalendarYear() {
        return this.systemCalendarYear;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getOverrideDistributionEnokiRemovalAlert() {
        return this.overrideDistributionEnokiRemovalAlert;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getOverrideDistributionPreReviewAlert() {
        return this.overrideDistributionPreReviewAlert;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getOverrideGoldApyBoostMinDepositCheck() {
        return this.overrideGoldApyBoostMinDepositCheck;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    /* renamed from: component45, reason: from getter */
    public final DepositIncentivePillData getDepositIncentivePillData() {
        return this.depositIncentivePillData;
    }

    /* renamed from: component46, reason: from getter */
    public final DepositIncentiveCancellationDialogData getDepositIncentiveCancelDialog() {
        return this.depositIncentiveCancelDialog;
    }

    /* renamed from: component47, reason: from getter */
    public final String getPromotionName() {
        return this.promotionName;
    }

    /* renamed from: component48, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getInRecurringIncludeDepositExperiment() {
        return this.inRecurringIncludeDepositExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInputChars() {
        return this.inputChars;
    }

    /* renamed from: component50, reason: from getter */
    public final TransferAccount getPendingTransferAccountToSet() {
        return this.pendingTransferAccountToSet;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getInRothConversionAdvisoryExperiment() {
        return this.inRothConversionAdvisoryExperiment;
    }

    /* renamed from: component52, reason: from getter */
    public final ApiRothConversionTransferInfo getRothConversionTransferInfo() {
        return this.rothConversionTransferInfo;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getShouldShowRothIraReviewStateErrorRetryText() {
        return this.shouldShowRothIraReviewStateErrorRetryText;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getMakingRothConversion() {
        return this.makingRothConversion;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getIsLimitWireUpsellEnabled() {
        return this.isLimitWireUpsellEnabled;
    }

    /* renamed from: component56, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final Map<String, TransferAccount> component7() {
        return this.transferAccounts;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFromAccountId() {
        return this.fromAccountId;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFromAccountFixed() {
        return this.isFromAccountFixed;
    }

    public final CreateTransferV2DataState copy(UUID sessionId, TransferDirectionV2 direction, MAXTransferContext.EntryPoint entryPoint, BigDecimal amount, String inputChars, boolean animateInput, Map<String, TransferAccount> transferAccounts, String fromAccountId, boolean isFromAccountFixed, String toAccountId, boolean isToAccountFixed, ApiCreateTransferRequest2 frequency, boolean hideFrequency, boolean shouldShowFrequencyBottomSheetOnLaunch, boolean stopShowingFrequencyBottomSheetOnLaunch, CreateTransferViewState.Mode mode, List<Money> depositSuggestionPills, boolean skipWaitingForSuggestionPills, boolean isCreatingTransfer, RemoteMicrogramApplication disclosureMicrogramApplication, TransferSummaryState transferSummaryState, CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState, AchTransferOption selectedAchTransferOption, Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> transferLimits, boolean isEligibleForInstantDeposits, BigDecimal eligbleDepositAsInstant, boolean hasSeenGoldNativeFundingUpsell, Map<String, Long> paymentMethodLastUsagesMap, boolean isInIndividualAccountDepositsDefaultingExperiment, boolean configureForOutgoingWires, ApiOutgoingWireDetails outgoingWireDetails, WireRoutingDetailsInputActivityResultContract3.Success outgoingWireRoutingDetails, boolean overrideNoEnokiAlert, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionFee iraDistributionFee, CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult, BigDecimal iraFederalWithholdingPercentOverride, BigDecimal iraStateWithholdingPercentOverride, IraContributionQuestionnaireResult.IraContribution iraContribution, Year systemCalendarYear, boolean overrideDistributionEnokiRemovalAlert, boolean overrideDistributionPreReviewAlert, boolean overrideGoldApyBoostMinDepositCheck, boolean showDisclosure, DepositIncentivePillData depositIncentivePillData, DepositIncentiveCancellationDialogData depositIncentiveCancelDialog, String promotionName, String promotionType, boolean inRecurringIncludeDepositExperiment, TransferAccount pendingTransferAccountToSet, boolean inRothConversionAdvisoryExperiment, ApiRothConversionTransferInfo rothConversionTransferInfo, boolean shouldShowRothIraReviewStateErrorRetryText, boolean makingRothConversion, boolean isLimitWireUpsellEnabled, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(disclosureMicrogramApplication, "disclosureMicrogramApplication");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        Intrinsics.checkNotNullParameter(additionalDataState, "additionalDataState");
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesMap, "paymentMethodLastUsagesMap");
        Intrinsics.checkNotNullParameter(iraCalculatedTaxWithholdingResult, "iraCalculatedTaxWithholdingResult");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        return new CreateTransferV2DataState(sessionId, direction, entryPoint, amount, inputChars, animateInput, transferAccounts, fromAccountId, isFromAccountFixed, toAccountId, isToAccountFixed, frequency, hideFrequency, shouldShowFrequencyBottomSheetOnLaunch, stopShowingFrequencyBottomSheetOnLaunch, mode, depositSuggestionPills, skipWaitingForSuggestionPills, isCreatingTransfer, disclosureMicrogramApplication, transferSummaryState, additionalDataState, selectedAchTransferOption, transferLimits, isEligibleForInstantDeposits, eligbleDepositAsInstant, hasSeenGoldNativeFundingUpsell, paymentMethodLastUsagesMap, isInIndividualAccountDepositsDefaultingExperiment, configureForOutgoingWires, outgoingWireDetails, outgoingWireRoutingDetails, overrideNoEnokiAlert, iraDistribution, iraDistributionFee, iraCalculatedTaxWithholdingResult, iraFederalWithholdingPercentOverride, iraStateWithholdingPercentOverride, iraContribution, systemCalendarYear, overrideDistributionEnokiRemovalAlert, overrideDistributionPreReviewAlert, overrideGoldApyBoostMinDepositCheck, showDisclosure, depositIncentivePillData, depositIncentiveCancelDialog, promotionName, promotionType, inRecurringIncludeDepositExperiment, pendingTransferAccountToSet, inRothConversionAdvisoryExperiment, rothConversionTransferInfo, shouldShowRothIraReviewStateErrorRetryText, makingRothConversion, isLimitWireUpsellEnabled, isMemberPdtRevampV1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferV2DataState)) {
            return false;
        }
        CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) other;
        return Intrinsics.areEqual(this.sessionId, createTransferV2DataState.sessionId) && this.direction == createTransferV2DataState.direction && this.entryPoint == createTransferV2DataState.entryPoint && Intrinsics.areEqual(this.amount, createTransferV2DataState.amount) && Intrinsics.areEqual(this.inputChars, createTransferV2DataState.inputChars) && this.animateInput == createTransferV2DataState.animateInput && Intrinsics.areEqual(this.transferAccounts, createTransferV2DataState.transferAccounts) && Intrinsics.areEqual(this.fromAccountId, createTransferV2DataState.fromAccountId) && this.isFromAccountFixed == createTransferV2DataState.isFromAccountFixed && Intrinsics.areEqual(this.toAccountId, createTransferV2DataState.toAccountId) && this.isToAccountFixed == createTransferV2DataState.isToAccountFixed && this.frequency == createTransferV2DataState.frequency && this.hideFrequency == createTransferV2DataState.hideFrequency && this.shouldShowFrequencyBottomSheetOnLaunch == createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch && this.stopShowingFrequencyBottomSheetOnLaunch == createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch && this.mode == createTransferV2DataState.mode && Intrinsics.areEqual(this.depositSuggestionPills, createTransferV2DataState.depositSuggestionPills) && this.skipWaitingForSuggestionPills == createTransferV2DataState.skipWaitingForSuggestionPills && this.isCreatingTransfer == createTransferV2DataState.isCreatingTransfer && Intrinsics.areEqual(this.disclosureMicrogramApplication, createTransferV2DataState.disclosureMicrogramApplication) && Intrinsics.areEqual(this.transferSummaryState, createTransferV2DataState.transferSummaryState) && Intrinsics.areEqual(this.additionalDataState, createTransferV2DataState.additionalDataState) && this.selectedAchTransferOption == createTransferV2DataState.selectedAchTransferOption && Intrinsics.areEqual(this.transferLimits, createTransferV2DataState.transferLimits) && this.isEligibleForInstantDeposits == createTransferV2DataState.isEligibleForInstantDeposits && Intrinsics.areEqual(this.eligbleDepositAsInstant, createTransferV2DataState.eligbleDepositAsInstant) && this.hasSeenGoldNativeFundingUpsell == createTransferV2DataState.hasSeenGoldNativeFundingUpsell && Intrinsics.areEqual(this.paymentMethodLastUsagesMap, createTransferV2DataState.paymentMethodLastUsagesMap) && this.isInIndividualAccountDepositsDefaultingExperiment == createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment && this.configureForOutgoingWires == createTransferV2DataState.configureForOutgoingWires && Intrinsics.areEqual(this.outgoingWireDetails, createTransferV2DataState.outgoingWireDetails) && Intrinsics.areEqual(this.outgoingWireRoutingDetails, createTransferV2DataState.outgoingWireRoutingDetails) && this.overrideNoEnokiAlert == createTransferV2DataState.overrideNoEnokiAlert && Intrinsics.areEqual(this.iraDistribution, createTransferV2DataState.iraDistribution) && Intrinsics.areEqual(this.iraDistributionFee, createTransferV2DataState.iraDistributionFee) && Intrinsics.areEqual(this.iraCalculatedTaxWithholdingResult, createTransferV2DataState.iraCalculatedTaxWithholdingResult) && Intrinsics.areEqual(this.iraFederalWithholdingPercentOverride, createTransferV2DataState.iraFederalWithholdingPercentOverride) && Intrinsics.areEqual(this.iraStateWithholdingPercentOverride, createTransferV2DataState.iraStateWithholdingPercentOverride) && Intrinsics.areEqual(this.iraContribution, createTransferV2DataState.iraContribution) && Intrinsics.areEqual(this.systemCalendarYear, createTransferV2DataState.systemCalendarYear) && this.overrideDistributionEnokiRemovalAlert == createTransferV2DataState.overrideDistributionEnokiRemovalAlert && this.overrideDistributionPreReviewAlert == createTransferV2DataState.overrideDistributionPreReviewAlert && this.overrideGoldApyBoostMinDepositCheck == createTransferV2DataState.overrideGoldApyBoostMinDepositCheck && this.showDisclosure == createTransferV2DataState.showDisclosure && Intrinsics.areEqual(this.depositIncentivePillData, createTransferV2DataState.depositIncentivePillData) && Intrinsics.areEqual(this.depositIncentiveCancelDialog, createTransferV2DataState.depositIncentiveCancelDialog) && Intrinsics.areEqual(this.promotionName, createTransferV2DataState.promotionName) && Intrinsics.areEqual(this.promotionType, createTransferV2DataState.promotionType) && this.inRecurringIncludeDepositExperiment == createTransferV2DataState.inRecurringIncludeDepositExperiment && Intrinsics.areEqual(this.pendingTransferAccountToSet, createTransferV2DataState.pendingTransferAccountToSet) && this.inRothConversionAdvisoryExperiment == createTransferV2DataState.inRothConversionAdvisoryExperiment && Intrinsics.areEqual(this.rothConversionTransferInfo, createTransferV2DataState.rothConversionTransferInfo) && this.shouldShowRothIraReviewStateErrorRetryText == createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText && this.makingRothConversion == createTransferV2DataState.makingRothConversion && this.isLimitWireUpsellEnabled == createTransferV2DataState.isLimitWireUpsellEnabled && this.isMemberPdtRevampV1 == createTransferV2DataState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.sessionId.hashCode() * 31) + this.direction.hashCode()) * 31) + this.entryPoint.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.inputChars.hashCode()) * 31) + Boolean.hashCode(this.animateInput)) * 31) + this.transferAccounts.hashCode()) * 31;
        String str = this.fromAccountId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFromAccountFixed)) * 31;
        String str2 = this.toAccountId;
        int iHashCode3 = (((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isToAccountFixed)) * 31) + this.frequency.hashCode()) * 31) + Boolean.hashCode(this.hideFrequency)) * 31) + Boolean.hashCode(this.shouldShowFrequencyBottomSheetOnLaunch)) * 31) + Boolean.hashCode(this.stopShowingFrequencyBottomSheetOnLaunch)) * 31) + this.mode.hashCode()) * 31;
        List<Money> list = this.depositSuggestionPills;
        int iHashCode4 = (((((((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.skipWaitingForSuggestionPills)) * 31) + Boolean.hashCode(this.isCreatingTransfer)) * 31) + this.disclosureMicrogramApplication.hashCode()) * 31) + this.transferSummaryState.hashCode()) * 31) + this.additionalDataState.hashCode()) * 31;
        AchTransferOption achTransferOption = this.selectedAchTransferOption;
        int iHashCode5 = (((((iHashCode4 + (achTransferOption == null ? 0 : achTransferOption.hashCode())) * 31) + this.transferLimits.hashCode()) * 31) + Boolean.hashCode(this.isEligibleForInstantDeposits)) * 31;
        BigDecimal bigDecimal = this.eligbleDepositAsInstant;
        int iHashCode6 = (((((((((iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.hasSeenGoldNativeFundingUpsell)) * 31) + this.paymentMethodLastUsagesMap.hashCode()) * 31) + Boolean.hashCode(this.isInIndividualAccountDepositsDefaultingExperiment)) * 31) + Boolean.hashCode(this.configureForOutgoingWires)) * 31;
        ApiOutgoingWireDetails apiOutgoingWireDetails = this.outgoingWireDetails;
        int iHashCode7 = (iHashCode6 + (apiOutgoingWireDetails == null ? 0 : apiOutgoingWireDetails.hashCode())) * 31;
        WireRoutingDetailsInputActivityResultContract3.Success success = this.outgoingWireRoutingDetails;
        int iHashCode8 = (((iHashCode7 + (success == null ? 0 : success.hashCode())) * 31) + Boolean.hashCode(this.overrideNoEnokiAlert)) * 31;
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution = this.iraDistribution;
        int iHashCode9 = (iHashCode8 + (iraDistribution == null ? 0 : iraDistribution.hashCode())) * 31;
        ApiIraDistributionFee apiIraDistributionFee = this.iraDistributionFee;
        int iHashCode10 = (((iHashCode9 + (apiIraDistributionFee == null ? 0 : apiIraDistributionFee.hashCode())) * 31) + this.iraCalculatedTaxWithholdingResult.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.iraFederalWithholdingPercentOverride;
        int iHashCode11 = (iHashCode10 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.iraStateWithholdingPercentOverride;
        int iHashCode12 = (iHashCode11 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        int iHashCode13 = (((((((((((iHashCode12 + (iraContribution == null ? 0 : iraContribution.hashCode())) * 31) + this.systemCalendarYear.hashCode()) * 31) + Boolean.hashCode(this.overrideDistributionEnokiRemovalAlert)) * 31) + Boolean.hashCode(this.overrideDistributionPreReviewAlert)) * 31) + Boolean.hashCode(this.overrideGoldApyBoostMinDepositCheck)) * 31) + Boolean.hashCode(this.showDisclosure)) * 31;
        DepositIncentivePillData depositIncentivePillData = this.depositIncentivePillData;
        int iHashCode14 = (iHashCode13 + (depositIncentivePillData == null ? 0 : depositIncentivePillData.hashCode())) * 31;
        DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData = this.depositIncentiveCancelDialog;
        int iHashCode15 = (iHashCode14 + (depositIncentiveCancellationDialogData == null ? 0 : depositIncentiveCancellationDialogData.hashCode())) * 31;
        String str3 = this.promotionName;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionType;
        int iHashCode17 = (((iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.inRecurringIncludeDepositExperiment)) * 31;
        TransferAccount transferAccount = this.pendingTransferAccountToSet;
        int iHashCode18 = (((iHashCode17 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31) + Boolean.hashCode(this.inRothConversionAdvisoryExperiment)) * 31;
        ApiRothConversionTransferInfo apiRothConversionTransferInfo = this.rothConversionTransferInfo;
        return ((((((((iHashCode18 + (apiRothConversionTransferInfo != null ? apiRothConversionTransferInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowRothIraReviewStateErrorRetryText)) * 31) + Boolean.hashCode(this.makingRothConversion)) * 31) + Boolean.hashCode(this.isLimitWireUpsellEnabled)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "CreateTransferV2DataState(sessionId=" + this.sessionId + ", direction=" + this.direction + ", entryPoint=" + this.entryPoint + ", amount=" + this.amount + ", inputChars=" + this.inputChars + ", animateInput=" + this.animateInput + ", transferAccounts=" + this.transferAccounts + ", fromAccountId=" + this.fromAccountId + ", isFromAccountFixed=" + this.isFromAccountFixed + ", toAccountId=" + this.toAccountId + ", isToAccountFixed=" + this.isToAccountFixed + ", frequency=" + this.frequency + ", hideFrequency=" + this.hideFrequency + ", shouldShowFrequencyBottomSheetOnLaunch=" + this.shouldShowFrequencyBottomSheetOnLaunch + ", stopShowingFrequencyBottomSheetOnLaunch=" + this.stopShowingFrequencyBottomSheetOnLaunch + ", mode=" + this.mode + ", depositSuggestionPills=" + this.depositSuggestionPills + ", skipWaitingForSuggestionPills=" + this.skipWaitingForSuggestionPills + ", isCreatingTransfer=" + this.isCreatingTransfer + ", disclosureMicrogramApplication=" + this.disclosureMicrogramApplication + ", transferSummaryState=" + this.transferSummaryState + ", additionalDataState=" + this.additionalDataState + ", selectedAchTransferOption=" + this.selectedAchTransferOption + ", transferLimits=" + this.transferLimits + ", isEligibleForInstantDeposits=" + this.isEligibleForInstantDeposits + ", eligbleDepositAsInstant=" + this.eligbleDepositAsInstant + ", hasSeenGoldNativeFundingUpsell=" + this.hasSeenGoldNativeFundingUpsell + ", paymentMethodLastUsagesMap=" + this.paymentMethodLastUsagesMap + ", isInIndividualAccountDepositsDefaultingExperiment=" + this.isInIndividualAccountDepositsDefaultingExperiment + ", configureForOutgoingWires=" + this.configureForOutgoingWires + ", outgoingWireDetails=" + this.outgoingWireDetails + ", outgoingWireRoutingDetails=" + this.outgoingWireRoutingDetails + ", overrideNoEnokiAlert=" + this.overrideNoEnokiAlert + ", iraDistribution=" + this.iraDistribution + ", iraDistributionFee=" + this.iraDistributionFee + ", iraCalculatedTaxWithholdingResult=" + this.iraCalculatedTaxWithholdingResult + ", iraFederalWithholdingPercentOverride=" + this.iraFederalWithholdingPercentOverride + ", iraStateWithholdingPercentOverride=" + this.iraStateWithholdingPercentOverride + ", iraContribution=" + this.iraContribution + ", systemCalendarYear=" + this.systemCalendarYear + ", overrideDistributionEnokiRemovalAlert=" + this.overrideDistributionEnokiRemovalAlert + ", overrideDistributionPreReviewAlert=" + this.overrideDistributionPreReviewAlert + ", overrideGoldApyBoostMinDepositCheck=" + this.overrideGoldApyBoostMinDepositCheck + ", showDisclosure=" + this.showDisclosure + ", depositIncentivePillData=" + this.depositIncentivePillData + ", depositIncentiveCancelDialog=" + this.depositIncentiveCancelDialog + ", promotionName=" + this.promotionName + ", promotionType=" + this.promotionType + ", inRecurringIncludeDepositExperiment=" + this.inRecurringIncludeDepositExperiment + ", pendingTransferAccountToSet=" + this.pendingTransferAccountToSet + ", inRothConversionAdvisoryExperiment=" + this.inRothConversionAdvisoryExperiment + ", rothConversionTransferInfo=" + this.rothConversionTransferInfo + ", shouldShowRothIraReviewStateErrorRetryText=" + this.shouldShowRothIraReviewStateErrorRetryText + ", makingRothConversion=" + this.makingRothConversion + ", isLimitWireUpsellEnabled=" + this.isLimitWireUpsellEnabled + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.sessionId);
        dest.writeString(this.direction.name());
        dest.writeString(this.entryPoint.name());
        dest.writeSerializable(this.amount);
        dest.writeString(this.inputChars);
        dest.writeInt(this.animateInput ? 1 : 0);
        Map<String, TransferAccount> map = this.transferAccounts;
        dest.writeInt(map.size());
        for (Map.Entry<String, TransferAccount> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
        dest.writeString(this.fromAccountId);
        dest.writeInt(this.isFromAccountFixed ? 1 : 0);
        dest.writeString(this.toAccountId);
        dest.writeInt(this.isToAccountFixed ? 1 : 0);
        dest.writeString(this.frequency.name());
        dest.writeInt(this.hideFrequency ? 1 : 0);
        dest.writeInt(this.shouldShowFrequencyBottomSheetOnLaunch ? 1 : 0);
        dest.writeInt(this.stopShowingFrequencyBottomSheetOnLaunch ? 1 : 0);
        dest.writeString(this.mode.name());
        List<Money> list = this.depositSuggestionPills;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Money> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeInt(this.skipWaitingForSuggestionPills ? 1 : 0);
        dest.writeInt(this.isCreatingTransfer ? 1 : 0);
        dest.writeParcelable(this.disclosureMicrogramApplication, flags);
        dest.writeParcelable(this.transferSummaryState, flags);
        dest.writeParcelable(this.additionalDataState, flags);
        AchTransferOption achTransferOption = this.selectedAchTransferOption;
        if (achTransferOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(achTransferOption.name());
        }
        Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> map2 = this.transferLimits;
        dest.writeInt(map2.size());
        for (Map.Entry<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> entry2 : map2.entrySet()) {
            dest.writeSerializable(entry2.getKey());
            dest.writeParcelable(entry2.getValue(), flags);
        }
        dest.writeInt(this.isEligibleForInstantDeposits ? 1 : 0);
        dest.writeSerializable(this.eligbleDepositAsInstant);
        dest.writeInt(this.hasSeenGoldNativeFundingUpsell ? 1 : 0);
        Map<String, Long> map3 = this.paymentMethodLastUsagesMap;
        dest.writeInt(map3.size());
        for (Map.Entry<String, Long> entry3 : map3.entrySet()) {
            dest.writeString(entry3.getKey());
            dest.writeLong(entry3.getValue().longValue());
        }
        dest.writeInt(this.isInIndividualAccountDepositsDefaultingExperiment ? 1 : 0);
        dest.writeInt(this.configureForOutgoingWires ? 1 : 0);
        dest.writeParcelable(this.outgoingWireDetails, flags);
        dest.writeParcelable(this.outgoingWireRoutingDetails, flags);
        dest.writeInt(this.overrideNoEnokiAlert ? 1 : 0);
        dest.writeParcelable(this.iraDistribution, flags);
        dest.writeParcelable(this.iraDistributionFee, flags);
        dest.writeParcelable(this.iraCalculatedTaxWithholdingResult, flags);
        dest.writeSerializable(this.iraFederalWithholdingPercentOverride);
        dest.writeSerializable(this.iraStateWithholdingPercentOverride);
        dest.writeParcelable(this.iraContribution, flags);
        dest.writeSerializable(this.systemCalendarYear);
        dest.writeInt(this.overrideDistributionEnokiRemovalAlert ? 1 : 0);
        dest.writeInt(this.overrideDistributionPreReviewAlert ? 1 : 0);
        dest.writeInt(this.overrideGoldApyBoostMinDepositCheck ? 1 : 0);
        dest.writeInt(this.showDisclosure ? 1 : 0);
        dest.writeParcelable(this.depositIncentivePillData, flags);
        dest.writeParcelable(this.depositIncentiveCancelDialog, flags);
        dest.writeString(this.promotionName);
        dest.writeString(this.promotionType);
        dest.writeInt(this.inRecurringIncludeDepositExperiment ? 1 : 0);
        dest.writeParcelable(this.pendingTransferAccountToSet, flags);
        dest.writeInt(this.inRothConversionAdvisoryExperiment ? 1 : 0);
        dest.writeParcelable(this.rothConversionTransferInfo, flags);
        dest.writeInt(this.shouldShowRothIraReviewStateErrorRetryText ? 1 : 0);
        dest.writeInt(this.makingRothConversion ? 1 : 0);
        dest.writeInt(this.isLimitWireUpsellEnabled ? 1 : 0);
        dest.writeInt(this.isMemberPdtRevampV1 ? 1 : 0);
    }

    public CreateTransferV2DataState(UUID sessionId, TransferDirectionV2 direction, MAXTransferContext.EntryPoint entryPoint, BigDecimal amount, String inputChars, boolean z, Map<String, TransferAccount> transferAccounts, String str, boolean z2, String str2, boolean z3, ApiCreateTransferRequest2 frequency, boolean z4, boolean z5, boolean z6, CreateTransferViewState.Mode mode, List<Money> list, boolean z7, boolean z8, RemoteMicrogramApplication disclosureMicrogramApplication, TransferSummaryState transferSummaryState, CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState, AchTransferOption achTransferOption, Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> transferLimits, boolean z9, BigDecimal bigDecimal, boolean z10, Map<String, Long> paymentMethodLastUsagesMap, boolean z11, boolean z12, ApiOutgoingWireDetails apiOutgoingWireDetails, WireRoutingDetailsInputActivityResultContract3.Success success, boolean z13, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionFee apiIraDistributionFee, CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult, BigDecimal bigDecimal2, BigDecimal bigDecimal3, IraContributionQuestionnaireResult.IraContribution iraContribution, Year systemCalendarYear, boolean z14, boolean z15, boolean z16, boolean z17, DepositIncentivePillData depositIncentivePillData, DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData, String str3, String str4, boolean z18, TransferAccount transferAccount, boolean z19, ApiRothConversionTransferInfo apiRothConversionTransferInfo, boolean z20, boolean z21, boolean z22, boolean z23) {
        MAXTransferContext.TransferV2Direction transferV2Direction;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(disclosureMicrogramApplication, "disclosureMicrogramApplication");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        Intrinsics.checkNotNullParameter(additionalDataState, "additionalDataState");
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesMap, "paymentMethodLastUsagesMap");
        Intrinsics.checkNotNullParameter(iraCalculatedTaxWithholdingResult, "iraCalculatedTaxWithholdingResult");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        this.sessionId = sessionId;
        this.direction = direction;
        this.entryPoint = entryPoint;
        this.amount = amount;
        this.inputChars = inputChars;
        this.animateInput = z;
        this.transferAccounts = transferAccounts;
        this.fromAccountId = str;
        this.isFromAccountFixed = z2;
        this.toAccountId = str2;
        this.isToAccountFixed = z3;
        this.frequency = frequency;
        this.hideFrequency = z4;
        this.shouldShowFrequencyBottomSheetOnLaunch = z5;
        this.stopShowingFrequencyBottomSheetOnLaunch = z6;
        this.mode = mode;
        this.depositSuggestionPills = list;
        this.skipWaitingForSuggestionPills = z7;
        this.isCreatingTransfer = z8;
        this.disclosureMicrogramApplication = disclosureMicrogramApplication;
        this.transferSummaryState = transferSummaryState;
        this.additionalDataState = additionalDataState;
        this.selectedAchTransferOption = achTransferOption;
        this.transferLimits = transferLimits;
        this.isEligibleForInstantDeposits = z9;
        this.eligbleDepositAsInstant = bigDecimal;
        this.hasSeenGoldNativeFundingUpsell = z10;
        this.paymentMethodLastUsagesMap = paymentMethodLastUsagesMap;
        this.isInIndividualAccountDepositsDefaultingExperiment = z11;
        this.configureForOutgoingWires = z12;
        this.outgoingWireDetails = apiOutgoingWireDetails;
        this.outgoingWireRoutingDetails = success;
        this.overrideNoEnokiAlert = z13;
        this.iraDistribution = iraDistribution;
        this.iraDistributionFee = apiIraDistributionFee;
        this.iraCalculatedTaxWithholdingResult = iraCalculatedTaxWithholdingResult;
        this.iraFederalWithholdingPercentOverride = bigDecimal2;
        this.iraStateWithholdingPercentOverride = bigDecimal3;
        this.iraContribution = iraContribution;
        this.systemCalendarYear = systemCalendarYear;
        this.overrideDistributionEnokiRemovalAlert = z14;
        this.overrideDistributionPreReviewAlert = z15;
        this.overrideGoldApyBoostMinDepositCheck = z16;
        this.showDisclosure = z17;
        this.depositIncentivePillData = depositIncentivePillData;
        this.depositIncentiveCancelDialog = depositIncentiveCancellationDialogData;
        this.promotionName = str3;
        this.promotionType = str4;
        this.inRecurringIncludeDepositExperiment = z18;
        this.pendingTransferAccountToSet = transferAccount;
        this.inRothConversionAdvisoryExperiment = z19;
        this.rothConversionTransferInfo = apiRothConversionTransferInfo;
        this.shouldShowRothIraReviewStateErrorRetryText = z20;
        this.makingRothConversion = z21;
        this.isLimitWireUpsellEnabled = z22;
        this.isMemberPdtRevampV1 = z23;
        com.robinhood.rosetta.eventlogging.Money moneyForLogging = ExtensionsKt.toMoneyForLogging(amount);
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(this);
        MAXTransferContext.ACHTransferData aCHTransferData = null;
        MAXTransferContext.TransferAccount protobuf = transferAccountFromTransferAccount != null ? Transfers.toProtobuf(transferAccountFromTransferAccount) : null;
        TransferAccount transferAccount2 = CreateTransferV2StateProvider2.toTransferAccount(this);
        MAXTransferContext.TransferAccount protobuf2 = transferAccount2 != null ? Transfers.toProtobuf(transferAccount2) : null;
        TransferContext.Frequency protobuf3 = Transfers.toProtobuf(CreateTransferV2DataState2.getAdjustedFrequency(this));
        MAXTransferContext.IRAContributionData protobuf4 = (iraContribution == null || (iraContributionData = iraContribution.toIraContributionData()) == null) ? null : Transfers.toProtobuf(iraContributionData);
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = CreateTransferV2DataState2.getIraDistributionData(this);
        MAXTransferContext.IRADistributionData protobuf5 = iraDistributionData != null ? Transfers.toProtobuf(iraDistributionData) : null;
        String string2 = sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        AchTransferOption selectedAchTransferOptionOrDefault = CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(this);
        if (selectedAchTransferOptionOrDefault != null) {
            aCHTransferData = new MAXTransferContext.ACHTransferData(Booleans2.toProtobuf(Boolean.valueOf(selectedAchTransferOptionOrDefault == AchTransferOption.INSTANT)), null, null, null, 14, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            transferV2Direction = MAXTransferContext.TransferV2Direction.DEPOSIT;
        } else if (i == 2) {
            transferV2Direction = MAXTransferContext.TransferV2Direction.WITHDRAWAL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            transferV2Direction = MAXTransferContext.TransferV2Direction.XENT;
        }
        this.maxTransferContext = new MAXTransferContext(null, moneyForLogging, protobuf, protobuf2, protobuf3, protobuf4, entryPoint, protobuf5, string2, aCHTransferData, null, null, null, null, CountryCode.COUNTRY_CODE_US, null, transferV2Direction, null, null, null, 965633, null);
    }

    public /* synthetic */ CreateTransferV2DataState(UUID uuid, TransferDirectionV2 transferDirectionV2, MAXTransferContext.EntryPoint entryPoint, BigDecimal bigDecimal, String str, boolean z, Map map, String str2, boolean z2, String str3, boolean z3, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z4, boolean z5, boolean z6, CreateTransferViewState.Mode mode, List list, boolean z7, boolean z8, RemoteMicrogramApplication remoteMicrogramApplication, TransferSummaryState transferSummaryState, CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState, AchTransferOption achTransferOption, Map map2, boolean z9, BigDecimal bigDecimal2, boolean z10, Map map3, boolean z11, boolean z12, ApiOutgoingWireDetails apiOutgoingWireDetails, WireRoutingDetailsInputActivityResultContract3.Success success, boolean z13, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionFee apiIraDistributionFee, CreateTransferDuxo.CalculatedTaxWithholdingResult calculatedTaxWithholdingResult, BigDecimal bigDecimal3, BigDecimal bigDecimal4, IraContributionQuestionnaireResult.IraContribution iraContribution, Year year, boolean z14, boolean z15, boolean z16, boolean z17, DepositIncentivePillData depositIncentivePillData, DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData, String str4, String str5, boolean z18, TransferAccount transferAccount, boolean z19, ApiRothConversionTransferInfo apiRothConversionTransferInfo, boolean z20, boolean z21, boolean z22, boolean z23, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID() : uuid, transferDirectionV2, entryPoint, (i & 8) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 16) != 0 ? "$0" : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? MapsKt.emptyMap() : map, (i & 128) != 0 ? null : str2, z2, (i & 512) != 0 ? null : str3, z3, (i & 2048) != 0 ? ApiCreateTransferRequest2.ONCE : apiCreateTransferRequest2, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? false : z5, (i & 16384) != 0 ? false : z6, (i & 32768) != 0 ? CreateTransferViewState.Mode.EDIT : mode, (i & 65536) != 0 ? null : list, (i & 131072) != 0 ? false : z7, (i & 262144) != 0 ? false : z8, remoteMicrogramApplication, (i & 1048576) != 0 ? TransferSummaryState.None.INSTANCE : transferSummaryState, (i & 2097152) != 0 ? CreateTransferV2AdditionalDataClient.AdditionalDataState.None.INSTANCE : additionalDataState, (i & 4194304) != 0 ? null : achTransferOption, (i & 8388608) != 0 ? MapsKt.emptyMap() : map2, (i & 16777216) != 0 ? false : z9, (i & 33554432) != 0 ? null : bigDecimal2, (i & 67108864) != 0 ? false : z10, (i & 134217728) != 0 ? MapsKt.emptyMap() : map3, (i & 268435456) != 0 ? false : z11, (i & 536870912) != 0 ? false : z12, (i & 1073741824) != 0 ? null : apiOutgoingWireDetails, (i & Integer.MIN_VALUE) != 0 ? null : success, (i2 & 1) != 0 ? false : z13, (i2 & 2) != 0 ? null : iraDistribution, (i2 & 4) != 0 ? null : apiIraDistributionFee, (i2 & 8) != 0 ? CreateTransferDuxo.CalculatedTaxWithholdingResult.None.INSTANCE : calculatedTaxWithholdingResult, (i2 & 16) != 0 ? null : bigDecimal3, (i2 & 32) != 0 ? null : bigDecimal4, (i2 & 64) != 0 ? null : iraContribution, (i2 & 128) != 0 ? Year.now() : year, (i2 & 256) != 0 ? false : z14, (i2 & 512) != 0 ? false : z15, (i2 & 1024) != 0 ? false : z16, (i2 & 2048) != 0 ? false : z17, (i2 & 4096) != 0 ? null : depositIncentivePillData, (i2 & 8192) != 0 ? null : depositIncentiveCancellationDialogData, (i2 & 16384) != 0 ? null : str4, (i2 & 32768) != 0 ? null : str5, (i2 & 65536) != 0 ? false : z18, (i2 & 131072) != 0 ? null : transferAccount, (i2 & 262144) != 0 ? false : z19, (524288 & i2) != 0 ? null : apiRothConversionTransferInfo, (i2 & 1048576) != 0 ? false : z20, (i2 & 2097152) != 0 ? false : z21, (i2 & 4194304) != 0 ? false : z22, (i2 & 8388608) != 0 ? false : z23);
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getInputChars() {
        return this.inputChars;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final Map<String, TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final String getFromAccountId() {
        return this.fromAccountId;
    }

    public final boolean isFromAccountFixed() {
        return this.isFromAccountFixed;
    }

    public final String getToAccountId() {
        return this.toAccountId;
    }

    public final boolean isToAccountFixed() {
        return this.isToAccountFixed;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final boolean getHideFrequency() {
        return this.hideFrequency;
    }

    public final boolean getShouldShowFrequencyBottomSheetOnLaunch() {
        return this.shouldShowFrequencyBottomSheetOnLaunch;
    }

    public final boolean getStopShowingFrequencyBottomSheetOnLaunch() {
        return this.stopShowingFrequencyBottomSheetOnLaunch;
    }

    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    public final List<Money> getDepositSuggestionPills() {
        return this.depositSuggestionPills;
    }

    public final boolean getSkipWaitingForSuggestionPills() {
        return this.skipWaitingForSuggestionPills;
    }

    public final boolean isCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    public final RemoteMicrogramApplication getDisclosureMicrogramApplication() {
        return this.disclosureMicrogramApplication;
    }

    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    public final CreateTransferV2AdditionalDataClient.AdditionalDataState getAdditionalDataState() {
        return this.additionalDataState;
    }

    public final AchTransferOption getSelectedAchTransferOption() {
        return this.selectedAchTransferOption;
    }

    public final Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> getTransferLimits() {
        return this.transferLimits;
    }

    public final boolean isEligibleForInstantDeposits() {
        return this.isEligibleForInstantDeposits;
    }

    public final BigDecimal getEligbleDepositAsInstant() {
        return this.eligbleDepositAsInstant;
    }

    public final boolean getHasSeenGoldNativeFundingUpsell() {
        return this.hasSeenGoldNativeFundingUpsell;
    }

    public final Map<String, Long> getPaymentMethodLastUsagesMap() {
        return this.paymentMethodLastUsagesMap;
    }

    public final boolean isInIndividualAccountDepositsDefaultingExperiment() {
        return this.isInIndividualAccountDepositsDefaultingExperiment;
    }

    public final boolean getConfigureForOutgoingWires() {
        return this.configureForOutgoingWires;
    }

    public final ApiOutgoingWireDetails getOutgoingWireDetails() {
        return this.outgoingWireDetails;
    }

    public final WireRoutingDetailsInputActivityResultContract3.Success getOutgoingWireRoutingDetails() {
        return this.outgoingWireRoutingDetails;
    }

    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    public final IraDistributionQuestionnaireResult.IraDistribution getIraDistribution() {
        return this.iraDistribution;
    }

    public final ApiIraDistributionFee getIraDistributionFee() {
        return this.iraDistributionFee;
    }

    public final CreateTransferDuxo.CalculatedTaxWithholdingResult getIraCalculatedTaxWithholdingResult() {
        return this.iraCalculatedTaxWithholdingResult;
    }

    public final BigDecimal getIraFederalWithholdingPercentOverride() {
        return this.iraFederalWithholdingPercentOverride;
    }

    public final BigDecimal getIraStateWithholdingPercentOverride() {
        return this.iraStateWithholdingPercentOverride;
    }

    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    public final Year getSystemCalendarYear() {
        return this.systemCalendarYear;
    }

    public final boolean getOverrideDistributionEnokiRemovalAlert() {
        return this.overrideDistributionEnokiRemovalAlert;
    }

    public final boolean getOverrideDistributionPreReviewAlert() {
        return this.overrideDistributionPreReviewAlert;
    }

    public final boolean getOverrideGoldApyBoostMinDepositCheck() {
        return this.overrideGoldApyBoostMinDepositCheck;
    }

    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    public final DepositIncentivePillData getDepositIncentivePillData() {
        return this.depositIncentivePillData;
    }

    public final DepositIncentiveCancellationDialogData getDepositIncentiveCancelDialog() {
        return this.depositIncentiveCancelDialog;
    }

    public final String getPromotionName() {
        return this.promotionName;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final boolean getInRecurringIncludeDepositExperiment() {
        return this.inRecurringIncludeDepositExperiment;
    }

    public final TransferAccount getPendingTransferAccountToSet() {
        return this.pendingTransferAccountToSet;
    }

    public final boolean getInRothConversionAdvisoryExperiment() {
        return this.inRothConversionAdvisoryExperiment;
    }

    public final ApiRothConversionTransferInfo getRothConversionTransferInfo() {
        return this.rothConversionTransferInfo;
    }

    public final boolean getShouldShowRothIraReviewStateErrorRetryText() {
        return this.shouldShowRothIraReviewStateErrorRetryText;
    }

    public final boolean getMakingRothConversion() {
        return this.makingRothConversion;
    }

    public final boolean isLimitWireUpsellEnabled() {
        return this.isLimitWireUpsellEnabled;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    public final MAXTransferContext getMaxTransferContext() {
        return this.maxTransferContext;
    }

    /* compiled from: CreateTransferV2DataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState$Companion;", "", "<init>", "()V", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen$feature_transfers_externalRelease", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Screen getScreen$feature_transfers_externalRelease() {
            return CreateTransferV2DataState.screen;
        }
    }
}
