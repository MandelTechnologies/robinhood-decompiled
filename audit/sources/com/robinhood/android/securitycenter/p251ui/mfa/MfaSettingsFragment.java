package com.robinhood.android.securitycenter.p251ui.mfa;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentMfaSettingsBinding;
import com.robinhood.android.securitycenter.p251ui.mfa.MfaSettingsViewState;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: MfaSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001c\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u001a\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u00109\u001a\u00020#H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSettingsBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Callbacks;", "callbacks$delegate", "errorHandler", "com/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$errorHandler$2$1;", "errorHandler$delegate", "currentMethodAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "changeMethodAdapter", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState;", "onChangeMfaMethod", "mfaMethod", "logChangeMfaMethod", "Callbacks", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaSettingsFragment extends BaseFragment {
    private static final String TAG_ERROR_DIALOG = "error";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final GenericListAdapter<RdsRowView, MfaSettingsViewState.MfaMethod> changeMethodAdapter;
    private final GenericListAdapter<RdsRowView, MfaSettingsViewState.MfaMethod> currentMethodAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSettingsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MfaSettingsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Callbacks;", "", "onMfaMethodSmsSelected", "", "onMfaMethodAuthAppSelected", "onMfaMethodPromptsSelected", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMfaMethodAuthAppSelected();

        void onMfaMethodPromptsSelected();

        void onMfaMethodSmsSelected();
    }

    public MfaSettingsFragment() {
        super(C28186R.layout.fragment_mfa_settings);
        this.duxo = OldDuxos.oldDuxo(this, MfaSettingsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MfaSettingsFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSettingsFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.currentMethodAdapter = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaSettingsFragment.currentMethodAdapter$lambda$3(this.f$0, (RdsRowView) obj, (MfaSettingsViewState.MfaMethod) obj2);
            }
        });
        this.changeMethodAdapter = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaSettingsFragment.changeMethodAdapter$lambda$5(this.f$0, (RdsRowView) obj, (MfaSettingsViewState.MfaMethod) obj2);
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final MfaSettingsDuxo getDuxo() {
        return (MfaSettingsDuxo) this.duxo.getValue();
    }

    private final FragmentMfaSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMfaSettingsBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final MfaSettingsFragment3 getErrorHandler() {
        return (MfaSettingsFragment3) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$errorHandler$2$1] */
    public static final MfaSettingsFragment3 errorHandler_delegate$lambda$0(final MfaSettingsFragment mfaSettingsFragment) {
        final FragmentActivity fragmentActivityRequireActivity = mfaSettingsFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, true, 0, null, 12, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity2).setId(C11048R.id.dialog_id_generic_error).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentMethodAdapter$lambda$3(final MfaSettingsFragment mfaSettingsFragment, RdsRowView of, final MfaSettingsViewState.MfaMethod mfaMethod) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(mfaMethod, "mfaMethod");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, mfaMethod.getIconRes()));
        of.setPrimaryText(mfaSettingsFragment.getString(mfaMethod.getLabelRes()));
        MfaSettingsViewState.MfaMethod.Sms sms = mfaMethod instanceof MfaSettingsViewState.MfaMethod.Sms ? (MfaSettingsViewState.MfaMethod.Sms) mfaMethod : null;
        if (sms != null) {
            StringResource subtitleRes = sms.getSubtitleRes();
            Resources resources = of.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            of.setSecondaryText(subtitleRes.getText(resources));
        }
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSettingsFragment.currentMethodAdapter$lambda$3$lambda$2(mfaMethod, mfaSettingsFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentMethodAdapter$lambda$3$lambda$2(MfaSettingsViewState.MfaMethod mfaMethod, MfaSettingsFragment mfaSettingsFragment) {
        if (!Intrinsics.areEqual(mfaMethod, MfaSettingsViewState.MfaMethod.Prompts.INSTANCE)) {
            mfaSettingsFragment.onChangeMfaMethod(mfaMethod);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeMethodAdapter$lambda$5(final MfaSettingsFragment mfaSettingsFragment, RdsRowView of, final MfaSettingsViewState.MfaMethod mfaMethod) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(mfaMethod, "mfaMethod");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, mfaMethod.getIconRes()));
        of.setPrimaryText(mfaSettingsFragment.getString(mfaMethod.getLabelRes()));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSettingsFragment.changeMethodAdapter$lambda$5$lambda$4(this.f$0, mfaMethod);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeMethodAdapter$lambda$5$lambda$4(MfaSettingsFragment mfaSettingsFragment, MfaSettingsViewState.MfaMethod mfaMethod) {
        mfaSettingsFragment.onChangeMfaMethod(mfaMethod);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282601(this));
    }

    /* compiled from: MfaSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$onStart$1 */
    /* synthetic */ class C282601 extends FunctionReferenceImpl implements Function1<MfaSettingsViewState, Unit> {
        C282601(Object obj) {
            super(1, obj, MfaSettingsFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MfaSettingsViewState mfaSettingsViewState) {
            invoke2(mfaSettingsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MfaSettingsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MfaSettingsFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().mfaSettingsCurrentMethodRecyclerView.setAdapter(this.currentMethodAdapter);
        getBinding().mfaSettingsChangeMethodRecyclerView.setAdapter(this.changeMethodAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MfaSettingsViewState state) {
        Throwable thConsume;
        ShimmerLoadingView mfaSettingsLoadingView = getBinding().mfaSettingsLoadingView;
        Intrinsics.checkNotNullExpressionValue(mfaSettingsLoadingView, "mfaSettingsLoadingView");
        mfaSettingsLoadingView.setVisibility(state.getIsLoading() ? 0 : 8);
        getBinding().mfaSettingsSubtitle.setText(state.getSubtitleText());
        RhTextView mfaSettingsCurrentMethodTitle = getBinding().mfaSettingsCurrentMethodTitle;
        Intrinsics.checkNotNullExpressionValue(mfaSettingsCurrentMethodTitle, "mfaSettingsCurrentMethodTitle");
        mfaSettingsCurrentMethodTitle.setVisibility(state.isCurrentMethodVisible() ? 0 : 8);
        RecyclerView mfaSettingsCurrentMethodRecyclerView = getBinding().mfaSettingsCurrentMethodRecyclerView;
        Intrinsics.checkNotNullExpressionValue(mfaSettingsCurrentMethodRecyclerView, "mfaSettingsCurrentMethodRecyclerView");
        mfaSettingsCurrentMethodRecyclerView.setVisibility(state.isCurrentMethodVisible() ? 0 : 8);
        getBinding().mfaSettingsChangeMethodTitle.setText(state.getChangeMethodTitleRes());
        RhTextView mfaSettingsChangeMethodTitle = getBinding().mfaSettingsChangeMethodTitle;
        Intrinsics.checkNotNullExpressionValue(mfaSettingsChangeMethodTitle, "mfaSettingsChangeMethodTitle");
        mfaSettingsChangeMethodTitle.setVisibility(state.isChangeMethodVisible() ? 0 : 8);
        RecyclerView mfaSettingsChangeMethodRecyclerView = getBinding().mfaSettingsChangeMethodRecyclerView;
        Intrinsics.checkNotNullExpressionValue(mfaSettingsChangeMethodRecyclerView, "mfaSettingsChangeMethodRecyclerView");
        mfaSettingsChangeMethodRecyclerView.setVisibility(state.isChangeMethodVisible() ? 0 : 8);
        this.currentMethodAdapter.submitList(state.getCurrentMethodsList$feature_security_center_externalDebug());
        this.changeMethodAdapter.submitList(state.getChangeMethodsList$feature_security_center_externalDebug());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent == null || (thConsume = errorEvent.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(getErrorHandler(), thConsume, false, 2, null);
    }

    private final void onChangeMfaMethod(MfaSettingsViewState.MfaMethod mfaMethod) {
        if (mfaMethod != null) {
            logChangeMfaMethod(mfaMethod);
        }
        if (mfaMethod instanceof MfaSettingsViewState.MfaMethod.Sms) {
            getCallbacks().onMfaMethodSmsSelected();
            return;
        }
        if (mfaMethod instanceof MfaSettingsViewState.MfaMethod.App) {
            getCallbacks().onMfaMethodAuthAppSelected();
        } else if (mfaMethod instanceof MfaSettingsViewState.MfaMethod.Prompts) {
            getCallbacks().onMfaMethodPromptsSelected();
        } else if (mfaMethod != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void logChangeMfaMethod(MfaSettingsViewState.MfaMethod mfaMethod) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.TWO_FACTOR_AUTHENTICATION, null, null, null, 14, null), new Component(Component.ComponentType.ROW, mfaMethod.getLoggingIdentifier(), null, 4, null), null, null, false, 57, null);
    }

    /* compiled from: MfaSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Companion;", "", "<init>", "()V", "TAG_ERROR_DIALOG", "", "newInstance", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MfaSettingsFragment newInstance() {
            return new MfaSettingsFragment();
        }
    }
}
