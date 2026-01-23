package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.FuturesDetailRegularTopBar;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.sharedfuturesui.PipButton;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailRegularTopBar.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"FuturesDetailRegularTopBar", "", "topBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$RegularTopBarData;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "onBackClicked", "Lkotlin/Function0;", "onAddToWatchlistClicked", "Lkotlin/Function2;", "", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "onStartPipMode", "Lkotlin/Function1;", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$RegularTopBarData;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailRegularTopBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailRegularTopBar$lambda$0(FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData, LazyListState lazyListState, TopBarScrollState topBarScrollState, Function0 function0, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailRegularTopBar(regularTopBarData, lazyListState, topBarScrollState, function0, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDetailRegularTopBar(final FuturesDetailViewState.TopBarData.RegularTopBarData topBarData, final LazyListState lazyListState, final TopBarScrollState topBarScrollState, final Function0<Unit> onBackClicked, final Function2<? super Boolean, ? super FuturesContract, Unit> onAddToWatchlistClicked, final Function1<? super UUID, Unit> onStartPipMode, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onAddToWatchlistClicked, "onAddToWatchlistClicked");
        Intrinsics.checkNotNullParameter(onStartPipMode, "onStartPipMode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1095344884);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(topBarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddToWatchlistClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStartPipMode) ? 131072 : 65536;
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
                    ComposerKt.traceEventStart(-1095344884, i3, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar (FuturesDetailRegularTopBar.kt:36)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-671878535, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt.FuturesDetailRegularTopBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-671878535, i5, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar.<anonymous> (FuturesDetailRegularTopBar.kt:48)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData = topBarData;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        StringResource title = regularTopBarData.getTitle();
                        int i6 = StringResource.$stable;
                        String text = StringResources2.getText(title, composer3, i6);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8190);
                        BentoText2.m20747BentoText38GnDrw(StringResources2.getText(regularTopBarData.getSubtitle(), composer3, i6), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier5, lazyListState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1809754163, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt.FuturesDetailRegularTopBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1809754163, i5, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar.<anonymous> (FuturesDetailRegularTopBar.kt:43)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackClicked, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-710688082, true, new C170563(topBarData, onStartPipMode, onAddToWatchlistClicked), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12586374, 0, 1904);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesDetailRegularTopBar.FuturesDetailRegularTopBar$lambda$0(topBarData, lazyListState, topBarScrollState, onBackClicked, onAddToWatchlistClicked, onStartPipMode, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-671878535, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt.FuturesDetailRegularTopBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-671878535, i5, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar.<anonymous> (FuturesDetailRegularTopBar.kt:48)");
                    }
                    Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData = topBarData;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    StringResource title = regularTopBarData.getTitle();
                    int i6 = StringResource.$stable;
                    String text = StringResources2.getText(title, composer3, i6);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8190);
                    BentoText2.m20747BentoText38GnDrw(StringResources2.getText(regularTopBarData.getSubtitle(), composer3, i6), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier52, lazyListState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1809754163, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt.FuturesDetailRegularTopBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1809754163, i5, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar.<anonymous> (FuturesDetailRegularTopBar.kt:43)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackClicked, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-710688082, true, new C170563(topBarData, onStartPipMode, onAddToWatchlistClicked), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12586374, 0, 1904);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: FuturesDetailRegularTopBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt$FuturesDetailRegularTopBar$3 */
    static final class C170563 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Function2<Boolean, FuturesContract, Unit> $onAddToWatchlistClicked;
        final /* synthetic */ Function1<UUID, Unit> $onStartPipMode;
        final /* synthetic */ FuturesDetailViewState.TopBarData.RegularTopBarData $topBarData;

        /* JADX WARN: Multi-variable type inference failed */
        C170563(FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData, Function1<? super UUID, Unit> function1, Function2<? super Boolean, ? super FuturesContract, Unit> function2) {
            this.$topBarData = regularTopBarData;
            this.$onStartPipMode = function1;
            this.$onAddToWatchlistClicked = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData, Function1 function1) {
            UUID selectedContractId = regularTopBarData.getSelectedContractId();
            if (selectedContractId != null) {
                function1.invoke(selectedContractId);
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-710688082, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBar.<anonymous> (FuturesDetailRegularTopBar.kt:64)");
            }
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_PICTURE_IN_PICTURE;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$topBarData) | composer.changed(this.$onStartPipMode);
            final FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData = this.$topBarData;
            final Function1<UUID, Unit> function1 = this.$onStartPipMode;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt$FuturesDetailRegularTopBar$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesDetailRegularTopBar.C170563.invoke$lambda$1$lambda$0(regularTopBarData, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PipButton.PipButton(action, (Function0) objRememberedValue, null, composer, 6, 4);
            final FuturesContract contractToAddToLists = this.$topBarData.getContractToAddToLists();
            if (contractToAddToLists != null) {
                FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData2 = this.$topBarData;
                final Function2<Boolean, FuturesContract, Unit> function2 = this.$onAddToWatchlistClicked;
                final boolean zIsContractInUserLists = regularTopBarData2.isContractInUserLists();
                BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(zIsContractInUserLists ? ServerToBentoAssetMapper2.BUBBLE_CHECKED_24 : ServerToBentoAssetMapper2.BUBBLE_PLUS_24);
                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                Color.Companion companion = Color.INSTANCE;
                long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_add_to_list, composer, 0);
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(function2) | composer.changed(zIsContractInUserLists) | composer.changedInstance(contractToAddToLists);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailRegularTopBarKt$FuturesDetailRegularTopBar$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesDetailRegularTopBar.C170563.invoke$lambda$4$lambda$3$lambda$2(function2, zIsContractInUserLists, contractToAddToLists);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, heroSize24, strStringResource, null, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), null, false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 113246208, 0, 1592);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function2 function2, boolean z, FuturesContract futuresContract) {
            function2.invoke(Boolean.valueOf(z), futuresContract);
            return Unit.INSTANCE;
        }
    }
}
