package com.robinhood.android.listsoptions.optionwatchlist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistSortBottomSheetBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListItemSortDuxo;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListItemSortViewState;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003'()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortDuxo;", "getDuxo", "()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistSortBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistSortBottomSheetBinding;", "binding$delegate", "sortOptionAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/ui/SortOption;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Args", "OptionWatchlistSortRowInflater", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionWatchlistSortBottomSheetFragment extends BaseBottomSheetDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionWatchlistSortBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(OptionWatchlistSortBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistSortBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<RdsRowView, SortOption> sortOptionAdapter;

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCuratedList.SortDirection.values().length];
            try {
                iArr[ApiCuratedList.SortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCuratedList.SortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCuratedList.SortDirection.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionWatchlistSortBottomSheetFragment() {
        super(C20943R.layout.fragment_option_watchlist_sort_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CuratedListSortCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, CuratedListItemSortDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionWatchlistSortBottomSheetFragment2.INSTANCE);
        this.sortOptionAdapter = GenericListAdapter.INSTANCE.m2987of(OptionWatchlistSortRowInflater.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$sortOptionAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((SortOption) obj).getSortOrder();
            }
        }), new Function2() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionWatchlistSortBottomSheetFragment.sortOptionAdapter$lambda$1(this.f$0, (RdsRowView) obj, (SortOption) obj2);
            }
        });
    }

    private final CuratedListSortCallbacks getCallbacks() {
        return (CuratedListSortCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final CuratedListItemSortDuxo getDuxo() {
        return (CuratedListItemSortDuxo) this.duxo.getValue();
    }

    private final FragmentOptionWatchlistSortBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionWatchlistSortBottomSheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortOptionAdapter$lambda$1(final OptionWatchlistSortBottomSheetFragment optionWatchlistSortBottomSheetFragment, RdsRowView of, final SortOption sortOption) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        String string2 = optionWatchlistSortBottomSheetFragment.getString(SortOptions.getOptionWatchlistSortItemTitleRes(sortOption.getSortOrder()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsRowView.bind$default(of, string2, optionWatchlistSortBottomSheetFragment.getString(SortOptions.getOptionWatchlistSortItemSubtitleRes(sortOption.getSortOrder())), null, null, null, 28, null);
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, SortOptions.getOptionWatchlistSortItemDrawableRes(sortOption.getSortOrder())));
        of.setTrailingIconDrawable(ViewsKt.getDrawable(of, SortOptions.getOptionWatchlistSortDirectionDrawableRes(sortOption.getSortDirection())));
        Context context = of.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[sortOption.getSortDirection().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            colorStateListValueOf = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        }
        of.setTrailingIconTint(colorStateListValueOf);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistSortBottomSheetFragment.sortOptionAdapter$lambda$1$lambda$0(this.f$0, sortOption);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortOptionAdapter$lambda$1$lambda$0(OptionWatchlistSortBottomSheetFragment optionWatchlistSortBottomSheetFragment, SortOption sortOption) {
        optionWatchlistSortBottomSheetFragment.getDuxo().updateSortOption(sortOption);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setSortOption(((Args) INSTANCE.getArgs((Fragment) this)).getSortOption());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView optionWatchlistSortRecyclerView = getBinding().optionWatchlistSortRecyclerView;
        Intrinsics.checkNotNullExpressionValue(optionWatchlistSortRecyclerView, "optionWatchlistSortRecyclerView");
        bindAdapter(optionWatchlistSortRecyclerView, this.sortOptionAdapter);
        RdsButton optionWatchlistSortDoneBtn = getBinding().optionWatchlistSortDoneBtn;
        Intrinsics.checkNotNullExpressionValue(optionWatchlistSortDoneBtn, "optionWatchlistSortDoneBtn");
        OnClickListeners.onClick(optionWatchlistSortDoneBtn, new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistSortBottomSheetFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(OptionWatchlistSortBottomSheetFragment optionWatchlistSortBottomSheetFragment) {
        optionWatchlistSortBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final List<SortOption> apply(CuratedListItemSortViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionWatchlistSortOptions();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209892(this.sortOptionAdapter));
    }

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$onStart$2 */
    /* synthetic */ class C209892 extends FunctionReferenceImpl implements Function1<List<? extends SortOption>, Unit> {
        C209892(Object obj) {
            super(1, obj, GenericListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SortOption> list) {
            invoke2((List<SortOption>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<SortOption> list) {
            ((GenericListAdapter) this.receiver).submitList(list);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment.onDismiss.1
            @Override // io.reactivex.functions.Function
            public final SortOption apply(CuratedListItemSortViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentSortOption();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209872(getCallbacks()));
    }

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment$onDismiss$2 */
    /* synthetic */ class C209872 extends FunctionReferenceImpl implements Function1<SortOption, Unit> {
        C209872(Object obj) {
            super(1, obj, CuratedListSortCallbacks.class, "onSortOptionSelected", "onSortOptionSelected(Lcom/robinhood/models/ui/SortOption;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SortOption sortOption) {
            invoke2(sortOption);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SortOption p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CuratedListSortCallbacks) this.receiver).onSortOptionSelected(p0);
        }
    }

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "sortOption", "Lcom/robinhood/models/ui/SortOption;", "<init>", "(Lcom/robinhood/models/ui/SortOption;)V", "getSortOption", "()Lcom/robinhood/models/ui/SortOption;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final SortOption sortOption;

        /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((SortOption) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, SortOption sortOption, int i, Object obj) {
            if ((i & 1) != 0) {
                sortOption = args.sortOption;
            }
            return args.copy(sortOption);
        }

        /* renamed from: component1, reason: from getter */
        public final SortOption getSortOption() {
            return this.sortOption;
        }

        public final Args copy(SortOption sortOption) {
            Intrinsics.checkNotNullParameter(sortOption, "sortOption");
            return new Args(sortOption);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.sortOption, ((Args) other).sortOption);
        }

        public int hashCode() {
            return this.sortOption.hashCode();
        }

        public String toString() {
            return "Args(sortOption=" + this.sortOption + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sortOption, flags);
        }

        public Args(SortOption sortOption) {
            Intrinsics.checkNotNullParameter(sortOption, "sortOption");
            this.sortOption = sortOption;
        }

        public final SortOption getSortOption() {
            return this.sortOption;
        }
    }

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment$OptionWatchlistSortRowInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionWatchlistSortRowInflater implements Inflater<RdsRowView> {
        public static final OptionWatchlistSortRowInflater INSTANCE = new OptionWatchlistSortRowInflater();
        private final /* synthetic */ Inflater<RdsRowView> $$delegate_0 = Inflater.INSTANCE.include(C20943R.layout.include_option_watchlist_sort_rds_row);

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsRowView) this.$$delegate_0.inflate(parent);
        }

        private OptionWatchlistSortRowInflater() {
        }
    }

    /* compiled from: OptionWatchlistSortBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistSortBottomSheetFragment$Args;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "<init>", "()V", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<OptionWatchlistSortBottomSheetFragment, Args, CuratedListSortCallbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionWatchlistSortBottomSheetFragment optionWatchlistSortBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, optionWatchlistSortBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & CuratedListSortCallbacks> OptionWatchlistSortBottomSheetFragment newInstance(Args args, C c, int i) {
            return (OptionWatchlistSortBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
