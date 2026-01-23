package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
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
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.HStackDto;
import rh_server_driven_ui.p531v1.StackAlignmentDto;
import rh_server_driven_ui.p531v1.UIComponentDto;
import rh_server_driven_ui.p531v1.VStackDto;
import rh_server_driven_ui.p531v1.WeightedItemDto;

/* compiled from: SduiContainersIdl.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a=\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\t0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001aE\u0010\u0012\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\t0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"isFill", "", "Lrh_server_driven_ui/v1/StackAlignmentDto;", "toColumnHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "toRowVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "SduiWeightedHorizontalContainer", "", "ActionT", "component", "Lrh_server_driven_ui/v1/HStackDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/HStackDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiWeightedVerticalContainer", "Lrh_server_driven_ui/v1/VStackDto;", "allowWeights", "(Lrh_server_driven_ui/v1/VStackDto;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiContainersIdl {

    /* compiled from: SduiContainersIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackAlignmentDto.values().length];
            try {
                iArr[StackAlignmentDto.STACK_ALIGNMENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackAlignmentDto.STACK_ALIGNMENT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StackAlignmentDto.STACK_ALIGNMENT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StackAlignmentDto.STACK_ALIGNMENT_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StackAlignmentDto.STACK_ALIGNMENT_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiWeightedHorizontalContainer$lambda$4(HStackDto hStackDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiWeightedHorizontalContainer(hStackDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiWeightedVerticalContainer$lambda$11(VStackDto vStackDto, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiWeightedVerticalContainer(vStackDto, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean isFill(StackAlignmentDto stackAlignmentDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[stackAlignmentDto.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Alignment.Horizontal toColumnHorizontalAlignment(StackAlignmentDto stackAlignmentDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[stackAlignmentDto.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterHorizontally();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getEnd();
        }
        if (i == 4 || i == 5) {
            return Alignment.INSTANCE.getStart();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Alignment.Vertical toRowVerticalAlignment(StackAlignmentDto stackAlignmentDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[stackAlignmentDto.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getTop();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterVertically();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getBottom();
        }
        if (i == 4 || i == 5) {
            return Alignment.INSTANCE.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiWeightedHorizontalContainer(final HStackDto component, final Function1<? super ActionDto, ? extends ActionT> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<WeightedItemDto> components;
        Iterator<T> it;
        boolean z;
        final Modifier modifier4;
        Object obj;
        int i5;
        Modifier modifierFillMaxHeight$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super ActionDto, ? extends ActionT> parseAction = function1;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1219529027);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1219529027, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiWeightedHorizontalContainer (SduiContainersIdl.kt:47)");
                }
                boolean zIsFill = isFill(component.getAlignment());
                Modifier modifierHeight = Intrinsic3.height(modifier3, Intrinsic4.Min);
                ?? r12 = 0;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl((float) component.getSpacing())), toRowVerticalAlignment(component.getAlignment()), composerStartRestartGroup, 0);
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
                components = component.getComponents();
                if ((components instanceof Collection) || !components.isEmpty()) {
                    it = components.iterator();
                    while (it.hasNext()) {
                        if (((WeightedItemDto) it.next()).getWeight() != null) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(337838427);
                    for (WeightedItemDto weightedItemDto : component.getComponents()) {
                        UIComponentDto component2 = weightedItemDto.getComponent();
                        UIComponentDto.ConcreteDto concrete = component2 != null ? component2.getConcrete() : null;
                        composerStartRestartGroup.startReplaceGroup(337840928);
                        if (concrete != null) {
                            Float weight = weightedItemDto.getWeight();
                            if (weight == null) {
                                weight = !z ? Float.valueOf(1.0f) : null;
                            }
                            Modifier modifierWeight$default = weight != null ? Row5.weight$default(row6, Modifier.INSTANCE, weight.floatValue(), false, 2, null) : Modifier.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r12);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
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
                                i5 = 1;
                                modifierFillMaxHeight$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            } else {
                                obj = null;
                                i5 = 1;
                                modifierFillMaxHeight$default = Modifier.INSTANCE;
                            }
                            if (zIsFill) {
                                modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifierFillMaxHeight$default, 0.0f, i5, obj);
                            }
                            SduiComponentIdl.SduiComponent(concrete, parseAction, modifierFillMaxHeight$default, (HorizontalPadding) null, composerStartRestartGroup, i4 & 112, 8);
                            composerStartRestartGroup.endNode();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        parseAction = function1;
                        r12 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(337838427);
                    while (r22.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersIdlKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SduiContainersIdl.SduiWeightedHorizontalContainer$lambda$4(component, function1, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean zIsFill2 = isFill(component.getAlignment());
            Modifier modifierHeight2 = Intrinsic3.height(modifier3, Intrinsic4.Min);
            ?? r122 = 0;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl((float) component.getSpacing())), toRowVerticalAlignment(component.getAlignment()), composerStartRestartGroup, 0);
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
                components = component.getComponents();
                if (components instanceof Collection) {
                    it = components.iterator();
                    while (it.hasNext()) {
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(337838427);
                    while (r22.hasNext()) {
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

    /* JADX WARN: Removed duplicated region for block: B:112:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiWeightedVerticalContainer(final VStackDto component, final boolean z, final Function1<? super ActionDto, ? extends ActionT> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        UIComponentDto.ConcreteDto concreteDto;
        int i5;
        float f;
        Modifier modifierFillMaxWidth$default;
        final Modifier modifier3;
        boolean z3;
        Modifier modifierFillMaxWidth$default2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super ActionDto, ? extends ActionT> parseAction = function1;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(401780379);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(401780379, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiWeightedVerticalContainer (SduiContainersIdl.kt:91)");
                }
                boolean zIsFill = isFill(component.getAlignment());
                UIComponentDto.ConcreteDto concreteDto2 = null;
                ?? r15 = 0;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-634291978);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl((float) component.getSpacing())), toColumnHorizontalAlignment(component.getAlignment()), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    composerStartRestartGroup.startReplaceGroup(-1832295414);
                    Iterator<T> it = component.getComponents().iterator();
                    while (it.hasNext()) {
                        UIComponentDto component2 = ((WeightedItemDto) it.next()).getComponent();
                        UIComponentDto.ConcreteDto concrete = component2 != null ? component2.getConcrete() : null;
                        composerStartRestartGroup.startReplaceGroup(-1832291057);
                        if (concrete != null) {
                            if (zIsFill) {
                                z3 = true;
                                modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            } else {
                                z3 = true;
                                modifierFillMaxWidth$default2 = Modifier.INSTANCE;
                            }
                            SduiComponentIdl.SduiComponent(concrete, parseAction, modifierFillMaxWidth$default2, (HorizontalPadding) null, composerStartRestartGroup, (i4 >> 3) & 112, 8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        parseAction = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-633534493);
                    Modifier modifierHeight = Intrinsic3.height(modifier4, Intrinsic4.Min);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl((float) component.getSpacing())), toColumnHorizontalAlignment(component.getAlignment()), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    List<WeightedItemDto> components = component.getComponents();
                    if ((components instanceof Collection) && components.isEmpty()) {
                        z2 = false;
                        composerStartRestartGroup.startReplaceGroup(1580014012);
                        while (r24.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        Iterator<T> it2 = components.iterator();
                        while (it2.hasNext()) {
                            if (((WeightedItemDto) it2.next()).getWeight() != null) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        composerStartRestartGroup.startReplaceGroup(1580014012);
                        for (WeightedItemDto weightedItemDto : component.getComponents()) {
                            UIComponentDto component3 = weightedItemDto.getComponent();
                            UIComponentDto.ConcreteDto concrete2 = component3 != null ? component3.getConcrete() : concreteDto2;
                            composerStartRestartGroup.startReplaceGroup(1580016757);
                            if (concrete2 != null) {
                                Float weight = weightedItemDto.getWeight();
                                if (weight == null) {
                                    weight = !z2 ? Float.valueOf(1.0f) : concreteDto2;
                                }
                                Modifier modifierWeight$default = weight != null ? Column5.weight$default(column62, Modifier.INSTANCE, weight.floatValue(), false, 2, null) : Modifier.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r15);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (weight != null) {
                                    i5 = 1;
                                    f = 0.0f;
                                    concreteDto = null;
                                    modifierFillMaxWidth$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                } else {
                                    i5 = 1;
                                    f = 0.0f;
                                    concreteDto = null;
                                    modifierFillMaxWidth$default = Modifier.INSTANCE;
                                }
                                if (zIsFill) {
                                    modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, f, i5, concreteDto);
                                }
                                SduiComponentIdl.SduiComponent(concrete2, function1, modifierFillMaxWidth$default, (HorizontalPadding) null, composerStartRestartGroup, (i4 >> 3) & 112, 8);
                                composerStartRestartGroup.endNode();
                            } else {
                                concreteDto = concreteDto2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            concreteDto2 = concreteDto;
                            r15 = 0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiContainersIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiContainersIdl.SduiWeightedVerticalContainer$lambda$11(component, z, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean zIsFill2 = isFill(component.getAlignment());
            UIComponentDto.ConcreteDto concreteDto22 = null;
            ?? r152 = 0;
            if (z) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
