package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.microdeposits.p182ui.AchRoutingNumberFragment;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* compiled from: AchRoutingNumberFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020\u001fH\u0002J\u0018\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "subtitleTxt", "Landroid/widget/TextView;", "getSubtitleTxt", "()Landroid/widget/TextView;", "subtitleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "routingNumberEdt", "Landroid/widget/EditText;", "getRoutingNumberEdt", "()Landroid/widget/EditText;", "routingNumberEdt$delegate", "numpad", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "getNumpad", "()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "numpad$delegate", "fabBtn", "Landroid/view/View;", "getFabBtn", "()Landroid/view/View;", "fabBtn$delegate", "callbacks", "Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "onNextClicked", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "showLearnMoreDialog", "Callbacks", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AchRoutingNumberFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: fabBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 fabBtn;

    /* renamed from: numpad$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpad;

    /* renamed from: routingNumberEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 routingNumberEdt;

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchRoutingNumberFragment.class, "subtitleTxt", "getSubtitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AchRoutingNumberFragment.class, "routingNumberEdt", "getRoutingNumberEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(AchRoutingNumberFragment.class, "numpad", "getNumpad()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", 0)), Reflection.property1(new PropertyReference1Impl(AchRoutingNumberFragment.class, "fabBtn", "getFabBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(AchRoutingNumberFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchRoutingNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Callbacks;", "", "onRoutingNumberEntered", "", "routingNumber", "", "sharedElements", "", "Landroid/view/View;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRoutingNumberEntered(String routingNumber, Map<View, String> sharedElements);
    }

    public AchRoutingNumberFragment() {
        super(C21805R.layout.fragment_ach_routing_number);
        this.subtitleTxt = bindView(C21805R.id.subtitle_txt);
        this.routingNumberEdt = bindView(C21805R.id.routing_number_edt);
        this.numpad = bindView(C21805R.id.numpad);
        this.fabBtn = bindView(C21805R.id.fab_btn);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchRoutingNumberFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final TextView getSubtitleTxt() {
        return (TextView) this.subtitleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final EditText getRoutingNumberEdt() {
        return (EditText) this.routingNumberEdt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsNumpadView getNumpad() {
        return (RdsNumpadView) this.numpad.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getFabBtn() {
        return (View) this.fabBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[4]);
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        View viewFindViewById = view.findViewById(C21805R.id.routing_number_text_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) viewFindViewById;
        OnClickListeners.onClick(getFabBtn(), new C218141(this));
        TextView subtitleTxt = getSubtitleTxt();
        String string2 = ViewsKt.getString(subtitleTxt, C21805R.string.ach_create_routing_number_subtitle);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore(subtitleTxt, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(subtitleTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$receiver$inlined.showLearnMoreDialog();
            }
        }, 1, (DefaultConstructorMarker) null));
        getNumpad().useDefaultKeyHandler();
        InitialValueObservable<CharSequence> initialValueObservableTextChanges = RxTextView.textChanges(getRoutingNumberEdt());
        Validation validation = Validation.INSTANCE;
        Observable<Boolean> observableDoOnNext = initialValueObservableTextChanges.map(new Function() { // from class: com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment$onViewCreated$validObs$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(Validation.isAchRoutingNumberValid(p0));
            }
        }).distinctUntilChanged().doOnNext(new Consumer() { // from class: com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment$onViewCreated$validObs$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                View fabBtn = this.this$0.getFabBtn();
                Intrinsics.checkNotNull(bool);
                Views.toggleFab(fabBtn, bool.booleanValue());
            }
        });
        Validation validation2 = Validation.INSTANCE;
        Intrinsics.checkNotNull(observableDoOnNext);
        String string3 = getString(C21805R.string.ach_create_routing_number_invalid);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        validation2.subscribeValidator(observableDoOnNext, rdsTextInputContainerView, string3);
    }

    /* compiled from: AchRoutingNumberFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microdeposits.ui.AchRoutingNumberFragment$onViewCreated$1 */
    /* synthetic */ class C218141 extends FunctionReferenceImpl implements Function0<Unit> {
        C218141(Object obj) {
            super(0, obj, AchRoutingNumberFragment.class, "onNextClicked", "onNextClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AchRoutingNumberFragment) this.receiver).onNextClicked();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C21805R.string.ach_create_routing_number_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity");
        return ((CreateAchRelationshipActivity) fragmentActivityRequireActivity).getIavSource$feature_microdeposits_externalDebug().getAnalyticsTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextClicked() {
        String string2 = getString(C21805R.string.ach_transition_manual_ach_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C21805R.string.ach_transition_manual_ach_numpad);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(C21805R.string.ach_transition_manual_ach_btn);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        getNumpad().setTransitionName(string3);
        getFabBtn().setTransitionName(string4);
        getCallbacks().onRoutingNumberEntered(getRoutingNumberEdt().getText().toString(), MapsKt.mapOf(Tuples4.m3642to(getSubtitleTxt(), string2), Tuples4.m3642to(getNumpad(), string3), Tuples4.m3642to(getFabBtn(), string4)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C11048R.menu.menu_info, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C11048R.id.action_info) {
            showLearnMoreDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLearnMoreDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C21805R.string.ach_create_routing_number_info_dialog_title, new Object[0]).setMessage(C21805R.string.ach_create_routing_number_info_dialog_content, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, parentFragmentManager, "routing_number_info", false, 4, null);
    }

    /* compiled from: AchRoutingNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/microdeposits/ui/AchRoutingNumberFragment;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AchRoutingNumberFragment newInstance() {
            return new AchRoutingNumberFragment();
        }
    }
}
