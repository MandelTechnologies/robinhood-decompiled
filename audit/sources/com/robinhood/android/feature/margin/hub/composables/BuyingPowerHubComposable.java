package com.robinhood.android.feature.margin.hub.composables;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable;
import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.DataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuyingPowerHubComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"BuyingPowerHubComposable", "", "buyingPowerHubResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "entryPoint", "", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BuyingPowerHubLoadingScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuyingPowerHubComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BuyingPowerHubComposable$lambda$0(BuyingPowerHubView buyingPowerHubView, String str, SduiActionHandler sduiActionHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BuyingPowerHubComposable(buyingPowerHubView, str, sduiActionHandler, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BuyingPowerHubLoadingScreen$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        BuyingPowerHubLoadingScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BuyingPowerHubComposable(final BuyingPowerHubView buyingPowerHubResponse, final String str, final SduiActionHandler<? super BuyingPowerHubAction> actionHandler, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(buyingPowerHubResponse, "buyingPowerHubResponse");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-261740016);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(buyingPowerHubResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-261740016, i3, -1, "com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable (BuyingPowerHubComposable.kt:44)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-305247643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt.BuyingPowerHubComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-305247643, i5, -1, "com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable.<anonymous> (BuyingPowerHubComposable.kt:45)");
                    }
                    Screen screen = new Screen(Screen.Name.BUYING_POWER_HUB, null, null, null, 14, null);
                    BuyingPowerHubContext loggingContext = buyingPowerHubResponse.getLoggingContext();
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor("buying-power", screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -3, -1, 16383, null), null, null, 52, null);
                    final Modifier modifier2 = modifier;
                    final BuyingPowerHubView buyingPowerHubView = buyingPowerHubResponse;
                    final SduiActionHandler<BuyingPowerHubAction> sduiActionHandler = actionHandler;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-647421222, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt.BuyingPowerHubComposable.1.1
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
                                ComposerKt.traceEventStart(-647421222, i6, -1, "com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable.<anonymous>.<anonymous> (BuyingPowerHubComposable.kt:56)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(modifier2, userInteractionEventDescriptor, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
                            BuyingPowerHubView buyingPowerHubView2 = buyingPowerHubView;
                            SduiActionHandler<BuyingPowerHubAction> sduiActionHandler2 = sduiActionHandler;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                            ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.listOf(buyingPowerHubView2.getContent()));
                            composer3.startReplaceGroup(-1772220517);
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            SduiColumns.SduiColumn(immutableList, BuyingPowerHubAction.class, modifierVerticalScroll$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100663296, 0);
                            composer3.endReplaceGroup();
                            UIComponent<BuyingPowerHubAction> footer = buyingPowerHubView2.getFooter();
                            composer3.startReplaceGroup(1006153528);
                            if (footer != null) {
                                ImmutableList immutableList2 = extensions2.toImmutableList(CollectionsKt.listOf(footer));
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                composer3.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList2, BuyingPowerHubAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100663296, 0);
                                composer3.endReplaceGroup();
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyingPowerHubComposable.BuyingPowerHubComposable$lambda$0(buyingPowerHubResponse, str, actionHandler, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BuyingPowerHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt$BuyingPowerHubLoadingScreen$1 */
    static final class C168421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;

        C168421(Modifier modifier) {
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212150783, i, -1, "com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubLoadingScreen.<anonymous> (BuyingPowerHubComposable.kt:92)");
            }
            Text text = new Text(new PlainText("---------\n---------"), TextStyle.DISPLAY_LARGE, null, null, null, 28, null);
            DataRowCondensed dataRowCondensed = new DataRowCondensed("--------- ----", null, "---------", 2, null);
            DataRowCondensed dataRowCondensed2 = new DataRowCondensed("-----", null, "---------", 2, null);
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 100);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt$BuyingPowerHubLoadingScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BuyingPowerHubComposable.C168421.invoke$lambda$1$lambda$0(((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            List listListOf = CollectionsKt.listOf((Object[]) new UIComponent[]{text, dataRowCondensed, dataRowCondensed2, new InfoBanner(null, new RichText(CollectionsKt.joinToString$default(primitiveRanges2Until, "", null, null, 0, null, (Function1) objRememberedValue, 30, null), CollectionsKt.emptyList()), Icon.LIGHTNING_24, "----- ----", null, false, null, null, null, 497, null)});
            LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
            BuyingPowerHubView buyingPowerHubView = new BuyingPowerHubView("123456", new Container(listListOf, null, new PlatformLayoutAxis(layoutAxis, layoutAxis), PrimaryAxisAlignment.CENTER, null, 18, null), new Button("------- -----", null, new BuyingPowerHubAction.Dismiss(new DismissAction(false)), false, null, null, null, null, null, null, 1018, null), new BuyingPowerHubContext(null, null, false, false, 0 == true ? 1 : 0, 31, null), null, 16, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt$BuyingPowerHubLoadingScreen$1$2$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(BuyingPowerHubAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BuyingPowerHubComposable.BuyingPowerHubComposable(buyingPowerHubView, null, (SduiActionHandler) objRememberedValue2, this.$modifier, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invoke$lambda$1$lambda$0(int i) {
            return "-";
        }
    }

    public static final void BuyingPowerHubLoadingScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-566949777);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566949777, i3, -1, "com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubLoadingScreen (BuyingPowerHubComposable.kt:90)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(212150783, true, new C168421(modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyingPowerHubComposable.BuyingPowerHubLoadingScreen$lambda$1(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
