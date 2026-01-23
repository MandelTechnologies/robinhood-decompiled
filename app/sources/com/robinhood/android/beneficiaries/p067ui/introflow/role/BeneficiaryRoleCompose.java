package com.robinhood.android.beneficiaries.p067ui.introflow.role;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleCard;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: BeneficiaryRoleCompose.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a-\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"BeneficiaryRoleScaffold", "", "viewState", "Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleViewState;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleViewState;Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryRoleContent", "BeneficiaryRoleItem", "onClick", "Lkotlin/Function0;", "card", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "(Lkotlin/jvm/functions/Function0;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryRoleCompose {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryRoleContent$lambda$8(BeneficiaryRoleViewState beneficiaryRoleViewState, BeneficiaryRoleCallbacks beneficiaryRoleCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryRoleContent(beneficiaryRoleViewState, beneficiaryRoleCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryRoleItem$lambda$9(Function0 function0, BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryRoleItem(function0, beneficiaryFlowBeneficiaryRoleCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryRoleScaffold$lambda$0(BeneficiaryRoleViewState beneficiaryRoleViewState, BeneficiaryRoleCallbacks beneficiaryRoleCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryRoleScaffold(beneficiaryRoleViewState, beneficiaryRoleCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryRoleScaffold(final BeneficiaryRoleViewState viewState, final BeneficiaryRoleCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1879266390);
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
                    ComposerKt.traceEventStart(1879266390, i3, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleScaffold (BeneficiaryRoleCompose.kt:36)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306368;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1961720935, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt.BeneficiaryRoleScaffold.1
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
                            ComposerKt.traceEventStart(1961720935, i6, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleScaffold.<anonymous> (BeneficiaryRoleCompose.kt:39)");
                        }
                        BeneficiaryRoleCompose.BeneficiaryRoleContent(viewState, callbacks, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 510);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryRoleCompose.BeneficiaryRoleScaffold$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 6) & 14) | 805306368;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1961720935, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt.BeneficiaryRoleScaffold.1
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
                        ComposerKt.traceEventStart(1961720935, i6, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleScaffold.<anonymous> (BeneficiaryRoleCompose.kt:39)");
                    }
                    BeneficiaryRoleCompose.BeneficiaryRoleContent(viewState, callbacks, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 510);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryRoleContent(final BeneficiaryRoleViewState beneficiaryRoleViewState, final BeneficiaryRoleCallbacks beneficiaryRoleCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(753698029);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(beneficiaryRoleViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryRoleCallbacks) : composerStartRestartGroup.changedInstance(beneficiaryRoleCallbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(753698029, i3, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleContent (BeneficiaryRoleCompose.kt:55)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                int i5 = BentoTheme.$stable;
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryRoleCallbacks))) | composerStartRestartGroup.changedInstance(beneficiaryRoleViewState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BeneficiaryRoleCompose.BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3(beneficiaryRoleViewState, beneficiaryRoleCallbacks, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(null, null, paddingValuesM5139PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 491);
                ImmutableList<UIComponentDto.ConcreteDto> sduiComponents = beneficiaryRoleViewState.getSduiComponents();
                SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BeneficiaryRoleCompose.BeneficiaryRoleContent$lambda$7$lambda$6$lambda$5((ActionDto) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(40010095);
                SduiColumnsIdl.SduiColumn(sduiComponents, (Function1) objRememberedValue2, Unit.class, Modifier.INSTANCE, null, sduiActionHandlerCurrentActionHandler, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 805306416, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryRoleCompose.BeneficiaryRoleContent$lambda$8(beneficiaryRoleViewState, beneficiaryRoleCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(spaceBetween2, companion3.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i3 & 112) != 32) {
                    zChangedInstance = ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryRoleCallbacks))) | composerStartRestartGroup.changedInstance(beneficiaryRoleViewState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BeneficiaryRoleCompose.BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3(beneficiaryRoleViewState, beneficiaryRoleCallbacks, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        LazyDslKt.LazyColumn(null, null, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 491);
                        ImmutableList<UIComponentDto.ConcreteDto> sduiComponents2 = beneficiaryRoleViewState.getSduiComponents();
                        SduiActionHandler sduiActionHandlerCurrentActionHandler2 = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(40010095);
                        SduiColumnsIdl.SduiColumn(sduiComponents2, (Function1) objRememberedValue2, Unit.class, Modifier.INSTANCE, null, sduiActionHandlerCurrentActionHandler2, HorizontalPadding.Default, arrangement2.getTop(), companion3.getStart(), false, composerStartRestartGroup, 805306416, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3(final BeneficiaryRoleViewState beneficiaryRoleViewState, final BeneficiaryRoleCallbacks beneficiaryRoleCallbacks, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, "ContentTitle", null, ComposableLambda3.composableLambdaInstance(-2095186568, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$BeneficiaryRoleContent$1$1$1$1
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
                    ComposerKt.traceEventStart(-2095186568, i, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BeneficiaryRoleCompose.kt:64)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                BentoText2.m20747BentoText38GnDrw(beneficiaryRoleViewState.getBeneficiaryRoleViewModel().getTitle(), modifierFillMaxWidth$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 48, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, "Spacer", null, BeneficiaryRoleCompose4.INSTANCE.getLambda$55323375$feature_beneficiaries_externalDebug(), 2, null);
        final List<BeneficiaryFlowBeneficiaryRoleCard> cards = beneficiaryRoleViewState.getBeneficiaryRoleViewModel().getCards();
        final C9759xc6ed0b6 c9759xc6ed0b6 = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BeneficiaryFlowBeneficiaryRoleCard) obj);
            }
        };
        LazyColumn.items(cards.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c9759xc6ed0b6.invoke(cards.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$BeneficiaryRoleContent$lambda$7$lambda$4$lambda$3$$inlined$items$default$4
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
                final BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard = (BeneficiaryFlowBeneficiaryRoleCard) cards.get(i);
                composer.startReplaceGroup(-1604630568);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, beneficiaryFlowBeneficiaryRoleCard.getRole().name());
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(beneficiaryRoleCallbacks) | composer.changedInstance(beneficiaryFlowBeneficiaryRoleCard);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final BeneficiaryRoleCallbacks beneficiaryRoleCallbacks2 = beneficiaryRoleCallbacks;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$BeneficiaryRoleContent$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            beneficiaryRoleCallbacks2.onBeneficiaryRoleClicked(beneficiaryFlowBeneficiaryRoleCard.getRole());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BeneficiaryRoleCompose.BeneficiaryRoleItem((Function0) objRememberedValue, beneficiaryFlowBeneficiaryRoleCard, modifierTestTag, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryRoleContent$lambda$7$lambda$6$lambda$5(ActionDto actionDto) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryRoleItem(final Function0<Unit> function0, final BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard, Modifier modifier, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        long jM21426getFg20d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1567474453);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(beneficiaryFlowBeneficiaryRoleCard) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-1567474453, i3, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleItem (BeneficiaryRoleCompose.kt:99)");
                }
                if (beneficiaryFlowBeneficiaryRoleCard.getIs_enabled()) {
                    composerStartRestartGroup.startReplaceGroup(1190579438);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1190578605);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, beneficiaryFlowBeneficiaryRoleCard.getIs_enabled(), null, null, function02, 6, null);
                Modifier modifier5 = modifier4;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                final long j = jM21426getFg20d7_KjU;
                composer2 = composerStartRestartGroup;
                CardKt.Card(modifierM4893clickableXHw0xAI$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1464256477, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt.BeneficiaryRoleItem.1
                    public final void invoke(Column5 Card, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1464256477, i6, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleItem.<anonymous> (BeneficiaryRoleCompose.kt:109)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Intrinsic4.Min);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierHeight, bentoTheme2.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer3, i7).m21592getMediumD9Ej5fM());
                        BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard2 = beneficiaryFlowBeneficiaryRoleCard;
                        long j2 = j;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
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
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                        BentoText2.m20747BentoText38GnDrw(beneficiaryFlowBeneficiaryRoleCard2.getTitle(), companion, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer3, i7).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 48, 0, 8184);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        BentoText2.m20747BentoText38GnDrw(beneficiaryFlowBeneficiaryRoleCard2.getDescription(), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8184);
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 196608, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryRoleCompose.BeneficiaryRoleItem$lambda$9(function0, beneficiaryFlowBeneficiaryRoleCard, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (beneficiaryFlowBeneficiaryRoleCard.getIs_enabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, beneficiaryFlowBeneficiaryRoleCard.getIs_enabled(), null, null, function02, 6, null);
            Modifier modifier52 = modifier4;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            final long j2 = jM21426getFg20d7_KjU;
            composer2 = composerStartRestartGroup;
            CardKt.Card(modifierM4893clickableXHw0xAI$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer2, i52).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1464256477, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleComposeKt.BeneficiaryRoleItem.1
                public final void invoke(Column5 Card, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1464256477, i6, -1, "com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleItem.<anonymous> (BeneficiaryRoleCompose.kt:109)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Intrinsic4.Min);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierHeight, bentoTheme22.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer3, i7).m21592getMediumD9Ej5fM());
                    BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard2 = beneficiaryFlowBeneficiaryRoleCard;
                    long j22 = j2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
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
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    BentoText2.m20747BentoText38GnDrw(beneficiaryFlowBeneficiaryRoleCard2.getTitle(), companion, Color.m6701boximpl(j22), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme22.getTypography(composer3, i7).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 48, 0, 8184);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    BentoText2.m20747BentoText38GnDrw(beneficiaryFlowBeneficiaryRoleCard2.getDescription(), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(j22), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8184);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
