package com.robinhood.shared.login.lib.p385ui;

import android.app.Activity;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.credentials.CredentialManager;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.converters.security.Challenges;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.ChallengeResponseResult;
import com.robinhood.shared.lib.challenge.ChallengeResponseResultContract;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.login.lib.C39090R;
import com.robinhood.shared.login.lib.p385ui.BaseLoginComposable;
import com.robinhood.shared.login.lib.p385ui.BaseLoginEvent;
import com.robinhood.shared.login.lib.p385ui.BaseLoginViewState2;
import com.robinhood.shared.login.lib.p385ui.LoginErrorHandler;
import com.robinhood.shared.security.contracts.ChallengeResponseIntentKey;
import com.robinhood.shared.security.contracts.ChallengeSource;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.compose.LocalActivity3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BaseLoginComposable.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0083\u0001\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010 \u001aO\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010(\u001a\u0010\u0010)\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\"\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\u0012\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"BaseLoginComposable", "", "isAchromatic", "", "defaultEmail", "", "onHelpButtonClicked", "Lkotlin/Function1;", "credentialManager", "Landroidx/credentials/CredentialManager;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "duxo", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/credentials/CredentialManager;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoginContent", "email", "password", "loginHeader", "Lcom/robinhood/shared/login/lib/ui/LoginHeader;", BaseLoginComposable.SubTextTestTag, "Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "onEmailChange", "onPasswordChange", "onKeyboardSubmit", "Lkotlin/Function0;", "onSubtextLinkClick", "emailFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "passwordFocusRequester", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/login/lib/ui/LoginHeader;Lcom/robinhood/shared/login/lib/ui/LoginSubtext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "performLogin", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "skipPrompt", "generateRequestId", "activity", "Landroid/app/Activity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;ZLandroid/app/Activity;Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;)V", "logLoginTapEvent", "RobinhoodLogoTestTag", "EmailTextInputTestTag", "PasswordTextInputTestTag", "LoginButtonTestTag", "HelpButtonTestTag", "SubTextTestTag", "TitleTestTag", "LogoSize", "Landroidx/compose/ui/unit/Dp;", "F", "feature-lib-login_externalRelease", "state", "Lcom/robinhood/shared/login/lib/ui/BaseLoginViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "passwordVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BaseLoginComposable {
    public static final String EmailTextInputTestTag = "email_txt";
    public static final String HelpButtonTestTag = "need_help_btn";
    public static final String LoginButtonTestTag = "login_btn";
    private static final float LogoSize = C2002Dp.m7995constructorimpl(64);
    public static final String PasswordTextInputTestTag = "password_txt";
    public static final String RobinhoodLogoTestTag = "RobinhoodLogo";
    public static final String SubTextTestTag = "subtext";
    public static final String TitleTestTag = "title";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator BaseLoginComposable$lambda$14$lambda$13(Navigator navigator) {
        return navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator BaseLoginComposable$lambda$18$lambda$17(Navigator navigator) {
        return navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$31(boolean z, String str, Function1 function1, CredentialManager credentialManager, SharedEventLogger sharedEventLogger, BaseLoginDuxo baseLoginDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BaseLoginComposable(z, str, function1, credentialManager, sharedEventLogger, baseLoginDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoginContent$lambda$42(String str, String str2, BaseLoginViewState2 baseLoginViewState2, LoginSubtext loginSubtext, Function1 function1, Function1 function12, Function0 function0, Function0 function02, FocusRequester focusRequester, FocusRequester focusRequester2, int i, Composer composer, int i2) {
        LoginContent(str, str2, baseLoginViewState2, loginSubtext, function1, function12, function0, function02, focusRequester, focusRequester2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseLoginViewState BaseLoginComposable$lambda$0(SnapshotState4<BaseLoginViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<BaseLoginEvent> BaseLoginComposable$lambda$1(SnapshotState4<Event<BaseLoginEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BaseLoginComposable$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BaseLoginComposable$lambda$8(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean LoginContent$lambda$33(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: BaseLoginComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$5 */
    static final class C391015 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ BaseLoginDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ SharedEventLogger $eventLogger;
        final /* synthetic */ Function1<Boolean, Unit> $onHelpButtonClicked;
        final /* synthetic */ SnapshotState<String> $password$delegate;
        final /* synthetic */ SnapshotState4<BaseLoginViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C391015(SharedEventLogger sharedEventLogger, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, Function1<? super Boolean, Unit> function1, SnapshotState4<BaseLoginViewState> snapshotState4) {
            this.$eventLogger = sharedEventLogger;
            this.$email$delegate = snapshotState;
            this.$password$delegate = snapshotState2;
            this.$activity = fragmentActivity;
            this.$duxo = baseLoginDuxo;
            this.$onHelpButtonClicked = function1;
            this.$state$delegate = snapshotState4;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1606310493, i, -1, "com.robinhood.shared.login.lib.ui.BaseLoginComposable.<anonymous> (BaseLoginComposable.kt:213)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final SharedEventLogger sharedEventLogger = this.$eventLogger;
            final SnapshotState<String> snapshotState = this.$email$delegate;
            final SnapshotState<String> snapshotState2 = this.$password$delegate;
            final FragmentActivity fragmentActivity = this.$activity;
            final BaseLoginDuxo baseLoginDuxo = this.$duxo;
            final Function1<Boolean, Unit> function1 = this.$onHelpButtonClicked;
            final SnapshotState4<BaseLoginViewState> snapshotState4 = this.$state$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, BaseLoginComposable.LoginButtonTestTag), 0.0f, 1, null);
            boolean z = BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState).length() > 0 && BaseLoginComposable.BaseLoginComposable$lambda$8(snapshotState2).length() > 0;
            String strStringResource = StringResources_androidKt.stringResource(C39090R.string.login_login_action, composer, 0);
            boolean zIsLoading = BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4).isLoading();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(sharedEventLogger) | composer.changed(snapshotState) | composer.changed(snapshotState2) | composer.changedInstance(fragmentActivity) | composer.changedInstance(baseLoginDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.C391015.invoke$lambda$4$lambda$1$lambda$0(sharedEventLogger, fragmentActivity, baseLoginDuxo, snapshotState, snapshotState2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, type2, z, zIsLoading, null, null, null, null, false, null, composer, 24960, 0, 8072);
            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, BaseLoginComposable.HelpButtonTestTag), 0.0f, 1, null);
            boolean zIsLoading2 = true ^ BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4).isLoading();
            String strStringResource2 = StringResources_androidKt.stringResource(BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4).getHelpButtonTextResId(), composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changed(snapshotState4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.C391015.invoke$lambda$4$lambda$3$lambda$2(function1, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierFillMaxWidth$default2, null, type3, zIsLoading2, false, null, null, null, null, false, null, composer, 24960, 0, 8136);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SharedEventLogger sharedEventLogger, FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
            BaseLoginComposable.logLoginTapEvent(sharedEventLogger);
            BaseLoginComposable.performLogin$default(BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState), BaseLoginComposable.BaseLoginComposable$lambda$8(snapshotState2), null, null, false, fragmentActivity, baseLoginDuxo, 28, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, SnapshotState4 snapshotState4) {
            function1.invoke(Boolean.valueOf(BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4).getShowSuvBottomSheet()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    /* JADX WARN: Type inference failed for: r12v18, types: [T, com.robinhood.models.api.Challenge] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BaseLoginComposable(final boolean z, final String str, final Function1<? super Boolean, Unit> onHelpButtonClicked, final CredentialManager credentialManager, final SharedEventLogger eventLogger, final BaseLoginDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        final FragmentActivity fragmentActivity;
        final Navigator navigator;
        Event<BaseLoginEvent> event;
        boolean z3;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        FocusRequester focusRequester;
        Object objRememberedValue4;
        FocusRequester focusRequester2;
        Object objRememberedValue5;
        boolean zChangedInstance;
        Object objRememberedValue6;
        boolean zChanged;
        Object objRememberedValue7;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        boolean zChanged2;
        Object objRememberedValue9;
        boolean zChangedInstance3;
        Object objRememberedValue10;
        boolean zChangedInstance4;
        Object objRememberedValue11;
        final Event<BaseLoginEvent> eventBaseLoginComposable$lambda$1;
        SnapshotState snapshotState3;
        final FragmentActivity fragmentActivity2;
        final Function2<UUID, Boolean, Unit> function2;
        Composer composer2;
        SnapshotState4 snapshotState4;
        final Event<BaseLoginEvent> eventBaseLoginComposable$lambda$12;
        final Event<BaseLoginEvent> eventBaseLoginComposable$lambda$13;
        Object objRememberedValue12;
        FragmentActivity fragmentActivity3;
        SnapshotState snapshotState5;
        Unit unit;
        boolean zChangedInstance5;
        Object objRememberedValue13;
        Unit unit2;
        final Modifier modifier3;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke2;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onHelpButtonClicked, "onHelpButtonClicked");
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-633393810);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onHelpButtonClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(credentialManager) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventLogger) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-633393810, i3, -1, "com.robinhood.shared.login.lib.ui.BaseLoginComposable (BaseLoginComposable.kt:99)");
                }
                fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<BaseLoginEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "BaseLoginComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof BaseLoginEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<BaseLoginEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof BaseLoginEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i5 = i3 & 112;
                z3 = i5 != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$3$lambda$2(str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$7$lambda$6();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                focusRequester = (FocusRequester) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                focusRequester2 = (FocusRequester) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(null);
                    objRememberedValue5 = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                objectRef.element = (Challenge) objRememberedValue5;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$14$lambda$13(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChallengeVerificationResultContract challengeVerificationResultContract = new ChallengeVerificationResultContract((Function0) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(fragmentActivity) | composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BaseLoginComposable.BaseLoginComposable$lambda$16$lambda$15(fragmentActivity, duxo, snapshotState, snapshotState2, (ChallengeVerificationResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeVerificationResultContract, (Function1) objRememberedValue7, composerStartRestartGroup, ChallengeVerificationResultContract.$stable);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$18$lambda$17(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChallengeResponseResultContract challengeResponseResultContract = new ChallengeResponseResultContract((Function0) objRememberedValue8);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(fragmentActivity) | composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BaseLoginComposable.BaseLoginComposable$lambda$20$lambda$19(fragmentActivity, duxo, snapshotState, snapshotState2, (ChallengeResponseResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeResponseResultContract, (Function1) objRememberedValue9, composerStartRestartGroup, ChallengeResponseResultContract.$stable);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$22$lambda$21(duxo, snapshotState, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue10, null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$24$lambda$23(duxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function2<UUID, Boolean, Unit> function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue11, null, composerStartRestartGroup, 0, 4);
                eventBaseLoginComposable$lambda$1 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventBaseLoginComposable$lambda$1 == null) {
                    if (!(eventBaseLoginComposable$lambda$1.getData() instanceof BaseLoginEvent.LoginError) || (eventConsumerInvoke3 = eventBaseLoginComposable$lambda$1.getGetEventConsumer().invoke()) == null) {
                        snapshotState3 = snapshotState;
                        fragmentActivity2 = fragmentActivity;
                        function2 = function2RememberSuvLauncher2;
                        composer2 = composerStartRestartGroup;
                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    } else {
                        composer2 = composerStartRestartGroup;
                        fragmentActivity2 = fragmentActivity;
                        function2 = function2RememberSuvLauncher2;
                        final boolean z4 = z2;
                        Function1<? super BaseLoginEvent, Unit> function1 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25487invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25487invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BaseLoginEvent.LoginError loginError = (BaseLoginEvent.LoginError) eventBaseLoginComposable$lambda$1.getData();
                                LoginErrorHandler.Companion companion2 = LoginErrorHandler.INSTANCE;
                                FragmentActivity fragmentActivity4 = fragmentActivity2;
                                Throwable error = loginError.getError();
                                boolean z5 = z4;
                                LoginErrorHandler2 genericResponseType = BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getGenericResponseType();
                                final Ref.ObjectRef objectRef2 = objectRef;
                                final ActivityResultRegistry8 activityResultRegistry8 = activityResultRegistry8RememberLauncherForActivityResult;
                                final ActivityResultRegistry8 activityResultRegistry82 = activityResultRegistry8RememberLauncherForActivityResult2;
                                final SnapshotState snapshotState6 = snapshotState;
                                final SharedEventLogger sharedEventLogger = eventLogger;
                                companion2.handleError(fragmentActivity4, error, z5, genericResponseType, new Function1<Challenge, Unit>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Challenge challenge) {
                                        invoke2(challenge);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Challenge challenge) {
                                        Intrinsics.checkNotNullParameter(challenge, "challenge");
                                        if (challenge.getType() == Challenge.Type.PROMPTS) {
                                            objectRef2.element = challenge;
                                            NavigationActivityResultContract3.launch$default(activityResultRegistry8, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(Challenge.Flow.LOGIN.getId(), false, challenge, BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState6), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null)), null, false, 6, null);
                                            return;
                                        }
                                        Challenge challenge2 = objectRef2.element;
                                        if (challenge2 != null) {
                                            SharedEventLogger sharedEventLogger2 = sharedEventLogger;
                                            String string2 = challenge2.getId().toString();
                                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                            ChallengeReplacementInfo.ChallengeType challengeType = ChallengeReplacementInfo.ChallengeType.PROMPT;
                                            String string3 = challenge.getId().toString();
                                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                            ChallengeReplacementInfo.ChallengeType protobuf = Challenges.toProtobuf(challenge.getType());
                                            if (protobuf == null) {
                                                protobuf = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                                            }
                                            ChallengeReplacementInfo.ChallengeType challengeType2 = protobuf;
                                            Boolean silent = challenge2.getSilent();
                                            SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger2, new ChallengeReplacementInfo(string2, challengeType, string3, challengeType2, silent != null ? silent.booleanValue() : false, null, null, 96, null), null, null, null, null, 30, null);
                                        }
                                        NavigationActivityResultContract3.launch$default(activityResultRegistry82, new ChallengeResponseIntentKey(ChallengeSource.LOGIN, challenge, BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState6)), null, false, 6, null);
                                    }
                                });
                            }
                        };
                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        snapshotState3 = snapshotState;
                        eventConsumerInvoke3.consume(eventBaseLoginComposable$lambda$1, function1);
                    }
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    snapshotState3 = snapshotState;
                    fragmentActivity2 = fragmentActivity;
                    function2 = function2RememberSuvLauncher2;
                    composer2 = composerStartRestartGroup;
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                }
                eventBaseLoginComposable$lambda$12 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventBaseLoginComposable$lambda$12 != null) {
                    if ((eventBaseLoginComposable$lambda$12.getData() instanceof BaseLoginEvent.LoginVerificationRequired) && (eventConsumerInvoke2 = eventBaseLoginComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventBaseLoginComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25488invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25488invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BaseLoginEvent.LoginVerificationRequired loginVerificationRequired = (BaseLoginEvent.LoginVerificationRequired) eventBaseLoginComposable$lambda$12.getData();
                                function2RememberSuvLauncher.invoke(loginVerificationRequired.getWorkflowId(), Boolean.valueOf(loginVerificationRequired.isMigrated()));
                            }
                        });
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                eventBaseLoginComposable$lambda$13 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventBaseLoginComposable$lambda$13 != null) {
                    if ((eventBaseLoginComposable$lambda$13.getData() instanceof BaseLoginEvent.AccountRecoveryVerificationRequired) && (eventConsumerInvoke = eventBaseLoginComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventBaseLoginComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25489invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25489invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BaseLoginEvent.AccountRecoveryVerificationRequired accountRecoveryVerificationRequired = (BaseLoginEvent.AccountRecoveryVerificationRequired) eventBaseLoginComposable$lambda$13.getData();
                                function2.invoke(accountRecoveryVerificationRequired.getWorkflowId(), Boolean.valueOf(accountRecoveryVerificationRequired.isMigrated()));
                            }
                        });
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                Modifier modifier5 = modifier4;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue12 = composer2.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BaseLoginComposable.BaseLoginComposable$lambda$29$lambda$28((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue12);
                }
                composer2.endReplaceGroup();
                fragmentActivity3 = fragmentActivity2;
                snapshotState5 = snapshotState3;
                Composer composer3 = composer2;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SemanticsModifier6.semantics$default(modifierM4872backgroundbw27NRU$default, false, (Function1) objRememberedValue12, 1, null), false, ComposableLambda3.rememberComposableLambda(-1606310493, true, new C391015(eventLogger, snapshotState3, snapshotState2, fragmentActivity3, duxo, onHelpButtonClicked, snapshotState4), composer2, 54), ComposableLambda3.rememberComposableLambda(-1810801578, true, new C391026(snapshotState5, snapshotState2, eventLogger, fragmentActivity3, duxo, navigator, snapshotState4, focusRequester, focusRequester2), composer2, 54), composer3, 3456, 2);
                composerStartRestartGroup = composer3;
                unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(credentialManager) | composerStartRestartGroup.changedInstance(fragmentActivity3) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changed(snapshotState5) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(duxo) | (i5 != 32);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5 || objRememberedValue13 == companion.getEmpty()) {
                    unit2 = unit;
                    BaseLoginComposable3 baseLoginComposable3 = new BaseLoginComposable3(credentialManager, fragmentActivity3, eventLogger, duxo, str, focusRequester, focusRequester2, snapshotState5, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(baseLoginComposable3);
                    objRememberedValue13 = baseLoginComposable3;
                } else {
                    unit2 = unit;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BaseLoginComposable.BaseLoginComposable$lambda$31(z, str, onHelpButtonClicked, credentialManager, eventLogger, duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "BaseLoginComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof BaseLoginEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<BaseLoginEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof BaseLoginEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i52 = i3 & 112;
            if (i52 != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.BaseLoginComposable$lambda$3$lambda$2(str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                Object[] objArr22 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                focusRequester = (FocusRequester) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                focusRequester2 = (FocusRequester) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                objectRef2.element = (Challenge) objRememberedValue5;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BaseLoginComposable.BaseLoginComposable$lambda$14$lambda$13(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    ChallengeVerificationResultContract challengeVerificationResultContract2 = new ChallengeVerificationResultContract((Function0) objRememberedValue6);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(fragmentActivity) | composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BaseLoginComposable.BaseLoginComposable$lambda$16$lambda$15(fragmentActivity, duxo, snapshotState, snapshotState2, (ChallengeVerificationResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        composerStartRestartGroup.endReplaceGroup();
                        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult3 = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeVerificationResultContract2, (Function1) objRememberedValue7, composerStartRestartGroup, ChallengeVerificationResultContract.$stable);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BaseLoginComposable.BaseLoginComposable$lambda$18$lambda$17(navigator);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            composerStartRestartGroup.endReplaceGroup();
                            ChallengeResponseResultContract challengeResponseResultContract2 = new ChallengeResponseResultContract((Function0) objRememberedValue8);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(fragmentActivity) | composerStartRestartGroup.changedInstance(duxo);
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BaseLoginComposable.BaseLoginComposable$lambda$20$lambda$19(fragmentActivity, duxo, snapshotState, snapshotState2, (ChallengeResponseResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                composerStartRestartGroup.endReplaceGroup();
                                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult22 = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeResponseResultContract2, (Function1) objRememberedValue9, composerStartRestartGroup, ChallengeResponseResultContract.$stable);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance3) {
                                    objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BaseLoginComposable.BaseLoginComposable$lambda$22$lambda$21(duxo, snapshotState, snapshotState2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                    composerStartRestartGroup.endReplaceGroup();
                                    final Function2 function2RememberSuvLauncher3 = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue10, null, composerStartRestartGroup, 0, 4);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance4) {
                                        objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return BaseLoginComposable.BaseLoginComposable$lambda$24$lambda$23(duxo);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Function2<UUID, Boolean, Unit> function2RememberSuvLauncher22 = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue11, null, composerStartRestartGroup, 0, 4);
                                        eventBaseLoginComposable$lambda$1 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                                        if (eventBaseLoginComposable$lambda$1 == null) {
                                        }
                                        eventBaseLoginComposable$lambda$12 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                                        if (eventBaseLoginComposable$lambda$12 != null) {
                                        }
                                        eventBaseLoginComposable$lambda$13 = BaseLoginComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                                        if (eventBaseLoginComposable$lambda$13 != null) {
                                        }
                                        Modifier modifier52 = modifier4;
                                        Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                        composer2.startReplaceGroup(1849434622);
                                        objRememberedValue12 = composer2.rememberedValue();
                                        if (objRememberedValue12 == companion.getEmpty()) {
                                        }
                                        composer2.endReplaceGroup();
                                        fragmentActivity3 = fragmentActivity2;
                                        snapshotState5 = snapshotState3;
                                        Composer composer32 = composer2;
                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SemanticsModifier6.semantics$default(modifierM4872backgroundbw27NRU$default2, false, (Function1) objRememberedValue12, 1, null), false, ComposableLambda3.rememberComposableLambda(-1606310493, true, new C391015(eventLogger, snapshotState3, snapshotState2, fragmentActivity3, duxo, onHelpButtonClicked, snapshotState4), composer2, 54), ComposableLambda3.rememberComposableLambda(-1810801578, true, new C391026(snapshotState5, snapshotState2, eventLogger, fragmentActivity3, duxo, navigator, snapshotState4, focusRequester, focusRequester2), composer2, 54), composer32, 3456, 2);
                                        composerStartRestartGroup = composer32;
                                        unit = Unit.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        zChangedInstance5 = composerStartRestartGroup.changedInstance(credentialManager) | composerStartRestartGroup.changedInstance(fragmentActivity3) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changed(snapshotState5) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(duxo) | (i52 != 32);
                                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance5) {
                                            unit2 = unit;
                                            BaseLoginComposable3 baseLoginComposable32 = new BaseLoginComposable3(credentialManager, fragmentActivity3, eventLogger, duxo, str, focusRequester, focusRequester2, snapshotState5, snapshotState2, null);
                                            composerStartRestartGroup.updateRememberedValue(baseLoginComposable32);
                                            objRememberedValue13 = baseLoginComposable32;
                                            composerStartRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BaseLoginComposable$lambda$3$lambda$2(String str) {
        if (str == null) {
            str = "";
        }
        return SnapshotState3.mutableStateOf$default(str, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BaseLoginComposable$lambda$7$lambda$6() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaseLoginComposable$lambda$5(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaseLoginComposable$lambda$9(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$16$lambda$15(FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, SnapshotState snapshotState, SnapshotState snapshotState2, ChallengeVerificationResult challengeVerificationResult) {
        if (challengeVerificationResult != null) {
            String strBaseLoginComposable$lambda$4 = BaseLoginComposable$lambda$4(snapshotState);
            String strBaseLoginComposable$lambda$8 = BaseLoginComposable$lambda$8(snapshotState2);
            ChallengeVerificationResult.Completed completed = challengeVerificationResult instanceof ChallengeVerificationResult.Completed ? (ChallengeVerificationResult.Completed) challengeVerificationResult : null;
            performLogin$default(strBaseLoginComposable$lambda$4, strBaseLoginComposable$lambda$8, completed != null ? completed.getChallengeId() : null, Boolean.valueOf(challengeVerificationResult instanceof ChallengeVerificationResult.Fallback), false, fragmentActivity, baseLoginDuxo, 16, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$20$lambda$19(FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, SnapshotState snapshotState, SnapshotState snapshotState2, ChallengeResponseResult challengeResponseResult) {
        if ((challengeResponseResult != null ? challengeResponseResult.getChallengeId() : null) != null) {
            performLogin$default(BaseLoginComposable$lambda$4(snapshotState), BaseLoginComposable$lambda$8(snapshotState2), challengeResponseResult.getChallengeId(), Boolean.TRUE, false, fragmentActivity, baseLoginDuxo, 16, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$22$lambda$21(BaseLoginDuxo baseLoginDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
        baseLoginDuxo.onDoLogin(BaseLoginComposable$lambda$4(snapshotState), BaseLoginComposable$lambda$8(snapshotState2), null, null, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$24$lambda$23(BaseLoginDuxo baseLoginDuxo) {
        baseLoginDuxo.onForgotEmail(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLoginComposable$lambda$29$lambda$28(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* compiled from: BaseLoginComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$6 */
    static final class C391026 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ BaseLoginDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ FocusRequester $emailFocusRequester;
        final /* synthetic */ SharedEventLogger $eventLogger;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState<String> $password$delegate;
        final /* synthetic */ FocusRequester $passwordFocusRequester;
        final /* synthetic */ SnapshotState4<BaseLoginViewState> $state$delegate;

        C391026(SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SharedEventLogger sharedEventLogger, FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, Navigator navigator, SnapshotState4<BaseLoginViewState> snapshotState4, FocusRequester focusRequester, FocusRequester focusRequester2) {
            this.$email$delegate = snapshotState;
            this.$password$delegate = snapshotState2;
            this.$eventLogger = sharedEventLogger;
            this.$activity = fragmentActivity;
            this.$duxo = baseLoginDuxo;
            this.$navigator = navigator;
            this.$state$delegate = snapshotState4;
            this.$emailFocusRequester = focusRequester;
            this.$passwordFocusRequester = focusRequester2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810801578, i, -1, "com.robinhood.shared.login.lib.ui.BaseLoginComposable.<anonymous> (BaseLoginComposable.kt:248)");
            }
            String strBaseLoginComposable$lambda$4 = BaseLoginComposable.BaseLoginComposable$lambda$4(this.$email$delegate);
            String strBaseLoginComposable$lambda$8 = BaseLoginComposable.BaseLoginComposable$lambda$8(this.$password$delegate);
            BaseLoginViewState2 header = BaseLoginComposable.BaseLoginComposable$lambda$0(this.$state$delegate).getHeader();
            LoginSubtext subtext = BaseLoginComposable.BaseLoginComposable$lambda$0(this.$state$delegate).getSubtext();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$email$delegate);
            final SnapshotState<String> snapshotState = this.$email$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseLoginComposable.C391026.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$password$delegate);
            final SnapshotState<String> snapshotState2 = this.$password$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$6$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseLoginComposable.C391026.invoke$lambda$3$lambda$2(snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChanged3 = composer.changed(this.$email$delegate) | composer.changed(this.$password$delegate) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$activity) | composer.changedInstance(this.$duxo);
            final SharedEventLogger sharedEventLogger = this.$eventLogger;
            final FragmentActivity fragmentActivity = this.$activity;
            final BaseLoginDuxo baseLoginDuxo = this.$duxo;
            final SnapshotState<String> snapshotState3 = this.$email$delegate;
            final SnapshotState<String> snapshotState4 = this.$password$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$6$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.C391026.invoke$lambda$5$lambda$4(sharedEventLogger, fragmentActivity, baseLoginDuxo, snapshotState3, snapshotState4);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue3 = function0;
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$activity) | composer.changed(this.$state$delegate);
            final Navigator navigator = this.$navigator;
            final FragmentActivity fragmentActivity2 = this.$activity;
            final SnapshotState4<BaseLoginViewState> snapshotState42 = this.$state$delegate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$6$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.C391026.invoke$lambda$7$lambda$6(navigator, fragmentActivity2, snapshotState42);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BaseLoginComposable.LoginContent(strBaseLoginComposable$lambda$4, strBaseLoginComposable$lambda$8, header, subtext, function1, function12, function02, (Function0) objRememberedValue4, this.$emailFocusRequester, this.$passwordFocusRequester, composer, 905969664);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BaseLoginComposable.BaseLoginComposable$lambda$5(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BaseLoginComposable.BaseLoginComposable$lambda$9(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SharedEventLogger sharedEventLogger, FragmentActivity fragmentActivity, BaseLoginDuxo baseLoginDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
            if (BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState).length() > 0 && BaseLoginComposable.BaseLoginComposable$lambda$8(snapshotState2).length() > 0) {
                BaseLoginComposable.logLoginTapEvent(sharedEventLogger);
                BaseLoginComposable.performLogin$default(BaseLoginComposable.BaseLoginComposable$lambda$4(snapshotState), BaseLoginComposable.BaseLoginComposable$lambda$8(snapshotState2), null, null, false, fragmentActivity, baseLoginDuxo, 28, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Navigator navigator, FragmentActivity fragmentActivity, SnapshotState4 snapshotState4) {
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivity, new UserCreation(null, null, null, BaseLoginComposable.BaseLoginComposable$lambda$0(snapshotState4).getUserCreationFlow(), null, false, 55, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.ui.text.input.VisualTransformation] */
    public static final void LoginContent(final String str, final String str2, final BaseLoginViewState2 baseLoginViewState2, final LoginSubtext loginSubtext, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, final FocusRequester focusRequester, final FocusRequester focusRequester2, Composer composer, final int i) {
        int i2;
        String str3;
        int i3;
        DefaultConstructorMarker defaultConstructorMarker;
        char c;
        int i4;
        Modifier.Companion companion;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1430099889);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(baseLoginViewState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(loginSubtext) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1430099889, i2, -1, "com.robinhood.shared.login.lib.ui.LoginContent (BaseLoginComposable.kt:329)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i5 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (baseLoginViewState2 instanceof BaseLoginViewState2.Logo) {
                composerStartRestartGroup.startReplaceGroup(624522398);
                c = 0;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(((BaseLoginViewState2.Logo) baseLoginViewState2).getResId(), composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5169size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM(), 5, null), LogoSize), RobinhoodLogoTestTag);
                ColorFilter colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i6).m21368getAccent0d7_KjU(), 0, 2, null);
                i4 = 1048576;
                i3 = 536870912;
                defaultConstructorMarker = null;
                ImageKt.Image(painterPainterResource, (String) null, modifierTestTag, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composerStartRestartGroup, 48, 56);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                companion = companion3;
            } else {
                i3 = 536870912;
                defaultConstructorMarker = null;
                c = 0;
                i4 = 1048576;
                if (!(baseLoginViewState2 instanceof BaseLoginViewState2.Title)) {
                    composerStartRestartGroup.startReplaceGroup(297239351);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(625045244);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierTestTag2 = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), "title");
                companion = companion3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(((BaseLoginViewState2.Title) baseLoginViewState2).getTextResID(), composerStartRestartGroup, 0), modifierTestTag2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getW400(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextL(), composerStartRestartGroup, 24576, 0, 8104);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(TestTag3.testTag(companion, EmailTextInputTestTag), focusRequester);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.login_email_hint, composer2, c);
            KeyboardType.Companion companion5 = KeyboardType.INSTANCE;
            int iM7783getPasswordPjHm6EE = companion5.m7783getPasswordPjHm6EE();
            ImeAction.Companion companion6 = ImeAction.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, iM7783getPasswordPjHm6EE, companion6.m7749getNexteUduSuo(), null, null, null, 115, null);
            composer2.startReplaceGroup(5004770);
            char c2 = (i5 & 1879048192) == i3 ? (char) 1 : c;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (c2 != 0 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseLoginComposable.LoginContent$lambda$41$lambda$36$lambda$35(focusRequester2, (KeyboardActions2) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            BentoTextInput4.BentoTextInput(str, function1, modifierFocusRequester, null, strStringResource, null, null, null, null, null, keyboardOptions, new KeyboardActions(null, null, (Function1) objRememberedValue2, null, null, null, 59, null), null, false, false, composer4, (i5 & 14) | ((i5 >> 9) & 112), 6, 29672);
            Modifier modifierTestTag3 = TestTag3.testTag(companion, PasswordTextInputTestTag);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag3, 0.0f, bentoTheme3.getSpacing(composer4, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), focusRequester2);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.login_password_hint, composer4, c);
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(LoginContent$lambda$33(snapshotState) ? ServerToBentoAssetMapper2.EYE_24 : ServerToBentoAssetMapper2.EYE_CLOSED_24, null, null, 6, null);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, companion5.m7783getPasswordPjHm6EE(), companion6.m7748getGoeUduSuo(), null, null, null, 115, null);
            composer4.startReplaceGroup(5004770);
            char c3 = (i5 & 3670016) == i4 ? (char) 1 : c;
            Object objRememberedValue3 = composer4.rememberedValue();
            if (c3 != 0 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseLoginComposable.LoginContent$lambda$41$lambda$38$lambda$37(function0, (KeyboardActions2) obj);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue3);
            }
            composer4.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions(null, (Function1) objRememberedValue3, null, null, null, null, 61, null);
            VisualTransformation2 none = LoginContent$lambda$33(snapshotState) ? VisualTransformation.INSTANCE.getNone() : new VisualTransformation2(c, 1, defaultConstructorMarker);
            composer4.startReplaceGroup(5004770);
            Object objRememberedValue4 = composer4.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseLoginComposable.LoginContent$lambda$41$lambda$40$lambda$39(snapshotState);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue4);
            }
            composer4.endReplaceGroup();
            BentoTextInput4.BentoTextInput(str3, function12, modifierFocusRequester2, null, strStringResource2, null, null, null, size24, (Function0) objRememberedValue4, keyboardOptions2, keyboardActions, none, false, false, composer4, ((i5 >> 3) & 14) | 805306368 | ((i5 >> 12) & 112) | (BentoTextInput8.Icon.Size24.$stable << 24), 6, 24808);
            composer3 = composer4;
            composer3.startReplaceGroup(297325168);
            if (loginSubtext != null) {
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(loginSubtext.getRegularText(), composer3, c), StringResources_androidKt.stringResource(loginSubtext.getLinkText(), composer3, c), function02, TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme3.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), SubTextTestTag), bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), 0L, bentoTheme3.getTypography(composer3, i8).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer3, (i5 >> 15) & 896, 32);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseLoginComposable.LoginContent$lambda$42(str, str2, baseLoginViewState2, loginSubtext, function1, function12, function0, function02, focusRequester, focusRequester2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LoginContent$lambda$34(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoginContent$lambda$41$lambda$36$lambda$35(FocusRequester focusRequester, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoginContent$lambda$41$lambda$40$lambda$39(SnapshotState snapshotState) {
        LoginContent$lambda$34(snapshotState, !LoginContent$lambda$33(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoginContent$lambda$41$lambda$38$lambda$37(Function0 function0, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function0.invoke();
        return Unit.INSTANCE;
    }

    static /* synthetic */ void performLogin$default(String str, String str2, UUID uuid, Boolean bool, boolean z, Activity activity, BaseLoginDuxo baseLoginDuxo, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        performLogin(str, str2, uuid, bool, z, activity, baseLoginDuxo);
    }

    private static final void performLogin(String str, String str2, UUID uuid, Boolean bool, boolean z, Activity activity, BaseLoginDuxo baseLoginDuxo) {
        com.robinhood.utils.extensions.Activity.hideKeyboard$default(activity, false, 1, null);
        baseLoginDuxo.onDoLogin(str, str2, uuid, bool, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logLoginTapEvent(SharedEventLogger sharedEventLogger) {
        EventLogger.DefaultImpls.logTap$default(sharedEventLogger, UserInteractionEventData.Action.LOGIN, new Screen(Screen.Name.LOGIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }
}
