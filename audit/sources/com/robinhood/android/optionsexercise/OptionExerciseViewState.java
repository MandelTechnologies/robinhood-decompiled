package com.robinhood.android.optionsexercise;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.equities.subzero.ShortingInfo2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExerciseViewState.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0093\u0001BÁ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&j\u0004\u0018\u0001`)\u0012 \b\u0002\u0010*\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&j\u0002`)\u0018\u00010\u0019\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010.\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u0010\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\u0010\u0010c\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\u0010\u0010d\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\b\u0010e\u001a\u0004\u0018\u00010`J\u0010\u0010f\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\b\u0010g\u001a\u0004\u0018\u00010`J\u0010\u0010h\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\u0010\u0010i\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\u0010\u0010j\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bJ\u0010\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020bJ\u000e\u0010r\u001a\u00020\t2\u0006\u0010s\u001a\u00020\tJ\b\u0010t\u001a\u00020\tH\u0002J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010y\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0012\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u001eHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\"HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\u001e\u0010\u0087\u0001\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&j\u0004\u0018\u0001`)HÆ\u0003J\"\u0010\u0088\u0001\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&j\u0002`)\u0018\u00010\u0019HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\tHÆ\u0003JÌ\u0002\u0010\u008c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&j\u0004\u0018\u0001`)2 \b\u0002\u0010*\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&j\u0002`)\u0018\u00010\u00192\b\b\u0002\u0010+\u001a\u00020\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\tHÆ\u0001¢\u0006\u0003\u0010\u008d\u0001J\u0015\u0010\u008e\u0001\u001a\u00020\t2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0090\u0001\u001a\u00030\u0091\u0001HÖ\u0001J\n\u0010\u0092\u0001\u001a\u00020`HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR%\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&j\u0004\u0018\u0001`)¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR)\u0010*\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&j\u0002`)\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bX\u0010IR\u0011\u0010+\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010KR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010.\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010KR\u0013\u0010[\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u000e\u0010^\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010n\u001a\u0004\u0018\u00010o8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseViewState;", "", "account", "Lcom/robinhood/models/db/Account;", "allAccounts", "", "currentMarketHours", "Lcom/robinhood/models/db/MarketHours;", "cashSweepEnrolled", "", "dayTradeCheck", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "equityInstrument", "Lcom/robinhood/models/db/Instrument;", "equityPortfolio", "Lcom/robinhood/models/db/Portfolio;", "equityPosition", "Lcom/robinhood/models/db/Position;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "exerciseChecks", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "notSupportedOptionInstrument", "Lcom/robinhood/udf/UiEvent;", "overrideDayTradeChecks", "quantity", "Ljava/math/BigDecimal;", "reason", "Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "refId", "Ljava/util/UUID;", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "validationContext", "Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationContext;", "validationContextEvent", "isShortSellingExerciseEnabled", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/models/db/MarketHours;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/api/ApiOptionExerciseChecks;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/udf/UiEvent;ZLjava/math/BigDecimal;Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;Ljava/util/UUID;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/shared/equities/subzero/ShortingInfo;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAllAccounts", "()Ljava/util/List;", "getCurrentMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getCashSweepEnrolled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDayTradeCheck", "()Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "getEquityInstrument", "()Lcom/robinhood/models/db/Instrument;", "getEquityPortfolio", "()Lcom/robinhood/models/db/Portfolio;", "getEquityPosition", "()Lcom/robinhood/models/db/Position;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getExerciseChecks", "()Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getNotSupportedOptionInstrument", "()Lcom/robinhood/udf/UiEvent;", "getOverrideDayTradeChecks", "()Z", "getQuantity", "()Ljava/math/BigDecimal;", "getReason", "()Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "getRefId", "()Ljava/util/UUID;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getUiOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getValidationContext", "()Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "getValidationContextEvent", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "exerciseContext", "getExerciseContext", "()Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "shareQuantity", "getTitleString", "", "res", "Landroid/content/res/Resources;", "getDescriptionString", "getMultiplierTxt", "getStrikePriceTxt", "getTotalLabelString", "getTotalPriceString", "getExerciseReviewString", "getQuantityHint", "getShortPositionText", "getBorrowFeeState", "Lcom/robinhood/android/optionsexercise/OptionExerciseBorrowFeeState;", "resources", "shortDetailBottomSheetState", "Lcom/robinhood/android/optionsexercise/OptionExerciseViewState$ShortDetailBottomSheetState;", "getShortDetailBottomSheetState", "()Lcom/robinhood/android/optionsexercise/OptionExerciseViewState$ShortDetailBottomSheetState;", "showAccountInfoRow", "reviewing", "willExecuteImmediately", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/models/db/MarketHours;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/api/ApiOptionExerciseChecks;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/udf/UiEvent;ZLjava/math/BigDecimal;Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;Ljava/util/UUID;Lcom/robinhood/android/lib/trade/DefaultOrderState;Lcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/shared/equities/subzero/ShortingInfo;Z)Lcom/robinhood/android/optionsexercise/OptionExerciseViewState;", "equals", "other", "hashCode", "", "toString", "ShortDetailBottomSheetState", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionExerciseViewState {
    public static final int $stable = 8;
    private final Account account;
    private final List<Account> allAccounts;
    private final Boolean cashSweepEnrolled;
    private final MarketHours currentMarketHours;
    private final TraderDayTradeStore.DayTradeCheckState dayTradeCheck;
    private final Instrument equityInstrument;
    private final Portfolio equityPortfolio;
    private final Position equityPosition;
    private final Quote equityQuote;
    private final ApiOptionExerciseChecks exerciseChecks;
    private final OptionExerciseContext exerciseContext;
    private final DefaultOrderState formState;
    private final InstrumentBuyingPower instrumentBuyingPower;
    private final boolean isMcwEnabled;
    private final boolean isShortSellingExerciseEnabled;
    private final UiEvent<Boolean> notSupportedOptionInstrument;
    private final boolean overrideDayTradeChecks;
    private final BigDecimal quantity;
    private final ApiOptionExerciseRequest.Reason reason;
    private final UUID refId;
    private final BigDecimal shareQuantity;
    private final ShortingInfo shortingInfo;
    private final UiOptionInstrument uiOptionInstrument;
    private final Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> validationContext;
    private final UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> validationContextEvent;

    /* compiled from: OptionExerciseViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionExerciseViewState copy$default(OptionExerciseViewState optionExerciseViewState, Account account, List list, MarketHours marketHours, Boolean bool, TraderDayTradeStore.DayTradeCheckState dayTradeCheckState, Instrument instrument, Portfolio portfolio, Position position, Quote quote, ApiOptionExerciseChecks apiOptionExerciseChecks, InstrumentBuyingPower instrumentBuyingPower, UiEvent uiEvent, boolean z, BigDecimal bigDecimal, ApiOptionExerciseRequest.Reason reason, UUID uuid, DefaultOrderState defaultOrderState, UiOptionInstrument uiOptionInstrument, Validator.ValidationContext validationContext, UiEvent uiEvent2, boolean z2, ShortingInfo shortingInfo, boolean z3, int i, Object obj) {
        boolean z4;
        ShortingInfo shortingInfo2;
        Account account2 = (i & 1) != 0 ? optionExerciseViewState.account : account;
        List list2 = (i & 2) != 0 ? optionExerciseViewState.allAccounts : list;
        MarketHours marketHours2 = (i & 4) != 0 ? optionExerciseViewState.currentMarketHours : marketHours;
        Boolean bool2 = (i & 8) != 0 ? optionExerciseViewState.cashSweepEnrolled : bool;
        TraderDayTradeStore.DayTradeCheckState dayTradeCheckState2 = (i & 16) != 0 ? optionExerciseViewState.dayTradeCheck : dayTradeCheckState;
        Instrument instrument2 = (i & 32) != 0 ? optionExerciseViewState.equityInstrument : instrument;
        Portfolio portfolio2 = (i & 64) != 0 ? optionExerciseViewState.equityPortfolio : portfolio;
        Position position2 = (i & 128) != 0 ? optionExerciseViewState.equityPosition : position;
        Quote quote2 = (i & 256) != 0 ? optionExerciseViewState.equityQuote : quote;
        ApiOptionExerciseChecks apiOptionExerciseChecks2 = (i & 512) != 0 ? optionExerciseViewState.exerciseChecks : apiOptionExerciseChecks;
        InstrumentBuyingPower instrumentBuyingPower2 = (i & 1024) != 0 ? optionExerciseViewState.instrumentBuyingPower : instrumentBuyingPower;
        UiEvent uiEvent3 = (i & 2048) != 0 ? optionExerciseViewState.notSupportedOptionInstrument : uiEvent;
        boolean z5 = (i & 4096) != 0 ? optionExerciseViewState.overrideDayTradeChecks : z;
        BigDecimal bigDecimal2 = (i & 8192) != 0 ? optionExerciseViewState.quantity : bigDecimal;
        Account account3 = account2;
        ApiOptionExerciseRequest.Reason reason2 = (i & 16384) != 0 ? optionExerciseViewState.reason : reason;
        UUID uuid2 = (i & 32768) != 0 ? optionExerciseViewState.refId : uuid;
        DefaultOrderState defaultOrderState2 = (i & 65536) != 0 ? optionExerciseViewState.formState : defaultOrderState;
        UiOptionInstrument uiOptionInstrument2 = (i & 131072) != 0 ? optionExerciseViewState.uiOptionInstrument : uiOptionInstrument;
        Validator.ValidationContext validationContext2 = (i & 262144) != 0 ? optionExerciseViewState.validationContext : validationContext;
        UiEvent uiEvent4 = (i & 524288) != 0 ? optionExerciseViewState.validationContextEvent : uiEvent2;
        boolean z6 = (i & 1048576) != 0 ? optionExerciseViewState.isShortSellingExerciseEnabled : z2;
        ShortingInfo shortingInfo3 = (i & 2097152) != 0 ? optionExerciseViewState.shortingInfo : shortingInfo;
        if ((i & 4194304) != 0) {
            shortingInfo2 = shortingInfo3;
            z4 = optionExerciseViewState.isMcwEnabled;
        } else {
            z4 = z3;
            shortingInfo2 = shortingInfo3;
        }
        return optionExerciseViewState.copy(account3, list2, marketHours2, bool2, dayTradeCheckState2, instrument2, portfolio2, position2, quote2, apiOptionExerciseChecks2, instrumentBuyingPower2, uiEvent3, z5, bigDecimal2, reason2, uuid2, defaultOrderState2, uiOptionInstrument2, validationContext2, uiEvent4, z6, shortingInfo2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final ApiOptionExerciseChecks getExerciseChecks() {
        return this.exerciseChecks;
    }

    /* renamed from: component11, reason: from getter */
    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final UiEvent<Boolean> component12() {
        return this.notSupportedOptionInstrument;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getOverrideDayTradeChecks() {
        return this.overrideDayTradeChecks;
    }

    /* renamed from: component14, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component15, reason: from getter */
    public final ApiOptionExerciseRequest.Reason getReason() {
        return this.reason;
    }

    /* renamed from: component16, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component17, reason: from getter */
    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    /* renamed from: component18, reason: from getter */
    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    public final Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> component19() {
        return this.validationContext;
    }

    public final List<Account> component2() {
        return this.allAccounts;
    }

    public final UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> component20() {
        return this.validationContextEvent;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    /* renamed from: component22, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsMcwEnabled() {
        return this.isMcwEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final MarketHours getCurrentMarketHours() {
        return this.currentMarketHours;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getCashSweepEnrolled() {
        return this.cashSweepEnrolled;
    }

    /* renamed from: component5, reason: from getter */
    public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
        return this.dayTradeCheck;
    }

    /* renamed from: component6, reason: from getter */
    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    /* renamed from: component7, reason: from getter */
    public final Portfolio getEquityPortfolio() {
        return this.equityPortfolio;
    }

    /* renamed from: component8, reason: from getter */
    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    /* renamed from: component9, reason: from getter */
    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final OptionExerciseViewState copy(Account account, List<Account> allAccounts, MarketHours currentMarketHours, Boolean cashSweepEnrolled, TraderDayTradeStore.DayTradeCheckState dayTradeCheck, Instrument equityInstrument, Portfolio equityPortfolio, Position equityPosition, Quote equityQuote, ApiOptionExerciseChecks exerciseChecks, InstrumentBuyingPower instrumentBuyingPower, UiEvent<Boolean> notSupportedOptionInstrument, boolean overrideDayTradeChecks, BigDecimal quantity, ApiOptionExerciseRequest.Reason reason, UUID refId, DefaultOrderState formState, UiOptionInstrument uiOptionInstrument, Validator.ValidationContext<? super OptionExerciseContext, ? super OptionExerciseValidationFailureResolver> validationContext, UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> validationContextEvent, boolean isShortSellingExerciseEnabled, ShortingInfo shortingInfo, boolean isMcwEnabled) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(formState, "formState");
        return new OptionExerciseViewState(account, allAccounts, currentMarketHours, cashSweepEnrolled, dayTradeCheck, equityInstrument, equityPortfolio, equityPosition, equityQuote, exerciseChecks, instrumentBuyingPower, notSupportedOptionInstrument, overrideDayTradeChecks, quantity, reason, refId, formState, uiOptionInstrument, validationContext, validationContextEvent, isShortSellingExerciseEnabled, shortingInfo, isMcwEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExerciseViewState)) {
            return false;
        }
        OptionExerciseViewState optionExerciseViewState = (OptionExerciseViewState) other;
        return Intrinsics.areEqual(this.account, optionExerciseViewState.account) && Intrinsics.areEqual(this.allAccounts, optionExerciseViewState.allAccounts) && Intrinsics.areEqual(this.currentMarketHours, optionExerciseViewState.currentMarketHours) && Intrinsics.areEqual(this.cashSweepEnrolled, optionExerciseViewState.cashSweepEnrolled) && Intrinsics.areEqual(this.dayTradeCheck, optionExerciseViewState.dayTradeCheck) && Intrinsics.areEqual(this.equityInstrument, optionExerciseViewState.equityInstrument) && Intrinsics.areEqual(this.equityPortfolio, optionExerciseViewState.equityPortfolio) && Intrinsics.areEqual(this.equityPosition, optionExerciseViewState.equityPosition) && Intrinsics.areEqual(this.equityQuote, optionExerciseViewState.equityQuote) && Intrinsics.areEqual(this.exerciseChecks, optionExerciseViewState.exerciseChecks) && Intrinsics.areEqual(this.instrumentBuyingPower, optionExerciseViewState.instrumentBuyingPower) && Intrinsics.areEqual(this.notSupportedOptionInstrument, optionExerciseViewState.notSupportedOptionInstrument) && this.overrideDayTradeChecks == optionExerciseViewState.overrideDayTradeChecks && Intrinsics.areEqual(this.quantity, optionExerciseViewState.quantity) && this.reason == optionExerciseViewState.reason && Intrinsics.areEqual(this.refId, optionExerciseViewState.refId) && this.formState == optionExerciseViewState.formState && Intrinsics.areEqual(this.uiOptionInstrument, optionExerciseViewState.uiOptionInstrument) && Intrinsics.areEqual(this.validationContext, optionExerciseViewState.validationContext) && Intrinsics.areEqual(this.validationContextEvent, optionExerciseViewState.validationContextEvent) && this.isShortSellingExerciseEnabled == optionExerciseViewState.isShortSellingExerciseEnabled && Intrinsics.areEqual(this.shortingInfo, optionExerciseViewState.shortingInfo) && this.isMcwEnabled == optionExerciseViewState.isMcwEnabled;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.allAccounts.hashCode()) * 31;
        MarketHours marketHours = this.currentMarketHours;
        int iHashCode2 = (iHashCode + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        Boolean bool = this.cashSweepEnrolled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        TraderDayTradeStore.DayTradeCheckState dayTradeCheckState = this.dayTradeCheck;
        int iHashCode4 = (iHashCode3 + (dayTradeCheckState == null ? 0 : dayTradeCheckState.hashCode())) * 31;
        Instrument instrument = this.equityInstrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Portfolio portfolio = this.equityPortfolio;
        int iHashCode6 = (iHashCode5 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
        Position position = this.equityPosition;
        int iHashCode7 = (iHashCode6 + (position == null ? 0 : position.hashCode())) * 31;
        Quote quote = this.equityQuote;
        int iHashCode8 = (iHashCode7 + (quote == null ? 0 : quote.hashCode())) * 31;
        ApiOptionExerciseChecks apiOptionExerciseChecks = this.exerciseChecks;
        int iHashCode9 = (iHashCode8 + (apiOptionExerciseChecks == null ? 0 : apiOptionExerciseChecks.hashCode())) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        int iHashCode10 = (iHashCode9 + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31;
        UiEvent<Boolean> uiEvent = this.notSupportedOptionInstrument;
        int iHashCode11 = (((iHashCode10 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.overrideDayTradeChecks)) * 31;
        BigDecimal bigDecimal = this.quantity;
        int iHashCode12 = (((iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.reason.hashCode()) * 31;
        UUID uuid = this.refId;
        int iHashCode13 = (((iHashCode12 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.formState.hashCode()) * 31;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        int iHashCode14 = (iHashCode13 + (uiOptionInstrument == null ? 0 : uiOptionInstrument.hashCode())) * 31;
        Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> validationContext = this.validationContext;
        int iHashCode15 = (iHashCode14 + (validationContext == null ? 0 : validationContext.hashCode())) * 31;
        UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> uiEvent2 = this.validationContextEvent;
        int iHashCode16 = (((iHashCode15 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.isShortSellingExerciseEnabled)) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        return ((iHashCode16 + (shortingInfo != null ? shortingInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMcwEnabled);
    }

    public String toString() {
        return "OptionExerciseViewState(account=" + this.account + ", allAccounts=" + this.allAccounts + ", currentMarketHours=" + this.currentMarketHours + ", cashSweepEnrolled=" + this.cashSweepEnrolled + ", dayTradeCheck=" + this.dayTradeCheck + ", equityInstrument=" + this.equityInstrument + ", equityPortfolio=" + this.equityPortfolio + ", equityPosition=" + this.equityPosition + ", equityQuote=" + this.equityQuote + ", exerciseChecks=" + this.exerciseChecks + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", notSupportedOptionInstrument=" + this.notSupportedOptionInstrument + ", overrideDayTradeChecks=" + this.overrideDayTradeChecks + ", quantity=" + this.quantity + ", reason=" + this.reason + ", refId=" + this.refId + ", formState=" + this.formState + ", uiOptionInstrument=" + this.uiOptionInstrument + ", validationContext=" + this.validationContext + ", validationContextEvent=" + this.validationContextEvent + ", isShortSellingExerciseEnabled=" + this.isShortSellingExerciseEnabled + ", shortingInfo=" + this.shortingInfo + ", isMcwEnabled=" + this.isMcwEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionExerciseViewState(Account account, List<Account> allAccounts, MarketHours marketHours, Boolean bool, TraderDayTradeStore.DayTradeCheckState dayTradeCheckState, Instrument instrument, Portfolio portfolio, Position position, Quote quote, ApiOptionExerciseChecks apiOptionExerciseChecks, InstrumentBuyingPower instrumentBuyingPower, UiEvent<Boolean> uiEvent, boolean z, BigDecimal bigDecimal, ApiOptionExerciseRequest.Reason reason, UUID uuid, DefaultOrderState formState, UiOptionInstrument uiOptionInstrument, Validator.ValidationContext<? super OptionExerciseContext, ? super OptionExerciseValidationFailureResolver> validationContext, UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> uiEvent2, boolean z2, ShortingInfo shortingInfo, boolean z3) {
        OptionExerciseContext optionExerciseContextCreate;
        BigDecimal ZERO;
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(formState, "formState");
        this.account = account;
        this.allAccounts = allAccounts;
        this.currentMarketHours = marketHours;
        this.cashSweepEnrolled = bool;
        this.dayTradeCheck = dayTradeCheckState;
        this.equityInstrument = instrument;
        this.equityPortfolio = portfolio;
        this.equityPosition = position;
        this.equityQuote = quote;
        this.exerciseChecks = apiOptionExerciseChecks;
        this.instrumentBuyingPower = instrumentBuyingPower;
        this.notSupportedOptionInstrument = uiEvent;
        this.overrideDayTradeChecks = z;
        this.quantity = bigDecimal;
        this.reason = reason;
        this.refId = uuid;
        this.formState = formState;
        this.uiOptionInstrument = uiOptionInstrument;
        this.validationContext = validationContext;
        this.validationContextEvent = uiEvent2;
        this.isShortSellingExerciseEnabled = z2;
        this.shortingInfo = shortingInfo;
        this.isMcwEnabled = z3;
        if (account == null || allAccounts.isEmpty() || marketHours == null || dayTradeCheckState == null || instrument == null || portfolio == null || uiOptionInstrument == null || instrumentBuyingPower == null || bigDecimal == null || uuid == null) {
            optionExerciseContextCreate = null;
        } else {
            optionExerciseContextCreate = OptionExerciseContext.INSTANCE.create(account, bool, dayTradeCheckState, instrument, portfolio, position, apiOptionExerciseChecks, allAccounts.size() > 1, instrumentBuyingPower, marketHours, uiOptionInstrument, z, bigDecimal, reason, uuid, z2, z3);
        }
        this.exerciseContext = optionExerciseContextCreate;
        if (position == null || (ZERO = position.getClosableQuantity()) == null) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        this.shareQuantity = ZERO;
    }

    public final Account getAccount() {
        return this.account;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionExerciseViewState(com.robinhood.models.p320db.Account r28, java.util.List r29, com.robinhood.models.p320db.MarketHours r30, java.lang.Boolean r31, com.robinhood.librobinhood.data.store.TraderDayTradeStore.DayTradeCheckState r32, com.robinhood.models.p320db.Instrument r33, com.robinhood.models.p320db.Portfolio r34, com.robinhood.models.p320db.Position r35, com.robinhood.models.p320db.Quote r36, com.robinhood.models.api.ApiOptionExerciseChecks r37, com.robinhood.models.p320db.InstrumentBuyingPower r38, com.robinhood.udf.UiEvent r39, boolean r40, java.math.BigDecimal r41, com.robinhood.models.api.ApiOptionExerciseRequest.Reason r42, java.util.UUID r43, com.robinhood.android.lib.trade.DefaultOrderState r44, com.robinhood.models.p355ui.UiOptionInstrument r45, com.robinhood.android.lib.trade.validation.Validator.ValidationContext r46, com.robinhood.udf.UiEvent r47, boolean r48, com.robinhood.shared.equities.subzero.ShortingInfo r49, boolean r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionsexercise.OptionExerciseViewState.<init>(com.robinhood.models.db.Account, java.util.List, com.robinhood.models.db.MarketHours, java.lang.Boolean, com.robinhood.librobinhood.data.store.TraderDayTradeStore$DayTradeCheckState, com.robinhood.models.db.Instrument, com.robinhood.models.db.Portfolio, com.robinhood.models.db.Position, com.robinhood.models.db.Quote, com.robinhood.models.api.ApiOptionExerciseChecks, com.robinhood.models.db.InstrumentBuyingPower, com.robinhood.udf.UiEvent, boolean, java.math.BigDecimal, com.robinhood.models.api.ApiOptionExerciseRequest$Reason, java.util.UUID, com.robinhood.android.lib.trade.DefaultOrderState, com.robinhood.models.ui.UiOptionInstrument, com.robinhood.android.lib.trade.validation.Validator$ValidationContext, com.robinhood.udf.UiEvent, boolean, com.robinhood.shared.equities.subzero.ShortingInfo, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final MarketHours getCurrentMarketHours() {
        return this.currentMarketHours;
    }

    public final Boolean getCashSweepEnrolled() {
        return this.cashSweepEnrolled;
    }

    public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
        return this.dayTradeCheck;
    }

    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    public final Portfolio getEquityPortfolio() {
        return this.equityPortfolio;
    }

    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final ApiOptionExerciseChecks getExerciseChecks() {
        return this.exerciseChecks;
    }

    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final UiEvent<Boolean> getNotSupportedOptionInstrument() {
        return this.notSupportedOptionInstrument;
    }

    public final boolean getOverrideDayTradeChecks() {
        return this.overrideDayTradeChecks;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final ApiOptionExerciseRequest.Reason getReason() {
        return this.reason;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    public final Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> getValidationContext() {
        return this.validationContext;
    }

    public final UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> getValidationContextEvent() {
        return this.validationContextEvent;
    }

    public final boolean isShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    public final boolean isMcwEnabled() {
        return this.isMcwEnabled;
    }

    public final OptionExerciseContext getExerciseContext() {
        return this.exerciseContext;
    }

    public final String getTitleString(Resources res) throws Resources.NotFoundException {
        OptionInstrument optionInstrument;
        String string2;
        Intrinsics.checkNotNullParameter(res, "res");
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        if (uiOptionInstrument == null || (optionInstrument = uiOptionInstrument.getOptionInstrument()) == null) {
            return null;
        }
        String chainSymbol = optionInstrument.getChainSymbol();
        Money money = Money3.toMoney(optionInstrument.getStrikePrice(), Currencies.USD);
        int i = WhenMappings.$EnumSwitchMapping$0[optionInstrument.getContractType().ordinal()];
        if (i == 1) {
            string2 = res.getString(C11048R.string.option_contract_type_call);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = res.getString(C11048R.string.option_contract_type_put);
        }
        Intrinsics.checkNotNull(string2);
        return res.getString(C24704R.string.option_exercise_title_label, chainSymbol, Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null), string2, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
    }

    public final String getDescriptionString(Resources res) throws Resources.NotFoundException {
        UiOptionInstrument uiOptionInstrument;
        Money lastTradePrice;
        String str;
        InstrumentBuyingPower instrumentBuyingPower;
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Position position = this.equityPosition;
        if (position == null || (uiOptionInstrument = this.uiOptionInstrument) == null) {
            return null;
        }
        String chainSymbol = uiOptionInstrument.getOptionInstrument().getChainSymbol();
        OptionContractType contractType = uiOptionInstrument.getOptionInstrument().getContractType();
        Quote quote = this.equityQuote;
        if (quote == null || (lastTradePrice = quote.getLastTradePrice()) == null || (str = Money.format$default(lastTradePrice, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null || (instrumentBuyingPower = this.instrumentBuyingPower) == null) {
            return null;
        }
        if (Position5.isShortPosition(position)) {
            if (BigDecimals7.isZero(position.getPendingQuantityForClosingShortPosition())) {
                return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C24704R.plurals.option_exercise_description_short_position, position.getQuantity(), Formats.getShareQuantityFormat().format(position.getQuantity()));
            }
            String string2 = res.getString(C24704R.string.option_exercise_description_short_position_with_pending, Formats.getShareQuantityFormat().format(position.getQuantity()), Formats.getShareQuantityFormat().format(position.getPendingQuantityForClosingShortPosition()));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return res.getString(C24704R.string.option_exercise_description_put, chainSymbol, str, Formats.getShareQuantityFormat().format(this.shareQuantity));
        }
        BigDecimal decimalValue = instrumentBuyingPower.getBuyingPowerAmount().getDecimalValue();
        if (BigDecimals7.isNegative(decimalValue)) {
            i = C24704R.string.option_exercise_description_call_negative_buying_power;
        } else {
            i = C24704R.string.option_exercise_description_call;
        }
        return res.getString(i, chainSymbol, str, Money.format$default(Money3.toMoney(decimalValue, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final String getMultiplierTxt(Resources res) {
        OptionChain optionChain;
        BigDecimal tradeValueMultiplier;
        Intrinsics.checkNotNullParameter(res, "res");
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        if (uiOptionInstrument == null || (optionChain = uiOptionInstrument.getOptionChain()) == null || (tradeValueMultiplier = optionChain.getTradeValueMultiplier()) == null) {
            return null;
        }
        return res.getString(C24704R.string.option_exercise_multiplier_label, tradeValueMultiplier.toBigInteger());
    }

    public final String getStrikePriceTxt() {
        OptionInstrument optionInstrument;
        BigDecimal strikePrice;
        Money money;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        if (uiOptionInstrument == null || (optionInstrument = uiOptionInstrument.getOptionInstrument()) == null || (strikePrice = optionInstrument.getStrikePrice()) == null || (money = Money3.toMoney(strikePrice, Currencies.USD)) == null) {
            return null;
        }
        return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getTotalLabelString(Resources res) {
        OptionInstrument optionInstrument;
        Intrinsics.checkNotNullParameter(res, "res");
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        OptionContractType contractType = (uiOptionInstrument == null || (optionInstrument = uiOptionInstrument.getOptionInstrument()) == null) ? null : optionInstrument.getContractType();
        int i = contractType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return res.getString(C20649R.string.order_confirmation_total_cost_label);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return res.getString(C20649R.string.order_confirmation_total_credit_label);
    }

    public final String getTotalPriceString() {
        BigDecimal bigDecimal;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        if (uiOptionInstrument == null || (bigDecimal = this.quantity) == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = uiOptionInstrument.getOptionInstrument().getStrikePrice().multiply(uiOptionInstrument.getOptionChain().getTradeValueMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return Money.format$default(Money3.toMoney(bigDecimalMultiply2, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getExerciseReviewString(Resources res) {
        BigDecimal bigDecimal;
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        if (uiOptionInstrument == null || (bigDecimal = this.quantity) == null) {
            return null;
        }
        String chainSymbol = uiOptionInstrument.getOptionInstrument().getChainSymbol();
        String str = Money.format$default(Money3.toMoney(uiOptionInstrument.getOptionInstrument().getStrikePrice(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        BigDecimal tradeValueMultiplier = uiOptionInstrument.getOptionChain().getTradeValueMultiplier();
        OptionContractType contractType = uiOptionInstrument.getOptionInstrument().getContractType();
        boolean zWillExecuteImmediately = willExecuteImmediately();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(tradeValueMultiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        OptionContractType optionContractType = OptionContractType.CALL;
        if (contractType == optionContractType && zWillExecuteImmediately) {
            i = C24704R.plurals.option_exercise_summary_call_market_hours;
        } else if (contractType == optionContractType && !zWillExecuteImmediately) {
            i = C24704R.plurals.option_exercise_summary_call_after_hours;
        } else {
            OptionContractType optionContractType2 = OptionContractType.PUT;
            if (contractType == optionContractType2 && zWillExecuteImmediately) {
                i = C24704R.plurals.option_exercise_summary_put_market_hours;
            } else if (contractType == optionContractType2 && !zWillExecuteImmediately) {
                i = C24704R.plurals.option_exercise_summary_put_after_hours;
            } else {
                throw new AssertionError("this isn't possible so much for smart cast");
            }
        }
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, i, bigDecimal, bigDecimal.toBigInteger(), bigDecimalMultiply.toBigInteger(), chainSymbol, str);
    }

    public final String getQuantityHint(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        ApiOptionExerciseChecks apiOptionExerciseChecks = this.exerciseChecks;
        if (apiOptionExerciseChecks == null) {
            return null;
        }
        return res.getString(C24704R.string.option_exercise_quantity_hint, apiOptionExerciseChecks.getExercisable_quantity().toBigInteger());
    }

    public final String getShortPositionText(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return OptionExerciseShortPositionUtils.getShortPositionText(res, this.isShortSellingExerciseEnabled, this.uiOptionInstrument, this.quantity, this.exerciseChecks, this.equityPosition);
    }

    public final OptionExerciseBorrowFeeState getBorrowFeeState(Resources resources) throws Resources.NotFoundException {
        BigDecimal bigDecimal;
        OptionUnderlying optionUnderlying;
        Integer quantity;
        OptionInstrument optionInstrument;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.isShortSellingExerciseEnabled) {
            UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
            if (((uiOptionInstrument == null || (optionInstrument = uiOptionInstrument.getOptionInstrument()) == null) ? null : optionInstrument.getContractType()) == OptionContractType.PUT && (bigDecimal = this.quantity) != null && OptionExerciseShortPositionUtils.getShortPositionShares(this.uiOptionInstrument, this.exerciseChecks, bigDecimal, this.equityPosition) != null && (optionUnderlying = (OptionUnderlying) CollectionsKt.singleOrNull((List) this.uiOptionInstrument.getUnderlyings())) != null && (quantity = optionUnderlying.getQuantity()) != null) {
                int iIntValue = quantity.intValue();
                ShortingInfo shortingInfo = this.shortingInfo;
                if (shortingInfo == null || this.equityQuote == null) {
                    String string2 = resources.getString(C24704R.string.option_exercise_borrow_fee_subtitle_default);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = resources.getString(C24704R.string.option_exercise_borrow_fee_subtitle_default_link_text);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return new OptionExerciseBorrowFeeState(string2, string3);
                }
                BigDecimal dailyFee = shortingInfo.getDailyFee();
                if (dailyFee == null || BigDecimals7.isZero(dailyFee)) {
                    return null;
                }
                ShortingInfo shortingInfo2 = this.shortingInfo;
                BigDecimal bigDecimal2 = this.quantity;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iIntValue);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimalValueOf);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                String string4 = resources.getString(C24704R.string.option_exercise_borrow_fee_subtitle, Formats.getAmountFormat().format(ShortingInfo2.calculateTradeFlowDailyFee(shortingInfo2, bigDecimalMultiply, Money3.getBigDecimalCompat(this.equityQuote.getLastTradePrice()))));
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = resources.getString(C24704R.string.option_exercise_borrow_fee_subtitle_link_text);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return new OptionExerciseBorrowFeeState(string4, string5);
            }
        }
        return null;
    }

    public final ShortDetailBottomSheetState getShortDetailBottomSheetState() {
        BigDecimal sharesNeededForExercise;
        BigDecimal shortPositionShares;
        Position position;
        BigDecimal sharesAvailableForExercise;
        if (!this.isShortSellingExerciseEnabled || (sharesNeededForExercise = OptionExerciseShortPositionUtils.getSharesNeededForExercise(this.uiOptionInstrument, this.quantity)) == null || (shortPositionShares = OptionExerciseShortPositionUtils.getShortPositionShares(this.uiOptionInstrument, this.exerciseChecks, this.quantity, this.equityPosition)) == null || (position = this.equityPosition) == null || (sharesAvailableForExercise = position.getSharesAvailableForExercise()) == null) {
            return null;
        }
        return new ShortDetailBottomSheetState(Formats.getShareQuantityFormat().format(sharesNeededForExercise), Formats.getShareQuantityFormat().format(sharesAvailableForExercise), Formats.getShareQuantityFormat().format(shortPositionShares));
    }

    /* compiled from: OptionExerciseViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseViewState$ShortDetailBottomSheetState;", "", "sharesToExercise", "", "sharesYouCanSell", "shortPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSharesToExercise", "()Ljava/lang/String;", "getSharesYouCanSell", "getShortPosition", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShortDetailBottomSheetState {
        public static final int $stable = 0;
        private final String sharesToExercise;
        private final String sharesYouCanSell;
        private final String shortPosition;

        public static /* synthetic */ ShortDetailBottomSheetState copy$default(ShortDetailBottomSheetState shortDetailBottomSheetState, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shortDetailBottomSheetState.sharesToExercise;
            }
            if ((i & 2) != 0) {
                str2 = shortDetailBottomSheetState.sharesYouCanSell;
            }
            if ((i & 4) != 0) {
                str3 = shortDetailBottomSheetState.shortPosition;
            }
            return shortDetailBottomSheetState.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSharesToExercise() {
            return this.sharesToExercise;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSharesYouCanSell() {
            return this.sharesYouCanSell;
        }

        /* renamed from: component3, reason: from getter */
        public final String getShortPosition() {
            return this.shortPosition;
        }

        public final ShortDetailBottomSheetState copy(String sharesToExercise, String sharesYouCanSell, String shortPosition) {
            Intrinsics.checkNotNullParameter(sharesToExercise, "sharesToExercise");
            Intrinsics.checkNotNullParameter(sharesYouCanSell, "sharesYouCanSell");
            Intrinsics.checkNotNullParameter(shortPosition, "shortPosition");
            return new ShortDetailBottomSheetState(sharesToExercise, sharesYouCanSell, shortPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShortDetailBottomSheetState)) {
                return false;
            }
            ShortDetailBottomSheetState shortDetailBottomSheetState = (ShortDetailBottomSheetState) other;
            return Intrinsics.areEqual(this.sharesToExercise, shortDetailBottomSheetState.sharesToExercise) && Intrinsics.areEqual(this.sharesYouCanSell, shortDetailBottomSheetState.sharesYouCanSell) && Intrinsics.areEqual(this.shortPosition, shortDetailBottomSheetState.shortPosition);
        }

        public int hashCode() {
            return (((this.sharesToExercise.hashCode() * 31) + this.sharesYouCanSell.hashCode()) * 31) + this.shortPosition.hashCode();
        }

        public String toString() {
            return "ShortDetailBottomSheetState(sharesToExercise=" + this.sharesToExercise + ", sharesYouCanSell=" + this.sharesYouCanSell + ", shortPosition=" + this.shortPosition + ")";
        }

        public ShortDetailBottomSheetState(String sharesToExercise, String sharesYouCanSell, String shortPosition) {
            Intrinsics.checkNotNullParameter(sharesToExercise, "sharesToExercise");
            Intrinsics.checkNotNullParameter(sharesYouCanSell, "sharesYouCanSell");
            Intrinsics.checkNotNullParameter(shortPosition, "shortPosition");
            this.sharesToExercise = sharesToExercise;
            this.sharesYouCanSell = sharesYouCanSell;
            this.shortPosition = shortPosition;
        }

        public final String getSharesToExercise() {
            return this.sharesToExercise;
        }

        public final String getSharesYouCanSell() {
            return this.sharesYouCanSell;
        }

        public final String getShortPosition() {
            return this.shortPosition;
        }
    }

    public final boolean showAccountInfoRow(boolean reviewing) {
        return reviewing && this.allAccounts.size() > 1;
    }

    private final boolean willExecuteImmediately() {
        MarketHours marketHours = this.currentMarketHours;
        if (marketHours != null) {
            return MarketHours.wouldOrderBeEffectiveToday$default(marketHours, false, false, null, 4, null);
        }
        return false;
    }
}
