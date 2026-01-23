package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.Grid;
import com.robinhood.models.serverdriven.experimental.api.GridItem;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.api.WeightedContainer;
import com.robinhood.models.serverdriven.experimental.api.WeightedItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiContainers.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000b\u001a/\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a/\u0010\u0010\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a/\u0010\u0011\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\u001a/\u0010\u0012\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a\u001b\u0010\u001d\u001a\u00020\u001e*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\f\u0010!\u001a\u00020\"*\u00020\u001cH\u0002\u001a\f\u0010#\u001a\u00020$*\u00020\u0015H\u0002\u001a\f\u0010%\u001a\u00020$*\u00020\u001cH\u0002\u001a\r\u0010&\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'\u001a\r\u0010(\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'\u001a\r\u0010)\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'¨\u0006*"}, m3636d2 = {"SduiContainer", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/Container;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Container;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiWeightedContainer", "Lcom/robinhood/models/serverdriven/experimental/api/WeightedContainer;", "(Lcom/robinhood/models/serverdriven/experimental/api/WeightedContainer;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiGrid", "Lcom/robinhood/models/serverdriven/experimental/api/Grid;", "(Lcom/robinhood/models/serverdriven/experimental/api/Grid;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiVerticalContainer", "SduiHorizontalContainer", "SduiWeightedVerticalContainer", "SduiWeightedHorizontalContainer", "toColumnVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Lcom/robinhood/models/serverdriven/experimental/api/PrimaryAxisAlignment;", "space", "Landroidx/compose/ui/unit/Dp;", "toColumnVerticalArrangement-3ABfNKs", "(Lcom/robinhood/models/serverdriven/experimental/api/PrimaryAxisAlignment;F)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "toColumnHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Lcom/robinhood/models/serverdriven/experimental/api/SecondaryAxisAlignment;", "toRowHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toRowHorizontalArrangement-3ABfNKs", "(Lcom/robinhood/models/serverdriven/experimental/api/PrimaryAxisAlignment;F)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toRowVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "isFillEqually", "", "isFill", "PreviewWeightedHContainerItemsNoWeights", "(Landroidx/compose/runtime/Composer;I)V", "PreviewWeightedHContainerItemsWeightsAndAlignments", "PreviewWeightedVContainerItemsNoWeights", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiContainers5 {

    /* compiled from: SduiContainers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[LayoutAxis.values().length];
            try {
                iArr[LayoutAxis.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutAxis.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrimaryAxisAlignment.values().length];
            try {
                iArr2[PrimaryAxisAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PrimaryAxisAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PrimaryAxisAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PrimaryAxisAlignment.FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PrimaryAxisAlignment.FILL_EQUALLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SecondaryAxisAlignment.values().length];
            try {
                iArr3[SecondaryAxisAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SecondaryAxisAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SecondaryAxisAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SecondaryAxisAlignment.FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewWeightedHContainerItemsNoWeights$lambda$20(int i, Composer composer, int i2) {
        PreviewWeightedHContainerItemsNoWeights(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewWeightedHContainerItemsWeightsAndAlignments$lambda$21(int i, Composer composer, int i2) {
        PreviewWeightedHContainerItemsWeightsAndAlignments(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewWeightedVContainerItemsNoWeights$lambda$22(int i, Composer composer, int i2) {
        PreviewWeightedVContainerItemsNoWeights(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiContainer$lambda$0(Container container, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiContainer(container, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiGrid$lambda$4(Grid grid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiGrid(grid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiHorizontalContainer$lambda$11(Container container, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiHorizontalContainer(container, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiVerticalContainer$lambda$7(Container container, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiVerticalContainer(container, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiWeightedContainer$lambda$1(WeightedContainer weightedContainer, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiWeightedContainer(weightedContainer, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiWeightedHorizontalContainer$lambda$19(WeightedContainer weightedContainer, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiWeightedHorizontalContainer(weightedContainer, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiWeightedVerticalContainer$lambda$14(WeightedContainer weightedContainer, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiWeightedVerticalContainer(weightedContainer, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiContainer(final Container<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1816306250);
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
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1816306250, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainer (SduiContainers.kt:37)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[component.getAxis().getMobile().ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(1713590356);
                SduiVerticalContainer(component, modifier, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    composerStartRestartGroup.startReplaceGroup(1713588634);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1713592662);
                SduiHorizontalContainer(component, modifier, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.SduiContainer$lambda$0(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiWeightedContainer(final WeightedContainer<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1252675208);
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
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252675208, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiWeightedContainer (SduiContainers.kt:46)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[component.getAxis().getMobile().ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1230025206);
                SduiWeightedVerticalContainer(component, modifier, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    composerStartRestartGroup.startReplaceGroup(-1230026920);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1230022644);
                SduiWeightedHorizontalContainer(component, modifier, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.SduiWeightedContainer$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiGrid(final Grid<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1366630716);
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
                ComposerKt.traceEventStart(1366630716, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiGrid (SduiContainers.kt:58)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(component.getSpacing().getMobile())), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-287759467);
            Iterator<T> it = component.getItems().iterator();
            while (it.hasNext()) {
                SduiComponent3.SduiComponent(((GridItem) it.next()).getContent(), null, null, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.SduiGrid$lambda$4(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final <ActionT extends Parcelable> void SduiVerticalContainer(final Container<? extends ActionT> container, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1321334048);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(container) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1321334048, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiVerticalContainer (SduiContainers.kt:73)");
            }
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(container.getItem_spacing().getMobile());
            boolean zIsFill = isFill(container.getSecondary_axis_alignment());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(m16000toColumnVerticalArrangement3ABfNKs(container.getPrimary_axis_alignment(), fM7995constructorimpl), toColumnHorizontalAlignment(container.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(306321010);
            List<UIComponent<ActionT>> content = container.getContent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content, 10));
            Iterator<T> it = content.iterator();
            while (it.hasNext()) {
                UIComponent uIComponent = (UIComponent) it.next();
                Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                if (zIsFill) {
                    modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                }
                SduiComponent3.SduiComponent(uIComponent, modifierFillMaxWidth$default, null, composerStartRestartGroup, 0, 4);
                arrayList.add(Unit.INSTANCE);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.SduiVerticalContainer$lambda$7(container, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT extends Parcelable> void SduiHorizontalContainer(final Container<? extends ActionT> container, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator it;
        Iterator it2;
        ArrayList arrayList;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2001518286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(container) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2001518286, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiHorizontalContainer (SduiContainers.kt:96)");
                }
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(container.getItem_spacing().getMobile());
                boolean zIsFillEqually = isFillEqually(container.getPrimary_axis_alignment());
                boolean zIsFill = isFill(container.getSecondary_axis_alignment());
                Modifier modifierHeight = Intrinsic3.height(modifier3, Intrinsic4.Min);
                ?? r13 = 0;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(m16001toRowHorizontalArrangement3ABfNKs(container.getPrimary_axis_alignment(), fM7995constructorimpl), toRowVerticalAlignment(container.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                composerStartRestartGroup.startReplaceGroup(-279661632);
                List<UIComponent<ActionT>> content = container.getContent();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(content, 10));
                it = content.iterator();
                while (it.hasNext()) {
                    UIComponent uIComponent = (UIComponent) it.next();
                    if (zIsFillEqually) {
                        composerStartRestartGroup.startReplaceGroup(2123129436);
                        Modifier modifierFillMaxHeight$default = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, modifierFillMaxHeight$default, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r13);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r13);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        it2 = it;
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxHeight$default, 0.0f, 1, null);
                        if (zIsFill) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifierFillMaxHeight$default, 0.0f, 1, null);
                        }
                        arrayList = arrayList2;
                        SduiComponent3.SduiComponent(uIComponent, modifierFillMaxWidth$default.then(modifierFillMaxHeight$default), null, composerStartRestartGroup, 0, 4);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        it2 = it;
                        arrayList = arrayList2;
                        composerStartRestartGroup.startReplaceGroup(2123818132);
                        Modifier modifierFillMaxHeight$default2 = Modifier.INSTANCE;
                        if (zIsFill) {
                            modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifierFillMaxHeight$default2, 0.0f, 1, null);
                        }
                        SduiComponent3.SduiComponent(uIComponent, modifierFillMaxHeight$default2, null, composerStartRestartGroup, 0, 4);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    arrayList.add(Unit.INSTANCE);
                    arrayList2 = arrayList;
                    it = it2;
                    r13 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiContainers5.SduiHorizontalContainer$lambda$11(container, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(container.getItem_spacing().getMobile());
            boolean zIsFillEqually2 = isFillEqually(container.getPrimary_axis_alignment());
            boolean zIsFill2 = isFill(container.getSecondary_axis_alignment());
            Modifier modifierHeight2 = Intrinsic3.height(modifier3, Intrinsic4.Min);
            ?? r132 = 0;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(m16001toRowHorizontalArrangement3ABfNKs(container.getPrimary_axis_alignment(), fM7995constructorimpl2), toRowVerticalAlignment(container.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-279661632);
                List<UIComponent<ActionT>> content2 = container.getContent();
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(content2, 10));
                it = content2.iterator();
                while (it.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <ActionT extends Parcelable> void SduiWeightedVerticalContainer(final WeightedContainer<? extends ActionT> weightedContainer, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252719886);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(weightedContainer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252719886, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiWeightedVerticalContainer (SduiContainers.kt:136)");
            }
            boolean zIsFill = isFill(weightedContainer.getSecondary_axis_alignment());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(weightedContainer.getItem_spacing().getMobile())), toColumnHorizontalAlignment(weightedContainer.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(217538890);
            List<WeightedItem<ActionT>> content = weightedContainer.getContent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content, 10));
            Iterator<T> it = content.iterator();
            while (it.hasNext()) {
                UIComponent<ActionT> content2 = ((WeightedItem) it.next()).getContent();
                Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                if (zIsFill) {
                    modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                }
                SduiComponent3.SduiComponent(content2, modifierFillMaxWidth$default, null, composerStartRestartGroup, 0, 4);
                arrayList.add(Unit.INSTANCE);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.SduiWeightedVerticalContainer$lambda$14(weightedContainer, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiWeightedHorizontalContainer(final WeightedContainer<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<WeightedItem<ActionT>> content;
        Iterator<T> it;
        boolean z;
        Iterator<T> it2;
        Object obj;
        int i4;
        Modifier modifierFillMaxHeight$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(377073980);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(377073980, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiWeightedHorizontalContainer (SduiContainers.kt:159)");
                }
                boolean zIsFill = isFill(component.getSecondary_axis_alignment());
                Modifier modifierHeight = Intrinsic3.height(modifier3, Intrinsic4.Min);
                ?? r11 = 0;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(component.getItem_spacing().getMobile())), toRowVerticalAlignment(component.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                content = component.getContent();
                if (!(content instanceof Collection) && content.isEmpty()) {
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(-38724052);
                    List<WeightedItem<ActionT>> content2 = component.getContent();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content2, 10));
                    it2 = content2.iterator();
                    while (it2.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                } else {
                    it = content.iterator();
                    while (it.hasNext()) {
                        if (((WeightedItem) it.next()).getWeight() != null) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(-38724052);
                    List<WeightedItem<ActionT>> content22 = component.getContent();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(content22, 10));
                    it2 = content22.iterator();
                    while (it2.hasNext()) {
                        WeightedItem weightedItem = (WeightedItem) it2.next();
                        Float weight = weightedItem.getWeight();
                        if (weight == null) {
                            weight = !z ? Float.valueOf(1.0f) : null;
                        }
                        Modifier modifierWeight$default = weight != null ? Row5.weight$default(row6, Modifier.INSTANCE, weight.floatValue(), false, 2, null) : Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r11);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r11);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (weight != null) {
                            obj = null;
                            i4 = 1;
                            modifierFillMaxHeight$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        } else {
                            obj = null;
                            i4 = 1;
                            modifierFillMaxHeight$default = Modifier.INSTANCE;
                        }
                        UIComponent<ActionT> content3 = weightedItem.getContent();
                        if (zIsFill) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifierFillMaxHeight$default, 0.0f, i4, obj);
                        }
                        ArrayList arrayList3 = arrayList2;
                        SduiComponent3.SduiComponent(content3, modifierFillMaxHeight$default, null, composerStartRestartGroup, 0, 4);
                        composerStartRestartGroup.endNode();
                        arrayList3.add(Unit.INSTANCE);
                        arrayList2 = arrayList3;
                        r11 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SduiContainers5.SduiWeightedHorizontalContainer$lambda$19(component, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean zIsFill2 = isFill(component.getSecondary_axis_alignment());
            Modifier modifierHeight2 = Intrinsic3.height(modifier3, Intrinsic4.Min);
            ?? r112 = 0;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(component.getItem_spacing().getMobile())), toRowVerticalAlignment(component.getSecondary_axis_alignment()), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                content = component.getContent();
                if (!(content instanceof Collection)) {
                    it = content.iterator();
                    while (it.hasNext()) {
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(-38724052);
                    List<WeightedItem<ActionT>> content222 = component.getContent();
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(content222, 10));
                    it2 = content222.iterator();
                    while (it2.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: toColumnVerticalArrangement-3ABfNKs, reason: not valid java name */
    private static final Arrangement.Vertical m16000toColumnVerticalArrangement3ABfNKs(PrimaryAxisAlignment primaryAxisAlignment, float f) {
        int i = WhenMappings.$EnumSwitchMapping$1[primaryAxisAlignment.ordinal()];
        if (i == 1) {
            return Arrangement.INSTANCE.m5091spacedByD5KLDUw(f, Alignment.INSTANCE.getTop());
        }
        if (i == 2) {
            return Arrangement.INSTANCE.m5091spacedByD5KLDUw(f, Alignment.INSTANCE.getCenterVertically());
        }
        if (i == 3) {
            return Arrangement.INSTANCE.m5091spacedByD5KLDUw(f, Alignment.INSTANCE.getBottom());
        }
        if (i == 4 || i == 5) {
            return Arrangement.INSTANCE.m5091spacedByD5KLDUw(f, Alignment.INSTANCE.getTop());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Alignment.Horizontal toColumnHorizontalAlignment(SecondaryAxisAlignment secondaryAxisAlignment) {
        int i = WhenMappings.$EnumSwitchMapping$2[secondaryAxisAlignment.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterHorizontally();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getEnd();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getStart();
    }

    /* renamed from: toRowHorizontalArrangement-3ABfNKs, reason: not valid java name */
    private static final Arrangement.Horizontal m16001toRowHorizontalArrangement3ABfNKs(PrimaryAxisAlignment primaryAxisAlignment, float f) {
        int i = WhenMappings.$EnumSwitchMapping$1[primaryAxisAlignment.ordinal()];
        if (i == 1) {
            return Arrangement.INSTANCE.m5090spacedByD5KLDUw(f, Alignment.INSTANCE.getStart());
        }
        if (i == 2) {
            return Arrangement.INSTANCE.m5090spacedByD5KLDUw(f, Alignment.INSTANCE.getCenterHorizontally());
        }
        if (i == 3) {
            return Arrangement.INSTANCE.m5090spacedByD5KLDUw(f, Alignment.INSTANCE.getEnd());
        }
        if (i == 4 || i == 5) {
            return Arrangement.INSTANCE.m5090spacedByD5KLDUw(f, Alignment.INSTANCE.getStart());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Alignment.Vertical toRowVerticalAlignment(SecondaryAxisAlignment secondaryAxisAlignment) {
        int i = WhenMappings.$EnumSwitchMapping$2[secondaryAxisAlignment.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getTop();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterVertically();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getBottom();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getTop();
    }

    private static final boolean isFillEqually(PrimaryAxisAlignment primaryAxisAlignment) {
        int i = WhenMappings.$EnumSwitchMapping$1[primaryAxisAlignment.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return false;
        }
        if (i == 5) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean isFill(SecondaryAxisAlignment secondaryAxisAlignment) {
        int i = WhenMappings.$EnumSwitchMapping$2[secondaryAxisAlignment.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void PreviewWeightedHContainerItemsNoWeights(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(855741938);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(855741938, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewWeightedHContainerItemsNoWeights (SduiContainers.kt:238)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiContainers.INSTANCE.m15953getLambda$881714374$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.PreviewWeightedHContainerItemsNoWeights$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewWeightedHContainerItemsWeightsAndAlignments(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(541888084);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(541888084, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewWeightedHContainerItemsWeightsAndAlignments (SduiContainers.kt:257)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiContainers.INSTANCE.getLambda$1455254540$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.PreviewWeightedHContainerItemsWeightsAndAlignments$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewWeightedVContainerItemsNoWeights(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(204532992);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(204532992, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewWeightedVContainerItemsNoWeights (SduiContainers.kt:282)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SduiContainers.INSTANCE.m15952getLambda$1532923320$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiContainers5.PreviewWeightedVContainerItemsNoWeights$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
