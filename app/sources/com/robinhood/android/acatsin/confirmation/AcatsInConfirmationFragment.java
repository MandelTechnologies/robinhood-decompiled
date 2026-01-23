package com.robinhood.android.acatsin.confirmation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInConfirmationBinding;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationTouchListener;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: AcatsInConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0017J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "callbacks$delegate", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "pauseAnimation", "resumeAnimation", "stepAnimation", "dProgress", "", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInConfirmationFragment extends BaseFragment implements AutoLoggableFragment, AcatsInConfirmationTouchListener.Callbacks {
    public static final String GOLD_IMAGE_URL = "https://cdn.robinhood.com/app_assets/acats/acats_promo_gold.png";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInConfirmationFragment() {
        super(C7686R.layout.fragment_acats_in_confirmation);
        this.binding = ViewBinding5.viewBinding(this, AcatsInConfirmationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInConfirmationContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInConfirmationContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationFragment;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Key;", "<init>", "()V", "GOLD_IMAGE_URL", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInConfirmationFragment, AcatsInConfirmationContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInConfirmationContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInConfirmationContract.Key getArgs(AcatsInConfirmationFragment acatsInConfirmationFragment) {
            return (AcatsInConfirmationContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInConfirmationFragment newInstance(AcatsInConfirmationContract.Key key) {
            return (AcatsInConfirmationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInConfirmationFragment acatsInConfirmationFragment, AcatsInConfirmationContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInConfirmationFragment, key);
        }
    }

    private final FragmentAcatsInConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInConfirmationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInConfirmationContract.Callbacks getCallbacks() {
        return (AcatsInConfirmationContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_CONFIRMATION;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInConfirmationContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((AcatsInConfirmationContract.Key) INSTANCE.getArgs((Fragment) this)).getShowGoldPromoScreen()) {
            ScarletManager.putOverlay$default(getScarletManager(), DayNightOverlay.NIGHT, null, 2, null);
        } else {
            ScarletManager.putOverlay$default(getScarletManager(), AcatsInConfirmationOverlay.INSTANCE, null, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentAcatsInConfirmationBinding binding = getBinding();
        LinearLayout root = binding.getRoot();
        LinearLayout root2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        root.setOnTouchListener(new AcatsInConfirmationTouchListener(this, root2, contextRequireContext));
        RhTextView rhTextView = binding.acatsInConfirmationTitle;
        Companion companion = INSTANCE;
        StringResource title = ((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(title.getText(resources));
        RhTextView rhTextView2 = binding.acatsInConfirmationDescription;
        StringResource description = ((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).getDescription();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(description.getText(resources2));
        RdsButton doneBtn = binding.doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new AcatsInConfirmationFragment3(getCallbacks()));
        RdsButton rdsButton = binding.viewDetailsBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmationFragment.onViewCreated$lambda$3$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmationFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f$0);
            }
        });
        rdsButton.setVisibility(!((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).isFromTransferDetails() ? 0 : 8);
        if (((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this)).getShowGoldPromoScreen()) {
            binding.featherSpinLottie.setVisibility(8);
            binding.goldPromoCompose.setVisibility(0);
            binding.goldPromoCompose.setContent(ComposableLambda3.composableLambdaInstance(-246609102, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3

                /* compiled from: AcatsInConfirmationFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1 */
                static final class C78431 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AcatsInConfirmationFragment this$0;

                    C78431(AcatsInConfirmationFragment acatsInConfirmationFragment) {
                        this.this$0 = acatsInConfirmationFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-550632214, i, -1, "com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (AcatsInConfirmationFragment.kt:107)");
                        }
                        AcatsInConfirmationFragment.Companion companion = AcatsInConfirmationFragment.INSTANCE;
                        StringResource title = ((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this.this$0)).getTitle();
                        int i2 = StringResource.$stable;
                        String textAsString = StringResources6.getTextAsString(title, composer, i2);
                        String textAsString2 = StringResources6.getTextAsString(((AcatsInConfirmationContract.Key) companion.getArgs((Fragment) this.this$0)).getDescription(), composer, i2);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AcatsInConfirmationFragment acatsInConfirmationFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0061: CONSTRUCTOR (r4v1 'objRememberedValue' java.lang.Object) = 
                                  (r1v2 'acatsInConfirmationFragment' com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment):void (m)] (LINE:112) call: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment):void type: CONSTRUCTOR in method: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes24.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r13 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r12.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r12.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (AcatsInConfirmationFragment.kt:107)"
                                r2 = -550632214(0xffffffffdf2e04ea, float:-1.2539405E19)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
                            L1f:
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$Companion r13 = com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment.INSTANCE
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r0 = r11.this$0
                                android.os.Parcelable r0 = r13.getArgs(r0)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract$Key r0 = (com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Key) r0
                                com.robinhood.utils.resource.StringResource r0 = r0.getTitle()
                                int r1 = com.robinhood.utils.resource.StringResource.$stable
                                java.lang.String r2 = com.robinhood.utils.resource.StringResources6.getTextAsString(r0, r12, r1)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r0 = r11.this$0
                                android.os.Parcelable r13 = r13.getArgs(r0)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract$Key r13 = (com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Key) r13
                                com.robinhood.utils.resource.StringResource r13 = r13.getDescription()
                                java.lang.String r3 = com.robinhood.utils.resource.StringResources6.getTextAsString(r13, r12, r1)
                                r13 = 5004770(0x4c5de2, float:7.013177E-39)
                                r12.startReplaceGroup(r13)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r0 = r11.this$0
                                boolean r0 = r12.changedInstance(r0)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r1 = r11.this$0
                                java.lang.Object r4 = r12.rememberedValue()
                                if (r0 != 0) goto L5f
                                androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r0 = r0.getEmpty()
                                if (r4 != r0) goto L67
                            L5f:
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda0 r4 = new com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda0
                                r4.<init>(r1)
                                r12.updateRememberedValue(r4)
                            L67:
                                r5 = r4
                                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                                r12.endReplaceGroup()
                                r12.startReplaceGroup(r13)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r13 = r11.this$0
                                boolean r13 = r12.changedInstance(r13)
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment r0 = r11.this$0
                                java.lang.Object r1 = r12.rememberedValue()
                                if (r13 != 0) goto L86
                                androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r13 = r13.getEmpty()
                                if (r1 != r13) goto L8e
                            L86:
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda1 r1 = new com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$3$1$$ExternalSyntheticLambda1
                                r1.<init>(r0)
                                r12.updateRememberedValue(r1)
                            L8e:
                                r6 = r1
                                kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                                r12.endReplaceGroup()
                                r9 = 384(0x180, float:5.38E-43)
                                r10 = 32
                                java.lang.String r4 = "https://cdn.robinhood.com/app_assets/acats/acats_promo_gold.png"
                                r7 = 0
                                r8 = r12
                                com.robinhood.android.acatsin.confirmation.AcatsInConfirmationScreen.AcatsInConfirmationGoldScreen(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                                boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r12 == 0) goto La8
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            La8:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment4.C78431.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AcatsInConfirmationFragment acatsInConfirmationFragment) {
                            acatsInConfirmationFragment.getCallbacks().onConfirmationDoneClicked();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(AcatsInConfirmationFragment acatsInConfirmationFragment) {
                            acatsInConfirmationFragment.getCallbacks().onViewDetailsClicked(((AcatsInConfirmationContract.Key) AcatsInConfirmationFragment.INSTANCE.getArgs((Fragment) acatsInConfirmationFragment)).getAcatsTransferId());
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609102, i, -1, "com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment.onViewCreated.<anonymous>.<anonymous> (AcatsInConfirmationFragment.kt:106)");
                        }
                        BentoTheme2.BentoTheme(Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-550632214, true, new C78431(this.this$0), composer, 54), composer, 100663350, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } else {
                binding.goldPromoCompose.setVisibility(8);
                binding.featherSpinLottie.setVisibility(0);
                LottieAnimationView featherSpinLottie = binding.featherSpinLottie;
                Intrinsics.checkNotNullExpressionValue(featherSpinLottie, "featherSpinLottie");
                LottieAnimationViewsKt.setRemoteUrl(featherSpinLottie, LottieUrl.ACATS_FEATHER);
            }
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.ACATS_IN_COMPLETED_FLOW_2_SECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$2$lambda$0() {
            return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_TRANSFER_DETAILS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(AcatsInConfirmationFragment acatsInConfirmationFragment) {
            acatsInConfirmationFragment.getCallbacks().onViewDetailsClicked(((AcatsInConfirmationContract.Key) INSTANCE.getArgs((Fragment) acatsInConfirmationFragment)).getAcatsTransferId());
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
        public boolean onBackPressed() {
            getCallbacks().onConfirmationDoneClicked();
            return true;
        }

        @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationTouchListener.Callbacks
        public void pauseAnimation() {
            getBinding().featherSpinLottie.pauseAnimation();
        }

        @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationTouchListener.Callbacks
        public void resumeAnimation() {
            getBinding().featherSpinLottie.resumeAnimation();
        }

        @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationTouchListener.Callbacks
        public void stepAnimation(float dProgress) {
            float progress = getBinding().featherSpinLottie.getProgress() + dProgress;
            if (progress > 1.0f) {
                progress -= 1.0f;
            } else if (progress < 0.0f) {
                progress += 1.0f;
            }
            getBinding().featherSpinLottie.setProgress(progress);
        }
    }
