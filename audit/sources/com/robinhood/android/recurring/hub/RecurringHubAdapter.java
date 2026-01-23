package com.robinhood.android.recurring.hub;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.recurring.hub.RecurringHubAdapter;
import com.robinhood.common.strings.C32428R;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p366ui.InvestmentScheduleWithAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringHubAdapter.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00041234B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0016J(\u0010+\u001a\u00020)2\u0016\u0010,\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00140\u00112\b\b\u0002\u0010-\u001a\u00020\u0017J(\u0010.\u001a\u00020)2\u0016\u0010,\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00140\u00112\b\b\u0002\u0010-\u001a\u00020\u0017J\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\b\b\u0002\u0010-\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00140\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00140\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "cryptoItems", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "stockAndEtfItems", "value", "", "showCrypto", "getShowCrypto", "()Z", "setShowCrypto", "(Z)V", "Lcom/robinhood/android/recurring/hub/RecurringHubAdapter$CryptoDisclaimer;", "cryptoDisclaimerItem", "setCryptoDisclaimerItem", "(Lcom/robinhood/android/recurring/hub/RecurringHubAdapter$CryptoDisclaimer;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "submitStockAndEtfList", "list", "isEtfEnabled", "submitCryptoList", "generateItems", "", "Companion", "EmptyItem", "Header", "CryptoDisclaimer", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecurringHubAdapter extends ListAdapter<Object, RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_CRYPTO_SCHEDULE = 2;
    private static final int VIEW_TYPE_DISCLAIMER = 5;
    private static final int VIEW_TYPE_EMPTY_ITEM = 3;
    private static final int VIEW_TYPE_EQUITY_SCHEDULE = 1;
    private static final int VIEW_TYPE_SECTION_HEADER = 0;
    private static final int VIEW_TYPE_SECTION_HEADER_ICON = 4;
    private final Context context;
    private CryptoDisclaimer cryptoDisclaimerItem;
    private List<? extends StatefulHistoryEvent<? extends HistoryEvent>> cryptoItems;
    public EventLogger eventLogger;
    private final Navigator navigator;
    private boolean showCrypto;
    private List<? extends StatefulHistoryEvent<? extends HistoryEvent>> stockAndEtfItems;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringHubAdapter(Context context, Navigator navigator) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubAdapter._init_$lambda$0(obj);
            }
        }));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.context = context;
        this.navigator = navigator;
        this.cryptoItems = CollectionsKt.emptyList();
        this.stockAndEtfItems = CollectionsKt.emptyList();
        this.showCrypto = true;
        this.cryptoDisclaimerItem = CryptoDisclaimer.COLLAPSED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(Object byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        if ((byEquality instanceof CharSequence) || (byEquality instanceof EmptyItem) || (byEquality instanceof Header) || (byEquality instanceof CryptoDisclaimer)) {
            return byEquality;
        }
        if (byEquality instanceof StatefulHistoryEvent) {
            return ((StatefulHistoryEvent) byEquality).getHistoryEvent().getId();
        }
        throw new IllegalStateException(("Unknown item type, not supported by RecurringHubAdapter: " + byEquality).toString());
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

    public final boolean getShowCrypto() {
        return this.showCrypto;
    }

    public final void setShowCrypto(boolean z) {
        this.showCrypto = z;
        generateItems$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCryptoDisclaimerItem(CryptoDisclaimer cryptoDisclaimer) {
        this.cryptoDisclaimerItem = cryptoDisclaimer;
        submitList(generateItems$default(this, false, 1, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        InvestmentSchedule investmentSchedule;
        Object item = getItem(position);
        if (item instanceof String) {
            return 0;
        }
        if (item instanceof Header) {
            return 4;
        }
        if (item instanceof StatefulHistoryEvent) {
            StatefulHistoryEvent statefulHistoryEvent = (StatefulHistoryEvent) item;
            HistoryEvent historyEvent = statefulHistoryEvent.getHistoryEvent();
            InvestmentSchedule investmentSchedule2 = historyEvent instanceof InvestmentSchedule ? (InvestmentSchedule) historyEvent : null;
            if (investmentSchedule2 != null && investmentSchedule2.isCrypto()) {
                return 2;
            }
            HistoryEvent historyEvent2 = statefulHistoryEvent.getHistoryEvent();
            InvestmentScheduleWithAccountType investmentScheduleWithAccountType = historyEvent2 instanceof InvestmentScheduleWithAccountType ? (InvestmentScheduleWithAccountType) historyEvent2 : null;
            return (investmentScheduleWithAccountType == null || (investmentSchedule = investmentScheduleWithAccountType.getInvestmentSchedule()) == null || !investmentSchedule.isCrypto()) ? 1 : 2;
        }
        if (item instanceof EmptyItem) {
            return 3;
        }
        if (item instanceof CryptoDisclaimer) {
            return 5;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = ContextSystemServices.getLayoutInflater(this.context).inflate(C26221R.layout.include_history_list_header_row, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SimpleViewHolder(viewInflate);
        }
        if (viewType == 1 || viewType == 2) {
            return new SimpleViewHolder(HistoryRowView.Companion.HistoryRowInflater.INSTANCE.inflate(parent));
        }
        if (viewType == 3) {
            View viewInflate2 = ContextSystemServices.getLayoutInflater(this.context).inflate(C26221R.layout.include_history_list_empty_row, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new SimpleViewHolder(viewInflate2);
        }
        if (viewType == 4) {
            View viewInflate3 = ContextSystemServices.getLayoutInflater(this.context).inflate(C26221R.layout.include_history_list_header_row_icon, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new SimpleViewHolder(viewInflate3);
        }
        if (viewType == 5) {
            View viewInflate4 = ContextSystemServices.getLayoutInflater(this.context).inflate(C26221R.layout.include_history_list_disclaimer_row, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
            return new SimpleViewHolder(viewInflate4);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Object item = getItem(position);
        if (item instanceof String) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            ((RhTextView) view).setText((CharSequence) item);
            return;
        }
        if (item instanceof Header) {
            View viewFindViewById = holder.itemView.findViewById(C26221R.id.header_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = holder.itemView.findViewById(C26221R.id.header_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById2;
            Header header = (Header) item;
            ((RhTextView) viewFindViewById).setText(this.context.getText(header.getMessageRes()));
            Integer iconRes = header.getIconRes();
            if (iconRes != null) {
                int iIntValue = iconRes.intValue();
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.context.getDrawable(iIntValue));
                OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.recurring.hub.RecurringHubAdapter$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecurringHubAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0, item);
                    }
                });
                return;
            }
            return;
        }
        if (item instanceof StatefulHistoryEvent) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.common.history.ui.HistoryRowView");
            HistoryRowView historyRowView = (HistoryRowView) view2;
            historyRowView.bind((StatefulHistoryEvent<? extends HistoryEvent>) item);
            OnClickListeners.onClick(historyRowView, new Function0() { // from class: com.robinhood.android.recurring.hub.RecurringHubAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringHubAdapter.onBindViewHolder$lambda$4$lambda$3(this.f$0);
                }
            });
            return;
        }
        if (!(item instanceof EmptyItem)) {
            if (!(item instanceof CryptoDisclaimer)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
                throw new ExceptionsH();
            }
            View view3 = holder.itemView;
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            RhTextView rhTextView = (RhTextView) view3;
            CryptoDisclaimer cryptoDisclaimer = (CryptoDisclaimer) item;
            CharSequence text = rhTextView.getContext().getText(cryptoDisclaimer.getMessage());
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            TextViewsKt.setTextWithLearnMore((TextView) rhTextView, text, false, false, rhTextView.getContext().getString(cryptoDisclaimer.getButtonText()), (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.recurring.hub.RecurringHubAdapter$onBindViewHolder$lambda$8$$inlined$setTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RecurringHubAdapter recurringHubAdapter = this.this$0;
                    RecurringHubAdapter.CryptoDisclaimer cryptoDisclaimer2 = recurringHubAdapter.cryptoDisclaimerItem;
                    RecurringHubAdapter.CryptoDisclaimer cryptoDisclaimer3 = RecurringHubAdapter.CryptoDisclaimer.COLLAPSED;
                    if (cryptoDisclaimer2 == cryptoDisclaimer3) {
                        cryptoDisclaimer3 = RecurringHubAdapter.CryptoDisclaimer.EXPANDED;
                    }
                    recurringHubAdapter.setCryptoDisclaimerItem(cryptoDisclaimer3);
                }
            }, 1, (DefaultConstructorMarker) null));
            return;
        }
        View view4 = holder.itemView;
        Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        final RhTextView rhTextView2 = (RhTextView) view4;
        EmptyItem emptyItem = (EmptyItem) item;
        if (emptyItem.getKey() == null || emptyItem.getLinkRes() == null) {
            rhTextView2.setText(rhTextView2.getContext().getText(emptyItem.getMessageRes()));
            return;
        }
        String string2 = rhTextView2.getContext().getString(emptyItem.getLinkRes().intValue());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CharSequence text2 = rhTextView2.getContext().getText(emptyItem.getMessageRes());
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        TextViewsKt.setTextWithLearnMore((TextView) rhTextView2, text2, false, false, string2, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.recurring.hub.RecurringHubAdapter$onBindViewHolder$lambda$6$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Navigator navigator = this.this$0.navigator;
                Context context = rhTextView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Navigator.DefaultImpls.showFragment$default(navigator, context, ((RecurringHubAdapter.EmptyItem) item).getKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(RecurringHubAdapter recurringHubAdapter, Object obj) {
        Navigator navigator = recurringHubAdapter.navigator;
        Context context = recurringHubAdapter.context;
        Integer linkStringRes = ((Header) obj).getLinkStringRes();
        Intrinsics.checkNotNull(linkStringRes);
        String string2 = context.getString(linkStringRes.intValue());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3(RecurringHubAdapter recurringHubAdapter) {
        EventLogger.DefaultImpls.logTap$default(recurringHubAdapter.getEventLogger(), UserInteractionEventData.Action.VIEW_RECURRING_DETAILS, new Screen(Screen.Name.RECURRING_HUB, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_HUB_ROW, null, null, 6, null), null, null, false, 56, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void submitStockAndEtfList$default(RecurringHubAdapter recurringHubAdapter, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recurringHubAdapter.submitStockAndEtfList(list, z);
    }

    public final void submitStockAndEtfList(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, boolean isEtfEnabled) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.stockAndEtfItems = list;
        submitList(generateItems(isEtfEnabled));
    }

    public static /* synthetic */ void submitCryptoList$default(RecurringHubAdapter recurringHubAdapter, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recurringHubAdapter.submitCryptoList(list, z);
    }

    public final void submitCryptoList(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, boolean isEtfEnabled) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.cryptoItems = list;
        submitList(generateItems(isEtfEnabled));
    }

    private final List<Object> generateItems(boolean isEtfEnabled) {
        Header header;
        EmptyItem emptyItem;
        ArrayList arrayList = new ArrayList();
        if (isEtfEnabled) {
            header = Header.STOCKS_AND_ETF;
        } else {
            header = Header.STOCK;
        }
        arrayList.add(header);
        if (this.stockAndEtfItems.isEmpty()) {
            if (isEtfEnabled) {
                emptyItem = EmptyItem.STOCKS_AND_ETF;
            } else {
                emptyItem = EmptyItem.STOCK;
            }
            arrayList.add(emptyItem);
        } else {
            arrayList.addAll(this.stockAndEtfItems);
        }
        if (this.showCrypto) {
            arrayList.add(Header.CRYPTO);
            if (this.cryptoItems.isEmpty()) {
                arrayList.add(EmptyItem.CRYPTO);
            } else {
                arrayList.addAll(this.cryptoItems);
            }
            arrayList.add(this.cryptoDisclaimerItem);
        }
        return arrayList;
    }

    static /* synthetic */ List generateItems$default(RecurringHubAdapter recurringHubAdapter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return recurringHubAdapter.generateItems(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringHubAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubAdapter$EmptyItem;", "", "messageRes", "", "linkRes", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getMessageRes", "()I", "getLinkRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "STOCK", "STOCKS_AND_ETF", "CRYPTO", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class EmptyItem {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EmptyItem[] $VALUES;
        public static final EmptyItem STOCK = new EmptyItem("STOCK", 0, C26221R.string.investment_schedule_equity_empty_message, null, null, 6, null);
        private final FragmentKey key;
        private final Integer linkRes;
        private final int messageRes;
        public static final EmptyItem STOCKS_AND_ETF = new EmptyItem("STOCKS_AND_ETF", 1, C26221R.string.investment_schedule_equity_empty_message, 0 == true ? 1 : 0, null, 6, null);
        public static final EmptyItem CRYPTO = new EmptyItem("CRYPTO", 2, C26221R.string.investment_schedule_crypto_empty_message, 0 == true ? 1 : 0, null, 6, null);

        private static final /* synthetic */ EmptyItem[] $values() {
            return new EmptyItem[]{STOCK, STOCKS_AND_ETF, CRYPTO};
        }

        public static EnumEntries<EmptyItem> getEntries() {
            return $ENTRIES;
        }

        private EmptyItem(String str, int i, int i2, Integer num, FragmentKey fragmentKey) {
            this.messageRes = i2;
            this.linkRes = num;
            this.key = fragmentKey;
        }

        /* synthetic */ EmptyItem(String str, int i, int i2, Integer num, FragmentKey fragmentKey, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : fragmentKey);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final Integer getLinkRes() {
            return this.linkRes;
        }

        public final FragmentKey getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            EmptyItem[] emptyItemArr$values = $values();
            $VALUES = emptyItemArr$values;
            $ENTRIES = EnumEntries2.enumEntries(emptyItemArr$values);
        }

        public static EmptyItem valueOf(String str) {
            return (EmptyItem) Enum.valueOf(EmptyItem.class, str);
        }

        public static EmptyItem[] values() {
            return (EmptyItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringHubAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubAdapter$Header;", "", "messageRes", "", "iconRes", "linkStringRes", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getMessageRes", "()I", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLinkStringRes", "STOCK", "STOCKS_AND_ETF", "CRYPTO", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Header {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Header[] $VALUES;
        public static final Header CRYPTO;
        public static final Header STOCK;
        public static final Header STOCKS_AND_ETF;
        private final Integer iconRes;
        private final Integer linkStringRes;
        private final int messageRes;

        private static final /* synthetic */ Header[] $values() {
            return new Header[]{STOCK, STOCKS_AND_ETF, CRYPTO};
        }

        public static EnumEntries<Header> getEntries() {
            return $ENTRIES;
        }

        private Header(String str, int i, int i2, Integer num, Integer num2) {
            this.messageRes = i2;
            this.iconRes = num;
            this.linkStringRes = num2;
        }

        /* synthetic */ Header(String str, int i, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final Integer getIconRes() {
            return this.iconRes;
        }

        public final Integer getLinkStringRes() {
            return this.linkStringRes;
        }

        static {
            Integer num = null;
            STOCK = new Header("STOCK", 0, C26221R.string.investment_schedule_stock_header, null, num, 6, null);
            Integer num2 = null;
            STOCKS_AND_ETF = new Header("STOCKS_AND_ETF", 1, C26221R.string.gated_investment_schedule_stocks_and_etf_header, num, num2, 6, null);
            CRYPTO = new Header("CRYPTO", 2, C26221R.string.investment_schedule_crypto_header, num2, null, 6, null);
            Header[] headerArr$values = $values();
            $VALUES = headerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(headerArr$values);
        }

        public static Header valueOf(String str) {
            return (Header) Enum.valueOf(Header.class, str);
        }

        public static Header[] values() {
            return (Header[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringHubAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubAdapter$CryptoDisclaimer;", "", "message", "", "buttonText", "<init>", "(Ljava/lang/String;III)V", "getMessage", "()I", "getButtonText", "COLLAPSED", "EXPANDED", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class CryptoDisclaimer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoDisclaimer[] $VALUES;
        public static final CryptoDisclaimer COLLAPSED = new CryptoDisclaimer("COLLAPSED", 0, C32428R.string.investment_schedule_short_disclaimer, C32428R.string.investment_schedule_disclaimer_button_expand);
        public static final CryptoDisclaimer EXPANDED = new CryptoDisclaimer("EXPANDED", 1, C32428R.string.investment_schedule_long_disclaimer, C32428R.string.investment_schedule_disclaimer_button_collapse);
        private final int buttonText;
        private final int message;

        private static final /* synthetic */ CryptoDisclaimer[] $values() {
            return new CryptoDisclaimer[]{COLLAPSED, EXPANDED};
        }

        public static EnumEntries<CryptoDisclaimer> getEntries() {
            return $ENTRIES;
        }

        private CryptoDisclaimer(String str, int i, int i2, int i3) {
            this.message = i2;
            this.buttonText = i3;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getButtonText() {
            return this.buttonText;
        }

        static {
            CryptoDisclaimer[] cryptoDisclaimerArr$values = $values();
            $VALUES = cryptoDisclaimerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoDisclaimerArr$values);
        }

        public static CryptoDisclaimer valueOf(String str) {
            return (CryptoDisclaimer) Enum.valueOf(CryptoDisclaimer.class, str);
        }

        public static CryptoDisclaimer[] values() {
            return (CryptoDisclaimer[]) $VALUES.clone();
        }
    }
}
