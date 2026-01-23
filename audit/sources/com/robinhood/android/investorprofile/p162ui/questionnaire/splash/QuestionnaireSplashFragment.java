package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashFragment;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: QuestionnaireSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010 \u001a\u00020\fH\u0016J\r\u0010!\u001a\u00020\"H\u0017¢\u0006\u0002\u0010#R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00060\u0014j\u0002`\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "onBackPressed", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireSplashFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionnaireSplashCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(QuestionnaireSplashFragment questionnaireSplashFragment, int i, Composer composer, int i2) {
        questionnaireSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final QuestionnaireSplashCallbacks getCallbacks() {
        return (QuestionnaireSplashCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.INVESTOR_PROFILE_INTRO, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getEventContext() {
        return QuestionnaireLoggingInfo.toEventContext$default(((Args) INSTANCE.getArgs((Fragment) this)).getLoggingInfo(), null, 1, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, getEventContext(), null, null, 109, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return "blocking: " + ((Args) INSTANCE.getArgs((Fragment) this)).isBlocking();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).isBlocking()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1393336218);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393336218, i2, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment.ComposeContent (QuestionnaireSplashFragment.kt:50)");
            }
            Companion companion = INSTANCE;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1141561199, true, new C198371(new QuestionnaireSplashViewState(((Args) companion.getArgs((Fragment) this)).isBlocking(), ((Args) companion.getArgs((Fragment) this)).getLoggingInfo().getQuestionnaireContext(), ((Args) companion.getArgs((Fragment) this)).getBrokerageAccountType(), null, 8, null), this), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireSplashFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: QuestionnaireSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$ComposeContent$1 */
    static final class C198371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ QuestionnaireSplashViewState $viewState;
        final /* synthetic */ QuestionnaireSplashFragment this$0;

        C198371(QuestionnaireSplashViewState questionnaireSplashViewState, QuestionnaireSplashFragment questionnaireSplashFragment) {
            this.$viewState = questionnaireSplashViewState;
            this.this$0 = questionnaireSplashFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(QuestionnaireSplashFragment questionnaireSplashFragment) {
            questionnaireSplashFragment.getCallbacks().onSplashScreenContinueClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(QuestionnaireSplashFragment questionnaireSplashFragment) {
            if (!((Args) QuestionnaireSplashFragment.INSTANCE.getArgs((Fragment) questionnaireSplashFragment)).isBlocking()) {
                Fragment fragmentRequireParentFragment = questionnaireSplashFragment.requireParentFragment();
                Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
                ((BaseFragment) fragmentRequireParentFragment).onBackPressed();
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1141561199, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment.ComposeContent.<anonymous> (QuestionnaireSplashFragment.kt:58)");
            }
            if (Intrinsics.areEqual(this.$viewState.getQuestionnaireContext(), QuestionnaireContexts.CRYPTO_SCAM)) {
                composer.startReplaceGroup(698749932);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final QuestionnaireSplashFragment questionnaireSplashFragment = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireSplashFragment.C198371.invoke$lambda$1$lambda$0(questionnaireSplashFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                final QuestionnaireSplashFragment questionnaireSplashFragment2 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireSplashFragment.C198371.invoke$lambda$3$lambda$2(questionnaireSplashFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoScamSplashScreen5.CryptoScamSplashScreen(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(699222403);
                Context eventContext = this.this$0.getEventContext();
                QuestionnaireSplashCallbacks callbacks = this.this$0.getCallbacks();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                final QuestionnaireSplashFragment questionnaireSplashFragment3 = this.this$0;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashFragment$ComposeContent$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireSplashFragment.C198371.invoke$lambda$5$lambda$4(questionnaireSplashFragment3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                QuestionnaireSplashScreen6.QuestionnaireSplashScreen(eventContext, callbacks, null, null, (Function0) objRememberedValue3, composer, 0, 12);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(QuestionnaireSplashFragment questionnaireSplashFragment) {
            Fragment fragmentRequireParentFragment = questionnaireSplashFragment.requireParentFragment();
            Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
            ((BaseFragment) fragmentRequireParentFragment).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: QuestionnaireSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment$Args;", "Landroid/os/Parcelable;", "isBlocking", "", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(ZLcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lcom/robinhood/models/api/BrokerageAccountType;)V", "()Z", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType brokerageAccountType;
        private final boolean isBlocking;
        private final QuestionnaireLoggingInfo loggingInfo;

        /* compiled from: QuestionnaireSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, QuestionnaireLoggingInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, QuestionnaireLoggingInfo questionnaireLoggingInfo, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isBlocking;
            }
            if ((i & 2) != 0) {
                questionnaireLoggingInfo = args.loggingInfo;
            }
            if ((i & 4) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            return args.copy(z, questionnaireLoggingInfo, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBlocking() {
            return this.isBlocking;
        }

        /* renamed from: component2, reason: from getter */
        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final Args copy(boolean isBlocking, QuestionnaireLoggingInfo loggingInfo, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            return new Args(isBlocking, loggingInfo, brokerageAccountType);
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
            return this.isBlocking == args.isBlocking && Intrinsics.areEqual(this.loggingInfo, args.loggingInfo) && this.brokerageAccountType == args.brokerageAccountType;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isBlocking) * 31) + this.loggingInfo.hashCode()) * 31;
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            return iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode());
        }

        public String toString() {
            return "Args(isBlocking=" + this.isBlocking + ", loggingInfo=" + this.loggingInfo + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isBlocking ? 1 : 0);
            this.loggingInfo.writeToParcel(dest, flags);
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
        }

        public Args(boolean z, QuestionnaireLoggingInfo loggingInfo, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            this.isBlocking = z;
            this.loggingInfo = loggingInfo;
            this.brokerageAccountType = brokerageAccountType;
        }

        public final boolean isBlocking() {
            return this.isBlocking;
        }

        public final QuestionnaireLoggingInfo getLoggingInfo() {
            return this.loggingInfo;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }
    }

    /* compiled from: QuestionnaireSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(QuestionnaireSplashFragment questionnaireSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireSplashFragment newInstance(Args args) {
            return (QuestionnaireSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireSplashFragment questionnaireSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireSplashFragment, args);
        }
    }
}
