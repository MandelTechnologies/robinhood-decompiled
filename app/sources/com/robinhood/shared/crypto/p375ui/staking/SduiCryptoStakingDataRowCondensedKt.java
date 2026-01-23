package com.robinhood.shared.crypto.p375ui.staking;

import android.os.Parcelable;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.crypto.p375ui.staking.SduiCryptoStakingDataRowCondensedKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiCryptoStakingDataRowCondensed.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b\u001ar\u0010\t\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u0001H\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\r\u0010+\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010,\"\u001b\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!\"7\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0005*\u00020$2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b'\u0010(\"\u0004\b)\u0010**\u0004\b%\u0010&¨\u0006-"}, m3636d2 = {"SduiCryptoStakingDataRowCondensed", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoDemeterDataRowCondensed;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/CryptoDemeterDataRowCondensed;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TextRowWithIcon", "action", "trailingIconSpacing", "Landroidx/compose/ui/unit/Dp;", "title", "Lcom/robinhood/models/serverdriven/experimental/api/RenderableText;", ResourceTypes.STYLE, "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "trailingIcon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "trailingIconColor", "iconTintFallback", "Landroidx/compose/ui/graphics/Color;", "TextRowWithIcon-e-Q4e04", "(Landroid/os/Parcelable;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/models/serverdriven/experimental/api/RenderableText;Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "generateText", "Lcom/robinhood/models/serverdriven/experimental/api/Text;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "text", "CryptoStakingDataRowCondensedSemanticKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getCryptoStakingDataRowCondensedSemanticKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "cryptoDemeterDataRowCondensed", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getCryptoDemeterDataRowCondensed$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getCryptoDemeterDataRowCondensed", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/models/serverdriven/experimental/api/CryptoDemeterDataRowCondensed;", "setCryptoDemeterDataRowCondensed", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/robinhood/models/serverdriven/experimental/api/CryptoDemeterDataRowCondensed;)V", "SduiCryptoStakingDataRowCondensedPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SduiCryptoStakingDataRowCondensedKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SduiCryptoStakingDataRowCondensedKt.class, "cryptoDemeterDataRowCondensed", "getCryptoDemeterDataRowCondensed(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/models/serverdriven/experimental/api/CryptoDemeterDataRowCondensed;", 1))};
    private static final SemanticsPropertyKey<CryptoDemeterDataRowCondensed<?>> CryptoStakingDataRowCondensedSemanticKey = new SemanticsPropertyKey<>("CryptoDemeterDataRowCondensedSemanticKey", null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCryptoStakingDataRowCondensedPreview$lambda$8(int i, Composer composer, int i2) {
        SduiCryptoStakingDataRowCondensedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @SduiComposable
    public static final /* synthetic */ <ActionT extends Parcelable> void SduiCryptoStakingDataRowCondensed(final CryptoDemeterDataRowCondensed<? extends ActionT> component, Modifier modifier, Composer composer, int i, int i2) {
        float fM7995constructorimpl;
        float fM7995constructorimpl2;
        ComposableLambda composableLambdaRememberComposableLambda;
        Intrinsics.checkNotNullParameter(component, "component");
        composer.startReplaceGroup(1148721117);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(component);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C38618xe7cbbf8f(component);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue, 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSemantics$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        CryptoStakingDataRowCondensedDefaults cryptoStakingDataRowCondensedDefaults = CryptoStakingDataRowCondensedDefaults.INSTANCE;
        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, 0.0f, cryptoStakingDataRowCondensedDefaults.m25236getCondensedMinHeightD9Ej5fM(), 1, null);
        float f = 2;
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
        Float top_inset = component.getTop_inset();
        if (top_inset == null) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        } else {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(top_inset.floatValue());
        }
        float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(fM7995constructorimpl3 + fM7995constructorimpl);
        float fM7995constructorimpl5 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
        Float bottom_inset = component.getBottom_inset();
        if (bottom_inset == null) {
            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
        } else {
            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(bottom_inset.floatValue());
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, fM7995constructorimpl4, 0.0f, C2002Dp.m7995constructorimpl(fM7995constructorimpl5 + fM7995constructorimpl2), 5, null);
        UIComponent<ActionT> leading_accessory = component.getLeading_accessory();
        composer.startReplaceGroup(1764102048);
        ComposableLambda composableLambdaRememberComposableLambda2 = leading_accessory == null ? null : ComposableLambda3.rememberComposableLambda(2001938987, true, new C38619x23e833dd(leading_accessory), composer, 54);
        composer.endReplaceGroup();
        RenderableText subtitle = component.getSubtitle();
        composer.startReplaceGroup(1764125185);
        ComposableLambda composableLambdaRememberComposableLambda3 = subtitle == null ? null : ComposableLambda3.rememberComposableLambda(-1687310603, true, new C38620x23e8379e(component, subtitle), composer, 54);
        composer.endReplaceGroup();
        final RenderableText value = component.getValue();
        composer.startReplaceGroup(1764149441);
        if (value == null) {
            composableLambdaRememberComposableLambda = null;
        } else {
            Intrinsics.needClassReification();
            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(918007447, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensed$2$3$1
                public final void invoke(Composer composer2, int i3) {
                    int i4;
                    Alignment.Companion companion3;
                    BentoTheme bentoTheme;
                    int i5;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(918007447, i3, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:95)");
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal end = companion4.getEnd();
                    CryptoDemeterDataRowCondensed<ActionT> cryptoDemeterDataRowCondensed = component;
                    RenderableText renderableText = value;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Parcelable value_tap_action = cryptoDemeterDataRowCondensed.getValue_tap_action();
                    Float value_trailing_icon_spacing = cryptoDemeterDataRowCondensed.getValue_trailing_icon_spacing();
                    C2002Dp c2002DpM7993boximpl = value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(value_trailing_icon_spacing.floatValue())) : null;
                    TextStyle value_text_style = cryptoDemeterDataRowCondensed.getValue_text_style();
                    ThemedColor value_text_color = cryptoDemeterDataRowCondensed.getValue_text_color();
                    Icon value_trailing_icon = cryptoDemeterDataRowCondensed.getValue_trailing_icon();
                    ThemedColor value_trailing_icon_color = cryptoDemeterDataRowCondensed.getValue_trailing_icon_color();
                    C2002Dp c2002Dp = c2002DpM7993boximpl;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU();
                    composer2.startReplaceGroup(1386949870);
                    Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(value_tap_action, composer2, 0).then(companion5);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002Dp != null ? c2002Dp.getValue() : C2002Dp.m7995constructorimpl(0)), companion4.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierThen);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, value_text_style, value_text_color), (Modifier) null, composer2, 0, 2);
                    BentoIcon4 bentoIcon = value_trailing_icon != null ? SduiIcon2.toBentoIcon(value_trailing_icon) : null;
                    composer2.startReplaceGroup(938164764);
                    if (bentoIcon == null) {
                        i4 = i6;
                        companion3 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = 1386949870;
                    } else {
                        composer2.startReplaceGroup(938169090);
                        Color composeColor = value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(value_trailing_icon_color, composer2, 0);
                        composer2.endReplaceGroup();
                        if (composeColor != null) {
                            jM21425getFg0d7_KjU = composeColor.getValue();
                        }
                        BentoIcon4 bentoIcon4 = bentoIcon;
                        i4 = i6;
                        companion3 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = 1386949870;
                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon4, null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    RenderableText secondary_value = cryptoDemeterDataRowCondensed.getSecondary_value();
                    composer2.startReplaceGroup(80953817);
                    if (secondary_value != null) {
                        Parcelable secondary_value_tap_action = cryptoDemeterDataRowCondensed.getSecondary_value_tap_action();
                        Float secondary_value_trailing_icon_spacing = cryptoDemeterDataRowCondensed.getSecondary_value_trailing_icon_spacing();
                        C2002Dp c2002DpM7993boximpl2 = secondary_value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(secondary_value_trailing_icon_spacing.floatValue())) : null;
                        TextStyle secondary_value_text_style = cryptoDemeterDataRowCondensed.getSecondary_value_text_style();
                        ThemedColor secondary_value_text_color = cryptoDemeterDataRowCondensed.getSecondary_value_text_color();
                        Icon secondary_value_trailing_icon = cryptoDemeterDataRowCondensed.getSecondary_value_trailing_icon();
                        ThemedColor secondary_value_trailing_icon_color = cryptoDemeterDataRowCondensed.getSecondary_value_trailing_icon_color();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU();
                        composer2.startReplaceGroup(i5);
                        Modifier modifierThen2 = UtilKt.onClickModifierWithNoIndication(secondary_value_tap_action, composer2, 0).then(companion5);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002DpM7993boximpl2 != null ? c2002DpM7993boximpl2.getValue() : C2002Dp.m7995constructorimpl(0)), companion3.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierThen2);
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                        SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(secondary_value, secondary_value_text_style, secondary_value_text_color), (Modifier) null, composer2, 0, 2);
                        BentoIcon4 bentoIcon2 = secondary_value_trailing_icon != null ? SduiIcon2.toBentoIcon(secondary_value_trailing_icon) : null;
                        composer2.startReplaceGroup(938164764);
                        if (bentoIcon2 != null) {
                            composer2.startReplaceGroup(938169090);
                            Color composeColor2 = secondary_value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(secondary_value_trailing_icon_color, composer2, 0);
                            composer2.endReplaceGroup();
                            if (composeColor2 != null) {
                                jM21426getFg20d7_KjU = composeColor2.getValue();
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon2, null, jM21426getFg20d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54);
        }
        composer.endReplaceGroup();
        UIComponent<ActionT> trailing_accessory = component.getTrailing_accessory();
        composer.startReplaceGroup(1764203200);
        ComposableLambda composableLambdaRememberComposableLambda4 = trailing_accessory != null ? ComposableLambda3.rememberComposableLambda(-1355735006, true, new C38622x23e83f20(trailing_accessory), composer, 54) : null;
        composer.endReplaceGroup();
        BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default, null, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1190523398, true, new C38623xe7cbc354(component), composer, 54), composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda4, false, true, true, null, composer, 918555648, 0, 1026);
        composer.endNode();
        composer.endReplaceGroup();
    }

    /* renamed from: TextRowWithIcon-e-Q4e04, reason: not valid java name */
    public static final /* synthetic */ <ActionT extends Parcelable> void m25238TextRowWithIconeQ4e04(ActionT actiont, C2002Dp c2002Dp, RenderableText title, TextStyle textStyle, ThemedColor themedColor, Icon icon, ThemedColor themedColor2, long j, Modifier modifier, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        composer.startReplaceGroup(1386949870);
        Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(actiont, composer, i & 14).then((i2 & 256) != 0 ? Modifier.INSTANCE : modifier);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002Dp != null ? c2002Dp.getValue() : C2002Dp.m7995constructorimpl(0)), Alignment.INSTANCE.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierThen);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        SduiText2.SduiText(generateText(title, textStyle, themedColor), (Modifier) null, composer, 0, 2);
        BentoIcon4 bentoIcon = icon != null ? SduiIcon2.toBentoIcon(icon) : null;
        composer.startReplaceGroup(938164764);
        if (bentoIcon != null) {
            composer.startReplaceGroup(938169090);
            Color composeColor = themedColor2 != null ? SduiColors2.toComposeColor(themedColor2, composer, (i >> 18) & 14) : null;
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, composeColor != null ? composeColor.getValue() : j, null, null, false, composer, BentoIcon4.$stable | 48, 56);
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endReplaceGroup();
    }

    /* compiled from: SduiCryptoStakingDataRowCondensed.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1 */
    static final class C386241 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList3<CryptoDemeterDataRowCondensed<GenericAction>> $list;

        /* JADX WARN: Multi-variable type inference failed */
        C386241(ImmutableList3<? extends CryptoDemeterDataRowCondensed<? extends GenericAction>> immutableList3) {
            this.$list = immutableList3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final ImmutableList3 immutableList3, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final C38613xb357c7b6 c38613xb357c7b6 = new Function1() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(CryptoDemeterDataRowCondensed<? extends GenericAction> cryptoDemeterDataRowCondensed) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CryptoDemeterDataRowCondensed<? extends GenericAction>) obj);
                }
            };
            LazyColumn.items(immutableList3.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c38613xb357c7b6.invoke(immutableList3.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                    float fM7995constructorimpl;
                    float fM7995constructorimpl2;
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
                    final CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed = (CryptoDemeterDataRowCondensed) immutableList3.get(i);
                    composer.startReplaceGroup(1149268603);
                    composer.startReplaceGroup(1148721117);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(cryptoDemeterDataRowCondensed);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C38618xe7cbbf8f(cryptoDemeterDataRowCondensed);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSemantics$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CryptoStakingDataRowCondensedDefaults cryptoStakingDataRowCondensedDefaults = CryptoStakingDataRowCondensedDefaults.INSTANCE;
                    Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion, 0.0f, cryptoStakingDataRowCondensedDefaults.m25236getCondensedMinHeightD9Ej5fM(), 1, null);
                    float f = 2;
                    float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
                    Float top_inset = cryptoDemeterDataRowCondensed.getTop_inset();
                    if (top_inset == null) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    } else {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(top_inset.floatValue());
                    }
                    float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(fM7995constructorimpl3 + fM7995constructorimpl);
                    float fM7995constructorimpl5 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
                    Float bottom_inset = cryptoDemeterDataRowCondensed.getBottom_inset();
                    if (bottom_inset == null) {
                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
                    } else {
                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(bottom_inset.floatValue());
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, fM7995constructorimpl4, 0.0f, C2002Dp.m7995constructorimpl(fM7995constructorimpl5 + fM7995constructorimpl2), 5, null);
                    UIComponent leading_accessory = cryptoDemeterDataRowCondensed.getLeading_accessory();
                    composer.startReplaceGroup(1764102048);
                    ComposableLambda composableLambdaRememberComposableLambda = leading_accessory == null ? null : ComposableLambda3.rememberComposableLambda(2001938987, true, new C38619x23e833dd(leading_accessory), composer, 54);
                    composer.endReplaceGroup();
                    RenderableText subtitle = cryptoDemeterDataRowCondensed.getSubtitle();
                    composer.startReplaceGroup(1764125185);
                    ComposableLambda composableLambdaRememberComposableLambda2 = subtitle == null ? null : ComposableLambda3.rememberComposableLambda(-1687310603, true, new C38620x23e8379e(cryptoDemeterDataRowCondensed, subtitle), composer, 54);
                    composer.endReplaceGroup();
                    final RenderableText value = cryptoDemeterDataRowCondensed.getValue();
                    composer.startReplaceGroup(1764149441);
                    ComposableLambda composableLambdaRememberComposableLambda3 = value == null ? null : ComposableLambda3.rememberComposableLambda(918007447, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1$invoke$lambda$2$lambda$1$lambda$0$$inlined$SduiCryptoStakingDataRowCondensed$1
                        public final void invoke(Composer composer2, int i4) {
                            int i5;
                            Alignment.Companion companion3;
                            BentoTheme bentoTheme;
                            int i6;
                            if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(918007447, i4, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:95)");
                            }
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Horizontal end = companion4.getEnd();
                            CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed2 = cryptoDemeterDataRowCondensed;
                            RenderableText renderableText = value;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Parcelable value_tap_action = cryptoDemeterDataRowCondensed2.getValue_tap_action();
                            Float value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_spacing();
                            C2002Dp c2002DpM7993boximpl = value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(value_trailing_icon_spacing.floatValue())) : null;
                            TextStyle value_text_style = cryptoDemeterDataRowCondensed2.getValue_text_style();
                            ThemedColor value_text_color = cryptoDemeterDataRowCondensed2.getValue_text_color();
                            Icon value_trailing_icon = cryptoDemeterDataRowCondensed2.getValue_trailing_icon();
                            ThemedColor value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_color();
                            C2002Dp c2002Dp = c2002DpM7993boximpl;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU();
                            composer2.startReplaceGroup(1386949870);
                            Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(value_tap_action, composer2, 0).then(companion5);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002Dp != null ? c2002Dp.getValue() : C2002Dp.m7995constructorimpl(0)), companion4.getCenterVertically(), composer2, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierThen);
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, value_text_style, value_text_color), (Modifier) null, composer2, 0, 2);
                            BentoIcon4 bentoIcon = value_trailing_icon != null ? SduiIcon2.toBentoIcon(value_trailing_icon) : null;
                            composer2.startReplaceGroup(938164764);
                            if (bentoIcon == null) {
                                i5 = i7;
                                companion3 = companion4;
                                bentoTheme = bentoTheme2;
                                i6 = 1386949870;
                            } else {
                                composer2.startReplaceGroup(938169090);
                                Color composeColor = value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(value_trailing_icon_color, composer2, 0);
                                composer2.endReplaceGroup();
                                if (composeColor != null) {
                                    jM21425getFg0d7_KjU = composeColor.getValue();
                                }
                                BentoIcon4 bentoIcon4 = bentoIcon;
                                i5 = i7;
                                companion3 = companion4;
                                bentoTheme = bentoTheme2;
                                i6 = 1386949870;
                                BentoIcon2.m20644BentoIconFU0evQE(bentoIcon4, null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endReplaceGroup();
                            RenderableText secondary_value = cryptoDemeterDataRowCondensed2.getSecondary_value();
                            composer2.startReplaceGroup(80953817);
                            if (secondary_value != null) {
                                Parcelable secondary_value_tap_action = cryptoDemeterDataRowCondensed2.getSecondary_value_tap_action();
                                Float secondary_value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_spacing();
                                C2002Dp c2002DpM7993boximpl2 = secondary_value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(secondary_value_trailing_icon_spacing.floatValue())) : null;
                                TextStyle secondary_value_text_style = cryptoDemeterDataRowCondensed2.getSecondary_value_text_style();
                                ThemedColor secondary_value_text_color = cryptoDemeterDataRowCondensed2.getSecondary_value_text_color();
                                Icon secondary_value_trailing_icon = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon();
                                ThemedColor secondary_value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_color();
                                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU();
                                composer2.startReplaceGroup(i6);
                                Modifier modifierThen2 = UtilKt.onClickModifierWithNoIndication(secondary_value_tap_action, composer2, 0).then(companion5);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002DpM7993boximpl2 != null ? c2002DpM7993boximpl2.getValue() : C2002Dp.m7995constructorimpl(0)), companion3.getCenterVertically(), composer2, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierThen2);
                                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                                SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(secondary_value, secondary_value_text_style, secondary_value_text_color), (Modifier) null, composer2, 0, 2);
                                BentoIcon4 bentoIcon2 = secondary_value_trailing_icon != null ? SduiIcon2.toBentoIcon(secondary_value_trailing_icon) : null;
                                composer2.startReplaceGroup(938164764);
                                if (bentoIcon2 != null) {
                                    composer2.startReplaceGroup(938169090);
                                    Color composeColor2 = secondary_value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(secondary_value_trailing_icon_color, composer2, 0);
                                    composer2.endReplaceGroup();
                                    if (composeColor2 != null) {
                                        jM21426getFg20d7_KjU = composeColor2.getValue();
                                    }
                                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon2, null, jM21426getFg20d7_KjU, null, null, false, composer2, BentoIcon4.$stable | 48, 56);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer, 54);
                    composer.endReplaceGroup();
                    UIComponent trailing_accessory = cryptoDemeterDataRowCondensed.getTrailing_accessory();
                    composer.startReplaceGroup(1764203200);
                    ComposableLambda composableLambdaRememberComposableLambda4 = trailing_accessory != null ? ComposableLambda3.rememberComposableLambda(-1355735006, true, new C38622x23e83f20(trailing_accessory), composer, 54) : null;
                    composer.endReplaceGroup();
                    BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1190523398, true, new C38623xe7cbc354(cryptoDemeterDataRowCondensed), composer, 54), composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, false, true, true, null, composer, 918555648, 0, 1026);
                    composer.endNode();
                    composer.endReplaceGroup();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2096868956, i, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedPreview.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:272)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$list);
            final ImmutableList3<CryptoDemeterDataRowCondensed<GenericAction>> immutableList3 = this.$list;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensedPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiCryptoStakingDataRowCondensedKt.C386241.invoke$lambda$2$lambda$1(immutableList3, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final Text<GenericAction> generateText(RenderableText text, TextStyle textStyle, ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (textStyle == null) {
            textStyle = CryptoStakingDataRowCondensedDefaults.INSTANCE.getFallbackStyle();
        }
        TextStyle textStyle2 = textStyle;
        if (themedColor == null) {
            themedColor = CryptoStakingDataRowCondensedDefaults.INSTANCE.getFallbackThemedColor();
        }
        return new Text<>(text, textStyle2, null, themedColor, null, 20, null);
    }

    public static final SemanticsPropertyKey<CryptoDemeterDataRowCondensed<?>> getCryptoStakingDataRowCondensedSemanticKey() {
        return CryptoStakingDataRowCondensedSemanticKey;
    }

    public static final CryptoDemeterDataRowCondensed<?> getCryptoDemeterDataRowCondensed(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return CryptoStakingDataRowCondensedSemanticKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setCryptoDemeterDataRowCondensed(SemanticsPropertyReceiver semanticsPropertyReceiver, CryptoDemeterDataRowCondensed<?> cryptoDemeterDataRowCondensed) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(cryptoDemeterDataRowCondensed, "<set-?>");
        CryptoStakingDataRowCondensedSemanticKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], cryptoDemeterDataRowCondensed);
    }

    @DayNightPreview
    public static final void SduiCryptoStakingDataRowCondensedPreview(Composer composer, final int i) {
        Composer composer2;
        Float fValueOf = Float.valueOf(4.0f);
        Composer composerStartRestartGroup = composer.startRestartGroup(-118700892);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-118700892, i, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedPreview (SduiCryptoStakingDataRowCondensed.kt:195)");
            }
            CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed = new CryptoDemeterDataRowCondensed(new PlainText("Title1"), null, null, null, null, null, null, null, null, null, null, null, null, null, new PlainText("Value"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16386, 3, null);
            PlainText plainText = new PlainText("Title2");
            TextStyle textStyle = TextStyle.TEXT_MEDIUM_BOLD;
            CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed2 = new CryptoDemeterDataRowCondensed(plainText, null, textStyle, null, null, null, null, null, null, null, null, null, null, null, new PlainText("Value"), null, textStyle, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -81926, 3, null);
            PlainText plainText2 = new PlainText("Title3");
            Icon icon = Icon.QUESTION_FILLED_16;
            com.robinhood.models.serverdriven.experimental.api.Color color = com.robinhood.models.serverdriven.experimental.api.Color.PRIME;
            CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed3 = new CryptoDemeterDataRowCondensed(plainText2, null, null, icon, new ThemedColor(color, color), Float.valueOf(8.0f), null, null, null, null, null, null, null, null, new PlainText("Value"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16442, 3, null);
            PlainText plainText3 = new PlainText("Title4");
            PlainText plainText4 = new PlainText("Value");
            ThemedColor themedColor = new ThemedColor(color, color);
            Icon icon2 = Icon.ROBINHOOD_16;
            CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed4 = new CryptoDemeterDataRowCondensed(plainText3, null, null, icon, null, null, null, null, null, null, null, null, null, null, plainText4, themedColor, null, icon2, new ThemedColor(color, color), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -442378, 3, null);
            PlainText plainText5 = new PlainText("Title1");
            PlainText plainText6 = new PlainText("Subtitle1");
            TextStyle textStyle2 = TextStyle.TEXT_SMALL;
            com.robinhood.models.serverdriven.experimental.api.Color color2 = com.robinhood.models.serverdriven.experimental.api.Color.FG2;
            ThemedColor themedColor2 = new ThemedColor(color2, color2);
            Icon icon3 = Icon.QUESTION_FILLED_12;
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer2, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2096868956, true, new C386241(extensions2.persistentListOf(cryptoDemeterDataRowCondensed, cryptoDemeterDataRowCondensed2, cryptoDemeterDataRowCondensed3, cryptoDemeterDataRowCondensed4, new CryptoDemeterDataRowCondensed(plainText5, null, null, null, null, null, null, plainText6, themedColor2, textStyle2, icon3, new ThemedColor(color, color), fValueOf, null, new PlainText("Value"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -24450, 3, null), new CryptoDemeterDataRowCondensed(new PlainText("Title1"), null, null, null, null, null, null, new PlainText("Subtitle1"), new ThemedColor(color2, color2), textStyle2, icon3, new ThemedColor(color, color), fValueOf, null, new PlainText("Value"), null, null, null, null, null, null, new PlainText("SecondaryValue"), new ThemedColor(color, color), textStyle2, icon2, null, null, null, null, null, null, null, null, null, -31481730, 3, null))), composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiCryptoStakingDataRowCondensedKt.SduiCryptoStakingDataRowCondensedPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
