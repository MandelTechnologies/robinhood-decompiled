package com.robinhood.android.settings.p254ui.recurring.pastinvestments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.settings.p254ui.recurring.C28446R;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.recurring.contracts.RecurringPastInvestmentsFragmentKey;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PastInvestmentsFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pastInvestmentsList", "Landroidx/recyclerview/widget/RecyclerView;", "getPastInvestmentsList$annotations", "getPastInvestmentsList", "()Landroidx/recyclerview/widget/RecyclerView;", "pastInvestmentsList$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setState", "state", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsViewState;", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PastInvestmentsFragment extends BaseFragment {
    private final GenericListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> adapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: pastInvestmentsList$delegate, reason: from kotlin metadata */
    private final Interfaces2 pastInvestmentsList;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PastInvestmentsFragment.class, "pastInvestmentsList", "getPastInvestmentsList()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private static /* synthetic */ void getPastInvestmentsList$annotations() {
    }

    public PastInvestmentsFragment() {
        super(C28446R.layout.fragment_past_investments);
        this.duxo = DuxosKt.duxo(this, PastInvestmentsDuxo.class);
        this.pastInvestmentsList = bindView(C28446R.id.past_investments_list);
        this.adapter = GenericListAdapter.INSTANCE.m2986of(HistoryRowView.Companion.HistoryRowInflater.INSTANCE, HistoryEventDiffCallbacks.getDiffCallback(StatefulHistoryEvent.INSTANCE));
        this.useDesignSystemToolbar = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PastInvestmentsDuxo getDuxo() {
        return (PastInvestmentsDuxo) this.duxo.getValue();
    }

    private final RecyclerView getPastInvestmentsList() {
        return (RecyclerView) this.pastInvestmentsList.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
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
        getPastInvestmentsList().setLayoutManager(new LinearLayoutManager(getContext()));
        getPastInvestmentsList().setAdapter(this.adapter);
        BaseFragment.collectDuxoState$default(this, null, new C284681(null), 1, null);
    }

    /* compiled from: PastInvestmentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsFragment$onViewCreated$1", m3645f = "PastInvestmentsFragment.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsFragment$onViewCreated$1 */
    static final class C284681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C284681(Continuation<? super C284681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PastInvestmentsFragment.this.new C284681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C284681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PastInvestmentsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PastInvestmentsFragment $tmp0;

            AnonymousClass1(PastInvestmentsFragment pastInvestmentsFragment) {
                this.$tmp0 = pastInvestmentsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PastInvestmentsFragment.class, "setState", "setState(Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(PastInvestmentsViewState pastInvestmentsViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setState = C284681.invokeSuspend$setState(this.$tmp0, pastInvestmentsViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PastInvestmentsViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(PastInvestmentsFragment pastInvestmentsFragment, PastInvestmentsViewState pastInvestmentsViewState, Continuation continuation) {
            pastInvestmentsFragment.setState(pastInvestmentsViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PastInvestmentsViewState> stateFlow = PastInvestmentsFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PastInvestmentsFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitleAlpha(0.0f);
        Toolbar toolbar2 = toolbar.getToolbar();
        if (((RecurringPastInvestmentsFragmentKey) INSTANCE.getArgs((Fragment) this)).isCrypto()) {
            drawable = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_arrow_left_24dp);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            drawable.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground1));
        } else {
            drawable = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_close_24dp);
        }
        toolbar2.setNavigationIcon(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(PastInvestmentsViewState state) {
        this.adapter.submitList(state.getInvestmentScheduleEvents());
    }

    /* compiled from: PastInvestmentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsFragment;", "Lcom/robinhood/shared/recurring/contracts/RecurringPastInvestmentsFragmentKey;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PastInvestmentsFragment, RecurringPastInvestmentsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RecurringPastInvestmentsFragmentKey recurringPastInvestmentsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, recurringPastInvestmentsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringPastInvestmentsFragmentKey getArgs(PastInvestmentsFragment pastInvestmentsFragment) {
            return (RecurringPastInvestmentsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pastInvestmentsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PastInvestmentsFragment newInstance(RecurringPastInvestmentsFragmentKey recurringPastInvestmentsFragmentKey) {
            return (PastInvestmentsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, recurringPastInvestmentsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PastInvestmentsFragment pastInvestmentsFragment, RecurringPastInvestmentsFragmentKey recurringPastInvestmentsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pastInvestmentsFragment, recurringPastInvestmentsFragmentKey);
        }
    }
}
