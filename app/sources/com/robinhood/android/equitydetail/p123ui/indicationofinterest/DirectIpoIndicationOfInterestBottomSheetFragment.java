package com.robinhood.android.equitydetail.p123ui.indicationofinterest;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentDirectIpoIndicationOfInterestBottomSheetBinding;
import com.robinhood.android.equitydetail.p123ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.indicationofinterest.DirectIpoIndicationOfInterestViewState;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.directipo.models.p292db.DirectIpoIndicationOfInterest;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
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

/* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003EFGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u0002002\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>H\u0002J\t\u0010?\u001a\u00020;H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/view/DisclosureView$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "dialogId", "", "getDialogId", "()I", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "duxo", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentDirectIpoIndicationOfInterestBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentDirectIpoIndicationOfInterestBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Callbacks;", "callbacks$delegate", "listAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/directipo/models/db/DirectIpoIndicationOfInterest$Row;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onReviewed", "reviewed", "", "setViewState", "state", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DirectIpoIndicationOfInterestBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated, DisclosureView.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<RdsRowView, DirectIpoIndicationOfInterest.Row> listAdapter;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoIndicationOfInterestBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentDirectIpoIndicationOfInterestBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoIndicationOfInterestBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Callbacks;", "", "onExpressInterestSuccess", "", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "onExpressInterestError", "throwable", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExpressInterestError(Throwable throwable);

        void onExpressInterestSuccess(GenericAlert alert);
    }

    /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectIpoIndicationOfInterestViewState.AcceptButtonAction.values().length];
            try {
                iArr[DirectIpoIndicationOfInterestViewState.AcceptButtonAction.REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectIpoIndicationOfInterestViewState.AcceptButtonAction.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoIndicationOfInterestBottomSheetFragment() {
        super(C15314R.layout.fragment_direct_ipo_indication_of_interest_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DirectIpoIndicationOfInterestDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoIndicationOfInterestBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectIpoIndicationOfInterestBottomSheetFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.listAdapter = GenericListAdapter.INSTANCE.m2985of(C13997R.layout.include_rds_row_value_prop, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoIndicationOfInterestBottomSheetFragment.listAdapter$lambda$0(this.f$0, (RdsRowView) obj, (DirectIpoIndicationOfInterest.Row) obj2);
            }
        });
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return C15314R.id.dialog_id_indication_of_interest;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    private final DirectIpoIndicationOfInterestDuxo getDuxo() {
        return (DirectIpoIndicationOfInterestDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDirectIpoIndicationOfInterestBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoIndicationOfInterestBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$0(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment, RdsRowView of, DirectIpoIndicationOfInterest.Row it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, it.getIcon().getResourceId()));
        of.setPrimaryText(directIpoIndicationOfInterestBottomSheetFragment.getMarkwon().toMarkdown(it.getTitleMarkdown()));
        of.setSecondaryText(directIpoIndicationOfInterestBottomSheetFragment.getMarkwon().toMarkdown(it.getSubtitleMarkdown()));
        of.setClickable(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(contextRequireContext), DirectIpoIndicationOfInterestOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView list = getBinding().list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.listAdapter);
        getBinding().buttonAccept.setLoading(true);
        getBinding().scrollView.setCallbacks(this);
        RdsButton buttonDismiss = getBinding().buttonDismiss;
        Intrinsics.checkNotNullExpressionValue(buttonDismiss, "buttonDismiss");
        OnClickListeners.onClick(buttonDismiss, new Function0() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoIndicationOfInterestBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(directIpoIndicationOfInterestBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_INDICATION_OF_INTEREST, "dismiss", ((Args) INSTANCE.getArgs((Fragment) directIpoIndicationOfInterestBottomSheetFragment)).getInstrumentId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        directIpoIndicationOfInterestBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C155031(this));
        Observable<DirectIpoIndicationOfInterestViewState> states = getDuxo().getStates();
        final C155042 c155042 = new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment.onStart.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((DirectIpoIndicationOfInterestViewState) obj).getAcceptButtonAction();
            }
        };
        Observable<R> map = states.map(new Function(c155042) { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c155042, "function");
                this.function = c155042;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestBottomSheetFragment.onStart$lambda$4(this.f$0, (DirectIpoIndicationOfInterestViewState.AcceptButtonAction) obj);
            }
        });
        RecyclerView list = getBinding().list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        Observable observableTake = RxView.layoutChanges(list).withLatestFrom(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), new BiFunction() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment.onStart.4
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<Integer, DirectIpoIndicationOfInterestViewState> apply(Unit unit, DirectIpoIndicationOfInterestViewState state) {
                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                Intrinsics.checkNotNullParameter(state, "state");
                return Tuples4.m3642to(Integer.valueOf(DirectIpoIndicationOfInterestBottomSheetFragment.this.getBinding().list.getChildCount()), state);
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment.onStart.5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<Integer, DirectIpoIndicationOfInterestViewState> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                int iIntValue = tuples2.component1().intValue();
                DirectIpoIndicationOfInterestViewState directIpoIndicationOfInterestViewStateComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(directIpoIndicationOfInterestViewStateComponent2, "component2(...)");
                DirectIpoIndicationOfInterestViewState directIpoIndicationOfInterestViewState = directIpoIndicationOfInterestViewStateComponent2;
                if (iIntValue <= 0) {
                    return directIpoIndicationOfInterestViewState.getContentLoaded() && directIpoIndicationOfInterestViewState.getRows().isEmpty();
                }
                return true;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestBottomSheetFragment.onStart$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$onStart$1 */
    /* synthetic */ class C155031 extends FunctionReferenceImpl implements Function1<DirectIpoIndicationOfInterestViewState, Unit> {
        C155031(Object obj) {
            super(1, obj, DirectIpoIndicationOfInterestBottomSheetFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoIndicationOfInterestViewState directIpoIndicationOfInterestViewState) {
            invoke2(directIpoIndicationOfInterestViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoIndicationOfInterestViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoIndicationOfInterestBottomSheetFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(final DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment, DirectIpoIndicationOfInterestViewState.AcceptButtonAction acceptButtonAction) {
        Function0 function0;
        Intrinsics.checkNotNull(acceptButtonAction);
        int i = WhenMappings.$EnumSwitchMapping$0[acceptButtonAction.ordinal()];
        if (i == 1) {
            function0 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoIndicationOfInterestBottomSheetFragment.onStart$lambda$4$lambda$2(this.f$0);
                }
            };
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function0 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoIndicationOfInterestBottomSheetFragment.onStart$lambda$4$lambda$3(this.f$0);
                }
            };
        }
        RdsButton buttonAccept = directIpoIndicationOfInterestBottomSheetFragment.getBinding().buttonAccept;
        Intrinsics.checkNotNullExpressionValue(buttonAccept, "buttonAccept");
        OnClickListeners.onClick(buttonAccept, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4$lambda$2(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment) {
        directIpoIndicationOfInterestBottomSheetFragment.getBinding().scrollView.review(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4$lambda$3(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(directIpoIndicationOfInterestBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_INDICATION_OF_INTEREST, "accept", ((Args) INSTANCE.getArgs((Fragment) directIpoIndicationOfInterestBottomSheetFragment)).getInstrumentId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        directIpoIndicationOfInterestBottomSheetFragment.getDuxo().expressIndicationOfInterest();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment, Tuples2 tuples2) {
        directIpoIndicationOfInterestBottomSheetFragment.getBinding().scrollView.forceCheckScrollState();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.ui.view.DisclosureView.Callbacks
    public void onReviewed(boolean reviewed) {
        getDuxo().setReviewed(reviewed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(DirectIpoIndicationOfInterestViewState state) {
        DirectIpoIndicationOfInterestViewState.ExpressInterestResult expressInterestResultConsume;
        FragmentDirectIpoIndicationOfInterestBottomSheetBinding binding = getBinding();
        binding.title.setText(state.getTitle());
        String subtitleMarkdown = state.getSubtitleMarkdown();
        if (subtitleMarkdown != null) {
            getMarkwon().mo17580setMarkdown(binding.subtitle, subtitleMarkdown);
        }
        String footerMarkdown = state.getFooterMarkdown();
        if (footerMarkdown != null) {
            getMarkwon().mo17580setMarkdown(binding.footer, footerMarkdown);
        }
        binding.buttonDismiss.setText(state.getDismissButtonTitle());
        this.listAdapter.submitList(state.getRows());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence acceptButtonTitle = state.getAcceptButtonTitle(resources);
        if (acceptButtonTitle != null) {
            binding.buttonAccept.setText(acceptButtonTitle);
            getBinding().buttonAccept.setLoading(false);
        }
        UiEvent<DirectIpoIndicationOfInterestViewState.ExpressInterestResult> expressInterestEvent = state.getExpressInterestEvent();
        if (expressInterestEvent == null || (expressInterestResultConsume = expressInterestEvent.consume()) == null) {
            return;
        }
        if (Intrinsics.areEqual(expressInterestResultConsume, DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Loading.INSTANCE)) {
            getBinding().buttonAccept.setLoading(true);
            return;
        }
        if (expressInterestResultConsume instanceof DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Success) {
            getCallbacks().onExpressInterestSuccess(((DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Success) expressInterestResultConsume).getAlert());
            dismiss();
        } else {
            if (!(expressInterestResultConsume instanceof DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onExpressInterestError(((DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Failure) expressInterestResultConsume).getThrowable());
        }
    }

    /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Args copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.instrumentId, ((Args) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public Args(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: DirectIpoIndicationOfInterestBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Args;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoIndicationOfInterestBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoIndicationOfInterestBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoIndicationOfInterestBottomSheetFragment newInstance(Args args) {
            return (DirectIpoIndicationOfInterestBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoIndicationOfInterestBottomSheetFragment, args);
        }
    }
}
