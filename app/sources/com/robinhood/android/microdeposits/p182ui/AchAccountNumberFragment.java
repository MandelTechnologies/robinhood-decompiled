package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.microdeposits.p182ui.AchAccountNumberFragment;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AchAccountNumberFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003IJKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u0002002\u0006\u00107\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0014J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010H\u001a\u000200H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R\u001b\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b,\u0010-R\u0014\u0010D\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "accountNumberLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getAccountNumberLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "accountNumberLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "accountNumberEdt", "Landroid/widget/EditText;", "getAccountNumberEdt", "()Landroid/widget/EditText;", "accountNumberEdt$delegate", "verifyAccountNumberLayout", "getVerifyAccountNumberLayout", "verifyAccountNumberLayout$delegate", "verifyAccountNumberEdt", "getVerifyAccountNumberEdt", "verifyAccountNumberEdt$delegate", "subtitleTxt", "Landroid/widget/TextView;", "getSubtitleTxt", "()Landroid/widget/TextView;", "subtitleTxt$delegate", "numpad", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "getNumpad", "()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "numpad$delegate", "fabBtn", "Landroid/view/View;", "getFabBtn", "()Landroid/view/View;", "fabBtn$delegate", "duxo", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberDuxo;", "getDuxo", "()Lcom/robinhood/android/microdeposits/ui/AchAccountNumberDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "showLearnMoreDialog", "Callbacks", "Args", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AchAccountNumberFragment extends BaseFragment {

    /* renamed from: accountNumberEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountNumberEdt;

    /* renamed from: accountNumberLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountNumberLayout;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: fabBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 fabBtn;

    /* renamed from: numpad$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpad;

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleTxt;

    /* renamed from: verifyAccountNumberEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 verifyAccountNumberEdt;

    /* renamed from: verifyAccountNumberLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 verifyAccountNumberLayout;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "accountNumberLayout", "getAccountNumberLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "accountNumberEdt", "getAccountNumberEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "verifyAccountNumberLayout", "getVerifyAccountNumberLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "verifyAccountNumberEdt", "getVerifyAccountNumberEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "subtitleTxt", "getSubtitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "numpad", "getNumpad()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "fabBtn", "getFabBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(AchAccountNumberFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Callbacks;", "", "onAccountNumberEntered", "", "accountNumber", "", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountNumberEntered(String accountNumber);
    }

    public AchAccountNumberFragment() {
        super(C21805R.layout.fragment_ach_account_number);
        this.accountNumberLayout = bindView(C21805R.id.account_number_text_input);
        this.accountNumberEdt = bindView(C21805R.id.account_number_edt);
        this.verifyAccountNumberLayout = bindView(C21805R.id.verify_account_number_text_input);
        this.verifyAccountNumberEdt = bindView(C21805R.id.verify_account_number_edt);
        this.subtitleTxt = bindView(C21805R.id.subtitle_txt);
        this.numpad = bindView(C21805R.id.numpad);
        this.fabBtn = bindView(C21805R.id.fab_btn);
        this.duxo = OldDuxos.oldDuxo(this, AchAccountNumberDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchAccountNumberFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final TextInputLayout getAccountNumberLayout() {
        return (TextInputLayout) this.accountNumberLayout.getValue(this, $$delegatedProperties[0]);
    }

    private final EditText getAccountNumberEdt() {
        return (EditText) this.accountNumberEdt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextInputLayout getVerifyAccountNumberLayout() {
        return (TextInputLayout) this.verifyAccountNumberLayout.getValue(this, $$delegatedProperties[2]);
    }

    private final EditText getVerifyAccountNumberEdt() {
        return (EditText) this.verifyAccountNumberEdt.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getSubtitleTxt() {
        return (TextView) this.subtitleTxt.getValue(this, $$delegatedProperties[4]);
    }

    private final RdsNumpadView getNumpad() {
        return (RdsNumpadView) this.numpad.getValue(this, $$delegatedProperties[5]);
    }

    private final View getFabBtn() {
        return (View) this.fabBtn.getValue(this, $$delegatedProperties[6]);
    }

    private final AchAccountNumberDuxo getDuxo() {
        return (AchAccountNumberDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[7]);
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
        TextView subtitleTxt = getSubtitleTxt();
        String string2 = ViewsKt.getString(subtitleTxt, C21805R.string.ach_create_account_number_subtitle);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore(subtitleTxt, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(subtitleTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showLearnMoreDialog();
            }
        }, 1, (DefaultConstructorMarker) null));
        getNumpad().useDefaultKeyHandler();
        getNumpad().setTransitionName(getString(C21805R.string.ach_transition_manual_ach_numpad));
        getFabBtn().setTransitionName(getString(C21805R.string.ach_transition_manual_ach_btn));
        OnClickListeners.onClick(getFabBtn(), new Function0() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchAccountNumberFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        getDuxo().bindAccountNumberChanges(RxTextView.textChanges(getAccountNumberEdt()));
        getDuxo().bindVerifyAccountNumberChanges(RxTextView.textChanges(getVerifyAccountNumberEdt()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountNumberFragment.onViewCreated$lambda$5(this.f$0, (AchAccountNumberViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(AchAccountNumberFragment achAccountNumberFragment) {
        achAccountNumberFragment.getCallbacks().onAccountNumberEntered(achAccountNumberFragment.getAccountNumberEdt().getText().toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(AchAccountNumberFragment achAccountNumberFragment, AchAccountNumberViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextInputLayout accountNumberLayout = achAccountNumberFragment.getAccountNumberLayout();
        Integer accountNumberLayoutErrorTextRes = state.getAccountNumberLayoutErrorTextRes();
        accountNumberLayout.setError(accountNumberLayoutErrorTextRes != null ? achAccountNumberFragment.getResources().getString(accountNumberLayoutErrorTextRes.intValue()) : null);
        Resources resources = achAccountNumberFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String additionalNumberLayoutHint = state.getAdditionalNumberLayoutHint(resources);
        if (additionalNumberLayoutHint != null) {
            achAccountNumberFragment.getAccountNumberLayout().setHint(additionalNumberLayoutHint);
        }
        TextInputLayout verifyAccountNumberLayout = achAccountNumberFragment.getVerifyAccountNumberLayout();
        Integer verifyAccountNumberLayoutErrorTextRes = state.getVerifyAccountNumberLayoutErrorTextRes();
        verifyAccountNumberLayout.setError(verifyAccountNumberLayoutErrorTextRes != null ? achAccountNumberFragment.getResources().getString(verifyAccountNumberLayoutErrorTextRes.intValue()) : null);
        achAccountNumberFragment.getFabBtn().setVisibility(state.getIsFabVisible() ? 0 : 8);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C21805R.string.ach_create_account_number_title);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity");
        return ((CreateAchRelationshipActivity) fragmentActivityRequireActivity).getIavSource$feature_microdeposits_externalDebug().getAnalyticsTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLearnMoreDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C21805R.string.ach_create_account_number_info_dialog_title, new Object[0]).setMessage(C21805R.string.ach_create_account_number_info_dialog_content, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, parentFragmentManager, "account_number_info", false, 4, null);
    }

    /* compiled from: AchAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Args;", "Landroid/os/Parcelable;", "routingNumber", "", "<init>", "(Ljava/lang/String;)V", "getRoutingNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String routingNumber;

        /* compiled from: AchAccountNumberFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.routingNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final Args copy(String routingNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            return new Args(routingNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.routingNumber, ((Args) other).routingNumber);
        }

        public int hashCode() {
            return this.routingNumber.hashCode();
        }

        public String toString() {
            return "Args(routingNumber=" + this.routingNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.routingNumber);
        }

        public Args(String routingNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            this.routingNumber = routingNumber;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }
    }

    /* compiled from: AchAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Args;", "<init>", "()V", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchAccountNumberFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AchAccountNumberFragment achAccountNumberFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achAccountNumberFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchAccountNumberFragment newInstance(Args args) {
            return (AchAccountNumberFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchAccountNumberFragment achAccountNumberFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achAccountNumberFragment, args);
        }
    }
}
