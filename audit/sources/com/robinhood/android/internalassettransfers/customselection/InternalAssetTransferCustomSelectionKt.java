package com.robinhood.android.internalassettransfers.customselection;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0014\u001a$\u0010\u0016\u001a\u00020\u000b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001c\u0010\u001a\u001a\u00020\u000b*\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001ac\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0$H\u0007¢\u0006\u0002\u0010&\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"LazyListTitleKey", "", "LazyListSpace1Key", "LazyListSearchKey", "LazyListInfoBannerKey", "LazyListSpace3Key", "LazyListCashMarginKey", "LazyListSpace4Key", "LazyListStocksEtfKey", "LazyListSpace5Key", "InternalAssetTransferCustomSelection", "", "viewState", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;", "callbacks", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalAssetTransferCustomSelectionToolbar", "(Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionCallbacks;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferCustomSelectionContent", "itemCashMargin", "Landroidx/compose/foundation/lazy/LazyListScope;", "context", "Landroid/content/Context;", "itemStocksEtfs", "CustomBentoBaseRow", "primaryText", "secondaryText", "metaText", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "onCheck", "Lkotlin/Function0;", "onClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferCustomSelectionKt {
    private static final String LazyListCashMarginKey = "CashMarginKey";
    private static final String LazyListInfoBannerKey = "InfoBannerKey";
    private static final String LazyListSearchKey = "SearchKey";
    private static final String LazyListSpace1Key = "Space 1";
    private static final String LazyListSpace3Key = "Space 3";
    private static final String LazyListSpace4Key = "Space 4";
    private static final String LazyListSpace5Key = "Space 5";
    private static final String LazyListStocksEtfKey = "StocksEtfKey";
    private static final String LazyListTitleKey = "TitleKey";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomBentoBaseRow$lambda$14(String str, String str2, String str3, Modifier modifier, boolean z, ToggleableState toggleableState, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        CustomBentoBaseRow(str, str2, str3, modifier, z, toggleableState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCustomSelection$lambda$0(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferCustomSelection(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCustomSelectionContent$lambda$5(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, int i, Composer composer, int i2) {
        InternalAssetTransferCustomSelectionContent(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCustomSelectionToolbar$lambda$2(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, int i, Composer composer, int i2) {
        InternalAssetTransferCustomSelectionToolbar(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferCustomSelection(final InternalAssetTransferCustomSelectionViewState viewState, final InternalAssetTransferCustomSelectionCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-53300621);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-53300621, i3, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection (InternalAssetTransferCustomSelection.kt:86)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-830409425, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection.1
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
                            ComposerKt.traceEventStart(-830409425, i6, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous> (InternalAssetTransferCustomSelection.kt:91)");
                        }
                        InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionToolbar(viewState, callbacks, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-197705468, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection.2
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
                            ComposerKt.traceEventStart(-197705468, i6, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous> (InternalAssetTransferCustomSelection.kt:94)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState = viewState;
                        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = callbacks;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
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
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1373170997, true, new C19157x9395f6c3(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks), composer3, 54), ComposableLambda3.rememberComposableLambda(344561570, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelection$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(344561570, i7, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:103)");
                                }
                                InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionContent(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3504, 1);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 6) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-830409425, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection.1
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
                        ComposerKt.traceEventStart(-830409425, i6, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous> (InternalAssetTransferCustomSelection.kt:91)");
                    }
                    InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionToolbar(viewState, callbacks, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-197705468, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelection.2
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
                        ComposerKt.traceEventStart(-197705468, i6, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous> (InternalAssetTransferCustomSelection.kt:94)");
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState = viewState;
                    final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = callbacks;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
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
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1373170997, true, new C19157x9395f6c3(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks), composer3, 54), ComposableLambda3.rememberComposableLambda(344561570, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelection$2$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                            invoke(boxScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(344561570, i7, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:103)");
                            }
                            InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionContent(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3504, 1);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
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
    public static final void InternalAssetTransferCustomSelectionToolbar(final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-858668509);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferCustomSelectionCallbacks) : composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-858668509, i2, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionToolbar (InternalAssetTransferCustomSelection.kt:126)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            ComposableSingletons$InternalAssetTransferCustomSelectionKt composableSingletons$InternalAssetTransferCustomSelectionKt = ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$InternalAssetTransferCustomSelectionKt.m2083xcc3feadd(), null, ComposableLambda3.rememberComposableLambda(989679756, true, new C19161x1fcaa93a(internalAssetTransferCustomSelectionCallbacks), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2000216715, true, new C19162x1fcaa93b(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks), composerStartRestartGroup, 54), composableSingletons$InternalAssetTransferCustomSelectionKt.m2079xba10d66f(), false, false, null, Color.m6701boximpl(jM21371getBg0d7_KjU), 0L, null, composer2, 28038, 0, 1762);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionToolbar$lambda$2(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferCustomSelectionContent(final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1957301605);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferCustomSelectionCallbacks) : composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957301605, i2, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionContent (InternalAssetTransferCustomSelection.kt:176)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z = true;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionViewState);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !composerStartRestartGroup.changedInstance(internalAssetTransferCustomSelectionCallbacks))) {
                z = false;
            }
            boolean zChangedInstance2 = zChangedInstance | z | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionContent$lambda$4$lambda$3(context, internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferCustomSelectionKt.InternalAssetTransferCustomSelectionContent$lambda$5(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCustomSelectionContent$lambda$4$lambda$3(Context context, InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$InternalAssetTransferCustomSelectionKt composableSingletons$InternalAssetTransferCustomSelectionKt = ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, LazyListTitleKey, null, composableSingletons$InternalAssetTransferCustomSelectionKt.m2085x85624ba(), 2, null);
        LazyListScope.item$default(LazyColumn, LazyListSpace1Key, null, composableSingletons$InternalAssetTransferCustomSelectionKt.m2080x130c3a6c(), 2, null);
        LazyListScope.item$default(LazyColumn, LazyListSearchKey, null, ComposableLambda3.composableLambdaInstance(184623864, true, new C19159xfb81b9c5(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks)), 2, null);
        LazyListScope.item$default(LazyColumn, LazyListInfoBannerKey, null, ComposableLambda3.composableLambdaInstance(1850497559, true, new C19160xfb81b9c6(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks)), 2, null);
        LazyListScope.item$default(LazyColumn, LazyListSpace3Key, null, composableSingletons$InternalAssetTransferCustomSelectionKt.m2082x6a9b903f(), 2, null);
        itemCashMargin(LazyColumn, context, internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks);
        itemStocksEtfs(LazyColumn, internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks);
        return Unit.INSTANCE;
    }

    private static final void itemCashMargin(LazyListScope lazyListScope, final Context context, final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        if (internalAssetTransferCustomSelectionViewState.isCashVisible()) {
            LazyListScope.item$default(lazyListScope, LazyListCashMarginKey, null, ComposableLambda3.composableLambdaInstance(-627951357, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.itemCashMargin.1
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-627951357, i, -1, "com.robinhood.android.internalassettransfers.customselection.itemCashMargin.<anonymous> (InternalAssetTransferCustomSelection.kt:244)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState2 = internalAssetTransferCustomSelectionViewState;
                    Context context2 = context;
                    InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks2 = internalAssetTransferCustomSelectionCallbacks;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
                    String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_cash_margin_title_text, composer, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8186);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                    Integer cashBalanceMetaStringRes = internalAssetTransferCustomSelectionViewState2.getCashBalanceMetaStringRes();
                    composer.startReplaceGroup(1389124559);
                    String strStringResource2 = cashBalanceMetaStringRes == null ? null : StringResources_androidKt.stringResource(cashBalanceMetaStringRes.intValue(), new Object[]{Money.format$default(Money3.toMoney(internalAssetTransferCustomSelectionViewState2.getSelectedCashBalance(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)}, composer, 0);
                    composer.endReplaceGroup();
                    if (strStringResource2 == null) {
                        strStringResource2 = "";
                    }
                    LocalShowPlaceholder.Loadable(internalAssetTransferCustomSelectionViewState2.getLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1988922743, true, new InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1(internalAssetTransferCustomSelectionViewState2, context2, strStringResource2, internalAssetTransferCustomSelectionCallbacks2), composer, 54), composer, 3072, 6);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 2, null);
            LazyListScope.item$default(lazyListScope, LazyListSpace4Key, null, ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE.m2081x46f0096a(), 2, null);
        }
    }

    private static final void itemStocksEtfs(LazyListScope lazyListScope, InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        if (internalAssetTransferCustomSelectionViewState.getEquityRows().isEmpty()) {
            return;
        }
        ComposableSingletons$InternalAssetTransferCustomSelectionKt composableSingletons$InternalAssetTransferCustomSelectionKt = ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE;
        LazyListScope.item$default(lazyListScope, LazyListStocksEtfKey, null, composableSingletons$InternalAssetTransferCustomSelectionKt.m2087xd3d7512f(), 2, null);
        LazyListScope.item$default(lazyListScope, LazyListSpace5Key, null, composableSingletons$InternalAssetTransferCustomSelectionKt.m2086x70964ce9(), 2, null);
        final ImmutableList<EquityRow> equityRows = internalAssetTransferCustomSelectionViewState.getEquityRows();
        final C19147x36df14c7 c19147x36df14c7 = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemStocksEtfs$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(EquityRow equityRow) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((EquityRow) obj);
            }
        };
        lazyListScope.items(equityRows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemStocksEtfs$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c19147x36df14c7.invoke(equityRows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemStocksEtfs$$inlined$items$default$4
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
                final EquityRow equityRow = (EquityRow) equityRows.get(i);
                composer.startReplaceGroup(-28964384);
                String title = equityRow.getTitle();
                String subtitle = equityRow.getSubtitle();
                String string2 = StringResources6.getText(equityRow.getShareString(), composer, StringResource.$stable).toString();
                ToggleableState checkboxState = equityRow.getCheckboxState();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(internalAssetTransferCustomSelectionCallbacks) | composer.changedInstance(equityRow);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks2 = internalAssetTransferCustomSelectionCallbacks;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemStocksEtfs$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            internalAssetTransferCustomSelectionCallbacks2.onEquityCheckClicked(equityRow.getInstrumentId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(internalAssetTransferCustomSelectionCallbacks) | composer.changedInstance(equityRow);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks3 = internalAssetTransferCustomSelectionCallbacks;
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemStocksEtfs$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            internalAssetTransferCustomSelectionCallbacks3.onEquityRowClicked(equityRow.getInstrumentId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow(title, subtitle, string2, null, false, checkboxState, function0, (Function0) objRememberedValue2, composer, 0, 24);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3 A[PHI: r14
      0x00a3: PHI (r14v12 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:56:0x00a1, B:66:0x00b9, B:65:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomBentoBaseRow(final String primaryText, final String secondaryText, final String metaText, Modifier modifier, boolean z, ToggleableState toggleableState, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Function0<Unit> function03;
        int i7;
        Function0<Unit> function04;
        final ToggleableState toggleableState2;
        final Function0<Unit> function05;
        Function0<Unit> function06;
        Object objRememberedValue;
        final boolean z3;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1052688680);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(primaryText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(secondaryText) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(metaText) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i9 = 196608;
                if (i5 != 0) {
                    i3 |= i9;
                } else if ((196608 & i) == 0) {
                    i9 = composerStartRestartGroup.changed(toggleableState == null ? -1 : toggleableState.ordinal()) ? 131072 : 65536;
                    i3 |= i9;
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                    if ((1572864 & i) == 0) {
                        function03 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        function04 = function02;
                    } else {
                        function04 = function02;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? true : z2;
                        toggleableState2 = i5 == 0 ? ToggleableState.Off : toggleableState;
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function05 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function05 = function03;
                        }
                        if (i7 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function06 = (Function0) objRememberedValue3;
                        } else {
                            function06 = function04;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1052688680, i3, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow (InternalAssetTransferCustomSelection.kt:321)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier4, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, Color.INSTANCE.m6726getUnspecified0d7_KjU(), 3, null), z4, null, null, function06, 24, null);
                        final Modifier modifier5 = modifier4;
                        z3 = z4;
                        Function0<Unit> function09 = function06;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(modifierM4891clickableO2vRcR0$default, null, ComposableLambda3.rememberComposableLambda(-728107804, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-728107804, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:329)");
                                }
                                ToggleableState toggleableState3 = toggleableState2;
                                Function0<Unit> function010 = function05;
                                Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier5, false, null, 3, null);
                                boolean z5 = z3;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU();
                                long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                long jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                                CheckboxKt.TriStateCheckbox(toggleableState3, function010, modifierWithBentoPlaceholder$default, z5, new CheckboxColors(jM21371getBg0d7_KjU, jM6725getTransparent0d7_KjU, jM21425getFg0d7_KjU, jM21371getBg0d7_KjU2, bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), jM21425getFg0d7_KjU2, jM21427getFg30d7_KjU, bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), null), null, composer3, 0, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-79880347, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                long jM21427getFg30d7_KjU;
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-79880347, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:352)");
                                }
                                String str = primaryText;
                                if (z3) {
                                    composer3.startReplaceGroup(544401191);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(544402024);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(568347110, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                long jM21427getFg30d7_KjU;
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(568347110, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:359)");
                                }
                                String str = secondaryText;
                                if (z3) {
                                    composer3.startReplaceGroup(720729513);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(720730377);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1216574567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.7
                            public final void invoke(Composer composer3, int i10) {
                                long jM21427getFg30d7_KjU;
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1216574567, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:366)");
                                }
                                if (!StringsKt.isBlank(metaText)) {
                                    boolean z5 = z3;
                                    String str = metaText;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    TextStyle textM = bentoTheme.getTypography(composer3, i11).getTextM();
                                    if (z5) {
                                        composer3.startReplaceGroup(-1543174744);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(-1543173911);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_RIGHT_16.getResourceId(), composer3, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(row6.align(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion, false, 1, null), companion2.getCenterVertically()), C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), composer3, 48, 0);
                                    composer3.endNode();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE.m2084xe1c7f749(), true, false, true, null, composer2, 920350080, 0, 1026);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        function07 = function05;
                        function08 = function09;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        toggleableState2 = toggleableState;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        z3 = z2;
                        function08 = function04;
                        function07 = function03;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow$lambda$14(primaryText, secondaryText, metaText, modifier3, z3, toggleableState2, function07, function08, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function03 = function0;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier4, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, Color.INSTANCE.m6726getUnspecified0d7_KjU(), 3, null), z4, null, null, function06, 24, null);
                    final Modifier modifier52 = modifier4;
                    z3 = z4;
                    Function0<Unit> function092 = function06;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifierM4891clickableO2vRcR0$default2, null, ComposableLambda3.rememberComposableLambda(-728107804, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-728107804, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:329)");
                            }
                            ToggleableState toggleableState3 = toggleableState2;
                            Function0<Unit> function010 = function05;
                            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier52, false, null, 3, null);
                            boolean z5 = z3;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU();
                            long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                            long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                            long jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                            CheckboxKt.TriStateCheckbox(toggleableState3, function010, modifierWithBentoPlaceholder$default, z5, new CheckboxColors(jM21371getBg0d7_KjU, jM6725getTransparent0d7_KjU, jM21425getFg0d7_KjU, jM21371getBg0d7_KjU2, bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), jM21425getFg0d7_KjU2, jM21427getFg30d7_KjU, bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i11).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), null), null, composer3, 0, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-79880347, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            long jM21427getFg30d7_KjU;
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-79880347, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:352)");
                            }
                            String str = primaryText;
                            if (z3) {
                                composer3.startReplaceGroup(544401191);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                            } else {
                                composer3.startReplaceGroup(544402024);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(568347110, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            long jM21427getFg30d7_KjU;
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(568347110, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:359)");
                            }
                            String str = secondaryText;
                            if (z3) {
                                composer3.startReplaceGroup(720729513);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                            } else {
                                composer3.startReplaceGroup(720730377);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1216574567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow.7
                        public final void invoke(Composer composer3, int i10) {
                            long jM21427getFg30d7_KjU;
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1216574567, i10, -1, "com.robinhood.android.internalassettransfers.customselection.CustomBentoBaseRow.<anonymous> (InternalAssetTransferCustomSelection.kt:366)");
                            }
                            if (!StringsKt.isBlank(metaText)) {
                                boolean z5 = z3;
                                String str = metaText;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                TextStyle textM = bentoTheme.getTypography(composer3, i11).getTextM();
                                if (z5) {
                                    composer3.startReplaceGroup(-1543174744);
                                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(-1543173911);
                                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_RIGHT_16.getResourceId(), composer3, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(row6.align(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion, false, 1, null), companion2.getCenterVertically()), C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU(), composer3, 48, 0);
                                composer3.endNode();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), ComposableSingletons$InternalAssetTransferCustomSelectionKt.INSTANCE.m2084xe1c7f749(), true, false, true, null, composer2, 920350080, 0, 1026);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    function07 = function05;
                    function08 = function092;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            int i92 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function03 = function0;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        int i922 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function03 = function0;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
