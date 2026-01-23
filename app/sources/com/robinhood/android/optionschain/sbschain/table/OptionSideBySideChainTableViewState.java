package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b9\u00107J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b>\u00107J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bD\u00107J\u0012\u0010E\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0086\u0002\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bK\u00102J\u0010\u0010L\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020\u00122\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010+R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bY\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Z\u001a\u0004\b[\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010W\u001a\u0004\b\\\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b^\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u00107R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\b\u0014\u00107R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b\u0015\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u0010;R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u0010=R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\be\u00107R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bf\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010g\u001a\u0004\bh\u0010AR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010i\u001a\u0004\bj\u0010CR\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b!\u0010_\u001a\u0004\bk\u00107R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010l\u001a\u0004\bm\u0010FR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010n\u001a\u0004\bo\u0010H¨\u0006p"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;", "headerState", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Lazy;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "tableRowStates", "", "quoteIndex", "disclosureIndex", "", "underlyingQuoteStr", "draggedOverIndex", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "", "initialInstrumentsLoaded", "isNuxAnimationFinished", "isTableCached", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "initialScrollEvent", "Lcom/robinhood/udf/UiEvent;", "initialScrollUiEvent", "shouldEnableScrolling", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "topErrorBannerState", "shouldShowZeroDteBottomSheet", "j$/time/Instant", "selloutTimeWhenShouldShowSelloutWarningSnackbar", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "spreadSelectionState", "<init>", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;ZZZLcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;Lcom/robinhood/udf/UiEvent;ZLkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;ZLj$/time/Instant;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;)V", "component1", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "component2", "()Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;", "component3", "()Lkotlinx/collections/immutable/ImmutableList;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "component9", "()Z", "component10", "component11", "component12", "()Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "component13", "()Lcom/robinhood/udf/UiEvent;", "component14", "component15", "component16", "()Ljava/math/BigDecimal;", "component17", "()Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "component18", "component19", "()Lj$/time/Instant;", "component20", "()Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "copy", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;ZZZLcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;Lcom/robinhood/udf/UiEvent;ZLkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;ZLj$/time/Instant;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getExpirationDateState", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;", "getHeaderState", "Lkotlinx/collections/immutable/ImmutableList;", "getTableRowStates", "Ljava/lang/Integer;", "getQuoteIndex", "getDisclosureIndex", "Ljava/lang/String;", "getUnderlyingQuoteStr", "getDraggedOverIndex", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "getDragTarget", "Z", "getInitialInstrumentsLoaded", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "getInitialScrollEvent", "Lcom/robinhood/udf/UiEvent;", "getInitialScrollUiEvent", "getShouldEnableScrolling", "getTargetLegs", "Ljava/math/BigDecimal;", "getTargetStrikePrice", "Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "getTopErrorBannerState", "getShouldShowZeroDteBottomSheet", "Lj$/time/Instant;", "getSelloutTimeWhenShouldShowSelloutWarningSnackbar", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "getSpreadSelectionState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainTableViewState {
    public static final int $stable = 8;
    private final Integer disclosureIndex;
    private final DragTarget dragTarget;
    private final Integer draggedOverIndex;
    private final OptionChainExpirationDateState expirationDateState;
    private final TableRowState.Header headerState;
    private final boolean initialInstrumentsLoaded;
    private final OptionSideBySideChainTableEvent initialScrollEvent;
    private final UiEvent<OptionSideBySideChainTableEvent> initialScrollUiEvent;
    private final boolean isNuxAnimationFinished;
    private final boolean isTableCached;
    private final Integer quoteIndex;
    private final Instant selloutTimeWhenShouldShowSelloutWarningSnackbar;
    private final boolean shouldEnableScrolling;
    private final boolean shouldShowZeroDteBottomSheet;
    private final SpreadSelectionState spreadSelectionState;
    private final ImmutableList<Lazy<TableRowState>> tableRowStates;
    private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
    private final BigDecimal targetStrikePrice;
    private final TopErrorBannerState topErrorBannerState;
    private final String underlyingQuoteStr;

    public static /* synthetic */ OptionSideBySideChainTableViewState copy$default(OptionSideBySideChainTableViewState optionSideBySideChainTableViewState, OptionChainExpirationDateState optionChainExpirationDateState, TableRowState.Header header, ImmutableList immutableList, Integer num, Integer num2, String str, Integer num3, DragTarget dragTarget, boolean z, boolean z2, boolean z3, OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, UiEvent uiEvent, boolean z4, ImmutableList immutableList2, BigDecimal bigDecimal, TopErrorBannerState topErrorBannerState, boolean z5, Instant instant, SpreadSelectionState spreadSelectionState, int i, Object obj) {
        SpreadSelectionState spreadSelectionState2;
        Instant instant2;
        OptionChainExpirationDateState optionChainExpirationDateState2 = (i & 1) != 0 ? optionSideBySideChainTableViewState.expirationDateState : optionChainExpirationDateState;
        TableRowState.Header header2 = (i & 2) != 0 ? optionSideBySideChainTableViewState.headerState : header;
        ImmutableList immutableList3 = (i & 4) != 0 ? optionSideBySideChainTableViewState.tableRowStates : immutableList;
        Integer num4 = (i & 8) != 0 ? optionSideBySideChainTableViewState.quoteIndex : num;
        Integer num5 = (i & 16) != 0 ? optionSideBySideChainTableViewState.disclosureIndex : num2;
        String str2 = (i & 32) != 0 ? optionSideBySideChainTableViewState.underlyingQuoteStr : str;
        Integer num6 = (i & 64) != 0 ? optionSideBySideChainTableViewState.draggedOverIndex : num3;
        DragTarget dragTarget2 = (i & 128) != 0 ? optionSideBySideChainTableViewState.dragTarget : dragTarget;
        boolean z6 = (i & 256) != 0 ? optionSideBySideChainTableViewState.initialInstrumentsLoaded : z;
        boolean z7 = (i & 512) != 0 ? optionSideBySideChainTableViewState.isNuxAnimationFinished : z2;
        boolean z8 = (i & 1024) != 0 ? optionSideBySideChainTableViewState.isTableCached : z3;
        OptionSideBySideChainTableEvent optionSideBySideChainTableEvent2 = (i & 2048) != 0 ? optionSideBySideChainTableViewState.initialScrollEvent : optionSideBySideChainTableEvent;
        UiEvent uiEvent2 = (i & 4096) != 0 ? optionSideBySideChainTableViewState.initialScrollUiEvent : uiEvent;
        boolean z9 = (i & 8192) != 0 ? optionSideBySideChainTableViewState.shouldEnableScrolling : z4;
        OptionChainExpirationDateState optionChainExpirationDateState3 = optionChainExpirationDateState2;
        ImmutableList immutableList4 = (i & 16384) != 0 ? optionSideBySideChainTableViewState.targetLegs : immutableList2;
        BigDecimal bigDecimal2 = (i & 32768) != 0 ? optionSideBySideChainTableViewState.targetStrikePrice : bigDecimal;
        TopErrorBannerState topErrorBannerState2 = (i & 65536) != 0 ? optionSideBySideChainTableViewState.topErrorBannerState : topErrorBannerState;
        boolean z10 = (i & 131072) != 0 ? optionSideBySideChainTableViewState.shouldShowZeroDteBottomSheet : z5;
        Instant instant3 = (i & 262144) != 0 ? optionSideBySideChainTableViewState.selloutTimeWhenShouldShowSelloutWarningSnackbar : instant;
        if ((i & 524288) != 0) {
            instant2 = instant3;
            spreadSelectionState2 = optionSideBySideChainTableViewState.spreadSelectionState;
        } else {
            spreadSelectionState2 = spreadSelectionState;
            instant2 = instant3;
        }
        return optionSideBySideChainTableViewState.copy(optionChainExpirationDateState3, header2, immutableList3, num4, num5, str2, num6, dragTarget2, z6, z7, z8, optionSideBySideChainTableEvent2, uiEvent2, z9, immutableList4, bigDecimal2, topErrorBannerState2, z10, instant2, spreadSelectionState2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainExpirationDateState getExpirationDateState() {
        return this.expirationDateState;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNuxAnimationFinished() {
        return this.isNuxAnimationFinished;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsTableCached() {
        return this.isTableCached;
    }

    /* renamed from: component12, reason: from getter */
    public final OptionSideBySideChainTableEvent getInitialScrollEvent() {
        return this.initialScrollEvent;
    }

    public final UiEvent<OptionSideBySideChainTableEvent> component13() {
        return this.initialScrollUiEvent;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShouldEnableScrolling() {
        return this.shouldEnableScrolling;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> component15() {
        return this.targetLegs;
    }

    /* renamed from: component16, reason: from getter */
    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    /* renamed from: component17, reason: from getter */
    public final TopErrorBannerState getTopErrorBannerState() {
        return this.topErrorBannerState;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getShouldShowZeroDteBottomSheet() {
        return this.shouldShowZeroDteBottomSheet;
    }

    /* renamed from: component19, reason: from getter */
    public final Instant getSelloutTimeWhenShouldShowSelloutWarningSnackbar() {
        return this.selloutTimeWhenShouldShowSelloutWarningSnackbar;
    }

    /* renamed from: component2, reason: from getter */
    public final TableRowState.Header getHeaderState() {
        return this.headerState;
    }

    /* renamed from: component20, reason: from getter */
    public final SpreadSelectionState getSpreadSelectionState() {
        return this.spreadSelectionState;
    }

    public final ImmutableList<Lazy<TableRowState>> component3() {
        return this.tableRowStates;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDisclosureIndex() {
        return this.disclosureIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUnderlyingQuoteStr() {
        return this.underlyingQuoteStr;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getDraggedOverIndex() {
        return this.draggedOverIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final DragTarget getDragTarget() {
        return this.dragTarget;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInitialInstrumentsLoaded() {
        return this.initialInstrumentsLoaded;
    }

    public final OptionSideBySideChainTableViewState copy(OptionChainExpirationDateState expirationDateState, TableRowState.Header headerState, ImmutableList<? extends Lazy<? extends TableRowState>> tableRowStates, Integer quoteIndex, Integer disclosureIndex, String underlyingQuoteStr, Integer draggedOverIndex, DragTarget dragTarget, boolean initialInstrumentsLoaded, boolean isNuxAnimationFinished, boolean isTableCached, OptionSideBySideChainTableEvent initialScrollEvent, UiEvent<OptionSideBySideChainTableEvent> initialScrollUiEvent, boolean shouldEnableScrolling, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, TopErrorBannerState topErrorBannerState, boolean shouldShowZeroDteBottomSheet, Instant selloutTimeWhenShouldShowSelloutWarningSnackbar, SpreadSelectionState spreadSelectionState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(tableRowStates, "tableRowStates");
        Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        return new OptionSideBySideChainTableViewState(expirationDateState, headerState, tableRowStates, quoteIndex, disclosureIndex, underlyingQuoteStr, draggedOverIndex, dragTarget, initialInstrumentsLoaded, isNuxAnimationFinished, isTableCached, initialScrollEvent, initialScrollUiEvent, shouldEnableScrolling, targetLegs, targetStrikePrice, topErrorBannerState, shouldShowZeroDteBottomSheet, selloutTimeWhenShouldShowSelloutWarningSnackbar, spreadSelectionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainTableViewState)) {
            return false;
        }
        OptionSideBySideChainTableViewState optionSideBySideChainTableViewState = (OptionSideBySideChainTableViewState) other;
        return Intrinsics.areEqual(this.expirationDateState, optionSideBySideChainTableViewState.expirationDateState) && Intrinsics.areEqual(this.headerState, optionSideBySideChainTableViewState.headerState) && Intrinsics.areEqual(this.tableRowStates, optionSideBySideChainTableViewState.tableRowStates) && Intrinsics.areEqual(this.quoteIndex, optionSideBySideChainTableViewState.quoteIndex) && Intrinsics.areEqual(this.disclosureIndex, optionSideBySideChainTableViewState.disclosureIndex) && Intrinsics.areEqual(this.underlyingQuoteStr, optionSideBySideChainTableViewState.underlyingQuoteStr) && Intrinsics.areEqual(this.draggedOverIndex, optionSideBySideChainTableViewState.draggedOverIndex) && Intrinsics.areEqual(this.dragTarget, optionSideBySideChainTableViewState.dragTarget) && this.initialInstrumentsLoaded == optionSideBySideChainTableViewState.initialInstrumentsLoaded && this.isNuxAnimationFinished == optionSideBySideChainTableViewState.isNuxAnimationFinished && this.isTableCached == optionSideBySideChainTableViewState.isTableCached && Intrinsics.areEqual(this.initialScrollEvent, optionSideBySideChainTableViewState.initialScrollEvent) && Intrinsics.areEqual(this.initialScrollUiEvent, optionSideBySideChainTableViewState.initialScrollUiEvent) && this.shouldEnableScrolling == optionSideBySideChainTableViewState.shouldEnableScrolling && Intrinsics.areEqual(this.targetLegs, optionSideBySideChainTableViewState.targetLegs) && Intrinsics.areEqual(this.targetStrikePrice, optionSideBySideChainTableViewState.targetStrikePrice) && Intrinsics.areEqual(this.topErrorBannerState, optionSideBySideChainTableViewState.topErrorBannerState) && this.shouldShowZeroDteBottomSheet == optionSideBySideChainTableViewState.shouldShowZeroDteBottomSheet && Intrinsics.areEqual(this.selloutTimeWhenShouldShowSelloutWarningSnackbar, optionSideBySideChainTableViewState.selloutTimeWhenShouldShowSelloutWarningSnackbar) && Intrinsics.areEqual(this.spreadSelectionState, optionSideBySideChainTableViewState.spreadSelectionState);
    }

    public int hashCode() {
        OptionChainExpirationDateState optionChainExpirationDateState = this.expirationDateState;
        int iHashCode = (((((optionChainExpirationDateState == null ? 0 : optionChainExpirationDateState.hashCode()) * 31) + this.headerState.hashCode()) * 31) + this.tableRowStates.hashCode()) * 31;
        Integer num = this.quoteIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.disclosureIndex;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.underlyingQuoteStr.hashCode()) * 31;
        Integer num3 = this.draggedOverIndex;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DragTarget dragTarget = this.dragTarget;
        int iHashCode5 = (((((((iHashCode4 + (dragTarget == null ? 0 : dragTarget.hashCode())) * 31) + Boolean.hashCode(this.initialInstrumentsLoaded)) * 31) + Boolean.hashCode(this.isNuxAnimationFinished)) * 31) + Boolean.hashCode(this.isTableCached)) * 31;
        OptionSideBySideChainTableEvent optionSideBySideChainTableEvent = this.initialScrollEvent;
        int iHashCode6 = (iHashCode5 + (optionSideBySideChainTableEvent == null ? 0 : optionSideBySideChainTableEvent.hashCode())) * 31;
        UiEvent<OptionSideBySideChainTableEvent> uiEvent = this.initialScrollUiEvent;
        int iHashCode7 = (((((iHashCode6 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.shouldEnableScrolling)) * 31) + this.targetLegs.hashCode()) * 31;
        BigDecimal bigDecimal = this.targetStrikePrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        TopErrorBannerState topErrorBannerState = this.topErrorBannerState;
        int iHashCode9 = (((iHashCode8 + (topErrorBannerState == null ? 0 : topErrorBannerState.hashCode())) * 31) + Boolean.hashCode(this.shouldShowZeroDteBottomSheet)) * 31;
        Instant instant = this.selloutTimeWhenShouldShowSelloutWarningSnackbar;
        int iHashCode10 = (iHashCode9 + (instant == null ? 0 : instant.hashCode())) * 31;
        SpreadSelectionState spreadSelectionState = this.spreadSelectionState;
        return iHashCode10 + (spreadSelectionState != null ? spreadSelectionState.hashCode() : 0);
    }

    public String toString() {
        return "OptionSideBySideChainTableViewState(expirationDateState=" + this.expirationDateState + ", headerState=" + this.headerState + ", tableRowStates=" + this.tableRowStates + ", quoteIndex=" + this.quoteIndex + ", disclosureIndex=" + this.disclosureIndex + ", underlyingQuoteStr=" + this.underlyingQuoteStr + ", draggedOverIndex=" + this.draggedOverIndex + ", dragTarget=" + this.dragTarget + ", initialInstrumentsLoaded=" + this.initialInstrumentsLoaded + ", isNuxAnimationFinished=" + this.isNuxAnimationFinished + ", isTableCached=" + this.isTableCached + ", initialScrollEvent=" + this.initialScrollEvent + ", initialScrollUiEvent=" + this.initialScrollUiEvent + ", shouldEnableScrolling=" + this.shouldEnableScrolling + ", targetLegs=" + this.targetLegs + ", targetStrikePrice=" + this.targetStrikePrice + ", topErrorBannerState=" + this.topErrorBannerState + ", shouldShowZeroDteBottomSheet=" + this.shouldShowZeroDteBottomSheet + ", selloutTimeWhenShouldShowSelloutWarningSnackbar=" + this.selloutTimeWhenShouldShowSelloutWarningSnackbar + ", spreadSelectionState=" + this.spreadSelectionState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionSideBySideChainTableViewState(OptionChainExpirationDateState optionChainExpirationDateState, TableRowState.Header headerState, ImmutableList<? extends Lazy<? extends TableRowState>> tableRowStates, Integer num, Integer num2, String underlyingQuoteStr, Integer num3, DragTarget dragTarget, boolean z, boolean z2, boolean z3, OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, UiEvent<OptionSideBySideChainTableEvent> uiEvent, boolean z4, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal bigDecimal, TopErrorBannerState topErrorBannerState, boolean z5, Instant instant, SpreadSelectionState spreadSelectionState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(tableRowStates, "tableRowStates");
        Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        this.expirationDateState = optionChainExpirationDateState;
        this.headerState = headerState;
        this.tableRowStates = tableRowStates;
        this.quoteIndex = num;
        this.disclosureIndex = num2;
        this.underlyingQuoteStr = underlyingQuoteStr;
        this.draggedOverIndex = num3;
        this.dragTarget = dragTarget;
        this.initialInstrumentsLoaded = z;
        this.isNuxAnimationFinished = z2;
        this.isTableCached = z3;
        this.initialScrollEvent = optionSideBySideChainTableEvent;
        this.initialScrollUiEvent = uiEvent;
        this.shouldEnableScrolling = z4;
        this.targetLegs = targetLegs;
        this.targetStrikePrice = bigDecimal;
        this.topErrorBannerState = topErrorBannerState;
        this.shouldShowZeroDteBottomSheet = z5;
        this.selloutTimeWhenShouldShowSelloutWarningSnackbar = instant;
        this.spreadSelectionState = spreadSelectionState;
    }

    public final OptionChainExpirationDateState getExpirationDateState() {
        return this.expirationDateState;
    }

    public final TableRowState.Header getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<Lazy<TableRowState>> getTableRowStates() {
        return this.tableRowStates;
    }

    public final Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    public final Integer getDisclosureIndex() {
        return this.disclosureIndex;
    }

    public final String getUnderlyingQuoteStr() {
        return this.underlyingQuoteStr;
    }

    public final Integer getDraggedOverIndex() {
        return this.draggedOverIndex;
    }

    public final DragTarget getDragTarget() {
        return this.dragTarget;
    }

    public final boolean getInitialInstrumentsLoaded() {
        return this.initialInstrumentsLoaded;
    }

    public final boolean isNuxAnimationFinished() {
        return this.isNuxAnimationFinished;
    }

    public final boolean isTableCached() {
        return this.isTableCached;
    }

    public final OptionSideBySideChainTableEvent getInitialScrollEvent() {
        return this.initialScrollEvent;
    }

    public final UiEvent<OptionSideBySideChainTableEvent> getInitialScrollUiEvent() {
        return this.initialScrollUiEvent;
    }

    public final boolean getShouldEnableScrolling() {
        return this.shouldEnableScrolling;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
        return this.targetLegs;
    }

    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    public final TopErrorBannerState getTopErrorBannerState() {
        return this.topErrorBannerState;
    }

    public final boolean getShouldShowZeroDteBottomSheet() {
        return this.shouldShowZeroDteBottomSheet;
    }

    public final Instant getSelloutTimeWhenShouldShowSelloutWarningSnackbar() {
        return this.selloutTimeWhenShouldShowSelloutWarningSnackbar;
    }

    public final SpreadSelectionState getSpreadSelectionState() {
        return this.spreadSelectionState;
    }
}
