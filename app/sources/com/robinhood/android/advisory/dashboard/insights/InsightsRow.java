package com.robinhood.android.advisory.dashboard.insights;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryInsightDetailKey;
import com.robinhood.android.advisory.contracts.AdvisoryInsightsHubKey;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.insights.InsightsRow;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState2;
import com.robinhood.android.advisory.dashboard.insights.InsightsRowViewState3;
import com.robinhood.android.advisory.insight.InsightIconGradientBackground;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.cortex.contracts.PortfolioDigestFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.AppearanceUtil;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InsightsRow.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\f\u001a\u0012\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f\u001a'\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019\u001a-\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010 \u001a9\u0010\"\u001a\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0$2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010%2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010&\"\u000e\u0010!\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"InsightsRow", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo;Landroidx/compose/runtime/Composer;II)V", "getDateSubtitle", "Landroidx/compose/ui/text/AnnotatedString;", "formattedDate", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "insightIconBackground", "icon", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;", "InsightIconComposable", "showBadge", "", "(Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowIcon;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnreadInsightChip", "chipText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "cardBorder", "onClick", "Lkotlin/Function0;", "EmptyInsightsRow", "useV2Styling", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InsightsCard", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;", "(Lcom/robinhood/android/advisory/dashboard/insights/InsightCardData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InsightsCardCarouselTag", "InsightsCards", "cards", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "viewState", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class InsightsRow {
    public static final String InsightsCardCarouselTag = "insights_card_carousel";

    /* compiled from: InsightsRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightsRowViewState3.Background.values().length];
            try {
                iArr[InsightsRowViewState3.Background.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightsRowViewState3.Background.BG2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsightsRowViewState3.Background.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyInsightsRow$lambda$11(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EmptyInsightsRow(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightIconComposable$lambda$7(InsightsRowViewState3 insightsRowViewState3, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InsightIconComposable(insightsRowViewState3, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightsCard$lambda$14(InsightsRowViewState2 insightsRowViewState2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        InsightsCard(insightsRowViewState2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightsCards$lambda$19(ImmutableList immutableList, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        InsightsCards(immutableList, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightsRow$lambda$2(String str, Modifier modifier, InsightsRowDuxo insightsRowDuxo, int i, int i2, Composer composer, int i3) {
        InsightsRow(str, modifier, insightsRowDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadInsightChip$lambda$9(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnreadInsightChip(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsightsRow(final String str, Modifier modifier, InsightsRowDuxo insightsRowDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final InsightsRowDuxo insightsRowDuxo2;
        int i4;
        boolean z;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String accountNumber = str;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(1874572119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
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
                    insightsRowDuxo2 = insightsRowDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(insightsRowDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    insightsRowDuxo2 = insightsRowDuxo;
                }
                i3 |= i6;
            } else {
                insightsRowDuxo2 = insightsRowDuxo;
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
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InsightsRowDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$$inlined$duxo$1.1
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
                        i3 &= -897;
                        modifier3 = modifier5;
                        i4 = -1633490746;
                        insightsRowDuxo2 = (InsightsRowDuxo) baseDuxo;
                    } else {
                        i4 = -1633490746;
                        z = false;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    i4 = -1633490746;
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1874572119, i3, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow (InsightsRow.kt:80)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(insightsRowDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                int i7 = i3;
                boolean z2 = z;
                accountNumber = str;
                Modifier modifier6 = modifier3;
                LocalShowPlaceholder.Loadable(InsightsRow$lambda$0(snapshotState4CollectAsStateWithLifecycle) instanceof InsightsRowViewState.Loading, modifier6, null, ComposableLambda3.rememberComposableLambda(597987271, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt.InsightsRow.1
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
                            ComposerKt.traceEventStart(597987271, i8, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous> (InsightsRow.kt:89)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, InsightsRow.InsightsRow$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEventContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-1599189572, true, new AnonymousClass1(navigator, context, str, insightsRowDuxo2, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: InsightsRow.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ InsightsRowDuxo $duxo;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<InsightsRowViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Navigator navigator, Context context, String str, InsightsRowDuxo insightsRowDuxo, SnapshotState4<? extends InsightsRowViewState> snapshotState4) {
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$accountNumber = str;
                            this.$duxo = insightsRowDuxo;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1599189572, i, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous> (InsightsRow.kt:94)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final String str = this.$accountNumber;
                            final InsightsRowDuxo insightsRowDuxo = this.$duxo;
                            SnapshotState4<InsightsRowViewState> snapshotState4 = this.$viewState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer2.consume(Styles2.getLocalStyles())).getRow(composer2, 0).getColors().m21927getDividerColorQN2ZGVo();
                            composer2.startReplaceGroup(-843971246);
                            if (colorM21927getDividerColorQN2ZGVo != null && InsightsRow.InsightsRow$lambda$0(snapshotState4).getShowDivider()) {
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composer, 0, 4);
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            final InsightsRowViewState insightsRowViewStateInsightsRow$lambda$0 = InsightsRow.InsightsRow$lambda$0(snapshotState4);
                            if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Loaded) {
                                composer2.startReplaceGroup(-392795115);
                                composer2.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str) | composer2.changedInstance(insightsRowViewStateInsightsRow$lambda$0);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$1$lambda$0(navigator, context, str, insightsRowViewStateInsightsRow$lambda$0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CARD, "advisory-insight-unseen-highlight-" + ((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getContentfulId(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(insightsRowDuxo) | composer2.changedInstance(insightsRowViewStateInsightsRow$lambda$0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$3$lambda$2(insightsRowDuxo, insightsRowViewStateInsightsRow$lambda$0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoBaseRowLayout.BentoBaseRowLayout(AppearanceUtil.onAppear(modifierAutoLogEvents$default, (Function0) objRememberedValue2), null, ComposableLambda3.rememberComposableLambda(-1379219482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i2) {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1379219482, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:134)");
                                        }
                                        InsightsRow.InsightIconComposable(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getIcon(), false, null, composer3, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(781337063, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i2) {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(781337063, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:140)");
                                        }
                                        if (((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).isRedesignEnabled()) {
                                            composer3.startReplaceGroup(-1910228813);
                                            if (((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getChipText() != null) {
                                                InsightsRow.UnreadInsightChip(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getChipText(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 7, null), composer3, 48, 0);
                                            }
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-1909835206);
                                            AnnotatedString dateSubtitle = InsightsRow.getDateSubtitle(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getFormattedTimeText(), composer3, 0);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i3 = BentoTheme.$stable;
                                            BentoText2.m20748BentoTextQnj7Zds(dateSubtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1353073688, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$5
                                    public final void invoke(Composer composer3, int i2) throws Resources.NotFoundException {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1353073688, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:156)");
                                        }
                                        InsightsRowViewState insightsRowViewState = insightsRowViewStateInsightsRow$lambda$0;
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        InsightsRowViewState.Loaded loaded = (InsightsRowViewState.Loaded) insightsRowViewState;
                                        String title = loaded.getTitle();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        TextStyle textM = bentoTheme.getTypography(composer3, i3).getTextM();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU();
                                        BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM, composer3, 817889280, 0, 7546);
                                        if (loaded.isRedesignEnabled()) {
                                            composer3.startReplaceGroup(1489404995);
                                            BentoText2.m20747BentoText38GnDrw(loaded.getFormattedTimeText(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else if (loaded.getUnseenInsights().size() >= loaded.getPageSize()) {
                                            composer3.startReplaceGroup(1489875637);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_unread_exceeded, new Object[]{Integer.valueOf(loaded.getPageSize())}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else if (loaded.getUnseenInsights().size() > 1) {
                                            composer3.startReplaceGroup(1490533519);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_unread, new Object[]{Integer.valueOf(loaded.getUnseenInsights().size() - 1)}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1491144932);
                                            composer3.endReplaceGroup();
                                        }
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), null, null, false, false, false, null, composer, 12610944, 0, 1890);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Loading) {
                                composer2.startReplaceGroup(-387598182);
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "---- -- ---- ------- ----", "---- -- --- ------- --------- ---- ---- ---- ----", null, null, null, false, false, false, 0L, null, composer, 12586368, 0, 3955);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Empty) {
                                composer2.startReplaceGroup(-387205877);
                                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "advisory-insight-view-all-cta", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                boolean useNewStyling = ((InsightsRowViewState.Empty) insightsRowViewStateInsightsRow$lambda$0).getUseNewStyling();
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance3 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(navigator, context, str);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                InsightsRow.EmptyInsightsRow(useNewStyling, (Function0) objRememberedValue3, modifierAutoLogEvents$default2, composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.LoadedNewStyle)) {
                                    composer2.startReplaceGroup(-843954493);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-385874551);
                                ImmutableList<InsightsRowViewState2> cards = ((InsightsRowViewState.LoadedNewStyle) insightsRowViewStateInsightsRow$lambda$0).getCards();
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance4 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(navigator, context, str, (InsightsRowViewState2) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                InsightsRow.InsightsCards(cards, (Function1) objRememberedValue4, null, composer2, 0, 4);
                                composer2.endReplaceGroup();
                            }
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$1$lambda$0(Navigator navigator, Context context, String str, InsightsRowViewState insightsRowViewState) {
                            InsightsRowViewState.Loaded loaded = (InsightsRowViewState.Loaded) insightsRowViewState;
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightDetailKey(str, loaded.getCurrentInsight(), loaded.getUnseenInsights()), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$3$lambda$2(InsightsRowDuxo insightsRowDuxo, InsightsRowViewState insightsRowViewState) {
                            insightsRowDuxo.updateImpressionCount(((InsightsRowViewState.Loaded) insightsRowViewState).getCurrentInsight().getId());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$5$lambda$4(Navigator navigator, Context context, String str) {
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightsHubKey(str, null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$7$lambda$6(Navigator navigator, Context context, String str, InsightsRowViewState2 card) {
                            FragmentKey withDigest;
                            Intrinsics.checkNotNullParameter(card, "card");
                            if (card instanceof InsightsRowViewState2.StrategiesTeam) {
                                withDigest = new AdvisoryInsightDetailKey(str, ((InsightsRowViewState2.StrategiesTeam) card).getNavArg(), null, 4, null);
                            } else {
                                if (!(card instanceof InsightsRowViewState2.CortexInsight)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                withDigest = new PortfolioDigestFragmentKey.WithDigest(((InsightsRowViewState2.CortexInsight) card).getDigest(), "strategies-dashboard", false, 4, null);
                            }
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, withDigest, false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 112) | 3072, 4);
                composerStartRestartGroup.startReplaceGroup(i4);
                int i8 = i7 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(insightsRowDuxo2) | (i8 != 4 ? true : z2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsightsRow5(insightsRowDuxo2, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            final InsightsRowDuxo insightsRowDuxo3 = insightsRowDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.InsightsRow$lambda$2(accountNumber, modifier4, insightsRowDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends InsightsRowViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(insightsRowDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                int i72 = i3;
                boolean z22 = z;
                accountNumber = str;
                Modifier modifier62 = modifier3;
                LocalShowPlaceholder.Loadable(InsightsRow$lambda$0(snapshotState4CollectAsStateWithLifecycle2) instanceof InsightsRowViewState.Loading, modifier62, null, ComposableLambda3.rememberComposableLambda(597987271, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt.InsightsRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i82) {
                        if ((i82 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(597987271, i82, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous> (InsightsRow.kt:89)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, InsightsRow.InsightsRow$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getEventContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-1599189572, true, new AnonymousClass1(navigator2, context2, str, insightsRowDuxo2, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: InsightsRow.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ InsightsRowDuxo $duxo;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<InsightsRowViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Navigator navigator, Context context, String str, InsightsRowDuxo insightsRowDuxo, SnapshotState4<? extends InsightsRowViewState> snapshotState4) {
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$accountNumber = str;
                            this.$duxo = insightsRowDuxo;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1599189572, i, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous> (InsightsRow.kt:94)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final String str = this.$accountNumber;
                            final InsightsRowDuxo insightsRowDuxo = this.$duxo;
                            SnapshotState4<InsightsRowViewState> snapshotState4 = this.$viewState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer2.consume(Styles2.getLocalStyles())).getRow(composer2, 0).getColors().m21927getDividerColorQN2ZGVo();
                            composer2.startReplaceGroup(-843971246);
                            if (colorM21927getDividerColorQN2ZGVo != null && InsightsRow.InsightsRow$lambda$0(snapshotState4).getShowDivider()) {
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composer, 0, 4);
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            final InsightsRowViewState insightsRowViewStateInsightsRow$lambda$0 = InsightsRow.InsightsRow$lambda$0(snapshotState4);
                            if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Loaded) {
                                composer2.startReplaceGroup(-392795115);
                                composer2.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str) | composer2.changedInstance(insightsRowViewStateInsightsRow$lambda$0);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$1$lambda$0(navigator, context, str, insightsRowViewStateInsightsRow$lambda$0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CARD, "advisory-insight-unseen-highlight-" + ((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getContentfulId(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(insightsRowDuxo) | composer2.changedInstance(insightsRowViewStateInsightsRow$lambda$0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$3$lambda$2(insightsRowDuxo, insightsRowViewStateInsightsRow$lambda$0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoBaseRowLayout.BentoBaseRowLayout(AppearanceUtil.onAppear(modifierAutoLogEvents$default, (Function0) objRememberedValue2), null, ComposableLambda3.rememberComposableLambda(-1379219482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i2) {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1379219482, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:134)");
                                        }
                                        InsightsRow.InsightIconComposable(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getIcon(), false, null, composer3, 48, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(781337063, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i2) {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(781337063, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:140)");
                                        }
                                        if (((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).isRedesignEnabled()) {
                                            composer3.startReplaceGroup(-1910228813);
                                            if (((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getChipText() != null) {
                                                InsightsRow.UnreadInsightChip(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getChipText(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 7, null), composer3, 48, 0);
                                            }
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-1909835206);
                                            AnnotatedString dateSubtitle = InsightsRow.getDateSubtitle(((InsightsRowViewState.Loaded) insightsRowViewStateInsightsRow$lambda$0).getFormattedTimeText(), composer3, 0);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i3 = BentoTheme.$stable;
                                            BentoText2.m20748BentoTextQnj7Zds(dateSubtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1353073688, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$1$5
                                    public final void invoke(Composer composer3, int i2) throws Resources.NotFoundException {
                                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1353073688, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InsightsRow.kt:156)");
                                        }
                                        InsightsRowViewState insightsRowViewState = insightsRowViewStateInsightsRow$lambda$0;
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        InsightsRowViewState.Loaded loaded = (InsightsRowViewState.Loaded) insightsRowViewState;
                                        String title = loaded.getTitle();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        TextStyle textM = bentoTheme.getTypography(composer3, i3).getTextM();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU();
                                        BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM, composer3, 817889280, 0, 7546);
                                        if (loaded.isRedesignEnabled()) {
                                            composer3.startReplaceGroup(1489404995);
                                            BentoText2.m20747BentoText38GnDrw(loaded.getFormattedTimeText(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else if (loaded.getUnseenInsights().size() >= loaded.getPageSize()) {
                                            composer3.startReplaceGroup(1489875637);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_unread_exceeded, new Object[]{Integer.valueOf(loaded.getPageSize())}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else if (loaded.getUnseenInsights().size() > 1) {
                                            composer3.startReplaceGroup(1490533519);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_unread, new Object[]{Integer.valueOf(loaded.getUnseenInsights().size() - 1)}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1491144932);
                                            composer3.endReplaceGroup();
                                        }
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), null, null, false, false, false, null, composer, 12610944, 0, 1890);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Loading) {
                                composer2.startReplaceGroup(-387598182);
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "---- -- ---- ------- ----", "---- -- --- ------- --------- ---- ---- ---- ----", null, null, null, false, false, false, 0L, null, composer, 12586368, 0, 3955);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else if (insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.Empty) {
                                composer2.startReplaceGroup(-387205877);
                                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "advisory-insight-view-all-cta", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                boolean useNewStyling = ((InsightsRowViewState.Empty) insightsRowViewStateInsightsRow$lambda$0).getUseNewStyling();
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance3 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(navigator, context, str);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                InsightsRow.EmptyInsightsRow(useNewStyling, (Function0) objRememberedValue3, modifierAutoLogEvents$default2, composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(insightsRowViewStateInsightsRow$lambda$0 instanceof InsightsRowViewState.LoadedNewStyle)) {
                                    composer2.startReplaceGroup(-843954493);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-385874551);
                                ImmutableList<InsightsRowViewState2> cards = ((InsightsRowViewState.LoadedNewStyle) insightsRowViewStateInsightsRow$lambda$0).getCards();
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance4 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(str);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsRow$1$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InsightsRow.C86641.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(navigator, context, str, (InsightsRowViewState2) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                InsightsRow.InsightsCards(cards, (Function1) objRememberedValue4, null, composer2, 0, 4);
                                composer2.endReplaceGroup();
                            }
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$1$lambda$0(Navigator navigator, Context context, String str, InsightsRowViewState insightsRowViewState) {
                            InsightsRowViewState.Loaded loaded = (InsightsRowViewState.Loaded) insightsRowViewState;
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightDetailKey(str, loaded.getCurrentInsight(), loaded.getUnseenInsights()), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$3$lambda$2(InsightsRowDuxo insightsRowDuxo, InsightsRowViewState insightsRowViewState) {
                            insightsRowDuxo.updateImpressionCount(((InsightsRowViewState.Loaded) insightsRowViewState).getCurrentInsight().getId());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$5$lambda$4(Navigator navigator, Context context, String str) {
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightsHubKey(str, null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$7$lambda$6(Navigator navigator, Context context, String str, InsightsRowViewState2 card) {
                            FragmentKey withDigest;
                            Intrinsics.checkNotNullParameter(card, "card");
                            if (card instanceof InsightsRowViewState2.StrategiesTeam) {
                                withDigest = new AdvisoryInsightDetailKey(str, ((InsightsRowViewState2.StrategiesTeam) card).getNavArg(), null, 4, null);
                            } else {
                                if (!(card instanceof InsightsRowViewState2.CortexInsight)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                withDigest = new PortfolioDigestFragmentKey.WithDigest(((InsightsRowViewState2.CortexInsight) card).getDigest(), "strategies-dashboard", false, 4, null);
                            }
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, withDigest, false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i72 & 112) | 3072, 4);
                composerStartRestartGroup.startReplaceGroup(i4);
                int i82 = i72 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(insightsRowDuxo2) | (i82 != 4 ? true : z22);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new InsightsRow5(insightsRowDuxo2, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i82);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                }
            }
        }
        final InsightsRowDuxo insightsRowDuxo32 = insightsRowDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsightsRowViewState InsightsRow$lambda$0(SnapshotState4<? extends InsightsRowViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final Modifier insightIconBackground(Modifier modifier, final InsightsRowViewState3 icon) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt.insightIconBackground.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Modifier modifier2;
                Modifier modifierM4872backgroundbw27NRU$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(345288146);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(345288146, i, -1, "com.robinhood.android.advisory.dashboard.insights.insightIconBackground.<anonymous> (InsightsRow.kt:282)");
                }
                InsightsRowViewState3 insightsRowViewState3 = icon;
                if (insightsRowViewState3 instanceof InsightsRowViewState3.Local) {
                    InsightsRowViewState3.Background background = ((InsightsRowViewState3.Local) insightsRowViewState3).getBackground();
                    if (background == InsightsRowViewState3.Background.GRADIENT) {
                        modifierM4872backgroundbw27NRU$default = Background3.background$default(composed, InsightIconGradientBackground.getInsightIconGradientBackgroundBrush(), null, 0.0f, 6, null);
                    } else {
                        modifier2 = composed;
                        if (background == InsightsRowViewState3.Background.BG2) {
                            modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                        } else if (background != InsightsRowViewState3.Background.IMAGE) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierM4872backgroundbw27NRU$default;
                }
                modifier2 = composed;
                if (!(insightsRowViewState3 instanceof InsightsRowViewState3.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierM4872backgroundbw27NRU$default = modifier2;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                return modifierM4872backgroundbw27NRU$default;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsightIconComposable(final InsightsRowViewState3 icon, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion;
        Modifier modifier3;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        int i6;
        BoxScopeInstance boxScopeInstance;
        BentoIcon4 size16;
        BentoTheme bentoTheme2;
        long nova;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1002801018);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1002801018, i3, -1, "com.robinhood.android.advisory.dashboard.insights.InsightIconComposable (InsightsRow.kt:298)");
                }
                ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                int i9 = !bentoTheme3.getColors(composerStartRestartGroup, i8).getIsDay() ? C8626R.drawable.ic_insight_light_mode_edge_layer : C8626R.drawable.ic_insight_dark_mode_edge_layer;
                float f = 40;
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier5, C2002Dp.m7995constructorimpl(f));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierInsightIconBackground = insightIconBackground(Clip.clip(SizeKt.m5169size3ABfNKs(companion4, C2002Dp.m7995constructorimpl(f)), RoundedCornerShape2.getCircleShape()), icon);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierInsightIconBackground);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                if (icon instanceof InsightsRowViewState3.Remote) {
                    companion = companion4;
                    modifier3 = modifier5;
                    i4 = 0;
                    if (!(icon instanceof InsightsRowViewState3.Local)) {
                        composerStartRestartGroup.startReplaceGroup(-567009764);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-396805438);
                    composerStartRestartGroup.startReplaceGroup(-566989664);
                    InsightsRowViewState3.Local local = (InsightsRowViewState3.Local) icon;
                    if (local.getBackground() == InsightsRowViewState3.Background.IMAGE) {
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(C8626R.drawable.ic_insight_bg_layer, composerStartRestartGroup, 0);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        ContentScale.Companion companion5 = ContentScale.INSTANCE;
                        i5 = i8;
                        i6 = 1;
                        boxScopeInstance = boxScopeInstance2;
                        bentoTheme = bentoTheme3;
                        ImageKt.Image(painterPainterResource, (String) null, modifierFillMaxSize$default, (Alignment) null, companion5.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
                        ImageKt.Image(PainterResources_androidKt.painterResource(i9, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, companion5.getNone(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
                    } else {
                        bentoTheme = bentoTheme3;
                        i5 = i8;
                        i6 = 1;
                        boxScopeInstance = boxScopeInstance2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    InsightsRowViewState3.Background background = local.getBackground();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i10 = iArr[background.ordinal()];
                    if (i10 == i6 || i10 == 2) {
                        size16 = new BentoIcon4.Size16(local.getAsset());
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size16 = new BentoIcon4.Size24(local.getAsset());
                    }
                    int i11 = iArr[local.getBackground().ordinal()];
                    if (i11 == i6) {
                        bentoTheme2 = bentoTheme;
                        i8 = i5;
                        composerStartRestartGroup.startReplaceGroup(-566945386);
                        nova = bentoTheme2.getColors(composerStartRestartGroup, i8).getNova();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, null, nova, null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            composerStartRestartGroup.startReplaceGroup(-566951631);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        bentoTheme2 = bentoTheme;
                        i8 = i5;
                        composerStartRestartGroup.startReplaceGroup(-566945386);
                        nova = bentoTheme2.getColors(composerStartRestartGroup, i8).getNova();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, null, nova, null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-566942636);
                        bentoTheme2 = bentoTheme;
                        i8 = i5;
                        nova = bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, null, nova, null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-397427701);
                    companion = companion4;
                    modifier3 = modifier5;
                    i4 = 0;
                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(bentoTheme3.getColors(composerStartRestartGroup, i8).getIsDay() ? ((InsightsRowViewState3.Remote) icon).getLightUrl() : ((InsightsRowViewState3.Remote) icon).getDarkUrl(), imageLoaderRememberImageLoader, null, null, ContentScale.INSTANCE.getFit(), 0, null, composerStartRestartGroup, 24576, 108), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                    bentoTheme2 = bentoTheme3;
                    boxScopeInstance = boxScopeInstance2;
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1629985011);
                if (z) {
                    BoxKt.Box(BorderKt.m4876borderxT4_qwU(SizeKt.m5169size3ABfNKs(Background3.m4871backgroundbw27NRU(boxScopeInstance.align(companion, companion2.getTopEnd()), bentoTheme2.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU(), RoundedCornerShape2.getCircleShape()), C2002Dp.m7995constructorimpl(12)), C2002Dp.m7995constructorimpl(2), bentoTheme2.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, i4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.InsightIconComposable$lambda$7(icon, z, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ImageLoader imageLoaderRememberImageLoader2 = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
            BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            if (!bentoTheme32.getColors(composerStartRestartGroup, i82).getIsDay()) {
            }
            float f2 = 40;
            Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier5, C2002Dp.m7995constructorimpl(f2));
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierInsightIconBackground2 = insightIconBackground(Clip.clip(SizeKt.m5169size3ABfNKs(companion42, C2002Dp.m7995constructorimpl(f2)), RoundedCornerShape2.getCircleShape()), icon);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierInsightIconBackground2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    if (icon instanceof InsightsRowViewState3.Remote) {
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(1629985011);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnreadInsightChip(final String chipText, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chipText, "chipText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-679550276);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(chipText) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-679550276, i4, -1, "com.robinhood.android.advisory.dashboard.insights.UnreadInsightChip (InsightsRow.kt:394)");
                }
                Modifier modifierClip = Clip.clip(modifier3, RoundedCornerShape2.getCircleShape());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                float f = 2;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(f));
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(chipText, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, (i4 & 14) | 24576, 0, 8170);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.UnreadInsightChip$lambda$9(chipText, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierClip2 = Clip.clip(modifier3, RoundedCornerShape2.getCircleShape());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            float f2 = 2;
            Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(f2));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f2)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16), null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21456getPositive0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(chipText, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, (i4 & 14) | 24576, 0, 8170);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Modifier cardBorder(Modifier modifier, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt.cardBorder.1
            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(290333491);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(290333491, i, -1, "com.robinhood.android.advisory.dashboard.insights.cardBorder.<anonymous> (InsightsRow.kt:421)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(BorderKt.m4876borderxT4_qwU(composed, fM7995constructorimpl, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4), false, null, null, Haptics.hapticClick(onClick, composer, 0), 7, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5142padding3ABfNKs;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmptyInsightsRow(final boolean z, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1698365110);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1698365110, i3, -1, "com.robinhood.android.advisory.dashboard.insights.EmptyInsightsRow (InsightsRow.kt:439)");
                }
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1280409122);
                    Modifier modifierCardBorder = cardBorder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null), onClick);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierCardBorder);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_view_all, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1280985071);
                    modifier3 = modifier5;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifier3, null, StringResources_androidKt.stringResource(C8626R.string.advisory_insights_view_all, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onClick, composerStartRestartGroup, ((i3 >> 6) & 14) | 12582912, i3 & 112, 1914);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.EmptyInsightsRow$lambda$11(z, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsightsCard(final InsightsRowViewState2 data, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1955470969);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1955470969, i3, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsCard (InsightsRow.kt:472)");
                }
                Modifier modifierCardBorder = cardBorder(modifier4, onClick);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), centerVertically, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierCardBorder);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                InsightIconComposable(data.getIcon(), true, null, composerStartRestartGroup, 48, 4);
                Modifier modifierWeight$default = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(2)), companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(data.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, null, composerStartRestartGroup, 817889280, 0, 15742);
                if (!(data instanceof InsightsRowViewState2.CortexInsight)) {
                    i4 = C8626R.string.advisory_insights_source_ai;
                } else {
                    if (!(data instanceof InsightsRowViewState2.StrategiesTeam)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C8626R.string.advisory_insights_source_strategies_team;
                }
                String strStringResource = StringResources_androidKt.stringResource(i4, new Object[]{data.getFormattedTimeText()}, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer2, 0, 0, 8186);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.InsightsCard$lambda$14(data, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierCardBorder2 = cardBorder(modifier4, onClick);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(12)), centerVertically2, composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierCardBorder2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                InsightIconComposable(data.getIcon(), true, null, composerStartRestartGroup, 48, 4);
                Modifier modifierWeight$default2 = Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(2)), companion3.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(data.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, null, composerStartRestartGroup, 817889280, 0, 15742);
                    if (!(data instanceof InsightsRowViewState2.CortexInsight)) {
                    }
                    String strStringResource2 = StringResources_androidKt.stringResource(i4, new Object[]{data.getFormattedTimeText()}, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    composer2.endNode();
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsightsCards(final ImmutableList<? extends InsightsRowViewState2> cards, final Function1<? super InsightsRowViewState2, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(730259977);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(cards) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(730259977, i3, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsCards (InsightsRow.kt:513)");
                }
                if (cards.size() != 1) {
                    composerStartRestartGroup.startReplaceGroup(1165804306);
                    final InsightsRowViewState2 insightsRowViewState2 = (InsightsRowViewState2) CollectionsKt.first((List) cards);
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(insightsRowViewState2) | ((i3 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InsightsRow.InsightsCards$lambda$16$lambda$15(onClick, insightsRowViewState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    InsightsCard(insightsRowViewState2, (Function0) objRememberedValue, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1166068426);
                    int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 14) == 4;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(cards.size());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 3);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM();
                    PageSize pageSize = new PageSize() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt.InsightsCards.2
                        @Override // androidx.compose.foundation.pager.PageSize
                        public int calculateMainAxisPageSize(Density density, int i6, int i7) {
                            Intrinsics.checkNotNullParameter(density, "<this>");
                            return (int) (i6 * 0.8f);
                        }
                    };
                    Modifier modifierAccountTabScrollInteraction = AccountTabScrollInteractions2.accountTabScrollInteraction(TestTag3.testTag(modifier5, InsightsCardCarouselTag), (AccountTabScrollInteractions) composerStartRestartGroup.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction()));
                    Alignment.Vertical top = Alignment.INSTANCE.getTop();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1055782190, true, new C86633(cards, iMo7449getContainerSizeYbymL2g, onClick), composerStartRestartGroup, 54);
                    modifier3 = modifier5;
                    PagerKt.m5301HorizontalPager8jOkeI(pagerStateRememberPagerState, modifierAccountTabScrollInteraction, paddingValuesM5137PaddingValuesYgX7TsA$default, pageSize, 0, fM21590getDefaultD9Ej5fM, top, null, false, false, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 1572864, 24576, 16272);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InsightsRow.InsightsCards$lambda$19(cards, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (cards.size() != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightsCards$lambda$16$lambda$15(Function1 function1, InsightsRowViewState2 insightsRowViewState2) {
        function1.invoke(insightsRowViewState2);
        return Unit.INSTANCE;
    }

    /* compiled from: InsightsRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsCards$3 */
    static final class C86633 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<InsightsRowViewState2> $cards;
        final /* synthetic */ Function1<InsightsRowViewState2, Unit> $onClick;
        final /* synthetic */ int $screenWidth;

        /* JADX WARN: Multi-variable type inference failed */
        C86633(ImmutableList<? extends InsightsRowViewState2> immutableList, int i, Function1<? super InsightsRowViewState2, Unit> function1) {
            this.$cards = immutableList;
            this.$screenWidth = i;
            this.$onClick = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
            invoke(pagerScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055782190, i2, -1, "com.robinhood.android.advisory.dashboard.insights.InsightsCards.<anonymous> (InsightsRow.kt:545)");
            }
            final InsightsRowViewState2 insightsRowViewState2 = this.$cards.get(i);
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(this.$screenWidth * 0.85f));
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onClick) | composer.changed(insightsRowViewState2);
            final Function1<InsightsRowViewState2, Unit> function1 = this.$onClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.insights.InsightsRowKt$InsightsCards$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InsightsRow.C86633.invoke$lambda$1$lambda$0(function1, insightsRowViewState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InsightsRow.InsightsCard(insightsRowViewState2, (Function0) objRememberedValue, modifierM5174width3ABfNKs, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, InsightsRowViewState2 insightsRowViewState2) {
            function1.invoke(insightsRowViewState2);
            return Unit.INSTANCE;
        }
    }

    public static final AnnotatedString getDateSubtitle(String formattedDate, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        composer.startReplaceGroup(-655086901);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655086901, i, -1, "com.robinhood.android.advisory.dashboard.insights.getDateSubtitle (InsightsRow.kt:267)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(C8626R.string.advisory_insights_date_subtitle_prefix, composer, 0));
        int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(" · " + formattedDate);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
