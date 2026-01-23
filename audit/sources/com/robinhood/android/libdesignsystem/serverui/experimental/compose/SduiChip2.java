package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.component.BentoChipGrid2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.Chip;
import com.robinhood.models.serverdriven.experimental.api.ChipGrid;
import com.robinhood.models.serverdriven.experimental.api.ChipSelectedStyle;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiChip.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"SduiChip", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/Chip;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Chip;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiChipGrid", "Lcom/robinhood/models/serverdriven/experimental/api/ChipGrid;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChipGrid;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiChip2 {

    /* compiled from: SduiChip.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChipSelectedStyle.values().length];
            try {
                iArr[ChipSelectedStyle.ACCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChipSelectedStyle.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChipSelectedStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiChip$lambda$4(Chip chip, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiChip(chip, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiChipGrid$lambda$6(ChipGrid chipGrid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiChipGrid(chipGrid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiChip(final Chip<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        BentoChip2.Accessory.Selection trailingIcon;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155258302);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155258302, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChip (SduiChip.kt:20)");
            }
            final Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
            final BentoChip2.Accessory.Selection count = null;
            if (Intrinsics.areEqual(component.getHas_dropdown(), Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(-726876251);
                Icon leading_icon = component.getLeading_icon();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = leading_icon != null ? ServerToBentoAssetMapper2.INSTANCE.fromServerValue(leading_icon.getServerValue()) : null;
                BentoChip.BentoDropdownChip(function0Handling, modifier2, component.is_enabled(), serverToBentoAssetMapper2FromServerValue != null ? new BentoChip2.Accessory.Dropdown.LeadingIcon(serverToBentoAssetMapper2FromServerValue, null, 2, null) : null, component.getTitle(), composerStartRestartGroup, (i3 & 112) | (BentoChip2.Accessory.Dropdown.LeadingIcon.$stable << 9), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-726426162);
                if (component.getLeading_icon() != null) {
                    ServerToBentoAssetMapper2.Companion companion = ServerToBentoAssetMapper2.INSTANCE;
                    Icon leading_icon2 = component.getLeading_icon();
                    Intrinsics.checkNotNull(leading_icon2);
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue2 = companion.fromServerValue(leading_icon2.getServerValue());
                    if (serverToBentoAssetMapper2FromServerValue2 != null) {
                        trailingIcon = new BentoChip2.Accessory.Selection.LeadingIcon(serverToBentoAssetMapper2FromServerValue2, null, 2, null);
                        count = trailingIcon;
                    }
                    SduiChip$SelectedBackgroundStyle(component.getSelected_background_style(), ComposableLambda3.rememberComposableLambda(305573666, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt.SduiChip.1
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
                                ComposerKt.traceEventStart(305573666, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChip.<anonymous> (SduiChip.kt:71)");
                            }
                            BentoChip.BentoSelectionChip(function0Handling, modifier2, component.is_enabled(), component.is_selected(), count, component.getTitle(), composer2, BentoChip2.Accessory.Selection.$stable << 12, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (component.getTrailing_icon() != null) {
                        ServerToBentoAssetMapper2.Companion companion2 = ServerToBentoAssetMapper2.INSTANCE;
                        Icon trailing_icon = component.getTrailing_icon();
                        Intrinsics.checkNotNull(trailing_icon);
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue3 = companion2.fromServerValue(trailing_icon.getServerValue());
                        if (serverToBentoAssetMapper2FromServerValue3 != null) {
                            trailingIcon = new BentoChip2.Accessory.Selection.TrailingIcon(serverToBentoAssetMapper2FromServerValue3, null, 2, null);
                            count = trailingIcon;
                        }
                    } else if (component.getCount() != null) {
                        Integer count2 = component.getCount();
                        Intrinsics.checkNotNull(count2);
                        count = new BentoChip2.Accessory.Selection.Count(count2.intValue());
                    }
                    SduiChip$SelectedBackgroundStyle(component.getSelected_background_style(), ComposableLambda3.rememberComposableLambda(305573666, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt.SduiChip.1
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
                                ComposerKt.traceEventStart(305573666, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChip.<anonymous> (SduiChip.kt:71)");
                            }
                            BentoChip.BentoSelectionChip(function0Handling, modifier2, component.is_enabled(), component.is_selected(), count, component.getTitle(), composer2, BentoChip2.Accessory.Selection.$stable << 12, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiChip2.SduiChip$lambda$4(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SduiChip$SelectedBackgroundStyle(ChipSelectedStyle chipSelectedStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceGroup(436583451);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436583451, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChip.SelectedBackgroundStyle (SduiChip.kt:54)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[chipSelectedStyle.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1096796534);
            function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
            composer.endReplaceGroup();
        } else {
            if (i2 != 2 && i2 != 3) {
                composer.startReplaceGroup(-1350094376);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1096953487);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(600126343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt$SduiChip$SelectedBackgroundStyle$1
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
                        ComposerKt.traceEventStart(600126343, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChip.SelectedBackgroundStyle.<anonymous> (SduiChip.kt:64)");
                    }
                    function2.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public static final <ActionT extends Parcelable> void SduiChipGrid(final ChipGrid<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1146152830);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1146152830, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipGrid (SduiChip.kt:87)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Integer max_number_of_lines = component.getMax_number_of_lines();
            BentoChipGrid2.BentoChipGrid(null, null, max_number_of_lines != null ? max_number_of_lines.intValue() : 3, null, ComposableLambda3.rememberComposableLambda(-1503897037, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt$SduiChipGrid$1$1
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
                        ComposerKt.traceEventStart(-1503897037, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipGrid.<anonymous>.<anonymous> (SduiChip.kt:92)");
                    }
                    Iterator it = component.getContent().iterator();
                    while (it.hasNext()) {
                        SduiChip2.SduiChip((Chip) it.next(), null, composer2, 0, 2);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 11);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChipKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiChip2.SduiChipGrid$lambda$6(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
