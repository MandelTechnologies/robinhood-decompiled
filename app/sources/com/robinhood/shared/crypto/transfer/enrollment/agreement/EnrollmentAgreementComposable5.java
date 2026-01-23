package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey2;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable5;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementDuxo2;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEvent;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Locale;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EnrollmentAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0012\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002"}, m3636d2 = {"EnrollmentAgreementComposable", "", "reduceNavigationEvent", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", "viewState", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;", "(Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NoCryptoAccountContent", "displayText", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "onClickContinue", "Lkotlin/Function0;", "onClickSkip", "(Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentAgreementComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$14(EnrollmentAgreementViewState enrollmentAgreementViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(enrollmentAgreementViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$19(EnrollmentAgreementViewState enrollmentAgreementViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(enrollmentAgreementViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9(EnrollmentAgreementViewState enrollmentAgreementViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(enrollmentAgreementViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentAgreementComposable$lambda$6(Function1 function1, Modifier modifier, EnrollmentAgreementDuxo enrollmentAgreementDuxo, int i, int i2, Composer composer, int i3) {
        EnrollmentAgreementComposable(function1, modifier, enrollmentAgreementDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoCryptoAccountContent$lambda$13(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NoCryptoAccountContent(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$20(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnrollmentAgreementComposable(final Function1<? super EnrollmentEvent, Unit> reduceNavigationEvent, Modifier modifier, EnrollmentAgreementDuxo enrollmentAgreementDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        EnrollmentAgreementDuxo enrollmentAgreementDuxo2;
        int i4;
        int i5;
        final Modifier modifier3;
        final EnrollmentAgreementDuxo enrollmentAgreementDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Event<EnrollmentAgreementDuxo2> eventEnrollmentAgreementComposable$lambda$3;
        Modifier modifier4;
        EnrollmentAgreementDuxo enrollmentAgreementDuxo4;
        final EnrollmentAgreementDuxo enrollmentAgreementDuxo5;
        final Modifier modifier5;
        EventConsumer<EnrollmentAgreementDuxo2> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(reduceNavigationEvent, "reduceNavigationEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-850785858);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(reduceNavigationEvent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    enrollmentAgreementDuxo2 = enrollmentAgreementDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(enrollmentAgreementDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    enrollmentAgreementDuxo2 = enrollmentAgreementDuxo;
                }
                i3 |= i7;
            } else {
                enrollmentAgreementDuxo2 = enrollmentAgreementDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EnrollmentAgreementDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        enrollmentAgreementDuxo2 = (EnrollmentAgreementDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = 0;
                    }
                    EnrollmentAgreementDuxo enrollmentAgreementDuxo6 = enrollmentAgreementDuxo2;
                    i5 = i3;
                    modifier3 = modifier6;
                    enrollmentAgreementDuxo3 = enrollmentAgreementDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    enrollmentAgreementDuxo3 = enrollmentAgreementDuxo2;
                    i5 = i3;
                    modifier3 = modifier2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850785858, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable (EnrollmentAgreementComposable.kt:72)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                final OnBackPressedDispatcher onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(enrollmentAgreementDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$1$lambda$0(enrollmentAgreementDuxo3, (ActivityResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue, composerStartRestartGroup, i4);
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(enrollmentAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final StateFlow<Event<EnrollmentAgreementDuxo2>> eventFlow = enrollmentAgreementDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "EnrollmentAgreementComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof EnrollmentAgreementDuxo2) {
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
                Event<EnrollmentAgreementDuxo2> value = eventFlow.getValue();
                Event<EnrollmentAgreementDuxo2> event = value;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, !((event == null ? event.getData() : null) instanceof EnrollmentAgreementDuxo2) ? value : null, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1352107767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1352107767, i8, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous> (EnrollmentAgreementComposable.kt:90)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null));
                        final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(404854733, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(404854733, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:96)");
                                }
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(EnrollmentAgreementComposable.INSTANCE.getLambda$1567328698$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(297988366, true, new C507001(onBackPressedDispatcher2), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: EnrollmentAgreementComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C507001 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                                C507001(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    this.$backPressedDispatcher = onBackPressedDispatcher;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    if (onBackPressedDispatcher != null) {
                                        onBackPressedDispatcher.onBackPressed();
                                    }
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
                                        ComposerKt.traceEventStart(297988366, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:99)");
                                    }
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                                    final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return EnrollmentAgreementComposable5.C379431.AnonymousClass1.C507001.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }, composer2, 54);
                        final EnrollmentAgreementDuxo enrollmentAgreementDuxo7 = enrollmentAgreementDuxo3;
                        final SnapshotState4<EnrollmentAgreementViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(482975822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(482975822, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:104)");
                                }
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                EnrollmentAgreementViewState enrollmentAgreementViewStateEnrollmentAgreementComposable$lambda$2 = EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$2(snapshotState4);
                                EnrollmentAgreementDuxo enrollmentAgreementDuxo8 = enrollmentAgreementDuxo7;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer3.changedInstance(enrollmentAgreementDuxo8);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new EnrollmentAgreementComposable6(enrollmentAgreementDuxo8);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue3;
                                composer3.endReplaceGroup();
                                EnrollmentAgreementDuxo enrollmentAgreementDuxo9 = enrollmentAgreementDuxo7;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(enrollmentAgreementDuxo9);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new EnrollmentAgreementComposable7(enrollmentAgreementDuxo9);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                EnrollmentAgreementComposable5.BottomBar(enrollmentAgreementViewStateEnrollmentAgreementComposable$lambda$2, (Function0) kFunction, (Function0) ((KFunction) objRememberedValue4), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<EnrollmentAgreementViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1256596968, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues contentPadding, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((i9 & 6) == 0) {
                                    i9 |= composer3.changed(contentPadding) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1256596968, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:113)");
                                }
                                EnrollmentAgreementComposable5.Content(EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$2(snapshotState42), androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                eventEnrollmentAgreementComposable$lambda$3 = EnrollmentAgreementComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2);
                if (eventEnrollmentAgreementComposable$lambda$3 == null && (eventEnrollmentAgreementComposable$lambda$3.getData() instanceof EnrollmentAgreementDuxo2) && (eventConsumerInvoke = eventEnrollmentAgreementComposable$lambda$3.getGetEventConsumer().invoke()) != null) {
                    modifier4 = modifier3;
                    enrollmentAgreementDuxo4 = enrollmentAgreementDuxo3;
                    eventConsumerInvoke.consume(eventEnrollmentAgreementComposable$lambda$3, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m24998invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24998invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            EnrollmentAgreementDuxo2 enrollmentAgreementDuxo22 = (EnrollmentAgreementDuxo2) eventEnrollmentAgreementComposable$lambda$3.getData();
                            if (Intrinsics.areEqual(enrollmentAgreementDuxo22, EnrollmentAgreementDuxo2.NavigateToAccountSecurity.INSTANCE)) {
                                reduceNavigationEvent.invoke(EnrollmentEvent.Agreement.AckedAgreement.INSTANCE);
                                return;
                            }
                            if (enrollmentAgreementDuxo22 instanceof EnrollmentAgreementDuxo2.ReviewAgreement) {
                                activityResultRegistry8RememberLauncherForActivityResult.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new RemoteAgreementFragmentKey(new RemoteAgreementFragmentKey2.ContentfulId(((EnrollmentAgreementDuxo2.ReviewAgreement) enrollmentAgreementDuxo22).getContentfulId()), true, true, true, Locale.US), false, false, false, null, false, true, false, false, false, null, false, 3956, null));
                                return;
                            }
                            if (enrollmentAgreementDuxo22 instanceof EnrollmentAgreementDuxo2.Success) {
                                reduceNavigationEvent.invoke(new EnrollmentEvent.CheckForCompletion(((EnrollmentAgreementDuxo2.Success) enrollmentAgreementDuxo22).getEnrollment()));
                                return;
                            }
                            if (enrollmentAgreementDuxo22 instanceof EnrollmentAgreementDuxo2.Error) {
                                Activity activity2 = activity;
                                if (activity2 != null) {
                                    CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, activity2, ((EnrollmentAgreementDuxo2.Error) enrollmentAgreementDuxo22).getThrowable(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                    return;
                                }
                                return;
                            }
                            if (!(enrollmentAgreementDuxo22 instanceof EnrollmentAgreementDuxo2.Skip)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            reduceNavigationEvent.invoke(EnrollmentEvent.Agreement.Skip.INSTANCE);
                        }
                    });
                } else {
                    modifier4 = modifier3;
                    enrollmentAgreementDuxo4 = enrollmentAgreementDuxo3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                enrollmentAgreementDuxo5 = enrollmentAgreementDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                enrollmentAgreementDuxo5 = enrollmentAgreementDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$6(reduceNavigationEvent, modifier5, enrollmentAgreementDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                EnrollmentAgreementDuxo enrollmentAgreementDuxo62 = enrollmentAgreementDuxo2;
                i5 = i3;
                modifier3 = modifier6;
                enrollmentAgreementDuxo3 = enrollmentAgreementDuxo62;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                if (current22 == null) {
                }
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(enrollmentAgreementDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$1$lambda$0(enrollmentAgreementDuxo3, (ActivityResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue, composerStartRestartGroup, i4);
                    final SnapshotState4<EnrollmentAgreementViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(enrollmentAgreementDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final Flow eventFlow2 = enrollmentAgreementDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "EnrollmentAgreementComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof EnrollmentAgreementDuxo2) {
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
                    Event<EnrollmentAgreementDuxo2> value2 = eventFlow2.getValue();
                    Event<EnrollmentAgreementDuxo2> event2 = value2;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, !((event2 == null ? event2.getData() : null) instanceof EnrollmentAgreementDuxo2) ? value2 : null, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1352107767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1352107767, i8, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous> (EnrollmentAgreementComposable.kt:90)");
                            }
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null));
                            final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(404854733, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(404854733, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:96)");
                                    }
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(EnrollmentAgreementComposable.INSTANCE.getLambda$1567328698$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(297988366, true, new C507001(onBackPressedDispatcher2), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: EnrollmentAgreementComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C507001 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                                    C507001(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        this.$backPressedDispatcher = onBackPressedDispatcher;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                        invoke(bentoAppBarScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        if (onBackPressedDispatcher != null) {
                                            onBackPressedDispatcher.onBackPressed();
                                        }
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
                                            ComposerKt.traceEventStart(297988366, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:99)");
                                        }
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return EnrollmentAgreementComposable5.C379431.AnonymousClass1.C507001.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                            }, composer2, 54);
                            final EnrollmentAgreementDuxo enrollmentAgreementDuxo7 = enrollmentAgreementDuxo3;
                            final SnapshotState4<EnrollmentAgreementViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(482975822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(482975822, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:104)");
                                    }
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    EnrollmentAgreementViewState enrollmentAgreementViewStateEnrollmentAgreementComposable$lambda$2 = EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$2(snapshotState4);
                                    EnrollmentAgreementDuxo enrollmentAgreementDuxo8 = enrollmentAgreementDuxo7;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer3.changedInstance(enrollmentAgreementDuxo8);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new EnrollmentAgreementComposable6(enrollmentAgreementDuxo8);
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    KFunction kFunction = (KFunction) objRememberedValue3;
                                    composer3.endReplaceGroup();
                                    EnrollmentAgreementDuxo enrollmentAgreementDuxo9 = enrollmentAgreementDuxo7;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer3.changedInstance(enrollmentAgreementDuxo9);
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new EnrollmentAgreementComposable7(enrollmentAgreementDuxo9);
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer3.endReplaceGroup();
                                    EnrollmentAgreementComposable5.BottomBar(enrollmentAgreementViewStateEnrollmentAgreementComposable$lambda$2, (Function0) kFunction, (Function0) ((KFunction) objRememberedValue4), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, composer3, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            final SnapshotState4<EnrollmentAgreementViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1256596968, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt.EnrollmentAgreementComposable.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues contentPadding, Composer composer3, int i9) {
                                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                    if ((i9 & 6) == 0) {
                                        i9 |= composer3.changed(contentPadding) ? 4 : 2;
                                    }
                                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1256596968, i9, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposable.<anonymous>.<anonymous> (EnrollmentAgreementComposable.kt:113)");
                                    }
                                    EnrollmentAgreementComposable5.Content(EnrollmentAgreementComposable5.EnrollmentAgreementComposable$lambda$2(snapshotState42), androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), composer3, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 805306800, 504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    eventEnrollmentAgreementComposable$lambda$3 = EnrollmentAgreementComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventEnrollmentAgreementComposable$lambda$3 == null) {
                        modifier4 = modifier3;
                        enrollmentAgreementDuxo4 = enrollmentAgreementDuxo3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        enrollmentAgreementDuxo5 = enrollmentAgreementDuxo4;
                        modifier5 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentAgreementComposable$lambda$1$lambda$0(EnrollmentAgreementDuxo enrollmentAgreementDuxo, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            enrollmentAgreementDuxo.completeEnrollment();
        }
        return Unit.INSTANCE;
    }

    private static final LottieComposition Content$lambda$8$lambda$7(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnrollmentAgreementViewState EnrollmentAgreementComposable$lambda$2(SnapshotState4<EnrollmentAgreementViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EnrollmentAgreementDuxo2> EnrollmentAgreementComposable$lambda$3(SnapshotState4<Event<EnrollmentAgreementDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final EnrollmentAgreementViewState enrollmentAgreementViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        EnrollmentAgreementViewState.ContentState contentState;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1067110259);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(enrollmentAgreementViewState) : composerStartRestartGroup.changedInstance(enrollmentAgreementViewState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1067110259, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.Content (EnrollmentAgreementComposable.kt:170)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier4 = modifier3;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    i5 = C37934R.raw.lottie_enrollment_agreement_light;
                } else {
                    i5 = C37934R.raw.lottie_enrollment_agreement_dark;
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i5)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                LottieAnimation2.LottieAnimation(Content$lambda$8$lambda$7(lottieCompositionResultRememberLottieComposition), column6.align(AspectRatio3.aspectRatio$default(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(280)), 0.8101266f, false, 2, null), companion.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097148);
                contentState = enrollmentAgreementViewState.getContentState();
                if (!(contentState instanceof EnrollmentAgreementViewState.ContentState.NoCryptoAccount)) {
                    composerStartRestartGroup.startReplaceGroup(1097305941);
                    NoCryptoAccountContent(((EnrollmentAgreementViewState.ContentState.NoCryptoAccount) contentState).getDisplayText(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    EnrollmentAgreementViewState.ContentState.InitialLoading initialLoading = EnrollmentAgreementViewState.ContentState.InitialLoading.INSTANCE;
                    if (!Intrinsics.areEqual(contentState, initialLoading) && !(contentState instanceof EnrollmentAgreementViewState.ContentState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(-795889133);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1097634355);
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(enrollmentAgreementViewState.getTitleResource(), composerStartRestartGroup, StringResource.$stable), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), Intrinsics.areEqual(contentState, initialLoading), null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(enrollmentAgreementViewState.getSubtitleResource(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 13, null), Intrinsics.areEqual(contentState, initialLoading), null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentAgreementComposable5.Content$lambda$9(enrollmentAgreementViewState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier42 = modifier3;
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i5)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                LottieAnimation2.LottieAnimation(Content$lambda$8$lambda$7(lottieCompositionResultRememberLottieComposition2), column62.align(AspectRatio3.aspectRatio$default(SizeKt.m5156height3ABfNKs(companion32, C2002Dp.m7995constructorimpl(280)), 0.8101266f, false, 2, null), companion4.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097148);
                contentState = enrollmentAgreementViewState.getContentState();
                if (!(contentState instanceof EnrollmentAgreementViewState.ContentState.NoCryptoAccount)) {
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NoCryptoAccountContent(String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        final Navigator navigator;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-471395737);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-471395737, i4, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.NoCryptoAccountContent (EnrollmentAgreementComposable.kt:225)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), false, null, null, null, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
                str2 = str;
                BentoText2.m20747BentoText38GnDrw(str2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16316);
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_create_account_error, composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EnrollmentAgreementComposable5.NoCryptoAccountContent$lambda$12$lambda$11$lambda$10(navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierM5146paddingqDBjuR0$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentAgreementComposable5.NoCryptoAccountContent$lambda$13(str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), false, null, null, null, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium();
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierM5146paddingqDBjuR0$default3, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8124);
                str2 = str;
                BentoText2.m20747BentoText38GnDrw(str2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16316);
                Modifier modifierM5146paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_create_account_error, composerStartRestartGroup, 0);
                BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EnrollmentAgreementComposable5.NoCryptoAccountContent$lambda$12$lambda$11$lambda$10(navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource22, modifierM5146paddingqDBjuR0$default22, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoCryptoAccountContent$lambda$12$lambda$11$lambda$10(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoUpgradeIntentKey(false, null, 3, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBar(final EnrollmentAgreementViewState enrollmentAgreementViewState, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        EnrollmentAgreementViewState.ButtonState continueButtonState;
        EnrollmentAgreementViewState.ButtonState skipButtonState;
        EnrollmentAgreementViewState.ButtonState buttonState;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(359365078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(enrollmentAgreementViewState) : composerStartRestartGroup.changedInstance(enrollmentAgreementViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359365078, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.BottomBar (EnrollmentAgreementComposable.kt:270)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                continueButtonState = enrollmentAgreementViewState.getContentState().getContinueButtonState();
                skipButtonState = enrollmentAgreementViewState.getContentState().getSkipButtonState();
                buttonState = EnrollmentAgreementViewState.ButtonState.HIDDEN;
                if (continueButtonState != buttonState && skipButtonState == buttonState) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EnrollmentAgreementComposable5.BottomBar$lambda$14(enrollmentAgreementViewState, function0, function02, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier5 = modifier2;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1752477013);
                String textAsString = continueButtonState == buttonState ? StringResources6.getTextAsString(enrollmentAgreementViewState.getPrimaryButtonLabelResource(), composerStartRestartGroup, StringResource.$stable) : null;
                composerStartRestartGroup.endReplaceGroup();
                EnrollmentAgreementViewState.ButtonState buttonState2 = EnrollmentAgreementViewState.ButtonState.ENABLED;
                boolean z = continueButtonState != buttonState2;
                EnrollmentAgreementViewState.ButtonState buttonState3 = EnrollmentAgreementViewState.ButtonState.LOADING;
                boolean z2 = continueButtonState != buttonState3;
                composerStartRestartGroup.startReplaceGroup(1752502131);
                String textAsString2 = skipButtonState == buttonState ? StringResources6.getTextAsString(enrollmentAgreementViewState.getSecondaryButtonLabelResource(), composerStartRestartGroup, StringResource.$stable) : null;
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = skipButtonState == buttonState2;
                boolean z4 = skipButtonState != buttonState3;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EnrollmentAgreementComposable5.BottomBar$lambda$16$lambda$15(current, userInteractionEventDescriptor, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function03 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EnrollmentAgreementComposable5.BottomBar$lambda$18$lambda$17(current, userInteractionEventDescriptor, function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z5 = z2;
                boolean z6 = z;
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, function03, textAsString, z5, null, z6, (Function0) objRememberedValue2, textAsString2, z4, null, z3, composer2, 0, 0, 16958);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentAgreementComposable5.BottomBar$lambda$19(enrollmentAgreementViewState, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            continueButtonState = enrollmentAgreementViewState.getContentState().getContinueButtonState();
            skipButtonState = enrollmentAgreementViewState.getContentState().getSkipButtonState();
            buttonState = EnrollmentAgreementViewState.ButtonState.HIDDEN;
            if (continueButtonState != buttonState) {
            }
            Modifier modifier52 = modifier2;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1752477013);
            if (continueButtonState == buttonState) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EnrollmentAgreementViewState.ButtonState buttonState22 = EnrollmentAgreementViewState.ButtonState.ENABLED;
            if (continueButtonState != buttonState22) {
            }
            EnrollmentAgreementViewState.ButtonState buttonState32 = EnrollmentAgreementViewState.ButtonState.LOADING;
            if (continueButtonState != buttonState32) {
            }
            composerStartRestartGroup.startReplaceGroup(1752502131);
            if (skipButtonState == buttonState) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (skipButtonState == buttonState22) {
            }
            if (skipButtonState != buttonState32) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentAgreementComposable5.BottomBar$lambda$16$lambda$15(current, userInteractionEventDescriptor, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function0 function032 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EnrollmentAgreementComposable5.BottomBar$lambda$18$lambda$17(current, userInteractionEventDescriptor, function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z52 = z2;
                    boolean z62 = z;
                    composer2 = composerStartRestartGroup;
                    BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default2, null, null, false, null, null, function032, textAsString, z52, null, z62, (Function0) objRememberedValue2, textAsString2, z4, null, z3, composer2, 0, 0, 16958);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$16$lambda$15(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "REVIEW", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$18$lambda$17(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "NOT_NOW", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    @DayNightPreview
    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-377112961);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-377112961, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.agreement.Preview (EnrollmentAgreementComposable.kt:321)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, EnrollmentAgreementComposable.INSTANCE.getLambda$1456086583$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentAgreementComposable5.Preview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
