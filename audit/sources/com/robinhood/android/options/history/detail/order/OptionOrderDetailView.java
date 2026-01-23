package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.history.detail.extensions.UiOptionOrders;
import com.robinhood.android.options.optionsstring.common.UiOptionOrders2;
import com.robinhood.common.strings.OptionOrders;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderExecution;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderDetailView.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\b\u0010W\u001a\u00020XH\u0014J\b\u0010Y\u001a\u00020XH\u0014J\u000e\u0010Z\u001a\u00020X2\u0006\u00105\u001a\u000206J\b\u0010[\u001a\u00020XH\u0002J\u0010\u0010\\\u001a\u00020X2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010]\u001a\u00020X2\u0006\u00105\u001a\u000206H\u0002J\b\u0010^\u001a\u00020XH\u0002J\u0018\u0010_\u001a\u00020X2\u0006\u00105\u001a\u0002062\u0006\u0010`\u001a\u00020aH\u0002J\u0010\u0010b\u001a\u00020X2\u0006\u0010c\u001a\u000209H\u0002J\b\u0010d\u001a\u00020XH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010<\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u000106060=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "getBackupWithholdingStore", "()Lcom/robinhood/store/base/BackupWithholdingStore;", "setBackupWithholdingStore", "(Lcom/robinhood/store/base/BackupWithholdingStore;)V", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "getDocumentStore", "()Lcom/robinhood/librobinhood/data/store/DocumentStore;", "setDocumentStore", "(Lcom/robinhood/librobinhood/data/store/DocumentStore;)V", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "setPositionStore", "(Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/TraderEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/TraderEventLogger;)V", "account", "Lcom/robinhood/models/db/Account;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "documents", "", "Lcom/robinhood/models/db/Document;", "withholdingAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "orderRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "accountUsedSection", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "sideTxt", "effectTxt", "timeInForceTxt", "submittedTxt", "stateTxt", "limitPriceTxt", "stopPriceTxt", "quantityTxt", "filledTxt", "filledQuantityTxt", "totalTxt", "backupWithholdingSection", "netCreditSection", "multilegParent", "Landroid/view/ViewGroup;", "multilegSentinel", "Landroid/view/View;", "tradeConfirmBtn", "replaceOrderBtn", "cancelBtn", "onFinishInflate", "", "onAttachedToWindow", "bind", "refreshUi", "setSingleLegUi", "setMultiLegUi", "deleteOldMultilegViews", "addLegUi", "legIndex", "", "onTradeConfirmClicked", "document", "onCancelClicked", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOrderDetailView extends Hammer_OptionOrderDetailView {
    public static final int $stable = 8;
    private Account account;
    public AccountProvider accountProvider;
    private final RdsDataRowView accountUsedSection;
    private final RdsDataRowView backupWithholdingSection;
    public BackupWithholdingStore backupWithholdingStore;
    private final View cancelBtn;
    public DocumentStore documentStore;
    private List<Document> documents;
    private final RdsDataRowView effectTxt;
    public TraderEventLogger eventLogger;
    private final RdsDataRowView filledQuantityTxt;
    private final RdsDataRowView filledTxt;
    private final RdsDataRowView limitPriceTxt;
    private final ShimmerLoadingView loadingView;
    private final ViewGroup multilegParent;
    private final View multilegSentinel;
    public Navigator navigator;
    private final RdsDataRowView netCreditSection;
    public OptionOrderStore optionOrderStore;
    private final BehaviorRelay<UiOptionOrder> orderRelay;
    public PositionStore positionStore;
    private final RdsDataRowView quantityTxt;
    private final View replaceOrderBtn;
    private final RdsDataRowView sideTxt;
    private final RdsDataRowView stateTxt;
    private final RdsDataRowView stopPriceTxt;
    private final RdsDataRowView submittedTxt;
    private final RdsDataRowView timeInForceTxt;
    private final RdsDataRowView totalTxt;
    private final View tradeConfirmBtn;
    private UiOptionOrder uiOptionOrder;
    private WithholdingAmount withholdingAmountResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.documents = CollectionsKt.emptyList();
        BehaviorRelay<UiOptionOrder> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.orderRelay = behaviorRelayCreate;
        ViewGroups.inflate(this, C23086R.layout.merge_option_order_detail_view, true);
        View viewFindViewById = findViewById(C23086R.id.loading_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.loadingView = (ShimmerLoadingView) viewFindViewById;
        View viewFindViewById2 = findViewById(C23086R.id.option_order_detail_account_used);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.accountUsedSection = (RdsDataRowView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C23086R.id.option_order_detail_side);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.sideTxt = (RdsDataRowView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C23086R.id.option_order_detail_effect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.effectTxt = (RdsDataRowView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C23086R.id.option_order_detail_time_in_force);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.timeInForceTxt = (RdsDataRowView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C23086R.id.option_order_detail_submitted);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.submittedTxt = (RdsDataRowView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C23086R.id.option_order_detail_state);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.stateTxt = (RdsDataRowView) viewFindViewById7;
        View viewFindViewById8 = findViewById(C23086R.id.option_order_detail_limit_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.limitPriceTxt = (RdsDataRowView) viewFindViewById8;
        View viewFindViewById9 = findViewById(C23086R.id.option_order_detail_stop_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.stopPriceTxt = (RdsDataRowView) viewFindViewById9;
        View viewFindViewById10 = findViewById(C23086R.id.option_order_detail_quantity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.quantityTxt = (RdsDataRowView) viewFindViewById10;
        View viewFindViewById11 = findViewById(C23086R.id.option_order_detail_filled);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.filledTxt = (RdsDataRowView) viewFindViewById11;
        View viewFindViewById12 = findViewById(C23086R.id.option_order_detail_filled_quantity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.filledQuantityTxt = (RdsDataRowView) viewFindViewById12;
        View viewFindViewById13 = findViewById(C23086R.id.option_order_detail_total);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.totalTxt = (RdsDataRowView) viewFindViewById13;
        View viewFindViewById14 = findViewById(C23086R.id.option_order_detail_backup_withholding);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.backupWithholdingSection = (RdsDataRowView) viewFindViewById14;
        View viewFindViewById15 = findViewById(C23086R.id.option_order_detail_net_credit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.netCreditSection = (RdsDataRowView) viewFindViewById15;
        View viewFindViewById16 = findViewById(C23086R.id.option_order_detail_parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.multilegParent = (ViewGroup) viewFindViewById16;
        View viewFindViewById17 = findViewById(C23086R.id.option_order_detail_multileg_sentinel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.multilegSentinel = viewFindViewById17;
        View viewFindViewById18 = findViewById(C23086R.id.option_order_detail_trade_confirm_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.tradeConfirmBtn = viewFindViewById18;
        View viewFindViewById19 = findViewById(C23086R.id.option_order_detail_replace_order_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.replaceOrderBtn = viewFindViewById19;
        View viewFindViewById20 = findViewById(C23086R.id.option_order_detail_cancel_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        this.cancelBtn = viewFindViewById20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final BackupWithholdingStore getBackupWithholdingStore() {
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore;
        if (backupWithholdingStore != null) {
            return backupWithholdingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backupWithholdingStore");
        return null;
    }

    public final void setBackupWithholdingStore(BackupWithholdingStore backupWithholdingStore) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "<set-?>");
        this.backupWithholdingStore = backupWithholdingStore;
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
    }

    public final DocumentStore getDocumentStore() {
        DocumentStore documentStore = this.documentStore;
        if (documentStore != null) {
            return documentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentStore");
        return null;
    }

    public final void setDocumentStore(DocumentStore documentStore) {
        Intrinsics.checkNotNullParameter(documentStore, "<set-?>");
        this.documentStore = documentStore;
    }

    public final PositionStore getPositionStore() {
        PositionStore positionStore = this.positionStore;
        if (positionStore != null) {
            return positionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionStore");
        return null;
    }

    public final void setPositionStore(PositionStore positionStore) {
        Intrinsics.checkNotNullParameter(positionStore, "<set-?>");
        this.positionStore = positionStore;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
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

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(this.cancelBtn, new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderDetailView.onFinishInflate$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(this.replaceOrderBtn, new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderDetailView.onFinishInflate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(OptionOrderDetailView optionOrderDetailView) {
        optionOrderDetailView.onCancelClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(OptionOrderDetailView optionOrderDetailView) {
        OptionChain optionChain;
        TraderEventLogger eventLogger = optionOrderDetailView.getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.REPLACE_ORDER;
        UiOptionOrder uiOptionOrder = optionOrderDetailView.uiOptionOrder;
        String stringOrEmpty = Uuids.toStringOrEmpty(uiOptionOrder != null ? uiOptionOrder.getId() : null);
        UiOptionOrder uiOptionOrder2 = optionOrderDetailView.uiOptionOrder;
        String symbol = (uiOptionOrder2 == null || (optionChain = uiOptionOrder2.getOptionChain()) == null) ? null : optionChain.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(eventLogger, orderFormStep, null, new OptionOrderMeta(null, null, null, OptionOrderMeta.Source.SOURCE_ORDER_DETAIL, symbol, stringOrEmpty, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Context context = optionOrderDetailView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Navigator navigator = optionOrderDetailView.getNavigator();
        FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UiOptionOrder uiOptionOrder3 = optionOrderDetailView.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder3);
        UUID id = uiOptionOrder3.getOptionOrder().getId();
        UiOptionOrder uiOptionOrder4 = optionOrderDetailView.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder4);
        String accountNumber = uiOptionOrder4.getAccountNumber();
        OptionOrderFormSource optionOrderFormSource = OptionOrderFormSource.ORDER_DETAIL;
        UiOptionOrder uiOptionOrder5 = optionOrderDetailView.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder5);
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ReplaceOptionOrder(appCompatActivityRequireActivityBaseContext, supportFragmentManager, id, accountNumber, false, optionOrderFormSource, uiOptionOrder5.getOptionChain().getSymbol()), null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<R> observableSwitchMap = this.orderRelay.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Document>> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                LocalDate localDateMo3459a = order.getOptionOrder().getUpdatedAt().atZone(ZoneIds.INSTANCE.getNEW_YORK()).mo3459a();
                DocumentStore documentStore = OptionOrderDetailView.this.getDocumentStore();
                String accountNumber = order.getAccountNumber();
                Intrinsics.checkNotNull(localDateMo3459a);
                return documentStore.getTradeConfirms(accountNumber, localDateMo3459a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailView.onAttachedToWindow$lambda$2(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged = this.orderRelay.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView.onAttachedToWindow.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OptionOrderDetailView.this.getAccountProvider().streamAccount(order.getAccountNumber());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailView.onAttachedToWindow$lambda$3(this.f$0, (Account) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = this.orderRelay.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView.onAttachedToWindow.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OptionOrderDetailView.this.getBackupWithholdingStore().pollWithholdingAmount(new Tuples2<>(order.getAccountNumber(), order.getExecutionIds()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailView.onAttachedToWindow$lambda$4(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OptionOrderDetailView optionOrderDetailView, List list) throws Resources.NotFoundException {
        Intrinsics.checkNotNull(list);
        optionOrderDetailView.documents = list;
        optionOrderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(OptionOrderDetailView optionOrderDetailView, Account account) {
        optionOrderDetailView.account = account;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(OptionOrderDetailView optionOrderDetailView, Optional optional) throws Resources.NotFoundException {
        optionOrderDetailView.withholdingAmountResponse = (WithholdingAmount) optional.component1();
        optionOrderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    public final void bind(UiOptionOrder uiOptionOrder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        this.uiOptionOrder = uiOptionOrder;
        this.orderRelay.accept(uiOptionOrder);
        refreshUi();
    }

    private final void refreshUi() throws Resources.NotFoundException {
        CharSequence text;
        BigDecimal netCreditAmount;
        DisplayName displayName;
        DisplayName.Variants variants;
        StringResource title;
        UiOptionOrder uiOptionOrder = this.uiOptionOrder;
        if (uiOptionOrder == null) {
            return;
        }
        OptionOrder optionOrder = uiOptionOrder.getOptionOrder();
        Context context = getContext();
        Resources resources = getResources();
        RdsDataRowView rdsDataRowView = this.accountUsedSection;
        Account account = this.account;
        String str = null;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName.getShort()) == null || (title = variants.getTitle()) == null) {
            text = null;
        } else {
            Intrinsics.checkNotNull(resources);
            text = title.getText(resources);
        }
        rdsDataRowView.setVisibilityValueText(text);
        RdsDataRowView rdsDataRowView2 = this.timeInForceTxt;
        Intrinsics.checkNotNull(context);
        rdsDataRowView2.setValueText(UiOptionOrders.getTimeInForceString(uiOptionOrder, context));
        this.submittedTxt.setValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) optionOrder.getCreatedAt()));
        RdsDataRowView rdsDataRowView3 = this.stateTxt;
        Intrinsics.checkNotNull(resources);
        rdsDataRowView3.setValueText(UiOptionOrders2.getStateString(uiOptionOrder, resources));
        this.limitPriceTxt.setValueText(OptionOrders.getOrderPriceString(optionOrder, resources));
        RdsDataRowView rdsDataRowView4 = this.stopPriceTxt;
        BigDecimal stopPrice = optionOrder.getStopPrice();
        rdsDataRowView4.setVisibilityValueText(stopPrice != null ? Formats.getPriceFormat().format(stopPrice) : null);
        this.quantityTxt.setValueText(String.valueOf(optionOrder.getQuantity().intValue()));
        this.totalTxt.setValueText(Formats.getPriceFormat().format(optionOrder.getProcessedPremium()));
        if (uiOptionOrder.isMultiLeg()) {
            setMultiLegUi(uiOptionOrder);
        } else {
            setSingleLegUi(uiOptionOrder);
        }
        final Document tradeConfirmation = uiOptionOrder.getTradeConfirmation(this.documents);
        this.tradeConfirmBtn.setVisibility(tradeConfirmation != null ? 0 : 8);
        if (tradeConfirmation != null) {
            OnClickListeners.onClick(this.tradeConfirmBtn, new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderDetailView.refreshUi$lambda$6(this.f$0, tradeConfirmation);
                }
            });
        }
        this.cancelBtn.setVisibility(optionOrder.isCancelable() ? 0 : 8);
        RdsDataRowView rdsDataRowView5 = this.backupWithholdingSection;
        WithholdingAmount withholdingAmount = this.withholdingAmountResponse;
        rdsDataRowView5.setVisibilityValueText(withholdingAmount != null ? WithholdingAmount2.getBackupWithholdingAmountString(withholdingAmount) : null);
        RdsDataRowView rdsDataRowView6 = this.netCreditSection;
        WithholdingAmount withholdingAmount2 = this.withholdingAmountResponse;
        if (withholdingAmount2 != null && (netCreditAmount = WithholdingAmount2.getNetCreditAmount(withholdingAmount2, optionOrder.getProcessedPremium())) != null) {
            str = Formats.getPriceFormat().format(netCreditAmount);
        }
        rdsDataRowView6.setVisibilityValueText(str);
        this.replaceOrderBtn.setVisibility(UiOptionOrders.isReplaceable(uiOptionOrder) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$6(OptionOrderDetailView optionOrderDetailView, Document document) {
        optionOrderDetailView.onTradeConfirmClicked(document);
        return Unit.INSTANCE;
    }

    private final void setSingleLegUi(UiOptionOrder uiOptionOrder) {
        Object next;
        this.sideTxt.setVisibility(0);
        this.effectTxt.setVisibility(0);
        UiOptionOrderLeg uiOptionOrder2 = (UiOptionOrderLeg) CollectionsKt.first((List) uiOptionOrder.getLegs());
        Resources resources = getResources();
        RdsDataRowView rdsDataRowView = this.sideTxt;
        Intrinsics.checkNotNull(resources);
        rdsDataRowView.setValueText(UiOptionOrders.getOrderTypeString$default(uiOptionOrder, resources, 0, 2, null));
        this.effectTxt.setValueText(UiOptionOrders.getEffectString(uiOptionOrder2, resources));
        boolean zHasExecutions = uiOptionOrder2.hasExecutions();
        this.filledTxt.setVisibility(zHasExecutions ? 0 : 8);
        this.filledQuantityTxt.setVisibility(zHasExecutions ? 0 : 8);
        this.totalTxt.setVisibility(zHasExecutions ? 0 : 8);
        if (zHasExecutions) {
            Iterator<T> it = uiOptionOrder2.getExecutions().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Instant timestamp = ((OptionOrderExecution) next).getTimestamp();
                    do {
                        Object next2 = it.next();
                        Instant timestamp2 = ((OptionOrderExecution) next2).getTimestamp();
                        if (timestamp.compareTo(timestamp2) < 0) {
                            next = next2;
                            timestamp = timestamp2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Instant timestamp3 = next != null ? ((OptionOrderExecution) next).getTimestamp() : null;
            Intrinsics.checkNotNull(timestamp3);
            this.filledTxt.setValueText(InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) timestamp3));
            this.filledQuantityTxt.setValueText(String.valueOf(uiOptionOrder2.filledQuantity()));
        }
    }

    private final void setMultiLegUi(UiOptionOrder uiOptionOrder) {
        Iterator it = CollectionsKt.listOf((Object[]) new RdsDataRowView[]{this.sideTxt, this.effectTxt, this.filledTxt, this.filledQuantityTxt}).iterator();
        while (it.hasNext()) {
            ((RdsDataRowView) it.next()).setVisibility(8);
        }
        deleteOldMultilegViews();
        int size = uiOptionOrder.getLegs().size();
        for (int i = 0; i < size; i++) {
            addLegUi(uiOptionOrder, i);
        }
    }

    private final void deleteOldMultilegViews() {
        Sequence sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(this.multilegParent), new Function1<Object, Boolean>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$deleteOldMultilegViews$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof OptionOrderDetailLegView);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        ViewGroup viewGroup = this.multilegParent;
        Iterator itIterator2 = sequenceFilter.iterator2();
        while (itIterator2.hasNext()) {
            viewGroup.removeView((View) itIterator2.next());
        }
    }

    private final void addLegUi(UiOptionOrder uiOptionOrder, int legIndex) {
        OptionOrderDetailLegView optionOrderDetailLegViewInflate = OptionOrderDetailLegView.INSTANCE.inflate(this.multilegParent);
        optionOrderDetailLegViewInflate.bindLeg(uiOptionOrder, legIndex);
        ViewGroup viewGroup = this.multilegParent;
        viewGroup.addView(optionOrderDetailLegViewInflate, viewGroup.indexOfChild(this.multilegSentinel));
    }

    private final void onTradeConfirmClicked(Document document) {
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, null, null, 60, null);
    }

    private final void onCancelClicked() {
        UiOptionOrder uiOptionOrder = this.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder);
        UUID id = uiOptionOrder.getOptionOrder().getId();
        UiOptionOrder uiOptionOrder2 = this.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder2);
        String symbol = uiOptionOrder2.getOptionChain().getSymbol();
        UiOptionOrder uiOptionOrder3 = this.uiOptionOrder;
        Intrinsics.checkNotNull(uiOptionOrder3);
        final String accountNumber = uiOptionOrder3.getAccountNumber();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        final BaseActivity baseActivity = (BaseActivity) appCompatActivityRequireActivityBaseContext;
        this.cancelBtn.setEnabled(false);
        this.loadingView.show();
        TraderEventLogger eventLogger = getEventLogger();
        OrderFormStep orderFormStep = OrderFormStep.CANCEL_ORDER;
        OptionOrderMeta.Source source = OptionOrderMeta.Source.SOURCE_ORDER_DETAIL;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(eventLogger, orderFormStep, null, new OptionOrderMeta(null, null, null, source, symbol, string2, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Observable<Optional<OptionOrder>> observableDoOnNext = getOptionOrderStore().cancelOptionOrderAndPoll(id, accountNumber).doOnNext(new Consumer() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView.onCancelClicked.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<OptionOrder> optional) {
                OptionOrderDetailView.this.getPositionStore().refreshAccount(accountNumber, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        Observable observableOnErrorResumeNext = ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight$default(observableDoOnNext, 1000L, null, 2, null)).doOnTerminate(new Action() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView.onCancelClicked.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                OptionOrderDetailView.this.cancelBtn.setEnabled(true);
                OptionOrderDetailView.this.loadingView.hide();
            }
        }).onErrorResumeNext(Views.getActivityErrorHandler(this));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        ViewDisposerKt.bindTo$default(observableOnErrorResumeNext, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailView.onCancelClicked$lambda$10(this.f$0, baseActivity, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelClicked$lambda$10(OptionOrderDetailView optionOrderDetailView, BaseActivity baseActivity, Optional optional) {
        OptionOrder optionOrder = (OptionOrder) optional.component1();
        if ((optionOrder != null ? optionOrder.getState() : null) == OrderState.CANCELED) {
            Context context = optionOrderDetailView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Snackbars.show(BaseContexts.requireActivityBaseContext(context), C18359R.string.order_detail_order_canceled_confirmation_message, 0);
        } else {
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(baseActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
