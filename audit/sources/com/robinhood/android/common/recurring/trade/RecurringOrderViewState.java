package com.robinhood.android.common.recurring.trade;

import android.content.res.Resources;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanation;
import com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionLimitRemaining;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentAsset;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequestDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalDate;
import p479j$.time.format.TextStyle;
import rosetta.nummus.CurrencyDto;
import rosetta.nummus.CurrencyPairDto;

/* compiled from: RecurringOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0002µ\u0001B·\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` \u0018\u00010\u001c\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001c\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c\u0012\b\b\u0002\u0010%\u001a\u00020\u0019\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010.\u001a\u00020\u0019\u0012\b\b\u0002\u0010/\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J\u0013\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0007\u0010\u008b\u0001\u001a\u00020\u0019J\u0007\u0010\u008d\u0001\u001a\u00020\u0019J\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\n\u0010\u009d\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\"\u0010¥\u0001\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` \u0018\u00010\u001cHÆ\u0003J\u0010\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u001cHÂ\u0003J\u0010\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u001cHÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001cHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010)HÂ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010+HÂ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010-HÂ\u0003J\n\u0010®\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0019HÆ\u0003J¾\u0002\u0010°\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` \u0018\u00010\u001c2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c2\b\b\u0002\u0010%\u001a\u00020\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u0019HÆ\u0001J\u0015\u0010±\u0001\u001a\u00020\u00192\t\u0010²\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010³\u0001\u001a\u00020cHÖ\u0001J\n\u0010´\u0001\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R)\u0010\u001b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` \u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c¢\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0011\u0010%\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bM\u0010GR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b.\u0010GR\u0011\u0010/\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u0010GR\u0013\u0010P\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001d\u0010S\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bY\u0010GR\u0013\u0010Z\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0011\u0010`\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\ba\u0010GR\u0013\u0010b\u001a\u0004\u0018\u00010c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010c8F¢\u0006\u0006\u001a\u0004\bg\u0010eR\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010GR\u0011\u0010i\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bj\u0010GR\u0013\u0010k\u001a\u0004\u0018\u00010l¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bp\u0010GR\u0011\u0010q\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bq\u0010GR\u0011\u0010r\u001a\u00020s¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u0010v\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010y\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bz\u0010]R\u0011\u0010{\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b|\u0010GR\u0011\u0010}\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b~\u0010GR\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010[8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010]R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008a\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010GR\u0013\u0010\u008c\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010GR\u001a\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006¶\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState;", "", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "investmentTargetData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "initialAmount", "Lcom/robinhood/models/util/Money;", "formState", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "account", "Lcom/robinhood/models/db/Account;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "refId", "Ljava/util/UUID;", "overrideBuyingPowerCheck", "", "backupRelationship", "validationFailureEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "showInitialAmountEvent", "", "inputFocusEvent", "submitBrokerageCashTransferEvent", "reviewButtonIsLoading", "retirementContributionRemaining", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionLimitRemaining;", "orderConfigurationAccountNumber", "", "sweepsStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "rhyGlobalLoggingContext", "Lcom/robinhood/rosetta/eventlogging/RHYContext;", "isUsRecurringVTExperimentEnabled", "isCryptoMibExperimentEnabled", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/util/UUID;ZLcom/robinhood/models/db/AchRelationship;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionLimitRemaining;Ljava/lang/String;Lcom/robinhood/librobinhood/data/store/SweepsStatus;Lcom/robinhood/rosetta/eventlogging/RHYContext;ZZ)V", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getInvestmentTargetData", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "getConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getFormState", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getDirectDepositRelationship", "()Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getRefId", "()Ljava/util/UUID;", "getOverrideBuyingPowerCheck", "()Z", "getBackupRelationship", "getValidationFailureEvent", "()Lcom/robinhood/udf/UiEvent;", "getInputFocusEvent", "getSubmitBrokerageCashTransferEvent", "getReviewButtonIsLoading", "getRetirementContributionRemaining", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionLimitRemaining;", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "recurringOrderContext", "getRecurringOrderContext", "()Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "recurringOrderContext$delegate", "Lkotlin/Lazy;", "reviewing", "getReviewing", "paycheckDisclaimerTitleVisibilityText", "Lcom/robinhood/utils/resource/StringResource;", "getPaycheckDisclaimerTitleVisibilityText", "()Lcom/robinhood/utils/resource/StringResource;", "paycheckDisclaimerVisibilityText", "getPaycheckDisclaimerVisibilityText", "paycheckDisclaimerHasLearnMore", "getPaycheckDisclaimerHasLearnMore", "paycheckDisclaimerTitleIconRes", "", "getPaycheckDisclaimerTitleIconRes", "()Ljava/lang/Integer;", "paycheckDisclaimerBodyIconRes", "getPaycheckDisclaimerBodyIconRes", "isReviewButtonEnabled", "showBackupRow", "getShowBackupRow", "amountLabelExplanationUi", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel;", "getAmountLabelExplanationUi", "()Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel;", "showAmountLabelQuestionMark", "getShowAmountLabelQuestionMark", "isCrypto", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "rhyLoggingContext", "getRhyLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RHYContext;", "recurringOrderScheduleLabelTxt", "getRecurringOrderScheduleLabelTxt", "recurringOrderScheduleDetailsVisible", "getRecurringOrderScheduleDetailsVisible", "recurringOrderAccountDetailsVisible", "getRecurringOrderAccountDetailsVisible", "getAccountNameTitle", "", "resources", "Landroid/content/res/Resources;", "accountNameSubtitle", "getAccountNameSubtitle", "accountNameSubtitleIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAccountNameSubtitleIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTitleText", "isDollarAmountInputVisible", "shouldFocusDollarAmountInput", "isPercentageInputVisible", "shouldFocusPercentageInput", "getInitialDollarAmount", "getFrequencyText", "getStartDateText", "getSourceOfFundsText", "getReviewText", "getBackupText", "streamCryptoDisclosuresRequestDto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "getStreamCryptoDisclosuresRequestDto$feature_lib_recurring_externalDebug", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "toString", "InvestmentTargetData", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderViewState {
    public static final int $stable = 8;
    private final Account account;
    private final AchRelationship achRelationship;
    private final InvestmentScheduleAmount amount;
    private final AmountLabelExplanationUiModel amountLabelExplanationUi;
    private final AchRelationship backupRelationship;
    private final RecurringOrderConfiguration configuration;
    private final DirectDepositRelationship directDepositRelationship;
    private final RecurringOrderState formState;
    private final Money initialAmount;
    private final UiEvent<Unit> inputFocusEvent;
    private final InvestmentTarget investmentTarget;
    private final InvestmentTargetData investmentTargetData;
    private final boolean isCryptoMibExperimentEnabled;
    private final boolean isUsRecurringVTExperimentEnabled;
    private final RecurringContext loggingContext;
    private final String orderConfigurationAccountNumber;
    private final boolean overrideBuyingPowerCheck;

    /* renamed from: recurringOrderContext$delegate, reason: from kotlin metadata */
    private final Lazy recurringOrderContext;
    private final UUID refId;
    private final ContributionLimitRemaining retirementContributionRemaining;
    private final boolean reviewButtonIsLoading;
    private final boolean reviewing;
    private final RHYContext rhyGlobalLoggingContext;
    private final UiEvent<Unit> showInitialAmountEvent;
    private final UiEvent<Unit> submitBrokerageCashTransferEvent;
    private final SweepsStatus sweepsStatus;
    private final UnifiedAccountV2 unifiedAccount;
    private final UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> validationFailureEvent;

    /* compiled from: RecurringOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr2[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BrokerageAccountType.values().length];
            try {
                iArr3[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AmountType.values().length];
            try {
                iArr4[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private final UiEvent<Unit> component15() {
        return this.showInitialAmountEvent;
    }

    /* renamed from: component20, reason: from getter */
    private final String getOrderConfigurationAccountNumber() {
        return this.orderConfigurationAccountNumber;
    }

    /* renamed from: component21, reason: from getter */
    private final SweepsStatus getSweepsStatus() {
        return this.sweepsStatus;
    }

    /* renamed from: component22, reason: from getter */
    private final RHYContext getRhyGlobalLoggingContext() {
        return this.rhyGlobalLoggingContext;
    }

    /* renamed from: component5, reason: from getter */
    private final Money getInitialAmount() {
        return this.initialAmount;
    }

    public static /* synthetic */ RecurringOrderViewState copy$default(RecurringOrderViewState recurringOrderViewState, InvestmentTarget investmentTarget, InvestmentTargetData investmentTargetData, RecurringOrderConfiguration recurringOrderConfiguration, InvestmentScheduleAmount investmentScheduleAmount, Money money, RecurringOrderState recurringOrderState, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, Account account, UnifiedAccountV2 unifiedAccountV2, UUID uuid, boolean z, AchRelationship achRelationship2, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z2, ContributionLimitRemaining contributionLimitRemaining, String str, SweepsStatus sweepsStatus, RHYContext rHYContext, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        boolean z6;
        InvestmentTarget investmentTarget2 = (i & 1) != 0 ? recurringOrderViewState.investmentTarget : investmentTarget;
        InvestmentTargetData investmentTargetData2 = (i & 2) != 0 ? recurringOrderViewState.investmentTargetData : investmentTargetData;
        RecurringOrderConfiguration recurringOrderConfiguration2 = (i & 4) != 0 ? recurringOrderViewState.configuration : recurringOrderConfiguration;
        InvestmentScheduleAmount investmentScheduleAmount2 = (i & 8) != 0 ? recurringOrderViewState.amount : investmentScheduleAmount;
        Money money2 = (i & 16) != 0 ? recurringOrderViewState.initialAmount : money;
        RecurringOrderState recurringOrderState2 = (i & 32) != 0 ? recurringOrderViewState.formState : recurringOrderState;
        AchRelationship achRelationship3 = (i & 64) != 0 ? recurringOrderViewState.achRelationship : achRelationship;
        DirectDepositRelationship directDepositRelationship2 = (i & 128) != 0 ? recurringOrderViewState.directDepositRelationship : directDepositRelationship;
        Account account2 = (i & 256) != 0 ? recurringOrderViewState.account : account;
        UnifiedAccountV2 unifiedAccountV22 = (i & 512) != 0 ? recurringOrderViewState.unifiedAccount : unifiedAccountV2;
        UUID uuid2 = (i & 1024) != 0 ? recurringOrderViewState.refId : uuid;
        boolean z7 = (i & 2048) != 0 ? recurringOrderViewState.overrideBuyingPowerCheck : z;
        AchRelationship achRelationship4 = (i & 4096) != 0 ? recurringOrderViewState.backupRelationship : achRelationship2;
        UiEvent uiEvent5 = (i & 8192) != 0 ? recurringOrderViewState.validationFailureEvent : uiEvent;
        InvestmentTarget investmentTarget3 = investmentTarget2;
        UiEvent uiEvent6 = (i & 16384) != 0 ? recurringOrderViewState.showInitialAmountEvent : uiEvent2;
        UiEvent uiEvent7 = (i & 32768) != 0 ? recurringOrderViewState.inputFocusEvent : uiEvent3;
        UiEvent uiEvent8 = (i & 65536) != 0 ? recurringOrderViewState.submitBrokerageCashTransferEvent : uiEvent4;
        boolean z8 = (i & 131072) != 0 ? recurringOrderViewState.reviewButtonIsLoading : z2;
        ContributionLimitRemaining contributionLimitRemaining2 = (i & 262144) != 0 ? recurringOrderViewState.retirementContributionRemaining : contributionLimitRemaining;
        String str2 = (i & 524288) != 0 ? recurringOrderViewState.orderConfigurationAccountNumber : str;
        SweepsStatus sweepsStatus2 = (i & 1048576) != 0 ? recurringOrderViewState.sweepsStatus : sweepsStatus;
        RHYContext rHYContext2 = (i & 2097152) != 0 ? recurringOrderViewState.rhyGlobalLoggingContext : rHYContext;
        boolean z9 = (i & 4194304) != 0 ? recurringOrderViewState.isUsRecurringVTExperimentEnabled : z3;
        if ((i & 8388608) != 0) {
            z6 = z9;
            z5 = recurringOrderViewState.isCryptoMibExperimentEnabled;
        } else {
            z5 = z4;
            z6 = z9;
        }
        return recurringOrderViewState.copy(investmentTarget3, investmentTargetData2, recurringOrderConfiguration2, investmentScheduleAmount2, money2, recurringOrderState2, achRelationship3, directDepositRelationship2, account2, unifiedAccountV22, uuid2, z7, achRelationship4, uiEvent5, uiEvent6, uiEvent7, uiEvent8, z8, contributionLimitRemaining2, str2, sweepsStatus2, rHYContext2, z6, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /* renamed from: component10, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getOverrideBuyingPowerCheck() {
        return this.overrideBuyingPowerCheck;
    }

    /* renamed from: component13, reason: from getter */
    public final AchRelationship getBackupRelationship() {
        return this.backupRelationship;
    }

    public final UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> component14() {
        return this.validationFailureEvent;
    }

    public final UiEvent<Unit> component16() {
        return this.inputFocusEvent;
    }

    public final UiEvent<Unit> component17() {
        return this.submitBrokerageCashTransferEvent;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getReviewButtonIsLoading() {
        return this.reviewButtonIsLoading;
    }

    /* renamed from: component19, reason: from getter */
    public final ContributionLimitRemaining getRetirementContributionRemaining() {
        return this.retirementContributionRemaining;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentTargetData getInvestmentTargetData() {
        return this.investmentTargetData;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsUsRecurringVTExperimentEnabled() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final RecurringOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component4, reason: from getter */
    public final InvestmentScheduleAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final RecurringOrderState getFormState() {
        return this.formState;
    }

    /* renamed from: component7, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component8, reason: from getter */
    public final DirectDepositRelationship getDirectDepositRelationship() {
        return this.directDepositRelationship;
    }

    /* renamed from: component9, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final RecurringOrderViewState copy(InvestmentTarget investmentTarget, InvestmentTargetData investmentTargetData, RecurringOrderConfiguration configuration, InvestmentScheduleAmount amount, Money initialAmount, RecurringOrderState formState, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, Account account, UnifiedAccountV2 unifiedAccount, UUID refId, boolean overrideBuyingPowerCheck, AchRelationship backupRelationship, UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> validationFailureEvent, UiEvent<Unit> showInitialAmountEvent, UiEvent<Unit> inputFocusEvent, UiEvent<Unit> submitBrokerageCashTransferEvent, boolean reviewButtonIsLoading, ContributionLimitRemaining retirementContributionRemaining, String orderConfigurationAccountNumber, SweepsStatus sweepsStatus, RHYContext rhyGlobalLoggingContext, boolean isUsRecurringVTExperimentEnabled, boolean isCryptoMibExperimentEnabled) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(investmentTargetData, "investmentTargetData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(showInitialAmountEvent, "showInitialAmountEvent");
        Intrinsics.checkNotNullParameter(inputFocusEvent, "inputFocusEvent");
        return new RecurringOrderViewState(investmentTarget, investmentTargetData, configuration, amount, initialAmount, formState, achRelationship, directDepositRelationship, account, unifiedAccount, refId, overrideBuyingPowerCheck, backupRelationship, validationFailureEvent, showInitialAmountEvent, inputFocusEvent, submitBrokerageCashTransferEvent, reviewButtonIsLoading, retirementContributionRemaining, orderConfigurationAccountNumber, sweepsStatus, rhyGlobalLoggingContext, isUsRecurringVTExperimentEnabled, isCryptoMibExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderViewState)) {
            return false;
        }
        RecurringOrderViewState recurringOrderViewState = (RecurringOrderViewState) other;
        return Intrinsics.areEqual(this.investmentTarget, recurringOrderViewState.investmentTarget) && Intrinsics.areEqual(this.investmentTargetData, recurringOrderViewState.investmentTargetData) && Intrinsics.areEqual(this.configuration, recurringOrderViewState.configuration) && Intrinsics.areEqual(this.amount, recurringOrderViewState.amount) && Intrinsics.areEqual(this.initialAmount, recurringOrderViewState.initialAmount) && this.formState == recurringOrderViewState.formState && Intrinsics.areEqual(this.achRelationship, recurringOrderViewState.achRelationship) && Intrinsics.areEqual(this.directDepositRelationship, recurringOrderViewState.directDepositRelationship) && Intrinsics.areEqual(this.account, recurringOrderViewState.account) && Intrinsics.areEqual(this.unifiedAccount, recurringOrderViewState.unifiedAccount) && Intrinsics.areEqual(this.refId, recurringOrderViewState.refId) && this.overrideBuyingPowerCheck == recurringOrderViewState.overrideBuyingPowerCheck && Intrinsics.areEqual(this.backupRelationship, recurringOrderViewState.backupRelationship) && Intrinsics.areEqual(this.validationFailureEvent, recurringOrderViewState.validationFailureEvent) && Intrinsics.areEqual(this.showInitialAmountEvent, recurringOrderViewState.showInitialAmountEvent) && Intrinsics.areEqual(this.inputFocusEvent, recurringOrderViewState.inputFocusEvent) && Intrinsics.areEqual(this.submitBrokerageCashTransferEvent, recurringOrderViewState.submitBrokerageCashTransferEvent) && this.reviewButtonIsLoading == recurringOrderViewState.reviewButtonIsLoading && Intrinsics.areEqual(this.retirementContributionRemaining, recurringOrderViewState.retirementContributionRemaining) && Intrinsics.areEqual(this.orderConfigurationAccountNumber, recurringOrderViewState.orderConfigurationAccountNumber) && Intrinsics.areEqual(this.sweepsStatus, recurringOrderViewState.sweepsStatus) && Intrinsics.areEqual(this.rhyGlobalLoggingContext, recurringOrderViewState.rhyGlobalLoggingContext) && this.isUsRecurringVTExperimentEnabled == recurringOrderViewState.isUsRecurringVTExperimentEnabled && this.isCryptoMibExperimentEnabled == recurringOrderViewState.isCryptoMibExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.investmentTarget.hashCode() * 31) + this.investmentTargetData.hashCode()) * 31;
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        int iHashCode2 = (((iHashCode + (recurringOrderConfiguration == null ? 0 : recurringOrderConfiguration.hashCode())) * 31) + this.amount.hashCode()) * 31;
        Money money = this.initialAmount;
        int iHashCode3 = (((iHashCode2 + (money == null ? 0 : money.hashCode())) * 31) + this.formState.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode4 = (iHashCode3 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        DirectDepositRelationship directDepositRelationship = this.directDepositRelationship;
        int iHashCode5 = (iHashCode4 + (directDepositRelationship == null ? 0 : directDepositRelationship.hashCode())) * 31;
        Account account = this.account;
        int iHashCode6 = (iHashCode5 + (account == null ? 0 : account.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode7 = (iHashCode6 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        UUID uuid = this.refId;
        int iHashCode8 = (((iHashCode7 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.overrideBuyingPowerCheck)) * 31;
        AchRelationship achRelationship2 = this.backupRelationship;
        int iHashCode9 = (iHashCode8 + (achRelationship2 == null ? 0 : achRelationship2.hashCode())) * 31;
        UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> uiEvent = this.validationFailureEvent;
        int iHashCode10 = (((((iHashCode9 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.showInitialAmountEvent.hashCode()) * 31) + this.inputFocusEvent.hashCode()) * 31;
        UiEvent<Unit> uiEvent2 = this.submitBrokerageCashTransferEvent;
        int iHashCode11 = (((iHashCode10 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.reviewButtonIsLoading)) * 31;
        ContributionLimitRemaining contributionLimitRemaining = this.retirementContributionRemaining;
        int iHashCode12 = (iHashCode11 + (contributionLimitRemaining == null ? 0 : contributionLimitRemaining.hashCode())) * 31;
        String str = this.orderConfigurationAccountNumber;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        SweepsStatus sweepsStatus = this.sweepsStatus;
        int iHashCode14 = (iHashCode13 + (sweepsStatus == null ? 0 : sweepsStatus.hashCode())) * 31;
        RHYContext rHYContext = this.rhyGlobalLoggingContext;
        return ((((iHashCode14 + (rHYContext != null ? rHYContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUsRecurringVTExperimentEnabled)) * 31) + Boolean.hashCode(this.isCryptoMibExperimentEnabled);
    }

    public String toString() {
        return "RecurringOrderViewState(investmentTarget=" + this.investmentTarget + ", investmentTargetData=" + this.investmentTargetData + ", configuration=" + this.configuration + ", amount=" + this.amount + ", initialAmount=" + this.initialAmount + ", formState=" + this.formState + ", achRelationship=" + this.achRelationship + ", directDepositRelationship=" + this.directDepositRelationship + ", account=" + this.account + ", unifiedAccount=" + this.unifiedAccount + ", refId=" + this.refId + ", overrideBuyingPowerCheck=" + this.overrideBuyingPowerCheck + ", backupRelationship=" + this.backupRelationship + ", validationFailureEvent=" + this.validationFailureEvent + ", showInitialAmountEvent=" + this.showInitialAmountEvent + ", inputFocusEvent=" + this.inputFocusEvent + ", submitBrokerageCashTransferEvent=" + this.submitBrokerageCashTransferEvent + ", reviewButtonIsLoading=" + this.reviewButtonIsLoading + ", retirementContributionRemaining=" + this.retirementContributionRemaining + ", orderConfigurationAccountNumber=" + this.orderConfigurationAccountNumber + ", sweepsStatus=" + this.sweepsStatus + ", rhyGlobalLoggingContext=" + this.rhyGlobalLoggingContext + ", isUsRecurringVTExperimentEnabled=" + this.isUsRecurringVTExperimentEnabled + ", isCryptoMibExperimentEnabled=" + this.isCryptoMibExperimentEnabled + ")";
    }

    public RecurringOrderViewState(InvestmentTarget investmentTarget, InvestmentTargetData investmentTargetData, RecurringOrderConfiguration recurringOrderConfiguration, InvestmentScheduleAmount amount, Money money, RecurringOrderState formState, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, Account account, UnifiedAccountV2 unifiedAccountV2, UUID uuid, boolean z, AchRelationship achRelationship2, UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> uiEvent, UiEvent<Unit> showInitialAmountEvent, UiEvent<Unit> inputFocusEvent, UiEvent<Unit> uiEvent2, boolean z2, ContributionLimitRemaining contributionLimitRemaining, String str, SweepsStatus sweepsStatus, RHYContext rHYContext, boolean z3, boolean z4) {
        AmountLabelExplanationUiModel bottomSheet;
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(investmentTargetData, "investmentTargetData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(showInitialAmountEvent, "showInitialAmountEvent");
        Intrinsics.checkNotNullParameter(inputFocusEvent, "inputFocusEvent");
        this.investmentTarget = investmentTarget;
        this.investmentTargetData = investmentTargetData;
        this.configuration = recurringOrderConfiguration;
        this.amount = amount;
        this.initialAmount = money;
        this.formState = formState;
        this.achRelationship = achRelationship;
        this.directDepositRelationship = directDepositRelationship;
        this.account = account;
        this.unifiedAccount = unifiedAccountV2;
        this.refId = uuid;
        this.overrideBuyingPowerCheck = z;
        this.backupRelationship = achRelationship2;
        this.validationFailureEvent = uiEvent;
        this.showInitialAmountEvent = showInitialAmountEvent;
        this.inputFocusEvent = inputFocusEvent;
        this.submitBrokerageCashTransferEvent = uiEvent2;
        this.reviewButtonIsLoading = z2;
        this.retirementContributionRemaining = contributionLimitRemaining;
        this.orderConfigurationAccountNumber = str;
        this.sweepsStatus = sweepsStatus;
        this.rhyGlobalLoggingContext = rHYContext;
        this.isUsRecurringVTExperimentEnabled = z3;
        this.isCryptoMibExperimentEnabled = z4;
        this.recurringOrderContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderViewState.recurringOrderContext_delegate$lambda$0(this.f$0);
            }
        });
        boolean isReviewingState = formState.getIsReviewingState();
        this.reviewing = isReviewingState;
        ArrayList arrayList = new ArrayList();
        if ((recurringOrderConfiguration != null ? recurringOrderConfiguration.getFrequency() : null) == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK && recurringOrderConfiguration.getWasAmountTypePreselected()) {
            arrayList.add(AmountLabelExplanation.DIRECT_DEPOSIT_AMOUNT_TYPE);
        }
        if (investmentTarget.isCrypto() && !isReviewingState) {
            if (z3) {
                arrayList.add(AmountLabelExplanation.CRYPTO_COLLARING_FEE);
            } else {
                arrayList.add(AmountLabelExplanation.CRYPTO_COLLARING);
            }
        }
        if (arrayList.isEmpty()) {
            bottomSheet = null;
        } else if (arrayList.size() == 1) {
            bottomSheet = new AmountLabelExplanationUiModel.Dialog(amount, (AmountLabelExplanation) CollectionsKt.first((List) arrayList));
        } else {
            bottomSheet = new AmountLabelExplanationUiModel.BottomSheet(amount, arrayList);
        }
        this.amountLabelExplanationUi = bottomSheet;
        this.loggingContext = new RecurringContext(null, null, null, Recurring2.toProtobuf(recurringOrderConfiguration != null ? recurringOrderConfiguration.getFrequency() : null), Recurring2.toProtobuf(recurringOrderConfiguration != null ? recurringOrderConfiguration.getSourceOfFunds() : null), amount.getDollarAmount().getDecimalValue().doubleValue(), null, null, amount.getPercentageAmount().doubleValue(), null, null, 1735, null);
    }

    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RecurringOrderViewState(com.robinhood.recurring.models.p365db.InvestmentTarget r29, com.robinhood.android.common.recurring.trade.RecurringOrderViewState.InvestmentTargetData r30, com.robinhood.android.recurring.contracts.RecurringOrderConfiguration r31, com.robinhood.recurring.models.InvestmentScheduleAmount r32, com.robinhood.models.util.Money r33, com.robinhood.android.common.recurring.trade.RecurringOrderState r34, com.robinhood.models.p320db.AchRelationship r35, com.robinhood.models.p320db.bonfire.DirectDepositRelationship r36, com.robinhood.models.p320db.Account r37, com.robinhood.models.p320db.phoenix.UnifiedAccountV2 r38, java.util.UUID r39, boolean r40, com.robinhood.models.p320db.AchRelationship r41, com.robinhood.udf.UiEvent r42, com.robinhood.udf.UiEvent r43, com.robinhood.udf.UiEvent r44, com.robinhood.udf.UiEvent r45, boolean r46, com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionLimitRemaining r47, java.lang.String r48, com.robinhood.librobinhood.data.store.SweepsStatus r49, com.robinhood.rosetta.eventlogging.RHYContext r50, boolean r51, boolean r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.recurring.trade.RecurringOrderViewState.<init>(com.robinhood.recurring.models.db.InvestmentTarget, com.robinhood.android.common.recurring.trade.RecurringOrderViewState$InvestmentTargetData, com.robinhood.android.recurring.contracts.RecurringOrderConfiguration, com.robinhood.recurring.models.InvestmentScheduleAmount, com.robinhood.models.util.Money, com.robinhood.android.common.recurring.trade.RecurringOrderState, com.robinhood.models.db.AchRelationship, com.robinhood.models.db.bonfire.DirectDepositRelationship, com.robinhood.models.db.Account, com.robinhood.models.db.phoenix.UnifiedAccountV2, java.util.UUID, boolean, com.robinhood.models.db.AchRelationship, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, boolean, com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionLimitRemaining, java.lang.String, com.robinhood.librobinhood.data.store.SweepsStatus, com.robinhood.rosetta.eventlogging.RHYContext, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final InvestmentTargetData getInvestmentTargetData() {
        return this.investmentTargetData;
    }

    public final RecurringOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    public final InvestmentScheduleAmount getAmount() {
        return this.amount;
    }

    public final RecurringOrderState getFormState() {
        return this.formState;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final DirectDepositRelationship getDirectDepositRelationship() {
        return this.directDepositRelationship;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final boolean getOverrideBuyingPowerCheck() {
        return this.overrideBuyingPowerCheck;
    }

    public final AchRelationship getBackupRelationship() {
        return this.backupRelationship;
    }

    public final UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> getValidationFailureEvent() {
        return this.validationFailureEvent;
    }

    public final UiEvent<Unit> getInputFocusEvent() {
        return this.inputFocusEvent;
    }

    public final UiEvent<Unit> getSubmitBrokerageCashTransferEvent() {
        return this.submitBrokerageCashTransferEvent;
    }

    public final boolean getReviewButtonIsLoading() {
        return this.reviewButtonIsLoading;
    }

    public final ContributionLimitRemaining getRetirementContributionRemaining() {
        return this.retirementContributionRemaining;
    }

    public final boolean isUsRecurringVTExperimentEnabled() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    public final boolean isCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    public final String getAccountNumber() {
        String str = this.orderConfigurationAccountNumber;
        if (str != null) {
            return str;
        }
        Account account = this.account;
        if (account != null) {
            return account.getAccountNumber();
        }
        return null;
    }

    /* compiled from: RecurringOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "Equity", "Crypto", "BrokerageCash", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$BrokerageCash;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Crypto;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Equity;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InvestmentTargetData {
        public static final int $stable = 0;

        public /* synthetic */ InvestmentTargetData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InvestmentTargetData() {
        }

        /* compiled from: RecurringOrderViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Equity;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/InstrumentBuyingPower;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Equity extends InvestmentTargetData {
            public static final int $stable = 8;
            private final Instrument instrument;
            private final InstrumentBuyingPower instrumentBuyingPower;

            /* JADX WARN: Multi-variable type inference failed */
            public Equity() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Equity copy$default(Equity equity, Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = equity.instrument;
                }
                if ((i & 2) != 0) {
                    instrumentBuyingPower = equity.instrumentBuyingPower;
                }
                return equity.copy(instrument, instrumentBuyingPower);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component2, reason: from getter */
            public final InstrumentBuyingPower getInstrumentBuyingPower() {
                return this.instrumentBuyingPower;
            }

            public final Equity copy(Instrument instrument, InstrumentBuyingPower instrumentBuyingPower) {
                return new Equity(instrument, instrumentBuyingPower);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Equity)) {
                    return false;
                }
                Equity equity = (Equity) other;
                return Intrinsics.areEqual(this.instrument, equity.instrument) && Intrinsics.areEqual(this.instrumentBuyingPower, equity.instrumentBuyingPower);
            }

            public int hashCode() {
                Instrument instrument = this.instrument;
                int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
                InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
                return iHashCode + (instrumentBuyingPower != null ? instrumentBuyingPower.hashCode() : 0);
            }

            public String toString() {
                return "Equity(instrument=" + this.instrument + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ")";
            }

            public /* synthetic */ Equity(Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : instrumentBuyingPower);
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final InstrumentBuyingPower getInstrumentBuyingPower() {
                return this.instrumentBuyingPower;
            }

            public Equity(Instrument instrument, InstrumentBuyingPower instrumentBuyingPower) {
                super(null);
                this.instrument = instrument;
                this.instrumentBuyingPower = instrumentBuyingPower;
            }
        }

        /* compiled from: RecurringOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Crypto;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoBuyingPower", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "numDayTrades", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoBuyingPower;Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Ljava/lang/Integer;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoBuyingPower", "()Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "getCryptoAccount", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getNumDayTrades", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoBuyingPower;Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Ljava/lang/Integer;)Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Crypto;", "equals", "", "other", "", "hashCode", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto extends InvestmentTargetData {
            public static final int $stable = 8;
            private final CryptoAccount cryptoAccount;
            private final CryptoBuyingPower cryptoBuyingPower;
            private final UiCurrencyPair currencyPair;
            private final MarginSettings marginSettings;
            private final Integer numDayTrades;
            private final UnifiedBalances unifiedBalances;

            public Crypto() {
                this(null, null, null, null, null, null, 63, null);
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, UiCurrencyPair uiCurrencyPair, CryptoBuyingPower cryptoBuyingPower, CryptoAccount cryptoAccount, UnifiedBalances unifiedBalances, MarginSettings marginSettings, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = crypto2.currencyPair;
                }
                if ((i & 2) != 0) {
                    cryptoBuyingPower = crypto2.cryptoBuyingPower;
                }
                if ((i & 4) != 0) {
                    cryptoAccount = crypto2.cryptoAccount;
                }
                if ((i & 8) != 0) {
                    unifiedBalances = crypto2.unifiedBalances;
                }
                if ((i & 16) != 0) {
                    marginSettings = crypto2.marginSettings;
                }
                if ((i & 32) != 0) {
                    num = crypto2.numDayTrades;
                }
                MarginSettings marginSettings2 = marginSettings;
                Integer num2 = num;
                return crypto2.copy(uiCurrencyPair, cryptoBuyingPower, cryptoAccount, unifiedBalances, marginSettings2, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component2, reason: from getter */
            public final CryptoBuyingPower getCryptoBuyingPower() {
                return this.cryptoBuyingPower;
            }

            /* renamed from: component3, reason: from getter */
            public final CryptoAccount getCryptoAccount() {
                return this.cryptoAccount;
            }

            /* renamed from: component4, reason: from getter */
            public final UnifiedBalances getUnifiedBalances() {
                return this.unifiedBalances;
            }

            /* renamed from: component5, reason: from getter */
            public final MarginSettings getMarginSettings() {
                return this.marginSettings;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getNumDayTrades() {
                return this.numDayTrades;
            }

            public final Crypto copy(UiCurrencyPair currencyPair, CryptoBuyingPower cryptoBuyingPower, CryptoAccount cryptoAccount, UnifiedBalances unifiedBalances, MarginSettings marginSettings, Integer numDayTrades) {
                return new Crypto(currencyPair, cryptoBuyingPower, cryptoAccount, unifiedBalances, marginSettings, numDayTrades);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Crypto)) {
                    return false;
                }
                Crypto crypto2 = (Crypto) other;
                return Intrinsics.areEqual(this.currencyPair, crypto2.currencyPair) && Intrinsics.areEqual(this.cryptoBuyingPower, crypto2.cryptoBuyingPower) && Intrinsics.areEqual(this.cryptoAccount, crypto2.cryptoAccount) && Intrinsics.areEqual(this.unifiedBalances, crypto2.unifiedBalances) && Intrinsics.areEqual(this.marginSettings, crypto2.marginSettings) && Intrinsics.areEqual(this.numDayTrades, crypto2.numDayTrades);
            }

            public int hashCode() {
                UiCurrencyPair uiCurrencyPair = this.currencyPair;
                int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
                CryptoBuyingPower cryptoBuyingPower = this.cryptoBuyingPower;
                int iHashCode2 = (iHashCode + (cryptoBuyingPower == null ? 0 : cryptoBuyingPower.hashCode())) * 31;
                CryptoAccount cryptoAccount = this.cryptoAccount;
                int iHashCode3 = (iHashCode2 + (cryptoAccount == null ? 0 : cryptoAccount.hashCode())) * 31;
                UnifiedBalances unifiedBalances = this.unifiedBalances;
                int iHashCode4 = (iHashCode3 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
                MarginSettings marginSettings = this.marginSettings;
                int iHashCode5 = (iHashCode4 + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
                Integer num = this.numDayTrades;
                return iHashCode5 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "Crypto(currencyPair=" + this.currencyPair + ", cryptoBuyingPower=" + this.cryptoBuyingPower + ", cryptoAccount=" + this.cryptoAccount + ", unifiedBalances=" + this.unifiedBalances + ", marginSettings=" + this.marginSettings + ", numDayTrades=" + this.numDayTrades + ")";
            }

            public /* synthetic */ Crypto(UiCurrencyPair uiCurrencyPair, CryptoBuyingPower cryptoBuyingPower, CryptoAccount cryptoAccount, UnifiedBalances unifiedBalances, MarginSettings marginSettings, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : cryptoBuyingPower, (i & 4) != 0 ? null : cryptoAccount, (i & 8) != 0 ? null : unifiedBalances, (i & 16) != 0 ? null : marginSettings, (i & 32) != 0 ? null : num);
            }

            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            public final CryptoBuyingPower getCryptoBuyingPower() {
                return this.cryptoBuyingPower;
            }

            public final CryptoAccount getCryptoAccount() {
                return this.cryptoAccount;
            }

            public final UnifiedBalances getUnifiedBalances() {
                return this.unifiedBalances;
            }

            public final MarginSettings getMarginSettings() {
                return this.marginSettings;
            }

            public final Integer getNumDayTrades() {
                return this.numDayTrades;
            }

            public Crypto(UiCurrencyPair uiCurrencyPair, CryptoBuyingPower cryptoBuyingPower, CryptoAccount cryptoAccount, UnifiedBalances unifiedBalances, MarginSettings marginSettings, Integer num) {
                super(null);
                this.currencyPair = uiCurrencyPair;
                this.cryptoBuyingPower = cryptoBuyingPower;
                this.cryptoAccount = cryptoAccount;
                this.unifiedBalances = unifiedBalances;
                this.marginSettings = marginSettings;
                this.numDayTrades = num;
            }
        }

        /* compiled from: RecurringOrderViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$BrokerageCash;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BrokerageCash extends InvestmentTargetData {
            public static final int $stable = 0;
            public static final BrokerageCash INSTANCE = new BrokerageCash();

            private BrokerageCash() {
                super(null);
            }
        }

        public final String getSymbol() {
            if (this instanceof Equity) {
                Instrument instrument = ((Equity) this).getInstrument();
                if (instrument != null) {
                    return instrument.getSymbol();
                }
                return null;
            }
            if (!(this instanceof Crypto)) {
                if (this instanceof BrokerageCash) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            UiCurrencyPair currencyPair = ((Crypto) this).getCurrencyPair();
            if (currencyPair != null) {
                return currencyPair.getDisplaySymbol();
            }
            return null;
        }
    }

    public final RecurringOrderContext getRecurringOrderContext() {
        return (RecurringOrderContext) this.recurringOrderContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderContext recurringOrderContext_delegate$lambda$0(RecurringOrderViewState recurringOrderViewState) {
        BigDecimal percentageAmount;
        String accountNumber = recurringOrderViewState.getAccountNumber();
        RecurringOrderConfiguration recurringOrderConfiguration = recurringOrderViewState.configuration;
        UUID achRelationshipId = null;
        if (recurringOrderConfiguration == null || accountNumber == null || recurringOrderViewState.account == null || recurringOrderViewState.unifiedAccount == null || recurringOrderViewState.refId == null || recurringOrderConfiguration.getFrequency() == null || recurringOrderViewState.configuration.getStartDate() == null) {
            return null;
        }
        ApiInvestmentAsset apiModel = recurringOrderViewState.investmentTarget.toApiModel();
        Money dollarAmount = recurringOrderViewState.amount.getDollarAmount();
        ApiInvestmentSchedule.Frequency frequency = recurringOrderViewState.configuration.getFrequency();
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == -1) {
            percentageAmount = null;
        } else if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            percentageAmount = null;
        } else {
            percentageAmount = recurringOrderViewState.amount.getPercentageAmount();
        }
        ApiInvestmentSchedule.Frequency frequency2 = recurringOrderViewState.configuration.getFrequency();
        if (frequency2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        LocalDate startDate = recurringOrderViewState.configuration.getStartDate();
        if (startDate == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = recurringOrderViewState.configuration.getSourceOfFunds();
        if (sourceOfFunds == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Boolean boolValueOf = Boolean.valueOf(recurringOrderViewState.configuration.isBackupAchEnabled());
        if (recurringOrderViewState.configuration.isBackupAchEnabled()) {
            AchRelationship achRelationship = recurringOrderViewState.backupRelationship;
            if (achRelationship != null) {
                achRelationshipId = achRelationship.getId();
            }
        } else {
            achRelationshipId = recurringOrderViewState.configuration.getAchRelationshipId();
        }
        return new RecurringOrderContext(new ApiInvestmentScheduleRequest(accountNumber, apiModel, dollarAmount, percentageAmount, frequency2, startDate, sourceOfFunds, boolValueOf, achRelationshipId, recurringOrderViewState.configuration.getDirectDepositRelationshipId(), recurringOrderViewState.refId), recurringOrderViewState.account, recurringOrderViewState.configuration.getAmountType(), recurringOrderViewState.unifiedAccount, recurringOrderViewState.investmentTargetData, recurringOrderViewState.overrideBuyingPowerCheck);
    }

    public final boolean getReviewing() {
        return this.reviewing;
    }

    public final StringResource getPaycheckDisclaimerTitleVisibilityText() {
        ContributionLimitRemaining contributionLimitRemaining;
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if ((i == 1 || i == 2) && (contributionLimitRemaining = this.retirementContributionRemaining) != null) {
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_order_retirement_disclosure_limit_title, Money.format$default(contributionLimitRemaining.getLimitRemaining(), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
        }
        return null;
    }

    public final StringResource getPaycheckDisclaimerVisibilityText() {
        int i;
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i2 = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_order_retirement_disclosure_limit_body, new Object[0]);
        }
        if (!this.reviewing) {
            RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
            if ((recurringOrderConfiguration != null ? recurringOrderConfiguration.getFrequency() : null) == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK && !(this.investmentTargetData instanceof InvestmentTargetData.BrokerageCash)) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i3 = C11595R.string.recurring_schedule_paycheck_disclaimer_template;
                int i4 = WhenMappings.$EnumSwitchMapping$0[this.investmentTarget.getTargetType().ordinal()];
                if (i4 == 1) {
                    i = C11595R.string.individual_account_label;
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("This flow doesn't support tokenized stocks");
                    }
                    i = C11595R.string.individual_account_label;
                } else {
                    i = C11595R.string.crypto_account_label;
                }
                return companion.invoke(i3, companion.invoke(i, new Object[0]));
            }
        }
        return null;
    }

    public final boolean getPaycheckDisclaimerHasLearnMore() {
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        return i == 1 || i == 2;
    }

    public final Integer getPaycheckDisclaimerTitleIconRes() {
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i == 1 || i == 2) {
            return Integer.valueOf(C20690R.drawable.ic_rds_info_16dp);
        }
        return null;
    }

    public final Integer getPaycheckDisclaimerBodyIconRes() {
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        return Integer.valueOf(C20690R.drawable.ic_rds_pop_out_16dp);
    }

    public final boolean isReviewButtonEnabled() {
        return this.amount.isValid(this.investmentTarget.getTargetType());
    }

    public final boolean getShowBackupRow() {
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        return recurringOrderConfiguration != null && recurringOrderConfiguration.isBackupAchEnabled();
    }

    public final AmountLabelExplanationUiModel getAmountLabelExplanationUi() {
        return this.amountLabelExplanationUi;
    }

    public final boolean getShowAmountLabelQuestionMark() {
        return (this.reviewing || this.amountLabelExplanationUi == null) ? false : true;
    }

    public final boolean isCrypto() {
        return this.investmentTarget.isCrypto();
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    public final RHYContext getRhyLoggingContext() {
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if ((recurringOrderConfiguration != null ? recurringOrderConfiguration.getFrequency() : null) == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            return this.rhyGlobalLoggingContext;
        }
        return null;
    }

    public final StringResource getRecurringOrderScheduleLabelTxt() {
        InvestmentTargetData investmentTargetData = this.investmentTargetData;
        if (Intrinsics.areEqual(investmentTargetData, InvestmentTargetData.BrokerageCash.INSTANCE)) {
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_brokerage_cash_transfer_frequency_label, new Object[0]);
        }
        if (!(investmentTargetData instanceof InvestmentTargetData.Crypto) && !(investmentTargetData instanceof InvestmentTargetData.Equity)) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11595R.string.recurring_order_details_label, new Object[0]);
    }

    public final boolean getRecurringOrderScheduleDetailsVisible() {
        InvestmentTargetData investmentTargetData = this.investmentTargetData;
        if (Intrinsics.areEqual(investmentTargetData, InvestmentTargetData.BrokerageCash.INSTANCE)) {
            return false;
        }
        if ((investmentTargetData instanceof InvestmentTargetData.Crypto) || (investmentTargetData instanceof InvestmentTargetData.Equity)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getRecurringOrderAccountDetailsVisible() {
        RecurringOrderContext recurringOrderContext;
        RecurringOrderContext recurringOrderContext2 = getRecurringOrderContext();
        if ((recurringOrderContext2 == null || !recurringOrderContext2.isBrokerageCashTransfer()) && !((recurringOrderContext = getRecurringOrderContext()) != null && recurringOrderContext.isCrypto() && this.isCryptoMibExperimentEnabled)) {
            return false;
        }
        Account account = this.account;
        return (account != null ? AccountDisplayNames.getDisplayName(account) : null) != null;
    }

    public final CharSequence getAccountNameTitle(Resources resources) {
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource title;
        DisplayName displayName2;
        DisplayName.Variants variants;
        StringResource title2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderContext recurringOrderContext = getRecurringOrderContext();
        if (recurringOrderContext != null && recurringOrderContext.isCrypto()) {
            Account account = this.account;
            if (account == null || (displayName2 = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName2.getShort()) == null || (title2 = variants.getTitle()) == null) {
                return null;
            }
            return title2.getText(resources);
        }
        Account account2 = this.account;
        if (account2 == null || (displayName = AccountDisplayNames.getDisplayName(account2)) == null || (withAccount = displayName.getWithAccount()) == null || (title = withAccount.getTitle()) == null) {
            return null;
        }
        return title.getText(resources);
    }

    public final StringResource getAccountNameSubtitle() {
        SweepsStatus sweepsStatus;
        ApiSweepEnrollment sweepEnrollment;
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 || (sweepsStatus = this.sweepsStatus) == null || (sweepEnrollment = sweepsStatus.getSweepEnrollment()) == null || !sweepEnrollment.getSweepEnrolled() || this.sweepsStatus.getSweepInterestRate() == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_account_subtitle_sweeps, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getInterestRateFormatShort(), this.sweepsStatus.getSweepInterestRate(), null, 2, null));
        }
        return StringResource.INSTANCE.invoke(C11595R.string.recurring_account_subtitle_ira_match, new Object[0]);
    }

    public final ServerToBentoAssetMapper2 getAccountNameSubtitleIcon() {
        Account account = this.account;
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i == 1 || i == 2) {
            return ServerToBentoAssetMapper2.RETIREMENT_12;
        }
        return null;
    }

    public final CharSequence getTitleText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        InvestmentTargetData investmentTargetData = this.investmentTargetData;
        if (Intrinsics.areEqual(investmentTargetData, InvestmentTargetData.BrokerageCash.INSTANCE)) {
            Account account = this.account;
            BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
            int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
            if (i == 1) {
                return resources.getString(C11595R.string.recurring_retirement_transfer_title_roth);
            }
            if (i == 2) {
                return resources.getString(C11595R.string.recurring_retirement_transfer_title_traditional);
            }
            return resources.getString(C11595R.string.recurring_brokerage_cash_transfer_title);
        }
        if (!(investmentTargetData instanceof InvestmentTargetData.Crypto) && !(investmentTargetData instanceof InvestmentTargetData.Equity)) {
            throw new NoWhenBranchMatchedException();
        }
        String symbol = this.investmentTargetData.getSymbol();
        if (symbol == null) {
            return null;
        }
        return resources.getString(C11595R.string.order_create_recurring_title, symbol);
    }

    public final boolean isDollarAmountInputVisible() {
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        return recurringOrderConfiguration != null && recurringOrderConfiguration.getAmountType() == AmountType.DOLLAR;
    }

    public final boolean shouldFocusDollarAmountInput() {
        return isDollarAmountInputVisible() && this.inputFocusEvent.consume() != null;
    }

    public final boolean isPercentageInputVisible() {
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        return recurringOrderConfiguration != null && recurringOrderConfiguration.getAmountType() == AmountType.PERCENTAGE;
    }

    public final boolean shouldFocusPercentageInput() {
        return isPercentageInputVisible() && this.inputFocusEvent.consume() != null;
    }

    public final Money getInitialDollarAmount() {
        if (!isDollarAmountInputVisible() || this.initialAmount == null || this.showInitialAmountEvent.consume() == null) {
            return null;
        }
        return this.initialAmount;
    }

    public final CharSequence getFrequencyText(Resources resources) {
        ApiInvestmentSchedule.Frequency frequency;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null || (frequency = recurringOrderConfiguration.getFrequency()) == null) {
            return null;
        }
        return resources.getString(StringsKt.labelResId(frequency, isCrypto()));
    }

    public final CharSequence getStartDateText(Resources resources) {
        LocalDate startDate;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null || (startDate = recurringOrderConfiguration.getStartDate()) == null) {
            return null;
        }
        if (this.configuration.getFrequency() == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            return resources.getString(C11595R.string.order_create_paycheck_recurring_start_date);
        }
        return resources.getString(C11595R.string.order_create_recurring_start_date, LocalDates4.formatRecent(startDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : Integer.valueOf(C11595R.string.order_create_recurring_start_date_prefix), (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false));
    }

    public final CharSequence getSourceOfFundsText(Resources resources) {
        CharSequence charSequenceLabel;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null || (charSequenceLabel = StringsKt.label(recurringOrderConfiguration.getSourceOfFunds(), this.achRelationship, this.directDepositRelationship, this.investmentTarget.isCrypto(), resources)) == null) {
            return null;
        }
        return resources.getString(C11595R.string.order_create_recurring_source_of_funds, charSequenceLabel);
    }

    public final CharSequence getReviewText(Resources resources) {
        LocalDate startDate;
        int i;
        int i2;
        int i3;
        int i4;
        String string2;
        int i5;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null || (startDate = recurringOrderConfiguration.getStartDate()) == null) {
            return null;
        }
        String symbol = this.investmentTargetData.getSymbol();
        String str = LocalDateFormatter.MEDIUM.format(startDate);
        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        String displayName = dayOfWeek != null ? dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.FORMAT)) : null;
        boolean z = this.isUsRecurringVTExperimentEnabled;
        if (z) {
            i = C11595R.string.f4023xfd3ae2bf;
        } else {
            i = C11595R.string.gated_crypto_rhc_recurring_order_review_txt_daily_crypto_rebrand;
        }
        if (z) {
            i2 = C11595R.string.f4027x778faa79;
        } else {
            i2 = C11595R.string.f4026x39c0ea7b;
        }
        if (z) {
            i3 = C11595R.string.f4022x48cc79c0;
        } else {
            i3 = C11595R.string.f4021xfbf36ad4;
        }
        if (z) {
            i4 = C11595R.string.f4025x7c763cf3;
        } else {
            i4 = C11595R.string.f4024x295333c1;
        }
        ApiInvestmentSchedule.Frequency frequency = this.configuration.getFrequency();
        int i6 = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i6 == -1) {
            string2 = null;
        } else if (i6 == 1) {
            if (isCrypto()) {
                int i7 = WhenMappings.$EnumSwitchMapping$3[this.configuration.getAmountType().ordinal()];
                if (i7 == 1) {
                    i5 = C11595R.string.f4019xdd0b4bf6;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C11595R.string.f4020xe29ed564;
                }
            } else {
                int i8 = WhenMappings.$EnumSwitchMapping$3[this.configuration.getAmountType().ordinal()];
                if (i8 == 1) {
                    i5 = C11595R.string.recurring_equity_order_review_paycheck_with_dollar_amount_txt;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C11595R.string.recurring_equity_order_review_paycheck_with_percentage_txt;
                }
            }
            string2 = resources.getString(i5, this.amount.format(), symbol);
        } else if (i6 == 2) {
            if (!isCrypto()) {
                i = C11595R.string.recurring_order_review_txt_daily;
            }
            string2 = resources.getString(i, this.amount.format(), symbol, str);
        } else if (i6 == 3) {
            if (!isCrypto()) {
                i2 = C11595R.string.recurring_order_review_txt_weekly;
            }
            string2 = resources.getString(i2, this.amount.format(), symbol, displayName, str);
        } else if (i6 == 4) {
            if (!isCrypto()) {
                i3 = C11595R.string.recurring_order_review_txt_biweekly;
            }
            string2 = resources.getString(i3, this.amount.format(), symbol, displayName, str);
        } else {
            if (i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!isCrypto()) {
                i4 = C11595R.string.recurring_order_review_txt_monthly;
            }
            string2 = resources.getString(i4, this.amount.format(), symbol, NumberUtils.getDayOfMonthOrdinalString(startDate), str);
        }
        if (string2 == null) {
            return null;
        }
        if (isCrypto() && CollectionsKt.contains(RecurringOrderViewState2.CURRENCY_PAIR_IDS_WITH_INTEGRATION_FEES_DISCLOSURES, this.investmentTarget.getInstrumentId())) {
            return string2 + PlaceholderUtils.XXShortPlaceholderText + resources.getString(C11595R.string.gated_crypto_rhc_recurring_order_review_integration_fees_suffix);
        }
        if (!isCrypto() || CollectionsKt.contains(RecurringOrderViewState2.CURRENCY_PAIR_IDS_WITH_INTEGRATION_FEES_DISCLOSURES, this.investmentTarget.getInstrumentId())) {
            return string2;
        }
        return string2 + PlaceholderUtils.XXShortPlaceholderText + resources.getString(C11595R.string.gated_crypto_rhc_recurring_order_review_default_suffix);
    }

    public final CharSequence getBackupText(Resources resources) {
        AchRelationship achRelationship;
        String bankAccountNickname;
        Intrinsics.checkNotNullParameter(resources, "resources");
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if ((recurringOrderConfiguration != null && !recurringOrderConfiguration.isBackupAchEnabled()) || (achRelationship = this.backupRelationship) == null || (bankAccountNickname = achRelationship.getBankAccountNickname()) == null) {
            return null;
        }
        return resources.getString(C11595R.string.order_create_recurring_backup, bankAccountNickname);
    }

    /* renamed from: getStreamCryptoDisclosuresRequestDto$feature_lib_recurring_externalDebug */
    public final StreamCryptoDisclosuresRequestDto m1848x15c7b2be() {
        StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto investmentFrequencyDto;
        if (this.configuration == null) {
            return null;
        }
        ByteString byteStringOf$default = ByteString.Companion.of$default(ByteString.INSTANCE, kotlin.text.StringsKt.encodeToByteArray(String.valueOf(this.investmentTarget.getInstrumentId())), 0, 0, 3, null);
        String symbol = this.investmentTargetData.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        CurrencyPairDto currencyPairDto = new CurrencyPairDto(byteStringOf$default, new CurrencyDto(null, symbol, null, null, 13, null), null, null, null, null, null, null, null, null, null, 2044, null);
        ApiInvestmentSchedule.Frequency frequency = this.configuration.getFrequency();
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == 2) {
            investmentFrequencyDto = StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.DAILY;
        } else if (i == 3) {
            investmentFrequencyDto = StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.WEEKLY;
        } else if (i == 4) {
            investmentFrequencyDto = StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.BIWEEKLY;
        } else if (i == 5) {
            investmentFrequencyDto = StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.MONTHLY;
        } else {
            investmentFrequencyDto = StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.INVESTMENT_FREQUENCY_UNSPECIFIED;
        }
        LocalDate startDate = this.configuration.getStartDate();
        if (startDate != null) {
            return new StreamCryptoDisclosuresRequestDto(new StreamCryptoDisclosuresRequestDto.LocationDto.CryptoTrading(new StreamCryptoDisclosuresRequestDto.CryptoTradingDto(currencyPairDto, new StreamCryptoDisclosuresRequestDto.CryptoTradingDto.RecurringInfoDto(investmentFrequencyDto, new DateDto(startDate.getYear(), startDate.getMonthValue(), startDate.getDayOfMonth()), IdlDecimal2.toIdlDecimal(this.amount.getDollarAmount().getDecimalValue())), null, false, 12, null)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
