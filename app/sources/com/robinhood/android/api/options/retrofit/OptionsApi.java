package com.robinhood.android.api.options.retrofit;

import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiHasRecentRejection;
import com.robinhood.models.api.ApiOptionCancelExerciseRequest;
import com.robinhood.models.api.ApiOptionCancelOrderRequest;
import com.robinhood.models.api.ApiOptionChain;
import com.robinhood.models.api.ApiOptionChainCollateral;
import com.robinhood.models.api.ApiOptionCorporateAction;
import com.robinhood.models.api.ApiOptionDowngradeRequest;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.api.ApiOptionHistorical;
import com.robinhood.models.api.ApiOptionInstrument;
import com.robinhood.models.api.ApiOptionLevelChange;
import com.robinhood.models.api.ApiOptionMaxRollableQuantity;
import com.robinhood.models.api.ApiOptionOrder;
import com.robinhood.models.api.ApiOptionOrderFee;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.api.ApiOptionPosition;
import com.robinhood.models.api.ApiOptionQuote;
import com.robinhood.models.api.ApiOptionSettings;
import com.robinhood.models.api.ApiOptionStrategyBreakeven;
import com.robinhood.models.api.ApiOptionStrategyBreakevenLegacy;
import com.robinhood.models.api.ApiOptionStrategyInfo;
import com.robinhood.models.api.ApiOptionUpgradeSuitability;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.LocalDate;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: OptionsApi.kt */
@Metadata(m3635d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0006JL\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"H§@¢\u0006\u0004\b\u0019\u0010$J\u001a\u0010&\u001a\u00020\u00182\b\b\u0001\u0010%\u001a\u00020\u001aH§@¢\u0006\u0004\b&\u0010'JF\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\u0010\b\u0001\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b,\u0010-J<\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\t2\u000e\b\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020(2\b\b\u0001\u00100\u001a\u00020/2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b,\u00101J\u001a\u00103\u001a\u00020+2\b\b\u0001\u00102\u001a\u00020\u001aH§@¢\u0006\u0004\b3\u0010'JP\u00106\u001a\b\u0012\u0004\u0012\u0002050\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\u0010\b\u0001\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\b\b\u0001\u00100\u001a\u00020/2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b6\u00107JF\u00106\u001a\b\u0012\u0004\u0012\u0002050\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\u0010\b\u0001\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b6\u0010-J$\u0010:\u001a\u0002052\b\b\u0001\u00109\u001a\u00020\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010;J>\u0010=\u001a\b\u0012\u0004\u0012\u0002050\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\b\b\u0001\u0010<\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b=\u0010>J\u001a\u0010B\u001a\u00020A2\b\b\u0001\u0010@\u001a\u00020?H§@¢\u0006\u0004\bB\u0010CJ$\u0010E\u001a\u00020A2\b\b\u0001\u0010D\u001a\u00020\u001a2\b\b\u0001\u0010@\u001a\u00020?H§@¢\u0006\u0004\bE\u0010FJ$\u0010J\u001a\u00020\u00122\b\b\u0001\u0010G\u001a\u00020\u001a2\b\b\u0001\u0010I\u001a\u00020HH§@¢\u0006\u0004\bJ\u0010KJ@\u0010N\u001a\b\u0012\u0004\u0012\u00020A0\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0001\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bN\u0010OJ\u001a\u0010P\u001a\u00020A2\b\b\u0001\u0010G\u001a\u00020\u001aH§@¢\u0006\u0004\bP\u0010'J0\u0010S\u001a\u00020R2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010Q\u001a\u00020\u001a2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u001aH§@¢\u0006\u0004\bS\u0010TJ0\u0010V\u001a\u00020U2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020\u00022\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u001aH§@¢\u0006\u0004\bV\u0010WJ:\u0010^\u001a\u00020]2\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010Y\u001a\u00020\u00022\b\b\u0001\u0010Z\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020[H§@¢\u0006\u0004\b^\u0010_J&\u0010a\u001a\u00020]2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010`\u001a\u00020\u0002H§@¢\u0006\u0004\ba\u0010;J$\u0010c\u001a\u00020b2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bc\u0010;J$\u0010f\u001a\u00020e2\b\b\u0001\u0010%\u001a\u00020\u001a2\b\b\u0001\u0010d\u001a\u00020/H§@¢\u0006\u0004\bf\u0010gJ>\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\t2\u000e\b\u0001\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\b\b\u0001\u0010d\u001a\u00020/2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bi\u00101JJ\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0\t2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010j\u001a\u00020\u00022\b\b\u0001\u0010k\u001a\u00020\u00022\b\b\u0001\u0010l\u001a\u00020\u00022\b\b\u0001\u0010d\u001a\u00020/H§@¢\u0006\u0004\bn\u0010oJ8\u0010u\u001a\u00020t2\b\b\u0001\u0010p\u001a\u00020\u001a2\b\b\u0001\u0010q\u001a\u00020\u00022\b\b\u0001\u0010r\u001a\u00020\u00022\b\b\u0001\u0010s\u001a\u00020\u0002H§@¢\u0006\u0004\bu\u0010vJ\u001a\u0010y\u001a\u00020x2\b\b\u0001\u0010w\u001a\u00020\u001aH§@¢\u0006\u0004\by\u0010'J4\u0010z\u001a\b\u0012\u0004\u0012\u00020x0\t2\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bz\u0010{J,\u0010~\u001a\b\u0012\u0004\u0012\u00020}0\t2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010|\u001a\u00020\u0002H§@¢\u0006\u0004\b~\u0010\fJ(\u0010\u0081\u0001\u001a\u00020x2\b\b\u0001\u0010w\u001a\u00020\u001a2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007fH§@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001f\u0010\u0085\u0001\u001a\u00020x2\n\b\u0001\u0010\u0084\u0001\u001a\u00030\u0083\u0001H§@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J(\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010p\u001a\u00020\u001aH§@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008b\u0001\u0010\u0006J*\u0010\u008e\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u008d\u0001\u001a\u00030\u008c\u0001H§@¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J*\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0091\u0001\u001a\u00030\u0090\u0001H§@¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J*\u0010\u0096\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0095\u0001\u001a\u00030\u0094\u0001H§@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J?\u0010\u009c\u0001\u001a\u00030\u009b\u00012\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0099\u0001\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020\u001e2\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0002H§@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J)\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\b\u0001\u0010<\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u009f\u0001\u0010\fJ3\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010\t2\u000b\b\u0001\u0010 \u0001\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010M\u001a\u0004\u0018\u00010LH§@¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001e\u0010¦\u0001\u001a\u00030¥\u00012\t\b\u0001\u0010¤\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¦\u0001\u0010\u0006J$\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\t2\t\b\u0001\u0010§\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b©\u0001\u0010\u0006J(\u0010¬\u0001\u001a\u00030«\u00012\b\b\u0001\u0010<\u001a\u00020\u00022\t\b\u0001\u0010ª\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¬\u0001\u0010\fJ?\u0010¬\u0001\u001a\u00030°\u00012\b\b\u0001\u0010<\u001a\u00020\u00022\t\b\u0001\u0010\u00ad\u0001\u001a\u00020[2\b\b\u0001\u0010\\\u001a\u00020[2\n\b\u0001\u0010¯\u0001\u001a\u00030®\u0001H§@¢\u0006\u0006\b¬\u0001\u0010±\u0001J\u0095\u0001\u0010¾\u0001\u001a\u00030½\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010³\u0001\u001a\u00030²\u00012\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020[2\u000b\b\u0001\u0010´\u0001\u001a\u0004\u0018\u00010/2\u000b\b\u0001\u0010µ\u0001\u001a\u0004\u0018\u00010[2\u000b\b\u0001\u0010¶\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010·\u0001\u001a\u00020\u001e2\n\b\u0001\u0010¸\u0001\u001a\u00030®\u00012\n\b\u0001\u0010º\u0001\u001a\u00030¹\u00012\n\b\u0001\u0010¼\u0001\u001a\u00030»\u0001H§@¢\u0006\u0006\b¾\u0001\u0010¿\u0001J2\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\t2\n\b\u0001\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001d\u0010Ã\u0001\u001a\u00030À\u00012\b\b\u0001\u0010G\u001a\u00020\u001aH§@¢\u0006\u0005\bÃ\u0001\u0010'¨\u0006Ä\u0001"}, m3636d2 = {"Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "", "", "accountNumber", "Lcom/robinhood/models/api/ApiOptionUpgradeSuitability;", "getOptionUpgradeSuitability", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountUrl", "paginationCursor", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionLevelChange;", "getOptionLevelChanges", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionLevelChange$Request;", "request", "changeOptionLevel", "(Lcom/robinhood/models/api/ApiOptionLevelChange$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionDowngradeRequest;", "", "downgradeOptionLevel", "(Lcom/robinhood/models/api/ApiOptionDowngradeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiHasRecentRejection;", "hasRecentRejection", "commaSeparatedOptionInstrumentIds", "Lcom/robinhood/models/api/ApiOptionInstrument;", "getOptionInstruments", "Ljava/util/UUID;", "optionChainId", "optionContractType", "expirationDates", "", "pageSize", "getActiveOptionInstrumentsForChain", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryParameters", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "getOptionInstrument", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/CommaSeparatedList;", "accountNumbers", "commaSeparatedChainIds", "Lcom/robinhood/models/api/ApiOptionPosition;", "getOptionPositions", "(Lcom/robinhood/models/CommaSeparatedList;Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "positionIds", "", "nonzero", "(Lcom/robinhood/models/CommaSeparatedList;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionPositionId", "getOptionPosition", "aggregateOptionPositionIds", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;", "getAggregateOptionPositions", "(Lcom/robinhood/models/CommaSeparatedList;Lcom/robinhood/models/CommaSeparatedList;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chainIds", "aggregateOptionPositionId", "getAggregateOptionPosition", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "strategyCode", "getAggregateOptionPositionsByStrategyCode", "(Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "orderRequest", "Lcom/robinhood/models/api/ApiOptionOrder;", "submitOptionOrder", "(Lcom/robinhood/models/api/ApiOptionOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderToReplaceId", "replaceOptionOrder", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiOptionOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "Lcom/robinhood/models/api/ApiOptionCancelOrderRequest;", "cancelOrderRequest", "cancelOptionOrder", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiOptionCancelOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/LocalDate", "updatedAt", "getOptionsOrders", "(Lcom/robinhood/models/CommaSeparatedList;Lj$/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionsOrder", "equityInstrumentId", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$NumOfShares;", "getOptionsOrderAvailableShares", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$NumOfContracts;", "getOptionsOrderAvailableContracts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountPath", "instrumentPath", "side", "Ljava/math/BigDecimal;", "quantity", "Lcom/robinhood/models/api/ApiCollateral;", "getEquityOrderCollateral", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderRequestJson", "getOptionsOrderCollateral", "Lcom/robinhood/models/api/ApiOptionChainCollateral;", "getOptionChainCollateral", "includeAllSessions", "Lcom/robinhood/models/api/ApiOptionQuote;", "getOptionQuote", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "getOptionQuotes", "commaSeparatedRatios", "commaSeparatedPositionTypes", "commaSeparatedStrategyIds", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;", "getAggregateOptionQuotes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionInstrumentId", "interval", "span", "bounds", "Lcom/robinhood/models/api/ApiOptionHistorical;", "getOptionHistorical", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionEventId", "Lcom/robinhood/models/api/ApiOptionEvent;", "getOptionEvent", "getOptionEvents", "(Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionChainIds", "Lcom/robinhood/models/api/ApiOptionChain;", "getOptionChains", "Lcom/robinhood/models/api/ApiOptionCancelExerciseRequest;", "optionCancelExerciseRequest", "cancelOptionExercise", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiOptionCancelExerciseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "optionExerciseRequest", "submitOptionExercise", "(Lcom/robinhood/models/api/ApiOptionExerciseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "getOptionExerciseChecks", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionSettings;", "getOptionSettings", "Lcom/robinhood/models/api/ApiOptionSettings$TradeOnExpirationRequest;", "tradeOnExpirationRequest", "submitTradeOnExpirationRequest", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiOptionSettings$TradeOnExpirationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionSettings$DefaultPricingSettingRequest;", "defaultPricingSettingRequest", "submitDefaultPricingRequest", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiOptionSettings$DefaultPricingSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionSettings$ShortSharesOnOptionEventsRequest;", "shortSharesOnOptionEventsRequest", "submitShortSharesOnOptionEventsRequest", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiOptionSettings$ShortSharesOnOptionEventsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "legsJson", "orderPrice", "underlyingPrice", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "getOptionsProfitLossChart", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiOptionMaxRollableQuantity;", "getOptionMaxRollableQuantity", "cursor", "Lcom/robinhood/models/api/ApiOptionCorporateAction;", "getOptionCorporateActions", "(Ljava/lang/String;Lj$/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestLegsJson", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "getOptionOrderStrategies", "commaSeparatedStrategyCodes", "Lcom/robinhood/models/api/ApiOptionStrategyInfo;", "getOptionStrategyInfo", "averageCost", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenLegacy;", "getOptionStrategyBreakeven", "costBasis", "Lcom/robinhood/models/db/OrderDirection;", "direction", "Lcom/robinhood/models/api/ApiOptionStrategyBreakeven;", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "isGold", "limitPrice", "collateral", "tradeValueMultiplier", "orderDirection", "Lcom/robinhood/models/db/OrderTrigger;", "trigger", "Lcom/robinhood/models/db/OrderType;", "type", "Lcom/robinhood/models/api/ApiOptionOrderFee;", "getOptionOrderFee", "(Ljava/lang/String;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;ILcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OrderTrigger;Lcom/robinhood/models/db/OrderType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "getComboOrders", "(Lj$/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComboOrder", "lib-api-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface OptionsApi {
    @POST("options/exercise/{option_event_id}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object cancelOptionExercise(@Path("option_event_id") UUID uuid, @Body ApiOptionCancelExerciseRequest apiOptionCancelExerciseRequest, Continuation<? super ApiOptionEvent> continuation);

    @POST("options/orders/{orderId}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object cancelOptionOrder(@Path("orderId") UUID uuid, @Body ApiOptionCancelOrderRequest apiOptionCancelOrderRequest, Continuation<? super Unit> continuation);

    @POST("options/level_changes/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object changeOptionLevel(@Body ApiOptionLevelChange.Request request, Continuation<? super ApiOptionLevelChange> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 15", "X-Write-Timeout-Seconds-Override: 15"})
    @POST("options/level_changes_v2/downgrade/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object downgradeOptionLevel(@Body ApiOptionDowngradeRequest apiOptionDowngradeRequest, Continuation<? super Unit> continuation);

    @GET("options/instruments/?state=active")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getActiveOptionInstrumentsForChain(@Query("chain_id") UUID uuid, @Query("type") String str, @Query("expiration_dates") String str2, @Query("cursor") String str3, @Query("page_size") int i, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation);

    @GET("options/aggregate_positions/{aggregateOptionPositionId}/?default_to_all_accounts=true")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getAggregateOptionPosition(@Path("aggregateOptionPositionId") UUID uuid, @Query("account_number") String str, Continuation<? super ApiAggregateOptionPosition> continuation);

    @GET("options/aggregate_positions/?nonzero=true&default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getAggregateOptionPositions(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("chain_ids") CommaSeparatedList<String> commaSeparatedList2, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiAggregateOptionPosition>> continuation);

    @GET("options/aggregate_positions/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getAggregateOptionPositions(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("ids") CommaSeparatedList<String> commaSeparatedList2, @Query("nonzero") boolean z, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiAggregateOptionPosition>> continuation);

    @GET("options/aggregate_positions/?default_to_all_accounts=true")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getAggregateOptionPositionsByStrategyCode(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("strategy_code") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiAggregateOptionPosition>> continuation);

    @GET("marketdata/options/strategy/quotes/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getAggregateOptionQuotes(@Query("instruments") String str, @Query("ratios") String str2, @Query("types") String str3, @Query("strategy_ids") String str4, @Query("include_all_sessions") boolean z, Continuation<? super PaginatedResult<ApiAggregateOptionQuote>> continuation);

    @GET("combo/orders/{orderId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getComboOrder(@Path("orderId") UUID uuid, Continuation<? super ApiComboOrder> continuation);

    @GET("combo/orders/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getComboOrders(@Query("updated_at[gte]") LocalDate localDate, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiComboOrder>> continuation);

    @GET("orders/collateral/")
    Object getEquityOrderCollateral(@Query("account") String str, @Query("instrument") String str2, @Query("side") String str3, @Query("quantity") BigDecimal bigDecimal, Continuation<? super ApiCollateral> continuation);

    @GET("options/chains/{option_chain_id}/collateral/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionChainCollateral(@Path("option_chain_id") UUID uuid, @Query("account_number") String str, Continuation<? super ApiOptionChainCollateral> continuation);

    @GET("options/chains/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionChains(@Query("cursor") String str, @Query("ids") String str2, Continuation<? super PaginatedResult<ApiOptionChain>> continuation);

    @GET("options/corp_actions/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionCorporateActions(@Query("cursor") String str, @Query("updated_at[gte]") LocalDate localDate, Continuation<? super PaginatedResult<ApiOptionCorporateAction>> continuation);

    @GET("options/events/{option_event_id}/?default_to_all_accounts=true")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionEvent(@Path("option_event_id") UUID uuid, Continuation<? super ApiOptionEvent> continuation);

    @GET("options/events/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionEvents(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOptionEvent>> continuation);

    @GET("options/exercise_checks/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionExerciseChecks(@Query("account_number") String str, @Query("option_id") UUID uuid, Continuation<? super ApiOptionExerciseChecks> continuation);

    @GET("marketdata/options/historicals/{optionInstrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionHistorical(@Path("optionInstrumentId") UUID uuid, @Query("interval") String str, @Query("span") String str2, @Query("bounds") String str3, Continuation<? super ApiOptionHistorical> continuation);

    @GET("options/instruments/{optionInstrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionInstrument(@Path("optionInstrumentId") UUID uuid, Continuation<? super ApiOptionInstrument> continuation);

    @GET("options/instruments/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionInstruments(@Query("ids") String str, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation);

    @GET("options/instruments/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionInstruments(@Query("chain_id") UUID uuid, @Query("cursor") String str, @QueryMap Map<String, String> map, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation);

    @GET("options/level_changes/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionLevelChanges(@Query("account") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiOptionLevelChange>> continuation);

    @GET("options/maximum_rollable_quantity/{strategy_code}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionMaxRollableQuantity(@Path("strategy_code") String str, @Query("account_number") String str2, Continuation<? super ApiOptionMaxRollableQuantity> continuation);

    @GET("options/fees/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderFee(@Query("account_number") String str, @Query("underlying_type") OptionChain.UnderlyingType underlyingType, @Query("legs") String str2, @Query("quantity") BigDecimal bigDecimal, @Query("is_gold") Boolean bool, @Query("limit_price") BigDecimal bigDecimal2, @Query("collateral") String str3, @Query("trade_value_multiplier") int i, @Query("order_direction") OrderDirection orderDirection, @Query("trigger") OrderTrigger orderTrigger, @Query("type") OrderType orderType, Continuation<? super ApiOptionOrderFee> continuation);

    @GET("options/aggregate_positions/strategy/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderStrategies(@Query("legs") String str, Continuation<? super ApiOptionOrderStrategies> continuation);

    @GET("options/positions/{optionPositionId}/?default_to_all_accounts=true")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionPosition(@Path("optionPositionId") UUID uuid, Continuation<? super ApiOptionPosition> continuation);

    @GET("options/positions/?nonzero=True&default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionPositions(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("chain_ids") CommaSeparatedList<UUID> commaSeparatedList2, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOptionPosition>> continuation);

    @GET("options/positions/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionPositions(@Query("ids") CommaSeparatedList<String> commaSeparatedList, @Query("nonzero") boolean z, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOptionPosition>> continuation);

    @GET("marketdata/options/{optionInstrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionQuote(@Path("optionInstrumentId") UUID uuid, @Query("include_all_sessions") boolean z, Continuation<? super ApiOptionQuote> continuation);

    @GET("marketdata/options/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionQuotes(@Query("ids") CommaSeparatedList<UUID> commaSeparatedList, @Query("include_all_sessions") boolean z, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOptionQuote>> continuation);

    @GET("options/option_settings/{account_number}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionSettings(@Path("account_number") String str, Continuation<? super ApiOptionSettings> continuation);

    @GET("options/breakevens/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyBreakeven(@Query("strategy_code") String str, @Query("average_cost") String str2, Continuation<? super ApiOptionStrategyBreakevenLegacy> continuation);

    @GET("options/breakevens/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyBreakeven(@Query("strategy_code") String str, @Query("cost_basis") BigDecimal bigDecimal, @Query("quantity") BigDecimal bigDecimal2, @Query("direction") OrderDirection orderDirection, Continuation<? super ApiOptionStrategyBreakeven> continuation);

    @GET("options/strategies/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyInfo(@Query("strategy_codes") String str, Continuation<? super PaginatedResult<ApiOptionStrategyInfo>> continuation);

    @GET("options/suitability/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionUpgradeSuitability(@Query("account_number") String str, Continuation<? super ApiOptionUpgradeSuitability> continuation);

    @GET("options/orders/{orderId}/?default_to_all_accounts=true")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsOrder(@Path("orderId") UUID uuid, Continuation<? super ApiOptionOrder> continuation);

    @GET("options/orders/available_contracts/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsOrderAvailableContracts(@Path("account_number") String str, @Query("strategy_code") String str2, @Query("order_to_replace_id") UUID uuid, Continuation<? super ApiOptionsDisplayedBuyingPower.NumOfContracts> continuation);

    @GET("options/orders/available_shares/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsOrderAvailableShares(@Path("account_number") String str, @Query("equity_instrument_id") UUID uuid, @Query("order_to_replace_id") UUID uuid2, Continuation<? super ApiOptionsDisplayedBuyingPower.NumOfShares> continuation);

    @GET("options/orders/collateral/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsOrderCollateral(@Query("order_to_replace_id") UUID uuid, @Query(Card.Icon.ORDER) String str, Continuation<? super ApiCollateral> continuation);

    @GET("options/orders/?default_to_all_accounts=true")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionsOrders(@Query("account_numbers") CommaSeparatedList<String> commaSeparatedList, @Query("updated_at[gte]") LocalDate localDate, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOptionOrder>> continuation);

    @GET("options/profit_and_loss_chart/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsProfitLossChart(@Query("legs") String str, @Query("order_price") String str2, @Query("quantity") int i, @Query("underlying_price") String str3, Continuation<? super ApiOptionsProfitLossChart> continuation);

    @GET("options/has_recent_rejection/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object hasRecentRejection(@Query("account_number") String str, Continuation<? super ApiHasRecentRejection> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25", "X-Write-Timeout-Seconds-Override: 25"})
    @PATCH("options/orders/{orderToReplaceId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object replaceOptionOrder(@Path("orderToReplaceId") UUID uuid, @Body ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super ApiOptionOrder> continuation);

    @PATCH("options/option_settings/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object submitDefaultPricingRequest(@Path("account_number") String str, @Body ApiOptionSettings.DefaultPricingSettingRequest defaultPricingSettingRequest, Continuation<? super ApiOptionSettings> continuation);

    @POST("options/exercise/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object submitOptionExercise(@Body ApiOptionExerciseRequest apiOptionExerciseRequest, Continuation<? super ApiOptionEvent> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25", "X-Write-Timeout-Seconds-Override: 25"})
    @POST("options/orders/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object submitOptionOrder(@Body ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super ApiOptionOrder> continuation);

    @PATCH("options/option_settings/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object submitShortSharesOnOptionEventsRequest(@Path("account_number") String str, @Body ApiOptionSettings.ShortSharesOnOptionEventsRequest shortSharesOnOptionEventsRequest, Continuation<? super ApiOptionSettings> continuation);

    @PATCH("options/option_settings/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object submitTradeOnExpirationRequest(@Path("account_number") String str, @Body ApiOptionSettings.TradeOnExpirationRequest tradeOnExpirationRequest, Continuation<? super ApiOptionSettings> continuation);
}
