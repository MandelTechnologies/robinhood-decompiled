package com.robinhood.android.options.history.detail.order;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionOrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u0001:\u0003rstBÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0001\u0010$\u001a\u00020%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010\\\u001a\u00020\u0015HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\nHÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010h\u001a\u00020%HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020(HÆ\u0003J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\nHÆ\u0003J³\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0003\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\nHÆ\u0001J\u0013\u0010n\u001a\u00020\n2\b\u0010o\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010p\u001a\u00020%HÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u00104R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bE\u00104R\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bF\u00104R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bG\u00104R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010)\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0011\u0010*\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bR\u00104¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;", "", "accountNumber", "", "accountText", "Lcom/robinhood/utils/resource/StringResource;", "actionRows", "", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$ActionRow;", "cancelButtonLoading", "", "chainSymbol", "documentDownloadIntentKey", "Lcom/robinhood/shared/documents/contracts/DocumentDownloadKey;", "legRows", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$LegRow;", "infoItems", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$InfoItem;", "limitPrice", "Ljava/math/BigDecimal;", "optionOrderDetailContext", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "placeAgainCtaStr", "placeAgainComponentIdentifier", "placeOrderAgainIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "replaceButtonLoading", "showCancelButton", "showReplaceButton", "showMultilegBidAskView", "showSingleLegBidAskView", "statusText", "subtitle", "", "subtitleTextAppearanceAttr", "", "title", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "startAlignStickyViewTradeConfirmationCta", "pnlUpdatesEnabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;ZLjava/lang/String;Lcom/robinhood/shared/documents/contracts/DocumentDownloadKey;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;Lcom/robinhood/models/db/OptionQuote;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;ZZZZZLcom/robinhood/utils/resource/StringResource;Ljava/lang/CharSequence;ILjava/lang/String;Lcom/robinhood/models/ui/UiOptionOrder;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountText", "()Lcom/robinhood/utils/resource/StringResource;", "getActionRows", "()Ljava/util/List;", "getCancelButtonLoading", "()Z", "getChainSymbol", "getDocumentDownloadIntentKey", "()Lcom/robinhood/shared/documents/contracts/DocumentDownloadKey;", "getLegRows", "getInfoItems", "getLimitPrice", "()Ljava/math/BigDecimal;", "getOptionOrderDetailContext", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "getOptionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "getPlaceAgainCtaStr", "getPlaceAgainComponentIdentifier", "getPlaceOrderAgainIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "getReplaceButtonLoading", "getShowCancelButton", "getShowReplaceButton", "getShowMultilegBidAskView", "getShowSingleLegBidAskView", "getStatusText", "getSubtitle", "()Ljava/lang/CharSequence;", "getSubtitleTextAppearanceAttr", "()I", "getTitle", "getUiOptionOrder", "()Lcom/robinhood/models/ui/UiOptionOrder;", "getStartAlignStickyViewTradeConfirmationCta", "getPnlUpdatesEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "other", "hashCode", "toString", "ActionRow", "LegRow", "InfoItem", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOrderDetailViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final StringResource accountText;
    private final List<ActionRow> actionRows;
    private final boolean cancelButtonLoading;
    private final String chainSymbol;
    private final DocumentDownloadKey documentDownloadIntentKey;
    private final List<InfoItem> infoItems;
    private final List<LegRow> legRows;
    private final BigDecimal limitPrice;
    private final OptionOrderDetailContext optionOrderDetailContext;
    private final OptionQuote optionQuote;
    private final String placeAgainComponentIdentifier;
    private final String placeAgainCtaStr;
    private final OptionOrderIntentKey placeOrderAgainIntentKey;
    private final boolean pnlUpdatesEnabled;
    private final boolean replaceButtonLoading;
    private final boolean showCancelButton;
    private final boolean showMultilegBidAskView;
    private final boolean showReplaceButton;
    private final boolean showSingleLegBidAskView;
    private final boolean startAlignStickyViewTradeConfirmationCta;
    private final StringResource statusText;
    private final CharSequence subtitle;
    private final int subtitleTextAppearanceAttr;
    private final String title;
    private final UiOptionOrder uiOptionOrder;

    public static /* synthetic */ OptionOrderDetailViewState copy$default(OptionOrderDetailViewState optionOrderDetailViewState, String str, StringResource stringResource, List list, boolean z, String str2, DocumentDownloadKey documentDownloadKey, List list2, List list3, BigDecimal bigDecimal, OptionOrderDetailContext optionOrderDetailContext, OptionQuote optionQuote, String str3, String str4, OptionOrderIntentKey optionOrderIntentKey, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, StringResource stringResource2, CharSequence charSequence, int i, String str5, UiOptionOrder uiOptionOrder, boolean z7, boolean z8, int i2, Object obj) {
        boolean z9;
        boolean z10;
        String str6 = (i2 & 1) != 0 ? optionOrderDetailViewState.accountNumber : str;
        StringResource stringResource3 = (i2 & 2) != 0 ? optionOrderDetailViewState.accountText : stringResource;
        List list4 = (i2 & 4) != 0 ? optionOrderDetailViewState.actionRows : list;
        boolean z11 = (i2 & 8) != 0 ? optionOrderDetailViewState.cancelButtonLoading : z;
        String str7 = (i2 & 16) != 0 ? optionOrderDetailViewState.chainSymbol : str2;
        DocumentDownloadKey documentDownloadKey2 = (i2 & 32) != 0 ? optionOrderDetailViewState.documentDownloadIntentKey : documentDownloadKey;
        List list5 = (i2 & 64) != 0 ? optionOrderDetailViewState.legRows : list2;
        List list6 = (i2 & 128) != 0 ? optionOrderDetailViewState.infoItems : list3;
        BigDecimal bigDecimal2 = (i2 & 256) != 0 ? optionOrderDetailViewState.limitPrice : bigDecimal;
        OptionOrderDetailContext optionOrderDetailContext2 = (i2 & 512) != 0 ? optionOrderDetailViewState.optionOrderDetailContext : optionOrderDetailContext;
        OptionQuote optionQuote2 = (i2 & 1024) != 0 ? optionOrderDetailViewState.optionQuote : optionQuote;
        String str8 = (i2 & 2048) != 0 ? optionOrderDetailViewState.placeAgainCtaStr : str3;
        String str9 = (i2 & 4096) != 0 ? optionOrderDetailViewState.placeAgainComponentIdentifier : str4;
        OptionOrderIntentKey optionOrderIntentKey2 = (i2 & 8192) != 0 ? optionOrderDetailViewState.placeOrderAgainIntentKey : optionOrderIntentKey;
        String str10 = str6;
        boolean z12 = (i2 & 16384) != 0 ? optionOrderDetailViewState.replaceButtonLoading : z2;
        boolean z13 = (i2 & 32768) != 0 ? optionOrderDetailViewState.showCancelButton : z3;
        boolean z14 = (i2 & 65536) != 0 ? optionOrderDetailViewState.showReplaceButton : z4;
        boolean z15 = (i2 & 131072) != 0 ? optionOrderDetailViewState.showMultilegBidAskView : z5;
        boolean z16 = (i2 & 262144) != 0 ? optionOrderDetailViewState.showSingleLegBidAskView : z6;
        StringResource stringResource4 = (i2 & 524288) != 0 ? optionOrderDetailViewState.statusText : stringResource2;
        CharSequence charSequence2 = (i2 & 1048576) != 0 ? optionOrderDetailViewState.subtitle : charSequence;
        int i3 = (i2 & 2097152) != 0 ? optionOrderDetailViewState.subtitleTextAppearanceAttr : i;
        String str11 = (i2 & 4194304) != 0 ? optionOrderDetailViewState.title : str5;
        UiOptionOrder uiOptionOrder2 = (i2 & 8388608) != 0 ? optionOrderDetailViewState.uiOptionOrder : uiOptionOrder;
        boolean z17 = (i2 & 16777216) != 0 ? optionOrderDetailViewState.startAlignStickyViewTradeConfirmationCta : z7;
        if ((i2 & 33554432) != 0) {
            z10 = z17;
            z9 = optionOrderDetailViewState.pnlUpdatesEnabled;
        } else {
            z9 = z8;
            z10 = z17;
        }
        return optionOrderDetailViewState.copy(str10, stringResource3, list4, z11, str7, documentDownloadKey2, list5, list6, bigDecimal2, optionOrderDetailContext2, optionQuote2, str8, str9, optionOrderIntentKey2, z12, z13, z14, z15, z16, stringResource4, charSequence2, i3, str11, uiOptionOrder2, z10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionOrderDetailContext getOptionOrderDetailContext() {
        return this.optionOrderDetailContext;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPlaceAgainCtaStr() {
        return this.placeAgainCtaStr;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPlaceAgainComponentIdentifier() {
        return this.placeAgainComponentIdentifier;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionOrderIntentKey getPlaceOrderAgainIntentKey() {
        return this.placeOrderAgainIntentKey;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getReplaceButtonLoading() {
        return this.replaceButtonLoading;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getShowReplaceButton() {
        return this.showReplaceButton;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getShowMultilegBidAskView() {
        return this.showMultilegBidAskView;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShowSingleLegBidAskView() {
        return this.showSingleLegBidAskView;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getAccountText() {
        return this.accountText;
    }

    /* renamed from: component20, reason: from getter */
    public final StringResource getStatusText() {
        return this.statusText;
    }

    /* renamed from: component21, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component22, reason: from getter */
    public final int getSubtitleTextAppearanceAttr() {
        return this.subtitleTextAppearanceAttr;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component24, reason: from getter */
    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getStartAlignStickyViewTradeConfirmationCta() {
        return this.startAlignStickyViewTradeConfirmationCta;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final List<ActionRow> component3() {
        return this.actionRows;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCancelButtonLoading() {
        return this.cancelButtonLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* renamed from: component6, reason: from getter */
    public final DocumentDownloadKey getDocumentDownloadIntentKey() {
        return this.documentDownloadIntentKey;
    }

    public final List<LegRow> component7() {
        return this.legRows;
    }

    public final List<InfoItem> component8() {
        return this.infoItems;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    public final OptionOrderDetailViewState copy(String accountNumber, StringResource accountText, List<ActionRow> actionRows, boolean cancelButtonLoading, String chainSymbol, DocumentDownloadKey documentDownloadIntentKey, List<LegRow> legRows, List<InfoItem> infoItems, BigDecimal limitPrice, OptionOrderDetailContext optionOrderDetailContext, OptionQuote optionQuote, String placeAgainCtaStr, String placeAgainComponentIdentifier, OptionOrderIntentKey placeOrderAgainIntentKey, boolean replaceButtonLoading, boolean showCancelButton, boolean showReplaceButton, boolean showMultilegBidAskView, boolean showSingleLegBidAskView, StringResource statusText, CharSequence subtitle, int subtitleTextAppearanceAttr, String title, UiOptionOrder uiOptionOrder, boolean startAlignStickyViewTradeConfirmationCta, boolean pnlUpdatesEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(actionRows, "actionRows");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(infoItems, "infoItems");
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        Intrinsics.checkNotNullParameter(placeAgainComponentIdentifier, "placeAgainComponentIdentifier");
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        return new OptionOrderDetailViewState(accountNumber, accountText, actionRows, cancelButtonLoading, chainSymbol, documentDownloadIntentKey, legRows, infoItems, limitPrice, optionOrderDetailContext, optionQuote, placeAgainCtaStr, placeAgainComponentIdentifier, placeOrderAgainIntentKey, replaceButtonLoading, showCancelButton, showReplaceButton, showMultilegBidAskView, showSingleLegBidAskView, statusText, subtitle, subtitleTextAppearanceAttr, title, uiOptionOrder, startAlignStickyViewTradeConfirmationCta, pnlUpdatesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderDetailViewState)) {
            return false;
        }
        OptionOrderDetailViewState optionOrderDetailViewState = (OptionOrderDetailViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionOrderDetailViewState.accountNumber) && Intrinsics.areEqual(this.accountText, optionOrderDetailViewState.accountText) && Intrinsics.areEqual(this.actionRows, optionOrderDetailViewState.actionRows) && this.cancelButtonLoading == optionOrderDetailViewState.cancelButtonLoading && Intrinsics.areEqual(this.chainSymbol, optionOrderDetailViewState.chainSymbol) && Intrinsics.areEqual(this.documentDownloadIntentKey, optionOrderDetailViewState.documentDownloadIntentKey) && Intrinsics.areEqual(this.legRows, optionOrderDetailViewState.legRows) && Intrinsics.areEqual(this.infoItems, optionOrderDetailViewState.infoItems) && Intrinsics.areEqual(this.limitPrice, optionOrderDetailViewState.limitPrice) && Intrinsics.areEqual(this.optionOrderDetailContext, optionOrderDetailViewState.optionOrderDetailContext) && Intrinsics.areEqual(this.optionQuote, optionOrderDetailViewState.optionQuote) && Intrinsics.areEqual(this.placeAgainCtaStr, optionOrderDetailViewState.placeAgainCtaStr) && Intrinsics.areEqual(this.placeAgainComponentIdentifier, optionOrderDetailViewState.placeAgainComponentIdentifier) && Intrinsics.areEqual(this.placeOrderAgainIntentKey, optionOrderDetailViewState.placeOrderAgainIntentKey) && this.replaceButtonLoading == optionOrderDetailViewState.replaceButtonLoading && this.showCancelButton == optionOrderDetailViewState.showCancelButton && this.showReplaceButton == optionOrderDetailViewState.showReplaceButton && this.showMultilegBidAskView == optionOrderDetailViewState.showMultilegBidAskView && this.showSingleLegBidAskView == optionOrderDetailViewState.showSingleLegBidAskView && Intrinsics.areEqual(this.statusText, optionOrderDetailViewState.statusText) && Intrinsics.areEqual(this.subtitle, optionOrderDetailViewState.subtitle) && this.subtitleTextAppearanceAttr == optionOrderDetailViewState.subtitleTextAppearanceAttr && Intrinsics.areEqual(this.title, optionOrderDetailViewState.title) && Intrinsics.areEqual(this.uiOptionOrder, optionOrderDetailViewState.uiOptionOrder) && this.startAlignStickyViewTradeConfirmationCta == optionOrderDetailViewState.startAlignStickyViewTradeConfirmationCta && this.pnlUpdatesEnabled == optionOrderDetailViewState.pnlUpdatesEnabled;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        StringResource stringResource = this.accountText;
        int iHashCode2 = (((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.actionRows.hashCode()) * 31) + Boolean.hashCode(this.cancelButtonLoading)) * 31) + this.chainSymbol.hashCode()) * 31;
        DocumentDownloadKey documentDownloadKey = this.documentDownloadIntentKey;
        int iHashCode3 = (iHashCode2 + (documentDownloadKey == null ? 0 : documentDownloadKey.hashCode())) * 31;
        List<LegRow> list = this.legRows;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.infoItems.hashCode()) * 31;
        BigDecimal bigDecimal = this.limitPrice;
        int iHashCode5 = (((iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.optionOrderDetailContext.hashCode()) * 31;
        OptionQuote optionQuote = this.optionQuote;
        int iHashCode6 = (iHashCode5 + (optionQuote == null ? 0 : optionQuote.hashCode())) * 31;
        String str = this.placeAgainCtaStr;
        int iHashCode7 = (((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.placeAgainComponentIdentifier.hashCode()) * 31;
        OptionOrderIntentKey optionOrderIntentKey = this.placeOrderAgainIntentKey;
        int iHashCode8 = (((((((((((iHashCode7 + (optionOrderIntentKey == null ? 0 : optionOrderIntentKey.hashCode())) * 31) + Boolean.hashCode(this.replaceButtonLoading)) * 31) + Boolean.hashCode(this.showCancelButton)) * 31) + Boolean.hashCode(this.showReplaceButton)) * 31) + Boolean.hashCode(this.showMultilegBidAskView)) * 31) + Boolean.hashCode(this.showSingleLegBidAskView)) * 31;
        StringResource stringResource2 = this.statusText;
        int iHashCode9 = (iHashCode8 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        CharSequence charSequence = this.subtitle;
        int iHashCode10 = (((iHashCode9 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.subtitleTextAppearanceAttr)) * 31;
        String str2 = this.title;
        return ((((((iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.uiOptionOrder.hashCode()) * 31) + Boolean.hashCode(this.startAlignStickyViewTradeConfirmationCta)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        String str = this.accountNumber;
        StringResource stringResource = this.accountText;
        List<ActionRow> list = this.actionRows;
        boolean z = this.cancelButtonLoading;
        String str2 = this.chainSymbol;
        DocumentDownloadKey documentDownloadKey = this.documentDownloadIntentKey;
        List<LegRow> list2 = this.legRows;
        List<InfoItem> list3 = this.infoItems;
        BigDecimal bigDecimal = this.limitPrice;
        OptionOrderDetailContext optionOrderDetailContext = this.optionOrderDetailContext;
        OptionQuote optionQuote = this.optionQuote;
        String str3 = this.placeAgainCtaStr;
        String str4 = this.placeAgainComponentIdentifier;
        OptionOrderIntentKey optionOrderIntentKey = this.placeOrderAgainIntentKey;
        boolean z2 = this.replaceButtonLoading;
        boolean z3 = this.showCancelButton;
        boolean z4 = this.showReplaceButton;
        boolean z5 = this.showMultilegBidAskView;
        boolean z6 = this.showSingleLegBidAskView;
        StringResource stringResource2 = this.statusText;
        CharSequence charSequence = this.subtitle;
        return "OptionOrderDetailViewState(accountNumber=" + str + ", accountText=" + stringResource + ", actionRows=" + list + ", cancelButtonLoading=" + z + ", chainSymbol=" + str2 + ", documentDownloadIntentKey=" + documentDownloadKey + ", legRows=" + list2 + ", infoItems=" + list3 + ", limitPrice=" + bigDecimal + ", optionOrderDetailContext=" + optionOrderDetailContext + ", optionQuote=" + optionQuote + ", placeAgainCtaStr=" + str3 + ", placeAgainComponentIdentifier=" + str4 + ", placeOrderAgainIntentKey=" + optionOrderIntentKey + ", replaceButtonLoading=" + z2 + ", showCancelButton=" + z3 + ", showReplaceButton=" + z4 + ", showMultilegBidAskView=" + z5 + ", showSingleLegBidAskView=" + z6 + ", statusText=" + stringResource2 + ", subtitle=" + ((Object) charSequence) + ", subtitleTextAppearanceAttr=" + this.subtitleTextAppearanceAttr + ", title=" + this.title + ", uiOptionOrder=" + this.uiOptionOrder + ", startAlignStickyViewTradeConfirmationCta=" + this.startAlignStickyViewTradeConfirmationCta + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    public OptionOrderDetailViewState(String accountNumber, StringResource stringResource, List<ActionRow> actionRows, boolean z, String chainSymbol, DocumentDownloadKey documentDownloadKey, List<LegRow> list, List<InfoItem> infoItems, BigDecimal bigDecimal, OptionOrderDetailContext optionOrderDetailContext, OptionQuote optionQuote, String str, String placeAgainComponentIdentifier, OptionOrderIntentKey optionOrderIntentKey, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, StringResource stringResource2, CharSequence charSequence, int i, String str2, UiOptionOrder uiOptionOrder, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(actionRows, "actionRows");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(infoItems, "infoItems");
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        Intrinsics.checkNotNullParameter(placeAgainComponentIdentifier, "placeAgainComponentIdentifier");
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        this.accountNumber = accountNumber;
        this.accountText = stringResource;
        this.actionRows = actionRows;
        this.cancelButtonLoading = z;
        this.chainSymbol = chainSymbol;
        this.documentDownloadIntentKey = documentDownloadKey;
        this.legRows = list;
        this.infoItems = infoItems;
        this.limitPrice = bigDecimal;
        this.optionOrderDetailContext = optionOrderDetailContext;
        this.optionQuote = optionQuote;
        this.placeAgainCtaStr = str;
        this.placeAgainComponentIdentifier = placeAgainComponentIdentifier;
        this.placeOrderAgainIntentKey = optionOrderIntentKey;
        this.replaceButtonLoading = z2;
        this.showCancelButton = z3;
        this.showReplaceButton = z4;
        this.showMultilegBidAskView = z5;
        this.showSingleLegBidAskView = z6;
        this.statusText = stringResource2;
        this.subtitle = charSequence;
        this.subtitleTextAppearanceAttr = i;
        this.title = str2;
        this.uiOptionOrder = uiOptionOrder;
        this.startAlignStickyViewTradeConfirmationCta = z7;
        this.pnlUpdatesEnabled = z8;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final StringResource getAccountText() {
        return this.accountText;
    }

    public final List<ActionRow> getActionRows() {
        return this.actionRows;
    }

    public final boolean getCancelButtonLoading() {
        return this.cancelButtonLoading;
    }

    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    public final DocumentDownloadKey getDocumentDownloadIntentKey() {
        return this.documentDownloadIntentKey;
    }

    public final List<LegRow> getLegRows() {
        return this.legRows;
    }

    public final List<InfoItem> getInfoItems() {
        return this.infoItems;
    }

    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    public final OptionOrderDetailContext getOptionOrderDetailContext() {
        return this.optionOrderDetailContext;
    }

    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    public final String getPlaceAgainCtaStr() {
        return this.placeAgainCtaStr;
    }

    public final String getPlaceAgainComponentIdentifier() {
        return this.placeAgainComponentIdentifier;
    }

    public final OptionOrderIntentKey getPlaceOrderAgainIntentKey() {
        return this.placeOrderAgainIntentKey;
    }

    public final boolean getReplaceButtonLoading() {
        return this.replaceButtonLoading;
    }

    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    public final boolean getShowReplaceButton() {
        return this.showReplaceButton;
    }

    public final boolean getShowMultilegBidAskView() {
        return this.showMultilegBidAskView;
    }

    public final boolean getShowSingleLegBidAskView() {
        return this.showSingleLegBidAskView;
    }

    public final StringResource getStatusText() {
        return this.statusText;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitleTextAppearanceAttr() {
        return this.subtitleTextAppearanceAttr;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UiOptionOrder getUiOptionOrder() {
        return this.uiOptionOrder;
    }

    public final boolean getStartAlignStickyViewTradeConfirmationCta() {
        return this.startAlignStickyViewTradeConfirmationCta;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* compiled from: OptionOrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$ActionRow;", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "labelResource", "Lcom/robinhood/utils/resource/StringResource;", "navigationKey", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/navigation/keys/NavigationKey;)V", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getLabelResource", "()Lcom/robinhood/utils/resource/StringResource;", "getNavigationKey", "()Lcom/robinhood/android/navigation/keys/NavigationKey;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionRow {
        public static final int $stable = 8;
        private final UserInteractionEventData.Action action;
        private final StringResource labelResource;
        private final NavigationKey navigationKey;

        public ActionRow(UserInteractionEventData.Action action, StringResource labelResource, NavigationKey navigationKey) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(labelResource, "labelResource");
            Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
            this.action = action;
            this.labelResource = labelResource;
            this.navigationKey = navigationKey;
        }

        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        public final StringResource getLabelResource() {
            return this.labelResource;
        }

        public final NavigationKey getNavigationKey() {
            return this.navigationKey;
        }
    }

    /* compiled from: OptionOrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$LegRow;", "", "clickable", "", "titleResource", "Lcom/robinhood/utils/resource/StringResource;", "subtitleResource", "quoteResource", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/navigation/keys/FragmentKey;Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;)V", "getClickable", "()Z", "getTitleResource", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitleResource", "getQuoteResource", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LegRow {
        public static final int $stable = 8;
        private final boolean clickable;
        private final FragmentKey fragmentKey;
        private final OptionOrderDetailLegContext loggingContext;
        private final StringResource quoteResource;
        private final StringResource subtitleResource;
        private final StringResource titleResource;

        public LegRow(boolean z, StringResource titleResource, StringResource subtitleResource, StringResource quoteResource, FragmentKey fragmentKey, OptionOrderDetailLegContext loggingContext) {
            Intrinsics.checkNotNullParameter(titleResource, "titleResource");
            Intrinsics.checkNotNullParameter(subtitleResource, "subtitleResource");
            Intrinsics.checkNotNullParameter(quoteResource, "quoteResource");
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.clickable = z;
            this.titleResource = titleResource;
            this.subtitleResource = subtitleResource;
            this.quoteResource = quoteResource;
            this.fragmentKey = fragmentKey;
            this.loggingContext = loggingContext;
        }

        public final boolean getClickable() {
            return this.clickable;
        }

        public final StringResource getTitleResource() {
            return this.titleResource;
        }

        public final StringResource getSubtitleResource() {
            return this.subtitleResource;
        }

        public final StringResource getQuoteResource() {
            return this.quoteResource;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final OptionOrderDetailLegContext getLoggingContext() {
            return this.loggingContext;
        }
    }

    /* compiled from: OptionOrderDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$InfoItem;", "", AnnotatedPrivateKey.LABEL, "", "value", "accountNumber", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "showGoldSavingsIcon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;Z)V", "getLabel", "()Ljava/lang/String;", "getValue", "getAccountNumber", "getProfitAndLossTradeItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getShowGoldSavingsIcon", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoItem {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String label;
        private final ProfitAndLossTradeItem profitAndLossTradeItem;
        private final boolean showGoldSavingsIcon;
        private final String value;

        public static /* synthetic */ InfoItem copy$default(InfoItem infoItem, String str, String str2, String str3, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoItem.label;
            }
            if ((i & 2) != 0) {
                str2 = infoItem.value;
            }
            if ((i & 4) != 0) {
                str3 = infoItem.accountNumber;
            }
            if ((i & 8) != 0) {
                profitAndLossTradeItem = infoItem.profitAndLossTradeItem;
            }
            if ((i & 16) != 0) {
                z = infoItem.showGoldSavingsIcon;
            }
            boolean z2 = z;
            String str4 = str3;
            return infoItem.copy(str, str2, str4, profitAndLossTradeItem, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
            return this.profitAndLossTradeItem;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowGoldSavingsIcon() {
            return this.showGoldSavingsIcon;
        }

        public final InfoItem copy(String label, String value, String accountNumber, ProfitAndLossTradeItem profitAndLossTradeItem, boolean showGoldSavingsIcon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new InfoItem(label, value, accountNumber, profitAndLossTradeItem, showGoldSavingsIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) other;
            return Intrinsics.areEqual(this.label, infoItem.label) && Intrinsics.areEqual(this.value, infoItem.value) && Intrinsics.areEqual(this.accountNumber, infoItem.accountNumber) && Intrinsics.areEqual(this.profitAndLossTradeItem, infoItem.profitAndLossTradeItem) && this.showGoldSavingsIcon == infoItem.showGoldSavingsIcon;
        }

        public int hashCode() {
            int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
            String str = this.accountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ProfitAndLossTradeItem profitAndLossTradeItem = this.profitAndLossTradeItem;
            return ((iHashCode2 + (profitAndLossTradeItem != null ? profitAndLossTradeItem.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGoldSavingsIcon);
        }

        public String toString() {
            return "InfoItem(label=" + this.label + ", value=" + this.value + ", accountNumber=" + this.accountNumber + ", profitAndLossTradeItem=" + this.profitAndLossTradeItem + ", showGoldSavingsIcon=" + this.showGoldSavingsIcon + ")";
        }

        public InfoItem(String label, String value, String str, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
            this.accountNumber = str;
            this.profitAndLossTradeItem = profitAndLossTradeItem;
            this.showGoldSavingsIcon = z;
        }

        public /* synthetic */ InfoItem(String str, String str2, String str3, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : profitAndLossTradeItem, (i & 16) != 0 ? false : z);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
            return this.profitAndLossTradeItem;
        }

        public final boolean getShowGoldSavingsIcon() {
            return this.showGoldSavingsIcon;
        }
    }
}
