package com.robinhood.android.screener.p248ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.equities.contracts.ScreenerTableEntryIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import com.robinhood.android.screener.p248ui.rows.HeaderRowView;
import com.robinhood.android.screener.p248ui.rows.MiscRowViews;
import com.robinhood.android.screener.p248ui.rows.MiscRowViews2;
import com.robinhood.android.screener.p248ui.rows.ScreenerRowView;
import com.robinhood.android.screener.p248ui.rows.ToggleTruncatedRowView;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: ScreenersAdapter.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0004-./0B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J\u001e\u0010!\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\fH\u0016J\u0012\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0017J\b\u0010,\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "truncateAt", "", "loggingCallbacks", "Lcom/robinhood/android/screener/ui/ScreenersAdapter$LoggingCallbacks;", "accountNumber", "", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;Lcom/robinhood/android/screener/ui/ScreenersAdapter$LoggingCallbacks;Ljava/lang/String;)V", "Ljava/lang/Integer;", "screenersData", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "truncated", "", "shouldHide", "bind", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateNewScreenerClicked", "screenerId", "onScreenerClicked", "row", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "count", "onToggleScreenersTruncated", "updateShouldHide", "hideScreeners", "showDisclosure", "LoggingCallbacks", "ViewType", "Companion", "DiffCallback", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ScreenersAdapter extends ListAdapter<ScreenerRows, GenericViewHolder<? extends View>> {
    private final String accountNumber;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LoggingCallbacks loggingCallbacks;
    private final Navigator navigator;
    private ScreenersStore.ScreenersData screenersData;
    private boolean shouldHide;
    private final Integer truncateAt;
    private boolean truncated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenersAdapter$LoggingCallbacks;", "", "onScreenerClicked", "", "screenerRow", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "position", "", "count", "onScreenerAppear", "onCreateNewScreenerAppear", "onCreateNewScreenerClicked", "onToggleScreenersTruncated", "truncate", "", "onToggleScreenersAppear", "truncated", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LoggingCallbacks {
        void onCreateNewScreenerAppear();

        void onCreateNewScreenerClicked();

        void onScreenerAppear(ScreenerRows.ScreenerRow screenerRow, int position, int count);

        void onScreenerClicked(ScreenerRows.ScreenerRow screenerRow, int position, int count);

        void onToggleScreenersAppear(boolean truncated);

        void onToggleScreenersTruncated(boolean truncate);
    }

    public /* synthetic */ ScreenersAdapter(Context context, Navigator navigator, FragmentManager fragmentManager, Integer num, LoggingCallbacks loggingCallbacks, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navigator, fragmentManager, (i & 8) != 0 ? null : num, loggingCallbacks, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenersAdapter(Context context, Navigator navigator, FragmentManager fragmentManager, Integer num, LoggingCallbacks loggingCallbacks, String str) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(loggingCallbacks, "loggingCallbacks");
        this.context = context;
        this.navigator = navigator;
        this.fragmentManager = fragmentManager;
        this.truncateAt = num;
        this.loggingCallbacks = loggingCallbacks;
        this.accountNumber = str;
        this.screenersData = new ScreenersStore.ScreenersData(null, null, false, 7, null);
        this.truncated = num != null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenersAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "SCREENER", "TOGGLE_TRUNCATED", "LOADING", "SPACE", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType HEADER = new ViewType("HEADER", 0);
        public static final ViewType SCREENER = new ViewType("SCREENER", 1);
        public static final ViewType TOGGLE_TRUNCATED = new ViewType("TOGGLE_TRUNCATED", 2);
        public static final ViewType LOADING = new ViewType("LOADING", 3);
        public static final ViewType SPACE = new ViewType("SPACE", 4);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{HEADER, SCREENER, TOGGLE_TRUNCATED, LOADING, SPACE};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public final void bind(ScreenersStore.ScreenersData screenersData) {
        Intrinsics.checkNotNullParameter(screenersData, "screenersData");
        this.screenersData = screenersData;
        List<ScreenerRows> rows$feature_lib_screener_externalDebug = INSTANCE.toRows$feature_lib_screener_externalDebug(screenersData, this.truncated, this.truncateAt);
        if (!rows$feature_lib_screener_externalDebug.isEmpty() && !this.shouldHide) {
            submitList(CollectionsKt.plus((Collection<? extends ScreenerRows.PaddingRow>) rows$feature_lib_screener_externalDebug, ScreenerRows.PaddingRow.INSTANCE));
        } else {
            submitList(CollectionsKt.emptyList());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.HEADER.ordinal()) {
            return new GenericViewHolder<>(new HeaderRowView(this.context, null, 2, null));
        }
        if (viewType == ViewType.SCREENER.ordinal()) {
            return new GenericViewHolder<>(new ScreenerRowView(this.context, null, 2, null));
        }
        if (viewType == ViewType.TOGGLE_TRUNCATED.ordinal()) {
            return new GenericViewHolder<>(new ToggleTruncatedRowView(this.context, null, 2, null));
        }
        if (viewType == ViewType.LOADING.ordinal()) {
            return new GenericViewHolder<>(new MiscRowViews(this.context, null, 2, null));
        }
        if (viewType == ViewType.SPACE.ordinal()) {
            return new GenericViewHolder<>(new MiscRowViews2(this.context, null, 2, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        ScreenerRows item = getItem(position);
        if (item instanceof ScreenerRows.ScreenerHeader) {
            viewType = ViewType.HEADER;
        } else if (item instanceof ScreenerRows.ScreenerRow) {
            viewType = ViewType.SCREENER;
        } else if (item instanceof ScreenerRows.ToggleTruncatedRow) {
            viewType = ViewType.TOGGLE_TRUNCATED;
        } else if (Intrinsics.areEqual(item, ScreenerRows.LoadingRow.INSTANCE)) {
            viewType = ViewType.LOADING;
        } else {
            if (!Intrinsics.areEqual(item, ScreenerRows.PaddingRow.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            viewType = ViewType.SPACE;
        }
        return viewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int size = this.screenersData.getScreeners().size();
        final ScreenerRows item = getItem(position);
        if (item instanceof ScreenerRows.ScreenerHeader) {
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.screener.ui.rows.HeaderRowView");
            ((HeaderRowView) view).bind((ScreenerRows.ScreenerHeader) item, new Function0() { // from class: com.robinhood.android.screener.ui.ScreenersAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenersAdapter.onBindViewHolder$lambda$0(this.f$0, item);
                }
            }, new C278372(this), new C278383(this.loggingCallbacks));
        } else if (item instanceof ScreenerRows.ScreenerRow) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.screener.ui.rows.ScreenerRowView");
            ((ScreenerRowView) view2).bind((ScreenerRows.ScreenerRow) item, new Function0() { // from class: com.robinhood.android.screener.ui.ScreenersAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenersAdapter.onBindViewHolder$lambda$1(this.f$0, item, position, size);
                }
            }, new Function0() { // from class: com.robinhood.android.screener.ui.ScreenersAdapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenersAdapter.onBindViewHolder$lambda$2(this.f$0, item, position, size);
                }
            });
        } else if (item instanceof ScreenerRows.ToggleTruncatedRow) {
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView");
            ((ToggleTruncatedRowView) view3).bind((ScreenerRows.ToggleTruncatedRow) item, new C278396(this), new C278407(this.loggingCallbacks));
        } else if (!Intrinsics.areEqual(item, ScreenerRows.LoadingRow.INSTANCE) && !Intrinsics.areEqual(item, ScreenerRows.PaddingRow.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.screener.ui.ScreenersAdapter$onBindViewHolder$2 */
    /* synthetic */ class C278372 extends FunctionReferenceImpl implements Function0<Unit> {
        C278372(Object obj) {
            super(0, obj, ScreenersAdapter.class, "showDisclosure", "showDisclosure()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ScreenersAdapter) this.receiver).showDisclosure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(ScreenersAdapter screenersAdapter, ScreenerRows screenerRows) {
        screenersAdapter.onCreateNewScreenerClicked(((ScreenerRows.ScreenerHeader) screenerRows).getDefaultScreenerId());
        return Unit.INSTANCE;
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.screener.ui.ScreenersAdapter$onBindViewHolder$3 */
    /* synthetic */ class C278383 extends FunctionReferenceImpl implements Function0<Unit> {
        C278383(Object obj) {
            super(0, obj, LoggingCallbacks.class, "onCreateNewScreenerAppear", "onCreateNewScreenerAppear()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((LoggingCallbacks) this.receiver).onCreateNewScreenerAppear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(ScreenersAdapter screenersAdapter, ScreenerRows screenerRows, int i, int i2) {
        screenersAdapter.onScreenerClicked((ScreenerRows.ScreenerRow) screenerRows, i, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(ScreenersAdapter screenersAdapter, ScreenerRows screenerRows, int i, int i2) {
        screenersAdapter.loggingCallbacks.onScreenerAppear((ScreenerRows.ScreenerRow) screenerRows, i, i2);
        return Unit.INSTANCE;
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.screener.ui.ScreenersAdapter$onBindViewHolder$6 */
    /* synthetic */ class C278396 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C278396(Object obj) {
            super(1, obj, ScreenersAdapter.class, "onToggleScreenersTruncated", "onToggleScreenersTruncated(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((ScreenersAdapter) this.receiver).onToggleScreenersTruncated(z);
        }
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.screener.ui.ScreenersAdapter$onBindViewHolder$7 */
    /* synthetic */ class C278407 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C278407(Object obj) {
            super(1, obj, LoggingCallbacks.class, "onToggleScreenersAppear", "onToggleScreenersAppear(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((LoggingCallbacks) this.receiver).onToggleScreenersAppear(z);
        }
    }

    private final void onCreateNewScreenerClicked(String screenerId) {
        this.loggingCallbacks.onCreateNewScreenerClicked();
        this.context.startActivity(Navigator.DefaultImpls.createIntent$default(this.navigator, this.context, new ScreenerTableEntryIntentKey(screenerId, "search", this.accountNumber), null, false, 12, null));
    }

    private final void onScreenerClicked(ScreenerRows.ScreenerRow row, int position, int count) {
        this.loggingCallbacks.onScreenerClicked(row, position, count);
        this.context.startActivity(Navigator.DefaultImpls.createIntent$default(this.navigator, this.context, new ScreenerTableEntryIntentKey(row.getId(), "search", this.accountNumber), null, false, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToggleScreenersTruncated(boolean truncated) {
        this.loggingCallbacks.onToggleScreenersTruncated(truncated);
        this.truncated = truncated;
        bind(this.screenersData);
    }

    public final void updateShouldHide(boolean hideScreeners) {
        this.shouldHide = hideScreeners;
        if (hideScreeners) {
            submitList(CollectionsKt.emptyList());
        } else {
            bind(this.screenersData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDisclosure() {
        new InformationBottomSheetFragment().show(this.fragmentManager, "screener-info-bottom-sheet");
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenersAdapter$Companion;", "", "<init>", "()V", "loadingRows", "", "Lcom/robinhood/android/screener/ui/ScreenerRows$LoadingRow;", "count", "", "loadingRows$feature_lib_screener_externalDebug", "toRows", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "truncated", "", "truncateAt", "toRows$feature_lib_screener_externalDebug", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;ZLjava/lang/Integer;)Ljava/util/List;", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<ScreenerRows.LoadingRow> loadingRows$feature_lib_screener_externalDebug(int count) {
            PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(1, count);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
            Iterator<Integer> it = primitiveRanges2.iterator();
            while (it.hasNext()) {
                ((PrimitiveIterators6) it).nextInt();
                arrayList.add(ScreenerRows.LoadingRow.INSTANCE);
            }
            return arrayList;
        }

        public static /* synthetic */ List toRows$feature_lib_screener_externalDebug$default(Companion companion, ScreenersStore.ScreenersData screenersData, boolean z, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.toRows$feature_lib_screener_externalDebug(screenersData, z, num);
        }

        public final List<ScreenerRows> toRows$feature_lib_screener_externalDebug(ScreenersStore.ScreenersData screenersData, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(screenersData, "<this>");
            List listListOf = CollectionsKt.listOf(ScreenerRows2.headerRow(screenersData.getDefaultScreenerId()));
            if (screenersData.getLoading()) {
                return CollectionsKt.plus((Collection) listListOf, (Iterable) loadingRows$feature_lib_screener_externalDebug(num != null ? num.intValue() : 3));
            }
            if (num == null || screenersData.getScreeners().size() <= num.intValue()) {
                List list = listListOf;
                List<Screener> screeners = screenersData.getScreeners();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(screeners, 10));
                Iterator<T> it = screeners.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ScreenerRows.ScreenerRow((Screener) it.next()));
                }
                return CollectionsKt.plus((Collection) list, (Iterable) arrayList);
            }
            if (z) {
                List list2 = listListOf;
                List<Screener> listSubList = screenersData.getScreeners().subList(0, num.intValue());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
                Iterator<T> it2 = listSubList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new ScreenerRows.ScreenerRow((Screener) it2.next()));
                }
                return CollectionsKt.plus((Collection<? extends ScreenerRows.ToggleTruncatedRow>) CollectionsKt.plus((Collection) list2, (Iterable) arrayList2), ScreenerRows2.getExpandRow());
            }
            List list3 = listListOf;
            List<Screener> screeners2 = screenersData.getScreeners();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(screeners2, 10));
            Iterator<T> it3 = screeners2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new ScreenerRows.ScreenerRow((Screener) it3.next()));
            }
            return CollectionsKt.plus((Collection<? extends ScreenerRows.ToggleTruncatedRow>) CollectionsKt.plus((Collection) list3, (Iterable) arrayList3), ScreenerRows2.getCollapseRow());
        }
    }

    /* compiled from: ScreenersAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenersAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<ScreenerRows> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(ScreenerRows oldItem, ScreenerRows newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(ScreenerRows oldItem, ScreenerRows newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
