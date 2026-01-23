package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import android.app.Activity;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.view.compose.BackHandler;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureContentState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureEvent;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureCheckboxContentSection4;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureCheckboxContentSectionState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader5;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureLoadingContent;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureMarkdownContentSection3;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureSubtitleContent;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u008a\u0084\u0002"}, m3636d2 = {"CryptoUpgradeDisclosureComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo;", "onUpgradeSucceeded", "Lkotlin/Function0;", "onUpgradePendingResidencyDocument", "Lkotlin/Function1;", "Ljava/util/UUID;", "onUpgradeUnderReview", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureComposable$lambda$13(Modifier modifier, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Function0 function0, Function1 function1, Function0 function02, int i, int i2, Composer composer, int i3) {
        CryptoUpgradeDisclosureComposable(modifier, cryptoUpgradeDisclosureDuxo, function0, function1, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureComposable$lambda$3$lambda$2(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoUpgradeDisclosureComposable(Modifier modifier, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Function0<Unit> function0, Function1<? super UUID, Unit> function1, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo2;
        Function0<Unit> function03;
        Function1<? super UUID, Unit> function12;
        int i4;
        Function0<Unit> function04;
        final Modifier modifier3;
        int i5;
        Function1<? super UUID, Unit> function13;
        final Function0<Unit> function05;
        final Function1<? super UUID, Unit> function14;
        final Function0<Unit> function06;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        final Event<CryptoUpgradeDisclosureEvent> eventCryptoUpgradeDisclosureComposable$lambda$7;
        Continuation continuation;
        Function0<Unit> function07;
        Function1<? super UUID, Unit> function15;
        Function0<Unit> function08;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo3;
        final Function0<Unit> function09;
        final Function1<? super UUID, Unit> function16;
        final Function0<Unit> function010;
        EventConsumer<CryptoUpgradeDisclosureEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2016207900);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoUpgradeDisclosureDuxo2 = cryptoUpgradeDisclosureDuxo;
                int i7 = composerStartRestartGroup.changedInstance(cryptoUpgradeDisclosureDuxo2) ? 32 : 16;
                i3 |= i7;
            } else {
                cryptoUpgradeDisclosureDuxo2 = cryptoUpgradeDisclosureDuxo;
            }
            i3 |= i7;
        } else {
            cryptoUpgradeDisclosureDuxo2 = cryptoUpgradeDisclosureDuxo;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    cryptoUpgradeDisclosureDuxo3 = cryptoUpgradeDisclosureDuxo2;
                    function16 = function12;
                    function010 = function04;
                    function09 = function03;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                            i5 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoUpgradeDisclosureDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            cryptoUpgradeDisclosureDuxo2 = (CryptoUpgradeDisclosureDuxo) baseDuxo;
                            i3 &= -113;
                        } else {
                            i5 = 0;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue6;
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$3$lambda$2((UUID) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function13 = (Function1) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function13 = function1;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function14 = function13;
                            function05 = (Function0) objRememberedValue8;
                        } else {
                            function05 = function02;
                            function14 = function13;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        modifier3 = modifier2;
                        function14 = function12;
                        function05 = function04;
                        i5 = 0;
                    }
                    function06 = function03;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016207900, i3, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable (CryptoUpgradeDisclosureComposable.kt:58)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoUpgradeDisclosureDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoUpgradeDisclosureDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, 1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                    final OnBackPressedDispatcher onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                    final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    eventCryptoUpgradeDisclosureComposable$lambda$7 = CryptoUpgradeDisclosureComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoUpgradeDisclosureComposable$lambda$7 == null && (eventCryptoUpgradeDisclosureComposable$lambda$7.getData() instanceof CryptoUpgradeDisclosureEvent) && (eventConsumerInvoke = eventCryptoUpgradeDisclosureComposable$lambda$7.getGetEventConsumer().invoke()) != null) {
                        continuation = null;
                        function07 = function06;
                        function15 = function14;
                        function08 = function05;
                        eventConsumerInvoke.consume(eventCryptoUpgradeDisclosureComposable$lambda$7, new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                m13145invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13145invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoUpgradeDisclosureEvent cryptoUpgradeDisclosureEvent = (CryptoUpgradeDisclosureEvent) eventCryptoUpgradeDisclosureComposable$lambda$7.getData();
                                if (cryptoUpgradeDisclosureEvent instanceof CryptoUpgradeDisclosureEvent.NavigateBack) {
                                    OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                                    if (onBackPressedDispatcher2 != null) {
                                        onBackPressedDispatcher2.onBackPressed();
                                        return;
                                    }
                                    return;
                                }
                                if (cryptoUpgradeDisclosureEvent instanceof CryptoUpgradeDisclosureEvent.ShowError) {
                                    ActivityErrorHandler.Companion companion2 = ActivityErrorHandler.INSTANCE;
                                    Activity activity2 = activity;
                                    if (activity2 != null) {
                                        ActivityErrorHandler.Companion.handle$default(companion2, activity2, ((CryptoUpgradeDisclosureEvent.ShowError) cryptoUpgradeDisclosureEvent).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                if (cryptoUpgradeDisclosureEvent instanceof CryptoUpgradeDisclosureEvent.OnUpgradeSucceeded) {
                                    function06.invoke();
                                } else if (cryptoUpgradeDisclosureEvent instanceof CryptoUpgradeDisclosureEvent.OnUpgradePendingResidencyDocument) {
                                    function14.invoke(((CryptoUpgradeDisclosureEvent.OnUpgradePendingResidencyDocument) cryptoUpgradeDisclosureEvent).getDocumentId());
                                } else {
                                    if (!(cryptoUpgradeDisclosureEvent instanceof CryptoUpgradeDisclosureEvent.OnUpgradeUnderReview)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    function05.invoke();
                                }
                            }
                        });
                    } else {
                        continuation = null;
                        function07 = function06;
                        function15 = function14;
                        function08 = function05;
                    }
                    boolean z = CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureHeaderState().getCurrentDisclosureIndex() <= 0 ? 1 : i5;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoUpgradeDisclosureDuxo2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$10$lambda$9(cryptoUpgradeDisclosureDuxo2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(z, (Function0) objRememberedValue2, composerStartRestartGroup, i5, i5);
                    Integer numValueOf = Integer.valueOf(CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureHeaderState().getCurrentDisclosureIndex());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new CryptoUpgradeDisclosureComposable2(scrollStateRememberScrollState, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i5);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(cryptoUpgradeDisclosureDuxo2);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new CryptoUpgradeDisclosureComposable3(scrollStateRememberScrollState, cryptoUpgradeDisclosureDuxo2, snapshotState4CollectAsStateWithLifecycle, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i5);
                    Composer composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, continuation), ComposableLambda3.rememberComposableLambda(724584096, true, new C135878(cryptoUpgradeDisclosureDuxo2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-879419777, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt.CryptoUpgradeDisclosureComposable.9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            ImmutableList<UUID> agreementIds;
                            CommaSeparatedList commaSeparatedList;
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-879419777, i10, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous> (CryptoUpgradeDisclosureComposable.kt:208)");
                            }
                            CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureBottomBarState();
                            if (cryptoUpgradeDisclosureBottomBarState != null) {
                                SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo4 = cryptoUpgradeDisclosureDuxo2;
                                CoroutineScope coroutineScope2 = coroutineScope;
                                ScrollState scrollState = scrollStateRememberScrollState;
                                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                Screen screen = ((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                Screen screenCopy$default = null;
                                string = null;
                                string = null;
                                String string2 = null;
                                if (screen != null) {
                                    CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4).getCryptoUpgradeDisclosureContentState();
                                    if (cryptoUpgradeDisclosureContentState != null && (agreementIds = cryptoUpgradeDisclosureContentState.getAgreementIds()) != null && (commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(agreementIds)) != null) {
                                        string2 = commaSeparatedList.toString();
                                    }
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    screenCopy$default = Screen.copy$default(screen, null, string2, null, null, 13, null);
                                }
                                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screenCopy$default, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1289792120, true, new CryptoUpgradeDisclosureComposable4(cryptoUpgradeDisclosureBottomBarState, cryptoUpgradeDisclosureDuxo4, coroutineScope2, scrollState), composer3, 54), composer3, 48);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1547734923, true, new C1358410(scrollStateRememberScrollState, snapshotState4CollectAsStateWithLifecycle, cryptoUpgradeDisclosureDuxo2), composerStartRestartGroup, 54), composer2, 805306800, 504);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoUpgradeDisclosureDuxo3 = cryptoUpgradeDisclosureDuxo2;
                    function09 = function07;
                    function16 = function15;
                    function010 = function08;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$13(modifier3, cryptoUpgradeDisclosureDuxo3, function09, function16, function010, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function04 = function02;
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    function06 = function03;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoUpgradeDisclosureDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoUpgradeDisclosureDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, 1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                    if (current22 == null) {
                    }
                    final Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    eventCryptoUpgradeDisclosureComposable$lambda$7 = CryptoUpgradeDisclosureComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoUpgradeDisclosureComposable$lambda$7 == null) {
                        continuation = null;
                        function07 = function06;
                        function15 = function14;
                        function08 = function05;
                        if (CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureHeaderState().getCurrentDisclosureIndex() <= 0) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(cryptoUpgradeDisclosureDuxo2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$10$lambda$9(cryptoUpgradeDisclosureDuxo2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BackHandler.BackHandler(z, (Function0) objRememberedValue2, composerStartRestartGroup, i5, i5);
                            Integer numValueOf2 = Integer.valueOf(CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureHeaderState().getCurrentDisclosureIndex());
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = new CryptoUpgradeDisclosureComposable2(scrollStateRememberScrollState, continuation);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i5);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(cryptoUpgradeDisclosureDuxo2);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue4 = new CryptoUpgradeDisclosureComposable3(scrollStateRememberScrollState, cryptoUpgradeDisclosureDuxo2, snapshotState4CollectAsStateWithLifecycle, continuation);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i5);
                                    Composer composer22 = composerStartRestartGroup;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, continuation), ComposableLambda3.rememberComposableLambda(724584096, true, new C135878(cryptoUpgradeDisclosureDuxo2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-879419777, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt.CryptoUpgradeDisclosureComposable.9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i10) {
                                            ImmutableList<UUID> agreementIds;
                                            CommaSeparatedList commaSeparatedList;
                                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-879419777, i10, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous> (CryptoUpgradeDisclosureComposable.kt:208)");
                                            }
                                            CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getCryptoUpgradeDisclosureBottomBarState();
                                            if (cryptoUpgradeDisclosureBottomBarState != null) {
                                                SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo4 = cryptoUpgradeDisclosureDuxo2;
                                                CoroutineScope coroutineScope22 = coroutineScope2;
                                                ScrollState scrollState = scrollStateRememberScrollState;
                                                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                                Screen screen = ((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                                Screen screenCopy$default = null;
                                                string2 = null;
                                                string2 = null;
                                                String string2 = null;
                                                if (screen != null) {
                                                    CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(snapshotState4).getCryptoUpgradeDisclosureContentState();
                                                    if (cryptoUpgradeDisclosureContentState != null && (agreementIds = cryptoUpgradeDisclosureContentState.getAgreementIds()) != null && (commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(agreementIds)) != null) {
                                                        string2 = commaSeparatedList.toString();
                                                    }
                                                    if (string2 == null) {
                                                        string2 = "";
                                                    }
                                                    screenCopy$default = Screen.copy$default(screen, null, string2, null, null, 13, null);
                                                }
                                                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screenCopy$default, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1289792120, true, new CryptoUpgradeDisclosureComposable4(cryptoUpgradeDisclosureBottomBarState, cryptoUpgradeDisclosureDuxo4, coroutineScope22, scrollState), composer3, 54), composer3, 48);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1547734923, true, new C1358410(scrollStateRememberScrollState, snapshotState4CollectAsStateWithLifecycle, cryptoUpgradeDisclosureDuxo2), composerStartRestartGroup, 54), composer22, 805306800, 504);
                                    composerStartRestartGroup = composer22;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    cryptoUpgradeDisclosureDuxo3 = cryptoUpgradeDisclosureDuxo2;
                                    function09 = function07;
                                    function16 = function15;
                                    function010 = function08;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function04 = function02;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoUpgradeDisclosureViewState CryptoUpgradeDisclosureComposable$lambda$6(SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoUpgradeDisclosureEvent> CryptoUpgradeDisclosureComposable$lambda$7(SnapshotState4<Event<CryptoUpgradeDisclosureEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureComposable$lambda$10$lambda$9(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo) {
        cryptoUpgradeDisclosureDuxo.onNavButtonClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoUpgradeDisclosureComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$8 */
    static final class C135878 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoUpgradeDisclosureDuxo $duxo;
        final /* synthetic */ SnapshotState4<CryptoUpgradeDisclosureViewState> $viewState$delegate;

        C135878(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4) {
            this.$duxo = cryptoUpgradeDisclosureDuxo;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(724584096, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous> (CryptoUpgradeDisclosureComposable.kt:113)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(this.$viewState$delegate).getCryptoUpgradeDisclosureHeaderState();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$8$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoUpgradeDisclosureComposable.C135878.invoke$lambda$1$lambda$0(cryptoUpgradeDisclosureDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoUpgradeDisclosureHeader5.CryptoUpgradeDisclosureHeader(cryptoUpgradeDisclosureHeaderState, (Function0) objRememberedValue, modifierFillMaxWidth$default, composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo) {
            cryptoUpgradeDisclosureDuxo.onNavButtonClicked();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoUpgradeDisclosureComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10 */
    static final class C1358410 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CryptoUpgradeDisclosureDuxo $duxo;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState4<CryptoUpgradeDisclosureViewState> $viewState$delegate;

        C1358410(ScrollState scrollState, SnapshotState4<CryptoUpgradeDisclosureViewState> snapshotState4, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo) {
            this.$scrollState = scrollState;
            this.$viewState$delegate = snapshotState4;
            this.$duxo = cryptoUpgradeDisclosureDuxo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$3$lambda$2$lambda$0(int i, int i2) {
            return i * i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$3$lambda$2$lambda$1(int i, int i2) {
            return (-i) * i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1547734923, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous> (CryptoUpgradeDisclosureComposable.kt:120)");
            }
            final CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = CryptoUpgradeDisclosureComposable.CryptoUpgradeDisclosureComposable$lambda$6(this.$viewState$delegate).getCryptoUpgradeDisclosureContentState();
            if (cryptoUpgradeDisclosureContentState == null) {
                composer.startReplaceGroup(-2096978191);
                CryptoUpgradeDisclosureLoadingContent.CryptoUpgradeDisclosureLoadingContent(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.padding(ScrollKt.verticalScroll$default(Modifier.INSTANCE, this.$scrollState, false, null, false, 14, null), paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2096471217);
                Integer numValueOf = Integer.valueOf(cryptoUpgradeDisclosureContentState.getIndex());
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoUpgradeDisclosureComposable.C1358410.invoke$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                final ScrollState scrollState = this.$scrollState;
                final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = this.$duxo;
                AnimatedContentKt.AnimatedContent(numValueOf, null, (Function1) objRememberedValue, null, "content_transition", null, ComposableLambda3.rememberComposableLambda(848082787, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt.CryptoUpgradeDisclosureComposable.10.2

                    /* compiled from: CryptoUpgradeDisclosureComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ CryptoUpgradeDisclosureContentState $cryptoUpgradeDisclosureContentState;
                        final /* synthetic */ CryptoUpgradeDisclosureDuxo $duxo;
                        final /* synthetic */ PaddingValues $paddingValues;
                        final /* synthetic */ ScrollState $scrollState;

                        AnonymousClass1(ScrollState scrollState, PaddingValues paddingValues, CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo) {
                            this.$scrollState = scrollState;
                            this.$paddingValues = paddingValues;
                            this.$cryptoUpgradeDisclosureContentState = cryptoUpgradeDisclosureContentState;
                            this.$duxo = cryptoUpgradeDisclosureDuxo;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1815836840, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous>.<anonymous>.<anonymous> (CryptoUpgradeDisclosureComposable.kt:157)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(ScrollKt.verticalScroll$default(ModifiersKt.autoLogEvents$default(companion, (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), this.$scrollState, false, null, false, 14, null), this.$paddingValues);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                            CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = this.$cryptoUpgradeDisclosureContentState;
                            final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = this.$duxo;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
                            GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContent = cryptoUpgradeDisclosureContentState.getSubtitleContent();
                            composer.startReplaceGroup(166322894);
                            if (subtitleContent != null) {
                                CryptoUpgradeDisclosureSubtitleContent.CryptoUpgradeDisclosureSubtitleContent(subtitleContent, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), composer, 0, 0);
                            }
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(166341865);
                            int i3 = 0;
                            for (CryptoUpgradeDisclosureContentState.Content content : cryptoUpgradeDisclosureContentState.getContents()) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final CryptoUpgradeDisclosureContentState.Content content2 = content;
                                if (content2 instanceof CryptoUpgradeDisclosureContentState.Content.Checkbox) {
                                    composer.startReplaceGroup(1479049602);
                                    CryptoUpgradeDisclosureCheckboxContentSectionState state = ((CryptoUpgradeDisclosureContentState.Content.Checkbox) content2).getState();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(cryptoUpgradeDisclosureDuxo) | composer.changed(content2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoUpgradeDisclosureComposable.C1358410.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(cryptoUpgradeDisclosureDuxo, content2, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoUpgradeDisclosureCheckboxContentSection4.CryptoUpgradeDisclosureCheckboxContentSection(state, (Function1) objRememberedValue, null, composer, 0, 4);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!(content2 instanceof CryptoUpgradeDisclosureContentState.Content.Markdown)) {
                                        composer.startReplaceGroup(1479045005);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(1479076432);
                                    CryptoUpgradeDisclosureMarkdownContentSection3.CryptoUpgradeDisclosureMarkdownContentSection(((CryptoUpgradeDisclosureContentState.Content.Markdown) content2).getState(), null, composer, 0, 2);
                                    composer.endReplaceGroup();
                                }
                                composer.startReplaceGroup(166383433);
                                if (i3 != CollectionsKt.getLastIndex(cryptoUpgradeDisclosureContentState.getContents())) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                                }
                                composer.endReplaceGroup();
                                i3 = i4;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CryptoUpgradeDisclosureContentState.Content content, boolean z) {
                            CryptoUpgradeDisclosureContentState.Content.Checkbox checkbox = (CryptoUpgradeDisclosureContentState.Content.Checkbox) content;
                            cryptoUpgradeDisclosureDuxo.onCheckboxChanged(checkbox.getState().getAgreementId(), checkbox.getState().getCheckboxContentSection().getId(), z);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                        invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, int i2, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(848082787, i3, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous>.<anonymous> (CryptoUpgradeDisclosureComposable.kt:144)");
                        }
                        CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState2 = cryptoUpgradeDisclosureContentState;
                        if (cryptoUpgradeDisclosureContentState2.getIndex() != i2) {
                            cryptoUpgradeDisclosureContentState2 = null;
                        }
                        if (cryptoUpgradeDisclosureContentState2 != null) {
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Screen screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen != null ? Screen.copy$default(screen, null, CommaSeparatedList2.toCommaSeparatedList(cryptoUpgradeDisclosureContentState2.getAgreementIds()).toString(), null, null, 13, null) : null, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1815836840, true, new AnonymousClass1(scrollState, paddingValues, cryptoUpgradeDisclosureContentState2, cryptoUpgradeDisclosureDuxo), composer2, 54), composer2, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1597824, 42);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final ContentTransform invoke$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            final int i = ((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue() ? 1 : -1;
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(CryptoUpgradeDisclosureComposable.C1358410.invoke$lambda$3$lambda$2$lambda$0(i, ((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$10$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(CryptoUpgradeDisclosureComposable.C1358410.invoke$lambda$3$lambda$2$lambda$1(i, ((Integer) obj).intValue()));
                }
            }, 1, null));
        }
    }
}
