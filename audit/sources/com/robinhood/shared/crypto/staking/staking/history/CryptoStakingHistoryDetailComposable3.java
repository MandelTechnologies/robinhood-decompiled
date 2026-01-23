package com.robinhood.shared.crypto.staking.staking.history;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAppBarAction;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailAction;
import com.robinhood.models.serverdriven.experimental.api.NavigationMenuTextButton;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailEvent;
import com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailViewState;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoStakingHistoryDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\u0012\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 X\u008a\u008e\u0002²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 X\u008a\u008e\u0002"}, m3636d2 = {"TestTagHistoryDetailLoadingTag", "", CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailContentTag, CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailMenuTag, "CryptoStakingHistoryDetailComposable", "", "onBackButtonClicked", "Lkotlin/Function0;", "handleError", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "HistoryDetailContent", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/HistoryDetailAction;", "state", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Content;", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState$Content;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "eventFlow", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailEvent;", "modal", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "bottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingHistoryDetailComposable3 {
    public static final String TestTagHistoryDetailContentTag = "TestTagHistoryDetailContentTag";
    public static final String TestTagHistoryDetailLoadingTag = "TestTagLoadingContentTag";
    public static final String TestTagHistoryDetailMenuTag = "TestTagHistoryDetailMenuTag";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoStakingHistoryDetailComposable$lambda$16$lambda$12$lambda$11 */
    public static final boolean m2773x9916036d(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingHistoryDetailComposable$lambda$18(Function0 function0, Function1 function1, Modifier modifier, CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingHistoryDetailComposable(function0, function1, modifier, cryptoStakingHistoryDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryDetailContent$lambda$20(SduiActionHandler sduiActionHandler, CryptoStakingHistoryDetailViewState.Content content, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistoryDetailContent(sduiActionHandler, content, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$19(int i, Composer composer, int i2) {
        LoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingHistoryDetailComposable(final Function0<Unit> onBackButtonClicked, final Function1<? super Throwable, Unit> handleError, Modifier modifier, CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo2;
        int i4;
        final CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo3;
        final Modifier modifier3;
        Event<CryptoStakingHistoryDetailEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object obj;
        SnapshotState snapshotState;
        SnapshotState snapshotState2;
        CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo4;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        CryptoStakingContext cryptoStakingContext;
        boolean zChangedInstance;
        Object objRememberedValue5;
        GenericAlertContent<HistoryDetailAction> genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3;
        final SduiActionHandler sduiActionHandler;
        final GenericAlertContent<HistoryDetailAction> genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6;
        final Event<CryptoStakingHistoryDetailEvent> eventCryptoStakingHistoryDetailComposable$lambda$1;
        final CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo5;
        EventConsumer<CryptoStakingHistoryDetailEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackButtonClicked, "onBackButtonClicked");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1083402890);
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
            i3 |= composerStartRestartGroup.changedInstance(handleError) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoStakingHistoryDetailDuxo2 = cryptoStakingHistoryDetailDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoStakingHistoryDetailDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoStakingHistoryDetailDuxo2 = cryptoStakingHistoryDetailDuxo;
                }
                i3 |= i6;
            } else {
                cryptoStakingHistoryDetailDuxo2 = cryptoStakingHistoryDetailDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingHistoryDetailDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoStakingHistoryDetailDuxo3 = (CryptoStakingHistoryDetailDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                    } else {
                        i4 = i3;
                        cryptoStakingHistoryDetailDuxo3 = cryptoStakingHistoryDetailDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoStakingHistoryDetailDuxo3 = cryptoStakingHistoryDetailDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083402890, i4, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable (CryptoStakingHistoryDetailComposable.kt:61)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingHistoryDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<CryptoStakingHistoryDetailEvent>> eventFlow = cryptoStakingHistoryDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingHistoryDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingHistoryDetailEvent) {
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
                Event<CryptoStakingHistoryDetailEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoStakingHistoryDetailEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(coroutineContextImpl6, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                    obj = null;
                    SduiActionHandler sduiActionHandler2 = new SduiActionHandler() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$actionHandler$1$1

                        /* compiled from: CryptoStakingHistoryDetailComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$actionHandler$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                                try {
                                    iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(HistoryDetailAction action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            if (action instanceof HistoryDetailAction.CancelYieldOrder) {
                                cryptoStakingHistoryDetailDuxo3.cancelOrder(StringsKt.toUuid(((HistoryDetailAction.CancelYieldOrder) action).getValue2().getOrder_uuid()));
                                snapshotState3.setValue(null);
                                snapshotState4.setValue(null);
                            } else if (action instanceof HistoryDetailAction.Deeplink) {
                                Uri uri = Uri.parse(((HistoryDetailAction.Deeplink) action).getValue2().getUri());
                                if (navigator.isDeepLinkSupported(uri)) {
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, Boolean.FALSE, null, false, null, 56, null);
                                } else {
                                    WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
                                }
                            } else if (!(action instanceof HistoryDetailAction.Dismiss)) {
                                if (!(action instanceof HistoryDetailAction.InfoAlert)) {
                                    if (action instanceof HistoryDetailAction.CopyToClipboard) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(clipboardUtil, action, null), 3, null);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    snapshotState3.setValue(null);
                                    snapshotState4.setValue(null);
                                    HistoryDetailAction.InfoAlert infoAlert = (HistoryDetailAction.InfoAlert) action;
                                    int i7 = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                                    if (i7 == 1) {
                                        snapshotState3.setValue(infoAlert.getValue2().getAlert());
                                    } else {
                                        if (i7 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        snapshotState4.setValue(infoAlert.getValue2().getAlert());
                                    }
                                }
                            } else {
                                snapshotState3.setValue(null);
                                snapshotState4.setValue(null);
                            }
                            return true;
                        }

                        /* compiled from: CryptoStakingHistoryDetailComposable.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$actionHandler$1$1$1", m3645f = "CryptoStakingHistoryDetailComposable.kt", m3646l = {107}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$actionHandler$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ HistoryDetailAction $action;
                            final /* synthetic */ ClipboardUtil $clipboardUtil;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(ClipboardUtil clipboardUtil, HistoryDetailAction historyDetailAction, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$clipboardUtil = clipboardUtil;
                                this.$action = historyDetailAction;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$clipboardUtil, this.$action, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ClipboardUtil clipboardUtil = this.$clipboardUtil;
                                    String value = ((HistoryDetailAction.CopyToClipboard) this.$action).getValue2().getValue();
                                    this.label = 1;
                                    if (clipboardUtil.copyToClipboardWithHapticFeedback(value, true, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    snapshotState = snapshotState3;
                    snapshotState2 = snapshotState4;
                    cryptoStakingHistoryDetailDuxo4 = cryptoStakingHistoryDetailDuxo3;
                    composerStartRestartGroup.updateRememberedValue(sduiActionHandler2);
                    objRememberedValue4 = sduiActionHandler2;
                } else {
                    obj = null;
                    snapshotState = snapshotState3;
                    snapshotState2 = snapshotState4;
                    cryptoStakingHistoryDetailDuxo4 = cryptoStakingHistoryDetailDuxo3;
                }
                final SduiActionHandler sduiActionHandler3 = (SduiActionHandler) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState snapshotState5 = snapshotState2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), ComposableLambda3.rememberComposableLambda(407715634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407715634, i7, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous> (CryptoStakingHistoryDetailComposable.kt:122)");
                        }
                        Function2<Composer, Integer, Unit> function2M24933getLambda$343599387$feature_crypto_staking_externalDebug = CryptoStakingHistoryDetailComposable.INSTANCE.m24933getLambda$343599387$feature_crypto_staking_externalDebug();
                        final Function0<Unit> function0 = onBackButtonClicked;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1701688815, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1701688815, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:123)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<CryptoStakingHistoryDetailViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        final SduiActionHandler<HistoryDetailAction> sduiActionHandler4 = sduiActionHandler3;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M24933getLambda$343599387$feature_crypto_staking_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1728551120, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer3, int i8) {
                                ApiCryptoStakingHistoryDetailResponse.DetailViewModel sduiComponents;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1728551120, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:126)");
                                }
                                CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 = CryptoStakingHistoryDetailComposable3.CryptoStakingHistoryDetailComposable$lambda$0(snapshotState42);
                                NavigationMenuTextButton<HistoryDetailAction> mobile_menu_item = null;
                                CryptoStakingHistoryDetailViewState.Content content = cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 instanceof CryptoStakingHistoryDetailViewState.Content ? (CryptoStakingHistoryDetailViewState.Content) cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 : null;
                                if (content != null && (sduiComponents = content.getSduiComponents()) != null) {
                                    mobile_menu_item = sduiComponents.getMobile_menu_item();
                                }
                                NavigationMenuTextButton<HistoryDetailAction> navigationMenuTextButton = mobile_menu_item;
                                if (navigationMenuTextButton != null) {
                                    SduiAppBarAction.SduiAppBarAction(navigationMenuTextButton, sduiActionHandler4, TestTag3.testTag(Modifier.INSTANCE, CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailMenuTag), composer3, 384, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1932076473, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1932076473, i7, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous> (CryptoStakingHistoryDetailComposable.kt:140)");
                        }
                        CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 = CryptoStakingHistoryDetailComposable3.CryptoStakingHistoryDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        final SduiActionHandler<HistoryDetailAction> sduiActionHandler4 = sduiActionHandler3;
                        Crossfade.Crossfade(cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0, companion2, (FiniteAnimationSpec<Float>) null, "CryptoStakingHistoryDetailComposable", ComposableLambda3.rememberComposableLambda(-106746597, true, new Function3<CryptoStakingHistoryDetailViewState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewState, Composer composer3, Integer num) {
                                invoke(cryptoStakingHistoryDetailViewState, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(CryptoStakingHistoryDetailViewState state2, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(state2, "state");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(state2) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-106746597, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:145)");
                                }
                                if (Intrinsics.areEqual(state2, CryptoStakingHistoryDetailViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(495738891);
                                    CryptoStakingHistoryDetailComposable3.LoadingContent(composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(state2 instanceof CryptoStakingHistoryDetailViewState.Content)) {
                                        composer3.startReplaceGroup(495736853);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(495742818);
                                    CryptoStakingHistoryDetailComposable3.HistoryDetailContent(sduiActionHandler4, (CryptoStakingHistoryDetailViewState.Content) state2, Background3.m4872backgroundbw27NRU$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 27696, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 = CryptoStakingHistoryDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                CryptoStakingHistoryDetailViewState.Content content = !(cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 instanceof CryptoStakingHistoryDetailViewState.Content) ? (CryptoStakingHistoryDetailViewState.Content) cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$0 : null;
                cryptoStakingContext = content == null ? content.getCryptoStakingContext() : null;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoStakingContext) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new CryptoStakingHistoryDetailComposable4(cryptoStakingContext, current, userInteractionEventDescriptor, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(cryptoStakingContext, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3 = CryptoStakingHistoryDetailComposable$lambda$3(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1767928822);
                if (genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3 != null) {
                    sduiActionHandler = sduiActionHandler3;
                } else {
                    sduiActionHandler = sduiActionHandler3;
                    SduiAlert.INSTANCE.Dialog(genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3, sduiActionHandler, null, null, composerStartRestartGroup, SduiAlert.$stable << 12, 12);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6 = CryptoStakingHistoryDetailComposable$lambda$6(snapshotState5);
                if (genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6 != null) {
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = EffectsKt.createCompositionCoroutineScope(coroutineContextImpl6, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue7;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(CryptoStakingHistoryDetailComposable3.m2773x9916036d((SheetValue) obj2));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue8, composerStartRestartGroup, 54, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoStakingHistoryDetailComposable3.m2774x57c41bb3(coroutineScope2, sheetStateRememberModalBottomSheetState, snapshotState5);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue9, sheetStateRememberModalBottomSheetState, null, ComposableLambda3.rememberComposableLambda(-1057304636, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$5$2
                        public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1057304636, i7, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:201)");
                            }
                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                            final GenericAlertContent<HistoryDetailAction> genericAlertContent = genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6;
                            SduiActionHandler<HistoryDetailAction> sduiActionHandler4 = sduiActionHandler;
                            int i8 = SduiAlert.$stable << 6;
                            composer2.startReplaceGroup(1847729312);
                            final Button button = (Button) genericAlertContent.getAction_buttons().get(0);
                            final Button button2 = (Button) CollectionsKt.getOrNull(genericAlertContent.getAction_buttons(), 1);
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$5$2$invoke$$inlined$AlertSheet$1
                                public final void invoke(Composer composer3, int i9) {
                                    long jM21372getBg20d7_KjU;
                                    String serverValue;
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(925557249, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                    }
                                    Pictogram pog = genericAlertContent.getPog();
                                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                    String title = genericAlertContent.getTitle();
                                    final String body_markdown = genericAlertContent.getBody_markdown();
                                    final List body_components = genericAlertContent.getBody_components();
                                    SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                                    BentoAlertButton alertButton = sduiAlert2.toAlertButton(button, null, composer3, 0, 1);
                                    Button button3 = button2;
                                    composer3.startReplaceGroup(402298512);
                                    BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert2.toAlertButton(button3, null, composer3, 0, 1);
                                    composer3.endReplaceGroup();
                                    int i10 = BentoAlertButton.$stable;
                                    int i11 = (i10 << 9) | (i10 << 12);
                                    composer3.startReplaceGroup(221388998);
                                    final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$5$2$invoke$$inlined$AlertSheet$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i12) {
                                            if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1694075195, i12, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                            }
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                            String str = body_markdown;
                                            int i13 = iM7919getCentere0LSkKk;
                                            List list = body_components;
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion3);
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer4.startReplaceGroup(1390346787);
                                            if (str.length() > 0) {
                                                BentoAlerts2.m20854AlertBodyText5stqomU(str, i13, composer4, 0, 0);
                                            }
                                            composer4.endReplaceGroup();
                                            composer4.startReplaceGroup(1390351170);
                                            if (list != null) {
                                                ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer4.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(persistentList, HistoryDetailAction.class, companion3, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer4, 100859904, 0);
                                                composer4.endReplaceGroup();
                                            }
                                            composer4.endReplaceGroup();
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer3, i12).m21371getBg0d7_KjU(), null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                                    if (bentoTheme.getColors(composer3, i12).getIsDay()) {
                                        composer3.startReplaceGroup(-2071673393);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i12).getJet();
                                    } else {
                                        composer3.startReplaceGroup(-2071672529);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i12).m21372getBg20d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer3, 0);
                                    BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer3, ((i11 >> 12) & 112) | 1572864 | ((i11 << 6) & 896) | (i10 << 12), 41);
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, ((i8 >> 3) & 14) | 48);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                            invoke(column5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit2 = Unit.INSTANCE;
                }
                eventCryptoStakingHistoryDetailComposable$lambda$1 = CryptoStakingHistoryDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoStakingHistoryDetailComposable$lambda$1 != null) {
                    if ((eventCryptoStakingHistoryDetailComposable$lambda$1.getData() instanceof CryptoStakingHistoryDetailEvent.Error) && (eventConsumerInvoke = eventCryptoStakingHistoryDetailComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoStakingHistoryDetailComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m24936invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m24936invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                handleError.invoke(((CryptoStakingHistoryDetailEvent.Error) eventCryptoStakingHistoryDetailComposable$lambda$1.getData()).getThrowable());
                            }
                        });
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoStakingHistoryDetailDuxo5 = cryptoStakingHistoryDetailDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoStakingHistoryDetailDuxo5 = cryptoStakingHistoryDetailDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoStakingHistoryDetailComposable3.CryptoStakingHistoryDetailComposable$lambda$18(onBackButtonClicked, handleError, modifier3, cryptoStakingHistoryDetailDuxo5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final SnapshotState4<? extends CryptoStakingHistoryDetailViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingHistoryDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoStakingHistoryDetailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingHistoryDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingHistoryDetailEvent) {
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
                Event<CryptoStakingHistoryDetailEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoStakingHistoryDetailEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState<GenericAlertContent<HistoryDetailAction>> snapshotState32 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotState<GenericAlertContent<HistoryDetailAction>> snapshotState42 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final ClipboardUtil clipboardUtil2 = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final CoroutineScope coroutineScope3 = (CoroutineScope) objRememberedValue3;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                }
                final SduiActionHandler<? super HistoryDetailAction> sduiActionHandler32 = (SduiActionHandler) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState snapshotState52 = snapshotState2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), ComposableLambda3.rememberComposableLambda(407715634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407715634, i7, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous> (CryptoStakingHistoryDetailComposable.kt:122)");
                        }
                        Function2<Composer, Integer, Unit> function2M24933getLambda$343599387$feature_crypto_staking_externalDebug = CryptoStakingHistoryDetailComposable.INSTANCE.m24933getLambda$343599387$feature_crypto_staking_externalDebug();
                        final Function0<Unit> function0 = onBackButtonClicked;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1701688815, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1701688815, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:123)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<? extends CryptoStakingHistoryDetailViewState> snapshotState422 = snapshotState4CollectAsStateWithLifecycle3;
                        final SduiActionHandler<? super HistoryDetailAction> sduiActionHandler4 = sduiActionHandler32;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M24933getLambda$343599387$feature_crypto_staking_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1728551120, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer3, int i8) {
                                ApiCryptoStakingHistoryDetailResponse.DetailViewModel sduiComponents;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1728551120, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:126)");
                                }
                                CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 = CryptoStakingHistoryDetailComposable3.CryptoStakingHistoryDetailComposable$lambda$0(snapshotState422);
                                NavigationMenuTextButton<HistoryDetailAction> mobile_menu_item = null;
                                CryptoStakingHistoryDetailViewState.Content content2 = cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 instanceof CryptoStakingHistoryDetailViewState.Content ? (CryptoStakingHistoryDetailViewState.Content) cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 : null;
                                if (content2 != null && (sduiComponents = content2.getSduiComponents()) != null) {
                                    mobile_menu_item = sduiComponents.getMobile_menu_item();
                                }
                                NavigationMenuTextButton<HistoryDetailAction> navigationMenuTextButton = mobile_menu_item;
                                if (navigationMenuTextButton != null) {
                                    SduiAppBarAction.SduiAppBarAction(navigationMenuTextButton, sduiActionHandler4, TestTag3.testTag(Modifier.INSTANCE, CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailMenuTag), composer3, 384, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1932076473, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1932076473, i7, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous> (CryptoStakingHistoryDetailComposable.kt:140)");
                        }
                        CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 = CryptoStakingHistoryDetailComposable3.CryptoStakingHistoryDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        final SduiActionHandler<? super HistoryDetailAction> sduiActionHandler4 = sduiActionHandler32;
                        Crossfade.Crossfade(cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02, companion2, (FiniteAnimationSpec<Float>) null, "CryptoStakingHistoryDetailComposable", ComposableLambda3.rememberComposableLambda(-106746597, true, new Function3<CryptoStakingHistoryDetailViewState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.CryptoStakingHistoryDetailComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewState, Composer composer3, Integer num) {
                                invoke(cryptoStakingHistoryDetailViewState, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(CryptoStakingHistoryDetailViewState state22, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(state22, "state");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(state22) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-106746597, i8, -1, "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposable.<anonymous>.<anonymous> (CryptoStakingHistoryDetailComposable.kt:145)");
                                }
                                if (Intrinsics.areEqual(state22, CryptoStakingHistoryDetailViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(495738891);
                                    CryptoStakingHistoryDetailComposable3.LoadingContent(composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(state22 instanceof CryptoStakingHistoryDetailViewState.Content)) {
                                        composer3.startReplaceGroup(495736853);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(495742818);
                                    CryptoStakingHistoryDetailComposable3.HistoryDetailContent(sduiActionHandler4, (CryptoStakingHistoryDetailViewState.Content) state22, Background3.m4872backgroundbw27NRU$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 27696, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                CryptoStakingHistoryDetailViewState cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 = CryptoStakingHistoryDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                if (!(cryptoStakingHistoryDetailViewStateCryptoStakingHistoryDetailComposable$lambda$02 instanceof CryptoStakingHistoryDetailViewState.Content)) {
                }
                if (content == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoStakingContext) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue5 = new CryptoStakingHistoryDetailComposable4(cryptoStakingContext, current, userInteractionEventDescriptor, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(cryptoStakingContext, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                    genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3 = CryptoStakingHistoryDetailComposable$lambda$3(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1767928822);
                    if (genericAlertContentCryptoStakingHistoryDetailComposable$lambda$3 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6 = CryptoStakingHistoryDetailComposable$lambda$6(snapshotState52);
                    if (genericAlertContentCryptoStakingHistoryDetailComposable$lambda$6 != null) {
                    }
                    eventCryptoStakingHistoryDetailComposable$lambda$1 = CryptoStakingHistoryDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoStakingHistoryDetailComposable$lambda$1 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoStakingHistoryDetailDuxo5 = cryptoStakingHistoryDetailDuxo4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingHistoryDetailViewState CryptoStakingHistoryDetailComposable$lambda$0(SnapshotState4<? extends CryptoStakingHistoryDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoStakingHistoryDetailEvent> CryptoStakingHistoryDetailComposable$lambda$1(SnapshotState4<Event<CryptoStakingHistoryDetailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final GenericAlertContent<HistoryDetailAction> CryptoStakingHistoryDetailComposable$lambda$3(SnapshotState<GenericAlertContent<HistoryDetailAction>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final GenericAlertContent<HistoryDetailAction> CryptoStakingHistoryDetailComposable$lambda$6(SnapshotState<GenericAlertContent<HistoryDetailAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoStakingHistoryDetailComposable$lambda$16$lambda$15$lambda$14 */
    public static final Unit m2774x57c41bb3(CoroutineScope coroutineScope, SheetState sheetState, final SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoStakingHistoryDetailComposable5(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingHistoryDetailComposable3.m2775x23fc106e(snapshotState, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoStakingHistoryDetailComposable$lambda$16$lambda$15$lambda$14$lambda$13 */
    public static final Unit m2775x23fc106e(SnapshotState snapshotState, Throwable th) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1801759892);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1801759892, i, -1, "com.robinhood.shared.crypto.staking.staking.history.LoadingContent (CryptoStakingHistoryDetailComposable.kt:214)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, TestTagHistoryDetailLoadingTag), true, false, 4, composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHistoryDetailComposable3.LoadingContent$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryDetailContent(final SduiActionHandler<? super HistoryDetailAction> sduiActionHandler, final CryptoStakingHistoryDetailViewState.Content content, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1762776823);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sduiActionHandler) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1762776823, i3, -1, "com.robinhood.shared.crypto.staking.staking.history.HistoryDetailContent (CryptoStakingHistoryDetailComposable.kt:227)");
            }
            LocalShowPlaceholder.Loadable(content.isOrderCancelling(), null, null, ComposableLambda3.rememberComposableLambda(474227847, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt.HistoryDetailContent.1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(474227847, i5, -1, "com.robinhood.shared.crypto.staking.staking.history.HistoryDetailContent.<anonymous> (CryptoStakingHistoryDetailComposable.kt:229)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(modifier, CryptoStakingHistoryDetailComposable3.TestTagHistoryDetailContentTag);
                    ImmutableList<UIComponent<HistoryDetailAction>> components = content.getSduiComponents().getComponents();
                    SduiActionHandler<HistoryDetailAction> sduiActionHandler2 = sduiActionHandler;
                    composer2.startReplaceGroup(767440808);
                    SduiColumns.SduiLazyColumn(components, HistoryDetailAction.class, modifierTestTag, LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3), null, sduiActionHandler2, HorizontalPadding.Default, false, composer2, 12582912, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingHistoryDetailComposable3.HistoryDetailContent$lambda$20(sduiActionHandler, content, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
