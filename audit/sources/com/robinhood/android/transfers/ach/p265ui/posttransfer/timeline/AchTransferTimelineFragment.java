package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferTimelineBinding;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineState;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AchTransferTimelineFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferTimelineBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferTimelineBinding;", "binding$delegate", "timelineAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$TimelineRowAdapterItem;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "showAchRelationshipText", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "toggleLoading", "isLoading", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AchTransferTimelineFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<RdsTimelineRowView, AchTransferTimelineState.TimelineRowAdapterItem> timelineAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchTransferTimelineFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(AchTransferTimelineFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferTimelineBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchTransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Callbacks;", "", "showInstantDepositPage", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "showTransferConfirmation", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void showInstantDepositPage(AchTransfer achTransfer);

        void showTransferConfirmation(AchTransfer achTransfer, AutomaticDeposit automaticDeposit);
    }

    public AchTransferTimelineFragment() {
        super(C30082R.layout.fragment_ach_transfer_timeline);
        this.duxo = DuxosKt.duxo(this, AchTransferTimelineDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchTransferTimelineFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, AchTransferTimelineFragment2.INSTANCE);
        this.timelineAdapter = GenericListAdapter.INSTANCE.m2985of(C30082R.layout.include_ach_transfer_timeline_row, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferTimelineFragment.timelineAdapter$lambda$0((AchTransferTimelineState.TimelineRowAdapterItem) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AchTransferTimelineFragment.timelineAdapter$lambda$1((RdsTimelineRowView) obj, (AchTransferTimelineState.TimelineRowAdapterItem) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AchTransferTimelineDuxo getDuxo() {
        return (AchTransferTimelineDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAchTransferTimelineBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAchTransferTimelineBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object timelineAdapter$lambda$0(AchTransferTimelineState.TimelineRowAdapterItem byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getPrimaryText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timelineAdapter$lambda$1(RdsTimelineRowView of, AchTransferTimelineState.TimelineRowAdapterItem item) {
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
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentAchTransferTimelineBinding binding = getBinding();
        binding.achTransferTimelineContinueBtn.refreshDrawableState();
        binding.achTransferTimelineRecyclerView.setAdapter(this.timelineAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C301852(null), 1, null);
        FragmentAchTransferTimelineBinding binding2 = getBinding();
        RhTextView rhTextView = binding2.achTransferTimelineAmount;
        int i = C30082R.string.ach_transfer_timeline_amount;
        Companion companion = INSTANCE;
        rhTextView.setText(getString(i, Money.format$default(((Args) companion.getArgs((Fragment) this)).getAchTransfer().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        binding2.achTransferTimelineDetail.setText(getString(C30082R.string.ach_transfer_timeline_detail, Money.format$default(((Args) companion.getArgs((Fragment) this)).getAchTransfer().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        RdsButton rdsButton = binding2.achTransferTimelineContinueBtn;
        if (BigDecimals7.isPositive(((Args) companion.getArgs((Fragment) this)).getAchTransfer().getEarlyAccessAmount().getDecimalValue())) {
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferTimelineFragment.onViewCreated$lambda$7$lambda$6$lambda$4(this.f$0);
                }
            });
        } else {
            rdsButton.setText(getString(C11048R.string.general_label_done));
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferTimelineFragment.onViewCreated$lambda$7$lambda$6$lambda$5(this.f$0);
                }
            });
        }
    }

    /* compiled from: AchTransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$onViewCreated$2", m3645f = "AchTransferTimelineFragment.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$onViewCreated$2 */
    static final class C301852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301852(Continuation<? super C301852> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchTransferTimelineFragment.this.new C301852(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.TRANSFERS_TIMELINE, true);
                StateFlow<AchTransferTimelineState> stateFlow = AchTransferTimelineFragment.this.getDuxo().getStateFlow();
                final AchTransferTimelineFragment achTransferTimelineFragment = AchTransferTimelineFragment.this;
                FlowCollector<? super AchTransferTimelineState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AchTransferTimelineState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AchTransferTimelineState achTransferTimelineState, Continuation<? super Unit> continuation) {
                        IdlingResourceType idlingResourceType = IdlingResourceType.TRANSFERS_TIMELINE;
                        IdlingResourceCounters2.setBusy(idlingResourceType, false);
                        if (achTransferTimelineState instanceof AchTransferTimelineState.Loading) {
                            achTransferTimelineFragment.toggleLoading(true);
                        } else if (achTransferTimelineState instanceof AchTransferTimelineState.Loaded) {
                            AchTransferTimelineState.Loaded loaded = (AchTransferTimelineState.Loaded) achTransferTimelineState;
                            achTransferTimelineFragment.getBinding().achTransferTimelineTitle.setText(achTransferTimelineFragment.getString(loaded.getTitleTextRes()));
                            achTransferTimelineFragment.showAchRelationshipText(loaded.getAchRelationship());
                            GenericListAdapter genericListAdapter = achTransferTimelineFragment.timelineAdapter;
                            Resources resources = achTransferTimelineFragment.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            genericListAdapter.submitList(loaded.getTimelineAdapterRows(resources));
                            achTransferTimelineFragment.toggleLoading(false);
                            IdlingResourceCounters2.setBusy(idlingResourceType, false);
                        } else if (Intrinsics.areEqual(achTransferTimelineState, AchTransferTimelineState.Error.INSTANCE)) {
                            Callbacks callbacks = achTransferTimelineFragment.getCallbacks();
                            Companion companion = AchTransferTimelineFragment.INSTANCE;
                            callbacks.showTransferConfirmation(((Args) companion.getArgs((Fragment) achTransferTimelineFragment)).getAchTransfer(), ((Args) companion.getArgs((Fragment) achTransferTimelineFragment)).getAutomaticDeposit());
                            IdlingResourceCounters2.setBusy(idlingResourceType, false);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        final FragmentAchTransferTimelineBinding binding = achTransferTimelineFragment.getBinding();
                        binding.achTransferTimelineRecyclerView.post(new Runnable() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment$onViewCreated$2$1$1$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                View achTransferTimelineShadow = binding.achTransferTimelineShadow;
                                Intrinsics.checkNotNullExpressionValue(achTransferTimelineShadow, "achTransferTimelineShadow");
                                achTransferTimelineShadow.setVisibility(binding.achTransferTimelineScrollView.canScrollVertically(1) ? 0 : 8);
                            }
                        });
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$4(AchTransferTimelineFragment achTransferTimelineFragment) {
        achTransferTimelineFragment.getCallbacks().showInstantDepositPage(((Args) INSTANCE.getArgs((Fragment) achTransferTimelineFragment)).getAchTransfer());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(AchTransferTimelineFragment achTransferTimelineFragment) {
        achTransferTimelineFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAchRelationshipText(AchRelationship achRelationship) {
        RhTextView rhTextView = getBinding().achTransferTimelineAccount;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(AchRelationships.getAchRelationshipDisplayName(achRelationship, resources));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleLoading(boolean isLoading) {
        FragmentAchTransferTimelineBinding binding = getBinding();
        ShimmerLoadingView achTransferTimelineLoadingView = binding.achTransferTimelineLoadingView;
        Intrinsics.checkNotNullExpressionValue(achTransferTimelineLoadingView, "achTransferTimelineLoadingView");
        achTransferTimelineLoadingView.setVisibility(isLoading ? 0 : 8);
        binding.achTransferTimelineContinueBtn.setEnabled(!isLoading);
    }

    /* compiled from: AchTransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Args;", "Landroid/os/Parcelable;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AutomaticDeposit;)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "getAutomaticDeposit", "()Lcom/robinhood/models/db/AutomaticDeposit;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AchTransfer achTransfer;
        private final AutomaticDeposit automaticDeposit;

        /* compiled from: AchTransferTimelineFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AchTransfer) parcel.readParcelable(Args.class.getClassLoader()), (AutomaticDeposit) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AchTransfer achTransfer, AutomaticDeposit automaticDeposit, int i, Object obj) {
            if ((i & 1) != 0) {
                achTransfer = args.achTransfer;
            }
            if ((i & 2) != 0) {
                automaticDeposit = args.automaticDeposit;
            }
            return args.copy(achTransfer, automaticDeposit);
        }

        /* renamed from: component1, reason: from getter */
        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        /* renamed from: component2, reason: from getter */
        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }

        public final Args copy(AchTransfer achTransfer, AutomaticDeposit automaticDeposit) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            return new Args(achTransfer, automaticDeposit);
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
            return Intrinsics.areEqual(this.achTransfer, args.achTransfer) && Intrinsics.areEqual(this.automaticDeposit, args.automaticDeposit);
        }

        public int hashCode() {
            int iHashCode = this.achTransfer.hashCode() * 31;
            AutomaticDeposit automaticDeposit = this.automaticDeposit;
            return iHashCode + (automaticDeposit == null ? 0 : automaticDeposit.hashCode());
        }

        public String toString() {
            return "Args(achTransfer=" + this.achTransfer + ", automaticDeposit=" + this.automaticDeposit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.achTransfer, flags);
            dest.writeParcelable(this.automaticDeposit, flags);
        }

        public Args(AchTransfer achTransfer, AutomaticDeposit automaticDeposit) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            this.achTransfer = achTransfer;
            this.automaticDeposit = automaticDeposit;
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }
    }

    /* compiled from: AchTransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchTransferTimelineFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AchTransferTimelineFragment achTransferTimelineFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achTransferTimelineFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchTransferTimelineFragment newInstance(Args args) {
            return (AchTransferTimelineFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchTransferTimelineFragment achTransferTimelineFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achTransferTimelineFragment, args);
        }
    }
}
