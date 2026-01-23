package com.robinhood.android.gold.upgrade.unified;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostController2;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposable3;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostEvent;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.ActionDto;
import gold_flow.proto.p466v1.PresentationType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: GoldUnifiedHostComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\"\u000e\u0010\n\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, m3636d2 = {"GoldUnifiedHostComposable", "", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onShowSurvey", "Lkotlin/Function0;", "(Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LOADING_SCREEN_IDENTIFIER", "", "Loading", "(Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "UpdateApp", "(Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "firstDestination", "Landroidx/navigation/NavDestination;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "resultOkAction", "Lgold_flow/proto/v1/Action;", "resultCancelAction"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedHostComposable3 {
    public static final String LOADING_SCREEN_IDENTIFIER = "gold_unified_loading_screen";

    /* compiled from: GoldUnifiedHostComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.LISTEN_FOR_ACTIVITY_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedHostComposable$lambda$29(GoldUnifiedHostDuxo goldUnifiedHostDuxo, Context context, Function0 function0, int i, int i2, Composer composer, int i3) {
        GoldUnifiedHostComposable(goldUnifiedHostDuxo, context, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$30(Context context, int i, int i2, Composer composer, int i3) {
        Loading(context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateApp$lambda$32(int i, Composer composer, int i2) {
        UpdateApp(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldUnifiedHostComposable$handleActivityResultDeeplink(ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8, UriHandler uriHandler, Navigator navigator, android.content.Context context, String str) {
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -35871234) {
                if (iHashCode == 1979479290 && host.equals("transfer_funds")) {
                    activityResultRegistry8.launch(GoldUnifiedHostComposable$handleTransferDeeplink(navigator, context, uri));
                    return;
                }
            } else if (host.equals("micro_learning_lesson")) {
                Intent intentGoldUnifiedHostComposable$handleGoldLearnAndEarnDeeplink = GoldUnifiedHostComposable$handleGoldLearnAndEarnDeeplink(navigator, context, uri);
                if (intentGoldUnifiedHostComposable$handleGoldLearnAndEarnDeeplink != null) {
                    activityResultRegistry8.launch(intentGoldUnifiedHostComposable$handleGoldLearnAndEarnDeeplink);
                    return;
                } else {
                    uriHandler.openUri(str);
                    return;
                }
            }
        }
        uriHandler.openUri(str);
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v25, types: [com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$overrideUriHandler$1] */
    public static final void GoldUnifiedHostComposable(GoldUnifiedHostDuxo goldUnifiedHostDuxo, Context context, final Function0<Unit> onShowSurvey, Composer composer, final int i, final int i2) {
        final GoldUnifiedHostDuxo goldUnifiedHostDuxo2;
        int i3;
        final Context context2;
        Context context3;
        int i4;
        GoldUnifiedHostDuxo goldUnifiedHostDuxo3;
        final GoldUnifiedHostDuxo goldUnifiedHostDuxo4;
        ?? r3;
        Composer composer2;
        final GoldUnifiedHostDuxo goldUnifiedHostDuxo5;
        EventConsumer<GoldUnifiedHostEvent> eventConsumerInvoke;
        int i5;
        Intrinsics.checkNotNullParameter(onShowSurvey, "onShowSurvey");
        Composer composerStartRestartGroup = composer.startRestartGroup(-431167203);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                goldUnifiedHostDuxo2 = goldUnifiedHostDuxo;
                if (composerStartRestartGroup.changedInstance(goldUnifiedHostDuxo2)) {
                    i5 = 4;
                }
                i3 = i5 | i;
            } else {
                goldUnifiedHostDuxo2 = goldUnifiedHostDuxo;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            goldUnifiedHostDuxo2 = goldUnifiedHostDuxo;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
            context2 = context;
        } else {
            context2 = context;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowSurvey) ? 256 : 128;
        }
        int i7 = i3;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    i4 = 0;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedHostDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i7 &= -15;
                    goldUnifiedHostDuxo3 = (GoldUnifiedHostDuxo) baseDuxo;
                    context3 = null;
                } else {
                    context3 = null;
                    i4 = 0;
                    goldUnifiedHostDuxo3 = goldUnifiedHostDuxo;
                }
                if (i6 != 0) {
                    context2 = context3;
                }
                goldUnifiedHostDuxo4 = goldUnifiedHostDuxo3;
                r3 = context3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i7 &= -15;
                }
                goldUnifiedHostDuxo4 = goldUnifiedHostDuxo2;
                r3 = 0;
                i4 = 0;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-431167203, i7, -1, "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposable (GoldUnifiedHostComposable.kt:59)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new androidx.navigation.Navigator[i4], composerStartRestartGroup, i4);
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            final ?? r4 = new UriHandler() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$overrideUriHandler$1
                @Override // androidx.compose.p011ui.platform.UriHandler
                public void openUri(String uri) {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    GoldUnifiedHostDuxo goldUnifiedHostDuxo6 = goldUnifiedHostDuxo4;
                    NavDestination currentDestination = navHostControllerRememberNavController.getCurrentDestination();
                    goldUnifiedHostDuxo6.sendDeeplinkAction(uri, currentDestination != null ? GoldUnifiedNavController.toGoldFlowScreen(currentDestination) : null);
                }
            };
            NavBackStackEntry navBackStackEntryGoldUnifiedHostComposable$lambda$0 = GoldUnifiedHostComposable$lambda$0(NavHostController2.currentBackStackEntryAsState(navHostControllerRememberNavController, composerStartRestartGroup, i4));
            NavDestination destination = navBackStackEntryGoldUnifiedHostComposable$lambda$0 != null ? navBackStackEntryGoldUnifiedHostComposable$lambda$0.getDestination() : r3;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(r3, r3, 2, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(destination) | composerStartRestartGroup.changedInstance(navHostControllerRememberNavController);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new GoldUnifiedHostComposable4(destination, navHostControllerRememberNavController, snapshotState, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(destination, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i4);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(501130984, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt.GoldUnifiedHostComposable.2

                /* compiled from: GoldUnifiedHostComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $loggingContext;
                    final /* synthetic */ NavHostController $navController;

                    AnonymousClass1(NavHostController navHostController, Context context) {
                        this.$navController = navHostController;
                        this.$loggingContext = context;
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
                            ComposerKt.traceEventStart(1487362984, i, -1, "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposable.<anonymous>.<anonymous> (GoldUnifiedHostComposable.kt:87)");
                        }
                        NavHostController navHostController = this.$navController;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$loggingContext);
                        final Context context = this.$loggingContext;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return GoldUnifiedHostComposable3.C181722.AnonymousClass1.invoke$lambda$1$lambda$0(context, (NavGraphBuilder) obj, (NavHostController) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        GenericNavHost.m20570GenericNavHostuDo3WH8(navHostController, extensions2.persistentSetOf((Function2) objRememberedValue), LoadingDest.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, composer, ComposableDestination.$stable << 6, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Context context, NavGraphBuilder persistentSetOf, NavHostController navController) {
                        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                        Intrinsics.checkNotNullParameter(navController, "navController");
                        GoldUnifiedNavGraph6.goldUnifiedNavGraph(persistentSetOf, navController, context);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(501130984, i8, -1, "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposable.<anonymous> (GoldUnifiedHostComposable.kt:86)");
                    }
                    CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides(r4), ComposableLambda3.rememberComposableLambda(1487362984, true, new AnonymousClass1(navHostControllerRememberNavController, context2), composer3, 54), composer3, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedHostDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object[] objArr = new Object[i4];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedHostComposable3.GoldUnifiedHostComposable$lambda$7$lambda$6();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[i4];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedHostComposable3.GoldUnifiedHostComposable$lambda$11$lambda$10();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Object objM6426rememberSaveable = RememberSaveable.m6426rememberSaveable(objArr2, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue5, composerStartRestartGroup, 3072, 6);
            Composer composer3 = composerStartRestartGroup;
            final SnapshotState snapshotState3 = (SnapshotState) objM6426rememberSaveable;
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            composer3.startReplaceGroup(-1746271574);
            boolean zChanged = composer3.changed(snapshotState2) | composer3.changedInstance(goldUnifiedHostDuxo4) | composer3.changed(snapshotState3);
            Object objRememberedValue6 = composer3.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldUnifiedHostComposable3.GoldUnifiedHostComposable$lambda$17$lambda$16(snapshotState2, goldUnifiedHostDuxo4, snapshotState3, (ActivityResult) obj);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue6);
            }
            composer3.endReplaceGroup();
            final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue6, composer3, i4);
            final android.content.Context context4 = (android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Event<GoldUnifiedHostEvent> eventGoldUnifiedHostComposable$lambda$5 = GoldUnifiedHostComposable$lambda$5(snapshotState4CollectAsStateWithLifecycle);
            if (eventGoldUnifiedHostComposable$lambda$5 == null || !(eventGoldUnifiedHostComposable$lambda$5.getData() instanceof GoldUnifiedHostEvent) || (eventConsumerInvoke = eventGoldUnifiedHostComposable$lambda$5.getGetEventConsumer().invoke()) == null) {
                composer2 = composer3;
                goldUnifiedHostDuxo5 = goldUnifiedHostDuxo4;
            } else {
                goldUnifiedHostDuxo5 = goldUnifiedHostDuxo4;
                composer2 = composer3;
                eventConsumerInvoke.consume(eventGoldUnifiedHostComposable$lambda$5, new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                        m15149invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15149invoke(Object it) throws Resources.NotFoundException {
                        Object objM28550constructorimpl;
                        Action action;
                        Action actionM28550constructorimpl;
                        Intrinsics.checkNotNullParameter(it, "it");
                        GoldUnifiedHostEvent goldUnifiedHostEvent = (GoldUnifiedHostEvent) eventGoldUnifiedHostComposable$lambda$5.getData();
                        if (goldUnifiedHostEvent instanceof GoldUnifiedHostEvent.DismissAll) {
                            GoldUnifiedHostEvent.DismissAll dismissAll = (GoldUnifiedHostEvent.DismissAll) goldUnifiedHostEvent;
                            if (dismissAll.isSuccess()) {
                                onShowSurvey.invoke();
                            }
                            GoldUnifiedNavController.finishWithComplete(navHostControllerRememberNavController, dismissAll.isSuccess());
                            return;
                        }
                        if (Intrinsics.areEqual(goldUnifiedHostEvent, GoldUnifiedHostEvent.DismissScreen.INSTANCE)) {
                            GoldUnifiedNavController.navigateBackOrExit(navHostControllerRememberNavController, new GoldUnifiedHostComposable5(goldUnifiedHostDuxo5));
                            return;
                        }
                        if (goldUnifiedHostEvent instanceof GoldUnifiedHostEvent.OpenDeeplink) {
                            GoldUnifiedHostEvent.OpenDeeplink openDeeplink = (GoldUnifiedHostEvent.OpenDeeplink) goldUnifiedHostEvent;
                            int i8 = GoldUnifiedHostComposable3.WhenMappings.$EnumSwitchMapping$0[openDeeplink.getPresentationType().ordinal()];
                            if (i8 == 1) {
                                onShowSurvey.invoke();
                                uriHandler.openUri(openDeeplink.getDeeplinkUri());
                                GoldUnifiedNavController.finishWithComplete(navHostControllerRememberNavController, true);
                                return;
                            }
                            if (i8 == 2) {
                                SnapshotState snapshotState4 = snapshotState2;
                                String str = openDeeplink.getGenericArgs().get("result_ok_action");
                                if (str != null) {
                                    try {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        Json.Companion companion3 = Json.INSTANCE;
                                        SerializersModule serializersModule = companion3.getSerializersModule();
                                        KType kTypeTypeOf = Reflection.typeOf(ActionDto.class);
                                        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                                        objM28550constructorimpl = Result.m28550constructorimpl(((ActionDto) companion3.decodeFromString(SerializersKt.serializer(serializersModule, kTypeTypeOf), str)).toProto());
                                    } catch (Throwable th) {
                                        Result.Companion companion4 = Result.INSTANCE;
                                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                    }
                                    if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                        objM28550constructorimpl = null;
                                    }
                                    action = (Action) objM28550constructorimpl;
                                } else {
                                    action = null;
                                }
                                snapshotState4.setValue(action);
                                SnapshotState snapshotState5 = snapshotState3;
                                String str2 = openDeeplink.getGenericArgs().get("result_cancel_action");
                                if (str2 != null) {
                                    try {
                                        Result.Companion companion5 = Result.INSTANCE;
                                        Json.Companion companion6 = Json.INSTANCE;
                                        SerializersModule serializersModule2 = companion6.getSerializersModule();
                                        KType kTypeTypeOf2 = Reflection.typeOf(ActionDto.class);
                                        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                                        actionM28550constructorimpl = Result.m28550constructorimpl(((ActionDto) companion6.decodeFromString(SerializersKt.serializer(serializersModule2, kTypeTypeOf2), str2)).toProto());
                                    } catch (Throwable th2) {
                                        Result.Companion companion7 = Result.INSTANCE;
                                        actionM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    action = Result.m28555isFailureimpl(actionM28550constructorimpl) ? null : actionM28550constructorimpl;
                                }
                                snapshotState5.setValue(action);
                                GoldUnifiedHostComposable3.GoldUnifiedHostComposable$handleActivityResultDeeplink(activityResultRegistry8RememberLauncherForActivityResult, uriHandler, navigator, context4, openDeeplink.getDeeplinkUri());
                                return;
                            }
                            uriHandler.openUri(openDeeplink.getDeeplinkUri());
                            return;
                        }
                        if (goldUnifiedHostEvent instanceof GoldUnifiedHostEvent.PushScreen) {
                            GoldUnifiedNavController.pushScreen(navHostControllerRememberNavController, (GoldUnifiedHostEvent.PushScreen) goldUnifiedHostEvent);
                        } else if (goldUnifiedHostEvent instanceof GoldUnifiedHostEvent.PresentDialog) {
                            Navigator.DefaultImpls.createDialogFragment$default(navigator, ((GoldUnifiedHostEvent.PresentDialog) goldUnifiedHostEvent).getDialogFragmentKey(), null, 2, null).show(BaseContexts.requireActivityBaseContext(context4).getSupportFragmentManager(), "gold_unified_flow_dialog");
                        } else {
                            if (!(goldUnifiedHostEvent instanceof GoldUnifiedHostEvent.PresentRouter)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            GoldUnifiedNavController.presentRouter(navHostControllerRememberNavController, (GoldUnifiedHostEvent.PresentRouter) goldUnifiedHostEvent);
                        }
                    }
                });
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            goldUnifiedHostDuxo2 = goldUnifiedHostDuxo5;
        }
        final Context context5 = context2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedHostComposable3.GoldUnifiedHostComposable$lambda$29(goldUnifiedHostDuxo2, context5, onShowSurvey, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final NavBackStackEntry GoldUnifiedHostComposable$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Action GoldUnifiedHostComposable$lambda$12(SnapshotState<Action> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination GoldUnifiedHostComposable$lambda$2(SnapshotState<NavDestination> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Event<GoldUnifiedHostEvent> GoldUnifiedHostComposable$lambda$5(SnapshotState4<Event<GoldUnifiedHostEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Action GoldUnifiedHostComposable$lambda$8(SnapshotState<Action> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GoldUnifiedHostComposable$lambda$7$lambda$6() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GoldUnifiedHostComposable$lambda$11$lambda$10() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedHostComposable$lambda$17$lambda$16(SnapshotState snapshotState, GoldUnifiedHostDuxo goldUnifiedHostDuxo, SnapshotState snapshotState2, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Action actionGoldUnifiedHostComposable$lambda$8 = GoldUnifiedHostComposable$lambda$8(snapshotState);
            if (actionGoldUnifiedHostComposable$lambda$8 != null) {
                goldUnifiedHostDuxo.sendAction(actionGoldUnifiedHostComposable$lambda$8);
            }
        } else {
            Action actionGoldUnifiedHostComposable$lambda$12 = GoldUnifiedHostComposable$lambda$12(snapshotState2);
            if (actionGoldUnifiedHostComposable$lambda$12 != null) {
                goldUnifiedHostDuxo.sendAction(actionGoldUnifiedHostComposable$lambda$12);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Intent GoldUnifiedHostComposable$handleTransferDeeplink(Navigator navigator, android.content.Context context, Uri uri) {
        MAXTransferContext.EntryPoint entryPointValueOf;
        String queryParameter = uri.getQueryParameter("entry_point");
        String queryParameter2 = uri.getQueryParameter("amount");
        BigDecimal bigDecimal = queryParameter2 != null ? new BigDecimal(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("frequency");
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = queryParameter3 != null ? (ApiCreateTransferRequest2) ApiCreateTransferRequest2.INSTANCE.fromServerValue(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("transfer_direction");
        TransferDirectionV2 transferDirectionV2FromServerValue = queryParameter4 != null ? TransferDirectionV2.INSTANCE.fromServerValue(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("from_account_id");
        String queryParameter6 = uri.getQueryParameter("to_account_id");
        String queryParameter7 = uri.getQueryParameter("from_account_type");
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = queryParameter7 != null ? (TransferFundsDeepLinkAccountType) TransferFundsDeepLinkAccountType.INSTANCE.fromServerValue(queryParameter7) : null;
        String queryParameter8 = uri.getQueryParameter("to_account_type");
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2 = queryParameter8 != null ? (TransferFundsDeepLinkAccountType) TransferFundsDeepLinkAccountType.INSTANCE.fromServerValue(queryParameter8) : null;
        String queryParameter9 = uri.getQueryParameter("promotion_name");
        String queryParameter10 = uri.getQueryParameter("promotion_type");
        if (queryParameter != null) {
            try {
                String upperCase = queryParameter.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                entryPointValueOf = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        } else {
            entryPointValueOf = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        return Navigator.DefaultImpls.createIntent$default(navigator, context, new TransferFundsDeepLink(bigDecimal, apiCreateTransferRequest2, queryParameter5, queryParameter6, transferFundsDeepLinkAccountType, transferFundsDeepLinkAccountType2, null, transferDirectionV2FromServerValue, null, null, queryParameter9, queryParameter10, entryPointValueOf, null, null, 9024, null), null, false, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Intent GoldUnifiedHostComposable$handleGoldLearnAndEarnDeeplink(Navigator navigator, android.content.Context context, Uri uri) {
        FragmentKey educationLessonFragmentKeys2;
        List listSplit$default;
        String queryParameter = uri.getQueryParameter("contentId");
        String queryParameter2 = uri.getQueryParameter("version");
        Integer num = null;
        Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("source");
        if (queryParameter3 == null) {
            queryParameter3 = "unknown";
        }
        if (queryParameter == null || intOrNull == null || intOrNull.intValue() != 3) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Education lesson version " + intOrNull + " is not supported"), false, null, 4, null);
            return null;
        }
        EducationLesson.LessonTemplateType[] lessonTemplateTypeArrValues = EducationLesson.LessonTemplateType.values();
        ArrayList arrayList = new ArrayList(lessonTemplateTypeArrValues.length);
        for (EducationLesson.LessonTemplateType lessonTemplateType : lessonTemplateTypeArrValues) {
            arrayList.add(Integer.valueOf(lessonTemplateType.getServerValue()));
        }
        String queryParameter4 = uri.getQueryParameter("templates");
        if (queryParameter4 != null && (listSplit$default = StringsKt.split$default((CharSequence) queryParameter4, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((String) it.next()).toString());
                if (intOrNull2 != null) {
                    arrayList2.add(intOrNull2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (arrayList.contains(Integer.valueOf(((Number) next).intValue()))) {
                    num = next;
                    break;
                }
            }
            num = num;
        }
        int serverValue = EducationLesson.LessonTemplateType.CARD_STACK.getServerValue();
        if (num != null && num.intValue() == serverValue) {
            educationLessonFragmentKeys2 = new EducationLessonFragmentKeys(queryParameter, queryParameter3);
        } else {
            educationLessonFragmentKeys2 = new EducationLessonFragmentKeys2(queryParameter, queryParameter3);
        }
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, educationLessonFragmentKeys2, false, false, false, null, false, true, false, false, false, null, false, 8052, null);
    }

    public static final void Loading(Context context, Composer composer, final int i, final int i2) {
        final Context context2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270512624);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            context2 = context;
        } else if ((i & 6) == 0) {
            context2 = context;
            i3 = (composerStartRestartGroup.changedInstance(context2) ? 4 : 2) | i;
        } else {
            context2 = context;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Context context3 = i4 != 0 ? null : context2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270512624, i3, -1, "com.robinhood.android.gold.upgrade.unified.Loading (GoldUnifiedHostComposable.kt:277)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(null, null, LOADING_SCREEN_IDENTIFIER, null, 11, null), null, context3, null, null, 53, null)), null, null, null, null, 0, 0L, 0L, null, GoldUnifiedHostComposable.INSTANCE.m15145getLambda$1869630305$feature_gold_upgrade_externalRelease(), composerStartRestartGroup, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            context2 = context3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedHostComposable3.Loading$lambda$30(context2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UpdateApp(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1562292697);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562292697, i, -1, "com.robinhood.android.gold.upgrade.unified.UpdateApp (GoldUnifiedHostComposable.kt:296)");
            }
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GoldUnifiedHostComposable7(navigator, context, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedHostComposable3.UpdateApp$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
