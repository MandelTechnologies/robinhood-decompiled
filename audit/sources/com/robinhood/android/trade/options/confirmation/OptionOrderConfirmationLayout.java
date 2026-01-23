package com.robinhood.android.trade.options.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.options.optionsstring.common.UiOptionOrders2;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment;
import com.robinhood.android.trade.options.databinding.IncludeOptionOrderConfirmationLayoutBinding;
import com.robinhood.android.trade.options.extensions.OptionOrderSource;
import com.robinhood.common.strings.OptionOrders;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderConfirmationLayout.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010r\u001a\u00020hH\u0014J\u0018\u0010s\u001a\u00020h2\u0006\u0010t\u001a\u00020S2\b\u0010u\u001a\u0004\u0018\u00010UJ\u0010\u0010v\u001a\u00020h2\b\u0010w\u001a\u0004\u0018\u00010WJ\u0010\u0010x\u001a\u00020h2\b\u0010X\u001a\u0004\u0018\u00010YJ\u000e\u0010y\u001a\u00020h2\u0006\u0010Z\u001a\u00020[J\u000e\u0010z\u001a\u00020h2\u0006\u0010\\\u001a\u00020[J \u0010{\u001a\u00020h2\u0018\u0010m\u001a\u0014\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020h0gJ\u001a\u0010|\u001a\u00020h2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020h0jJ\u001a\u0010}\u001a\u00020h2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020h0jJ\u0010\u0010~\u001a\u00020h2\b\u0010b\u001a\u0004\u0018\u00010cJ\u000f\u0010\u007f\u001a\u00020h2\u0007\u0010\u0080\u0001\u001a\u00020[J\u000f\u0010\u0081\u0001\u001a\u00020h2\u0006\u0010^\u001a\u00020[J\u000f\u0010\u0082\u0001\u001a\u00020h2\u0006\u0010d\u001a\u00020eJ\u0010\u0010\u0083\u0001\u001a\u00020h2\u0007\u0010\u0084\u0001\u001a\u00020kJ\u0012\u0010\u0085\u0001\u001a\u00020h2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010kJ\u0013\u0010\u0087\u0001\u001a\u00020h2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\u0013\u0010\u008a\u0001\u001a\u00020h2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\u0013\u0010\u008b\u0001\u001a\u00020h2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\u0011\u0010\u008c\u0001\u001a\u00020h2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u0010\u0010\u008f\u0001\u001a\u00020h2\u0007\u0010\u0090\u0001\u001a\u00020kJ\u0010\u0010\u0091\u0001\u001a\u00020h2\u0007\u0010\u0092\u0001\u001a\u00020kJ\u0010\u0010\u0093\u0001\u001a\u00020h2\u0007\u0010\u0094\u0001\u001a\u00020[J\t\u0010\u0095\u0001\u001a\u00020hH\u0002J\u001f\u0010\u0096\u0001\u001a\u00020h2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u0019\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u0011R\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001d\u0010\u0011R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b%\u0010\"R\u001b\u0010'\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b(\u0010\u0011R\u001b\u0010*\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b+\u0010\"R\u001b\u0010-\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b.\u0010\u0011R\u001b\u00100\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b1\u0010\"R\u001b\u00103\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\r\u001a\u0004\b4\u0010\u0011R\u001b\u00106\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\r\u001a\u0004\b7\u0010\"R\u001b\u00109\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\r\u001a\u0004\b:\u0010\u0011R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\r\u001a\u0004\bC\u0010DR\u001e\u0010F\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020[X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020[X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020[X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020[X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010f\u001a\u0016\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020h\u0018\u00010gX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010i\u001a\u0010\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020h\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010l\u001a\u0010\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020h\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010m\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010\r\u001a\u0004\bo\u0010p¨\u0006\u009a\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/trade/options/databinding/IncludeOptionOrderConfirmationLayoutBinding;", "getBinding", "()Lcom/robinhood/android/trade/options/databinding/IncludeOptionOrderConfirmationLayoutBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "quantityTxt", "Landroid/widget/TextView;", "getQuantityTxt", "()Landroid/widget/TextView;", "quantityTxt$delegate", "quantityLabelTxt", "getQuantityLabelTxt", "quantityLabelTxt$delegate", "totalCostTxt", "getTotalCostTxt", "totalCostTxt$delegate", "totalCostLabel", "getTotalCostLabel", "totalCostLabel$delegate", "bidAskTxt", "getBidAskTxt", "bidAskTxt$delegate", "bidAskGroup", "Landroidx/constraintlayout/widget/Group;", "getBidAskGroup", "()Landroidx/constraintlayout/widget/Group;", "bidAskGroup$delegate", "newPositionGroup", "getNewPositionGroup", "newPositionGroup$delegate", "releasedCollateralTxt", "getReleasedCollateralTxt", "releasedCollateralTxt$delegate", "releasedCollateralGroup", "getReleasedCollateralGroup", "releasedCollateralGroup$delegate", "collateralTxt", "getCollateralTxt", "collateralTxt$delegate", "collateralGroup", "getCollateralGroup", "collateralGroup$delegate", "commissionsTxt", "getCommissionsTxt", "commissionsTxt$delegate", "commissionsGroup", "getCommissionsGroup", "commissionsGroup$delegate", "summaryTxt", "getSummaryTxt", "summaryTxt$delegate", "okBtn", "Landroid/view/View;", "getOkBtn", "()Landroid/view/View;", "okBtn$delegate", "replaceOrderBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getReplaceOrderBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "replaceOrderBtn$delegate", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/TraderEventLogger;)V", "optionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "optionCollateral", "Lcom/robinhood/models/api/ApiCollateral;", "optionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "optionQuoteForBidAskRow", "Lcom/robinhood/models/db/OptionQuote;", "shouldShowCommissionsGroup", "", "shouldShowPostTradeOptionAlertHook", "disableL3EntryPointOverride", "isEligibleToShowL3EntryPoint", "shouldShowL3EntryPoint", "getShouldShowL3EntryPoint", "()Z", "marginAccountUpsell", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "source", "Lrosetta/option/OptionOrderFormSource;", "replaceOrderCallbacks", "Lkotlin/Function2;", "", "goToOptionsOnboardingCallbacks", "Lkotlin/Function1;", "", "showMarginAccountUpsellCallbacks", "callbacks", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "onFinishInflate", "bindOptionOrder", Card.Icon.ORDER, "collateral", "bindOptionPosition", "position", "bindQuoteForBidAskRow", "bindCommissionsGroupVisibility", "bindShouldShowPostTradeOptionAlertHook", "bindReplaceOrderCallbacks", "bindGoToOptionsOnboardingCallbacks", "bindShowMarginAccountUpsellCallbacks", "bindMarginAccountUpsell", "bindDisableL3EntryPointOverride", "shouldDisableL3EntryPoint", "bindIsEligibleToShowL3EntryPoint", "bindSource", "bindOrderConfirmationTitle", "orderConfirmationTitle", "bindOrderStatePromptText", "text", "bindFillPriceRow", "rowState", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;", "bindLimitPriceRow", "bindStopPriceRow", "bindFeeFooterState", "feeFooterState", "Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "bindTotalCreditOrCostLabel", "totalCreditOrCostLabelText", "bindTotalCreditOrCostValue", "totalCreditOrCostValueText", "bindReplaceOrderBtnVisible", "visible", "refreshUi", "bindAccountInfo", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationLayout extends Hammer_OptionOrderConfirmationLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "binding", "getBinding()Lcom/robinhood/android/trade/options/databinding/IncludeOptionOrderConfirmationLayoutBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "quantityTxt", "getQuantityTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "quantityLabelTxt", "getQuantityLabelTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "totalCostTxt", "getTotalCostTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "totalCostLabel", "getTotalCostLabel()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "bidAskTxt", "getBidAskTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "bidAskGroup", "getBidAskGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "newPositionGroup", "getNewPositionGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "releasedCollateralTxt", "getReleasedCollateralTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "releasedCollateralGroup", "getReleasedCollateralGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "collateralTxt", "getCollateralTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "collateralGroup", "getCollateralGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "commissionsTxt", "getCommissionsTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "commissionsGroup", "getCommissionsGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "summaryTxt", "getSummaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "okBtn", "getOkBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "replaceOrderBtn", "getReplaceOrderBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderConfirmationLayout.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: bidAskGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 bidAskGroup;

    /* renamed from: bidAskTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 bidAskTxt;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: collateralGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 collateralGroup;

    /* renamed from: collateralTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 collateralTxt;

    /* renamed from: commissionsGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 commissionsGroup;

    /* renamed from: commissionsTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 commissionsTxt;
    private boolean disableL3EntryPointOverride;
    public TraderEventLogger eventLogger;
    private Function1<? super String, Unit> goToOptionsOnboardingCallbacks;
    private boolean isEligibleToShowL3EntryPoint;
    private MarginAccountUpsellFragmentKey marginAccountUpsell;
    public TraderMarketHoursManager marketHoursManager;

    /* renamed from: newPositionGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 newPositionGroup;

    /* renamed from: okBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 okBtn;
    private ApiCollateral optionCollateral;
    private UiOptionOrder optionOrder;
    private UiAggregateOptionPositionFull optionPosition;
    private OptionQuote optionQuoteForBidAskRow;

    /* renamed from: quantityLabelTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 quantityLabelTxt;

    /* renamed from: quantityTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 quantityTxt;

    /* renamed from: releasedCollateralGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 releasedCollateralGroup;

    /* renamed from: releasedCollateralTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 releasedCollateralTxt;

    /* renamed from: replaceOrderBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 replaceOrderBtn;
    private Function2<? super UiOptionOrder, ? super RdsButton, Unit> replaceOrderCallbacks;
    private boolean shouldShowCommissionsGroup;
    private boolean shouldShowPostTradeOptionAlertHook;
    private Function1<? super MarginAccountUpsellFragmentKey, Unit> showMarginAccountUpsellCallbacks;
    private OptionOrderFormSource source;

    /* renamed from: summaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 summaryTxt;

    /* renamed from: totalCostLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalCostLabel;

    /* renamed from: totalCostTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalCostTxt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderConfirmationLayout(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, OptionOrderConfirmationLayout2.INSTANCE);
        this.quantityTxt = BindViewDelegate2.bindView$default(this, C29757R.id.share_quantity_txt, null, 2, null);
        this.quantityLabelTxt = BindViewDelegate2.bindView$default(this, C29757R.id.share_quantity_label_txt, null, 2, null);
        this.totalCostTxt = BindViewDelegate2.bindView$default(this, C29757R.id.total_cost_txt, null, 2, null);
        this.totalCostLabel = BindViewDelegate2.bindView$default(this, C29757R.id.total_cost_label_txt, null, 2, null);
        this.bidAskTxt = BindViewDelegate2.bindView$default(this, C29757R.id.bid_ask_txt, null, 2, null);
        this.bidAskGroup = BindViewDelegate2.bindView$default(this, C29757R.id.bid_ask_group, null, 2, null);
        this.newPositionGroup = BindViewDelegate2.bindView$default(this, C29757R.id.new_position_group, null, 2, null);
        this.releasedCollateralTxt = BindViewDelegate2.bindView$default(this, C29757R.id.released_collateral_txt, null, 2, null);
        this.releasedCollateralGroup = BindViewDelegate2.bindView$default(this, C29757R.id.released_collateral_group, null, 2, null);
        this.collateralTxt = BindViewDelegate2.bindView$default(this, C29757R.id.collateral_txt, null, 2, null);
        this.collateralGroup = BindViewDelegate2.bindView$default(this, C29757R.id.collateral_group, null, 2, null);
        this.commissionsTxt = BindViewDelegate2.bindView$default(this, C29757R.id.commissions_paid_txt, null, 2, null);
        this.commissionsGroup = BindViewDelegate2.bindView$default(this, C29757R.id.commissions_paid_group, null, 2, null);
        this.summaryTxt = BindViewDelegate2.bindView$default(this, C29757R.id.summary_txt, null, 2, null);
        this.okBtn = BindViewDelegate2.bindView$default(this, C29757R.id.ok_btn, null, 2, null);
        this.replaceOrderBtn = BindViewDelegate2.bindView$default(this, C29757R.id.replace_order_btn, null, 2, null);
        this.source = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOrderConfirmationFragment.Callbacks.class), new Function1<View, Object>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationLayout$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(View CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Context context2 = CallbacksProperty.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                for (Context context3 : BaseContexts.baseContexts(context2)) {
                    if (context3 instanceof OptionOrderConfirmationFragment.Callbacks) {
                        return context3;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final IncludeOptionOrderConfirmationLayoutBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeOptionOrderConfirmationLayoutBinding) value;
    }

    private final TextView getQuantityTxt() {
        return (TextView) this.quantityTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getQuantityLabelTxt() {
        return (TextView) this.quantityLabelTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getTotalCostTxt() {
        return (TextView) this.totalCostTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getTotalCostLabel() {
        return (TextView) this.totalCostLabel.getValue(this, $$delegatedProperties[4]);
    }

    private final TextView getBidAskTxt() {
        return (TextView) this.bidAskTxt.getValue(this, $$delegatedProperties[5]);
    }

    private final Group getBidAskGroup() {
        return (Group) this.bidAskGroup.getValue(this, $$delegatedProperties[6]);
    }

    private final Group getNewPositionGroup() {
        return (Group) this.newPositionGroup.getValue(this, $$delegatedProperties[7]);
    }

    private final TextView getReleasedCollateralTxt() {
        return (TextView) this.releasedCollateralTxt.getValue(this, $$delegatedProperties[8]);
    }

    private final Group getReleasedCollateralGroup() {
        return (Group) this.releasedCollateralGroup.getValue(this, $$delegatedProperties[9]);
    }

    private final TextView getCollateralTxt() {
        return (TextView) this.collateralTxt.getValue(this, $$delegatedProperties[10]);
    }

    private final Group getCollateralGroup() {
        return (Group) this.collateralGroup.getValue(this, $$delegatedProperties[11]);
    }

    private final TextView getCommissionsTxt() {
        return (TextView) this.commissionsTxt.getValue(this, $$delegatedProperties[12]);
    }

    private final Group getCommissionsGroup() {
        return (Group) this.commissionsGroup.getValue(this, $$delegatedProperties[13]);
    }

    private final TextView getSummaryTxt() {
        return (TextView) this.summaryTxt.getValue(this, $$delegatedProperties[14]);
    }

    private final View getOkBtn() {
        return (View) this.okBtn.getValue(this, $$delegatedProperties[15]);
    }

    private final RdsButton getReplaceOrderBtn() {
        return (RdsButton) this.replaceOrderBtn.getValue(this, $$delegatedProperties[16]);
    }

    public final TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    public final void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    public final TraderEventLogger getEventLogger() {
        TraderEventLogger traderEventLogger = this.eventLogger;
        if (traderEventLogger != null) {
            return traderEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "<set-?>");
        this.eventLogger = traderEventLogger;
    }

    private final boolean getShouldShowL3EntryPoint() {
        return this.isEligibleToShowL3EntryPoint && !this.disableL3EntryPointOverride;
    }

    private final OptionOrderConfirmationFragment.Callbacks getCallbacks() {
        return (OptionOrderConfirmationFragment.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[17]);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(getReplaceOrderBtn(), new Function0() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderConfirmationLayout.onFinishInflate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(OptionOrderConfirmationLayout optionOrderConfirmationLayout) {
        UiOptionOrder uiOptionOrder = optionOrderConfirmationLayout.optionOrder;
        if (uiOptionOrder == null) {
            return Unit.INSTANCE;
        }
        TraderEventLogger eventLogger = optionOrderConfirmationLayout.getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.REPLACE_ORDER;
        String string2 = uiOptionOrder.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str = null;
        String str2 = null;
        String str3 = null;
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(eventLogger, orderFormStep, null, new OptionOrderMeta(str, str2, str3, OptionOrderSource.toMetaSource(optionOrderConfirmationLayout.source), uiOptionOrder.getOptionChain().getSymbol(), string2, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Function2<? super UiOptionOrder, ? super RdsButton, Unit> function2 = optionOrderConfirmationLayout.replaceOrderCallbacks;
        if (function2 != null) {
            function2.invoke(uiOptionOrder, optionOrderConfirmationLayout.getReplaceOrderBtn());
        }
        return Unit.INSTANCE;
    }

    public final void bindOptionOrder(UiOptionOrder order, ApiCollateral collateral) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.optionOrder = order;
        this.optionCollateral = collateral;
        refreshUi();
    }

    public final void bindOptionPosition(UiAggregateOptionPositionFull position) {
        this.optionPosition = position;
        refreshUi();
    }

    public final void bindQuoteForBidAskRow(OptionQuote optionQuoteForBidAskRow) {
        this.optionQuoteForBidAskRow = optionQuoteForBidAskRow;
        refreshUi();
    }

    public final void bindCommissionsGroupVisibility(boolean shouldShowCommissionsGroup) {
        this.shouldShowCommissionsGroup = shouldShowCommissionsGroup;
        refreshUi();
    }

    public final void bindShouldShowPostTradeOptionAlertHook(boolean shouldShowPostTradeOptionAlertHook) {
        this.shouldShowPostTradeOptionAlertHook = shouldShowPostTradeOptionAlertHook;
        refreshUi();
    }

    public final void bindReplaceOrderCallbacks(Function2<? super UiOptionOrder, ? super RdsButton, Unit> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.replaceOrderCallbacks = callbacks;
    }

    public final void bindGoToOptionsOnboardingCallbacks(Function1<? super String, Unit> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.goToOptionsOnboardingCallbacks = callbacks;
    }

    public final void bindShowMarginAccountUpsellCallbacks(Function1<? super MarginAccountUpsellFragmentKey, Unit> showMarginAccountUpsellCallbacks) {
        Intrinsics.checkNotNullParameter(showMarginAccountUpsellCallbacks, "showMarginAccountUpsellCallbacks");
        this.showMarginAccountUpsellCallbacks = showMarginAccountUpsellCallbacks;
    }

    public final void bindMarginAccountUpsell(MarginAccountUpsellFragmentKey marginAccountUpsell) {
        this.marginAccountUpsell = marginAccountUpsell;
    }

    public final void bindDisableL3EntryPointOverride(boolean shouldDisableL3EntryPoint) {
        this.disableL3EntryPointOverride = shouldDisableL3EntryPoint;
    }

    public final void bindIsEligibleToShowL3EntryPoint(boolean isEligibleToShowL3EntryPoint) {
        this.isEligibleToShowL3EntryPoint = isEligibleToShowL3EntryPoint;
    }

    public final void bindSource(OptionOrderFormSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    public final void bindOrderConfirmationTitle(String orderConfirmationTitle) {
        Intrinsics.checkNotNullParameter(orderConfirmationTitle, "orderConfirmationTitle");
        getBinding().orderStatusTxt.setText(orderConfirmationTitle);
    }

    public final void bindOrderStatePromptText(String text) {
        RhTextView orderStatusPromptTxt = getBinding().orderStatusPromptTxt;
        Intrinsics.checkNotNullExpressionValue(orderStatusPromptTxt, "orderStatusPromptTxt");
        TextViewsKt.setVisibilityText(orderStatusPromptTxt, text);
    }

    public final void bindFillPriceRow(OptionOrderConfirmationRowState rowState) {
        RhTextView fillPriceLabelTxt = getBinding().fillPriceLabelTxt;
        Intrinsics.checkNotNullExpressionValue(fillPriceLabelTxt, "fillPriceLabelTxt");
        TextViewsKt.setVisibilityText(fillPriceLabelTxt, rowState != null ? rowState.getLabel() : null);
        RhTextView fillPriceTxt = getBinding().fillPriceTxt;
        Intrinsics.checkNotNullExpressionValue(fillPriceTxt, "fillPriceTxt");
        TextViewsKt.setVisibilityText(fillPriceTxt, rowState != null ? rowState.getValue() : null);
        View fillPriceDivider = getBinding().fillPriceDivider;
        Intrinsics.checkNotNullExpressionValue(fillPriceDivider, "fillPriceDivider");
        fillPriceDivider.setVisibility(rowState != null ? 0 : 8);
    }

    public final void bindLimitPriceRow(OptionOrderConfirmationRowState rowState) {
        if (rowState == null) {
            Group limitPriceGroup = getBinding().limitPriceGroup;
            Intrinsics.checkNotNullExpressionValue(limitPriceGroup, "limitPriceGroup");
            limitPriceGroup.setVisibility(8);
        } else {
            Group limitPriceGroup2 = getBinding().limitPriceGroup;
            Intrinsics.checkNotNullExpressionValue(limitPriceGroup2, "limitPriceGroup");
            limitPriceGroup2.setVisibility(0);
            getBinding().limitPriceLabelTxt.setText(rowState.getLabel());
            getBinding().limitPriceTxt.setText(rowState.getValue());
        }
    }

    public final void bindStopPriceRow(OptionOrderConfirmationRowState rowState) {
        if (rowState == null) {
            Group stopPriceGroup = getBinding().stopPriceGroup;
            Intrinsics.checkNotNullExpressionValue(stopPriceGroup, "stopPriceGroup");
            stopPriceGroup.setVisibility(8);
        } else {
            Group stopPriceGroup2 = getBinding().stopPriceGroup;
            Intrinsics.checkNotNullExpressionValue(stopPriceGroup2, "stopPriceGroup");
            stopPriceGroup2.setVisibility(0);
            getBinding().stopPriceLabelTxt.setText(rowState.getLabel());
            getBinding().stopPriceTxt.setText(rowState.getValue());
        }
    }

    public final void bindFeeFooterState(FeeFooterState feeFooterState) {
        Intrinsics.checkNotNullParameter(feeFooterState, "feeFooterState");
        getBinding().feeFooter.bind(feeFooterState);
    }

    public final void bindTotalCreditOrCostLabel(String totalCreditOrCostLabelText) {
        Intrinsics.checkNotNullParameter(totalCreditOrCostLabelText, "totalCreditOrCostLabelText");
        getTotalCostLabel().setText(totalCreditOrCostLabelText);
    }

    public final void bindTotalCreditOrCostValue(String totalCreditOrCostValueText) {
        Intrinsics.checkNotNullParameter(totalCreditOrCostValueText, "totalCreditOrCostValueText");
        getTotalCostTxt().setText(totalCreditOrCostValueText);
    }

    public final void bindReplaceOrderBtnVisible(boolean visible) {
        getReplaceOrderBtn().setVisibility(visible ? 0 : 8);
    }

    private final void refreshUi() {
        String displayString;
        UiOptionOrder uiOptionOrder = this.optionOrder;
        if (uiOptionOrder == null) {
            return;
        }
        OptionOrder optionOrder = uiOptionOrder.getOptionOrder();
        Context context = getContext();
        ApiCollateral apiCollateral = this.optionCollateral;
        Resources resources = getResources();
        TextView quantityLabelTxt = getQuantityLabelTxt();
        Intrinsics.checkNotNull(resources);
        quantityLabelTxt.setText(UiOptionOrders2.getConfirmationQuantityLabel(uiOptionOrder, resources));
        getQuantityTxt().setText(UiOptionOrders2.getConfirmationQuantityText(uiOptionOrder, resources));
        OptionQuote optionQuote = this.optionQuoteForBidAskRow;
        if (optionQuote == null) {
            getBidAskGroup().setVisibility(8);
        } else {
            getBidAskGroup().setVisibility(0);
            getBidAskTxt().setText(resources.getString(C29757R.string.option_order_bid_ask, Formats.getPriceFormat().format(optionQuote.getBidPrice().getRawValue()), Formats.getPriceFormat().format(optionQuote.getAskPrice().getRawValue())));
        }
        getCommissionsGroup().setVisibility(this.shouldShowCommissionsGroup ? 0 : 8);
        UiAggregateOptionPositionFull uiAggregateOptionPosition2 = this.optionPosition;
        if (uiAggregateOptionPosition2 == null) {
            getNewPositionGroup().setVisibility(8);
        } else {
            getNewPositionGroup().setVisibility(0);
            int iIntValue = uiAggregateOptionPosition2.getAggregateOptionPosition().getDisplayQuantity().intValue();
            getBinding().newPositionTxt.setText(resources.getQuantityString(C29757R.plurals.option_order_new_position_value, iIntValue, Integer.valueOf(iIntValue)));
        }
        String displayString2 = null;
        if (apiCollateral != null) {
            Intrinsics.checkNotNull(context);
            displayString = OptionExtensions.getDisplayString(apiCollateral, context, OrderDirection.CREDIT);
        } else {
            displayString = null;
        }
        if (displayString == null || StringsKt.isBlank(displayString)) {
            getReleasedCollateralGroup().setVisibility(8);
        } else {
            getReleasedCollateralGroup().setVisibility(0);
            getReleasedCollateralTxt().setText(displayString);
        }
        if (apiCollateral != null) {
            Intrinsics.checkNotNull(context);
            displayString2 = OptionExtensions.getDisplayString(apiCollateral, context, OrderDirection.DEBIT);
        }
        if (displayString2 == null || StringsKt.isBlank(displayString2)) {
            getCollateralGroup().setVisibility(8);
        } else {
            getCollateralGroup().setVisibility(0);
            getCollateralTxt().setText(displayString2);
        }
        getCommissionsTxt().setText(Formats.getPriceFormat().format(0));
        TextView summaryTxt = getSummaryTxt();
        if (optionOrder.getState() != OrderState.QUEUED || getMarketHoursManager().areMarketsOpenExtended()) {
            summaryTxt.setVisibility(8);
        } else {
            summaryTxt.setVisibility(0);
            Intrinsics.checkNotNull(context);
            summaryTxt.setText(OptionOrders.getAfterHoursSummaryString(optionOrder, context));
        }
        OnClickListeners.onClick(getOkBtn(), new Function0() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderConfirmationLayout.refreshUi$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$2(OptionOrderConfirmationLayout optionOrderConfirmationLayout) {
        String accountNumber;
        if (optionOrderConfirmationLayout.getShouldShowL3EntryPoint()) {
            UiOptionOrder uiOptionOrder = optionOrderConfirmationLayout.optionOrder;
            if (uiOptionOrder == null || (accountNumber = uiOptionOrder.getAccountNumber()) == null) {
                return Unit.INSTANCE;
            }
            Function1<? super String, Unit> function1 = optionOrderConfirmationLayout.goToOptionsOnboardingCallbacks;
            if (function1 != null) {
                function1.invoke(accountNumber);
            }
        } else if (optionOrderConfirmationLayout.shouldShowPostTradeOptionAlertHook) {
            optionOrderConfirmationLayout.getCallbacks().onStartPostConfirmationFlow();
        } else {
            MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey = optionOrderConfirmationLayout.marginAccountUpsell;
            if (marginAccountUpsellFragmentKey == null) {
                AppCompatActivity activityContext = ViewsKt.getActivityContext(optionOrderConfirmationLayout);
                if (activityContext != null) {
                    activityContext.finish();
                }
            } else {
                if (marginAccountUpsellFragmentKey == null) {
                    return Unit.INSTANCE;
                }
                Function1<? super MarginAccountUpsellFragmentKey, Unit> function12 = optionOrderConfirmationLayout.showMarginAccountUpsellCallbacks;
                if (function12 != null) {
                    function12.invoke(marginAccountUpsellFragmentKey);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void bindAccountInfo(StringResource title, StringResource subtitle) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2 = null;
        if (title != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = title.getText(resources);
        } else {
            text = null;
        }
        if (subtitle != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = subtitle.getText(resources2);
        }
        boolean z = true;
        boolean z2 = text == null || StringsKt.isBlank(text);
        if (text2 != null && !StringsKt.isBlank(text2)) {
            z = false;
        }
        LinearLayout accountRow = getBinding().accountRow;
        Intrinsics.checkNotNullExpressionValue(accountRow, "accountRow");
        accountRow.setVisibility(!z2 ? 0 : 8);
        getBinding().accountNameTitle.setText(text);
        TextView accountNameTitle = getBinding().accountNameTitle;
        Intrinsics.checkNotNullExpressionValue(accountNameTitle, "accountNameTitle");
        accountNameTitle.setVisibility(!z2 ? 0 : 8);
        getBinding().accountNameSubtitle.setText(text2);
        TextView accountNameSubtitle = getBinding().accountNameSubtitle;
        Intrinsics.checkNotNullExpressionValue(accountNameSubtitle, "accountNameSubtitle");
        accountNameSubtitle.setVisibility(!z ? 0 : 8);
        View accountDivider = getBinding().accountDivider;
        Intrinsics.checkNotNullExpressionValue(accountDivider, "accountDivider");
        accountDivider.setVisibility(z2 ? 8 : 0);
    }
}
