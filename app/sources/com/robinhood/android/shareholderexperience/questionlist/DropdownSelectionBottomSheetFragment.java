package com.robinhood.android.shareholderexperience.questionlist;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.FragmentDropdownSelectionBottomSheetBinding;
import com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: DropdownSelectionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentDropdownSelectionBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentDropdownSelectionBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$DropdownRow;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "activate", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "Callbacks", "DropdownRow", "Args", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DropdownSelectionBottomSheetFragment extends BaseBottomSheetDialogFragment {
    private final GenericListAdapter<RdsRowView, DropdownRow> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DropdownSelectionBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentDropdownSelectionBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DropdownSelectionBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DropdownSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "", "onItemSelected", "", "dropdownType", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onItemSelected(DropdownType dropdownType, DropdownItem item);
    }

    public DropdownSelectionBottomSheetFragment() {
        super(C28477R.layout.fragment_dropdown_selection_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, DropdownSelectionBottomSheetFragment3.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
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
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment$adapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((DropdownSelectionBottomSheetFragment.DropdownRow) obj).getItem();
            }
        }), new Function2() { // from class: com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DropdownSelectionBottomSheetFragment.adapter$lambda$2(this.f$0, (RdsRowView) obj, (DropdownSelectionBottomSheetFragment.DropdownRow) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropdownSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$DropdownRow;", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "isActive", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/DropdownItem;Z)V", "getItem", "()Lcom/robinhood/shareholderx/models/db/DropdownItem;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class DropdownRow {
        private final boolean isActive;
        private final DropdownItem item;

        public static /* synthetic */ DropdownRow copy$default(DropdownRow dropdownRow, DropdownItem dropdownItem, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                dropdownItem = dropdownRow.item;
            }
            if ((i & 2) != 0) {
                z = dropdownRow.isActive;
            }
            return dropdownRow.copy(dropdownItem, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DropdownItem getItem() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final DropdownRow copy(DropdownItem item, boolean isActive) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new DropdownRow(item, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DropdownRow)) {
                return false;
            }
            DropdownRow dropdownRow = (DropdownRow) other;
            return Intrinsics.areEqual(this.item, dropdownRow.item) && this.isActive == dropdownRow.isActive;
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "DropdownRow(item=" + this.item + ", isActive=" + this.isActive + ")";
        }

        public DropdownRow(DropdownItem item, boolean z) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.isActive = z;
        }

        public final DropdownItem getItem() {
            return this.item;
        }

        public final boolean isActive() {
            return this.isActive;
        }
    }

    private final FragmentDropdownSelectionBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDropdownSelectionBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(DropdownSelectionBottomSheetFragment dropdownSelectionBottomSheetFragment, DropdownRow dropdownRow) {
        dropdownSelectionBottomSheetFragment.activate(dropdownRow.getItem());
        dropdownSelectionBottomSheetFragment.getCallbacks().onItemSelected(((Args) INSTANCE.getArgs((Fragment) dropdownSelectionBottomSheetFragment)).getType(), dropdownRow.getItem());
        dropdownSelectionBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().dropdownSelectionRecyclerView.setAdapter(this.adapter);
        Companion companion = INSTANCE;
        activate(((Args) companion.getArgs((Fragment) this)).getActiveItem());
        FragmentDropdownSelectionBottomSheetBinding binding = getBinding();
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, root, 0.0f, 2, null);
        RhTextView rhTextView = binding.dropdownSelectionTitle;
        String title = ((Args) companion.getArgs((Fragment) this)).getTitle();
        if (title == null) {
            title = getString(((Args) companion.getArgs((Fragment) this)).getType().getTitleRes());
            Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
        }
        rhTextView.setText(title);
    }

    private final void activate(DropdownItem item) {
        GenericListAdapter<RdsRowView, DropdownRow> genericListAdapter = this.adapter;
        List<DropdownItem> options = ((Args) INSTANCE.getArgs((Fragment) this)).getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        for (DropdownItem dropdownItem : options) {
            arrayList.add(new DropdownRow(dropdownItem, Intrinsics.areEqual(dropdownItem, item)));
        }
        genericListAdapter.submitList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final DropdownSelectionBottomSheetFragment dropdownSelectionBottomSheetFragment, final RdsRowView of, final DropdownRow rowData) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        final ViewTreeObserver viewTreeObserver = of.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment$adapter$lambda$2$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = of.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    RdsRowView rdsRowView = of;
                    Context context2 = rdsRowView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    rdsRowView.setTrailingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorForeground1)));
                    of.setTrailingIconDrawable(rowData.isActive() ? ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_checkmark_16dp) : null);
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                of.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        of.setPrimaryText(rowData.getItem().getLabel());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DropdownSelectionBottomSheetFragment.adapter$lambda$2$lambda$1(this.f$0, rowData);
            }
        });
        return Unit.INSTANCE;
    }

    /* compiled from: DropdownSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "activeItem", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "options", "", "title", "", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;Lcom/robinhood/shareholderx/models/db/DropdownItem;Ljava/util/List;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "getActiveItem", "()Lcom/robinhood/shareholderx/models/db/DropdownItem;", "getOptions", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DropdownItem activeItem;
        private final List<DropdownItem> options;
        private final String title;
        private final DropdownType type;

        /* compiled from: DropdownSelectionBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DropdownType dropdownTypeValueOf = DropdownType.valueOf(parcel.readString());
                DropdownItem dropdownItem = (DropdownItem) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(dropdownTypeValueOf, dropdownItem, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, DropdownType dropdownType, DropdownItem dropdownItem, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                dropdownType = args.type;
            }
            if ((i & 2) != 0) {
                dropdownItem = args.activeItem;
            }
            if ((i & 4) != 0) {
                list = args.options;
            }
            if ((i & 8) != 0) {
                str = args.title;
            }
            return args.copy(dropdownType, dropdownItem, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DropdownType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final DropdownItem getActiveItem() {
            return this.activeItem;
        }

        public final List<DropdownItem> component3() {
            return this.options;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Args copy(DropdownType type2, DropdownItem activeItem, List<DropdownItem> options, String title) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(activeItem, "activeItem");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Args(type2, activeItem, options, title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.type == args.type && Intrinsics.areEqual(this.activeItem, args.activeItem) && Intrinsics.areEqual(this.options, args.options) && Intrinsics.areEqual(this.title, args.title);
        }

        public int hashCode() {
            int iHashCode = ((((this.type.hashCode() * 31) + this.activeItem.hashCode()) * 31) + this.options.hashCode()) * 31;
            String str = this.title;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(type=" + this.type + ", activeItem=" + this.activeItem + ", options=" + this.options + ", title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeParcelable(this.activeItem, flags);
            List<DropdownItem> list = this.options;
            dest.writeInt(list.size());
            Iterator<DropdownItem> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.title);
        }

        public Args(DropdownType type2, DropdownItem activeItem, List<DropdownItem> options, String str) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(activeItem, "activeItem");
            Intrinsics.checkNotNullParameter(options, "options");
            this.type = type2;
            this.activeItem = activeItem;
            this.options = options;
            this.title = str;
        }

        public /* synthetic */ Args(DropdownType dropdownType, DropdownItem dropdownItem, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dropdownType, dropdownItem, list, (i & 8) != 0 ? null : str);
        }

        public final DropdownType getType() {
            return this.type;
        }

        public final DropdownItem getActiveItem() {
            return this.activeItem;
        }

        public final List<DropdownItem> getOptions() {
            return this.options;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: DropdownSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Args;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<DropdownSelectionBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DropdownSelectionBottomSheetFragment dropdownSelectionBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, dropdownSelectionBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> DropdownSelectionBottomSheetFragment newInstance(Args args, C c, int i) {
            return (DropdownSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
