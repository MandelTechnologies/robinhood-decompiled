package com.robinhood.android.equitydetail.p123ui.earnings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.view.StickySideHeaderDecoration;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.IncludeEarningsViewBinding;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.MonthDayFormatter;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.ExceptionsH;
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
import org.threeten.extra.AmPm;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalDate;
import p479j$.time.MonthDay;
import p479j$.time.format.TextStyle;

/* compiled from: EarningsView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0006$%&'()B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0014J,\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fJ.\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "earningsAdapter", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$EarningsAdapter;", "dateDecoration", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$DateDecoration;", "onFinishInflate", "", "bind", "earnings", "", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;", "instrumentPositionsMap", "", "Ljava/util/UUID;", "", "parseAdapterData", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$AdapterData;", "AdapterData", "DateHeader", "EarningsAdapter", "EarningViewHolder", "DateDecoration", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EarningsView extends Hammer_EarningsView {
    private static final int EARNING_VIEW_TYPE = 1;
    private static final int HEADER_VIEW_TYPE = 0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final DateDecoration dateDecoration;
    private final EarningsAdapter earningsAdapter;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarningsView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: EarningsView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmPm.values().length];
            try {
                iArr[AmPm.AM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmPm.PM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, EarningsView2.INSTANCE);
        this.earningsAdapter = new EarningsAdapter();
        this.dateDecoration = new DateDecoration(context);
    }

    private final IncludeEarningsViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeEarningsViewBinding) value;
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

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.earningsAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(this.dateDecoration);
    }

    public final void bind(List<Earning> earnings, Map<UUID, Integer> instrumentPositionsMap) throws Resources.NotFoundException {
        IncludeEarningsViewBinding binding = getBinding();
        if (instrumentPositionsMap == null) {
            return;
        }
        AdapterData adapterData = parseAdapterData(earnings, instrumentPositionsMap);
        if (adapterData == null) {
            RecyclerView recyclerView = binding.recyclerView;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            recyclerView.setVisibility(8);
            RhTextView emptyTxt = binding.emptyTxt;
            Intrinsics.checkNotNullExpressionValue(emptyTxt, "emptyTxt");
            emptyTxt.setVisibility(8);
            RdsProgressBar progressBar = binding.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(0);
            return;
        }
        if (adapterData.getItems().isEmpty()) {
            RecyclerView recyclerView2 = binding.recyclerView;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            recyclerView2.setVisibility(8);
            RhTextView emptyTxt2 = binding.emptyTxt;
            Intrinsics.checkNotNullExpressionValue(emptyTxt2, "emptyTxt");
            emptyTxt2.setVisibility(0);
            RdsProgressBar progressBar2 = binding.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            progressBar2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = binding.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
        recyclerView3.setVisibility(0);
        RhTextView emptyTxt3 = binding.emptyTxt;
        Intrinsics.checkNotNullExpressionValue(emptyTxt3, "emptyTxt");
        emptyTxt3.setVisibility(8);
        RdsProgressBar progressBar3 = binding.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
        progressBar3.setVisibility(8);
        this.earningsAdapter.bind(adapterData, instrumentPositionsMap);
        this.dateDecoration.setHeaders(adapterData.getDateHeaders());
    }

    private final AdapterData parseAdapterData(List<Earning> earnings, Map<UUID, Integer> instrumentPositionsMap) throws Resources.NotFoundException {
        if (earnings == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Resources resources = getResources();
        String string2 = resources.getString(C15314R.string.earnings_pre_market_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C15314R.string.earnings_after_hours_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ArrayList<Earning> arrayList3 = new ArrayList();
        for (Object obj : earnings) {
            if (instrumentPositionsMap.containsKey(((Earning) obj).getInstrumentId())) {
                arrayList3.add(obj);
            }
        }
        LocalDate localDate = null;
        boolean z = false;
        boolean z2 = false;
        for (Earning earning : arrayList3) {
            Earning.Report report = earning.getReport();
            LocalDate date = report != null ? report.getDate() : null;
            AmPm timing = report != null ? report.getTiming() : null;
            if (date != null && timing != null) {
                boolean zAreEqual = Intrinsics.areEqual(date, localDate);
                int i = WhenMappings.$EnumSwitchMapping$0[timing.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new InvalidParameterException("Timing is invalid");
                    }
                    if (zAreEqual && z2) {
                        z = false;
                    } else {
                        arrayList.add(string3);
                        z = false;
                        z2 = true;
                    }
                } else if (zAreEqual && z) {
                    z2 = false;
                } else {
                    arrayList.add(string2);
                    z2 = false;
                    z = true;
                }
                if (!zAreEqual) {
                    DayOfWeek dayOfWeek = date.getDayOfWeek();
                    MonthDay monthDay = LocalDates4.getMonthDay(date);
                    String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.getDefault(Locale.Category.DISPLAY));
                    Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
                    arrayList2.add(new DateHeader(displayName, MonthDayFormatter.MEDIUM_REVERSED.format(monthDay), arrayList.size()));
                    localDate = date;
                }
                arrayList.add(earning);
            }
        }
        StickySideHeaderDecoration.HeaderItem.INSTANCE.setEndPositions(arrayList2, arrayList.size());
        return new AdapterData(arrayList, arrayList2);
    }

    /* compiled from: EarningsView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$AdapterData;", "", "items", "", "dateHeaders", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$DateHeader;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getDateHeaders", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class AdapterData {
        private final List<DateHeader> dateHeaders;
        private final List<Object> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdapterData copy$default(AdapterData adapterData, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = adapterData.items;
            }
            if ((i & 2) != 0) {
                list2 = adapterData.dateHeaders;
            }
            return adapterData.copy(list, list2);
        }

        public final List<Object> component1() {
            return this.items;
        }

        public final List<DateHeader> component2() {
            return this.dateHeaders;
        }

        public final AdapterData copy(List<? extends Object> items, List<DateHeader> dateHeaders) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(dateHeaders, "dateHeaders");
            return new AdapterData(items, dateHeaders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdapterData)) {
                return false;
            }
            AdapterData adapterData = (AdapterData) other;
            return Intrinsics.areEqual(this.items, adapterData.items) && Intrinsics.areEqual(this.dateHeaders, adapterData.dateHeaders);
        }

        public int hashCode() {
            return (this.items.hashCode() * 31) + this.dateHeaders.hashCode();
        }

        public String toString() {
            return "AdapterData(items=" + this.items + ", dateHeaders=" + this.dateHeaders + ")";
        }

        public AdapterData(List<? extends Object> items, List<DateHeader> dateHeaders) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(dateHeaders, "dateHeaders");
            this.items = items;
            this.dateHeaders = dateHeaders;
        }

        public final List<Object> getItems() {
            return this.items;
        }

        public final List<DateHeader> getDateHeaders() {
            return this.dateHeaders;
        }
    }

    /* compiled from: EarningsView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$DateHeader;", "Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem;", "dayOfWeek", "", InquiryField.DateField.TYPE, "startPosition", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDayOfWeek", "()Ljava/lang/String;", "getDate", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DateHeader extends StickySideHeaderDecoration.HeaderItem {
        private final String date;
        private final String dayOfWeek;

        public final String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final String getDate() {
            return this.date;
        }

        public DateHeader(String dayOfWeek, String date, int i) {
            Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
            Intrinsics.checkNotNullParameter(date, "date");
            this.dayOfWeek = dayOfWeek;
            this.date = date;
            setStartPosition(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EarningsView.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$EarningsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$EarningViewHolder;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView;)V", "adapterData", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$AdapterData;", "getAdapterData", "()Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$AdapterData;", "setAdapterData", "(Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$AdapterData;)V", "instrumentPositionsMap", "", "Ljava/util/UUID;", "", "getInstrumentPositionsMap", "()Ljava/util/Map;", "setInstrumentPositionsMap", "(Ljava/util/Map;)V", "bind", "", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "getItemCount", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class EarningsAdapter extends RecyclerView.Adapter<EarningViewHolder> {
        private AdapterData adapterData;
        private Map<UUID, Integer> instrumentPositionsMap;

        public EarningsAdapter() {
        }

        public final AdapterData getAdapterData() {
            return this.adapterData;
        }

        public final void setAdapterData(AdapterData adapterData) {
            this.adapterData = adapterData;
        }

        public final Map<UUID, Integer> getInstrumentPositionsMap() {
            return this.instrumentPositionsMap;
        }

        public final void setInstrumentPositionsMap(Map<UUID, Integer> map) {
            this.instrumentPositionsMap = map;
        }

        public final void bind(AdapterData adapterData, Map<UUID, Integer> instrumentPositionsMap) {
            this.adapterData = adapterData;
            this.instrumentPositionsMap = instrumentPositionsMap;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            AdapterData adapterData = this.adapterData;
            Intrinsics.checkNotNull(adapterData);
            return !(adapterData.getItems().get(position) instanceof String) ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public EarningViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LayoutInflater layoutInflater = ContextSystemServices.getLayoutInflater(context);
            if (viewType == 0) {
                View viewInflate = layoutInflater.inflate(C15314R.layout.include_earning_header, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return new EarningViewHolder(viewInflate);
            }
            if (viewType == 1) {
                View viewInflate2 = layoutInflater.inflate(C15314R.layout.row_earning_watched, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
                return new EarningViewHolder(viewInflate2);
            }
            Preconditions.INSTANCE.failUnknownEnumKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(EarningViewHolder holder, int position) {
            boolean z;
            boolean z2;
            int i;
            Intrinsics.checkNotNullParameter(holder, "holder");
            AdapterData adapterData = this.adapterData;
            Intrinsics.checkNotNull(adapterData);
            Object obj = adapterData.getItems().get(position);
            if (obj instanceof String) {
                View view = holder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) view).setText((CharSequence) obj);
                return;
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.shared.equities.models.instrumentdetails.db.Earning");
            Earning earning = (Earning) obj;
            final UUID instrumentId = earning.getInstrumentId();
            View viewFindViewById = itemView.findViewById(C15314R.id.earning_symbol_txt);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(earning.getSymbol());
            Resources resources = EarningsView.this.getResources();
            Map<UUID, Integer> map = this.instrumentPositionsMap;
            Intrinsics.checkNotNull(map);
            Integer num = map.get(instrumentId);
            String quantityString = (num == null || num.intValue() == 0) ? null : resources.getQuantityString(C15314R.plurals.earnings_instrument_num_shares_label, num.intValue(), num);
            View viewFindViewById2 = itemView.findViewById(C15314R.id.earning_subtitle_txt);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById2).setText(quantityString);
            if (position != 0) {
                AdapterData adapterData2 = this.adapterData;
                Intrinsics.checkNotNull(adapterData2);
                z = adapterData2.getItems().get(position + (-1)) instanceof String;
            }
            if (position != getSize() - 1) {
                AdapterData adapterData3 = this.adapterData;
                Intrinsics.checkNotNull(adapterData3);
                z2 = adapterData3.getItems().get(position + 1) instanceof String;
            }
            if (z && z2) {
                i = C11048R.drawable.rounded_background_all;
            } else if (z) {
                i = C11048R.drawable.rounded_background_top;
            } else if (z2) {
                i = C11048R.drawable.rounded_background_bottom;
            } else {
                i = C11048R.drawable.rounded_background_middle;
            }
            itemView.setBackgroundResource(i);
            final EarningsView earningsView = EarningsView.this;
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsView$EarningsAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EarningsView.EarningsAdapter.onBindViewHolder$lambda$0(earningsView, instrumentId);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$0(EarningsView earningsView, UUID uuid) {
            Navigator navigator = earningsView.getNavigator();
            Context context = earningsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(uuid, CollectionsKt.emptyList(), null, InstrumentDetailSource.EARNINGS, false, 20, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            AdapterData adapterData = this.adapterData;
            if (adapterData == null) {
                return 0;
            }
            Intrinsics.checkNotNull(adapterData);
            return adapterData.getItems().size();
        }
    }

    /* compiled from: EarningsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$EarningViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class EarningViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarningViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    /* compiled from: EarningsView.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$DateDecoration;", "Lcom/robinhood/android/common/view/StickySideHeaderDecoration;", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsView$DateHeader;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dateDecorationWidth", "", "spacingSmall", "dateDecorationTextPadding", "dayOfWeekTextSize", "dateTextSize", "decorationWidth", "getDecorationWidth", "()I", "decorationHeight", "", "getDecorationHeight", "()F", "drawHeader", "", "canvas", "Landroid/graphics/Canvas;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "topY", "delta", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DateDecoration extends StickySideHeaderDecoration<DateHeader> {
        private final int dateDecorationTextPadding;
        private final int dateDecorationWidth;
        private final int dateTextSize;
        private final int dayOfWeekTextSize;
        private final int spacingSmall;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateDecoration(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Resources resources = context.getResources();
            this.dateDecorationWidth = resources.getDimensionPixelOffset(C15314R.dimen.earning_date_decoration_width);
            this.spacingSmall = resources.getDimensionPixelOffset(C13997R.dimen.rds_spacing_small);
            this.dateDecorationTextPadding = resources.getDimensionPixelOffset(C13997R.dimen.rds_spacing_default);
            this.dayOfWeekTextSize = resources.getDimensionPixelOffset(C15314R.dimen.earning_day_of_week_textsize);
            this.dateTextSize = resources.getDimensionPixelOffset(C15314R.dimen.earning_date_textsize);
            getPaint().setColor(context.getColor(C11048R.color.text_color_secondary));
        }

        @Override // com.robinhood.android.common.view.StickySideHeaderDecoration
        /* renamed from: getDecorationWidth, reason: from getter */
        protected int getDateDecorationWidth() {
            return this.dateDecorationWidth;
        }

        @Override // com.robinhood.android.common.view.StickySideHeaderDecoration
        protected float getDecorationHeight() {
            return this.dayOfWeekTextSize + this.spacingSmall + this.dateTextSize;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.view.StickySideHeaderDecoration
        public void drawHeader(Canvas canvas, DateHeader item, float topY, float delta) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(item, "item");
            float f = this.dayOfWeekTextSize + topY;
            float decorationHeight = topY + getDecorationHeight();
            if (delta < 0.0f) {
                f += delta;
                decorationHeight += delta;
            }
            getPaint().setTextSize(this.dayOfWeekTextSize);
            canvas.drawText(item.getDayOfWeek(), this.dateDecorationTextPadding, f, getPaint());
            getPaint().setTextSize(this.dateTextSize);
            canvas.drawText(item.getDate(), this.dateDecorationTextPadding, decorationHeight, getPaint());
        }
    }
}
