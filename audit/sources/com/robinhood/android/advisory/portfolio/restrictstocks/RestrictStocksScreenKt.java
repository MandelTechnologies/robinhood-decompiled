package com.robinhood.android.advisory.portfolio.restrictstocks;

import android.content.Context;
import android.content.res.Resources;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001az\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132K\u0010\u0014\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0090\u0001\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00132K\u0010\u0014\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\u0012\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"TAG_RESTRICT_STOCKS_INFO_ICON", "", "TAG_RESTRICT_STOCKS_SEARCH_BAR", "TAG_RESTRICT_STOCKS_SEARCH_CONTENT", "TAG_RESTRICT_STOCKS_PORTFOLIO_CONTENT", "RestrictStocksScreen", "", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDuxo;Landroidx/compose/runtime/Composer;II)V", "SearchContent", "searchResults", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultRowData;", "isSearchEmpty", "", "updateRestrictedAsset", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "assetId", "assetName", "isRestricted", "(Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PortfolioContent", "restrictedStockRows", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$RestrictedStockRowData;", "managedPortfolioRows", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$ManagedPortfolioRowData;", "maxRestrictedAssetsAllowed", "", "canRestrictMoreAssets", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;IZLkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent;", "showDisclosureBottomSheet", "focusOnSearchBar"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RestrictStocksScreenKt {
    public static final String TAG_RESTRICT_STOCKS_INFO_ICON = "RestrictStocksScreen_InfoIcon";
    public static final String TAG_RESTRICT_STOCKS_PORTFOLIO_CONTENT = "RestrictStocksScreen_PortfolioContent";
    public static final String TAG_RESTRICT_STOCKS_SEARCH_BAR = "RestrictStocksScreen_SearchBar";
    public static final String TAG_RESTRICT_STOCKS_SEARCH_CONTENT = "RestrictStocksScreen_SearchContent";

    /* compiled from: RestrictStocksScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictStocksViewState3.SearchResultStatus.values().length];
            try {
                iArr[RestrictStocksViewState3.SearchResultStatus.IN_MANAGED_PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictStocksViewState3.SearchResultStatus.NOT_IN_MANAGED_PORTFOLIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictStocksViewState3.SearchResultStatus.ALREADY_RESTRICTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RestrictStocksViewState3.SearchResultStatus.CONTROL_ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioContent$lambda$26(ImmutableList immutableList, ImmutableList immutableList2, int i, boolean z, Function3 function3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        PortfolioContent(immutableList, immutableList2, i, z, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RestrictStocksScreen$lambda$10(Function0 function0, Modifier modifier, RestrictStocksDuxo restrictStocksDuxo, int i, int i2, Composer composer, int i3) {
        RestrictStocksScreen(function0, modifier, restrictStocksDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchContent$lambda$16(ImmutableList immutableList, boolean z, Function3 function3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchContent(immutableList, z, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RestrictStocksScreen(final Function0<Unit> onClose, Modifier modifier, RestrictStocksDuxo restrictStocksDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        RestrictStocksDuxo restrictStocksDuxo2;
        int i4;
        Modifier modifier3;
        RestrictStocksDuxo restrictStocksDuxo3;
        Event<RestrictStocksEvent> event;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnackbarHostState snackbarHostState;
        final RestrictStocksDuxo restrictStocksDuxo4;
        boolean zChanged;
        Object objRememberedValue4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-462308352);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClose) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    restrictStocksDuxo2 = restrictStocksDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(restrictStocksDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    restrictStocksDuxo2 = restrictStocksDuxo;
                }
                i3 |= i6;
            } else {
                restrictStocksDuxo2 = restrictStocksDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RestrictStocksDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$duxo$1.1
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
                        restrictStocksDuxo2 = (RestrictStocksDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = 0;
                    }
                    modifier3 = modifier5;
                    restrictStocksDuxo3 = restrictStocksDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    restrictStocksDuxo3 = restrictStocksDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-462308352, i3, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen (RestrictStocksScreen.kt:69)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(restrictStocksDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<RestrictStocksEvent>> eventFlow = restrictStocksDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "RestrictStocksScreen.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof RestrictStocksEvent) {
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
                Event<RestrictStocksEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof RestrictStocksEvent)) {
                    value = null;
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new SnackbarHostState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snackbarHostState = (SnackbarHostState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1317237572, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RestrictStocksScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onClose;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onClose = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
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
                                ComposerKt.traceEventStart(-1176625829, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:104)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onClose);
                            final Function0<Unit> function0 = this.$onClose;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RestrictStocksScreenKt.C92091.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1317237572, i7, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:102)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$RestrictStocksScreenKt.INSTANCE.getLambda$585664303$feature_advisory_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1176625829, true, new AnonymousClass1(onClose), composer2, 54), ComposableLambda3.rememberComposableLambda(319465946, true, new AnonymousClass2(snapshotState), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RestrictStocksScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<Boolean> $showDisclosureBottomSheet$delegate;

                        AnonymousClass2(SnapshotState<Boolean> snapshotState) {
                            this.$showDisclosureBottomSheet$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(319465946, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:108)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_INFO_ICON);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<Boolean> snapshotState = this.$showDisclosureBottomSheet$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RestrictStocksScreenKt.C92091.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, "Open disclosure bottom sheet", jM21425getFg0d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 24624, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            RestrictStocksScreenKt.RestrictStocksScreen$lambda$4(snapshotState, true);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1609269114, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.2
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
                            ComposerKt.traceEventStart(1609269114, i7, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:83)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(80);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        SnackbarHostKt.SnackbarHost(snackbarHostState, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), fM7995constructorimpl, 2, null), ComposableSingletons$RestrictStocksScreenKt.INSTANCE.getLambda$502192397$feature_advisory_portfolio_externalDebug(), composer2, 390, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                int i7 = i4;
                restrictStocksDuxo4 = restrictStocksDuxo3;
                Modifier modifier6 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1624753937, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i8 & 6) == 0) {
                            i8 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1624753937, i8, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:123)");
                        }
                        boolean z = RestrictStocksScreenKt.RestrictStocksScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2) instanceof RestrictStocksViewState.Loading;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        final SnapshotState4<RestrictStocksViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final FocusManager focusManager2 = focusManager;
                        final RestrictStocksDuxo restrictStocksDuxo5 = restrictStocksDuxo4;
                        final Function0<Unit> function0 = onClose;
                        final SnapshotState<Boolean> snapshotState3 = snapshotState2;
                        final SnapshotState<Boolean> snapshotState5 = snapshotState;
                        LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-105017183, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.3.1

                            /* compiled from: RestrictStocksScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C495971 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ RestrictStocksDuxo $duxo;
                                final /* synthetic */ FocusManager $focusManager;
                                final /* synthetic */ SnapshotState<Boolean> $focusOnSearchBar$delegate;
                                final /* synthetic */ Function0<Unit> $onClose;
                                final /* synthetic */ PaddingValues $paddingValues;
                                final /* synthetic */ SnapshotState<Boolean> $showDisclosureBottomSheet$delegate;
                                final /* synthetic */ RestrictStocksViewState $vs;

                                C495971(PaddingValues paddingValues, FocusManager focusManager, RestrictStocksViewState restrictStocksViewState, RestrictStocksDuxo restrictStocksDuxo, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
                                    this.$paddingValues = paddingValues;
                                    this.$focusManager = focusManager;
                                    this.$vs = restrictStocksViewState;
                                    this.$duxo = restrictStocksDuxo;
                                    this.$onClose = function0;
                                    this.$focusOnSearchBar$delegate = snapshotState;
                                    this.$showDisclosureBottomSheet$delegate = snapshotState2;
                                }

                                /* compiled from: RestrictStocksScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4, reason: invalid class name */
                                static final class AnonymousClass4 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                                    final /* synthetic */ RestrictStocksViewState $vs;

                                    AnonymousClass4(RestrictStocksViewState restrictStocksViewState) {
                                        this.$vs = restrictStocksViewState;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
                                    /* JADX WARN: Removed duplicated region for block: B:50:0x01e5  */
                                    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
                                    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                        int i2;
                                        final RhModalBottomSheet5 rhModalBottomSheet5;
                                        boolean z;
                                        Object objRememberedValue;
                                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                        if ((i & 6) == 0) {
                                            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1204175632, i2, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RestrictStocksScreen.kt:219)");
                                        }
                                        RestrictStocksViewState restrictStocksViewState = this.$vs;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                                        RestrictStocksViewState.Loaded loaded = (RestrictStocksViewState.Loaded) restrictStocksViewState;
                                        int i4 = i2;
                                        BentoText2.m20747BentoText38GnDrw(loaded.getRestrictStocksDisclosure().getTitle(), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8120);
                                        BentoText2.m20747BentoText38GnDrw(loaded.getRestrictStocksDisclosure().getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8120);
                                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                        String ctaText = loaded.getRestrictStocksDisclosure().getCtaText();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU();
                                        composer.startReplaceGroup(5004770);
                                        if ((i4 & 14) != 4) {
                                            if ((i4 & 8) != 0) {
                                                rhModalBottomSheet5 = RhModalBottomSheet;
                                                if (composer.changedInstance(rhModalBottomSheet5)) {
                                                }
                                                objRememberedValue = composer.rememberedValue();
                                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            rhModalBottomSheet5 = RhModalBottomSheet;
                                            z = false;
                                            objRememberedValue = composer.rememberedValue();
                                            if (z) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                            composer.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        } else {
                                            rhModalBottomSheet5 = RhModalBottomSheet;
                                        }
                                        z = true;
                                        objRememberedValue = composer.rememberedValue();
                                        if (z) {
                                        }
                                        composer.endReplaceGroup();
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                        invoke(rhModalBottomSheet5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$2$lambda$1(RestrictStocksDuxo restrictStocksDuxo, String query) {
                                    Intrinsics.checkNotNullParameter(query, "query");
                                    restrictStocksDuxo.updateSearchQuery(query);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$4$lambda$3(FocusManager focusManager, SnapshotState snapshotState, boolean z) {
                                    RestrictStocksScreenKt.RestrictStocksScreen$lambda$7(snapshotState, z);
                                    if (!z) {
                                        FocusManager.clearFocus$default(focusManager, false, 1, null);
                                    }
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    final SnapshotState<Boolean> snapshotState;
                                    Composer composer2;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1841883964, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous>.<anonymous> (RestrictStocksScreen.kt:140)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(companion, null, 1, null), 0.0f, 1, null), this.$paddingValues);
                                    Unit unit = Unit.INSTANCE;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$focusManager);
                                    FocusManager focusManager = this.$focusManager;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$1$1(focusManager);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPadding, unit, (PointerInputEventHandler) objRememberedValue);
                                    RestrictStocksViewState restrictStocksViewState = this.$vs;
                                    final RestrictStocksDuxo restrictStocksDuxo = this.$duxo;
                                    final FocusManager focusManager2 = this.$focusManager;
                                    Function0<Unit> function0 = this.$onClose;
                                    SnapshotState<Boolean> snapshotState2 = this.$focusOnSearchBar$delegate;
                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPointerInput);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_title, composer, 0);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                                    Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null), RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_SEARCH_BAR);
                                    RestrictStocksViewState.Loaded loaded = (RestrictStocksViewState.Loaded) restrictStocksViewState;
                                    String searchQuery = loaded.getSearchQuery();
                                    boolean canRestrictMoreAssets = loaded.getCanRestrictMoreAssets();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(restrictStocksDuxo);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$8$lambda$2$lambda$1(restrictStocksDuxo, (String) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance3 = composer.changedInstance(focusManager2);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        snapshotState = snapshotState2;
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$8$lambda$4$lambda$3(focusManager2, snapshotState, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    } else {
                                        snapshotState = snapshotState2;
                                    }
                                    composer.endReplaceGroup();
                                    SnapshotState<Boolean> snapshotState3 = snapshotState;
                                    RestrictStocksComponents3.SearchBar(searchQuery, function1, (Function1) objRememberedValue3, canRestrictMoreAssets, modifierTestTag, composer, 0, 0);
                                    Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor2);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (RestrictStocksScreenKt.RestrictStocksScreen$lambda$6(snapshotState3)) {
                                        composer.startReplaceGroup(138272139);
                                        Modifier modifierTestTag2 = TestTag3.testTag(companion, RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_SEARCH_CONTENT);
                                        ImmutableList immutableList = extensions2.toImmutableList(loaded.getSearchResultRows());
                                        boolean z = loaded.getSearchQuery().length() == 0;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer.changedInstance(restrictStocksDuxo);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$1$1(restrictStocksDuxo);
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        RestrictStocksScreenKt.SearchContent(immutableList, z, (Function3) ((KFunction) objRememberedValue4), modifierTestTag2, composer, 3072, 0);
                                        composer.endReplaceGroup();
                                        composer2 = composer;
                                    } else {
                                        composer.startReplaceGroup(138808253);
                                        Modifier modifierTestTag3 = TestTag3.testTag(companion, RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_PORTFOLIO_CONTENT);
                                        ImmutableList immutableList2 = extensions2.toImmutableList(loaded.getRestrictedAssetsRows());
                                        ImmutableList immutableList3 = extensions2.toImmutableList(loaded.getManagedPortfolioRows());
                                        int maxRestrictedAssetsAllowed = loaded.getMaxRestrictedAssetsAllowed();
                                        boolean canRestrictMoreAssets2 = loaded.getCanRestrictMoreAssets();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance5 = composer.changedInstance(restrictStocksDuxo);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$2$1(restrictStocksDuxo);
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer.endReplaceGroup();
                                        RestrictStocksScreenKt.PortfolioContent(immutableList2, immutableList3, maxRestrictedAssetsAllowed, canRestrictMoreAssets2, (Function3) ((KFunction) objRememberedValue5), modifierTestTag3, composer, 196608, 0);
                                        composer2 = composer;
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_cta, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Primary, false, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21371getBg0d7_KjU()), null, null, false, null, composer2, 24576, 0, 7784);
                                    composer2.endNode();
                                    if (RestrictStocksScreenKt.RestrictStocksScreen$lambda$3(this.$showDisclosureBottomSheet$delegate)) {
                                        composer2.startReplaceGroup(5004770);
                                        final SnapshotState<Boolean> snapshotState4 = this.$showDisclosureBottomSheet$delegate;
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$10$lambda$9(snapshotState4);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer2.endReplaceGroup();
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue6, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1204175632, true, new AnonymousClass4(this.$vs), composer2, 54), composer2, 1572870, 62);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$9(SnapshotState snapshotState) {
                                    RestrictStocksScreenKt.RestrictStocksScreen$lambda$4(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-105017183, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:129)");
                                }
                                RestrictStocksViewState restrictStocksViewStateRestrictStocksScreen$lambda$0 = RestrictStocksScreenKt.RestrictStocksScreen$lambda$0(snapshotState4);
                                if (restrictStocksViewStateRestrictStocksScreen$lambda$0 instanceof RestrictStocksViewState.Loaded) {
                                    composer3.startReplaceGroup(-1830368185);
                                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RESTRICT_SECURITIES, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-1841883964, true, new C495971(paddingValues, focusManager2, restrictStocksViewStateRestrictStocksScreen$lambda$0, restrictStocksDuxo5, function0, snapshotState3, snapshotState5), composer3, 54), composer3, 48);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(restrictStocksViewStateRestrictStocksScreen$lambda$0 instanceof RestrictStocksViewState.Loading)) {
                                        composer3.startReplaceGroup(-2137256420);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(-1822956829);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 6, composer3, 3504, 1);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 805309488, 500);
                composerStartRestartGroup = composerStartRestartGroup;
                Event<RestrictStocksEvent> eventRestrictStocksScreen$lambda$1 = RestrictStocksScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(restrictStocksDuxo4);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new RestrictStocksScreenKt$RestrictStocksScreen$4$1(snapshotState4CollectAsStateWithLifecycle, context, snackbarHostState, restrictStocksDuxo4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(eventRestrictStocksScreen$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                restrictStocksDuxo4 = restrictStocksDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RestrictStocksScreenKt.RestrictStocksScreen$lambda$10(onClose, modifier4, restrictStocksDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier5;
                restrictStocksDuxo3 = restrictStocksDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends RestrictStocksViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(restrictStocksDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = restrictStocksDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "RestrictStocksScreen.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof RestrictStocksEvent) {
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
                Event<RestrictStocksEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof RestrictStocksEvent)) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState22 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snackbarHostState = (SnackbarHostState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1317237572, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RestrictStocksScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onClose;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onClose = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
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
                                ComposerKt.traceEventStart(-1176625829, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:104)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onClose);
                            final Function0 function0 = this.$onClose;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RestrictStocksScreenKt.C92091.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    public final void invoke(Composer composer2, int i72) {
                        if ((i72 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1317237572, i72, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:102)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$RestrictStocksScreenKt.INSTANCE.getLambda$585664303$feature_advisory_portfolio_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1176625829, true, new AnonymousClass1(onClose), composer2, 54), ComposableLambda3.rememberComposableLambda(319465946, true, new AnonymousClass2(snapshotState3), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RestrictStocksScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<Boolean> $showDisclosureBottomSheet$delegate;

                        AnonymousClass2(SnapshotState<Boolean> snapshotState) {
                            this.$showDisclosureBottomSheet$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(319465946, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:108)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_INFO_ICON);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(5004770);
                            final SnapshotState snapshotState = this.$showDisclosureBottomSheet$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RestrictStocksScreenKt.C92091.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, "Open disclosure bottom sheet", jM21425getFg0d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 24624, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            RestrictStocksScreenKt.RestrictStocksScreen$lambda$4(snapshotState, true);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1609269114, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i72) {
                        if ((i72 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1609269114, i72, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:83)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(80);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        SnackbarHostKt.SnackbarHost(snackbarHostState, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), fM7995constructorimpl, 2, null), ComposableSingletons$RestrictStocksScreenKt.INSTANCE.getLambda$502192397$feature_advisory_portfolio_externalDebug(), composer2, 390, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                int i72 = i4;
                restrictStocksDuxo4 = restrictStocksDuxo3;
                Modifier modifier62 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier62, composableLambdaRememberComposableLambda3, null, composableLambdaRememberComposableLambda22, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1624753937, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i8 & 6) == 0) {
                            i8 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1624753937, i8, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous> (RestrictStocksScreen.kt:123)");
                        }
                        boolean z = RestrictStocksScreenKt.RestrictStocksScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle22) instanceof RestrictStocksViewState.Loading;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        final SnapshotState4<? extends RestrictStocksViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        final FocusManager focusManager22 = focusManager2;
                        final RestrictStocksDuxo restrictStocksDuxo5 = restrictStocksDuxo4;
                        final Function0<Unit> function0 = onClose;
                        final SnapshotState<Boolean> snapshotState32 = snapshotState22;
                        final SnapshotState<Boolean> snapshotState5 = snapshotState3;
                        LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-105017183, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt.RestrictStocksScreen.3.1

                            /* compiled from: RestrictStocksScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C495971 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ RestrictStocksDuxo $duxo;
                                final /* synthetic */ FocusManager $focusManager;
                                final /* synthetic */ SnapshotState<Boolean> $focusOnSearchBar$delegate;
                                final /* synthetic */ Function0<Unit> $onClose;
                                final /* synthetic */ PaddingValues $paddingValues;
                                final /* synthetic */ SnapshotState<Boolean> $showDisclosureBottomSheet$delegate;
                                final /* synthetic */ RestrictStocksViewState $vs;

                                C495971(PaddingValues paddingValues, FocusManager focusManager, RestrictStocksViewState restrictStocksViewState, RestrictStocksDuxo restrictStocksDuxo, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
                                    this.$paddingValues = paddingValues;
                                    this.$focusManager = focusManager;
                                    this.$vs = restrictStocksViewState;
                                    this.$duxo = restrictStocksDuxo;
                                    this.$onClose = function0;
                                    this.$focusOnSearchBar$delegate = snapshotState;
                                    this.$showDisclosureBottomSheet$delegate = snapshotState2;
                                }

                                /* compiled from: RestrictStocksScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4, reason: invalid class name */
                                static final class AnonymousClass4 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                                    final /* synthetic */ RestrictStocksViewState $vs;

                                    AnonymousClass4(RestrictStocksViewState restrictStocksViewState) {
                                        this.$vs = restrictStocksViewState;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
                                    /* JADX WARN: Removed duplicated region for block: B:50:0x01e5  */
                                    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
                                    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                        int i2;
                                        final RhModalBottomSheet5 rhModalBottomSheet5;
                                        boolean z;
                                        Object objRememberedValue;
                                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                        if ((i & 6) == 0) {
                                            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1204175632, i2, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RestrictStocksScreen.kt:219)");
                                        }
                                        RestrictStocksViewState restrictStocksViewState = this.$vs;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                                        RestrictStocksViewState.Loaded loaded = (RestrictStocksViewState.Loaded) restrictStocksViewState;
                                        int i4 = i2;
                                        BentoText2.m20747BentoText38GnDrw(loaded.getRestrictStocksDisclosure().getTitle(), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8120);
                                        BentoText2.m20747BentoText38GnDrw(loaded.getRestrictStocksDisclosure().getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8120);
                                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                        String ctaText = loaded.getRestrictStocksDisclosure().getCtaText();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU();
                                        composer.startReplaceGroup(5004770);
                                        if ((i4 & 14) != 4) {
                                            if ((i4 & 8) != 0) {
                                                rhModalBottomSheet5 = RhModalBottomSheet;
                                                if (composer.changedInstance(rhModalBottomSheet5)) {
                                                }
                                                objRememberedValue = composer.rememberedValue();
                                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            rhModalBottomSheet5 = RhModalBottomSheet;
                                            z = false;
                                            objRememberedValue = composer.rememberedValue();
                                            if (z) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$4$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                            composer.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        } else {
                                            rhModalBottomSheet5 = RhModalBottomSheet;
                                        }
                                        z = true;
                                        objRememberedValue = composer.rememberedValue();
                                        if (z) {
                                        }
                                        composer.endReplaceGroup();
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7800);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                        invoke(rhModalBottomSheet5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$2$lambda$1(RestrictStocksDuxo restrictStocksDuxo, String query) {
                                    Intrinsics.checkNotNullParameter(query, "query");
                                    restrictStocksDuxo.updateSearchQuery(query);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$4$lambda$3(FocusManager focusManager, SnapshotState snapshotState, boolean z) {
                                    RestrictStocksScreenKt.RestrictStocksScreen$lambda$7(snapshotState, z);
                                    if (!z) {
                                        FocusManager.clearFocus$default(focusManager, false, 1, null);
                                    }
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    final SnapshotState snapshotState;
                                    Composer composer2;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1841883964, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous>.<anonymous> (RestrictStocksScreen.kt:140)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(companion, null, 1, null), 0.0f, 1, null), this.$paddingValues);
                                    Unit unit = Unit.INSTANCE;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$focusManager);
                                    FocusManager focusManager = this.$focusManager;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$1$1(focusManager);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPadding, unit, (PointerInputEventHandler) objRememberedValue);
                                    RestrictStocksViewState restrictStocksViewState = this.$vs;
                                    final RestrictStocksDuxo restrictStocksDuxo = this.$duxo;
                                    final FocusManager focusManager2 = this.$focusManager;
                                    Function0<Unit> function0 = this.$onClose;
                                    SnapshotState<Boolean> snapshotState2 = this.$focusOnSearchBar$delegate;
                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPointerInput);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_title, composer, 0);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                                    Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null), RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_SEARCH_BAR);
                                    RestrictStocksViewState.Loaded loaded = (RestrictStocksViewState.Loaded) restrictStocksViewState;
                                    String searchQuery = loaded.getSearchQuery();
                                    boolean canRestrictMoreAssets = loaded.getCanRestrictMoreAssets();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(restrictStocksDuxo);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$8$lambda$2$lambda$1(restrictStocksDuxo, (String) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance3 = composer.changedInstance(focusManager2);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        snapshotState = snapshotState2;
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$8$lambda$4$lambda$3(focusManager2, snapshotState, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    } else {
                                        snapshotState = snapshotState2;
                                    }
                                    composer.endReplaceGroup();
                                    SnapshotState<Boolean> snapshotState3 = snapshotState;
                                    RestrictStocksComponents3.SearchBar(searchQuery, function1, (Function1) objRememberedValue3, canRestrictMoreAssets, modifierTestTag, composer, 0, 0);
                                    Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor2);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (RestrictStocksScreenKt.RestrictStocksScreen$lambda$6(snapshotState3)) {
                                        composer.startReplaceGroup(138272139);
                                        Modifier modifierTestTag2 = TestTag3.testTag(companion, RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_SEARCH_CONTENT);
                                        ImmutableList immutableList = extensions2.toImmutableList(loaded.getSearchResultRows());
                                        boolean z = loaded.getSearchQuery().length() == 0;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer.changedInstance(restrictStocksDuxo);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$1$1(restrictStocksDuxo);
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        RestrictStocksScreenKt.SearchContent(immutableList, z, (Function3) ((KFunction) objRememberedValue4), modifierTestTag2, composer, 3072, 0);
                                        composer.endReplaceGroup();
                                        composer2 = composer;
                                    } else {
                                        composer.startReplaceGroup(138808253);
                                        Modifier modifierTestTag3 = TestTag3.testTag(companion, RestrictStocksScreenKt.TAG_RESTRICT_STOCKS_PORTFOLIO_CONTENT);
                                        ImmutableList immutableList2 = extensions2.toImmutableList(loaded.getRestrictedAssetsRows());
                                        ImmutableList immutableList3 = extensions2.toImmutableList(loaded.getManagedPortfolioRows());
                                        int maxRestrictedAssetsAllowed = loaded.getMaxRestrictedAssetsAllowed();
                                        boolean canRestrictMoreAssets2 = loaded.getCanRestrictMoreAssets();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance5 = composer.changedInstance(restrictStocksDuxo);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$2$1(restrictStocksDuxo);
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer.endReplaceGroup();
                                        RestrictStocksScreenKt.PortfolioContent(immutableList2, immutableList3, maxRestrictedAssetsAllowed, canRestrictMoreAssets2, (Function3) ((KFunction) objRememberedValue5), modifierTestTag3, composer, 196608, 0);
                                        composer2 = composer;
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C9151R.string.restrict_stocks_cta, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Primary, false, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21371getBg0d7_KjU()), null, null, false, null, composer2, 24576, 0, 7784);
                                    composer2.endNode();
                                    if (RestrictStocksScreenKt.RestrictStocksScreen$lambda$3(this.$showDisclosureBottomSheet$delegate)) {
                                        composer2.startReplaceGroup(5004770);
                                        final SnapshotState snapshotState4 = this.$showDisclosureBottomSheet$delegate;
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return RestrictStocksScreenKt.C92113.AnonymousClass1.C495971.invoke$lambda$10$lambda$9(snapshotState4);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer2.endReplaceGroup();
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue6, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1204175632, true, new AnonymousClass4(this.$vs), composer2, 54), composer2, 1572870, 62);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$9(SnapshotState snapshotState) {
                                    RestrictStocksScreenKt.RestrictStocksScreen$lambda$4(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-105017183, i9, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreen.<anonymous>.<anonymous> (RestrictStocksScreen.kt:129)");
                                }
                                RestrictStocksViewState restrictStocksViewStateRestrictStocksScreen$lambda$0 = RestrictStocksScreenKt.RestrictStocksScreen$lambda$0(snapshotState4);
                                if (restrictStocksViewStateRestrictStocksScreen$lambda$0 instanceof RestrictStocksViewState.Loaded) {
                                    composer3.startReplaceGroup(-1830368185);
                                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RESTRICT_SECURITIES, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-1841883964, true, new C495971(paddingValues, focusManager22, restrictStocksViewStateRestrictStocksScreen$lambda$0, restrictStocksDuxo5, function0, snapshotState32, snapshotState5), composer3, 54), composer3, 48);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(restrictStocksViewStateRestrictStocksScreen$lambda$0 instanceof RestrictStocksViewState.Loading)) {
                                        composer3.startReplaceGroup(-2137256420);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(-1822956829);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 6, composer3, 3504, 1);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 805309488, 500);
                composerStartRestartGroup = composerStartRestartGroup;
                Event<RestrictStocksEvent> eventRestrictStocksScreen$lambda$12 = RestrictStocksScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(restrictStocksDuxo4);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue4 = new RestrictStocksScreenKt$RestrictStocksScreen$4$1(snapshotState4CollectAsStateWithLifecycle, context, snackbarHostState, restrictStocksDuxo4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(eventRestrictStocksScreen$lambda$12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RestrictStocksScreen$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RestrictStocksScreen$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestrictStocksViewState RestrictStocksScreen$lambda$0(SnapshotState4<? extends RestrictStocksViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<RestrictStocksEvent> RestrictStocksScreen$lambda$1(SnapshotState4<Event<RestrictStocksEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RestrictStocksScreen$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RestrictStocksScreen$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchContent(final ImmutableList<RestrictStocksViewState3.SearchResultRowData> searchResults, final boolean z, final Function3<? super String, ? super String, ? super Boolean, Unit> updateRestrictedAsset, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(updateRestrictedAsset, "updateRestrictedAsset");
        Composer composerStartRestartGroup = composer.startRestartGroup(328253648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(searchResults) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateRestrictedAsset) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(328253648, i3, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.SearchContent (RestrictStocksScreen.kt:314)");
                }
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-635789160);
                    String strStringResource = StringResources_androidKt.stringResource(C9151R.string.search_empty_input, composerStartRestartGroup, 0);
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier4, C2002Dp.m7995constructorimpl(12), 0.0f, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 0, 0, 8120);
                    composer2.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (searchResults.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-635377511);
                        String strStringResource2 = StringResources_androidKt.stringResource(C9151R.string.search_no_results, composerStartRestartGroup, 0);
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier3, C2002Dp.m7995constructorimpl(12), 0.0f, 2, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 0, 0, 8120);
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-634963382);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RestrictStocksScreenKt.SearchContent$lambda$15$lambda$14(searchResults, updateRestrictedAsset, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 511);
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RestrictStocksScreenKt.SearchContent$lambda$16(searchResults, z, updateRestrictedAsset, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchContent$lambda$15$lambda$14(final ImmutableList immutableList, final Function3 function3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestrictStocksScreenKt.SearchContent$lambda$15$lambda$14$lambda$11((RestrictStocksViewState3.SearchResultRowData) obj);
            }
        };
        final C9205xcf95aa1d c9205xcf95aa1d = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$SearchContent$lambda$15$lambda$14$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RestrictStocksViewState3.SearchResultRowData searchResultRowData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((RestrictStocksViewState3.SearchResultRowData) obj);
            }
        };
        LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$SearchContent$lambda$15$lambda$14$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(immutableList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$SearchContent$lambda$15$lambda$14$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c9205xcf95aa1d.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$SearchContent$lambda$15$lambda$14$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final RestrictStocksViewState3.SearchResultRowData searchResultRowData = (RestrictStocksViewState3.SearchResultRowData) immutableList.get(i);
                composer.startReplaceGroup(-1493866995);
                RestrictStocksViewState3.SearchResultStatus status = searchResultRowData.getStatus();
                RestrictStocksComponents5 restrictStocksComponents5 = null;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                int i4 = RestrictStocksScreenKt.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    restrictStocksComponents5 = RestrictStocksComponents5.RESTRICT;
                } else if (i4 == 3) {
                    restrictStocksComponents5 = RestrictStocksComponents5.ALLOW;
                } else if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function3) | composer.changed(searchResultRowData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function3 function32 = function3;
                    objRememberedValue = new Function1<RestrictStocksComponents5, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$SearchContent$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(RestrictStocksComponents5 restrictStocksComponents52) {
                            invoke2(restrictStocksComponents52);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(RestrictStocksComponents5 action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            function32.invoke(searchResultRowData.getAssetId(), searchResultRowData.getAssetName(), Boolean.valueOf(action == RestrictStocksComponents5.RESTRICT));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RestrictStocksComponents3.RestrictStocksSwipeableRow(restrictStocksComponents5, (Function1) objRememberedValue, searchResultRowData, modifierFillMaxWidth$default, false, null, composer, 3072, 48);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SearchContent$lambda$15$lambda$14$lambda$11(RestrictStocksViewState3.SearchResultRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAssetId() + "-" + it.getStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioContent(final ImmutableList<RestrictStocksViewState3.RestrictedStockRowData> restrictedStockRows, final ImmutableList<RestrictStocksViewState3.ManagedPortfolioRowData> managedPortfolioRows, final int i, final boolean z, final Function3<? super String, ? super String, ? super Boolean, Unit> updateRestrictedAsset, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        boolean z2;
        Object objRememberedValue;
        int i6;
        Composer composer2;
        Modifier modifier4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(restrictedStockRows, "restrictedStockRows");
        Intrinsics.checkNotNullParameter(managedPortfolioRows, "managedPortfolioRows");
        Intrinsics.checkNotNullParameter(updateRestrictedAsset, "updateRestrictedAsset");
        Composer composerStartRestartGroup = composer.startRestartGroup(981967709);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(restrictedStockRows) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(managedPortfolioRows) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(updateRestrictedAsset) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i4 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(981967709, i4, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.PortfolioContent (RestrictStocksScreen.kt:373)");
                    }
                    if (managedPortfolioRows.isEmpty() || !restrictedStockRows.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(778339265);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        z2 = ((i4 & 14) != 4) | ((i4 & 896) != 256) | ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i4 & 7168) == 2048);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            i6 = i4;
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RestrictStocksScreenKt.PortfolioContent$lambda$25$lambda$24(restrictedStockRows, managedPortfolioRows, i, updateRestrictedAsset, z, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        } else {
                            i6 = i4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = (i6 >> 15) & 14;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, i7, 510);
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(780911273);
                        String strStringResource = StringResources_androidKt.stringResource(C9151R.string.search_empty_input, composerStartRestartGroup, 0);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RestrictStocksScreenKt.PortfolioContent$lambda$26(restrictedStockRows, managedPortfolioRows, i, z, updateRestrictedAsset, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            if ((i4 & 74899) == 74898) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (managedPortfolioRows.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(778339265);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z2 = ((i4 & 14) != 4) | ((i4 & 896) != 256) | ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i4 & 7168) == 2048);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        i6 = i4;
                        Function1 function12 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RestrictStocksScreenKt.PortfolioContent$lambda$25$lambda$24(restrictedStockRows, managedPortfolioRows, i, updateRestrictedAsset, z, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue = function12;
                        composerStartRestartGroup.endReplaceGroup();
                        int i72 = (i6 >> 15) & 14;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, i72, 510);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        if ((i4 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioContent$lambda$25$lambda$24(final ImmutableList immutableList, final ImmutableList immutableList2, final int i, final Function3 function3, final boolean z, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!immutableList.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-2084959256, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i2) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i2 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2084959256, i2, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.PortfolioContent.<anonymous>.<anonymous>.<anonymous> (RestrictStocksScreen.kt:380)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C9151R.string.restricted_assets_section_title, new Object[]{Integer.valueOf(immutableList.size()), Integer.valueOf(i)}, composer, 0);
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RestrictStocksScreenKt.PortfolioContent$lambda$25$lambda$24$lambda$17((RestrictStocksViewState3.RestrictedStockRowData) obj);
                }
            };
            final C9186x76fa0993 c9186x76fa0993 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RestrictStocksViewState3.RestrictedStockRowData restrictedStockRowData) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((RestrictStocksViewState3.RestrictedStockRowData) obj);
                }
            };
            LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return function1.invoke(immutableList.get(i2));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return c9186x76fa0993.invoke(immutableList.get(i2));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final RestrictStocksViewState3.RestrictedStockRowData restrictedStockRowData = (RestrictStocksViewState3.RestrictedStockRowData) immutableList.get(i2);
                    composer.startReplaceGroup(-708877345);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    RestrictStocksComponents5 restrictStocksComponents5 = RestrictStocksComponents5.ALLOW;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function3) | composer.changed(restrictedStockRowData);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function3 function32 = function3;
                        objRememberedValue = new Function1<RestrictStocksComponents5, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(RestrictStocksComponents5 restrictStocksComponents52) {
                                invoke2(restrictStocksComponents52);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(RestrictStocksComponents5 action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                function32.invoke(restrictedStockRowData.getAssetId(), restrictedStockRowData.getAssetName(), Boolean.valueOf(action == RestrictStocksComponents5.RESTRICT));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function12 = (Function1) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(function3) | composer.changed(restrictedStockRowData);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function3 function33 = function3;
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$1$1$3$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function33.invoke(restrictedStockRowData.getAssetId(), restrictedStockRowData.getAssetName(), Boolean.FALSE);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    RestrictStocksComponents3.RestrictStocksSwipeableRow(restrictStocksComponents5, function12, restrictedStockRowData, modifierFillMaxWidth$default, true, (Function0) objRememberedValue2, composer, 27654, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$RestrictStocksScreenKt.INSTANCE.m11163getLambda$845546849$feature_advisory_portfolio_externalDebug(), 3, null);
        }
        if (!immutableList2.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$RestrictStocksScreenKt.INSTANCE.m11162getLambda$191240033$feature_advisory_portfolio_externalDebug(), 3, null);
            final Function1 function12 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RestrictStocksScreenKt.PortfolioContent$lambda$25$lambda$24$lambda$21((RestrictStocksViewState3.ManagedPortfolioRowData) obj);
                }
            };
            final C9190x76fa0997 c9190x76fa0997 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RestrictStocksViewState3.ManagedPortfolioRowData managedPortfolioRowData) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((RestrictStocksViewState3.ManagedPortfolioRowData) obj);
                }
            };
            LazyColumn.items(immutableList2.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return function12.invoke(immutableList2.get(i2));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return c9190x76fa0997.invoke(immutableList2.get(i2));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$lambda$25$lambda$24$$inlined$items$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final RestrictStocksViewState3.ManagedPortfolioRowData managedPortfolioRowData = (RestrictStocksViewState3.ManagedPortfolioRowData) immutableList2.get(i2);
                    composer.startReplaceGroup(1178875127);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    RestrictStocksComponents5 restrictStocksComponents5 = z ? RestrictStocksComponents5.RESTRICT : null;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function3) | composer.changed(managedPortfolioRowData);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function3 function32 = function3;
                        objRememberedValue = new Function1<RestrictStocksComponents5, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$PortfolioContent$1$1$5$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(RestrictStocksComponents5 restrictStocksComponents52) {
                                invoke2(restrictStocksComponents52);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(RestrictStocksComponents5 action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                function32.invoke(managedPortfolioRowData.getAssetId(), managedPortfolioRowData.getAssetName(), Boolean.valueOf(action == RestrictStocksComponents5.RESTRICT));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    RestrictStocksComponents3.RestrictStocksSwipeableRow(restrictStocksComponents5, (Function1) objRememberedValue, managedPortfolioRowData, modifierFillMaxWidth$default, false, null, composer, 3072, 48);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object PortfolioContent$lambda$25$lambda$24$lambda$17(RestrictStocksViewState3.RestrictedStockRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAssetId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object PortfolioContent$lambda$25$lambda$24$lambda$21(RestrictStocksViewState3.ManagedPortfolioRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAssetId();
    }
}
