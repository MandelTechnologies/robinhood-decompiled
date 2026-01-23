package com.robinhood.android.common.options.upgrade;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.FragmentOptionUpgradeProfessionalQuestionBinding;
import com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u0004-./0B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010&\u001a\u00020'H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/common/options/databinding/FragmentOptionUpgradeProfessionalQuestionBinding;", "getBindings", "()Lcom/robinhood/android/common/options/databinding/FragmentOptionUpgradeProfessionalQuestionBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Callbacks;", "callbacks$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Question", "Callbacks", "Args", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionUpgradeProfessionalQuestionFragment extends BaseFragment implements AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionUpgradeProfessionalQuestionFragment.class, "bindings", "getBindings()Lcom/robinhood/android/common/options/databinding/FragmentOptionUpgradeProfessionalQuestionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionUpgradeProfessionalQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Callbacks;", "", "onProfessionalAnswered", "", "isProfessionalTrader", "", "question", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onProfessionalAnswered(boolean isProfessionalTrader, Question question);
    }

    /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Question.values().length];
            try {
                iArr[Question.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Question.TWO.ordinal()] = 2;
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    public OptionUpgradeProfessionalQuestionFragment() {
        super(C11303R.layout.fragment_option_upgrade_professional_question);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, OptionUpgradeProfessionalQuestionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionUpgradeProfessionalQuestionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentOptionUpgradeProfessionalQuestionBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionUpgradeProfessionalQuestionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;", "", "questionStringRes", "", "disclaimerStringRes", "positiveStringRes", "negativeStringRes", "<init>", "(Ljava/lang/String;IIIII)V", "getQuestionStringRes", "()I", "getDisclaimerStringRes", "getPositiveStringRes", "getNegativeStringRes", "ONE", "TWO", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Question {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Question[] $VALUES;
        public static final Question ONE = new Question("ONE", 0, C11303R.string.option_upgrade_professional_question_investment_advice, C11303R.string.option_upgrade_professional_disclaimer, C11048R.string.general_label_yes, C11048R.string.general_label_no);
        public static final Question TWO = new Question("TWO", 1, C11303R.string.option_upgrade_professional_question_financial_regulator, C11303R.string.option_upgrade_professional_disclaimer, C11048R.string.general_label_yes, C11048R.string.general_label_no);
        private final int disclaimerStringRes;
        private final int negativeStringRes;
        private final int positiveStringRes;
        private final int questionStringRes;

        private static final /* synthetic */ Question[] $values() {
            return new Question[]{ONE, TWO};
        }

        public static EnumEntries<Question> getEntries() {
            return $ENTRIES;
        }

        private Question(String str, int i, int i2, int i3, int i4, int i5) {
            this.questionStringRes = i2;
            this.disclaimerStringRes = i3;
            this.positiveStringRes = i4;
            this.negativeStringRes = i5;
        }

        public final int getQuestionStringRes() {
            return this.questionStringRes;
        }

        public final int getDisclaimerStringRes() {
            return this.disclaimerStringRes;
        }

        public final int getPositiveStringRes() {
            return this.positiveStringRes;
        }

        public final int getNegativeStringRes() {
            return this.negativeStringRes;
        }

        static {
            Question[] questionArr$values = $values();
            $VALUES = questionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(questionArr$values);
        }

        public static Question valueOf(String str) {
            return (Question) Enum.valueOf(Question.class, str);
        }

        public static Question[] values() {
            return (Question[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        final Question question = ((Args) INSTANCE.getArgs((Fragment) this)).getQuestion();
        getBindings().optionUpgradeProfessionalQuestionQuestionTxt.setText(question.getQuestionStringRes());
        getBindings().optionUpgradeProfessionalQuestionDisclaimerTxt.setText(question.getDisclaimerStringRes());
        getBindings().optionUpgradeProfessionalQuestionNoBtn.setText(question.getNegativeStringRes());
        getBindings().optionUpgradeProfessionalQuestionYesBtn.setText(question.getPositiveStringRes());
        RdsButton optionUpgradeProfessionalQuestionNoBtn = getBindings().optionUpgradeProfessionalQuestionNoBtn;
        Intrinsics.checkNotNullExpressionValue(optionUpgradeProfessionalQuestionNoBtn, "optionUpgradeProfessionalQuestionNoBtn");
        OnClickListeners.onClick(optionUpgradeProfessionalQuestionNoBtn, new Function0() { // from class: com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionUpgradeProfessionalQuestionFragment.onViewCreated$lambda$0(this.f$0, question);
            }
        });
        RdsButton optionUpgradeProfessionalQuestionYesBtn = getBindings().optionUpgradeProfessionalQuestionYesBtn;
        Intrinsics.checkNotNullExpressionValue(optionUpgradeProfessionalQuestionYesBtn, "optionUpgradeProfessionalQuestionYesBtn");
        OnClickListeners.onClick(optionUpgradeProfessionalQuestionYesBtn, new Function0() { // from class: com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionUpgradeProfessionalQuestionFragment.onViewCreated$lambda$1(this.f$0, question);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionUpgradeProfessionalQuestionFragment optionUpgradeProfessionalQuestionFragment, Question question) {
        if (((Args) INSTANCE.getArgs((Fragment) optionUpgradeProfessionalQuestionFragment)).getDisplayLoading()) {
            optionUpgradeProfessionalQuestionFragment.getBindings().optionUpgradeProfessionalQuestionNoBtn.setLoading(true);
        }
        optionUpgradeProfessionalQuestionFragment.getCallbacks().onProfessionalAnswered(false, question);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionUpgradeProfessionalQuestionFragment optionUpgradeProfessionalQuestionFragment, Question question) {
        optionUpgradeProfessionalQuestionFragment.getCallbacks().onProfessionalAnswered(true, question);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSource();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        String screenName = getScreenName();
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getQuestion().ordinal()];
        if (i == 1) {
            name = Screen.Name.OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            name = Screen.Name.OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR;
        }
        return new Screen(name, null, screenName, null, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        String string2;
        Screen eventScreen = getEventScreen();
        Companion companion = INSTANCE;
        OptionsEligibilityContext optionsEligibilityContext = new OptionsEligibilityContext(((Args) companion.getArgs((Fragment) this)).getSource(), null, 2, 0 == true ? 1 : 0);
        UUID refId = ((Args) companion.getArgs((Fragment) this)).getRefId();
        if (refId == null || (string2 = refId.toString()) == null) {
            string2 = "";
        }
        String str = null;
        String str2 = null;
        return new UserInteractionEventData(null, eventScreen, null, null, new Context(0, 0, 0, null, null, str, str2, null, 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsEligibilityContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionOnboardingContext(str, str2, string2, null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1025, -1, -65, 16383, null), null, null, 109, null);
    }

    /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;", "source", "", "displayLoading", "", "refId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;Ljava/lang/String;ZLjava/util/UUID;)V", "getQuestion", "()Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;", "getSource", "()Ljava/lang/String;", "getDisplayLoading", "()Z", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean displayLoading;
        private final Question question;
        private final UUID refId;
        private final String source;

        /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Question.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Question question, String str, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                question = args.question;
            }
            if ((i & 2) != 0) {
                str = args.source;
            }
            if ((i & 4) != 0) {
                z = args.displayLoading;
            }
            if ((i & 8) != 0) {
                uuid = args.refId;
            }
            return args.copy(question, str, z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDisplayLoading() {
            return this.displayLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        public final Args copy(Question question, String source, boolean displayLoading, UUID refId) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(question, source, displayLoading, refId);
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
            return this.question == args.question && Intrinsics.areEqual(this.source, args.source) && this.displayLoading == args.displayLoading && Intrinsics.areEqual(this.refId, args.refId);
        }

        public int hashCode() {
            int iHashCode = ((((this.question.hashCode() * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.displayLoading)) * 31;
            UUID uuid = this.refId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Args(question=" + this.question + ", source=" + this.source + ", displayLoading=" + this.displayLoading + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.question.name());
            dest.writeString(this.source);
            dest.writeInt(this.displayLoading ? 1 : 0);
            dest.writeSerializable(this.refId);
        }

        public Args(Question question, String source, boolean z, UUID uuid) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(source, "source");
            this.question = question;
            this.source = source;
            this.displayLoading = z;
            this.refId = uuid;
        }

        public /* synthetic */ Args(Question question, String str, boolean z, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(question, str, (i & 4) != 0 ? false : z, uuid);
        }

        public final Question getQuestion() {
            return this.question;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getDisplayLoading() {
            return this.displayLoading;
        }

        public final UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: OptionUpgradeProfessionalQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment;", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Args;", "<init>", "()V", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionUpgradeProfessionalQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionUpgradeProfessionalQuestionFragment optionUpgradeProfessionalQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionUpgradeProfessionalQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionUpgradeProfessionalQuestionFragment newInstance(Args args) {
            return (OptionUpgradeProfessionalQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionUpgradeProfessionalQuestionFragment optionUpgradeProfessionalQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionUpgradeProfessionalQuestionFragment, args);
        }
    }
}
