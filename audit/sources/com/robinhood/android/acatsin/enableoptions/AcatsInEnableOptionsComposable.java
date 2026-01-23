package com.robinhood.android.acatsin.enableoptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInEnableOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"AcatsInEnableOptionsComposable", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onEnableOptions", "Lkotlin/Function0;", "onPartialTransfer", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AcatsInEnableOptionsPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInEnableOptionsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInEnableOptionsComposable$lambda$0(BrokerageAccountType brokerageAccountType, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AcatsInEnableOptionsComposable(brokerageAccountType, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInEnableOptionsPreview$lambda$1(int i, Composer composer, int i2) {
        AcatsInEnableOptionsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AcatsInEnableOptionsComposable(final BrokerageAccountType brokerageAccountType, final Function0<Unit> onEnableOptions, final Function0<Unit> onPartialTransfer, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(onEnableOptions, "onEnableOptions");
        Intrinsics.checkNotNullParameter(onPartialTransfer, "onPartialTransfer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1762385563);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnableOptions) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPartialTransfer) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762385563, i2, -1, "com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposable (AcatsInEnableOptionsComposable.kt:28)");
            }
            final boolean z = brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, AcatsInEnableOptionsComposable2.INSTANCE.m10747getLambda$807542109$feature_acats_in_externalDebug(), ComposableLambda3.rememberComposableLambda(16145143, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposableKt.AcatsInEnableOptionsComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(16145143, i3, -1, "com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposable.<anonymous> (AcatsInEnableOptionsComposable.kt:33)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, onEnableOptions, StringResources_androidKt.stringResource(C7725R.string.acats_in_enable_options, composer2, 0), false, null, false, onPartialTransfer, StringResources_androidKt.stringResource(C7725R.string.acats_in_options_continue_without_options, composer2, 0), false, null, false, composer2, 0, 0, 59198);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1679952671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposableKt.AcatsInEnableOptionsComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String strStringResource;
                    String strStringResource2;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1679952671, i3, -1, "com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposable.<anonymous> (AcatsInEnableOptionsComposable.kt:46)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxHeight$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    boolean z2 = z;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_investing, PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null), false, BentoPogSize.Hero, null, null, null, composer2, 3072, 116);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    if (z2) {
                        composer2.startReplaceGroup(820059327);
                        strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_options_not_enabled_title_joint_account, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(820183885);
                        strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_options_not_enabled_title, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
                    if (z2) {
                        composer2.startReplaceGroup(820484089);
                        strStringResource2 = StringResources_androidKt.stringResource(C7686R.string.acats_in_options_not_enabled_description_joint_account, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(820614599);
                        strStringResource2 = StringResources_androidKt.stringResource(C7686R.string.acats_in_options_not_enabled_description, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInEnableOptionsComposable.AcatsInEnableOptionsComposable$lambda$0(brokerageAccountType, onEnableOptions, onPartialTransfer, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AcatsInEnableOptionsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1017175363);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1017175363, i, -1, "com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsPreview (AcatsInEnableOptionsComposable.kt:83)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, AcatsInEnableOptionsComposable2.INSTANCE.m10746getLambda$461300731$feature_acats_in_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.enableoptions.AcatsInEnableOptionsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInEnableOptionsComposable.AcatsInEnableOptionsPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
