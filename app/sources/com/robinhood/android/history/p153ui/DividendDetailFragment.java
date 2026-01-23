package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.drip.contracts.DripSettings;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentDividendDetailBinding;
import com.robinhood.android.history.p153ui.DividendDetailViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiDividend;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Dividend;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.InstrumentDripSettings;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.models.p355ui.UiDividend;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.models.util.Money;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: DividendDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\f\u0010 \u001a\u00020!*\u00020!H\u0002J\f\u0010\"\u001a\u00020!*\u00020!H\u0002J\f\u0010#\u001a\u00020!*\u00020!H\u0002J\f\u0010$\u001a\u00020!*\u00020!H\u0002J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010&\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020(H\u0002J\u0012\u0010*\u001a\u00020+2\b\b\u0001\u0010'\u001a\u00020(H\u0002J\"\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0011H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/history/databinding/FragmentDividendDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentDividendDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/history/ui/DividendDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/DividendDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onStart", "", "refreshUi", "viewState", "Lcom/robinhood/android/history/ui/DividendDetailViewState;", "bindTimeline", "uiDividend", "Lcom/robinhood/models/ui/UiDividend;", "bindDividendPaymentStatus", Card.Icon.DIVIDEND, "Lcom/robinhood/models/db/Dividend;", "bindDividendReinvestmentStatus", "setIconClose", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "setIconRefresh", "showIconCheckmark", "showIconNone", "bindAlertText", "bindAlertTextString", "stringRes", "", "bindShortAlertTextString", "buildAlertSpannable", "Landroid/text/Spannable;", "bindDripStatusButton", "shouldShowDripStatusButton", "", "uiInstrumentDripSettings", "Lcom/robinhood/models/ui/UiInstrumentDripSettings;", "accountNumber", "showDripHistoryUpsell", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DividendDetailFragment extends BaseDetailFragment {
    private static final String DIALOG_DRIP_HISTORY_UPSELL = "dripHistoryUpsell";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DividendDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentDividendDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DividendDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiDividend.State.values().length];
            try {
                iArr[ApiDividend.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDividend.State.VOIDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDividend.State.REVERTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDividend.State.PAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDividend.State.REINVESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDividend.State.REINVESTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiDividend.DripSkippedReason.values().length];
            try {
                iArr2[ApiDividend.DripSkippedReason.ACCOUNT_RESTRICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiDividend.DripSkippedReason.NO_FRACTIONAL_TRADABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiDividend.DripSkippedReason.INSUFFICIENT_BUYING_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiDividend.DripSkippedReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DividendDetailFragment() {
        super(C18359R.layout.fragment_dividend_detail);
        this.binding = ViewBinding5.viewBinding(this, DividendDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DividendDetailDuxo.class);
    }

    private final FragmentDividendDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDividendDetailBinding) value;
    }

    private final DividendDetailDuxo getDuxo() {
        return (DividendDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getDividendId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C183801(this));
    }

    /* compiled from: DividendDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.DividendDetailFragment$onStart$1 */
    /* synthetic */ class C183801 extends FunctionReferenceImpl implements Function1<DividendDetailViewState, Unit> {
        C183801(Object obj) {
            super(1, obj, DividendDetailFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/history/ui/DividendDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DividendDetailViewState dividendDetailViewState) {
            invoke2(dividendDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DividendDetailViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DividendDetailFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(DividendDetailViewState viewState) {
        String netCreditAmountString;
        DividendDetailViewState.RequiredPageState requiredPageState = viewState.getRequiredPageState();
        if (requiredPageState == null) {
            return;
        }
        UiEvent<String> showDripHistoryUpsell = viewState.getShowDripHistoryUpsell();
        if (showDripHistoryUpsell != null) {
            showDripHistoryUpsell.consumeWith(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DividendDetailFragment.refreshUi$lambda$0(this.f$0, (String) obj);
                }
            });
        }
        UiDividend uiDividend = requiredPageState.getUiDividend();
        Account account = requiredPageState.getAccount();
        List<Document> tradeConfirmDocs = requiredPageState.getTradeConfirmDocs();
        boolean shouldShowDripStatusButton = requiredPageState.getShouldShowDripStatusButton();
        Dividend dividend = uiDividend.getDividend();
        UiInstrumentDripSettings uiInstrumentDripSettings = requiredPageState.getUiInstrumentDripSettings();
        WithholdingAmount backupWithholdingResponse = requiredPageState.getBackupWithholdingResponse();
        setAccountNumber(account.getAccountNumber());
        RdsDataRowView dividendDate = getBinding().dividendDate;
        Intrinsics.checkNotNullExpressionValue(dividendDate, "dividendDate");
        dividendDate.setVisibility(8);
        RdsDataRowView dividendStatus = getBinding().dividendStatus;
        Intrinsics.checkNotNullExpressionValue(dividendStatus, "dividendStatus");
        dividendStatus.setVisibility(8);
        bindTimeline(uiDividend);
        bindAlertText(dividend);
        bindDripStatusButton(shouldShowDripStatusButton, uiInstrumentDripSettings, account.getAccountNumber());
        Money dripOrderExecutionPrice = dividend.getDripOrderExecutionPrice();
        BigDecimal dripOrderQuantity = dividend.getDripOrderQuantity();
        if (dripOrderExecutionPrice == null || dripOrderQuantity == null) {
            RdsDataRowView dividendReinvestmentAmount = getBinding().dividendReinvestmentAmount;
            Intrinsics.checkNotNullExpressionValue(dividendReinvestmentAmount, "dividendReinvestmentAmount");
            dividendReinvestmentAmount.setVisibility(8);
        } else {
            RdsDataRowView rdsDataRowView = getBinding().dividendReinvestmentAmount;
            Intrinsics.checkNotNull(rdsDataRowView);
            rdsDataRowView.setVisibility(0);
            rdsDataRowView.setValueText(getString(C18359R.string.dividend_detail_reinvestment_amount_value, Formats.getShareQuantityFormat().format(dripOrderQuantity), Formats.getPriceFormat().format(dripOrderExecutionPrice.getDecimalValue())));
            Intrinsics.checkNotNull(rdsDataRowView);
        }
        getExpandedToolbarTitleTxt().setText(uiDividend.getInstrumentName());
        RdsDataRowView rdsDataRowView2 = getBinding().dividendAccountUsed;
        StringResource title = AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsDataRowView2.setValueText(title.getText(resources).toString());
        getBinding().dividendNumOfShares.setValueText(Formats.getShareQuantityFormat().format(dividend.getPosition()));
        getBinding().dividendAmountPerShare.setValueText(Formats.getCurrencyFormat().format(dividend.getRate()));
        getBinding().dividendAmountWithheld.setValueText(Money.format$default(dividend.getWithholding(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        RdsDataRowView dividendAmountWithheld = getBinding().dividendAmountWithheld;
        Intrinsics.checkNotNullExpressionValue(dividendAmountWithheld, "dividendAmountWithheld");
        dividendAmountWithheld.setVisibility(!dividend.getWithholding().isZero() ? 0 : 8);
        RdsDataRowView rdsDataRowView3 = getBinding().dividendTotalAmount;
        if (backupWithholdingResponse == null || (netCreditAmountString = WithholdingAmount2.getNetCreditAmountString(backupWithholdingResponse, dividend.getAmount())) == null) {
            netCreditAmountString = Money.format$default(dividend.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        rdsDataRowView3.setValueText(netCreditAmountString);
        getBinding().dividendBackupWithholding.setVisibilityValueText(backupWithholdingResponse != null ? WithholdingAmount2.getBackupWithholdingAmountString(backupWithholdingResponse) : null);
        if (uiDividend.getInstrumentSymbol() != null) {
            String instrumentSymbol = uiDividend.getInstrumentSymbol();
            Intrinsics.checkNotNull(instrumentSymbol);
            BaseDetailFragment.setUnderlyingEquity$default(this, instrumentSymbol, null, 2, null);
        }
        RdsButton dripTradeConfirmationBtn = getBinding().dripTradeConfirmationBtn;
        Intrinsics.checkNotNullExpressionValue(dripTradeConfirmationBtn, "dripTradeConfirmationBtn");
        dripTradeConfirmationBtn.setVisibility(8);
        Order order = uiDividend.getOrder();
        final Document tradeConfirmation = order != null ? order.getTradeConfirmation(tradeConfirmDocs) : null;
        if (tradeConfirmation != null) {
            RdsButton dripTradeConfirmationBtn2 = getBinding().dripTradeConfirmationBtn;
            Intrinsics.checkNotNullExpressionValue(dripTradeConfirmationBtn2, "dripTradeConfirmationBtn");
            OnClickListeners.onClick(dripTradeConfirmationBtn2, new Function0() { // from class: com.robinhood.android.history.ui.DividendDetailFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DividendDetailFragment.refreshUi$lambda$2(this.f$0, tradeConfirmation);
                }
            });
            RdsButton dripTradeConfirmationBtn3 = getBinding().dripTradeConfirmationBtn;
            Intrinsics.checkNotNullExpressionValue(dripTradeConfirmationBtn3, "dripTradeConfirmationBtn");
            dripTradeConfirmationBtn3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$0(DividendDetailFragment dividendDetailFragment, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        dividendDetailFragment.showDripHistoryUpsell(accountNumber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$2(DividendDetailFragment dividendDetailFragment, Document document) {
        Navigator navigator = dividendDetailFragment.getNavigator();
        Context contextRequireContext = dividendDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void bindTimeline(UiDividend uiDividend) {
        Dividend dividend = uiDividend.getDividend();
        RdsTimelineRowView rdsTimelineRowView = getBinding().dividendStatusAnnouncement;
        Intrinsics.checkNotNull(rdsTimelineRowView);
        rdsTimelineRowView.setVisibility(0);
        rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_confirmed));
        rdsTimelineRowView.setTimestampText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(dividend.getInitiatedAt()));
        bindDividendPaymentStatus(dividend);
        bindDividendReinvestmentStatus(uiDividend);
    }

    private final void bindDividendPaymentStatus(Dividend dividend) {
        RdsTimelineRowView.Position position;
        RdsTimelineRowView.State state;
        RdsTimelineRowView rdsTimelineRowView = getBinding().dividendStatusDividendPayment;
        Intrinsics.checkNotNull(rdsTimelineRowView);
        rdsTimelineRowView.setVisibility(0);
        if (dividend.getDripEnabled()) {
            position = RdsTimelineRowView.Position.BETWEEN;
        } else {
            position = RdsTimelineRowView.Position.BOTTOM;
        }
        rdsTimelineRowView.setPosition(position);
        switch (WhenMappings.$EnumSwitchMapping$0[dividend.getState().ordinal()]) {
            case 1:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_pending));
                showIconNone(rdsTimelineRowView);
                return;
            case 2:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_voided));
                setIconClose(rdsTimelineRowView);
                return;
            case 3:
                if (dividend.getDripEnabled()) {
                    state = RdsTimelineRowView.State.COMPLETE;
                } else {
                    state = RdsTimelineRowView.State.NEXT;
                }
                rdsTimelineRowView.setState(state);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_reversed));
                setIconRefresh(rdsTimelineRowView);
                return;
            case 4:
            case 5:
            case 6:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.COMPLETE);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_paid));
                rdsTimelineRowView.setTimestampText(LocalDateFormatter.MEDIUM.format(dividend.getPayableDate()));
                showIconCheckmark(rdsTimelineRowView);
                return;
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(dividend.getState());
                throw new ExceptionsH();
        }
    }

    private final void bindDividendReinvestmentStatus(UiDividend uiDividend) {
        RdsTimelineRowView.State state;
        Instant lastExecutionDate;
        Dividend dividend = uiDividend.getDividend();
        if (!dividend.getDripEnabled()) {
            RdsTimelineRowView dividendStatusDividendReinvestment = getBinding().dividendStatusDividendReinvestment;
            Intrinsics.checkNotNullExpressionValue(dividendStatusDividendReinvestment, "dividendStatusDividendReinvestment");
            dividendStatusDividendReinvestment.setVisibility(8);
            return;
        }
        RdsTimelineRowView rdsTimelineRowView = getBinding().dividendStatusDividendReinvestment;
        Intrinsics.checkNotNull(rdsTimelineRowView);
        rdsTimelineRowView.setVisibility(0);
        String str = null;
        rdsTimelineRowView.setTimestampText(null);
        Order order = uiDividend.getOrder();
        if (order != null && (lastExecutionDate = order.getLastExecutionDate()) != null) {
            str = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) lastExecutionDate);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[dividend.getState().ordinal()]) {
            case 1:
            case 5:
                if (dividend.getState() == ApiDividend.State.PENDING) {
                    state = RdsTimelineRowView.State.INCOMPLETE;
                } else {
                    state = RdsTimelineRowView.State.NEXT;
                }
                rdsTimelineRowView.setState(state);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_pending));
                showIconNone(rdsTimelineRowView);
                return;
            case 2:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.INCOMPLETE);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_cancelled));
                rdsTimelineRowView.setTimestampText(str);
                showIconNone(rdsTimelineRowView);
                return;
            case 3:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                if (dividend.getDripOrderState() == ApiDividend.DripOrderState.FILLED) {
                    rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_reversed));
                    rdsTimelineRowView.setTimestampText(str);
                    setIconRefresh(rdsTimelineRowView);
                    return;
                } else {
                    rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_cancelled));
                    rdsTimelineRowView.setTimestampText(str);
                    setIconClose(rdsTimelineRowView);
                    return;
                }
            case 4:
                if (dividend.getDripOrderState() == ApiDividend.DripOrderState.CONFIRMED) {
                    rdsTimelineRowView.setState(RdsTimelineRowView.State.INCOMPLETE);
                    rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_pending));
                    showIconNone(rdsTimelineRowView);
                    return;
                }
                if (dividend.getDripSkippedReason() != null) {
                    rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                    rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_skipped));
                    rdsTimelineRowView.setTimestampText(str);
                    setIconClose(rdsTimelineRowView);
                    return;
                }
                if (dividend.getDripOrderState() == ApiDividend.DripOrderState.CANCELLED) {
                    rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                    rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_cancelled));
                    rdsTimelineRowView.setTimestampText(str);
                    setIconClose(rdsTimelineRowView);
                    return;
                }
                rdsTimelineRowView.setState(RdsTimelineRowView.State.NEXT);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_pending));
                showIconNone(rdsTimelineRowView);
                return;
            case 6:
                rdsTimelineRowView.setState(RdsTimelineRowView.State.COMPLETE);
                rdsTimelineRowView.setMetadataText(getString(C18359R.string.dividend_detail_timeline_status_filled));
                rdsTimelineRowView.setTimestampText(str);
                showIconCheckmark(rdsTimelineRowView);
                return;
            default:
                Preconditions.INSTANCE.failUnknownEnumKotlin(dividend.getState());
                throw new ExceptionsH();
        }
    }

    private final RdsTimelineRowView setIconClose(RdsTimelineRowView rdsTimelineRowView) {
        rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.OUTLINE);
        rdsTimelineRowView.setIconDrawable(ViewsKt.getDrawable(rdsTimelineRowView, C20690R.drawable.ic_rds_close_16dp));
        return rdsTimelineRowView;
    }

    private final RdsTimelineRowView setIconRefresh(RdsTimelineRowView rdsTimelineRowView) {
        rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.OUTLINE);
        rdsTimelineRowView.setIconDrawable(ViewsKt.getDrawable(rdsTimelineRowView, C20690R.drawable.ic_rds_repeat_16dp));
        return rdsTimelineRowView;
    }

    private final RdsTimelineRowView showIconCheckmark(RdsTimelineRowView rdsTimelineRowView) {
        rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.FILLED);
        rdsTimelineRowView.setIconDrawable(ViewsKt.getDrawable(rdsTimelineRowView, C20690R.drawable.ic_rds_checkmark_16dp));
        return rdsTimelineRowView;
    }

    private final RdsTimelineRowView showIconNone(RdsTimelineRowView rdsTimelineRowView) {
        rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.NONE);
        rdsTimelineRowView.setIconDrawable(null);
        return rdsTimelineRowView;
    }

    private final void bindAlertText(Dividend dividend) {
        RhTextView dividendAlertTxt = getBinding().dividendAlertTxt;
        Intrinsics.checkNotNullExpressionValue(dividendAlertTxt, "dividendAlertTxt");
        dividendAlertTxt.setVisibility(0);
        ApiDividend.DripSkippedReason dripSkippedReason = dividend.getDripSkippedReason();
        if (dividend.getState() == ApiDividend.State.VOIDED) {
            bindAlertTextString(C18359R.string.dividend_detail_drip_alert_voided);
            return;
        }
        if (dividend.getState() == ApiDividend.State.REVERTED) {
            if (dividend.getDripOrderUuid() == null) {
                bindAlertTextString(C18359R.string.dividend_detail_drip_alert_reversed);
                return;
            } else {
                bindAlertTextString(C18359R.string.dividend_detail_drip_alert_reversed_drip_cancelled);
                return;
            }
        }
        if (dripSkippedReason != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[dripSkippedReason.ordinal()];
            if (i == 1) {
                bindAlertTextString(C18359R.string.dividend_detail_drip_alert_drip_cancelled_account_restriction);
                return;
            }
            if (i == 2) {
                bindAlertTextString(C18359R.string.dividend_detail_drip_alert_drip_cancelled_fractional_tradability);
                return;
            } else if (i == 3) {
                bindAlertTextString(C18359R.string.f4180xc8210315);
                return;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (dividend.getDripOrderState() == ApiDividend.DripOrderState.CANCELLED) {
            bindAlertTextString(C18359R.string.dividend_detail_drip_alert_drip_cancelled);
        } else {
            if (dividend.getIsDebit()) {
                bindShortAlertTextString(C18359R.string.dividend_detail_short_charge_alert);
                return;
            }
            RhTextView dividendAlertTxt2 = getBinding().dividendAlertTxt;
            Intrinsics.checkNotNullExpressionValue(dividendAlertTxt2, "dividendAlertTxt");
            dividendAlertTxt2.setVisibility(8);
        }
    }

    private final void bindAlertTextString(int stringRes) {
        RhTextView dividendAlertTxt = getBinding().dividendAlertTxt;
        Intrinsics.checkNotNullExpressionValue(dividendAlertTxt, "dividendAlertTxt");
        TextViewsKt.setTextWithLearnMore((TextView) dividendAlertTxt, (CharSequence) buildAlertSpannable(stringRes), false, false, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.history.ui.DividendDetailFragment$bindAlertTextString$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Resources.NotFoundException {
                String string2 = this.this$0.getResources().getString(C18359R.string.drip_history_help_center_url);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    private final void bindShortAlertTextString(int stringRes) {
        RhTextView dividendAlertTxt = getBinding().dividendAlertTxt;
        Intrinsics.checkNotNullExpressionValue(dividendAlertTxt, "dividendAlertTxt");
        TextViewsKt.setTextWithLearnMore((TextView) dividendAlertTxt, (CharSequence) buildAlertSpannable(stringRes), true, true, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.history.ui.DividendDetailFragment$bindShortAlertTextString$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2 = this.this$0.getString(C18359R.string.dividend_detail_short_charge_learn_more_link);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    private final Spannable buildAlertSpannable(int stringRes) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(C18359R.string.dividend_detail_drip_alert_header));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(' ').append((CharSequence) getString(stringRes));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "append(...)");
        return spannableStringBuilderAppend;
    }

    private final void bindDripStatusButton(boolean shouldShowDripStatusButton, UiInstrumentDripSettings uiInstrumentDripSettings, final String accountNumber) {
        int i;
        InstrumentDripSettings instrumentDripSettings;
        if (!shouldShowDripStatusButton) {
            RdsButton dripStatusBtn = getBinding().dripStatusBtn;
            Intrinsics.checkNotNullExpressionValue(dripStatusBtn, "dripStatusBtn");
            dripStatusBtn.setVisibility(8);
            return;
        }
        RdsButton dripStatusBtn2 = getBinding().dripStatusBtn;
        Intrinsics.checkNotNullExpressionValue(dripStatusBtn2, "dripStatusBtn");
        dripStatusBtn2.setVisibility(0);
        RdsButton rdsButton = getBinding().dripStatusBtn;
        if (uiInstrumentDripSettings != null && (instrumentDripSettings = uiInstrumentDripSettings.getInstrumentDripSettings()) != null && instrumentDripSettings.getDripEnabled()) {
            i = C18359R.string.dividend_drip_status_enabled_button;
        } else {
            i = C18359R.string.dividend_drip_status_disabled_button;
        }
        rdsButton.setText(i);
        RdsButton dripStatusBtn3 = getBinding().dripStatusBtn;
        Intrinsics.checkNotNullExpressionValue(dripStatusBtn3, "dripStatusBtn");
        OnClickListeners.onClick(dripStatusBtn3, new Function0() { // from class: com.robinhood.android.history.ui.DividendDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DividendDetailFragment.bindDripStatusButton$lambda$13(this.f$0, accountNumber);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDripStatusButton$lambda$13(DividendDetailFragment dividendDetailFragment, String str) {
        Navigator navigator = dividendDetailFragment.getNavigator();
        Context contextRequireContext = dividendDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new DripSettings(str), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void showDripHistoryUpsell(String accountNumber) {
        DripHistoryUpsellBottomSheet dripHistoryUpsellBottomSheetNewInstance = DripHistoryUpsellBottomSheet.INSTANCE.newInstance(accountNumber);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dripHistoryUpsellBottomSheetNewInstance.show(childFragmentManager, DIALOG_DRIP_HISTORY_UPSELL);
    }

    /* compiled from: DividendDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailFragment$Args;", "Landroid/os/Parcelable;", "dividendId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDividendId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID dividendId;

        /* compiled from: DividendDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.dividendId);
        }

        public Args(UUID dividendId) {
            Intrinsics.checkNotNullParameter(dividendId, "dividendId");
            this.dividendId = dividendId;
        }

        public final UUID getDividendId() {
            return this.dividendId;
        }
    }

    /* compiled from: DividendDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/DividendDetailFragment;", "Lcom/robinhood/android/history/ui/DividendDetailFragment$Args;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DividendDetail;", "<init>", "()V", "DIALOG_DRIP_HISTORY_UPSELL", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DividendDetailFragment, Args>, FragmentResolver<LegacyFragmentKey.DividendDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DividendDetailFragment dividendDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dividendDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DividendDetailFragment newInstance(Args args) {
            return (DividendDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DividendDetailFragment dividendDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dividendDetailFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.DividendDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return DividendDetailFragment.INSTANCE.newInstance((Parcelable) new Args(key.getDividendId()));
        }
    }
}
