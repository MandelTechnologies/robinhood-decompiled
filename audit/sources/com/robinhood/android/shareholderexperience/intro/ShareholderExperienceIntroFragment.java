package com.robinhood.android.shareholderexperience.intro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.ShareholderLogger;
import com.robinhood.android.shareholderexperience.databinding.FragmentShareholderExperienceIntroBinding;
import com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroViewState;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: ShareholderExperienceIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentShareholderExperienceIntroBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentShareholderExperienceIntroBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "shareholderLogger", "Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "getShareholderLogger", "()Lcom/robinhood/android/shareholderexperience/ShareholderLogger;", "setShareholderLogger", "(Lcom/robinhood/android/shareholderexperience/ShareholderLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "viewState", "Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState;", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ShareholderExperienceIntroFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ShareholderLogger shareholderLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ShareholderExperienceIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentShareholderExperienceIntroBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ShareholderExperienceIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareholderExperienceIntroViewState.Event.values().length];
            try {
                iArr[ShareholderExperienceIntroViewState.Event.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareholderExperienceIntroViewState.Event.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ShareholderExperienceIntroFragment() {
        super(C28477R.layout.fragment_shareholder_experience_intro);
        this.binding = ViewBinding5.viewBinding(this, ShareholderExperienceIntroFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, ShareholderExperienceIntroDuxo.class);
    }

    private final FragmentShareholderExperienceIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentShareholderExperienceIntroBinding) value;
    }

    private final ShareholderExperienceIntroDuxo getDuxo() {
        return (ShareholderExperienceIntroDuxo) this.duxo.getValue();
    }

    public final ShareholderLogger getShareholderLogger() {
        ShareholderLogger shareholderLogger = this.shareholderLogger;
        if (shareholderLogger != null) {
            return shareholderLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareholderLogger");
        return null;
    }

    public final void setShareholderLogger(ShareholderLogger shareholderLogger) {
        Intrinsics.checkNotNullParameter(shareholderLogger, "<set-?>");
        this.shareholderLogger = shareholderLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ShareholderLogger shareholderLogger = getShareholderLogger();
        Lifecycle lifecycle = getLifecycle();
        Screen.Name name = Screen.Name.SHAREHOLDER_QA_INTRO;
        Companion companion = INSTANCE;
        shareholderLogger.initialize(lifecycle, name, ((LegacyFragmentKey.ShareholderExperienceIntro) companion.getArgs((Fragment) this)).getQaEventMetadata(), ((LegacyFragmentKey.ShareholderExperienceIntro) companion.getArgs((Fragment) this)).getEntryPoint());
        QaEventMetadata.ToS tos = ((LegacyFragmentKey.ShareholderExperienceIntro) companion.getArgs((Fragment) this)).getQaEventMetadata().getTos();
        getBinding().shareholderxIntroTitle.setText(tos.getPrimaryText());
        RhTextView rhTextView = getBinding().shareholderxIntroSubtitle;
        RichText secondaryText = tos.getSecondaryText();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        rhTextView.setText(IconExtensions.toSpannableString$default(secondaryText, contextRequireContext, Integer.valueOf(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground2)), false, null, 12, null));
        RdsButton shareholderxIntroAcceptTermsButton = getBinding().shareholderxIntroAcceptTermsButton;
        Intrinsics.checkNotNullExpressionValue(shareholderxIntroAcceptTermsButton, "shareholderxIntroAcceptTermsButton");
        OnClickListeners.onClick(shareholderxIntroAcceptTermsButton, new C285071(getDuxo()));
    }

    /* compiled from: ShareholderExperienceIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroFragment$onViewCreated$1 */
    /* synthetic */ class C285071 extends FunctionReferenceImpl implements Function0<Unit> {
        C285071(Object obj) {
            super(0, obj, ShareholderExperienceIntroDuxo.class, "acceptTerms", "acceptTerms()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ShareholderExperienceIntroDuxo) this.receiver).acceptTerms();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C285061(this));
    }

    /* compiled from: ShareholderExperienceIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroFragment$onStart$1 */
    /* synthetic */ class C285061 extends FunctionReferenceImpl implements Function1<ShareholderExperienceIntroViewState, Unit> {
        C285061(Object obj) {
            super(1, obj, ShareholderExperienceIntroFragment.class, "bind", "bind(Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShareholderExperienceIntroViewState shareholderExperienceIntroViewState) {
            invoke2(shareholderExperienceIntroViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ShareholderExperienceIntroViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ShareholderExperienceIntroFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ShareholderExperienceIntroViewState viewState) {
        getBinding().shareholderxIntroAcceptTermsButton.setLoading(viewState.isLoading());
        UiEvent<ShareholderExperienceIntroViewState.Event> event = viewState.getEvent();
        ShareholderExperienceIntroViewState.Event eventConsume = event != null ? event.consume() : null;
        int i = eventConsume == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventConsume.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                ConstraintLayout root = getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                companion.make(root, C11048R.string.error_description_something_went_wrong, -1).setAnchorView(getBinding().shareholderxIntroAcceptTermsButton).show();
                return;
            }
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion2 = INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ShareholderEventQuestionList(((LegacyFragmentKey.ShareholderExperienceIntro) companion2.getArgs((Fragment) this)).getQaEventMetadata().getEventSlug(), ((LegacyFragmentKey.ShareholderExperienceIntro) companion2.getArgs((Fragment) this)).getQaEventMetadata().getInstrumentId(), null, ((LegacyFragmentKey.ShareholderExperienceIntro) companion2.getArgs((Fragment) this)).getQuestionId(), null, null, 52, null), false, false, false, false, null, false, null, null, 1020, null);
            ShareholderLogger.logTap$default(getShareholderLogger(), Component.ComponentType.BUTTON, UserInteractionEventData.Action.SUBMIT, null, null, 12, null);
            requireActivity().finish();
        }
    }

    /* compiled from: ShareholderExperienceIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderExperienceIntro;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ShareholderExperienceIntroFragment, LegacyFragmentKey.ShareholderExperienceIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderExperienceIntro shareholderExperienceIntro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderExperienceIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderExperienceIntro getArgs(ShareholderExperienceIntroFragment shareholderExperienceIntroFragment) {
            return (LegacyFragmentKey.ShareholderExperienceIntro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, shareholderExperienceIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ShareholderExperienceIntroFragment newInstance(LegacyFragmentKey.ShareholderExperienceIntro shareholderExperienceIntro) {
            return (ShareholderExperienceIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderExperienceIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ShareholderExperienceIntroFragment shareholderExperienceIntroFragment, LegacyFragmentKey.ShareholderExperienceIntro shareholderExperienceIntro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, shareholderExperienceIntroFragment, shareholderExperienceIntro);
        }
    }
}
