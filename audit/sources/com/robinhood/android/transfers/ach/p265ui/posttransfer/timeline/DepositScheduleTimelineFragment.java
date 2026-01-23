package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentDepositScheduleTimelineBinding;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs4;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.DepositScheduleTimelineViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
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

/* compiled from: DepositScheduleTimelineFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleTimelineBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleTimelineBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "timelineAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TimelineRowAdapterItem;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "state", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;", "refreshUi", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState$Loaded;", "onBackPressed", "", "toggleLoading", "isLoading", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DepositScheduleTimelineFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<RdsTimelineRowView, TimelineRowAdapterItem> timelineAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DepositScheduleTimelineFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleTimelineBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DepositScheduleTimelineFragment() {
        super(C30082R.layout.fragment_deposit_schedule_timeline);
        this.duxo = OldDuxos.oldDuxo(this, DepositScheduleTimelineDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DepositScheduleTimelineFragment3.INSTANCE);
        this.timelineAdapter = GenericListAdapter.INSTANCE.m2985of(C30082R.layout.include_ach_transfer_timeline_row, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$timelineAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((TimelineRowAdapterItem) obj).getPrimaryText();
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DepositScheduleTimelineFragment.timelineAdapter$lambda$0((RdsTimelineRowView) obj, (TimelineRowAdapterItem) obj2);
            }
        });
    }

    private final DepositScheduleTimelineDuxo getDuxo() {
        return (DepositScheduleTimelineDuxo) this.duxo.getValue();
    }

    private final FragmentDepositScheduleTimelineBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDepositScheduleTimelineBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timelineAdapter$lambda$0(RdsTimelineRowView of, TimelineRowAdapterItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setPrimaryText(item.getPrimaryText());
        of.setMetadataText(item.getMetaDataText());
        of.setTimestampText(item.getTimestampText());
        of.setState(item.getState());
        of.setPosition(item.getPosition());
        if (of.getState() == RdsTimelineRowView.State.COMPLETE) {
            of.setIconStyle(RdsTimelineRowView.IconStyle.FILLED);
            of.setIconDrawable(ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_checkmark_16dp));
        } else {
            of.setIconStyle(RdsTimelineRowView.IconStyle.NONE);
            of.setIconDrawable(null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentDepositScheduleTimelineBinding binding = getBinding();
        binding.depositScheduleTimelineContinueBtn.refreshDrawableState();
        RdsButton depositScheduleTimelineContinueBtn = binding.depositScheduleTimelineContinueBtn;
        Intrinsics.checkNotNullExpressionValue(depositScheduleTimelineContinueBtn, "depositScheduleTimelineContinueBtn");
        OnClickListeners.onClick(depositScheduleTimelineContinueBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositScheduleTimelineFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
        binding.depositScheduleTimelineRecyclerView.setAdapter(this.timelineAdapter);
        Observable<DepositScheduleTimelineViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C301872(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(DepositScheduleTimelineFragment depositScheduleTimelineFragment) {
        depositScheduleTimelineFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: DepositScheduleTimelineFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$onViewCreated$2 */
    /* synthetic */ class C301872 extends FunctionReferenceImpl implements Function1<DepositScheduleTimelineViewState, Unit> {
        C301872(Object obj) {
            super(1, obj, DepositScheduleTimelineFragment.class, "bindState", "bindState(Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DepositScheduleTimelineViewState depositScheduleTimelineViewState) {
            invoke2(depositScheduleTimelineViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DepositScheduleTimelineViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DepositScheduleTimelineFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(DepositScheduleTimelineViewState state) {
        if (state instanceof DepositScheduleTimelineViewState.Loading) {
            toggleLoading(true);
        } else {
            if (!(state instanceof DepositScheduleTimelineViewState.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            refreshUi((DepositScheduleTimelineViewState.Loaded) state);
        }
        final FragmentDepositScheduleTimelineBinding binding = getBinding();
        binding.depositScheduleTimelineRecyclerView.post(new Runnable() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineFragment$bindState$1$1
            @Override // java.lang.Runnable
            public final void run() {
                View depositScheduleTimelineShadow = binding.depositScheduleTimelineShadow;
                Intrinsics.checkNotNullExpressionValue(depositScheduleTimelineShadow, "depositScheduleTimelineShadow");
                depositScheduleTimelineShadow.setVisibility(binding.depositScheduleTimelineScrollView.canScrollVertically(1) ? 0 : 8);
            }
        });
    }

    private final void refreshUi(DepositScheduleTimelineViewState.Loaded state) {
        toggleLoading(false);
        FragmentDepositScheduleTimelineBinding binding = getBinding();
        RhTextView rhTextView = binding.depositScheduleTimelineAmount;
        StringResource depositScheduleTimelineAmountTextValue = state.getDepositScheduleTimelineAmountTextValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(depositScheduleTimelineAmountTextValue.getText(resources));
        RhTextView rhTextView2 = binding.depositScheduleTimelineAccount;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(state.getAchRelationshipTextValue(resources2));
        GenericListAdapter<RdsTimelineRowView, TimelineRowAdapterItem> genericListAdapter = this.timelineAdapter;
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        genericListAdapter.submitList(state.getTimelineAdapterRows(resources3));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    private final void toggleLoading(boolean isLoading) {
        FragmentDepositScheduleTimelineBinding binding = getBinding();
        ShimmerLoadingView depositScheduleTimelineLoadingView = binding.depositScheduleTimelineLoadingView;
        Intrinsics.checkNotNullExpressionValue(depositScheduleTimelineLoadingView, "depositScheduleTimelineLoadingView");
        depositScheduleTimelineLoadingView.setVisibility(isLoading ? 0 : 8);
        binding.depositScheduleTimelineContinueBtn.setEnabled(!isLoading);
    }

    /* compiled from: DepositScheduleTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment$Args;", "Landroid/os/Parcelable;", "timelineArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;)V", "getTimelineArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DepositScheduleFlowArgs4 timelineArgs;

        /* compiled from: DepositScheduleTimelineFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DepositScheduleFlowArgs4.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DepositScheduleFlowArgs4 depositScheduleFlowArgs4, int i, Object obj) {
            if ((i & 1) != 0) {
                depositScheduleFlowArgs4 = args.timelineArgs;
            }
            return args.copy(depositScheduleFlowArgs4);
        }

        /* renamed from: component1, reason: from getter */
        public final DepositScheduleFlowArgs4 getTimelineArgs() {
            return this.timelineArgs;
        }

        public final Args copy(DepositScheduleFlowArgs4 timelineArgs) {
            Intrinsics.checkNotNullParameter(timelineArgs, "timelineArgs");
            return new Args(timelineArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.timelineArgs, ((Args) other).timelineArgs);
        }

        public int hashCode() {
            return this.timelineArgs.hashCode();
        }

        public String toString() {
            return "Args(timelineArgs=" + this.timelineArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.timelineArgs.writeToParcel(dest, flags);
        }

        public Args(DepositScheduleFlowArgs4 timelineArgs) {
            Intrinsics.checkNotNullParameter(timelineArgs, "timelineArgs");
            this.timelineArgs = timelineArgs;
        }

        public final DepositScheduleFlowArgs4 getTimelineArgs() {
            return this.timelineArgs;
        }
    }

    /* compiled from: DepositScheduleTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DepositScheduleTimelineFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DepositScheduleTimelineFragment depositScheduleTimelineFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, depositScheduleTimelineFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DepositScheduleTimelineFragment newInstance(Args args) {
            return (DepositScheduleTimelineFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DepositScheduleTimelineFragment depositScheduleTimelineFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, depositScheduleTimelineFragment, args);
        }
    }
}
