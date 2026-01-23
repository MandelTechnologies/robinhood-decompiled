package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.MergeCuratedListIpoAccessFilterBinding;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState6;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CuratedListIpoAccessFilterView.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002&'B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0003H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "chipAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterViewState;", "callbacks", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Callbacks;)V", "binding", "Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessFilterBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessFilterBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "currentFilter", "bind", "", "state", "setSelectedFilter", "newFilter", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListIpoAccessFilterView extends Hammer_CuratedListIpoAccessFilterView implements Bindable<CuratedListRhListViewState6> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private final GenericListAdapter<RdsChip, CuratedListIpoAccessFilterViewState> chipAdapter;
    private CuratedListRhListViewState6 currentFilter;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListIpoAccessFilterView.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessFilterBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListIpoAccessFilterView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Callbacks;", "", "onIpoAccessFilterChanged", "", "ipoAccessFilter", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onIpoAccessFilterChanged(CuratedListRhListViewState6 ipoAccessFilter);
    }

    /* compiled from: CuratedListIpoAccessFilterView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListRhListViewState6.values().length];
            try {
                iArr[CuratedListRhListViewState6.IN_FLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CuratedListRhListViewState6.LAUNCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CuratedListRhListViewState6.LEARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListIpoAccessFilterView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        GenericListAdapter<RdsChip, CuratedListIpoAccessFilterViewState> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(RdsChip.INSTANCE, new DiffUtil.ItemCallback<CuratedListIpoAccessFilterViewState>() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView$chipAdapter$1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(CuratedListIpoAccessFilterViewState oldItem, CuratedListIpoAccessFilterViewState newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getIpoAccessFilter() == newItem.getIpoAccessFilter();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(CuratedListIpoAccessFilterViewState oldItem, CuratedListIpoAccessFilterViewState newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.isSelected() == newItem.isSelected();
            }
        }, new Function2() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListIpoAccessFilterView.chipAdapter$lambda$1(this.f$0, (RdsChip) obj, (CuratedListIpoAccessFilterViewState) obj2);
            }
        });
        this.chipAdapter = genericListAdapterM2987of;
        ViewGroups.inflate(this, C20839R.layout.merge_curated_list_ipo_access_filter, true);
        this.binding = ViewBinding5.viewBinding(this, CuratedListIpoAccessFilterView3.INSTANCE);
        this.currentFilter = CuratedListRhListViewState6.IN_FLIGHT;
        RecyclerView recyclerView = getBinding().chipRecyclerView;
        recyclerView.setAdapter(genericListAdapterM2987of);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(new PaddingItemDecoration(context) { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView$1$1
            private final int sideSpacing;

            {
                this.sideSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
            }

            @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
            protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                return this.sideSpacing;
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
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
    public static final Unit chipAdapter$lambda$1(final CuratedListIpoAccessFilterView curatedListIpoAccessFilterView, RdsChip of, final CuratedListIpoAccessFilterViewState item) {
        int i;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        Resources resources = of.getResources();
        int i2 = WhenMappings.$EnumSwitchMapping$0[item.getIpoAccessFilter().ordinal()];
        if (i2 == 1) {
            i = C20839R.string.ipo_access_filter_inflight;
        } else if (i2 == 2) {
            i = C20839R.string.ipo_access_filter_launched;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20839R.string.ipo_access_filter_learn;
        }
        of.setText(resources.getString(i));
        of.setSelected(item.isSelected());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListIpoAccessFilterView.chipAdapter$lambda$1$lambda$0(item, curatedListIpoAccessFilterView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit chipAdapter$lambda$1$lambda$0(CuratedListIpoAccessFilterViewState curatedListIpoAccessFilterViewState, CuratedListIpoAccessFilterView curatedListIpoAccessFilterView) {
        int i = WhenMappings.$EnumSwitchMapping$0[curatedListIpoAccessFilterViewState.getIpoAccessFilter().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Screen screen = new Screen(Screen.Name.LIST_DETAIL_PAGE, null, null, null, 14, null);
            Component.ComponentType componentType = Component.ComponentType.CHIP;
            String str = "learn";
            EventLogger.DefaultImpls.logTap$default(curatedListIpoAccessFilterView.getEventLogger(), null, screen, new Component(componentType, str, null, 4, null), null, null, false, 57, null);
        }
        curatedListIpoAccessFilterView.setSelectedFilter(curatedListIpoAccessFilterViewState.getIpoAccessFilter());
        return Unit.INSTANCE;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final MergeCuratedListIpoAccessFilterBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCuratedListIpoAccessFilterBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(CuratedListRhListViewState6 state) {
        CuratedListIpoAccessFilterViewState curatedListIpoAccessFilterViewState;
        Intrinsics.checkNotNullParameter(state, "state");
        EnumEntries<CuratedListRhListViewState6> entries = CuratedListRhListViewState6.getEntries();
        ArrayList arrayList = new ArrayList();
        Iterator<CuratedListRhListViewState6> it = entries.iterator();
        while (it.hasNext()) {
            CuratedListRhListViewState6 next = it.next();
            if (next == CuratedListRhListViewState6.LEARN) {
                curatedListIpoAccessFilterViewState = null;
            } else {
                curatedListIpoAccessFilterViewState = new CuratedListIpoAccessFilterViewState(next, state == next);
            }
            if (curatedListIpoAccessFilterViewState != null) {
                arrayList.add(curatedListIpoAccessFilterViewState);
            }
        }
        setSelectedFilter(state);
        this.chipAdapter.submitList(arrayList);
    }

    private final void setSelectedFilter(CuratedListRhListViewState6 newFilter) {
        if (this.currentFilter != newFilter) {
            this.currentFilter = newFilter;
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onIpoAccessFilterChanged(newFilter);
            }
        }
    }

    /* compiled from: CuratedListIpoAccessFilterView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListIpoAccessFilterView> {
        private final /* synthetic */ Inflater<CuratedListIpoAccessFilterView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListIpoAccessFilterView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListIpoAccessFilterView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_ipo_access_filter);
        }
    }
}
