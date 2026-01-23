package com.robinhood.android.mcw.currencyconverter.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.mcw.currencyconverter.C21706R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConversionHelperButtonBar.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"LOG_ID_HALF_BUTTON", "", "LOG_ID_ALL_BUTTON", "ConversionHelperButtonBar", "", "onConvertAllClicked", "Lkotlin/Function0;", "onConvertHalfClicked", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.currencyconverter.components.ConversionHelperButtonBarKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConversionHelperButtonBar {
    private static final String LOG_ID_ALL_BUTTON = "conversion_shortcut_all_button";
    private static final String LOG_ID_HALF_BUTTON = "conversion_shortcut_half_button";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversionHelperButtonBar$lambda$1(Function0 function0, Function0 function02, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        ConversionHelperButtonBar(function0, function02, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConversionHelperButtonBar(final Function0<Unit> onConvertAllClicked, final Function0<Unit> onConvertHalfClicked, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onConvertAllClicked, "onConvertAllClicked");
        Intrinsics.checkNotNullParameter(onConvertHalfClicked, "onConvertHalfClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(780531529);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onConvertAllClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConvertHalfClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(780531529, i3, -1, "com.robinhood.android.mcw.currencyconverter.components.ConversionHelperButtonBar (ConversionHelperButtonBar.kt:30)");
                    }
                    ButtonBarStyle buttonBar = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, buttonBar.getSpacing().m21707getVerticalPaddingD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                    String strStringResource = StringResources_androidKt.stringResource(C21706R.string.convert_half_cta_text, composerStartRestartGroup, 0);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.SET_CONVERSION_AMOUNT;
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierWeight$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, LOG_ID_HALF_BUTTON, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                    Modifier modifier5 = modifier4;
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    int i6 = (i3 << 6) & 458752;
                    boolean z4 = z2;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onConvertHalfClicked, strStringResource, modifierAutoLogEvents$default, null, type2, z4, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 3) & 14) | 24576 | i6, 0, 8136);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, buttonBar.getSpacing().m21705getHorizontalButtonStackSpacingD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(onConvertAllClicked, StringResources_androidKt.stringResource(C21706R.string.convert_all_cta_text, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, LOG_ID_ALL_BUTTON, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, type2, z4, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 & 14) | 24576 | i6, 0, 8136);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.components.ConversionHelperButtonBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConversionHelperButtonBar.ConversionHelperButtonBar$lambda$1(onConvertAllClicked, onConvertHalfClicked, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonBarStyle buttonBar2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, buttonBar2.getSpacing().m21707getVerticalPaddingD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    String strStringResource2 = StringResources_androidKt.stringResource(C21706R.string.convert_half_cta_text, composerStartRestartGroup, 0);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    UserInteractionEventData.Action action2 = UserInteractionEventData.Action.SET_CONVERSION_AMOUNT;
                    Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierWeight$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, action2, null, new Component(componentType2, LOG_ID_HALF_BUTTON, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                    Modifier modifier52 = modifier4;
                    BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                    int i62 = (i3 << 6) & 458752;
                    boolean z42 = z2;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onConvertHalfClicked, strStringResource2, modifierAutoLogEvents$default2, null, type22, z42, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 3) & 14) | 24576 | i62, 0, 8136);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, buttonBar2.getSpacing().m21705getHorizontalButtonStackSpacingD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(onConvertAllClicked, StringResources_androidKt.stringResource(C21706R.string.convert_all_cta_text, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(Row5.weight$default(row62, companion22, 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, action2, null, new Component(componentType2, LOG_ID_ALL_BUTTON, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, type22, z42, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 & 14) | 24576 | i62, 0, 8136);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z42;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
