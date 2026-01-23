package com.robinhood.android.common.recurring.detailPageView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentsNuxView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&J\u001c\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020#0,J\u0010\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0003H\u0016J\u000e\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/Instrument;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "refId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "launchRecurringTextBtn", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "getLaunchRecurringTextBtn", "()Lcom/robinhood/android/designsystem/button/RdsTextButton;", "launchRecurringTextBtn$delegate", "Lkotlin/properties/ReadOnlyProperty;", "description", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getDescription", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "description$delegate", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "bind", "", "id", "symbol", "", "accountNumber", "bindCrypto", "state", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "onLaunchRecurringClicked", "Lkotlin/Function0;", "logAppearance", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "logRecurringHookTap", "startInvestFlowEquityOnly", "assetId", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentsNuxView extends Hammer_RecurringInvestmentsNuxView implements Bindable<Instrument> {

    /* renamed from: description$delegate, reason: from kotlin metadata */
    private final Interfaces2 description;
    public EventLogger eventLogger;

    /* renamed from: launchRecurringTextBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 launchRecurringTextBtn;
    private final LogOnceEventLogger logOnceEventLogger;
    private final Navigator navigator;
    private final UUID refId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsNuxView.class, "launchRecurringTextBtn", "getLaunchRecurringTextBtn()Lcom/robinhood/android/designsystem/button/RdsTextButton;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentsNuxView.class, "description", "getDescription()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Instrument state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentsNuxView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.refId = UUID.randomUUID();
        this.launchRecurringTextBtn = BindViewDelegate2.bindView$default(this, C11595R.id.launch_recurring_flow_text_btn, null, 2, null);
        this.description = BindViewDelegate2.bindView$default(this, C11595R.id.recurring_nux_description, null, 2, null);
        this.navigator = Views.baseActivity(this).getNavigator();
        ViewGroups.inflate(this, C11595R.layout.merge_recurring_investment_nux, true);
        this.logOnceEventLogger = new LogOnceEventLogger(getEventLogger());
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

    private final RdsTextButton getLaunchRecurringTextBtn() {
        return (RdsTextButton) this.launchRecurringTextBtn.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getDescription() {
        return (RhTextView) this.description.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(final UUID id, String symbol, final String accountNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        ViewsKt.setMarginTop(getLaunchRecurringTextBtn(), ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_default));
        getLaunchRecurringTextBtn().setText(ViewsKt.getString(this, C11595R.string.instrument_detail_recurring_investments_nux_btn, symbol));
        OnClickListeners.onClick(getLaunchRecurringTextBtn(), new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInvestmentsNuxView.bind$lambda$0(this.f$0, id, accountNumber);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(RecurringInvestmentsNuxView recurringInvestmentsNuxView, UUID uuid, String str) {
        recurringInvestmentsNuxView.logRecurringHookTap(Screen.Name.STOCK_DETAIL_PAGE);
        recurringInvestmentsNuxView.startInvestFlowEquityOnly(uuid, str);
        return Unit.INSTANCE;
    }

    public final void bindCrypto(UiCurrencyPair state, final Function0<Unit> onLaunchRecurringClicked) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onLaunchRecurringClicked, "onLaunchRecurringClicked");
        RhTextView description = getDescription();
        description.setText(ViewsKt.getString(description, C11595R.string.recurring_crypto_nux_description, state.getAssetCurrency().getCode()));
        description.setBackground(null);
        ViewsKt.setMarginTop(getLaunchRecurringTextBtn(), ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_small));
        RdsTextButton launchRecurringTextBtn = getLaunchRecurringTextBtn();
        launchRecurringTextBtn.setText(ViewsKt.getString(launchRecurringTextBtn, C11595R.string.recurring_crypto_nux_cta, state.getAssetCurrency().getCode()));
        OnClickListeners.onClick(launchRecurringTextBtn, new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInvestmentsNuxView.bindCrypto$lambda$3$lambda$2(this.f$0, onLaunchRecurringClicked);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCrypto$lambda$3$lambda$2(RecurringInvestmentsNuxView recurringInvestmentsNuxView, Function0 function0) {
        recurringInvestmentsNuxView.logRecurringHookTap(Screen.Name.CRYPTO_DETAIL_PAGE);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void logAppearance(Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        LogOnceEventLogger logOnceEventLogger = this.logOnceEventLogger;
        String string2 = this.refId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(screenName, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        LogOnceEventLogger.logAppear$default(logOnceEventLogger, string2, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, screen, new Component(componentType, null, null, 6, null), null, 16, null);
    }

    private final void logRecurringHookTap(Screen.Name screenName) {
        Screen screen = new Screen(screenName, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, screen, new Component(componentType, null, null, 6, null), null, null, false, 56, null);
    }

    private final void startInvestFlowEquityOnly(UUID assetId, String accountNumber) {
        Navigator navigator = this.navigator;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new InvestFlowIntentKey((InvestFlowStep) InvestFlowStep.Frequency.INSTANCE, true, false, false, CollectionsKt.listOf(assetId), accountNumber, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 1996, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
    }

    /* compiled from: RecurringInvestmentsNuxView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RecurringInvestmentsNuxView> {
        private final /* synthetic */ Inflater<RecurringInvestmentsNuxView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RecurringInvestmentsNuxView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RecurringInvestmentsNuxView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11595R.layout.include_recurring_investment_nux);
        }
    }
}
