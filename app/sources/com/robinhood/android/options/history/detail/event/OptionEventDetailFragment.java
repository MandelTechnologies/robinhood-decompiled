package com.robinhood.android.options.history.detail.event;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.p153ui.BaseDetailFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.contracts.OptionEventDetailFragmentKey;
import com.robinhood.android.options.history.detail.event.OptionEventDetailEvent;
import com.robinhood.android.options.history.detail.event.OptionEventDetailViewState;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionEvents;
import com.robinhood.android.options.optionsstring.common.UiOptionEvents;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.android.portfolio.pnl.logging.PnlLoggingConstants;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.history.compose.Underlying;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.LocalDate;

/* compiled from: OptionEventDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 y2\u00020\u00012\u00020\u0002:\u0001yB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u001eJ!\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00103R\u001b\u0010:\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u00103R\u001b\u0010=\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u00103R\u001b\u0010@\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b?\u00103R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u00103R\u001b\u0010K\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bJ\u00103R\u001b\u0010N\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bM\u00103R\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010,\u001a\u0004\bY\u0010VR\u001b\u0010]\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010,\u001a\u0004\b\\\u0010VR\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010,\u001a\u0004\b`\u0010aR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006z"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent;", "optionEventDetailEvent", "", "handleEvents", "(Lcom/robinhood/android/udf/event/Event;)V", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Ready;", "viewState", "refreshReadyUi", "(Lcom/robinhood/android/options/history/detail/event/OptionEventDetailViewState$Ready;)V", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/ui/UiOptionEvent;", "event", "bindAlertBanner", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiOptionEvent;)V", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "setPriceRow", "(Lcom/robinhood/models/ui/UiOptionEvent;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "j$/time/LocalDate", "nextOpenDate", "setSupplementaryText", "(Lcom/robinhood/models/ui/UiOptionEvent;Lj$/time/LocalDate;)V", "setCostOrCreditRow", "(Lcom/robinhood/models/ui/UiOptionEvent;)V", "generateLegRows", "showBottomViews", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "alertBanner$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAlertBanner", "()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "alertBanner", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "accountUsedSection$delegate", "getAccountUsedSection", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "accountUsedSection", "contractsSection$delegate", "getContractsSection", "contractsSection", "priceSection$delegate", "getPriceSection", "priceSection", "dateSection$delegate", "getDateSection", "dateSection", "statusSection$delegate", "getStatusSection", "statusSection", "Landroid/widget/TextView;", "statusSupplementaryTxt$delegate", "getStatusSupplementaryTxt", "()Landroid/widget/TextView;", "statusSupplementaryTxt", "creditSection$delegate", "getCreditSection", "creditSection", "costSection$delegate", "getCostSection", "costSection", "realizedProfitLossSection$delegate", "getRealizedProfitLossSection", "realizedProfitLossSection", "Landroid/view/ViewGroup;", "multilegParent$delegate", "getMultilegParent", "()Landroid/view/ViewGroup;", "multilegParent", "multilegSentinel$delegate", "getMultilegSentinel", "()Landroid/view/View;", "multilegSentinel", "cancelBtn$delegate", "getCancelBtn", "cancelBtn", "contactSupportBtn$delegate", "getContactSupportBtn", "contactSupportBtn", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "duxo", "", "getRevealTransitionName", "()Ljava/lang/String;", "revealTransitionName", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionEventDetailFragment extends BaseDetailFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountUsedSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountUsedSection;

    /* renamed from: alertBanner$delegate, reason: from kotlin metadata */
    private final Interfaces2 alertBanner;

    /* renamed from: cancelBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 cancelBtn;

    /* renamed from: contactSupportBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 contactSupportBtn;

    /* renamed from: contractsSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractsSection;

    /* renamed from: costSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 costSection;

    /* renamed from: creditSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 creditSection;

    /* renamed from: dateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 dateSection;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;

    /* renamed from: multilegParent$delegate, reason: from kotlin metadata */
    private final Interfaces2 multilegParent;

    /* renamed from: multilegSentinel$delegate, reason: from kotlin metadata */
    private final Interfaces2 multilegSentinel;

    /* renamed from: priceSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 priceSection;

    /* renamed from: realizedProfitLossSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 realizedProfitLossSection;

    /* renamed from: statusSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 statusSection;

    /* renamed from: statusSupplementaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 statusSupplementaryTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "alertBanner", "getAlertBanner()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "accountUsedSection", "getAccountUsedSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "contractsSection", "getContractsSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "priceSection", "getPriceSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "dateSection", "getDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "statusSection", "getStatusSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "statusSupplementaryTxt", "getStatusSupplementaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "creditSection", "getCreditSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "costSection", "getCostSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "realizedProfitLossSection", "getRealizedProfitLossSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "multilegParent", "getMultilegParent()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "multilegSentinel", "getMultilegSentinel()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "cancelBtn", "getCancelBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "contactSupportBtn", "getContactSupportBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionEventDetailFragment.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvents(final Event<OptionEventDetailEvent> optionEventDetailEvent) {
        EventConsumer<OptionEventDetailEvent> eventConsumerInvoke;
        if (!(optionEventDetailEvent.getData() instanceof OptionEventDetailEvent.CancelExerciseErrorEvent) || (eventConsumerInvoke = optionEventDetailEvent.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(optionEventDetailEvent, new Function1() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$handleEvents$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m16914invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16914invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getActivityErrorHandler().invoke2(((OptionEventDetailEvent.CancelExerciseErrorEvent) optionEventDetailEvent.getData()).getThrowable());
            }
        });
    }

    public OptionEventDetailFragment() {
        super(C18359R.layout.fragment_option_event_detail);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.alertBanner = bindView(C18359R.id.option_event_detail_alert_text);
        this.accountUsedSection = bindView(C18359R.id.option_event_detail_account_used);
        this.contractsSection = bindView(C18359R.id.option_event_detail_contracts);
        this.priceSection = bindView(C18359R.id.option_event_detail_price);
        this.dateSection = bindView(C18359R.id.option_event_detail_date);
        this.statusSection = bindView(C18359R.id.option_event_detail_status);
        this.statusSupplementaryTxt = bindView(C18359R.id.option_event_detail_status_supplementary_txt);
        this.creditSection = bindView(C18359R.id.option_event_detail_credit);
        this.costSection = bindView(C18359R.id.option_event_detail_cost);
        this.realizedProfitLossSection = bindView(C18359R.id.option_event_detail_realized_profit_loss);
        this.multilegParent = bindView(C18359R.id.option_event_detail_parent);
        this.multilegSentinel = bindView(C18359R.id.option_event_detail_multileg_sentinel);
        this.cancelBtn = bindView(C18359R.id.option_event_detail_cancel_exercise);
        this.contactSupportBtn = bindView(C18359R.id.option_event_detail_contact_support);
        this.loadingView = bindView(C18359R.id.loading_view);
        this.duxo = DuxosKt.duxo(this, OptionEventDetailDuxo.class);
    }

    private final RdsInfoBannerView getAlertBanner() {
        return (RdsInfoBannerView) this.alertBanner.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getAccountUsedSection() {
        return (RdsDataRowView) this.accountUsedSection.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getContractsSection() {
        return (RdsDataRowView) this.contractsSection.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getPriceSection() {
        return (RdsDataRowView) this.priceSection.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsDataRowView getDateSection() {
        return (RdsDataRowView) this.dateSection.getValue(this, $$delegatedProperties[4]);
    }

    private final RdsDataRowView getStatusSection() {
        return (RdsDataRowView) this.statusSection.getValue(this, $$delegatedProperties[5]);
    }

    private final TextView getStatusSupplementaryTxt() {
        return (TextView) this.statusSupplementaryTxt.getValue(this, $$delegatedProperties[6]);
    }

    private final RdsDataRowView getCreditSection() {
        return (RdsDataRowView) this.creditSection.getValue(this, $$delegatedProperties[7]);
    }

    private final RdsDataRowView getCostSection() {
        return (RdsDataRowView) this.costSection.getValue(this, $$delegatedProperties[8]);
    }

    private final RdsDataRowView getRealizedProfitLossSection() {
        return (RdsDataRowView) this.realizedProfitLossSection.getValue(this, $$delegatedProperties[9]);
    }

    private final ViewGroup getMultilegParent() {
        return (ViewGroup) this.multilegParent.getValue(this, $$delegatedProperties[10]);
    }

    private final View getMultilegSentinel() {
        return (View) this.multilegSentinel.getValue(this, $$delegatedProperties[11]);
    }

    private final View getCancelBtn() {
        return (View) this.cancelBtn.getValue(this, $$delegatedProperties[12]);
    }

    private final View getContactSupportBtn() {
        return (View) this.contactSupportBtn.getValue(this, $$delegatedProperties[13]);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[14]);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionEventDetailDuxo getDuxo() {
        return (OptionEventDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((OptionEventDetailFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionEventId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: OptionEventDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1", m3645f = "OptionEventDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1 */
    static final class C230991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C230991(Continuation<? super C230991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C230991 c230991 = OptionEventDetailFragment.this.new C230991(continuation);
            c230991.L$0 = obj;
            return c230991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionEventDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1$1", m3645f = "OptionEventDetailFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionEventDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionEventDetailFragment optionEventDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionEventDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<OptionEventDetailViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final OptionEventDetailFragment optionEventDetailFragment = this.this$0;
                    FlowCollector<? super OptionEventDetailViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((OptionEventDetailViewState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(OptionEventDetailViewState optionEventDetailViewState, Continuation<? super Unit> continuation) {
                            if (optionEventDetailViewState instanceof OptionEventDetailViewState.Ready) {
                                optionEventDetailFragment.refreshReadyUi((OptionEventDetailViewState.Ready) optionEventDetailViewState);
                            } else if (!Intrinsics.areEqual(optionEventDetailViewState, OptionEventDetailViewState.Empty.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionEventDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionEventDetailFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionEventDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1$2", m3645f = "OptionEventDetailFragment.kt", m3646l = {103}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionEventDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionEventDetailFragment optionEventDetailFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionEventDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionEventDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$onViewCreated$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ OptionEventDetailFragment $tmp0;

                AnonymousClass1(OptionEventDetailFragment optionEventDetailFragment) {
                    this.$tmp0 = optionEventDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, OptionEventDetailFragment.class, "handleEvents", "handleEvents(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<OptionEventDetailEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvents = AnonymousClass2.invokeSuspend$handleEvents(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvents == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvents : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<OptionEventDetailEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvents(OptionEventDetailFragment optionEventDetailFragment, Event event, Continuation continuation) {
                optionEventDetailFragment.handleEvents(event);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C230991(null), 1, null);
        OnClickListeners.onClick(getCancelBtn(), new Function0() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionEventDetailFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(getContactSupportBtn(), new Function0() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionEventDetailFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionEventDetailFragment optionEventDetailFragment) {
        optionEventDetailFragment.getDuxo().onCancelButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionEventDetailFragment optionEventDetailFragment) {
        Navigator navigator = optionEventDetailFragment.getNavigator();
        Context contextRequireContext = optionEventDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshReadyUi(final OptionEventDetailViewState.Ready viewState) {
        String string2;
        UiOptionEvent event = viewState.getEvent();
        Underlying underlying = viewState.getUnderlying();
        OptionChain.UnderlyingType underlyingType = event.getUnderlyingType();
        UiOptionChain uiOptionChain = viewState.getUiOptionChain();
        boolean settleOnOpen = uiOptionChain.getOptionChain().getSettleOnOpen();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getExpandedToolbarTitleTxt().setLines(2);
        TextView expandedToolbarTitleTxt = getExpandedToolbarTitleTxt();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        expandedToolbarTitleTxt.setText(UiOptionEvents.getDetailPageTitle(event, resources, underlyingType, settleOnOpen));
        if (underlying instanceof Underlying.Equity) {
            BaseDetailFragment.setUnderlyingEquity$default(this, ((Underlying.Equity) underlying).getSymbol(), null, 2, null);
        } else if (underlying instanceof Underlying.Index) {
            Underlying.Index index = (Underlying.Index) underlying;
            setUnderlyingIndex(index.getSymbol(), index.getIndexId());
        }
        getLoadingView().setVisibility(viewState.isLoading() ? 0 : 8);
        bindAlertBanner(viewState.getAccount(), event);
        RdsDataRowView accountUsedSection = getAccountUsedSection();
        StringResource title = AccountDisplayNames.getDisplayName(viewState.getAccount()).getShort().getTitle();
        Resources resources2 = contextRequireContext.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        accountUsedSection.setValueText(title.getText(resources2));
        getContractsSection().setValueText(Formats.getIntegerFormat().format(Integer.valueOf(event.getOptionEvent().getQuantity().intValue())));
        setPriceRow(event, uiOptionChain.getUnderlyingType());
        getDateSection().setValueText(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) event.getOptionEvent().getEventDate()));
        getStatusSection().setValueText(OptionEvents.getStateString(event.getOptionEvent(), contextRequireContext));
        setSupplementaryText(event, viewState.getNextOpenDate());
        setCostOrCreditRow(event);
        showBottomViews(event);
        if (viewState.getPnlItem() != null) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.OPTION_EVENT_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.ROW, PnlLoggingConstants.OPTIONS_EVENT_ENTRY_POINT, null, 4, null), null, null, 25, null);
            Money realizedReturn = viewState.getPnlItem().getRealizedReturn();
            if (realizedReturn == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            RdsDataRowView realizedProfitLossSection = getRealizedProfitLossSection();
            if (realizedReturn.isPositive() || realizedReturn.isZero()) {
                string2 = getString(C23386R.string.option_event_detail_realized_profit);
            } else {
                string2 = getString(C23386R.string.option_event_detail_realized_loss);
            }
            realizedProfitLossSection.setLabelText(string2);
            getRealizedProfitLossSection().setVisibilityValueText(Money.Adjustment.format$default(realizedReturn.toNormalizedAdjustment(), false, null, 3, null));
            OnClickListeners.onClick(getRealizedProfitLossSection(), new Function0() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionEventDetailFragment.refreshReadyUi$lambda$3(this.f$0, viewState);
                }
            });
            return;
        }
        getRealizedProfitLossSection().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshReadyUi$lambda$3(OptionEventDetailFragment optionEventDetailFragment, OptionEventDetailViewState.Ready ready) {
        Navigator.DefaultImpls.createDialogFragment$default(optionEventDetailFragment.getNavigator(), new PnlTradeDetailDialogFragmentKey(ready.getAccount().getAccountNumber(), ready.getPnlItem(), new Screen(Screen.Name.OPTION_EVENT_DETAIL, null, null, null, 14, null), true, false, ready.getPnlUpdatesEnabled(), 16, null), null, 2, null).show(optionEventDetailFragment.getChildFragmentManager(), "pnl-detail");
        return Unit.INSTANCE;
    }

    private final void bindAlertBanner(Account account, UiOptionEvent event) {
        if (OptionLevel.INSTANCE.isAdvancedLevel(account.getOptionLevel()) && event.isEarlyAssignment()) {
            final RdsInfoBannerView alertBanner = getAlertBanner();
            alertBanner.setVisibility(0);
            alertBanner.setText(getString(C23386R.string.option_event_detail_alert_early_assignment));
            OnClickListeners.onClick(alertBanner, new Function0() { // from class: com.robinhood.android.options.history.detail.event.OptionEventDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionEventDetailFragment.bindAlertBanner$lambda$5$lambda$4(this.f$0, alertBanner);
                }
            });
            return;
        }
        getAlertBanner().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAlertBanner$lambda$5$lambda$4(OptionEventDetailFragment optionEventDetailFragment, RdsInfoBannerView rdsInfoBannerView) {
        String string2 = optionEventDetailFragment.getString(C23386R.string.option_event_detail_alert_early_assignment_help_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = optionEventDetailFragment.getNavigator();
        Context context = rdsInfoBannerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
        return Unit.INSTANCE;
    }

    private final void setPriceRow(UiOptionEvent event, OptionChain.UnderlyingType underlyingType) {
        String string2;
        BigDecimal underlyingPrice = event.getOptionEvent().getUnderlyingPrice();
        getPriceSection().setVisibility(underlyingPrice != null ? 0 : 8);
        if (underlyingPrice != null) {
            if (underlyingType == OptionChain.UnderlyingType.INDEX) {
                string2 = getString(C23386R.string.option_event_detail_settlement_value);
            } else if (event.getOptionEvent().getHasMultipleUnderlying()) {
                string2 = getString(C23386R.string.option_event_detail_price_at_expiration_multiple_underlying);
            } else {
                string2 = getString(C23386R.string.option_event_detail_price_at_expiration, event.getOptionInstrument().getChainSymbol());
            }
            Intrinsics.checkNotNull(string2);
            getPriceSection().setLabelText(string2);
            getPriceSection().setValueText(OptionUnderlyings.getNumberFormatter(underlyingType).format(underlyingPrice));
        }
    }

    private final void setSupplementaryText(UiOptionEvent event, LocalDate nextOpenDate) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String statusSupplementaryString = UiOptionEvents.getStatusSupplementaryString(event, contextRequireContext, nextOpenDate);
        getStatusSupplementaryTxt().setVisibility(statusSupplementaryString != null ? 0 : 8);
        getStatusSupplementaryTxt().setText(statusSupplementaryString);
    }

    private final void setCostOrCreditRow(UiOptionEvent event) {
        boolean zAreEqual = Intrinsics.areEqual(event.getOptionEvent().getTotalCashAmount(), BigDecimal.ZERO);
        boolean z = !zAreEqual && event.getOptionEvent().getDirection() == OrderDirection.CREDIT;
        boolean z2 = !zAreEqual && event.getOptionEvent().getDirection() == OrderDirection.DEBIT;
        getCreditSection().setVisibility(z ? 0 : 8);
        getCostSection().setVisibility(z2 ? 0 : 8);
        if (z) {
            getCreditSection().setValueText(Formats.getPriceFormat().format(event.getOptionEvent().getTotalCashAmount()));
        } else if (z2) {
            getCostSection().setValueText(Formats.getPriceFormat().format(event.getOptionEvent().getTotalCashAmount()));
        }
    }

    private final void generateLegRows(UiOptionEvent event) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        int iIndexOfChild = getMultilegParent().indexOfChild(getMultilegSentinel());
        getMultilegParent().removeViews(iIndexOfChild + 1, (getMultilegParent().getChildCount() - iIndexOfChild) - 1);
        for (OptionEvent.EquityComponent equityComponent : event.getOptionEvent().getEquityComponents()) {
            ViewGroups.inflate(getMultilegParent(), C18359R.layout.row_history_detail, true);
            View childAt = getMultilegParent().getChildAt(getMultilegParent().getChildCount() - 1);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsDataRowView");
            RdsDataRowView rdsDataRowView = (RdsDataRowView) childAt;
            rdsDataRowView.setLabelText(OptionEvents.getDetailTitleString(equityComponent, fragmentActivityRequireActivity));
            rdsDataRowView.setValueText(OptionEvents.getDetailValueString(equityComponent, fragmentActivityRequireActivity));
        }
    }

    private final void showBottomViews(UiOptionEvent event) {
        boolean zIsCancelable = UiOptionEvents.isCancelable(event);
        boolean zShouldShowContactSupport = UiOptionEvents.shouldShowContactSupport(event);
        getCancelBtn().setVisibility(zIsCancelable ? 0 : 8);
        getContactSupportBtn().setVisibility(zShouldShowContactSupport ? 0 : 8);
        if (zIsCancelable || zShouldShowContactSupport) {
            return;
        }
        generateLegRows(event);
    }

    /* compiled from: OptionEventDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailFragment;", "Lcom/robinhood/android/options/contracts/OptionEventDetailFragmentKey;", "<init>", "()V", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionEventDetailFragment, OptionEventDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionEventDetailFragmentKey optionEventDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionEventDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionEventDetailFragmentKey getArgs(OptionEventDetailFragment optionEventDetailFragment) {
            return (OptionEventDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionEventDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionEventDetailFragment newInstance(OptionEventDetailFragmentKey optionEventDetailFragmentKey) {
            return (OptionEventDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionEventDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionEventDetailFragment optionEventDetailFragment, OptionEventDetailFragmentKey optionEventDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionEventDetailFragment, optionEventDetailFragmentKey);
        }
    }
}
