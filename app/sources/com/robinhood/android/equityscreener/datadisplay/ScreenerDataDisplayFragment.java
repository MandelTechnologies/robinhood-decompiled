package com.robinhood.android.equityscreener.datadisplay;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Shadow3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equities.contracts.ScreenerDataDisplayKey;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment;
import com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.equityscreener.models.api.ColumnInformation;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Suspend;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenerDataDisplayFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018J[\u0010\u001c\u001a\u00020\u0011*\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\u001a\b\u0002\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110$H\u0003¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "getDuxo", "()Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "DataDisplayList", "state", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rowHeight", "Landroidx/compose/ui/unit/Dp;", "F", "DataDisplayRow", "Landroidx/compose/foundation/lazy/LazyItemScope;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/equityscreener/models/api/ColumnInformation;", "isVisible", "isDragging", "showBottomDivider", "onItemSelected", "Lkotlin/Function2;", "(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/ui/Modifier;Lcom/robinhood/equityscreener/models/api/ColumnInformation;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onLocalScreenerSaved", "Companion", "feature-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ScreenerDataDisplayFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ScreenerDataDisplayDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final float rowHeight = C2002Dp.m7995constructorimpl(52);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ScreenerDataDisplayFragment screenerDataDisplayFragment, int i, Composer composer, int i2) {
        screenerDataDisplayFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayList$lambda$12(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        screenerDataDisplayFragment.DataDisplayList(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayRow$lambda$20(ScreenerDataDisplayFragment screenerDataDisplayFragment, LazyItemScope lazyItemScope, Modifier modifier, ColumnInformation columnInformation, boolean z, boolean z2, boolean z3, Function2 function2, int i, int i2, Composer composer, int i3) {
        screenerDataDisplayFragment.DataDisplayRow(lazyItemScope, modifier, columnInformation, z, z2, z3, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScreenerDataDisplayDuxo getDuxo() {
        return (ScreenerDataDisplayDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1972530961);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1972530961, i2, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent (ScreenerDataDisplayFragment.kt:53)");
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1249042148, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249042148, i3, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.<anonymous> (ScreenerDataDisplayFragment.kt:57)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    final ScreenerDataDisplayFragment screenerDataDisplayFragment = ScreenerDataDisplayFragment.this;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1349046048, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: ScreenerDataDisplayFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C499811 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ ScreenerDataDisplayFragment this$0;

                            C499811(ScreenerDataDisplayFragment screenerDataDisplayFragment) {
                                this.this$0 = screenerDataDisplayFragment;
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
                                    ComposerKt.traceEventStart(-587322783, i, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (ScreenerDataDisplayFragment.kt:65)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final ScreenerDataDisplayFragment screenerDataDisplayFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ScreenerDataDisplayFragment.C157001.AnonymousClass1.C499811.invoke$lambda$1$lambda$0(screenerDataDisplayFragment);
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

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(ScreenerDataDisplayFragment screenerDataDisplayFragment) {
                                screenerDataDisplayFragment.requireBaseActivity().onBackPressed();
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1349046048, i5, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.<anonymous>.<anonymous> (ScreenerDataDisplayFragment.kt:63)");
                            }
                            ScreenerDataDisplayFragment2 screenerDataDisplayFragment2 = ScreenerDataDisplayFragment2.INSTANCE;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(screenerDataDisplayFragment2.m13945getLambda$1629049331$feature_equity_screener_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-587322783, true, new C499811(screenerDataDisplayFragment), composer3, 54), screenerDataDisplayFragment2.m13944getLambda$1302434814$feature_equity_screener_externalDebug(), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final ScreenerDataDisplayFragment screenerDataDisplayFragment2 = ScreenerDataDisplayFragment.this;
                    final SnapshotState4<ScreenerDataDisplayViewState> snapshotState4 = snapshotState4CollectAsState;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-1009748501, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1009748501, i5, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.ComposeContent.<anonymous>.<anonymous> (ScreenerDataDisplayFragment.kt:74)");
                            }
                            ScreenerDataDisplayViewState screenerDataDisplayViewStateComposeContent$lambda$0 = ScreenerDataDisplayFragment.ComposeContent$lambda$0(snapshotState4);
                            if (screenerDataDisplayViewStateComposeContent$lambda$0 instanceof ScreenerDataDisplayViewState.Finished) {
                                screenerDataDisplayFragment2.onLocalScreenerSaved();
                            } else if (!(screenerDataDisplayViewStateComposeContent$lambda$0 instanceof ScreenerDataDisplayViewState.Loading)) {
                                if (!(screenerDataDisplayViewStateComposeContent$lambda$0 instanceof ScreenerDataDisplayViewState.Loaded)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                screenerDataDisplayFragment2.DataDisplayList((ScreenerDataDisplayViewState.Loaded) screenerDataDisplayViewStateComposeContent$lambda$0, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 444);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerDataDisplayFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenerDataDisplayViewState ComposeContent$lambda$0(SnapshotState4<? extends ScreenerDataDisplayViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DataDisplayList(ScreenerDataDisplayViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final ScreenerDataDisplayFragment screenerDataDisplayFragment = this;
        final ScreenerDataDisplayViewState.Loaded loaded2 = loaded;
        Composer composerStartRestartGroup = composer.startRestartGroup(-179746180);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(screenerDataDisplayFragment) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-179746180, i3, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.DataDisplayList (ScreenerDataDisplayFragment.kt:99)");
                }
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                int i5 = BentoTheme.$stable;
                Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(screenerDataDisplayFragment) | composerStartRestartGroup.changedInstance(loaded2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScreenerDataDisplayFragment.DataDisplayList$lambda$11$lambda$8$lambda$7(loaded2, screenerDataDisplayFragment, (ReorderableLazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                ReorderableLazyColumnKt.ReorderableLazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup.startReplaceGroup(208685661);
                if (loaded.getLocalScreener() == null) {
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                    screenerDataDisplayFragment = this;
                    String string2 = screenerDataDisplayFragment.getString(C11048R.string.general_label_done);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    loaded2 = loaded;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(screenerDataDisplayFragment) | composerStartRestartGroup.changedInstance(loaded2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ScreenerDataDisplayFragment.DataDisplayList$lambda$11$lambda$10$lambda$9(this.f$0, loaded2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, string2, modifierM5143paddingVpY3zN4, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    screenerDataDisplayFragment = this;
                    loaded2 = loaded;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerDataDisplayFragment.DataDisplayList$lambda$12(this.f$0, loaded2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierWeight$default2 = Column5.weight$default(column62, SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion22, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(screenerDataDisplayFragment) | composerStartRestartGroup.changedInstance(loaded2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScreenerDataDisplayFragment.DataDisplayList$lambda$11$lambda$8$lambda$7(loaded2, screenerDataDisplayFragment, (ReorderableLazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    ReorderableLazyColumnKt.ReorderableLazyColumn(modifierWeight$default2, lazyListStateRememberLazyListState2, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    composerStartRestartGroup.startReplaceGroup(208685661);
                    if (loaded.getLocalScreener() == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayList$lambda$11$lambda$8$lambda$7(final ScreenerDataDisplayViewState.Loaded loaded, final ScreenerDataDisplayFragment screenerDataDisplayFragment, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1165962020, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$1$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1165962020, i, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.DataDisplayList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenerDataDisplayFragment.kt:111)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 2, null);
                String string2 = this.this$0.getString(C15652R.string.screener_data_display_name);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                BentoText2.m20747BentoText38GnDrw(string2, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        ReorderableLazyListScope.DefaultImpls.reorderableItems$default(ReorderableLazyColumn, loaded.getVisibleIndicators(), "ScreenerDataDisplayRow", new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScreenerDataDisplayFragment.DataDisplayList$lambda$11$lambda$8$lambda$7$lambda$2(loaded, ((Integer) obj).intValue(), (ColumnInformation) obj2);
            }
        }, null, new Function0() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScreenerDataDisplayFragment.DataDisplayList$lambda$11$lambda$8$lambda$7$lambda$4(this.f$0, loaded, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, false, false, ComposableLambda3.composableLambdaInstance(1367195718, true, new ScreenerDataDisplayFragment6(screenerDataDisplayFragment, loaded)), 424, null);
        final List<ColumnInformation> unselectedIndicators = loaded.getUnselectedIndicators();
        ReorderableLazyColumn.items(unselectedIndicators.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$lambda$11$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                unselectedIndicators.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$lambda$11$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ColumnInformation columnInformation = (ColumnInformation) unselectedIndicators.get(i);
                composer.startReplaceGroup(-131813948);
                ScreenerDataDisplayFragment screenerDataDisplayFragment2 = screenerDataDisplayFragment;
                boolean z = i == loaded.getUnselectedIndicators().size() - 1;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(screenerDataDisplayFragment) | composer.changedInstance(loaded);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ScreenerDataDisplayFragment screenerDataDisplayFragment3 = screenerDataDisplayFragment;
                    final ScreenerDataDisplayViewState.Loaded loaded2 = loaded;
                    objRememberedValue = new Function2<ColumnInformation, Boolean, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$DataDisplayList$1$1$1$6$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnInformation columnInformation2, Boolean bool) {
                            invoke(columnInformation2, bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnInformation columnInfo, boolean z2) {
                            Intrinsics.checkNotNullParameter(columnInfo, "columnInfo");
                            screenerDataDisplayFragment3.getDuxo().markColumnVisibility(loaded2.getVisibleIndicators(), columnInfo, z2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                screenerDataDisplayFragment2.DataDisplayRow(lazyItemScope, null, columnInformation, false, false, z, (Function2) objRememberedValue, composer, (i3 & 14) | 3072, 9);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DataDisplayList$lambda$11$lambda$8$lambda$7$lambda$2(ScreenerDataDisplayViewState.Loaded loaded, int i, ColumnInformation item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getKey() + loaded.getVisibleIndicators().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayList$lambda$11$lambda$8$lambda$7$lambda$4(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayViewState.Loaded loaded, int i, int i2) {
        screenerDataDisplayFragment.getDuxo().updateColumnOrder(loaded.getVisibleIndicators(), i, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayList$lambda$11$lambda$10$lambda$9(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayViewState.Loaded loaded) {
        screenerDataDisplayFragment.getDuxo().saveLocalScreener(loaded.getLocalScreener());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayRow$lambda$14$lambda$13(ColumnInformation columnInformation, boolean z) {
        Intrinsics.checkNotNullParameter(columnInformation, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DataDisplayRow(final LazyItemScope lazyItemScope, Modifier modifier, final ColumnInformation columnInformation, final boolean z, boolean z2, boolean z3, Function2<? super ColumnInformation, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        LazyItemScope lazyItemScope2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        Function2<? super ColumnInformation, ? super Boolean, Unit> function22;
        boolean z6;
        boolean z7;
        Modifier modifier3;
        Modifier modifierM6468shadows4CzXII$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        long jM21373getBg30d7_KjU;
        final Function2<? super ColumnInformation, ? super Boolean, Unit> function23;
        boolean zChangedInstance;
        Object objRememberedValue;
        final boolean z8;
        final Function2<? super ColumnInformation, ? super Boolean, Unit> function24;
        final Modifier modifier4;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(882810008);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            lazyItemScope2 = lazyItemScope;
        } else {
            lazyItemScope2 = lazyItemScope;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(lazyItemScope2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 2) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(columnInformation) ? 256 : 128;
            }
            if ((i2 & 4) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(this) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) != 4793490 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z8 = z4;
                        z9 = z5;
                        function24 = function22;
                    } else {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        z6 = i4 == 0 ? false : z4;
                        z7 = i5 == 0 ? false : z5;
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ScreenerDataDisplayFragment.DataDisplayRow$lambda$14$lambda$13((ColumnInformation) obj, ((Boolean) obj2).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function22 = (Function2) objRememberedValue2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(882810008, i3, -1, "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment.DataDisplayRow (ScreenerDataDisplayFragment.kt:192)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-2023093514);
                        if (z6) {
                            modifier3 = modifier5;
                            modifierM6468shadows4CzXII$default = modifier3;
                        } else {
                            modifierM6468shadows4CzXII$default = Shadow3.m6468shadows4CzXII$default(modifier5, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), null, false, 0L, 0L, 30, null);
                            modifier3 = modifier5;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM6468shadows4CzXII$default);
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
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(LazyItemScope.animateItem$default(lazyItemScope2, SizeKt.m5159requiredHeight3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), null, 2, null), this.rowHeight), null, null, null, 7, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DRAG_12);
                        String string2 = getString(C15652R.string.screener_data_display_row_icon_description);
                        if (z) {
                            composerStartRestartGroup.startReplaceGroup(1141929621);
                            jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1141928788);
                            jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z10 = z6;
                        function23 = function22;
                        boolean z11 = true;
                        BentoIcon2.m20644BentoIconFU0evQE(size12, string2, jM21373getBg30d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable, 56);
                        BentoText2.m20747BentoText38GnDrw(columnInformation.getName(), PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((3670016 & i3) != 1048576) {
                            z11 = false;
                        }
                        zChangedInstance = z11 | composerStartRestartGroup.changedInstance(columnInformation);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ScreenerDataDisplayFragment.DataDisplayRow$lambda$19$lambda$18$lambda$17$lambda$16(function23, columnInformation, ((Boolean) obj).booleanValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 112, 13);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1617373658);
                        if (z7) {
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z10;
                        function24 = function23;
                        modifier4 = modifier3;
                        z9 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ScreenerDataDisplayFragment.DataDisplayRow$lambda$20(this.f$0, lazyItemScope, modifier4, columnInformation, z, z8, z9, function24, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z5 = z3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 4793491) != 4793490) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-2023093514);
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM6468shadows4CzXII$default);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(LazyItemScope.animateItem$default(lazyItemScope2, SizeKt.m5159requiredHeight3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion32, bentoTheme2.getColors(composerStartRestartGroup, i82).m21371getBg0d7_KjU(), null, 2, null), this.rowHeight), null, null, null, 7, null), 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DRAG_12);
                            String string22 = getString(C15652R.string.screener_data_display_row_icon_description);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z102 = z6;
                            function23 = function22;
                            boolean z112 = true;
                            BentoIcon2.m20644BentoIconFU0evQE(size122, string22, jM21373getBg30d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable, 56);
                            BentoText2.m20747BentoText38GnDrw(columnInformation.getName(), PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            if ((3670016 & i3) != 1048576) {
                            }
                            zChangedInstance = z112 | composerStartRestartGroup.changedInstance(columnInformation);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ScreenerDataDisplayFragment.DataDisplayRow$lambda$19$lambda$18$lambda$17$lambda$16(function23, columnInformation, ((Boolean) obj).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 112, 13);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(1617373658);
                                if (z7) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z8 = z102;
                                function24 = function23;
                                modifier4 = modifier3;
                                z9 = z7;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z5 = z3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z5 = z3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataDisplayRow$lambda$19$lambda$18$lambda$17$lambda$16(Function2 function2, ColumnInformation columnInformation, boolean z) {
        function2.invoke(columnInformation, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* compiled from: ScreenerDataDisplayFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$onLocalScreenerSaved$1", m3645f = "ScreenerDataDisplayFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$onLocalScreenerSaved$1 */
    static final class C157011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C157011(Continuation<? super C157011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenerDataDisplayFragment.this.new C157011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C157011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ScreenerDataDisplayFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$onLocalScreenerSaved$1$1", m3645f = "ScreenerDataDisplayFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayFragment$onLocalScreenerSaved$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ScreenerDataDisplayFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ScreenerDataDisplayFragment screenerDataDisplayFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = screenerDataDisplayFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.requireBaseActivity().onBackPressed();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ScreenerDataDisplayFragment.this, null);
                this.label = 1;
                if (Suspend.withMain$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocalScreenerSaved() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C157011(null), 3, null);
    }

    /* compiled from: ScreenerDataDisplayFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayFragment;", "Lcom/robinhood/android/equities/contracts/ScreenerDataDisplayKey;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ScreenerDataDisplayFragment, ScreenerDataDisplayKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ScreenerDataDisplayKey screenerDataDisplayKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, screenerDataDisplayKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenerDataDisplayKey getArgs(ScreenerDataDisplayFragment screenerDataDisplayFragment) {
            return (ScreenerDataDisplayKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, screenerDataDisplayFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ScreenerDataDisplayFragment newInstance(ScreenerDataDisplayKey screenerDataDisplayKey) {
            return (ScreenerDataDisplayFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, screenerDataDisplayKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ScreenerDataDisplayFragment screenerDataDisplayFragment, ScreenerDataDisplayKey screenerDataDisplayKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, screenerDataDisplayFragment, screenerDataDisplayKey);
        }
    }
}
