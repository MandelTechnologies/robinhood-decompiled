package com.robinhood.android.onboarding.p205ui.usercreation;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailEvent;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationRewardsEmailComposable4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UserCreationRewardsEmailComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u007f\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u008a\u0084\u0002"}, m3636d2 = {"UserCreationRewardsEmailComposable", "", "onBackButtonClicked", "Lkotlin/Function0;", "onShowPromotionalEmailRequestDialog", "Lkotlin/Function1;", "", "onShowWaitlistUrl", "onFinish", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$Finish;", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;Landroidx/compose/runtime/Composer;II)V", "keyboardAsState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "BACK_BUTTON_TEST_TAG", "BANNER_URL", "feature-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;", "emailValue", "waitlistUrl", "isKeyboardVisible", "showDuplicateEmailDialog", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UserCreationRewardsEmailComposable4 {
    private static final String BACK_BUTTON_TEST_TAG = "backButton";
    private static final String BANNER_URL = "onboarding_welcome_screen/welcome_blocks.png";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRewardsEmailComposable$lambda$28(Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Modifier modifier, UserCreationEmailDuxo userCreationEmailDuxo, int i, int i2, Composer composer, int i3) {
        UserCreationRewardsEmailComposable(function0, function1, function12, function13, function14, modifier, userCreationEmailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserCreationRewardsEmailComposable(final Function0<Unit> onBackButtonClicked, final Function1<? super String, Unit> onShowPromotionalEmailRequestDialog, final Function1<? super String, Unit> onShowWaitlistUrl, final Function1<? super UserCreationEmailEvent.Finish, Unit> onFinish, final Function1<? super Throwable, Unit> onError, Modifier modifier, UserCreationEmailDuxo userCreationEmailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        UserCreationEmailDuxo userCreationEmailDuxo2;
        Composer composer2;
        int i4;
        Modifier modifier3;
        int i5;
        final UserCreationEmailDuxo userCreationEmailDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotState snapshotState;
        Event<UserCreationEmailEvent> event;
        final Event<UserCreationEmailEvent> eventUserCreationRewardsEmailComposable$lambda$14;
        Context context;
        Composer composer3;
        Composer composer4;
        final UserCreationEmailDuxo userCreationEmailDuxo4;
        final Modifier modifier4;
        Context context2;
        final SnapshotState snapshotState2;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke2;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke3;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke4;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke5;
        EventConsumer<UserCreationEmailEvent> eventConsumerInvoke6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackButtonClicked, "onBackButtonClicked");
        Intrinsics.checkNotNullParameter(onShowPromotionalEmailRequestDialog, "onShowPromotionalEmailRequestDialog");
        Intrinsics.checkNotNullParameter(onShowWaitlistUrl, "onShowWaitlistUrl");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1399155502);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackButtonClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowPromotionalEmailRequestDialog) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowWaitlistUrl) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFinish) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    userCreationEmailDuxo2 = userCreationEmailDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(userCreationEmailDuxo2) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    userCreationEmailDuxo2 = userCreationEmailDuxo;
                }
                i3 |= i7;
            } else {
                userCreationEmailDuxo2 = userCreationEmailDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UserCreationEmailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                        modifier3 = modifier5;
                        i5 = i3 & (-3670017);
                        userCreationEmailDuxo3 = (UserCreationEmailDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = 0;
                        modifier3 = modifier5;
                        i5 = i3;
                        userCreationEmailDuxo3 = userCreationEmailDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    composer2 = composerStartRestartGroup;
                    i5 = i3;
                    modifier3 = modifier2;
                    userCreationEmailDuxo3 = userCreationEmailDuxo2;
                    i4 = 0;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1399155502, i5, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable (UserCreationRewardsEmailComposable.kt:77)");
                }
                Composer composer5 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(userCreationEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer5, 0, 7);
                final Context context3 = (Context) composer5.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composer5.consume(LocalNavigator.getLocalNavigator());
                objRememberedValue = composer5.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer5);
                    composer5.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Object[] objArr = new Object[i4];
                composer5.startReplaceGroup(1849434622);
                objRememberedValue2 = composer5.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$2$lambda$1();
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue2);
                }
                composer5.endReplaceGroup();
                final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composer5, 3072, 6);
                Object[] objArr2 = new Object[i4];
                composer5.startReplaceGroup(1849434622);
                objRememberedValue3 = composer5.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$6$lambda$5();
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue3);
                }
                composer5.endReplaceGroup();
                final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composer5, 3072, 6);
                final SnapshotState4<Boolean> snapshotState4KeyboardAsState = keyboardAsState(composer5, i4);
                Object[] objArr3 = new Object[i4];
                composer5.startReplaceGroup(1849434622);
                objRememberedValue4 = composer5.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$11$lambda$10();
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue4);
                }
                composer5.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue4, composer5, 3072, 6);
                final ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composer5, 3078, 6);
                final StateFlow<Event<UserCreationEmailEvent>> eventFlow = userCreationEmailDuxo3.getEventFlow();
                composer5.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer5.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UserCreationRewardsEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof UserCreationEmailEvent) {
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
                Event<UserCreationEmailEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof UserCreationEmailEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer5, 0, 0);
                composer5.endReplaceGroup();
                eventUserCreationRewardsEmailComposable$lambda$14 = UserCreationRewardsEmailComposable$lambda$14(snapshotState4CollectAsStateWithLifecycle2);
                if (eventUserCreationRewardsEmailComposable$lambda$14 != null) {
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.PromotionEmailBottomSheet) && (eventConsumerInvoke6 = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke6.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16871invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16871invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onShowPromotionalEmailRequestDialog.invoke(((UserCreationEmailEvent.PromotionEmailBottomSheet) eventUserCreationRewardsEmailComposable$lambda$14.getData()).getEmail());
                            }
                        });
                    }
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.GBEmailWaitlistBottomSheet) && (eventConsumerInvoke5 = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke5.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16872invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16872invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState4.setValue(((UserCreationEmailEvent.GBEmailWaitlistBottomSheet) eventUserCreationRewardsEmailComposable$lambda$14.getData()).getWaitlistWebUrl());
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UserCreationRewardsEmailComposable5(modalBottomSheetStateRememberModalBottomSheetState, null), 3, null);
                            }
                        });
                    }
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.GBOnboardingWaitlist) && (eventConsumerInvoke4 = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke4.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16873invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16873invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onShowWaitlistUrl.invoke(((UserCreationEmailEvent.GBOnboardingWaitlist) eventUserCreationRewardsEmailComposable$lambda$14.getData()).getWaitlistWebUrl());
                            }
                        });
                    }
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.DuplicateEmailError) && (eventConsumerInvoke3 = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16874invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16874invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$13(snapshotState, true);
                            }
                        });
                    }
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.Finish) && (eventConsumerInvoke2 = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16875invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16875invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onFinish.invoke((UserCreationEmailEvent.Finish) eventUserCreationRewardsEmailComposable$lambda$14.getData());
                            }
                        });
                    }
                    if ((eventUserCreationRewardsEmailComposable$lambda$14.getData() instanceof UserCreationEmailEvent.GenericError) && (eventConsumerInvoke = eventUserCreationRewardsEmailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventUserCreationRewardsEmailComposable$lambda$14, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$lambda$21$$inlined$consumeIfType$6
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16876invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16876invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onError.invoke(((UserCreationEmailEvent.GenericError) eventUserCreationRewardsEmailComposable$lambda$14.getData()).getThrowable());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                composer5.startReplaceGroup(263737345);
                if (UserCreationRewardsEmailComposable$lambda$12(snapshotState)) {
                    context = context3;
                    composer3 = composer5;
                } else {
                    String strStringResource = StringResources_androidKt.stringResource(C11287R.string.user_creation_duplicate_email_error_title, composer5, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C11287R.string.user_creation_duplicate_email_error_message, composer5, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C11287R.string.user_creation_duplicate_email_error_positive_button, composer5, 0);
                    composer5.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composer5.changedInstance(navigator) | composer5.changedInstance(context3) | composer5.changed(snapshotState3) | composer5.changed(snapshotState4CollectAsStateWithLifecycle) | composer5.changed(snapshotState);
                    Object objRememberedValue6 = composer5.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$23$lambda$22(navigator, context3, snapshotState3, snapshotState4CollectAsStateWithLifecycle, snapshotState);
                            }
                        };
                        context2 = context3;
                        snapshotState2 = snapshotState;
                        composer5.updateRememberedValue(objRememberedValue6);
                    } else {
                        snapshotState2 = snapshotState;
                        context2 = context3;
                    }
                    composer5.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue6);
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer5, 0);
                    composer5.startReplaceGroup(5004770);
                    boolean zChanged = composer5.changed(snapshotState2);
                    Object objRememberedValue7 = composer5.rememberedValue();
                    context = context2;
                    if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$25$lambda$24(snapshotState2);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue7);
                    }
                    composer5.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue7);
                    composer5.startReplaceGroup(5004770);
                    boolean zChanged2 = composer5.changed(snapshotState2);
                    Object objRememberedValue8 = composer5.rememberedValue();
                    if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$27$lambda$26(snapshotState2);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue8);
                    }
                    composer5.endReplaceGroup();
                    int i8 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i9 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, (Function0) objRememberedValue8, composer5, i8 | (i9 << 6) | (i9 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composer3 = composer5;
                }
                composer3.endReplaceGroup();
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i10 = BentoTheme.$stable;
                final Context context4 = context;
                Composer composer6 = composer3;
                ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(ComposableLambda3.rememberComposableLambda(900654272, true, new C229615(userCreationEmailDuxo3, snapshotState4, coroutineScope, modalBottomSheetStateRememberModalBottomSheetState), composer3, 54), modifierSystemBarsPadding, modalBottomSheetStateRememberModalBottomSheetState, false, null, 0.0f, bentoTheme.getColors(composer3, i10).m21371getBg0d7_KjU(), 0L, bentoTheme.getColors(composer3, i10).m21464getScrimColor0d7_KjU(), ComposableLambda3.rememberComposableLambda(-1649079705, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt.UserCreationRewardsEmailComposable.6

                    /* compiled from: UserCreationRewardsEmailComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserCreationEmailDuxo $duxo;
                        final /* synthetic */ SnapshotState<String> $emailValue$delegate;
                        final /* synthetic */ SnapshotState4<Boolean> $isKeyboardVisible$delegate;
                        final /* synthetic */ SnapshotState4<UserCreationEmailViewState> $viewState$delegate;

                        AnonymousClass3(Context context, SnapshotState<String> snapshotState, UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState4<UserCreationEmailViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                            this.$context = context;
                            this.$emailValue$delegate = snapshotState;
                            this.$duxo = userCreationEmailDuxo;
                            this.$viewState$delegate = snapshotState4;
                            this.$isKeyboardVisible$delegate = snapshotState42;
                        }

                        public final void invoke(PaddingValues it, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(it) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(648540393, i2, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:229)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, it), 0.0f, 1, null);
                            final Context context = this.$context;
                            final SnapshotState<String> snapshotState = this.$emailValue$delegate;
                            final UserCreationEmailDuxo userCreationEmailDuxo = this.$duxo;
                            SnapshotState4<UserCreationEmailViewState> snapshotState4 = this.$viewState$delegate;
                            SnapshotState4<Boolean> snapshotState42 = this.$isKeyboardVisible$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
                            String strStringResource = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_title, composer, 0);
                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
                            final String strStringResource2 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_see_terms_url, composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
                            String strStringResource3 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_subtitle, composer, 0);
                            String strStringResource4 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_see_terms, composer, 0);
                            TextStyle textS = bentoTheme.getTypography(composer, i3).getTextS();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
                            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(strStringResource2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass3.invoke$lambda$4$lambda$1$lambda$0(context, strStringResource2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource3, strStringResource4, (Function0) objRememberedValue, modifierM21623defaultHorizontalPaddingrAjV9yQ2, jM21426getFg20d7_KjU, 0L, textS, iM7919getCentere0LSkKk, composer, 0, 32);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(64)), composer, 6);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                            String strUserCreationRewardsEmailComposable$lambda$3 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$3(snapshotState);
                            String strStringResource5 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_hint, composer, 0);
                            boolean z = !UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$0(snapshotState4).isLoading();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(snapshotState) | composer.changedInstance(userCreationEmailDuxo);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass3.invoke$lambda$4$lambda$3$lambda$2(userCreationEmailDuxo, snapshotState, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoTextInput4.BentoHeroTextInput(strUserCreationRewardsEmailComposable$lambda$3, (Function1) objRememberedValue2, modifierM21623defaultHorizontalPaddingrAjV9yQ3, null, strStringResource5, null, null, null, null, null, null, null, z, false, composer, 0, 0, 12264);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(100)), composer, 6);
                            composer.startReplaceGroup(-1178811508);
                            if (!UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(snapshotState42)) {
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(UserCreationRewardsEmailComposable4.BANNER_URL).build()).build(), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25008, 104);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Context context, String str) {
                            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState snapshotState, String value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$4(snapshotState, value);
                            userCreationEmailDuxo.setEmailEdt(value);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer7, int i11) {
                        if ((i11 & 3) == 2 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1649079705, i11, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous> (UserCreationRewardsEmailComposable.kt:177)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE));
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer7, BentoTheme.$stable).m21371getBg0d7_KjU();
                        final Function0<Unit> function0 = onBackButtonClicked;
                        ScaffoldKt.m5625Scaffold27mzLpw(modifierNavigationBarsPadding, null, ComposableLambda3.rememberComposableLambda(-537399422, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt.UserCreationRewardsEmailComposable.6.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                invoke(composer8, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer8, int i12) {
                                if ((i12 & 3) == 2 && composer8.getSkipping()) {
                                    composer8.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-537399422, i12, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:183)");
                                }
                                UserCreationRewardsEmailComposable userCreationRewardsEmailComposable = UserCreationRewardsEmailComposable.INSTANCE;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(userCreationRewardsEmailComposable.m16860getLambda$2130125579$feature_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-896622815, true, new C503131(function0), composer8, 54), null, userCreationRewardsEmailComposable.getLambda$345503824$feature_onboarding_externalDebug(), false, false, null, null, 0L, null, composer8, 24966, 0, 2026);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: UserCreationRewardsEmailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C503131 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ Function0<Unit> $onBackButtonClicked;

                                C503131(Function0<Unit> function0) {
                                    this.$onBackButtonClicked = function0;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 6) == 0) {
                                        i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-896622815, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:191)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "backButton");
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$onBackButtonClicked);
                                    final Function0<Unit> function0 = this.$onBackButtonClicked;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return UserCreationRewardsEmailComposable4.C229636.AnonymousClass1.C503131.invoke$lambda$1$lambda$0(function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer7, 54), ComposableLambda3.rememberComposableLambda(1139623905, true, new AnonymousClass2(context4, userCreationEmailDuxo3, snapshotState3, snapshotState4CollectAsStateWithLifecycle, snapshotState4KeyboardAsState), composer7, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(648540393, true, new AnonymousClass3(context4, snapshotState3, userCreationEmailDuxo3, snapshotState4CollectAsStateWithLifecycle, snapshotState4KeyboardAsState), composer7, 54), composer7, 3456, 12582912, 98290);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: UserCreationRewardsEmailComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserCreationEmailDuxo $duxo;
                        final /* synthetic */ SnapshotState<String> $emailValue$delegate;
                        final /* synthetic */ SnapshotState4<Boolean> $isKeyboardVisible$delegate;
                        final /* synthetic */ SnapshotState4<UserCreationEmailViewState> $viewState$delegate;

                        AnonymousClass2(Context context, UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState<String> snapshotState, SnapshotState4<UserCreationEmailViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                            this.$context = context;
                            this.$duxo = userCreationEmailDuxo;
                            this.$emailValue$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                            this.$isKeyboardVisible$delegate = snapshotState42;
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
                                ComposerKt.traceEventStart(1139623905, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:206)");
                            }
                            final String strStringResource = StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_privacy_policy_url, composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            boolean zMatches = Patterns.EMAIL_ADDRESS.matcher(UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$3(this.$emailValue$delegate)).matches();
                            boolean zIsLoading = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$0(this.$viewState$delegate).isLoading();
                            composer.startReplaceGroup(-38068202);
                            String strStringResource3 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(this.$isKeyboardVisible$delegate) ? StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_uk, composer, 0) : null;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-38061150);
                            String strStringResource4 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(this.$isKeyboardVisible$delegate) ? StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_privacy_policy, composer, 0) : null;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changed(strStringResource);
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass2.invoke$lambda$1$lambda$0(context, strStringResource);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                            final UserCreationEmailDuxo userCreationEmailDuxo = this.$duxo;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass2.invoke$lambda$3$lambda$2(userCreationEmailDuxo);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource3, strStringResource4, false, function0, null, (Function0) objRememberedValue2, strStringResource2, zIsLoading, null, zMatches, null, null, false, null, false, composer, 0, 0, 64040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(UserCreationEmailDuxo userCreationEmailDuxo) {
                            userCreationEmailDuxo.onContinueCtaClicked();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Context context, String str) {
                            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composer3, 54), composer6, (ModalBottomSheetState.$stable << 6) | 805306374, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                composer4 = composer6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                userCreationEmailDuxo4 = userCreationEmailDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                userCreationEmailDuxo4 = userCreationEmailDuxo2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$28(onBackButtonClicked, onShowPromotionalEmailRequestDialog, onShowWaitlistUrl, onFinish, onError, modifier4, userCreationEmailDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer52 = composer2;
                final SnapshotState4<UserCreationEmailViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(userCreationEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer52, 0, 7);
                final Context context32 = (Context) composer52.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composer52.consume(LocalNavigator.getLocalNavigator());
                objRememberedValue = composer52.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                Object[] objArr4 = new Object[i4];
                composer52.startReplaceGroup(1849434622);
                objRememberedValue2 = composer52.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer52.endReplaceGroup();
                final SnapshotState<String> snapshotState32 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue2, composer52, 3072, 6);
                Object[] objArr22 = new Object[i4];
                composer52.startReplaceGroup(1849434622);
                objRememberedValue3 = composer52.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composer52.endReplaceGroup();
                final SnapshotState snapshotState42 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue3, composer52, 3072, 6);
                final SnapshotState4<Boolean> snapshotState4KeyboardAsState2 = keyboardAsState(composer52, i4);
                Object[] objArr32 = new Object[i4];
                composer52.startReplaceGroup(1849434622);
                objRememberedValue4 = composer52.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                composer52.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue4, composer52, 3072, 6);
                final ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composer52, 3078, 6);
                final Flow eventFlow2 = userCreationEmailDuxo3.getEventFlow();
                composer52.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer52.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UserCreationRewardsEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof UserCreationEmailEvent) {
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
                Event<UserCreationEmailEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof UserCreationEmailEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer52, 0, 0);
                composer52.endReplaceGroup();
                eventUserCreationRewardsEmailComposable$lambda$14 = UserCreationRewardsEmailComposable$lambda$14(snapshotState4CollectAsStateWithLifecycle22);
                if (eventUserCreationRewardsEmailComposable$lambda$14 != null) {
                }
                composer52.startReplaceGroup(263737345);
                if (UserCreationRewardsEmailComposable$lambda$12(snapshotState)) {
                }
                composer3.endReplaceGroup();
                Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i102 = BentoTheme.$stable;
                final Context context42 = context;
                Composer composer62 = composer3;
                ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(ComposableLambda3.rememberComposableLambda(900654272, true, new C229615(userCreationEmailDuxo3, snapshotState42, coroutineScope2, modalBottomSheetStateRememberModalBottomSheetState2), composer3, 54), modifierSystemBarsPadding2, modalBottomSheetStateRememberModalBottomSheetState2, false, null, 0.0f, bentoTheme2.getColors(composer3, i102).m21371getBg0d7_KjU(), 0L, bentoTheme2.getColors(composer3, i102).m21464getScrimColor0d7_KjU(), ComposableLambda3.rememberComposableLambda(-1649079705, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt.UserCreationRewardsEmailComposable.6

                    /* compiled from: UserCreationRewardsEmailComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserCreationEmailDuxo $duxo;
                        final /* synthetic */ SnapshotState<String> $emailValue$delegate;
                        final /* synthetic */ SnapshotState4<Boolean> $isKeyboardVisible$delegate;
                        final /* synthetic */ SnapshotState4<UserCreationEmailViewState> $viewState$delegate;

                        AnonymousClass3(Context context, SnapshotState<String> snapshotState, UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState4<UserCreationEmailViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                            this.$context = context;
                            this.$emailValue$delegate = snapshotState;
                            this.$duxo = userCreationEmailDuxo;
                            this.$viewState$delegate = snapshotState4;
                            this.$isKeyboardVisible$delegate = snapshotState42;
                        }

                        public final void invoke(PaddingValues it, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(it) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(648540393, i2, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:229)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, it), 0.0f, 1, null);
                            final Context context = this.$context;
                            final SnapshotState snapshotState = this.$emailValue$delegate;
                            final UserCreationEmailDuxo userCreationEmailDuxo = this.$duxo;
                            SnapshotState4<UserCreationEmailViewState> snapshotState4 = this.$viewState$delegate;
                            SnapshotState4<Boolean> snapshotState42 = this.$isKeyboardVisible$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
                            String strStringResource = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_title, composer, 0);
                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
                            final String strStringResource2 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_see_terms_url, composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
                            String strStringResource3 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_subtitle, composer, 0);
                            String strStringResource4 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_takeover_see_terms, composer, 0);
                            TextStyle textS = bentoTheme.getTypography(composer, i3).getTextS();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
                            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(strStringResource2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass3.invoke$lambda$4$lambda$1$lambda$0(context, strStringResource2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource3, strStringResource4, (Function0) objRememberedValue, modifierM21623defaultHorizontalPaddingrAjV9yQ2, jM21426getFg20d7_KjU, 0L, textS, iM7919getCentere0LSkKk, composer, 0, 32);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(64)), composer, 6);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                            String strUserCreationRewardsEmailComposable$lambda$3 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$3(snapshotState);
                            String strStringResource5 = StringResources_androidKt.stringResource(C22739R.string.email_rewards_hint, composer, 0);
                            boolean z = !UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$0(snapshotState4).isLoading();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(snapshotState) | composer.changedInstance(userCreationEmailDuxo);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$3$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass3.invoke$lambda$4$lambda$3$lambda$2(userCreationEmailDuxo, snapshotState, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoTextInput4.BentoHeroTextInput(strUserCreationRewardsEmailComposable$lambda$3, (Function1) objRememberedValue2, modifierM21623defaultHorizontalPaddingrAjV9yQ3, null, strStringResource5, null, null, null, null, null, null, null, z, false, composer, 0, 0, 12264);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(100)), composer, 6);
                            composer.startReplaceGroup(-1178811508);
                            if (!UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(snapshotState42)) {
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(UserCreationRewardsEmailComposable4.BANNER_URL).build()).build(), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25008, 104);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Context context, String str) {
                            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState snapshotState, String value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$4(snapshotState, value);
                            userCreationEmailDuxo.setEmailEdt(value);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer7, int i11) {
                        if ((i11 & 3) == 2 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1649079705, i11, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous> (UserCreationRewardsEmailComposable.kt:177)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE));
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer7, BentoTheme.$stable).m21371getBg0d7_KjU();
                        final Function0<Unit> function0 = onBackButtonClicked;
                        ScaffoldKt.m5625Scaffold27mzLpw(modifierNavigationBarsPadding, null, ComposableLambda3.rememberComposableLambda(-537399422, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt.UserCreationRewardsEmailComposable.6.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                invoke(composer8, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer8, int i12) {
                                if ((i12 & 3) == 2 && composer8.getSkipping()) {
                                    composer8.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-537399422, i12, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:183)");
                                }
                                UserCreationRewardsEmailComposable userCreationRewardsEmailComposable = UserCreationRewardsEmailComposable.INSTANCE;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(userCreationRewardsEmailComposable.m16860getLambda$2130125579$feature_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-896622815, true, new C503131(function0), composer8, 54), null, userCreationRewardsEmailComposable.getLambda$345503824$feature_onboarding_externalDebug(), false, false, null, null, 0L, null, composer8, 24966, 0, 2026);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: UserCreationRewardsEmailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C503131 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ Function0<Unit> $onBackButtonClicked;

                                C503131(Function0<Unit> function0) {
                                    this.$onBackButtonClicked = function0;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 6) == 0) {
                                        i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-896622815, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:191)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "backButton");
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$onBackButtonClicked);
                                    final Function0 function0 = this.$onBackButtonClicked;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return UserCreationRewardsEmailComposable4.C229636.AnonymousClass1.C503131.invoke$lambda$1$lambda$0(function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer7, 54), ComposableLambda3.rememberComposableLambda(1139623905, true, new AnonymousClass2(context42, userCreationEmailDuxo3, snapshotState32, snapshotState4CollectAsStateWithLifecycle3, snapshotState4KeyboardAsState2), composer7, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(648540393, true, new AnonymousClass3(context42, snapshotState32, userCreationEmailDuxo3, snapshotState4CollectAsStateWithLifecycle3, snapshotState4KeyboardAsState2), composer7, 54), composer7, 3456, 12582912, 98290);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: UserCreationRewardsEmailComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserCreationEmailDuxo $duxo;
                        final /* synthetic */ SnapshotState<String> $emailValue$delegate;
                        final /* synthetic */ SnapshotState4<Boolean> $isKeyboardVisible$delegate;
                        final /* synthetic */ SnapshotState4<UserCreationEmailViewState> $viewState$delegate;

                        AnonymousClass2(Context context, UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState<String> snapshotState, SnapshotState4<UserCreationEmailViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                            this.$context = context;
                            this.$duxo = userCreationEmailDuxo;
                            this.$emailValue$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                            this.$isKeyboardVisible$delegate = snapshotState42;
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
                                ComposerKt.traceEventStart(1139623905, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous>.<anonymous> (UserCreationRewardsEmailComposable.kt:206)");
                            }
                            final String strStringResource = StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_privacy_policy_url, composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            boolean zMatches = Patterns.EMAIL_ADDRESS.matcher(UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$3(this.$emailValue$delegate)).matches();
                            boolean zIsLoading = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$0(this.$viewState$delegate).isLoading();
                            composer.startReplaceGroup(-38068202);
                            String strStringResource3 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(this.$isKeyboardVisible$delegate) ? StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_uk, composer, 0) : null;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-38061150);
                            String strStringResource4 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$9(this.$isKeyboardVisible$delegate) ? StringResources_androidKt.stringResource(C22739R.string.email_rewards_disclosure_privacy_policy, composer, 0) : null;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changed(strStringResource);
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass2.invoke$lambda$1$lambda$0(context, strStringResource);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                            final UserCreationEmailDuxo userCreationEmailDuxo = this.$duxo;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$6$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserCreationRewardsEmailComposable4.C229636.AnonymousClass2.invoke$lambda$3$lambda$2(userCreationEmailDuxo);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource3, strStringResource4, false, function0, null, (Function0) objRememberedValue2, strStringResource2, zIsLoading, null, zMatches, null, null, false, null, false, composer, 0, 0, 64040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(UserCreationEmailDuxo userCreationEmailDuxo) {
                            userCreationEmailDuxo.onContinueCtaClicked();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Context context, String str) {
                            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composer3, 54), composer62, (ModalBottomSheetState.$stable << 6) | 805306374, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                composer4 = composer62;
                if (ComposerKt.isTraceInProgress()) {
                }
                userCreationEmailDuxo4 = userCreationEmailDuxo3;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UserCreationRewardsEmailComposable$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserCreationEmailViewState UserCreationRewardsEmailComposable$lambda$0(SnapshotState4<UserCreationEmailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean UserCreationRewardsEmailComposable$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Event<UserCreationEmailEvent> UserCreationRewardsEmailComposable$lambda$14(SnapshotState4<Event<UserCreationEmailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UserCreationRewardsEmailComposable$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UserCreationRewardsEmailComposable$lambda$6$lambda$5() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UserCreationRewardsEmailComposable$lambda$7(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserCreationRewardsEmailComposable$lambda$9(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState UserCreationRewardsEmailComposable$lambda$11$lambda$10() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserCreationRewardsEmailComposable$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserCreationRewardsEmailComposable$lambda$4(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRewardsEmailComposable$lambda$23$lambda$22(Navigator navigator, Context context, SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2) {
        UserCreation userCreation;
        String strUserCreationRewardsEmailComposable$lambda$3 = UserCreationRewardsEmailComposable$lambda$3(snapshotState);
        UserCreationEmailFragment.Args args = UserCreationRewardsEmailComposable$lambda$0(snapshotState4).getArgs();
        Navigator.DefaultImpls.startActivity$default(navigator, context, new Login(strUserCreationRewardsEmailComposable$lambda$3, (args == null || (userCreation = args.getUserCreation()) == null) ? null : userCreation.getLoginInsteadExitDeepLinkOverride(), false, 4, null), null, false, null, null, 60, null);
        UserCreationRewardsEmailComposable$lambda$13(snapshotState2, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRewardsEmailComposable$lambda$25$lambda$24(SnapshotState snapshotState) {
        UserCreationRewardsEmailComposable$lambda$13(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRewardsEmailComposable$lambda$27$lambda$26(SnapshotState snapshotState) {
        UserCreationRewardsEmailComposable$lambda$13(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: UserCreationRewardsEmailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$5 */
    static final class C229615 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ UserCreationEmailDuxo $duxo;
        final /* synthetic */ ModalBottomSheetState $sheetState;
        final /* synthetic */ SnapshotState<String> $waitlistUrl$delegate;

        C229615(UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState<String> snapshotState, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
            this.$duxo = userCreationEmailDuxo;
            this.$waitlistUrl$delegate = snapshotState;
            this.$coroutineScope = coroutineScope;
            this.$sheetState = modalBottomSheetState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 ModalBottomSheetLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900654272, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposable.<anonymous> (UserCreationRewardsEmailComposable.kt:150)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C22739R.string.user_creation_email_waitlist_bottom_sheet_title, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C22739R.string.user_creation_email_waitlist_bottom_sheet_description, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C22739R.string.user_creation_email_waitlist_bottom_sheet_opt_in_button, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$waitlistUrl$delegate);
            final UserCreationEmailDuxo userCreationEmailDuxo = this.$duxo;
            final SnapshotState<String> snapshotState = this.$waitlistUrl$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRewardsEmailComposable4.C229615.invoke$lambda$1$lambda$0(userCreationEmailDuxo, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue);
            String strStringResource4 = StringResources_androidKt.stringResource(C22739R.string.user_creation_email_waitlist_bottom_sheet_opt_out_button, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$sheetState);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$UserCreationRewardsEmailComposable$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRewardsEmailComposable4.C229615.invoke$lambda$3$lambda$2(coroutineScope, modalBottomSheetState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue2);
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.STOPWATCH;
            int i2 = BentoAlertButton.$stable;
            BentoAlertSheet.BentoAlertSheet(strStringResource, strStringResource2, bentoAlertButton, bentoAlertButton2, serverToBentoAssetMapper3, null, composer, (i2 << 6) | 24576 | (i2 << 9), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UserCreationEmailDuxo userCreationEmailDuxo, SnapshotState snapshotState) {
            String strUserCreationRewardsEmailComposable$lambda$7 = UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable$lambda$7(snapshotState);
            if (strUserCreationRewardsEmailComposable$lambda$7 == null) {
                throw new IllegalStateException("waitlistUrl must not be null!");
            }
            userCreationEmailDuxo.onVisitJoinWaitlistPage(strUserCreationRewardsEmailComposable$lambda$7);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UserCreationRewardsEmailComposable6(modalBottomSheetState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult keyboardAsState$lambda$32$lambda$31(final ViewTreeObserver viewTreeObserver, final SnapshotState snapshotState, final View view, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$keyboardAsState$1$1$onGlobalListener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                SnapshotState<Boolean> snapshotState2 = snapshotState;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                snapshotState2.setValue(Boolean.valueOf(rootWindowInsets != null ? rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime()) : true));
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new DisposableEffectResult() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$keyboardAsState$lambda$32$lambda$31$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    public static final SnapshotState4<Boolean> keyboardAsState(Composer composer, int i) {
        composer.startReplaceGroup(-1378300777);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1378300777, i, -1, "com.robinhood.android.onboarding.ui.usercreation.keyboardAsState (UserCreationRewardsEmailComposable.kt:291)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(view) | composer.changedInstance(viewTreeObserver);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UserCreationRewardsEmailComposable4.keyboardAsState$lambda$32$lambda$31(viewTreeObserver, snapshotState, view, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState;
    }
}
