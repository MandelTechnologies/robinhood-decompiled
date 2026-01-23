package com.robinhood.android.graph;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.utils.Preconditions;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IntervalSelectorLayout.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u0000 x2\u00020\u0001:\u0002wxB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010S\u001a\u00020@2\u0018\u0010T\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020@0UH\u0082\bJ\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010W\u001a\u00020;H\u0002J\u0010\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020@2\b\b\u0001\u0010\\\u001a\u00020?J\b\u0010]\u001a\u00020@H\u0002J\b\u0010^\u001a\u00020@H\u0002J\b\u0010_\u001a\u00020@H\u0002J\b\u0010`\u001a\u00020@H\u0002J\b\u0010a\u001a\u00020@H\u0002J\b\u0010b\u001a\u00020@H\u0002J\b\u0010c\u001a\u00020@H\u0002J\b\u0010d\u001a\u00020@H\u0002J\u0016\u0010e\u001a\u00020@2\u0006\u0010f\u001a\u00020Z2\u0006\u0010g\u001a\u00020ZJ\u001e\u0010h\u001a\u00020@2\u0006\u0010i\u001a\u00020j2\u000e\b\u0002\u0010k\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010l\u001a\u00020@2\u0006\u0010m\u001a\u00020?J(\u0010n\u001a\u00020@*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010o\u001a\u00020Z2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010p\u001a\u00020ZH\u0016J\u0006\u0010q\u001a\u00020@J\u000e\u0010r\u001a\u00020@2\u0006\u0010W\u001a\u00020;J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010t\u001a\u00020?H\u0002J\u0010\u0010u\u001a\u00020@2\u0006\u0010v\u001a\u00020\nH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R'\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b%\u0010!R'\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b(\u0010!R'\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b+\u0010!R'\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b.\u0010!R'\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b1\u0010!R'\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b4\u0010!R'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b7\u0010!R\u001c\u00109\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010;0;0:X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010A\u001a\u0004\u0018\u00010B@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010A\u001a\u0004\u0018\u00010H@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020;0O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006y"}, m3636d2 = {"Lcom/robinhood/android/graph/IntervalSelectorLayout;", "Landroid/widget/RadioGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "oneHourButtonViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Landroid/widget/RadioButton;", "oneDayButtonViewStubHolder", "twentyFourHourButtonViewStubHolder", "oneWeekButtonViewStubHolder", "oneWeekCryptoButtonViewStubHolder", "oneMonthButtonViewStubHolder", "oneMonthCryptoButtonViewStubHolder", "threeMonthButtonViewStubHolder", "threeMonthCryptoButtonViewStubHolder", "ytdButtonViewStubHolder", "oneYearButtonViewStubHolder", "oneYearCryptoButtonViewStubHolder", "fiveYearButtonViewStubHolder", "fiveYearCryptoButtonViewStubHolder", "maxButtonViewStubHolder", "maxButtonCryptoButtonViewStubHolder", "allButtonViewStubHolder", "allCryptoButtonViewStubHolder", "livePulseDrawable", "Lcom/robinhood/android/graph/LivePulseDrawable;", "portfolioEquityModeBtns", "", "getPortfolioEquityModeBtns", "()[Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "portfolioEquityModeBtns$delegate", "Lkotlin/Lazy;", "portfolioHybridModeBtns", "getPortfolioHybridModeBtns", "portfolioHybridModeBtns$delegate", "portfolioCryptoModeBtns", "getPortfolioCryptoModeBtns", "portfolioCryptoModeBtns$delegate", "cryptoDetailModeBtns", "getCryptoDetailModeBtns", "cryptoDetailModeBtns$delegate", "equityDetailModeBtns", "getEquityDetailModeBtns", "equityDetailModeBtns$delegate", "advancedChartModeBtns", "getAdvancedChartModeBtns", "advancedChartModeBtns$delegate", "optionsModeBtns", "getOptionsModeBtns", "optionsModeBtns$delegate", "optionStrategyModeBtns", "getOptionStrategyModeBtns", "optionStrategyModeBtns$delegate", "selectionChangedSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/models/ui/GraphSelection;", "kotlin.jvm.PlatformType", "checkedChangeListener", "Lkotlin/Function2;", "", "", "value", "Landroid/content/res/ColorStateList;", "livePulseTint", "getLivePulseTint", "()Landroid/content/res/ColorStateList;", "setLivePulseTint", "(Landroid/content/res/ColorStateList;)V", "Lcom/robinhood/android/graph/IntervalSelectorLayout$Mode;", "mode", "getMode", "()Lcom/robinhood/android/graph/IntervalSelectorLayout$Mode;", "setMode", "(Lcom/robinhood/android/graph/IntervalSelectorLayout$Mode;)V", "graphSelectionObservable", "Lio/reactivex/Observable;", "getGraphSelectionObservable", "()Lio/reactivex/Observable;", "defaultCheckedBtn", "onAllButtons", "func", "Lkotlin/Function1;", "getButton", "graphSelection", "setEnabled", "enabled", "", "updateAnimationColor", "colorRes", "configurePortfolioMode", "configurePortfolioHybridMode", "configurePortfolioCryptoMode", "configureEquityDetailMode", "configureAdvancedChartMode", "configureCryptoDetailMode", "configureOptionsMode", "configureOptionStrategyMode", "updateOptionsMode", "enableOneWeek", "enableAll", "updateOptionStrategyMode", "contractAgeInDays", "", "defaultStubHolder", "updateOptionWatchlistMode", "daysSinceAddedToWatchlist", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "enable", "hasOverlappingRendering", "clear", "setGraphSelectionFromAdapterOnly", "findRadioButtonViewStubHolderById", "id", "onViewInflated", "view", "Mode", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class IntervalSelectorLayout extends Hammer_IntervalSelectorLayout {
    public static final long FIVE_YEARS_BTN_THRESHOLD_DAYS = 365;
    public static final long ONE_MONTH_BTN_THRESHOLD_DAYS = 7;
    public static final long ONE_WEEK_BTN_THRESHOLD_DAYS = 0;
    public static final long ONE_YEAR_BTN_THRESHOLD_DAYS = 90;
    public static final long THREE_MONTHS_BTN_THRESHOLD_DAYS = 30;

    /* renamed from: advancedChartModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy advancedChartModeBtns;
    private final ViewStubHolder<RadioButton> allButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> allCryptoButtonViewStubHolder;
    private final Function2<RadioGroup, Integer, Unit> checkedChangeListener;

    /* renamed from: cryptoDetailModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy cryptoDetailModeBtns;
    private ViewStubHolder<RadioButton> defaultCheckedBtn;

    /* renamed from: equityDetailModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy equityDetailModeBtns;
    private final ViewStubHolder<RadioButton> fiveYearButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> fiveYearCryptoButtonViewStubHolder;
    private final LivePulseDrawable livePulseDrawable;
    private ColorStateList livePulseTint;
    private final ViewStubHolder<RadioButton> maxButtonCryptoButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> maxButtonViewStubHolder;
    private Mode mode;
    private final ViewStubHolder<RadioButton> oneDayButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneHourButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneMonthButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneMonthCryptoButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneWeekButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneWeekCryptoButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneYearButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> oneYearCryptoButtonViewStubHolder;

    /* renamed from: optionStrategyModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy optionStrategyModeBtns;

    /* renamed from: optionsModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy optionsModeBtns;

    /* renamed from: portfolioCryptoModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy portfolioCryptoModeBtns;

    /* renamed from: portfolioEquityModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy portfolioEquityModeBtns;

    /* renamed from: portfolioHybridModeBtns$delegate, reason: from kotlin metadata */
    private final Lazy portfolioHybridModeBtns;
    private final BehaviorSubject<GraphSelection> selectionChangedSubject;
    private final ViewStubHolder<RadioButton> threeMonthButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> threeMonthCryptoButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> twentyFourHourButtonViewStubHolder;
    private final ViewStubHolder<RadioButton> ytdButtonViewStubHolder;
    public static final int $stable = 8;

    /* compiled from: IntervalSelectorLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.EQUITY_PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.HYBRID_PORTFOLIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.CRYPTO_PORTFOLIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Mode.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Mode.ADVANCED_CHART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Mode.CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Mode.OPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Mode.OPTION_STRATEGY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GraphSelection.values().length];
            try {
                iArr2[GraphSelection.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GraphSelection.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GraphSelection.ALL_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GraphSelection.MONTH_HOURLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GraphSelection.MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[GraphSelection.MONTH_CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[GraphSelection.THREE_MONTHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[GraphSelection.YEAR_TO_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[GraphSelection.YEAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[GraphSelection.YEAR_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[GraphSelection.FIVE_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntervalSelectorLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Mode mode = null;
        setOrientation(0);
        View.inflate(context, C18339R.layout.merge_interval_selector_layout, this);
        this.oneHourButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1h_btn);
        ViewStubHolder<RadioButton> viewStubHolderFindRadioButtonViewStubHolderById = findRadioButtonViewStubHolderById(C18339R.id.graphview_1d_btn);
        this.oneDayButtonViewStubHolder = viewStubHolderFindRadioButtonViewStubHolderById;
        this.twentyFourHourButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_24h_btn);
        this.oneWeekButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1w_btn);
        this.oneWeekCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1w_crypto_btn);
        this.oneMonthButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1m_btn);
        this.oneMonthCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1m_crypto_btn);
        this.threeMonthButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_3m_btn);
        this.threeMonthCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_3m_crypto_btn);
        this.ytdButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_ytd_btn);
        this.oneYearButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1y_btn);
        this.oneYearCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_1y_crypto_btn);
        this.fiveYearButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_5y_btn);
        this.fiveYearCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_5y_crypto_btn);
        this.maxButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_max_btn);
        this.maxButtonCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_max_crypto_btn);
        this.allButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_all_btn);
        this.allCryptoButtonViewStubHolder = findRadioButtonViewStubHolderById(C18339R.id.graphview_all_crypto_btn);
        this.livePulseDrawable = new LivePulseDrawable(context);
        this.portfolioEquityModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.portfolioEquityModeBtns_delegate$lambda$0(this.f$0);
            }
        });
        this.portfolioHybridModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.portfolioHybridModeBtns_delegate$lambda$1(this.f$0);
            }
        });
        this.portfolioCryptoModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.portfolioCryptoModeBtns_delegate$lambda$2(this.f$0);
            }
        });
        this.cryptoDetailModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.cryptoDetailModeBtns_delegate$lambda$3(this.f$0);
            }
        });
        this.equityDetailModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.equityDetailModeBtns_delegate$lambda$4(this.f$0);
            }
        });
        this.advancedChartModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.advancedChartModeBtns_delegate$lambda$5(this.f$0);
            }
        });
        this.optionsModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.optionsModeBtns_delegate$lambda$6(this.f$0);
            }
        });
        this.optionStrategyModeBtns = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalSelectorLayout.optionStrategyModeBtns_delegate$lambda$7(this.f$0);
            }
        });
        BehaviorSubject<GraphSelection> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.selectionChangedSubject = behaviorSubjectCreate;
        final Function2<RadioGroup, Integer, Unit> function2 = new Function2() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntervalSelectorLayout.checkedChangeListener$lambda$8(this.f$0, (RadioGroup) obj, ((Integer) obj2).intValue());
            }
        };
        this.checkedChangeListener = function2;
        int[] IntervalSelectorLayout = C11048R.styleable.IntervalSelectorLayout;
        Intrinsics.checkNotNullExpressionValue(IntervalSelectorLayout, "IntervalSelectorLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, IntervalSelectorLayout, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(C11048R.styleable.IntervalSelectorLayout_defaultMode, -1);
        if (i == 0) {
            mode = Mode.EQUITY_PORTFOLIO;
        } else if (i == 1) {
            mode = Mode.EQUITY;
        } else if (i == 2) {
            mode = Mode.CRYPTO;
        } else if (i == 3) {
            mode = Mode.OPTION;
        }
        setMode(mode);
        setLivePulseTint(typedArrayObtainStyledAttributes.getColorStateList(C11048R.styleable.IntervalSelectorLayout_livePulseTint));
        typedArrayObtainStyledAttributes.recycle();
        setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(function2) { // from class: com.robinhood.android.graph.IntervalSelectorLayout$sam$android_widget_RadioGroup_OnCheckedChangeListener$0
            private final /* synthetic */ Function2 function;

            {
                Intrinsics.checkNotNullParameter(function2, "function");
                this.function = function2;
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final /* synthetic */ void onCheckedChanged(RadioGroup radioGroup, int i2) {
                this.function.invoke(radioGroup, Integer.valueOf(i2));
            }
        });
        this.defaultCheckedBtn = viewStubHolderFindRadioButtonViewStubHolderById;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntervalSelectorLayout.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/graph/IntervalSelectorLayout$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_PORTFOLIO", "EQUITY_PORTFOLIO", "HYBRID_PORTFOLIO", "CRYPTO", "EQUITY", "ADVANCED_CHART", "OPTION", "OPTION_STRATEGY", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode CRYPTO_PORTFOLIO = new Mode("CRYPTO_PORTFOLIO", 0);
        public static final Mode EQUITY_PORTFOLIO = new Mode("EQUITY_PORTFOLIO", 1);
        public static final Mode HYBRID_PORTFOLIO = new Mode("HYBRID_PORTFOLIO", 2);
        public static final Mode CRYPTO = new Mode("CRYPTO", 3);
        public static final Mode EQUITY = new Mode("EQUITY", 4);
        public static final Mode ADVANCED_CHART = new Mode("ADVANCED_CHART", 5);
        public static final Mode OPTION = new Mode("OPTION", 6);
        public static final Mode OPTION_STRATEGY = new Mode("OPTION_STRATEGY", 7);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{CRYPTO_PORTFOLIO, EQUITY_PORTFOLIO, HYBRID_PORTFOLIO, CRYPTO, EQUITY, ADVANCED_CHART, OPTION, OPTION_STRATEGY};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    private final ViewStubHolder<RadioButton>[] getPortfolioEquityModeBtns() {
        return (ViewStubHolder[]) this.portfolioEquityModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] portfolioEquityModeBtns_delegate$lambda$0(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneDayButtonViewStubHolder, intervalSelectorLayout.oneWeekButtonViewStubHolder, intervalSelectorLayout.oneMonthButtonViewStubHolder, intervalSelectorLayout.threeMonthButtonViewStubHolder, intervalSelectorLayout.oneYearButtonViewStubHolder, intervalSelectorLayout.allButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getPortfolioHybridModeBtns() {
        return (ViewStubHolder[]) this.portfolioHybridModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] portfolioHybridModeBtns_delegate$lambda$1(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneHourButtonViewStubHolder, intervalSelectorLayout.twentyFourHourButtonViewStubHolder, intervalSelectorLayout.oneWeekCryptoButtonViewStubHolder, intervalSelectorLayout.oneMonthCryptoButtonViewStubHolder, intervalSelectorLayout.threeMonthCryptoButtonViewStubHolder, intervalSelectorLayout.oneYearCryptoButtonViewStubHolder, intervalSelectorLayout.allCryptoButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getPortfolioCryptoModeBtns() {
        return (ViewStubHolder[]) this.portfolioCryptoModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] portfolioCryptoModeBtns_delegate$lambda$2(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneHourButtonViewStubHolder, intervalSelectorLayout.twentyFourHourButtonViewStubHolder, intervalSelectorLayout.oneWeekCryptoButtonViewStubHolder, intervalSelectorLayout.oneMonthCryptoButtonViewStubHolder, intervalSelectorLayout.threeMonthCryptoButtonViewStubHolder, intervalSelectorLayout.oneYearCryptoButtonViewStubHolder, intervalSelectorLayout.allCryptoButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getCryptoDetailModeBtns() {
        return (ViewStubHolder[]) this.cryptoDetailModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] cryptoDetailModeBtns_delegate$lambda$3(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneHourButtonViewStubHolder, intervalSelectorLayout.twentyFourHourButtonViewStubHolder, intervalSelectorLayout.oneWeekCryptoButtonViewStubHolder, intervalSelectorLayout.oneMonthCryptoButtonViewStubHolder, intervalSelectorLayout.threeMonthCryptoButtonViewStubHolder, intervalSelectorLayout.oneYearCryptoButtonViewStubHolder, intervalSelectorLayout.fiveYearCryptoButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getEquityDetailModeBtns() {
        return (ViewStubHolder[]) this.equityDetailModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] equityDetailModeBtns_delegate$lambda$4(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneDayButtonViewStubHolder, intervalSelectorLayout.oneWeekButtonViewStubHolder, intervalSelectorLayout.oneMonthButtonViewStubHolder, intervalSelectorLayout.threeMonthButtonViewStubHolder, intervalSelectorLayout.oneYearButtonViewStubHolder, intervalSelectorLayout.fiveYearButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getAdvancedChartModeBtns() {
        return (ViewStubHolder[]) this.advancedChartModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] advancedChartModeBtns_delegate$lambda$5(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneDayButtonViewStubHolder, intervalSelectorLayout.oneWeekButtonViewStubHolder, intervalSelectorLayout.oneMonthButtonViewStubHolder, intervalSelectorLayout.threeMonthButtonViewStubHolder, intervalSelectorLayout.ytdButtonViewStubHolder, intervalSelectorLayout.oneYearButtonViewStubHolder, intervalSelectorLayout.fiveYearButtonViewStubHolder, intervalSelectorLayout.maxButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getOptionsModeBtns() {
        return (ViewStubHolder[]) this.optionsModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] optionsModeBtns_delegate$lambda$6(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneDayButtonViewStubHolder, intervalSelectorLayout.oneWeekButtonViewStubHolder, intervalSelectorLayout.allButtonViewStubHolder};
    }

    private final ViewStubHolder<RadioButton>[] getOptionStrategyModeBtns() {
        return (ViewStubHolder[]) this.optionStrategyModeBtns.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStubHolder[] optionStrategyModeBtns_delegate$lambda$7(IntervalSelectorLayout intervalSelectorLayout) {
        return new ViewStubHolder[]{intervalSelectorLayout.oneDayButtonViewStubHolder, intervalSelectorLayout.oneWeekButtonViewStubHolder, intervalSelectorLayout.oneMonthButtonViewStubHolder, intervalSelectorLayout.threeMonthButtonViewStubHolder, intervalSelectorLayout.oneYearButtonViewStubHolder, intervalSelectorLayout.fiveYearButtonViewStubHolder};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkedChangeListener$lambda$8(IntervalSelectorLayout intervalSelectorLayout, RadioGroup radioGroup, int i) {
        GraphSelection graphSelection;
        Intrinsics.checkNotNullParameter(radioGroup, "<unused var>");
        if (i == C18339R.id.graphview_1h_btn) {
            graphSelection = GraphSelection.HOUR;
        } else if (i == C18339R.id.graphview_1d_btn) {
            graphSelection = GraphSelection.DAY;
        } else if (i == C18339R.id.graphview_24h_btn) {
            graphSelection = GraphSelection.TWENTY_FOUR_HOURS;
        } else if (i == C18339R.id.graphview_1w_btn) {
            graphSelection = GraphSelection.WEEK;
        } else if (i == C18339R.id.graphview_1w_crypto_btn) {
            graphSelection = GraphSelection.WEEK_CRYPTO;
        } else if (i == C18339R.id.graphview_1m_btn) {
            graphSelection = GraphSelection.MONTH_HOURLY;
        } else if (i == C18339R.id.graphview_1m_crypto_btn) {
            graphSelection = GraphSelection.MONTH_CRYPTO_HOURLY;
        } else if (i == C18339R.id.graphview_3m_btn) {
            graphSelection = GraphSelection.THREE_MONTHS;
        } else if (i == C18339R.id.graphview_3m_crypto_btn) {
            graphSelection = GraphSelection.THREE_MONTHS_CRYPTO;
        } else if (i == C18339R.id.graphview_ytd_btn) {
            graphSelection = GraphSelection.YEAR_TO_DATE;
        } else if (i == C18339R.id.graphview_1y_btn) {
            graphSelection = GraphSelection.YEAR;
        } else if (i == C18339R.id.graphview_1y_crypto_btn) {
            graphSelection = GraphSelection.YEAR_CRYPTO;
        } else if (i == C18339R.id.graphview_5y_btn) {
            graphSelection = GraphSelection.FIVE_YEARS;
        } else if (i == C18339R.id.graphview_5y_crypto_btn) {
            graphSelection = GraphSelection.FIVE_YEARS_CRYPTO;
        } else if (i == C18339R.id.graphview_max_btn) {
            graphSelection = GraphSelection.MAX;
        } else if (i == C18339R.id.graphview_max_crypto_btn) {
            graphSelection = GraphSelection.MAX_CRYPTO;
        } else if (i == C18339R.id.graphview_all_btn) {
            graphSelection = GraphSelection.ALL;
        } else {
            if (i != C18339R.id.graphview_all_crypto_btn) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin("Unknown Radio Button: " + i);
                throw new ExceptionsH();
            }
            graphSelection = GraphSelection.ALL_CRYPTO;
        }
        intervalSelectorLayout.selectionChangedSubject.onNext(graphSelection);
        return Unit.INSTANCE;
    }

    public final ColorStateList getLivePulseTint() {
        return this.livePulseTint;
    }

    public final void setLivePulseTint(ColorStateList colorStateList) {
        this.livePulseTint = colorStateList;
        this.livePulseDrawable.setTintList(colorStateList);
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final void setMode(Mode mode) {
        if (this.mode == mode) {
            return;
        }
        this.mode = mode;
        switch (mode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case -1:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                configurePortfolioMode();
                return;
            case 2:
                configurePortfolioHybridMode();
                return;
            case 3:
                configurePortfolioCryptoMode();
                return;
            case 4:
                configureEquityDetailMode();
                return;
            case 5:
                configureAdvancedChartMode();
                return;
            case 6:
                configureCryptoDetailMode();
                return;
            case 7:
                configureOptionsMode();
                return;
            case 8:
                configureOptionStrategyMode();
                return;
        }
    }

    public final Observable<GraphSelection> getGraphSelectionObservable() {
        Observable<GraphSelection> observableDistinctUntilChanged = this.selectionChangedSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final void configureAdvancedChartMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getAdvancedChartModeBtns()) {
            viewStubHolder.setVisible(true);
            ViewGroup.LayoutParams layoutParams = ((RadioButton) viewStubHolder.get()).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 0.0f;
            layoutParams2.width = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xxlarge);
            ((RadioButton) viewStubHolder.get()).setLayoutParams(layoutParams2);
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
        ViewsKt.setEducationTourId(this.oneDayButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_DAY_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.oneWeekButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_WEEK_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.oneMonthButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_MONTH_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.threeMonthButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_THREE_MONTHS_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.ytdButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_YEAR_TO_DATE);
        ViewsKt.setEducationTourId(this.oneYearButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_YEAR_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.fiveYearButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_FIVE_YEARS_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.maxButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ALL_ELEMENT_ID);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    private final void configureCryptoDetailMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getCryptoDetailModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.twentyFourHourButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.twentyFourHourButtonViewStubHolder;
    }

    private final void configureEquityDetailMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getEquityDetailModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
        ViewsKt.setEducationTourId(this.oneDayButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_DAY_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.oneWeekButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_WEEK_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.oneMonthButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_MONTH_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.threeMonthButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_THREE_MONTHS_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.oneYearButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_ONE_YEAR_ELEMENT_ID);
        ViewsKt.setEducationTourId(this.fiveYearButtonViewStubHolder.get(), EducationTourElementIds.PRICE_CHART_FIVE_YEARS_ELEMENT_ID);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    private final void configureOptionsMode() {
        ViewStubHolder<RadioButton> viewStubHolder = this.oneHourButtonViewStubHolder;
        viewStubHolder.setVisible(false);
        ViewGroup.LayoutParams layoutParams = ((RadioButton) viewStubHolder.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = 0.0f;
        layoutParams2.width = -2;
        ((RadioButton) viewStubHolder.get()).setLayoutParams(layoutParams2);
        ViewStubHolder<RadioButton> viewStubHolder2 = this.oneDayButtonViewStubHolder;
        viewStubHolder2.setVisible(false);
        ViewGroup.LayoutParams layoutParams3 = ((RadioButton) viewStubHolder2.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.weight = 0.0f;
        layoutParams4.width = -2;
        ((RadioButton) viewStubHolder2.get()).setLayoutParams(layoutParams4);
        ViewStubHolder<RadioButton> viewStubHolder3 = this.twentyFourHourButtonViewStubHolder;
        viewStubHolder3.setVisible(false);
        ViewGroup.LayoutParams layoutParams5 = ((RadioButton) viewStubHolder3.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.weight = 0.0f;
        layoutParams6.width = -2;
        ((RadioButton) viewStubHolder3.get()).setLayoutParams(layoutParams6);
        ViewStubHolder<RadioButton> viewStubHolder4 = this.oneWeekButtonViewStubHolder;
        viewStubHolder4.setVisible(false);
        ViewGroup.LayoutParams layoutParams7 = ((RadioButton) viewStubHolder4.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.weight = 0.0f;
        layoutParams8.width = -2;
        ((RadioButton) viewStubHolder4.get()).setLayoutParams(layoutParams8);
        ViewStubHolder<RadioButton> viewStubHolder5 = this.oneWeekCryptoButtonViewStubHolder;
        viewStubHolder5.setVisible(false);
        ViewGroup.LayoutParams layoutParams9 = ((RadioButton) viewStubHolder5.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
        layoutParams10.weight = 0.0f;
        layoutParams10.width = -2;
        ((RadioButton) viewStubHolder5.get()).setLayoutParams(layoutParams10);
        ViewStubHolder<RadioButton> viewStubHolder6 = this.oneMonthButtonViewStubHolder;
        viewStubHolder6.setVisible(false);
        ViewGroup.LayoutParams layoutParams11 = ((RadioButton) viewStubHolder6.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
        layoutParams12.weight = 0.0f;
        layoutParams12.width = -2;
        ((RadioButton) viewStubHolder6.get()).setLayoutParams(layoutParams12);
        ViewStubHolder<RadioButton> viewStubHolder7 = this.oneMonthCryptoButtonViewStubHolder;
        viewStubHolder7.setVisible(false);
        ViewGroup.LayoutParams layoutParams13 = ((RadioButton) viewStubHolder7.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams13, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams14 = (LinearLayout.LayoutParams) layoutParams13;
        layoutParams14.weight = 0.0f;
        layoutParams14.width = -2;
        ((RadioButton) viewStubHolder7.get()).setLayoutParams(layoutParams14);
        ViewStubHolder<RadioButton> viewStubHolder8 = this.threeMonthButtonViewStubHolder;
        viewStubHolder8.setVisible(false);
        ViewGroup.LayoutParams layoutParams15 = ((RadioButton) viewStubHolder8.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams15, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams16 = (LinearLayout.LayoutParams) layoutParams15;
        layoutParams16.weight = 0.0f;
        layoutParams16.width = -2;
        ((RadioButton) viewStubHolder8.get()).setLayoutParams(layoutParams16);
        ViewStubHolder<RadioButton> viewStubHolder9 = this.threeMonthCryptoButtonViewStubHolder;
        viewStubHolder9.setVisible(false);
        ViewGroup.LayoutParams layoutParams17 = ((RadioButton) viewStubHolder9.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams17, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams18 = (LinearLayout.LayoutParams) layoutParams17;
        layoutParams18.weight = 0.0f;
        layoutParams18.width = -2;
        ((RadioButton) viewStubHolder9.get()).setLayoutParams(layoutParams18);
        ViewStubHolder<RadioButton> viewStubHolder10 = this.ytdButtonViewStubHolder;
        viewStubHolder10.setVisible(false);
        ViewGroup.LayoutParams layoutParams19 = ((RadioButton) viewStubHolder10.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams19, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams20 = (LinearLayout.LayoutParams) layoutParams19;
        layoutParams20.weight = 0.0f;
        layoutParams20.width = -2;
        ((RadioButton) viewStubHolder10.get()).setLayoutParams(layoutParams20);
        ViewStubHolder<RadioButton> viewStubHolder11 = this.oneYearButtonViewStubHolder;
        viewStubHolder11.setVisible(false);
        ViewGroup.LayoutParams layoutParams21 = ((RadioButton) viewStubHolder11.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams21, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams22 = (LinearLayout.LayoutParams) layoutParams21;
        layoutParams22.weight = 0.0f;
        layoutParams22.width = -2;
        ((RadioButton) viewStubHolder11.get()).setLayoutParams(layoutParams22);
        ViewStubHolder<RadioButton> viewStubHolder12 = this.oneYearCryptoButtonViewStubHolder;
        viewStubHolder12.setVisible(false);
        ViewGroup.LayoutParams layoutParams23 = ((RadioButton) viewStubHolder12.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams23, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams24 = (LinearLayout.LayoutParams) layoutParams23;
        layoutParams24.weight = 0.0f;
        layoutParams24.width = -2;
        ((RadioButton) viewStubHolder12.get()).setLayoutParams(layoutParams24);
        ViewStubHolder<RadioButton> viewStubHolder13 = this.fiveYearButtonViewStubHolder;
        viewStubHolder13.setVisible(false);
        ViewGroup.LayoutParams layoutParams25 = ((RadioButton) viewStubHolder13.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams25, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams26 = (LinearLayout.LayoutParams) layoutParams25;
        layoutParams26.weight = 0.0f;
        layoutParams26.width = -2;
        ((RadioButton) viewStubHolder13.get()).setLayoutParams(layoutParams26);
        ViewStubHolder<RadioButton> viewStubHolder14 = this.fiveYearCryptoButtonViewStubHolder;
        viewStubHolder14.setVisible(false);
        ViewGroup.LayoutParams layoutParams27 = ((RadioButton) viewStubHolder14.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams27, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams28 = (LinearLayout.LayoutParams) layoutParams27;
        layoutParams28.weight = 0.0f;
        layoutParams28.width = -2;
        ((RadioButton) viewStubHolder14.get()).setLayoutParams(layoutParams28);
        ViewStubHolder<RadioButton> viewStubHolder15 = this.maxButtonViewStubHolder;
        viewStubHolder15.setVisible(false);
        ViewGroup.LayoutParams layoutParams29 = ((RadioButton) viewStubHolder15.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams29, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams30 = (LinearLayout.LayoutParams) layoutParams29;
        layoutParams30.weight = 0.0f;
        layoutParams30.width = -2;
        ((RadioButton) viewStubHolder15.get()).setLayoutParams(layoutParams30);
        ViewStubHolder<RadioButton> viewStubHolder16 = this.maxButtonCryptoButtonViewStubHolder;
        viewStubHolder16.setVisible(false);
        ViewGroup.LayoutParams layoutParams31 = ((RadioButton) viewStubHolder16.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams31, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams32 = (LinearLayout.LayoutParams) layoutParams31;
        layoutParams32.weight = 0.0f;
        layoutParams32.width = -2;
        ((RadioButton) viewStubHolder16.get()).setLayoutParams(layoutParams32);
        ViewStubHolder<RadioButton> viewStubHolder17 = this.allButtonViewStubHolder;
        viewStubHolder17.setVisible(false);
        ViewGroup.LayoutParams layoutParams33 = ((RadioButton) viewStubHolder17.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams33, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams34 = (LinearLayout.LayoutParams) layoutParams33;
        layoutParams34.weight = 0.0f;
        layoutParams34.width = -2;
        ((RadioButton) viewStubHolder17.get()).setLayoutParams(layoutParams34);
        ViewStubHolder<RadioButton> viewStubHolder18 = this.allCryptoButtonViewStubHolder;
        viewStubHolder18.setVisible(false);
        ViewGroup.LayoutParams layoutParams35 = ((RadioButton) viewStubHolder18.get()).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams35, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams36 = (LinearLayout.LayoutParams) layoutParams35;
        layoutParams36.weight = 0.0f;
        layoutParams36.width = -2;
        ((RadioButton) viewStubHolder18.get()).setLayoutParams(layoutParams36);
        for (ViewStubHolder<RadioButton> viewStubHolder19 : getOptionsModeBtns()) {
            viewStubHolder19.setVisible(true);
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    private final void configurePortfolioCryptoMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getPortfolioCryptoModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.twentyFourHourButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.twentyFourHourButtonViewStubHolder;
    }

    private final void configurePortfolioHybridMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getPortfolioHybridModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.twentyFourHourButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    private final void configurePortfolioMode() {
        this.oneHourButtonViewStubHolder.setVisible(false);
        this.oneDayButtonViewStubHolder.setVisible(false);
        this.twentyFourHourButtonViewStubHolder.setVisible(false);
        this.oneWeekButtonViewStubHolder.setVisible(false);
        this.oneWeekCryptoButtonViewStubHolder.setVisible(false);
        this.oneMonthButtonViewStubHolder.setVisible(false);
        this.oneMonthCryptoButtonViewStubHolder.setVisible(false);
        this.threeMonthButtonViewStubHolder.setVisible(false);
        this.threeMonthCryptoButtonViewStubHolder.setVisible(false);
        this.ytdButtonViewStubHolder.setVisible(false);
        this.oneYearButtonViewStubHolder.setVisible(false);
        this.oneYearCryptoButtonViewStubHolder.setVisible(false);
        this.fiveYearButtonViewStubHolder.setVisible(false);
        this.fiveYearCryptoButtonViewStubHolder.setVisible(false);
        this.maxButtonViewStubHolder.setVisible(false);
        this.maxButtonCryptoButtonViewStubHolder.setVisible(false);
        this.allButtonViewStubHolder.setVisible(false);
        this.allCryptoButtonViewStubHolder.setVisible(false);
        for (ViewStubHolder<RadioButton> viewStubHolder : getPortfolioEquityModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    private final void onAllButtons(Function1<? super ViewStubHolder<RadioButton>, Unit> func) {
        func.invoke(this.oneHourButtonViewStubHolder);
        func.invoke(this.oneDayButtonViewStubHolder);
        func.invoke(this.twentyFourHourButtonViewStubHolder);
        func.invoke(this.oneWeekButtonViewStubHolder);
        func.invoke(this.oneWeekCryptoButtonViewStubHolder);
        func.invoke(this.oneMonthButtonViewStubHolder);
        func.invoke(this.oneMonthCryptoButtonViewStubHolder);
        func.invoke(this.threeMonthButtonViewStubHolder);
        func.invoke(this.threeMonthCryptoButtonViewStubHolder);
        func.invoke(this.ytdButtonViewStubHolder);
        func.invoke(this.oneYearButtonViewStubHolder);
        func.invoke(this.oneYearCryptoButtonViewStubHolder);
        func.invoke(this.fiveYearButtonViewStubHolder);
        func.invoke(this.fiveYearCryptoButtonViewStubHolder);
        func.invoke(this.maxButtonViewStubHolder);
        func.invoke(this.maxButtonCryptoButtonViewStubHolder);
        func.invoke(this.allButtonViewStubHolder);
        func.invoke(this.allCryptoButtonViewStubHolder);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        ((RadioButton) this.oneHourButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.twentyFourHourButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneWeekButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneWeekCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneMonthButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneMonthCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.threeMonthButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.threeMonthCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.ytdButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneYearButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.oneYearCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.fiveYearButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.fiveYearCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.maxButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.maxButtonCryptoButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.allButtonViewStubHolder.get()).setEnabled(enabled);
        ((RadioButton) this.allCryptoButtonViewStubHolder.get()).setEnabled(enabled);
    }

    private final ViewStubHolder<RadioButton> getButton(GraphSelection graphSelection) {
        switch (WhenMappings.$EnumSwitchMapping$1[graphSelection.ordinal()]) {
            case 1:
                return this.oneHourButtonViewStubHolder;
            case 2:
                return this.oneDayButtonViewStubHolder;
            case 3:
            case 4:
                return this.twentyFourHourButtonViewStubHolder;
            case 5:
                return this.oneWeekButtonViewStubHolder;
            case 6:
                return this.oneWeekCryptoButtonViewStubHolder;
            case 7:
            case 8:
                return this.oneMonthButtonViewStubHolder;
            case 9:
            case 10:
                return this.oneMonthCryptoButtonViewStubHolder;
            case 11:
                return this.threeMonthButtonViewStubHolder;
            case 12:
                return this.threeMonthCryptoButtonViewStubHolder;
            case 13:
                return this.ytdButtonViewStubHolder;
            case 14:
                return this.oneYearButtonViewStubHolder;
            case 15:
                return this.oneYearCryptoButtonViewStubHolder;
            case 16:
                return this.fiveYearButtonViewStubHolder;
            case 17:
                return this.fiveYearCryptoButtonViewStubHolder;
            case 18:
                return this.maxButtonViewStubHolder;
            case 19:
                return this.maxButtonCryptoButtonViewStubHolder;
            case 20:
                return this.allButtonViewStubHolder;
            case 21:
                return this.allCryptoButtonViewStubHolder;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void updateAnimationColor(int colorRes) {
        this.livePulseDrawable.setAnimationColor(getContext().getColor(colorRes));
    }

    private final void configureOptionStrategyMode() {
        for (ViewStubHolder<RadioButton> viewStubHolder : getOptionStrategyModeBtns()) {
            viewStubHolder.setVisible(true);
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
        this.defaultCheckedBtn = this.oneDayButtonViewStubHolder;
    }

    public final void updateOptionsMode(boolean enableOneWeek, boolean enableAll) {
        this.oneWeekButtonViewStubHolder.setVisible(enableOneWeek);
        this.allButtonViewStubHolder.setVisible(enableAll);
        if ((enableOneWeek || !((RadioButton) this.oneWeekButtonViewStubHolder.get()).isChecked()) && (enableAll || !((RadioButton) this.allButtonViewStubHolder.get()).isChecked())) {
            return;
        }
        ((RadioButton) this.oneDayButtonViewStubHolder.get()).setChecked(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateOptionStrategyMode$default(IntervalSelectorLayout intervalSelectorLayout, long j, ViewStubHolder viewStubHolder, int i, Object obj) {
        if ((i & 2) != 0) {
            viewStubHolder = intervalSelectorLayout.oneDayButtonViewStubHolder;
        }
        intervalSelectorLayout.updateOptionStrategyMode(j, viewStubHolder);
    }

    public final void updateOptionStrategyMode(long contractAgeInDays, ViewStubHolder<RadioButton> defaultStubHolder) {
        Intrinsics.checkNotNullParameter(defaultStubHolder, "defaultStubHolder");
        toggle(this.oneWeekButtonViewStubHolder, contractAgeInDays > 0, defaultStubHolder);
        toggle(this.oneMonthButtonViewStubHolder, contractAgeInDays > 7, defaultStubHolder);
        toggle(this.threeMonthButtonViewStubHolder, contractAgeInDays > 30, defaultStubHolder);
        toggle(this.oneYearButtonViewStubHolder, contractAgeInDays >= 90, defaultStubHolder);
        toggle(this.fiveYearButtonViewStubHolder, contractAgeInDays >= 365, defaultStubHolder);
        int i = 0;
        for (ViewStubHolder<RadioButton> viewStubHolder : getOptionStrategyModeBtns()) {
            if (viewStubHolder.isVisible()) {
                i++;
            }
        }
        if (i < 5) {
            for (ViewStubHolder<RadioButton> viewStubHolder2 : getOptionStrategyModeBtns()) {
                ViewGroup.LayoutParams layoutParams = ((RadioButton) viewStubHolder2.get()).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 0.0f;
                layoutParams2.width = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xlarge);
                ((RadioButton) viewStubHolder2.get()).setLayoutParams(layoutParams2);
            }
        }
    }

    public final void updateOptionWatchlistMode(int daysSinceAddedToWatchlist) {
        ViewStubHolder<RadioButton> viewStubHolder;
        if (daysSinceAddedToWatchlist < 1) {
            viewStubHolder = this.oneDayButtonViewStubHolder;
        } else if (daysSinceAddedToWatchlist < 7) {
            viewStubHolder = this.oneWeekButtonViewStubHolder;
        } else if (daysSinceAddedToWatchlist < 30) {
            viewStubHolder = this.oneMonthButtonViewStubHolder;
        } else if (daysSinceAddedToWatchlist < 90) {
            viewStubHolder = this.threeMonthButtonViewStubHolder;
        } else if (daysSinceAddedToWatchlist < 365) {
            viewStubHolder = this.oneYearButtonViewStubHolder;
        } else {
            viewStubHolder = this.fiveYearButtonViewStubHolder;
        }
        ((RadioButton) viewStubHolder.get()).setChecked(true);
    }

    private final void toggle(ViewStubHolder<RadioButton> viewStubHolder, boolean z, ViewStubHolder<RadioButton> viewStubHolder2) {
        boolean zIsChecked = ((RadioButton) viewStubHolder.get()).isChecked();
        viewStubHolder.setVisible(z);
        if (z || !zIsChecked) {
            return;
        }
        ((RadioButton) viewStubHolder2.get()).setChecked(true);
    }

    public final void clear() {
        ((RadioButton) this.defaultCheckedBtn.get()).setChecked(true);
    }

    public final void setGraphSelectionFromAdapterOnly(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        if (graphSelection == this.selectionChangedSubject.getValue()) {
            return;
        }
        ((RadioButton) getButton(graphSelection).get()).setChecked(true);
    }

    private final ViewStubHolder<RadioButton> findRadioButtonViewStubHolderById(int id) {
        View viewFindViewById = findViewById(id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewStubHolder<RadioButton> viewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById);
        viewStubHolder.setOnInflateCallback(new Function1() { // from class: com.robinhood.android.graph.IntervalSelectorLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntervalSelectorLayout.findRadioButtonViewStubHolderById$lambda$29$lambda$28(this.f$0, (RadioButton) obj);
            }
        });
        return viewStubHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findRadioButtonViewStubHolderById$lambda$29$lambda$28(IntervalSelectorLayout intervalSelectorLayout, RadioButton radioButton) {
        Intrinsics.checkNotNullParameter(radioButton, "radioButton");
        intervalSelectorLayout.onViewInflated(radioButton);
        return Unit.INSTANCE;
    }

    private final void onViewInflated(RadioButton view) {
        int i;
        if (view.getId() == C18339R.id.graphview_1h_btn) {
            view.setCompoundDrawables(this.livePulseDrawable, null, null, null);
        }
        int id = view.getId();
        if (id == C18339R.id.graphview_1h_btn) {
            i = C18339R.string.graph_interval_one_hour_label;
        } else if (id == C18339R.id.graphview_1d_btn) {
            i = C18339R.string.graph_interval_one_day_label;
        } else if (id == C18339R.id.graphview_24h_btn) {
            i = C18339R.string.graph_interval_twenty_four_hour_label;
        } else if (id == C18339R.id.graphview_1w_btn || id == C18339R.id.graphview_1w_crypto_btn) {
            i = C18339R.string.graph_interval_one_week_label;
        } else if (id == C18339R.id.graphview_1m_btn || id == C18339R.id.graphview_1m_crypto_btn) {
            i = C18339R.string.graph_interval_one_month_label;
        } else if (id == C18339R.id.graphview_3m_btn || id == C18339R.id.graphview_3m_crypto_btn) {
            i = C18339R.string.graph_interval_three_months_label;
        } else if (id == C18339R.id.graphview_ytd_btn) {
            i = C18339R.string.graph_interval_year_to_date_label;
        } else if (id == C18339R.id.graphview_1y_btn || id == C18339R.id.graphview_1y_crypto_btn) {
            i = C18339R.string.graph_interval_one_year_label;
        } else if (id == C18339R.id.graphview_5y_btn || id == C18339R.id.graphview_5y_crypto_btn) {
            i = C18339R.string.graph_interval_five_years_label;
        } else if (id == C18339R.id.graphview_max_btn || id == C18339R.id.graphview_max_crypto_btn) {
            i = C18339R.string.graph_interval_max_years_label;
        } else if (id == C18339R.id.graphview_all_btn || id == C18339R.id.graphview_all_crypto_btn) {
            i = C18339R.string.graph_interval_all_label;
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(getId()));
            throw new ExceptionsH();
        }
        view.setText(i);
    }
}
