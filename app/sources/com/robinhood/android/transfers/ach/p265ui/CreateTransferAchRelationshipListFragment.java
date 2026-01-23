package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.banking.p065ui.AchRelationshipAdapter;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.view.RhFloatingActionButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.CreateTransferAchRelationshipListFragment;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CreateTransferAchRelationshipListFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u0001:\u0003<=>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010(H\u0016J\u001a\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u00102\u001a\u00020#H\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020#H\u0016J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u000209H\u0016J\f\u0010:\u001a\u0006\u0012\u0002\b\u00030;H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 ¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment;", "Lcom/robinhood/android/transfers/ach/ui/RhRecyclerViewFragment;", "<init>", "()V", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "getAchRelationshipStore", "()Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "setAchRelationshipStore", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;)V", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "fab", "Lcom/robinhood/android/common/view/RhFloatingActionButton;", "getFab", "()Lcom/robinhood/android/common/view/RhFloatingActionButton;", "fab$delegate", "achRelationshipAdapter", "Lcom/robinhood/android/banking/ui/AchRelationshipAdapter;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "bundle", "onViewCreated", "view", "onStart", "bind", "state", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListViewState;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferAchRelationshipListFragment extends RhRecyclerViewFragment {
    public AchRelationshipStore achRelationshipStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateTransferAchRelationshipListFragment.class, "coordinatorLayout", "getCoordinatorLayout()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), Reflection.property1(new PropertyReference1Impl(CreateTransferAchRelationshipListFragment.class, "fab", "getFab()Lcom/robinhood/android/common/view/RhFloatingActionButton;", 0)), Reflection.property1(new PropertyReference1Impl(CreateTransferAchRelationshipListFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: coordinatorLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 coordinatorLayout = bindView(C30082R.id.fab_coordinator_layout);

    /* renamed from: fab$delegate, reason: from kotlin metadata */
    private final Interfaces2 fab = bindView(C30082R.id.fab);
    private final AchRelationshipAdapter achRelationshipAdapter = new AchRelationshipAdapter(true);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CreateTransferAchRelationshipListDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateTransferAchRelationshipListFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: CreateTransferAchRelationshipListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Callbacks;", "", "onAchRelationshipSelected", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAchRelationshipSelected();
    }

    /* compiled from: CreateTransferAchRelationshipListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateTransferAchRelationshipListDuxo2.values().length];
            try {
                iArr[CreateTransferAchRelationshipListDuxo2.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateTransferAchRelationshipListDuxo2.NEED_TO_VERIFY_MICRODEPOSITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateTransferAchRelationshipListDuxo2.UNVERIFIED_BUT_NO_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final AchRelationshipStore getAchRelationshipStore() {
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore;
        if (achRelationshipStore != null) {
            return achRelationshipStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("achRelationshipStore");
        return null;
    }

    public final void setAchRelationshipStore(AchRelationshipStore achRelationshipStore) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "<set-?>");
        this.achRelationshipStore = achRelationshipStore;
    }

    private final CoordinatorLayout getCoordinatorLayout() {
        return (CoordinatorLayout) this.coordinatorLayout.getValue(this, $$delegatedProperties[0]);
    }

    private final RhFloatingActionButton getFab() {
        return (RhFloatingActionButton) this.fab.getValue(this, $$delegatedProperties[1]);
    }

    private final CreateTransferAchRelationshipListDuxo getDuxo() {
        return (CreateTransferAchRelationshipListDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Preconditions.checkImplementsInterface(context, Callbacks.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setEmptyText(getString(C30082R.string.ach_list_empty_message));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewGroup viewGroup = (ViewGroup) super.onCreateView(inflater, container, bundle);
        inflater.inflate(C30082R.layout.include_add_ach_relationship_fab, viewGroup);
        return viewGroup;
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.RhRecyclerViewFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getFab(), new Function0() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferAchRelationshipListFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CreateTransferAchRelationshipListFragment createTransferAchRelationshipListFragment) {
        Navigator navigator = createTransferAchRelationshipListFragment.getNavigator();
        Context contextRequireContext = createTransferAchRelationshipListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CreateIavRelationshipIntentKey(IavSource.TRANSFER, ((Args) INSTANCE.getArgs((Fragment) createTransferAchRelationshipListFragment)).getDirection(), null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C301151(this));
    }

    /* compiled from: CreateTransferAchRelationshipListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment$onStart$1 */
    /* synthetic */ class C301151 extends FunctionReferenceImpl implements Function1<CreateTransferAchRelationshipListViewState, Unit> {
        C301151(Object obj) {
            super(1, obj, CreateTransferAchRelationshipListFragment.class, "bind", "bind(Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateTransferAchRelationshipListViewState createTransferAchRelationshipListViewState) {
            invoke2(createTransferAchRelationshipListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CreateTransferAchRelationshipListViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CreateTransferAchRelationshipListFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CreateTransferAchRelationshipListViewState state) {
        final SelectionResult selectionResultConsume;
        UiEvent<SelectionResult> selectionResult = state.getSelectionResult();
        if (selectionResult != null && (selectionResultConsume = selectionResult.consume()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[selectionResultConsume.getState().ordinal()];
            if (i == 1) {
                getCallbacks().onAchRelationshipSelected();
            } else if (i == 2) {
                RdsSnackbar.setAction$default(RdsSnackbar.INSTANCE.make(getCoordinatorLayout(), C30082R.string.ach_relationship_error_must_verify, 0), getString(C30082R.string.ach_relationship_action_verify), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferAchRelationshipListFragment.bind$lambda$2$lambda$1(this.f$0, selectionResultConsume);
                    }
                }, 14, (Object) null).show();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                RdsSnackbar.INSTANCE.make(getCoordinatorLayout(), C30082R.string.ach_relationship_error_unverified_but_no_path, 0).show();
            }
        }
        this.achRelationshipAdapter.setAchRelationships(state.getAchRelationships());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(CreateTransferAchRelationshipListFragment createTransferAchRelationshipListFragment, SelectionResult selectionResult) {
        Navigator navigator = createTransferAchRelationshipListFragment.getNavigator();
        Context contextRequireContext = createTransferAchRelationshipListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.VerifyMicrodeposits(selectionResult.getAchRelationship()), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<R> map = this.achRelationshipAdapter.getAchRelationshipClicksObservable().map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final AchRelationship apply(Tuples2<? extends View, AchRelationship> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSecond();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferAchRelationshipListFragment.onResume$lambda$3(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(CreateTransferAchRelationshipListFragment createTransferAchRelationshipListFragment, AchRelationship achRelationship) {
        CreateTransferAchRelationshipListDuxo duxo = createTransferAchRelationshipListFragment.getDuxo();
        Intrinsics.checkNotNull(achRelationship);
        duxo.select(achRelationship);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C30082R.string.ach_transfer_relationship_selector_title);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.RhRecyclerViewFragment
    protected RecyclerView.Adapter<?> createAdapter() {
        return this.achRelationshipAdapter;
    }

    /* compiled from: CreateTransferAchRelationshipListFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Args;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;)V", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final TransferDirection direction;

        /* compiled from: CreateTransferAchRelationshipListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(TransferDirection.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, TransferDirection transferDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                transferDirection = args.direction;
            }
            return args.copy(transferDirection);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        public final Args copy(TransferDirection direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new Args(direction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.direction == ((Args) other).direction;
        }

        public int hashCode() {
            return this.direction.hashCode();
        }

        public String toString() {
            return "Args(direction=" + this.direction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.direction.name());
        }

        public Args(TransferDirection direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
        }

        public final TransferDirection getDirection() {
            return this.direction;
        }
    }

    /* compiled from: CreateTransferAchRelationshipListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment;", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreateTransferAchRelationshipListFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CreateTransferAchRelationshipListFragment createTransferAchRelationshipListFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createTransferAchRelationshipListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateTransferAchRelationshipListFragment newInstance(Args args) {
            return (CreateTransferAchRelationshipListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateTransferAchRelationshipListFragment createTransferAchRelationshipListFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createTransferAchRelationshipListFragment, args);
        }
    }
}
