package com.robinhood.android.internalassettransfers.review.assets;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets3;
import com.robinhood.android.internalassettransfers.review.models.UiAssets2;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferReviewAssets.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"InternalAssetTransferReviewAssets", "", "viewState", "Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsViewState;", "onNavigationCloseClick", "Lkotlin/Function0;", "onDoneButtonClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalAssetTransferReviewNontransferableAssetsToolbar", "(Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "INTERNAL_ASSET_TRANSFER_ASSET_LIST_DESCRIPTION", "", "InternalAssetTransferReviewAssetListContent", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewAssets3 {
    private static final String INTERNAL_ASSET_TRANSFER_ASSET_LIST_DESCRIPTION = "InternalAssetTransferAssetListDescription";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferReviewAssetListContent$lambda$2(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, Function0 function0, int i, Composer composer, int i2) {
        InternalAssetTransferReviewAssetListContent(internalAssetTransferReviewAssetsViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferReviewAssets$lambda$0(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferReviewAssets(internalAssetTransferReviewAssetsViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferReviewNontransferableAssetsToolbar$lambda$1(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, Function0 function0, int i, Composer composer, int i2) {
        InternalAssetTransferReviewNontransferableAssetsToolbar(internalAssetTransferReviewAssetsViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferReviewAssets(final InternalAssetTransferReviewAssetsViewState viewState, final Function0<Unit> onNavigationCloseClick, final Function0<Unit> onDoneButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onNavigationCloseClick, "onNavigationCloseClick");
        Intrinsics.checkNotNullParameter(onDoneButtonClick, "onDoneButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-985226830);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavigationCloseClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDoneButtonClick) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-985226830, i3, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets (InternalAssetTransferReviewAssets.kt:45)");
                }
                int i5 = ((i3 >> 9) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(559982966, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewAssets.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(559982966, i6, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets.<anonymous> (InternalAssetTransferReviewAssets.kt:49)");
                        }
                        InternalAssetTransferReviewAssets3.InternalAssetTransferReviewNontransferableAssetsToolbar(viewState, onNavigationCloseClick, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-474187647, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewAssets.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-474187647, i6, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets.<anonymous> (InternalAssetTransferReviewAssets.kt:55)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = viewState;
                        Function0<Unit> function0 = onDoneButtonClick;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        InternalAssetTransferReviewAssets3.InternalAssetTransferReviewAssetListContent(internalAssetTransferReviewAssetsViewState, function0, composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 444);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferReviewAssets3.InternalAssetTransferReviewAssets$lambda$0(viewState, onNavigationCloseClick, onDoneButtonClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 9) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(559982966, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewAssets.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(559982966, i6, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets.<anonymous> (InternalAssetTransferReviewAssets.kt:49)");
                    }
                    InternalAssetTransferReviewAssets3.InternalAssetTransferReviewNontransferableAssetsToolbar(viewState, onNavigationCloseClick, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-474187647, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewAssets.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-474187647, i6, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssets.<anonymous> (InternalAssetTransferReviewAssets.kt:55)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                    InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = viewState;
                    Function0<Unit> function0 = onDoneButtonClick;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    InternalAssetTransferReviewAssets3.InternalAssetTransferReviewAssetListContent(internalAssetTransferReviewAssetsViewState, function0, composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 444);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferReviewNontransferableAssetsToolbar(final InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1152957872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferReviewAssetsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1152957872, i2, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewNontransferableAssetsToolbar (InternalAssetTransferReviewAssets.kt:72)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1913212707, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewNontransferableAssetsToolbar.1

                /* compiled from: InternalAssetTransferReviewAssets.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewNontransferableAssetsToolbar$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[UiAssets2.values().length];
                        try {
                            iArr[UiAssets2.TRANSFERABLE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UiAssets2.NON_TRANSFERABLE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    String strStringResource;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1913212707, i3, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewNontransferableAssetsToolbar.<anonymous> (InternalAssetTransferReviewAssets.kt:74)");
                    }
                    if (!internalAssetTransferReviewAssetsViewState.getFromHistory()) {
                        int i4 = WhenMappings.$EnumSwitchMapping$0[internalAssetTransferReviewAssetsViewState.getAssets().getTransferability().ordinal()];
                        if (i4 == 1) {
                            composer3.startReplaceGroup(351414792);
                            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_transferable_assets_title_text, composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (i4 != 2) {
                                composer3.startReplaceGroup(351411939);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(351421035);
                            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_nontransferable_assets_title_text, composer3, 0);
                            composer3.endReplaceGroup();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextM(), composer3, 0, 0, 8186);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1083563697, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewNontransferableAssetsToolbar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1083563697, i3, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewNontransferableAssetsToolbar.<anonymous> (InternalAssetTransferReviewAssets.kt:90)");
                    }
                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1914);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferReviewAssets3.InternalAssetTransferReviewNontransferableAssetsToolbar$lambda$1(internalAssetTransferReviewAssetsViewState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferReviewAssetListContent(final InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1940004651);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferReviewAssetsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1940004651, i2, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent (InternalAssetTransferReviewAssets.kt:104)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-546405536, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt.InternalAssetTransferReviewAssetListContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-546405536, i3, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent.<anonymous> (InternalAssetTransferReviewAssets.kt:213)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_assets_done_button, composer2, 0), modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU()), null, null, false, null, composer2, 0, 0, 7800);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(884911635, true, new C193052(internalAssetTransferReviewAssetsViewState), composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferReviewAssets3.InternalAssetTransferReviewAssetListContent$lambda$2(internalAssetTransferReviewAssetsViewState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InternalAssetTransferReviewAssets.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2 */
    static final class C193052 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ InternalAssetTransferReviewAssetsViewState $viewState;

        C193052(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState) {
            this.$viewState = internalAssetTransferReviewAssetsViewState;
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
                ComposerKt.traceEventStart(884911635, i, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent.<anonymous> (InternalAssetTransferReviewAssets.kt:107)");
            }
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(context);
            final InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = this.$viewState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternalAssetTransferReviewAssets3.C193052.invoke$lambda$2$lambda$1(internalAssetTransferReviewAssetsViewState, context, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, Context context, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if (internalAssetTransferReviewAssetsViewState.getAssets().getTransferability() == UiAssets2.NON_TRANSFERABLE) {
                LazyListScope.item$default(LazyColumn, InternalAssetTransferReviewAssets3.INTERNAL_ASSET_TRANSFER_ASSET_LIST_DESCRIPTION, null, ComposableLambda3.composableLambdaInstance(-1319959741, true, new InternalAssetTransferReviewAssets4(context)), 2, null);
            }
            if (internalAssetTransferReviewAssetsViewState.getAssets().getCash().compareTo(BigDecimal.ZERO) != 0) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-86438918, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$1$1$2
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
                            ComposerKt.traceEventStart(-86438918, i, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferReviewAssets.kt:138)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((internalAssetTransferReviewAssetsViewState.getAssets().getTransferability() != UiAssets2.TRANSFERABLE || internalAssetTransferReviewAssetsViewState.getFromHistory()) ? internalAssetTransferReviewAssetsViewState.getIsMarginBalance() ? C18977R.string.f4227x455b14ff : C18977R.string.f4226xdcdce8da : C18977R.string.f4225x5a267c90, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8188);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1410640655, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$1$1$3
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
                            ComposerKt.traceEventStart(-1410640655, i, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferReviewAssets.kt:159)");
                        }
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, StringResources_androidKt.stringResource(internalAssetTransferReviewAssetsViewState.getIsMarginBalance() ? C18977R.string.internal_asset_transfer_review_assets_margin_primary_text : C18977R.string.internal_asset_transfer_review_assets_cash_primary_text, composer, 0), null, null, new BentoBaseRowState.Meta.SingleLine(Money.format$default(Money3.toMoney(internalAssetTransferReviewAssetsViewState.getAssets().getCash(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)), null, false, false, false, 0L, null, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 6, 0, 4058);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            if (!internalAssetTransferReviewAssetsViewState.getAssets().getEquities().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, InternalAssetTransferReviewAssets.INSTANCE.m2109x397191f8(), 3, null);
                final List<UiEligibleAsset> equities = internalAssetTransferReviewAssetsViewState.getAssets().getEquities();
                final C19300x67c043a3 c19300x67c043a3 = new Function1() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(UiEligibleAsset uiEligibleAsset) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((UiEligibleAsset) obj);
                    }
                };
                LazyColumn.items(equities.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c19300x67c043a3.invoke(equities.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws Resources.NotFoundException {
                        int i3;
                        String strStringResource;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                        UiEligibleAsset uiEligibleAsset = (UiEligibleAsset) equities.get(i);
                        composer.startReplaceGroup(1520677463);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String symbol = uiEligibleAsset.getSymbol();
                        String instrumentName = uiEligibleAsset.getInstrumentName();
                        if (Intrinsics.areEqual(uiEligibleAsset.getShares(), BigDecimal.ONE)) {
                            composer.startReplaceGroup(1521007054);
                            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_assets_share_singular_text, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(uiEligibleAsset.getShares()).toPlainString()}, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(1521324587);
                            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_assets_share_plural_text, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(uiEligibleAsset.getShares()).toPlainString()}, composer, 0);
                            composer.endReplaceGroup();
                        }
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierFillMaxWidth$default, null, symbol, instrumentName, null, new BentoBaseRowState.Meta.SingleLine(strStringResource), null, false, false, false, 0L, null, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 6, 0, 4050);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            return Unit.INSTANCE;
        }
    }
}
